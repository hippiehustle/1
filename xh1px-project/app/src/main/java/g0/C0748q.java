package g0;

import android.app.Dialog;
import android.view.View;
import u6.AbstractC1638C;

/* renamed from: g0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748q extends AbstractC1638C {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0751u f11051i;
    public final /* synthetic */ r j;

    public C0748q(r rVar, C0751u c0751u) {
        this.j = rVar;
        this.f11051i = c0751u;
    }

    @Override // u6.AbstractC1638C
    public final View E(int i4) {
        C0751u c0751u = this.f11051i;
        if (c0751u.F()) {
            return c0751u.E(i4);
        }
        Dialog dialog = this.j.f11062n0;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    @Override // u6.AbstractC1638C
    public final boolean F() {
        if (!this.f11051i.F() && !this.j.f11066r0) {
            return false;
        }
        return true;
    }
}
