package f7;

import I7.m;
import I7.v;
import o6.j;

/* renamed from: f7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722b {

    /* renamed from: a, reason: collision with root package name */
    public final C0723c f10793a;

    /* renamed from: b, reason: collision with root package name */
    public final C0723c f10794b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10795c;

    public C0722b(C0723c c0723c, C0723c c0723c2, boolean z8) {
        j.e(c0723c, "packageFqName");
        j.e(c0723c2, "relativeClassName");
        this.f10793a = c0723c;
        this.f10794b = c0723c2;
        this.f10795c = z8;
        c0723c2.f10797a.c();
    }

    public static final String c(C0723c c0723c) {
        String str = c0723c.f10797a.f10800a;
        if (m.c0(str, '/')) {
            return "`" + str + '`';
        }
        return str;
    }

    public final C0723c a() {
        C0723c c0723c = this.f10793a;
        boolean c6 = c0723c.f10797a.c();
        C0723c c0723c2 = this.f10794b;
        if (c6) {
            return c0723c2;
        }
        return new C0723c(c0723c.f10797a.f10800a + '.' + c0723c2.f10797a.f10800a);
    }

    public final String b() {
        C0723c c0723c = this.f10793a;
        boolean c6 = c0723c.f10797a.c();
        C0723c c0723c2 = this.f10794b;
        if (c6) {
            return c(c0723c2);
        }
        return v.Y(c0723c.f10797a.f10800a, '.', '/') + "/" + c(c0723c2);
    }

    public final C0722b d(C0725e c0725e) {
        j.e(c0725e, "name");
        return new C0722b(this.f10793a, this.f10794b.a(c0725e), this.f10795c);
    }

    public final C0722b e() {
        C0723c b4 = this.f10794b.b();
        if (!b4.f10797a.c()) {
            return new C0722b(this.f10793a, b4, this.f10795c);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0722b)) {
            return false;
        }
        C0722b c0722b = (C0722b) obj;
        if (j.a(this.f10793a, c0722b.f10793a) && j.a(this.f10794b, c0722b.f10794b) && this.f10795c == c0722b.f10795c) {
            return true;
        }
        return false;
    }

    public final C0725e f() {
        return this.f10794b.f10797a.f();
    }

    public final boolean g() {
        return !this.f10794b.b().f10797a.c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10795c) + ((this.f10794b.hashCode() + (this.f10793a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        if (this.f10793a.f10797a.c()) {
            return "/" + b();
        }
        return b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0722b(C0723c c0723c, C0725e c0725e) {
        this(c0723c, E2.d.U(c0725e), false);
        j.e(c0723c, "packageFqName");
        j.e(c0725e, "topLevelName");
        C0723c c0723c2 = C0723c.f10796c;
    }
}
