package t4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: t4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1578f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15071h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1583k f15072i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1578f(C1583k c1583k, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15072i = c1583k;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1578f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1578f(this.f15072i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f15071h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1583k c1583k = this.f15072i;
            q qVar = c1583k.t().f15118g;
            C1574b c1574b = new C1574b(c1583k, 2);
            this.f15071h = 1;
            Object x8 = qVar.x(c1574b, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
