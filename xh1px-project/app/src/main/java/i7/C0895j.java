package i7;

/* renamed from: i7.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0895j {

    /* renamed from: c, reason: collision with root package name */
    public static final C0895j f11778c = new C0895j("SUCCESS", 1);

    /* renamed from: a, reason: collision with root package name */
    public final int f11779a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11780b;

    public C0895j(String str, int i4) {
        if (i4 != 0) {
            this.f11779a = i4;
            this.f11780b = str;
        } else {
            a(3);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        String format;
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            i8 = 2;
        } else {
            i8 = 3;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                }
            } else {
                objArr[0] = "success";
            }
            switch (i4) {
                case 1:
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    objArr[1] = "getResult";
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i4 == 1) {
                if (i4 != 2) {
                    if (i4 == 3 || i4 == 4) {
                        objArr[2] = "<init>";
                    }
                } else {
                    objArr[2] = "conflict";
                }
            } else {
                objArr[2] = "incompatible";
            }
            format = String.format(str, objArr);
            if (i4 != 1 || i4 == 2 || i4 == 3 || i4 == 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "debugMessage";
        switch (i4) {
        }
        if (i4 == 1) {
        }
        format = String.format(str, objArr);
        if (i4 != 1) {
        }
        throw new IllegalArgumentException(format);
    }

    public static C0895j c(String str) {
        return new C0895j(str, 2);
    }

    public final int b() {
        int i4 = this.f11779a;
        if (i4 != 0) {
            return i4;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i4 = this.f11779a;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    str = "null";
                } else {
                    str = "CONFLICT";
                }
            } else {
                str = "INCOMPATIBLE";
            }
        } else {
            str = "OVERRIDABLE";
        }
        sb.append(str);
        sb.append(": ");
        sb.append(this.f11780b);
        return sb.toString();
    }
}
