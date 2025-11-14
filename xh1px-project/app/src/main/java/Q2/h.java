package Q2;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f4798a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4799b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4800c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4801d;

    public h(int i4, int i8, int i9, float f8) {
        this.f4798a = i4;
        this.f4799b = i8;
        this.f4800c = i9;
        this.f4801d = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f4798a == hVar.f4798a && this.f4799b == hVar.f4799b && this.f4800c == hVar.f4800c && Float.compare(this.f4801d, hVar.f4801d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4801d) + AbstractC1149a.b(this.f4800c, AbstractC1149a.b(this.f4799b, Integer.hashCode(this.f4798a) * 31, 31), 31);
    }

    public final String toString() {
        return "ImageConditionBriefRendererStyle(backgroundColor=" + this.f4798a + ", selectorColor=" + this.f4799b + ", thicknessPx=" + this.f4800c + ", cornerRadiusPx=" + this.f4801d + ")";
    }
}
