package x;

import g0.b0;
import java.util.ArrayList;
import n1.AbstractC1149a;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1764c {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1763b f16037d;

    /* renamed from: a, reason: collision with root package name */
    public C1770i f16034a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f16035b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f16036c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f16038e = false;

    public C1764c(b0 b0Var) {
        this.f16037d = new C1762a(this, b0Var);
    }

    public final void a(C1766e c1766e, int i4) {
        this.f16037d.g(c1766e.i(i4), 1.0f);
        this.f16037d.g(c1766e.i(i4), -1.0f);
    }

    public final void b(C1770i c1770i, C1770i c1770i2, C1770i c1770i3, int i4) {
        boolean z8 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z8 = true;
            }
            this.f16035b = i4;
        }
        if (!z8) {
            this.f16037d.g(c1770i, -1.0f);
            this.f16037d.g(c1770i2, 1.0f);
            this.f16037d.g(c1770i3, 1.0f);
        } else {
            this.f16037d.g(c1770i, 1.0f);
            this.f16037d.g(c1770i2, -1.0f);
            this.f16037d.g(c1770i3, -1.0f);
        }
    }

    public final void c(C1770i c1770i, C1770i c1770i2, C1770i c1770i3, int i4) {
        boolean z8 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z8 = true;
            }
            this.f16035b = i4;
        }
        if (!z8) {
            this.f16037d.g(c1770i, -1.0f);
            this.f16037d.g(c1770i2, 1.0f);
            this.f16037d.g(c1770i3, -1.0f);
        } else {
            this.f16037d.g(c1770i, 1.0f);
            this.f16037d.g(c1770i2, -1.0f);
            this.f16037d.g(c1770i3, 1.0f);
        }
    }

    public C1770i d(boolean[] zArr) {
        return e(zArr, null);
    }

    public final C1770i e(boolean[] zArr, C1770i c1770i) {
        int i4;
        int f8 = this.f16037d.f();
        C1770i c1770i2 = null;
        float f9 = 0.0f;
        for (int i8 = 0; i8 < f8; i8++) {
            float a3 = this.f16037d.a(i8);
            if (a3 < 0.0f) {
                C1770i h8 = this.f16037d.h(i8);
                if ((zArr == null || !zArr[h8.f16061b]) && h8 != c1770i && (((i4 = h8.f16069l) == 3 || i4 == 4) && a3 < f9)) {
                    f9 = a3;
                    c1770i2 = h8;
                }
            }
        }
        return c1770i2;
    }

    public final void f(C1770i c1770i) {
        C1770i c1770i2 = this.f16034a;
        if (c1770i2 != null) {
            this.f16037d.g(c1770i2, -1.0f);
            this.f16034a = null;
        }
        float c6 = this.f16037d.c(c1770i, true) * (-1.0f);
        this.f16034a = c1770i;
        if (c6 == 1.0f) {
            return;
        }
        this.f16035b /= c6;
        this.f16037d.i(c6);
    }

    public final void g(C1770i c1770i, boolean z8) {
        if (c1770i.f16065f) {
            float b4 = this.f16037d.b(c1770i);
            this.f16035b = (c1770i.f16064e * b4) + this.f16035b;
            this.f16037d.c(c1770i, z8);
            if (z8) {
                c1770i.b(this);
            }
        }
    }

    public void h(C1764c c1764c, boolean z8) {
        float d2 = this.f16037d.d(c1764c, z8);
        this.f16035b = (c1764c.f16035b * d2) + this.f16035b;
        if (z8) {
            c1764c.f16034a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String str;
        boolean z8;
        if (this.f16034a == null) {
            str = "0";
        } else {
            str = "" + this.f16034a;
        }
        String g8 = AbstractC1149a.g(str, " = ");
        if (this.f16035b != 0.0f) {
            StringBuilder a3 = AbstractC1769h.a(g8);
            a3.append(this.f16035b);
            g8 = a3.toString();
            z8 = true;
        } else {
            z8 = false;
        }
        int f8 = this.f16037d.f();
        for (int i4 = 0; i4 < f8; i4++) {
            C1770i h8 = this.f16037d.h(i4);
            if (h8 != null) {
                float a4 = this.f16037d.a(i4);
                if (a4 != 0.0f) {
                    String c1770i = h8.toString();
                    if (!z8) {
                        if (a4 < 0.0f) {
                            g8 = AbstractC1149a.g(g8, "- ");
                            a4 *= -1.0f;
                        }
                        if (a4 == 1.0f) {
                            g8 = AbstractC1149a.g(g8, c1770i);
                        } else {
                            g8 = g8 + a4 + " " + c1770i;
                        }
                        z8 = true;
                    } else if (a4 > 0.0f) {
                        g8 = AbstractC1149a.g(g8, " + ");
                        if (a4 == 1.0f) {
                        }
                        z8 = true;
                    } else {
                        g8 = AbstractC1149a.g(g8, " - ");
                        a4 *= -1.0f;
                        if (a4 == 1.0f) {
                        }
                        z8 = true;
                    }
                }
            }
        }
        if (!z8) {
            return AbstractC1149a.g(g8, "0.0");
        }
        return g8;
    }
}
