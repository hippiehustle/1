package z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1885b {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1885b f16823d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1885b[] f16824e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z7.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z7.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, z7.b] */
    static {
        ?? r02 = new Enum("FOR_SUBTYPING", 0);
        f16823d = r02;
        f16824e = new EnumC1885b[]{r02, new Enum("FOR_INCORPORATION", 1), new Enum("FROM_EXPRESSION", 2)};
    }

    public static EnumC1885b valueOf(String str) {
        return (EnumC1885b) Enum.valueOf(EnumC1885b.class, str);
    }

    public static EnumC1885b[] values() {
        return (EnumC1885b[]) f16824e.clone();
    }
}
