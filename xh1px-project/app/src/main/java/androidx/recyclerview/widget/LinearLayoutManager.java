package androidx.recyclerview.widget;

import A.j;
import Q.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import c0.g;
import g5.C0787g;
import java.util.ArrayList;
import java.util.List;
import t0.AbstractC1534b;
import t0.AbstractC1537c0;
import t0.C1535b0;
import t0.F;
import t0.G;
import t0.H;
import t0.I;
import t0.J;
import t0.U;
import t0.d0;
import t0.j0;
import t0.n0;
import t0.o0;
import t0.s0;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC1537c0 implements n0 {

    /* renamed from: A, reason: collision with root package name */
    public final F f8885A;

    /* renamed from: B, reason: collision with root package name */
    public final G f8886B;

    /* renamed from: C, reason: collision with root package name */
    public final int f8887C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f8888D;

    /* renamed from: p, reason: collision with root package name */
    public int f8889p;

    /* renamed from: q, reason: collision with root package name */
    public H f8890q;

    /* renamed from: r, reason: collision with root package name */
    public g f8891r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8892s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8893t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8894u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8895v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f8896w;

    /* renamed from: x, reason: collision with root package name */
    public int f8897x;

    /* renamed from: y, reason: collision with root package name */
    public int f8898y;

    /* renamed from: z, reason: collision with root package name */
    public I f8899z;

    /* JADX WARN: Type inference failed for: r2v1, types: [t0.G, java.lang.Object] */
    public LinearLayoutManager(int i4) {
        this.f8889p = 1;
        this.f8893t = false;
        this.f8894u = false;
        this.f8895v = false;
        this.f8896w = true;
        this.f8897x = -1;
        this.f8898y = Integer.MIN_VALUE;
        this.f8899z = null;
        this.f8885A = new F();
        this.f8886B = new Object();
        this.f8887C = 2;
        this.f8888D = new int[2];
        i1(i4);
        c(null);
        if (this.f8893t) {
            this.f8893t = false;
            t0();
        }
    }

    @Override // t0.AbstractC1537c0
    public final boolean D0() {
        if (this.f14820m != 1073741824 && this.f14819l != 1073741824) {
            int v8 = v();
            for (int i4 = 0; i4 < v8; i4++) {
                ViewGroup.LayoutParams layoutParams = u(i4).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t0.AbstractC1537c0
    public void F0(RecyclerView recyclerView, int i4) {
        J j = new J(recyclerView.getContext());
        j.f14762a = i4;
        G0(j);
    }

    @Override // t0.AbstractC1537c0
    public boolean H0() {
        if (this.f8899z == null && this.f8892s == this.f8895v) {
            return true;
        }
        return false;
    }

    public void I0(o0 o0Var, int[] iArr) {
        int i4;
        int i8;
        if (o0Var.f14912a != -1) {
            i4 = this.f8891r.n();
        } else {
            i4 = 0;
        }
        if (this.f8890q.f14754f == -1) {
            i8 = 0;
        } else {
            i8 = i4;
            i4 = 0;
        }
        iArr[0] = i4;
        iArr[1] = i8;
    }

    public void J0(o0 o0Var, H h8, C0787g c0787g) {
        int i4 = h8.f14752d;
        if (i4 >= 0 && i4 < o0Var.b()) {
            c0787g.b(i4, Math.max(0, h8.f14755g));
        }
    }

    public final int K0(o0 o0Var) {
        if (v() == 0) {
            return 0;
        }
        O0();
        g gVar = this.f8891r;
        boolean z8 = !this.f8896w;
        return AbstractC1534b.c(o0Var, gVar, R0(z8), Q0(z8), this, this.f8896w);
    }

    public final int L0(o0 o0Var) {
        if (v() == 0) {
            return 0;
        }
        O0();
        g gVar = this.f8891r;
        boolean z8 = !this.f8896w;
        return AbstractC1534b.d(o0Var, gVar, R0(z8), Q0(z8), this, this.f8896w, this.f8894u);
    }

    public final int M0(o0 o0Var) {
        if (v() == 0) {
            return 0;
        }
        O0();
        g gVar = this.f8891r;
        boolean z8 = !this.f8896w;
        return AbstractC1534b.e(o0Var, gVar, R0(z8), Q0(z8), this, this.f8896w);
    }

    public final int N0(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 17) {
                    if (i4 != 33) {
                        if (i4 != 66) {
                            if (i4 == 130 && this.f8889p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.f8889p == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.f8889p == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.f8889p == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.f8889p != 1 && a1()) {
                return -1;
            }
            return 1;
        }
        if (this.f8889p == 1 || !a1()) {
            return -1;
        }
        return 1;
    }

    @Override // t0.AbstractC1537c0
    public final boolean O() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [t0.H, java.lang.Object] */
    public final void O0() {
        if (this.f8890q == null) {
            ?? obj = new Object();
            obj.f14749a = true;
            obj.f14756h = 0;
            obj.f14757i = 0;
            obj.k = null;
            this.f8890q = obj;
        }
    }

    @Override // t0.AbstractC1537c0
    public final boolean P() {
        return this.f8893t;
    }

    public final int P0(j0 j0Var, H h8, o0 o0Var, boolean z8) {
        int i4;
        int i8 = h8.f14751c;
        int i9 = h8.f14755g;
        if (i9 != Integer.MIN_VALUE) {
            if (i8 < 0) {
                h8.f14755g = i9 + i8;
            }
            d1(j0Var, h8);
        }
        int i10 = h8.f14751c + h8.f14756h;
        while (true) {
            if ((!h8.f14758l && i10 <= 0) || (i4 = h8.f14752d) < 0 || i4 >= o0Var.b()) {
                break;
            }
            G g8 = this.f8886B;
            g8.f14745a = 0;
            g8.f14746b = false;
            g8.f14747c = false;
            g8.f14748d = false;
            b1(j0Var, o0Var, h8, g8);
            if (!g8.f14746b) {
                int i11 = h8.f14750b;
                int i12 = g8.f14745a;
                h8.f14750b = (h8.f14754f * i12) + i11;
                if (!g8.f14747c || h8.k != null || !o0Var.f14918g) {
                    h8.f14751c -= i12;
                    i10 -= i12;
                }
                int i13 = h8.f14755g;
                if (i13 != Integer.MIN_VALUE) {
                    int i14 = i13 + i12;
                    h8.f14755g = i14;
                    int i15 = h8.f14751c;
                    if (i15 < 0) {
                        h8.f14755g = i14 + i15;
                    }
                    d1(j0Var, h8);
                }
                if (z8 && g8.f14748d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i8 - h8.f14751c;
    }

    public final View Q0(boolean z8) {
        if (this.f8894u) {
            return U0(0, v(), z8);
        }
        return U0(v() - 1, -1, z8);
    }

    public final View R0(boolean z8) {
        if (this.f8894u) {
            return U0(v() - 1, -1, z8);
        }
        return U0(0, v(), z8);
    }

    public final int S0() {
        View U02 = U0(v() - 1, -1, false);
        if (U02 == null) {
            return -1;
        }
        return AbstractC1537c0.K(U02);
    }

    public final View T0(int i4, int i8) {
        int i9;
        int i10;
        O0();
        if (i8 > i4 || i8 < i4) {
            if (this.f8891r.g(u(i4)) < this.f8891r.m()) {
                i9 = 16644;
                i10 = 16388;
            } else {
                i9 = 4161;
                i10 = 4097;
            }
            if (this.f8889p == 0) {
                return this.f14812c.i(i4, i8, i9, i10);
            }
            return this.f14813d.i(i4, i8, i9, i10);
        }
        return u(i4);
    }

    public final View U0(int i4, int i8, boolean z8) {
        int i9;
        O0();
        if (z8) {
            i9 = 24579;
        } else {
            i9 = 320;
        }
        if (this.f8889p == 0) {
            return this.f14812c.i(i4, i8, i9, 320);
        }
        return this.f14813d.i(i4, i8, i9, 320);
    }

    public View V0(j0 j0Var, o0 o0Var, boolean z8, boolean z9) {
        int i4;
        int i8;
        int i9;
        boolean z10;
        boolean z11;
        O0();
        int v8 = v();
        if (z9) {
            i8 = v() - 1;
            i4 = -1;
            i9 = -1;
        } else {
            i4 = v8;
            i8 = 0;
            i9 = 1;
        }
        int b4 = o0Var.b();
        int m6 = this.f8891r.m();
        int i10 = this.f8891r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i8 != i4) {
            View u8 = u(i8);
            int K = AbstractC1537c0.K(u8);
            int g8 = this.f8891r.g(u8);
            int d2 = this.f8891r.d(u8);
            if (K >= 0 && K < b4) {
                if (((d0) u8.getLayoutParams()).f14827a.j()) {
                    if (view3 == null) {
                        view3 = u8;
                    }
                } else {
                    if (d2 <= m6 && g8 < m6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g8 >= i10 && d2 > i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z10 && !z11) {
                        return u8;
                    }
                    if (z8) {
                        if (!z11) {
                            if (view != null) {
                            }
                            view = u8;
                        }
                        view2 = u8;
                    } else {
                        if (!z10) {
                            if (view != null) {
                            }
                            view = u8;
                        }
                        view2 = u8;
                    }
                }
            }
            i8 += i9;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public final int W0(int i4, j0 j0Var, o0 o0Var, boolean z8) {
        int i8;
        int i9 = this.f8891r.i() - i4;
        if (i9 > 0) {
            int i10 = -g1(-i9, j0Var, o0Var);
            int i11 = i4 + i10;
            if (z8 && (i8 = this.f8891r.i() - i11) > 0) {
                this.f8891r.q(i8);
                return i8 + i10;
            }
            return i10;
        }
        return 0;
    }

    @Override // t0.AbstractC1537c0
    public View X(View view, int i4, j0 j0Var, o0 o0Var) {
        int N02;
        View T02;
        View Y02;
        f1();
        if (v() != 0 && (N02 = N0(i4)) != Integer.MIN_VALUE) {
            O0();
            k1(N02, (int) (this.f8891r.n() * 0.33333334f), false, o0Var);
            H h8 = this.f8890q;
            h8.f14755g = Integer.MIN_VALUE;
            h8.f14749a = false;
            P0(j0Var, h8, o0Var, true);
            if (N02 == -1) {
                if (this.f8894u) {
                    T02 = T0(v() - 1, -1);
                } else {
                    T02 = T0(0, v());
                }
            } else if (this.f8894u) {
                T02 = T0(0, v());
            } else {
                T02 = T0(v() - 1, -1);
            }
            if (N02 == -1) {
                Y02 = Z0();
            } else {
                Y02 = Y0();
            }
            if (Y02.hasFocusable()) {
                if (T02 != null) {
                    return Y02;
                }
            } else {
                return T02;
            }
        }
        return null;
    }

    public final int X0(int i4, j0 j0Var, o0 o0Var, boolean z8) {
        int m6;
        int m8 = i4 - this.f8891r.m();
        if (m8 > 0) {
            int i8 = -g1(m8, j0Var, o0Var);
            int i9 = i4 + i8;
            if (z8 && (m6 = i9 - this.f8891r.m()) > 0) {
                this.f8891r.q(-m6);
                return i8 - m6;
            }
            return i8;
        }
        return 0;
    }

    @Override // t0.AbstractC1537c0
    public final void Y(AccessibilityEvent accessibilityEvent) {
        int K;
        super.Y(accessibilityEvent);
        if (v() > 0) {
            View U02 = U0(0, v(), false);
            if (U02 == null) {
                K = -1;
            } else {
                K = AbstractC1537c0.K(U02);
            }
            accessibilityEvent.setFromIndex(K);
            accessibilityEvent.setToIndex(S0());
        }
    }

    public final View Y0() {
        int v8;
        if (this.f8894u) {
            v8 = 0;
        } else {
            v8 = v() - 1;
        }
        return u(v8);
    }

    @Override // t0.AbstractC1537c0
    public void Z(j0 j0Var, o0 o0Var, Q.g gVar) {
        super.Z(j0Var, o0Var, gVar);
        U u8 = this.f14811b.f8960p;
        if (u8 != null && u8.a() > 0) {
            gVar.b(f.k);
        }
    }

    public final View Z0() {
        int i4;
        if (this.f8894u) {
            i4 = v() - 1;
        } else {
            i4 = 0;
        }
        return u(i4);
    }

    @Override // t0.n0
    public final PointF a(int i4) {
        if (v() == 0) {
            return null;
        }
        boolean z8 = false;
        int i8 = 1;
        if (i4 < AbstractC1537c0.K(u(0))) {
            z8 = true;
        }
        if (z8 != this.f8894u) {
            i8 = -1;
        }
        if (this.f8889p == 0) {
            return new PointF(i8, 0.0f);
        }
        return new PointF(0.0f, i8);
    }

    public final boolean a1() {
        if (this.f14811b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void b1(j0 j0Var, o0 o0Var, H h8, G g8) {
        boolean z8;
        int i4;
        int i8;
        int i9;
        int i10;
        boolean z9;
        View b4 = h8.b(j0Var);
        if (b4 == null) {
            g8.f14746b = true;
            return;
        }
        d0 d0Var = (d0) b4.getLayoutParams();
        if (h8.k == null) {
            boolean z10 = this.f8894u;
            if (h8.f14754f == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z10 == z9) {
                b(b4, -1, false);
            } else {
                b(b4, 0, false);
            }
        } else {
            boolean z11 = this.f8894u;
            if (h8.f14754f == -1) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z11 == z8) {
                b(b4, -1, true);
            } else {
                b(b4, 0, true);
            }
        }
        d0 d0Var2 = (d0) b4.getLayoutParams();
        Rect P4 = this.f14811b.P(b4);
        int i11 = P4.left + P4.right;
        int i12 = P4.top + P4.bottom;
        int w8 = AbstractC1537c0.w(d(), this.f14821n, this.f14819l, I() + H() + ((ViewGroup.MarginLayoutParams) d0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) d0Var2).rightMargin + i11, ((ViewGroup.MarginLayoutParams) d0Var2).width);
        int w9 = AbstractC1537c0.w(e(), this.f14822o, this.f14820m, G() + J() + ((ViewGroup.MarginLayoutParams) d0Var2).topMargin + ((ViewGroup.MarginLayoutParams) d0Var2).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) d0Var2).height);
        if (C0(b4, w8, w9, d0Var2)) {
            b4.measure(w8, w9);
        }
        g8.f14745a = this.f8891r.e(b4);
        if (this.f8889p == 1) {
            if (a1()) {
                i10 = this.f14821n - I();
                i4 = i10 - this.f8891r.f(b4);
            } else {
                i4 = H();
                i10 = this.f8891r.f(b4) + i4;
            }
            if (h8.f14754f == -1) {
                i8 = h8.f14750b;
                i9 = i8 - g8.f14745a;
            } else {
                i9 = h8.f14750b;
                i8 = g8.f14745a + i9;
            }
        } else {
            int J6 = J();
            int f8 = this.f8891r.f(b4) + J6;
            if (h8.f14754f == -1) {
                int i13 = h8.f14750b;
                int i14 = i13 - g8.f14745a;
                i10 = i13;
                i8 = f8;
                i4 = i14;
                i9 = J6;
            } else {
                int i15 = h8.f14750b;
                int i16 = g8.f14745a + i15;
                i4 = i15;
                i8 = f8;
                i9 = J6;
                i10 = i16;
            }
        }
        AbstractC1537c0.R(b4, i4, i9, i10, i8);
        if (d0Var.f14827a.j() || d0Var.f14827a.m()) {
            g8.f14747c = true;
        }
        g8.f14748d = b4.hasFocusable();
    }

    @Override // t0.AbstractC1537c0
    public final void c(String str) {
        if (this.f8899z == null) {
            super.c(str);
        }
    }

    @Override // t0.AbstractC1537c0
    public final boolean d() {
        if (this.f8889p == 0) {
            return true;
        }
        return false;
    }

    public final void d1(j0 j0Var, H h8) {
        if (h8.f14749a && !h8.f14758l) {
            int i4 = h8.f14755g;
            int i8 = h8.f14757i;
            if (h8.f14754f == -1) {
                int v8 = v();
                if (i4 >= 0) {
                    int h9 = (this.f8891r.h() - i4) + i8;
                    if (this.f8894u) {
                        for (int i9 = 0; i9 < v8; i9++) {
                            View u8 = u(i9);
                            if (this.f8891r.g(u8) < h9 || this.f8891r.p(u8) < h9) {
                                e1(j0Var, 0, i9);
                                return;
                            }
                        }
                        return;
                    }
                    int i10 = v8 - 1;
                    for (int i11 = i10; i11 >= 0; i11--) {
                        View u9 = u(i11);
                        if (this.f8891r.g(u9) < h9 || this.f8891r.p(u9) < h9) {
                            e1(j0Var, i10, i11);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i4 >= 0) {
                int i12 = i4 - i8;
                int v9 = v();
                if (this.f8894u) {
                    int i13 = v9 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View u10 = u(i14);
                        if (this.f8891r.d(u10) > i12 || this.f8891r.o(u10) > i12) {
                            e1(j0Var, i13, i14);
                            return;
                        }
                    }
                    return;
                }
                for (int i15 = 0; i15 < v9; i15++) {
                    View u11 = u(i15);
                    if (this.f8891r.d(u11) > i12 || this.f8891r.o(u11) > i12) {
                        e1(j0Var, 0, i15);
                        return;
                    }
                }
            }
        }
    }

    @Override // t0.AbstractC1537c0
    public final boolean e() {
        if (this.f8889p == 1) {
            return true;
        }
        return false;
    }

    public final void e1(j0 j0Var, int i4, int i8) {
        if (i4 != i8) {
            if (i8 > i4) {
                for (int i9 = i8 - 1; i9 >= i4; i9--) {
                    q0(i9, j0Var);
                }
                return;
            }
            while (i4 > i8) {
                q0(i4, j0Var);
                i4--;
            }
        }
    }

    public final void f1() {
        if (this.f8889p != 1 && a1()) {
            this.f8894u = !this.f8893t;
        } else {
            this.f8894u = this.f8893t;
        }
    }

    public final int g1(int i4, j0 j0Var, o0 o0Var) {
        int i8;
        if (v() != 0 && i4 != 0) {
            O0();
            this.f8890q.f14749a = true;
            if (i4 > 0) {
                i8 = 1;
            } else {
                i8 = -1;
            }
            int abs = Math.abs(i4);
            k1(i8, abs, true, o0Var);
            H h8 = this.f8890q;
            int P02 = P0(j0Var, h8, o0Var, false) + h8.f14755g;
            if (P02 >= 0) {
                if (abs > P02) {
                    i4 = i8 * P02;
                }
                this.f8891r.q(-i4);
                this.f8890q.j = i4;
                return i4;
            }
        }
        return 0;
    }

    @Override // t0.AbstractC1537c0
    public final void h(int i4, int i8, o0 o0Var, C0787g c0787g) {
        int i9;
        if (this.f8889p != 0) {
            i4 = i8;
        }
        if (v() != 0 && i4 != 0) {
            O0();
            if (i4 > 0) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            k1(i9, Math.abs(i4), true, o0Var);
            J0(o0Var, this.f8890q, c0787g);
        }
    }

    @Override // t0.AbstractC1537c0
    public void h0(j0 j0Var, o0 o0Var) {
        View view;
        int i4;
        View view2;
        View V02;
        boolean z8;
        boolean z9;
        int i8;
        boolean z10;
        boolean z11;
        int g8;
        int n3;
        int i9;
        boolean z12;
        int i10;
        int i11;
        List list;
        boolean z13;
        int i12;
        int i13;
        int W02;
        int i14;
        View q6;
        int g9;
        int i15;
        int i16;
        int i17 = -1;
        if ((this.f8899z != null || this.f8897x != -1) && o0Var.b() == 0) {
            n0(j0Var);
            return;
        }
        I i18 = this.f8899z;
        if (i18 != null && (i16 = i18.f14759d) >= 0) {
            this.f8897x = i16;
        }
        O0();
        this.f8890q.f14749a = false;
        f1();
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f14810a.f5432e).contains(view)) {
            view = null;
        }
        F f8 = this.f8885A;
        if (f8.f14744e && this.f8897x == -1 && this.f8899z == null) {
            if (view != null && (this.f8891r.g(view) >= this.f8891r.i() || this.f8891r.d(view) <= this.f8891r.m())) {
                f8.c(view, AbstractC1537c0.K(view));
            }
        } else {
            f8.d();
            f8.f14743d = this.f8894u ^ this.f8895v;
            if (!o0Var.f14918g && (i8 = this.f8897x) != -1) {
                if (i8 >= 0 && i8 < o0Var.b()) {
                    int i19 = this.f8897x;
                    f8.f14741b = i19;
                    I i20 = this.f8899z;
                    if (i20 != null && i20.f14759d >= 0) {
                        boolean z14 = i20.f14761f;
                        f8.f14743d = z14;
                        if (z14) {
                            f8.f14742c = this.f8891r.i() - this.f8899z.f14760e;
                        } else {
                            f8.f14742c = this.f8891r.m() + this.f8899z.f14760e;
                        }
                    } else if (this.f8898y == Integer.MIN_VALUE) {
                        View q8 = q(i19);
                        if (q8 != null) {
                            if (this.f8891r.e(q8) > this.f8891r.n()) {
                                f8.a();
                            } else if (this.f8891r.g(q8) - this.f8891r.m() < 0) {
                                f8.f14742c = this.f8891r.m();
                                f8.f14743d = false;
                            } else if (this.f8891r.i() - this.f8891r.d(q8) < 0) {
                                f8.f14742c = this.f8891r.i();
                                f8.f14743d = true;
                            } else {
                                if (f8.f14743d) {
                                    int d2 = this.f8891r.d(q8);
                                    g gVar = this.f8891r;
                                    if (Integer.MIN_VALUE == gVar.f9382a) {
                                        n3 = 0;
                                    } else {
                                        n3 = gVar.n() - gVar.f9382a;
                                    }
                                    g8 = n3 + d2;
                                } else {
                                    g8 = this.f8891r.g(q8);
                                }
                                f8.f14742c = g8;
                            }
                        } else {
                            if (v() > 0) {
                                if (this.f8897x < AbstractC1537c0.K(u(0))) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 == this.f8894u) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                f8.f14743d = z11;
                            }
                            f8.a();
                        }
                    } else {
                        boolean z15 = this.f8894u;
                        f8.f14743d = z15;
                        if (z15) {
                            f8.f14742c = this.f8891r.i() - this.f8898y;
                        } else {
                            f8.f14742c = this.f8891r.m() + this.f8898y;
                        }
                    }
                    f8.f14744e = true;
                } else {
                    this.f8897x = -1;
                    this.f8898y = Integer.MIN_VALUE;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f14811b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f14810a.f5432e).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    d0 d0Var = (d0) view2.getLayoutParams();
                    if (!d0Var.f14827a.j() && d0Var.f14827a.d() >= 0 && d0Var.f14827a.d() < o0Var.b()) {
                        f8.c(view2, AbstractC1537c0.K(view2));
                        f8.f14744e = true;
                    }
                }
                boolean z16 = this.f8892s;
                boolean z17 = this.f8895v;
                if (z16 == z17 && (V02 = V0(j0Var, o0Var, f8.f14743d, z17)) != null) {
                    f8.b(V02, AbstractC1537c0.K(V02));
                    if (!o0Var.f14918g && H0()) {
                        int g10 = this.f8891r.g(V02);
                        int d3 = this.f8891r.d(V02);
                        int m6 = this.f8891r.m();
                        int i21 = this.f8891r.i();
                        if (d3 <= m6 && g10 < m6) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (g10 >= i21 && d3 > i21) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z8 || z9) {
                            if (f8.f14743d) {
                                m6 = i21;
                            }
                            f8.f14742c = m6;
                        }
                    }
                    f8.f14744e = true;
                }
            }
            f8.a();
            if (this.f8895v) {
                i4 = o0Var.b() - 1;
            } else {
                i4 = 0;
            }
            f8.f14741b = i4;
            f8.f14744e = true;
        }
        H h8 = this.f8890q;
        if (h8.j >= 0) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        h8.f14754f = i9;
        int[] iArr = this.f8888D;
        iArr[0] = 0;
        iArr[1] = 0;
        I0(o0Var, iArr);
        int m8 = this.f8891r.m() + Math.max(0, iArr[0]);
        int j = this.f8891r.j() + Math.max(0, iArr[1]);
        if (o0Var.f14918g && (i14 = this.f8897x) != -1 && this.f8898y != Integer.MIN_VALUE && (q6 = q(i14)) != null) {
            if (this.f8894u) {
                i15 = this.f8891r.i() - this.f8891r.d(q6);
                g9 = this.f8898y;
            } else {
                g9 = this.f8891r.g(q6) - this.f8891r.m();
                i15 = this.f8898y;
            }
            int i22 = i15 - g9;
            if (i22 > 0) {
                m8 += i22;
            } else {
                j -= i22;
            }
        }
        if (!f8.f14743d ? !this.f8894u : this.f8894u) {
            i17 = 1;
        }
        c1(j0Var, o0Var, f8, i17);
        p(j0Var);
        H h9 = this.f8890q;
        if (this.f8891r.k() == 0 && this.f8891r.h() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        h9.f14758l = z12;
        this.f8890q.getClass();
        this.f8890q.f14757i = 0;
        if (f8.f14743d) {
            m1(f8.f14741b, f8.f14742c);
            H h10 = this.f8890q;
            h10.f14756h = m8;
            P0(j0Var, h10, o0Var, false);
            H h11 = this.f8890q;
            i11 = h11.f14750b;
            int i23 = h11.f14752d;
            int i24 = h11.f14751c;
            if (i24 > 0) {
                j += i24;
            }
            l1(f8.f14741b, f8.f14742c);
            H h12 = this.f8890q;
            h12.f14756h = j;
            h12.f14752d += h12.f14753e;
            P0(j0Var, h12, o0Var, false);
            H h13 = this.f8890q;
            i10 = h13.f14750b;
            int i25 = h13.f14751c;
            if (i25 > 0) {
                m1(i23, i11);
                H h14 = this.f8890q;
                h14.f14756h = i25;
                P0(j0Var, h14, o0Var, false);
                i11 = this.f8890q.f14750b;
            }
        } else {
            l1(f8.f14741b, f8.f14742c);
            H h15 = this.f8890q;
            h15.f14756h = j;
            P0(j0Var, h15, o0Var, false);
            H h16 = this.f8890q;
            i10 = h16.f14750b;
            int i26 = h16.f14752d;
            int i27 = h16.f14751c;
            if (i27 > 0) {
                m8 += i27;
            }
            m1(f8.f14741b, f8.f14742c);
            H h17 = this.f8890q;
            h17.f14756h = m8;
            h17.f14752d += h17.f14753e;
            P0(j0Var, h17, o0Var, false);
            H h18 = this.f8890q;
            int i28 = h18.f14750b;
            int i29 = h18.f14751c;
            if (i29 > 0) {
                l1(i26, i10);
                H h19 = this.f8890q;
                h19.f14756h = i29;
                P0(j0Var, h19, o0Var, false);
                i10 = this.f8890q.f14750b;
            }
            i11 = i28;
        }
        if (v() > 0) {
            if (this.f8894u ^ this.f8895v) {
                int W03 = W0(i10, j0Var, o0Var, true);
                i12 = i11 + W03;
                i13 = i10 + W03;
                W02 = X0(i12, j0Var, o0Var, false);
            } else {
                int X02 = X0(i11, j0Var, o0Var, true);
                i12 = i11 + X02;
                i13 = i10 + X02;
                W02 = W0(i13, j0Var, o0Var, false);
            }
            i11 = i12 + W02;
            i10 = i13 + W02;
        }
        if (o0Var.k && v() != 0 && !o0Var.f14918g && H0()) {
            List list2 = j0Var.f14869d;
            int size = list2.size();
            int K = AbstractC1537c0.K(u(0));
            int i30 = 0;
            int i31 = 0;
            for (int i32 = 0; i32 < size; i32++) {
                s0 s0Var = (s0) list2.get(i32);
                boolean j5 = s0Var.j();
                View view3 = s0Var.f14950a;
                if (!j5) {
                    if (s0Var.d() < K) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13 != this.f8894u) {
                        i30 += this.f8891r.e(view3);
                    } else {
                        i31 += this.f8891r.e(view3);
                    }
                }
            }
            this.f8890q.k = list2;
            if (i30 > 0) {
                m1(AbstractC1537c0.K(Z0()), i11);
                H h20 = this.f8890q;
                h20.f14756h = i30;
                h20.f14751c = 0;
                h20.a(null);
                P0(j0Var, this.f8890q, o0Var, false);
            }
            if (i31 > 0) {
                l1(AbstractC1537c0.K(Y0()), i10);
                H h21 = this.f8890q;
                h21.f14756h = i31;
                h21.f14751c = 0;
                list = null;
                h21.a(null);
                P0(j0Var, this.f8890q, o0Var, false);
            } else {
                list = null;
            }
            this.f8890q.k = list;
        }
        if (!o0Var.f14918g) {
            g gVar2 = this.f8891r;
            gVar2.f9382a = gVar2.n();
        } else {
            f8.d();
        }
        this.f8892s = this.f8895v;
    }

    public final void h1(int i4, int i8) {
        this.f8897x = i4;
        this.f8898y = i8;
        I i9 = this.f8899z;
        if (i9 != null) {
            i9.f14759d = -1;
        }
        t0();
    }

    @Override // t0.AbstractC1537c0
    public final void i(int i4, C0787g c0787g) {
        boolean z8;
        int i8;
        I i9 = this.f8899z;
        int i10 = -1;
        if (i9 != null && (i8 = i9.f14759d) >= 0) {
            z8 = i9.f14761f;
        } else {
            f1();
            z8 = this.f8894u;
            i8 = this.f8897x;
            if (i8 == -1) {
                i8 = z8 ? i4 - 1 : 0;
            }
        }
        if (!z8) {
            i10 = 1;
        }
        for (int i11 = 0; i11 < this.f8887C && i8 >= 0 && i8 < i4; i11++) {
            c0787g.b(i8, 0);
            i8 += i10;
        }
    }

    @Override // t0.AbstractC1537c0
    public void i0(o0 o0Var) {
        this.f8899z = null;
        this.f8897x = -1;
        this.f8898y = Integer.MIN_VALUE;
        this.f8885A.d();
    }

    public final void i1(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(j.l("invalid orientation:", i4));
        }
        c(null);
        if (i4 == this.f8889p && this.f8891r != null) {
            return;
        }
        g b4 = g.b(this, i4);
        this.f8891r = b4;
        this.f8885A.f14740a = b4;
        this.f8889p = i4;
        t0();
    }

    @Override // t0.AbstractC1537c0
    public final int j(o0 o0Var) {
        return K0(o0Var);
    }

    @Override // t0.AbstractC1537c0
    public final void j0(Parcelable parcelable) {
        if (parcelable instanceof I) {
            I i4 = (I) parcelable;
            this.f8899z = i4;
            if (this.f8897x != -1) {
                i4.f14759d = -1;
            }
            t0();
        }
    }

    public void j1(boolean z8) {
        c(null);
        if (this.f8895v == z8) {
            return;
        }
        this.f8895v = z8;
        t0();
    }

    @Override // t0.AbstractC1537c0
    public int k(o0 o0Var) {
        return L0(o0Var);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [t0.I, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [t0.I, android.os.Parcelable, java.lang.Object] */
    @Override // t0.AbstractC1537c0
    public final Parcelable k0() {
        I i4 = this.f8899z;
        if (i4 != null) {
            ?? obj = new Object();
            obj.f14759d = i4.f14759d;
            obj.f14760e = i4.f14760e;
            obj.f14761f = i4.f14761f;
            return obj;
        }
        ?? obj2 = new Object();
        if (v() > 0) {
            O0();
            boolean z8 = this.f8892s ^ this.f8894u;
            obj2.f14761f = z8;
            if (z8) {
                View Y02 = Y0();
                obj2.f14760e = this.f8891r.i() - this.f8891r.d(Y02);
                obj2.f14759d = AbstractC1537c0.K(Y02);
                return obj2;
            }
            View Z02 = Z0();
            obj2.f14759d = AbstractC1537c0.K(Z02);
            obj2.f14760e = this.f8891r.g(Z02) - this.f8891r.m();
            return obj2;
        }
        obj2.f14759d = -1;
        return obj2;
    }

    public final void k1(int i4, int i8, boolean z8, o0 o0Var) {
        boolean z9;
        int i9;
        int m6;
        H h8 = this.f8890q;
        boolean z10 = false;
        int i10 = 1;
        if (this.f8891r.k() == 0 && this.f8891r.h() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        h8.f14758l = z9;
        this.f8890q.f14754f = i4;
        int[] iArr = this.f8888D;
        iArr[0] = 0;
        iArr[1] = 0;
        I0(o0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i4 == 1) {
            z10 = true;
        }
        H h9 = this.f8890q;
        if (z10) {
            i9 = max2;
        } else {
            i9 = max;
        }
        h9.f14756h = i9;
        if (!z10) {
            max = max2;
        }
        h9.f14757i = max;
        if (z10) {
            h9.f14756h = this.f8891r.j() + i9;
            View Y02 = Y0();
            H h10 = this.f8890q;
            if (this.f8894u) {
                i10 = -1;
            }
            h10.f14753e = i10;
            int K = AbstractC1537c0.K(Y02);
            H h11 = this.f8890q;
            h10.f14752d = K + h11.f14753e;
            h11.f14750b = this.f8891r.d(Y02);
            m6 = this.f8891r.d(Y02) - this.f8891r.i();
        } else {
            View Z02 = Z0();
            H h12 = this.f8890q;
            h12.f14756h = this.f8891r.m() + h12.f14756h;
            H h13 = this.f8890q;
            if (!this.f8894u) {
                i10 = -1;
            }
            h13.f14753e = i10;
            int K8 = AbstractC1537c0.K(Z02);
            H h14 = this.f8890q;
            h13.f14752d = K8 + h14.f14753e;
            h14.f14750b = this.f8891r.g(Z02);
            m6 = (-this.f8891r.g(Z02)) + this.f8891r.m();
        }
        H h15 = this.f8890q;
        h15.f14751c = i8;
        if (z8) {
            h15.f14751c = i8 - m6;
        }
        h15.f14755g = m6;
    }

    @Override // t0.AbstractC1537c0
    public int l(o0 o0Var) {
        return M0(o0Var);
    }

    public final void l1(int i4, int i8) {
        int i9;
        this.f8890q.f14751c = this.f8891r.i() - i8;
        H h8 = this.f8890q;
        if (this.f8894u) {
            i9 = -1;
        } else {
            i9 = 1;
        }
        h8.f14753e = i9;
        h8.f14752d = i4;
        h8.f14754f = 1;
        h8.f14750b = i8;
        h8.f14755g = Integer.MIN_VALUE;
    }

    @Override // t0.AbstractC1537c0
    public final int m(o0 o0Var) {
        return K0(o0Var);
    }

    @Override // t0.AbstractC1537c0
    public boolean m0(int i4, Bundle bundle) {
        int min;
        if (super.m0(i4, bundle)) {
            return true;
        }
        if (i4 == 16908343 && bundle != null) {
            if (this.f8889p == 1) {
                int i8 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i8 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f14811b;
                min = Math.min(i8, M(recyclerView.f8943f, recyclerView.f8951k0) - 1);
            } else {
                int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i9 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f14811b;
                min = Math.min(i9, x(recyclerView2.f8943f, recyclerView2.f8951k0) - 1);
            }
            if (min >= 0) {
                h1(min, 0);
                return true;
            }
        }
        return false;
    }

    public final void m1(int i4, int i8) {
        int i9;
        this.f8890q.f14751c = i8 - this.f8891r.m();
        H h8 = this.f8890q;
        h8.f14752d = i4;
        if (this.f8894u) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        h8.f14753e = i9;
        h8.f14754f = -1;
        h8.f14750b = i8;
        h8.f14755g = Integer.MIN_VALUE;
    }

    @Override // t0.AbstractC1537c0
    public int n(o0 o0Var) {
        return L0(o0Var);
    }

    @Override // t0.AbstractC1537c0
    public int o(o0 o0Var) {
        return M0(o0Var);
    }

    @Override // t0.AbstractC1537c0
    public final View q(int i4) {
        int v8 = v();
        if (v8 == 0) {
            return null;
        }
        int K = i4 - AbstractC1537c0.K(u(0));
        if (K >= 0 && K < v8) {
            View u8 = u(K);
            if (AbstractC1537c0.K(u8) == i4) {
                return u8;
            }
        }
        return super.q(i4);
    }

    @Override // t0.AbstractC1537c0
    public d0 r() {
        return new d0(-2, -2);
    }

    @Override // t0.AbstractC1537c0
    public int u0(int i4, j0 j0Var, o0 o0Var) {
        if (this.f8889p == 1) {
            return 0;
        }
        return g1(i4, j0Var, o0Var);
    }

    @Override // t0.AbstractC1537c0
    public final void v0(int i4) {
        this.f8897x = i4;
        this.f8898y = Integer.MIN_VALUE;
        I i8 = this.f8899z;
        if (i8 != null) {
            i8.f14759d = -1;
        }
        t0();
    }

    @Override // t0.AbstractC1537c0
    public int w0(int i4, j0 j0Var, o0 o0Var) {
        if (this.f8889p == 0) {
            return 0;
        }
        return g1(i4, j0Var, o0Var);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [t0.G, java.lang.Object] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i8) {
        this.f8889p = 1;
        this.f8893t = false;
        this.f8894u = false;
        this.f8895v = false;
        this.f8896w = true;
        this.f8897x = -1;
        this.f8898y = Integer.MIN_VALUE;
        this.f8899z = null;
        this.f8885A = new F();
        this.f8886B = new Object();
        this.f8887C = 2;
        this.f8888D = new int[2];
        C1535b0 L8 = AbstractC1537c0.L(context, attributeSet, i4, i8);
        i1(L8.f14803a);
        boolean z8 = L8.f14805c;
        c(null);
        if (z8 != this.f8893t) {
            this.f8893t = z8;
            t0();
        }
        j1(L8.f14806d);
    }

    @Override // t0.AbstractC1537c0
    public final void W(RecyclerView recyclerView) {
    }

    public void c1(j0 j0Var, o0 o0Var, F f8, int i4) {
    }
}
