package V4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f6370d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f6371e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f6372f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f6373g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a[] f6374h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, V4.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, V4.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, V4.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, V4.a] */
    static {
        ?? r02 = new Enum("CONFIGURING_INVALID", 0);
        f6370d = r02;
        ?? r12 = new Enum("CONFIGURING", 1);
        f6371e = r12;
        ?? r22 = new Enum("CREATING", 2);
        f6372f = r22;
        ?? r32 = new Enum("SAVED", 3);
        f6373g = r32;
        f6374h = new a[]{r02, r12, r22, r32};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6374h.clone();
    }
}
