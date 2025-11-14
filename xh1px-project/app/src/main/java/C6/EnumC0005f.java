package C6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: C6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0005f {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0005f f741d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0005f f742e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0005f f743f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0005f f744g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0005f f745h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0005f f746i;
    public static final /* synthetic */ EnumC0005f[] j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, C6.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, C6.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, C6.f] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, C6.f] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, C6.f] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, C6.f] */
    static {
        ?? r02 = new Enum("CLASS", 0);
        f741d = r02;
        ?? r12 = new Enum("INTERFACE", 1);
        f742e = r12;
        ?? r22 = new Enum("ENUM_CLASS", 2);
        f743f = r22;
        ?? r32 = new Enum("ENUM_ENTRY", 3);
        f744g = r32;
        ?? r42 = new Enum("ANNOTATION_CLASS", 4);
        f745h = r42;
        ?? r52 = new Enum("OBJECT", 5);
        f746i = r52;
        j = new EnumC0005f[]{r02, r12, r22, r32, r42, r52};
    }

    public static EnumC0005f valueOf(String str) {
        return (EnumC0005f) Enum.valueOf(EnumC0005f.class, str);
    }

    public static EnumC0005f[] values() {
        return (EnumC0005f[]) j.clone();
    }

    public final boolean a() {
        if (this != f746i && this != f744g) {
            return false;
        }
        return true;
    }
}
