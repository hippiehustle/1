package m3;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e3.C0642a;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: m3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1068h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12449h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1079s f12450i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1068h(C1079s c1079s, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12450i = c1079s;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1068h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1068h(this.f12450i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12449h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1079s c1079s = this.f12450i;
            C4.e eVar = c1079s.G().f12427d;
            C0642a c0642a = c1079s.f12476z;
            if (c0642a != null) {
                C1064d c1064d = new C1064d(c0642a.f10603g, 1);
                this.f12449h = 1;
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
