package h7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h7.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0853p {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0853p f11521d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0853p f11522e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0853p f11523f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0853p[] f11524g;

    /* JADX WARN: Type inference failed for: r0v0, types: [h7.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h7.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h7.p, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ALL", 0);
        f11521d = r02;
        ?? r12 = new Enum("ONLY_NON_SYNTHESIZED", 1);
        f11522e = r12;
        ?? r22 = new Enum("NONE", 2);
        f11523f = r22;
        f11524g = new EnumC0853p[]{r02, r12, r22};
    }

    public static EnumC0853p valueOf(String str) {
        return (EnumC0853p) Enum.valueOf(EnumC0853p.class, str);
    }

    public static EnumC0853p[] values() {
        return (EnumC0853p[]) f11524g.clone();
    }
}
