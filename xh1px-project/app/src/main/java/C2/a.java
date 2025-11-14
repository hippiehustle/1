package C2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f581d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f582e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f583f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f584g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, C2.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, C2.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, C2.a] */
    static {
        ?? r02 = new Enum("DISMISS", 0);
        f581d = r02;
        ?? r12 = new Enum("DELETE", 1);
        f582e = r12;
        ?? r22 = new Enum("SAVE", 2);
        f583f = r22;
        f584g = new a[]{r02, r12, r22};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f584g.clone();
    }
}
