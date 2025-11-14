package o4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import m3.C1064d;
import n6.InterfaceC1164c;

/* renamed from: o4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1272i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13573h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f13574i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1272i(t tVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13574i = tVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1272i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1272i(this.f13574i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f13573h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            t tVar = this.f13574i;
            C1258G c1258g = tVar.J().k;
            F3.b bVar = tVar.f13597w;
            if (bVar != null) {
                C1064d c1064d = new C1064d(bVar.j, 7);
                this.f13573h = 1;
                Object x8 = c1258g.x(c1064d, this);
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
