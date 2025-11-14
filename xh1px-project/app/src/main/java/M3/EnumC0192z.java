package M3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: M3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0192z {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0192z f3478d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0192z f3479e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0192z f3480f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0192z[] f3481g;

    /* JADX WARN: Type inference failed for: r0v0, types: [M3.z, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [M3.z, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [M3.z, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INITIAL", 0);
        f3478d = r02;
        ?? r12 = new Enum("TEXT_INPUT", 1);
        f3479e = r12;
        ?? r22 = new Enum("VIEW", 2);
        f3480f = r22;
        f3481g = new EnumC0192z[]{r02, r12, r22};
    }

    public static EnumC0192z valueOf(String str) {
        return (EnumC0192z) Enum.valueOf(EnumC0192z.class, str);
    }

    public static EnumC0192z[] values() {
        return (EnumC0192z[]) f3481g.clone();
    }
}
