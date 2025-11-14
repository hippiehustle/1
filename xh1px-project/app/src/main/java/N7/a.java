package N7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f3795d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f3796e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f3797f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f3798g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, N7.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, N7.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, N7.a] */
    static {
        ?? r02 = new Enum("SUSPEND", 0);
        f3795d = r02;
        ?? r12 = new Enum("DROP_OLDEST", 1);
        f3796e = r12;
        ?? r22 = new Enum("DROP_LATEST", 2);
        f3797f = r22;
        f3798g = new a[]{r02, r12, r22};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f3798g.clone();
    }
}
