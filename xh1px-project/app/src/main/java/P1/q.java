package P1;

import L7.AbstractC0166y;
import L7.k0;
import O7.i0;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class q extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4477h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4478i;
    public final /* synthetic */ i0 j;
    public final /* synthetic */ w k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(i0 i0Var, w wVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = i0Var;
        this.k = wVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((q) p((InterfaceC0617c) obj2, (f) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        q qVar = new q(this.j, this.k, interfaceC0617c);
        qVar.f4478i = obj;
        return qVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        f fVar = (f) this.f4478i;
        int i4 = this.f4477h;
        y yVar = y.f7506a;
        i0 i0Var = this.j;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            this.f4478i = fVar;
            this.f4477h = 1;
            i0Var.n(fVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (yVar == enumC0646a) {
                return enumC0646a;
            }
        }
        w wVar = this.k;
        k0 k0Var = wVar.f4496h;
        if (k0Var != null) {
            k0Var.d(null);
        }
        J7.a aVar = fVar.f4458a;
        if (aVar != null) {
            wVar.f4496h = AbstractC0166y.q(wVar.f4491c, null, null, new p(aVar.f2504d, i0Var, null), 3);
        }
        return yVar;
    }
}
