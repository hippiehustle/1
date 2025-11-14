package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final f f1267d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f1268e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f1269f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f1270g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f1271h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ f[] f1272i;

    /* JADX WARN: Type inference failed for: r0v0, types: [F0.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [F0.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [F0.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [F0.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [F0.f, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ON_CONFIGURE", 0);
        f1267d = r02;
        ?? r12 = new Enum("ON_CREATE", 1);
        f1268e = r12;
        ?? r22 = new Enum("ON_UPGRADE", 2);
        f1269f = r22;
        ?? r32 = new Enum("ON_DOWNGRADE", 3);
        f1270g = r32;
        ?? r42 = new Enum("ON_OPEN", 4);
        f1271h = r42;
        f1272i = new f[]{r02, r12, r22, r32, r42};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f1272i.clone();
    }
}
