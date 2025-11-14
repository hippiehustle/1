package O7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class X {

    /* renamed from: d, reason: collision with root package name */
    public static final X f4109d;

    /* renamed from: e, reason: collision with root package name */
    public static final X f4110e;

    /* renamed from: f, reason: collision with root package name */
    public static final X f4111f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ X[] f4112g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, O7.X] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, O7.X] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, O7.X] */
    static {
        ?? r02 = new Enum("START", 0);
        f4109d = r02;
        ?? r12 = new Enum("STOP", 1);
        f4110e = r12;
        ?? r22 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        f4111f = r22;
        f4112g = new X[]{r02, r12, r22};
    }

    public static X valueOf(String str) {
        return (X) Enum.valueOf(X.class, str);
    }

    public static X[] values() {
        return (X[]) f4112g.clone();
    }
}
