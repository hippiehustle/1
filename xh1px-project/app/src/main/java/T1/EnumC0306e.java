package T1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: T1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0306e {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0306e f5590d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0306e f5591e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0306e f5592f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0306e[] f5593g;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T1.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T1.e, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ADD", 0);
        f5590d = r02;
        ?? r12 = new Enum("MINUS", 1);
        f5591e = r12;
        ?? r22 = new Enum("SET", 2);
        f5592f = r22;
        f5593g = new EnumC0306e[]{r02, r12, r22};
    }

    public static EnumC0306e valueOf(String str) {
        return (EnumC0306e) Enum.valueOf(EnumC0306e.class, str);
    }

    public static EnumC0306e[] values() {
        return (EnumC0306e[]) f5593g.clone();
    }
}
