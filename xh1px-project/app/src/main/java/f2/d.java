package f2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f10687d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f10688e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d[] f10689f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f2.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f2.d] */
    static {
        ?? r02 = new Enum("USER_SELECTED", 0);
        f10687d = r02;
        ?? r12 = new Enum("ON_DETECTED_CONDITION", 1);
        f10688e = r12;
        f10689f = new d[]{r02, r12};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f10689f.clone();
    }
}
