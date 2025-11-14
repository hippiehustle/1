package q4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: q4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1406l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f14113h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1419y f14114i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1406l(C1419y c1419y, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14114i = c1419y;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1406l) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1406l(this.f14114i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f14113h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1419y c1419y = this.f14114i;
            C1392Q c1392q = c1419y.K().f14073l;
            F3.f fVar = c1419y.f14143y;
            if (fVar != null) {
                C1405k c1405k = new C1405k((A4.a) fVar.j, 0);
                this.f14113h = 1;
                Object x8 = c1392q.x(c1405k, this);
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
