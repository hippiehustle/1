package P;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class G {
    public static t0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        t0 g8 = t0.g(null, rootWindowInsets);
        p0 p0Var = g8.f4308a;
        p0Var.p(g8);
        p0Var.d(view.getRootView());
        return g8;
    }

    public static void b(View view, int i4, int i8) {
        view.setScrollIndicators(i4, i8);
    }
}
