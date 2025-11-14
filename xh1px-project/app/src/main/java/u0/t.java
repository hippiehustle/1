package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final t f15271d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f15272e;

    /* renamed from: f, reason: collision with root package name */
    public static final t f15273f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t[] f15274g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u0.t] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u0.t] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u0.t] */
    static {
        ?? r02 = new Enum("AUTOMATIC", 0);
        f15271d = r02;
        ?? r12 = new Enum("TRUNCATE", 1);
        f15272e = r12;
        ?? r22 = new Enum("WRITE_AHEAD_LOGGING", 2);
        f15273f = r22;
        f15274g = new t[]{r02, r12, r22};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f15274g.clone();
    }
}
