package B6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final o f495d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f496e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f497f;

    /* renamed from: g, reason: collision with root package name */
    public static final o f498g;

    /* renamed from: h, reason: collision with root package name */
    public static final o f499h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ o[] f500i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, B6.o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, B6.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, B6.o] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, B6.o] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, B6.o] */
    static {
        ?? r02 = new Enum("HIDDEN", 0);
        f495d = r02;
        ?? r12 = new Enum("VISIBLE", 1);
        f496e = r12;
        ?? r22 = new Enum("DEPRECATED_LIST_METHODS", 2);
        f497f = r22;
        ?? r32 = new Enum("NOT_CONSIDERED", 3);
        f498g = r32;
        ?? r42 = new Enum("DROP", 4);
        f499h = r42;
        f500i = new o[]{r02, r12, r22, r32, r42};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f500i.clone();
    }
}
