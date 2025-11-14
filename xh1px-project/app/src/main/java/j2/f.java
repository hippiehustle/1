package j2;

import l1.C0999a;
import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f11814a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f11815b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11816c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11817d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11818e;

    public f(C0999a c0999a, C0999a c0999a2, String str, long j, boolean z8) {
        j.e(str, "name");
        this.f11814a = c0999a;
        this.f11815b = c0999a2;
        this.f11816c = str;
        this.f11817d = j;
        this.f11818e = z8;
    }

    public static f i(f fVar, C0999a c0999a, C0999a c0999a2, String str, long j, boolean z8, int i4) {
        if ((i4 & 1) != 0) {
            c0999a = fVar.f11814a;
        }
        C0999a c0999a3 = c0999a;
        if ((i4 & 2) != 0) {
            c0999a2 = fVar.f11815b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i4 & 4) != 0) {
            str = fVar.f11816c;
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            j = fVar.f11817d;
        }
        long j5 = j;
        if ((i4 & 16) != 0) {
            z8 = fVar.f11818e;
        }
        fVar.getClass();
        j.e(str2, "name");
        return new f(c0999a3, c0999a4, str2, j5, z8);
    }

    @Override // j2.AbstractC0901a, m1.InterfaceC1051a
    public final boolean d() {
        if (g().length() > 0 && this.f11817d > 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (j.a(this.f11814a, fVar.f11814a) && j.a(this.f11815b, fVar.f11815b) && j.a(this.f11816c, fVar.f11816c) && this.f11817d == fVar.f11817d && this.f11818e == fVar.f11818e) {
            return true;
        }
        return false;
    }

    @Override // j2.AbstractC0901a
    public final C0999a f() {
        return this.f11815b;
    }

    @Override // j2.AbstractC0901a
    public final String g() {
        return this.f11816c;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f11814a;
    }

    @Override // j2.AbstractC0901a
    public final int h() {
        return Long.hashCode(this.f11817d) + super.hashCode();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11818e) + AbstractC1149a.d(this.f11817d, A.j.c(this.f11816c, A.j.d(this.f11815b, this.f11814a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder t8 = A.j.t("OnTimerReached(id=", this.f11814a, ", eventId=", this.f11815b, ", name=");
        t8.append(this.f11816c);
        t8.append(", durationMs=");
        t8.append(this.f11817d);
        t8.append(", restartWhenReached=");
        t8.append(this.f11818e);
        t8.append(")");
        return t8.toString();
    }
}
