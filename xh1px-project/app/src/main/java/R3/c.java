package R3;

import L7.InterfaceC0163v;
import O7.InterfaceC0233f;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f5046h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f5047i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n nVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5047i = nVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new c(this.f5047i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f5046h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            n nVar = this.f5047i;
            InterfaceC0233f interfaceC0233f = nVar.G().f5097c;
            b bVar = new b(nVar, 0);
            this.f5046h = 1;
            Object x8 = interfaceC0233f.x(bVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
