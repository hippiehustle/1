package v7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final j f15555d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f15556e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f15557f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ j[] f15558g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v7.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v7.j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, v7.j] */
    static {
        ?? r02 = new Enum("NOT_COMPUTED", 0);
        f15555d = r02;
        ?? r12 = new Enum("COMPUTING", 1);
        f15556e = r12;
        ?? r22 = new Enum("RECURSION_WAS_DETECTED", 2);
        f15557f = r22;
        f15558g = new j[]{r02, r12, r22};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f15558g.clone();
    }
}
