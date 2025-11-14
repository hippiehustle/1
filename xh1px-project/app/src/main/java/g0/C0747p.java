package g0;

import android.view.View;
import androidx.lifecycle.InterfaceC0510v;
import java.util.Objects;

/* renamed from: g0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0747p implements androidx.lifecycle.D {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f11050d;

    public C0747p(r rVar) {
        this.f11050d = rVar;
    }

    @Override // androidx.lifecycle.D
    public final void b(Object obj) {
        if (((InterfaceC0510v) obj) != null) {
            r rVar = this.f11050d;
            if (rVar.j0) {
                View P4 = rVar.P();
                if (P4.getParent() == null) {
                    if (rVar.f11062n0 != null) {
                        if (T.K(3)) {
                            Objects.toString(rVar.f11062n0);
                        }
                        rVar.f11062n0.setContentView(P4);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
