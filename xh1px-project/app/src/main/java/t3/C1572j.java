package t3;

import n1.AbstractC1149a;

/* renamed from: t3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1572j {

    /* renamed from: a, reason: collision with root package name */
    public final String f15057a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15058b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15059c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15060d;

    public C1572j(String str, boolean z8, boolean z9, boolean z10) {
        this.f15057a = str;
        this.f15058b = z8;
        this.f15059c = z9;
        this.f15060d = z10;
    }

    public static C1572j a(C1572j c1572j, boolean z8, boolean z9, boolean z10, int i4) {
        String str = c1572j.f15057a;
        if ((i4 & 2) != 0) {
            z8 = c1572j.f15058b;
        }
        if ((i4 & 4) != 0) {
            z9 = c1572j.f15059c;
        }
        if ((i4 & 8) != 0) {
            z10 = c1572j.f15060d;
        }
        c1572j.getClass();
        return new C1572j(str, z8, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1572j)) {
            return false;
        }
        C1572j c1572j = (C1572j) obj;
        if (o6.j.a(this.f15057a, c1572j.f15057a) && this.f15058b == c1572j.f15058b && this.f15059c == c1572j.f15059c && this.f15060d == c1572j.f15060d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15060d) + AbstractC1149a.c(AbstractC1149a.c(this.f15057a.hashCode() * 31, 31, this.f15058b), 31, this.f15059c);
    }

    public final String toString() {
        return "ServiceNotificationState(scenarioName=" + this.f15057a + ", isScenarioRunning=" + this.f15058b + ", isMenuVisible=" + this.f15059c + ", isNightMode=" + this.f15060d + ")";
    }
}
