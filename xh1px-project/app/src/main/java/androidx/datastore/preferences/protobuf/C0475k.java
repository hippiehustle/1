package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475k extends D2.f {

    /* renamed from: n, reason: collision with root package name */
    public static final Logger f8705n = Logger.getLogger(C0475k.class.getName());

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f8706o = f0.f8678e;

    /* renamed from: i, reason: collision with root package name */
    public B f8707i;
    public final byte[] j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public int f8708l;

    /* renamed from: m, reason: collision with root package name */
    public final X.e0 f8709m;

    public C0475k(X.e0 e0Var, int i4) {
        if (i4 >= 0) {
            int max = Math.max(i4, 20);
            this.j = new byte[max];
            this.k = max;
            this.f8709m = e0Var;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public static int U(int i4, C0471g c0471g) {
        int W7 = W(i4);
        int size = c0471g.size();
        return X(size) + size + W7;
    }

    public static int V(String str) {
        int length;
        try {
            length = i0.a(str);
        } catch (h0 unused) {
            length = str.getBytes(AbstractC0486w.f8742a).length;
        }
        return X(length) + length;
    }

    public static int W(int i4) {
        return X(i4 << 3);
    }

    public static int X(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int Y(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Override // D2.f
    public final void O(byte[] bArr, int i4, int i8) {
        c0(bArr, i4, i8);
    }

    public final void P(int i4) {
        int i8 = this.f8708l;
        int i9 = i8 + 1;
        this.f8708l = i9;
        byte[] bArr = this.j;
        bArr[i8] = (byte) (i4 & 255);
        int i10 = i8 + 2;
        this.f8708l = i10;
        bArr[i9] = (byte) ((i4 >> 8) & 255);
        int i11 = i8 + 3;
        this.f8708l = i11;
        bArr[i10] = (byte) ((i4 >> 16) & 255);
        this.f8708l = i8 + 4;
        bArr[i11] = (byte) ((i4 >> 24) & 255);
    }

    public final void Q(long j) {
        int i4 = this.f8708l;
        int i8 = i4 + 1;
        this.f8708l = i8;
        byte[] bArr = this.j;
        bArr[i4] = (byte) (j & 255);
        int i9 = i4 + 2;
        this.f8708l = i9;
        bArr[i8] = (byte) ((j >> 8) & 255);
        int i10 = i4 + 3;
        this.f8708l = i10;
        bArr[i9] = (byte) ((j >> 16) & 255);
        int i11 = i4 + 4;
        this.f8708l = i11;
        bArr[i10] = (byte) (255 & (j >> 24));
        int i12 = i4 + 5;
        this.f8708l = i12;
        bArr[i11] = (byte) (((int) (j >> 32)) & 255);
        int i13 = i4 + 6;
        this.f8708l = i13;
        bArr[i12] = (byte) (((int) (j >> 40)) & 255);
        int i14 = i4 + 7;
        this.f8708l = i14;
        bArr[i13] = (byte) (((int) (j >> 48)) & 255);
        this.f8708l = i4 + 8;
        bArr[i14] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void R(int i4, int i8) {
        S((i4 << 3) | i8);
    }

    public final void S(int i4) {
        boolean z8 = f8706o;
        byte[] bArr = this.j;
        if (z8) {
            while ((i4 & (-128)) != 0) {
                int i8 = this.f8708l;
                this.f8708l = i8 + 1;
                f0.j(bArr, i8, (byte) ((i4 | 128) & 255));
                i4 >>>= 7;
            }
            int i9 = this.f8708l;
            this.f8708l = i9 + 1;
            f0.j(bArr, i9, (byte) i4);
            return;
        }
        while ((i4 & (-128)) != 0) {
            int i10 = this.f8708l;
            this.f8708l = i10 + 1;
            bArr[i10] = (byte) ((i4 | 128) & 255);
            i4 >>>= 7;
        }
        int i11 = this.f8708l;
        this.f8708l = i11 + 1;
        bArr[i11] = (byte) i4;
    }

    public final void T(long j) {
        boolean z8 = f8706o;
        byte[] bArr = this.j;
        if (z8) {
            while ((j & (-128)) != 0) {
                int i4 = this.f8708l;
                this.f8708l = i4 + 1;
                f0.j(bArr, i4, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i8 = this.f8708l;
            this.f8708l = i8 + 1;
            f0.j(bArr, i8, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i9 = this.f8708l;
            this.f8708l = i9 + 1;
            bArr[i9] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i10 = this.f8708l;
        this.f8708l = i10 + 1;
        bArr[i10] = (byte) j;
    }

    public final void Z() {
        this.f8709m.write(this.j, 0, this.f8708l);
        this.f8708l = 0;
    }

    public final void a0(int i4) {
        if (this.k - this.f8708l < i4) {
            Z();
        }
    }

    public final void b0(byte b4) {
        if (this.f8708l == this.k) {
            Z();
        }
        int i4 = this.f8708l;
        this.f8708l = i4 + 1;
        this.j[i4] = b4;
    }

    public final void c0(byte[] bArr, int i4, int i8) {
        int i9 = this.f8708l;
        int i10 = this.k;
        int i11 = i10 - i9;
        byte[] bArr2 = this.j;
        if (i11 >= i8) {
            System.arraycopy(bArr, i4, bArr2, i9, i8);
            this.f8708l += i8;
            return;
        }
        System.arraycopy(bArr, i4, bArr2, i9, i11);
        int i12 = i4 + i11;
        int i13 = i8 - i11;
        this.f8708l = i10;
        Z();
        if (i13 <= i10) {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f8708l = i13;
        } else {
            this.f8709m.write(bArr, i12, i13);
        }
    }

    public final void d0(int i4, boolean z8) {
        a0(11);
        R(i4, 0);
        byte b4 = z8 ? (byte) 1 : (byte) 0;
        int i8 = this.f8708l;
        this.f8708l = i8 + 1;
        this.j[i8] = b4;
    }

    public final void e0(int i4, C0471g c0471g) {
        p0(i4, 2);
        f0(c0471g);
    }

    public final void f0(C0471g c0471g) {
        r0(c0471g.size());
        O(c0471g.f8684e, c0471g.k(), c0471g.size());
    }

    public final void g0(int i4, int i8) {
        a0(14);
        R(i4, 5);
        P(i8);
    }

    public final void h0(int i4) {
        a0(4);
        P(i4);
    }

    public final void i0(int i4, long j) {
        a0(18);
        R(i4, 1);
        Q(j);
    }

    public final void j0(long j) {
        a0(8);
        Q(j);
    }

    public final void k0(int i4, int i8) {
        a0(20);
        R(i4, 0);
        if (i8 >= 0) {
            S(i8);
        } else {
            T(i8);
        }
    }

    public final void l0(int i4) {
        if (i4 >= 0) {
            r0(i4);
        } else {
            t0(i4);
        }
    }

    public final void m0(int i4, AbstractC0465a abstractC0465a, S s8) {
        p0(i4, 2);
        r0(abstractC0465a.a(s8));
        s8.b(abstractC0465a, this.f8707i);
    }

    public final void n0(String str, int i4) {
        p0(i4, 2);
        o0(str);
    }

    public final void o0(String str) {
        try {
            int length = str.length() * 3;
            int X8 = X(length);
            int i4 = X8 + length;
            int i8 = this.k;
            if (i4 > i8) {
                byte[] bArr = new byte[length];
                int l6 = i0.f8700a.l(str, bArr, 0, length);
                r0(l6);
                c0(bArr, 0, l6);
                return;
            }
            if (i4 > i8 - this.f8708l) {
                Z();
            }
            int X9 = X(str.length());
            int i9 = this.f8708l;
            byte[] bArr2 = this.j;
            try {
                try {
                    if (X9 == X8) {
                        int i10 = i9 + X9;
                        this.f8708l = i10;
                        int l8 = i0.f8700a.l(str, bArr2, i10, i8 - i10);
                        this.f8708l = i9;
                        S((l8 - i9) - X9);
                        this.f8708l = l8;
                    } else {
                        int a3 = i0.a(str);
                        S(a3);
                        this.f8708l = i0.f8700a.l(str, bArr2, this.f8708l, a3);
                    }
                } catch (h0 e9) {
                    this.f8708l = i9;
                    throw e9;
                }
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new CodedOutputStream$OutOfSpaceException(e10);
            }
        } catch (h0 e11) {
            f8705n.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(AbstractC0486w.f8742a);
            try {
                r0(bytes.length);
                O(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e12) {
                throw new CodedOutputStream$OutOfSpaceException(e12);
            }
        }
    }

    public final void p0(int i4, int i8) {
        r0((i4 << 3) | i8);
    }

    public final void q0(int i4, int i8) {
        a0(20);
        R(i4, 0);
        S(i8);
    }

    public final void r0(int i4) {
        a0(5);
        S(i4);
    }

    public final void s0(int i4, long j) {
        a0(20);
        R(i4, 0);
        T(j);
    }

    public final void t0(long j) {
        a0(10);
        T(j);
    }
}
