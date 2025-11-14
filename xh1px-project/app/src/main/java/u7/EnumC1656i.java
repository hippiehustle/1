package u7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1656i {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1656i f15415d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1656i f15416e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1656i[] f15417f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u7.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u7.i] */
    static {
        ?? r02 = new Enum("STABLE", 0);
        f15415d = r02;
        ?? r12 = new Enum("UNSTABLE", 1);
        f15416e = r12;
        f15417f = new EnumC1656i[]{r02, r12};
    }

    public static EnumC1656i valueOf(String str) {
        return (EnumC1656i) Enum.valueOf(EnumC1656i.class, str);
    }

    public static EnumC1656i[] values() {
        return (EnumC1656i[]) f15417f.clone();
    }
}
