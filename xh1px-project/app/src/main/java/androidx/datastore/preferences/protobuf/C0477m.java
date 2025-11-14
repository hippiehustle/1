package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477m {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0477m f8711a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0477m f8712b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.m, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        f8712b = obj;
    }

    public static C0477m a() {
        C0477m c0477m;
        O o7 = O.f8627c;
        C0477m c0477m2 = f8711a;
        if (c0477m2 == null) {
            synchronized (C0477m.class) {
                try {
                    c0477m = f8711a;
                    if (c0477m == null) {
                        Class cls = AbstractC0476l.f8710a;
                        C0477m c0477m3 = null;
                        if (cls != null) {
                            try {
                                c0477m3 = (C0477m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0477m3 != null) {
                            c0477m = c0477m3;
                        } else {
                            c0477m = f8712b;
                        }
                        f8711a = c0477m;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0477m;
        }
        return c0477m2;
    }
}
