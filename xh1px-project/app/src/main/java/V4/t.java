package V4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final t f6422d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f6423e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ t[] f6424f;

    /* JADX WARN: Type inference failed for: r0v0, types: [V4.t, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [V4.t, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DUMB", 0);
        f6422d = r02;
        ?? r12 = new Enum("SMART", 1);
        f6423e = r12;
        f6424f = new t[]{r02, r12};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f6424f.clone();
    }
}
