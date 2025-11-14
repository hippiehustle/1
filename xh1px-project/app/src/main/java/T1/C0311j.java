package T1;

import Z7.InterfaceC0404z;
import Z7.T;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* renamed from: T1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0311j implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final C0311j f5602a;
    private static final X7.f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.z, java.lang.Object, T1.j] */
    static {
        ?? obj = new Object();
        f5602a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.core.database.entity.CompleteEventEntity", obj, 3);
        t8.l("event", false);
        t8.l("actions", false);
        t8.l("conditions", false);
        descriptor = t8;
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        X7.f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        Z5.g[] gVarArr = C0313l.f5603d;
        x xVar = null;
        boolean z8 = true;
        int i4 = 0;
        List list = null;
        List list2 = null;
        while (z8) {
            int n3 = j.n(fVar);
            if (n3 != -1) {
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (n3 == 2) {
                            list2 = (List) j.p(fVar, 2, (V7.a) gVarArr[2].getValue(), list2);
                            i4 |= 4;
                        } else {
                            throw new UnknownFieldException(n3);
                        }
                    } else {
                        list = (List) j.p(fVar, 1, (V7.a) gVarArr[1].getValue(), list);
                        i4 |= 2;
                    }
                } else {
                    xVar = (x) j.p(fVar, 0, v.f5650a, xVar);
                    i4 |= 1;
                }
            } else {
                z8 = false;
            }
        }
        j.g(fVar);
        return new C0313l(i4, xVar, list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        Z5.g[] gVarArr = C0313l.f5603d;
        return new V7.a[]{v.f5650a, gVarArr[1].getValue(), gVarArr[2].getValue()};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        C0313l c0313l = (C0313l) obj;
        o6.j.e(c0313l, "value");
        X7.f fVar = descriptor;
        kotlinx.serialization.json.internal.c a3 = cVar.a(fVar);
        Z5.g[] gVarArr = C0313l.f5603d;
        a3.q(fVar, 0, v.f5650a, c0313l.f5604a);
        a3.q(fVar, 1, (V7.a) gVarArr[1].getValue(), c0313l.f5605b);
        a3.q(fVar, 2, (V7.a) gVarArr[2].getValue(), c0313l.f5606c);
        a3.v(fVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return descriptor;
    }
}
