package N0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: N0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0193a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0193a f3580d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0193a f3581e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0193a[] f3582f;

    /* JADX WARN: Type inference failed for: r0v0, types: [N0.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [N0.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [N0.a, java.lang.Enum] */
    static {
        ?? r02 = new Enum("AUTOMATIC", 0);
        f3580d = r02;
        ?? r12 = new Enum("ENABLED", 1);
        f3581e = r12;
        f3582f = new EnumC0193a[]{r02, r12, new Enum("DISABLED", 2)};
    }

    public static EnumC0193a valueOf(String str) {
        return (EnumC0193a) Enum.valueOf(EnumC0193a.class, str);
    }

    public static EnumC0193a[] values() {
        return (EnumC0193a[]) f3582f.clone();
    }
}
