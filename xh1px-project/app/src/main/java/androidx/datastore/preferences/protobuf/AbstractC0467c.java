package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0467c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f8663a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f8664b;

    static {
        Class<?> cls;
        boolean z8;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f8663a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        f8664b = z8;
    }

    public static boolean a() {
        if (f8663a != null && !f8664b) {
            return true;
        }
        return false;
    }
}
