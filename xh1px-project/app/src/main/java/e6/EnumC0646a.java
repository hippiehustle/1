package e6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0646a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0646a f10656d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0646a f10657e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0646a f10658f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0646a[] f10659g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e6.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e6.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e6.a] */
    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f10656d = r02;
        ?? r12 = new Enum("UNDECIDED", 1);
        f10657e = r12;
        ?? r22 = new Enum("RESUMED", 2);
        f10658f = r22;
        f10659g = new EnumC0646a[]{r02, r12, r22};
    }

    public static EnumC0646a valueOf(String str) {
        return (EnumC0646a) Enum.valueOf(EnumC0646a.class, str);
    }

    public static EnumC0646a[] values() {
        return (EnumC0646a[]) f10659g.clone();
    }
}
