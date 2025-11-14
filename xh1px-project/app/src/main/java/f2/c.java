package f2;

import e2.AbstractC0640c;
import l1.C0999a;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f10680a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f10681b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10682c;

    /* renamed from: d, reason: collision with root package name */
    public int f10683d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10684e;

    /* renamed from: f, reason: collision with root package name */
    public final b f10685f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0640c f10686g;

    public c(C0999a c0999a, C0999a c0999a2, String str, int i4, String str2, b bVar, AbstractC0640c abstractC0640c) {
        o6.j.e(str2, "counterName");
        o6.j.e(bVar, "operation");
        this.f10680a = c0999a;
        this.f10681b = c0999a2;
        this.f10682c = str;
        this.f10683d = i4;
        this.f10684e = str2;
        this.f10685f = bVar;
        this.f10686g = abstractC0640c;
    }

    public static c i(c cVar, C0999a c0999a, C0999a c0999a2, String str, int i4, String str2, b bVar, AbstractC0640c abstractC0640c, int i8) {
        if ((i8 & 1) != 0) {
            c0999a = cVar.f10680a;
        }
        C0999a c0999a3 = c0999a;
        if ((i8 & 2) != 0) {
            c0999a2 = cVar.f10681b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i8 & 4) != 0) {
            str = cVar.f10682c;
        }
        String str3 = str;
        if ((i8 & 8) != 0) {
            i4 = cVar.f10683d;
        }
        int i9 = i4;
        if ((i8 & 16) != 0) {
            str2 = cVar.f10684e;
        }
        String str4 = str2;
        if ((i8 & 32) != 0) {
            bVar = cVar.f10685f;
        }
        b bVar2 = bVar;
        if ((i8 & 64) != 0) {
            abstractC0640c = cVar.f10686g;
        }
        cVar.getClass();
        o6.j.e(str4, "counterName");
        o6.j.e(bVar2, "operation");
        return new c(c0999a3, c0999a4, str3, i9, str4, bVar2, abstractC0640c);
    }

    @Override // m1.InterfaceC1054d
    public final int b() {
        return this.f10683d;
    }

    @Override // f2.a, m1.InterfaceC1051a
    public final boolean d() {
        if (super.d() && this.f10684e.length() > 0 && this.f10686g.d()) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1054d
    public final void e(int i4) {
        this.f10683d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (o6.j.a(this.f10680a, cVar.f10680a) && o6.j.a(this.f10681b, cVar.f10681b) && o6.j.a(this.f10682c, cVar.f10682c) && this.f10683d == cVar.f10683d && o6.j.a(this.f10684e, cVar.f10684e) && this.f10685f == cVar.f10685f && o6.j.a(this.f10686g, cVar.f10686g)) {
            return true;
        }
        return false;
    }

    @Override // f2.a
    public final C0999a f() {
        return this.f10681b;
    }

    @Override // f2.a
    public final String g() {
        return this.f10682c;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f10680a;
    }

    @Override // f2.a
    public final int h() {
        int i4;
        String str = this.f10682c;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return this.f10686g.hashCode() + this.f10685f.hashCode() + this.f10684e.hashCode() + i4;
    }

    public final int hashCode() {
        int hashCode;
        int d2 = A.j.d(this.f10681b, this.f10680a.hashCode() * 31, 31);
        String str = this.f10682c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f10686g.hashCode() + ((this.f10685f.hashCode() + A.j.c(this.f10684e, AbstractC1149a.b(this.f10683d, (d2 + hashCode) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        int i4 = this.f10683d;
        StringBuilder t8 = A.j.t("ChangeCounter(id=", this.f10680a, ", eventId=", this.f10681b, ", name=");
        t8.append(this.f10682c);
        t8.append(", priority=");
        t8.append(i4);
        t8.append(", counterName=");
        t8.append(this.f10684e);
        t8.append(", operation=");
        t8.append(this.f10685f);
        t8.append(", operationValue=");
        t8.append(this.f10686g);
        t8.append(")");
        return t8.toString();
    }
}
