package l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1036a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1036a f12313d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1036a[] f12314e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1036a EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l7.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l7.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l7.a] */
    static {
        ?? r02 = new Enum("WARNING", 0);
        ?? r12 = new Enum("ERROR", 1);
        f12313d = r12;
        f12314e = new EnumC1036a[]{r02, r12, new Enum("HIDDEN", 2)};
    }

    public static EnumC1036a valueOf(String str) {
        return (EnumC1036a) Enum.valueOf(EnumC1036a.class, str);
    }

    public static EnumC1036a[] values() {
        return (EnumC1036a[]) f12314e.clone();
    }
}
