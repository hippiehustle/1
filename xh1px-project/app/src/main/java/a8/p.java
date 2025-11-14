package a8;

import P.C;
import Z7.X;
import Z7.Y;
import Z7.m0;
import b6.C0536d;
import b6.C0540h;
import n1.AbstractC1149a;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class p implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p f8295a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X f8296b;

    /* JADX WARN: Type inference failed for: r0v0, types: [a8.p, java.lang.Object] */
    static {
        X7.d dVar = X7.d.f7061m;
        if (!I7.m.j0("kotlinx.serialization.json.JsonLiteral")) {
            Object it = ((C0540h) Y.f7579a.values()).iterator();
            while (((C) it).hasNext()) {
                V7.a aVar = (V7.a) ((C0536d) it).next();
                if ("kotlinx.serialization.json.JsonLiteral".equals(aVar.d().b())) {
                    throw new IllegalArgumentException(I7.o.Q("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + o6.v.f13643a.b(aVar.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                }
            }
            f8296b = new X("kotlinx.serialization.json.JsonLiteral", dVar);
            return;
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        j s8 = AbstractC1492c.c(bVar).s();
        if (s8 instanceof o) {
            return (o) s8;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw b8.j.d(-1, AbstractC1149a.i(o6.v.f13643a, s8.getClass(), sb), s8.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // V7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        Double d2;
        o oVar = (o) obj;
        o6.j.e(oVar, "value");
        String str = oVar.f8294e;
        AbstractC1492c.a(cVar);
        if (oVar.f8293d) {
            cVar.t(str);
            return;
        }
        Long V6 = I7.u.V(str);
        if (V6 != null) {
            cVar.m(V6.longValue());
            return;
        }
        Z5.t Q5 = E2.b.Q(str);
        if (Q5 != null) {
            cVar.i(m0.f7620b).m(Q5.f7501d);
            return;
        }
        Boolean bool = null;
        if (I7.t.S(str)) {
            d2 = Double.valueOf(Double.parseDouble(str));
            if (d2 == null) {
                cVar.f(d2.doubleValue());
                return;
            }
            if (str.equals("true")) {
                bool = Boolean.TRUE;
            } else if (str.equals("false")) {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                cVar.b(bool.booleanValue());
                return;
            } else {
                cVar.t(str);
                return;
            }
        }
        d2 = null;
        if (d2 == null) {
        }
    }

    @Override // V7.a
    public final X7.f d() {
        return f8296b;
    }
}
