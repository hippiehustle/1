package O3;

import L3.C0109k;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: O3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f3961h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0219q f3962i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0209g(C0219q c0219q, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3962i = c0219q;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0209g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0209g(this.f3962i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f3961h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0219q c0219q = this.f3962i;
            C4.e eVar = c0219q.t().f3931i;
            F3.a aVar = c0219q.f3990m;
            if (aVar != null) {
                C0109k c0109k = new C0109k((A4.a) aVar.f1306g, 2);
                this.f3961h = 1;
                Object x8 = eVar.x(c0109k, this);
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
