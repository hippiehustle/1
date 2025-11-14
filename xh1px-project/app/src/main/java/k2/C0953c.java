package k2;

import f2.d;
import f2.e;
import java.util.List;
import l1.C0999a;
import n1.AbstractC1149a;
import o6.j;

/* renamed from: k2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0953c extends AbstractC0951a {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f11968a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f11969b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11970c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11971d;

    /* renamed from: e, reason: collision with root package name */
    public final List f11972e;

    /* renamed from: f, reason: collision with root package name */
    public final List f11973f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11974g;

    public C0953c(C0999a c0999a, C0999a c0999a2, String str, int i4, List list, List list2, boolean z8) {
        j.e(c0999a, "id");
        j.e(c0999a2, "scenarioId");
        j.e(str, "name");
        j.e(list, "actions");
        j.e(list2, "conditions");
        this.f11968a = c0999a;
        this.f11969b = c0999a2;
        this.f11970c = str;
        this.f11971d = i4;
        this.f11972e = list;
        this.f11973f = list2;
        this.f11974g = z8;
    }

    public static C0953c m(C0999a c0999a, C0999a c0999a2, String str, int i4, List list, List list2, boolean z8) {
        j.e(c0999a, "id");
        j.e(c0999a2, "scenarioId");
        j.e(str, "name");
        j.e(list, "actions");
        j.e(list2, "conditions");
        return new C0953c(c0999a, c0999a2, str, i4, list, list2, z8);
    }

    public static /* synthetic */ C0953c n(C0953c c0953c, C0999a c0999a, C0999a c0999a2, String str, List list, List list2, int i4) {
        if ((i4 & 1) != 0) {
            c0999a = c0953c.f11968a;
        }
        C0999a c0999a3 = c0999a;
        if ((i4 & 2) != 0) {
            c0999a2 = c0953c.f11969b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i4 & 4) != 0) {
            str = c0953c.f11970c;
        }
        int i8 = c0953c.f11971d;
        boolean z8 = c0953c.f11974g;
        c0953c.getClass();
        return m(c0999a3, c0999a4, str, i8, list, list2, z8);
    }

    @Override // k2.AbstractC0951a, m1.InterfaceC1051a
    public final boolean d() {
        if (super.d()) {
            for (f2.a aVar : this.f11972e) {
                if (aVar.d()) {
                    if (aVar instanceof e) {
                        e eVar = (e) aVar;
                        if (eVar.f10695f != d.f10687d || eVar.f10697h != null) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0953c)) {
            return false;
        }
        C0953c c0953c = (C0953c) obj;
        if (j.a(this.f11968a, c0953c.f11968a) && j.a(this.f11969b, c0953c.f11969b) && j.a(this.f11970c, c0953c.f11970c) && this.f11971d == c0953c.f11971d && j.a(this.f11972e, c0953c.f11972e) && j.a(this.f11973f, c0953c.f11973f) && this.f11974g == c0953c.f11974g) {
            return true;
        }
        return false;
    }

    @Override // k2.AbstractC0951a
    public final List g() {
        return this.f11972e;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f11968a;
    }

    @Override // k2.AbstractC0951a
    public final int h() {
        return this.f11971d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11974g) + ((this.f11973f.hashCode() + ((this.f11972e.hashCode() + AbstractC1149a.b(this.f11971d, A.j.c(this.f11970c, A.j.d(this.f11969b, this.f11968a.hashCode() * 31, 31), 31), 31)) * 31)) * 31);
    }

    @Override // k2.AbstractC0951a
    public final List i() {
        return this.f11973f;
    }

    @Override // k2.AbstractC0951a
    public final boolean j() {
        return this.f11974g;
    }

    @Override // k2.AbstractC0951a
    public final String k() {
        return this.f11970c;
    }

    @Override // k2.AbstractC0951a
    public final C0999a l() {
        return this.f11969b;
    }

    public final String toString() {
        StringBuilder t8 = A.j.t("TriggerEvent(id=", this.f11968a, ", scenarioId=", this.f11969b, ", name=");
        t8.append(this.f11970c);
        t8.append(", conditionOperator=");
        t8.append(this.f11971d);
        t8.append(", actions=");
        t8.append(this.f11972e);
        t8.append(", conditions=");
        t8.append(this.f11973f);
        t8.append(", enabledOnStart=");
        t8.append(this.f11974g);
        t8.append(")");
        return t8.toString();
    }
}
