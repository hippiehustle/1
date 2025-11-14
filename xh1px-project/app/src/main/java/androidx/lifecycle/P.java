package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/P;", "Landroid/app/Fragment;", "<init>", "()V", "androidx/lifecycle/d0", "a", "androidx/lifecycle/N", "lifecycle-runtime_release"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class P extends Fragment {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8802e = 0;

    /* renamed from: d, reason: collision with root package name */
    public d0 f8803d;

    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final O Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            o6.j.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            o6.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            o6.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            o6.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            o6.j.e(activity, "activity");
            int i4 = P.f8802e;
            N.a(activity, EnumC0503n.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            o6.j.e(activity, "activity");
            int i4 = P.f8802e;
            N.a(activity, EnumC0503n.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            o6.j.e(activity, "activity");
            int i4 = P.f8802e;
            N.a(activity, EnumC0503n.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            o6.j.e(activity, "activity");
            int i4 = P.f8802e;
            N.a(activity, EnumC0503n.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            o6.j.e(activity, "activity");
            int i4 = P.f8802e;
            N.a(activity, EnumC0503n.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            o6.j.e(activity, "activity");
            int i4 = P.f8802e;
            N.a(activity, EnumC0503n.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            o6.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            o6.j.e(activity, "activity");
            o6.j.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            o6.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            o6.j.e(activity, "activity");
        }
    }

    public final void a(EnumC0503n enumC0503n) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            o6.j.d(activity, "getActivity(...)");
            N.a(activity, enumC0503n);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0503n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0503n.ON_DESTROY);
        this.f8803d = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0503n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        d0 d0Var = this.f8803d;
        if (d0Var != null) {
            ((H) d0Var.f8837a).a();
        }
        a(EnumC0503n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        d0 d0Var = this.f8803d;
        if (d0Var != null) {
            H h8 = (H) d0Var.f8837a;
            int i4 = h8.f8777d + 1;
            h8.f8777d = i4;
            if (i4 == 1 && h8.f8780g) {
                h8.f8782i.d(EnumC0503n.ON_START);
                h8.f8780g = false;
            }
        }
        a(EnumC0503n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0503n.ON_STOP);
    }
}
