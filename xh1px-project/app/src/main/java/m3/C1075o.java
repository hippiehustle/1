package m3;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: m3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1075o extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12463h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1079s f12464i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1075o(C1079s c1079s, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12464i = c1079s;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1075o) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1075o(this.f12464i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12463h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1079s c1079s = this.f12464i;
            C4.e eVar = c1079s.G().k;
            C1063c c1063c = new C1063c(c1079s, 3);
            this.f12463h = 1;
            Object x8 = eVar.x(c1063c, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
