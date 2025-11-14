package M4;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3484a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3485b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3486c;

    public c(int i4, int i8, boolean z8) {
        this.f3484a = i4;
        this.f3485b = i8;
        this.f3486c = z8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f3484a != cVar.f3484a || this.f3485b != cVar.f3485b || this.f3486c != cVar.f3486c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3486c) + AbstractC1149a.b(this.f3485b, Integer.hashCode(this.f3484a) * 31, 31);
    }

    public final String toString() {
        return "Tutorial(nameResId=" + this.f3484a + ", descResId=" + this.f3485b + ", isUnlocked=" + this.f3486c + ")";
    }
}
