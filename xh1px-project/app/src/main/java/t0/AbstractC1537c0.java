package t0;

import O7.C0235h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import g5.C0787g;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import n1.AbstractC1149a;
import s0.AbstractC1477a;

/* renamed from: t0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1537c0 {

    /* renamed from: a, reason: collision with root package name */
    public S6.e f14810a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f14811b;

    /* renamed from: c, reason: collision with root package name */
    public final C1536c f14812c;

    /* renamed from: d, reason: collision with root package name */
    public final C1536c f14813d;

    /* renamed from: e, reason: collision with root package name */
    public J f14814e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14815f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14816g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14817h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14818i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f14819l;

    /* renamed from: m, reason: collision with root package name */
    public int f14820m;

    /* renamed from: n, reason: collision with root package name */
    public int f14821n;

    /* renamed from: o, reason: collision with root package name */
    public int f14822o;

    public AbstractC1537c0() {
        g0.L l6 = new g0.L(20, this);
        W5.a aVar = new W5.a(29, this);
        this.f14812c = new C1536c((B0) l6);
        this.f14813d = new C1536c((B0) aVar);
        this.f14815f = false;
        this.f14816g = false;
        this.f14817h = true;
        this.f14818i = true;
    }

    public static int A(View view) {
        return view.getLeft() - ((d0) view.getLayoutParams()).f14828b.left;
    }

    public static int B(View view) {
        Rect rect = ((d0) view.getLayoutParams()).f14828b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int C(View view) {
        Rect rect = ((d0) view.getLayoutParams()).f14828b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int D(View view) {
        return view.getRight() + ((d0) view.getLayoutParams()).f14828b.right;
    }

    public static int E(View view) {
        return view.getTop() - ((d0) view.getLayoutParams()).f14828b.top;
    }

    public static int K(View view) {
        return ((d0) view.getLayoutParams()).f14827a.d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t0.b0, java.lang.Object] */
    public static C1535b0 L(Context context, AttributeSet attributeSet, int i4, int i8) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1477a.f14443a, i4, i8);
        obj.f14803a = obtainStyledAttributes.getInt(0, 1);
        obj.f14804b = obtainStyledAttributes.getInt(10, 1);
        obj.f14805c = obtainStyledAttributes.getBoolean(9, false);
        obj.f14806d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean Q(int i4, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (i9 > 0 && i4 != i9) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i4) {
                return false;
            }
            return true;
        }
        if (size < i4) {
            return false;
        }
        return true;
    }

    public static void R(View view, int i4, int i8, int i9, int i10) {
        d0 d0Var = (d0) view.getLayoutParams();
        Rect rect = d0Var.f14828b;
        view.layout(i4 + rect.left + ((ViewGroup.MarginLayoutParams) d0Var).leftMargin, i8 + rect.top + ((ViewGroup.MarginLayoutParams) d0Var).topMargin, (i9 - rect.right) - ((ViewGroup.MarginLayoutParams) d0Var).rightMargin, (i10 - rect.bottom) - ((ViewGroup.MarginLayoutParams) d0Var).bottomMargin);
    }

    public static int g(int i4, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i8, i9);
            }
            return size;
        }
        return Math.min(size, Math.max(i8, i9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(boolean z8, int i4, int i8, int i9, int i10) {
        int max = Math.max(0, i4 - i9);
        if (z8) {
            if (i10 < 0) {
                if (i10 == -1) {
                    if (i8 != Integer.MIN_VALUE) {
                        if (i8 != 0) {
                        }
                    }
                    i10 = max;
                }
                i8 = 0;
                i10 = 0;
            }
            i8 = 1073741824;
        } else {
            if (i10 < 0) {
                if (i10 != -1) {
                    if (i10 == -2) {
                        if (i8 != Integer.MIN_VALUE && i8 != 1073741824) {
                            i10 = max;
                            i8 = 0;
                        } else {
                            i10 = max;
                            i8 = Integer.MIN_VALUE;
                        }
                    }
                    i8 = 0;
                    i10 = 0;
                }
                i10 = max;
            }
            i8 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i10, i8);
    }

    public static int y(View view) {
        return view.getBottom() + ((d0) view.getLayoutParams()).f14828b.bottom;
    }

    public final void A0(int i4, int i8) {
        int v8 = v();
        if (v8 == 0) {
            this.f14811b.q(i4, i8);
            return;
        }
        int i9 = Integer.MIN_VALUE;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < v8; i13++) {
            View u8 = u(i13);
            Rect rect = this.f14811b.f8954m;
            z(u8, rect);
            int i14 = rect.left;
            if (i14 < i12) {
                i12 = i14;
            }
            int i15 = rect.right;
            if (i15 > i9) {
                i9 = i15;
            }
            int i16 = rect.top;
            if (i16 < i10) {
                i10 = i16;
            }
            int i17 = rect.bottom;
            if (i17 > i11) {
                i11 = i17;
            }
        }
        this.f14811b.f8954m.set(i12, i10, i9, i11);
        z0(this.f14811b.f8954m, i4, i8);
    }

    public final void B0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f14811b = null;
            this.f14810a = null;
            this.f14821n = 0;
            this.f14822o = 0;
        } else {
            this.f14811b = recyclerView;
            this.f14810a = recyclerView.f8949i;
            this.f14821n = recyclerView.getWidth();
            this.f14822o = recyclerView.getHeight();
        }
        this.f14819l = 1073741824;
        this.f14820m = 1073741824;
    }

    public final boolean C0(View view, int i4, int i8, d0 d0Var) {
        if (!view.isLayoutRequested() && this.f14817h && Q(view.getWidth(), i4, ((ViewGroup.MarginLayoutParams) d0Var).width) && Q(view.getHeight(), i8, ((ViewGroup.MarginLayoutParams) d0Var).height)) {
            return false;
        }
        return true;
    }

    public boolean D0() {
        return false;
    }

    public final boolean E0(View view, int i4, int i8, d0 d0Var) {
        if (this.f14817h && Q(view.getMeasuredWidth(), i4, ((ViewGroup.MarginLayoutParams) d0Var).width) && Q(view.getMeasuredHeight(), i8, ((ViewGroup.MarginLayoutParams) d0Var).height)) {
            return false;
        }
        return true;
    }

    public final int F() {
        U u8;
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView != null) {
            u8 = recyclerView.getAdapter();
        } else {
            u8 = null;
        }
        if (u8 != null) {
            return u8.a();
        }
        return 0;
    }

    public abstract void F0(RecyclerView recyclerView, int i4);

    public final int G() {
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final void G0(J j) {
        J j5 = this.f14814e;
        if (j5 != null && j != j5 && j5.f14766e) {
            j5.i();
        }
        this.f14814e = j;
        RecyclerView recyclerView = this.f14811b;
        r0 r0Var = recyclerView.f8948h0;
        r0Var.j.removeCallbacks(r0Var);
        r0Var.f14940f.abortAnimation();
        if (j.f14769h) {
            Log.w("RecyclerView", "An instance of " + j.getClass().getSimpleName() + " was started more than once. Each instance of" + j.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        j.f14763b = recyclerView;
        j.f14764c = this;
        int i4 = j.f14762a;
        if (i4 != -1) {
            recyclerView.f8951k0.f14912a = i4;
            j.f14766e = true;
            j.f14765d = true;
            j.f14767f = recyclerView.f8962q.q(i4);
            j.f14763b.f8948h0.b();
            j.f14769h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final int H() {
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public boolean H0() {
        return false;
    }

    public final int I() {
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int J() {
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int M(j0 j0Var, o0 o0Var) {
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView == null || recyclerView.f8960p == null || !e()) {
            return 1;
        }
        return this.f14811b.f8960p.a();
    }

    public final void N(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((d0) view.getLayoutParams()).f14828b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f14811b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f14811b.f8958o;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean O();

    public boolean P() {
        return false;
    }

    public void S(int i4) {
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView != null) {
            int t8 = recyclerView.f8949i.t();
            for (int i8 = 0; i8 < t8; i8++) {
                recyclerView.f8949i.s(i8).offsetLeftAndRight(i4);
            }
        }
    }

    public void T(int i4) {
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView != null) {
            int t8 = recyclerView.f8949i.t();
            for (int i8 = 0; i8 < t8; i8++) {
                recyclerView.f8949i.s(i8).offsetTopAndBottom(i4);
            }
        }
    }

    public abstract void W(RecyclerView recyclerView);

    public abstract View X(View view, int i4, j0 j0Var, o0 o0Var);

    public void Y(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f14811b;
        j0 j0Var = recyclerView.f8943f;
        o0 o0Var = recyclerView.f8951k0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z8 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f14811b.canScrollVertically(-1) && !this.f14811b.canScrollHorizontally(-1) && !this.f14811b.canScrollHorizontally(1)) {
                z8 = false;
            }
            accessibilityEvent.setScrollable(z8);
            U u8 = this.f14811b.f8960p;
            if (u8 != null) {
                accessibilityEvent.setItemCount(u8.a());
            }
        }
    }

    public void Z(j0 j0Var, o0 o0Var, Q.g gVar) {
        if (this.f14811b.canScrollVertically(-1) || this.f14811b.canScrollHorizontally(-1)) {
            gVar.a(8192);
            gVar.l(true);
            gVar.h(67108864, true);
        }
        if (this.f14811b.canScrollVertically(1) || this.f14811b.canScrollHorizontally(1)) {
            gVar.a(4096);
            gVar.l(true);
            gVar.h(67108864, true);
        }
        gVar.f4709a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(M(j0Var, o0Var), x(j0Var, o0Var), false, 0));
    }

    public final void a0(View view, Q.g gVar) {
        s0 N8 = RecyclerView.N(view);
        if (N8 != null && !N8.j()) {
            S6.e eVar = this.f14810a;
            if (!((ArrayList) eVar.f5432e).contains(N8.f14950a)) {
                RecyclerView recyclerView = this.f14811b;
                b0(recyclerView.f8943f, recyclerView.f8951k0, view, gVar);
            }
        }
    }

    public final void b(View view, int i4, boolean z8) {
        int b4;
        s0 N8 = RecyclerView.N(view);
        if (!z8 && !N8.j()) {
            this.f14811b.j.t(N8);
        } else {
            t.j jVar = (t.j) this.f14811b.j.f14808e;
            C0 c02 = (C0) jVar.get(N8);
            if (c02 == null) {
                c02 = C0.a();
                jVar.put(N8, c02);
            }
            c02.f14702a |= 1;
        }
        d0 d0Var = (d0) view.getLayoutParams();
        if (!N8.r() && !N8.k()) {
            int i8 = -1;
            if (view.getParent() == this.f14811b) {
                S6.e eVar = this.f14810a;
                C1541g c1541g = (C1541g) eVar.f5431d;
                int indexOfChild = ((S) eVar.f5430c).f14786a.indexOfChild(view);
                if (indexOfChild == -1 || c1541g.d(indexOfChild)) {
                    b4 = -1;
                } else {
                    b4 = indexOfChild - c1541g.b(indexOfChild);
                }
                if (i4 == -1) {
                    i4 = this.f14810a.t();
                }
                if (b4 != -1) {
                    if (b4 != i4) {
                        AbstractC1537c0 abstractC1537c0 = this.f14811b.f8962q;
                        View u8 = abstractC1537c0.u(b4);
                        if (u8 != null) {
                            abstractC1537c0.u(b4);
                            abstractC1537c0.f14810a.o(b4);
                            d0 d0Var2 = (d0) u8.getLayoutParams();
                            s0 N9 = RecyclerView.N(u8);
                            if (N9.j()) {
                                t.j jVar2 = (t.j) abstractC1537c0.f14811b.j.f14808e;
                                C0 c03 = (C0) jVar2.get(N9);
                                if (c03 == null) {
                                    c03 = C0.a();
                                    jVar2.put(N9, c03);
                                }
                                c03.f14702a = 1 | c03.f14702a;
                            } else {
                                abstractC1537c0.f14811b.j.t(N9);
                            }
                            abstractC1537c0.f14810a.d(u8, i4, d0Var2, N9.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b4 + abstractC1537c0.f14811b.toString());
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f14811b.indexOfChild(view));
                    throw new IllegalStateException(AbstractC1149a.e(this.f14811b, sb));
                }
            } else {
                this.f14810a.b(view, i4, false);
                d0Var.f14829c = true;
                J j = this.f14814e;
                if (j != null && j.f14766e) {
                    j.f14763b.getClass();
                    s0 N10 = RecyclerView.N(view);
                    if (N10 != null) {
                        i8 = N10.d();
                    }
                    if (i8 == j.f14762a) {
                        j.f14767f = view;
                    }
                }
            }
        } else {
            if (N8.k()) {
                N8.f14961n.l(N8);
            } else {
                N8.j &= -33;
            }
            this.f14810a.d(view, i4, view.getLayoutParams(), false);
        }
        if (d0Var.f14830d) {
            if (RecyclerView.f8901G0) {
                Objects.toString(d0Var.f14827a);
            }
            N8.f14950a.invalidate();
            d0Var.f14830d = false;
        }
    }

    public void b0(j0 j0Var, o0 o0Var, View view, Q.g gVar) {
        int i4;
        int i8;
        if (e()) {
            i4 = K(view);
        } else {
            i4 = 0;
        }
        if (d()) {
            i8 = K(view);
        } else {
            i8 = 0;
        }
        gVar.j(C0235h.a(false, i4, 1, i8, 1));
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public abstract boolean d();

    public abstract boolean e();

    public boolean f(d0 d0Var) {
        if (d0Var != null) {
            return true;
        }
        return false;
    }

    public abstract void h0(j0 j0Var, o0 o0Var);

    public abstract void i0(o0 o0Var);

    public abstract int j(o0 o0Var);

    public abstract int k(o0 o0Var);

    public Parcelable k0() {
        return null;
    }

    public abstract int l(o0 o0Var);

    public abstract int m(o0 o0Var);

    public boolean m0(int i4, Bundle bundle) {
        int i8;
        int H2;
        float f8;
        j0 j0Var = this.f14811b.f8943f;
        int i9 = this.f14822o;
        int i10 = this.f14821n;
        Rect rect = new Rect();
        if (this.f14811b.getMatrix().isIdentity() && this.f14811b.getGlobalVisibleRect(rect)) {
            i9 = rect.height();
            i10 = rect.width();
        }
        if (i4 != 4096) {
            if (i4 != 8192) {
                i8 = 0;
                H2 = 0;
            } else {
                if (this.f14811b.canScrollVertically(-1)) {
                    i8 = -((i9 - J()) - G());
                } else {
                    i8 = 0;
                }
                if (this.f14811b.canScrollHorizontally(-1)) {
                    H2 = -((i10 - H()) - I());
                }
                H2 = 0;
            }
        } else {
            if (this.f14811b.canScrollVertically(1)) {
                i8 = (i9 - J()) - G();
            } else {
                i8 = 0;
            }
            if (this.f14811b.canScrollHorizontally(1)) {
                H2 = (i10 - H()) - I();
            }
            H2 = 0;
        }
        if (i8 != 0 || H2 != 0) {
            if (bundle != null) {
                f8 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f8 < 0.0f) {
                    if (RecyclerView.f8900F0) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f8 + ")");
                    }
                }
            } else {
                f8 = 1.0f;
            }
            if (Float.compare(f8, Float.POSITIVE_INFINITY) == 0) {
                RecyclerView recyclerView = this.f14811b;
                U u8 = recyclerView.f8960p;
                if (u8 != null) {
                    if (i4 != 4096) {
                        if (i4 != 8192) {
                            return true;
                        }
                        recyclerView.m0(0);
                        return true;
                    }
                    recyclerView.m0(u8.a() - 1);
                    return true;
                }
            } else {
                if (Float.compare(1.0f, f8) != 0 && Float.compare(0.0f, f8) != 0) {
                    H2 = (int) (H2 * f8);
                    i8 = (int) (i8 * f8);
                }
                this.f14811b.l0(H2, i8, true);
                return true;
            }
        }
        return false;
    }

    public abstract int n(o0 o0Var);

    public final void n0(j0 j0Var) {
        for (int v8 = v() - 1; v8 >= 0; v8--) {
            if (!RecyclerView.N(u(v8)).q()) {
                q0(v8, j0Var);
            }
        }
    }

    public abstract int o(o0 o0Var);

    public final void o0(j0 j0Var) {
        ArrayList arrayList = j0Var.f14866a;
        int size = arrayList.size();
        for (int i4 = size - 1; i4 >= 0; i4--) {
            View view = ((s0) arrayList.get(i4)).f14950a;
            s0 N8 = RecyclerView.N(view);
            if (!N8.q()) {
                N8.p(false);
                if (N8.l()) {
                    this.f14811b.removeDetachedView(view, false);
                }
                Z z8 = this.f14811b.f8928P;
                if (z8 != null) {
                    z8.d(N8);
                }
                N8.p(true);
                s0 N9 = RecyclerView.N(view);
                N9.f14961n = null;
                N9.f14962o = false;
                N9.j &= -33;
                j0Var.i(N9);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = j0Var.f14867b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f14811b.invalidate();
        }
    }

    public final void p(j0 j0Var) {
        for (int v8 = v() - 1; v8 >= 0; v8--) {
            View u8 = u(v8);
            s0 N8 = RecyclerView.N(u8);
            if (N8.q()) {
                if (RecyclerView.f8901G0) {
                    N8.toString();
                }
            } else if (N8.h() && !N8.j() && !this.f14811b.f8960p.f14789b) {
                r0(v8);
                j0Var.i(N8);
            } else {
                u(v8);
                this.f14810a.o(v8);
                j0Var.j(u8);
                this.f14811b.j.t(N8);
            }
        }
    }

    public final void p0(View view, j0 j0Var) {
        S6.e eVar = this.f14810a;
        S s8 = (S) eVar.f5430c;
        int i4 = eVar.f5429b;
        if (i4 != 1) {
            if (i4 != 2) {
                try {
                    eVar.f5429b = 1;
                    eVar.f5433f = view;
                    int indexOfChild = s8.f14786a.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (((C1541g) eVar.f5431d).f(indexOfChild)) {
                            eVar.F(view);
                        }
                        s8.c(indexOfChild);
                    }
                    eVar.f5429b = 0;
                    eVar.f5433f = null;
                    j0Var.h(view);
                    return;
                } catch (Throwable th) {
                    eVar.f5429b = 0;
                    eVar.f5433f = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public View q(int i4) {
        int v8 = v();
        for (int i8 = 0; i8 < v8; i8++) {
            View u8 = u(i8);
            s0 N8 = RecyclerView.N(u8);
            if (N8 != null && N8.d() == i4 && !N8.q() && (this.f14811b.f8951k0.f14918g || !N8.j())) {
                return u8;
            }
        }
        return null;
    }

    public final void q0(int i4, j0 j0Var) {
        View u8 = u(i4);
        r0(i4);
        j0Var.h(u8);
    }

    public abstract d0 r();

    public final void r0(int i4) {
        if (u(i4) != null) {
            S6.e eVar = this.f14810a;
            S s8 = (S) eVar.f5430c;
            int i8 = eVar.f5429b;
            if (i8 != 1) {
                if (i8 != 2) {
                    try {
                        int u8 = eVar.u(i4);
                        View childAt = s8.f14786a.getChildAt(u8);
                        if (childAt != null) {
                            eVar.f5429b = 1;
                            eVar.f5433f = childAt;
                            if (((C1541g) eVar.f5431d).f(u8)) {
                                eVar.F(childAt);
                            }
                            s8.c(u8);
                        }
                        eVar.f5429b = 0;
                        eVar.f5433f = null;
                        return;
                    } catch (Throwable th) {
                        eVar.f5429b = 0;
                        eVar.f5433f = null;
                        throw th;
                    }
                }
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
    }

    public d0 s(Context context, AttributeSet attributeSet) {
        return new d0(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean s0(RecyclerView recyclerView, View view, Rect rect, boolean z8, boolean z9) {
        int H2 = H();
        int J6 = J();
        int I8 = this.f14821n - I();
        int G8 = this.f14822o - G();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i4 = left - H2;
        int min = Math.min(0, i4);
        int i8 = top - J6;
        int min2 = Math.min(0, i8);
        int i9 = width - I8;
        int max = Math.max(0, i9);
        int max2 = Math.max(0, height - G8);
        if (this.f14811b.getLayoutDirection() == 1) {
            if (max == 0) {
                max = Math.max(min, i9);
            }
        } else {
            if (min == 0) {
                min = Math.min(i4, max);
            }
            max = min;
        }
        if (min2 == 0) {
            min2 = Math.min(i8, max2);
        }
        int[] iArr = {max, min2};
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (z9) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int H8 = H();
                int J8 = J();
                int I9 = this.f14821n - I();
                int G9 = this.f14822o - G();
                Rect rect2 = this.f14811b.f8954m;
                z(focusedChild, rect2);
                if (rect2.left - i10 < I9) {
                    if (rect2.right - i10 > H8) {
                        if (rect2.top - i11 < G9) {
                        }
                    }
                }
            }
            return false;
        }
        if (i10 != 0 || i11 != 0) {
            if (z8) {
                recyclerView.scrollBy(i10, i11);
                return true;
            }
            recyclerView.l0(i10, i11, false);
            return true;
        }
        return false;
    }

    public d0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d0) {
            return new d0((d0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d0(layoutParams);
    }

    public final void t0() {
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final View u(int i4) {
        S6.e eVar = this.f14810a;
        if (eVar != null) {
            return eVar.s(i4);
        }
        return null;
    }

    public abstract int u0(int i4, j0 j0Var, o0 o0Var);

    public final int v() {
        S6.e eVar = this.f14810a;
        if (eVar != null) {
            return eVar.t();
        }
        return 0;
    }

    public abstract void v0(int i4);

    public abstract int w0(int i4, j0 j0Var, o0 o0Var);

    public int x(j0 j0Var, o0 o0Var) {
        RecyclerView recyclerView = this.f14811b;
        if (recyclerView == null || recyclerView.f8960p == null || !d()) {
            return 1;
        }
        return this.f14811b.f8960p.a();
    }

    public final void x0(RecyclerView recyclerView) {
        y0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void y0(int i4, int i8) {
        this.f14821n = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        this.f14819l = mode;
        if (mode == 0 && !RecyclerView.f8904J0) {
            this.f14821n = 0;
        }
        this.f14822o = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        this.f14820m = mode2;
        if (mode2 == 0 && !RecyclerView.f8904J0) {
            this.f14822o = 0;
        }
    }

    public void z(View view, Rect rect) {
        RecyclerView.O(view, rect);
    }

    public void z0(Rect rect, int i4, int i8) {
        int I8 = I() + H() + rect.width();
        int G8 = G() + J() + rect.height();
        RecyclerView recyclerView = this.f14811b;
        WeakHashMap weakHashMap = P.O.f4214a;
        this.f14811b.setMeasuredDimension(g(i4, I8, recyclerView.getMinimumWidth()), g(i8, G8, this.f14811b.getMinimumHeight()));
    }

    public void U() {
    }

    public void d0() {
    }

    public void V(RecyclerView recyclerView) {
    }

    public void j0(Parcelable parcelable) {
    }

    public void l0(int i4) {
    }

    public void c0(int i4, int i8) {
    }

    public void e0(int i4, int i8) {
    }

    public void f0(int i4, int i8) {
    }

    public void g0(int i4, int i8) {
    }

    public void i(int i4, C0787g c0787g) {
    }

    public void h(int i4, int i8, o0 o0Var, C0787g c0787g) {
    }
}
