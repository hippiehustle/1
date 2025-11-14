package r3;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import m3.C1064d;
import n6.InterfaceC1164c;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1438b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f14316h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1450n f14317i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1438b(C1450n c1450n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14317i = c1450n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1438b) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1438b(this.f14317i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f14316h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1450n c1450n = this.f14317i;
            C4.e eVar = c1450n.t().f14371d;
            A4.d dVar = c1450n.f14341m;
            if (dVar != null) {
                C1064d c1064d = new C1064d((A.i) dVar.f298h, 13);
                this.f14316h = 1;
                Object x8 = eVar.x(c1064d, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (x8 == enumC0646a) {
                    return enumC0646a;
                }
            } else {
                o6.j.i("viewBinding");
                throw null;
            }
        }
        return y.f7506a;
    }
}
