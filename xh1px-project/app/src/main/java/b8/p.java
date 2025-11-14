package b8;

import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0719i;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class p extends AbstractC0719i implements InterfaceC1165d {

    /* renamed from: f, reason: collision with root package name */
    public int f9278f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Z5.b f9279g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ M.i f9280h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(M.i iVar, InterfaceC0617c interfaceC0617c) {
        super(3, interfaceC0617c);
        this.f9280h = iVar;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        p pVar = new p(this.f9280h, (InterfaceC0617c) obj3);
        pVar.f9279g = (Z5.b) obj;
        return pVar.v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        M.i iVar = this.f9280h;
        S6.e eVar = (S6.e) iVar.f3288e;
        Z5.b bVar = this.f9279g;
        int i4 = this.f9278f;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            byte z8 = eVar.z();
            if (z8 == 1) {
                return iVar.i(true);
            }
            if (z8 == 0) {
                return iVar.i(false);
            }
            if (z8 == 6) {
                this.f9279g = null;
                this.f9278f = 1;
                obj = M.i.b(iVar, bVar, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (obj == enumC0646a) {
                    return enumC0646a;
                }
            } else {
                if (z8 == 8) {
                    return iVar.h();
                }
                S6.e.q(eVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return (a8.j) obj;
    }
}
