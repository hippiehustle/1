package q4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import m3.C1064d;
import n6.InterfaceC1164c;

/* renamed from: q4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1408n extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f14117h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1419y f14118i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408n(C1419y c1419y, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14118i = c1419y;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1408n) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1408n(this.f14118i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f14117h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1419y c1419y = this.f14118i;
            C4.e eVar = c1419y.K().f14072i;
            F3.f fVar = c1419y.f14143y;
            if (fVar != null) {
                C1064d c1064d = new C1064d((A.i) fVar.f1338l, 11);
                this.f14117h = 1;
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
        return Z5.y.f7506a;
    }
}
