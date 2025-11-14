package b5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f9202d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f9203e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f9204f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f9205g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i[] f9206h;

    /* JADX WARN: Type inference failed for: r0v0, types: [b5.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [b5.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [b5.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [b5.i, java.lang.Enum] */
    static {
        ?? r02 = new Enum("NOT_STARTED", 0);
        f9202d = r02;
        ?? r12 = new Enum("STARTED", 1);
        f9203e = r12;
        ?? r22 = new Enum("FINISHED", 2);
        f9204f = r22;
        ?? r32 = new Enum("FINISHED_WITH_ERROR", 3);
        f9205g = r32;
        f9206h = new i[]{r02, r12, r22, r32};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f9206h.clone();
    }
}
