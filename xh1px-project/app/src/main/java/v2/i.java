package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f15510d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f15511e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f15512f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f15513g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i[] f15514h;

    /* JADX WARN: Type inference failed for: r0v0, types: [v2.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v2.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [v2.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [v2.i, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INACTIVE", 0);
        f15510d = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f15511e = r12;
        ?? r22 = new Enum("DETECTING", 2);
        f15512f = r22;
        ?? r32 = new Enum("ERROR_NO_NATIVE_LIB", 3);
        f15513g = r32;
        f15514h = new i[]{r02, r12, r22, r32};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f15514h.clone();
    }
}
