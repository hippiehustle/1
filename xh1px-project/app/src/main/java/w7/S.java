package w7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class S {

    /* renamed from: d, reason: collision with root package name */
    public static final S f15973d;

    /* renamed from: e, reason: collision with root package name */
    public static final S f15974e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ S[] f15975f;

    /* JADX WARN: Type inference failed for: r0v0, types: [w7.S, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w7.S, java.lang.Enum] */
    static {
        ?? r02 = new Enum("SUPERTYPE", 0);
        f15973d = r02;
        ?? r12 = new Enum("COMMON", 1);
        f15974e = r12;
        f15975f = new S[]{r02, r12};
    }

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) f15975f.clone();
    }
}
