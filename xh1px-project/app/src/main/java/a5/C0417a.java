package a5;

import n1.AbstractC1149a;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417a {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0424h f7730a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7731b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7732c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7733d;

    public C0417a(EnumC0424h enumC0424h, boolean z8, boolean z9, boolean z10) {
        this.f7730a = enumC0424h;
        this.f7731b = z8;
        this.f7732c = z9;
        this.f7733d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0417a)) {
            return false;
        }
        C0417a c0417a = (C0417a) obj;
        if (this.f7730a == c0417a.f7730a && this.f7731b == c0417a.f7731b && this.f7732c == c0417a.f7732c && this.f7733d == c0417a.f7733d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7733d) + AbstractC1149a.c(AbstractC1149a.c(this.f7730a.hashCode() * 31, 31, this.f7731b), 31, this.f7732c);
    }

    public final String toString() {
        return "ScenarioSortConfig(type=" + this.f7730a + ", inverted=" + this.f7731b + ", showSmartScenario=" + this.f7732c + ", showDumbScenario=" + this.f7733d + ")";
    }
}
