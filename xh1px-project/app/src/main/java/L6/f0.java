package L6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f3135d;

    /* renamed from: e, reason: collision with root package name */
    public static final f0 f3136e;

    /* renamed from: f, reason: collision with root package name */
    public static final f0 f3137f;

    /* renamed from: g, reason: collision with root package name */
    public static final f0 f3138g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f0[] f3139h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, L6.f0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, L6.f0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, L6.f0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, L6.f0] */
    static {
        ?? r02 = new Enum("LANGUAGE_VERSION", 0);
        f3135d = r02;
        ?? r12 = new Enum("COMPILER_VERSION", 1);
        f3136e = r12;
        ?? r22 = new Enum("API_VERSION", 2);
        f3137f = r22;
        ?? r32 = new Enum("UNKNOWN", 3);
        f3138g = r32;
        f3139h = new f0[]{r02, r12, r22, r32};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f3139h.clone();
    }
}
