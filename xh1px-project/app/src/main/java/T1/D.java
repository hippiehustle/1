package T1;

import Z7.InterfaceC0404z;
import Z7.T;
import Z7.d0;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final D f5510a;
    private static final X7.f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.z, T1.D, java.lang.Object] */
    static {
        ?? obj = new Object();
        f5510a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.core.database.entity.IntentExtraEntity", obj, 5);
        t8.l("id", false);
        t8.l("actionId", false);
        t8.l("type", false);
        t8.l("key", false);
        t8.l("value", false);
        descriptor = t8;
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        X7.f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        Z5.g[] gVarArr = F.f5511f;
        int i4 = 0;
        long j5 = 0;
        long j8 = 0;
        G g8 = null;
        String str = null;
        String str2 = null;
        boolean z8 = true;
        while (z8) {
            int n3 = j.n(fVar);
            if (n3 != -1) {
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 != 3) {
                                if (n3 == 4) {
                                    str2 = j.B(fVar, 4);
                                    i4 |= 16;
                                } else {
                                    throw new UnknownFieldException(n3);
                                }
                            } else {
                                str = j.B(fVar, 3);
                                i4 |= 8;
                            }
                        } else {
                            g8 = (G) j.p(fVar, 2, (V7.a) gVarArr[2].getValue(), g8);
                            i4 |= 4;
                        }
                    } else {
                        j8 = j.i(fVar, 1);
                        i4 |= 2;
                    }
                } else {
                    j5 = j.i(fVar, 0);
                    i4 |= 1;
                }
            } else {
                z8 = false;
            }
        }
        j.g(fVar);
        return new F(i4, j5, j8, g8, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        Z5.g[] gVarArr = F.f5511f;
        Z7.L l6 = Z7.L.f7554a;
        d0 d0Var = d0.f7591a;
        return new V7.a[]{l6, l6, gVarArr[2].getValue(), d0Var, d0Var};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        F f8 = (F) obj;
        o6.j.e(f8, "value");
        X7.f fVar = descriptor;
        kotlinx.serialization.json.internal.c a3 = cVar.a(fVar);
        Z5.g[] gVarArr = F.f5511f;
        a3.n(fVar, 0, f8.f5512a);
        a3.n(fVar, 1, f8.f5513b);
        a3.q(fVar, 2, (V7.a) gVarArr[2].getValue(), f8.f5514c);
        a3.u(fVar, 3, f8.f5515d);
        a3.u(fVar, 4, f8.f5516e);
        a3.v(fVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return descriptor;
    }
}
