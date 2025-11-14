package g7;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: g7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797f {

    /* renamed from: c, reason: collision with root package name */
    public int f11226c;

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f11228e;

    /* renamed from: f, reason: collision with root package name */
    public int f11229f;

    /* renamed from: i, reason: collision with root package name */
    public int f11232i;

    /* renamed from: h, reason: collision with root package name */
    public int f11231h = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11224a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    public int f11225b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f11227d = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f11230g = 0;

    public C0797f(InputStream inputStream) {
        this.f11228e = inputStream;
    }

    public final void a(int i4) {
        if (this.f11229f == i4) {
        } else {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        int i4 = this.f11231h;
        if (i4 == Integer.MAX_VALUE) {
            return -1;
        }
        return i4 - (this.f11230g + this.f11227d);
    }

    public final void c(int i4) {
        this.f11231h = i4;
        o();
    }

    public final int d(int i4) {
        if (i4 >= 0) {
            int i8 = this.f11230g + this.f11227d + i4;
            int i9 = this.f11231h;
            if (i8 <= i9) {
                this.f11231h = i8;
                o();
                return i9;
            }
            throw InvalidProtocolBufferException.b();
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final t e() {
        int k = k();
        int i4 = this.f11225b;
        int i8 = this.f11227d;
        if (k <= i4 - i8 && k > 0) {
            byte[] bArr = new byte[k];
            System.arraycopy(this.f11224a, i8, bArr, 0, k);
            t tVar = new t(bArr);
            this.f11227d += k;
            return tVar;
        }
        if (k == 0) {
            return AbstractC0796e.f11223d;
        }
        return new t(h(k));
    }

    public final int f() {
        return k();
    }

    public final AbstractC0793b g(v vVar, C0799h c0799h) {
        int k = k();
        if (this.f11232i < 64) {
            int d2 = d(k);
            this.f11232i++;
            AbstractC0793b abstractC0793b = (AbstractC0793b) vVar.a(this, c0799h);
            a(0);
            this.f11232i--;
            c(d2);
            return abstractC0793b;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final byte[] h(int i4) {
        if (i4 <= 0) {
            if (i4 == 0) {
                return q.f11252a;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = this.f11230g;
        int i9 = this.f11227d;
        int i10 = i8 + i9 + i4;
        int i11 = this.f11231h;
        if (i10 <= i11) {
            byte[] bArr = this.f11224a;
            if (i4 < 4096) {
                byte[] bArr2 = new byte[i4];
                int i12 = this.f11225b - i9;
                System.arraycopy(bArr, i9, bArr2, 0, i12);
                this.f11227d = this.f11225b;
                int i13 = i4 - i12;
                if (i13 > 0) {
                    p(i13);
                }
                System.arraycopy(bArr, 0, bArr2, i12, i13);
                this.f11227d = i13;
                return bArr2;
            }
            int i14 = this.f11225b;
            this.f11230g = i8 + i14;
            this.f11227d = 0;
            this.f11225b = 0;
            int i15 = i14 - i9;
            int i16 = i4 - i15;
            ArrayList arrayList = new ArrayList();
            while (i16 > 0) {
                int min = Math.min(i16, 4096);
                byte[] bArr3 = new byte[min];
                int i17 = 0;
                while (i17 < min) {
                    int read = this.f11228e.read(bArr3, i17, min - i17);
                    if (read != -1) {
                        this.f11230g += read;
                        i17 += read;
                    } else {
                        throw InvalidProtocolBufferException.b();
                    }
                }
                i16 -= min;
                arrayList.add(bArr3);
            }
            byte[] bArr4 = new byte[i4];
            System.arraycopy(bArr, i9, bArr4, 0, i15);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr5 = (byte[]) it.next();
                System.arraycopy(bArr5, 0, bArr4, i15, bArr5.length);
                i15 += bArr5.length;
            }
            return bArr4;
        }
        r((i11 - i8) - i9);
        throw InvalidProtocolBufferException.b();
    }

    public final int i() {
        int i4 = this.f11227d;
        if (this.f11225b - i4 < 4) {
            p(4);
            i4 = this.f11227d;
        }
        this.f11227d = i4 + 4;
        byte[] bArr = this.f11224a;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public final long j() {
        int i4 = this.f11227d;
        if (this.f11225b - i4 < 8) {
            p(8);
            i4 = this.f11227d;
        }
        this.f11227d = i4 + 8;
        byte[] bArr = this.f11224a;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    public final int k() {
        int i4;
        int i8 = this.f11227d;
        int i9 = this.f11225b;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f11224a;
            byte b4 = bArr[i8];
            if (b4 >= 0) {
                this.f11227d = i10;
                return b4;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b4;
                long j = i12;
                if (j < 0) {
                    i4 = (int) ((-128) ^ j);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    long j5 = i14;
                    if (j5 >= 0) {
                        i4 = (int) (16256 ^ j5);
                    } else {
                        int i15 = i8 + 4;
                        long j8 = i14 ^ (bArr[i13] << 21);
                        if (j8 < 0) {
                            i4 = (int) ((-2080896) ^ j8);
                        } else {
                            i13 = i8 + 5;
                            int i16 = (int) ((r1 ^ (r2 << 28)) ^ 266354560);
                            if (bArr[i15] < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i17 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i17;
                                                    i4 = i16;
                                                }
                                            }
                                        }
                                    }
                                }
                                i4 = i16;
                            }
                            i4 = i16;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.f11227d = i11;
                return i4;
            }
        }
        return (int) m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long l() {
        long j;
        long j5;
        long j8;
        int i4 = this.f11227d;
        int i8 = this.f11225b;
        if (i8 != i4) {
            int i9 = i4 + 1;
            byte[] bArr = this.f11224a;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.f11227d = i9;
                return b4;
            }
            if (i8 - i9 >= 9) {
                int i10 = i4 + 2;
                long j9 = (bArr[i9] << 7) ^ b4;
                if (j9 < 0) {
                    j5 = -128;
                } else {
                    int i11 = i4 + 3;
                    long j10 = j9 ^ (bArr[i10] << 14);
                    if (j10 >= 0) {
                        j8 = 16256;
                    } else {
                        i10 = i4 + 4;
                        j9 = j10 ^ (bArr[i11] << 21);
                        if (j9 < 0) {
                            j5 = -2080896;
                        } else {
                            i11 = i4 + 5;
                            j10 = j9 ^ (bArr[i10] << 28);
                            if (j10 >= 0) {
                                j8 = 266354560;
                            } else {
                                i10 = i4 + 6;
                                j9 = j10 ^ (bArr[i11] << 35);
                                if (j9 < 0) {
                                    j5 = -34093383808L;
                                } else {
                                    i11 = i4 + 7;
                                    j10 = j9 ^ (bArr[i10] << 42);
                                    if (j10 >= 0) {
                                        j8 = 4363953127296L;
                                    } else {
                                        i10 = i4 + 8;
                                        j9 = j10 ^ (bArr[i11] << 49);
                                        if (j9 < 0) {
                                            j5 = -558586000294016L;
                                        } else {
                                            int i12 = i4 + 9;
                                            long j11 = (j9 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j11 < 0) {
                                                i10 = i4 + 10;
                                            } else {
                                                i10 = i12;
                                            }
                                            j = j11;
                                            this.f11227d = i10;
                                            return j;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i10 = i11;
                    j = j8 ^ j10;
                    this.f11227d = i10;
                    return j;
                }
                j = j5 ^ j9;
                this.f11227d = i10;
                return j;
            }
        }
        return m();
    }

    public final long m() {
        long j = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            if (this.f11227d == this.f11225b) {
                p(1);
            }
            int i8 = this.f11227d;
            this.f11227d = i8 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i4;
            if ((this.f11224a[i8] & 128) == 0) {
                return j;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public final int n() {
        if (this.f11227d == this.f11225b && !s(1)) {
            this.f11229f = 0;
            return 0;
        }
        int k = k();
        this.f11229f = k;
        if ((k >>> 3) != 0) {
            return k;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public final void o() {
        int i4 = this.f11225b + this.f11226c;
        this.f11225b = i4;
        int i8 = this.f11230g + i4;
        int i9 = this.f11231h;
        if (i8 > i9) {
            int i10 = i8 - i9;
            this.f11226c = i10;
            this.f11225b = i4 - i10;
            return;
        }
        this.f11226c = 0;
    }

    public final void p(int i4) {
        if (s(i4)) {
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean q(int i4, L5.m mVar) {
        int n3;
        int i8 = i4 & 7;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 == 5) {
                                int i9 = i();
                                mVar.v(i4);
                                mVar.t(i9);
                                return true;
                            }
                            throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
                        }
                        return false;
                    }
                    mVar.v(i4);
                    do {
                        n3 = n();
                        if (n3 == 0) {
                            break;
                        }
                    } while (q(n3, mVar));
                    int i10 = ((i4 >>> 3) << 3) | 4;
                    a(i10);
                    mVar.v(i10);
                    return true;
                }
                t e9 = e();
                mVar.v(i4);
                mVar.v(e9.size());
                mVar.r(e9);
                return true;
            }
            long j = j();
            mVar.v(i4);
            mVar.u(j);
            return true;
        }
        long l6 = l();
        mVar.v(i4);
        mVar.w(l6);
        return true;
    }

    public final void r(int i4) {
        int i8 = this.f11225b;
        int i9 = this.f11227d;
        int i10 = i8 - i9;
        if (i4 <= i10 && i4 >= 0) {
            this.f11227d = i9 + i4;
            return;
        }
        if (i4 >= 0) {
            int i11 = this.f11230g;
            int i12 = i11 + i9 + i4;
            int i13 = this.f11231h;
            if (i12 <= i13) {
                this.f11227d = i8;
                p(1);
                while (true) {
                    int i14 = i4 - i10;
                    int i15 = this.f11225b;
                    if (i14 > i15) {
                        i10 += i15;
                        this.f11227d = i15;
                        p(1);
                    } else {
                        this.f11227d = i14;
                        return;
                    }
                }
            } else {
                r((i13 - i11) - i9);
                throw InvalidProtocolBufferException.b();
            }
        } else {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final boolean s(int i4) {
        InputStream inputStream;
        int i8 = this.f11227d;
        int i9 = i8 + i4;
        int i10 = this.f11225b;
        if (i9 > i10) {
            if (this.f11230g + i8 + i4 <= this.f11231h && (inputStream = this.f11228e) != null) {
                byte[] bArr = this.f11224a;
                if (i8 > 0) {
                    if (i10 > i8) {
                        System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                    }
                    this.f11230g += i8;
                    this.f11225b -= i8;
                    this.f11227d = 0;
                }
                int i11 = this.f11225b;
                int read = inputStream.read(bArr, i11, bArr.length - i11);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read > 0) {
                        this.f11225b += read;
                        if ((this.f11230g + i4) - 67108864 <= 0) {
                            o();
                            if (this.f11225b >= i4) {
                                return true;
                            }
                            return s(i4);
                        }
                        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                    }
                } else {
                    StringBuilder sb = new StringBuilder(102);
                    sb.append("InputStream#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
            }
            return false;
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i4);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }
}
