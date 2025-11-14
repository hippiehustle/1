package f2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final l f10737d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f10738e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f10739f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l[] f10740g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f2.l] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f2.l] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, f2.l] */
    static {
        ?? r02 = new Enum("BACK", 0);
        f10737d = r02;
        ?? r12 = new Enum("HOME", 1);
        f10738e = r12;
        ?? r22 = new Enum("RECENT_APPS", 2);
        f10739f = r22;
        f10740g = new l[]{r02, r12, r22};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f10740g.clone();
    }
}
