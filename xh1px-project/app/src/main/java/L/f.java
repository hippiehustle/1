package L;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2745a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f2746b;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f2745a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f2746b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e9) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e9);
            }
        }
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return H.a.a();
        }
        try {
            return ((Boolean) f2746b.invoke(null, Long.valueOf(f2745a))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
