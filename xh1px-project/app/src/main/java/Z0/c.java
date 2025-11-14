package Z0;

import android.util.Log;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f7255a = new Object();

    public static void a() {
        f7255a.getClass();
    }

    public static void b(String str) {
        f7255a.getClass();
        HashSet hashSet = b.f7254a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        f7255a.getClass();
        HashSet hashSet = b.f7254a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
