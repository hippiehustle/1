package f2;

import l1.C0999a;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f10724a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f10725b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10726c;

    /* renamed from: d, reason: collision with root package name */
    public int f10727d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10728e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10729f;

    public j(C0999a c0999a, C0999a c0999a2, String str, int i4, String str2, boolean z8) {
        this.f10724a = c0999a;
        this.f10725b = c0999a2;
        this.f10726c = str;
        this.f10727d = i4;
        this.f10728e = str2;
        this.f10729f = z8;
    }

    public static j i(j jVar, C0999a c0999a, C0999a c0999a2, String str, int i4, String str2, boolean z8, int i8) {
        if ((i8 & 1) != 0) {
            c0999a = jVar.f10724a;
        }
        C0999a c0999a3 = c0999a;
        if ((i8 & 2) != 0) {
            c0999a2 = jVar.f10725b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i8 & 4) != 0) {
            str = jVar.f10726c;
        }
        String str3 = str;
        if ((i8 & 8) != 0) {
            i4 = jVar.f10727d;
        }
        int i9 = i4;
        if ((i8 & 16) != 0) {
            str2 = jVar.f10728e;
        }
        String str4 = str2;
        if ((i8 & 32) != 0) {
            z8 = jVar.f10729f;
        }
        jVar.getClass();
        o6.j.e(str4, "text");
        return new j(c0999a3, c0999a4, str3, i9, str4, z8);
    }

    @Override // m1.InterfaceC1054d
    public final int b() {
        return this.f10727d;
    }

    @Override // m1.InterfaceC1054d
    public final void e(int i4) {
        this.f10727d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (o6.j.a(this.f10724a, jVar.f10724a) && o6.j.a(this.f10725b, jVar.f10725b) && o6.j.a(this.f10726c, jVar.f10726c) && this.f10727d == jVar.f10727d && o6.j.a(this.f10728e, jVar.f10728e) && this.f10729f == jVar.f10729f) {
            return true;
        }
        return false;
    }

    @Override // f2.a
    public final C0999a f() {
        return this.f10725b;
    }

    @Override // f2.a
    public final String g() {
        return this.f10726c;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f10724a;
    }

    @Override // f2.a
    public final int h() {
        int i4;
        String str = this.f10726c;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return Boolean.hashCode(this.f10729f) + this.f10728e.hashCode() + i4;
    }

    public final int hashCode() {
        int hashCode;
        int d2 = A.j.d(this.f10725b, this.f10724a.hashCode() * 31, 31);
        String str = this.f10726c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.f10729f) + A.j.c(this.f10728e, AbstractC1149a.b(this.f10727d, (d2 + hashCode) * 31, 31), 31);
    }

    public final String toString() {
        int i4 = this.f10727d;
        StringBuilder t8 = A.j.t("SetText(id=", this.f10724a, ", eventId=", this.f10725b, ", name=");
        t8.append(this.f10726c);
        t8.append(", priority=");
        t8.append(i4);
        t8.append(", text=");
        t8.append(this.f10728e);
        t8.append(", validateInput=");
        t8.append(this.f10729f);
        t8.append(")");
        return t8.toString();
    }
}
