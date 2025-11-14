package b3;

import n1.AbstractC1149a;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final int f9120a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9121b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9122c;

    public C0530a(int i4, int i8, boolean z8) {
        this.f9120a = i4;
        this.f9121b = i8;
        this.f9122c = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0530a)) {
            return false;
        }
        C0530a c0530a = (C0530a) obj;
        if (this.f9120a == c0530a.f9120a && this.f9121b == c0530a.f9121b && this.f9122c == c0530a.f9122c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9122c) + AbstractC1149a.b(this.f9121b, Integer.hashCode(this.f9120a) * 31, 31);
    }

    public final String toString() {
        return "Completed(successCount=" + this.f9120a + ", failureCount=" + this.f9121b + ", compatWarning=" + this.f9122c + ")";
    }
}
