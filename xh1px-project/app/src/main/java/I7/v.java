package I7;

/* loaded from: classes.dex */
public abstract class v extends u {
    public static boolean W(String str, String str2) {
        o6.j.e(str, "<this>");
        o6.j.e(str2, "suffix");
        return str.endsWith(str2);
    }

    public static boolean X(int i4, int i8, int i9, String str, String str2, boolean z8) {
        o6.j.e(str, "<this>");
        o6.j.e(str2, "other");
        if (!z8) {
            return str.regionMatches(i4, str2, i8, i9);
        }
        return str.regionMatches(z8, i4, str2, i8, i9);
    }

    public static String Y(String str, char c6, char c9) {
        o6.j.e(str, "<this>");
        String replace = str.replace(c6, c9);
        o6.j.d(replace, "replace(...)");
        return replace;
    }

    public static String Z(String str, String str2, String str3) {
        o6.j.e(str, "<this>");
        o6.j.e(str2, "oldValue");
        o6.j.e(str3, "newValue");
        int f02 = m.f0(str, str2, 0, false);
        if (f02 < 0) {
            return str;
        }
        int length = str2.length();
        int i4 = 1;
        if (length >= 1) {
            i4 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i8 = 0;
            do {
                sb.append((CharSequence) str, i8, f02);
                sb.append(str3);
                i8 = f02 + length;
                if (f02 >= str.length()) {
                    break;
                }
                f02 = m.f0(str, str2, f02 + i4, false);
            } while (f02 > 0);
            sb.append((CharSequence) str, i8, str.length());
            String sb2 = sb.toString();
            o6.j.d(sb2, "toString(...)");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static boolean a0(String str, String str2) {
        o6.j.e(str, "<this>");
        o6.j.e(str2, "prefix");
        return str.startsWith(str2);
    }
}
