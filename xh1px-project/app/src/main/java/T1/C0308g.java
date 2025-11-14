package T1;

import Z7.InterfaceC0404z;
import Z7.T;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* renamed from: T1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0308g implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final C0308g f5597a;
    private static final X7.f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.g, Z7.z, java.lang.Object] */
    static {
        ?? obj = new Object();
        f5597a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.core.database.entity.CompleteActionEntity", obj, 3);
        t8.l("action", false);
        t8.l("intentExtras", false);
        t8.l("eventsToggle", false);
        descriptor = t8;
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        X7.f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        Z5.g[] gVarArr = C0310i.f5598d;
        C0304c c0304c = null;
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
                    c0304c = (C0304c) j.p(fVar, 0, C0302a.f5546a, c0304c);
                    i4 |= 1;
                }
            } else {
                z8 = false;
            }
        }
        j.g(fVar);
        return new C0310i(i4, c0304c, list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        Z5.g[] gVarArr = C0310i.f5598d;
        return new V7.a[]{C0302a.f5546a, gVarArr[1].getValue(), gVarArr[2].getValue()};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        C0310i c0310i = (C0310i) obj;
        o6.j.e(c0310i, "value");
        X7.f fVar = descriptor;
        kotlinx.serialization.json.internal.c a3 = cVar.a(fVar);
        Z5.g[] gVarArr = C0310i.f5598d;
        a3.q(fVar, 0, C0302a.f5546a, c0310i.f5599a);
        a3.q(fVar, 1, (V7.a) gVarArr[1].getValue(), c0310i.f5600b);
        a3.q(fVar, 2, (V7.a) gVarArr[2].getValue(), c0310i.f5601c);
        a3.v(fVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return descriptor;
    }
}
