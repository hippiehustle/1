package a5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0424h {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0424h f7750d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0424h f7751e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0424h f7752f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0424h[] f7753g;

    /* JADX WARN: Type inference failed for: r0v0, types: [a5.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a5.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [a5.h, java.lang.Enum] */
    static {
        ?? r02 = new Enum("NAME", 0);
        f7750d = r02;
        ?? r12 = new Enum("RECENT", 1);
        f7751e = r12;
        ?? r22 = new Enum("MOST_USED", 2);
        f7752f = r22;
        f7753g = new EnumC0424h[]{r02, r12, r22};
    }

    public static EnumC0424h valueOf(String str) {
        return (EnumC0424h) Enum.valueOf(EnumC0424h.class, str);
    }

    public static EnumC0424h[] values() {
        return (EnumC0424h[]) f7753g.clone();
    }
}
