package n;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import m.InterfaceC1038a;

/* loaded from: classes.dex */
public final class q extends FrameLayout implements InterfaceC1038a {

    /* renamed from: d, reason: collision with root package name */
    public final CollapsibleActionView f12695d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f12695d = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // m.InterfaceC1038a
    public final void onActionViewCollapsed() {
        this.f12695d.onActionViewCollapsed();
    }

    @Override // m.InterfaceC1038a
    public final void onActionViewExpanded() {
        this.f12695d.onActionViewExpanded();
    }
}
