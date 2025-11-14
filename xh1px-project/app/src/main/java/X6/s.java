package X6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final s f7040d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f7041e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f7042f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ s[] f7043g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, X6.s] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, X6.s] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, X6.s] */
    static {
        ?? r02 = new Enum("FLEXIBLE_LOWER", 0);
        f7040d = r02;
        ?? r12 = new Enum("FLEXIBLE_UPPER", 1);
        f7041e = r12;
        ?? r22 = new Enum("INFLEXIBLE", 2);
        f7042f = r22;
        f7043g = new s[]{r02, r12, r22};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f7043g.clone();
    }
}
