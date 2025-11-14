package b8;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f9288a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f9289b;

    static {
        String[] strArr = new String[93];
        for (int i4 = 0; i4 < 32; i4++) {
            strArr[i4] = "\\u" + b(i4 >> 12) + b(i4 >> 8) + b(i4 >> 4) + b(i4);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f9288a = strArr;
        byte[] bArr = new byte[93];
        for (int i8 = 0; i8 < 32; i8++) {
            bArr[i8] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f9289b = bArr;
    }

    public static final void a(String str, StringBuilder sb) {
        o6.j.e(str, "value");
        sb.append('\"');
        int length = str.length();
        int i4 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            String[] strArr = f9288a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) str, i4, i8);
                sb.append(strArr[charAt]);
                i4 = i8 + 1;
            }
        }
        if (i4 != 0) {
            sb.append((CharSequence) str, i4, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final char b(int i4) {
        int i8;
        int i9 = i4 & 15;
        if (i9 < 10) {
            i8 = i9 + 48;
        } else {
            i8 = i9 + 87;
        }
        return (char) i8;
    }
}
