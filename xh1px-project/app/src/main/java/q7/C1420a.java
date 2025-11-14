package q7;

import C6.InterfaceC0001b;
import C6.InterfaceC0004e;
import C6.InterfaceC0011l;
import F6.AbstractC0055o;
import f7.C0725e;
import o6.j;
import w7.AbstractC1759v;

/* renamed from: q7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1420a extends D6.b implements InterfaceC1423d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14213f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final C0725e f14214g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0011l f14215h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1420a(InterfaceC0001b interfaceC0001b, AbstractC1759v abstractC1759v, C0725e c0725e) {
        super(abstractC1759v);
        j.e(abstractC1759v, "receiverType");
        this.f14215h = (AbstractC0055o) interfaceC0001b;
        this.f14214g = c0725e;
    }

    public final C0725e K0() {
        switch (this.f14213f) {
            case 0:
                return this.f14214g;
            default:
                return this.f14214g;
        }
    }

    @Override // D6.b
    public final String toString() {
        switch (this.f14213f) {
            case 0:
                return b() + ": Ctx { " + ((InterfaceC0004e) this.f14215h) + " }";
            default:
                return "Cxt { " + ((AbstractC0055o) this.f14215h) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420a(InterfaceC0004e interfaceC0004e, AbstractC1759v abstractC1759v, C0725e c0725e) {
        super(abstractC1759v);
        j.e(abstractC1759v, "receiverType");
        this.f14215h = interfaceC0004e;
        this.f14214g = c0725e;
    }
}
