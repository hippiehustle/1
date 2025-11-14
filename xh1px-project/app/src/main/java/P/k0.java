package P;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class k0 extends j0 {

    /* renamed from: n, reason: collision with root package name */
    public H.c f4288n;

    public k0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
        this.f4288n = null;
    }

    @Override // P.p0
    public t0 b() {
        return t0.g(null, this.f4282c.consumeStableInsets());
    }

    @Override // P.p0
    public t0 c() {
        return t0.g(null, this.f4282c.consumeSystemWindowInsets());
    }

    @Override // P.p0
    public final H.c h() {
        if (this.f4288n == null) {
            WindowInsets windowInsets = this.f4282c;
            this.f4288n = H.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f4288n;
    }

    @Override // P.p0
    public boolean m() {
        return this.f4282c.isConsumed();
    }

    @Override // P.p0
    public void q(H.c cVar) {
        this.f4288n = cVar;
    }
}
