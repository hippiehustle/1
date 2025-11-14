package O3;

import L3.C0106h;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class f0 extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f3959h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k0 f3960i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(k0 k0Var, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3960i = k0Var;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((f0) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new f0(this.f3960i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f3959h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            k0 k0Var = this.f3960i;
            H h8 = k0Var.t().f3930h;
            A4.c cVar = k0Var.f3980m;
            if (cVar != null) {
                C0106h c0106h = new C0106h((A.i) cVar.f292f, 6);
                this.f3959h = 1;
                Object x8 = h8.x(c0106h, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (x8 == enumC0646a) {
                    return enumC0646a;
                }
            } else {
                o6.j.i("viewBinding");
                throw null;
            }
        }
        return Z5.y.f7506a;
    }
}
