package N4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f3771d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f3772e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d[] f3773f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, N4.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, N4.d] */
    static {
        ?? r02 = new Enum("BLUE", 0);
        f3771d = r02;
        ?? r12 = new Enum("RED", 1);
        f3772e = r12;
        f3773f = new d[]{r02, r12};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3773f.clone();
    }
}
