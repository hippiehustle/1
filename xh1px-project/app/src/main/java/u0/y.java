package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final y f15292d;

    /* renamed from: e, reason: collision with root package name */
    public static final y f15293e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y[] f15294f;

    /* JADX WARN: Type inference failed for: r0v0, types: [u0.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [u0.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [u0.y, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DEFERRED", 0);
        f15292d = r02;
        ?? r12 = new Enum("IMMEDIATE", 1);
        f15293e = r12;
        f15294f = new y[]{r02, r12, new Enum("EXCLUSIVE", 2)};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f15294f.clone();
    }
}
