package n;

import L7.AbstractC0166y;
import L7.C0150h;
import d6.C0618d;
import d6.InterfaceC0622h;
import g0.L;

/* renamed from: n.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1108e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12595d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12597f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f12598g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f12599h;

    public RunnableC1108e(InterfaceC0622h interfaceC0622h, C0150h c0150h, u0.u uVar, u0.w wVar) {
        this.f12596e = interfaceC0622h;
        this.f12597f = c0150h;
        this.f12598g = uVar;
        this.f12599h = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12595d) {
            case 0:
                ViewOnKeyListenerC1110g viewOnKeyListenerC1110g = (ViewOnKeyListenerC1110g) ((L) this.f12599h).f10871e;
                o oVar = (o) this.f12597f;
                C1109f c1109f = (C1109f) this.f12596e;
                if (c1109f != null) {
                    viewOnKeyListenerC1110g.f12605C = true;
                    c1109f.f12601b.c(false);
                    viewOnKeyListenerC1110g.f12605C = false;
                }
                if (oVar.isEnabled() && oVar.hasSubMenu()) {
                    ((m) this.f12598g).q(oVar, null, 4);
                    return;
                }
                return;
            default:
                C0150h c0150h = (C0150h) this.f12597f;
                try {
                    AbstractC0166y.t(((InterfaceC0622h) this.f12596e).y(C0618d.f10447d), new u0.v((u0.u) this.f12598g, c0150h, (u0.w) this.f12599h, null));
                    return;
                } catch (Throwable th) {
                    c0150h.p(th);
                    return;
                }
        }
    }

    public RunnableC1108e(L l6, C1109f c1109f, o oVar, m mVar) {
        this.f12599h = l6;
        this.f12596e = c1109f;
        this.f12597f = oVar;
        this.f12598g = mVar;
    }
}
