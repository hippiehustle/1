package P6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class C {

    /* renamed from: d, reason: collision with root package name */
    public static final C f4524d;

    /* renamed from: e, reason: collision with root package name */
    public static final C f4525e;

    /* renamed from: f, reason: collision with root package name */
    public static final C f4526f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C[] f4527g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, P6.C] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, P6.C] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, P6.C] */
    static {
        ?? r02 = new Enum("ONE_COLLECTION_PARAMETER", 0);
        f4524d = r02;
        ?? r12 = new Enum("OBJECT_PARAMETER_NON_GENERIC", 1);
        f4525e = r12;
        ?? r22 = new Enum("OBJECT_PARAMETER_GENERIC", 2);
        f4526f = r22;
        f4527g = new C[]{r02, r12, r22};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f4527g.clone();
    }
}
