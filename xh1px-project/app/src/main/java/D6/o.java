package D6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final o f1053d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f1054e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f1055f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ o[] f1056g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, D6.o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, D6.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, D6.o] */
    static {
        ?? r02 = new Enum("RUNTIME", 0);
        f1053d = r02;
        ?? r12 = new Enum("BINARY", 1);
        f1054e = r12;
        ?? r22 = new Enum("SOURCE", 2);
        f1055f = r22;
        f1056g = new o[]{r02, r12, r22};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f1056g.clone();
    }
}
