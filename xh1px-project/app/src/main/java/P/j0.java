package P;

import a.AbstractC0405a;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class j0 extends p0 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f4279i = false;
    public static Method j;
    public static Class k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f4280l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f4281m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f4282c;

    /* renamed from: d, reason: collision with root package name */
    public H.c[] f4283d;

    /* renamed from: e, reason: collision with root package name */
    public H.c f4284e;

    /* renamed from: f, reason: collision with root package name */
    public t0 f4285f;

    /* renamed from: g, reason: collision with root package name */
    public H.c f4286g;

    /* renamed from: h, reason: collision with root package name */
    public int f4287h;

    public j0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var);
        this.f4284e = null;
        this.f4282c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private H.c s(int i4, boolean z8) {
        H.c cVar = H.c.f1847e;
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((i4 & i8) != 0) {
                cVar = H.c.a(cVar, t(i8, z8));
            }
        }
        return cVar;
    }

    private H.c u() {
        t0 t0Var = this.f4285f;
        if (t0Var != null) {
            return t0Var.f4308a.h();
        }
        return H.c.f1847e;
    }

    private H.c v(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f4279i) {
                w();
            }
            Method method = j;
            if (method != null && k != null && f4280l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f4280l.get(f4281m.get(invoke));
                    if (rect != null) {
                        return H.c.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e9) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e9.getMessage(), e9);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void w() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            f4280l = cls.getDeclaredField("mVisibleInsets");
            f4281m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f4280l.setAccessible(true);
            f4281m.setAccessible(true);
        } catch (ReflectiveOperationException e9) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e9.getMessage(), e9);
        }
        f4279i = true;
    }

    public static boolean y(int i4, int i8) {
        if ((i4 & 6) == (i8 & 6)) {
            return true;
        }
        return false;
    }

    @Override // P.p0
    public void d(View view) {
        H.c v8 = v(view);
        if (v8 == null) {
            v8 = H.c.f1847e;
        }
        x(v8);
    }

    @Override // P.p0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (!Objects.equals(this.f4286g, j0Var.f4286g) || !y(this.f4287h, j0Var.f4287h)) {
            return false;
        }
        return true;
    }

    @Override // P.p0
    public H.c f(int i4) {
        return s(i4, false);
    }

    @Override // P.p0
    public final H.c j() {
        if (this.f4284e == null) {
            WindowInsets windowInsets = this.f4282c;
            this.f4284e = H.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f4284e;
    }

    @Override // P.p0
    public t0 l(int i4, int i8, int i9, int i10) {
        i0 e0Var;
        t0 g8 = t0.g(null, this.f4282c);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            e0Var = new h0(g8);
        } else if (i11 >= 30) {
            e0Var = new g0(g8);
        } else if (i11 >= 29) {
            e0Var = new f0(g8);
        } else {
            e0Var = new e0(g8);
        }
        e0Var.g(t0.e(j(), i4, i8, i9, i10));
        e0Var.e(t0.e(h(), i4, i8, i9, i10));
        return e0Var.b();
    }

    @Override // P.p0
    public boolean n() {
        return this.f4282c.isRound();
    }

    @Override // P.p0
    public void o(H.c[] cVarArr) {
        this.f4283d = cVarArr;
    }

    @Override // P.p0
    public void p(t0 t0Var) {
        this.f4285f = t0Var;
    }

    @Override // P.p0
    public void r(int i4) {
        this.f4287h = i4;
    }

    public H.c t(int i4, boolean z8) {
        int i8;
        C0261i e9;
        int i9;
        int i10;
        int i11;
        H.c cVar = H.c.f1847e;
        int i12 = 0;
        if (i4 != 1) {
            H.c cVar2 = null;
            if (i4 != 2) {
                if (i4 != 8) {
                    if (i4 != 16) {
                        if (i4 != 32) {
                            if (i4 != 64) {
                                if (i4 == 128) {
                                    t0 t0Var = this.f4285f;
                                    if (t0Var != null) {
                                        e9 = t0Var.f4308a.e();
                                    } else {
                                        e9 = e();
                                    }
                                    if (e9 != null) {
                                        int i13 = Build.VERSION.SDK_INT;
                                        if (i13 >= 28) {
                                            i9 = I.a.e(e9.f4276a);
                                        } else {
                                            i9 = 0;
                                        }
                                        if (i13 >= 28) {
                                            i10 = I.a.g(e9.f4276a);
                                        } else {
                                            i10 = 0;
                                        }
                                        if (i13 >= 28) {
                                            i11 = I.a.f(e9.f4276a);
                                        } else {
                                            i11 = 0;
                                        }
                                        if (i13 >= 28) {
                                            i12 = I.a.d(e9.f4276a);
                                        }
                                        return H.c.b(i9, i10, i11, i12);
                                    }
                                }
                            } else {
                                return k();
                            }
                        } else {
                            return g();
                        }
                    } else {
                        return i();
                    }
                } else {
                    H.c[] cVarArr = this.f4283d;
                    if (cVarArr != null) {
                        cVar2 = cVarArr[AbstractC0405a.W(8)];
                    }
                    if (cVar2 != null) {
                        return cVar2;
                    }
                    H.c j5 = j();
                    H.c u8 = u();
                    int i14 = j5.f1851d;
                    if (i14 > u8.f1851d) {
                        return H.c.b(0, 0, 0, i14);
                    }
                    H.c cVar3 = this.f4286g;
                    if (cVar3 != null && !cVar3.equals(cVar) && (i8 = this.f4286g.f1851d) > u8.f1851d) {
                        return H.c.b(0, 0, 0, i8);
                    }
                }
            } else {
                if (z8) {
                    H.c u9 = u();
                    H.c h8 = h();
                    return H.c.b(Math.max(u9.f1848a, h8.f1848a), 0, Math.max(u9.f1850c, h8.f1850c), Math.max(u9.f1851d, h8.f1851d));
                }
                if ((this.f4287h & 2) == 0) {
                    H.c j8 = j();
                    t0 t0Var2 = this.f4285f;
                    if (t0Var2 != null) {
                        cVar2 = t0Var2.f4308a.h();
                    }
                    int i15 = j8.f1851d;
                    if (cVar2 != null) {
                        i15 = Math.min(i15, cVar2.f1851d);
                    }
                    return H.c.b(j8.f1848a, 0, j8.f1850c, i15);
                }
            }
        } else {
            if (z8) {
                return H.c.b(0, Math.max(u().f1849b, j().f1849b), 0, 0);
            }
            if ((this.f4287h & 4) == 0) {
                return H.c.b(0, j().f1849b, 0, 0);
            }
        }
        return cVar;
    }

    public void x(H.c cVar) {
        this.f4286g = cVar;
    }
}
