package Z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final q f7464d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f7465e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f7466f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ q[] f7467g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Z4.q] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Z4.q] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Z4.q] */
    static {
        ?? r02 = new Enum("SELECTION", 0);
        f7464d = r02;
        ?? r12 = new Enum("SEARCH", 1);
        f7465e = r12;
        ?? r22 = new Enum("EXPORT", 2);
        f7466f = r22;
        f7467g = new q[]{r02, r12, r22};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f7467g.clone();
    }
}
