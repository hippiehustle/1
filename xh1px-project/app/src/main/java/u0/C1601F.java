package u0;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: u0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1601F extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15160h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f15161i;
    public final /* synthetic */ C1609N j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1601F(C1609N c1609n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = c1609n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1601F) p((InterfaceC0617c) obj2, (w0.r) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1601F c1601f = new C1601F(this.j, interfaceC0617c);
        c1601f.f15161i = obj;
        return c1601f;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f15160h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        w0.r rVar = (w0.r) this.f15161i;
        this.f15160h = 1;
        Object a3 = C1609N.a(this.j, rVar, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (a3 == enumC0646a) {
            return enumC0646a;
        }
        return a3;
    }
}
