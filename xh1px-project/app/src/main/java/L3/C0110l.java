package L3;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: L3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2862h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f2863i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0110l(w wVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2863i = wVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0110l) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0110l(this.f2863i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f2862h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            w wVar = this.f2863i;
            C4.e eVar = wVar.J().j;
            F3.b bVar = wVar.f2886w;
            if (bVar != null) {
                C0109k c0109k = new C0109k(bVar.f1312g, 0);
                this.f2862h = 1;
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
