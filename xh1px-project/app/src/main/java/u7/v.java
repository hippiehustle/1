package u7;

import java.util.List;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15461a;

    /* renamed from: b, reason: collision with root package name */
    public final List f15462b = a6.s.f7766d;

    public v(boolean z8) {
        this.f15461a = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f15461a == vVar.f15461a && o6.j.a(this.f15462b, vVar.f15462b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15462b.hashCode() + (Boolean.hashCode(this.f15461a) * 31);
    }

    public final String toString() {
        return "PreReleaseInfo(isInvisible=" + this.f15461a + ", poisoningFeatures=" + this.f15462b + ')';
    }
}
