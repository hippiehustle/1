package K6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f2730d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f2731e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f2732f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f2733g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f2734h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f2735i;
    public static final b j;
    public static final b k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ b[] f2736l;

    /* JADX INFO: Fake field, exist only in values array */
    b EF1;

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, K6.b] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, K6.b] */
    static {
        ?? r12 = new Enum("FROM_IDE", 0);
        ?? r22 = new Enum("FROM_BACKEND", 1);
        ?? r32 = new Enum("FROM_TEST", 2);
        ?? r42 = new Enum("FROM_BUILTINS", 3);
        f2730d = r42;
        ?? r52 = new Enum("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        ?? r62 = new Enum("WHEN_CHECK_OVERRIDES", 5);
        ?? r72 = new Enum("FOR_SCRIPT", 6);
        ?? r8 = new Enum("FROM_REFLECTION", 7);
        f2731e = r8;
        ?? r9 = new Enum("WHEN_RESOLVE_DECLARATION", 8);
        ?? r10 = new Enum("WHEN_GET_DECLARATION_SCOPE", 9);
        ?? r11 = new Enum("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        ?? r122 = new Enum("FOR_ALREADY_TRACKED", 11);
        f2732f = r122;
        ?? r13 = new Enum("WHEN_GET_ALL_DESCRIPTORS", 12);
        f2733g = r13;
        ?? r14 = new Enum("WHEN_TYPING", 13);
        ?? r15 = new Enum("WHEN_GET_SUPER_MEMBERS", 14);
        f2734h = r15;
        ?? r02 = new Enum("FOR_NON_TRACKED_SCOPE", 15);
        f2735i = r02;
        ?? r16 = new Enum("FROM_SYNTHETIC_SCOPE", 16);
        ?? r03 = new Enum("FROM_DESERIALIZATION", 17);
        j = r03;
        ?? r17 = new Enum("FROM_JAVA_LOADER", 18);
        k = r17;
        f2736l = new b[]{r12, r22, r32, r42, r52, r62, r72, r8, r9, r10, r11, r122, r13, r14, r15, r02, r16, r03, r17, new Enum("WHEN_GET_LOCAL_VARIABLE", 19), new Enum("WHEN_FIND_BY_FQNAME", 20), new Enum("WHEN_GET_COMPANION_OBJECT", 21), new Enum("FOR_DEFAULT_IMPORTS", 22)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f2736l.clone();
    }
}
