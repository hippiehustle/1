package O3;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class e0 extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f3955h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k0 f3956i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(k0 k0Var, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3956i = k0Var;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((e0) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new e0(this.f3956i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f3955h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            k0 k0Var = this.f3956i;
            C4.e eVar = k0Var.t().f3929g;
            d0 d0Var = new d0(k0Var, 0);
            this.f3955h = 1;
            Object x8 = eVar.x(d0Var, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
