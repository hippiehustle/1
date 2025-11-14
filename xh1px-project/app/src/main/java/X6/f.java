package X6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final f f7000d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f7001e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f7002f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, X6.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, X6.f] */
    static {
        ?? r02 = new Enum("READ_ONLY", 0);
        f7000d = r02;
        ?? r12 = new Enum("MUTABLE", 1);
        f7001e = r12;
        f7002f = new f[]{r02, r12};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f7002f.clone();
    }
}
