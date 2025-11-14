package u6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final w f15375d;

    /* renamed from: e, reason: collision with root package name */
    public static final w f15376e;

    /* renamed from: f, reason: collision with root package name */
    public static final w f15377f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w[] f15378g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u6.w] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u6.w] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u6.w] */
    static {
        ?? r02 = new Enum("INVARIANT", 0);
        f15375d = r02;
        ?? r12 = new Enum("IN", 1);
        f15376e = r12;
        ?? r22 = new Enum("OUT", 2);
        f15377f = r22;
        f15378g = new w[]{r02, r12, r22};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f15378g.clone();
    }
}
