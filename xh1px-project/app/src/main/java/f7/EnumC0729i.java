package f7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0729i {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0729i f10840d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0729i f10841e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0729i f10842f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0729i[] f10843g;

    /* JADX WARN: Type inference failed for: r0v0, types: [f7.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [f7.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [f7.i, java.lang.Enum] */
    static {
        ?? r02 = new Enum("BEGINNING", 0);
        f10840d = r02;
        ?? r12 = new Enum("MIDDLE", 1);
        f10841e = r12;
        ?? r22 = new Enum("AFTER_DOT", 2);
        f10842f = r22;
        f10843g = new EnumC0729i[]{r02, r12, r22};
    }

    public static EnumC0729i valueOf(String str) {
        return (EnumC0729i) Enum.valueOf(EnumC0729i.class, str);
    }

    public static EnumC0729i[] values() {
        return (EnumC0729i[]) f10843g.clone();
    }
}
