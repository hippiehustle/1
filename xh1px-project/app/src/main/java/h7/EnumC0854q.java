package h7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h7.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0854q {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0854q f11525d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0854q f11526e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0854q[] f11527f;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0854q EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [h7.q, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h7.q, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h7.q, java.lang.Enum] */
    static {
        ?? r02 = new Enum("PRETTY", 0);
        ?? r12 = new Enum("DEBUG", 1);
        f11525d = r12;
        ?? r22 = new Enum("NONE", 2);
        f11526e = r22;
        f11527f = new EnumC0854q[]{r02, r12, r22};
    }

    public static EnumC0854q valueOf(String str) {
        return (EnumC0854q) Enum.valueOf(EnumC0854q.class, str);
    }

    public static EnumC0854q[] values() {
        return (EnumC0854q[]) f11527f.clone();
    }
}
