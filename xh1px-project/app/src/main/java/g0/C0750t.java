package g0;

import android.os.Bundle;

/* renamed from: g0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0750t extends AbstractC0754x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0755y f11068a;

    public C0750t(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        this.f11068a = abstractComponentCallbacksC0755y;
    }

    @Override // g0.AbstractC0754x
    public final void a() {
        Bundle bundle;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f11068a;
        abstractComponentCallbacksC0755y.f11107X.h();
        androidx.lifecycle.U.d(abstractComponentCallbacksC0755y);
        Bundle bundle2 = abstractComponentCallbacksC0755y.f11111e;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("registryState");
        } else {
            bundle = null;
        }
        abstractComponentCallbacksC0755y.f11107X.i(bundle);
    }
}
