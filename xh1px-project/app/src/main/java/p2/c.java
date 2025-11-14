package p2;

import android.graphics.Point;
import l1.C0999a;
import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class c extends d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f13690a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f13691b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13692c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13693d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13694e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13695f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13696g;

    /* renamed from: h, reason: collision with root package name */
    public final Point f13697h;

    /* renamed from: i, reason: collision with root package name */
    public final Point f13698i;
    public final long j;

    public c(C0999a c0999a, C0999a c0999a2, String str, int i4, int i8, boolean z8, long j, Point point, Point point2, long j5) {
        j.e(str, "name");
        j.e(point, "fromPosition");
        j.e(point2, "toPosition");
        this.f13690a = c0999a;
        this.f13691b = c0999a2;
        this.f13692c = str;
        this.f13693d = i4;
        this.f13694e = i8;
        this.f13695f = z8;
        this.f13696g = j;
        this.f13697h = point;
        this.f13698i = point2;
        this.j = j5;
    }

    public static c i(c cVar, C0999a c0999a, C0999a c0999a2, String str, int i4, int i8, boolean z8, long j, Point point, Point point2, long j5, int i9) {
        if ((i9 & 1) != 0) {
            c0999a = cVar.f13690a;
        }
        C0999a c0999a3 = c0999a;
        C0999a c0999a4 = (i9 & 2) != 0 ? cVar.f13691b : c0999a2;
        String str2 = (i9 & 4) != 0 ? cVar.f13692c : str;
        int i10 = (i9 & 8) != 0 ? cVar.f13693d : i4;
        int i11 = (i9 & 16) != 0 ? cVar.f13694e : i8;
        boolean z9 = (i9 & 32) != 0 ? cVar.f13695f : z8;
        long j8 = (i9 & 64) != 0 ? cVar.f13696g : j;
        Point point3 = (i9 & 128) != 0 ? cVar.f13697h : point;
        Point point4 = (i9 & 256) != 0 ? cVar.f13698i : point2;
        long j9 = (i9 & 512) != 0 ? cVar.j : j5;
        cVar.getClass();
        j.e(str2, "name");
        j.e(point3, "fromPosition");
        j.e(point4, "toPosition");
        return new c(c0999a3, c0999a4, str2, i10, i11, z9, j8, point3, point4, j9);
    }

    @Override // p2.f
    public final boolean b() {
        return this.f13695f;
    }

    @Override // p2.f
    public final int e() {
        return this.f13694e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (j.a(this.f13690a, cVar.f13690a) && j.a(this.f13691b, cVar.f13691b) && j.a(this.f13692c, cVar.f13692c) && this.f13693d == cVar.f13693d && this.f13694e == cVar.f13694e && this.f13695f == cVar.f13695f && this.f13696g == cVar.f13696g && j.a(this.f13697h, cVar.f13697h) && j.a(this.f13698i, cVar.f13698i) && this.j == cVar.j) {
            return true;
        }
        return false;
    }

    @Override // p2.g
    public final long f() {
        return this.f13696g;
    }

    @Override // p2.d
    public final C0999a g() {
        return this.f13691b;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f13690a;
    }

    @Override // p2.d
    public final boolean h() {
        if (this.f13692c.length() > 0 && this.j > 0 && e() > 0 && super.d()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.f13698i.hashCode() + ((this.f13697h.hashCode() + AbstractC1149a.d(this.f13696g, AbstractC1149a.c(AbstractC1149a.b(this.f13694e, AbstractC1149a.b(this.f13693d, A.j.c(this.f13692c, A.j.d(this.f13691b, this.f13690a.hashCode() * 31, 31), 31), 31), 31), 31, this.f13695f), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder t8 = A.j.t("DumbSwipe(id=", this.f13690a, ", scenarioId=", this.f13691b, ", name=");
        t8.append(this.f13692c);
        t8.append(", priority=");
        t8.append(this.f13693d);
        t8.append(", repeatCount=");
        t8.append(this.f13694e);
        t8.append(", isRepeatInfinite=");
        t8.append(this.f13695f);
        t8.append(", repeatDelayMs=");
        t8.append(this.f13696g);
        t8.append(", fromPosition=");
        t8.append(this.f13697h);
        t8.append(", toPosition=");
        t8.append(this.f13698i);
        t8.append(", swipeDurationMs=");
        t8.append(this.j);
        t8.append(")");
        return t8.toString();
    }
}
