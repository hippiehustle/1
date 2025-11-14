package b8;

import O7.Y;

/* loaded from: classes.dex */
public final class g extends N.f {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9261g;

    public g(Y y4, boolean z8) {
        super(y4);
        this.f9261g = z8;
    }

    @Override // N.f
    public final void f(byte b4) {
        if (this.f9261g) {
            m(String.valueOf(b4 & 255));
        } else {
            k(String.valueOf(b4 & 255));
        }
    }

    @Override // N.f
    public final void i(int i4) {
        if (this.f9261g) {
            m(Long.toString(i4 & 4294967295L, 10));
        } else {
            k(Long.toString(i4 & 4294967295L, 10));
        }
    }

    @Override // N.f
    public final void j(long j) {
        int i4 = 63;
        String str = "0";
        if (this.f9261g) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j5 = (j >>> 1) / 5;
                    long j8 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j5 * j8)), 10);
                    while (j5 > 0) {
                        i4--;
                        cArr[i4] = Character.forDigit((int) (j5 % j8), 10);
                        j5 /= j8;
                    }
                    str = new String(cArr, i4, 64 - i4);
                }
            }
            m(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j9 = (j >>> 1) / 5;
                long j10 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j9 * j10)), 10);
                while (j9 > 0) {
                    i4--;
                    cArr2[i4] = Character.forDigit((int) (j9 % j10), 10);
                    j9 /= j10;
                }
                str = new String(cArr2, i4, 64 - i4);
            }
        }
        k(str);
    }

    @Override // N.f
    public final void l(short s8) {
        if (this.f9261g) {
            m(String.valueOf(s8 & 65535));
        } else {
            k(String.valueOf(s8 & 65535));
        }
    }
}
