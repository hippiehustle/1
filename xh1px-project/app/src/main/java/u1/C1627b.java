package u1;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1627b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15300h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1629d f15301i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1627b(C1629d c1629d, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15301i = c1629d;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1627b) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1627b(this.f15301i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f15300h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            this.f15300h = 1;
            Object g8 = AbstractC0166y.g(1250L, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (g8 == enumC0646a) {
                return enumC0646a;
            }
        }
        C1629d c1629d = this.f15301i;
        C1629d.a(c1629d);
        c1629d.f15308d = null;
        return y.f7506a;
    }
}
