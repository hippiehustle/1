package J2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f2395d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f2396e;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, J2.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, J2.e] */
    static {
        ?? r02 = new Enum("WINDOW", 0);
        ?? r12 = new Enum("SCREEN", 1);
        f2395d = r12;
        f2396e = new e[]{r02, r12};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f2396e.clone();
    }
}
