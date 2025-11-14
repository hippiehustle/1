package t0;

import P.C0267o;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f14786a;

    public /* synthetic */ S(RecyclerView recyclerView) {
        this.f14786a = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(s0 s0Var, C0267o c0267o, C0267o c0267o2) {
        boolean z8;
        RecyclerView recyclerView = this.f14786a;
        recyclerView.getClass();
        s0Var.p(false);
        C1548n c1548n = (C1548n) recyclerView.f8928P;
        if (c0267o != null) {
            c1548n.getClass();
            int i4 = c0267o.f4298a;
            int i8 = c0267o2.f4298a;
            if (i4 != i8 || c0267o.f4299b != c0267o2.f4299b) {
                z8 = c1548n.g(s0Var, i4, c0267o.f4299b, i8, c0267o2.f4299b);
                if (!z8) {
                    recyclerView.Y();
                    return;
                }
                return;
            }
        }
        c1548n.l(s0Var);
        s0Var.f14950a.setAlpha(0.0f);
        c1548n.f14901i.add(s0Var);
        z8 = true;
        if (!z8) {
        }
    }

    public void b(s0 s0Var, C0267o c0267o, C0267o c0267o2) {
        int i4;
        int i8;
        boolean z8;
        RecyclerView recyclerView = this.f14786a;
        recyclerView.f8943f.l(s0Var);
        recyclerView.h(s0Var);
        s0Var.p(false);
        C1548n c1548n = (C1548n) recyclerView.f8928P;
        c1548n.getClass();
        int i9 = c0267o.f4298a;
        int i10 = c0267o.f4299b;
        View view = s0Var.f14950a;
        if (c0267o2 == null) {
            i4 = view.getLeft();
        } else {
            i4 = c0267o2.f4298a;
        }
        int i11 = i4;
        if (c0267o2 == null) {
            i8 = view.getTop();
        } else {
            i8 = c0267o2.f4299b;
        }
        int i12 = i8;
        if (!s0Var.j() && (i9 != i11 || i10 != i12)) {
            view.layout(i11, i12, view.getWidth() + i11, view.getHeight() + i12);
            z8 = c1548n.g(s0Var, i9, i10, i11, i12);
        } else {
            c1548n.l(s0Var);
            c1548n.f14900h.add(s0Var);
            z8 = true;
        }
        if (z8) {
            recyclerView.Y();
        }
    }

    public void c(int i4) {
        RecyclerView recyclerView = this.f14786a;
        View childAt = recyclerView.getChildAt(i4);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i4);
    }
}
