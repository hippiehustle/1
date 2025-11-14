package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473i extends b8.c {

    /* renamed from: c, reason: collision with root package name */
    public final FileInputStream f8693c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8694d;

    /* renamed from: e, reason: collision with root package name */
    public int f8695e;

    /* renamed from: f, reason: collision with root package name */
    public int f8696f;

    /* renamed from: g, reason: collision with root package name */
    public int f8697g;

    /* renamed from: h, reason: collision with root package name */
    public int f8698h;

    /* renamed from: i, reason: collision with root package name */
    public int f8699i;
    public int j = Integer.MAX_VALUE;

    public C0473i(FileInputStream fileInputStream) {
        Charset charset = AbstractC0486w.f8742a;
        this.f8693c = fileInputStream;
        this.f8694d = new byte[4096];
        this.f8695e = 0;
        this.f8697g = 0;
        this.f8699i = 0;
    }

    public final byte[] A(int i4) {
        if (i4 == 0) {
            return AbstractC0486w.f8743b;
        }
        if (i4 >= 0) {
            int i8 = this.f8699i;
            int i9 = this.f8697g;
            int i10 = i8 + i9 + i4;
            if (i10 - Integer.MAX_VALUE <= 0) {
                int i11 = this.j;
                if (i10 <= i11) {
                    int i12 = this.f8695e - i9;
                    int i13 = i4 - i12;
                    FileInputStream fileInputStream = this.f8693c;
                    if (i13 >= 4096) {
                        try {
                            if (i13 > fileInputStream.available()) {
                                return null;
                            }
                        } catch (InvalidProtocolBufferException e9) {
                            e9.f8608d = true;
                            throw e9;
                        }
                    }
                    byte[] bArr = new byte[i4];
                    System.arraycopy(this.f8694d, this.f8697g, bArr, 0, i12);
                    this.f8699i += this.f8695e;
                    this.f8697g = 0;
                    this.f8695e = 0;
                    while (i12 < i4) {
                        try {
                            int read = fileInputStream.read(bArr, i12, i4 - i12);
                            if (read != -1) {
                                this.f8699i += read;
                                i12 += read;
                            } else {
                                throw InvalidProtocolBufferException.e();
                            }
                        } catch (InvalidProtocolBufferException e10) {
                            e10.f8608d = true;
                            throw e10;
                        }
                    }
                    return bArr;
                }
                J((i11 - i8) - i9);
                throw InvalidProtocolBufferException.e();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw InvalidProtocolBufferException.d();
    }

    public final ArrayList B(int i4) {
        ArrayList arrayList = new ArrayList();
        while (i4 > 0) {
            int min = Math.min(i4, 4096);
            byte[] bArr = new byte[min];
            int i8 = 0;
            while (i8 < min) {
                int read = this.f8693c.read(bArr, i8, min - i8);
                if (read != -1) {
                    this.f8699i += read;
                    i8 += read;
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
            i4 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int i4 = this.f8697g;
        if (this.f8695e - i4 < 4) {
            I(4);
            i4 = this.f8697g;
        }
        this.f8697g = i4 + 4;
        byte[] bArr = this.f8694d;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public final long D() {
        int i4 = this.f8697g;
        if (this.f8695e - i4 < 8) {
            I(8);
            i4 = this.f8697g;
        }
        this.f8697g = i4 + 8;
        byte[] bArr = this.f8694d;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    public final int E() {
        int i4;
        int i8 = this.f8697g;
        int i9 = this.f8695e;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f8694d;
            byte b4 = bArr[i8];
            if (b4 >= 0) {
                this.f8697g = i10;
                return b4;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b4;
                if (i12 < 0) {
                    i4 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i4 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i4 = (-2080896) ^ i16;
                        } else {
                            i13 = i8 + 5;
                            byte b9 = bArr[i15];
                            int i17 = (i16 ^ (b9 << 28)) ^ 266354560;
                            if (b9 < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i4 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i4 = i17;
                            }
                            i4 = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.f8697g = i11;
                return i4;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j;
        long j5;
        long j8;
        long j9;
        int i4 = this.f8697g;
        int i8 = this.f8695e;
        if (i8 != i4) {
            int i9 = i4 + 1;
            byte[] bArr = this.f8694d;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.f8697g = i9;
                return b4;
            }
            if (i8 - i9 >= 9) {
                int i10 = i4 + 2;
                int i11 = (bArr[i9] << 7) ^ b4;
                if (i11 < 0) {
                    j = i11 ^ (-128);
                } else {
                    int i12 = i4 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j = i13 ^ 16256;
                        i10 = i12;
                    } else {
                        int i14 = i4 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            j9 = (-2080896) ^ i15;
                        } else {
                            long j10 = i15;
                            i10 = i4 + 5;
                            long j11 = j10 ^ (bArr[i14] << 28);
                            if (j11 >= 0) {
                                j8 = 266354560;
                            } else {
                                i14 = i4 + 6;
                                long j12 = j11 ^ (bArr[i10] << 35);
                                if (j12 < 0) {
                                    j5 = -34093383808L;
                                } else {
                                    i10 = i4 + 7;
                                    j11 = j12 ^ (bArr[i14] << 42);
                                    if (j11 >= 0) {
                                        j8 = 4363953127296L;
                                    } else {
                                        i14 = i4 + 8;
                                        j12 = j11 ^ (bArr[i10] << 49);
                                        if (j12 < 0) {
                                            j5 = -558586000294016L;
                                        } else {
                                            i10 = i4 + 9;
                                            long j13 = (j12 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                            if (j13 < 0) {
                                                int i16 = i4 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i16;
                                                }
                                            }
                                            j = j13;
                                        }
                                    }
                                }
                                j9 = j5 ^ j12;
                            }
                            j = j8 ^ j11;
                        }
                        i10 = i14;
                        j = j9;
                    }
                }
                this.f8697g = i10;
                return j;
            }
        }
        return G();
    }

    public final long G() {
        long j = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            if (this.f8697g == this.f8695e) {
                I(1);
            }
            int i8 = this.f8697g;
            this.f8697g = i8 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i4;
            if ((this.f8694d[i8] & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void H() {
        int i4 = this.f8695e + this.f8696f;
        this.f8695e = i4;
        int i8 = this.f8699i + i4;
        int i9 = this.j;
        if (i8 > i9) {
            int i10 = i8 - i9;
            this.f8696f = i10;
            this.f8695e = i4 - i10;
            return;
        }
        this.f8696f = 0;
    }

    public final void I(int i4) {
        if (!K(i4)) {
            if (i4 > (Integer.MAX_VALUE - this.f8699i) - this.f8697g) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void J(int i4) {
        int i8 = this.f8695e;
        int i9 = this.f8697g;
        int i10 = i8 - i9;
        if (i4 <= i10 && i4 >= 0) {
            this.f8697g = i9 + i4;
            return;
        }
        FileInputStream fileInputStream = this.f8693c;
        if (i4 >= 0) {
            int i11 = this.f8699i;
            int i12 = i11 + i9;
            int i13 = i12 + i4;
            int i14 = this.j;
            if (i13 <= i14) {
                this.f8699i = i12;
                this.f8695e = 0;
                this.f8697g = 0;
                while (i10 < i4) {
                    long j = i4 - i10;
                    try {
                        try {
                            long skip = fileInputStream.skip(j);
                            if (skip >= 0 && skip <= j) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i10 += (int) skip;
                                }
                            } else {
                                throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (InvalidProtocolBufferException e9) {
                            e9.f8608d = true;
                            throw e9;
                        }
                    } catch (Throwable th) {
                        this.f8699i += i10;
                        H();
                        throw th;
                    }
                }
                this.f8699i += i10;
                H();
                if (i10 < i4) {
                    int i15 = this.f8695e;
                    int i16 = i15 - this.f8697g;
                    this.f8697g = i15;
                    I(1);
                    while (true) {
                        int i17 = i4 - i16;
                        int i18 = this.f8695e;
                        if (i17 > i18) {
                            i16 += i18;
                            this.f8697g = i18;
                            I(1);
                        } else {
                            this.f8697g = i17;
                            return;
                        }
                    }
                }
            } else {
                J((i14 - i11) - i9);
                throw InvalidProtocolBufferException.e();
            }
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    public final boolean K(int i4) {
        FileInputStream fileInputStream = this.f8693c;
        int i8 = this.f8697g;
        int i9 = i8 + i4;
        int i10 = this.f8695e;
        if (i9 > i10) {
            int i11 = this.f8699i;
            if (i4 <= (Integer.MAX_VALUE - i11) - i8 && i11 + i8 + i4 <= this.j) {
                byte[] bArr = this.f8694d;
                if (i8 > 0) {
                    if (i10 > i8) {
                        System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                    }
                    this.f8699i += i8;
                    this.f8695e -= i8;
                    this.f8697g = 0;
                }
                int i12 = this.f8695e;
                try {
                    int read = fileInputStream.read(bArr, i12, Math.min(bArr.length - i12, (Integer.MAX_VALUE - this.f8699i) - i12));
                    if (read != 0 && read >= -1 && read <= bArr.length) {
                        if (read > 0) {
                            this.f8695e += read;
                            H();
                            if (this.f8695e >= i4) {
                                return true;
                            }
                            return K(i4);
                        }
                    } else {
                        throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    }
                } catch (InvalidProtocolBufferException e9) {
                    e9.f8608d = true;
                    throw e9;
                }
            }
            return false;
        }
        throw new IllegalStateException(A.j.j(i4, "refillBuffer() called when ", " bytes were already available in buffer"));
    }

    @Override // b8.c
    public final void a(int i4) {
        if (this.f8698h == i4) {
        } else {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // b8.c
    public final int b() {
        return this.f8699i + this.f8697g;
    }

    @Override // b8.c
    public final boolean c() {
        if (this.f8697g == this.f8695e && !K(1)) {
            return true;
        }
        return false;
    }

    @Override // b8.c
    public final void d(int i4) {
        this.j = i4;
        H();
    }

    @Override // b8.c
    public final int e(int i4) {
        if (i4 >= 0) {
            int i8 = this.f8699i + this.f8697g + i4;
            if (i8 >= 0) {
                int i9 = this.j;
                if (i8 <= i9) {
                    this.j = i8;
                    H();
                    return i9;
                }
                throw InvalidProtocolBufferException.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // b8.c
    public final boolean f() {
        if (F() != 0) {
            return true;
        }
        return false;
    }

    @Override // b8.c
    public final C0471g g() {
        int E7 = E();
        int i4 = this.f8695e;
        int i8 = this.f8697g;
        int i9 = i4 - i8;
        byte[] bArr = this.f8694d;
        if (E7 <= i9 && E7 > 0) {
            C0471g i10 = C0471g.i(bArr, i8, E7);
            this.f8697g += E7;
            return i10;
        }
        if (E7 == 0) {
            return C0471g.f8681f;
        }
        if (E7 >= 0) {
            byte[] A2 = A(E7);
            if (A2 != null) {
                return C0471g.i(A2, 0, A2.length);
            }
            int i11 = this.f8697g;
            int i12 = this.f8695e;
            int i13 = i12 - i11;
            this.f8699i += i12;
            this.f8697g = 0;
            this.f8695e = 0;
            ArrayList B8 = B(E7 - i13);
            byte[] bArr2 = new byte[E7];
            System.arraycopy(bArr, i11, bArr2, 0, i13);
            Iterator it = B8.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i13, bArr3.length);
                i13 += bArr3.length;
            }
            C0471g c0471g = C0471g.f8681f;
            return new C0471g(bArr2);
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // b8.c
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // b8.c
    public final int i() {
        return E();
    }

    @Override // b8.c
    public final int j() {
        return C();
    }

    @Override // b8.c
    public final long k() {
        return D();
    }

    @Override // b8.c
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // b8.c
    public final int m() {
        return E();
    }

    @Override // b8.c
    public final long n() {
        return F();
    }

    @Override // b8.c
    public final int o() {
        return C();
    }

    @Override // b8.c
    public final long p() {
        return D();
    }

    @Override // b8.c
    public final int q() {
        int E7 = E();
        return (-(E7 & 1)) ^ (E7 >>> 1);
    }

    @Override // b8.c
    public final long r() {
        long F2 = F();
        return (-(F2 & 1)) ^ (F2 >>> 1);
    }

    @Override // b8.c
    public final String s() {
        int E7 = E();
        byte[] bArr = this.f8694d;
        if (E7 > 0) {
            int i4 = this.f8695e;
            int i8 = this.f8697g;
            if (E7 <= i4 - i8) {
                String str = new String(bArr, i8, E7, AbstractC0486w.f8742a);
                this.f8697g += E7;
                return str;
            }
        }
        if (E7 == 0) {
            return "";
        }
        if (E7 >= 0) {
            if (E7 <= this.f8695e) {
                I(E7);
                String str2 = new String(bArr, this.f8697g, E7, AbstractC0486w.f8742a);
                this.f8697g += E7;
                return str2;
            }
            return new String(z(E7), AbstractC0486w.f8742a);
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // b8.c
    public final String t() {
        int E7 = E();
        int i4 = this.f8697g;
        int i8 = this.f8695e;
        int i9 = i8 - i4;
        byte[] bArr = this.f8694d;
        if (E7 <= i9 && E7 > 0) {
            this.f8697g = i4 + E7;
        } else {
            if (E7 == 0) {
                return "";
            }
            if (E7 >= 0) {
                i4 = 0;
                if (E7 <= i8) {
                    I(E7);
                    this.f8697g = E7;
                } else {
                    bArr = z(E7);
                }
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        return i0.f8700a.k(bArr, i4, E7);
    }

    @Override // b8.c
    public final int u() {
        if (c()) {
            this.f8698h = 0;
            return 0;
        }
        int E7 = E();
        this.f8698h = E7;
        if ((E7 >>> 3) != 0) {
            return E7;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // b8.c
    public final int v() {
        return E();
    }

    @Override // b8.c
    public final long w() {
        return F();
    }

    @Override // b8.c
    public final boolean x(int i4) {
        int i8 = i4 & 7;
        int i9 = 0;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            return false;
                        }
                        if (i8 == 5) {
                            J(4);
                            return true;
                        }
                        throw InvalidProtocolBufferException.b();
                    }
                    y();
                    a(((i4 >>> 3) << 3) | 4);
                    return true;
                }
                J(E());
                return true;
            }
            J(8);
            return true;
        }
        int i10 = this.f8695e - this.f8697g;
        byte[] bArr = this.f8694d;
        if (i10 >= 10) {
            while (i9 < 10) {
                int i11 = this.f8697g;
                this.f8697g = i11 + 1;
                if (bArr[i11] < 0) {
                    i9++;
                }
            }
            throw InvalidProtocolBufferException.c();
        }
        while (i9 < 10) {
            if (this.f8697g == this.f8695e) {
                I(1);
            }
            int i12 = this.f8697g;
            this.f8697g = i12 + 1;
            if (bArr[i12] < 0) {
                i9++;
            }
        }
        throw InvalidProtocolBufferException.c();
        return true;
    }

    public final byte[] z(int i4) {
        byte[] A2 = A(i4);
        if (A2 != null) {
            return A2;
        }
        int i8 = this.f8697g;
        int i9 = this.f8695e;
        int i10 = i9 - i8;
        this.f8699i += i9;
        this.f8697g = 0;
        this.f8695e = 0;
        ArrayList B8 = B(i4 - i10);
        byte[] bArr = new byte[i4];
        System.arraycopy(this.f8694d, i8, bArr, 0, i10);
        Iterator it = B8.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
            i10 += bArr2.length;
        }
        return bArr;
    }
}
