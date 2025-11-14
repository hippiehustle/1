package P;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class n0 extends m0 {

    /* renamed from: r, reason: collision with root package name */
    public static final t0 f4297r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f4297r = t0.g(null, windowInsets);
    }

    public n0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
    }

    @Override // P.j0, P.p0
    public H.c f(int i4) {
        Insets insets;
        insets = this.f4282c.getInsets(q0.a(i4));
        return H.c.c(insets);
    }

    @Override // P.j0, P.p0
    public final void d(View view) {
    }
}
