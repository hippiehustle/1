package T1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class G {

    /* renamed from: d, reason: collision with root package name */
    public static final G f5517d;

    /* renamed from: e, reason: collision with root package name */
    public static final G f5518e;

    /* renamed from: f, reason: collision with root package name */
    public static final G f5519f;

    /* renamed from: g, reason: collision with root package name */
    public static final G f5520g;

    /* renamed from: h, reason: collision with root package name */
    public static final G f5521h;

    /* renamed from: i, reason: collision with root package name */
    public static final G f5522i;
    public static final G j;
    public static final G k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ G[] f5523l;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T1.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T1.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T1.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T1.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T1.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T1.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T1.G, java.lang.Enum] */
    static {
        ?? r02 = new Enum("BOOLEAN", 0);
        f5517d = r02;
        ?? r12 = new Enum("BYTE", 1);
        f5518e = r12;
        ?? r22 = new Enum("CHAR", 2);
        f5519f = r22;
        ?? r32 = new Enum("DOUBLE", 3);
        f5520g = r32;
        ?? r42 = new Enum("INTEGER", 4);
        f5521h = r42;
        ?? r52 = new Enum("FLOAT", 5);
        f5522i = r52;
        ?? r62 = new Enum("SHORT", 6);
        j = r62;
        ?? r72 = new Enum("STRING", 7);
        k = r72;
        f5523l = new G[]{r02, r12, r22, r32, r42, r52, r62, r72};
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) f5523l.clone();
    }
}
