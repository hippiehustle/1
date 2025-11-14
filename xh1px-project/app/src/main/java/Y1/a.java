package Y1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f7089d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f7090e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f7091f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f7092g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a[] f7093h;

    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Y1.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Y1.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [Y1.a, java.lang.Enum] */
    static {
        ?? r02 = new Enum("TOP_LEFT", 0);
        f7089d = r02;
        ?? r12 = new Enum("TOP_RIGHT", 1);
        f7090e = r12;
        ?? r22 = new Enum("BOTTOM_LEFT", 2);
        f7091f = r22;
        ?? r32 = new Enum("BOTTOM_RIGHT", 3);
        f7092g = r32;
        f7093h = new a[]{r02, r12, r22, r32};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f7093h.clone();
    }
}
