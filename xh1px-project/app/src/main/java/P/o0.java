package P;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class o0 extends n0 {

    /* renamed from: s, reason: collision with root package name */
    public static final t0 f4300s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f4300s = t0.g(null, windowInsets);
    }

    public o0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
    }

    @Override // P.n0, P.j0, P.p0
    public H.c f(int i4) {
        Insets insets;
        insets = this.f4282c.getInsets(s0.a(i4));
        return H.c.c(insets);
    }
}
