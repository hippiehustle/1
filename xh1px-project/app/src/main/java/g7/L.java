package g7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class L {

    /* renamed from: f, reason: collision with root package name */
    public static final L f11201f;

    /* renamed from: g, reason: collision with root package name */
    public static final L f11202g;

    /* renamed from: h, reason: collision with root package name */
    public static final I f11203h;

    /* renamed from: i, reason: collision with root package name */
    public static final J f11204i;
    public static final L j;
    public static final /* synthetic */ L[] k;

    /* renamed from: d, reason: collision with root package name */
    public final M f11205d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11206e;

    /* JADX INFO: Fake field, exist only in values array */
    L EF0;

    /* JADX INFO: Fake field, exist only in values array */
    L EF1;

    /* JADX INFO: Fake field, exist only in values array */
    L EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [g7.L, g7.J] */
    /* JADX WARN: Type inference failed for: r6v3, types: [g7.L, g7.I] */
    static {
        L l6 = new L("DOUBLE", 0, M.DOUBLE, 1);
        L l8 = new L("FLOAT", 1, M.FLOAT, 5);
        M m6 = M.LONG;
        L l9 = new L("INT64", 2, m6, 0);
        L l10 = new L("UINT64", 3, m6, 0);
        M m8 = M.INT;
        L l11 = new L("INT32", 4, m8, 0);
        f11201f = l11;
        L l12 = new L("FIXED64", 5, m6, 1);
        L l13 = new L("FIXED32", 6, m8, 5);
        L l14 = new L("BOOL", 7, M.BOOLEAN, 0);
        f11202g = l14;
        L l15 = new L("STRING", 8, M.STRING, 2);
        M m9 = M.MESSAGE;
        ?? l16 = new L("GROUP", 9, m9, 3);
        f11203h = l16;
        ?? l17 = new L("MESSAGE", 10, m9, 2);
        f11204i = l17;
        L l18 = new L("BYTES", 11, M.BYTE_STRING, 2);
        L l19 = new L("UINT32", 12, m8, 0);
        L l20 = new L("ENUM", 13, M.ENUM, 0);
        j = l20;
        k = new L[]{l6, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, new L("SFIXED32", 14, m8, 5), new L("SFIXED64", 15, m6, 1), new L("SINT32", 16, m8, 0), new L("SINT64", 17, m6, 0)};
    }

    public L(String str, int i4, M m6, int i8) {
        this.f11205d = m6;
        this.f11206e = i8;
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) k.clone();
    }

    public boolean a() {
        return !(this instanceof H);
    }
}
