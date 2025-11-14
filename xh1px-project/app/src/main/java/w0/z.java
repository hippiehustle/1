package w0;

import L7.C0156n;
import L7.C0158p;
import L7.InterfaceC0155m;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class z extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15651h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f15652i;
    public final /* synthetic */ C0156n j;
    public final /* synthetic */ AbstractC0720j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(C0156n c0156n, InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = c0156n;
        this.k = (AbstractC0720j) interfaceC1164c;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((z) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        z zVar = new z(this.j, this.k, interfaceC0617c);
        zVar.f15652i = obj;
        return zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        ?? r02 = this.f15651h;
        try {
            if (r02 != 0) {
                if (r02 == 1) {
                    InterfaceC0155m interfaceC0155m = (InterfaceC0155m) this.f15652i;
                    Z5.a.d(obj);
                    r02 = interfaceC0155m;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Z5.a.d(obj);
                InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f15652i;
                C0156n c0156n = this.j;
                ?? r22 = this.k;
                this.f15652i = c0156n;
                this.f15651h = 1;
                obj = r22.l(interfaceC0163v, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                r02 = c0156n;
                if (obj == enumC0646a) {
                    return enumC0646a;
                }
            }
        } catch (Throwable th) {
            obj = Z5.a.b(th);
        }
        Throwable a3 = Z5.l.a(obj);
        C0156n c0156n2 = (C0156n) r02;
        if (a3 == null) {
            c0156n2.R(obj);
        } else {
            c0156n2.getClass();
            c0156n2.R(new C0158p(a3, false));
        }
        return Z5.y.f7506a;
    }
}
