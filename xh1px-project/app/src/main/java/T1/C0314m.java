package T1;

import Z7.InterfaceC0404z;
import Z7.T;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* renamed from: T1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0314m implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final C0314m f5607a;
    private static final X7.f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.z, java.lang.Object, T1.m] */
    static {
        ?? obj = new Object();
        f5607a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.core.database.entity.CompleteScenario", obj, 2);
        t8.l("scenario", false);
        t8.l("events", false);
        descriptor = t8;
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        X7.f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        Z5.g[] gVarArr = C0316o.f5608c;
        K k = null;
        boolean z8 = true;
        int i4 = 0;
        List list = null;
        while (z8) {
            int n3 = j.n(fVar);
            if (n3 != -1) {
                if (n3 != 0) {
                    if (n3 == 1) {
                        list = (List) j.p(fVar, 1, (V7.a) gVarArr[1].getValue(), list);
                        i4 |= 2;
                    } else {
                        throw new UnknownFieldException(n3);
                    }
                } else {
                    k = (K) j.p(fVar, 0, I.f5527a, k);
                    i4 |= 1;
                }
            } else {
                z8 = false;
            }
        }
        j.g(fVar);
        return new C0316o(i4, k, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        return new V7.a[]{I.f5527a, C0316o.f5608c[1].getValue()};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        C0316o c0316o = (C0316o) obj;
        o6.j.e(c0316o, "value");
        X7.f fVar = descriptor;
        kotlinx.serialization.json.internal.c a3 = cVar.a(fVar);
        Z5.g[] gVarArr = C0316o.f5608c;
        a3.q(fVar, 0, I.f5527a, c0316o.f5609a);
        a3.q(fVar, 1, (V7.a) gVarArr[1].getValue(), c0316o.f5610b);
        a3.v(fVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return descriptor;
    }
}
