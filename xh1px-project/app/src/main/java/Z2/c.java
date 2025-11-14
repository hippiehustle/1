package Z2;

import T1.C0316o;
import Z7.Q;
import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f7308a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7309b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7310c;

    /* renamed from: d, reason: collision with root package name */
    public final C0316o f7311d;

    public /* synthetic */ c(int i4, int i8, int i9, int i10, C0316o c0316o) {
        if (15 != (i4 & 15)) {
            Q.f(i4, 15, a.f7307a.d());
            throw null;
        }
        this.f7308a = i8;
        this.f7309b = i9;
        this.f7310c = i10;
        this.f7311d = c0316o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f7308a == cVar.f7308a && this.f7309b == cVar.f7309b && this.f7310c == cVar.f7310c && j.a(this.f7311d, cVar.f7311d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7311d.hashCode() + AbstractC1149a.b(this.f7310c, AbstractC1149a.b(this.f7309b, Integer.hashCode(this.f7308a) * 31, 31), 31);
    }

    public final String toString() {
        return "ScenarioBackup(version=" + this.f7308a + ", screenWidth=" + this.f7309b + ", screenHeight=" + this.f7310c + ", scenario=" + this.f7311d + ")";
    }

    public c(int i4, int i8, int i9, C0316o c0316o) {
        this.f7308a = i4;
        this.f7309b = i8;
        this.f7310c = i9;
        this.f7311d = c0316o;
    }
}
