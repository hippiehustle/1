package T1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class H {

    /* renamed from: d, reason: collision with root package name */
    public static final H f5524d;

    /* renamed from: e, reason: collision with root package name */
    public static final H f5525e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ H[] f5526f;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.H, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T1.H, java.lang.Enum] */
    static {
        ?? r02 = new Enum("TEXT", 0);
        f5524d = r02;
        ?? r12 = new Enum("COUNTER_VALUE", 1);
        f5525e = r12;
        f5526f = new H[]{r02, r12};
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f5526f.clone();
    }
}
