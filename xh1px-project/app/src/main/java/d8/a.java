package d8;

import a.AbstractC0405a;
import a6.AbstractC0434i;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class a implements b, Cloneable, ByteChannel, Closeable, Flushable, WritableByteChannel {

    /* renamed from: d, reason: collision with root package name */
    public j f10524d;

    /* renamed from: e, reason: collision with root package name */
    public long f10525e;

    public final void B(int i4) {
        j y4 = y(4);
        byte[] bArr = y4.f10544a;
        int i8 = y4.f10546c;
        bArr[i8] = (byte) ((i4 >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i4 >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i4 >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i4 & 255);
        y4.f10546c = i8 + 4;
        this.f10525e += 4;
    }

    public final void D(String str, int i4, int i8) {
        char charAt;
        char c6;
        if (i4 >= 0) {
            if (i8 >= i4) {
                if (i8 <= str.length()) {
                    while (i4 < i8) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 < 128) {
                            j y4 = y(1);
                            byte[] bArr = y4.f10544a;
                            int i9 = y4.f10546c - i4;
                            int min = Math.min(i8, 8192 - i9);
                            int i10 = i4 + 1;
                            bArr[i4 + i9] = (byte) charAt2;
                            while (true) {
                                i4 = i10;
                                if (i4 >= min || (charAt = str.charAt(i4)) >= 128) {
                                    break;
                                }
                                i10 = i4 + 1;
                                bArr[i4 + i9] = (byte) charAt;
                            }
                            int i11 = y4.f10546c;
                            int i12 = (i9 + i4) - i11;
                            y4.f10546c = i11 + i12;
                            this.f10525e += i12;
                        } else {
                            if (charAt2 < 2048) {
                                j y5 = y(2);
                                byte[] bArr2 = y5.f10544a;
                                int i13 = y5.f10546c;
                                bArr2[i13] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i13 + 1] = (byte) ((charAt2 & '?') | 128);
                                y5.f10546c = i13 + 2;
                                this.f10525e += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i14 = i4 + 1;
                                if (i14 < i8) {
                                    c6 = str.charAt(i14);
                                } else {
                                    c6 = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c6 && c6 < 57344) {
                                    int i15 = (((charAt2 & 1023) << 10) | (c6 & 1023)) + 65536;
                                    j y8 = y(4);
                                    byte[] bArr3 = y8.f10544a;
                                    int i16 = y8.f10546c;
                                    bArr3[i16] = (byte) ((i15 >> 18) | 240);
                                    bArr3[i16 + 1] = (byte) (((i15 >> 12) & 63) | 128);
                                    bArr3[i16 + 2] = (byte) (((i15 >> 6) & 63) | 128);
                                    bArr3[i16 + 3] = (byte) ((i15 & 63) | 128);
                                    y8.f10546c = i16 + 4;
                                    this.f10525e += 4;
                                    i4 += 2;
                                } else {
                                    z(63);
                                    i4 = i14;
                                }
                            } else {
                                j y9 = y(3);
                                byte[] bArr4 = y9.f10544a;
                                int i17 = y9.f10546c;
                                bArr4[i17] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i17 + 2] = (byte) ((charAt2 & '?') | 128);
                                y9.f10546c = i17 + 3;
                                this.f10525e += 3;
                            }
                            i4++;
                        }
                    }
                    return;
                }
                StringBuilder j = AbstractC1149a.j(i8, "endIndex > string.length: ", " > ");
                j.append(str.length());
                throw new IllegalArgumentException(j.toString().toString());
            }
            throw new IllegalArgumentException(A.j.i(i8, i4, "endIndex < beginIndex: ", " < ").toString());
        }
        throw new IllegalArgumentException(A.j.l("beginIndex < 0: ", i4).toString());
    }

    public final byte a(long j) {
        AbstractC0405a.m(this.f10525e, j, 1L);
        j jVar = this.f10524d;
        if (jVar != null) {
            long j5 = this.f10525e;
            if (j5 - j < j) {
                while (j5 > j) {
                    jVar = jVar.f10550g;
                    o6.j.b(jVar);
                    j5 -= jVar.f10546c - jVar.f10545b;
                }
                return jVar.f10544a[(int) ((jVar.f10545b + j) - j5)];
            }
            long j8 = 0;
            while (true) {
                int i4 = jVar.f10546c;
                int i8 = jVar.f10545b;
                long j9 = (i4 - i8) + j8;
                if (j9 <= j) {
                    jVar = jVar.f10549f;
                    o6.j.b(jVar);
                    j8 = j9;
                } else {
                    return jVar.f10544a[(int) ((i8 + j) - j8)];
                }
            }
        } else {
            o6.j.b(null);
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d8.a, java.lang.Object] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.f10525e == 0) {
            return obj;
        }
        j jVar = this.f10524d;
        o6.j.b(jVar);
        j c6 = jVar.c();
        obj.f10524d = c6;
        c6.f10550g = c6;
        c6.f10549f = c6;
        for (j jVar2 = jVar.f10549f; jVar2 != jVar; jVar2 = jVar2.f10549f) {
            j jVar3 = c6.f10550g;
            o6.j.b(jVar3);
            o6.j.b(jVar2);
            jVar3.b(jVar2.c());
        }
        obj.f10525e = this.f10525e;
        return obj;
    }

    public final byte d() {
        if (this.f10525e != 0) {
            j jVar = this.f10524d;
            o6.j.b(jVar);
            int i4 = jVar.f10545b;
            int i8 = jVar.f10546c;
            int i9 = i4 + 1;
            byte b4 = jVar.f10544a[i4];
            this.f10525e--;
            if (i9 == i8) {
                this.f10524d = jVar.a();
                k.a(jVar);
                return b4;
            }
            jVar.f10545b = i9;
            return b4;
        }
        throw new EOFException();
    }

    public final byte[] e(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.f10525e >= j) {
                int i4 = (int) j;
                byte[] bArr = new byte[i4];
                int i8 = 0;
                while (i8 < i4) {
                    int read = read(bArr, i8, i4 - i8);
                    if (read != -1) {
                        i8 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(AbstractC1149a.f("byteCount: ", j).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        long j = this.f10525e;
        a aVar = (a) obj;
        if (j != aVar.f10525e) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        j jVar = this.f10524d;
        o6.j.b(jVar);
        j jVar2 = aVar.f10524d;
        o6.j.b(jVar2);
        int i4 = jVar.f10545b;
        int i8 = jVar2.f10545b;
        long j5 = 0;
        while (j5 < this.f10525e) {
            long min = Math.min(jVar.f10546c - i4, jVar2.f10546c - i8);
            long j8 = 0;
            while (j8 < min) {
                int i9 = i4 + 1;
                int i10 = i8 + 1;
                if (jVar.f10544a[i4] != jVar2.f10544a[i8]) {
                    return false;
                }
                j8++;
                i4 = i9;
                i8 = i10;
            }
            if (i4 == jVar.f10546c) {
                jVar = jVar.f10549f;
                o6.j.b(jVar);
                i4 = jVar.f10545b;
            }
            if (i8 == jVar2.f10546c) {
                jVar2 = jVar2.f10549f;
                o6.j.b(jVar2);
                i8 = jVar2.f10545b;
            }
            j5 += min;
        }
        return true;
    }

    @Override // d8.m
    public final long h(a aVar, long j) {
        long j5;
        j jVar;
        j b4;
        int i4;
        o6.j.e(aVar, "sink");
        if (j >= 0) {
            long j8 = this.f10525e;
            if (j8 == 0) {
                return -1L;
            }
            if (j > j8) {
                j5 = j8;
            } else {
                j5 = j;
            }
            if (this != aVar) {
                AbstractC0405a.m(j8, 0L, j5);
                long j9 = j5;
                while (j9 > 0) {
                    j jVar2 = this.f10524d;
                    o6.j.b(jVar2);
                    int i8 = jVar2.f10546c;
                    j jVar3 = this.f10524d;
                    o6.j.b(jVar3);
                    long j10 = i8 - jVar3.f10545b;
                    int i9 = 0;
                    if (j9 < j10) {
                        j jVar4 = aVar.f10524d;
                        if (jVar4 != null) {
                            jVar = jVar4.f10550g;
                        } else {
                            jVar = null;
                        }
                        if (jVar != null && jVar.f10548e) {
                            long j11 = jVar.f10546c + j9;
                            if (jVar.f10547d) {
                                i4 = 0;
                            } else {
                                i4 = jVar.f10545b;
                            }
                            if (j11 - i4 <= 8192) {
                                j jVar5 = this.f10524d;
                                o6.j.b(jVar5);
                                jVar5.d(jVar, (int) j9);
                                this.f10525e -= j9;
                                aVar.f10525e += j9;
                                return j5;
                            }
                        }
                        j jVar6 = this.f10524d;
                        o6.j.b(jVar6);
                        int i10 = (int) j9;
                        if (i10 > 0 && i10 <= jVar6.f10546c - jVar6.f10545b) {
                            if (i10 >= 1024) {
                                b4 = jVar6.c();
                            } else {
                                b4 = k.b();
                                byte[] bArr = jVar6.f10544a;
                                byte[] bArr2 = b4.f10544a;
                                int i11 = jVar6.f10545b;
                                AbstractC0434i.O0(0, i11, i11 + i10, bArr, bArr2);
                            }
                            b4.f10546c = b4.f10545b + i10;
                            jVar6.f10545b += i10;
                            j jVar7 = jVar6.f10550g;
                            o6.j.b(jVar7);
                            jVar7.b(b4);
                            this.f10524d = b4;
                        } else {
                            throw new IllegalArgumentException("byteCount out of range");
                        }
                    }
                    j jVar8 = this.f10524d;
                    o6.j.b(jVar8);
                    long j12 = jVar8.f10546c - jVar8.f10545b;
                    this.f10524d = jVar8.a();
                    j jVar9 = aVar.f10524d;
                    if (jVar9 == null) {
                        aVar.f10524d = jVar8;
                        jVar8.f10550g = jVar8;
                        jVar8.f10549f = jVar8;
                    } else {
                        j jVar10 = jVar9.f10550g;
                        o6.j.b(jVar10);
                        jVar10.b(jVar8);
                        j jVar11 = jVar8.f10550g;
                        if (jVar11 != jVar8) {
                            o6.j.b(jVar11);
                            if (jVar11.f10548e) {
                                int i12 = jVar8.f10546c - jVar8.f10545b;
                                j jVar12 = jVar8.f10550g;
                                o6.j.b(jVar12);
                                int i13 = 8192 - jVar12.f10546c;
                                j jVar13 = jVar8.f10550g;
                                o6.j.b(jVar13);
                                if (!jVar13.f10547d) {
                                    j jVar14 = jVar8.f10550g;
                                    o6.j.b(jVar14);
                                    i9 = jVar14.f10545b;
                                }
                                if (i12 <= i13 + i9) {
                                    j jVar15 = jVar8.f10550g;
                                    o6.j.b(jVar15);
                                    jVar8.d(jVar15, i12);
                                    jVar8.a();
                                    k.a(jVar8);
                                }
                            }
                        } else {
                            throw new IllegalStateException("cannot compact");
                        }
                    }
                    this.f10525e -= j12;
                    aVar.f10525e += j12;
                    j9 -= j12;
                }
                return j5;
            }
            throw new IllegalArgumentException("source == this");
        }
        throw new IllegalArgumentException(AbstractC1149a.f("byteCount < 0: ", j).toString());
    }

    public final int hashCode() {
        j jVar = this.f10524d;
        if (jVar == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i8 = jVar.f10546c;
            for (int i9 = jVar.f10545b; i9 < i8; i9++) {
                i4 = (i4 * 31) + jVar.f10544a[i9];
            }
            jVar = jVar.f10549f;
            o6.j.b(jVar);
        } while (jVar != this.f10524d);
        return i4;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final c j() {
        long j = this.f10525e;
        if (j >= 0 && j <= 2147483647L) {
            if (j >= j) {
                if (j >= 4096) {
                    c v8 = v((int) j);
                    p(j);
                    return v8;
                }
                return new c(e(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(AbstractC1149a.f("byteCount: ", j).toString());
    }

    public final String n(long j, Charset charset) {
        o6.j.e(charset, "charset");
        if (j >= 0 && j <= 2147483647L) {
            if (this.f10525e >= j) {
                if (j == 0) {
                    return "";
                }
                j jVar = this.f10524d;
                o6.j.b(jVar);
                int i4 = jVar.f10545b;
                if (i4 + j > jVar.f10546c) {
                    return new String(e(j), charset);
                }
                int i8 = (int) j;
                String str = new String(jVar.f10544a, i4, i8, charset);
                int i9 = jVar.f10545b + i8;
                jVar.f10545b = i9;
                this.f10525e -= j;
                if (i9 == jVar.f10546c) {
                    this.f10524d = jVar.a();
                    k.a(jVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(AbstractC1149a.f("byteCount: ", j).toString());
    }

    @Override // d8.b
    public final boolean o(long j) {
        if (this.f10525e >= j) {
            return true;
        }
        return false;
    }

    public final void p(long j) {
        while (j > 0) {
            j jVar = this.f10524d;
            if (jVar != null) {
                int min = (int) Math.min(j, jVar.f10546c - jVar.f10545b);
                long j5 = min;
                this.f10525e -= j5;
                j -= j5;
                int i4 = jVar.f10545b + min;
                jVar.f10545b = i4;
                if (i4 == jVar.f10546c) {
                    this.f10524d = jVar.a();
                    k.a(jVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        o6.j.e(byteBuffer, "sink");
        j jVar = this.f10524d;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), jVar.f10546c - jVar.f10545b);
        byteBuffer.put(jVar.f10544a, jVar.f10545b, min);
        int i4 = jVar.f10545b + min;
        jVar.f10545b = i4;
        this.f10525e -= min;
        if (i4 == jVar.f10546c) {
            this.f10524d = jVar.a();
            k.a(jVar);
        }
        return min;
    }

    public final String toString() {
        long j = this.f10525e;
        if (j <= 2147483647L) {
            return v((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f10525e).toString());
    }

    public final c v(int i4) {
        if (i4 == 0) {
            return c.f10526g;
        }
        AbstractC0405a.m(this.f10525e, 0L, i4);
        j jVar = this.f10524d;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i4) {
            o6.j.b(jVar);
            int i11 = jVar.f10546c;
            int i12 = jVar.f10545b;
            if (i11 != i12) {
                i9 += i11 - i12;
                i10++;
                jVar = jVar.f10549f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i10];
        int[] iArr = new int[i10 * 2];
        j jVar2 = this.f10524d;
        int i13 = 0;
        while (i8 < i4) {
            o6.j.b(jVar2);
            bArr[i13] = jVar2.f10544a;
            i8 += jVar2.f10546c - jVar2.f10545b;
            iArr[i13] = Math.min(i8, i4);
            iArr[i13 + i10] = jVar2.f10545b;
            jVar2.f10547d = true;
            i13++;
            jVar2 = jVar2.f10549f;
        }
        return new l(bArr, iArr);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        o6.j.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i4 = remaining;
        while (i4 > 0) {
            j y4 = y(1);
            int min = Math.min(i4, 8192 - y4.f10546c);
            byteBuffer.get(y4.f10544a, y4.f10546c, min);
            i4 -= min;
            y4.f10546c += min;
        }
        this.f10525e += remaining;
        return remaining;
    }

    public final j y(int i4) {
        if (i4 >= 1 && i4 <= 8192) {
            j jVar = this.f10524d;
            if (jVar == null) {
                j b4 = k.b();
                this.f10524d = b4;
                b4.f10550g = b4;
                b4.f10549f = b4;
                return b4;
            }
            j jVar2 = jVar.f10550g;
            o6.j.b(jVar2);
            if (jVar2.f10546c + i4 <= 8192 && jVar2.f10548e) {
                return jVar2;
            }
            j b9 = k.b();
            jVar2.b(b9);
            return b9;
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    public final void z(int i4) {
        j y4 = y(1);
        byte[] bArr = y4.f10544a;
        int i8 = y4.f10546c;
        y4.f10546c = i8 + 1;
        bArr[i8] = (byte) i4;
        this.f10525e++;
    }

    public final int read(byte[] bArr, int i4, int i8) {
        AbstractC0405a.m(bArr.length, i4, i8);
        j jVar = this.f10524d;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(i8, jVar.f10546c - jVar.f10545b);
        byte[] bArr2 = jVar.f10544a;
        int i9 = jVar.f10545b;
        AbstractC0434i.O0(i4, i9, i9 + min, bArr2, bArr);
        int i10 = jVar.f10545b + min;
        jVar.f10545b = i10;
        this.f10525e -= min;
        if (i10 == jVar.f10546c) {
            this.f10524d = jVar.a();
            k.a(jVar);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    @Override // d8.b
    public final a u() {
        return this;
    }
}
