package x6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1798b {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1798b f16243d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1798b f16244e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1798b[] f16245f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x6.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x6.b] */
    static {
        ?? r02 = new Enum("JAVA", 0);
        f16243d = r02;
        ?? r12 = new Enum("KOTLIN", 1);
        f16244e = r12;
        f16245f = new EnumC1798b[]{r02, r12};
    }

    public static EnumC1798b valueOf(String str) {
        return (EnumC1798b) Enum.valueOf(EnumC1798b.class, str);
    }

    public static EnumC1798b[] values() {
        return (EnumC1798b[]) f16245f.clone();
    }
}
