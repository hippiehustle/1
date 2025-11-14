package g0;

import android.view.View;
import u6.AbstractC1638C;

/* renamed from: g0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0751u extends AbstractC1638C {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0755y f11069i;

    public C0751u(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        this.f11069i = abstractComponentCallbacksC0755y;
    }

    @Override // u6.AbstractC1638C
    public final View E(int i4) {
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f11069i;
        View view = abstractComponentCallbacksC0755y.K;
        if (view != null) {
            return view.findViewById(i4);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0755y + " does not have a view");
    }

    @Override // u6.AbstractC1638C
    public final boolean F() {
        if (this.f11069i.K != null) {
            return true;
        }
        return false;
    }
}
