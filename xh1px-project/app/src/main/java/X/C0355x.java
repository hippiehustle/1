package X;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: X.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355x extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public Throwable f6785h;

    /* renamed from: i, reason: collision with root package name */
    public int f6786i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ H k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6787l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355x(H h8, int i4, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.k = h8;
        this.f6787l = i4;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0355x) p((InterfaceC0617c) obj2, bool)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0355x c0355x = new C0355x(this.k, this.f6787l, interfaceC0617c);
        c0355x.j = ((Boolean) obj).booleanValue();
        return c0355x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Throwable th;
        int i4;
        c0 c0Var;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = this.f6786i;
        H h8 = this.k;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        try {
        } catch (Throwable th2) {
            if (z11 != 0) {
                b0 h9 = h8.h();
                this.f6785h = th2;
                this.j = z11;
                this.f6786i = 2;
                Integer a3 = h9.a();
                if (a3 != enumC0646a) {
                    th = th2;
                    obj = a3;
                    z10 = z11;
                }
            } else {
                th = th2;
                i4 = this.f6787l;
                z9 = z11;
            }
        }
        if (z11 != 0) {
            if (z11 != 1) {
                if (z11 == 2) {
                    boolean z12 = this.j;
                    th = this.f6785h;
                    Z5.a.d(obj);
                    z10 = z12;
                    i4 = ((Number) obj).intValue();
                    z9 = z10;
                    c0Var = new U(th, i4);
                    z8 = z9;
                    return new Z5.j(c0Var, Boolean.valueOf(z8));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z13 = this.j;
            Z5.a.d(obj);
            z11 = z13;
        } else {
            Z5.a.d(obj);
            boolean z14 = this.j;
            this.j = z14;
            this.f6786i = 1;
            obj = H.f(h8, z14, this);
            z11 = z14;
            if (obj == enumC0646a) {
                return enumC0646a;
            }
        }
        c0Var = (c0) obj;
        z8 = z11;
        return new Z5.j(c0Var, Boolean.valueOf(z8));
    }
}
