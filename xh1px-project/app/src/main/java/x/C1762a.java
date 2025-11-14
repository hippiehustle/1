package x;

import g0.b0;
import java.util.Arrays;
import n1.AbstractC1149a;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1762a implements InterfaceC1763b {

    /* renamed from: b, reason: collision with root package name */
    public final C1764c f16026b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f16027c;

    /* renamed from: a, reason: collision with root package name */
    public int f16025a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f16028d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f16029e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f16030f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f16031g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f16032h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f16033i = -1;
    public boolean j = false;

    public C1762a(C1764c c1764c, b0 b0Var) {
        this.f16026b = c1764c;
        this.f16027c = b0Var;
    }

    @Override // x.InterfaceC1763b
    public final float a(int i4) {
        int i8 = this.f16032h;
        for (int i9 = 0; i8 != -1 && i9 < this.f16025a; i9++) {
            if (i9 == i4) {
                return this.f16031g[i8];
            }
            i8 = this.f16030f[i8];
        }
        return 0.0f;
    }

    @Override // x.InterfaceC1763b
    public final float b(C1770i c1770i) {
        int i4 = this.f16032h;
        for (int i8 = 0; i4 != -1 && i8 < this.f16025a; i8++) {
            if (this.f16029e[i4] == c1770i.f16061b) {
                return this.f16031g[i4];
            }
            i4 = this.f16030f[i4];
        }
        return 0.0f;
    }

    @Override // x.InterfaceC1763b
    public final float c(C1770i c1770i, boolean z8) {
        int i4 = this.f16032h;
        if (i4 != -1) {
            int i8 = 0;
            int i9 = -1;
            while (i4 != -1 && i8 < this.f16025a) {
                if (this.f16029e[i4] == c1770i.f16061b) {
                    if (i4 == this.f16032h) {
                        this.f16032h = this.f16030f[i4];
                    } else {
                        int[] iArr = this.f16030f;
                        iArr[i9] = iArr[i4];
                    }
                    if (z8) {
                        c1770i.b(this.f16026b);
                    }
                    c1770i.k--;
                    this.f16025a--;
                    this.f16029e[i4] = -1;
                    if (this.j) {
                        this.f16033i = i4;
                    }
                    return this.f16031g[i4];
                }
                i8++;
                i9 = i4;
                i4 = this.f16030f[i4];
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // x.InterfaceC1763b
    public final void clear() {
        int i4 = this.f16032h;
        for (int i8 = 0; i4 != -1 && i8 < this.f16025a; i8++) {
            C1770i c1770i = ((C1770i[]) this.f16027c.f10990g)[this.f16029e[i4]];
            if (c1770i != null) {
                c1770i.b(this.f16026b);
            }
            i4 = this.f16030f[i4];
        }
        this.f16032h = -1;
        this.f16033i = -1;
        this.j = false;
        this.f16025a = 0;
    }

    @Override // x.InterfaceC1763b
    public final float d(C1764c c1764c, boolean z8) {
        float b4 = b(c1764c.f16034a);
        c(c1764c.f16034a, z8);
        InterfaceC1763b interfaceC1763b = c1764c.f16037d;
        int f8 = interfaceC1763b.f();
        for (int i4 = 0; i4 < f8; i4++) {
            C1770i h8 = interfaceC1763b.h(i4);
            e(h8, interfaceC1763b.b(h8) * b4, z8);
        }
        return b4;
    }

    @Override // x.InterfaceC1763b
    public final void e(C1770i c1770i, float f8, boolean z8) {
        if (f8 <= -0.001f || f8 >= 0.001f) {
            int i4 = this.f16032h;
            C1764c c1764c = this.f16026b;
            if (i4 == -1) {
                this.f16032h = 0;
                this.f16031g[0] = f8;
                this.f16029e[0] = c1770i.f16061b;
                this.f16030f[0] = -1;
                c1770i.k++;
                c1770i.a(c1764c);
                this.f16025a++;
                if (!this.j) {
                    int i8 = this.f16033i + 1;
                    this.f16033i = i8;
                    int[] iArr = this.f16029e;
                    if (i8 >= iArr.length) {
                        this.j = true;
                        this.f16033i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i9 = -1;
            for (int i10 = 0; i4 != -1 && i10 < this.f16025a; i10++) {
                int i11 = this.f16029e[i4];
                int i12 = c1770i.f16061b;
                if (i11 == i12) {
                    float[] fArr = this.f16031g;
                    float f9 = fArr[i4] + f8;
                    if (f9 > -0.001f && f9 < 0.001f) {
                        f9 = 0.0f;
                    }
                    fArr[i4] = f9;
                    if (f9 == 0.0f) {
                        if (i4 == this.f16032h) {
                            this.f16032h = this.f16030f[i4];
                        } else {
                            int[] iArr2 = this.f16030f;
                            iArr2[i9] = iArr2[i4];
                        }
                        if (z8) {
                            c1770i.b(c1764c);
                        }
                        if (this.j) {
                            this.f16033i = i4;
                        }
                        c1770i.k--;
                        this.f16025a--;
                        return;
                    }
                    return;
                }
                if (i11 < i12) {
                    i9 = i4;
                }
                i4 = this.f16030f[i4];
            }
            int i13 = this.f16033i;
            int i14 = i13 + 1;
            if (this.j) {
                int[] iArr3 = this.f16029e;
                if (iArr3[i13] != -1) {
                    i13 = iArr3.length;
                }
            } else {
                i13 = i14;
            }
            int[] iArr4 = this.f16029e;
            if (i13 >= iArr4.length && this.f16025a < iArr4.length) {
                int i15 = 0;
                while (true) {
                    int[] iArr5 = this.f16029e;
                    if (i15 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i15] == -1) {
                        i13 = i15;
                        break;
                    }
                    i15++;
                }
            }
            int[] iArr6 = this.f16029e;
            if (i13 >= iArr6.length) {
                i13 = iArr6.length;
                int i16 = this.f16028d * 2;
                this.f16028d = i16;
                this.j = false;
                this.f16033i = i13 - 1;
                this.f16031g = Arrays.copyOf(this.f16031g, i16);
                this.f16029e = Arrays.copyOf(this.f16029e, this.f16028d);
                this.f16030f = Arrays.copyOf(this.f16030f, this.f16028d);
            }
            this.f16029e[i13] = c1770i.f16061b;
            this.f16031g[i13] = f8;
            if (i9 != -1) {
                int[] iArr7 = this.f16030f;
                iArr7[i13] = iArr7[i9];
                iArr7[i9] = i13;
            } else {
                this.f16030f[i13] = this.f16032h;
                this.f16032h = i13;
            }
            c1770i.k++;
            c1770i.a(c1764c);
            this.f16025a++;
            if (!this.j) {
                this.f16033i++;
            }
            int i17 = this.f16033i;
            int[] iArr8 = this.f16029e;
            if (i17 >= iArr8.length) {
                this.j = true;
                this.f16033i = iArr8.length - 1;
            }
        }
    }

    @Override // x.InterfaceC1763b
    public final int f() {
        return this.f16025a;
    }

    @Override // x.InterfaceC1763b
    public final void g(C1770i c1770i, float f8) {
        if (f8 == 0.0f) {
            c(c1770i, true);
            return;
        }
        int i4 = this.f16032h;
        C1764c c1764c = this.f16026b;
        if (i4 == -1) {
            this.f16032h = 0;
            this.f16031g[0] = f8;
            this.f16029e[0] = c1770i.f16061b;
            this.f16030f[0] = -1;
            c1770i.k++;
            c1770i.a(c1764c);
            this.f16025a++;
            if (!this.j) {
                int i8 = this.f16033i + 1;
                this.f16033i = i8;
                int[] iArr = this.f16029e;
                if (i8 >= iArr.length) {
                    this.j = true;
                    this.f16033i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i4 != -1 && i10 < this.f16025a; i10++) {
            int i11 = this.f16029e[i4];
            int i12 = c1770i.f16061b;
            if (i11 == i12) {
                this.f16031g[i4] = f8;
                return;
            }
            if (i11 < i12) {
                i9 = i4;
            }
            i4 = this.f16030f[i4];
        }
        int i13 = this.f16033i;
        int i14 = i13 + 1;
        if (this.j) {
            int[] iArr2 = this.f16029e;
            if (iArr2[i13] != -1) {
                i13 = iArr2.length;
            }
        } else {
            i13 = i14;
        }
        int[] iArr3 = this.f16029e;
        if (i13 >= iArr3.length && this.f16025a < iArr3.length) {
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.f16029e;
                if (i15 >= iArr4.length) {
                    break;
                }
                if (iArr4[i15] == -1) {
                    i13 = i15;
                    break;
                }
                i15++;
            }
        }
        int[] iArr5 = this.f16029e;
        if (i13 >= iArr5.length) {
            i13 = iArr5.length;
            int i16 = this.f16028d * 2;
            this.f16028d = i16;
            this.j = false;
            this.f16033i = i13 - 1;
            this.f16031g = Arrays.copyOf(this.f16031g, i16);
            this.f16029e = Arrays.copyOf(this.f16029e, this.f16028d);
            this.f16030f = Arrays.copyOf(this.f16030f, this.f16028d);
        }
        this.f16029e[i13] = c1770i.f16061b;
        this.f16031g[i13] = f8;
        if (i9 != -1) {
            int[] iArr6 = this.f16030f;
            iArr6[i13] = iArr6[i9];
            iArr6[i9] = i13;
        } else {
            this.f16030f[i13] = this.f16032h;
            this.f16032h = i13;
        }
        c1770i.k++;
        c1770i.a(c1764c);
        int i17 = this.f16025a + 1;
        this.f16025a = i17;
        if (!this.j) {
            this.f16033i++;
        }
        int[] iArr7 = this.f16029e;
        if (i17 >= iArr7.length) {
            this.j = true;
        }
        if (this.f16033i >= iArr7.length) {
            this.j = true;
            this.f16033i = iArr7.length - 1;
        }
    }

    @Override // x.InterfaceC1763b
    public final C1770i h(int i4) {
        int i8 = this.f16032h;
        for (int i9 = 0; i8 != -1 && i9 < this.f16025a; i9++) {
            if (i9 == i4) {
                return ((C1770i[]) this.f16027c.f10990g)[this.f16029e[i8]];
            }
            i8 = this.f16030f[i8];
        }
        return null;
    }

    @Override // x.InterfaceC1763b
    public final void i(float f8) {
        int i4 = this.f16032h;
        for (int i8 = 0; i4 != -1 && i8 < this.f16025a; i8++) {
            float[] fArr = this.f16031g;
            fArr[i4] = fArr[i4] / f8;
            i4 = this.f16030f[i4];
        }
    }

    @Override // x.InterfaceC1763b
    public final boolean j(C1770i c1770i) {
        int i4 = this.f16032h;
        if (i4 != -1) {
            for (int i8 = 0; i4 != -1 && i8 < this.f16025a; i8++) {
                if (this.f16029e[i4] == c1770i.f16061b) {
                    return true;
                }
                i4 = this.f16030f[i4];
            }
        }
        return false;
    }

    @Override // x.InterfaceC1763b
    public final void k() {
        int i4 = this.f16032h;
        for (int i8 = 0; i4 != -1 && i8 < this.f16025a; i8++) {
            float[] fArr = this.f16031g;
            fArr[i4] = fArr[i4] * (-1.0f);
            i4 = this.f16030f[i4];
        }
    }

    public final String toString() {
        int i4 = this.f16032h;
        String str = "";
        for (int i8 = 0; i4 != -1 && i8 < this.f16025a; i8++) {
            StringBuilder a3 = AbstractC1769h.a(AbstractC1149a.g(str, " -> "));
            a3.append(this.f16031g[i4]);
            a3.append(" : ");
            StringBuilder a4 = AbstractC1769h.a(a3.toString());
            a4.append(((C1770i[]) this.f16027c.f10990g)[this.f16029e[i4]]);
            str = a4.toString();
            i4 = this.f16030f[i4];
        }
        return str;
    }
}
