package q2;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: q2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1364j extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13960h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13961i;
    public final /* synthetic */ C1365k j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364j(int i4, C1365k c1365k, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13961i = i4;
        this.j = c1365k;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1364j) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1364j(this.f13961i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f13960h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            int i8 = J7.a.f2503g;
            long c6 = J7.a.c(J7.f.l(this.f13961i, J7.c.MINUTES));
            this.f13960h = 1;
            Object g8 = AbstractC0166y.g(c6, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (g8 == enumC0646a) {
                return enumC0646a;
            }
        }
        C1365k c1365k = this.j;
        Q7.d dVar = c1365k.f13965d;
        if (dVar != null) {
            AbstractC0166y.q(dVar, null, null, new C1363i(c1365k, null), 3);
        }
        return y.f7506a;
    }
}
