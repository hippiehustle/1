package l5;

import G5.h;
import P.F;
import P.O;
import P.t0;
import P.u0;
import P.w0;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h4.AbstractC0832f;
import java.util.WeakHashMap;
import q4.X;

/* renamed from: l5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1034d extends AbstractC1031a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f12300a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f12301b;

    /* renamed from: c, reason: collision with root package name */
    public Window f12302c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12303d;

    public C1034d(View view, t0 t0Var) {
        ColorStateList c6;
        Integer num;
        this.f12301b = t0Var;
        h hVar = BottomSheetBehavior.B(view).f9973i;
        if (hVar != null) {
            c6 = hVar.f1769d.f1754c;
        } else {
            WeakHashMap weakHashMap = O.f4214a;
            c6 = F.c(view);
        }
        if (c6 != null) {
            this.f12300a = Boolean.valueOf(AbstractC0832f.r(c6.getDefaultColor()));
            return;
        }
        ColorStateList i4 = h2.a.i(view.getBackground());
        if (i4 != null) {
            num = Integer.valueOf(i4.getDefaultColor());
        } else {
            num = null;
        }
        if (num != null) {
            this.f12300a = Boolean.valueOf(AbstractC0832f.r(num.intValue()));
        } else {
            this.f12300a = null;
        }
    }

    @Override // l5.AbstractC1031a
    public final void a(View view) {
        d(view);
    }

    @Override // l5.AbstractC1031a
    public final void b(View view) {
        d(view);
    }

    @Override // l5.AbstractC1031a
    public final void c(View view, int i4) {
        d(view);
    }

    public final void d(View view) {
        X u0Var;
        boolean booleanValue;
        X u0Var2;
        int top = view.getTop();
        t0 t0Var = this.f12301b;
        if (top < t0Var.d()) {
            Window window = this.f12302c;
            if (window != null) {
                Boolean bool = this.f12300a;
                if (bool == null) {
                    booleanValue = this.f12303d;
                } else {
                    booleanValue = bool.booleanValue();
                }
                G5.e eVar = new G5.e(window.getDecorView());
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 35) {
                    u0Var2 = new w0(window, eVar);
                } else if (i4 >= 30) {
                    u0Var2 = new w0(window, eVar);
                } else if (i4 >= 26) {
                    u0Var2 = new u0(window, eVar);
                } else {
                    u0Var2 = new u0(window, eVar);
                }
                u0Var2.O(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), t0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f12302c;
            if (window2 != null) {
                boolean z8 = this.f12303d;
                G5.e eVar2 = new G5.e(window2.getDecorView());
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 35) {
                    u0Var = new w0(window2, eVar2);
                } else if (i8 >= 30) {
                    u0Var = new w0(window2, eVar2);
                } else if (i8 >= 26) {
                    u0Var = new u0(window2, eVar2);
                } else {
                    u0Var = new u0(window2, eVar2);
                }
                u0Var.O(z8);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        X u0Var;
        if (this.f12302c != window) {
            this.f12302c = window;
            if (window != null) {
                G5.e eVar = new G5.e(window.getDecorView());
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 35) {
                    u0Var = new w0(window, eVar);
                } else if (i4 >= 30) {
                    u0Var = new w0(window, eVar);
                } else if (i4 >= 26) {
                    u0Var = new u0(window, eVar);
                } else {
                    u0Var = new u0(window, eVar);
                }
                this.f12303d = u0Var.A();
            }
        }
    }
}
