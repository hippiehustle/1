package T1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: T1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0307f {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0307f f5594d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0307f f5595e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0307f[] f5596f;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T1.f, java.lang.Enum] */
    static {
        ?? r02 = new Enum("USER_SELECTED", 0);
        f5594d = r02;
        ?? r12 = new Enum("ON_DETECTED_CONDITION", 1);
        f5595e = r12;
        f5596f = new EnumC0307f[]{r02, r12};
    }

    public static EnumC0307f valueOf(String str) {
        return (EnumC0307f) Enum.valueOf(EnumC0307f.class, str);
    }

    public static EnumC0307f[] values() {
        return (EnumC0307f[]) f5596f.clone();
    }
}
