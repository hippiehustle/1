package G1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import t0.AbstractC1537c0;
import t0.C1554u;
import t0.P;
import t0.g0;

/* loaded from: classes.dex */
public final class i extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1728b;

    public /* synthetic */ i(int i4, Object obj) {
        this.f1727a = i4;
        this.f1728b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // t0.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i4, int i8) {
        int i9;
        AbstractC1537c0 layoutManager;
        View view;
        boolean z8;
        boolean z9;
        switch (this.f1727a) {
            case 0:
                j jVar = (j) this.f1728b;
                RecyclerView recyclerView2 = jVar.f1729e;
                if (recyclerView2 != null && (layoutManager = recyclerView2.getLayoutManager()) != null) {
                    if (layoutManager.e()) {
                        view = P.d(layoutManager, jVar.f(layoutManager));
                    } else if (layoutManager.d()) {
                        view = P.d(layoutManager, jVar.e(layoutManager));
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        i9 = AbstractC1537c0.K(view);
                        if (i9 == jVar.k) {
                            jVar.k = i9;
                            d dVar = jVar.j;
                            if (dVar != null) {
                                dVar.m(Integer.valueOf(i9));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                i9 = -1;
                if (i9 == jVar.k) {
                }
                break;
            default:
                C1554u c1554u = (C1554u) this.f1728b;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i10 = c1554u.f14977a;
                int computeVerticalScrollRange = c1554u.f14993s.computeVerticalScrollRange();
                int i11 = c1554u.f14992r;
                if (computeVerticalScrollRange - i11 > 0 && i11 >= i10) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                c1554u.f14994t = z8;
                int computeHorizontalScrollRange = c1554u.f14993s.computeHorizontalScrollRange();
                int i12 = c1554u.f14991q;
                if (computeHorizontalScrollRange - i12 > 0 && i12 >= i10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                c1554u.f14995u = z9;
                boolean z10 = c1554u.f14994t;
                if (!z10 && !z9) {
                    if (c1554u.f14996v != 0) {
                        c1554u.j(0);
                        return;
                    }
                    return;
                }
                if (z10) {
                    float f8 = i11;
                    c1554u.f14986l = (int) ((((f8 / 2.0f) + computeVerticalScrollOffset) * f8) / computeVerticalScrollRange);
                    c1554u.k = Math.min(i11, (i11 * i11) / computeVerticalScrollRange);
                }
                if (c1554u.f14995u) {
                    float f9 = computeHorizontalScrollOffset;
                    float f10 = i12;
                    c1554u.f14989o = (int) ((((f10 / 2.0f) + f9) * f10) / computeHorizontalScrollRange);
                    c1554u.f14988n = Math.min(i12, (i12 * i12) / computeHorizontalScrollRange);
                }
                int i13 = c1554u.f14996v;
                if (i13 == 0 || i13 == 1) {
                    c1554u.j(1);
                    return;
                }
                return;
        }
    }
}
