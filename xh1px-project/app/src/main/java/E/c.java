package E;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f1085a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f1086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1087c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1088d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1089e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1090f = false;

    public c(Activity activity) {
        this.f1086b = activity;
        this.f1087c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f1086b == activity) {
            this.f1086b = null;
            this.f1089e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f1089e && !this.f1090f && !this.f1088d) {
            Object obj = this.f1085a;
            try {
                Object obj2 = d.f1093c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f1087c) {
                    d.f1097g.postAtFrontOfQueue(new b(d.f1092b.get(activity), obj2, 2, false));
                    this.f1090f = true;
                    this.f1085a = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f1086b == activity) {
            this.f1088d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
