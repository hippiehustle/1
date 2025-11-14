package f7;

import I7.m;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import o6.j;

/* renamed from: f7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724d {

    /* renamed from: e, reason: collision with root package name */
    public static final C0725e f10799e = C0725e.g("<root>");

    /* renamed from: a, reason: collision with root package name */
    public final String f10800a;

    /* renamed from: b, reason: collision with root package name */
    public transient C0723c f10801b;

    /* renamed from: c, reason: collision with root package name */
    public transient C0724d f10802c;

    /* renamed from: d, reason: collision with root package name */
    public transient C0725e f10803d;

    static {
        j.d(Pattern.compile("\\."), "compile(...)");
    }

    public C0724d(C0723c c0723c, String str) {
        j.e(str, "fqName");
        this.f10800a = str;
        this.f10801b = c0723c;
    }

    public static final List e(C0724d c0724d) {
        if (c0724d.c()) {
            return new ArrayList();
        }
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
        List e9 = e(c0724d2);
        e9.add(c0724d.f());
        return e9;
    }

    public final C0724d a(C0725e c0725e) {
        String str;
        j.e(c0725e, "name");
        if (c()) {
            str = c0725e.b();
        } else {
            str = this.f10800a + '.' + c0725e.b();
        }
        j.b(str);
        return new C0724d(str, this, c0725e);
    }

    public final void b() {
        String str = this.f10800a;
        int length = str.length() - 1;
        boolean z8 = false;
        while (true) {
            if (length >= 0) {
                char charAt = str.charAt(length);
                if (charAt == '.' && !z8) {
                    break;
                }
                if (charAt == '`') {
                    z8 = !z8;
                } else if (charAt == '\\') {
                    length--;
                }
                length--;
            } else {
                length = -1;
                break;
            }
        }
        if (length >= 0) {
            String substring = str.substring(length + 1);
            j.d(substring, "substring(...)");
            this.f10803d = C0725e.d(substring);
            String substring2 = str.substring(0, length);
            j.d(substring2, "substring(...)");
            this.f10802c = new C0724d(substring2);
            return;
        }
        this.f10803d = C0725e.d(str);
        this.f10802c = C0723c.f10796c.f10797a;
    }

    public final boolean c() {
        if (this.f10800a.length() == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f10801b == null && m.h0(this.f10800a, '<', 0, 6) >= 0) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0724d)) {
            return false;
        }
        if (j.a(this.f10800a, ((C0724d) obj).f10800a)) {
            return true;
        }
        return false;
    }

    public final C0725e f() {
        C0725e c0725e = this.f10803d;
        if (c0725e != null) {
            return c0725e;
        }
        if (!c()) {
            b();
            C0725e c0725e2 = this.f10803d;
            j.b(c0725e2);
            return c0725e2;
        }
        throw new IllegalStateException("root");
    }

    public final C0723c g() {
        C0723c c0723c = this.f10801b;
        if (c0723c == null) {
            C0723c c0723c2 = new C0723c(this);
            this.f10801b = c0723c2;
            return c0723c2;
        }
        return c0723c;
    }

    public final int hashCode() {
        return this.f10800a.hashCode();
    }

    public final String toString() {
        if (c()) {
            String b4 = f10799e.b();
            j.d(b4, "asString(...)");
            return b4;
        }
        return this.f10800a;
    }

    public C0724d(String str) {
        this.f10800a = str;
    }

    public C0724d(String str, C0724d c0724d, C0725e c0725e) {
        this.f10800a = str;
        this.f10802c = c0724d;
        this.f10803d = c0725e;
    }
}
