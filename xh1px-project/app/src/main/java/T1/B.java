package T1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class B {

    /* renamed from: d, reason: collision with root package name */
    public static final B f5503d;

    /* renamed from: e, reason: collision with root package name */
    public static final B f5504e;

    /* renamed from: f, reason: collision with root package name */
    public static final B f5505f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ B[] f5506g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, T1.B] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, T1.B] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, T1.B] */
    static {
        ?? r02 = new Enum("ENABLE", 0);
        f5503d = r02;
        ?? r12 = new Enum("DISABLE", 1);
        f5504e = r12;
        ?? r22 = new Enum("TOGGLE", 2);
        f5505f = r22;
        f5506g = new B[]{r02, r12, r22};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f5506g.clone();
    }
}
