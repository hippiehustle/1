package androidx.recyclerview.widget;

import A.j;
import C5.p;
import O7.C0235h;
import P.O;
import Q.f;
import Q.g;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import g5.C0787g;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import n1.AbstractC1149a;
import t0.AbstractC1537c0;
import t0.C1558y;
import t0.F;
import t0.G;
import t0.H;
import t0.U;
import t0.d0;
import t0.j0;
import t0.o0;
import t0.s0;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: P, reason: collision with root package name */
    public static final Set f8874P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* renamed from: E, reason: collision with root package name */
    public boolean f8875E;

    /* renamed from: F, reason: collision with root package name */
    public int f8876F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f8877G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f8878H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f8879I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f8880J;
    public p K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f8881L;

    /* renamed from: M, reason: collision with root package name */
    public int f8882M;

    /* renamed from: N, reason: collision with root package name */
    public int f8883N;

    /* renamed from: O, reason: collision with root package name */
    public int f8884O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i8) {
        super(context, attributeSet, i4, i8);
        this.f8875E = false;
        this.f8876F = -1;
        this.f8879I = new SparseIntArray();
        this.f8880J = new SparseIntArray();
        this.K = new p(4);
        this.f8881L = new Rect();
        this.f8882M = -1;
        this.f8883N = -1;
        this.f8884O = -1;
        y1(AbstractC1537c0.L(context, attributeSet, i4, i8).f14804b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    public final boolean H0() {
        if (this.f8899z == null && !this.f8875E) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void J0(o0 o0Var, H h8, C0787g c0787g) {
        int i4;
        int i8 = this.f8876F;
        for (int i9 = 0; i9 < this.f8876F && (i4 = h8.f14752d) >= 0 && i4 < o0Var.b() && i8 > 0; i9++) {
            int i10 = h8.f14752d;
            c0787g.b(i10, Math.max(0, h8.f14755g));
            i8 -= this.K.j(i10);
            h8.f14752d += h8.f14753e;
        }
    }

    @Override // t0.AbstractC1537c0
    public final int M(j0 j0Var, o0 o0Var) {
        if (this.f8889p == 0) {
            return Math.min(this.f8876F, F());
        }
        if (o0Var.b() < 1) {
            return 0;
        }
        return u1(o0Var.b() - 1, j0Var, o0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View V0(j0 j0Var, o0 o0Var, boolean z8, boolean z9) {
        int i4;
        int i8;
        int v8 = v();
        int i9 = 1;
        if (z9) {
            i8 = v() - 1;
            i4 = -1;
            i9 = -1;
        } else {
            i4 = v8;
            i8 = 0;
        }
        int b4 = o0Var.b();
        O0();
        int m6 = this.f8891r.m();
        int i10 = this.f8891r.i();
        View view = null;
        View view2 = null;
        while (i8 != i4) {
            View u8 = u(i8);
            int K = AbstractC1537c0.K(u8);
            if (K >= 0 && K < b4 && v1(K, j0Var, o0Var) == 0) {
                if (((d0) u8.getLayoutParams()).f14827a.j()) {
                    if (view2 == null) {
                        view2 = u8;
                    }
                } else {
                    if (this.f8891r.g(u8) < i10 && this.f8891r.d(u8) >= m6) {
                        return u8;
                    }
                    if (view == null) {
                        view = u8;
                    }
                }
            }
            i8 += i9;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == r9) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.f14810a.f5432e).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View X(View view, int i4, j0 j0Var, o0 o0Var) {
        View E7;
        boolean z8;
        int v8;
        int i8;
        int i9;
        boolean z9;
        View view2;
        View view3;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        j0 j0Var2 = j0Var;
        o0 o0Var2 = o0Var;
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView != null) {
            E7 = recyclerView.E(view);
            if (E7 != null) {
            }
        }
        E7 = null;
        if (E7 != null) {
            C1558y c1558y = (C1558y) E7.getLayoutParams();
            int i12 = c1558y.f15024e;
            int i13 = c1558y.f15025f + i12;
            if (super.X(view, i4, j0Var, o0Var) != null) {
                if (N0(i4) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8 != this.f8894u) {
                    i9 = v() - 1;
                    v8 = -1;
                    i8 = -1;
                } else {
                    v8 = v();
                    i8 = 1;
                    i9 = 0;
                }
                if (this.f8889p == 1 && a1()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int u12 = u1(i9, j0Var2, o0Var2);
                View view4 = null;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                int i17 = i9;
                int i18 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i17 == v8) {
                        break;
                    }
                    int u13 = u1(i17, j0Var2, o0Var2);
                    View u8 = u(i17);
                    if (u8 == E7) {
                        break;
                    }
                    if (u8.hasFocusable() && u13 != u12) {
                        if (view4 != null) {
                            break;
                        }
                        view3 = E7;
                        i11 = i16;
                        i10 = v8;
                    } else {
                        C1558y c1558y2 = (C1558y) u8.getLayoutParams();
                        int i19 = c1558y2.f15024e;
                        view3 = E7;
                        int i20 = c1558y2.f15025f + i19;
                        if (u8.hasFocusable() && i19 == i12 && i20 == i13) {
                            return u8;
                        }
                        if ((u8.hasFocusable() && view4 == null) || (!u8.hasFocusable() && view2 == null)) {
                            i11 = i16;
                            i10 = v8;
                        } else {
                            i10 = v8;
                            int min = Math.min(i20, i13) - Math.max(i19, i12);
                            if (u8.hasFocusable()) {
                                if (min <= i16) {
                                    if (min == i16) {
                                        if (i19 > i15) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                    }
                                    i11 = i16;
                                }
                                i11 = i16;
                            } else {
                                if (view4 == null) {
                                    i11 = i16;
                                    if (!this.f14812c.m(u8) || !this.f14813d.m(u8)) {
                                        if (min <= i18) {
                                            if (min == i18) {
                                                if (i19 > i14) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = i16;
                            }
                        }
                        if (u8.hasFocusable()) {
                            int i21 = c1558y2.f15024e;
                            i16 = Math.min(i20, i13) - Math.max(i19, i12);
                            view4 = u8;
                            i15 = i21;
                            view5 = view2;
                        } else {
                            int i22 = c1558y2.f15024e;
                            view5 = u8;
                            i14 = i22;
                            i16 = i11;
                            i18 = Math.min(i20, i13) - Math.max(i19, i12);
                        }
                        i17 += i8;
                        j0Var2 = j0Var;
                        o0Var2 = o0Var;
                        E7 = view3;
                        v8 = i10;
                    }
                    view5 = view2;
                    i16 = i11;
                    i17 += i8;
                    j0Var2 = j0Var;
                    o0Var2 = o0Var;
                    E7 = view3;
                    v8 = i10;
                }
                if (view4 != null) {
                    return view4;
                }
                return view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    public final void Z(j0 j0Var, o0 o0Var, g gVar) {
        super.Z(j0Var, o0Var, gVar);
        gVar.i(GridView.class.getName());
        U u8 = this.f14811b.f8960p;
        if (u8 != null && u8.a() > 1) {
            gVar.b(f.f4703o);
        }
    }

    @Override // t0.AbstractC1537c0
    public final void b0(j0 j0Var, o0 o0Var, View view, g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1558y)) {
            a0(view, gVar);
            return;
        }
        C1558y c1558y = (C1558y) layoutParams;
        int u12 = u1(c1558y.f14827a.d(), j0Var, o0Var);
        if (this.f8889p == 0) {
            gVar.j(C0235h.a(false, c1558y.f15024e, c1558y.f15025f, u12, 1));
        } else {
            gVar.j(C0235h.a(false, u12, 1, c1558y.f15024e, c1558y.f15025f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        r22.f14746b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(j0 j0Var, o0 o0Var, H h8, G g8) {
        boolean z8;
        int i4;
        boolean z9;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int w8;
        int i15;
        ?? r12;
        int i16;
        View b4;
        int l6 = this.f8891r.l();
        if (l6 != 1073741824) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (v() > 0) {
            i4 = this.f8877G[this.f8876F];
        } else {
            i4 = 0;
        }
        if (z8) {
            z1();
        }
        if (h8.f14753e == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i17 = this.f8876F;
        if (!z9) {
            i17 = v1(h8.f14752d, j0Var, o0Var) + w1(h8.f14752d, j0Var, o0Var);
        }
        int i18 = 0;
        while (i18 < this.f8876F && (i16 = h8.f14752d) >= 0 && i16 < o0Var.b() && i17 > 0) {
            int i19 = h8.f14752d;
            int w12 = w1(i19, j0Var, o0Var);
            if (w12 <= this.f8876F) {
                i17 -= w12;
                if (i17 < 0 || (b4 = h8.b(j0Var)) == null) {
                    break;
                }
                this.f8878H[i18] = b4;
                i18++;
            } else {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i19);
                sb.append(" requires ");
                sb.append(w12);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(AbstractC1149a.h(sb, this.f8876F, " spans."));
            }
        }
        if (z9) {
            i10 = 1;
            i9 = i18;
            i8 = 0;
        } else {
            i8 = i18 - 1;
            i9 = -1;
            i10 = -1;
        }
        int i20 = 0;
        while (i8 != i9) {
            View view = this.f8878H[i8];
            C1558y c1558y = (C1558y) view.getLayoutParams();
            int w13 = w1(AbstractC1537c0.K(view), j0Var, o0Var);
            c1558y.f15025f = w13;
            c1558y.f15024e = i20;
            i20 += w13;
            i8 += i10;
        }
        float f8 = 0.0f;
        int i21 = 0;
        for (int i22 = 0; i22 < i18; i22++) {
            View view2 = this.f8878H[i22];
            if (h8.k == null) {
                if (z9) {
                    r12 = 0;
                    b(view2, -1, false);
                } else {
                    r12 = 0;
                    b(view2, 0, false);
                }
            } else {
                r12 = 0;
                r12 = 0;
                if (z9) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            }
            RecyclerView recyclerView = this.f14811b;
            Rect rect = this.f8881L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.P(view2));
            }
            x1(view2, l6, r12);
            int e9 = this.f8891r.e(view2);
            if (e9 > i21) {
                i21 = e9;
            }
            float f9 = (this.f8891r.f(view2) * 1.0f) / ((C1558y) view2.getLayoutParams()).f15025f;
            if (f9 > f8) {
                f8 = f9;
            }
        }
        if (z8) {
            n1(Math.max(Math.round(f8 * this.f8876F), i4));
            i21 = 0;
            for (int i23 = 0; i23 < i18; i23++) {
                View view3 = this.f8878H[i23];
                x1(view3, 1073741824, true);
                int e10 = this.f8891r.e(view3);
                if (e10 > i21) {
                    i21 = e10;
                }
            }
        }
        for (int i24 = 0; i24 < i18; i24++) {
            View view4 = this.f8878H[i24];
            if (this.f8891r.e(view4) != i21) {
                C1558y c1558y2 = (C1558y) view4.getLayoutParams();
                Rect rect2 = c1558y2.f14828b;
                int i25 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1558y2).topMargin + ((ViewGroup.MarginLayoutParams) c1558y2).bottomMargin;
                int i26 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c1558y2).leftMargin + ((ViewGroup.MarginLayoutParams) c1558y2).rightMargin;
                int t12 = t1(c1558y2.f15024e, c1558y2.f15025f);
                if (this.f8889p == 1) {
                    i15 = AbstractC1537c0.w(false, t12, 1073741824, i26, ((ViewGroup.MarginLayoutParams) c1558y2).width);
                    w8 = View.MeasureSpec.makeMeasureSpec(i21 - i25, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21 - i26, 1073741824);
                    w8 = AbstractC1537c0.w(false, t12, 1073741824, i25, ((ViewGroup.MarginLayoutParams) c1558y2).height);
                    i15 = makeMeasureSpec;
                }
                if (E0(view4, i15, w8, (d0) view4.getLayoutParams())) {
                    view4.measure(i15, w8);
                }
            }
        }
        g8.f14745a = i21;
        if (this.f8889p == 1) {
            if (h8.f14754f == -1) {
                i14 = h8.f14750b;
                i12 = i14 - i21;
                i13 = 0;
                i11 = 0;
            } else {
                int i27 = h8.f14750b;
                i11 = 0;
                i12 = i27;
                i14 = i27 + i21;
                i13 = 0;
            }
        } else {
            if (h8.f14754f == -1) {
                int i28 = h8.f14750b;
                i13 = i28 - i21;
                i12 = 0;
                i11 = i28;
            } else {
                int i29 = h8.f14750b;
                i11 = i29 + i21;
                i12 = 0;
                i13 = i29;
            }
            i14 = i12;
        }
        for (int i30 = 0; i30 < i18; i30++) {
            View view5 = this.f8878H[i30];
            C1558y c1558y3 = (C1558y) view5.getLayoutParams();
            if (this.f8889p == 1) {
                if (a1()) {
                    int H2 = H() + this.f8877G[this.f8876F - c1558y3.f15024e];
                    i11 = H2;
                    i13 = H2 - this.f8891r.f(view5);
                } else {
                    i13 = H() + this.f8877G[c1558y3.f15024e];
                    i11 = this.f8891r.f(view5) + i13;
                }
            } else {
                i12 = J() + this.f8877G[c1558y3.f15024e];
                i14 = this.f8891r.f(view5) + i12;
            }
            AbstractC1537c0.R(view5, i13, i12, i11, i14);
            if (c1558y3.f14827a.j() || c1558y3.f14827a.m()) {
                g8.f14747c = true;
            }
            g8.f14748d = view5.hasFocusable() | g8.f14748d;
        }
        Arrays.fill(this.f8878H, (Object) null);
    }

    @Override // t0.AbstractC1537c0
    public final void c0(int i4, int i8) {
        this.K.k();
        ((SparseIntArray) this.K.f707b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c1(j0 j0Var, o0 o0Var, F f8, int i4) {
        boolean z8;
        z1();
        if (o0Var.b() > 0 && !o0Var.f14918g) {
            if (i4 == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            int v12 = v1(f8.f14741b, j0Var, o0Var);
            if (z8) {
                while (v12 > 0) {
                    int i8 = f8.f14741b;
                    if (i8 <= 0) {
                        break;
                    }
                    int i9 = i8 - 1;
                    f8.f14741b = i9;
                    v12 = v1(i9, j0Var, o0Var);
                }
            } else {
                int b4 = o0Var.b() - 1;
                int i10 = f8.f14741b;
                while (i10 < b4) {
                    int i11 = i10 + 1;
                    int v13 = v1(i11, j0Var, o0Var);
                    if (v13 <= v12) {
                        break;
                    }
                    i10 = i11;
                    v12 = v13;
                }
                f8.f14741b = i10;
            }
        }
        o1();
    }

    @Override // t0.AbstractC1537c0
    public final void d0() {
        this.K.k();
        ((SparseIntArray) this.K.f707b).clear();
    }

    @Override // t0.AbstractC1537c0
    public final void e0(int i4, int i8) {
        this.K.k();
        ((SparseIntArray) this.K.f707b).clear();
    }

    @Override // t0.AbstractC1537c0
    public final boolean f(d0 d0Var) {
        return d0Var instanceof C1558y;
    }

    @Override // t0.AbstractC1537c0
    public final void f0(int i4, int i8) {
        this.K.k();
        ((SparseIntArray) this.K.f707b).clear();
    }

    @Override // t0.AbstractC1537c0
    public final void g0(int i4, int i8) {
        this.K.k();
        ((SparseIntArray) this.K.f707b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    public final void h0(j0 j0Var, o0 o0Var) {
        boolean z8 = o0Var.f14918g;
        SparseIntArray sparseIntArray = this.f8880J;
        SparseIntArray sparseIntArray2 = this.f8879I;
        if (z8) {
            int v8 = v();
            for (int i4 = 0; i4 < v8; i4++) {
                C1558y c1558y = (C1558y) u(i4).getLayoutParams();
                int d2 = c1558y.f14827a.d();
                sparseIntArray2.put(d2, c1558y.f15025f);
                sparseIntArray.put(d2, c1558y.f15024e);
            }
        }
        super.h0(j0Var, o0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    public final void i0(o0 o0Var) {
        View q6;
        super.i0(o0Var);
        this.f8875E = false;
        int i4 = this.f8882M;
        if (i4 != -1 && (q6 = q(i4)) != null) {
            q6.sendAccessibilityEvent(67108864);
            this.f8882M = -1;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void j1(boolean z8) {
        if (!z8) {
            super.j1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    public final int k(o0 o0Var) {
        return L0(o0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    public final int l(o0 o0Var) {
        return M0(o0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0213  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m0(int i4, Bundle bundle) {
        View view;
        s0 M8;
        int i8;
        int i9;
        if (i4 == f.f4703o.a() && i4 != -1) {
            int i10 = 0;
            while (true) {
                if (i10 < v()) {
                    View u8 = u(i10);
                    Objects.requireNonNull(u8);
                    if (u8.isAccessibilityFocused()) {
                        view = u(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null && bundle != null) {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (f8874P.contains(Integer.valueOf(i11)) && (M8 = this.f14811b.M(view)) != null) {
                    int b4 = M8.b();
                    int q12 = q1(b4);
                    int p1 = p1(b4);
                    if (q12 >= 0 && p1 >= 0) {
                        if (!r1(b4).contains(Integer.valueOf(this.f8883N)) || !s1(p1(b4), b4).contains(Integer.valueOf(this.f8884O))) {
                            this.f8883N = q12;
                            this.f8884O = p1;
                        }
                        int i12 = this.f8883N;
                        if (i12 == -1) {
                            i12 = q12;
                        }
                        int i13 = this.f8884O;
                        if (i13 != -1) {
                            p1 = i13;
                        }
                        if (i11 != 17) {
                            if (i11 != 33) {
                                if (i11 != 66) {
                                    if (i11 == 130) {
                                        i8 = b4 + 1;
                                        while (i8 < F()) {
                                            int q13 = q1(i8);
                                            int p12 = p1(i8);
                                            if (q13 < 0 || p12 < 0) {
                                                break;
                                            }
                                            if (this.f8889p == 1) {
                                                if (q13 > i12 && (p12 == p1 || s1(p1(i8), i8).contains(Integer.valueOf(p1)))) {
                                                    this.f8883N = q13;
                                                    break;
                                                }
                                                i8++;
                                            } else {
                                                if (q13 > i12 && p12 == p1) {
                                                    this.f8883N = q1(i8);
                                                    break;
                                                }
                                                i8++;
                                            }
                                        }
                                        i8 = -1;
                                        if (i8 == -1 && (i9 = this.f8889p) == 0) {
                                            if (i11 != 17) {
                                                if (q12 >= 0 && i9 != 1) {
                                                    TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                                                    int i14 = 0;
                                                    loop2: while (true) {
                                                        if (i14 < F()) {
                                                            Iterator it = r1(i14).iterator();
                                                            while (it.hasNext()) {
                                                                Integer num = (Integer) it.next();
                                                                if (num.intValue() < 0) {
                                                                    break loop2;
                                                                }
                                                                treeMap.put(num, Integer.valueOf(i14));
                                                            }
                                                            i14++;
                                                        } else {
                                                            for (Integer num2 : treeMap.keySet()) {
                                                                int intValue = num2.intValue();
                                                                if (intValue < q12) {
                                                                    i8 = ((Integer) treeMap.get(num2)).intValue();
                                                                    this.f8883N = intValue;
                                                                    this.f8884O = p1(i8);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i8 = -1;
                                            } else if (i11 == 66) {
                                                if (q12 >= 0 && i9 != 1) {
                                                    TreeMap treeMap2 = new TreeMap();
                                                    int i15 = 0;
                                                    loop5: while (true) {
                                                        if (i15 < F()) {
                                                            Iterator it2 = r1(i15).iterator();
                                                            while (it2.hasNext()) {
                                                                Integer num3 = (Integer) it2.next();
                                                                if (num3.intValue() < 0) {
                                                                    break loop5;
                                                                }
                                                                if (!treeMap2.containsKey(num3)) {
                                                                    treeMap2.put(num3, Integer.valueOf(i15));
                                                                }
                                                            }
                                                            i15++;
                                                        } else {
                                                            for (Integer num4 : treeMap2.keySet()) {
                                                                int intValue2 = num4.intValue();
                                                                if (intValue2 > q12) {
                                                                    i8 = ((Integer) treeMap2.get(num4)).intValue();
                                                                    this.f8883N = intValue2;
                                                                    this.f8884O = 0;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i8 = -1;
                                            }
                                        }
                                        if (i8 != -1) {
                                            v0(i8);
                                            this.f8882M = i8;
                                            return true;
                                        }
                                    }
                                } else {
                                    i8 = b4 + 1;
                                    while (i8 < F()) {
                                        int q14 = q1(i8);
                                        int p13 = p1(i8);
                                        if (q14 < 0 || p13 < 0) {
                                            break;
                                        }
                                        if (this.f8889p == 1) {
                                            if ((q14 == i12 && p13 > p1) || q14 > i12) {
                                                this.f8883N = q14;
                                                this.f8884O = p13;
                                                break;
                                            }
                                            i8++;
                                        } else {
                                            if (p13 > p1 && r1(i8).contains(Integer.valueOf(i12))) {
                                                this.f8884O = p13;
                                                break;
                                            }
                                            i8++;
                                        }
                                    }
                                    i8 = -1;
                                    if (i8 == -1) {
                                        if (i11 != 17) {
                                        }
                                    }
                                    if (i8 != -1) {
                                    }
                                }
                            } else {
                                i8 = b4 - 1;
                                while (i8 >= 0) {
                                    int q15 = q1(i8);
                                    int p14 = p1(i8);
                                    if (q15 < 0 || p14 < 0) {
                                        break;
                                    }
                                    if (this.f8889p == 1) {
                                        if (q15 < i12 && s1(p1(i8), i8).contains(Integer.valueOf(p1))) {
                                            this.f8883N = q15;
                                            break;
                                        }
                                        i8--;
                                    } else {
                                        if (q15 < i12 && p14 == p1) {
                                            this.f8883N = ((Integer) Collections.max(r1(i8))).intValue();
                                            break;
                                        }
                                        i8--;
                                    }
                                }
                                i8 = -1;
                                if (i8 == -1) {
                                }
                                if (i8 != -1) {
                                }
                            }
                        } else {
                            i8 = b4 - 1;
                            while (i8 >= 0) {
                                int q16 = q1(i8);
                                int p15 = p1(i8);
                                if (q16 < 0 || p15 < 0) {
                                    break;
                                }
                                if (this.f8889p == 1) {
                                    if ((q16 == i12 && p15 < p1) || q16 < i12) {
                                        this.f8883N = q16;
                                        this.f8884O = p15;
                                        break;
                                    }
                                    i8--;
                                } else {
                                    if (r1(i8).contains(Integer.valueOf(i12)) && p15 < p1) {
                                        this.f8884O = p15;
                                        break;
                                    }
                                    i8--;
                                }
                            }
                            i8 = -1;
                            if (i8 == -1) {
                            }
                            if (i8 != -1) {
                            }
                        }
                    }
                }
            }
        } else if (i4 == 16908343 && bundle != null) {
            int i16 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i17 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i16 != -1 && i17 != -1) {
                int a3 = this.f14811b.f8960p.a();
                int i18 = 0;
                while (true) {
                    if (i18 < a3) {
                        RecyclerView recyclerView = this.f14811b;
                        int v12 = v1(i18, recyclerView.f8943f, recyclerView.f8951k0);
                        RecyclerView recyclerView2 = this.f14811b;
                        int u12 = u1(i18, recyclerView2.f8943f, recyclerView2.f8951k0);
                        if (this.f8889p == 1) {
                            if (v12 == i17 && u12 == i16) {
                                break;
                            }
                            i18++;
                        } else {
                            if (v12 == i16 && u12 == i17) {
                                break;
                            }
                            i18++;
                        }
                    } else {
                        i18 = -1;
                        break;
                    }
                }
                if (i18 > -1) {
                    h1(i18, 0);
                    return true;
                }
            }
        } else {
            return super.m0(i4, bundle);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    public final int n(o0 o0Var) {
        return L0(o0Var);
    }

    public final void n1(int i4) {
        int i8;
        int[] iArr = this.f8877G;
        int i9 = this.f8876F;
        if (iArr == null || iArr.length != i9 + 1 || iArr[iArr.length - 1] != i4) {
            iArr = new int[i9 + 1];
        }
        int i10 = 0;
        iArr[0] = 0;
        int i11 = i4 / i9;
        int i12 = i4 % i9;
        int i13 = 0;
        for (int i14 = 1; i14 <= i9; i14++) {
            i10 += i12;
            if (i10 > 0 && i9 - i10 < i12) {
                i8 = i11 + 1;
                i10 -= i9;
            } else {
                i8 = i11;
            }
            i13 += i8;
            iArr[i14] = i13;
        }
        this.f8877G = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    public final int o(o0 o0Var) {
        return M0(o0Var);
    }

    public final void o1() {
        View[] viewArr = this.f8878H;
        if (viewArr != null && viewArr.length == this.f8876F) {
            return;
        }
        this.f8878H = new View[this.f8876F];
    }

    public final int p1(int i4) {
        if (this.f8889p == 0) {
            RecyclerView recyclerView = this.f14811b;
            return u1(i4, recyclerView.f8943f, recyclerView.f8951k0);
        }
        RecyclerView recyclerView2 = this.f14811b;
        return v1(i4, recyclerView2.f8943f, recyclerView2.f8951k0);
    }

    public final int q1(int i4) {
        if (this.f8889p == 1) {
            RecyclerView recyclerView = this.f14811b;
            return u1(i4, recyclerView.f8943f, recyclerView.f8951k0);
        }
        RecyclerView recyclerView2 = this.f14811b;
        return v1(i4, recyclerView2.f8943f, recyclerView2.f8951k0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    public final d0 r() {
        if (this.f8889p == 0) {
            return new C1558y(-2, -1);
        }
        return new C1558y(-1, -2);
    }

    public final HashSet r1(int i4) {
        return s1(q1(i4), i4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t0.y, t0.d0] */
    @Override // t0.AbstractC1537c0
    public final d0 s(Context context, AttributeSet attributeSet) {
        ?? d0Var = new d0(context, attributeSet);
        d0Var.f15024e = -1;
        d0Var.f15025f = 0;
        return d0Var;
    }

    public final HashSet s1(int i4, int i8) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f14811b;
        int w12 = w1(i8, recyclerView.f8943f, recyclerView.f8951k0);
        for (int i9 = i4; i9 < i4 + w12; i9++) {
            hashSet.add(Integer.valueOf(i9));
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [t0.y, t0.d0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [t0.y, t0.d0] */
    @Override // t0.AbstractC1537c0
    public final d0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? d0Var = new d0((ViewGroup.MarginLayoutParams) layoutParams);
            d0Var.f15024e = -1;
            d0Var.f15025f = 0;
            return d0Var;
        }
        ?? d0Var2 = new d0(layoutParams);
        d0Var2.f15024e = -1;
        d0Var2.f15025f = 0;
        return d0Var2;
    }

    public final int t1(int i4, int i8) {
        if (this.f8889p == 1 && a1()) {
            int[] iArr = this.f8877G;
            int i9 = this.f8876F;
            return iArr[i9 - i4] - iArr[(i9 - i4) - i8];
        }
        int[] iArr2 = this.f8877G;
        return iArr2[i8 + i4] - iArr2[i4];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    public final int u0(int i4, j0 j0Var, o0 o0Var) {
        z1();
        o1();
        return super.u0(i4, j0Var, o0Var);
    }

    public final int u1(int i4, j0 j0Var, o0 o0Var) {
        if (!o0Var.f14918g) {
            return this.K.h(i4, this.f8876F);
        }
        int b4 = j0Var.b(i4);
        if (b4 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
            return 0;
        }
        return this.K.h(b4, this.f8876F);
    }

    public final int v1(int i4, j0 j0Var, o0 o0Var) {
        if (!o0Var.f14918g) {
            return this.K.i(i4, this.f8876F);
        }
        int i8 = this.f8880J.get(i4, -1);
        if (i8 != -1) {
            return i8;
        }
        int b4 = j0Var.b(i4);
        if (b4 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
            return 0;
        }
        return this.K.i(b4, this.f8876F);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    public final int w0(int i4, j0 j0Var, o0 o0Var) {
        z1();
        o1();
        return super.w0(i4, j0Var, o0Var);
    }

    public final int w1(int i4, j0 j0Var, o0 o0Var) {
        if (!o0Var.f14918g) {
            return this.K.j(i4);
        }
        int i8 = this.f8879I.get(i4, -1);
        if (i8 != -1) {
            return i8;
        }
        int b4 = j0Var.b(i4);
        if (b4 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
            return 1;
        }
        return this.K.j(b4);
    }

    @Override // t0.AbstractC1537c0
    public final int x(j0 j0Var, o0 o0Var) {
        if (this.f8889p == 1) {
            return Math.min(this.f8876F, F());
        }
        if (o0Var.b() < 1) {
            return 0;
        }
        return u1(o0Var.b() - 1, j0Var, o0Var) + 1;
    }

    public final void x1(View view, int i4, boolean z8) {
        int i8;
        int i9;
        boolean C02;
        C1558y c1558y = (C1558y) view.getLayoutParams();
        Rect rect = c1558y.f14828b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1558y).topMargin + ((ViewGroup.MarginLayoutParams) c1558y).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1558y).leftMargin + ((ViewGroup.MarginLayoutParams) c1558y).rightMargin;
        int t12 = t1(c1558y.f15024e, c1558y.f15025f);
        if (this.f8889p == 1) {
            i9 = AbstractC1537c0.w(false, t12, i4, i11, ((ViewGroup.MarginLayoutParams) c1558y).width);
            i8 = AbstractC1537c0.w(true, this.f8891r.n(), this.f14820m, i10, ((ViewGroup.MarginLayoutParams) c1558y).height);
        } else {
            int w8 = AbstractC1537c0.w(false, t12, i4, i10, ((ViewGroup.MarginLayoutParams) c1558y).height);
            int w9 = AbstractC1537c0.w(true, this.f8891r.n(), this.f14819l, i11, ((ViewGroup.MarginLayoutParams) c1558y).width);
            i8 = w8;
            i9 = w9;
        }
        d0 d0Var = (d0) view.getLayoutParams();
        if (z8) {
            C02 = E0(view, i9, i8, d0Var);
        } else {
            C02 = C0(view, i9, i8, d0Var);
        }
        if (C02) {
            view.measure(i9, i8);
        }
    }

    public final void y1(int i4) {
        if (i4 == this.f8876F) {
            return;
        }
        this.f8875E = true;
        if (i4 >= 1) {
            this.f8876F = i4;
            this.K.k();
            t0();
            return;
        }
        throw new IllegalArgumentException(j.l("Span count should be at least 1. Provided ", i4));
    }

    @Override // t0.AbstractC1537c0
    public final void z0(Rect rect, int i4, int i8) {
        int g8;
        int g9;
        if (this.f8877G == null) {
            super.z0(rect, i4, i8);
        }
        int I8 = I() + H();
        int G8 = G() + J();
        if (this.f8889p == 1) {
            int height = rect.height() + G8;
            RecyclerView recyclerView = this.f14811b;
            WeakHashMap weakHashMap = O.f4214a;
            g9 = AbstractC1537c0.g(i8, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f8877G;
            g8 = AbstractC1537c0.g(i4, iArr[iArr.length - 1] + I8, this.f14811b.getMinimumWidth());
        } else {
            int width = rect.width() + I8;
            RecyclerView recyclerView2 = this.f14811b;
            WeakHashMap weakHashMap2 = O.f4214a;
            g8 = AbstractC1537c0.g(i4, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f8877G;
            g9 = AbstractC1537c0.g(i8, iArr2[iArr2.length - 1] + G8, this.f14811b.getMinimumHeight());
        }
        this.f14811b.setMeasuredDimension(g8, g9);
    }

    public final void z1() {
        int G8;
        int J6;
        if (this.f8889p == 1) {
            G8 = this.f14821n - I();
            J6 = H();
        } else {
            G8 = this.f14822o - G();
            J6 = J();
        }
        n1(G8 - J6);
    }

    public GridLayoutManager(int i4) {
        super(1);
        this.f8875E = false;
        this.f8876F = -1;
        this.f8879I = new SparseIntArray();
        this.f8880J = new SparseIntArray();
        this.K = new p(4);
        this.f8881L = new Rect();
        this.f8882M = -1;
        this.f8883N = -1;
        this.f8884O = -1;
        y1(i4);
    }

    public GridLayoutManager() {
        super(1);
        this.f8875E = false;
        this.f8876F = -1;
        this.f8879I = new SparseIntArray();
        this.f8880J = new SparseIntArray();
        this.K = new p(4);
        this.f8881L = new Rect();
        this.f8882M = -1;
        this.f8883N = -1;
        this.f8884O = -1;
        y1(2);
    }
}
