package I7;

import java.util.NoSuchElementException;
import s3.AbstractC1492c;
import t6.C1586a;

/* loaded from: classes.dex */
public abstract class m extends v {
    public static boolean b0(CharSequence charSequence, CharSequence charSequence2, boolean z8) {
        o6.j.e(charSequence, "<this>");
        o6.j.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (i0(charSequence, (String) charSequence2, 0, z8, 2) >= 0) {
                return true;
            }
        } else if (g0(charSequence, charSequence2, 0, charSequence.length(), z8, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean c0(CharSequence charSequence, char c6) {
        o6.j.e(charSequence, "<this>");
        if (h0(charSequence, c6, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static String d0(String str, int i4) {
        o6.j.e(str, "<this>");
        if (i4 >= 0) {
            int length = str.length();
            if (i4 > length) {
                i4 = length;
            }
            String substring = str.substring(i4);
            o6.j.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(A.j.j(i4, "Requested character count ", " is less than zero.").toString());
    }

    public static int e0(CharSequence charSequence) {
        o6.j.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int f0(CharSequence charSequence, String str, int i4, boolean z8) {
        o6.j.e(charSequence, "<this>");
        o6.j.e(str, "string");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i4);
        }
        return g0(charSequence, str, i4, charSequence.length(), z8, false);
    }

    public static final int g0(CharSequence charSequence, CharSequence charSequence2, int i4, int i8, boolean z8, boolean z9) {
        C1586a c1586a;
        if (!z9) {
            if (i4 < 0) {
                i4 = 0;
            }
            int length = charSequence.length();
            if (i8 > length) {
                i8 = length;
            }
            c1586a = new C1586a(i4, i8, 1);
        } else {
            int e02 = e0(charSequence);
            if (i4 > e02) {
                i4 = e02;
            }
            if (i8 < 0) {
                i8 = 0;
            }
            c1586a = new C1586a(i4, i8, -1);
        }
        boolean z10 = charSequence instanceof String;
        int i9 = c1586a.f15125f;
        int i10 = c1586a.f15124e;
        int i11 = c1586a.f15123d;
        if (z10 && (charSequence2 instanceof String)) {
            if ((i9 > 0 && i11 <= i10) || (i9 < 0 && i10 <= i11)) {
                int i12 = i11;
                while (true) {
                    String str = (String) charSequence2;
                    boolean z11 = z8;
                    if (v.X(0, i12, str.length(), str, (String) charSequence, z11)) {
                        return i12;
                    }
                    if (i12 == i10) {
                        break;
                    }
                    i12 += i9;
                    z8 = z11;
                }
            }
        } else {
            boolean z12 = z8;
            if ((i9 > 0 && i11 <= i10) || (i9 < 0 && i10 <= i11)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z13 = z12;
                    z12 = z13;
                    if (n0(charSequence4, 0, charSequence3, i11, charSequence2.length(), z13)) {
                        return i11;
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11 += i9;
                    charSequence2 = charSequence4;
                    charSequence = charSequence3;
                }
            }
        }
        return -1;
    }

    public static int h0(CharSequence charSequence, char c6, int i4, int i8) {
        if ((i8 & 2) != 0) {
            i4 = 0;
        }
        o6.j.e(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c6};
            if (charSequence instanceof String) {
                int length = cArr.length;
                if (length != 0) {
                    if (length == 1) {
                        return ((String) charSequence).indexOf(cArr[0], i4);
                    }
                    throw new IllegalArgumentException("Array has more than one element.");
                }
                throw new NoSuchElementException("Array is empty.");
            }
            if (i4 < 0) {
                i4 = 0;
            }
            int e02 = e0(charSequence);
            if (i4 <= e02) {
                while (!AbstractC1492c.k(cArr[0], charSequence.charAt(i4), false)) {
                    if (i4 != e02) {
                        i4++;
                    } else {
                        return -1;
                    }
                }
                return i4;
            }
            return -1;
        }
        return ((String) charSequence).indexOf(c6, i4);
    }

    public static /* synthetic */ int i0(CharSequence charSequence, String str, int i4, boolean z8, int i8) {
        if ((i8 & 2) != 0) {
            i4 = 0;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return f0(charSequence, str, i4, z8);
    }

    public static boolean j0(CharSequence charSequence) {
        o6.j.e(charSequence, "<this>");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (!AbstractC1492c.y(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static char k0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(e0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int l0(int i4, int i8, String str, String str2) {
        if ((i8 & 2) != 0) {
            i4 = e0(str);
        }
        o6.j.e(str, "<this>");
        o6.j.e(str2, "string");
        return str.lastIndexOf(str2, i4);
    }

    public static int m0(String str, char c6, int i4) {
        int i8;
        if ((i4 & 2) != 0) {
            i8 = e0(str);
        } else {
            i8 = 0;
        }
        o6.j.e(str, "<this>");
        return str.lastIndexOf(c6, i8);
    }

    public static final boolean n0(CharSequence charSequence, int i4, CharSequence charSequence2, int i8, int i9, boolean z8) {
        o6.j.e(charSequence, "<this>");
        o6.j.e(charSequence2, "other");
        if (i8 < 0 || i4 < 0 || i4 > charSequence.length() - i9 || i8 > charSequence2.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!AbstractC1492c.k(charSequence.charAt(i4 + i10), charSequence2.charAt(i8 + i10), z8)) {
                return false;
            }
        }
        return true;
    }

    public static String o0(String str, String str2) {
        o6.j.e(str, "<this>");
        if (v.a0(str, str2)) {
            String substring = str.substring(str2.length());
            o6.j.d(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String p0(String str, String str2) {
        o6.j.e(str, "<this>");
        if (v.W(str, str2)) {
            String substring = str.substring(0, str.length() - str2.length());
            o6.j.d(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static boolean q0(String str, char c6) {
        if (str.length() <= 0 || !AbstractC1492c.k(str.charAt(0), c6, false)) {
            return false;
        }
        return true;
    }

    public static String r0(char c6, String str, String str2) {
        int h02 = h0(str, c6, 0, 6);
        if (h02 == -1) {
            return str2;
        }
        String substring = str.substring(h02 + 1, str.length());
        o6.j.d(substring, "substring(...)");
        return substring;
    }

    public static String s0(String str, String str2) {
        o6.j.e(str2, "delimiter");
        int i02 = i0(str, str2, 0, false, 6);
        if (i02 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + i02, str.length());
        o6.j.d(substring, "substring(...)");
        return substring;
    }

    public static String t0(char c6, String str, String str2) {
        o6.j.e(str, "<this>");
        o6.j.e(str2, "missingDelimiterValue");
        int m02 = m0(str, c6, 6);
        if (m02 == -1) {
            return str2;
        }
        String substring = str.substring(m02 + 1, str.length());
        o6.j.d(substring, "substring(...)");
        return substring;
    }

    public static String u0(String str, char c6) {
        o6.j.e(str, "<this>");
        o6.j.e(str, "missingDelimiterValue");
        int h02 = h0(str, c6, 0, 6);
        if (h02 == -1) {
            return str;
        }
        String substring = str.substring(0, h02);
        o6.j.d(substring, "substring(...)");
        return substring;
    }

    public static String v0(String str, String str2) {
        o6.j.e(str, "<this>");
        o6.j.e(str, "missingDelimiterValue");
        int i02 = i0(str, str2, 0, false, 6);
        if (i02 == -1) {
            return str;
        }
        String substring = str.substring(0, i02);
        o6.j.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence w0(CharSequence charSequence) {
        int i4;
        o6.j.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i8 = 0;
        boolean z8 = false;
        while (i8 <= length) {
            if (!z8) {
                i4 = i8;
            } else {
                i4 = length;
            }
            boolean y4 = AbstractC1492c.y(charSequence.charAt(i4));
            if (!z8) {
                if (!y4) {
                    z8 = true;
                } else {
                    i8++;
                }
            } else {
                if (!y4) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i8, length + 1);
    }
}
