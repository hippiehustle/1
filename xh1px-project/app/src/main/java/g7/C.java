package g7;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C0791A f11193a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final B f11194b = new Object();

    public static int a(int i4, int i8) {
        if (i4 <= -12 && i8 <= -65) {
            return i4 ^ (i8 << 8);
        }
        return -1;
    }

    public static int b(byte[] bArr, int i4, int i8) {
        byte b4 = bArr[i4 - 1];
        int i9 = i8 - i4;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    byte b9 = bArr[i4];
                    byte b10 = bArr[i4 + 1];
                    if (b4 > -12 || b9 > -65 || b10 > -65) {
                        return -1;
                    }
                    return (b10 << 16) ^ ((b9 << 8) ^ b4);
                }
                throw new AssertionError();
            }
            return a(b4, bArr[i4]);
        }
        if (b4 > -12) {
            return -1;
        }
        return b4;
    }

    public static int c(byte[] bArr, int i4, int i8) {
        while (i4 < i8 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 >= i8) {
            return 0;
        }
        while (i4 < i8) {
            int i9 = i4 + 1;
            byte b4 = bArr[i4];
            if (b4 < 0) {
                if (b4 < -32) {
                    if (i9 >= i8) {
                        return b4;
                    }
                    if (b4 >= -62) {
                        i4 += 2;
                        if (bArr[i9] > -65) {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else if (b4 < -16) {
                    if (i9 >= i8 - 1) {
                        return b(bArr, i9, i8);
                    }
                    int i10 = i4 + 2;
                    byte b9 = bArr[i9];
                    if (b9 <= -65) {
                        if (b4 != -32 || b9 >= -96) {
                            if (b4 != -19 || b9 < -96) {
                                i4 += 3;
                                if (bArr[i10] > -65) {
                                    return -1;
                                }
                            } else {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else {
                    if (i9 >= i8 - 2) {
                        return b(bArr, i9, i8);
                    }
                    int i11 = i4 + 2;
                    byte b10 = bArr[i9];
                    if (b10 <= -65) {
                        if ((((b10 + 112) + (b4 << 28)) >> 30) == 0) {
                            int i12 = i4 + 3;
                            if (bArr[i11] <= -65) {
                                i4 += 4;
                                if (bArr[i12] > -65) {
                                    return -1;
                                }
                            } else {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                }
            } else {
                i4 = i9;
            }
        }
        return 0;
    }
}
