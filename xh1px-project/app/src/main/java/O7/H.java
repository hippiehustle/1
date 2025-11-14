package O7;

import D4.C0037m;
import L7.InterfaceC0163v;
import P7.AbstractC0284a;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class H extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4072h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0 f4073i;
    public final /* synthetic */ InterfaceC0233f j;
    public final /* synthetic */ AbstractC0284a k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4074l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(a0 a0Var, InterfaceC0233f interfaceC0233f, M m6, Object obj, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4073i = a0Var;
        this.j = interfaceC0233f;
        this.k = (AbstractC0284a) m6;
        this.f4074l = obj;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((H) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [O7.M, P7.a] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new H(this.f4073i, this.j, this.k, this.f4074l, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (O7.V.o(r10, r0, r9) == r8) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v5, types: [f6.j, O7.F] */
    /* JADX WARN: Type inference failed for: r7v0, types: [O7.M, O7.g, P7.a] */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f4072h;
        Z5.y yVar = Z5.y.f7506a;
        InterfaceC0233f interfaceC0233f = this.j;
        int i8 = 2;
        ?? r72 = this.k;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            Z5.a.d(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Z5.a.d(obj);
                    return yVar;
                }
                Z5.a.d(obj);
            } else {
                Z5.a.d(obj);
                return yVar;
            }
        } else {
            Z5.a.d(obj);
            C0232e c0232e = Z.f4117a;
            a0 a0Var = this.f4073i;
            if (a0Var == c0232e) {
                this.f4072h = 1;
                if (interfaceC0233f.x(r72, this) == enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            }
            InterfaceC0617c interfaceC0617c = null;
            if (a0Var == Z.f4118b) {
                P7.D e9 = r72.e();
                ?? abstractC0720j = new AbstractC0720j(2, null);
                this.f4072h = 2;
            } else {
                InterfaceC0233f k = V.k(a0Var.a(r72.e()));
                G g8 = new G(interfaceC0233f, r72, this.f4074l, null);
                this.f4072h = 4;
                int i9 = AbstractC0252z.f4200a;
                Object x8 = V.g(V.u(k, new C0037m((Object) g8, interfaceC0617c, i8)), 0).x(P7.x.f4686d, this);
                if (x8 != enumC0646a) {
                    x8 = yVar;
                }
                if (x8 != enumC0646a) {
                    x8 = yVar;
                }
                if (x8 == enumC0646a) {
                }
            }
            return enumC0646a;
        }
        this.f4072h = 3;
        if (interfaceC0233f.x(r72, this) == enumC0646a) {
        }
    }
}
