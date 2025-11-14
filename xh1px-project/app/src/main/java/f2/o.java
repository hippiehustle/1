package f2;

import h7.AbstractC0842e;
import java.util.List;
import l1.C0999a;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class o extends a {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f10750a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f10751b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10752c;

    /* renamed from: d, reason: collision with root package name */
    public int f10753d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10754e;

    /* renamed from: f, reason: collision with root package name */
    public final n f10755f;

    /* renamed from: g, reason: collision with root package name */
    public final List f10756g;

    public o(C0999a c0999a, C0999a c0999a2, String str, int i4, boolean z8, n nVar, List list) {
        o6.j.e(list, "eventToggles");
        this.f10750a = c0999a;
        this.f10751b = c0999a2;
        this.f10752c = str;
        this.f10753d = i4;
        this.f10754e = z8;
        this.f10755f = nVar;
        this.f10756g = list;
    }

    public static o i(o oVar, C0999a c0999a, C0999a c0999a2, String str, int i4, boolean z8, n nVar, List list, int i8) {
        if ((i8 & 1) != 0) {
            c0999a = oVar.f10750a;
        }
        C0999a c0999a3 = c0999a;
        if ((i8 & 2) != 0) {
            c0999a2 = oVar.f10751b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i8 & 4) != 0) {
            str = oVar.f10752c;
        }
        String str2 = str;
        if ((i8 & 8) != 0) {
            i4 = oVar.f10753d;
        }
        int i9 = i4;
        if ((i8 & 16) != 0) {
            z8 = oVar.f10754e;
        }
        boolean z9 = z8;
        if ((i8 & 32) != 0) {
            nVar = oVar.f10755f;
        }
        n nVar2 = nVar;
        if ((i8 & 64) != 0) {
            list = oVar.f10756g;
        }
        List list2 = list;
        oVar.getClass();
        o6.j.e(list2, "eventToggles");
        return new o(c0999a3, c0999a4, str2, i9, z9, nVar2, list2);
    }

    @Override // m1.InterfaceC1054d
    public final int b() {
        return this.f10753d;
    }

    @Override // f2.a, m1.InterfaceC1051a
    public final boolean d() {
        if (super.d()) {
            if (this.f10754e) {
                if (this.f10755f != null) {
                    return true;
                }
                return false;
            }
            return AbstractC0842e.b(this.f10756g);
        }
        return false;
    }

    @Override // m1.InterfaceC1054d
    public final void e(int i4) {
        this.f10753d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (o6.j.a(this.f10750a, oVar.f10750a) && o6.j.a(this.f10751b, oVar.f10751b) && o6.j.a(this.f10752c, oVar.f10752c) && this.f10753d == oVar.f10753d && this.f10754e == oVar.f10754e && this.f10755f == oVar.f10755f && o6.j.a(this.f10756g, oVar.f10756g)) {
            return true;
        }
        return false;
    }

    @Override // f2.a
    public final C0999a f() {
        return this.f10751b;
    }

    @Override // f2.a
    public final String g() {
        return this.f10752c;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f10750a;
    }

    @Override // f2.a
    public final int h() {
        int i4;
        int i8 = 0;
        String str = this.f10752c;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode = Boolean.hashCode(this.f10754e) + i4;
        n nVar = this.f10755f;
        if (nVar != null) {
            i8 = nVar.hashCode();
        }
        return this.f10756g.hashCode() + hashCode + i8;
    }

    public final int hashCode() {
        int hashCode;
        int d2 = A.j.d(this.f10751b, this.f10750a.hashCode() * 31, 31);
        int i4 = 0;
        String str = this.f10752c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c6 = AbstractC1149a.c(AbstractC1149a.b(this.f10753d, (d2 + hashCode) * 31, 31), 31, this.f10754e);
        n nVar = this.f10755f;
        if (nVar != null) {
            i4 = nVar.hashCode();
        }
        return this.f10756g.hashCode() + ((c6 + i4) * 31);
    }

    public final String toString() {
        int i4 = this.f10753d;
        StringBuilder t8 = A.j.t("ToggleEvent(id=", this.f10750a, ", eventId=", this.f10751b, ", name=");
        t8.append(this.f10752c);
        t8.append(", priority=");
        t8.append(i4);
        t8.append(", toggleAll=");
        t8.append(this.f10754e);
        t8.append(", toggleAllType=");
        t8.append(this.f10755f);
        t8.append(", eventToggles=");
        t8.append(this.f10756g);
        t8.append(")");
        return t8.toString();
    }
}
