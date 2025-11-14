package Z5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f7482d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f7483e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h[] f7484f;

    /* JADX INFO: Fake field, exist only in values array */
    h EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Z5.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Z5.h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Z5.h] */
    static {
        ?? r02 = new Enum("SYNCHRONIZED", 0);
        ?? r12 = new Enum("PUBLICATION", 1);
        f7482d = r12;
        ?? r22 = new Enum("NONE", 2);
        f7483e = r22;
        f7484f = new h[]{r02, r12, r22};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f7484f.clone();
    }
}
