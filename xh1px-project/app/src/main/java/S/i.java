package S;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f5169a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f5170b;

    /* renamed from: c, reason: collision with root package name */
    public Class f5171c;

    /* renamed from: d, reason: collision with root package name */
    public Method f5172d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5173e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5174f = false;

    public i(ActionMode.Callback callback, TextView textView) {
        this.f5169a = callback;
        this.f5170b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f5169a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f5169a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f5169a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method declaredMethod;
        boolean z8;
        TextView textView = this.f5170b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        boolean z9 = this.f5174f;
        Class cls = Integer.TYPE;
        if (!z9) {
            this.f5174f = true;
            try {
                Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f5171c = cls2;
                this.f5172d = cls2.getDeclaredMethod("removeItemAt", cls);
                this.f5173e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f5171c = null;
                this.f5172d = null;
                this.f5173e = false;
            }
        }
        try {
            if (this.f5173e && this.f5171c.isInstance(menu)) {
                declaredMethod = this.f5172d;
            } else {
                declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", cls);
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i4);
                MenuItem add = menu.add(0, 0, i4 + 100, resolveInfo2.loadLabel(packageManager));
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z8);
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f5169a.onPrepareActionMode(actionMode, menu);
    }
}
