package w6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w6.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1712D {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1712D f15788d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1712D f15789e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1712D[] f15790f;

    /* JADX WARN: Type inference failed for: r0v0, types: [w6.D, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w6.D, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DECLARED", 0);
        f15788d = r02;
        ?? r12 = new Enum("INHERITED", 1);
        f15789e = r12;
        f15790f = new EnumC1712D[]{r02, r12};
    }

    public static EnumC1712D valueOf(String str) {
        return (EnumC1712D) Enum.valueOf(EnumC1712D.class, str);
    }

    public static EnumC1712D[] values() {
        return (EnumC1712D[]) f15790f.clone();
    }
}
