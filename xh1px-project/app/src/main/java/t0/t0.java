package t0;

import P.C0254b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t0 extends C0254b {

    /* renamed from: d, reason: collision with root package name */
    public final u0 f14971d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f14972e = new WeakHashMap();

    public t0(u0 u0Var) {
        this.f14971d = u0Var;
    }

    @Override // P.C0254b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0254b c0254b = (C0254b) this.f14972e.get(view);
        if (c0254b != null) {
            return c0254b.a(view, accessibilityEvent);
        }
        return this.f4246a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // P.C0254b
    public final W0.d b(View view) {
        C0254b c0254b = (C0254b) this.f14972e.get(view);
        if (c0254b != null) {
            return c0254b.b(view);
        }
        return super.b(view);
    }

    @Override // P.C0254b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0254b c0254b = (C0254b) this.f14972e.get(view);
        if (c0254b != null) {
            c0254b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // P.C0254b
    public final void d(View view, Q.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4709a;
        u0 u0Var = this.f14971d;
        RecyclerView recyclerView = u0Var.f15001d;
        RecyclerView recyclerView2 = u0Var.f15001d;
        boolean Q5 = recyclerView.Q();
        View.AccessibilityDelegate accessibilityDelegate = this.f4246a;
        if (!Q5 && recyclerView2.getLayoutManager() != null) {
            recyclerView2.getLayoutManager().a0(view, gVar);
            C0254b c0254b = (C0254b) this.f14972e.get(view);
            if (c0254b != null) {
                c0254b.d(view, gVar);
                return;
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // P.C0254b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0254b c0254b = (C0254b) this.f14972e.get(view);
        if (c0254b != null) {
            c0254b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // P.C0254b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0254b c0254b = (C0254b) this.f14972e.get(viewGroup);
        if (c0254b != null) {
            return c0254b.f(viewGroup, view, accessibilityEvent);
        }
        return this.f4246a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // P.C0254b
    public final boolean g(View view, int i4, Bundle bundle) {
        u0 u0Var = this.f14971d;
        RecyclerView recyclerView = u0Var.f15001d;
        RecyclerView recyclerView2 = u0Var.f15001d;
        if (!recyclerView.Q() && recyclerView2.getLayoutManager() != null) {
            C0254b c0254b = (C0254b) this.f14972e.get(view);
            if (c0254b != null) {
                if (c0254b.g(view, i4, bundle)) {
                    return true;
                }
            } else if (super.g(view, i4, bundle)) {
                return true;
            }
            j0 j0Var = recyclerView2.getLayoutManager().f14811b.f8943f;
            return false;
        }
        return super.g(view, i4, bundle);
    }

    @Override // P.C0254b
    public final void h(View view, int i4) {
        C0254b c0254b = (C0254b) this.f14972e.get(view);
        if (c0254b != null) {
            c0254b.h(view, i4);
        } else {
            super.h(view, i4);
        }
    }

    @Override // P.C0254b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0254b c0254b = (C0254b) this.f14972e.get(view);
        if (c0254b != null) {
            c0254b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
