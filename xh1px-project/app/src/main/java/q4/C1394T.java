package q4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import k2.AbstractC0951a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;

/* renamed from: q4.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1394T extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1163b f14063h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC0951a f14064i;
    public final /* synthetic */ U j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1394T(InterfaceC1163b interfaceC1163b, AbstractC0951a abstractC0951a, U u8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14063h = interfaceC1163b;
        this.f14064i = abstractC0951a;
        this.j = u8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1394T c1394t = (C1394T) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c1394t.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1394T(this.f14063h, this.f14064i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        AbstractC0951a abstractC0951a = (AbstractC0951a) this.f14063h.m(this.f14064i);
        if (abstractC0951a != null) {
            H3.n nVar = this.j.f14066c;
            nVar.getClass();
            C3.e eVar = nVar.f1948c;
            eVar.getClass();
            E3.a aVar = (E3.a) eVar.f601h.f();
            if (aVar != null) {
                aVar.h(abstractC0951a);
            }
        }
        return Z5.y.f7506a;
    }
}
