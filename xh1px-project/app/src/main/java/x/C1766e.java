package x;

import g0.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1766e {

    /* renamed from: o, reason: collision with root package name */
    public static int f16039o = 1000;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f16040p = true;

    /* renamed from: b, reason: collision with root package name */
    public final C1768g f16042b;

    /* renamed from: e, reason: collision with root package name */
    public C1764c[] f16045e;
    public final b0 k;

    /* renamed from: n, reason: collision with root package name */
    public C1764c f16052n;

    /* renamed from: a, reason: collision with root package name */
    public int f16041a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f16043c = 32;

    /* renamed from: d, reason: collision with root package name */
    public int f16044d = 32;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16046f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f16047g = new boolean[32];

    /* renamed from: h, reason: collision with root package name */
    public int f16048h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f16049i = 0;
    public int j = 32;

    /* renamed from: l, reason: collision with root package name */
    public C1770i[] f16050l = new C1770i[f16039o];

    /* renamed from: m, reason: collision with root package name */
    public int f16051m = 0;

    /* JADX WARN: Type inference failed for: r1v2, types: [x.g, x.c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [g0.b0, java.lang.Object] */
    public C1766e() {
        this.f16045e = null;
        this.f16045e = new C1764c[32];
        q();
        ?? obj = new Object();
        obj.f10987d = new O.c();
        obj.f10988e = new O.c();
        obj.f10989f = new O.c();
        obj.f10990g = new C1770i[32];
        this.k = obj;
        ?? c1764c = new C1764c(obj);
        c1764c.f16055f = new C1770i[128];
        c1764c.f16056g = new C1770i[128];
        c1764c.f16057h = 0;
        c1764c.f16058i = new C1767f(c1764c);
        this.f16042b = c1764c;
        if (f16040p) {
            this.f16052n = new C1765d(obj);
        } else {
            this.f16052n = new C1764c(obj);
        }
    }

    public static int m(Object obj) {
        C1770i c1770i = ((y.c) obj).f16332g;
        if (c1770i != null) {
            return (int) (c1770i.f16064e + 0.5f);
        }
        return 0;
    }

    public final C1770i a(int i4) {
        C1770i c1770i = (C1770i) ((O.c) this.k.f10989f).a();
        if (c1770i == null) {
            c1770i = new C1770i(i4);
            c1770i.f16069l = i4;
        } else {
            c1770i.c();
            c1770i.f16069l = i4;
        }
        int i8 = this.f16051m;
        int i9 = f16039o;
        if (i8 >= i9) {
            int i10 = i9 * 2;
            f16039o = i10;
            this.f16050l = (C1770i[]) Arrays.copyOf(this.f16050l, i10);
        }
        C1770i[] c1770iArr = this.f16050l;
        int i11 = this.f16051m;
        this.f16051m = i11 + 1;
        c1770iArr[i11] = c1770i;
        return c1770i;
    }

    public final void b(C1770i c1770i, C1770i c1770i2, int i4, float f8, C1770i c1770i3, C1770i c1770i4, int i8, int i9) {
        C1764c k = k();
        if (c1770i2 == c1770i3) {
            k.f16037d.g(c1770i, 1.0f);
            k.f16037d.g(c1770i4, 1.0f);
            k.f16037d.g(c1770i2, -2.0f);
        } else if (f8 == 0.5f) {
            k.f16037d.g(c1770i, 1.0f);
            k.f16037d.g(c1770i2, -1.0f);
            k.f16037d.g(c1770i3, -1.0f);
            k.f16037d.g(c1770i4, 1.0f);
            if (i4 > 0 || i8 > 0) {
                k.f16035b = (-i4) + i8;
            }
        } else if (f8 <= 0.0f) {
            k.f16037d.g(c1770i, -1.0f);
            k.f16037d.g(c1770i2, 1.0f);
            k.f16035b = i4;
        } else if (f8 >= 1.0f) {
            k.f16037d.g(c1770i4, -1.0f);
            k.f16037d.g(c1770i3, 1.0f);
            k.f16035b = -i8;
        } else {
            float f9 = 1.0f - f8;
            k.f16037d.g(c1770i, f9 * 1.0f);
            k.f16037d.g(c1770i2, f9 * (-1.0f));
            k.f16037d.g(c1770i3, (-1.0f) * f8);
            k.f16037d.g(c1770i4, 1.0f * f8);
            if (i4 > 0 || i8 > 0) {
                k.f16035b = (i8 * f8) + ((-i4) * f9);
            }
        }
        if (i9 != 8) {
            k.a(this, i9);
        }
        c(k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bc, code lost:
    
        if (r4.k <= 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bf, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c9, code lost:
    
        if (r4.k <= 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00de, code lost:
    
        if (r4.k <= 1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e1, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00eb, code lost:
    
        if (r4.k <= 1) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C1764c c1764c) {
        boolean z8;
        boolean z9;
        C1770i e9;
        if (this.f16049i + 1 >= this.j || this.f16048h + 1 >= this.f16044d) {
            n();
        }
        if (!c1764c.f16038e) {
            ArrayList arrayList = c1764c.f16036c;
            if (this.f16045e.length != 0) {
                boolean z10 = false;
                while (!z10) {
                    int f8 = c1764c.f16037d.f();
                    for (int i4 = 0; i4 < f8; i4++) {
                        C1770i h8 = c1764c.f16037d.h(i4);
                        if (h8.f16062c != -1 || h8.f16065f) {
                            arrayList.add(h8);
                        }
                    }
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C1770i c1770i = (C1770i) it.next();
                            if (c1770i.f16065f) {
                                c1764c.g(c1770i, true);
                            } else {
                                c1764c.h(this.f16045e[c1770i.f16062c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z10 = true;
                    }
                }
            }
            float f9 = 0.0f;
            if (c1764c.f16034a != null || c1764c.f16035b != 0.0f || c1764c.f16037d.f() != 0) {
                float f10 = c1764c.f16035b;
                if (f10 < 0.0f) {
                    c1764c.f16035b = f10 * (-1.0f);
                    c1764c.f16037d.k();
                }
                int f11 = c1764c.f16037d.f();
                float f12 = 0.0f;
                float f13 = 0.0f;
                C1770i c1770i2 = null;
                C1770i c1770i3 = null;
                int i8 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (i8 < f11) {
                    float a3 = c1764c.f16037d.a(i8);
                    C1770i h9 = c1764c.f16037d.h(i8);
                    float f14 = f9;
                    if (h9.f16069l == 1) {
                        if (c1770i2 != null) {
                            if (f12 <= a3) {
                                if (!z11) {
                                    if (h9.k > 1) {
                                    }
                                }
                            }
                            z11 = true;
                        }
                        c1770i2 = h9;
                        f12 = a3;
                    } else if (c1770i2 == null && a3 < f14) {
                        if (c1770i3 != null) {
                            if (f13 <= a3) {
                                if (!z12) {
                                    if (h9.k > 1) {
                                    }
                                }
                            }
                            z12 = true;
                        }
                        c1770i3 = h9;
                        f13 = a3;
                    }
                    i8++;
                    f9 = f14;
                }
                float f15 = f9;
                if (c1770i2 == null) {
                    c1770i2 = c1770i3;
                }
                if (c1770i2 == null) {
                    z9 = true;
                } else {
                    c1764c.f(c1770i2);
                    z9 = false;
                }
                if (c1764c.f16037d.f() == 0) {
                    c1764c.f16038e = true;
                }
                if (z9) {
                    if (this.f16048h + 1 >= this.f16044d) {
                        n();
                    }
                    C1770i a4 = a(3);
                    int i9 = this.f16041a + 1;
                    this.f16041a = i9;
                    this.f16048h++;
                    a4.f16061b = i9;
                    ((C1770i[]) this.k.f10990g)[i9] = a4;
                    c1764c.f16034a = a4;
                    h(c1764c);
                    C1764c c1764c2 = this.f16052n;
                    c1764c2.f16034a = null;
                    c1764c2.f16037d.clear();
                    for (int i10 = 0; i10 < c1764c.f16037d.f(); i10++) {
                        c1764c2.f16037d.e(c1764c.f16037d.h(i10), c1764c.f16037d.a(i10), true);
                    }
                    p(this.f16052n);
                    if (a4.f16062c == -1) {
                        if (c1764c.f16034a == a4 && (e9 = c1764c.e(null, a4)) != null) {
                            c1764c.f(e9);
                        }
                        if (!c1764c.f16038e) {
                            c1764c.f16034a.d(c1764c);
                        }
                        this.f16049i--;
                    }
                    z8 = true;
                } else {
                    z8 = false;
                }
                C1770i c1770i4 = c1764c.f16034a;
                if (c1770i4 != null) {
                    if (c1770i4.f16069l != 1 && c1764c.f16035b < f15) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            z8 = false;
        }
        if (!z8) {
            h(c1764c);
        }
    }

    public final void d(C1770i c1770i, int i4) {
        int i8 = c1770i.f16062c;
        if (i8 == -1) {
            c1770i.f16064e = i4;
            c1770i.f16065f = true;
            int i9 = c1770i.j;
            for (int i10 = 0; i10 < i9; i10++) {
                c1770i.f16068i[i10].g(c1770i, false);
            }
            c1770i.j = 0;
            return;
        }
        if (i8 != -1) {
            C1764c c1764c = this.f16045e[i8];
            if (c1764c.f16038e) {
                c1764c.f16035b = i4;
                return;
            }
            if (c1764c.f16037d.f() == 0) {
                c1764c.f16038e = true;
                c1764c.f16035b = i4;
                return;
            }
            C1764c k = k();
            if (i4 < 0) {
                k.f16035b = i4 * (-1);
                k.f16037d.g(c1770i, 1.0f);
            } else {
                k.f16035b = i4;
                k.f16037d.g(c1770i, -1.0f);
            }
            c(k);
            return;
        }
        C1764c k6 = k();
        k6.f16034a = c1770i;
        float f8 = i4;
        c1770i.f16064e = f8;
        k6.f16035b = f8;
        k6.f16038e = true;
        c(k6);
    }

    public final void e(C1770i c1770i, C1770i c1770i2, int i4, int i8) {
        boolean z8 = false;
        if (i8 == 8 && c1770i2.f16065f && c1770i.f16062c == -1) {
            c1770i.f16064e = c1770i2.f16064e + i4;
            c1770i.f16065f = true;
            int i9 = c1770i.j;
            for (int i10 = 0; i10 < i9; i10++) {
                c1770i.f16068i[i10].g(c1770i, false);
            }
            c1770i.j = 0;
            return;
        }
        C1764c k = k();
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z8 = true;
            }
            k.f16035b = i4;
        }
        if (!z8) {
            k.f16037d.g(c1770i, -1.0f);
            k.f16037d.g(c1770i2, 1.0f);
        } else {
            k.f16037d.g(c1770i, 1.0f);
            k.f16037d.g(c1770i2, -1.0f);
        }
        if (i8 != 8) {
            k.a(this, i8);
        }
        c(k);
    }

    public final void f(C1770i c1770i, C1770i c1770i2, int i4, int i8) {
        C1764c k = k();
        C1770i l6 = l();
        l6.f16063d = 0;
        k.b(c1770i, c1770i2, l6, i4);
        if (i8 != 8) {
            k.f16037d.g(i(i8), (int) (k.f16037d.b(l6) * (-1.0f)));
        }
        c(k);
    }

    public final void g(C1770i c1770i, C1770i c1770i2, int i4, int i8) {
        C1764c k = k();
        C1770i l6 = l();
        l6.f16063d = 0;
        k.c(c1770i, c1770i2, l6, i4);
        if (i8 != 8) {
            k.f16037d.g(i(i8), (int) (k.f16037d.b(l6) * (-1.0f)));
        }
        c(k);
    }

    public final void h(C1764c c1764c) {
        boolean z8 = f16040p;
        b0 b0Var = this.k;
        if (z8) {
            C1764c c1764c2 = this.f16045e[this.f16049i];
            if (c1764c2 != null) {
                ((O.c) b0Var.f10987d).b(c1764c2);
            }
        } else {
            C1764c c1764c3 = this.f16045e[this.f16049i];
            if (c1764c3 != null) {
                ((O.c) b0Var.f10988e).b(c1764c3);
            }
        }
        C1764c[] c1764cArr = this.f16045e;
        int i4 = this.f16049i;
        c1764cArr[i4] = c1764c;
        C1770i c1770i = c1764c.f16034a;
        c1770i.f16062c = i4;
        this.f16049i = i4 + 1;
        c1770i.d(c1764c);
    }

    public final C1770i i(int i4) {
        if (this.f16048h + 1 >= this.f16044d) {
            n();
        }
        C1770i a3 = a(4);
        float[] fArr = a3.f16067h;
        int i8 = this.f16041a + 1;
        this.f16041a = i8;
        this.f16048h++;
        a3.f16061b = i8;
        a3.f16063d = i4;
        ((C1770i[]) this.k.f10990g)[i8] = a3;
        C1768g c1768g = this.f16042b;
        c1768g.f16058i.f16053d = a3;
        Arrays.fill(fArr, 0.0f);
        fArr[a3.f16063d] = 1.0f;
        c1768g.i(a3);
        return a3;
    }

    public final C1770i j(Object obj) {
        if (obj != null) {
            if (this.f16048h + 1 >= this.f16044d) {
                n();
            }
            if (obj instanceof y.c) {
                y.c cVar = (y.c) obj;
                C1770i c1770i = cVar.f16332g;
                if (c1770i == null) {
                    cVar.i();
                    c1770i = cVar.f16332g;
                }
                int i4 = c1770i.f16061b;
                b0 b0Var = this.k;
                if (i4 != -1 && i4 <= this.f16041a && ((C1770i[]) b0Var.f10990g)[i4] != null) {
                    return c1770i;
                }
                if (i4 != -1) {
                    c1770i.c();
                }
                int i8 = this.f16041a + 1;
                this.f16041a = i8;
                this.f16048h++;
                c1770i.f16061b = i8;
                c1770i.f16069l = 1;
                ((C1770i[]) b0Var.f10990g)[i8] = c1770i;
                return c1770i;
            }
            return null;
        }
        return null;
    }

    public final C1764c k() {
        boolean z8 = f16040p;
        b0 b0Var = this.k;
        if (z8) {
            C1764c c1764c = (C1764c) ((O.c) b0Var.f10987d).a();
            if (c1764c == null) {
                return new C1765d(b0Var);
            }
            c1764c.f16034a = null;
            c1764c.f16037d.clear();
            c1764c.f16035b = 0.0f;
            c1764c.f16038e = false;
            return c1764c;
        }
        C1764c c1764c2 = (C1764c) ((O.c) b0Var.f10988e).a();
        if (c1764c2 == null) {
            return new C1764c(b0Var);
        }
        c1764c2.f16034a = null;
        c1764c2.f16037d.clear();
        c1764c2.f16035b = 0.0f;
        c1764c2.f16038e = false;
        return c1764c2;
    }

    public final C1770i l() {
        if (this.f16048h + 1 >= this.f16044d) {
            n();
        }
        C1770i a3 = a(3);
        int i4 = this.f16041a + 1;
        this.f16041a = i4;
        this.f16048h++;
        a3.f16061b = i4;
        ((C1770i[]) this.k.f10990g)[i4] = a3;
        return a3;
    }

    public final void n() {
        int i4 = this.f16043c * 2;
        this.f16043c = i4;
        this.f16045e = (C1764c[]) Arrays.copyOf(this.f16045e, i4);
        b0 b0Var = this.k;
        b0Var.f10990g = (C1770i[]) Arrays.copyOf((C1770i[]) b0Var.f10990g, this.f16043c);
        int i8 = this.f16043c;
        this.f16047g = new boolean[i8];
        this.f16044d = i8;
        this.j = i8;
    }

    public final void o(C1768g c1768g) {
        b0 b0Var;
        int i4 = 0;
        while (true) {
            if (i4 >= this.f16049i) {
                break;
            }
            C1764c c1764c = this.f16045e[i4];
            int i8 = 1;
            if (c1764c.f16034a.f16069l != 1) {
                float f8 = 0.0f;
                if (c1764c.f16035b < 0.0f) {
                    boolean z8 = false;
                    int i9 = 0;
                    while (!z8) {
                        i9 += i8;
                        float f9 = Float.MAX_VALUE;
                        int i10 = -1;
                        int i11 = -1;
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            int i14 = this.f16049i;
                            b0Var = this.k;
                            if (i12 >= i14) {
                                break;
                            }
                            C1764c c1764c2 = this.f16045e[i12];
                            if (c1764c2.f16034a.f16069l != i8 && !c1764c2.f16038e && c1764c2.f16035b < f8) {
                                int i15 = i8;
                                while (i15 < this.f16048h) {
                                    C1770i c1770i = ((C1770i[]) b0Var.f10990g)[i15];
                                    float b4 = c1764c2.f16037d.b(c1770i);
                                    if (b4 > f8) {
                                        for (int i16 = 0; i16 < 9; i16++) {
                                            float f10 = c1770i.f16066g[i16] / b4;
                                            if ((f10 < f9 && i16 == i13) || i16 > i13) {
                                                i13 = i16;
                                                f9 = f10;
                                                i10 = i12;
                                                i11 = i15;
                                            }
                                        }
                                    }
                                    i15++;
                                    f8 = 0.0f;
                                }
                            }
                            i12++;
                            f8 = 0.0f;
                            i8 = 1;
                        }
                        if (i10 != -1) {
                            C1764c c1764c3 = this.f16045e[i10];
                            c1764c3.f16034a.f16062c = -1;
                            c1764c3.f(((C1770i[]) b0Var.f10990g)[i11]);
                            C1770i c1770i2 = c1764c3.f16034a;
                            c1770i2.f16062c = i10;
                            c1770i2.d(c1764c3);
                        } else {
                            z8 = true;
                        }
                        if (i9 > this.f16048h / 2) {
                            z8 = true;
                        }
                        f8 = 0.0f;
                        i8 = 1;
                    }
                }
            }
            i4++;
        }
        p(c1768g);
        for (int i17 = 0; i17 < this.f16049i; i17++) {
            C1764c c1764c4 = this.f16045e[i17];
            c1764c4.f16034a.f16064e = c1764c4.f16035b;
        }
    }

    public final void p(C1764c c1764c) {
        for (int i4 = 0; i4 < this.f16048h; i4++) {
            this.f16047g[i4] = false;
        }
        boolean z8 = false;
        int i8 = 0;
        while (!z8) {
            i8++;
            if (i8 < this.f16048h * 2) {
                C1770i c1770i = c1764c.f16034a;
                if (c1770i != null) {
                    this.f16047g[c1770i.f16061b] = true;
                }
                C1770i d2 = c1764c.d(this.f16047g);
                if (d2 != null) {
                    boolean[] zArr = this.f16047g;
                    int i9 = d2.f16061b;
                    if (!zArr[i9]) {
                        zArr[i9] = true;
                    } else {
                        return;
                    }
                }
                if (d2 != null) {
                    float f8 = Float.MAX_VALUE;
                    int i10 = -1;
                    for (int i11 = 0; i11 < this.f16049i; i11++) {
                        C1764c c1764c2 = this.f16045e[i11];
                        if (c1764c2.f16034a.f16069l != 1 && !c1764c2.f16038e && c1764c2.f16037d.j(d2)) {
                            float b4 = c1764c2.f16037d.b(d2);
                            if (b4 < 0.0f) {
                                float f9 = (-c1764c2.f16035b) / b4;
                                if (f9 < f8) {
                                    i10 = i11;
                                    f8 = f9;
                                }
                            }
                        }
                    }
                    if (i10 > -1) {
                        C1764c c1764c3 = this.f16045e[i10];
                        c1764c3.f16034a.f16062c = -1;
                        c1764c3.f(d2);
                        C1770i c1770i2 = c1764c3.f16034a;
                        c1770i2.f16062c = i10;
                        c1770i2.d(c1764c3);
                    }
                } else {
                    z8 = true;
                }
            } else {
                return;
            }
        }
    }

    public final void q() {
        boolean z8 = f16040p;
        b0 b0Var = this.k;
        int i4 = 0;
        if (z8) {
            while (true) {
                C1764c[] c1764cArr = this.f16045e;
                if (i4 < c1764cArr.length) {
                    C1764c c1764c = c1764cArr[i4];
                    if (c1764c != null) {
                        ((O.c) b0Var.f10987d).b(c1764c);
                    }
                    this.f16045e[i4] = null;
                    i4++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C1764c[] c1764cArr2 = this.f16045e;
                if (i4 < c1764cArr2.length) {
                    C1764c c1764c2 = c1764cArr2[i4];
                    if (c1764c2 != null) {
                        ((O.c) b0Var.f10988e).b(c1764c2);
                    }
                    this.f16045e[i4] = null;
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public final void r() {
        b0 b0Var;
        int i4 = 0;
        while (true) {
            b0Var = this.k;
            C1770i[] c1770iArr = (C1770i[]) b0Var.f10990g;
            if (i4 >= c1770iArr.length) {
                break;
            }
            C1770i c1770i = c1770iArr[i4];
            if (c1770i != null) {
                c1770i.c();
            }
            i4++;
        }
        O.c cVar = (O.c) b0Var.f10989f;
        C1770i[] c1770iArr2 = this.f16050l;
        int i8 = this.f16051m;
        cVar.getClass();
        if (i8 > c1770iArr2.length) {
            i8 = c1770iArr2.length;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            C1770i c1770i2 = c1770iArr2[i9];
            int i10 = cVar.f3850c;
            Object[] objArr = cVar.f3849b;
            if (i10 < objArr.length) {
                objArr[i10] = c1770i2;
                cVar.f3850c = i10 + 1;
            }
        }
        this.f16051m = 0;
        Arrays.fill((C1770i[]) b0Var.f10990g, (Object) null);
        this.f16041a = 0;
        C1768g c1768g = this.f16042b;
        c1768g.f16057h = 0;
        c1768g.f16035b = 0.0f;
        this.f16048h = 1;
        for (int i11 = 0; i11 < this.f16049i; i11++) {
            this.f16045e[i11].getClass();
        }
        q();
        this.f16049i = 0;
        if (f16040p) {
            this.f16052n = new C1765d(b0Var);
        } else {
            this.f16052n = new C1764c(b0Var);
        }
    }
}
