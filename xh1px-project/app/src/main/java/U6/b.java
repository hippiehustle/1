package U6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f6176d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f6177e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f6178f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b[] f6179g;

    /* JADX WARN: Type inference failed for: r0v0, types: [U6.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [U6.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [U6.b, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INFLEXIBLE", 0);
        f6176d = r02;
        ?? r12 = new Enum("FLEXIBLE_UPPER_BOUND", 1);
        f6177e = r12;
        ?? r22 = new Enum("FLEXIBLE_LOWER_BOUND", 2);
        f6178f = r22;
        f6179g = new b[]{r02, r12, r22};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f6179g.clone();
    }
}
