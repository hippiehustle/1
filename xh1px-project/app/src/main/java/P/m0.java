package P;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class m0 extends l0 {

    /* renamed from: o, reason: collision with root package name */
    public H.c f4294o;

    /* renamed from: p, reason: collision with root package name */
    public H.c f4295p;

    /* renamed from: q, reason: collision with root package name */
    public H.c f4296q;

    public m0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
        this.f4294o = null;
        this.f4295p = null;
        this.f4296q = null;
    }

    @Override // P.p0
    public H.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f4295p == null) {
            mandatorySystemGestureInsets = this.f4282c.getMandatorySystemGestureInsets();
            this.f4295p = H.c.c(mandatorySystemGestureInsets);
        }
        return this.f4295p;
    }

    @Override // P.p0
    public H.c i() {
        Insets systemGestureInsets;
        if (this.f4294o == null) {
            systemGestureInsets = this.f4282c.getSystemGestureInsets();
            this.f4294o = H.c.c(systemGestureInsets);
        }
        return this.f4294o;
    }

    @Override // P.p0
    public H.c k() {
        Insets tappableElementInsets;
        if (this.f4296q == null) {
            tappableElementInsets = this.f4282c.getTappableElementInsets();
            this.f4296q = H.c.c(tappableElementInsets);
        }
        return this.f4296q;
    }

    @Override // P.j0, P.p0
    public t0 l(int i4, int i8, int i9, int i10) {
        WindowInsets inset;
        inset = this.f4282c.inset(i4, i8, i9, i10);
        return t0.g(null, inset);
    }

    @Override // P.k0, P.p0
    public void q(H.c cVar) {
    }
}
