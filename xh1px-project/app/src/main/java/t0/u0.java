package t0;

import P.C0254b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class u0 extends C0254b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f15001d;

    /* renamed from: e, reason: collision with root package name */
    public final t0 f15002e;

    public u0(RecyclerView recyclerView) {
        this.f15001d = recyclerView;
        t0 t0Var = this.f15002e;
        if (t0Var != null) {
            this.f15002e = t0Var;
        } else {
            this.f15002e = new t0(this);
        }
    }

    @Override // P.C0254b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f15001d.Q()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().Y(accessibilityEvent);
            }
        }
    }

    @Override // P.C0254b
    public final void d(View view, Q.g gVar) {
        this.f4246a.onInitializeAccessibilityNodeInfo(view, gVar.f4709a);
        RecyclerView recyclerView = this.f15001d;
        if (!recyclerView.Q() && recyclerView.getLayoutManager() != null) {
            AbstractC1537c0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f14811b;
            layoutManager.Z(recyclerView2.f8943f, recyclerView2.f8951k0, gVar);
        }
    }

    @Override // P.C0254b
    public final boolean g(View view, int i4, Bundle bundle) {
        if (super.g(view, i4, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f15001d;
        if (!recyclerView.Q() && recyclerView.getLayoutManager() != null) {
            return recyclerView.getLayoutManager().m0(i4, bundle);
        }
        return false;
    }
}
