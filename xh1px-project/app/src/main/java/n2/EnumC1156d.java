package n2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1156d {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1156d f12882d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1156d f12883e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1156d f12884f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC1156d[] f12885g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n2.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n2.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, n2.d] */
    static {
        ?? r02 = new Enum("CLICK", 0);
        f12882d = r02;
        ?? r12 = new Enum("SWIPE", 1);
        f12883e = r12;
        ?? r22 = new Enum("PAUSE", 2);
        f12884f = r22;
        f12885g = new EnumC1156d[]{r02, r12, r22};
    }

    public static EnumC1156d valueOf(String str) {
        return (EnumC1156d) Enum.valueOf(EnumC1156d.class, str);
    }

    public static EnumC1156d[] values() {
        return (EnumC1156d[]) f12885g.clone();
    }
}
