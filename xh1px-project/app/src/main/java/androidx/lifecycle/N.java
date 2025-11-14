package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.P;

/* loaded from: classes.dex */
public abstract class N {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0503n enumC0503n) {
        o6.j.e(enumC0503n, "event");
        if (activity instanceof InterfaceC0510v) {
            C0512x g8 = ((InterfaceC0510v) activity).g();
            if (g8 instanceof C0512x) {
                g8.d(enumC0503n);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            P.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new P.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new P(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
