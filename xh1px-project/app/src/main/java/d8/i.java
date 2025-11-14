package d8;

import java.nio.ByteBuffer;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: d, reason: collision with root package name */
    public final m f10541d;

    /* renamed from: e, reason: collision with root package name */
    public final a f10542e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f10543f;

    /* JADX WARN: Type inference failed for: r1v1, types: [d8.a, java.lang.Object] */
    public i(m mVar) {
        this.f10541d = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0155 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(c cVar) {
        int i4;
        int i8;
        long j;
        int i9;
        int i10;
        o6.j.e(cVar, "targetBytes");
        if (!this.f10543f) {
            long j5 = 0;
            while (true) {
                a aVar = this.f10542e;
                aVar.getClass();
                o6.j.e(cVar, "targetBytes");
                long j8 = 0;
                if (j5 >= 0) {
                    j jVar = aVar.f10524d;
                    if (jVar != null) {
                        long j9 = aVar.f10525e;
                        int i11 = 0;
                        if (j9 - j5 < j5) {
                            while (j9 > j5) {
                                jVar = jVar.f10550g;
                                o6.j.b(jVar);
                                j9 -= jVar.f10546c - jVar.f10545b;
                            }
                            if (cVar.b() == 2) {
                                byte e9 = cVar.e(0);
                                byte e10 = cVar.e(1);
                                long j10 = j5;
                                while (j9 < aVar.f10525e) {
                                    byte[] bArr = jVar.f10544a;
                                    i9 = (int) ((jVar.f10545b + j10) - j9);
                                    int i12 = jVar.f10546c;
                                    while (i9 < i12) {
                                        byte b4 = bArr[i9];
                                        if (b4 != e9 && b4 != e10) {
                                            i9++;
                                        } else {
                                            i10 = jVar.f10545b;
                                            j = (i9 - i10) + j9;
                                            break;
                                        }
                                    }
                                    j10 = j9 + (jVar.f10546c - jVar.f10545b);
                                    jVar = jVar.f10549f;
                                    o6.j.b(jVar);
                                    j9 = j10;
                                }
                            } else {
                                byte[] d2 = cVar.d();
                                long j11 = j5;
                                while (j9 < aVar.f10525e) {
                                    byte[] bArr2 = jVar.f10544a;
                                    i9 = (int) ((jVar.f10545b + j11) - j9);
                                    int i13 = jVar.f10546c;
                                    while (i9 < i13) {
                                        byte b9 = bArr2[i9];
                                        int length = d2.length;
                                        for (int i14 = i11; i14 < length; i14++) {
                                            if (b9 == d2[i14]) {
                                                i10 = jVar.f10545b;
                                                j = (i9 - i10) + j9;
                                                break;
                                            }
                                        }
                                        i9++;
                                        i11 = 0;
                                    }
                                    j11 = (jVar.f10546c - jVar.f10545b) + j9;
                                    jVar = jVar.f10549f;
                                    o6.j.b(jVar);
                                    j9 = j11;
                                    i11 = 0;
                                }
                            }
                            if (j != -1) {
                                return j;
                            }
                            long j12 = aVar.f10525e;
                            if (this.f10541d.h(aVar, 8192L) == -1) {
                                return -1L;
                            }
                            j5 = Math.max(j5, j12);
                        } else {
                            while (true) {
                                long j13 = (jVar.f10546c - jVar.f10545b) + j8;
                                if (j13 > j5) {
                                    break;
                                }
                                jVar = jVar.f10549f;
                                o6.j.b(jVar);
                                j8 = j13;
                            }
                            if (cVar.b() == 2) {
                                byte e11 = cVar.e(0);
                                byte e12 = cVar.e(1);
                                long j14 = j5;
                                while (j8 < aVar.f10525e) {
                                    byte[] bArr3 = jVar.f10544a;
                                    i4 = (int) ((jVar.f10545b + j14) - j8);
                                    int i15 = jVar.f10546c;
                                    while (i4 < i15) {
                                        byte b10 = bArr3[i4];
                                        if (b10 != e11 && b10 != e12) {
                                            i4++;
                                        } else {
                                            i8 = jVar.f10545b;
                                            j = (i4 - i8) + j8;
                                            break;
                                        }
                                    }
                                    j14 = (jVar.f10546c - jVar.f10545b) + j8;
                                    jVar = jVar.f10549f;
                                    o6.j.b(jVar);
                                    j8 = j14;
                                }
                            } else {
                                int i16 = 0;
                                byte[] d3 = cVar.d();
                                long j15 = j5;
                                while (j8 < aVar.f10525e) {
                                    byte[] bArr4 = jVar.f10544a;
                                    i4 = (int) ((jVar.f10545b + j15) - j8);
                                    int i17 = jVar.f10546c;
                                    while (i4 < i17) {
                                        byte b11 = bArr4[i4];
                                        int length2 = d3.length;
                                        for (int i18 = i16; i18 < length2; i18++) {
                                            if (b11 == d3[i18]) {
                                                i8 = jVar.f10545b;
                                                j = (i4 - i8) + j8;
                                                break;
                                            }
                                        }
                                        i4++;
                                        i16 = 0;
                                    }
                                    j15 = (jVar.f10546c - jVar.f10545b) + j8;
                                    jVar = jVar.f10549f;
                                    o6.j.b(jVar);
                                    j8 = j15;
                                    i16 = 0;
                                }
                            }
                            if (j != -1) {
                            }
                        }
                    }
                    j = -1;
                    if (j != -1) {
                    }
                } else {
                    throw new IllegalArgumentException(AbstractC1149a.f("fromIndex < 0: ", j5).toString());
                }
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f10543f) {
            this.f10543f = true;
            this.f10541d.close();
            a aVar = this.f10542e;
            aVar.p(aVar.f10525e);
        }
    }

    @Override // d8.m
    public final long h(a aVar, long j) {
        o6.j.e(aVar, "sink");
        if (!this.f10543f) {
            a aVar2 = this.f10542e;
            if (aVar2.f10525e == 0 && this.f10541d.h(aVar2, 8192L) == -1) {
                return -1L;
            }
            return aVar2.h(aVar, Math.min(8192L, aVar2.f10525e));
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f10543f;
    }

    @Override // d8.b
    public final boolean o(long j) {
        a aVar;
        if (j >= 0) {
            if (this.f10543f) {
                throw new IllegalStateException("closed");
            }
            do {
                aVar = this.f10542e;
                if (aVar.f10525e >= j) {
                    return true;
                }
            } while (this.f10541d.h(aVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(AbstractC1149a.f("byteCount < 0: ", j).toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        o6.j.e(byteBuffer, "sink");
        a aVar = this.f10542e;
        if (aVar.f10525e == 0 && this.f10541d.h(aVar, 8192L) == -1) {
            return -1;
        }
        return aVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f10541d + ')';
    }

    @Override // d8.b
    public final a u() {
        return this.f10542e;
    }
}
