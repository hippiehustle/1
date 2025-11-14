package c;

import P.u0;
import P.w0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import q4.X;

/* loaded from: classes.dex */
public final class q implements r {
    @Override // c.r
    public void a(C0546C c0546c, C0546C c0546c2, Window window, View view, boolean z8, boolean z9) {
        X u0Var;
        o6.j.e(c0546c, "statusBarStyle");
        o6.j.e(c0546c2, "navigationBarStyle");
        o6.j.e(window, "window");
        o6.j.e(view, "view");
        E2.d.J(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        G5.e eVar = new G5.e(view);
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
        u0Var.O(!z8);
        u0Var.N(!z9);
    }
}
