package a8;

import a6.AbstractC0434i;
import kotlin.NoWhenBranchMatchedException;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class l implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l f8290a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X7.g f8291b;

    /* JADX WARN: Type inference failed for: r0v0, types: [a8.l, java.lang.Object] */
    static {
        X7.f[] fVarArr = new X7.f[0];
        H7.o oVar = new H7.o(18);
        o6.j.e("kotlinx.serialization.json.JsonElement", "serialName");
        if (!I7.m.j0("kotlinx.serialization.json.JsonElement")) {
            X7.i iVar = X7.i.f7073e;
            X7.c cVar = X7.c.f7054e;
            if (!cVar.equals(iVar)) {
                X7.a aVar = new X7.a("kotlinx.serialization.json.JsonElement");
                oVar.m(aVar);
                f8291b = new X7.g("kotlinx.serialization.json.JsonElement", cVar, aVar.f7049b.size(), AbstractC0434i.i1(fVarArr), aVar);
                return;
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        return AbstractC1492c.c(bVar).s();
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        j jVar = (j) obj;
        o6.j.e(jVar, "value");
        AbstractC1492c.a(cVar);
        if (jVar instanceof y) {
            cVar.r(z.f8305a, jVar);
        } else if (jVar instanceof u) {
            cVar.r(w.f8303a, jVar);
        } else {
            if (jVar instanceof d) {
                cVar.r(f.f8287a, jVar);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // V7.a
    public final X7.f d() {
        return f8291b;
    }
}
