package S7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f5441d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f5442e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f5443f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f5444g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f5445h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f5446i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, S7.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, S7.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, S7.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, S7.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, S7.b] */
    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f5441d = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f5442e = r12;
        ?? r22 = new Enum("PARKING", 2);
        f5443f = r22;
        ?? r32 = new Enum("DORMANT", 3);
        f5444g = r32;
        ?? r42 = new Enum("TERMINATED", 4);
        f5445h = r42;
        f5446i = new b[]{r02, r12, r22, r32, r42};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5446i.clone();
    }
}
