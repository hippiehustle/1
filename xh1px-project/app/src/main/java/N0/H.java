package N0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class H {

    /* renamed from: d, reason: collision with root package name */
    public static final H f3576d;

    /* renamed from: e, reason: collision with root package name */
    public static final H f3577e;

    /* renamed from: f, reason: collision with root package name */
    public static final H f3578f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ H[] f3579g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, N0.H] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, N0.H] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, N0.H] */
    static {
        ?? r02 = new Enum("AUTOMATIC", 0);
        f3576d = r02;
        ?? r12 = new Enum("HARDWARE", 1);
        f3577e = r12;
        ?? r22 = new Enum("SOFTWARE", 2);
        f3578f = r22;
        f3579g = new H[]{r02, r12, r22};
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f3579g.clone();
    }
}
