package T1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final s f5636d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f5637e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f5638f;

    /* renamed from: g, reason: collision with root package name */
    public static final s f5639g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ s[] f5640h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, T1.s] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, T1.s] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, T1.s] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, T1.s] */
    static {
        ?? r02 = new Enum("ON_BROADCAST_RECEIVED", 0);
        f5636d = r02;
        ?? r12 = new Enum("ON_COUNTER_REACHED", 1);
        f5637e = r12;
        ?? r22 = new Enum("ON_IMAGE_DETECTED", 2);
        f5638f = r22;
        ?? r32 = new Enum("ON_TIMER_REACHED", 3);
        f5639g = r32;
        f5640h = new s[]{r02, r12, r22, r32};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f5640h.clone();
    }
}
