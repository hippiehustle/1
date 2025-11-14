package T1;

import Z7.C0385f;
import Z7.InterfaceC0404z;
import Z7.T;
import Z7.d0;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final /* synthetic */ class I implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final I f5527a;
    private static final X7.f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.z, java.lang.Object, T1.I] */
    static {
        ?? obj = new Object();
        f5527a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.core.database.entity.ScenarioEntity", obj, 5);
        t8.l("id", false);
        t8.l("name", false);
        t8.l("detectionQuality", false);
        t8.l("randomize", true);
        t8.l("keepScreenOn", true);
        descriptor = t8;
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        X7.f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        int i4 = 0;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        long j5 = 0;
        String str = null;
        boolean z10 = true;
        while (z10) {
            int n3 = j.n(fVar);
            if (n3 != -1) {
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 != 3) {
                                if (n3 == 4) {
                                    z9 = j.k(fVar, 4);
                                    i4 |= 16;
                                } else {
                                    throw new UnknownFieldException(n3);
                                }
                            } else {
                                z8 = j.k(fVar, 3);
                                i4 |= 8;
                            }
                        } else {
                            i8 = j.o(fVar, 2);
                            i4 |= 4;
                        }
                    } else {
                        str = j.B(fVar, 1);
                        i4 |= 2;
                    }
                } else {
                    j5 = j.i(fVar, 0);
                    i4 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        j.g(fVar);
        return new K(i4, j5, str, i8, z8, z9);
    }

    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        C0385f c0385f = C0385f.f7596a;
        return new V7.a[]{Z7.L.f7554a, d0.f7591a, Z7.F.f7545a, c0385f, c0385f};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        K k = (K) obj;
        o6.j.e(k, "value");
        X7.f fVar = descriptor;
        kotlinx.serialization.json.internal.c a3 = cVar.a(fVar);
        long j = k.f5528a;
        boolean z8 = k.f5532e;
        boolean z9 = k.f5531d;
        a3.n(fVar, 0, j);
        a3.u(fVar, 1, k.f5529b);
        a3.l(2, k.f5530c, fVar);
        if (a3.w(fVar) || z9) {
            a3.c(fVar, 3, z9);
        }
        if (a3.w(fVar) || z8) {
            a3.c(fVar, 4, z8);
        }
        a3.v(fVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return descriptor;
    }
}
