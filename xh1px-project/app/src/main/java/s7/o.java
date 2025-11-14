package s7;

import C6.InterfaceC0010k;
import a7.I;
import n6.InterfaceC1162a;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class o implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14603d;

    /* renamed from: e, reason: collision with root package name */
    public final s f14604e;

    /* renamed from: f, reason: collision with root package name */
    public final I f14605f;

    /* renamed from: g, reason: collision with root package name */
    public final u7.q f14606g;

    public /* synthetic */ o(s sVar, I i4, u7.q qVar, int i8) {
        this.f14603d = i8;
        this.f14604e = sVar;
        this.f14605f = i4;
        this.f14606g = qVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f14603d) {
            case 0:
                s sVar = this.f14604e;
                v7.k kVar = ((C1518i) sVar.f14620a.f1371d).f14573a;
                o oVar = new o(sVar, this.f14605f, this.f14606g, 2);
                kVar.getClass();
                return new v7.h(kVar, oVar);
            case 1:
                s sVar2 = this.f14604e;
                v7.k kVar2 = ((C1518i) sVar2.f14620a.f1371d).f14573a;
                o oVar2 = new o(sVar2, this.f14605f, this.f14606g, 3);
                kVar2.getClass();
                return new v7.h(kVar2, oVar2);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                s sVar3 = this.f14604e;
                F3.m mVar = sVar3.f14620a;
                v a3 = sVar3.a((InterfaceC0010k) mVar.f1373f);
                o6.j.b(a3);
                InterfaceC1510a interfaceC1510a = ((C1518i) mVar.f1371d).f14577e;
                AbstractC1759v r8 = this.f14606g.r();
                o6.j.d(r8, "getReturnType(...)");
                return (k7.g) interfaceC1510a.j(a3, this.f14605f, r8);
            default:
                s sVar4 = this.f14604e;
                F3.m mVar2 = sVar4.f14620a;
                v a4 = sVar4.a((InterfaceC0010k) mVar2.f1373f);
                o6.j.b(a4);
                InterfaceC1510a interfaceC1510a2 = ((C1518i) mVar2.f1371d).f14577e;
                AbstractC1759v r9 = this.f14606g.r();
                o6.j.d(r9, "getReturnType(...)");
                return (k7.g) interfaceC1510a2.f(a4, this.f14605f, r9);
        }
    }
}
