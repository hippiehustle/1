package N0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: N0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0200h {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0200h f3593d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0200h f3594e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0200h f3595f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0200h f3596g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0200h f3597h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0200h f3598i;
    public static final /* synthetic */ EnumC0200h[] j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, N0.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, N0.h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, N0.h] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, N0.h] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, N0.h] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, N0.h] */
    static {
        ?? r02 = new Enum("SET_ANIMATION", 0);
        f3593d = r02;
        ?? r12 = new Enum("SET_PROGRESS", 1);
        f3594e = r12;
        ?? r22 = new Enum("SET_REPEAT_MODE", 2);
        f3595f = r22;
        ?? r32 = new Enum("SET_REPEAT_COUNT", 3);
        f3596g = r32;
        ?? r42 = new Enum("SET_IMAGE_ASSETS", 4);
        f3597h = r42;
        ?? r52 = new Enum("PLAY_OPTION", 5);
        f3598i = r52;
        j = new EnumC0200h[]{r02, r12, r22, r32, r42, r52};
    }

    public static EnumC0200h valueOf(String str) {
        return (EnumC0200h) Enum.valueOf(EnumC0200h.class, str);
    }

    public static EnumC0200h[] values() {
        return (EnumC0200h[]) j.clone();
    }
}
