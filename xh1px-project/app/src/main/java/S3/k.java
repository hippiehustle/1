package S3;

import e1.C0637a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final C0637a f5353a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5354b;

    public k(C0637a c0637a, boolean z8) {
        this.f5353a = c0637a;
        this.f5354b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (o6.j.a(this.f5353a, kVar.f5353a) && this.f5354b == kVar.f5354b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5354b) + (this.f5353a.hashCode() * 31);
    }

    public final String toString() {
        return "ItemFlag(flag=" + this.f5353a + ", isSelected=" + this.f5354b + ")";
    }
}
