package I7;

/* loaded from: classes.dex */
public abstract class t extends s {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean S(String str) {
        char c6;
        boolean z8;
        boolean z9;
        int charAt;
        int i4;
        boolean z10;
        int i8;
        boolean z11;
        String str2;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        int length = str.length() - 1;
        int i9 = 0;
        while (true) {
            c6 = ' ';
            if (i9 > length || str.charAt(i9) > ' ') {
                break;
            }
            i9++;
        }
        if (i9 > length) {
            return false;
        }
        while (length > i9 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i9) == '+' || str.charAt(i9) == '-') {
            i9++;
        }
        if (i9 > length) {
            return false;
        }
        if (str.charAt(i9) == '0') {
            int i10 = i9 + 1;
            if (i10 > length) {
                return true;
            }
            if ((str.charAt(i10) | ' ') == 120) {
                int i11 = i9 + 2;
                int i12 = i11;
                while (true) {
                    if (i12 <= length) {
                        z8 = z14;
                        if (((str.charAt(i12) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                            break;
                        }
                        i12++;
                        z14 = z8;
                    } else {
                        z8 = z14;
                        break;
                    }
                }
                if (i11 != i12) {
                    z12 = z8;
                } else {
                    z12 = false;
                }
                if (i12 <= length) {
                    if (str.charAt(i12) == '.') {
                        int i13 = i12 + 1;
                        int i14 = i13;
                        while (i14 <= length) {
                            char c9 = c6;
                            if (((str.charAt(i14) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i14++;
                            c6 = c9;
                        }
                        if (i13 != i14) {
                            z13 = z8;
                        } else {
                            z13 = false;
                        }
                        i12 = i14;
                    } else {
                        z13 = false;
                    }
                    if (z12 || z13) {
                        i9 = i12;
                        if (i9 != -1 || i9 > length) {
                            return false;
                        }
                        z9 = z8;
                        if (!z9) {
                            int i15 = i9;
                            while (i15 <= length && ((str.charAt(i15) - '0') & 65535) < 10) {
                                i15++;
                            }
                            if (i9 != i15) {
                                z10 = z8;
                            } else {
                                z10 = false;
                            }
                            if (i15 > length) {
                                i9 = i15;
                            } else {
                                if (str.charAt(i15) == '.') {
                                    int i16 = i15 + 1;
                                    i8 = i16;
                                    while (i8 <= length && ((str.charAt(i8) - '0') & 65535) < 10) {
                                        i8++;
                                    }
                                    if (i16 != i8) {
                                        z11 = z8;
                                        if (z10 && !z11) {
                                            if (length == i8 + 2) {
                                                str2 = "NaN";
                                            } else if (length == i8 + 7) {
                                                str2 = "Infinity";
                                            } else {
                                                str2 = null;
                                            }
                                            if (str2 == null || m.f0(str, str2, i8, false) != i8) {
                                                i9 = -1;
                                            } else {
                                                i9 = length + 1;
                                            }
                                        } else {
                                            i9 = i8;
                                        }
                                    }
                                } else {
                                    i8 = i15;
                                }
                                z11 = false;
                                if (z10) {
                                }
                                i9 = i8;
                            }
                            if (i9 == -1) {
                                return false;
                            }
                            if (i9 > length) {
                                return z8;
                            }
                        }
                        int i17 = i9 + 1;
                        charAt = str.charAt(i9) | ' ';
                        if (!z9) {
                            i4 = 112;
                        } else {
                            i4 = 101;
                        }
                        if (charAt == i4) {
                            if (z9 || ((charAt != 102 && charAt != 100) || i17 <= length)) {
                                return false;
                            }
                            return z8;
                        }
                        if (i17 > length) {
                            return false;
                        }
                        if ((str.charAt(i17) == '+' || str.charAt(i17) == '-') && (i17 = i9 + 2) > length) {
                            return false;
                        }
                        while (i17 <= length && ((str.charAt(i17) - '0') & 65535) < 10) {
                            i17++;
                        }
                        if (i17 > length) {
                            return z8;
                        }
                        if (i17 != length) {
                            return false;
                        }
                        int charAt2 = str.charAt(i17) | ' ';
                        if (charAt2 != 102 && charAt2 != 100) {
                            return false;
                        }
                        return z8;
                    }
                }
                i9 = -1;
                if (i9 != -1) {
                }
                return false;
            }
        }
        z8 = true;
        z9 = false;
        if (!z9) {
        }
        int i172 = i9 + 1;
        charAt = str.charAt(i9) | ' ';
        if (!z9) {
        }
        if (charAt == i4) {
        }
    }
}
