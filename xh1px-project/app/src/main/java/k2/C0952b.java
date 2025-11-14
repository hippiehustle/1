package k2;

import f2.e;
import java.util.List;
import l1.C0999a;
import m1.InterfaceC1054d;
import n1.AbstractC1149a;
import o6.j;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0952b extends AbstractC0951a implements InterfaceC1054d {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f11959a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f11960b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11961c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11962d;

    /* renamed from: e, reason: collision with root package name */
    public final List f11963e;

    /* renamed from: f, reason: collision with root package name */
    public final List f11964f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11965g;

    /* renamed from: h, reason: collision with root package name */
    public int f11966h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11967i;

    public C0952b(C0999a c0999a, C0999a c0999a2, String str, int i4, List list, List list2, boolean z8, int i8, boolean z9) {
        j.e(c0999a2, "scenarioId");
        j.e(str, "name");
        j.e(list, "actions");
        j.e(list2, "conditions");
        this.f11959a = c0999a;
        this.f11960b = c0999a2;
        this.f11961c = str;
        this.f11962d = i4;
        this.f11963e = list;
        this.f11964f = list2;
        this.f11965g = z8;
        this.f11966h = i8;
        this.f11967i = z9;
    }

    public static C0952b m(C0952b c0952b, C0999a c0999a, C0999a c0999a2, String str, int i4, List list, List list2, boolean z8, int i8, boolean z9, int i9) {
        List list3;
        boolean z10;
        int i10;
        boolean z11;
        if ((i9 & 1) != 0) {
            c0999a = c0952b.f11959a;
        }
        C0999a c0999a3 = c0999a;
        if ((i9 & 2) != 0) {
            c0999a2 = c0952b.f11960b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i9 & 4) != 0) {
            str = c0952b.f11961c;
        }
        String str2 = str;
        if ((i9 & 8) != 0) {
            i4 = c0952b.f11962d;
        }
        int i11 = i4;
        if ((i9 & 16) != 0) {
            list = c0952b.f11963e;
        }
        List list4 = list;
        if ((i9 & 32) != 0) {
            list3 = c0952b.f11964f;
        } else {
            list3 = list2;
        }
        if ((i9 & 64) != 0) {
            z10 = c0952b.f11965g;
        } else {
            z10 = z8;
        }
        if ((i9 & 128) != 0) {
            i10 = c0952b.f11966h;
        } else {
            i10 = i8;
        }
        if ((i9 & 256) != 0) {
            z11 = c0952b.f11967i;
        } else {
            z11 = z9;
        }
        c0952b.getClass();
        j.e(c0999a4, "scenarioId");
        j.e(str2, "name");
        j.e(list4, "actions");
        j.e(list3, "conditions");
        return new C0952b(c0999a3, c0999a4, str2, i11, list4, list3, z10, i10, z11);
    }

    @Override // m1.InterfaceC1054d
    public final int b() {
        return this.f11966h;
    }

    @Override // k2.AbstractC0951a, m1.InterfaceC1051a
    public final boolean d() {
        if (!super.d()) {
            return false;
        }
        for (f2.a aVar : this.f11963e) {
            if (this.f11962d == 1 && (aVar instanceof e) && !((e) aVar).j()) {
                return false;
            }
        }
        return true;
    }

    @Override // m1.InterfaceC1054d
    public final void e(int i4) {
        this.f11966h = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0952b)) {
            return false;
        }
        C0952b c0952b = (C0952b) obj;
        if (j.a(this.f11959a, c0952b.f11959a) && j.a(this.f11960b, c0952b.f11960b) && j.a(this.f11961c, c0952b.f11961c) && this.f11962d == c0952b.f11962d && j.a(this.f11963e, c0952b.f11963e) && j.a(this.f11964f, c0952b.f11964f) && this.f11965g == c0952b.f11965g && this.f11966h == c0952b.f11966h && this.f11967i == c0952b.f11967i) {
            return true;
        }
        return false;
    }

    @Override // k2.AbstractC0951a
    public final List g() {
        return this.f11963e;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f11959a;
    }

    @Override // k2.AbstractC0951a
    public final int h() {
        return this.f11962d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11967i) + AbstractC1149a.b(this.f11966h, AbstractC1149a.c((this.f11964f.hashCode() + ((this.f11963e.hashCode() + AbstractC1149a.b(this.f11962d, A.j.c(this.f11961c, A.j.d(this.f11960b, this.f11959a.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31, this.f11965g), 31);
    }

    @Override // k2.AbstractC0951a
    public final List i() {
        return this.f11964f;
    }

    @Override // k2.AbstractC0951a
    public final boolean j() {
        return this.f11965g;
    }

    @Override // k2.AbstractC0951a
    public final String k() {
        return this.f11961c;
    }

    @Override // k2.AbstractC0951a
    public final C0999a l() {
        return this.f11960b;
    }

    public final String toString() {
        int i4 = this.f11966h;
        StringBuilder t8 = A.j.t("ImageEvent(id=", this.f11959a, ", scenarioId=", this.f11960b, ", name=");
        t8.append(this.f11961c);
        t8.append(", conditionOperator=");
        t8.append(this.f11962d);
        t8.append(", actions=");
        t8.append(this.f11963e);
        t8.append(", conditions=");
        t8.append(this.f11964f);
        t8.append(", enabledOnStart=");
        t8.append(this.f11965g);
        t8.append(", priority=");
        t8.append(i4);
        t8.append(", keepDetecting=");
        t8.append(this.f11967i);
        t8.append(")");
        return t8.toString();
    }
}
