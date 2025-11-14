package kotlinx.serialization.json.internal;

import G5.e;
import N.f;
import O7.Y;
import X6.r;
import X7.i;
import Z7.V;
import a8.k;
import b8.g;
import b8.t;
import kotlin.NoWhenBranchMatchedException;
import o6.j;
import q4.X;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final f f12172a;

    /* renamed from: b, reason: collision with root package name */
    public final a8.b f12173b;

    /* renamed from: c, reason: collision with root package name */
    public final t f12174c;

    /* renamed from: d, reason: collision with root package name */
    public final c[] f12175d;

    /* renamed from: e, reason: collision with root package name */
    public final e f12176e;

    /* renamed from: f, reason: collision with root package name */
    public final r f12177f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12178g;

    /* renamed from: h, reason: collision with root package name */
    public String f12179h;

    /* renamed from: i, reason: collision with root package name */
    public String f12180i;

    public c(f fVar, a8.b bVar, t tVar, c[] cVarArr) {
        j.e(fVar, "composer");
        j.e(bVar, "json");
        this.f12172a = fVar;
        this.f12173b = bVar;
        this.f12174c = tVar;
        this.f12175d = cVarArr;
        this.f12176e = bVar.f8281b;
        this.f12177f = bVar.f8280a;
        int ordinal = tVar.ordinal();
        if (cVarArr != null) {
            c cVar = cVarArr[ordinal];
            if (cVar != null || cVar != this) {
                cVarArr[ordinal] = this;
            }
        }
    }

    public final c a(X7.f fVar) {
        c cVar;
        j.e(fVar, "descriptor");
        a8.b bVar = this.f12173b;
        t p8 = b8.j.p(fVar, bVar);
        char c6 = p8.f9294d;
        f fVar2 = this.f12172a;
        fVar2.g(c6);
        fVar2.f3524e = true;
        String str = this.f12179h;
        if (str != null) {
            String str2 = this.f12180i;
            if (str2 == null) {
                str2 = fVar.b();
            }
            fVar2.e();
            t(str);
            fVar2.g(':');
            t(str2);
            this.f12179h = null;
            this.f12180i = null;
        }
        if (this.f12174c == p8) {
            return this;
        }
        c[] cVarArr = this.f12175d;
        if (cVarArr != null && (cVar = cVarArr[p8.ordinal()]) != null) {
            return cVar;
        }
        return new c(fVar2, bVar, p8, cVarArr);
    }

    public final void b(boolean z8) {
        if (this.f12178g) {
            t(String.valueOf(z8));
        } else {
            ((Y) this.f12172a.f3525f).h(String.valueOf(z8));
        }
    }

    public final void c(X7.f fVar, int i4, boolean z8) {
        j.e(fVar, "descriptor");
        g(fVar, i4);
        b(z8);
    }

    public final void d(byte b4) {
        if (this.f12178g) {
            t(String.valueOf((int) b4));
        } else {
            this.f12172a.f(b4);
        }
    }

    public final void e(char c6) {
        t(String.valueOf(c6));
    }

    public final void f(double d2) {
        boolean z8 = this.f12178g;
        f fVar = this.f12172a;
        if (z8) {
            t(String.valueOf(d2));
        } else {
            ((Y) fVar.f3525f).h(String.valueOf(d2));
        }
        this.f12177f.getClass();
        if (Math.abs(d2) <= Double.MAX_VALUE) {
        } else {
            throw b8.j.b(Double.valueOf(d2), ((Y) fVar.f3525f).toString());
        }
    }

    public final void g(X7.f fVar, int i4) {
        j.e(fVar, "descriptor");
        int ordinal = this.f12174c.ordinal();
        f fVar2 = this.f12172a;
        boolean z8 = true;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (!fVar2.f3524e) {
                        fVar2.g(',');
                    }
                    fVar2.e();
                    a8.b bVar = this.f12173b;
                    j.e(bVar, "json");
                    b8.j.o(fVar, bVar);
                    t(fVar.d(i4));
                    fVar2.g(':');
                    fVar2.n();
                    return;
                }
                if (i4 == 0) {
                    this.f12178g = true;
                }
                if (i4 == 1) {
                    fVar2.g(',');
                    fVar2.n();
                    this.f12178g = false;
                    return;
                }
                return;
            }
            if (!fVar2.f3524e) {
                if (i4 % 2 == 0) {
                    fVar2.g(',');
                    fVar2.e();
                } else {
                    fVar2.g(':');
                    fVar2.n();
                    z8 = false;
                }
                this.f12178g = z8;
                return;
            }
            this.f12178g = true;
            fVar2.e();
            return;
        }
        if (!fVar2.f3524e) {
            fVar2.g(',');
        }
        fVar2.e();
    }

    public final void h(float f8) {
        boolean z8 = this.f12178g;
        f fVar = this.f12172a;
        if (z8) {
            t(String.valueOf(f8));
        } else {
            ((Y) fVar.f3525f).h(String.valueOf(f8));
        }
        this.f12177f.getClass();
        if (Math.abs(f8) <= Float.MAX_VALUE) {
        } else {
            throw b8.j.b(Float.valueOf(f8), ((Y) fVar.f3525f).toString());
        }
    }

    public final c i(X7.f fVar) {
        j.e(fVar, "descriptor");
        boolean a3 = b8.r.a(fVar);
        t tVar = this.f12174c;
        a8.b bVar = this.f12173b;
        f fVar2 = this.f12172a;
        if (a3) {
            if (!(fVar2 instanceof g)) {
                fVar2 = new g((Y) fVar2.f3525f, this.f12178g);
            }
            return new c(fVar2, bVar, tVar, null);
        }
        if (fVar.g() && fVar.equals(k.f8289a)) {
            if (!(fVar2 instanceof b8.f)) {
                fVar2 = new b8.f((Y) fVar2.f3525f, this.f12178g);
            }
            return new c(fVar2, bVar, tVar, null);
        }
        if (this.f12179h != null) {
            this.f12180i = fVar.b();
        }
        return this;
    }

    public final c j(V v8, int i4) {
        j.e(v8, "descriptor");
        g(v8, i4);
        return i(v8.j(i4));
    }

    public final void k(int i4) {
        if (this.f12178g) {
            t(String.valueOf(i4));
        } else {
            this.f12172a.i(i4);
        }
    }

    public final void l(int i4, int i8, X7.f fVar) {
        j.e(fVar, "descriptor");
        g(fVar, i4);
        k(i8);
    }

    public final void m(long j) {
        if (this.f12178g) {
            t(String.valueOf(j));
        } else {
            this.f12172a.j(j);
        }
    }

    public final void n(X7.f fVar, int i4, long j) {
        j.e(fVar, "descriptor");
        g(fVar, i4);
        m(j);
    }

    public final void o() {
        this.f12172a.k("null");
    }

    public final void p(X7.f fVar, int i4, V7.a aVar, Object obj) {
        j.e(aVar, "serializer");
        if (obj == null && !this.f12177f.f7035b) {
            return;
        }
        j.e(aVar, "serializer");
        g(fVar, i4);
        if (aVar.d().h()) {
            r(aVar, obj);
        } else if (obj == null) {
            o();
        } else {
            r(aVar, obj);
        }
    }

    public final void q(X7.f fVar, int i4, V7.a aVar, Object obj) {
        j.e(fVar, "descriptor");
        j.e(aVar, "serializer");
        g(fVar, i4);
        r(aVar, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (o6.j.a(r1, X7.i.f7076h) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (((a8.a) r1.f7039f) != a8.a.f8276d) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(V7.a aVar, Object obj) {
        String h8;
        j.e(aVar, "serializer");
        a8.b bVar = this.f12173b;
        r rVar = bVar.f8280a;
        rVar.getClass();
        boolean z8 = aVar instanceof V7.b;
        if (!z8) {
            int ordinal = ((a8.a) rVar.f7039f).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    X e9 = aVar.d().e();
                    if (!j.a(e9, i.f7073e)) {
                    }
                    h8 = b8.j.h(aVar.d(), bVar);
                }
            }
            h8 = null;
        }
        if (z8) {
            V7.b bVar2 = (V7.b) aVar;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + bVar2.d() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            j.e(bVar2, "<this>");
            j.e(obj, "value");
            bVar2.getClass();
            this.f12176e.getClass();
            j.e(null, "baseClass");
            throw null;
        }
        if (h8 != null) {
            String b4 = aVar.d().b();
            this.f12179h = h8;
            this.f12180i = b4;
        }
        aVar.c(this, obj);
    }

    public final void s(short s8) {
        if (this.f12178g) {
            t(String.valueOf((int) s8));
        } else {
            this.f12172a.l(s8);
        }
    }

    public final void t(String str) {
        j.e(str, "value");
        this.f12172a.m(str);
    }

    public final void u(X7.f fVar, int i4, String str) {
        j.e(str, "value");
        g(fVar, i4);
        t(str);
    }

    public final void v(X7.f fVar) {
        j.e(fVar, "descriptor");
        f fVar2 = this.f12172a;
        fVar2.getClass();
        fVar2.f3524e = false;
        fVar2.g(this.f12174c.f9295e);
    }

    public final boolean w(X7.f fVar) {
        this.f12177f.getClass();
        return false;
    }
}
