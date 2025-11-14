package e7;

/* loaded from: classes.dex */
public abstract class a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    public static byte[] a(String[] strArr) {
        if (strArr != null) {
            if (strArr.length > 0 && !strArr[0].isEmpty()) {
                char charAt = strArr[0].charAt(0);
                if (charAt == 0) {
                    String[] strArr2 = (String[]) strArr.clone();
                    strArr2[0] = strArr2[0].substring(1);
                    int i4 = 0;
                    for (String str : strArr2) {
                        i4 += str.length();
                    }
                    byte[] bArr = new byte[i4];
                    int i8 = 0;
                    for (String str2 : strArr2) {
                        int length = str2.length();
                        int i9 = 0;
                        while (i9 < length) {
                            bArr[i8] = (byte) str2.charAt(i9);
                            i9++;
                            i8++;
                        }
                    }
                    return bArr;
                }
                if (charAt == 65535) {
                    strArr = (String[]) strArr.clone();
                    strArr[0] = strArr[0].substring(1);
                }
            }
            int i10 = 0;
            for (String str3 : strArr) {
                i10 += str3.length();
            }
            byte[] bArr2 = new byte[i10];
            int i11 = 0;
            for (String str4 : strArr) {
                int length2 = str4.length();
                int i12 = 0;
                while (i12 < length2) {
                    bArr2[i11] = (byte) str4.charAt(i12);
                    i12++;
                    i11++;
                }
            }
            for (int i13 = 0; i13 < i10; i13++) {
                bArr2[i13] = (byte) ((bArr2[i13] + Byte.MAX_VALUE) & 127);
            }
            int i14 = (i10 * 7) / 8;
            byte[] bArr3 = new byte[i14];
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = i15 + 1;
                int i19 = i16 + 1;
                bArr3[i17] = (byte) (((bArr2[i15] & 255) >>> i16) + ((bArr2[i18] & ((1 << i19) - 1)) << (7 - i16)));
                if (i16 == 6) {
                    i15 += 2;
                    i16 = 0;
                } else {
                    i15 = i18;
                    i16 = i19;
                }
            }
            return bArr3;
        }
        Object[] objArr = new Object[3];
        objArr[0] = "data";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        switch (7) {
            case 1:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 12:
            case 14:
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[2] = "encode8to7";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[2] = "addModuloByte";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[2] = "splitBytesToStringArray";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
