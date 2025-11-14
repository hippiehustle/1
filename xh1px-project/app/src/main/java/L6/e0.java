package L6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f3131d;

    /* renamed from: e, reason: collision with root package name */
    public static final e0 f3132e;

    /* renamed from: f, reason: collision with root package name */
    public static final e0 f3133f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e0[] f3134g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, L6.e0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, L6.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, L6.e0] */
    static {
        ?? r02 = new Enum("WARNING", 0);
        f3131d = r02;
        ?? r12 = new Enum("ERROR", 1);
        f3132e = r12;
        ?? r22 = new Enum("HIDDEN", 2);
        f3133f = r22;
        f3134g = new e0[]{r02, r12, r22};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f3134g.clone();
    }
}
