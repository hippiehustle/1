package T1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class C {

    /* renamed from: d, reason: collision with root package name */
    public static final C f5507d;

    /* renamed from: e, reason: collision with root package name */
    public static final C f5508e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C[] f5509f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, T1.C] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, T1.C] */
    static {
        ?? r02 = new Enum("IMAGE_EVENT", 0);
        f5507d = r02;
        ?? r12 = new Enum("TRIGGER_EVENT", 1);
        f5508e = r12;
        f5509f = new C[]{r02, r12};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f5509f.clone();
    }
}
