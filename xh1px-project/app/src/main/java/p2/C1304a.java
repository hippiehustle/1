package p2;

import android.graphics.Point;
import l1.C0999a;
import n1.AbstractC1149a;
import o6.j;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1304a extends d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f13676a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f13677b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13678c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13679d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13680e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13681f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13682g;

    /* renamed from: h, reason: collision with root package name */
    public final Point f13683h;

    /* renamed from: i, reason: collision with root package name */
    public final long f13684i;

    public C1304a(C0999a c0999a, C0999a c0999a2, String str, int i4, int i8, boolean z8, long j, Point point, long j5) {
        j.e(str, "name");
        j.e(point, "position");
        this.f13676a = c0999a;
        this.f13677b = c0999a2;
        this.f13678c = str;
        this.f13679d = i4;
        this.f13680e = i8;
        this.f13681f = z8;
        this.f13682g = j;
        this.f13683h = point;
        this.f13684i = j5;
    }

    public static C1304a i(C1304a c1304a, C0999a c0999a, C0999a c0999a2, String str, int i4, int i8, boolean z8, long j, Point point, long j5, int i9) {
        String str2;
        int i10;
        int i11;
        boolean z9;
        long j8;
        Point point2;
        long j9;
        if ((i9 & 1) != 0) {
            c0999a = c1304a.f13676a;
        }
        C0999a c0999a3 = c0999a;
        if ((i9 & 2) != 0) {
            c0999a2 = c1304a.f13677b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i9 & 4) != 0) {
            str2 = c1304a.f13678c;
        } else {
            str2 = str;
        }
        if ((i9 & 8) != 0) {
            i10 = c1304a.f13679d;
        } else {
            i10 = i4;
        }
        if ((i9 & 16) != 0) {
            i11 = c1304a.f13680e;
        } else {
            i11 = i8;
        }
        if ((i9 & 32) != 0) {
            z9 = c1304a.f13681f;
        } else {
            z9 = z8;
        }
        if ((i9 & 64) != 0) {
            j8 = c1304a.f13682g;
        } else {
            j8 = j;
        }
        if ((i9 & 128) != 0) {
            point2 = c1304a.f13683h;
        } else {
            point2 = point;
        }
        if ((i9 & 256) != 0) {
            j9 = c1304a.f13684i;
        } else {
            j9 = j5;
        }
        c1304a.getClass();
        j.e(str2, "name");
        j.e(point2, "position");
        return new C1304a(c0999a3, c0999a4, str2, i10, i11, z9, j8, point2, j9);
    }

    @Override // p2.f
    public final boolean b() {
        return this.f13681f;
    }

    @Override // p2.f
    public final int e() {
        return this.f13680e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1304a)) {
            return false;
        }
        C1304a c1304a = (C1304a) obj;
        if (j.a(this.f13676a, c1304a.f13676a) && j.a(this.f13677b, c1304a.f13677b) && j.a(this.f13678c, c1304a.f13678c) && this.f13679d == c1304a.f13679d && this.f13680e == c1304a.f13680e && this.f13681f == c1304a.f13681f && this.f13682g == c1304a.f13682g && j.a(this.f13683h, c1304a.f13683h) && this.f13684i == c1304a.f13684i) {
            return true;
        }
        return false;
    }

    @Override // p2.g
    public final long f() {
        return this.f13682g;
    }

    @Override // p2.d
    public final C0999a g() {
        return this.f13677b;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f13676a;
    }

    @Override // p2.d
    public final boolean h() {
        if (this.f13678c.length() > 0 && this.f13684i > 0 && e() > 0 && super.d()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13684i) + ((this.f13683h.hashCode() + AbstractC1149a.d(this.f13682g, AbstractC1149a.c(AbstractC1149a.b(this.f13680e, AbstractC1149a.b(this.f13679d, A.j.c(this.f13678c, A.j.d(this.f13677b, this.f13676a.hashCode() * 31, 31), 31), 31), 31), 31, this.f13681f), 31)) * 31);
    }

    public final String toString() {
        StringBuilder t8 = A.j.t("DumbClick(id=", this.f13676a, ", scenarioId=", this.f13677b, ", name=");
        t8.append(this.f13678c);
        t8.append(", priority=");
        t8.append(this.f13679d);
        t8.append(", repeatCount=");
        t8.append(this.f13680e);
        t8.append(", isRepeatInfinite=");
        t8.append(this.f13681f);
        t8.append(", repeatDelayMs=");
        t8.append(this.f13682g);
        t8.append(", position=");
        t8.append(this.f13683h);
        t8.append(", pressDurationMs=");
        t8.append(this.f13684i);
        t8.append(")");
        return t8.toString();
    }
}
