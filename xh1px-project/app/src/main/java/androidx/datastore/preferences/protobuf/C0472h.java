package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472h extends b8.c {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8686c;

    /* renamed from: d, reason: collision with root package name */
    public int f8687d;

    /* renamed from: e, reason: collision with root package name */
    public int f8688e;

    /* renamed from: f, reason: collision with root package name */
    public int f8689f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8690g;

    /* renamed from: h, reason: collision with root package name */
    public int f8691h;

    /* renamed from: i, reason: collision with root package name */
    public int f8692i = Integer.MAX_VALUE;

    public C0472h(byte[] bArr, int i4, int i8, boolean z8) {
        this.f8686c = bArr;
        this.f8687d = i8 + i4;
        this.f8689f = i4;
        this.f8690g = i4;
    }

    public final long A() {
        int i4 = this.f8689f;
        if (this.f8687d - i4 >= 8) {
            this.f8689f = i4 + 8;
            byte[] bArr = this.f8686c;
            return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
        }
        throw InvalidProtocolBufferException.e();
    }

    public final int B() {
        int i4;
        int i8 = this.f8689f;
        int i9 = this.f8687d;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f8686c;
            byte b4 = bArr[i8];
            if (b4 >= 0) {
                this.f8689f = i10;
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
                this.f8689f = i11;
                return i4;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j;
        long j5;
        long j8;
        long j9;
        int i4 = this.f8689f;
        int i8 = this.f8687d;
        if (i8 != i4) {
            int i9 = i4 + 1;
            byte[] bArr = this.f8686c;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.f8689f = i9;
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
                this.f8689f = i10;
                return j;
            }
        }
        return D();
    }

    public final long D() {
        long j = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            int i8 = this.f8689f;
            if (i8 != this.f8687d) {
                this.f8689f = i8 + 1;
                j |= (r3 & Byte.MAX_VALUE) << i4;
                if ((this.f8686c[i8] & 128) == 0) {
                    return j;
                }
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void E() {
        int i4 = this.f8687d + this.f8688e;
        this.f8687d = i4;
        int i8 = i4 - this.f8690g;
        int i9 = this.f8692i;
        if (i8 > i9) {
            int i10 = i8 - i9;
            this.f8688e = i10;
            this.f8687d = i4 - i10;
            return;
        }
        this.f8688e = 0;
    }

    public final void F(int i4) {
        if (i4 >= 0) {
            int i8 = this.f8687d;
            int i9 = this.f8689f;
            if (i4 <= i8 - i9) {
                this.f8689f = i9 + i4;
                return;
            }
        }
        if (i4 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // b8.c
    public final void a(int i4) {
        if (this.f8691h == i4) {
        } else {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // b8.c
    public final int b() {
        return this.f8689f - this.f8690g;
    }

    @Override // b8.c
    public final boolean c() {
        if (this.f8689f == this.f8687d) {
            return true;
        }
        return false;
    }

    @Override // b8.c
    public final void d(int i4) {
        this.f8692i = i4;
        E();
    }

    @Override // b8.c
    public final int e(int i4) {
        if (i4 >= 0) {
            int b4 = b() + i4;
            if (b4 >= 0) {
                int i8 = this.f8692i;
                if (b4 <= i8) {
                    this.f8692i = b4;
                    E();
                    return i8;
                }
                throw InvalidProtocolBufferException.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // b8.c
    public final boolean f() {
        if (C() != 0) {
            return true;
        }
        return false;
    }

    @Override // b8.c
    public final C0471g g() {
        byte[] bArr;
        int B8 = B();
        byte[] bArr2 = this.f8686c;
        if (B8 > 0) {
            int i4 = this.f8687d;
            int i8 = this.f8689f;
            if (B8 <= i4 - i8) {
                C0471g i9 = C0471g.i(bArr2, i8, B8);
                this.f8689f += B8;
                return i9;
            }
        }
        if (B8 == 0) {
            return C0471g.f8681f;
        }
        if (B8 > 0) {
            int i10 = this.f8687d;
            int i11 = this.f8689f;
            if (B8 <= i10 - i11) {
                int i12 = B8 + i11;
                this.f8689f = i12;
                bArr = Arrays.copyOfRange(bArr2, i11, i12);
                C0471g c0471g = C0471g.f8681f;
                return new C0471g(bArr);
            }
        }
        if (B8 <= 0) {
            if (B8 == 0) {
                bArr = AbstractC0486w.f8743b;
                C0471g c0471g2 = C0471g.f8681f;
                return new C0471g(bArr);
            }
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // b8.c
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // b8.c
    public final int i() {
        return B();
    }

    @Override // b8.c
    public final int j() {
        return z();
    }

    @Override // b8.c
    public final long k() {
        return A();
    }

    @Override // b8.c
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // b8.c
    public final int m() {
        return B();
    }

    @Override // b8.c
    public final long n() {
        return C();
    }

    @Override // b8.c
    public final int o() {
        return z();
    }

    @Override // b8.c
    public final long p() {
        return A();
    }

    @Override // b8.c
    public final int q() {
        int B8 = B();
        return (-(B8 & 1)) ^ (B8 >>> 1);
    }

    @Override // b8.c
    public final long r() {
        long C8 = C();
        return (-(C8 & 1)) ^ (C8 >>> 1);
    }

    @Override // b8.c
    public final String s() {
        int B8 = B();
        if (B8 > 0) {
            int i4 = this.f8687d;
            int i8 = this.f8689f;
            if (B8 <= i4 - i8) {
                String str = new String(this.f8686c, i8, B8, AbstractC0486w.f8742a);
                this.f8689f += B8;
                return str;
            }
        }
        if (B8 == 0) {
            return "";
        }
        if (B8 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // b8.c
    public final String t() {
        int B8 = B();
        if (B8 > 0) {
            int i4 = this.f8687d;
            int i8 = this.f8689f;
            if (B8 <= i4 - i8) {
                String k = i0.f8700a.k(this.f8686c, i8, B8);
                this.f8689f += B8;
                return k;
            }
        }
        if (B8 == 0) {
            return "";
        }
        if (B8 <= 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // b8.c
    public final int u() {
        if (c()) {
            this.f8691h = 0;
            return 0;
        }
        int B8 = B();
        this.f8691h = B8;
        if ((B8 >>> 3) != 0) {
            return B8;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // b8.c
    public final int v() {
        return B();
    }

    @Override // b8.c
    public final long w() {
        return C();
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
                            F(4);
                            return true;
                        }
                        throw InvalidProtocolBufferException.b();
                    }
                    y();
                    a(((i4 >>> 3) << 3) | 4);
                    return true;
                }
                F(B());
                return true;
            }
            F(8);
            return true;
        }
        int i10 = this.f8687d - this.f8689f;
        byte[] bArr = this.f8686c;
        if (i10 >= 10) {
            while (i9 < 10) {
                int i11 = this.f8689f;
                this.f8689f = i11 + 1;
                if (bArr[i11] < 0) {
                    i9++;
                }
            }
            throw InvalidProtocolBufferException.c();
        }
        while (i9 < 10) {
            int i12 = this.f8689f;
            if (i12 != this.f8687d) {
                this.f8689f = i12 + 1;
                if (bArr[i12] < 0) {
                    i9++;
                }
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
        throw InvalidProtocolBufferException.c();
        return true;
    }

    public final int z() {
        int i4 = this.f8689f;
        if (this.f8687d - i4 >= 4) {
            this.f8689f = i4 + 4;
            byte[] bArr = this.f8686c;
            return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
        }
        throw InvalidProtocolBufferException.e();
    }
}
