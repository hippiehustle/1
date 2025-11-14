package L6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f3124d;

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f3125e;

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f3126f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c0[] f3127g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, L6.c0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, L6.c0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, L6.c0] */
    static {
        ?? r02 = new Enum("INVARIANT", 0);
        f3124d = r02;
        ?? r12 = new Enum("IN", 1);
        f3125e = r12;
        ?? r22 = new Enum("OUT", 2);
        f3126f = r22;
        f3127g = new c0[]{r02, r12, r22};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f3127g.clone();
    }
}
