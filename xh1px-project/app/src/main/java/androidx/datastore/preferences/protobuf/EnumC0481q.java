package androidx.datastore.preferences.protobuf;

import x.AbstractC1769h;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0481q {

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0481q f8733e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0481q f8734f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0481q[] f8735g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0481q[] f8736h;

    /* renamed from: d, reason: collision with root package name */
    public final int f8737d;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0481q EF0;

    static {
        EnumC0487x enumC0487x = EnumC0487x.DOUBLE;
        EnumC0481q enumC0481q = new EnumC0481q("DOUBLE", 0, 0, 1, enumC0487x);
        EnumC0487x enumC0487x2 = EnumC0487x.FLOAT;
        EnumC0481q enumC0481q2 = new EnumC0481q("FLOAT", 1, 1, 1, enumC0487x2);
        EnumC0487x enumC0487x3 = EnumC0487x.LONG;
        EnumC0481q enumC0481q3 = new EnumC0481q("INT64", 2, 2, 1, enumC0487x3);
        EnumC0481q enumC0481q4 = new EnumC0481q("UINT64", 3, 3, 1, enumC0487x3);
        EnumC0487x enumC0487x4 = EnumC0487x.INT;
        EnumC0481q enumC0481q5 = new EnumC0481q("INT32", 4, 4, 1, enumC0487x4);
        EnumC0481q enumC0481q6 = new EnumC0481q("FIXED64", 5, 5, 1, enumC0487x3);
        EnumC0481q enumC0481q7 = new EnumC0481q("FIXED32", 6, 6, 1, enumC0487x4);
        EnumC0487x enumC0487x5 = EnumC0487x.BOOLEAN;
        EnumC0481q enumC0481q8 = new EnumC0481q("BOOL", 7, 7, 1, enumC0487x5);
        EnumC0487x enumC0487x6 = EnumC0487x.STRING;
        EnumC0481q enumC0481q9 = new EnumC0481q("STRING", 8, 8, 1, enumC0487x6);
        EnumC0487x enumC0487x7 = EnumC0487x.MESSAGE;
        EnumC0481q enumC0481q10 = new EnumC0481q("MESSAGE", 9, 9, 1, enumC0487x7);
        EnumC0487x enumC0487x8 = EnumC0487x.BYTE_STRING;
        EnumC0481q enumC0481q11 = new EnumC0481q("BYTES", 10, 10, 1, enumC0487x8);
        EnumC0481q enumC0481q12 = new EnumC0481q("UINT32", 11, 11, 1, enumC0487x4);
        EnumC0487x enumC0487x9 = EnumC0487x.ENUM;
        EnumC0481q enumC0481q13 = new EnumC0481q("ENUM", 12, 12, 1, enumC0487x9);
        EnumC0481q enumC0481q14 = new EnumC0481q("SFIXED32", 13, 13, 1, enumC0487x4);
        EnumC0481q enumC0481q15 = new EnumC0481q("SFIXED64", 14, 14, 1, enumC0487x3);
        EnumC0481q enumC0481q16 = new EnumC0481q("SINT32", 15, 15, 1, enumC0487x4);
        EnumC0481q enumC0481q17 = new EnumC0481q("SINT64", 16, 16, 1, enumC0487x3);
        EnumC0481q enumC0481q18 = new EnumC0481q("GROUP", 17, 17, 1, enumC0487x7);
        EnumC0481q enumC0481q19 = new EnumC0481q("DOUBLE_LIST", 18, 18, 2, enumC0487x);
        EnumC0481q enumC0481q20 = new EnumC0481q("FLOAT_LIST", 19, 19, 2, enumC0487x2);
        EnumC0481q enumC0481q21 = new EnumC0481q("INT64_LIST", 20, 20, 2, enumC0487x3);
        EnumC0481q enumC0481q22 = new EnumC0481q("UINT64_LIST", 21, 21, 2, enumC0487x3);
        EnumC0481q enumC0481q23 = new EnumC0481q("INT32_LIST", 22, 22, 2, enumC0487x4);
        EnumC0481q enumC0481q24 = new EnumC0481q("FIXED64_LIST", 23, 23, 2, enumC0487x3);
        EnumC0481q enumC0481q25 = new EnumC0481q("FIXED32_LIST", 24, 24, 2, enumC0487x4);
        EnumC0481q enumC0481q26 = new EnumC0481q("BOOL_LIST", 25, 25, 2, enumC0487x5);
        EnumC0481q enumC0481q27 = new EnumC0481q("STRING_LIST", 26, 26, 2, enumC0487x6);
        EnumC0481q enumC0481q28 = new EnumC0481q("MESSAGE_LIST", 27, 27, 2, enumC0487x7);
        EnumC0481q enumC0481q29 = new EnumC0481q("BYTES_LIST", 28, 28, 2, enumC0487x8);
        EnumC0481q enumC0481q30 = new EnumC0481q("UINT32_LIST", 29, 29, 2, enumC0487x4);
        EnumC0481q enumC0481q31 = new EnumC0481q("ENUM_LIST", 30, 30, 2, enumC0487x9);
        EnumC0481q enumC0481q32 = new EnumC0481q("SFIXED32_LIST", 31, 31, 2, enumC0487x4);
        EnumC0481q enumC0481q33 = new EnumC0481q("SFIXED64_LIST", 32, 32, 2, enumC0487x3);
        EnumC0481q enumC0481q34 = new EnumC0481q("SINT32_LIST", 33, 33, 2, enumC0487x4);
        EnumC0481q enumC0481q35 = new EnumC0481q("SINT64_LIST", 34, 34, 2, enumC0487x3);
        EnumC0481q enumC0481q36 = new EnumC0481q("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0487x);
        f8733e = enumC0481q36;
        EnumC0481q enumC0481q37 = new EnumC0481q("FLOAT_LIST_PACKED", 36, 36, 3, enumC0487x2);
        EnumC0481q enumC0481q38 = new EnumC0481q("INT64_LIST_PACKED", 37, 37, 3, enumC0487x3);
        EnumC0481q enumC0481q39 = new EnumC0481q("UINT64_LIST_PACKED", 38, 38, 3, enumC0487x3);
        EnumC0481q enumC0481q40 = new EnumC0481q("INT32_LIST_PACKED", 39, 39, 3, enumC0487x4);
        EnumC0481q enumC0481q41 = new EnumC0481q("FIXED64_LIST_PACKED", 40, 40, 3, enumC0487x3);
        EnumC0481q enumC0481q42 = new EnumC0481q("FIXED32_LIST_PACKED", 41, 41, 3, enumC0487x4);
        EnumC0481q enumC0481q43 = new EnumC0481q("BOOL_LIST_PACKED", 42, 42, 3, enumC0487x5);
        EnumC0481q enumC0481q44 = new EnumC0481q("UINT32_LIST_PACKED", 43, 43, 3, enumC0487x4);
        EnumC0481q enumC0481q45 = new EnumC0481q("ENUM_LIST_PACKED", 44, 44, 3, enumC0487x9);
        EnumC0481q enumC0481q46 = new EnumC0481q("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0487x4);
        EnumC0481q enumC0481q47 = new EnumC0481q("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0487x3);
        EnumC0481q enumC0481q48 = new EnumC0481q("SINT32_LIST_PACKED", 47, 47, 3, enumC0487x4);
        EnumC0481q enumC0481q49 = new EnumC0481q("SINT64_LIST_PACKED", 48, 48, 3, enumC0487x3);
        f8734f = enumC0481q49;
        f8736h = new EnumC0481q[]{enumC0481q, enumC0481q2, enumC0481q3, enumC0481q4, enumC0481q5, enumC0481q6, enumC0481q7, enumC0481q8, enumC0481q9, enumC0481q10, enumC0481q11, enumC0481q12, enumC0481q13, enumC0481q14, enumC0481q15, enumC0481q16, enumC0481q17, enumC0481q18, enumC0481q19, enumC0481q20, enumC0481q21, enumC0481q22, enumC0481q23, enumC0481q24, enumC0481q25, enumC0481q26, enumC0481q27, enumC0481q28, enumC0481q29, enumC0481q30, enumC0481q31, enumC0481q32, enumC0481q33, enumC0481q34, enumC0481q35, enumC0481q36, enumC0481q37, enumC0481q38, enumC0481q39, enumC0481q40, enumC0481q41, enumC0481q42, enumC0481q43, enumC0481q44, enumC0481q45, enumC0481q46, enumC0481q47, enumC0481q48, enumC0481q49, new EnumC0481q("GROUP_LIST", 49, 49, 2, enumC0487x7), new EnumC0481q("MAP", 50, 50, 4, EnumC0487x.VOID)};
        EnumC0481q[] values = values();
        f8735g = new EnumC0481q[values.length];
        for (EnumC0481q enumC0481q50 : values) {
            f8735g[enumC0481q50.f8737d] = enumC0481q50;
        }
    }

    public EnumC0481q(String str, int i4, int i8, int i9, EnumC0487x enumC0487x) {
        this.f8737d = i8;
        int b4 = AbstractC1769h.b(i9);
        if (b4 != 1) {
            if (b4 == 3) {
                enumC0487x.getClass();
            }
        } else {
            enumC0487x.getClass();
        }
        if (i9 == 1) {
            enumC0487x.ordinal();
        }
    }

    public static EnumC0481q valueOf(String str) {
        return (EnumC0481q) Enum.valueOf(EnumC0481q.class, str);
    }

    public static EnumC0481q[] values() {
        return (EnumC0481q[]) f8736h.clone();
    }
}
