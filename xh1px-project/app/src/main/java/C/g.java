package C;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import w5.j;

/* loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f547e;

    public /* synthetic */ g(int i4, Object obj) {
        this.f546d = i4;
        this.f547e = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f546d) {
            case 0:
                ((CoordinatorLayout) this.f547e).q(0);
                return true;
            default:
                j jVar = (j) this.f547e;
                float rotation = jVar.f15776s.getRotation();
                if (jVar.f15772o != rotation) {
                    jVar.f15772o = rotation;
                    jVar.p();
                    return true;
                }
                return true;
        }
    }
}
