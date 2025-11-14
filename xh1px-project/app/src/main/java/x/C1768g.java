package x;

import java.util.Arrays;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1768g extends C1764c {

    /* renamed from: f, reason: collision with root package name */
    public C1770i[] f16055f;

    /* renamed from: g, reason: collision with root package name */
    public C1770i[] f16056g;

    /* renamed from: h, reason: collision with root package name */
    public int f16057h;

    /* renamed from: i, reason: collision with root package name */
    public C1767f f16058i;

    @Override // x.C1764c
    public final C1770i d(boolean[] zArr) {
        int i4 = -1;
        for (int i8 = 0; i8 < this.f16057h; i8++) {
            C1770i[] c1770iArr = this.f16055f;
            C1770i c1770i = c1770iArr[i8];
            if (!zArr[c1770i.f16061b]) {
                C1767f c1767f = this.f16058i;
                c1767f.f16053d = c1770i;
                int i9 = 8;
                if (i4 == -1) {
                    while (i9 >= 0) {
                        float f8 = c1767f.f16053d.f16067h[i9];
                        if (f8 <= 0.0f) {
                            if (f8 < 0.0f) {
                                i4 = i8;
                                break;
                            }
                            i9--;
                        }
                    }
                } else {
                    C1770i c1770i2 = c1770iArr[i4];
                    while (true) {
                        if (i9 >= 0) {
                            float f9 = c1770i2.f16067h[i9];
                            float f10 = c1767f.f16053d.f16067h[i9];
                            if (f10 == f9) {
                                i9--;
                            } else if (f10 >= f9) {
                            }
                        }
                    }
                }
            }
        }
        if (i4 == -1) {
            return null;
        }
        return this.f16055f[i4];
    }

    @Override // x.C1764c
    public final void h(C1764c c1764c, boolean z8) {
        C1770i c1770i = c1764c.f16034a;
        if (c1770i == null) {
            return;
        }
        float[] fArr = c1770i.f16067h;
        InterfaceC1763b interfaceC1763b = c1764c.f16037d;
        int f8 = interfaceC1763b.f();
        for (int i4 = 0; i4 < f8; i4++) {
            C1770i h8 = interfaceC1763b.h(i4);
            float a3 = interfaceC1763b.a(i4);
            C1767f c1767f = this.f16058i;
            c1767f.f16053d = h8;
            if (h8.f16060a) {
                boolean z9 = true;
                for (int i8 = 0; i8 < 9; i8++) {
                    float[] fArr2 = c1767f.f16053d.f16067h;
                    float f9 = (fArr[i8] * a3) + fArr2[i8];
                    fArr2[i8] = f9;
                    if (Math.abs(f9) < 1.0E-4f) {
                        c1767f.f16053d.f16067h[i8] = 0.0f;
                    } else {
                        z9 = false;
                    }
                }
                if (z9) {
                    c1767f.f16054e.j(c1767f.f16053d);
                }
            } else {
                for (int i9 = 0; i9 < 9; i9++) {
                    float f10 = fArr[i9];
                    if (f10 != 0.0f) {
                        float f11 = f10 * a3;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        c1767f.f16053d.f16067h[i9] = f11;
                    } else {
                        c1767f.f16053d.f16067h[i9] = 0.0f;
                    }
                }
                i(h8);
            }
            this.f16035b = (c1764c.f16035b * a3) + this.f16035b;
        }
        j(c1770i);
    }

    public final void i(C1770i c1770i) {
        int i4;
        int i8 = this.f16057h + 1;
        C1770i[] c1770iArr = this.f16055f;
        if (i8 > c1770iArr.length) {
            C1770i[] c1770iArr2 = (C1770i[]) Arrays.copyOf(c1770iArr, c1770iArr.length * 2);
            this.f16055f = c1770iArr2;
            this.f16056g = (C1770i[]) Arrays.copyOf(c1770iArr2, c1770iArr2.length * 2);
        }
        C1770i[] c1770iArr3 = this.f16055f;
        int i9 = this.f16057h;
        c1770iArr3[i9] = c1770i;
        int i10 = i9 + 1;
        this.f16057h = i10;
        if (i10 > 1 && c1770iArr3[i9].f16061b > c1770i.f16061b) {
            int i11 = 0;
            while (true) {
                i4 = this.f16057h;
                if (i11 >= i4) {
                    break;
                }
                this.f16056g[i11] = this.f16055f[i11];
                i11++;
            }
            Arrays.sort(this.f16056g, 0, i4, new A0.i(29));
            for (int i12 = 0; i12 < this.f16057h; i12++) {
                this.f16055f[i12] = this.f16056g[i12];
            }
        }
        c1770i.f16060a = true;
        c1770i.a(this);
    }

    public final void j(C1770i c1770i) {
        int i4 = 0;
        while (i4 < this.f16057h) {
            if (this.f16055f[i4] == c1770i) {
                while (true) {
                    int i8 = this.f16057h;
                    if (i4 < i8 - 1) {
                        C1770i[] c1770iArr = this.f16055f;
                        int i9 = i4 + 1;
                        c1770iArr[i4] = c1770iArr[i9];
                        i4 = i9;
                    } else {
                        this.f16057h = i8 - 1;
                        c1770i.f16060a = false;
                        return;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    @Override // x.C1764c
    public final String toString() {
        C1767f c1767f = this.f16058i;
        String str = " goal -> (" + this.f16035b + ") : ";
        for (int i4 = 0; i4 < this.f16057h; i4++) {
            c1767f.f16053d = this.f16055f[i4];
            str = str + c1767f + " ";
        }
        return str;
    }
}
