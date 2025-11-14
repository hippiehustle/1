package T1;

import Z7.InterfaceC0404z;
import Z7.T;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final y f5660a;
    private static final X7.f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.z, java.lang.Object, T1.y] */
    static {
        ?? obj = new Object();
        f5660a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.core.database.entity.EventToggleEntity", obj, 4);
        t8.l("id", false);
        t8.l("actionId", false);
        t8.l("type", false);
        t8.l("toggleEventId", false);
        descriptor = t8;
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        X7.f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        Z5.g[] gVarArr = A.f5498e;
        int i4 = 0;
        long j5 = 0;
        long j8 = 0;
        long j9 = 0;
        B b4 = null;
        boolean z8 = true;
        while (z8) {
            int n3 = j.n(fVar);
            if (n3 != -1) {
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 == 3) {
                                j9 = j.i(fVar, 3);
                                i4 |= 8;
                            } else {
                                throw new UnknownFieldException(n3);
                            }
                        } else {
                            b4 = (B) j.p(fVar, 2, (V7.a) gVarArr[2].getValue(), b4);
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
        return new A(i4, j5, j8, b4, j9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        Z5.g[] gVarArr = A.f5498e;
        Z7.L l6 = Z7.L.f7554a;
        return new V7.a[]{l6, l6, gVarArr[2].getValue(), l6};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        A a3 = (A) obj;
        o6.j.e(a3, "value");
        X7.f fVar = descriptor;
        kotlinx.serialization.json.internal.c a4 = cVar.a(fVar);
        Z5.g[] gVarArr = A.f5498e;
        a4.n(fVar, 0, a3.f5499a);
        a4.n(fVar, 1, a3.f5500b);
        a4.q(fVar, 2, (V7.a) gVarArr[2].getValue(), a3.f5501c);
        a4.n(fVar, 3, a3.f5502d);
        a4.v(fVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return descriptor;
    }
}
