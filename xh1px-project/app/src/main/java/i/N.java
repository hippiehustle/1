package i;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class N extends E2.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11628f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P f11629g;

    public /* synthetic */ N(P p8, int i4) {
        this.f11628f = i4;
        this.f11629g = p8;
    }

    @Override // P.V
    public final void c() {
        View view;
        int i4 = this.f11628f;
        P p8 = this.f11629g;
        switch (i4) {
            case 0:
                if (p8.f11647p && (view = p8.f11641h) != null) {
                    view.setTranslationY(0.0f);
                    p8.f11638e.setTranslationY(0.0f);
                }
                p8.f11638e.setVisibility(8);
                p8.f11638e.setTransitioning(false);
                p8.f11651t = null;
                R3.r rVar = p8.f11643l;
                if (rVar != null) {
                    rVar.W(p8.k);
                    p8.k = null;
                    p8.f11643l = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = p8.f11637d;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = P.O.f4214a;
                    P.D.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                p8.f11651t = null;
                p8.f11638e.requestLayout();
                return;
        }
    }
}
