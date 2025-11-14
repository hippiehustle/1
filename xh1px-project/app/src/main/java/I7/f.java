package I7;

import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final f f2230d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2231a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2232b;

    /* renamed from: c, reason: collision with root package name */
    public final e f2233c;

    static {
        d dVar = d.f2227a;
        e eVar = e.f2228b;
        f2230d = new f(false, dVar, eVar);
        new f(true, dVar, eVar);
    }

    public f(boolean z8, d dVar, e eVar) {
        o6.j.e(dVar, "bytes");
        o6.j.e(eVar, "number");
        this.f2231a = z8;
        this.f2232b = dVar;
        this.f2233c = eVar;
    }

    public final String toString() {
        StringBuilder a3 = AbstractC1769h.a("HexFormat(\n    upperCase = ");
        a3.append(this.f2231a);
        a3.append(",\n    bytes = BytesHexFormat(\n");
        this.f2232b.a("        ", a3);
        a3.append('\n');
        a3.append("    ),");
        a3.append('\n');
        a3.append("    number = NumberHexFormat(");
        a3.append('\n');
        this.f2233c.a("        ", a3);
        a3.append('\n');
        a3.append("    )");
        a3.append('\n');
        a3.append(")");
        return a3.toString();
    }
}
