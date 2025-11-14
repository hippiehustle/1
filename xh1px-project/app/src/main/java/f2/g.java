package f2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f10708d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f10709e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f10710f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f2.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f2.g] */
    static {
        ?? r02 = new Enum("TEXT", 0);
        f10708d = r02;
        ?? r12 = new Enum("COUNTER_VALUE", 1);
        f10709e = r12;
        f10710f = new g[]{r02, r12};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f10710f.clone();
    }
}
