package j2;

import l1.C0999a;
import o6.j;

/* renamed from: j2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0903c extends g {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f11798a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f11799b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11800c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11801d;

    public C0903c(C0999a c0999a, C0999a c0999a2, String str, String str2) {
        j.e(c0999a2, "eventId");
        j.e(str, "name");
        j.e(str2, "intentAction");
        this.f11798a = c0999a;
        this.f11799b = c0999a2;
        this.f11800c = str;
        this.f11801d = str2;
    }

    public static C0903c i(C0903c c0903c, C0999a c0999a, String str, String str2, int i4) {
        C0999a c0999a2 = c0903c.f11798a;
        if ((i4 & 2) != 0) {
            c0999a = c0903c.f11799b;
        }
        if ((i4 & 4) != 0) {
            str = c0903c.f11800c;
        }
        if ((i4 & 8) != 0) {
            str2 = c0903c.f11801d;
        }
        c0903c.getClass();
        j.e(c0999a, "eventId");
        j.e(str, "name");
        j.e(str2, "intentAction");
        return new C0903c(c0999a2, c0999a, str, str2);
    }

    @Override // j2.AbstractC0901a, m1.InterfaceC1051a
    public final boolean d() {
        if (g().length() > 0 && this.f11801d.length() > 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0903c)) {
            return false;
        }
        C0903c c0903c = (C0903c) obj;
        if (j.a(this.f11798a, c0903c.f11798a) && j.a(this.f11799b, c0903c.f11799b) && j.a(this.f11800c, c0903c.f11800c) && j.a(this.f11801d, c0903c.f11801d)) {
            return true;
        }
        return false;
    }

    @Override // j2.AbstractC0901a
    public final C0999a f() {
        return this.f11799b;
    }

    @Override // j2.AbstractC0901a
    public final String g() {
        return this.f11800c;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f11798a;
    }

    @Override // j2.AbstractC0901a
    public final int h() {
        return this.f11801d.hashCode() + super.hashCode();
    }

    public final int hashCode() {
        return this.f11801d.hashCode() + A.j.c(this.f11800c, A.j.d(this.f11799b, this.f11798a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder t8 = A.j.t("OnBroadcastReceived(id=", this.f11798a, ", eventId=", this.f11799b, ", name=");
        t8.append(this.f11800c);
        t8.append(", intentAction=");
        t8.append(this.f11801d);
        t8.append(")");
        return t8.toString();
    }
}
