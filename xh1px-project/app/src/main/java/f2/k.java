package f2;

import android.graphics.Point;
import l1.C0999a;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f10730a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f10731b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10732c;

    /* renamed from: d, reason: collision with root package name */
    public int f10733d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f10734e;

    /* renamed from: f, reason: collision with root package name */
    public final Point f10735f;

    /* renamed from: g, reason: collision with root package name */
    public final Point f10736g;

    public k(C0999a c0999a, C0999a c0999a2, String str, int i4, Long l6, Point point, Point point2) {
        this.f10730a = c0999a;
        this.f10731b = c0999a2;
        this.f10732c = str;
        this.f10733d = i4;
        this.f10734e = l6;
        this.f10735f = point;
        this.f10736g = point2;
    }

    public static k i(k kVar, C0999a c0999a, C0999a c0999a2, String str, int i4, Long l6, Point point, Point point2, int i8) {
        if ((i8 & 1) != 0) {
            c0999a = kVar.f10730a;
        }
        C0999a c0999a3 = c0999a;
        if ((i8 & 2) != 0) {
            c0999a2 = kVar.f10731b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i8 & 4) != 0) {
            str = kVar.f10732c;
        }
        String str2 = str;
        if ((i8 & 8) != 0) {
            i4 = kVar.f10733d;
        }
        int i9 = i4;
        if ((i8 & 16) != 0) {
            l6 = kVar.f10734e;
        }
        Long l8 = l6;
        if ((i8 & 32) != 0) {
            point = kVar.f10735f;
        }
        Point point3 = point;
        if ((i8 & 64) != 0) {
            point2 = kVar.f10736g;
        }
        kVar.getClass();
        return new k(c0999a3, c0999a4, str2, i9, l8, point3, point2);
    }

    @Override // m1.InterfaceC1054d
    public final int b() {
        return this.f10733d;
    }

    @Override // f2.a, m1.InterfaceC1051a
    public final boolean d() {
        if (super.d() && this.f10734e != null && this.f10735f != null && this.f10736g != null) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1054d
    public final void e(int i4) {
        this.f10733d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (o6.j.a(this.f10730a, kVar.f10730a) && o6.j.a(this.f10731b, kVar.f10731b) && o6.j.a(this.f10732c, kVar.f10732c) && this.f10733d == kVar.f10733d && o6.j.a(this.f10734e, kVar.f10734e) && o6.j.a(this.f10735f, kVar.f10735f) && o6.j.a(this.f10736g, kVar.f10736g)) {
            return true;
        }
        return false;
    }

    @Override // f2.a
    public final C0999a f() {
        return this.f10731b;
    }

    @Override // f2.a
    public final String g() {
        return this.f10732c;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f10730a;
    }

    @Override // f2.a
    public final int h() {
        int i4;
        int i8;
        int i9;
        int i10 = 0;
        String str = this.f10732c;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        Long l6 = this.f10734e;
        if (l6 != null) {
            i8 = l6.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = i4 + i8;
        Point point = this.f10735f;
        if (point != null) {
            i9 = point.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = i11 + i9;
        Point point2 = this.f10736g;
        if (point2 != null) {
            i10 = point2.hashCode();
        }
        return i12 + i10;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int d2 = A.j.d(this.f10731b, this.f10730a.hashCode() * 31, 31);
        int i4 = 0;
        String str = this.f10732c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b4 = AbstractC1149a.b(this.f10733d, (d2 + hashCode) * 31, 31);
        Long l6 = this.f10734e;
        if (l6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l6.hashCode();
        }
        int i8 = (b4 + hashCode2) * 31;
        Point point = this.f10735f;
        if (point == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = point.hashCode();
        }
        int i9 = (i8 + hashCode3) * 31;
        Point point2 = this.f10736g;
        if (point2 != null) {
            i4 = point2.hashCode();
        }
        return i9 + i4;
    }

    public final String toString() {
        int i4 = this.f10733d;
        StringBuilder t8 = A.j.t("Swipe(id=", this.f10730a, ", eventId=", this.f10731b, ", name=");
        t8.append(this.f10732c);
        t8.append(", priority=");
        t8.append(i4);
        t8.append(", swipeDuration=");
        t8.append(this.f10734e);
        t8.append(", from=");
        t8.append(this.f10735f);
        t8.append(", to=");
        t8.append(this.f10736g);
        t8.append(")");
        return t8.toString();
    }
}
