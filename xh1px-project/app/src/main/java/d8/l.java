package d8;

import a.AbstractC0405a;
import a6.AbstractC0434i;

/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: h, reason: collision with root package name */
    public final transient byte[][] f10554h;

    /* renamed from: i, reason: collision with root package name */
    public final transient int[] f10555i;

    public l(byte[][] bArr, int[] iArr) {
        super(c.f10526g.f10527d);
        this.f10554h = bArr;
        this.f10555i = iArr;
    }

    @Override // d8.c
    public final int b() {
        return this.f10555i[this.f10554h.length - 1];
    }

    @Override // d8.c
    public final String c() {
        return new c(h()).c();
    }

    @Override // d8.c
    public final byte[] d() {
        return h();
    }

    @Override // d8.c
    public final byte e(int i4) {
        int i8;
        byte[][] bArr = this.f10554h;
        int length = bArr.length - 1;
        int[] iArr = this.f10555i;
        AbstractC0405a.m(iArr[length], i4, 1L);
        int a3 = e8.b.a(this, i4);
        if (a3 == 0) {
            i8 = 0;
        } else {
            i8 = iArr[a3 - 1];
        }
        return bArr[a3][(i4 - i8) + iArr[bArr.length + a3]];
    }

    @Override // d8.c
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.b() == b() && g(cVar, b())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // d8.c
    public final boolean f(int i4, int i8, int i9, byte[] bArr) {
        int i10;
        o6.j.e(bArr, "other");
        if (i4 < 0 || i4 > b() - i9 || i8 < 0 || i8 > bArr.length - i9) {
            return false;
        }
        int i11 = i9 + i4;
        int a3 = e8.b.a(this, i4);
        while (i4 < i11) {
            int[] iArr = this.f10555i;
            if (a3 == 0) {
                i10 = 0;
            } else {
                i10 = iArr[a3 - 1];
            }
            int i12 = iArr[a3] - i10;
            byte[][] bArr2 = this.f10554h;
            int i13 = iArr[bArr2.length + a3];
            int min = Math.min(i11, i12 + i10) - i4;
            if (!AbstractC0405a.d((i4 - i10) + i13, i8, min, bArr2[a3], bArr)) {
                return false;
            }
            i8 += min;
            i4 += min;
            a3++;
        }
        return true;
    }

    @Override // d8.c
    public final boolean g(c cVar, int i4) {
        int i8;
        o6.j.e(cVar, "other");
        if (b() - i4 >= 0) {
            int a3 = e8.b.a(this, 0);
            int i9 = 0;
            int i10 = 0;
            while (i9 < i4) {
                int[] iArr = this.f10555i;
                if (a3 == 0) {
                    i8 = 0;
                } else {
                    i8 = iArr[a3 - 1];
                }
                int i11 = iArr[a3] - i8;
                byte[][] bArr = this.f10554h;
                int i12 = iArr[bArr.length + a3];
                int min = Math.min(i4, i11 + i8) - i9;
                if (cVar.f(i10, (i9 - i8) + i12, min, bArr[a3])) {
                    i10 += min;
                    i9 += min;
                    a3++;
                }
            }
            return true;
        }
        return false;
    }

    public final byte[] h() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.f10554h;
        int length = bArr2.length;
        int i4 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i4 < length) {
            int[] iArr = this.f10555i;
            int i10 = iArr[length + i4];
            int i11 = iArr[i4];
            int i12 = i11 - i8;
            AbstractC0434i.O0(i9, i10, i10 + i12, bArr2[i4], bArr);
            i9 += i12;
            i4++;
            i8 = i11;
        }
        return bArr;
    }

    @Override // d8.c
    public final int hashCode() {
        int i4 = this.f10528e;
        if (i4 != 0) {
            return i4;
        }
        byte[][] bArr = this.f10554h;
        int length = bArr.length;
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i8 < length) {
            int[] iArr = this.f10555i;
            int i11 = iArr[length + i8];
            int i12 = iArr[i8];
            byte[] bArr2 = bArr[i8];
            int i13 = (i12 - i10) + i11;
            while (i11 < i13) {
                i9 = (i9 * 31) + bArr2[i11];
                i11++;
            }
            i8++;
            i10 = i12;
        }
        this.f10528e = i9;
        return i9;
    }

    @Override // d8.c
    public final String toString() {
        return new c(h()).toString();
    }
}
