package z3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1855a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1855a f16626d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1855a f16627e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1855a[] f16628f;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1855a EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z3.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z3.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, z3.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, z3.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, z3.a] */
    static {
        ?? r02 = new Enum("EXEMPTED", 0);
        ?? r12 = new Enum("AD_REQUESTED", 1);
        f16626d = r12;
        ?? r22 = new Enum("AD_WATCHED", 2);
        ?? r32 = new Enum("PURCHASED", 3);
        f16627e = r32;
        f16628f = new EnumC1855a[]{r02, r12, r22, r32, new Enum("TRIAL", 4)};
    }

    public static EnumC1855a valueOf(String str) {
        return (EnumC1855a) Enum.valueOf(EnumC1855a.class, str);
    }

    public static EnumC1855a[] values() {
        return (EnumC1855a[]) f16628f.clone();
    }
}
