package i;

import P.InterfaceC0268p;
import P.e0;
import P.f0;
import P.g0;
import P.h0;
import P.i0;
import P.t0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.buzbuz.smartautoclicker.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o.s1;
import o.t1;

/* loaded from: classes.dex */
public final class r implements InterfaceC0268p, n.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0860C f11731d;

    @Override // n.x
    public void a(n.m mVar, boolean z8) {
        this.f11731d.p(mVar);
    }

    @Override // n.x
    public boolean h(n.m mVar) {
        Window.Callback callback = this.f11731d.f11585o.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, mVar);
            return true;
        }
        return true;
    }

    @Override // P.InterfaceC0268p
    public t0 y(View view, t0 t0Var) {
        int i4;
        boolean z8;
        i0 e0Var;
        int i8;
        boolean z9;
        int b4;
        int c6;
        boolean z10;
        boolean z11;
        int color;
        t0 t0Var2 = t0Var;
        int d2 = t0Var2.d();
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = this.f11731d;
        Context context = layoutInflaterFactory2C0860C.f11584n;
        int d3 = t0Var2.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0860C.f11595y;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0860C.f11595y.getLayoutParams();
            if (layoutInflaterFactory2C0860C.f11595y.isShown()) {
                if (layoutInflaterFactory2C0860C.f11579f0 == null) {
                    layoutInflaterFactory2C0860C.f11579f0 = new Rect();
                    layoutInflaterFactory2C0860C.f11580g0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0860C.f11579f0;
                Rect rect2 = layoutInflaterFactory2C0860C.f11580g0;
                rect.set(t0Var2.b(), t0Var2.d(), t0Var2.c(), t0Var2.a());
                ViewGroup viewGroup = layoutInflaterFactory2C0860C.f11553D;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z12 = t1.f13385a;
                    s1.a(viewGroup, rect, rect2);
                } else {
                    if (!t1.f13385a) {
                        t1.f13385a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            t1.f13386b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                t1.f13386b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = t1.f13386b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i9 = rect.top;
                int i10 = rect.left;
                int i11 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0860C.f11553D;
                WeakHashMap weakHashMap = P.O.f4214a;
                t0 a3 = P.G.a(viewGroup2);
                if (a3 == null) {
                    b4 = 0;
                } else {
                    b4 = a3.b();
                }
                if (a3 == null) {
                    c6 = 0;
                } else {
                    c6 = a3.c();
                }
                if (marginLayoutParams.topMargin == i9 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i9;
                    marginLayoutParams.leftMargin = i10;
                    marginLayoutParams.rightMargin = i11;
                    z10 = true;
                }
                if (i9 > 0 && layoutInflaterFactory2C0860C.f11555F == null) {
                    View view2 = new View(context);
                    layoutInflaterFactory2C0860C.f11555F = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b4;
                    layoutParams.rightMargin = c6;
                    layoutInflaterFactory2C0860C.f11553D.addView(layoutInflaterFactory2C0860C.f11555F, -1, layoutParams);
                } else {
                    View view3 = layoutInflaterFactory2C0860C.f11555F;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i12 = marginLayoutParams2.height;
                        int i13 = marginLayoutParams.topMargin;
                        if (i12 != i13 || marginLayoutParams2.leftMargin != b4 || marginLayoutParams2.rightMargin != c6) {
                            marginLayoutParams2.height = i13;
                            marginLayoutParams2.leftMargin = b4;
                            marginLayoutParams2.rightMargin = c6;
                            layoutInflaterFactory2C0860C.f11555F.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = layoutInflaterFactory2C0860C.f11555F;
                if (view4 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0860C.f11555F;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = context.getColor(R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!layoutInflaterFactory2C0860C.K && z11) {
                    d3 = 0;
                }
                z9 = z10;
                z8 = z11;
                i4 = 0;
            } else {
                i4 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z8 = false;
                    z9 = true;
                } else {
                    z8 = false;
                    z9 = false;
                }
            }
            if (z9) {
                layoutInflaterFactory2C0860C.f11595y.setLayoutParams(marginLayoutParams);
            }
        } else {
            i4 = 0;
            z8 = false;
        }
        View view6 = layoutInflaterFactory2C0860C.f11555F;
        if (view6 != null) {
            if (z8) {
                i8 = i4;
            } else {
                i8 = 8;
            }
            view6.setVisibility(i8);
        }
        if (d2 != d3) {
            int b9 = t0Var2.b();
            int c9 = t0Var2.c();
            int a4 = t0Var2.a();
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 34) {
                e0Var = new h0(t0Var2);
            } else if (i14 >= 30) {
                e0Var = new g0(t0Var2);
            } else if (i14 >= 29) {
                e0Var = new f0(t0Var2);
            } else {
                e0Var = new e0(t0Var2);
            }
            e0Var.g(H.c.b(b9, d3, c9, a4));
            t0Var2 = e0Var.b();
        }
        WeakHashMap weakHashMap2 = P.O.f4214a;
        WindowInsets f8 = t0Var2.f();
        if (f8 != null) {
            WindowInsets b10 = P.D.b(view, f8);
            if (!b10.equals(f8)) {
                return t0.g(view, b10);
            }
            return t0Var2;
        }
        return t0Var2;
    }
}
