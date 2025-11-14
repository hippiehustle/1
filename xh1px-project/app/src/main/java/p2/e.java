package p2;

import java.util.ArrayList;
import java.util.List;
import l1.C0999a;
import m1.InterfaceC1053c;
import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class e implements InterfaceC1053c, f {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f13699a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13700b;

    /* renamed from: c, reason: collision with root package name */
    public final List f13701c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13702d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13703e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13704f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13705g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13706h;

    /* renamed from: i, reason: collision with root package name */
    public final h1.f f13707i;

    public e(C0999a c0999a, String str, List list, int i4, boolean z8, int i8, boolean z9, boolean z10, h1.f fVar) {
        j.e(str, "name");
        this.f13699a = c0999a;
        this.f13700b = str;
        this.f13701c = list;
        this.f13702d = i4;
        this.f13703e = z8;
        this.f13704f = i8;
        this.f13705g = z9;
        this.f13706h = z10;
        this.f13707i = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    public static e g(e eVar, String str, ArrayList arrayList, int i4, boolean z8, int i8, boolean z9, boolean z10, int i9) {
        int i10;
        boolean z11;
        boolean z12;
        C0999a c0999a = eVar.f13699a;
        if ((i9 & 2) != 0) {
            str = eVar.f13700b;
        }
        String str2 = str;
        ArrayList arrayList2 = arrayList;
        if ((i9 & 4) != 0) {
            arrayList2 = eVar.f13701c;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i9 & 8) != 0) {
            i4 = eVar.f13702d;
        }
        int i11 = i4;
        if ((i9 & 16) != 0) {
            z8 = eVar.f13703e;
        }
        boolean z13 = z8;
        if ((i9 & 32) != 0) {
            i10 = eVar.f13704f;
        } else {
            i10 = i8;
        }
        if ((i9 & 64) != 0) {
            z11 = eVar.f13705g;
        } else {
            z11 = z9;
        }
        if ((i9 & 128) != 0) {
            z12 = eVar.f13706h;
        } else {
            z12 = z10;
        }
        h1.f fVar = eVar.f13707i;
        j.e(c0999a, "id");
        j.e(str2, "name");
        j.e(arrayList3, "dumbActions");
        return new e(c0999a, str2, arrayList3, i11, z13, i10, z11, z12, fVar);
    }

    @Override // m1.InterfaceC1053c
    public final Long a() {
        return getId().f12188b;
    }

    @Override // p2.f
    public final boolean b() {
        return this.f13703e;
    }

    @Override // p2.f
    public final int e() {
        return this.f13702d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.f13699a, eVar.f13699a) && j.a(this.f13700b, eVar.f13700b) && j.a(this.f13701c, eVar.f13701c) && this.f13702d == eVar.f13702d && this.f13703e == eVar.f13703e && this.f13704f == eVar.f13704f && this.f13705g == eVar.f13705g && this.f13706h == eVar.f13706h && j.a(this.f13707i, eVar.f13707i)) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f13699a;
    }

    public final int hashCode() {
        int hashCode;
        int c6 = AbstractC1149a.c(AbstractC1149a.c(AbstractC1149a.b(this.f13704f, AbstractC1149a.c(AbstractC1149a.b(this.f13702d, (this.f13701c.hashCode() + A.j.c(this.f13700b, this.f13699a.hashCode() * 31, 31)) * 31, 31), 31, this.f13703e), 31), 31, this.f13705g), 31, this.f13706h);
        h1.f fVar = this.f13707i;
        if (fVar == null) {
            hashCode = 0;
        } else {
            hashCode = fVar.hashCode();
        }
        return c6 + hashCode;
    }

    public final String toString() {
        return "DumbScenario(id=" + this.f13699a + ", name=" + this.f13700b + ", dumbActions=" + this.f13701c + ", repeatCount=" + this.f13702d + ", isRepeatInfinite=" + this.f13703e + ", maxDurationMin=" + this.f13704f + ", isDurationInfinite=" + this.f13705g + ", randomize=" + this.f13706h + ", stats=" + this.f13707i + ")";
    }
}
