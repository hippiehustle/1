package r2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f14308d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f14309e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f14310f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f14311g;

    /* renamed from: h, reason: collision with root package name */
    public static final k f14312h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k[] f14313i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r2.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r2.k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, r2.k] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, r2.k] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, r2.k] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, r2.k] */
    static {
        ?? r02 = new Enum("CREATED", 0);
        f14308d = r02;
        ?? r12 = new Enum("TRANSITIONING", 1);
        f14309e = r12;
        ?? r22 = new Enum("RECORDING", 2);
        f14310f = r22;
        ?? r32 = new Enum("DETECTING", 3);
        f14311g = r32;
        ?? r42 = new Enum("DESTROYED", 4);
        ?? r52 = new Enum("ERROR_NATIVE_DETECTOR_LIB_NOT_FOUND", 5);
        f14312h = r52;
        f14313i = new k[]{r02, r12, r22, r32, r42, r52};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f14313i.clone();
    }
}
