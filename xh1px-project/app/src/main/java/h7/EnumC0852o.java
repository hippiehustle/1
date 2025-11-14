package h7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h7.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0852o {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0852o f11518d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0852o f11519e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0852o[] f11520f;

    /* JADX WARN: Type inference failed for: r0v0, types: [h7.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h7.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h7.o, java.lang.Enum] */
    static {
        ?? r02 = new Enum("RENDER_OVERRIDE", 0);
        f11518d = r02;
        ?? r12 = new Enum("RENDER_OPEN", 1);
        f11519e = r12;
        f11520f = new EnumC0852o[]{r02, r12, new Enum("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static EnumC0852o valueOf(String str) {
        return (EnumC0852o) Enum.valueOf(EnumC0852o.class, str);
    }

    public static EnumC0852o[] values() {
        return (EnumC0852o[]) f11520f.clone();
    }
}
