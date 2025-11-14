package j2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0904d {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0904d f11802d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0904d f11803e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0904d f11804f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0904d f11805g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0904d f11806h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0904d[] f11807i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j2.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j2.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j2.d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j2.d] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j2.d] */
    static {
        ?? r02 = new Enum("EQUALS", 0);
        f11802d = r02;
        ?? r12 = new Enum("LOWER", 1);
        f11803e = r12;
        ?? r22 = new Enum("LOWER_OR_EQUALS", 2);
        f11804f = r22;
        ?? r32 = new Enum("GREATER", 3);
        f11805g = r32;
        ?? r42 = new Enum("GREATER_OR_EQUALS", 4);
        f11806h = r42;
        f11807i = new EnumC0904d[]{r02, r12, r22, r32, r42};
    }

    public static EnumC0904d valueOf(String str) {
        return (EnumC0904d) Enum.valueOf(EnumC0904d.class, str);
    }

    public static EnumC0904d[] values() {
        return (EnumC0904d[]) f11807i.clone();
    }
}
