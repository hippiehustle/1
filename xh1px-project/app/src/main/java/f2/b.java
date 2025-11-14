package f2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f10676d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f10677e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f10678f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b[] f10679g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f2.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f2.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, f2.b] */
    static {
        ?? r02 = new Enum("ADD", 0);
        f10676d = r02;
        ?? r12 = new Enum("MINUS", 1);
        f10677e = r12;
        ?? r22 = new Enum("SET", 2);
        f10678f = r22;
        f10679g = new b[]{r02, r12, r22};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10679g.clone();
    }
}
