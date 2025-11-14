package F3;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.p1;

/* loaded from: classes.dex */
public final class e implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1329d;

    /* renamed from: e, reason: collision with root package name */
    public final CoordinatorLayout f1330e;

    /* renamed from: f, reason: collision with root package name */
    public final p1 f1331f;

    public /* synthetic */ e(CoordinatorLayout coordinatorLayout, p1 p1Var, M0.a aVar, int i4) {
        this.f1329d = i4;
        this.f1330e = coordinatorLayout;
        this.f1331f = p1Var;
    }

    @Override // M0.a
    public final View getRoot() {
        switch (this.f1329d) {
            case 0:
                return this.f1330e;
            default:
                return this.f1330e;
        }
    }
}
