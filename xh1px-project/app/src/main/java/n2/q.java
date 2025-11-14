package n2;

import Z7.InterfaceC0404z;
import Z7.T;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final q f12923a;
    private static final X7.f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.z, n2.q, java.lang.Object] */
    static {
        ?? obj = new Object();
        f12923a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.core.dumb.data.database.DumbScenarioWithActions", obj, 3);
        t8.l("scenario", false);
        t8.l("dumbActions", false);
        t8.l("stats", false);
        descriptor = t8;
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        X7.f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        Z5.g[] gVarArr = s.f12924d;
        m mVar = null;
        boolean z8 = true;
        int i4 = 0;
        List list = null;
        p pVar = null;
        while (z8) {
            int n3 = j.n(fVar);
            if (n3 != -1) {
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (n3 == 2) {
                            pVar = (p) j.y(fVar, 2, n.f12918a, pVar);
                            i4 |= 4;
                        } else {
                            throw new UnknownFieldException(n3);
                        }
                    } else {
                        list = (List) j.p(fVar, 1, (V7.a) gVarArr[1].getValue(), list);
                        i4 |= 2;
                    }
                } else {
                    mVar = (m) j.p(fVar, 0, k.f12910a, mVar);
                    i4 |= 1;
                }
            } else {
                z8 = false;
            }
        }
        j.g(fVar);
        return new s(i4, mVar, list, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        return new V7.a[]{k.f12910a, s.f12924d[1].getValue(), AbstractC1492c.t(n.f12918a)};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        s sVar = (s) obj;
        o6.j.e(sVar, "value");
        X7.f fVar = descriptor;
        kotlinx.serialization.json.internal.c a3 = cVar.a(fVar);
        Z5.g[] gVarArr = s.f12924d;
        a3.q(fVar, 0, k.f12910a, sVar.f12925a);
        a3.q(fVar, 1, (V7.a) gVarArr[1].getValue(), sVar.f12926b);
        a3.p(fVar, 2, n.f12918a, sVar.f12927c);
        a3.v(fVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return descriptor;
    }
}
