package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class G extends AbstractC0497h {
    final /* synthetic */ H this$0;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC0497h {
        final /* synthetic */ H this$0;

        public a(H h8) {
            this.this$0 = h8;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            o6.j.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            o6.j.e(activity, "activity");
            H h8 = this.this$0;
            int i4 = h8.f8777d + 1;
            h8.f8777d = i4;
            if (i4 == 1 && h8.f8780g) {
                h8.f8782i.d(EnumC0503n.ON_START);
                h8.f8780g = false;
            }
        }
    }

    public G(H h8) {
        this.this$0 = h8;
    }

    @Override // androidx.lifecycle.AbstractC0497h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o6.j.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i4 = P.f8802e;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            o6.j.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((P) findFragmentByTag).f8803d = this.this$0.k;
        }
    }

    @Override // androidx.lifecycle.AbstractC0497h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        o6.j.e(activity, "activity");
        H h8 = this.this$0;
        int i4 = h8.f8778e - 1;
        h8.f8778e = i4;
        if (i4 == 0) {
            Handler handler = h8.f8781h;
            o6.j.b(handler);
            handler.postDelayed(h8.j, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        o6.j.e(activity, "activity");
        F.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0497h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        o6.j.e(activity, "activity");
        H h8 = this.this$0;
        int i4 = h8.f8777d - 1;
        h8.f8777d = i4;
        if (i4 == 0 && h8.f8779f) {
            h8.f8782i.d(EnumC0503n.ON_STOP);
            h8.f8780g = true;
        }
    }
}
