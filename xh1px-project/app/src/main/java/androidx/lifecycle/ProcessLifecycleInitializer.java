package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LH0/b;", "Landroidx/lifecycle/v;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements H0.b {
    @Override // H0.b
    public final List a() {
        return a6.s.f7766d;
    }

    @Override // H0.b
    public final Object b(Context context) {
        o6.j.e(context, "context");
        H0.a c6 = H0.a.c(context);
        o6.j.d(c6, "getInstance(...)");
        if (c6.f1874b.contains(ProcessLifecycleInitializer.class)) {
            if (!AbstractC0507s.f8856a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                o6.j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
            }
            H h8 = H.f8776l;
            h8.getClass();
            h8.f8781h = new Handler();
            h8.f8782i.d(EnumC0503n.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            o6.j.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new G(h8));
            return h8;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
