package o;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f13385a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f13386b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f13387c;

    static {
        boolean z8;
        if (Build.VERSION.SDK_INT >= 27) {
            z8 = true;
        } else {
            z8 = false;
        }
        f13387c = z8;
    }
}
