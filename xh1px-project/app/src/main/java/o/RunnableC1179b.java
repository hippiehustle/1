package o;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1179b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f13233e;

    public /* synthetic */ RunnableC1179b(ActionBarOverlayLayout actionBarOverlayLayout, int i4) {
        this.f13232d = i4;
        this.f13233e = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13232d) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13233e;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f8389z = actionBarOverlayLayout.f8372g.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f8364A);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13233e;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f8389z = actionBarOverlayLayout2.f8372g.animate().translationY(-actionBarOverlayLayout2.f8372g.getHeight()).setListener(actionBarOverlayLayout2.f8364A);
                return;
        }
    }
}
