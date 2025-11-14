package l0;

import A.j;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import t7.C1594d;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0998b {

    /* renamed from: a, reason: collision with root package name */
    public final C1594d f12183a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12184b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f12185c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f12186d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                j.v(autoCloseable);
            } catch (Exception e9) {
                throw new RuntimeException(e9);
            }
        }
    }
}
