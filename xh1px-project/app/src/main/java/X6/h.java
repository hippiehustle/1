package X6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f7004d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f7005e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f7006f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h[] f7007g;

    /* JADX WARN: Type inference failed for: r0v0, types: [X6.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X6.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X6.h, java.lang.Enum] */
    static {
        ?? r02 = new Enum("FORCE_FLEXIBILITY", 0);
        f7004d = r02;
        ?? r12 = new Enum("NULLABLE", 1);
        f7005e = r12;
        ?? r22 = new Enum("NOT_NULL", 2);
        f7006f = r22;
        f7007g = new h[]{r02, r12, r22};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f7007g.clone();
    }
}
