package f2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final n f10746d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f10747e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f10748f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ n[] f10749g;

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [f2.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [f2.n, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ENABLE", 0);
        f10746d = r02;
        ?? r12 = new Enum("DISABLE", 1);
        f10747e = r12;
        ?? r22 = new Enum("TOGGLE", 2);
        f10748f = r22;
        f10749g = new n[]{r02, r12, r22};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f10749g.clone();
    }
}
