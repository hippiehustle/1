package n7;

import Z.g;
import f7.C0722b;
import f7.C0723c;

/* renamed from: n7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1169b {

    /* renamed from: a, reason: collision with root package name */
    public final String f13019a;

    public C1169b(String str) {
        if (str != null) {
            this.f13019a = str;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        if (i4 != 3 && i4 != 5) {
            switch (i4) {
                case g.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                case 10:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i4 != 3 && i4 != 5) {
                switch (i4) {
                    case g.BYTES_FIELD_NUMBER /* 8 */:
                    case 9:
                    case 10:
                        break;
                    default:
                        i8 = 3;
                        break;
                }
                Object[] objArr = new Object[i8];
                switch (i4) {
                    case 1:
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[0] = "classId";
                        break;
                    case g.INTEGER_FIELD_NUMBER /* 3 */:
                    case g.STRING_FIELD_NUMBER /* 5 */:
                    case g.BYTES_FIELD_NUMBER /* 8 */:
                    case 9:
                    case 10:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                        break;
                    case g.LONG_FIELD_NUMBER /* 4 */:
                    case g.STRING_SET_FIELD_NUMBER /* 6 */:
                        objArr[0] = "fqName";
                        break;
                    case g.DOUBLE_FIELD_NUMBER /* 7 */:
                    default:
                        objArr[0] = "internalName";
                        break;
                }
                if (i4 == 3) {
                    if (i4 != 5) {
                        switch (i4) {
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                objArr[1] = "getFqNameForClassNameWithoutDollars";
                                break;
                            case 9:
                                objArr[1] = "getPackageFqName";
                                break;
                            case 10:
                                objArr[1] = "getInternalName";
                                break;
                            default:
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                                break;
                        }
                    } else {
                        objArr[1] = "byFqNameWithoutInnerClasses";
                    }
                } else {
                    objArr[1] = "internalNameByClassId";
                }
                switch (i4) {
                    case 1:
                        objArr[2] = "byClassId";
                        break;
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[2] = "internalNameByClassId";
                        break;
                    case g.INTEGER_FIELD_NUMBER /* 3 */:
                    case g.STRING_FIELD_NUMBER /* 5 */:
                    case g.BYTES_FIELD_NUMBER /* 8 */:
                    case 9:
                    case 10:
                        break;
                    case g.LONG_FIELD_NUMBER /* 4 */:
                    case g.STRING_SET_FIELD_NUMBER /* 6 */:
                        objArr[2] = "byFqNameWithoutInnerClasses";
                        break;
                    case g.DOUBLE_FIELD_NUMBER /* 7 */:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "byInternalName";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 3 && i4 != 5) {
                    switch (i4) {
                        case g.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                        case 10:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i8 = 2;
            Object[] objArr2 = new Object[i8];
            switch (i4) {
            }
            if (i4 == 3) {
            }
            switch (i4) {
            }
            String format2 = String.format(str, objArr2);
            if (i4 != 3) {
                switch (i4) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i4 != 3) {
            switch (i4) {
            }
            Object[] objArr22 = new Object[i8];
            switch (i4) {
            }
            if (i4 == 3) {
            }
            switch (i4) {
            }
            String format22 = String.format(str, objArr22);
            if (i4 != 3) {
            }
            throw new IllegalStateException(format22);
        }
        i8 = 2;
        Object[] objArr222 = new Object[i8];
        switch (i4) {
        }
        if (i4 == 3) {
        }
        switch (i4) {
        }
        String format222 = String.format(str, objArr222);
        if (i4 != 3) {
        }
        throw new IllegalStateException(format222);
    }

    public static C1169b b(C0723c c0723c) {
        if (c0723c != null) {
            return new C1169b(c0723c.f10797a.f10800a.replace('.', '/'));
        }
        a(4);
        throw null;
    }

    public static C1169b c(String str) {
        if (str != null) {
            return new C1169b(str);
        }
        a(0);
        throw null;
    }

    public static String e(C0722b c0722b) {
        C0723c c0723c = c0722b.f10793a;
        String replace = c0722b.f10794b.f10797a.f10800a.replace('.', '$');
        if (!c0723c.f10797a.c()) {
            replace = c0723c.f10797a.f10800a.replace('.', '/') + "/" + replace;
        }
        if (replace != null) {
            return replace;
        }
        a(3);
        throw null;
    }

    public final String d() {
        String str = this.f13019a;
        if (str != null) {
            return str;
        }
        a(10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1169b.class == obj.getClass()) {
            return this.f13019a.equals(((C1169b) obj).f13019a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13019a.hashCode();
    }

    public final String toString() {
        return this.f13019a;
    }
}
