package androidx.lifecycle;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class M extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f8799h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f8800i;
    public final /* synthetic */ C0512x j;
    public final /* synthetic */ EnumC0504o k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0720j f8801l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M(C0512x c0512x, EnumC0504o enumC0504o, InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = c0512x;
        this.k = enumC0504o;
        this.f8801l = (AbstractC0720j) interfaceC1164c;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((M) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        M m6 = new M(this.j, this.k, this.f8801l, interfaceC0617c);
        m6.f8800i = obj;
        return m6;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f8799h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f8800i;
            S7.e eVar = L7.F.f3175a;
            M7.e eVar2 = Q7.n.f4962a.f3507h;
            L l6 = new L(this.j, this.k, interfaceC0163v, this.f8801l, null);
            this.f8799h = 1;
            Object A2 = AbstractC0166y.A(eVar2, l6, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (A2 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
