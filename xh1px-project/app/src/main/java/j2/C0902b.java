package j2;

import android.graphics.Rect;
import l1.C0999a;
import m1.InterfaceC1054d;
import n1.AbstractC1149a;
import o6.j;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902b extends AbstractC0901a implements InterfaceC1054d {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f11789a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f11790b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11791c;

    /* renamed from: d, reason: collision with root package name */
    public int f11792d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11793e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f11794f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11795g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11796h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11797i;
    public final Rect j;

    public C0902b(C0999a c0999a, C0999a c0999a2, String str, int i4, String str2, Rect rect, int i8, int i9, boolean z8, Rect rect2) {
        j.e(c0999a, "id");
        j.e(str, "name");
        j.e(str2, "path");
        j.e(rect, "area");
        this.f11789a = c0999a;
        this.f11790b = c0999a2;
        this.f11791c = str;
        this.f11792d = i4;
        this.f11793e = str2;
        this.f11794f = rect;
        this.f11795g = i8;
        this.f11796h = i9;
        this.f11797i = z8;
        this.j = rect2;
    }

    public static C0902b i(C0902b c0902b, C0999a c0999a, C0999a c0999a2, String str, int i4, String str2, int i8, int i9, boolean z8, Rect rect, int i10) {
        String str3;
        int i11;
        int i12;
        boolean z9;
        Rect rect2;
        if ((i10 & 1) != 0) {
            c0999a = c0902b.f11789a;
        }
        C0999a c0999a3 = c0999a;
        if ((i10 & 2) != 0) {
            c0999a2 = c0902b.f11790b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i10 & 4) != 0) {
            str = c0902b.f11791c;
        }
        String str4 = str;
        if ((i10 & 8) != 0) {
            i4 = c0902b.f11792d;
        }
        int i13 = i4;
        if ((i10 & 16) != 0) {
            str3 = c0902b.f11793e;
        } else {
            str3 = str2;
        }
        Rect rect3 = c0902b.f11794f;
        if ((i10 & 64) != 0) {
            i11 = c0902b.f11795g;
        } else {
            i11 = i8;
        }
        if ((i10 & 128) != 0) {
            i12 = c0902b.f11796h;
        } else {
            i12 = i9;
        }
        if ((i10 & 256) != 0) {
            z9 = c0902b.f11797i;
        } else {
            z9 = z8;
        }
        if ((i10 & 512) != 0) {
            rect2 = c0902b.j;
        } else {
            rect2 = rect;
        }
        c0902b.getClass();
        j.e(c0999a3, "id");
        j.e(str4, "name");
        j.e(str3, "path");
        j.e(rect3, "area");
        return new C0902b(c0999a3, c0999a4, str4, i13, str3, rect3, i11, i12, z9, rect2);
    }

    @Override // m1.InterfaceC1054d
    public final int b() {
        return this.f11792d;
    }

    @Override // j2.AbstractC0901a, m1.InterfaceC1051a
    public final boolean d() {
        if (g().length() > 0) {
            int i4 = this.f11796h;
            if ((i4 == 3 && this.j != null) || i4 != 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // m1.InterfaceC1054d
    public final void e(int i4) {
        this.f11792d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0902b)) {
            return false;
        }
        C0902b c0902b = (C0902b) obj;
        if (j.a(this.f11789a, c0902b.f11789a) && j.a(this.f11790b, c0902b.f11790b) && j.a(this.f11791c, c0902b.f11791c) && this.f11792d == c0902b.f11792d && j.a(this.f11793e, c0902b.f11793e) && j.a(this.f11794f, c0902b.f11794f) && this.f11795g == c0902b.f11795g && this.f11796h == c0902b.f11796h && this.f11797i == c0902b.f11797i && j.a(this.j, c0902b.j)) {
            return true;
        }
        return false;
    }

    @Override // j2.AbstractC0901a
    public final C0999a f() {
        return this.f11790b;
    }

    @Override // j2.AbstractC0901a
    public final String g() {
        return this.f11791c;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f11789a;
    }

    @Override // j2.AbstractC0901a
    public final int h() {
        int i4;
        int hashCode = Boolean.hashCode(this.f11797i) + Integer.hashCode(this.f11796h) + Integer.hashCode(this.f11795g) + this.f11794f.hashCode() + this.f11793e.hashCode() + this.f11791c.hashCode();
        Rect rect = this.j;
        if (rect != null) {
            i4 = rect.hashCode();
        } else {
            i4 = 0;
        }
        return Integer.hashCode(this.f11792d) + hashCode + i4;
    }

    public final int hashCode() {
        int hashCode;
        int c6 = AbstractC1149a.c(AbstractC1149a.b(this.f11796h, AbstractC1149a.b(this.f11795g, (this.f11794f.hashCode() + A.j.c(this.f11793e, AbstractC1149a.b(this.f11792d, A.j.c(this.f11791c, A.j.d(this.f11790b, this.f11789a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31), 31), 31, this.f11797i);
        Rect rect = this.j;
        if (rect == null) {
            hashCode = 0;
        } else {
            hashCode = rect.hashCode();
        }
        return c6 + hashCode;
    }

    public final String toString() {
        int i4 = this.f11792d;
        StringBuilder t8 = A.j.t("ImageCondition(id=", this.f11789a, ", eventId=", this.f11790b, ", name=");
        t8.append(this.f11791c);
        t8.append(", priority=");
        t8.append(i4);
        t8.append(", path=");
        t8.append(this.f11793e);
        t8.append(", area=");
        t8.append(this.f11794f);
        t8.append(", threshold=");
        t8.append(this.f11795g);
        t8.append(", detectionType=");
        t8.append(this.f11796h);
        t8.append(", shouldBeDetected=");
        t8.append(this.f11797i);
        t8.append(", detectionArea=");
        t8.append(this.j);
        t8.append(")");
        return t8.toString();
    }
}
