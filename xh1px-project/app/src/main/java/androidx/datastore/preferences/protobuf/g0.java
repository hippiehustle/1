package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g0 extends E2.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i4) {
        super(23);
        this.f8685e = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // E2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String k(byte[] bArr, int i4, int i8) {
        switch (this.f8685e) {
            case 0:
                if ((i4 | i8 | ((bArr.length - i4) - i8)) >= 0) {
                    int i9 = i4 + i8;
                    char[] cArr = new char[i8];
                    int i10 = 0;
                    while (i4 < i9) {
                        byte b4 = bArr[i4];
                        if (b4 >= 0) {
                            i4++;
                            cArr[i10] = (char) b4;
                            i10++;
                        } else {
                            while (i4 < i9) {
                                int i11 = i4 + 1;
                                byte b9 = bArr[i4];
                                if (b9 >= 0) {
                                    int i12 = i10 + 1;
                                    cArr[i10] = (char) b9;
                                    while (i11 < i9) {
                                        byte b10 = bArr[i11];
                                        if (b10 >= 0) {
                                            i11++;
                                            cArr[i12] = (char) b10;
                                            i12++;
                                        } else {
                                            i10 = i12;
                                            i4 = i11;
                                        }
                                    }
                                    i10 = i12;
                                    i4 = i11;
                                } else if (b9 < -32) {
                                    if (i11 < i9) {
                                        i4 += 2;
                                        byte b11 = bArr[i11];
                                        int i13 = i10 + 1;
                                        if (b9 >= -62 && !E2.c.f0(b11)) {
                                            cArr[i10] = (char) ((b11 & 63) | ((b9 & 31) << 6));
                                            i10 = i13;
                                        } else {
                                            throw InvalidProtocolBufferException.a();
                                        }
                                    } else {
                                        throw InvalidProtocolBufferException.a();
                                    }
                                } else if (b9 < -16) {
                                    if (i11 < i9 - 1) {
                                        int i14 = i4 + 2;
                                        byte b12 = bArr[i11];
                                        i4 += 3;
                                        byte b13 = bArr[i14];
                                        int i15 = i10 + 1;
                                        if (!E2.c.f0(b12) && ((b9 != -32 || b12 >= -96) && ((b9 != -19 || b12 < -96) && !E2.c.f0(b13)))) {
                                            cArr[i10] = (char) (((b12 & 63) << 6) | ((b9 & 15) << 12) | (b13 & 63));
                                            i10 = i15;
                                        } else {
                                            throw InvalidProtocolBufferException.a();
                                        }
                                    } else {
                                        throw InvalidProtocolBufferException.a();
                                    }
                                } else {
                                    if (i11 < i9 - 2) {
                                        byte b14 = bArr[i11];
                                        int i16 = i4 + 3;
                                        byte b15 = bArr[i4 + 2];
                                        i4 += 4;
                                        byte b16 = bArr[i16];
                                        int i17 = i10 + 1;
                                        if (!E2.c.f0(b14)) {
                                            if ((((b14 + 112) + (b9 << 28)) >> 30) == 0 && !E2.c.f0(b15) && !E2.c.f0(b16)) {
                                                int i18 = ((b14 & 63) << 12) | ((b9 & 7) << 18) | ((b15 & 63) << 6) | (b16 & 63);
                                                cArr[i10] = (char) ((i18 >>> 10) + 55232);
                                                cArr[i17] = (char) ((i18 & 1023) + 56320);
                                                i10 += 2;
                                            }
                                        }
                                        throw InvalidProtocolBufferException.a();
                                    }
                                    throw InvalidProtocolBufferException.a();
                                }
                            }
                            return new String(cArr, 0, i10);
                        }
                    }
                    while (i4 < i9) {
                    }
                    return new String(cArr, 0, i10);
                }
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i8)));
            default:
                Charset charset = AbstractC0486w.f8742a;
                String str = new String(bArr, i4, i8, charset);
                if (str.indexOf(65533) < 0 || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i4, i8 + i4))) {
                    return str;
                }
                throw InvalidProtocolBufferException.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r27 + r3;
     */
    @Override // E2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(String str, byte[] bArr, int i4, int i8) {
        int i9;
        int i10;
        char charAt;
        long j;
        char c6;
        long j5;
        long j8;
        char c9;
        int i11;
        char charAt2;
        switch (this.f8685e) {
            case 0:
                int length = str.length();
                int i12 = i8 + i4;
                int i13 = 0;
                while (i13 < length && (i10 = i13 + i4) < i12 && (charAt = str.charAt(i13)) < 128) {
                    bArr[i10] = (byte) charAt;
                    i13++;
                }
                int i14 = i4 + i13;
                while (i13 < length) {
                    char charAt3 = str.charAt(i13);
                    if (charAt3 < 128 && i14 < i12) {
                        bArr[i14] = (byte) charAt3;
                        i14++;
                    } else if (charAt3 < 2048 && i14 <= i12 - 2) {
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) ((charAt3 >>> 6) | 960);
                        i14 += 2;
                        bArr[i15] = (byte) ((charAt3 & '?') | 128);
                    } else if ((charAt3 < 55296 || 57343 < charAt3) && i14 <= i12 - 3) {
                        bArr[i14] = (byte) ((charAt3 >>> '\f') | 480);
                        int i16 = i14 + 2;
                        bArr[i14 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i14 += 3;
                        bArr[i16] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if (i14 <= i12 - 4) {
                            int i17 = i13 + 1;
                            if (i17 != str.length()) {
                                char charAt4 = str.charAt(i17);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i18 = i14 + 3;
                                    bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i14 += 4;
                                    bArr[i18] = (byte) ((codePoint & 63) | 128);
                                    i13 = i17;
                                } else {
                                    i13 = i17;
                                }
                            }
                            throw new h0(i13 - 1, length);
                        }
                        if (55296 <= charAt3 && charAt3 <= 57343 && ((i9 = i13 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i9)))) {
                            throw new h0(i13, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i14);
                    }
                    i13++;
                }
                return i14;
            default:
                long j9 = i4;
                long j10 = i8 + j9;
                int length2 = str.length();
                if (length2 <= i8 && bArr.length - i8 >= i4) {
                    int i19 = 0;
                    while (true) {
                        j = 1;
                        c6 = 128;
                        if (i19 < length2 && (charAt2 = str.charAt(i19)) < 128) {
                            f0.j(bArr, j9, (byte) charAt2);
                            i19++;
                            j9 = 1 + j9;
                        }
                    }
                    if (i19 == length2) {
                        return (int) j9;
                    }
                    while (i19 < length2) {
                        char charAt5 = str.charAt(i19);
                        if (charAt5 < c6 && j9 < j10) {
                            f0.j(bArr, j9, (byte) charAt5);
                            c9 = c6;
                            j5 = j;
                            j8 = j9 + j;
                        } else if (charAt5 < 2048 && j9 <= j10 - 2) {
                            j5 = j;
                            f0.j(bArr, j9, (byte) ((charAt5 >>> 6) | 960));
                            f0.j(bArr, j9 + j5, (byte) ((charAt5 & '?') | c6));
                            j8 = j9 + 2;
                            c9 = c6;
                        } else {
                            j5 = j;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j9 > j10 - 3) {
                                long j11 = j9;
                                if (j11 <= j10 - 4) {
                                    int i20 = i19 + 1;
                                    if (i20 != length2) {
                                        char charAt6 = str.charAt(i20);
                                        if (Character.isSurrogatePair(charAt5, charAt6)) {
                                            int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                            f0.j(bArr, j11, (byte) ((codePoint2 >>> 18) | 240));
                                            c9 = 128;
                                            f0.j(bArr, j11 + j5, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            f0.j(bArr, j11 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                            f0.j(bArr, j11 + 3, (byte) ((codePoint2 & 63) | 128));
                                            j8 = j11 + 4;
                                            i19 = i20;
                                        } else {
                                            i19 = i20;
                                        }
                                    }
                                    throw new h0(i19 - 1, length2);
                                }
                                if (55296 <= charAt5 && charAt5 <= 57343 && ((i11 = i19 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i11)))) {
                                    throw new h0(i19, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j11);
                            }
                            f0.j(bArr, j9, (byte) ((charAt5 >>> '\f') | 480));
                            long j12 = j9;
                            f0.j(bArr, j9 + j5, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j8 = j12 + 3;
                            f0.j(bArr, j12 + 2, (byte) ((charAt5 & '?') | 128));
                            c9 = 128;
                        }
                        i19++;
                        c6 = c9;
                        j9 = j8;
                        j = j5;
                    }
                    return (int) j9;
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i4 + i8));
        }
    }
}
