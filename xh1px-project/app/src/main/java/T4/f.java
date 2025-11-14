package T4;

import L7.AbstractC0166y;
import L7.F;
import L7.InterfaceC0163v;
import O7.i0;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import h3.C0820h;
import l1.C0999a;
import n6.InterfaceC1164c;
import q2.C1358d;
import q2.C1365k;

/* loaded from: classes.dex */
public final class f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f5764h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f5765i;
    public final /* synthetic */ p2.e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, p2.e eVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5765i = kVar;
        this.j = eVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new f(this.f5765i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        p2.e eVar = this.j;
        C0999a c0999a = eVar.f13699a;
        int i4 = this.f5764h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            this.f5764h = 1;
            Object g8 = AbstractC0166y.g(500L, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (g8 == enumC0646a) {
                return enumC0646a;
            }
        }
        k kVar = this.f5765i;
        C1365k c1365k = kVar.f5779f;
        c1365k.f13963b.f13945c = ((Boolean) c1365k.f13964c.j.f4088d.f()).booleanValue();
        i0 i0Var = c1365k.f13969h;
        Long valueOf = Long.valueOf(c0999a.f12187a);
        i0Var.getClass();
        i0Var.h(null, valueOf);
        S7.e eVar2 = F.f3175a;
        Q7.d b4 = AbstractC0166y.b(S7.d.f5456f);
        c1365k.f13965d = b4;
        AbstractC0166y.q(b4, null, null, new C1358d(null, eVar, c1365k), 3);
        kVar.f5775b.d(kVar.f5774a, new C0820h(c0999a, new a(kVar, 2)), false);
        return y.f7506a;
    }
}
