package W4;

import L7.InterfaceC0163v;
import O7.U;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class q extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6609h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f6610i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x xVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6610i = xVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((q) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new q(this.f6610i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f6609h;
        y yVar = y.f7506a;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return yVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        A4.a aVar = this.f6610i.f6625b;
        this.f6609h = 1;
        Object n3 = ((U) aVar.f282g).n(yVar, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (n3 != enumC0646a) {
            n3 = yVar;
        }
        if (n3 == enumC0646a) {
            return enumC0646a;
        }
        return yVar;
    }
}
