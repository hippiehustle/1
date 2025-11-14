package X2;

import Z7.Q;
import n1.AbstractC1149a;
import n2.s;
import o6.j;

/* loaded from: classes.dex */
public final class d {
    public static final c Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f6860a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6861b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6862c;

    /* renamed from: d, reason: collision with root package name */
    public final s f6863d;

    public /* synthetic */ d(int i4, int i8, int i9, int i10, s sVar) {
        if (15 != (i4 & 15)) {
            Q.f(i4, 15, b.f6859a.d());
            throw null;
        }
        this.f6860a = i8;
        this.f6861b = i9;
        this.f6862c = i10;
        this.f6863d = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f6860a == dVar.f6860a && this.f6861b == dVar.f6861b && this.f6862c == dVar.f6862c && j.a(this.f6863d, dVar.f6863d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6863d.hashCode() + AbstractC1149a.b(this.f6862c, AbstractC1149a.b(this.f6861b, Integer.hashCode(this.f6860a) * 31, 31), 31);
    }

    public final String toString() {
        return "DumbScenarioBackup(version=" + this.f6860a + ", screenWidth=" + this.f6861b + ", screenHeight=" + this.f6862c + ", dumbScenario=" + this.f6863d + ")";
    }

    public d(int i4, int i8, int i9, s sVar) {
        this.f6860a = i4;
        this.f6861b = i8;
        this.f6862c = i9;
        this.f6863d = sVar;
    }
}
