package L6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class T {

    /* renamed from: d, reason: collision with root package name */
    public static final T f3082d;

    /* renamed from: e, reason: collision with root package name */
    public static final T f3083e;

    /* renamed from: f, reason: collision with root package name */
    public static final T f3084f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ T[] f3085g;

    /* JADX WARN: Type inference failed for: r0v0, types: [L6.T, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [L6.T, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [L6.T, java.lang.Enum] */
    static {
        ?? r02 = new Enum("RETURNS_CONSTANT", 0);
        f3082d = r02;
        ?? r12 = new Enum("CALLS", 1);
        f3083e = r12;
        ?? r22 = new Enum("RETURNS_NOT_NULL", 2);
        f3084f = r22;
        f3085g = new T[]{r02, r12, r22};
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) f3085g.clone();
    }
}
