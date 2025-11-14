package f2;

import l1.C0999a;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f10711a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f10712b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10713c;

    /* renamed from: d, reason: collision with root package name */
    public int f10714d;

    /* renamed from: e, reason: collision with root package name */
    public final g f10715e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10716f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10717g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10718h;

    public h(C0999a c0999a, C0999a c0999a2, String str, int i4, g gVar, String str2, String str3, int i8) {
        o6.j.e(gVar, "messageType");
        o6.j.e(str2, "messageText");
        o6.j.e(str3, "messageCounterName");
        this.f10711a = c0999a;
        this.f10712b = c0999a2;
        this.f10713c = str;
        this.f10714d = i4;
        this.f10715e = gVar;
        this.f10716f = str2;
        this.f10717g = str3;
        this.f10718h = i8;
    }

    public static h i(h hVar, C0999a c0999a, C0999a c0999a2, String str, int i4, g gVar, String str2, String str3, int i8, int i9) {
        String str4;
        int i10;
        if ((i9 & 1) != 0) {
            c0999a = hVar.f10711a;
        }
        C0999a c0999a3 = c0999a;
        if ((i9 & 2) != 0) {
            c0999a2 = hVar.f10712b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i9 & 4) != 0) {
            str = hVar.f10713c;
        }
        String str5 = str;
        if ((i9 & 8) != 0) {
            i4 = hVar.f10714d;
        }
        int i11 = i4;
        if ((i9 & 16) != 0) {
            gVar = hVar.f10715e;
        }
        g gVar2 = gVar;
        if ((i9 & 32) != 0) {
            str2 = hVar.f10716f;
        }
        String str6 = str2;
        if ((i9 & 64) != 0) {
            str4 = hVar.f10717g;
        } else {
            str4 = str3;
        }
        if ((i9 & 128) != 0) {
            i10 = hVar.f10718h;
        } else {
            i10 = i8;
        }
        hVar.getClass();
        o6.j.e(gVar2, "messageType");
        o6.j.e(str6, "messageText");
        o6.j.e(str4, "messageCounterName");
        return new h(c0999a3, c0999a4, str5, i11, gVar2, str6, str4, i10);
    }

    @Override // m1.InterfaceC1054d
    public final int b() {
        return this.f10714d;
    }

    @Override // f2.a, m1.InterfaceC1051a
    public final boolean d() {
        if (super.d()) {
            g gVar = g.f10708d;
            g gVar2 = this.f10715e;
            if (gVar2 != gVar || this.f10716f.length() <= 0) {
                if (gVar2 == g.f10709e && this.f10717g.length() > 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1054d
    public final void e(int i4) {
        this.f10714d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (o6.j.a(this.f10711a, hVar.f10711a) && o6.j.a(this.f10712b, hVar.f10712b) && o6.j.a(this.f10713c, hVar.f10713c) && this.f10714d == hVar.f10714d && this.f10715e == hVar.f10715e && o6.j.a(this.f10716f, hVar.f10716f) && o6.j.a(this.f10717g, hVar.f10717g) && this.f10718h == hVar.f10718h) {
            return true;
        }
        return false;
    }

    @Override // f2.a
    public final C0999a f() {
        return this.f10712b;
    }

    @Override // f2.a
    public final String g() {
        return this.f10713c;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f10711a;
    }

    @Override // f2.a
    public final int h() {
        int i4;
        String str = this.f10713c;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return this.f10717g.hashCode() + this.f10716f.hashCode() + this.f10715e.hashCode() + Integer.hashCode(this.f10718h) + i4;
    }

    public final int hashCode() {
        int hashCode;
        int d2 = A.j.d(this.f10712b, this.f10711a.hashCode() * 31, 31);
        String str = this.f10713c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.f10718h) + A.j.c(this.f10717g, A.j.c(this.f10716f, (this.f10715e.hashCode() + AbstractC1149a.b(this.f10714d, (d2 + hashCode) * 31, 31)) * 31, 31), 31);
    }

    public final String toString() {
        int i4 = this.f10714d;
        StringBuilder t8 = A.j.t("Notification(id=", this.f10711a, ", eventId=", this.f10712b, ", name=");
        t8.append(this.f10713c);
        t8.append(", priority=");
        t8.append(i4);
        t8.append(", messageType=");
        t8.append(this.f10715e);
        t8.append(", messageText=");
        t8.append(this.f10716f);
        t8.append(", messageCounterName=");
        t8.append(this.f10717g);
        t8.append(", channelImportance=");
        t8.append(this.f10718h);
        t8.append(")");
        return t8.toString();
    }
}
