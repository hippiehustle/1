package w4;

import H3.v;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: w4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1699d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15692h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1704i f15693i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1699d(C1704i c1704i, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15693i = c1704i;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1699d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1699d(this.f15693i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f15692h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1704i c1704i = this.f15693i;
            v vVar = c1704i.t().f15710d;
            C1698c c1698c = new C1698c(c1704i, 0);
            this.f15692h = 1;
            Object x8 = vVar.x(c1698c, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
