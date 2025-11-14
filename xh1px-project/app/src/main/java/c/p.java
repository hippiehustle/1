package c;

import P.u0;
import P.w0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import q4.X;

/* loaded from: classes.dex */
public final class p implements r {
    @Override // c.r
    public void a(C0546C c0546c, C0546C c0546c2, Window window, View view, boolean z8, boolean z9) {
        int i4;
        int i8;
        X u0Var;
        o6.j.e(c0546c, "statusBarStyle");
        o6.j.e(c0546c2, "navigationBarStyle");
        o6.j.e(window, "window");
        o6.j.e(view, "view");
        E2.d.J(window, false);
        if (z8) {
            i4 = c0546c.f9305b;
        } else {
            i4 = c0546c.f9304a;
        }
        window.setStatusBarColor(i4);
        if (z9) {
            i8 = c0546c2.f9305b;
        } else {
            i8 = c0546c2.f9304a;
        }
        window.setNavigationBarColor(i8);
        G5.e eVar = new G5.e(view);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 35) {
            u0Var = new w0(window, eVar);
        } else if (i9 >= 30) {
            u0Var = new w0(window, eVar);
        } else if (i9 >= 26) {
            u0Var = new u0(window, eVar);
        } else {
            u0Var = new u0(window, eVar);
        }
        u0Var.O(!z8);
        u0Var.N(!z9);
    }
}
