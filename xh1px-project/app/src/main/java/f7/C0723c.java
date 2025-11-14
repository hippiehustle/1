package f7;

import I7.m;
import I7.v;
import o6.j;

/* renamed from: f7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0723c f10796c = new C0723c("");

    /* renamed from: a, reason: collision with root package name */
    public final C0724d f10797a;

    /* renamed from: b, reason: collision with root package name */
    public transient C0723c f10798b;

    public C0723c(String str) {
        j.e(str, "fqName");
        this.f10797a = new C0724d(this, str);
    }

    public final C0723c a(C0725e c0725e) {
        j.e(c0725e, "name");
        return new C0723c(this.f10797a.a(c0725e), this);
    }

    public final C0723c b() {
        C0723c c0723c = this.f10798b;
        if (c0723c != null) {
            return c0723c;
        }
        C0724d c0724d = this.f10797a;
        if (!c0724d.c()) {
            C0724d c0724d2 = c0724d.f10802c;
            if (c0724d2 == null) {
                if (!c0724d.c()) {
                    c0724d.b();
                    c0724d2 = c0724d.f10802c;
                    j.b(c0724d2);
                } else {
                    throw new IllegalStateException("root");
                }
            }
            C0723c c0723c2 = new C0723c(c0724d2);
            this.f10798b = c0723c2;
            return c0723c2;
        }
        throw new IllegalStateException("root");
    }

    public final boolean c(C0725e c0725e) {
        j.e(c0725e, "segment");
        C0724d c0724d = this.f10797a;
        c0724d.getClass();
        String str = c0724d.f10800a;
        if (!c0724d.c()) {
            int h02 = m.h0(str, '.', 0, 6);
            if (h02 == -1) {
                h02 = str.length();
            }
            int i4 = h02;
            String b4 = c0725e.b();
            j.d(b4, "asString(...)");
            if (i4 == b4.length() && v.X(0, 0, i4, c0724d.f10800a, b4, false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0723c)) {
            return false;
        }
        if (j.a(this.f10797a, ((C0723c) obj).f10797a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10797a.f10800a.hashCode();
    }

    public final String toString() {
        return this.f10797a.toString();
    }

    public C0723c(C0724d c0724d) {
        this.f10797a = c0724d;
    }

    public C0723c(C0724d c0724d, C0723c c0723c) {
        this.f10797a = c0724d;
        this.f10798b = c0723c;
    }
}
