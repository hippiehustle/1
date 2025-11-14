package t0;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14749a;

    /* renamed from: b, reason: collision with root package name */
    public int f14750b;

    /* renamed from: c, reason: collision with root package name */
    public int f14751c;

    /* renamed from: d, reason: collision with root package name */
    public int f14752d;

    /* renamed from: e, reason: collision with root package name */
    public int f14753e;

    /* renamed from: f, reason: collision with root package name */
    public int f14754f;

    /* renamed from: g, reason: collision with root package name */
    public int f14755g;

    /* renamed from: h, reason: collision with root package name */
    public int f14756h;

    /* renamed from: i, reason: collision with root package name */
    public int f14757i;
    public int j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14758l;

    public final void a(View view) {
        int d2;
        int size = this.k.size();
        View view2 = null;
        int i4 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < size; i8++) {
            View view3 = ((s0) this.k.get(i8)).f14950a;
            d0 d0Var = (d0) view3.getLayoutParams();
            if (view3 != view && !d0Var.f14827a.j() && (d2 = (d0Var.f14827a.d() - this.f14752d) * this.f14753e) >= 0 && d2 < i4) {
                view2 = view3;
                if (d2 == 0) {
                    break;
                } else {
                    i4 = d2;
                }
            }
        }
        if (view2 == null) {
            this.f14752d = -1;
        } else {
            this.f14752d = ((d0) view2.getLayoutParams()).f14827a.d();
        }
    }

    public final View b(j0 j0Var) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = ((s0) this.k.get(i4)).f14950a;
                d0 d0Var = (d0) view.getLayoutParams();
                if (!d0Var.f14827a.j() && this.f14752d == d0Var.f14827a.d()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = j0Var.k(this.f14752d, Long.MAX_VALUE).f14950a;
        this.f14752d += this.f14753e;
        return view2;
    }
}
