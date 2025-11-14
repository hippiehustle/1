package M7;

import Z5.k;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import o6.j;

/* loaded from: classes.dex */
public abstract class f {
    private static volatile Choreographer choreographer;

    static {
        Object b4;
        try {
            b4 = new e(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            b4 = Z5.a.b(th);
        }
        if (b4 instanceof k) {
            b4 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            j.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
