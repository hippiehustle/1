package androidx.datastore.preferences.protobuf;

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
public class n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f8713f;

    /* renamed from: g, reason: collision with root package name */
    public static final k0 f8714g;

    /* renamed from: h, reason: collision with root package name */
    public static final l0 f8715h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ n0[] f8716i;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f8717d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8718e;

    /* JADX INFO: Fake field, exist only in values array */
    n0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    n0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    n0 EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.n0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.datastore.preferences.protobuf.j0, androidx.datastore.preferences.protobuf.n0] */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.datastore.preferences.protobuf.k0, androidx.datastore.preferences.protobuf.n0] */
    static {
        n0 n0Var = new n0("DOUBLE", 0, o0.DOUBLE, 1);
        n0 n0Var2 = new n0("FLOAT", 1, o0.FLOAT, 5);
        o0 o0Var = o0.LONG;
        n0 n0Var3 = new n0("INT64", 2, o0Var, 0);
        n0 n0Var4 = new n0("UINT64", 3, o0Var, 0);
        o0 o0Var2 = o0.INT;
        n0 n0Var5 = new n0("INT32", 4, o0Var2, 0);
        n0 n0Var6 = new n0("FIXED64", 5, o0Var, 1);
        n0 n0Var7 = new n0("FIXED32", 6, o0Var2, 5);
        n0 n0Var8 = new n0("BOOL", 7, o0.BOOLEAN, 0);
        ?? n0Var9 = new n0("STRING", 8, o0.STRING, 2);
        f8713f = n0Var9;
        o0 o0Var3 = o0.MESSAGE;
        ?? n0Var10 = new n0("GROUP", 9, o0Var3, 3);
        f8714g = n0Var10;
        ?? n0Var11 = new n0("MESSAGE", 10, o0Var3, 2);
        f8715h = n0Var11;
        f8716i = new n0[]{n0Var, n0Var2, n0Var3, n0Var4, n0Var5, n0Var6, n0Var7, n0Var8, n0Var9, n0Var10, n0Var11, new n0("BYTES", 11, o0.BYTE_STRING, 2), new n0("UINT32", 12, o0Var2, 0), new n0("ENUM", 13, o0.ENUM, 0), new n0("SFIXED32", 14, o0Var2, 5), new n0("SFIXED64", 15, o0Var, 1), new n0("SINT32", 16, o0Var2, 0), new n0("SINT64", 17, o0Var, 0)};
    }

    public n0(String str, int i4, o0 o0Var, int i8) {
        this.f8717d = o0Var;
        this.f8718e = i8;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f8716i.clone();
    }
}
