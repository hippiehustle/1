package T1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final u f5647d;

    /* renamed from: e, reason: collision with root package name */
    public static final u f5648e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u[] f5649f;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T1.u, java.lang.Enum] */
    static {
        ?? r02 = new Enum("NUMBER", 0);
        f5647d = r02;
        ?? r12 = new Enum("COUNTER", 1);
        f5648e = r12;
        f5649f = new u[]{r02, r12};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f5649f.clone();
    }
}
