package f2;

import l1.C0999a;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f10719a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f10720b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10721c;

    /* renamed from: d, reason: collision with root package name */
    public int f10722d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f10723e;

    public i(C0999a c0999a, C0999a c0999a2, String str, int i4, Long l6) {
        this.f10719a = c0999a;
        this.f10720b = c0999a2;
        this.f10721c = str;
        this.f10722d = i4;
        this.f10723e = l6;
    }

    public static i i(i iVar, C0999a c0999a, C0999a c0999a2, String str, int i4, Long l6, int i8) {
        if ((i8 & 1) != 0) {
            c0999a = iVar.f10719a;
        }
        C0999a c0999a3 = c0999a;
        if ((i8 & 2) != 0) {
            c0999a2 = iVar.f10720b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i8 & 4) != 0) {
            str = iVar.f10721c;
        }
        String str2 = str;
        if ((i8 & 8) != 0) {
            i4 = iVar.f10722d;
        }
        int i9 = i4;
        if ((i8 & 16) != 0) {
            l6 = iVar.f10723e;
        }
        iVar.getClass();
        return new i(c0999a3, c0999a4, str2, i9, l6);
    }

    @Override // m1.InterfaceC1054d
    public final int b() {
        return this.f10722d;
    }

    @Override // f2.a, m1.InterfaceC1051a
    public final boolean d() {
        if (super.d() && this.f10723e != null) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1054d
    public final void e(int i4) {
        this.f10722d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (o6.j.a(this.f10719a, iVar.f10719a) && o6.j.a(this.f10720b, iVar.f10720b) && o6.j.a(this.f10721c, iVar.f10721c) && this.f10722d == iVar.f10722d && o6.j.a(this.f10723e, iVar.f10723e)) {
            return true;
        }
        return false;
    }

    @Override // f2.a
    public final C0999a f() {
        return this.f10720b;
    }

    @Override // f2.a
    public final String g() {
        return this.f10721c;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f10719a;
    }

    @Override // f2.a
    public final int h() {
        int i4;
        int i8 = 0;
        String str = this.f10721c;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        Long l6 = this.f10723e;
        if (l6 != null) {
            i8 = l6.hashCode();
        }
        return i4 + i8;
    }

    public final int hashCode() {
        int hashCode;
        int d2 = A.j.d(this.f10720b, this.f10719a.hashCode() * 31, 31);
        int i4 = 0;
        String str = this.f10721c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b4 = AbstractC1149a.b(this.f10722d, (d2 + hashCode) * 31, 31);
        Long l6 = this.f10723e;
        if (l6 != null) {
            i4 = l6.hashCode();
        }
        return b4 + i4;
    }

    public final String toString() {
        int i4 = this.f10722d;
        StringBuilder t8 = A.j.t("Pause(id=", this.f10719a, ", eventId=", this.f10720b, ", name=");
        t8.append(this.f10721c);
        t8.append(", priority=");
        t8.append(i4);
        t8.append(", pauseDuration=");
        t8.append(this.f10723e);
        t8.append(")");
        return t8.toString();
    }
}
