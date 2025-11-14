package c2;

import T1.A;
import T1.B;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import i2.C0880a;
import l1.C0999a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class r extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9569h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f9570i;
    public final /* synthetic */ z j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(long j, z zVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9570i = j;
        this.j = zVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((r) p((InterfaceC0617c) obj2, (C0880a) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        r rVar = new r(this.f9570i, this.j, interfaceC0617c);
        rVar.f9569h = obj;
        return rVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        C0880a c0880a = (C0880a) this.f9569h;
        Z5.a.d(obj);
        o6.j.e(c0880a, "<this>");
        long j = c0880a.f11753a.f12187a;
        long j5 = c0880a.f11754b.f12187a;
        C0999a c0999a = c0880a.f11755c;
        o6.j.b(c0999a);
        A a3 = new A(j, j5, B.valueOf(c0880a.f11756d.name()), c0999a.f12187a);
        a3.f5500b = this.f9570i;
        a3.f5502d = this.j.f9607h.C(c0999a);
        return a3;
    }
}
