package u6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f15367d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f15368e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f15369f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ k[] f15370g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u6.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u6.k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u6.k] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f15367d = r02;
        ?? r12 = new Enum("EXTENSION_RECEIVER", 1);
        f15368e = r12;
        ?? r22 = new Enum("VALUE", 2);
        f15369f = r22;
        f15370g = new k[]{r02, r12, r22};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f15370g.clone();
    }
}
