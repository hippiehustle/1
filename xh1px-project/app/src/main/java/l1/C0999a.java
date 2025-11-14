package l1;

import o6.j;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0999a {

    /* renamed from: a, reason: collision with root package name */
    public final long f12187a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f12188b;

    public C0999a(long j, Long l6) {
        this.f12187a = j;
        this.f12188b = l6;
        if (j == 0 && l6 == null) {
            throw new IllegalArgumentException("DomainId must be set when using db id 0");
        }
        if (j != 0 && l6 != null) {
            throw new IllegalArgumentException("Both ids can't be set");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0999a)) {
            return false;
        }
        C0999a c0999a = (C0999a) obj;
        if (this.f12187a == c0999a.f12187a && j.a(this.f12188b, c0999a.f12188b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.f12187a) * 31;
        Long l6 = this.f12188b;
        if (l6 == null) {
            hashCode = 0;
        } else {
            hashCode = l6.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Identifier(databaseId=" + this.f12187a + ", tempId=" + this.f12188b + ")";
    }

    public C0999a(long j, boolean z8) {
        this(z8 ? 0L : j, z8 ? Long.valueOf(j) : null);
    }
}
