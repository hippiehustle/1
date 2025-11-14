package T7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f5932d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f5933e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f5934f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f5935g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i[] f5936h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, T7.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, T7.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, T7.i] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, T7.i] */
    static {
        ?? r02 = new Enum("SUCCESSFUL", 0);
        f5932d = r02;
        ?? r12 = new Enum("REREGISTER", 1);
        f5933e = r12;
        ?? r22 = new Enum("CANCELLED", 2);
        f5934f = r22;
        ?? r32 = new Enum("ALREADY_SELECTED", 3);
        f5935g = r32;
        f5936h = new i[]{r02, r12, r22, r32};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f5936h.clone();
    }
}
