package t0;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class P extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f14780a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f14781b = new v0(this);

    /* renamed from: c, reason: collision with root package name */
    public N f14782c;

    /* renamed from: d, reason: collision with root package name */
    public N f14783d;

    public static int c(View view, c0.g gVar) {
        return ((gVar.e(view) / 2) + gVar.g(view)) - ((gVar.n() / 2) + gVar.m());
    }

    public static View d(AbstractC1537c0 abstractC1537c0, c0.g gVar) {
        int v8 = abstractC1537c0.v();
        View view = null;
        if (v8 == 0) {
            return null;
        }
        int n3 = (gVar.n() / 2) + gVar.m();
        int i4 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < v8; i8++) {
            View u8 = abstractC1537c0.u(i8);
            int abs = Math.abs(((gVar.e(u8) / 2) + gVar.g(u8)) - n3);
            if (abs < i4) {
                view = u8;
                i4 = abs;
            }
        }
        return view;
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f14780a;
        if (recyclerView2 != recyclerView) {
            v0 v0Var = this.f14781b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f8955m0;
                if (arrayList != null) {
                    arrayList.remove(v0Var);
                }
                this.f14780a.setOnFlingListener(null);
            }
            this.f14780a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    this.f14780a.j(v0Var);
                    this.f14780a.setOnFlingListener(this);
                    new Scroller(this.f14780a.getContext(), new DecelerateInterpolator());
                    g();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final int[] b(AbstractC1537c0 abstractC1537c0, View view) {
        int[] iArr = new int[2];
        if (abstractC1537c0.d()) {
            iArr[0] = c(view, e(abstractC1537c0));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1537c0.e()) {
            iArr[1] = c(view, f(abstractC1537c0));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final c0.g e(AbstractC1537c0 abstractC1537c0) {
        N n3 = this.f14783d;
        if (n3 == null || ((AbstractC1537c0) n3.f9383b) != abstractC1537c0) {
            this.f14783d = new N(abstractC1537c0, 0);
        }
        return this.f14783d;
    }

    public final c0.g f(AbstractC1537c0 abstractC1537c0) {
        N n3 = this.f14782c;
        if (n3 == null || ((AbstractC1537c0) n3.f9383b) != abstractC1537c0) {
            this.f14782c = new N(abstractC1537c0, 1);
        }
        return this.f14782c;
    }

    public final void g() {
        AbstractC1537c0 layoutManager;
        View view;
        RecyclerView recyclerView = this.f14780a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.e()) {
                view = d(layoutManager, f(layoutManager));
            } else if (layoutManager.d()) {
                view = d(layoutManager, e(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] b4 = b(layoutManager, view);
                int i4 = b4[0];
                if (i4 == 0 && b4[1] == 0) {
                    return;
                }
                this.f14780a.l0(i4, b4[1], false);
            }
        }
    }
}
