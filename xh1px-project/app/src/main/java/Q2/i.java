package Q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f4802d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f4803e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f4804f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ i[] f4805g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Q2.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Q2.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Q2.i] */
    static {
        ?? r02 = new Enum("AREA", 0);
        f4802d = r02;
        ?? r12 = new Enum("EXACT", 1);
        f4803e = r12;
        ?? r22 = new Enum("WHOLE_SCREEN", 2);
        f4804f = r22;
        f4805g = new i[]{r02, r12, r22};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f4805g.clone();
    }
}
