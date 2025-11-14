package T1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class N {

    /* renamed from: d, reason: collision with root package name */
    public static final N f5540d;

    /* renamed from: e, reason: collision with root package name */
    public static final N f5541e;

    /* renamed from: f, reason: collision with root package name */
    public static final N f5542f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ N[] f5543g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, T1.N] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, T1.N] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, T1.N] */
    static {
        ?? r02 = new Enum("BACK", 0);
        f5540d = r02;
        ?? r12 = new Enum("HOME", 1);
        f5541e = r12;
        ?? r22 = new Enum("RECENT_APPS", 2);
        f5542f = r22;
        f5543g = new N[]{r02, r12, r22};
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f5543g.clone();
    }
}
