package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class F implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final View f11600d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11601e;

    /* renamed from: f, reason: collision with root package name */
    public Method f11602f;

    /* renamed from: g, reason: collision with root package name */
    public Context f11603g;

    public F(View view, String str) {
        this.f11600d = view;
        this.f11601e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f11602f == null) {
            View view2 = this.f11600d;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f11601e;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f11602f = method;
                            this.f11603g = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder s8 = A.j.s("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    s8.append(view2.getClass());
                    s8.append(str);
                    throw new IllegalStateException(s8.toString());
                }
            }
        }
        try {
            this.f11602f.invoke(this.f11603g, view);
        } catch (IllegalAccessException e9) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e9);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
