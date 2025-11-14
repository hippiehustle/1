package q4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: q4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1410p extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f14121h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1419y f14122i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410p(C1419y c1419y, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14122i = c1419y;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1410p) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1410p(this.f14122i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f14121h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1419y c1419y = this.f14122i;
            C1376A c1376a = c1419y.K().f14074m;
            C1400f c1400f = new C1400f(c1419y, 3);
            this.f14121h = 1;
            Object x8 = c1376a.x(c1400f, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
