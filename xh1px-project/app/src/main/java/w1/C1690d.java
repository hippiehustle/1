package w1;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1690d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15660h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f15661i;
    public final /* synthetic */ e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690d(e eVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = eVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1690d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1690d c1690d = new C1690d(this.j, interfaceC0617c);
        c1690d.f15661i = obj;
        return c1690d;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f15661i;
        int i4 = this.f15660h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            this.f15661i = interfaceC0163v;
            this.f15660h = 1;
            Object g8 = AbstractC0166y.g(5000L, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (g8 == enumC0646a) {
                return enumC0646a;
            }
        }
        this.j.n().a();
        AbstractC0166y.e(interfaceC0163v);
        return y.f7506a;
    }
}
