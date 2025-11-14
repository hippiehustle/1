package x6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1797a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1797a f16240d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1797a f16241e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1797a[] f16242f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x6.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x6.a] */
    static {
        ?? r02 = new Enum("CALL_BY_NAME", 0);
        f16240d = r02;
        ?? r12 = new Enum("POSITIONAL_CALL", 1);
        f16241e = r12;
        f16242f = new EnumC1797a[]{r02, r12};
    }

    public static EnumC1797a valueOf(String str) {
        return (EnumC1797a) Enum.valueOf(EnumC1797a.class, str);
    }

    public static EnumC1797a[] values() {
        return (EnumC1797a[]) f16242f.clone();
    }
}
