package o3;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: o3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1239j extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13458h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1243n f13459i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1239j(C1243n c1243n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13459i = c1243n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1239j) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1239j(this.f13459i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f13458h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1243n c1243n = this.f13459i;
            R3.r rVar = c1243n.h0().f13495h;
            C1236g c1236g = new C1236g(c1243n, 2);
            this.f13458h = 1;
            Object x8 = rVar.x(c1236g, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
