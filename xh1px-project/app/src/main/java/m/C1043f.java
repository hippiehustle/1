package m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import n.o;
import n.p;
import n.t;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1043f {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f12331A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f12332B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C1044g f12335E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f12336a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12343h;

    /* renamed from: i, reason: collision with root package name */
    public int f12344i;
    public int j;
    public CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f12345l;

    /* renamed from: m, reason: collision with root package name */
    public int f12346m;

    /* renamed from: n, reason: collision with root package name */
    public char f12347n;

    /* renamed from: o, reason: collision with root package name */
    public int f12348o;

    /* renamed from: p, reason: collision with root package name */
    public char f12349p;

    /* renamed from: q, reason: collision with root package name */
    public int f12350q;

    /* renamed from: r, reason: collision with root package name */
    public int f12351r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12352s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12353t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12354u;

    /* renamed from: v, reason: collision with root package name */
    public int f12355v;

    /* renamed from: w, reason: collision with root package name */
    public int f12356w;

    /* renamed from: x, reason: collision with root package name */
    public String f12357x;

    /* renamed from: y, reason: collision with root package name */
    public String f12358y;

    /* renamed from: z, reason: collision with root package name */
    public p f12359z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f12333C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f12334D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f12337b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f12338c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f12339d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f12340e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12341f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12342g = true;

    public C1043f(C1044g c1044g, Menu menu) {
        this.f12335E = c1044g;
        this.f12336a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f12335E.f12364c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e9) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e9);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.MenuItem$OnMenuItemClickListener, m.e, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z8;
        MenuItem enabled = menuItem.setChecked(this.f12352s).setVisible(this.f12353t).setEnabled(this.f12354u);
        boolean z9 = false;
        if (this.f12351r >= 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        enabled.setCheckable(z8).setTitleCondensed(this.f12345l).setIcon(this.f12346m);
        int i4 = this.f12355v;
        if (i4 >= 0) {
            menuItem.setShowAsAction(i4);
        }
        String str = this.f12358y;
        C1044g c1044g = this.f12335E;
        if (str != null) {
            if (!c1044g.f12364c.isRestricted()) {
                if (c1044g.f12365d == null) {
                    c1044g.f12365d = C1044g.a(c1044g.f12364c);
                }
                Object obj = c1044g.f12365d;
                String str2 = this.f12358y;
                ?? obj2 = new Object();
                obj2.f12329a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f12330b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC1042e.f12328c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e9) {
                    StringBuilder s8 = A.j.s("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    s8.append(cls.getName());
                    InflateException inflateException = new InflateException(s8.toString());
                    inflateException.initCause(e9);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f12351r >= 2) {
            if (menuItem instanceof o) {
                ((o) menuItem).f(true);
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                J.a aVar = tVar.f12700c;
                try {
                    if (tVar.f12701d == null) {
                        tVar.f12701d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.f12701d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str3 = this.f12357x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C1044g.f12360e, c1044g.f12362a));
            z9 = true;
        }
        int i8 = this.f12356w;
        if (i8 > 0) {
            if (!z9) {
                menuItem.setActionView(i8);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        p pVar = this.f12359z;
        if (pVar != null) {
            if (menuItem instanceof J.a) {
                ((J.a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f12331A;
        boolean z10 = menuItem instanceof J.a;
        if (z10) {
            ((J.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            F.a.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f12332B;
        if (z10) {
            ((J.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            F.a.l(menuItem, charSequence2);
        }
        char c6 = this.f12347n;
        int i9 = this.f12348o;
        if (z10) {
            ((J.a) menuItem).setAlphabeticShortcut(c6, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            F.a.g(menuItem, c6, i9);
        }
        char c9 = this.f12349p;
        int i10 = this.f12350q;
        if (z10) {
            ((J.a) menuItem).setNumericShortcut(c9, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            F.a.k(menuItem, c9, i10);
        }
        PorterDuff.Mode mode = this.f12334D;
        if (mode != null) {
            if (z10) {
                ((J.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                F.a.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f12333C;
        if (colorStateList != null) {
            if (z10) {
                ((J.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                F.a.i(menuItem, colorStateList);
            }
        }
    }
}
