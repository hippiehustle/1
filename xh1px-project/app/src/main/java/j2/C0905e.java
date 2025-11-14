package j2;

import e2.AbstractC0640c;
import l1.C0999a;
import n1.AbstractC1149a;
import o6.j;

/* renamed from: j2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905e extends g {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f11808a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f11809b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11810c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11811d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC0904d f11812e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0640c f11813f;

    public C0905e(C0999a c0999a, C0999a c0999a2, String str, String str2, EnumC0904d enumC0904d, AbstractC0640c abstractC0640c) {
        j.e(str, "name");
        j.e(str2, "counterName");
        j.e(enumC0904d, "comparisonOperation");
        this.f11808a = c0999a;
        this.f11809b = c0999a2;
        this.f11810c = str;
        this.f11811d = str2;
        this.f11812e = enumC0904d;
        this.f11813f = abstractC0640c;
    }

    public static C0905e i(C0905e c0905e, C0999a c0999a, C0999a c0999a2, String str, String str2, EnumC0904d enumC0904d, AbstractC0640c abstractC0640c, int i4) {
        if ((i4 & 1) != 0) {
            c0999a = c0905e.f11808a;
        }
        C0999a c0999a3 = c0999a;
        if ((i4 & 2) != 0) {
            c0999a2 = c0905e.f11809b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i4 & 4) != 0) {
            str = c0905e.f11810c;
        }
        String str3 = str;
        if ((i4 & 8) != 0) {
            str2 = c0905e.f11811d;
        }
        String str4 = str2;
        if ((i4 & 16) != 0) {
            enumC0904d = c0905e.f11812e;
        }
        EnumC0904d enumC0904d2 = enumC0904d;
        if ((i4 & 32) != 0) {
            abstractC0640c = c0905e.f11813f;
        }
        c0905e.getClass();
        j.e(str3, "name");
        j.e(str4, "counterName");
        j.e(enumC0904d2, "comparisonOperation");
        return new C0905e(c0999a3, c0999a4, str3, str4, enumC0904d2, abstractC0640c);
    }

    @Override // j2.AbstractC0901a, m1.InterfaceC1051a
    public final boolean d() {
        if (g().length() > 0 && this.f11811d.length() > 0 && this.f11813f.d()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0905e)) {
            return false;
        }
        C0905e c0905e = (C0905e) obj;
        if (j.a(this.f11808a, c0905e.f11808a) && j.a(this.f11809b, c0905e.f11809b) && j.a(this.f11810c, c0905e.f11810c) && j.a(this.f11811d, c0905e.f11811d) && this.f11812e == c0905e.f11812e && j.a(this.f11813f, c0905e.f11813f)) {
            return true;
        }
        return false;
    }

    @Override // j2.AbstractC0901a
    public final C0999a f() {
        return this.f11809b;
    }

    @Override // j2.AbstractC0901a
    public final String g() {
        return this.f11810c;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f11808a;
    }

    @Override // j2.AbstractC0901a
    public final int h() {
        return this.f11813f.hashCode() + this.f11812e.hashCode() + this.f11811d.hashCode() + super.hashCode();
    }

    public final int hashCode() {
        return this.f11813f.hashCode() + ((this.f11812e.hashCode() + A.j.c(this.f11811d, A.j.c(this.f11810c, A.j.d(this.f11809b, this.f11808a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder t8 = A.j.t("OnCounterCountReached(id=", this.f11808a, ", eventId=", this.f11809b, ", name=");
        AbstractC1149a.m(t8, this.f11810c, ", counterName=", this.f11811d, ", comparisonOperation=");
        t8.append(this.f11812e);
        t8.append(", counterValue=");
        t8.append(this.f11813f);
        t8.append(")");
        return t8.toString();
    }
}
