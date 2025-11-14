package L7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: L7.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0164w {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0164w f3248d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0164w f3249e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0164w f3250f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0164w f3251g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0164w[] f3252h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, L7.w] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, L7.w] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, L7.w] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, L7.w] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f3248d = r02;
        ?? r12 = new Enum("LAZY", 1);
        f3249e = r12;
        ?? r22 = new Enum("ATOMIC", 2);
        f3250f = r22;
        ?? r32 = new Enum("UNDISPATCHED", 3);
        f3251g = r32;
        f3252h = new EnumC0164w[]{r02, r12, r22, r32};
    }

    public static EnumC0164w valueOf(String str) {
        return (EnumC0164w) Enum.valueOf(EnumC0164w.class, str);
    }

    public static EnumC0164w[] values() {
        return (EnumC0164w[]) f3252h.clone();
    }
}
