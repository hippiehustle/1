package Y6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7206d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f7207e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f7208f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b[] f7209g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Y6.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Y6.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Y6.b] */
    static {
        ?? r02 = new Enum("PROPERTY", 0);
        f7206d = r02;
        ?? r12 = new Enum("BACKING_FIELD", 1);
        f7207e = r12;
        ?? r22 = new Enum("DELEGATE_FIELD", 2);
        f7208f = r22;
        f7209g = new b[]{r02, r12, r22};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f7209g.clone();
    }
}
