package q4;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* renamed from: q4.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1392Q implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0233f f14058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U f14059f;

    public /* synthetic */ C1392Q(P7.n nVar, U u8, int i4) {
        this.f14057d = i4;
        this.f14058e = nVar;
        this.f14059f = u8;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f14057d) {
            case 0:
                Object x8 = this.f14058e.x(new C1386K(interfaceC0234g, this.f14059f, 4), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f14058e.x(new C1386K(interfaceC0234g, this.f14059f, 5), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
        }
    }
}
