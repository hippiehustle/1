package h7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h7.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class EnumC0857t {

    /* renamed from: d, reason: collision with root package name */
    public static final C0856s f11528d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0855r f11529e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0857t[] f11530f;

    static {
        C0856s c0856s = new C0856s();
        f11528d = c0856s;
        C0855r c0855r = new C0855r();
        f11529e = c0855r;
        f11530f = new EnumC0857t[]{c0856s, c0855r};
    }

    public static EnumC0857t valueOf(String str) {
        return (EnumC0857t) Enum.valueOf(EnumC0857t.class, str);
    }

    public static EnumC0857t[] values() {
        return (EnumC0857t[]) f11530f.clone();
    }

    public abstract String a(String str);
}
