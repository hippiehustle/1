package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0806a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0806a f11299d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0806a f11300e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0806a f11301f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0806a f11302g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0806a[] f11303h;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0806a EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h0.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h0.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, h0.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, h0.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, h0.a] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, h0.a] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, h0.a] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, h0.a] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, h0.a] */
    static {
        ?? r02 = new Enum("PENALTY_LOG", 0);
        ?? r12 = new Enum("PENALTY_DEATH", 1);
        ?? r22 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        f11299d = r22;
        ?? r32 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        f11300e = r32;
        ?? r42 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f11301f = r42;
        ?? r52 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
        ?? r62 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
        ?? r72 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
        ?? r8 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f11302g = r8;
        f11303h = new EnumC0806a[]{r02, r12, r22, r32, r42, r52, r62, r72, r8};
    }

    public static EnumC0806a valueOf(String str) {
        return (EnumC0806a) Enum.valueOf(EnumC0806a.class, str);
    }

    public static EnumC0806a[] values() {
        return (EnumC0806a[]) f11303h.clone();
    }
}
