package z3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1856b {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1856b f16629d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1856b f16630e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1856b[] f16631f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z3.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z3.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, z3.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, z3.b] */
    static {
        ?? r02 = new Enum("UNKNOWN", 0);
        f16629d = r02;
        ?? r12 = new Enum("CANNOT_REQUEST_ADS", 1);
        f16630e = r12;
        f16631f = new EnumC1856b[]{r02, r12, new Enum("CAN_REQUEST_ADS", 2), new Enum("ADS_NOT_NEEDED", 3)};
    }

    public static EnumC1856b valueOf(String str) {
        return (EnumC1856b) Enum.valueOf(EnumC1856b.class, str);
    }

    public static EnumC1856b[] values() {
        return (EnumC1856b[]) f16631f.clone();
    }
}
