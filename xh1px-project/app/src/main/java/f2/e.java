package f2;

import android.graphics.Point;
import l1.C0999a;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f10690a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f10691b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10692c;

    /* renamed from: d, reason: collision with root package name */
    public int f10693d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f10694e;

    /* renamed from: f, reason: collision with root package name */
    public final d f10695f;

    /* renamed from: g, reason: collision with root package name */
    public final Point f10696g;

    /* renamed from: h, reason: collision with root package name */
    public final C0999a f10697h;

    /* renamed from: i, reason: collision with root package name */
    public final Point f10698i;

    public e(C0999a c0999a, C0999a c0999a2, String str, int i4, Long l6, d dVar, Point point, C0999a c0999a3, Point point2) {
        o6.j.e(dVar, "positionType");
        this.f10690a = c0999a;
        this.f10691b = c0999a2;
        this.f10692c = str;
        this.f10693d = i4;
        this.f10694e = l6;
        this.f10695f = dVar;
        this.f10696g = point;
        this.f10697h = c0999a3;
        this.f10698i = point2;
    }

    public static e i(e eVar, C0999a c0999a, C0999a c0999a2, String str, int i4, Long l6, d dVar, Point point, C0999a c0999a3, Point point2, int i8) {
        d dVar2;
        Point point3;
        C0999a c0999a4;
        Point point4;
        if ((i8 & 1) != 0) {
            c0999a = eVar.f10690a;
        }
        C0999a c0999a5 = c0999a;
        if ((i8 & 2) != 0) {
            c0999a2 = eVar.f10691b;
        }
        C0999a c0999a6 = c0999a2;
        if ((i8 & 4) != 0) {
            str = eVar.f10692c;
        }
        String str2 = str;
        if ((i8 & 8) != 0) {
            i4 = eVar.f10693d;
        }
        int i9 = i4;
        if ((i8 & 16) != 0) {
            l6 = eVar.f10694e;
        }
        Long l8 = l6;
        if ((i8 & 32) != 0) {
            dVar2 = eVar.f10695f;
        } else {
            dVar2 = dVar;
        }
        if ((i8 & 64) != 0) {
            point3 = eVar.f10696g;
        } else {
            point3 = point;
        }
        if ((i8 & 128) != 0) {
            c0999a4 = eVar.f10697h;
        } else {
            c0999a4 = c0999a3;
        }
        if ((i8 & 256) != 0) {
            point4 = eVar.f10698i;
        } else {
            point4 = point2;
        }
        eVar.getClass();
        o6.j.e(dVar2, "positionType");
        return new e(c0999a5, c0999a6, str2, i9, l8, dVar2, point3, c0999a4, point4);
    }

    @Override // m1.InterfaceC1054d
    public final int b() {
        return this.f10693d;
    }

    @Override // f2.a, m1.InterfaceC1051a
    public final boolean d() {
        if (super.d() && this.f10694e != null) {
            d dVar = d.f10687d;
            d dVar2 = this.f10695f;
            if ((dVar2 == dVar && this.f10696g != null) || dVar2 == d.f10688e) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // m1.InterfaceC1054d
    public final void e(int i4) {
        this.f10693d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (o6.j.a(this.f10690a, eVar.f10690a) && o6.j.a(this.f10691b, eVar.f10691b) && o6.j.a(this.f10692c, eVar.f10692c) && this.f10693d == eVar.f10693d && o6.j.a(this.f10694e, eVar.f10694e) && this.f10695f == eVar.f10695f && o6.j.a(this.f10696g, eVar.f10696g) && o6.j.a(this.f10697h, eVar.f10697h) && o6.j.a(this.f10698i, eVar.f10698i)) {
            return true;
        }
        return false;
    }

    @Override // f2.a
    public final C0999a f() {
        return this.f10691b;
    }

    @Override // f2.a
    public final String g() {
        return this.f10692c;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f10690a;
    }

    @Override // f2.a
    public final int h() {
        int i4;
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        String str = this.f10692c;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        Long l6 = this.f10694e;
        if (l6 != null) {
            i8 = l6.hashCode();
        } else {
            i8 = 0;
        }
        int hashCode = this.f10695f.hashCode() + i4 + i8;
        Point point = this.f10696g;
        if (point != null) {
            i9 = point.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = hashCode + i9;
        C0999a c0999a = this.f10697h;
        if (c0999a != null) {
            i10 = c0999a.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i12 + i10;
        Point point2 = this.f10698i;
        if (point2 != null) {
            i11 = point2.hashCode();
        }
        return i13 + i11;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int d2 = A.j.d(this.f10691b, this.f10690a.hashCode() * 31, 31);
        int i4 = 0;
        String str = this.f10692c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b4 = AbstractC1149a.b(this.f10693d, (d2 + hashCode) * 31, 31);
        Long l6 = this.f10694e;
        if (l6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l6.hashCode();
        }
        int hashCode5 = (this.f10695f.hashCode() + ((b4 + hashCode2) * 31)) * 31;
        Point point = this.f10696g;
        if (point == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = point.hashCode();
        }
        int i8 = (hashCode5 + hashCode3) * 31;
        C0999a c0999a = this.f10697h;
        if (c0999a == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c0999a.hashCode();
        }
        int i9 = (i8 + hashCode4) * 31;
        Point point2 = this.f10698i;
        if (point2 != null) {
            i4 = point2.hashCode();
        }
        return i9 + i4;
    }

    public final boolean j() {
        d dVar = d.f10688e;
        d dVar2 = this.f10695f;
        if ((dVar2 == dVar && this.f10697h != null) || dVar2 == d.f10687d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        int i4 = this.f10693d;
        StringBuilder t8 = A.j.t("Click(id=", this.f10690a, ", eventId=", this.f10691b, ", name=");
        t8.append(this.f10692c);
        t8.append(", priority=");
        t8.append(i4);
        t8.append(", pressDuration=");
        t8.append(this.f10694e);
        t8.append(", positionType=");
        t8.append(this.f10695f);
        t8.append(", position=");
        t8.append(this.f10696g);
        t8.append(", clickOnConditionId=");
        t8.append(this.f10697h);
        t8.append(", clickOffset=");
        t8.append(this.f10698i);
        t8.append(")");
        return t8.toString();
    }
}
