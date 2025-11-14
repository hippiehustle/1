package f6;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: f6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716f {

    /* renamed from: a, reason: collision with root package name */
    public Method f10784a;

    /* renamed from: b, reason: collision with root package name */
    public Method f10785b;

    /* renamed from: c, reason: collision with root package name */
    public Method f10786c;

    public C0716f(Method method, Method method2, Method method3) {
        this.f10784a = method;
        this.f10785b = method2;
        this.f10786c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
        } else {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
