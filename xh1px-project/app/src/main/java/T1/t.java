package T1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final t f5641d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f5642e;

    /* renamed from: f, reason: collision with root package name */
    public static final t f5643f;

    /* renamed from: g, reason: collision with root package name */
    public static final t f5644g;

    /* renamed from: h, reason: collision with root package name */
    public static final t f5645h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ t[] f5646i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, T1.t] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, T1.t] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, T1.t] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, T1.t] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, T1.t] */
    static {
        ?? r02 = new Enum("EQUALS", 0);
        f5641d = r02;
        ?? r12 = new Enum("LOWER", 1);
        f5642e = r12;
        ?? r22 = new Enum("LOWER_OR_EQUALS", 2);
        f5643f = r22;
        ?? r32 = new Enum("GREATER", 3);
        f5644g = r32;
        ?? r42 = new Enum("GREATER_OR_EQUALS", 4);
        f5645h = r42;
        f5646i = new t[]{r02, r12, r22, r32, r42};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f5646i.clone();
    }
}
