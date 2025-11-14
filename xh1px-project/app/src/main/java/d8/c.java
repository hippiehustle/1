package d8;

import I7.v;
import a.AbstractC0405a;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c implements Serializable, Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final c f10526g = new c(new byte[0]);

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f10527d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f10528e;

    /* renamed from: f, reason: collision with root package name */
    public transient String f10529f;

    public c(byte[] bArr) {
        o6.j.e(bArr, "data");
        this.f10527d = bArr;
    }

    public static final c a(String str) {
        byte[] bytes = str.getBytes(I7.a.f2219a);
        o6.j.d(bytes, "this as java.lang.String).getBytes(charset)");
        c cVar = new c(bytes);
        cVar.f10529f = str;
        return cVar;
    }

    public int b() {
        return this.f10527d.length;
    }

    public String c() {
        byte[] bArr = this.f10527d;
        char[] cArr = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b4 : bArr) {
            int i8 = i4 + 1;
            char[] cArr2 = e8.b.f10672a;
            cArr[i4] = cArr2[(b4 >> 4) & 15];
            i4 += 2;
            cArr[i8] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        o6.j.e(cVar, "other");
        int b4 = b();
        int b9 = cVar.b();
        int min = Math.min(b4, b9);
        for (int i4 = 0; i4 < min; i4++) {
            int e9 = e(i4) & 255;
            int e10 = cVar.e(i4) & 255;
            if (e9 != e10) {
                if (e9 < e10) {
                    return -1;
                }
                return 1;
            }
        }
        if (b4 == b9) {
            return 0;
        }
        if (b4 < b9) {
            return -1;
        }
        return 1;
    }

    public byte[] d() {
        return this.f10527d;
    }

    public byte e(int i4) {
        return this.f10527d[i4];
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int b4 = cVar.b();
                byte[] bArr = this.f10527d;
                if (b4 == bArr.length && cVar.f(0, 0, bArr.length, bArr)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public boolean f(int i4, int i8, int i9, byte[] bArr) {
        o6.j.e(bArr, "other");
        if (i4 >= 0) {
            byte[] bArr2 = this.f10527d;
            if (i4 <= bArr2.length - i9 && i8 >= 0 && i8 <= bArr.length - i9 && AbstractC0405a.d(i4, i8, i9, bArr2, bArr)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean g(c cVar, int i4) {
        return cVar.f(0, 0, i4, this.f10527d);
    }

    public int hashCode() {
        int i4 = this.f10528e;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = Arrays.hashCode(this.f10527d);
        this.f10528e = hashCode;
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00d6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0173, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x017a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x016c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01aa, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01ad, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0140, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00fe, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        c cVar;
        int i4;
        byte b4;
        int i8;
        int i9;
        byte[] bArr = this.f10527d;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            if (i10 >= length) {
                break;
            }
            byte b9 = bArr[i10];
            int i13 = 2;
            if (b9 >= 0) {
                int i14 = i12 + 1;
                if (i12 == 64) {
                    break;
                }
                if ((b9 != 10 && b9 != 13 && ((b9 >= 0 && b9 < 32) || (Byte.MAX_VALUE <= b9 && b9 < 160))) || b9 == 65533) {
                    break;
                }
                if (b9 < 65536) {
                    i4 = 1;
                } else {
                    i4 = 2;
                }
                i11 += i4;
                i10++;
                while (true) {
                    i12 = i14;
                    if (i10 < length && (b4 = bArr[i10]) >= 0) {
                        i10++;
                        i14 = i12 + 1;
                        if (i12 == 64) {
                            break loop0;
                        }
                        if ((b4 != 10 && b4 != 13 && ((b4 >= 0 && b4 < 32) || (Byte.MAX_VALUE <= b4 && b4 < 160))) || b4 == 65533) {
                            break loop0;
                        }
                        if (b4 < 65536) {
                            i8 = 1;
                        } else {
                            i8 = 2;
                        }
                        i11 += i8;
                    }
                }
            } else if ((b9 >> 5) == -2) {
                int i15 = i10 + 1;
                if (length > i15) {
                    byte b10 = bArr[i15];
                    if ((b10 & 192) == 128) {
                        int i16 = (b10 ^ 3968) ^ (b9 << 6);
                        if (i16 >= 128) {
                            i9 = i12 + 1;
                            if (i12 == 64) {
                                break;
                            }
                            if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                break;
                            }
                            if (i16 < 65536) {
                                i13 = 1;
                            }
                            i11 += i13;
                            i10 += 2;
                            i12 = i9;
                        }
                    }
                }
            } else if ((b9 >> 4) == -2) {
                int i17 = i10 + 2;
                if (length > i17) {
                    byte b11 = bArr[i10 + 1];
                    if ((b11 & 192) == 128) {
                        byte b12 = bArr[i17];
                        if ((b12 & 192) == 128) {
                            int i18 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b9 << 12);
                            if (i18 >= 2048) {
                                if (55296 > i18 || i18 >= 57344) {
                                    i9 = i12 + 1;
                                    if (i12 == 64) {
                                        break;
                                    }
                                    if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                                        break;
                                    }
                                    if (i18 < 65536) {
                                        i13 = 1;
                                    }
                                    i11 += i13;
                                    i10 += 3;
                                    i12 = i9;
                                }
                            }
                        }
                    }
                }
            } else if ((b9 >> 3) == -2) {
                int i19 = i10 + 3;
                if (length > i19) {
                    byte b13 = bArr[i10 + 1];
                    if ((b13 & 192) == 128) {
                        byte b14 = bArr[i10 + 2];
                        if ((b14 & 192) == 128) {
                            byte b15 = bArr[i19];
                            if ((b15 & 192) == 128) {
                                int i20 = (((b15 ^ 3678080) ^ (b14 << 6)) ^ (b13 << 12)) ^ (b9 << 18);
                                if (i20 <= 1114111) {
                                    if (55296 > i20 || i20 >= 57344) {
                                        if (i20 >= 65536) {
                                            i9 = i12 + 1;
                                            if (i12 == 64) {
                                                break;
                                            }
                                            if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 < 32) || (127 <= i20 && i20 < 160))) || i20 == 65533) {
                                                break;
                                            }
                                            if (i20 < 65536) {
                                                i13 = 1;
                                            }
                                            i11 += i13;
                                            i10 += 4;
                                            i12 = i9;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i11 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + c() + ']';
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(bArr.length);
            sb.append(" hex=");
            if (64 <= bArr.length) {
                if (64 == bArr.length) {
                    cVar = this;
                } else {
                    E2.c.O(64, bArr.length);
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 64);
                    o6.j.d(copyOfRange, "copyOfRange(...)");
                    cVar = new c(copyOfRange);
                }
                sb.append(cVar.c());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        String str = this.f10529f;
        if (str == null) {
            byte[] d2 = d();
            o6.j.e(d2, "<this>");
            String str2 = new String(d2, I7.a.f2219a);
            this.f10529f = str2;
            str = str2;
        }
        String substring = str.substring(0, i11);
        o6.j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String Z8 = v.Z(v.Z(v.Z(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i11 < str.length()) {
            return "[size=" + bArr.length + " text=" + Z8 + "…]";
        }
        return "[text=" + Z8 + ']';
    }
}
