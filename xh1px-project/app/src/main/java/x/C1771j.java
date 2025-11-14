package x;

import g0.b0;
import java.util.Arrays;
import n1.AbstractC1149a;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1771j implements InterfaceC1763b {

    /* renamed from: a, reason: collision with root package name */
    public int f16070a = 16;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f16071b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f16072c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f16073d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public float[] f16074e = new float[16];

    /* renamed from: f, reason: collision with root package name */
    public int[] f16075f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    public int[] f16076g = new int[16];

    /* renamed from: h, reason: collision with root package name */
    public int f16077h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f16078i = -1;
    public final C1765d j;
    public final b0 k;

    public C1771j(C1765d c1765d, b0 b0Var) {
        this.j = c1765d;
        this.k = b0Var;
        clear();
    }

    @Override // x.InterfaceC1763b
    public final float a(int i4) {
        int i8 = this.f16077h;
        int i9 = this.f16078i;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i4) {
                return this.f16074e[i9];
            }
            i9 = this.f16076g[i9];
            if (i9 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // x.InterfaceC1763b
    public final float b(C1770i c1770i) {
        int n3 = n(c1770i);
        if (n3 != -1) {
            return this.f16074e[n3];
        }
        return 0.0f;
    }

    @Override // x.InterfaceC1763b
    public final float c(C1770i c1770i, boolean z8) {
        int[] iArr;
        int i4;
        int n3 = n(c1770i);
        if (n3 == -1) {
            return 0.0f;
        }
        int i8 = c1770i.f16061b;
        int i9 = i8 % 16;
        int[] iArr2 = this.f16071b;
        int i10 = iArr2[i9];
        if (i10 != -1) {
            if (this.f16073d[i10] == i8) {
                int[] iArr3 = this.f16072c;
                iArr2[i9] = iArr3[i10];
                iArr3[i10] = -1;
            } else {
                while (true) {
                    iArr = this.f16072c;
                    i4 = iArr[i10];
                    if (i4 == -1 || this.f16073d[i4] == i8) {
                        break;
                    }
                    i10 = i4;
                }
                if (i4 != -1 && this.f16073d[i4] == i8) {
                    iArr[i10] = iArr[i4];
                    iArr[i4] = -1;
                }
            }
        }
        float f8 = this.f16074e[n3];
        if (this.f16078i == n3) {
            this.f16078i = this.f16076g[n3];
        }
        this.f16073d[n3] = -1;
        int[] iArr4 = this.f16075f;
        int i11 = iArr4[n3];
        if (i11 != -1) {
            int[] iArr5 = this.f16076g;
            iArr5[i11] = iArr5[n3];
        }
        int i12 = this.f16076g[n3];
        if (i12 != -1) {
            iArr4[i12] = iArr4[n3];
        }
        this.f16077h--;
        c1770i.k--;
        if (z8) {
            c1770i.b(this.j);
        }
        return f8;
    }

    @Override // x.InterfaceC1763b
    public final void clear() {
        int i4 = this.f16077h;
        for (int i8 = 0; i8 < i4; i8++) {
            C1770i h8 = h(i8);
            if (h8 != null) {
                h8.b(this.j);
            }
        }
        for (int i9 = 0; i9 < this.f16070a; i9++) {
            this.f16073d[i9] = -1;
            this.f16072c[i9] = -1;
        }
        for (int i10 = 0; i10 < 16; i10++) {
            this.f16071b[i10] = -1;
        }
        this.f16077h = 0;
        this.f16078i = -1;
    }

    @Override // x.InterfaceC1763b
    public final float d(C1764c c1764c, boolean z8) {
        float b4 = b(c1764c.f16034a);
        c(c1764c.f16034a, z8);
        C1771j c1771j = (C1771j) c1764c.f16037d;
        int i4 = c1771j.f16077h;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i4) {
            int i10 = c1771j.f16073d[i9];
            if (i10 != -1) {
                e(((C1770i[]) this.k.f10990g)[i10], c1771j.f16074e[i9] * b4, z8);
                i8++;
            }
            i9++;
        }
        return b4;
    }

    @Override // x.InterfaceC1763b
    public final void e(C1770i c1770i, float f8, boolean z8) {
        if (f8 <= -0.001f || f8 >= 0.001f) {
            int n3 = n(c1770i);
            if (n3 == -1) {
                g(c1770i, f8);
                return;
            }
            float[] fArr = this.f16074e;
            float f9 = fArr[n3] + f8;
            fArr[n3] = f9;
            if (f9 > -0.001f && f9 < 0.001f) {
                fArr[n3] = 0.0f;
                c(c1770i, z8);
            }
        }
    }

    @Override // x.InterfaceC1763b
    public final int f() {
        return this.f16077h;
    }

    @Override // x.InterfaceC1763b
    public final void g(C1770i c1770i, float f8) {
        if (f8 > -0.001f && f8 < 0.001f) {
            c(c1770i, true);
            return;
        }
        int i4 = 0;
        if (this.f16077h == 0) {
            m(0, c1770i, f8);
            l(c1770i, 0);
            this.f16078i = 0;
            return;
        }
        int n3 = n(c1770i);
        if (n3 != -1) {
            this.f16074e[n3] = f8;
            return;
        }
        int i8 = this.f16077h + 1;
        int i9 = this.f16070a;
        if (i8 >= i9) {
            int i10 = i9 * 2;
            this.f16073d = Arrays.copyOf(this.f16073d, i10);
            this.f16074e = Arrays.copyOf(this.f16074e, i10);
            this.f16075f = Arrays.copyOf(this.f16075f, i10);
            this.f16076g = Arrays.copyOf(this.f16076g, i10);
            this.f16072c = Arrays.copyOf(this.f16072c, i10);
            for (int i11 = this.f16070a; i11 < i10; i11++) {
                this.f16073d[i11] = -1;
                this.f16072c[i11] = -1;
            }
            this.f16070a = i10;
        }
        int i12 = this.f16077h;
        int i13 = this.f16078i;
        int i14 = -1;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = this.f16073d[i13];
            int i17 = c1770i.f16061b;
            if (i16 == i17) {
                this.f16074e[i13] = f8;
                return;
            }
            if (i16 < i17) {
                i14 = i13;
            }
            i13 = this.f16076g[i13];
            if (i13 == -1) {
                break;
            }
        }
        while (true) {
            if (i4 < this.f16070a) {
                if (this.f16073d[i4] == -1) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        m(i4, c1770i, f8);
        if (i14 != -1) {
            this.f16075f[i4] = i14;
            int[] iArr = this.f16076g;
            iArr[i4] = iArr[i14];
            iArr[i14] = i4;
        } else {
            this.f16075f[i4] = -1;
            if (this.f16077h > 0) {
                this.f16076g[i4] = this.f16078i;
                this.f16078i = i4;
            } else {
                this.f16076g[i4] = -1;
            }
        }
        int i18 = this.f16076g[i4];
        if (i18 != -1) {
            this.f16075f[i18] = i4;
        }
        l(c1770i, i4);
    }

    @Override // x.InterfaceC1763b
    public final C1770i h(int i4) {
        int i8 = this.f16077h;
        if (i8 == 0) {
            return null;
        }
        int i9 = this.f16078i;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i4 && i9 != -1) {
                return ((C1770i[]) this.k.f10990g)[this.f16073d[i9]];
            }
            i9 = this.f16076g[i9];
            if (i9 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // x.InterfaceC1763b
    public final void i(float f8) {
        int i4 = this.f16077h;
        int i8 = this.f16078i;
        for (int i9 = 0; i9 < i4; i9++) {
            float[] fArr = this.f16074e;
            fArr[i8] = fArr[i8] / f8;
            i8 = this.f16076g[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    @Override // x.InterfaceC1763b
    public final boolean j(C1770i c1770i) {
        if (n(c1770i) != -1) {
            return true;
        }
        return false;
    }

    @Override // x.InterfaceC1763b
    public final void k() {
        int i4 = this.f16077h;
        int i8 = this.f16078i;
        for (int i9 = 0; i9 < i4; i9++) {
            float[] fArr = this.f16074e;
            fArr[i8] = fArr[i8] * (-1.0f);
            i8 = this.f16076g[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    public final void l(C1770i c1770i, int i4) {
        int[] iArr;
        int i8 = c1770i.f16061b % 16;
        int[] iArr2 = this.f16071b;
        int i9 = iArr2[i8];
        if (i9 == -1) {
            iArr2[i8] = i4;
        } else {
            while (true) {
                iArr = this.f16072c;
                int i10 = iArr[i9];
                if (i10 == -1) {
                    break;
                } else {
                    i9 = i10;
                }
            }
            iArr[i9] = i4;
        }
        this.f16072c[i4] = -1;
    }

    public final void m(int i4, C1770i c1770i, float f8) {
        this.f16073d[i4] = c1770i.f16061b;
        this.f16074e[i4] = f8;
        this.f16075f[i4] = -1;
        this.f16076g[i4] = -1;
        c1770i.a(this.j);
        c1770i.k++;
        this.f16077h++;
    }

    public final int n(C1770i c1770i) {
        if (this.f16077h == 0) {
            return -1;
        }
        int i4 = c1770i.f16061b;
        int i8 = this.f16071b[i4 % 16];
        if (i8 == -1) {
            return -1;
        }
        if (this.f16073d[i8] == i4) {
            return i8;
        }
        do {
            i8 = this.f16072c[i8];
            if (i8 == -1) {
                break;
            }
        } while (this.f16073d[i8] != i4);
        if (i8 == -1 || this.f16073d[i8] != i4) {
            return -1;
        }
        return i8;
    }

    public final String toString() {
        String g8;
        String g9;
        String str = hashCode() + " { ";
        int i4 = this.f16077h;
        for (int i8 = 0; i8 < i4; i8++) {
            C1770i h8 = h(i8);
            if (h8 != null) {
                String str2 = str + h8 + " = " + a(i8) + " ";
                int n3 = n(h8);
                String g10 = AbstractC1149a.g(str2, "[p: ");
                int i9 = this.f16075f[n3];
                b0 b0Var = this.k;
                if (i9 != -1) {
                    StringBuilder a3 = AbstractC1769h.a(g10);
                    a3.append(((C1770i[]) b0Var.f10990g)[this.f16073d[this.f16075f[n3]]]);
                    g8 = a3.toString();
                } else {
                    g8 = AbstractC1149a.g(g10, "none");
                }
                String g11 = AbstractC1149a.g(g8, ", n: ");
                if (this.f16076g[n3] != -1) {
                    StringBuilder a4 = AbstractC1769h.a(g11);
                    a4.append(((C1770i[]) b0Var.f10990g)[this.f16073d[this.f16076g[n3]]]);
                    g9 = a4.toString();
                } else {
                    g9 = AbstractC1149a.g(g11, "none");
                }
                str = AbstractC1149a.g(g9, "]");
            }
        }
        return AbstractC1149a.g(str, " }");
    }
}
