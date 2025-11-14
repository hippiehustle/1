package o;

import n.InterfaceC1101C;

/* loaded from: classes.dex */
public final class H extends AbstractViewOnTouchListenerC1219v0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M f13084m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ P f13085n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(P p8, P p9, M m6) {
        super(p9);
        this.f13085n = p8;
        this.f13084m = m6;
    }

    @Override // o.AbstractViewOnTouchListenerC1219v0
    public final InterfaceC1101C b() {
        return this.f13084m;
    }

    @Override // o.AbstractViewOnTouchListenerC1219v0
    public final boolean c() {
        P p8 = this.f13085n;
        if (!p8.getInternalPopup().b()) {
            p8.f13128i.l(p8.getTextDirection(), p8.getTextAlignment());
            return true;
        }
        return true;
    }
}
