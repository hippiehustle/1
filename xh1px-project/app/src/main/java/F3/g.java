package F3;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import o.p1;

/* loaded from: classes.dex */
public final class g implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1343d;

    /* renamed from: e, reason: collision with root package name */
    public final CoordinatorLayout f1344e;

    /* renamed from: f, reason: collision with root package name */
    public final FloatingActionButton f1345f;

    /* renamed from: g, reason: collision with root package name */
    public final p1 f1346g;

    public /* synthetic */ g(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, p1 p1Var, A4.d dVar, int i4) {
        this.f1343d = i4;
        this.f1344e = coordinatorLayout;
        this.f1345f = floatingActionButton;
        this.f1346g = p1Var;
    }

    @Override // M0.a
    public final View getRoot() {
        switch (this.f1343d) {
            case 0:
                return this.f1344e;
            default:
                return this.f1344e;
        }
    }
}
