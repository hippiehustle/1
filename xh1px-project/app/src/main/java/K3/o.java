package K3;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class o extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2699h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f2700i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2700i = sVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((o) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new o(this.f2700i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f2699h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return Z5.y.f7506a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        s sVar = this.f2700i;
        R3.r rVar = sVar.h0().f2649m;
        C0097k c0097k = new C0097k(sVar, 3);
        this.f2699h = 1;
        rVar.x(c0097k, this);
        return EnumC0646a.f10656d;
    }
}
