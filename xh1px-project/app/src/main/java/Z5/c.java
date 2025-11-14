package Z5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final c f7475d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f7476e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f7477f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c[] f7478g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Z5.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Z5.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Z5.c] */
    static {
        ?? r02 = new Enum("WARNING", 0);
        f7475d = r02;
        ?? r12 = new Enum("ERROR", 1);
        f7476e = r12;
        ?? r22 = new Enum("HIDDEN", 2);
        f7477f = r22;
        f7478g = new c[]{r02, r12, r22};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f7478g.clone();
    }
}
