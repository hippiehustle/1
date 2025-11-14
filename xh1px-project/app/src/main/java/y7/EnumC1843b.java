package y7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1843b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1843b[] f16515d = {new Enum("ERROR_CLASS", 0), new Enum("ERROR_FUNCTION", 1), new Enum("ERROR_SCOPE", 2), new Enum("ERROR_MODULE", 3), new Enum("ERROR_PROPERTY", 4), new Enum("ERROR_TYPE", 5), new Enum("PARENT_OF_ERROR_SCOPE", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1843b EF5;

    public static EnumC1843b valueOf(String str) {
        return (EnumC1843b) Enum.valueOf(EnumC1843b.class, str);
    }

    public static EnumC1843b[] values() {
        return (EnumC1843b[]) f16515d.clone();
    }
}
