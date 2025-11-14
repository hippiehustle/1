package e8;

import d8.f;
import o6.j;

/* loaded from: classes.dex */
public abstract class a {
    static {
        j.d("0123456789abcdef".getBytes(I7.a.f2219a), "this as java.lang.String).getBytes(charset)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int a(d8.a aVar, f fVar, boolean z8) {
        int i4;
        int i8;
        int i9;
        boolean z9;
        d8.j jVar;
        int i10;
        d8.j jVar2 = aVar.f10524d;
        if (jVar2 == null) {
            if (!z8) {
                return -1;
            }
            return -2;
        }
        byte[] bArr = jVar2.f10544a;
        int i11 = jVar2.f10545b;
        int i12 = jVar2.f10546c;
        int[] iArr = fVar.f10533e;
        d8.j jVar3 = jVar2;
        int i13 = -1;
        int i14 = 0;
        loop0: while (true) {
            int i15 = i14 + 1;
            int i16 = iArr[i14];
            int i17 = i14 + 2;
            int i18 = iArr[i15];
            if (i18 != -1) {
                i13 = i18;
            }
            if (jVar3 == null) {
                break;
            }
            if (i16 < 0) {
                int i19 = (i16 * (-1)) + i17;
                while (true) {
                    int i20 = i11 + 1;
                    int i21 = i17 + 1;
                    if ((bArr[i11] & 255) != iArr[i17]) {
                        break loop0;
                    }
                    if (i21 == i19) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i20 == i12) {
                        j.b(jVar3);
                        d8.j jVar4 = jVar3.f10549f;
                        j.b(jVar4);
                        i9 = jVar4.f10545b;
                        byte[] bArr2 = jVar4.f10544a;
                        i10 = jVar4.f10546c;
                        if (jVar4 == jVar2) {
                            if (!z9) {
                                break loop0;
                            }
                            bArr = bArr2;
                            jVar = null;
                        } else {
                            jVar = jVar4;
                            bArr = bArr2;
                        }
                    } else {
                        jVar = jVar3;
                        i10 = i12;
                        i9 = i20;
                    }
                    if (z9) {
                        i4 = iArr[i21];
                        int i22 = i10;
                        jVar3 = jVar;
                        i8 = i22;
                        break;
                    }
                    i11 = i9;
                    i12 = i10;
                    jVar3 = jVar;
                    i17 = i21;
                }
            } else {
                int i23 = i11 + 1;
                int i24 = bArr[i11] & 255;
                int i25 = i17 + i16;
                while (i17 != i25) {
                    if (i24 == iArr[i17]) {
                        i4 = iArr[i17 + i16];
                        if (i23 == i12) {
                            jVar3 = jVar3.f10549f;
                            j.b(jVar3);
                            int i26 = jVar3.f10545b;
                            byte[] bArr3 = jVar3.f10544a;
                            i8 = jVar3.f10546c;
                            if (jVar3 == jVar2) {
                                i9 = i26;
                                bArr = bArr3;
                                jVar3 = null;
                            } else {
                                i9 = i26;
                                bArr = bArr3;
                            }
                        } else {
                            i8 = i12;
                            i9 = i23;
                        }
                        if (i4 >= 0) {
                            return i4;
                        }
                        int i27 = i8;
                        i14 = -i4;
                        i11 = i9;
                        i12 = i27;
                    } else {
                        i17++;
                    }
                }
                break loop0;
            }
        }
        return i13;
    }
}
