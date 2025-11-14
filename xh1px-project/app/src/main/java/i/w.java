package i;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class w {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C) {
        Objects.requireNonNull(layoutInflaterFactory2C0860C);
        c.u uVar = new c.u(1, layoutInflaterFactory2C0860C);
        Q.e.h(obj).registerOnBackInvokedCallback(1000000, uVar);
        return uVar;
    }

    public static void c(Object obj, Object obj2) {
        Q.e.h(obj).unregisterOnBackInvokedCallback(Q.e.d(obj2));
    }
}
