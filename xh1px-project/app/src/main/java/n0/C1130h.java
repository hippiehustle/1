package n0;

/* renamed from: n0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1130h {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1117G f12754a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12755b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12756c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12757d;

    public C1130h(AbstractC1117G abstractC1117G, boolean z8, Object obj, boolean z9) {
        if (!abstractC1117G.f12737a && z8) {
            throw new IllegalArgumentException(abstractC1117G.b().concat(" does not allow nullable values").toString());
        }
        if (!z8 && z9 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + abstractC1117G.b() + " has null value but is not nullable.").toString());
        }
        this.f12754a = abstractC1117G;
        this.f12755b = z8;
        this.f12757d = obj;
        this.f12756c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1130h.class == obj.getClass()) {
            C1130h c1130h = (C1130h) obj;
            Object obj2 = c1130h.f12757d;
            if (this.f12755b != c1130h.f12755b || this.f12756c != c1130h.f12756c || !o6.j.a(this.f12754a, c1130h.f12754a)) {
                return false;
            }
            Object obj3 = this.f12757d;
            if (obj3 != null) {
                return o6.j.a(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = ((((this.f12754a.hashCode() * 31) + (this.f12755b ? 1 : 0)) * 31) + (this.f12756c ? 1 : 0)) * 31;
        Object obj = this.f12757d;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(o6.v.f13643a.b(C1130h.class).c());
        sb.append(" Type: " + this.f12754a);
        sb.append(" Nullable: " + this.f12755b);
        if (this.f12756c) {
            sb.append(" DefaultValue: " + this.f12757d);
        }
        String sb2 = sb.toString();
        o6.j.d(sb2, "toString(...)");
        return sb2;
    }
}
