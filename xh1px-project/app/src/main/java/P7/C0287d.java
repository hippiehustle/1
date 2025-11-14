package P7;

import L7.AbstractC0166y;
import L7.EnumC0164w;
import L7.F;
import L7.InterfaceC0163v;
import O7.InterfaceC0234g;
import O7.V;
import d6.C0618d;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: P7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4643h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4644i;
    public final /* synthetic */ InterfaceC0234g j;
    public final /* synthetic */ f k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0287d(InterfaceC0234g interfaceC0234g, f fVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = interfaceC0234g;
        this.k = fVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0287d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0287d c0287d = new C0287d(this.j, this.k, interfaceC0617c);
        c0287d.f4644i = obj;
        return c0287d;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4643h;
        Z5.y yVar = Z5.y.f7506a;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return yVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f4644i;
        f fVar = this.k;
        InterfaceC0622h interfaceC0622h = fVar.f4647d;
        int i8 = fVar.f4648e;
        if (i8 == -3) {
            i8 = -2;
        }
        N7.a aVar = fVar.f4649f;
        InterfaceC1164c c0288e = new C0288e(fVar, null);
        N7.h H2 = E2.c.H(i8, 4, aVar);
        InterfaceC0622h j = AbstractC0166y.j(interfaceC0163v.p(), interfaceC0622h, true);
        S7.e eVar = F.f3175a;
        if (j != eVar && j.B(C0618d.f10447d) == null) {
            j = j.D(eVar);
        }
        N7.r rVar = new N7.r(j, H2);
        rVar.g0(EnumC0164w.f3250f, rVar, c0288e);
        this.f4643h = 1;
        Object m6 = V.m(this.j, rVar, true, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (m6 != enumC0646a) {
            m6 = yVar;
        }
        if (m6 == enumC0646a) {
            return enumC0646a;
        }
        return yVar;
    }
}
