package I3;

import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2086a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2087b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2088c;

    public a(Object obj, boolean z8, boolean z9) {
        this.f2086a = obj;
        this.f2087b = z8;
        this.f2088c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.f2086a, aVar.f2086a) && this.f2087b == aVar.f2087b && this.f2088c == aVar.f2088c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f2086a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return Boolean.hashCode(this.f2088c) + AbstractC1149a.c(hashCode * 31, 31, this.f2087b);
    }

    public final String toString() {
        return "EditedElementState(value=" + this.f2086a + ", hasChanged=" + this.f2087b + ", canBeSaved=" + this.f2088c + ")";
    }
}
