package X2;

import X7.f;
import Z7.F;
import Z7.InterfaceC0404z;
import Z7.T;
import kotlinx.serialization.UnknownFieldException;
import n2.q;
import n2.s;
import o6.j;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6859a;
    private static final f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.z, X2.b, java.lang.Object] */
    static {
        ?? obj = new Object();
        f6859a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.feature.backup.data.dumb.DumbScenarioBackup", obj, 4);
        t8.l("version", false);
        t8.l("screenWidth", false);
        t8.l("screenHeight", false);
        t8.l("dumbScenario", false);
        descriptor = t8;
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        int i4 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        s sVar = null;
        boolean z8 = true;
        while (z8) {
            int n3 = j.n(fVar);
            if (n3 != -1) {
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 == 3) {
                                sVar = (s) j.p(fVar, 3, q.f12923a, sVar);
                                i4 |= 8;
                            } else {
                                throw new UnknownFieldException(n3);
                            }
                        } else {
                            i10 = j.o(fVar, 2);
                            i4 |= 4;
                        }
                    } else {
                        i9 = j.o(fVar, 1);
                        i4 |= 2;
                    }
                } else {
                    i8 = j.o(fVar, 0);
                    i4 |= 1;
                }
            } else {
                z8 = false;
            }
        }
        j.g(fVar);
        return new d(i4, i8, i9, i10, sVar);
    }

    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        F f8 = F.f7545a;
        return new V7.a[]{f8, f8, f8, q.f12923a};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        d dVar = (d) obj;
        j.e(dVar, "value");
        f fVar = descriptor;
        kotlinx.serialization.json.internal.c a3 = cVar.a(fVar);
        a3.l(0, dVar.f6860a, fVar);
        a3.l(1, dVar.f6861b, fVar);
        a3.l(2, dVar.f6862c, fVar);
        a3.q(fVar, 3, q.f12923a, dVar.f6863d);
        a3.v(fVar);
    }

    @Override // V7.a
    public final f d() {
        return descriptor;
    }
}
