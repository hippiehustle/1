package n7;

import Z.g;
import f7.C0723c;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import z6.j;

/* renamed from: n7.c */
/* loaded from: classes.dex */
public enum EnumC1170c {
    BOOLEAN(j.f16722i, "boolean", "Z", "java.lang.Boolean"),
    CHAR(j.j, "char", "C", "java.lang.Character"),
    BYTE(j.k, "byte", "B", "java.lang.Byte"),
    SHORT(j.f16723l, "short", "S", "java.lang.Short"),
    INT(j.f16724m, "int", "I", "java.lang.Integer"),
    FLOAT(j.f16725n, "float", "F", "java.lang.Float"),
    LONG(j.f16726o, "long", "J", "java.lang.Long"),
    DOUBLE(j.f16727p, "double", "D", "java.lang.Double");


    /* renamed from: p */
    public static final HashMap f13026p = new HashMap();

    /* renamed from: q */
    public static final EnumMap f13027q = new EnumMap(j.class);

    /* renamed from: r */
    public static final HashMap f13028r = new HashMap();

    /* renamed from: s */
    public static final HashSet f13029s = new HashSet();

    /* renamed from: t */
    public static final HashMap f13030t = new HashMap();

    /* renamed from: d */
    public final j f13032d;

    /* renamed from: e */
    public final String f13033e;

    /* renamed from: f */
    public final String f13034f;

    /* renamed from: g */
    public final C0723c f13035g;

    static {
        for (EnumC1170c enumC1170c : values()) {
            f13026p.put(enumC1170c.f13033e, enumC1170c);
            f13027q.put((EnumMap) enumC1170c.d(), (j) enumC1170c);
            f13028r.put(enumC1170c.c(), enumC1170c);
            String replace = enumC1170c.f13035g.f10797a.f10800a.replace('.', '/');
            f13029s.add(replace);
            f13030t.put(replace, "(" + enumC1170c.f13034f + ")L" + replace + ";");
        }
    }

    EnumC1170c(j jVar, String str, String str2, String str3) {
        if (jVar != null) {
            this.f13032d = jVar;
            this.f13033e = str;
            this.f13034f = str2;
            this.f13035g = new C0723c(str3);
            return;
        }
        a(8);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        Object[] objArr;
        if (i4 != 4 && i4 != 6) {
            switch (i4) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i4 != 4 && i4 != 6) {
                switch (i4) {
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        i8 = 3;
                        break;
                }
                objArr = new Object[i8];
                switch (i4) {
                    case 1:
                        objArr[0] = "owner";
                        break;
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[0] = "methodDescriptor";
                        break;
                    case g.INTEGER_FIELD_NUMBER /* 3 */:
                    case 9:
                        objArr[0] = "name";
                        break;
                    case g.LONG_FIELD_NUMBER /* 4 */:
                    case g.STRING_SET_FIELD_NUMBER /* 6 */:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                        break;
                    case g.STRING_FIELD_NUMBER /* 5 */:
                        objArr[0] = "type";
                        break;
                    case g.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 10:
                        objArr[0] = "desc";
                        break;
                    case g.BYTES_FIELD_NUMBER /* 8 */:
                        objArr[0] = "primitiveType";
                        break;
                    case 11:
                        objArr[0] = "wrapperClassName";
                        break;
                    default:
                        objArr[0] = "internalName";
                        break;
                }
                if (i4 == 4 && i4 != 6) {
                    switch (i4) {
                        case 12:
                            objArr[1] = "getPrimitiveType";
                            break;
                        case 13:
                            objArr[1] = "getJavaKeywordName";
                            break;
                        case 14:
                            objArr[1] = "getDesc";
                            break;
                        case 15:
                            objArr[1] = "getWrapperFqName";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                            break;
                    }
                } else {
                    objArr[1] = "get";
                }
                switch (i4) {
                    case 1:
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[2] = "isBoxingMethodDescriptor";
                        break;
                    case g.INTEGER_FIELD_NUMBER /* 3 */:
                    case g.STRING_FIELD_NUMBER /* 5 */:
                        objArr[2] = "get";
                        break;
                    case g.LONG_FIELD_NUMBER /* 4 */:
                    case g.STRING_SET_FIELD_NUMBER /* 6 */:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case g.DOUBLE_FIELD_NUMBER /* 7 */:
                        objArr[2] = "getByDesc";
                        break;
                    case g.BYTES_FIELD_NUMBER /* 8 */:
                    case 9:
                    case 10:
                    case 11:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "isWrapperClassInternalName";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 4 && i4 != 6) {
                    switch (i4) {
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i8 = 2;
            objArr = new Object[i8];
            switch (i4) {
            }
            if (i4 == 4) {
            }
            objArr[1] = "get";
            switch (i4) {
            }
            String format2 = String.format(str, objArr);
            if (i4 != 4) {
                switch (i4) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i4 != 4) {
            switch (i4) {
            }
            objArr = new Object[i8];
            switch (i4) {
            }
            if (i4 == 4) {
            }
            objArr[1] = "get";
            switch (i4) {
            }
            String format22 = String.format(str, objArr);
            if (i4 != 4) {
            }
            throw new IllegalStateException(format22);
        }
        i8 = 2;
        objArr = new Object[i8];
        switch (i4) {
        }
        if (i4 == 4) {
        }
        objArr[1] = "get";
        switch (i4) {
        }
        String format222 = String.format(str, objArr);
        if (i4 != 4) {
        }
        throw new IllegalStateException(format222);
    }

    public static EnumC1170c b(String str) {
        EnumC1170c enumC1170c = (EnumC1170c) f13026p.get(str);
        if (enumC1170c != null) {
            return enumC1170c;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String c() {
        String str = this.f13034f;
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final j d() {
        j jVar = this.f13032d;
        if (jVar != null) {
            return jVar;
        }
        a(12);
        throw null;
    }
}
