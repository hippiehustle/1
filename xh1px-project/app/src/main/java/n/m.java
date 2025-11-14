package n;

import P.P;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f12640y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f12641a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f12642b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12643c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12644d;

    /* renamed from: e, reason: collision with root package name */
    public k f12645e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f12646f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f12647g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12648h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f12649i;
    public final ArrayList j;
    public boolean k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f12651m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f12652n;

    /* renamed from: o, reason: collision with root package name */
    public View f12653o;

    /* renamed from: v, reason: collision with root package name */
    public o f12660v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12662x;

    /* renamed from: l, reason: collision with root package name */
    public int f12650l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12654p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12655q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12656r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12657s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f12658t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f12659u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f12661w = false;

    public m(Context context) {
        boolean z8;
        boolean z9 = false;
        this.f12641a = context;
        Resources resources = context.getResources();
        this.f12642b = resources;
        this.f12646f = new ArrayList();
        this.f12647g = new ArrayList();
        this.f12648h = true;
        this.f12649i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = P.f4220a;
            if (Build.VERSION.SDK_INT >= 28) {
                z8 = I.a.m(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            if (z8) {
                z9 = true;
            }
        }
        this.f12644d = z9;
    }

    public o a(int i4, int i8, int i9, CharSequence charSequence) {
        int i10;
        int i11 = ((-65536) & i9) >> 16;
        if (i11 >= 0 && i11 < 6) {
            int i12 = (f12640y[i11] << 16) | (65535 & i9);
            o oVar = new o(this, i4, i8, i9, i12, charSequence, this.f12650l);
            ArrayList arrayList = this.f12646f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((o) arrayList.get(size)).f12672d <= i12) {
                        i10 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i10 = 0;
                    break;
                }
            }
            arrayList.add(i10, oVar);
            p(true);
            return oVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        Intent intent2;
        int i12;
        PackageManager packageManager = this.f12641a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i11 = queryIntentActivityOptions.size();
        } else {
            i11 = 0;
        }
        if ((i10 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i13);
            int i14 = resolveInfo.specificIndex;
            if (i14 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i14];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o a3 = a(i4, i8, i9, resolveInfo.loadLabel(packageManager));
            a3.setIcon(resolveInfo.loadIcon(packageManager));
            a3.f12675g = intent3;
            if (menuItemArr != null && (i12 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i12] = a3;
            }
        }
        return i11;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f12659u.add(new WeakReference(yVar));
        yVar.h(context, this);
        this.k = true;
    }

    public final void c(boolean z8) {
        if (this.f12657s) {
            return;
        }
        this.f12657s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12659u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.a(this, z8);
            }
        }
        this.f12657s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f12660v;
        if (oVar != null) {
            d(oVar);
        }
        this.f12646f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f12652n = null;
        this.f12651m = null;
        this.f12653o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12659u;
        boolean z8 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f12660v == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z8 = yVar.m(oVar);
                    if (z8) {
                        break;
                    }
                }
            }
            v();
            if (z8) {
                this.f12660v = null;
            }
        }
        return z8;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f12645e;
        if (kVar != null && kVar.z(mVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12659u;
        boolean z8 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z8 = yVar.f(oVar);
                if (z8) {
                    break;
                }
            }
        }
        v();
        if (z8) {
            this.f12660v = oVar;
        }
        return z8;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        MenuItem findItem;
        ArrayList arrayList = this.f12646f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            o oVar = (o) arrayList.get(i8);
            if (oVar.f12669a == i4) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.f12681o.findItem(i4)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final o g(int i4, KeyEvent keyEvent) {
        char c6;
        ArrayList arrayList = this.f12658t;
        arrayList.clear();
        h(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        boolean n3 = n();
        for (int i8 = 0; i8 < size; i8++) {
            o oVar = (o) arrayList.get(i8);
            if (n3) {
                c6 = oVar.j;
            } else {
                c6 = oVar.f12676h;
            }
            char[] cArr = keyData.meta;
            if ((c6 == cArr[0] && (metaState & 2) == 0) || ((c6 == cArr[2] && (metaState & 2) != 0) || (n3 && c6 == '\b' && i4 == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return (MenuItem) this.f12646f.get(i4);
    }

    public final void h(List list, int i4, KeyEvent keyEvent) {
        char c6;
        int i8;
        boolean n3 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            ArrayList arrayList = this.f12646f;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                o oVar = (o) arrayList.get(i9);
                if (oVar.hasSubMenu()) {
                    oVar.f12681o.h(list, i4, keyEvent);
                }
                if (n3) {
                    c6 = oVar.j;
                } else {
                    c6 = oVar.f12676h;
                }
                if (n3) {
                    i8 = oVar.k;
                } else {
                    i8 = oVar.f12677i;
                }
                if ((modifiers & 69647) == (i8 & 69647) && c6 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c6 == cArr[0] || c6 == cArr[2] || (n3 && c6 == '\b' && i4 == 67)) && oVar.isEnabled()) {
                        list.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (!this.f12662x) {
            ArrayList arrayList = this.f12646f;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((o) arrayList.get(i4)).isVisible()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void i() {
        ArrayList l6 = l();
        if (!this.k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12659u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z8 |= yVar.j();
            }
        }
        ArrayList arrayList = this.f12649i;
        ArrayList arrayList2 = this.j;
        if (z8) {
            arrayList.clear();
            arrayList2.clear();
            int size = l6.size();
            for (int i4 = 0; i4 < size; i4++) {
                o oVar = (o) l6.get(i4);
                if ((oVar.f12690x & 32) == 32) {
                    arrayList.add(oVar);
                } else {
                    arrayList2.add(oVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        if (g(i4, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z8 = this.f12648h;
        ArrayList arrayList = this.f12647g;
        if (!z8) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f12646f;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList2.get(i4);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.f12648h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f12661w;
    }

    public boolean n() {
        return this.f12643c;
    }

    public boolean o() {
        return this.f12644d;
    }

    public final void p(boolean z8) {
        if (!this.f12654p) {
            if (z8) {
                this.f12648h = true;
                this.k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f12659u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    y yVar = (y) weakReference.get();
                    if (yVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        yVar.g(z8);
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f12655q = true;
        if (z8) {
            this.f12656r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i8) {
        return q(findItem(i4), null, i8);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i8) {
        boolean z8;
        o g8 = g(i4, keyEvent);
        if (g8 != null) {
            z8 = q(g8, null, i8);
        } else {
            z8 = false;
        }
        if ((i8 & 2) != 0) {
            c(true);
        }
        return z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, y yVar, int i4) {
        boolean z8;
        p pVar;
        boolean z9;
        o oVar = (o) menuItem;
        boolean z10 = false;
        if (oVar == null || !oVar.isEnabled()) {
            return false;
        }
        m mVar = oVar.f12680n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = oVar.f12682p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(oVar)) && !mVar.e(mVar, oVar)) {
            Intent intent = oVar.f12675g;
            if (intent != null) {
                try {
                    mVar.f12641a.startActivity(intent);
                } catch (ActivityNotFoundException e9) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e9);
                }
            }
            p pVar2 = oVar.f12666A;
            if (pVar2 == null || !pVar2.f12694b.onPerformDefaultAction()) {
                z8 = false;
                pVar = oVar.f12666A;
                if (pVar == null && pVar.f12694b.hasSubMenu()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!oVar.e()) {
                    z8 |= oVar.expandActionView();
                    if (z8) {
                        c(true);
                    }
                } else if (!oVar.hasSubMenu() && !z9) {
                    if ((i4 & 1) == 0) {
                        c(true);
                    }
                } else {
                    if ((i4 & 4) == 0) {
                        c(false);
                    }
                    if (!oVar.hasSubMenu()) {
                        SubMenuC1103E subMenuC1103E = new SubMenuC1103E(this.f12641a, this, oVar);
                        oVar.f12681o = subMenuC1103E;
                        subMenuC1103E.setHeaderTitle(oVar.f12673e);
                    }
                    SubMenuC1103E subMenuC1103E2 = oVar.f12681o;
                    if (z9) {
                        pVar.f12694b.onPrepareSubMenu(subMenuC1103E2);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f12659u;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        if (yVar != null) {
                            z10 = yVar.i(subMenuC1103E2);
                        }
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            y yVar2 = (y) weakReference.get();
                            if (yVar2 == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!z10) {
                                z10 = yVar2.i(subMenuC1103E2);
                            }
                        }
                    }
                    z8 |= z10;
                    if (!z8) {
                        c(true);
                    }
                }
                return z8;
            }
        }
        z8 = true;
        pVar = oVar.f12666A;
        if (pVar == null) {
        }
        z9 = false;
        if (!oVar.e()) {
        }
        return z8;
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12659u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        ArrayList arrayList = this.f12646f;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                if (((o) arrayList.get(i9)).f12670b == i4) {
                    break;
                } else {
                    i9++;
                }
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 >= 0) {
            int size2 = arrayList.size() - i9;
            while (true) {
                int i10 = i8 + 1;
                if (i8 >= size2 || ((o) arrayList.get(i9)).f12670b != i4) {
                    break;
                }
                if (i9 >= 0) {
                    ArrayList arrayList2 = this.f12646f;
                    if (i9 < arrayList2.size()) {
                        arrayList2.remove(i9);
                    }
                }
                i8 = i10;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        ArrayList arrayList = this.f12646f;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                if (((o) arrayList.get(i8)).f12669a == i4) {
                    break;
                } else {
                    i8++;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 >= 0) {
            ArrayList arrayList2 = this.f12646f;
            if (i8 < arrayList2.size()) {
                arrayList2.remove(i8);
                p(true);
            }
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f12646f.size();
            for (int i4 = 0; i4 < size; i4++) {
                MenuItem item = getItem(i4);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuC1103E) item.getSubMenu()).s(bundle);
                }
            }
            int i8 = bundle.getInt("android:menu:expandedactionview");
            if (i8 > 0 && (findItem = findItem(i8)) != null) {
                findItem.expandActionView();
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z8, boolean z9) {
        ArrayList arrayList = this.f12646f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            o oVar = (o) arrayList.get(i8);
            if (oVar.f12670b == i4) {
                oVar.f(z9);
                oVar.setCheckable(z8);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z8) {
        this.f12661w = z8;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z8) {
        ArrayList arrayList = this.f12646f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            o oVar = (o) arrayList.get(i8);
            if (oVar.f12670b == i4) {
                oVar.setEnabled(z8);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z8) {
        int i8;
        ArrayList arrayList = this.f12646f;
        int size = arrayList.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = (o) arrayList.get(i9);
            if (oVar.f12670b == i4) {
                int i10 = oVar.f12690x;
                int i11 = i10 & (-9);
                if (z8) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
                int i12 = i11 | i8;
                oVar.f12690x = i12;
                if (i10 != i12) {
                    z9 = true;
                }
            }
        }
        if (z9) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z8) {
        this.f12643c = z8;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f12646f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f12646f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1103E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i4, CharSequence charSequence, int i8, Drawable drawable, View view) {
        if (view != null) {
            this.f12653o = view;
            this.f12651m = null;
            this.f12652n = null;
        } else {
            if (i4 > 0) {
                this.f12651m = this.f12642b.getText(i4);
            } else if (charSequence != null) {
                this.f12651m = charSequence;
            }
            if (i8 > 0) {
                this.f12652n = this.f12641a.getDrawable(i8);
            } else if (drawable != null) {
                this.f12652n = drawable;
            }
            this.f12653o = null;
        }
        p(false);
    }

    public final void v() {
        this.f12654p = false;
        if (this.f12655q) {
            this.f12655q = false;
            p(this.f12656r);
        }
    }

    public final void w() {
        if (!this.f12654p) {
            this.f12654p = true;
            this.f12655q = false;
            this.f12656r = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return a(0, 0, 0, this.f12642b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.f12642b.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i8, int i9, CharSequence charSequence) {
        return a(i4, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i8, int i9, CharSequence charSequence) {
        o a3 = a(i4, i8, i9, charSequence);
        SubMenuC1103E subMenuC1103E = new SubMenuC1103E(this.f12641a, this, a3);
        a3.f12681o = subMenuC1103E;
        subMenuC1103E.setHeaderTitle(a3.f12673e);
        return subMenuC1103E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i8, int i9, int i10) {
        return a(i4, i8, i9, this.f12642b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i8, int i9, int i10) {
        return addSubMenu(i4, i8, i9, this.f12642b.getString(i10));
    }

    public m k() {
        return this;
    }
}
