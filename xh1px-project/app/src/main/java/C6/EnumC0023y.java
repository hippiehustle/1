package C6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: C6.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0023y {

    /* renamed from: d, reason: collision with root package name */
    public static final P f777d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0023y f778e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0023y f779f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0023y f780g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0023y f781h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0023y[] f782i;

    /* JADX WARN: Type inference failed for: r0v0, types: [C6.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [C6.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [C6.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [C6.y, java.lang.Enum] */
    static {
        ?? r02 = new Enum("FINAL", 0);
        f778e = r02;
        ?? r12 = new Enum("SEALED", 1);
        f779f = r12;
        ?? r22 = new Enum("OPEN", 2);
        f780g = r22;
        ?? r32 = new Enum("ABSTRACT", 3);
        f781h = r32;
        f782i = new EnumC0023y[]{r02, r12, r22, r32};
        f777d = new P(5);
    }

    public static EnumC0023y valueOf(String str) {
        return (EnumC0023y) Enum.valueOf(EnumC0023y.class, str);
    }

    public static EnumC0023y[] values() {
        return (EnumC0023y[]) f782i.clone();
    }
}
