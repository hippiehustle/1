package androidx.lifecycle;

import android.app.Activity;
import androidx.lifecycle.G;

/* loaded from: classes.dex */
public abstract class F {
    public static final void a(Activity activity, G.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }
}
