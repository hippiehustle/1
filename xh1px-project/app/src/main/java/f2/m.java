package f2;

import l1.C0999a;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class m extends a {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f10741a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f10742b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10743c;

    /* renamed from: d, reason: collision with root package name */
    public int f10744d;

    /* renamed from: e, reason: collision with root package name */
    public final l f10745e;

    public m(C0999a c0999a, C0999a c0999a2, String str, int i4, l lVar) {
        this.f10741a = c0999a;
        this.f10742b = c0999a2;
        this.f10743c = str;
        this.f10744d = i4;
        this.f10745e = lVar;
    }

    public static m i(m mVar, C0999a c0999a, C0999a c0999a2, String str, int i4, l lVar, int i8) {
        if ((i8 & 1) != 0) {
            c0999a = mVar.f10741a;
        }
        C0999a c0999a3 = c0999a;
        if ((i8 & 2) != 0) {
            c0999a2 = mVar.f10742b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i8 & 4) != 0) {
            str = mVar.f10743c;
        }
        String str2 = str;
        if ((i8 & 8) != 0) {
            i4 = mVar.f10744d;
        }
        int i9 = i4;
        if ((i8 & 16) != 0) {
            lVar = mVar.f10745e;
        }
        mVar.getClass();
        return new m(c0999a3, c0999a4, str2, i9, lVar);
    }

    @Override // m1.InterfaceC1054d
    public final int b() {
        return this.f10744d;
    }

    @Override // m1.InterfaceC1054d
    public final void e(int i4) {
        this.f10744d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (o6.j.a(this.f10741a, mVar.f10741a) && o6.j.a(this.f10742b, mVar.f10742b) && o6.j.a(this.f10743c, mVar.f10743c) && this.f10744d == mVar.f10744d && this.f10745e == mVar.f10745e) {
            return true;
        }
        return false;
    }

    @Override // f2.a
    public final C0999a f() {
        return this.f10742b;
    }

    @Override // f2.a
    public final String g() {
        return this.f10743c;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f10741a;
    }

    @Override // f2.a
    public final int h() {
        int i4;
        String str = this.f10743c;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return this.f10745e.hashCode() + i4;
    }

    public final int hashCode() {
        int hashCode;
        int d2 = A.j.d(this.f10742b, this.f10741a.hashCode() * 31, 31);
        String str = this.f10743c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f10745e.hashCode() + AbstractC1149a.b(this.f10744d, (d2 + hashCode) * 31, 31);
    }

    public final String toString() {
        int i4 = this.f10744d;
        StringBuilder t8 = A.j.t("SystemAction(id=", this.f10741a, ", eventId=", this.f10742b, ", name=");
        t8.append(this.f10743c);
        t8.append(", priority=");
        t8.append(i4);
        t8.append(", type=");
        t8.append(this.f10745e);
        t8.append(")");
        return t8.toString();
    }
}
