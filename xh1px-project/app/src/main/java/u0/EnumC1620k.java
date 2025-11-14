package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1620k {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1620k f15239d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1620k f15240e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1620k f15241f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC1620k[] f15242g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u0.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u0.k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u0.k] */
    static {
        ?? r02 = new Enum("NO_OP", 0);
        f15239d = r02;
        ?? r12 = new Enum("ADD", 1);
        f15240e = r12;
        ?? r22 = new Enum("REMOVE", 2);
        f15241f = r22;
        f15242g = new EnumC1620k[]{r02, r12, r22};
    }

    public static EnumC1620k valueOf(String str) {
        return (EnumC1620k) Enum.valueOf(EnumC1620k.class, str);
    }

    public static EnumC1620k[] values() {
        return (EnumC1620k[]) f15242g.clone();
    }
}
