package n2;

import Z7.InterfaceC0404z;
import Z7.L;
import Z7.T;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final n f12918a;
    private static final X7.f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.z, n2.n, java.lang.Object] */
    static {
        ?? obj = new Object();
        f12918a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.core.dumb.data.database.DumbScenarioStatsEntity", obj, 4);
        t8.l("id", false);
        t8.l("scenarioId", false);
        t8.l("lastStartTimestampMs", false);
        t8.l("startCount", false);
        descriptor = t8;
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        X7.f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        int i4 = 0;
        long j5 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        boolean z8 = true;
        while (z8) {
            int n3 = j.n(fVar);
            if (n3 != -1) {
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 == 3) {
                                j10 = j.i(fVar, 3);
                                i4 |= 8;
                            } else {
                                throw new UnknownFieldException(n3);
                            }
                        } else {
                            j9 = j.i(fVar, 2);
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
        return new p(i4, j5, j8, j9, j10);
    }

    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        L l6 = L.f7554a;
        return new V7.a[]{l6, l6, l6, l6};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        p pVar = (p) obj;
        o6.j.e(pVar, "value");
        X7.f fVar = descriptor;
        kotlinx.serialization.json.internal.c a3 = cVar.a(fVar);
        a3.n(fVar, 0, pVar.f12919a);
        a3.n(fVar, 1, pVar.f12920b);
        a3.n(fVar, 2, pVar.f12921c);
        a3.n(fVar, 3, pVar.f12922d);
        a3.v(fVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return descriptor;
    }
}
