package X6;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f6995e = new e(null, false);

    /* renamed from: a, reason: collision with root package name */
    public final h f6996a;

    /* renamed from: b, reason: collision with root package name */
    public final f f6997b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6998c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6999d;

    public e(h hVar, f fVar, boolean z8, boolean z9) {
        this.f6996a = hVar;
        this.f6997b = fVar;
        this.f6998c = z8;
        this.f6999d = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f6996a == eVar.f6996a && this.f6997b == eVar.f6997b && this.f6998c == eVar.f6998c && this.f6999d == eVar.f6999d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        h hVar = this.f6996a;
        if (hVar == null) {
            hashCode = 0;
        } else {
            hashCode = hVar.hashCode();
        }
        int i8 = hashCode * 31;
        f fVar = this.f6997b;
        if (fVar != null) {
            i4 = fVar.hashCode();
        }
        return Boolean.hashCode(this.f6999d) + AbstractC1149a.c((i8 + i4) * 31, 31, this.f6998c);
    }

    public final String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f6996a + ", mutability=" + this.f6997b + ", definitelyNotNull=" + this.f6998c + ", isNullabilityQualifierForWarning=" + this.f6999d + ')';
    }

    public /* synthetic */ e(h hVar, boolean z8) {
        this(hVar, null, z8, false);
    }
}
