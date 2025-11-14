package androidx.recyclerview.widget;

import L5.x;
import O7.C0235h;
import P.O;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import c0.g;
import g5.C0787g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import t.i;
import t0.AbstractC1534b;
import t0.AbstractC1537c0;
import t0.C1531E;
import t0.C1535b0;
import t0.C1536c;
import t0.J;
import t0.d0;
import t0.j0;
import t0.n0;
import t0.o0;
import t0.w0;
import t0.x0;
import t0.y0;
import t0.z0;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC1537c0 implements n0 {

    /* renamed from: B, reason: collision with root package name */
    public final C1536c f8983B;

    /* renamed from: C, reason: collision with root package name */
    public final int f8984C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f8985D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8986E;

    /* renamed from: F, reason: collision with root package name */
    public z0 f8987F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f8988G;

    /* renamed from: H, reason: collision with root package name */
    public final w0 f8989H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f8990I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f8991J;
    public final x K;

    /* renamed from: p, reason: collision with root package name */
    public final int f8992p;

    /* renamed from: q, reason: collision with root package name */
    public final i[] f8993q;

    /* renamed from: r, reason: collision with root package name */
    public final g f8994r;

    /* renamed from: s, reason: collision with root package name */
    public final g f8995s;

    /* renamed from: t, reason: collision with root package name */
    public final int f8996t;

    /* renamed from: u, reason: collision with root package name */
    public int f8997u;

    /* renamed from: v, reason: collision with root package name */
    public final C1531E f8998v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8999w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f9001y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9000x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f9002z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f8982A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r6v3, types: [t0.E, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i8) {
        this.f8992p = -1;
        this.f8999w = false;
        C1536c c1536c = new C1536c(1);
        this.f8983B = c1536c;
        this.f8984C = 2;
        this.f8988G = new Rect();
        this.f8989H = new w0(this);
        this.f8990I = true;
        this.K = new x(13, this);
        C1535b0 L8 = AbstractC1537c0.L(context, attributeSet, i4, i8);
        int i9 = L8.f14803a;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i9 != this.f8996t) {
            this.f8996t = i9;
            g gVar = this.f8994r;
            this.f8994r = this.f8995s;
            this.f8995s = gVar;
            t0();
        }
        int i10 = L8.f14804b;
        c(null);
        if (i10 != this.f8992p) {
            c1536c.f();
            t0();
            this.f8992p = i10;
            this.f9001y = new BitSet(this.f8992p);
            this.f8993q = new i[this.f8992p];
            for (int i11 = 0; i11 < this.f8992p; i11++) {
                this.f8993q[i11] = new i(this, i11);
            }
            t0();
        }
        boolean z8 = L8.f14805c;
        c(null);
        z0 z0Var = this.f8987F;
        if (z0Var != null && z0Var.k != z8) {
            z0Var.k = z8;
        }
        this.f8999w = z8;
        t0();
        ?? obj = new Object();
        obj.f14731a = true;
        obj.f14736f = 0;
        obj.f14737g = 0;
        this.f8998v = obj;
        this.f8994r = g.b(this, this.f8996t);
        this.f8995s = g.b(this, 1 - this.f8996t);
    }

    public static int i1(int i4, int i8, int i9) {
        int mode;
        if ((i8 == 0 && i9 == 0) || ((mode = View.MeasureSpec.getMode(i4)) != Integer.MIN_VALUE && mode != 1073741824)) {
            return i4;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - i8) - i9), mode);
    }

    @Override // t0.AbstractC1537c0
    public final void F0(RecyclerView recyclerView, int i4) {
        J j = new J(recyclerView.getContext());
        j.f14762a = i4;
        G0(j);
    }

    @Override // t0.AbstractC1537c0
    public final boolean H0() {
        if (this.f8987F == null) {
            return true;
        }
        return false;
    }

    public final boolean I0() {
        int P02;
        if (v() != 0 && this.f8984C != 0 && this.f14816g) {
            if (this.f9000x) {
                P02 = Q0();
                P0();
            } else {
                P02 = P0();
                Q0();
            }
            if (P02 == 0 && U0() != null) {
                this.f8983B.f();
                this.f14815f = true;
                t0();
                return true;
            }
        }
        return false;
    }

    public final int J0(o0 o0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z8 = !this.f8990I;
        return AbstractC1534b.d(o0Var, this.f8994r, M0(z8), L0(z8), this, this.f8990I, this.f9000x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x026e, code lost:
    
        a1(r20, r3);
     */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int K0(j0 j0Var, C1531E c1531e, o0 o0Var) {
        int i4;
        int m6;
        int R02;
        int i8;
        i iVar;
        ?? r8;
        int i9;
        int e9;
        int m8;
        int e10;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1;
        this.f9001y.set(0, this.f8992p, true);
        C1531E c1531e2 = this.f8998v;
        if (c1531e2.f14739i) {
            if (c1531e.f14735e == 1) {
                i4 = Integer.MAX_VALUE;
            } else {
                i4 = Integer.MIN_VALUE;
            }
        } else if (c1531e.f14735e == 1) {
            i4 = c1531e.f14737g + c1531e.f14732b;
        } else {
            i4 = c1531e.f14736f - c1531e.f14732b;
        }
        int i15 = c1531e.f14735e;
        for (int i16 = 0; i16 < this.f8992p; i16++) {
            if (!((ArrayList) this.f8993q[i16].f14666f).isEmpty()) {
                h1(this.f8993q[i16], i15, i4);
            }
        }
        if (this.f9000x) {
            m6 = this.f8994r.i();
        } else {
            m6 = this.f8994r.m();
        }
        boolean z8 = false;
        while (true) {
            int i17 = c1531e.f14733c;
            if (i17 < 0 || i17 >= o0Var.b() || (!c1531e2.f14739i && this.f9001y.isEmpty())) {
                break;
            }
            View view = j0Var.k(c1531e.f14733c, Long.MAX_VALUE).f14950a;
            c1531e.f14733c += c1531e.f14734d;
            x0 x0Var = (x0) view.getLayoutParams();
            int d2 = x0Var.f14827a.d();
            C1536c c1536c = this.f8983B;
            int[] iArr = (int[]) c1536c.f14808e;
            if (iArr != null && d2 < iArr.length) {
                i8 = iArr[d2];
            } else {
                i8 = -1;
            }
            if (i8 == -1) {
                if (Y0(c1531e.f14735e)) {
                    i12 = this.f8992p - i14;
                    i11 = -1;
                    i10 = -1;
                } else {
                    i10 = i14;
                    i11 = this.f8992p;
                    i12 = i13;
                }
                i iVar2 = null;
                if (c1531e.f14735e == i14) {
                    int m9 = this.f8994r.m();
                    int i18 = Integer.MAX_VALUE;
                    while (i12 != i11) {
                        i iVar3 = this.f8993q[i12];
                        int g8 = iVar3.g(m9);
                        if (g8 < i18) {
                            i18 = g8;
                            iVar2 = iVar3;
                        }
                        i12 += i10;
                    }
                } else {
                    int i19 = this.f8994r.i();
                    int i20 = Integer.MIN_VALUE;
                    while (i12 != i11) {
                        i iVar4 = this.f8993q[i12];
                        int i21 = iVar4.i(i19);
                        if (i21 > i20) {
                            iVar2 = iVar4;
                            i20 = i21;
                        }
                        i12 += i10;
                    }
                }
                iVar = iVar2;
                c1536c.h(d2);
                ((int[]) c1536c.f14808e)[d2] = iVar.f14665e;
            } else {
                iVar = this.f8993q[i8];
            }
            x0Var.f15023e = iVar;
            if (c1531e.f14735e == 1) {
                r8 = 0;
                b(view, -1, false);
            } else {
                r8 = 0;
                b(view, 0, false);
            }
            if (this.f8996t == 1) {
                W0(view, AbstractC1537c0.w(r8, this.f8997u, this.f14819l, r8, ((ViewGroup.MarginLayoutParams) x0Var).width), AbstractC1537c0.w(true, this.f14822o, this.f14820m, G() + J(), ((ViewGroup.MarginLayoutParams) x0Var).height));
            } else {
                W0(view, AbstractC1537c0.w(true, this.f14821n, this.f14819l, I() + H(), ((ViewGroup.MarginLayoutParams) x0Var).width), AbstractC1537c0.w(false, this.f8997u, this.f14820m, 0, ((ViewGroup.MarginLayoutParams) x0Var).height));
            }
            if (c1531e.f14735e == 1) {
                e9 = iVar.g(m6);
                i9 = this.f8994r.e(view) + e9;
            } else {
                i9 = iVar.i(m6);
                e9 = i9 - this.f8994r.e(view);
            }
            if (c1531e.f14735e == 1) {
                i iVar5 = x0Var.f15023e;
                iVar5.getClass();
                x0 x0Var2 = (x0) view.getLayoutParams();
                x0Var2.f15023e = iVar5;
                ArrayList arrayList = (ArrayList) iVar5.f14666f;
                arrayList.add(view);
                iVar5.f14663c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    iVar5.f14662b = Integer.MIN_VALUE;
                }
                if (x0Var2.f14827a.j() || x0Var2.f14827a.m()) {
                    iVar5.f14664d = ((StaggeredGridLayoutManager) iVar5.f14667g).f8994r.e(view) + iVar5.f14664d;
                }
            } else {
                i iVar6 = x0Var.f15023e;
                iVar6.getClass();
                x0 x0Var3 = (x0) view.getLayoutParams();
                x0Var3.f15023e = iVar6;
                ArrayList arrayList2 = (ArrayList) iVar6.f14666f;
                arrayList2.add(0, view);
                iVar6.f14662b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    iVar6.f14663c = Integer.MIN_VALUE;
                }
                if (x0Var3.f14827a.j() || x0Var3.f14827a.m()) {
                    iVar6.f14664d = ((StaggeredGridLayoutManager) iVar6.f14667g).f8994r.e(view) + iVar6.f14664d;
                }
            }
            if (V0() && this.f8996t == 1) {
                e10 = this.f8995s.i() - (((this.f8992p - 1) - iVar.f14665e) * this.f8997u);
                m8 = e10 - this.f8995s.e(view);
            } else {
                m8 = this.f8995s.m() + (iVar.f14665e * this.f8997u);
                e10 = this.f8995s.e(view) + m8;
            }
            if (this.f8996t == 1) {
                AbstractC1537c0.R(view, m8, e9, e10, i9);
            } else {
                AbstractC1537c0.R(view, e9, m8, i9, e10);
            }
            h1(iVar, c1531e2.f14735e, i4);
            a1(j0Var, c1531e2);
            if (c1531e2.f14738h && view.hasFocusable()) {
                this.f9001y.set(iVar.f14665e, false);
            }
            i14 = 1;
            z8 = true;
            i13 = 0;
        }
        if (c1531e2.f14735e == -1) {
            R02 = this.f8994r.m() - S0(this.f8994r.m());
        } else {
            R02 = R0(this.f8994r.i()) - this.f8994r.i();
        }
        if (R02 > 0) {
            return Math.min(c1531e.f14732b, R02);
        }
        return 0;
    }

    public final View L0(boolean z8) {
        int m6 = this.f8994r.m();
        int i4 = this.f8994r.i();
        View view = null;
        for (int v8 = v() - 1; v8 >= 0; v8--) {
            View u8 = u(v8);
            int g8 = this.f8994r.g(u8);
            int d2 = this.f8994r.d(u8);
            if (d2 > m6 && g8 < i4) {
                if (d2 > i4 && z8) {
                    if (view == null) {
                        view = u8;
                    }
                } else {
                    return u8;
                }
            }
        }
        return view;
    }

    @Override // t0.AbstractC1537c0
    public final int M(j0 j0Var, o0 o0Var) {
        if (this.f8996t == 0) {
            return Math.min(this.f8992p, o0Var.b());
        }
        return -1;
    }

    public final View M0(boolean z8) {
        int m6 = this.f8994r.m();
        int i4 = this.f8994r.i();
        int v8 = v();
        View view = null;
        for (int i8 = 0; i8 < v8; i8++) {
            View u8 = u(i8);
            int g8 = this.f8994r.g(u8);
            if (this.f8994r.d(u8) > m6 && g8 < i4) {
                if (g8 < m6 && z8) {
                    if (view == null) {
                        view = u8;
                    }
                } else {
                    return u8;
                }
            }
        }
        return view;
    }

    public final void N0(j0 j0Var, o0 o0Var, boolean z8) {
        int i4;
        int R02 = R0(Integer.MIN_VALUE);
        if (R02 != Integer.MIN_VALUE && (i4 = this.f8994r.i() - R02) > 0) {
            int i8 = i4 - (-e1(-i4, j0Var, o0Var));
            if (z8 && i8 > 0) {
                this.f8994r.q(i8);
            }
        }
    }

    @Override // t0.AbstractC1537c0
    public final boolean O() {
        if (this.f8984C != 0) {
            return true;
        }
        return false;
    }

    public final void O0(j0 j0Var, o0 o0Var, boolean z8) {
        int m6;
        int S02 = S0(Integer.MAX_VALUE);
        if (S02 != Integer.MAX_VALUE && (m6 = S02 - this.f8994r.m()) > 0) {
            int e12 = m6 - e1(m6, j0Var, o0Var);
            if (z8 && e12 > 0) {
                this.f8994r.q(-e12);
            }
        }
    }

    @Override // t0.AbstractC1537c0
    public final boolean P() {
        return this.f8999w;
    }

    public final int P0() {
        if (v() == 0) {
            return 0;
        }
        return AbstractC1537c0.K(u(0));
    }

    public final int Q0() {
        int v8 = v();
        if (v8 == 0) {
            return 0;
        }
        return AbstractC1537c0.K(u(v8 - 1));
    }

    public final int R0(int i4) {
        int g8 = this.f8993q[0].g(i4);
        for (int i8 = 1; i8 < this.f8992p; i8++) {
            int g9 = this.f8993q[i8].g(i4);
            if (g9 > g8) {
                g8 = g9;
            }
        }
        return g8;
    }

    @Override // t0.AbstractC1537c0
    public final void S(int i4) {
        super.S(i4);
        for (int i8 = 0; i8 < this.f8992p; i8++) {
            i iVar = this.f8993q[i8];
            int i9 = iVar.f14662b;
            if (i9 != Integer.MIN_VALUE) {
                iVar.f14662b = i9 + i4;
            }
            int i10 = iVar.f14663c;
            if (i10 != Integer.MIN_VALUE) {
                iVar.f14663c = i10 + i4;
            }
        }
    }

    public final int S0(int i4) {
        int i8 = this.f8993q[0].i(i4);
        for (int i9 = 1; i9 < this.f8992p; i9++) {
            int i10 = this.f8993q[i9].i(i4);
            if (i10 < i8) {
                i8 = i10;
            }
        }
        return i8;
    }

    @Override // t0.AbstractC1537c0
    public final void T(int i4) {
        super.T(i4);
        for (int i8 = 0; i8 < this.f8992p; i8++) {
            i iVar = this.f8993q[i8];
            int i9 = iVar.f14662b;
            if (i9 != Integer.MIN_VALUE) {
                iVar.f14662b = i9 + i4;
            }
            int i10 = iVar.f14663c;
            if (i10 != Integer.MIN_VALUE) {
                iVar.f14663c = i10 + i4;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0(int i4, int i8, int i9) {
        int P02;
        int i10;
        int i11;
        C1536c c1536c;
        int[] iArr;
        int Q02;
        ArrayList arrayList;
        y0 y0Var;
        int i12;
        if (this.f9000x) {
            P02 = Q0();
        } else {
            P02 = P0();
        }
        if (i9 == 8) {
            if (i4 < i8) {
                i10 = i8 + 1;
            } else {
                i10 = i4 + 1;
                i11 = i8;
                c1536c = this.f8983B;
                iArr = (int[]) c1536c.f14808e;
                if (iArr != null && i11 < iArr.length) {
                    arrayList = (ArrayList) c1536c.f14809f;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                y0Var = (y0) ((ArrayList) c1536c.f14809f).get(size);
                                if (y0Var.f15026d == i11) {
                                    break;
                                }
                            }
                        }
                        y0Var = null;
                        if (y0Var != null) {
                            ((ArrayList) c1536c.f14809f).remove(y0Var);
                        }
                        int size2 = ((ArrayList) c1536c.f14809f).size();
                        int i13 = 0;
                        while (true) {
                            if (i13 < size2) {
                                if (((y0) ((ArrayList) c1536c.f14809f).get(i13)).f15026d >= i11) {
                                    break;
                                } else {
                                    i13++;
                                }
                            } else {
                                i13 = -1;
                                break;
                            }
                        }
                        if (i13 != -1) {
                            y0 y0Var2 = (y0) ((ArrayList) c1536c.f14809f).get(i13);
                            ((ArrayList) c1536c.f14809f).remove(i13);
                            i12 = y0Var2.f15026d;
                            if (i12 == -1) {
                                int[] iArr2 = (int[]) c1536c.f14808e;
                                Arrays.fill(iArr2, i11, iArr2.length, -1);
                                int length = ((int[]) c1536c.f14808e).length;
                            } else {
                                Arrays.fill((int[]) c1536c.f14808e, i11, Math.min(i12 + 1, ((int[]) c1536c.f14808e).length), -1);
                            }
                        }
                    }
                    i12 = -1;
                    if (i12 == -1) {
                    }
                }
                if (i9 == 1) {
                    if (i9 != 2) {
                        if (i9 == 8) {
                            c1536c.q(i4, 1);
                            c1536c.p(i8, 1);
                        }
                    } else {
                        c1536c.q(i4, i8);
                    }
                } else {
                    c1536c.p(i4, i8);
                }
                if (i10 <= P02) {
                    if (this.f9000x) {
                        Q02 = P0();
                    } else {
                        Q02 = Q0();
                    }
                    if (i11 <= Q02) {
                        t0();
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            i10 = i4 + i8;
        }
        i11 = i4;
        c1536c = this.f8983B;
        iArr = (int[]) c1536c.f14808e;
        if (iArr != null) {
            arrayList = (ArrayList) c1536c.f14809f;
            if (arrayList != null) {
            }
            i12 = -1;
            if (i12 == -1) {
            }
        }
        if (i9 == 1) {
        }
        if (i10 <= P02) {
        }
    }

    @Override // t0.AbstractC1537c0
    public final void U() {
        this.f8983B.f();
        for (int i4 = 0; i4 < this.f8992p; i4++) {
            this.f8993q[i4].b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View U0() {
        char c6;
        boolean z8;
        boolean z9;
        int v8 = v();
        int i4 = v8 - 1;
        BitSet bitSet = new BitSet(this.f8992p);
        bitSet.set(0, this.f8992p, true);
        int i8 = -1;
        if (this.f8996t == 1 && V0()) {
            c6 = 1;
        } else {
            c6 = 65535;
        }
        if (this.f9000x) {
            v8 = -1;
        } else {
            i4 = 0;
        }
        if (i4 < v8) {
            i8 = 1;
        }
        while (i4 != v8) {
            View u8 = u(i4);
            x0 x0Var = (x0) u8.getLayoutParams();
            if (bitSet.get(x0Var.f15023e.f14665e)) {
                i iVar = x0Var.f15023e;
                if (this.f9000x) {
                    int i9 = iVar.f14663c;
                    if (i9 == Integer.MIN_VALUE) {
                        iVar.a();
                        i9 = iVar.f14663c;
                    }
                    if (i9 < this.f8994r.i()) {
                        ArrayList arrayList = (ArrayList) iVar.f14666f;
                        ((x0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u8;
                    }
                } else {
                    int i10 = iVar.f14662b;
                    if (i10 == Integer.MIN_VALUE) {
                        View view = (View) ((ArrayList) iVar.f14666f).get(0);
                        x0 x0Var2 = (x0) view.getLayoutParams();
                        iVar.f14662b = ((StaggeredGridLayoutManager) iVar.f14667g).f8994r.g(view);
                        x0Var2.getClass();
                        i10 = iVar.f14662b;
                    }
                    if (i10 > this.f8994r.m()) {
                        ((x0) ((View) ((ArrayList) iVar.f14666f).get(0)).getLayoutParams()).getClass();
                        return u8;
                    }
                }
                bitSet.clear(x0Var.f15023e.f14665e);
            }
            i4 += i8;
            if (i4 != v8) {
                View u9 = u(i4);
                if (this.f9000x) {
                    int d2 = this.f8994r.d(u8);
                    int d3 = this.f8994r.d(u9);
                    if (d2 >= d3) {
                        if (d2 == d3) {
                            if (x0Var.f15023e.f14665e - ((x0) u9.getLayoutParams()).f15023e.f14665e >= 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (c6 >= 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z8 == z9) {
                                return u8;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        return u8;
                    }
                } else {
                    int g8 = this.f8994r.g(u8);
                    int g9 = this.f8994r.g(u9);
                    if (g8 <= g9) {
                        if (g8 == g9) {
                            if (x0Var.f15023e.f14665e - ((x0) u9.getLayoutParams()).f15023e.f14665e >= 0) {
                            }
                            if (c6 >= 0) {
                            }
                            if (z8 == z9) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        return u8;
                    }
                }
            }
        }
        return null;
    }

    public final boolean V0() {
        if (this.f14811b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // t0.AbstractC1537c0
    public final void W(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f14811b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i4 = 0; i4 < this.f8992p; i4++) {
            this.f8993q[i4].b();
        }
        recyclerView.requestLayout();
    }

    public final void W0(View view, int i4, int i8) {
        RecyclerView recyclerView = this.f14811b;
        Rect rect = this.f8988G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.P(view));
        }
        x0 x0Var = (x0) view.getLayoutParams();
        int i12 = i1(i4, ((ViewGroup.MarginLayoutParams) x0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) x0Var).rightMargin + rect.right);
        int i13 = i1(i8, ((ViewGroup.MarginLayoutParams) x0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin + rect.bottom);
        if (C0(view, i12, i13, x0Var)) {
            view.measure(i12, i13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0051, code lost:
    
        if (r8.f8996t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0057, code lost:
    
        if (r8.f8996t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0063, code lost:
    
        if (V0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006f, code lost:
    
        if (V0() == false) goto L37;
     */
    @Override // t0.AbstractC1537c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View X(View view, int i4, j0 j0Var, o0 o0Var) {
        View view2;
        int i8;
        int P02;
        boolean z8;
        boolean z9;
        int d2;
        int d3;
        int d9;
        if (v() != 0) {
            RecyclerView recyclerView = this.f14811b;
            if (recyclerView == null || (view2 = recyclerView.E(view)) == null || ((ArrayList) this.f14810a.f5432e).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                d1();
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 17) {
                            if (i4 != 33) {
                                if (i4 == 66) {
                                }
                            }
                            i8 = Integer.MIN_VALUE;
                        }
                    } else {
                        if (this.f8996t != 1) {
                        }
                        i8 = 1;
                    }
                } else {
                    if (this.f8996t != 1) {
                    }
                    i8 = -1;
                }
                if (i8 != Integer.MIN_VALUE) {
                    x0 x0Var = (x0) view2.getLayoutParams();
                    x0Var.getClass();
                    i iVar = x0Var.f15023e;
                    if (i8 == 1) {
                        P02 = Q0();
                    } else {
                        P02 = P0();
                    }
                    g1(P02, o0Var);
                    f1(i8);
                    C1531E c1531e = this.f8998v;
                    c1531e.f14733c = c1531e.f14734d + P02;
                    c1531e.f14732b = (int) (this.f8994r.n() * 0.33333334f);
                    c1531e.f14738h = true;
                    c1531e.f14731a = false;
                    K0(j0Var, c1531e, o0Var);
                    this.f8985D = this.f9000x;
                    View h8 = iVar.h(P02, i8);
                    if (h8 != null && h8 != view2) {
                        return h8;
                    }
                    if (Y0(i8)) {
                        for (int i9 = this.f8992p - 1; i9 >= 0; i9--) {
                            View h9 = this.f8993q[i9].h(P02, i8);
                            if (h9 != null && h9 != view2) {
                                return h9;
                            }
                        }
                    } else {
                        for (int i10 = 0; i10 < this.f8992p; i10++) {
                            View h10 = this.f8993q[i10].h(P02, i8);
                            if (h10 != null && h10 != view2) {
                                return h10;
                            }
                        }
                    }
                    boolean z10 = !this.f8999w;
                    if (i8 == -1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z10 == z8) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        d2 = iVar.c();
                    } else {
                        d2 = iVar.d();
                    }
                    View q6 = q(d2);
                    if (q6 != null && q6 != view2) {
                        return q6;
                    }
                    if (Y0(i8)) {
                        for (int i11 = this.f8992p - 1; i11 >= 0; i11--) {
                            if (i11 != iVar.f14665e) {
                                if (z9) {
                                    d9 = this.f8993q[i11].c();
                                } else {
                                    d9 = this.f8993q[i11].d();
                                }
                                View q8 = q(d9);
                                if (q8 != null && q8 != view2) {
                                    return q8;
                                }
                            }
                        }
                    } else {
                        for (int i12 = 0; i12 < this.f8992p; i12++) {
                            if (z9) {
                                d3 = this.f8993q[i12].c();
                            } else {
                                d3 = this.f8993q[i12].d();
                            }
                            View q9 = q(d3);
                            if (q9 != null && q9 != view2) {
                                return q9;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if (r11 != r16.f9000x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0416, code lost:
    
        if (I0() != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f9000x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(j0 j0Var, o0 o0Var, boolean z8) {
        boolean z9;
        z0 z0Var;
        int i4;
        int i8;
        int i9;
        boolean z10;
        boolean z11;
        int m6;
        int P02;
        int m8;
        int m9;
        z0 z0Var2 = this.f8987F;
        w0 w0Var = this.f8989H;
        if ((z0Var2 != null || this.f9002z != -1) && o0Var.b() == 0) {
            n0(j0Var);
            w0Var.a();
            return;
        }
        boolean z12 = w0Var.f15020e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = w0Var.f15022g;
        boolean z13 = true;
        if (z12 && this.f9002z == -1 && this.f8987F == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        C1536c c1536c = this.f8983B;
        if (z9) {
            w0Var.a();
            z0 z0Var3 = this.f8987F;
            if (z0Var3 != null) {
                int i10 = z0Var3.f15033f;
                if (i10 > 0) {
                    if (i10 == this.f8992p) {
                        for (int i11 = 0; i11 < this.f8992p; i11++) {
                            this.f8993q[i11].b();
                            z0 z0Var4 = this.f8987F;
                            int i12 = z0Var4.f15034g[i11];
                            if (i12 != Integer.MIN_VALUE) {
                                if (z0Var4.f15037l) {
                                    m9 = this.f8994r.i();
                                } else {
                                    m9 = this.f8994r.m();
                                }
                                i12 += m9;
                            }
                            i iVar = this.f8993q[i11];
                            iVar.f14662b = i12;
                            iVar.f14663c = i12;
                        }
                    } else {
                        z0Var3.f15034g = null;
                        z0Var3.f15033f = 0;
                        z0Var3.f15035h = 0;
                        z0Var3.f15036i = null;
                        z0Var3.j = null;
                        z0Var3.f15031d = z0Var3.f15032e;
                    }
                }
                z0 z0Var5 = this.f8987F;
                this.f8986E = z0Var5.f15038m;
                boolean z14 = z0Var5.k;
                c(null);
                z0 z0Var6 = this.f8987F;
                if (z0Var6 != null && z0Var6.k != z14) {
                    z0Var6.k = z14;
                }
                this.f8999w = z14;
                t0();
                d1();
                z0 z0Var7 = this.f8987F;
                int i13 = z0Var7.f15031d;
                if (i13 != -1) {
                    this.f9002z = i13;
                    w0Var.f15018c = z0Var7.f15037l;
                } else {
                    w0Var.f15018c = this.f9000x;
                }
                if (z0Var7.f15035h > 1) {
                    c1536c.f14808e = z0Var7.f15036i;
                    c1536c.f14809f = z0Var7.j;
                }
            } else {
                d1();
                w0Var.f15018c = this.f9000x;
            }
            if (!o0Var.f14918g && (i9 = this.f9002z) != -1) {
                if (i9 >= 0 && i9 < o0Var.b()) {
                    z0 z0Var8 = this.f8987F;
                    if (z0Var8 != null && z0Var8.f15031d != -1 && z0Var8.f15033f >= 1) {
                        w0Var.f15017b = Integer.MIN_VALUE;
                        w0Var.f15016a = this.f9002z;
                    } else {
                        View q6 = q(this.f9002z);
                        if (q6 != null) {
                            if (this.f9000x) {
                                P02 = Q0();
                            } else {
                                P02 = P0();
                            }
                            w0Var.f15016a = P02;
                            if (this.f8982A != Integer.MIN_VALUE) {
                                if (w0Var.f15018c) {
                                    w0Var.f15017b = (this.f8994r.i() - this.f8982A) - this.f8994r.d(q6);
                                } else {
                                    w0Var.f15017b = (this.f8994r.m() + this.f8982A) - this.f8994r.g(q6);
                                }
                            } else if (this.f8994r.e(q6) > this.f8994r.n()) {
                                if (w0Var.f15018c) {
                                    m8 = this.f8994r.i();
                                } else {
                                    m8 = this.f8994r.m();
                                }
                                w0Var.f15017b = m8;
                            } else {
                                int g8 = this.f8994r.g(q6) - this.f8994r.m();
                                if (g8 < 0) {
                                    w0Var.f15017b = -g8;
                                } else {
                                    int i14 = this.f8994r.i() - this.f8994r.d(q6);
                                    if (i14 < 0) {
                                        w0Var.f15017b = i14;
                                    } else {
                                        w0Var.f15017b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i15 = this.f9002z;
                            w0Var.f15016a = i15;
                            int i16 = this.f8982A;
                            if (i16 == Integer.MIN_VALUE) {
                                if (v() != 0) {
                                    if (i15 < P0()) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                }
                                w0Var.f15018c = z11;
                                if (z11) {
                                    m6 = staggeredGridLayoutManager.f8994r.i();
                                } else {
                                    m6 = staggeredGridLayoutManager.f8994r.m();
                                }
                                w0Var.f15017b = m6;
                            } else if (w0Var.f15018c) {
                                w0Var.f15017b = staggeredGridLayoutManager.f8994r.i() - i16;
                            } else {
                                w0Var.f15017b = staggeredGridLayoutManager.f8994r.m() + i16;
                            }
                            w0Var.f15019d = true;
                        }
                    }
                    w0Var.f15020e = true;
                } else {
                    this.f9002z = -1;
                    this.f8982A = Integer.MIN_VALUE;
                }
            }
            if (this.f8985D) {
                int b4 = o0Var.b();
                for (int v8 = v() - 1; v8 >= 0; v8--) {
                    i8 = AbstractC1537c0.K(u(v8));
                    if (i8 >= 0 && i8 < b4) {
                        break;
                    }
                }
                i8 = 0;
                w0Var.f15016a = i8;
                w0Var.f15017b = Integer.MIN_VALUE;
                w0Var.f15020e = true;
            } else {
                int b9 = o0Var.b();
                int v9 = v();
                for (int i17 = 0; i17 < v9; i17++) {
                    int K = AbstractC1537c0.K(u(i17));
                    if (K >= 0 && K < b9) {
                        i8 = K;
                        break;
                    }
                }
                i8 = 0;
                w0Var.f15016a = i8;
                w0Var.f15017b = Integer.MIN_VALUE;
                w0Var.f15020e = true;
            }
        }
        if (this.f8987F == null && this.f9002z == -1 && (w0Var.f15018c != this.f8985D || V0() != this.f8986E)) {
            c1536c.f();
            w0Var.f15019d = true;
        }
        if (v() > 0 && ((z0Var = this.f8987F) == null || z0Var.f15033f < 1)) {
            if (w0Var.f15019d) {
                for (int i18 = 0; i18 < this.f8992p; i18++) {
                    this.f8993q[i18].b();
                    int i19 = w0Var.f15017b;
                    if (i19 != Integer.MIN_VALUE) {
                        i iVar2 = this.f8993q[i18];
                        iVar2.f14662b = i19;
                        iVar2.f14663c = i19;
                    }
                }
            } else if (!z9 && w0Var.f15021f != null) {
                for (int i20 = 0; i20 < this.f8992p; i20++) {
                    i iVar3 = this.f8993q[i20];
                    iVar3.b();
                    int i21 = w0Var.f15021f[i20];
                    iVar3.f14662b = i21;
                    iVar3.f14663c = i21;
                }
            } else {
                for (int i22 = 0; i22 < this.f8992p; i22++) {
                    i iVar4 = this.f8993q[i22];
                    boolean z15 = this.f9000x;
                    int i23 = w0Var.f15017b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) iVar4.f14667g;
                    if (z15) {
                        i4 = iVar4.g(Integer.MIN_VALUE);
                    } else {
                        i4 = iVar4.i(Integer.MIN_VALUE);
                    }
                    iVar4.b();
                    if (i4 != Integer.MIN_VALUE && ((!z15 || i4 >= staggeredGridLayoutManager2.f8994r.i()) && (z15 || i4 <= staggeredGridLayoutManager2.f8994r.m()))) {
                        if (i23 != Integer.MIN_VALUE) {
                            i4 += i23;
                        }
                        iVar4.f14663c = i4;
                        iVar4.f14662b = i4;
                    }
                }
                i[] iVarArr = this.f8993q;
                int length = iVarArr.length;
                int[] iArr = w0Var.f15021f;
                if (iArr == null || iArr.length < length) {
                    w0Var.f15021f = new int[staggeredGridLayoutManager.f8993q.length];
                }
                for (int i24 = 0; i24 < length; i24++) {
                    w0Var.f15021f[i24] = iVarArr[i24].i(Integer.MIN_VALUE);
                }
            }
        }
        p(j0Var);
        C1531E c1531e = this.f8998v;
        c1531e.f14731a = false;
        int n3 = this.f8995s.n();
        this.f8997u = n3 / this.f8992p;
        View.MeasureSpec.makeMeasureSpec(n3, this.f8995s.k());
        g1(w0Var.f15016a, o0Var);
        if (w0Var.f15018c) {
            f1(-1);
            K0(j0Var, c1531e, o0Var);
            f1(1);
            c1531e.f14733c = w0Var.f15016a + c1531e.f14734d;
            K0(j0Var, c1531e, o0Var);
        } else {
            f1(1);
            K0(j0Var, c1531e, o0Var);
            f1(-1);
            c1531e.f14733c = w0Var.f15016a + c1531e.f14734d;
            K0(j0Var, c1531e, o0Var);
        }
        if (this.f8995s.k() != 1073741824) {
            int v10 = v();
            float f8 = 0.0f;
            for (int i25 = 0; i25 < v10; i25++) {
                View u8 = u(i25);
                float e9 = this.f8995s.e(u8);
                if (e9 >= f8) {
                    ((x0) u8.getLayoutParams()).getClass();
                    f8 = Math.max(f8, e9);
                }
            }
            int i26 = this.f8997u;
            int round = Math.round(f8 * this.f8992p);
            if (this.f8995s.k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f8995s.n());
            }
            this.f8997u = round / this.f8992p;
            View.MeasureSpec.makeMeasureSpec(round, this.f8995s.k());
            if (this.f8997u != i26) {
                for (int i27 = 0; i27 < v10; i27++) {
                    View u9 = u(i27);
                    x0 x0Var = (x0) u9.getLayoutParams();
                    x0Var.getClass();
                    if (V0() && this.f8996t == 1) {
                        int i28 = -((this.f8992p - 1) - x0Var.f15023e.f14665e);
                        u9.offsetLeftAndRight((this.f8997u * i28) - (i28 * i26));
                    } else {
                        int i29 = x0Var.f15023e.f14665e;
                        int i30 = this.f8997u * i29;
                        int i31 = i29 * i26;
                        if (this.f8996t == 1) {
                            u9.offsetLeftAndRight(i30 - i31);
                        } else {
                            u9.offsetTopAndBottom(i30 - i31);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f9000x) {
                N0(j0Var, o0Var, true);
                O0(j0Var, o0Var, false);
            } else {
                O0(j0Var, o0Var, true);
                N0(j0Var, o0Var, false);
            }
        }
        if (z8 && !o0Var.f14918g && this.f8984C != 0 && v() > 0 && U0() != null) {
            RecyclerView recyclerView = this.f14811b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
        }
        z13 = false;
        if (o0Var.f14918g) {
            w0Var.a();
        }
        this.f8985D = w0Var.f15018c;
        this.f8986E = V0();
        if (z13) {
            w0Var.a();
            X0(j0Var, o0Var, false);
        }
    }

    @Override // t0.AbstractC1537c0
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (v() > 0) {
            View M02 = M0(false);
            View L02 = L0(false);
            if (M02 != null && L02 != null) {
                int K = AbstractC1537c0.K(M02);
                int K8 = AbstractC1537c0.K(L02);
                if (K < K8) {
                    accessibilityEvent.setFromIndex(K);
                    accessibilityEvent.setToIndex(K8);
                } else {
                    accessibilityEvent.setFromIndex(K8);
                    accessibilityEvent.setToIndex(K);
                }
            }
        }
    }

    public final boolean Y0(int i4) {
        boolean z8;
        boolean z9;
        boolean z10;
        if (this.f8996t == 0) {
            if (i4 == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 == this.f9000x) {
                return false;
            }
            return true;
        }
        if (i4 == -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 == this.f9000x) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != V0()) {
            return false;
        }
        return true;
    }

    @Override // t0.AbstractC1537c0
    public final void Z(j0 j0Var, o0 o0Var, Q.g gVar) {
        super.Z(j0Var, o0Var, gVar);
        gVar.i("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void Z0(int i4, o0 o0Var) {
        int P02;
        int i8;
        if (i4 > 0) {
            P02 = Q0();
            i8 = 1;
        } else {
            P02 = P0();
            i8 = -1;
        }
        C1531E c1531e = this.f8998v;
        c1531e.f14731a = true;
        g1(P02, o0Var);
        f1(i8);
        c1531e.f14733c = P02 + c1531e.f14734d;
        c1531e.f14732b = Math.abs(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if (r4 != r3.f9000x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f9000x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // t0.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(int i4) {
        boolean z8;
        int i8 = -1;
        if (v() != 0) {
            if (i4 < P0()) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        PointF pointF = new PointF();
        if (i8 == 0) {
            return null;
        }
        if (this.f8996t == 0) {
            pointF.x = i8;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i8;
        return pointF;
    }

    public final void a1(j0 j0Var, C1531E c1531e) {
        int min;
        int min2;
        if (c1531e.f14731a && !c1531e.f14739i) {
            if (c1531e.f14732b == 0) {
                if (c1531e.f14735e == -1) {
                    b1(c1531e.f14737g, j0Var);
                    return;
                } else {
                    c1(c1531e.f14736f, j0Var);
                    return;
                }
            }
            int i4 = 1;
            if (c1531e.f14735e == -1) {
                int i8 = c1531e.f14736f;
                int i9 = this.f8993q[0].i(i8);
                while (i4 < this.f8992p) {
                    int i10 = this.f8993q[i4].i(i8);
                    if (i10 > i9) {
                        i9 = i10;
                    }
                    i4++;
                }
                int i11 = i8 - i9;
                if (i11 < 0) {
                    min2 = c1531e.f14737g;
                } else {
                    min2 = c1531e.f14737g - Math.min(i11, c1531e.f14732b);
                }
                b1(min2, j0Var);
                return;
            }
            int i12 = c1531e.f14737g;
            int g8 = this.f8993q[0].g(i12);
            while (i4 < this.f8992p) {
                int g9 = this.f8993q[i4].g(i12);
                if (g9 < g8) {
                    g8 = g9;
                }
                i4++;
            }
            int i13 = g8 - c1531e.f14737g;
            if (i13 < 0) {
                min = c1531e.f14736f;
            } else {
                min = Math.min(i13, c1531e.f14732b) + c1531e.f14736f;
            }
            c1(min, j0Var);
        }
    }

    @Override // t0.AbstractC1537c0
    public final void b0(j0 j0Var, o0 o0Var, View view, Q.g gVar) {
        int i4;
        int i8;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof x0)) {
            a0(view, gVar);
            return;
        }
        x0 x0Var = (x0) layoutParams;
        if (this.f8996t == 0) {
            i iVar = x0Var.f15023e;
            if (iVar == null) {
                i8 = -1;
            } else {
                i8 = iVar.f14665e;
            }
            gVar.j(C0235h.a(false, i8, 1, -1, -1));
            return;
        }
        i iVar2 = x0Var.f15023e;
        if (iVar2 == null) {
            i4 = -1;
        } else {
            i4 = iVar2.f14665e;
        }
        gVar.j(C0235h.a(false, -1, -1, i4, 1));
    }

    public final void b1(int i4, j0 j0Var) {
        for (int v8 = v() - 1; v8 >= 0; v8--) {
            View u8 = u(v8);
            if (this.f8994r.g(u8) >= i4 && this.f8994r.p(u8) >= i4) {
                x0 x0Var = (x0) u8.getLayoutParams();
                x0Var.getClass();
                if (((ArrayList) x0Var.f15023e.f14666f).size() != 1) {
                    i iVar = x0Var.f15023e;
                    ArrayList arrayList = (ArrayList) iVar.f14666f;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    x0 x0Var2 = (x0) view.getLayoutParams();
                    x0Var2.f15023e = null;
                    if (x0Var2.f14827a.j() || x0Var2.f14827a.m()) {
                        iVar.f14664d -= ((StaggeredGridLayoutManager) iVar.f14667g).f8994r.e(view);
                    }
                    if (size == 1) {
                        iVar.f14662b = Integer.MIN_VALUE;
                    }
                    iVar.f14663c = Integer.MIN_VALUE;
                    p0(u8, j0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // t0.AbstractC1537c0
    public final void c(String str) {
        if (this.f8987F == null) {
            super.c(str);
        }
    }

    @Override // t0.AbstractC1537c0
    public final void c0(int i4, int i8) {
        T0(i4, i8, 1);
    }

    public final void c1(int i4, j0 j0Var) {
        while (v() > 0) {
            View u8 = u(0);
            if (this.f8994r.d(u8) <= i4 && this.f8994r.o(u8) <= i4) {
                x0 x0Var = (x0) u8.getLayoutParams();
                x0Var.getClass();
                if (((ArrayList) x0Var.f15023e.f14666f).size() != 1) {
                    i iVar = x0Var.f15023e;
                    ArrayList arrayList = (ArrayList) iVar.f14666f;
                    View view = (View) arrayList.remove(0);
                    x0 x0Var2 = (x0) view.getLayoutParams();
                    x0Var2.f15023e = null;
                    if (arrayList.size() == 0) {
                        iVar.f14663c = Integer.MIN_VALUE;
                    }
                    if (x0Var2.f14827a.j() || x0Var2.f14827a.m()) {
                        iVar.f14664d -= ((StaggeredGridLayoutManager) iVar.f14667g).f8994r.e(view);
                    }
                    iVar.f14662b = Integer.MIN_VALUE;
                    p0(u8, j0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // t0.AbstractC1537c0
    public final boolean d() {
        if (this.f8996t == 0) {
            return true;
        }
        return false;
    }

    @Override // t0.AbstractC1537c0
    public final void d0() {
        this.f8983B.f();
        t0();
    }

    public final void d1() {
        if (this.f8996t != 1 && V0()) {
            this.f9000x = !this.f8999w;
        } else {
            this.f9000x = this.f8999w;
        }
    }

    @Override // t0.AbstractC1537c0
    public final boolean e() {
        if (this.f8996t == 1) {
            return true;
        }
        return false;
    }

    @Override // t0.AbstractC1537c0
    public final void e0(int i4, int i8) {
        T0(i4, i8, 8);
    }

    public final int e1(int i4, j0 j0Var, o0 o0Var) {
        if (v() == 0 || i4 == 0) {
            return 0;
        }
        Z0(i4, o0Var);
        C1531E c1531e = this.f8998v;
        int K02 = K0(j0Var, c1531e, o0Var);
        if (c1531e.f14732b >= K02) {
            if (i4 < 0) {
                i4 = -K02;
            } else {
                i4 = K02;
            }
        }
        this.f8994r.q(-i4);
        this.f8985D = this.f9000x;
        c1531e.f14732b = 0;
        a1(j0Var, c1531e);
        return i4;
    }

    @Override // t0.AbstractC1537c0
    public final boolean f(d0 d0Var) {
        return d0Var instanceof x0;
    }

    @Override // t0.AbstractC1537c0
    public final void f0(int i4, int i8) {
        T0(i4, i8, 2);
    }

    public final void f1(int i4) {
        boolean z8;
        C1531E c1531e = this.f8998v;
        c1531e.f14735e = i4;
        boolean z9 = this.f9000x;
        int i8 = 1;
        if (i4 == -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z9 != z8) {
            i8 = -1;
        }
        c1531e.f14734d = i8;
    }

    @Override // t0.AbstractC1537c0
    public final void g0(int i4, int i8) {
        T0(i4, i8, 4);
    }

    public final void g1(int i4, o0 o0Var) {
        int i8;
        int i9;
        int i10;
        boolean z8;
        C1531E c1531e = this.f8998v;
        boolean z9 = false;
        c1531e.f14732b = 0;
        c1531e.f14733c = i4;
        J j = this.f14814e;
        if (j != null && j.f14766e && (i10 = o0Var.f14912a) != -1) {
            boolean z10 = this.f9000x;
            if (i10 < i4) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z10 == z8) {
                i8 = this.f8994r.n();
                i9 = 0;
            } else {
                i9 = this.f8994r.n();
                i8 = 0;
            }
        } else {
            i8 = 0;
            i9 = 0;
        }
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView != null && recyclerView.k) {
            c1531e.f14736f = this.f8994r.m() - i9;
            c1531e.f14737g = this.f8994r.i() + i8;
        } else {
            c1531e.f14737g = this.f8994r.h() + i8;
            c1531e.f14736f = -i9;
        }
        c1531e.f14738h = false;
        c1531e.f14731a = true;
        if (this.f8994r.k() == 0 && this.f8994r.h() == 0) {
            z9 = true;
        }
        c1531e.f14739i = z9;
    }

    @Override // t0.AbstractC1537c0
    public final void h(int i4, int i8, o0 o0Var, C0787g c0787g) {
        C1531E c1531e;
        int g8;
        int i9;
        if (this.f8996t != 0) {
            i4 = i8;
        }
        if (v() != 0 && i4 != 0) {
            Z0(i4, o0Var);
            int[] iArr = this.f8991J;
            if (iArr == null || iArr.length < this.f8992p) {
                this.f8991J = new int[this.f8992p];
            }
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = this.f8992p;
                c1531e = this.f8998v;
                if (i10 >= i12) {
                    break;
                }
                if (c1531e.f14734d == -1) {
                    g8 = c1531e.f14736f;
                    i9 = this.f8993q[i10].i(g8);
                } else {
                    g8 = this.f8993q[i10].g(c1531e.f14737g);
                    i9 = c1531e.f14737g;
                }
                int i13 = g8 - i9;
                if (i13 >= 0) {
                    this.f8991J[i11] = i13;
                    i11++;
                }
                i10++;
            }
            Arrays.sort(this.f8991J, 0, i11);
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = c1531e.f14733c;
                if (i15 >= 0 && i15 < o0Var.b()) {
                    c0787g.b(c1531e.f14733c, this.f8991J[i14]);
                    c1531e.f14733c += c1531e.f14734d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // t0.AbstractC1537c0
    public final void h0(j0 j0Var, o0 o0Var) {
        X0(j0Var, o0Var, true);
    }

    public final void h1(i iVar, int i4, int i8) {
        int i9 = iVar.f14664d;
        int i10 = iVar.f14665e;
        if (i4 == -1) {
            int i11 = iVar.f14662b;
            if (i11 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) iVar.f14666f).get(0);
                x0 x0Var = (x0) view.getLayoutParams();
                iVar.f14662b = ((StaggeredGridLayoutManager) iVar.f14667g).f8994r.g(view);
                x0Var.getClass();
                i11 = iVar.f14662b;
            }
            if (i11 + i9 <= i8) {
                this.f9001y.set(i10, false);
                return;
            }
            return;
        }
        int i12 = iVar.f14663c;
        if (i12 == Integer.MIN_VALUE) {
            iVar.a();
            i12 = iVar.f14663c;
        }
        if (i12 - i9 >= i8) {
            this.f9001y.set(i10, false);
        }
    }

    @Override // t0.AbstractC1537c0
    public final void i0(o0 o0Var) {
        this.f9002z = -1;
        this.f8982A = Integer.MIN_VALUE;
        this.f8987F = null;
        this.f8989H.a();
    }

    @Override // t0.AbstractC1537c0
    public final int j(o0 o0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z8 = !this.f8990I;
        return AbstractC1534b.c(o0Var, this.f8994r, M0(z8), L0(z8), this, this.f8990I);
    }

    @Override // t0.AbstractC1537c0
    public final void j0(Parcelable parcelable) {
        if (parcelable instanceof z0) {
            z0 z0Var = (z0) parcelable;
            this.f8987F = z0Var;
            if (this.f9002z != -1) {
                z0Var.f15034g = null;
                z0Var.f15033f = 0;
                z0Var.f15031d = -1;
                z0Var.f15032e = -1;
                z0Var.f15034g = null;
                z0Var.f15033f = 0;
                z0Var.f15035h = 0;
                z0Var.f15036i = null;
                z0Var.j = null;
            }
            t0();
        }
    }

    @Override // t0.AbstractC1537c0
    public final int k(o0 o0Var) {
        return J0(o0Var);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [t0.z0, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [t0.z0, android.os.Parcelable, java.lang.Object] */
    @Override // t0.AbstractC1537c0
    public final Parcelable k0() {
        int P02;
        View M02;
        int i4;
        int m6;
        int[] iArr;
        z0 z0Var = this.f8987F;
        if (z0Var != null) {
            ?? obj = new Object();
            obj.f15033f = z0Var.f15033f;
            obj.f15031d = z0Var.f15031d;
            obj.f15032e = z0Var.f15032e;
            obj.f15034g = z0Var.f15034g;
            obj.f15035h = z0Var.f15035h;
            obj.f15036i = z0Var.f15036i;
            obj.k = z0Var.k;
            obj.f15037l = z0Var.f15037l;
            obj.f15038m = z0Var.f15038m;
            obj.j = z0Var.j;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.k = this.f8999w;
        obj2.f15037l = this.f8985D;
        obj2.f15038m = this.f8986E;
        C1536c c1536c = this.f8983B;
        if (c1536c != null && (iArr = (int[]) c1536c.f14808e) != null) {
            obj2.f15036i = iArr;
            obj2.f15035h = iArr.length;
            obj2.j = (ArrayList) c1536c.f14809f;
        } else {
            obj2.f15035h = 0;
        }
        int i8 = -1;
        if (v() > 0) {
            if (this.f8985D) {
                P02 = Q0();
            } else {
                P02 = P0();
            }
            obj2.f15031d = P02;
            if (this.f9000x) {
                M02 = L0(true);
            } else {
                M02 = M0(true);
            }
            if (M02 != null) {
                i8 = AbstractC1537c0.K(M02);
            }
            obj2.f15032e = i8;
            int i9 = this.f8992p;
            obj2.f15033f = i9;
            obj2.f15034g = new int[i9];
            for (int i10 = 0; i10 < this.f8992p; i10++) {
                if (this.f8985D) {
                    i4 = this.f8993q[i10].g(Integer.MIN_VALUE);
                    if (i4 != Integer.MIN_VALUE) {
                        m6 = this.f8994r.i();
                        i4 -= m6;
                        obj2.f15034g[i10] = i4;
                    } else {
                        obj2.f15034g[i10] = i4;
                    }
                } else {
                    i4 = this.f8993q[i10].i(Integer.MIN_VALUE);
                    if (i4 != Integer.MIN_VALUE) {
                        m6 = this.f8994r.m();
                        i4 -= m6;
                        obj2.f15034g[i10] = i4;
                    } else {
                        obj2.f15034g[i10] = i4;
                    }
                }
            }
            return obj2;
        }
        obj2.f15031d = -1;
        obj2.f15032e = -1;
        obj2.f15033f = 0;
        return obj2;
    }

    @Override // t0.AbstractC1537c0
    public final int l(o0 o0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z8 = !this.f8990I;
        return AbstractC1534b.e(o0Var, this.f8994r, M0(z8), L0(z8), this, this.f8990I);
    }

    @Override // t0.AbstractC1537c0
    public final void l0(int i4) {
        if (i4 == 0) {
            I0();
        }
    }

    @Override // t0.AbstractC1537c0
    public final int m(o0 o0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z8 = !this.f8990I;
        return AbstractC1534b.c(o0Var, this.f8994r, M0(z8), L0(z8), this, this.f8990I);
    }

    @Override // t0.AbstractC1537c0
    public final int n(o0 o0Var) {
        return J0(o0Var);
    }

    @Override // t0.AbstractC1537c0
    public final int o(o0 o0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z8 = !this.f8990I;
        return AbstractC1534b.e(o0Var, this.f8994r, M0(z8), L0(z8), this, this.f8990I);
    }

    @Override // t0.AbstractC1537c0
    public final d0 r() {
        if (this.f8996t == 0) {
            return new d0(-2, -1);
        }
        return new d0(-1, -2);
    }

    @Override // t0.AbstractC1537c0
    public final d0 s(Context context, AttributeSet attributeSet) {
        return new d0(context, attributeSet);
    }

    @Override // t0.AbstractC1537c0
    public final d0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d0(layoutParams);
    }

    @Override // t0.AbstractC1537c0
    public final int u0(int i4, j0 j0Var, o0 o0Var) {
        return e1(i4, j0Var, o0Var);
    }

    @Override // t0.AbstractC1537c0
    public final void v0(int i4) {
        z0 z0Var = this.f8987F;
        if (z0Var != null && z0Var.f15031d != i4) {
            z0Var.f15034g = null;
            z0Var.f15033f = 0;
            z0Var.f15031d = -1;
            z0Var.f15032e = -1;
        }
        this.f9002z = i4;
        this.f8982A = Integer.MIN_VALUE;
        t0();
    }

    @Override // t0.AbstractC1537c0
    public final int w0(int i4, j0 j0Var, o0 o0Var) {
        return e1(i4, j0Var, o0Var);
    }

    @Override // t0.AbstractC1537c0
    public final int x(j0 j0Var, o0 o0Var) {
        if (this.f8996t == 1) {
            return Math.min(this.f8992p, o0Var.b());
        }
        return -1;
    }

    @Override // t0.AbstractC1537c0
    public final void z0(Rect rect, int i4, int i8) {
        int g8;
        int g9;
        int I8 = I() + H();
        int G8 = G() + J();
        int i9 = this.f8996t;
        int i10 = this.f8992p;
        if (i9 == 1) {
            int height = rect.height() + G8;
            RecyclerView recyclerView = this.f14811b;
            WeakHashMap weakHashMap = O.f4214a;
            g9 = AbstractC1537c0.g(i8, height, recyclerView.getMinimumHeight());
            g8 = AbstractC1537c0.g(i4, (this.f8997u * i10) + I8, this.f14811b.getMinimumWidth());
        } else {
            int width = rect.width() + I8;
            RecyclerView recyclerView2 = this.f14811b;
            WeakHashMap weakHashMap2 = O.f4214a;
            g8 = AbstractC1537c0.g(i4, width, recyclerView2.getMinimumWidth());
            g9 = AbstractC1537c0.g(i8, (this.f8997u * i10) + G8, this.f14811b.getMinimumHeight());
        }
        this.f14811b.setMeasuredDimension(g8, g9);
    }
}
