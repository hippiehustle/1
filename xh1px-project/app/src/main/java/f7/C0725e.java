package f7;

/* renamed from: f7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0725e implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final String f10804d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10805e;

    public C0725e(String str, boolean z8) {
        if (str != null) {
            this.f10804d = str;
            this.f10805e = z8;
        } else {
            a(0);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            objArr[0] = "name";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3 && i4 != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
                } else {
                    objArr[1] = "asStringStripSpecialMarkers";
                }
            } else {
                objArr[1] = "getIdentifier";
            }
        } else {
            objArr[1] = "asString";
        }
        switch (i4) {
            case 1:
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[2] = "identifier";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "isValidIdentifier";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "identifierIfValid";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
            throw new IllegalStateException(format);
        }
    }

    public static C0725e d(String str) {
        if (str != null) {
            if (str.startsWith("<")) {
                return g(str);
            }
            return e(str);
        }
        a(9);
        throw null;
    }

    public static C0725e e(String str) {
        if (str != null) {
            return new C0725e(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean f(String str) {
        if (str != null) {
            if (str.isEmpty() || str.startsWith("<")) {
                return false;
            }
            for (int i4 = 0; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
        a(6);
        throw null;
    }

    public static C0725e g(String str) {
        if (str != null) {
            if (str.startsWith("<")) {
                return new C0725e(str, true);
            }
            throw new IllegalArgumentException("special name must start with '<': ".concat(str));
        }
        a(8);
        throw null;
    }

    public final String b() {
        String str = this.f10804d;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public final String c() {
        if (!this.f10805e) {
            String b4 = b();
            if (b4 != null) {
                return b4;
            }
            a(2);
            throw null;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f10804d.compareTo(((C0725e) obj).f10804d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0725e) {
                C0725e c0725e = (C0725e) obj;
                if (this.f10805e != c0725e.f10805e || !this.f10804d.equals(c0725e.f10804d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f10804d.hashCode() * 31) + (this.f10805e ? 1 : 0);
    }

    public final String toString() {
        return this.f10804d;
    }
}
