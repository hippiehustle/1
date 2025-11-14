package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0504o {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0504o f8846d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0504o f8847e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0504o f8848f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0504o f8849g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0504o f8850h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0504o[] f8851i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    static {
        ?? r02 = new Enum("DESTROYED", 0);
        f8846d = r02;
        ?? r12 = new Enum("INITIALIZED", 1);
        f8847e = r12;
        ?? r22 = new Enum("CREATED", 2);
        f8848f = r22;
        ?? r32 = new Enum("STARTED", 3);
        f8849g = r32;
        ?? r42 = new Enum("RESUMED", 4);
        f8850h = r42;
        f8851i = new EnumC0504o[]{r02, r12, r22, r32, r42};
    }

    public static EnumC0504o valueOf(String str) {
        return (EnumC0504o) Enum.valueOf(EnumC0504o.class, str);
    }

    public static EnumC0504o[] values() {
        return (EnumC0504o[]) f8851i.clone();
    }
}
