package Q7;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final M7.e f4962a;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, M7.a] */
    static {
        String str;
        int i4 = u.f4970a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = H7.m.Y(H7.m.P(Arrays.asList(new Object()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((M7.a) obj).getClass();
                    do {
                        ((M7.a) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((M7.a) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    f4962a = new M7.e(M7.f.a(mainLooper), false);
                    return;
                }
                throw new IllegalStateException("The main looper is not available");
            }
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
