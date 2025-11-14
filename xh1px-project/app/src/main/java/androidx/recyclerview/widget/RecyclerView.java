package androidx.recyclerview.widget;

import E2.b;
import E2.c;
import G1.h;
import P.C0259g;
import P.C0264l;
import P.C0267o;
import P.F;
import P.I;
import P.InterfaceC0263k;
import S6.e;
import U.a;
import W.d;
import a6.AbstractC0437l;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import c0.g;
import g5.C0787g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n1.AbstractC1149a;
import o.C1207p;
import s0.AbstractC1477a;
import t.j;
import t0.AbstractC1533a0;
import t0.AbstractC1537c0;
import t0.C0;
import t0.C1530D;
import t0.C1532a;
import t0.C1536c;
import t0.C1541g;
import t0.C1548n;
import t0.C1554u;
import t0.J;
import t0.O;
import t0.P;
import t0.Q;
import t0.RunnableC1556w;
import t0.S;
import t0.T;
import t0.U;
import t0.X;
import t0.Y;
import t0.Z;
import t0.d0;
import t0.e0;
import t0.f0;
import t0.g0;
import t0.h0;
import t0.i0;
import t0.j0;
import t0.k0;
import t0.l0;
import t0.n0;
import t0.o0;
import t0.p0;
import t0.q0;
import t0.r0;
import t0.s0;
import t0.u0;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0263k {

    /* renamed from: F0, reason: collision with root package name */
    public static boolean f8900F0 = false;

    /* renamed from: G0, reason: collision with root package name */
    public static boolean f8901G0 = false;

    /* renamed from: H0, reason: collision with root package name */
    public static final int[] f8902H0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: I0, reason: collision with root package name */
    public static final float f8903I0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: J0, reason: collision with root package name */
    public static final boolean f8904J0 = true;

    /* renamed from: K0, reason: collision with root package name */
    public static final boolean f8905K0 = true;

    /* renamed from: L0, reason: collision with root package name */
    public static final Class[] f8906L0;

    /* renamed from: M0, reason: collision with root package name */
    public static final d f8907M0;

    /* renamed from: N0, reason: collision with root package name */
    public static final p0 f8908N0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f8909A;

    /* renamed from: A0, reason: collision with root package name */
    public int f8910A0;

    /* renamed from: B, reason: collision with root package name */
    public boolean f8911B;

    /* renamed from: B0, reason: collision with root package name */
    public int f8912B0;

    /* renamed from: C, reason: collision with root package name */
    public int f8913C;

    /* renamed from: C0, reason: collision with root package name */
    public final boolean f8914C0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f8915D;

    /* renamed from: D0, reason: collision with root package name */
    public final S f8916D0;

    /* renamed from: E, reason: collision with root package name */
    public final AccessibilityManager f8917E;

    /* renamed from: E0, reason: collision with root package name */
    public final C0259g f8918E0;

    /* renamed from: F, reason: collision with root package name */
    public ArrayList f8919F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f8920G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f8921H;

    /* renamed from: I, reason: collision with root package name */
    public int f8922I;

    /* renamed from: J, reason: collision with root package name */
    public int f8923J;
    public Y K;

    /* renamed from: L, reason: collision with root package name */
    public EdgeEffect f8924L;

    /* renamed from: M, reason: collision with root package name */
    public EdgeEffect f8925M;

    /* renamed from: N, reason: collision with root package name */
    public EdgeEffect f8926N;

    /* renamed from: O, reason: collision with root package name */
    public EdgeEffect f8927O;

    /* renamed from: P, reason: collision with root package name */
    public Z f8928P;

    /* renamed from: Q, reason: collision with root package name */
    public int f8929Q;

    /* renamed from: R, reason: collision with root package name */
    public int f8930R;

    /* renamed from: S, reason: collision with root package name */
    public VelocityTracker f8931S;

    /* renamed from: T, reason: collision with root package name */
    public int f8932T;

    /* renamed from: U, reason: collision with root package name */
    public int f8933U;

    /* renamed from: V, reason: collision with root package name */
    public int f8934V;

    /* renamed from: W, reason: collision with root package name */
    public int f8935W;

    /* renamed from: a0, reason: collision with root package name */
    public int f8936a0;

    /* renamed from: b0, reason: collision with root package name */
    public e0 f8937b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f8938c0;

    /* renamed from: d, reason: collision with root package name */
    public final float f8939d;

    /* renamed from: d0, reason: collision with root package name */
    public final int f8940d0;

    /* renamed from: e, reason: collision with root package name */
    public final h f8941e;

    /* renamed from: e0, reason: collision with root package name */
    public final float f8942e0;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f8943f;

    /* renamed from: f0, reason: collision with root package name */
    public final float f8944f0;

    /* renamed from: g, reason: collision with root package name */
    public l0 f8945g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f8946g0;

    /* renamed from: h, reason: collision with root package name */
    public final C1207p f8947h;

    /* renamed from: h0, reason: collision with root package name */
    public final r0 f8948h0;

    /* renamed from: i, reason: collision with root package name */
    public final e f8949i;

    /* renamed from: i0, reason: collision with root package name */
    public RunnableC1556w f8950i0;
    public final C1536c j;
    public final C0787g j0;
    public boolean k;

    /* renamed from: k0, reason: collision with root package name */
    public final o0 f8951k0;

    /* renamed from: l, reason: collision with root package name */
    public final Q f8952l;

    /* renamed from: l0, reason: collision with root package name */
    public g0 f8953l0;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f8954m;

    /* renamed from: m0, reason: collision with root package name */
    public ArrayList f8955m0;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f8956n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f8957n0;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f8958o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f8959o0;

    /* renamed from: p, reason: collision with root package name */
    public U f8960p;

    /* renamed from: p0, reason: collision with root package name */
    public final S f8961p0;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC1537c0 f8962q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f8963q0;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f8964r;

    /* renamed from: r0, reason: collision with root package name */
    public u0 f8965r0;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f8966s;

    /* renamed from: s0, reason: collision with root package name */
    public final int[] f8967s0;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f8968t;

    /* renamed from: t0, reason: collision with root package name */
    public C0264l f8969t0;

    /* renamed from: u, reason: collision with root package name */
    public f0 f8970u;

    /* renamed from: u0, reason: collision with root package name */
    public final int[] f8971u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8972v;

    /* renamed from: v0, reason: collision with root package name */
    public final int[] f8973v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8974w;

    /* renamed from: w0, reason: collision with root package name */
    public final int[] f8975w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8976x;

    /* renamed from: x0, reason: collision with root package name */
    public final ArrayList f8977x0;

    /* renamed from: y, reason: collision with root package name */
    public int f8978y;

    /* renamed from: y0, reason: collision with root package name */
    public final Q f8979y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8980z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f8981z0;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, t0.p0] */
    static {
        Class cls = Integer.TYPE;
        f8906L0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f8907M0 = new d(3);
        f8908N0 = new Object();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.recyclerViewStyle);
    }

    public static RecyclerView H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            RecyclerView H2 = H(viewGroup.getChildAt(i4));
            if (H2 != null) {
                return H2;
            }
        }
        return null;
    }

    public static s0 N(View view) {
        if (view == null) {
            return null;
        }
        return ((d0) view.getLayoutParams()).f14827a;
    }

    public static void O(View view, Rect rect) {
        d0 d0Var = (d0) view.getLayoutParams();
        Rect rect2 = d0Var.f14828b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) d0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) d0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) d0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) d0Var).bottomMargin);
    }

    private C0264l getScrollingChildHelper() {
        if (this.f8969t0 == null) {
            this.f8969t0 = new C0264l(this);
        }
        return this.f8969t0;
    }

    public static void l(s0 s0Var) {
        WeakReference weakReference = s0Var.f14951b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != s0Var.f14950a) {
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            s0Var.f14951b = null;
        }
    }

    public static int o(int i4, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i8) {
        if (i4 > 0 && edgeEffect != null && b.t(edgeEffect) != 0.0f) {
            int round = Math.round(b.D(edgeEffect, ((-i4) * 4.0f) / i8, 0.5f) * ((-i8) / 4.0f));
            if (round != i4) {
                edgeEffect.finish();
            }
            return i4 - round;
        }
        if (i4 < 0 && edgeEffect2 != null && b.t(edgeEffect2) != 0.0f) {
            float f8 = i8;
            int round2 = Math.round(b.D(edgeEffect2, (i4 * 4.0f) / f8, 0.5f) * (f8 / 4.0f));
            if (round2 != i4) {
                edgeEffect2.finish();
            }
            return i4 - round2;
        }
        return i4;
    }

    public static void setDebugAssertionsEnabled(boolean z8) {
        f8900F0 = z8;
    }

    public static void setVerboseLoggingEnabled(boolean z8) {
        f8901G0 = z8;
    }

    public final void A() {
        if (this.f8926N != null) {
            return;
        }
        ((p0) this.K).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f8926N = edgeEffect;
        if (this.k) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.f8925M != null) {
            return;
        }
        ((p0) this.K).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f8925M = edgeEffect;
        if (this.k) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.f8960p + ", layout:" + this.f8962q + ", context:" + getContext();
    }

    public final void D(o0 o0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f8948h0.f14940f;
            overScroller.getFinalX();
            overScroller.getCurrX();
            o0Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        o0Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public final boolean F(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f8968t;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            f0 f0Var = (f0) arrayList.get(i4);
            if (f0Var.b(motionEvent) && action != 3) {
                this.f8970u = f0Var;
                return true;
            }
        }
        return false;
    }

    public final void G(int[] iArr) {
        int t8 = this.f8949i.t();
        if (t8 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i4 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        for (int i9 = 0; i9 < t8; i9++) {
            s0 N8 = N(this.f8949i.s(i9));
            if (!N8.q()) {
                int d2 = N8.d();
                if (d2 < i4) {
                    i4 = d2;
                }
                if (d2 > i8) {
                    i8 = d2;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i8;
    }

    public final s0 I(int i4) {
        s0 s0Var = null;
        if (this.f8920G) {
            return null;
        }
        int w8 = this.f8949i.w();
        for (int i8 = 0; i8 < w8; i8++) {
            s0 N8 = N(this.f8949i.v(i8));
            if (N8 != null && !N8.j() && K(N8) == i4) {
                if (((ArrayList) this.f8949i.f5432e).contains(N8.f14950a)) {
                    s0Var = N8;
                } else {
                    return N8;
                }
            }
        }
        return s0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0210, code lost:
    
        if (r1 < r14) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J(int i4, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        r0 r0Var;
        float f8;
        float f9;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int minFlingVelocity;
        boolean z12;
        O o7;
        g gVar;
        Object[] objArr;
        Object[] objArr2;
        int i15;
        int i16;
        PointF a3;
        int i17;
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.f8909A) {
            boolean d2 = abstractC1537c0.d();
            boolean e9 = this.f8962q.e();
            if (d2 && Math.abs(i4) >= i9) {
                i11 = i4;
            } else {
                i11 = 0;
            }
            if (e9 && Math.abs(i8) >= i9) {
                i12 = i8;
            } else {
                i12 = 0;
            }
            if (i11 != 0 || i12 != 0) {
                if (i11 != 0) {
                    EdgeEffect edgeEffect = this.f8924L;
                    if (edgeEffect != null && b.t(edgeEffect) != 0.0f) {
                        int i18 = -i11;
                        if (k0(this.f8924L, i18, getWidth())) {
                            this.f8924L.onAbsorb(i18);
                            i11 = 0;
                        }
                        i13 = i11;
                        i11 = 0;
                    } else {
                        EdgeEffect edgeEffect2 = this.f8926N;
                        if (edgeEffect2 != null && b.t(edgeEffect2) != 0.0f) {
                            if (k0(this.f8926N, i11, getWidth())) {
                                this.f8926N.onAbsorb(i11);
                                i11 = 0;
                            }
                            i13 = i11;
                            i11 = 0;
                        }
                    }
                    if (i12 != 0) {
                        EdgeEffect edgeEffect3 = this.f8925M;
                        if (edgeEffect3 != null && b.t(edgeEffect3) != 0.0f) {
                            int i19 = -i12;
                            if (k0(this.f8925M, i19, getHeight())) {
                                this.f8925M.onAbsorb(i19);
                                i12 = 0;
                            }
                            i14 = 0;
                        } else {
                            EdgeEffect edgeEffect4 = this.f8927O;
                            if (edgeEffect4 != null && b.t(edgeEffect4) != 0.0f) {
                                if (k0(this.f8927O, i12, getHeight())) {
                                    this.f8927O.onAbsorb(i12);
                                    i12 = 0;
                                }
                                i14 = 0;
                            }
                        }
                        r0Var = this.f8948h0;
                        if (i13 == 0 || i12 != 0) {
                            int i20 = -i10;
                            i13 = Math.max(i20, Math.min(i13, i10));
                            i12 = Math.max(i20, Math.min(i12, i10));
                            o0(1);
                            r0Var.a(i13, i12);
                        }
                        if (i11 != 0 && i14 == 0) {
                            if (i13 != 0 || i12 != 0) {
                                return true;
                            }
                        } else {
                            f8 = i11;
                            f9 = i14;
                            if (!dispatchNestedPreFling(f8, f9)) {
                                if (!d2 && !e9) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                                dispatchNestedFling(f8, f9, z8);
                                e0 e0Var = this.f8937b0;
                                if (e0Var != null) {
                                    P p8 = (P) e0Var;
                                    AbstractC1537c0 layoutManager = p8.f14780a.getLayoutManager();
                                    if (layoutManager != 0 && p8.f14780a.getAdapter() != null && ((Math.abs(i14) > (minFlingVelocity = p8.f14780a.getMinFlingVelocity()) || Math.abs(i11) > minFlingVelocity) && ((z12 = layoutManager instanceof n0)))) {
                                        View view = null;
                                        if (!z12) {
                                            o7 = null;
                                        } else {
                                            o7 = new O(p8, p8.f14780a.getContext());
                                        }
                                        if (o7 != null) {
                                            int F2 = layoutManager.F();
                                            if (F2 != 0) {
                                                if (layoutManager.e()) {
                                                    gVar = p8.f(layoutManager);
                                                } else if (layoutManager.d()) {
                                                    gVar = p8.e(layoutManager);
                                                } else {
                                                    gVar = null;
                                                }
                                                if (gVar != null) {
                                                    z10 = false;
                                                    int v8 = layoutManager.v();
                                                    z11 = true;
                                                    int i21 = 0;
                                                    int i22 = Integer.MIN_VALUE;
                                                    int i23 = Integer.MAX_VALUE;
                                                    View view2 = null;
                                                    while (i21 < v8) {
                                                        boolean z13 = z8;
                                                        View u8 = layoutManager.u(i21);
                                                        if (u8 == null) {
                                                            i17 = v8;
                                                        } else {
                                                            i17 = v8;
                                                            int c6 = P.c(u8, gVar);
                                                            if (c6 <= 0 && c6 > i22) {
                                                                view2 = u8;
                                                                i22 = c6;
                                                            }
                                                            if (c6 >= 0 && c6 < i23) {
                                                                view = u8;
                                                                i23 = c6;
                                                            }
                                                        }
                                                        i21++;
                                                        z8 = z13;
                                                        v8 = i17;
                                                    }
                                                    z9 = z8;
                                                    if (!layoutManager.d() ? i14 > 0 : i11 > 0) {
                                                        objArr = true;
                                                    } else {
                                                        objArr = false;
                                                    }
                                                    if (objArr != false && view != null) {
                                                        i16 = AbstractC1537c0.K(view);
                                                    } else if (objArr == false && view2 != null) {
                                                        i16 = AbstractC1537c0.K(view2);
                                                    } else {
                                                        if (objArr != false) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            int K = AbstractC1537c0.K(view);
                                                            int F8 = layoutManager.F();
                                                            if (!z12 || (a3 = ((n0) layoutManager).a(F8 - 1)) == null || (a3.x >= 0.0f && a3.y >= 0.0f)) {
                                                                objArr2 = false;
                                                            } else {
                                                                objArr2 = true;
                                                            }
                                                            if (objArr2 == objArr) {
                                                                i15 = -1;
                                                            } else {
                                                                i15 = 1;
                                                            }
                                                            i16 = i15 + K;
                                                            if (i16 >= 0) {
                                                            }
                                                        }
                                                        i16 = -1;
                                                    }
                                                    if (i16 != -1) {
                                                        o7.f14762a = i16;
                                                        layoutManager.G0(o7);
                                                        return z11;
                                                    }
                                                    if (z9) {
                                                        boolean z14 = z11;
                                                        o0(z14 ? 1 : 0);
                                                        int i24 = -i10;
                                                        r0Var.a(Math.max(i24, Math.min(i11, i10)), Math.max(i24, Math.min(i14, i10)));
                                                        return z14;
                                                    }
                                                    return z10;
                                                }
                                            }
                                            z9 = z8;
                                            z10 = false;
                                            z11 = true;
                                            i16 = -1;
                                            if (i16 != -1) {
                                            }
                                            if (z9) {
                                            }
                                        }
                                    }
                                }
                                z9 = z8;
                                z10 = false;
                                z11 = true;
                                if (z9) {
                                }
                            }
                        }
                    }
                    i14 = i12;
                    i12 = 0;
                    r0Var = this.f8948h0;
                    if (i13 == 0) {
                    }
                    int i202 = -i10;
                    i13 = Math.max(i202, Math.min(i13, i10));
                    i12 = Math.max(i202, Math.min(i12, i10));
                    o0(1);
                    r0Var.a(i13, i12);
                    if (i11 != 0) {
                    }
                    f8 = i11;
                    f9 = i14;
                    if (!dispatchNestedPreFling(f8, f9)) {
                    }
                }
                i13 = 0;
                if (i12 != 0) {
                }
                i14 = i12;
                i12 = 0;
                r0Var = this.f8948h0;
                if (i13 == 0) {
                }
                int i2022 = -i10;
                i13 = Math.max(i2022, Math.min(i13, i10));
                i12 = Math.max(i2022, Math.min(i12, i10));
                o0(1);
                r0Var.a(i13, i12);
                if (i11 != 0) {
                }
                f8 = i11;
                f9 = i14;
                if (!dispatchNestedPreFling(f8, f9)) {
                }
            }
        }
        return false;
    }

    public final int K(s0 s0Var) {
        if ((s0Var.j & 524) == 0 && s0Var.g()) {
            int i4 = s0Var.f14952c;
            ArrayList arrayList = (ArrayList) this.f8947h.f13344c;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                C1532a c1532a = (C1532a) arrayList.get(i8);
                int i9 = c1532a.f14797a;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 8) {
                            int i10 = c1532a.f14798b;
                            if (i10 == i4) {
                                i4 = c1532a.f14799c;
                            } else {
                                if (i10 < i4) {
                                    i4--;
                                }
                                if (c1532a.f14799c <= i4) {
                                    i4++;
                                }
                            }
                        }
                    } else {
                        int i11 = c1532a.f14798b;
                        if (i11 <= i4) {
                            int i12 = c1532a.f14799c;
                            if (i11 + i12 <= i4) {
                                i4 -= i12;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (c1532a.f14798b <= i4) {
                    i4 += c1532a.f14799c;
                }
            }
            return i4;
        }
        return -1;
    }

    public final long L(s0 s0Var) {
        if (this.f8960p.f14789b) {
            return s0Var.f14954e;
        }
        return s0Var.f14952c;
    }

    public final s0 M(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return N(view);
    }

    public final Rect P(View view) {
        d0 d0Var = (d0) view.getLayoutParams();
        boolean z8 = d0Var.f14829c;
        Rect rect = d0Var.f14828b;
        if (z8) {
            o0 o0Var = this.f8951k0;
            if (!o0Var.f14918g || (!d0Var.f14827a.m() && !d0Var.f14827a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.f8966s;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Rect rect2 = this.f8954m;
                    rect2.set(0, 0, 0, 0);
                    ((AbstractC1533a0) arrayList.get(i4)).d(rect2, view, this, o0Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                d0Var.f14829c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean Q() {
        if (this.f8976x && !this.f8920G && !this.f8947h.j()) {
            return false;
        }
        return true;
    }

    public final boolean R() {
        if (this.f8922I > 0) {
            return true;
        }
        return false;
    }

    public final void S(int i4) {
        if (this.f8962q == null) {
            return;
        }
        setScrollState(2);
        this.f8962q.v0(i4);
        awakenScrollBars();
    }

    public final void T() {
        int w8 = this.f8949i.w();
        for (int i4 = 0; i4 < w8; i4++) {
            ((d0) this.f8949i.v(i4).getLayoutParams()).f14829c = true;
        }
        ArrayList arrayList = this.f8943f.f14868c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            d0 d0Var = (d0) ((s0) arrayList.get(i8)).f14950a.getLayoutParams();
            if (d0Var != null) {
                d0Var.f14829c = true;
            }
        }
    }

    public final void U(int i4, int i8, boolean z8) {
        int i9 = i4 + i8;
        int w8 = this.f8949i.w();
        for (int i10 = 0; i10 < w8; i10++) {
            s0 N8 = N(this.f8949i.v(i10));
            if (N8 != null && !N8.q()) {
                int i11 = N8.f14952c;
                o0 o0Var = this.f8951k0;
                if (i11 >= i9) {
                    if (f8901G0) {
                        N8.toString();
                    }
                    N8.n(-i8, z8);
                    o0Var.f14917f = true;
                } else if (i11 >= i4) {
                    if (f8901G0) {
                        N8.toString();
                    }
                    N8.a(8);
                    N8.n(-i8, z8);
                    N8.f14952c = i4 - 1;
                    o0Var.f14917f = true;
                }
            }
        }
        j0 j0Var = this.f8943f;
        ArrayList arrayList = j0Var.f14868c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s0 s0Var = (s0) arrayList.get(size);
            if (s0Var != null) {
                int i12 = s0Var.f14952c;
                if (i12 >= i9) {
                    if (f8901G0) {
                        s0Var.toString();
                    }
                    s0Var.n(-i8, z8);
                } else if (i12 >= i4) {
                    s0Var.a(8);
                    j0Var.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void V() {
        this.f8922I++;
    }

    public final void W(boolean z8) {
        int i4;
        AccessibilityManager accessibilityManager;
        int i8 = this.f8922I - 1;
        this.f8922I = i8;
        if (i8 < 1) {
            if (f8900F0 && i8 < 0) {
                throw new IllegalStateException(AbstractC1149a.e(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f8922I = 0;
            if (z8) {
                int i9 = this.f8913C;
                this.f8913C = 0;
                if (i9 != 0 && (accessibilityManager = this.f8917E) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i9);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f8977x0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    s0 s0Var = (s0) arrayList.get(size);
                    if (s0Var.f14950a.getParent() == this && !s0Var.q() && (i4 = s0Var.f14964q) != -1) {
                        s0Var.f14950a.setImportantForAccessibility(i4);
                        s0Var.f14964q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void X(MotionEvent motionEvent) {
        int i4;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f8930R) {
            if (actionIndex == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            this.f8930R = motionEvent.getPointerId(i4);
            int x8 = (int) (motionEvent.getX(i4) + 0.5f);
            this.f8934V = x8;
            this.f8932T = x8;
            int y4 = (int) (motionEvent.getY(i4) + 0.5f);
            this.f8935W = y4;
            this.f8933U = y4;
        }
    }

    public final void Y() {
        if (!this.f8963q0 && this.f8972v) {
            WeakHashMap weakHashMap = P.O.f4214a;
            postOnAnimation(this.f8979y0);
            this.f8963q0 = true;
        }
    }

    public final void Z() {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (this.f8920G) {
            C1207p c1207p = this.f8947h;
            c1207p.q((ArrayList) c1207p.f13344c);
            c1207p.q((ArrayList) c1207p.f13345d);
            c1207p.f13342a = 0;
            if (this.f8921H) {
                this.f8962q.d0();
            }
        }
        if (this.f8928P != null && this.f8962q.H0()) {
            this.f8947h.p();
        } else {
            this.f8947h.d();
        }
        if (!this.f8957n0 && !this.f8959o0) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (this.f8976x && this.f8928P != null && (((z10 = this.f8920G) || z8 || this.f8962q.f14815f) && (!z10 || this.f8960p.f14789b))) {
            z9 = true;
        } else {
            z9 = false;
        }
        o0 o0Var = this.f8951k0;
        o0Var.j = z9;
        if (z9 && z8 && !this.f8920G && this.f8928P != null && this.f8962q.H0()) {
            z11 = true;
        }
        o0Var.k = z11;
    }

    public final void a0(boolean z8) {
        this.f8921H = z8 | this.f8921H;
        this.f8920G = true;
        int w8 = this.f8949i.w();
        for (int i4 = 0; i4 < w8; i4++) {
            s0 N8 = N(this.f8949i.v(i4));
            if (N8 != null && !N8.q()) {
                N8.a(6);
            }
        }
        T();
        j0 j0Var = this.f8943f;
        ArrayList arrayList = j0Var.f14868c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            s0 s0Var = (s0) arrayList.get(i8);
            if (s0Var != null) {
                s0Var.a(6);
                s0Var.a(1024);
            }
        }
        U u8 = j0Var.f14873h.f8960p;
        if (u8 != null && u8.f14789b) {
            return;
        }
        j0Var.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i4, int i8) {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null) {
            abstractC1537c0.getClass();
        }
        super.addFocusables(arrayList, i4, i8);
    }

    public final void b0(s0 s0Var, C0267o c0267o) {
        s0Var.j &= -8193;
        boolean z8 = this.f8951k0.f14919h;
        C1536c c1536c = this.j;
        if (z8 && s0Var.m() && !s0Var.j() && !s0Var.q()) {
            ((t.g) c1536c.f14809f).g(L(s0Var), s0Var);
        }
        j jVar = (j) c1536c.f14808e;
        C0 c02 = (C0) jVar.get(s0Var);
        if (c02 == null) {
            c02 = C0.a();
            jVar.put(s0Var, c02);
        }
        c02.f14703b = c0267o;
        c02.f14702a |= 4;
    }

    public final void c0() {
        boolean z8;
        EdgeEffect edgeEffect = this.f8924L;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z8 = this.f8924L.isFinished();
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect2 = this.f8925M;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z8 |= this.f8925M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f8926N;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z8 |= this.f8926N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f8927O;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z8 |= this.f8927O.isFinished();
        }
        if (z8) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof d0) && this.f8962q.f((d0) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null && abstractC1537c0.d()) {
            return this.f8962q.j(this.f8951k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null && abstractC1537c0.d()) {
            return this.f8962q.k(this.f8951k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null && abstractC1537c0.d()) {
            return this.f8962q.l(this.f8951k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null && abstractC1537c0.e()) {
            return this.f8962q.m(this.f8951k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null && abstractC1537c0.e()) {
            return this.f8962q.n(this.f8951k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null && abstractC1537c0.e()) {
            return this.f8962q.o(this.f8951k0);
        }
        return 0;
    }

    public final int d0(int i4, float f8) {
        float height = f8 / getHeight();
        float width = i4 / getWidth();
        EdgeEffect edgeEffect = this.f8924L;
        float f9 = 0.0f;
        if (edgeEffect != null && b.t(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.f8924L.onRelease();
            } else {
                float f10 = -b.D(this.f8924L, -width, 1.0f - height);
                if (b.t(this.f8924L) == 0.0f) {
                    this.f8924L.onRelease();
                }
                f9 = f10;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f8926N;
            if (edgeEffect2 != null && b.t(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f8926N.onRelease();
                } else {
                    float D7 = b.D(this.f8926N, width, height);
                    if (b.t(this.f8926N) == 0.0f) {
                        this.f8926N.onRelease();
                    }
                    f9 = D7;
                }
                invalidate();
            }
        }
        return Math.round(f9 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        AbstractC1537c0 layoutManager = getLayoutManager();
        int i4 = 0;
        if (layoutManager != null) {
            if (layoutManager.e()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 92 && keyCode != 93) {
                    if (keyCode == 122 || keyCode == 123) {
                        boolean P4 = layoutManager.P();
                        if (keyCode == 122) {
                            if (P4) {
                                i4 = getAdapter().a();
                            }
                        } else if (!P4) {
                            i4 = getAdapter().a();
                        }
                        m0(i4);
                        return true;
                    }
                } else {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        l0(0, measuredHeight, false);
                        return true;
                    }
                    l0(0, -measuredHeight, false);
                    return true;
                }
            } else if (layoutManager.d()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 != 92 && keyCode2 != 93) {
                    if (keyCode2 == 122 || keyCode2 == 123) {
                        boolean P5 = layoutManager.P();
                        if (keyCode2 == 122) {
                            if (P5) {
                                i4 = getAdapter().a();
                            }
                        } else if (!P5) {
                            i4 = getAdapter().a();
                        }
                        m0(i4);
                        return true;
                    }
                } else {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        l0(measuredWidth, 0, false);
                        return true;
                    }
                    l0(-measuredWidth, 0, false);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f8, float f9, boolean z8) {
        return getScrollingChildHelper().a(f8, f9, z8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f8, float f9) {
        return getScrollingChildHelper().b(f8, f9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i8, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i8, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().d(i4, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z8;
        int i4;
        boolean z9;
        boolean z10;
        int i8;
        super.draw(canvas);
        ArrayList arrayList = this.f8966s;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i9 = 0; i9 < size; i9++) {
            ((AbstractC1533a0) arrayList.get(i9)).f(canvas, this);
        }
        EdgeEffect edgeEffect = this.f8924L;
        boolean z12 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.k) {
                i8 = getPaddingBottom();
            } else {
                i8 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i8, 0.0f);
            EdgeEffect edgeEffect2 = this.f8924L;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z8 = true;
            } else {
                z8 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect3 = this.f8925M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.k) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f8925M;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            z8 |= z10;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f8926N;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.k) {
                i4 = getPaddingTop();
            } else {
                i4 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i4, -width);
            EdgeEffect edgeEffect6 = this.f8926N;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z9 = true;
            } else {
                z9 = false;
            }
            z8 |= z9;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f8927O;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.k) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f8927O;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z8 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z8 || this.f8928P == null || arrayList.size() <= 0 || !this.f8928P.f()) {
            z12 = z8;
        }
        if (z12) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final int e0(int i4, float f8) {
        float width = f8 / getWidth();
        float height = i4 / getHeight();
        EdgeEffect edgeEffect = this.f8925M;
        float f9 = 0.0f;
        if (edgeEffect != null && b.t(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.f8925M.onRelease();
            } else {
                float f10 = -b.D(this.f8925M, -height, width);
                if (b.t(this.f8925M) == 0.0f) {
                    this.f8925M.onRelease();
                }
                f9 = f10;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f8927O;
            if (edgeEffect2 != null && b.t(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f8927O.onRelease();
                } else {
                    float D7 = b.D(this.f8927O, height, 1.0f - width);
                    if (b.t(this.f8927O) == 0.0f) {
                        this.f8927O.onRelease();
                    }
                    f9 = D7;
                }
                invalidate();
            }
        }
        return Math.round(f9 * getHeight());
    }

    public final void f0(AbstractC1533a0 abstractC1533a0) {
        boolean z8;
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null) {
            abstractC1537c0.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f8966s;
        arrayList.remove(abstractC1533a0);
        if (arrayList.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            setWillNotDraw(z8);
        }
        T();
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0183, code lost:
    
        if (r5 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018b, code lost:
    
        if ((r5 * r6) <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0193, code lost:
    
        if ((r5 * r6) >= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0164, code lost:
    
        if (r7 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017d, code lost:
    
        if (r5 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0180, code lost:
    
        if (r7 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i4) {
        boolean z8;
        View view2;
        int i8;
        int i9;
        char c6;
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        this.f8962q.getClass();
        boolean z12 = true;
        if (this.f8960p != null && this.f8962q != null && !R() && !this.f8909A) {
            z8 = true;
        } else {
            z8 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        o0 o0Var = this.f8951k0;
        j0 j0Var = this.f8943f;
        if (z8 && (i4 == 2 || i4 == 1)) {
            if (this.f8962q.e()) {
                if (i4 == 2) {
                    i11 = 130;
                } else {
                    i11 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i11) == null) {
                    z9 = true;
                    if (!z9 && this.f8962q.d()) {
                        if (this.f8962q.f14811b.getLayoutDirection() != 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i4 != 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!(z10 ^ z11)) {
                            i10 = 66;
                        } else {
                            i10 = 17;
                        }
                        if (focusFinder.findNextFocus(this, view, i10) != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    }
                    if (z9) {
                        p();
                        if (E(view) != null) {
                            n0();
                            this.f8962q.X(view, i4, j0Var, o0Var);
                            p0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i4);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (E(view2) != null) {
                        }
                        if (z12) {
                        }
                    }
                    z12 = false;
                    if (z12) {
                    }
                }
            }
            z9 = false;
            if (!z9) {
                if (this.f8962q.f14811b.getLayoutDirection() != 1) {
                }
                if (i4 != 2) {
                }
                if (!(z10 ^ z11)) {
                }
                if (focusFinder.findNextFocus(this, view, i10) != null) {
                }
            }
            if (z9) {
            }
            view2 = focusFinder.findNextFocus(this, view, i4);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z12 = false;
            if (z12) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i4);
            if (findNextFocus == null && z8) {
                p();
                if (E(view) != null) {
                    n0();
                    view2 = this.f8962q.X(view, i4, j0Var, o0Var);
                    p0(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i4);
                }
                g0(view2, null);
                return view;
            }
            if (view2 != null && view2 != this && view2 != view) {
                if (E(view2) != null) {
                    z12 = false;
                } else if (view != null && E(view) != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.f8954m;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.f8956n;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    if (this.f8962q.f14811b.getLayoutDirection() == 1) {
                        i8 = -1;
                    } else {
                        i8 = 1;
                    }
                    int i12 = rect.left;
                    int i13 = rect2.left;
                    if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
                        i9 = 1;
                    } else {
                        int i14 = rect.right;
                        int i15 = rect2.right;
                        if ((i14 > i15 || i12 >= i15) && i12 > i13) {
                            i9 = -1;
                        } else {
                            i9 = 0;
                        }
                    }
                    int i16 = rect.top;
                    int i17 = rect2.top;
                    if ((i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom) {
                        c6 = 1;
                    } else {
                        int i18 = rect.bottom;
                        int i19 = rect2.bottom;
                        if ((i18 > i19 || i16 >= i19) && i16 > i17) {
                            c6 = 65535;
                        } else {
                            c6 = 0;
                        }
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 17) {
                                if (i4 != 33) {
                                    if (i4 != 66) {
                                        if (i4 != 130) {
                                            StringBuilder sb = new StringBuilder("Invalid direction: ");
                                            sb.append(i4);
                                            throw new IllegalArgumentException(AbstractC1149a.e(this, sb));
                                        }
                                    }
                                }
                            }
                        } else if (c6 <= 0) {
                            if (c6 == 0) {
                            }
                        }
                    } else if (c6 >= 0) {
                        if (c6 == 0) {
                        }
                    }
                }
                if (z12) {
                    return view2;
                }
                return super.focusSearch(view, i4);
            }
            z12 = false;
            if (z12) {
            }
        }
    }

    public final void g0(View view, View view2) {
        View view3;
        boolean z8;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f8954m;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof d0) {
            d0 d0Var = (d0) layoutParams;
            if (!d0Var.f14829c) {
                Rect rect2 = d0Var.f14828b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        boolean z9 = !this.f8976x;
        if (view2 == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        abstractC1537c0.s0(this, view, this.f8954m, z9, z8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null) {
            return abstractC1537c0.r();
        }
        throw new IllegalStateException(AbstractC1149a.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null) {
            return abstractC1537c0.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC1149a.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public U getAdapter() {
        return this.f8960p;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null) {
            abstractC1537c0.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i8) {
        return super.getChildDrawingOrder(i4, i8);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.k;
    }

    public u0 getCompatAccessibilityDelegate() {
        return this.f8965r0;
    }

    public Y getEdgeEffectFactory() {
        return this.K;
    }

    public Z getItemAnimator() {
        return this.f8928P;
    }

    public int getItemDecorationCount() {
        return this.f8966s.size();
    }

    public AbstractC1537c0 getLayoutManager() {
        return this.f8962q;
    }

    public int getMaxFlingVelocity() {
        return this.f8940d0;
    }

    public int getMinFlingVelocity() {
        return this.f8938c0;
    }

    public long getNanoTime() {
        if (f8905K0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public e0 getOnFlingListener() {
        return this.f8937b0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f8946g0;
    }

    public i0 getRecycledViewPool() {
        return this.f8943f.c();
    }

    public int getScrollState() {
        return this.f8929Q;
    }

    public final void h(s0 s0Var) {
        boolean z8;
        View view = s0Var.f14950a;
        if (view.getParent() == this) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f8943f.l(M(view));
        if (s0Var.l()) {
            this.f8949i.d(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z8) {
            this.f8949i.b(view, -1, true);
            return;
        }
        e eVar = this.f8949i;
        int indexOfChild = ((S) eVar.f5430c).f14786a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C1541g) eVar.f5431d).h(indexOfChild);
            eVar.x(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h0(int i4, int i8, MotionEvent motionEvent, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        p();
        U u8 = this.f8960p;
        int[] iArr = this.f8975w0;
        if (u8 != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            i0(i4, i8, iArr);
            i10 = iArr[0];
            i11 = iArr[1];
            i12 = i4 - i10;
            i13 = i8 - i11;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (!this.f8966s.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i10, i11, i12, i13, this.f8971u0, i9, iArr);
        int i14 = iArr[0];
        int i15 = i12 - i14;
        int i16 = iArr[1];
        int i17 = i13 - i16;
        if (i14 == 0 && i16 == 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        int i18 = this.f8934V;
        int[] iArr2 = this.f8971u0;
        int i19 = iArr2[0];
        this.f8934V = i18 - i19;
        int i20 = this.f8935W;
        int i21 = iArr2[1];
        this.f8935W = i20 - i21;
        int[] iArr3 = this.f8973v0;
        iArr3[0] = iArr3[0] + i19;
        iArr3[1] = iArr3[1] + i21;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !b.y(motionEvent, 8194)) {
                float x8 = motionEvent.getX();
                float f8 = i15;
                float y4 = motionEvent.getY();
                float f9 = i17;
                if (f8 < 0.0f) {
                    z();
                    z9 = true;
                    z10 = false;
                    b.D(this.f8924L, (-f8) / getWidth(), 1.0f - (y4 / getHeight()));
                } else {
                    z9 = true;
                    z10 = false;
                    if (f8 > 0.0f) {
                        A();
                        b.D(this.f8926N, f8 / getWidth(), y4 / getHeight());
                    } else {
                        z11 = false;
                        if (f9 >= 0.0f) {
                            B();
                            b.D(this.f8925M, (-f9) / getHeight(), x8 / getWidth());
                        } else {
                            if (f9 > 0.0f) {
                                y();
                                b.D(this.f8927O, f9 / getHeight(), 1.0f - (x8 / getWidth()));
                            }
                            if (!z11 || f8 != 0.0f || f9 != 0.0f) {
                                postInvalidateOnAnimation();
                            }
                            if (Build.VERSION.SDK_INT >= 31 && b.y(motionEvent, 4194304)) {
                                c0();
                            }
                        }
                        z11 = z9;
                        if (!z11) {
                        }
                        postInvalidateOnAnimation();
                        if (Build.VERSION.SDK_INT >= 31) {
                            c0();
                        }
                    }
                }
                z11 = z9;
                if (f9 >= 0.0f) {
                }
                z11 = z9;
                if (!z11) {
                }
                postInvalidateOnAnimation();
                if (Build.VERSION.SDK_INT >= 31) {
                }
            } else {
                z9 = true;
                z10 = false;
            }
            n(i4, i8);
        } else {
            z9 = true;
            z10 = false;
        }
        if (i10 != 0 || i11 != 0) {
            x(i10, i11);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z8 && i10 == 0 && i11 == 0) {
            return z10;
        }
        return z9;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(AbstractC1533a0 abstractC1533a0) {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null) {
            abstractC1537c0.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f8966s;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC1533a0);
        T();
        requestLayout();
    }

    public final void i0(int i4, int i8, int[] iArr) {
        int i9;
        int i10;
        s0 s0Var;
        n0();
        V();
        Trace.beginSection("RV Scroll");
        o0 o0Var = this.f8951k0;
        D(o0Var);
        j0 j0Var = this.f8943f;
        if (i4 != 0) {
            i9 = this.f8962q.u0(i4, j0Var, o0Var);
        } else {
            i9 = 0;
        }
        if (i8 != 0) {
            i10 = this.f8962q.w0(i8, j0Var, o0Var);
        } else {
            i10 = 0;
        }
        Trace.endSection();
        int t8 = this.f8949i.t();
        for (int i11 = 0; i11 < t8; i11++) {
            View s8 = this.f8949i.s(i11);
            s0 M8 = M(s8);
            if (M8 != null && (s0Var = M8.f14958i) != null) {
                View view = s0Var.f14950a;
                int left = s8.getLeft();
                int top = s8.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        W(true);
        p0(false);
        if (iArr != null) {
            iArr[0] = i9;
            iArr[1] = i10;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f8972v;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f8909A;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f4292d;
    }

    public final void j(g0 g0Var) {
        if (this.f8955m0 == null) {
            this.f8955m0 = new ArrayList();
        }
        this.f8955m0.add(g0Var);
    }

    public final void j0(int i4) {
        if (this.f8909A) {
            return;
        }
        r0();
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1537c0.v0(i4);
            awakenScrollBars();
        }
    }

    public final void k(String str) {
        if (R()) {
            if (str == null) {
                throw new IllegalStateException(AbstractC1149a.e(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        }
        if (this.f8923J > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AbstractC1149a.e(this, new StringBuilder(""))));
        }
    }

    public final boolean k0(EdgeEffect edgeEffect, int i4, int i8) {
        if (i4 <= 0) {
            float t8 = b.t(edgeEffect) * i8;
            float abs = Math.abs(-i4) * 0.35f;
            float f8 = this.f8939d * 0.015f;
            double log = Math.log(abs / f8);
            double d2 = f8903I0;
            if (((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * f8)) < t8) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void l0(int i4, int i8, boolean z8) {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.f8909A) {
            int i9 = 0;
            if (!abstractC1537c0.d()) {
                i4 = 0;
            }
            if (!this.f8962q.e()) {
                i8 = 0;
            }
            if (i4 == 0 && i8 == 0) {
                return;
            }
            if (z8) {
                if (i4 != 0) {
                    i9 = 1;
                }
                if (i8 != 0) {
                    i9 |= 2;
                }
                getScrollingChildHelper().g(i9, 1);
            }
            this.f8948h0.c(i4, i8, Integer.MIN_VALUE, null);
        }
    }

    public final void m() {
        int w8 = this.f8949i.w();
        for (int i4 = 0; i4 < w8; i4++) {
            s0 N8 = N(this.f8949i.v(i4));
            if (!N8.q()) {
                N8.f14953d = -1;
                N8.f14956g = -1;
            }
        }
        j0 j0Var = this.f8943f;
        ArrayList arrayList = j0Var.f14866a;
        ArrayList arrayList2 = j0Var.f14868c;
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            s0 s0Var = (s0) arrayList2.get(i8);
            s0Var.f14953d = -1;
            s0Var.f14956g = -1;
        }
        int size2 = arrayList.size();
        for (int i9 = 0; i9 < size2; i9++) {
            s0 s0Var2 = (s0) arrayList.get(i9);
            s0Var2.f14953d = -1;
            s0Var2.f14956g = -1;
        }
        ArrayList arrayList3 = j0Var.f14867b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i10 = 0; i10 < size3; i10++) {
                s0 s0Var3 = (s0) j0Var.f14867b.get(i10);
                s0Var3.f14953d = -1;
                s0Var3.f14956g = -1;
            }
        }
    }

    public final void m0(int i4) {
        if (this.f8909A) {
            return;
        }
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1537c0.F0(this, i4);
        }
    }

    public final void n(int i4, int i8) {
        boolean z8;
        EdgeEffect edgeEffect = this.f8924L;
        if (edgeEffect != null && !edgeEffect.isFinished() && i4 > 0) {
            this.f8924L.onRelease();
            z8 = this.f8924L.isFinished();
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect2 = this.f8926N;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.f8926N.onRelease();
            z8 |= this.f8926N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f8925M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i8 > 0) {
            this.f8925M.onRelease();
            z8 |= this.f8925M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f8927O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i8 < 0) {
            this.f8927O.onRelease();
            z8 |= this.f8927O.isFinished();
        }
        if (z8) {
            postInvalidateOnAnimation();
        }
    }

    public final void n0() {
        int i4 = this.f8978y + 1;
        this.f8978y = i4;
        if (i4 == 1 && !this.f8909A) {
            this.f8980z = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(int i4) {
        boolean d2 = this.f8962q.d();
        int i8 = d2;
        if (this.f8962q.e()) {
            i8 = (d2 ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i8, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        boolean z8;
        float f8;
        super.onAttachedToWindow();
        this.f8922I = 0;
        this.f8972v = true;
        if (this.f8976x && !isLayoutRequested()) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f8976x = z8;
        this.f8943f.d();
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null) {
            abstractC1537c0.f14816g = true;
            abstractC1537c0.V(this);
        }
        this.f8963q0 = false;
        if (f8905K0) {
            ThreadLocal threadLocal = RunnableC1556w.f15010h;
            RunnableC1556w runnableC1556w = (RunnableC1556w) threadLocal.get();
            this.f8950i0 = runnableC1556w;
            if (runnableC1556w == null) {
                this.f8950i0 = new RunnableC1556w();
                WeakHashMap weakHashMap = P.O.f4214a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f8 = display.getRefreshRate();
                }
                f8 = 60.0f;
                RunnableC1556w runnableC1556w2 = this.f8950i0;
                runnableC1556w2.f15014f = 1.0E9f / f8;
                threadLocal.set(runnableC1556w2);
            }
            ArrayList arrayList = this.f8950i0.f15012d;
            if (f8900F0 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RunnableC1556w runnableC1556w;
        super.onDetachedFromWindow();
        Z z8 = this.f8928P;
        if (z8 != null) {
            z8.e();
        }
        r0();
        int i4 = 0;
        this.f8972v = false;
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null) {
            abstractC1537c0.f14816g = false;
            abstractC1537c0.W(this);
        }
        this.f8977x0.clear();
        removeCallbacks(this.f8979y0);
        this.j.getClass();
        do {
        } while (C0.f14701d.a() != null);
        j0 j0Var = this.f8943f;
        ArrayList arrayList = j0Var.f14868c;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            c.J(((s0) arrayList.get(i8)).f14950a);
        }
        j0Var.e(j0Var.f14873h.f8960p, false);
        while (i4 < getChildCount()) {
            int i9 = i4 + 1;
            View childAt = getChildAt(i4);
            if (childAt != null) {
                a aVar = (a) childAt.getTag(com.buzbuz.smartautoclicker.R.id.pooling_container_listener_holder_tag);
                if (aVar == null) {
                    aVar = new a();
                    childAt.setTag(com.buzbuz.smartautoclicker.R.id.pooling_container_listener_holder_tag, aVar);
                }
                ArrayList arrayList2 = aVar.f5937a;
                int W7 = AbstractC0437l.W(arrayList2);
                if (-1 >= W7) {
                    i4 = i9;
                } else {
                    arrayList2.get(W7).getClass();
                    throw new ClassCastException();
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if (f8905K0 && (runnableC1556w = this.f8950i0) != null) {
            boolean remove = runnableC1556w.f15012d.remove(this);
            if (f8900F0 && !remove) {
                throw new IllegalStateException("RecyclerView removal failed!");
            }
            this.f8950i0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f8966s;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC1533a0) arrayList.get(i4)).e(canvas, this, this.f8951k0);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f8;
        int i4;
        boolean z8;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f9;
        if (this.f8962q != null && !this.f8909A && motionEvent.getAction() == 8) {
            float f10 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f8962q.e()) {
                    f9 = -motionEvent.getAxisValue(9);
                } else {
                    f9 = 0.0f;
                }
                if (this.f8962q.d()) {
                    f10 = motionEvent.getAxisValue(10);
                }
                f8 = f10;
                i4 = 0;
                z8 = false;
                f10 = f9;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f8 = motionEvent.getAxisValue(26);
                if (this.f8962q.e()) {
                    float f11 = -f8;
                    f8 = 0.0f;
                    f10 = f11;
                } else if (!this.f8962q.d()) {
                    f8 = 0.0f;
                }
                i4 = 26;
                z8 = this.f8914C0;
            } else {
                f8 = 0.0f;
                i4 = 0;
                z8 = false;
            }
            int i13 = (int) (f10 * this.f8944f0);
            int i14 = (int) (f8 * this.f8942e0);
            if (z8) {
                OverScroller overScroller = this.f8948h0.f14940f;
                l0((overScroller.getFinalX() - overScroller.getCurrX()) + i14, (overScroller.getFinalY() - overScroller.getCurrY()) + i13, true);
            } else {
                AbstractC1537c0 abstractC1537c0 = this.f8962q;
                if (abstractC1537c0 == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f8909A) {
                    int[] iArr = this.f8975w0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean d2 = abstractC1537c0.d();
                    boolean e9 = this.f8962q.e();
                    if (e9) {
                        i8 = (d2 ? 1 : 0) | 2;
                    } else {
                        i8 = d2 ? 1 : 0;
                    }
                    float y4 = motionEvent.getY();
                    float x8 = motionEvent.getX();
                    int d02 = i14 - d0(i14, y4);
                    int e02 = i13 - e0(i13, x8);
                    getScrollingChildHelper().g(i8, 1);
                    if (d2) {
                        i9 = d02;
                    } else {
                        i9 = 0;
                    }
                    if (e9) {
                        i10 = e02;
                    } else {
                        i10 = 0;
                    }
                    if (v(i9, i10, 1, this.f8975w0, this.f8971u0)) {
                        d02 -= iArr[0];
                        e02 -= iArr[1];
                    }
                    if (d2) {
                        i11 = d02;
                    } else {
                        i11 = 0;
                    }
                    if (e9) {
                        i12 = e02;
                    } else {
                        i12 = 0;
                    }
                    h0(i11, i12, motionEvent, 1);
                    RunnableC1556w runnableC1556w = this.f8950i0;
                    if (runnableC1556w != null && (d02 != 0 || e02 != 0)) {
                        runnableC1556w.a(this, d02, e02);
                    }
                    q0(1);
                }
            }
            if (i4 != 0 && !z8) {
                this.f8918E0.a(motionEvent, i4);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean z9;
        if (!this.f8909A) {
            this.f8970u = null;
            if (F(motionEvent)) {
                VelocityTracker velocityTracker = this.f8931S;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                q0(0);
                c0();
                setScrollState(0);
                return true;
            }
            AbstractC1537c0 abstractC1537c0 = this.f8962q;
            if (abstractC1537c0 != null) {
                boolean d2 = abstractC1537c0.d();
                boolean e9 = this.f8962q.e();
                if (this.f8931S == null) {
                    this.f8931S = VelocityTracker.obtain();
                }
                this.f8931S.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        X(motionEvent);
                                    }
                                } else {
                                    this.f8930R = motionEvent.getPointerId(actionIndex);
                                    int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.f8934V = x8;
                                    this.f8932T = x8;
                                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.f8935W = y4;
                                    this.f8933U = y4;
                                }
                            } else {
                                VelocityTracker velocityTracker2 = this.f8931S;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                                q0(0);
                                c0();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f8930R);
                            if (findPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f8930R + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x9 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            if (this.f8929Q != 1) {
                                int i4 = x9 - this.f8932T;
                                int i8 = y5 - this.f8933U;
                                if (d2 && Math.abs(i4) > this.f8936a0) {
                                    this.f8934V = x9;
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (e9 && Math.abs(i8) > this.f8936a0) {
                                    this.f8935W = y5;
                                    z9 = true;
                                }
                                if (z9) {
                                    setScrollState(1);
                                }
                            }
                        }
                    } else {
                        this.f8931S.clear();
                        q0(0);
                    }
                } else {
                    if (this.f8911B) {
                        this.f8911B = false;
                    }
                    this.f8930R = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.f8934V = x10;
                    this.f8932T = x10;
                    int y8 = (int) (motionEvent.getY() + 0.5f);
                    this.f8935W = y8;
                    this.f8933U = y8;
                    EdgeEffect edgeEffect = this.f8924L;
                    if (edgeEffect != null && b.t(edgeEffect) != 0.0f && !canScrollHorizontally(-1)) {
                        b.D(this.f8924L, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    EdgeEffect edgeEffect2 = this.f8926N;
                    if (edgeEffect2 != null && b.t(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        b.D(this.f8926N, 0.0f, motionEvent.getY() / getHeight());
                        z8 = true;
                    }
                    EdgeEffect edgeEffect3 = this.f8925M;
                    if (edgeEffect3 != null && b.t(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        b.D(this.f8925M, 0.0f, motionEvent.getX() / getWidth());
                        z8 = true;
                    }
                    EdgeEffect edgeEffect4 = this.f8927O;
                    if (edgeEffect4 != null && b.t(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        b.D(this.f8927O, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z8 = true;
                    }
                    if (z8 || this.f8929Q == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        q0(1);
                    }
                    int[] iArr = this.f8973v0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    o0(0);
                }
                if (this.f8929Q == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.f8976x = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i8) {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 == null) {
            q(i4, i8);
            return;
        }
        boolean O8 = abstractC1537c0.O();
        boolean z8 = false;
        o0 o0Var = this.f8951k0;
        if (O8) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i8);
            this.f8962q.f14811b.q(i4, i8);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z8 = true;
            }
            this.f8981z0 = z8;
            if (!z8 && this.f8960p != null) {
                if (o0Var.f14915d == 1) {
                    t();
                }
                this.f8962q.y0(i4, i8);
                o0Var.f14920i = true;
                u();
                this.f8962q.A0(i4, i8);
                if (this.f8962q.D0()) {
                    this.f8962q.y0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    o0Var.f14920i = true;
                    u();
                    this.f8962q.A0(i4, i8);
                }
                this.f8910A0 = getMeasuredWidth();
                this.f8912B0 = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.f8974w) {
            this.f8962q.f14811b.q(i4, i8);
            return;
        }
        if (this.f8915D) {
            n0();
            V();
            Z();
            W(true);
            if (o0Var.k) {
                o0Var.f14918g = true;
            } else {
                this.f8947h.d();
                o0Var.f14918g = false;
            }
            this.f8915D = false;
            p0(false);
        } else if (o0Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        U u8 = this.f8960p;
        if (u8 != null) {
            o0Var.f14916e = u8.a();
        } else {
            o0Var.f14916e = 0;
        }
        n0();
        this.f8962q.f14811b.q(i4, i8);
        p0(false);
        o0Var.f14918g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (R()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l0 l0Var = (l0) parcelable;
        this.f8945g = l0Var;
        super.onRestoreInstanceState(l0Var.f6209d);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, V.b, t0.l0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new V.b(super.onSaveInstanceState());
        l0 l0Var = this.f8945g;
        if (l0Var != null) {
            bVar.f14885f = l0Var.f14885f;
            return bVar;
        }
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null) {
            bVar.f14885f = abstractC1537c0.k0();
            return bVar;
        }
        bVar.f14885f = null;
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i8, int i9, int i10) {
        super.onSizeChanged(i4, i8, i9, i10);
        if (i4 == i9 && i8 == i10) {
            return;
        }
        this.f8927O = null;
        this.f8925M = null;
        this.f8926N = null;
        this.f8924L = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        float f8;
        float f9;
        int i4;
        int i8;
        int i9;
        int i10;
        boolean z9;
        if (!this.f8909A && !this.f8911B) {
            f0 f0Var = this.f8970u;
            if (f0Var == null) {
                if (motionEvent.getAction() == 0) {
                    z8 = false;
                } else {
                    z8 = F(motionEvent);
                }
            } else {
                f0Var.a(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f8970u = null;
                }
                z8 = true;
            }
            if (z8) {
                VelocityTracker velocityTracker = this.f8931S;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                q0(0);
                c0();
                setScrollState(0);
                return true;
            }
            AbstractC1537c0 abstractC1537c0 = this.f8962q;
            if (abstractC1537c0 != null) {
                boolean d2 = abstractC1537c0.d();
                boolean e9 = this.f8962q.e();
                if (this.f8931S == null) {
                    this.f8931S = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.f8973v0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        X(motionEvent);
                                    }
                                } else {
                                    this.f8930R = motionEvent.getPointerId(actionIndex);
                                    int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.f8934V = x8;
                                    this.f8932T = x8;
                                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.f8935W = y4;
                                    this.f8933U = y4;
                                }
                            } else {
                                VelocityTracker velocityTracker2 = this.f8931S;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                                q0(0);
                                c0();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f8930R);
                            if (findPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f8930R + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x9 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            int i11 = this.f8934V - x9;
                            int i12 = this.f8935W - y5;
                            if (this.f8929Q != 1) {
                                if (d2) {
                                    if (i11 > 0) {
                                        i11 = Math.max(0, i11 - this.f8936a0);
                                    } else {
                                        i11 = Math.min(0, i11 + this.f8936a0);
                                    }
                                    if (i11 != 0) {
                                        z9 = true;
                                        if (e9) {
                                            if (i12 > 0) {
                                                i12 = Math.max(0, i12 - this.f8936a0);
                                            } else {
                                                i12 = Math.min(0, i12 + this.f8936a0);
                                            }
                                            if (i12 != 0) {
                                                z9 = true;
                                            }
                                        }
                                        if (z9) {
                                            setScrollState(1);
                                        }
                                    }
                                }
                                z9 = false;
                                if (e9) {
                                }
                                if (z9) {
                                }
                            }
                            if (this.f8929Q == 1) {
                                int[] iArr2 = this.f8975w0;
                                iArr2[0] = 0;
                                iArr2[1] = 0;
                                int d02 = i11 - d0(i11, motionEvent.getY());
                                int e02 = i12 - e0(i12, motionEvent.getX());
                                if (d2) {
                                    i4 = d02;
                                } else {
                                    i4 = 0;
                                }
                                if (e9) {
                                    i8 = e02;
                                } else {
                                    i8 = 0;
                                }
                                boolean v8 = v(i4, i8, 0, this.f8975w0, this.f8971u0);
                                int[] iArr3 = this.f8971u0;
                                if (v8) {
                                    d02 -= iArr2[0];
                                    e02 -= iArr2[1];
                                    iArr[0] = iArr[0] + iArr3[0];
                                    iArr[1] = iArr[1] + iArr3[1];
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                int i13 = d02;
                                int i14 = e02;
                                this.f8934V = x9 - iArr3[0];
                                this.f8935W = y5 - iArr3[1];
                                if (d2) {
                                    i9 = i13;
                                } else {
                                    i9 = 0;
                                }
                                if (e9) {
                                    i10 = i14;
                                } else {
                                    i10 = 0;
                                }
                                if (h0(i9, i10, motionEvent, 0)) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                RunnableC1556w runnableC1556w = this.f8950i0;
                                if (runnableC1556w != null && (i13 != 0 || i14 != 0)) {
                                    runnableC1556w.a(this, i13, i14);
                                }
                            }
                        }
                    } else {
                        this.f8931S.addMovement(obtain);
                        VelocityTracker velocityTracker3 = this.f8931S;
                        int i15 = this.f8940d0;
                        velocityTracker3.computeCurrentVelocity(1000, i15);
                        if (d2) {
                            f8 = -this.f8931S.getXVelocity(this.f8930R);
                        } else {
                            f8 = 0.0f;
                        }
                        if (e9) {
                            f9 = -this.f8931S.getYVelocity(this.f8930R);
                        } else {
                            f9 = 0.0f;
                        }
                        if ((f8 == 0.0f && f9 == 0.0f) || !J((int) f8, (int) f9, this.f8938c0, i15)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker4 = this.f8931S;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        q0(0);
                        c0();
                        obtain.recycle();
                        return true;
                    }
                } else {
                    this.f8930R = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.f8934V = x10;
                    this.f8932T = x10;
                    int y8 = (int) (motionEvent.getY() + 0.5f);
                    this.f8935W = y8;
                    this.f8933U = y8;
                    o0(0);
                }
                this.f8931S.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (this.f8976x && !this.f8920G) {
            if (this.f8947h.j()) {
                C1207p c1207p = this.f8947h;
                int i4 = c1207p.f13342a;
                if ((i4 & 4) != 0 && (i4 & 11) == 0) {
                    Trace.beginSection("RV PartialInvalidate");
                    n0();
                    V();
                    this.f8947h.p();
                    if (!this.f8980z) {
                        int t8 = this.f8949i.t();
                        int i8 = 0;
                        while (true) {
                            if (i8 < t8) {
                                s0 N8 = N(this.f8949i.s(i8));
                                if (N8 != null && !N8.q() && N8.m()) {
                                    s();
                                    break;
                                }
                                i8++;
                            } else {
                                this.f8947h.c();
                                break;
                            }
                        }
                    }
                    p0(true);
                    W(true);
                    Trace.endSection();
                    return;
                }
                if (c1207p.j()) {
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            return;
        }
        Trace.beginSection("RV FullInvalidate");
        s();
        Trace.endSection();
    }

    public final void p0(boolean z8) {
        if (this.f8978y < 1) {
            if (!f8900F0) {
                this.f8978y = 1;
            } else {
                throw new IllegalStateException(AbstractC1149a.e(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z8 && !this.f8909A) {
            this.f8980z = false;
        }
        if (this.f8978y == 1) {
            if (z8 && this.f8980z && !this.f8909A && this.f8962q != null && this.f8960p != null) {
                s();
            }
            if (!this.f8909A) {
                this.f8980z = false;
            }
        }
        this.f8978y--;
    }

    public final void q(int i4, int i8) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = P.O.f4214a;
        setMeasuredDimension(AbstractC1537c0.g(i4, paddingRight, getMinimumWidth()), AbstractC1537c0.g(i8, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void q0(int i4) {
        getScrollingChildHelper().h(i4);
    }

    public final void r(View view) {
        N(view);
        ArrayList arrayList = this.f8919F;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1530D c1530d = (C1530D) this.f8919F.get(size);
                c1530d.p(view);
                s0 M8 = c1530d.f14722r.M(view);
                if (M8 != null) {
                    s0 s0Var = c1530d.f14709c;
                    if (s0Var != null && M8 == s0Var) {
                        c1530d.q(null, 0);
                    } else {
                        c1530d.k(M8, false);
                        if (c1530d.f14707a.remove(M8.f14950a)) {
                            c1530d.f14717m.a(c1530d.f14722r, M8);
                        }
                    }
                }
            }
        }
    }

    public final void r0() {
        J j;
        setScrollState(0);
        r0 r0Var = this.f8948h0;
        r0Var.j.removeCallbacks(r0Var);
        r0Var.f14940f.abortAnimation();
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null && (j = abstractC1537c0.f14814e) != null) {
            j.i();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z8) {
        s0 N8 = N(view);
        if (N8 != null) {
            if (N8.l()) {
                N8.j &= -257;
            } else if (!N8.q()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(N8);
                throw new IllegalArgumentException(AbstractC1149a.e(this, sb));
            }
        } else if (f8900F0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(AbstractC1149a.e(this, sb2));
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        J j = this.f8962q.f14814e;
        if ((j == null || !j.f14766e) && !R() && view2 != null) {
            g0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        return this.f8962q.s0(this, view, rect, z8, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        ArrayList arrayList = this.f8968t;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((f0) arrayList.get(i4)).c(z8);
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f8978y == 0 && !this.f8909A) {
            super.requestLayout();
        } else {
            this.f8980z = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0346, code lost:
    
        if (((java.util.ArrayList) r21.f8949i.f5432e).contains(getFocusedChild()) == false) goto L225;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03f2  */
    /* JADX WARN: Type inference failed for: r13v9, types: [P.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r9v0, types: [t0.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        boolean z8;
        boolean z9;
        boolean z10;
        s0 s0Var;
        View findViewById;
        boolean z11;
        C0267o c0267o;
        ?? r32;
        RecyclerView recyclerView;
        boolean g8;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.f8960p == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f8962q == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        o0 o0Var = this.f8951k0;
        boolean z15 = false;
        o0Var.f14920i = false;
        boolean z16 = true;
        if (this.f8981z0 && (this.f8910A0 != getWidth() || this.f8912B0 != getHeight())) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f8910A0 = 0;
        this.f8912B0 = 0;
        this.f8981z0 = false;
        if (o0Var.f14915d == 1) {
            t();
            this.f8962q.x0(this);
            u();
        } else {
            C1207p c1207p = this.f8947h;
            if ((((ArrayList) c1207p.f13345d).isEmpty() || ((ArrayList) c1207p.f13344c).isEmpty()) && !z8 && this.f8962q.f14821n == getWidth() && this.f8962q.f14822o == getHeight()) {
                this.f8962q.x0(this);
            } else {
                this.f8962q.x0(this);
                u();
            }
        }
        o0Var.a(4);
        n0();
        V();
        o0Var.f14915d = 1;
        boolean z17 = o0Var.j;
        j0 j0Var = this.f8943f;
        ?? r9 = this.j;
        if (z17) {
            int t8 = this.f8949i.t() - 1;
            while (t8 >= 0) {
                s0 N8 = N(this.f8949i.s(t8));
                if (N8.q()) {
                    z12 = z16;
                } else {
                    long L8 = L(N8);
                    this.f8928P.getClass();
                    ?? obj = new Object();
                    obj.a(N8);
                    t.g gVar = (t.g) r9.f14809f;
                    j jVar = (j) r9.f14808e;
                    s0 s0Var2 = (s0) gVar.c(L8);
                    if (s0Var2 != null && !s0Var2.q()) {
                        z12 = z16;
                        C0 c02 = (C0) jVar.get(s0Var2);
                        if (c02 != null && (c02.f14702a & 1) != 0) {
                            z13 = z12;
                        } else {
                            z13 = false;
                        }
                        C0 c03 = (C0) jVar.get(N8);
                        if (c03 != null && (c03.f14702a & 1) != 0) {
                            z14 = z12;
                        } else {
                            z14 = false;
                        }
                        if (z13 && s0Var2 == N8) {
                            r9.a(N8, obj);
                        } else {
                            C0267o s8 = r9.s(s0Var2, 4);
                            r9.a(N8, obj);
                            C0267o s9 = r9.s(N8, 8);
                            if (s8 == null) {
                                int t9 = this.f8949i.t();
                                for (int i4 = 0; i4 < t9; i4++) {
                                    s0 N9 = N(this.f8949i.s(i4));
                                    if (N9 != N8 && L(N9) == L8) {
                                        U u8 = this.f8960p;
                                        if (u8 != null && u8.f14789b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                            sb.append(N9);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(N8);
                                            throw new IllegalStateException(AbstractC1149a.e(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                        sb2.append(N9);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(N8);
                                        throw new IllegalStateException(AbstractC1149a.e(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + s0Var2 + " cannot be found but it is necessary for " + N8 + C());
                            } else {
                                s0Var2.p(false);
                                if (z13) {
                                    h(s0Var2);
                                }
                                if (s0Var2 != N8) {
                                    if (z14) {
                                        h(N8);
                                    }
                                    s0Var2.f14957h = N8;
                                    h(s0Var2);
                                    j0Var.l(s0Var2);
                                    N8.p(false);
                                    N8.f14958i = s0Var2;
                                }
                                if (this.f8928P.a(s0Var2, N8, s8, s9)) {
                                    Y();
                                }
                            }
                        }
                    } else {
                        z12 = z16;
                        r9.a(N8, obj);
                    }
                }
                t8--;
                z16 = z12;
            }
            z9 = z16;
            j jVar2 = (j) r9.f14808e;
            int i8 = jVar2.f14670f - 1;
            while (i8 >= 0) {
                s0 s0Var3 = (s0) jVar2.f(i8);
                C0 c04 = (C0) jVar2.g(i8);
                int i9 = c04.f14702a;
                int i10 = i9 & 3;
                S s10 = this.f8916D0;
                if (i10 == 3) {
                    RecyclerView recyclerView2 = s10.f14786a;
                    recyclerView2.f8962q.p0(s0Var3.f14950a, recyclerView2.f8943f);
                    r32 = z15;
                } else if ((i9 & 1) != 0) {
                    C0267o c0267o2 = c04.f14703b;
                    if (c0267o2 == null) {
                        RecyclerView recyclerView3 = s10.f14786a;
                        recyclerView3.f8962q.p0(s0Var3.f14950a, recyclerView3.f8943f);
                        r32 = z15;
                    } else {
                        s10.b(s0Var3, c0267o2, c04.f14704c);
                        r32 = z15;
                    }
                } else if ((i9 & 14) == 14) {
                    s10.a(s0Var3, c04.f14703b, c04.f14704c);
                    r32 = z15;
                } else if ((i9 & 12) == 12) {
                    C0267o c0267o3 = c04.f14703b;
                    C0267o c0267o4 = c04.f14704c;
                    s10.getClass();
                    s0Var3.p(z15);
                    RecyclerView recyclerView4 = s10.f14786a;
                    if (recyclerView4.f8920G) {
                        if (recyclerView4.f8928P.a(s0Var3, s0Var3, c0267o3, c0267o4)) {
                            recyclerView4.Y();
                        }
                    } else {
                        C1548n c1548n = (C1548n) recyclerView4.f8928P;
                        c1548n.getClass();
                        int i11 = c0267o3.f4298a;
                        int i12 = c0267o4.f4298a;
                        if (i11 == i12 && c0267o3.f4299b == c0267o4.f4299b) {
                            c1548n.c(s0Var3);
                            recyclerView = recyclerView4;
                            g8 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g8 = c1548n.g(s0Var3, i11, c0267o3.f4299b, i12, c0267o4.f4299b);
                        }
                        if (g8) {
                            recyclerView.Y();
                        }
                    }
                    r32 = 0;
                } else {
                    if ((i9 & 4) != 0) {
                        c0267o = null;
                        s10.b(s0Var3, c04.f14703b, null);
                    } else {
                        c0267o = null;
                        if ((i9 & 8) != 0) {
                            s10.a(s0Var3, c04.f14703b, c04.f14704c);
                        }
                    }
                    r32 = 0;
                    c04.f14702a = r32;
                    c04.f14703b = c0267o;
                    c04.f14704c = c0267o;
                    C0.f14701d.c(c04);
                    i8--;
                    z15 = false;
                }
                c0267o = null;
                c04.f14702a = r32;
                c04.f14703b = c0267o;
                c04.f14704c = c0267o;
                C0.f14701d.c(c04);
                i8--;
                z15 = false;
            }
        } else {
            z9 = true;
        }
        View view = null;
        this.f8962q.o0(j0Var);
        o0Var.f14913b = o0Var.f14916e;
        int i13 = 0;
        this.f8920G = false;
        this.f8921H = false;
        o0Var.j = false;
        o0Var.k = false;
        this.f8962q.f14815f = false;
        ArrayList arrayList = j0Var.f14867b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0.k) {
            abstractC1537c0.j = 0;
            abstractC1537c0.k = false;
            j0Var.m();
        }
        this.f8962q.i0(o0Var);
        boolean z18 = z9;
        W(z18);
        p0(false);
        ((j) r9.f14808e).clear();
        ((t.g) r9.f14809f).a();
        int[] iArr = this.f8967s0;
        int i14 = iArr[0];
        int i15 = iArr[z18 ? 1 : 0];
        G(iArr);
        if (iArr[0] == i14 && iArr[z18 ? 1 : 0] == i15) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            x(0, 0);
        }
        if (this.f8946g0 && this.f8960p != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j = o0Var.f14922m;
            if (j != -1 && (z11 = this.f8960p.f14789b) && z11) {
                int w8 = this.f8949i.w();
                int i16 = 0;
                s0Var = null;
                while (true) {
                    if (i16 >= w8) {
                        break;
                    }
                    s0 N10 = N(this.f8949i.v(i16));
                    if (N10 != null && !N10.j() && N10.f14954e == j) {
                        if (((ArrayList) this.f8949i.f5432e).contains(N10.f14950a)) {
                            s0Var = N10;
                        } else {
                            s0Var = N10;
                            break;
                        }
                    }
                    i16++;
                }
            } else {
                s0Var = null;
            }
            if (s0Var != null) {
                View view2 = s0Var.f14950a;
                if (!((ArrayList) this.f8949i.f5432e).contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i17 = o0Var.f14923n;
                        if (i17 != -1 && (findViewById = view.findViewById(i17)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (this.f8949i.t() > 0) {
                int i18 = o0Var.f14921l;
                if (i18 != -1) {
                    i13 = i18;
                }
                int b4 = o0Var.b();
                for (int i19 = i13; i19 < b4; i19++) {
                    s0 I8 = I(i19);
                    if (I8 == null) {
                        break;
                    }
                    View view3 = I8.f14950a;
                    if (view3.hasFocusable()) {
                        view = view3;
                        break;
                    }
                }
                int min = Math.min(b4, i13) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    s0 I9 = I(min);
                    if (I9 == null) {
                        break;
                    }
                    View view4 = I9.f14950a;
                    if (view4.hasFocusable()) {
                        view = view4;
                        break;
                    }
                    min--;
                }
            }
            if (view != null) {
            }
        }
        o0Var.f14922m = -1L;
        o0Var.f14921l = -1;
        o0Var.f14923n = -1;
    }

    @Override // android.view.View
    public final void scrollBy(int i4, int i8) {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.f8909A) {
            boolean d2 = abstractC1537c0.d();
            boolean e9 = this.f8962q.e();
            if (!d2 && !e9) {
                return;
            }
            if (!d2) {
                i4 = 0;
            }
            if (!e9) {
                i8 = 0;
            }
            h0(i4, i8, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i8) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i4;
        if (R()) {
            int i8 = 0;
            if (accessibilityEvent != null) {
                i4 = accessibilityEvent.getContentChangeTypes();
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                i8 = i4;
            }
            this.f8913C |= i8;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(u0 u0Var) {
        this.f8965r0 = u0Var;
        P.O.m(this, u0Var);
    }

    public void setAdapter(U u8) {
        setLayoutFrozen(false);
        U u9 = this.f8960p;
        h hVar = this.f8941e;
        if (u9 != null) {
            u9.f14788a.unregisterObserver(hVar);
            this.f8960p.getClass();
        }
        Z z8 = this.f8928P;
        if (z8 != null) {
            z8.e();
        }
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        j0 j0Var = this.f8943f;
        if (abstractC1537c0 != null) {
            abstractC1537c0.n0(j0Var);
            this.f8962q.o0(j0Var);
        }
        j0Var.f14866a.clear();
        j0Var.f();
        C1207p c1207p = this.f8947h;
        c1207p.q((ArrayList) c1207p.f13344c);
        c1207p.q((ArrayList) c1207p.f13345d);
        c1207p.f13342a = 0;
        U u10 = this.f8960p;
        this.f8960p = u8;
        if (u8 != null) {
            u8.f14788a.registerObserver(hVar);
        }
        AbstractC1537c0 abstractC1537c02 = this.f8962q;
        if (abstractC1537c02 != null) {
            abstractC1537c02.U();
        }
        U u11 = this.f8960p;
        j0Var.f14866a.clear();
        j0Var.f();
        j0Var.e(u10, true);
        i0 c6 = j0Var.c();
        if (u10 != null) {
            c6.f14858b--;
        }
        if (c6.f14858b == 0) {
            SparseArray sparseArray = c6.f14857a;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                h0 h0Var = (h0) sparseArray.valueAt(i4);
                Iterator it = h0Var.f14848a.iterator();
                while (it.hasNext()) {
                    c.J(((s0) it.next()).f14950a);
                }
                h0Var.f14848a.clear();
            }
        }
        if (u11 != null) {
            c6.f14858b++;
        }
        j0Var.d();
        this.f8951k0.f14917f = true;
        a0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(X x8) {
        boolean z8;
        if (x8 == null) {
            return;
        }
        if (x8 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        setChildrenDrawingOrderEnabled(z8);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z8) {
        if (z8 != this.k) {
            this.f8927O = null;
            this.f8925M = null;
            this.f8926N = null;
            this.f8924L = null;
        }
        this.k = z8;
        super.setClipToPadding(z8);
        if (this.f8976x) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(Y y4) {
        y4.getClass();
        this.K = y4;
        this.f8927O = null;
        this.f8925M = null;
        this.f8926N = null;
        this.f8924L = null;
    }

    public void setHasFixedSize(boolean z8) {
        this.f8974w = z8;
    }

    public void setItemAnimator(Z z8) {
        Z z9 = this.f8928P;
        if (z9 != null) {
            z9.e();
            this.f8928P.f14791a = null;
        }
        this.f8928P = z8;
        if (z8 != null) {
            z8.f14791a = this.f8961p0;
        }
    }

    public void setItemViewCacheSize(int i4) {
        j0 j0Var = this.f8943f;
        j0Var.f14870e = i4;
        j0Var.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z8) {
        suppressLayout(z8);
    }

    public void setLayoutManager(AbstractC1537c0 abstractC1537c0) {
        if (abstractC1537c0 == this.f8962q) {
            return;
        }
        r0();
        AbstractC1537c0 abstractC1537c02 = this.f8962q;
        j0 j0Var = this.f8943f;
        if (abstractC1537c02 != null) {
            Z z8 = this.f8928P;
            if (z8 != null) {
                z8.e();
            }
            this.f8962q.n0(j0Var);
            this.f8962q.o0(j0Var);
            j0Var.f14866a.clear();
            j0Var.f();
            if (this.f8972v) {
                AbstractC1537c0 abstractC1537c03 = this.f8962q;
                abstractC1537c03.f14816g = false;
                abstractC1537c03.W(this);
            }
            this.f8962q.B0(null);
            this.f8962q = null;
        } else {
            j0Var.f14866a.clear();
            j0Var.f();
        }
        e eVar = this.f8949i;
        RecyclerView recyclerView = ((S) eVar.f5430c).f14786a;
        ((C1541g) eVar.f5431d).g();
        ArrayList arrayList = (ArrayList) eVar.f5432e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s0 N8 = N((View) arrayList.get(size));
            if (N8 != null) {
                int i4 = N8.f14963p;
                if (recyclerView.R()) {
                    N8.f14964q = i4;
                    recyclerView.f8977x0.add(N8);
                } else {
                    N8.f14950a.setImportantForAccessibility(i4);
                }
                N8.f14963p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = recyclerView.getChildAt(i8);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f8962q = abstractC1537c0;
        if (abstractC1537c0 != null) {
            if (abstractC1537c0.f14811b == null) {
                abstractC1537c0.B0(this);
                if (this.f8972v) {
                    AbstractC1537c0 abstractC1537c04 = this.f8962q;
                    abstractC1537c04.f14816g = true;
                    abstractC1537c04.V(this);
                }
            } else {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC1537c0);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC1149a.e(abstractC1537c0.f14811b, sb));
            }
        }
        j0Var.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z8) {
        C0264l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f4292d) {
            ViewGroup viewGroup = scrollingChildHelper.f4291c;
            WeakHashMap weakHashMap = P.O.f4214a;
            F.m(viewGroup);
        }
        scrollingChildHelper.f4292d = z8;
    }

    public void setOnFlingListener(e0 e0Var) {
        this.f8937b0 = e0Var;
    }

    @Deprecated
    public void setOnScrollListener(g0 g0Var) {
        this.f8953l0 = g0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z8) {
        this.f8946g0 = z8;
    }

    public void setRecycledViewPool(i0 i0Var) {
        j0 j0Var = this.f8943f;
        RecyclerView recyclerView = j0Var.f14873h;
        j0Var.e(recyclerView.f8960p, false);
        if (j0Var.f14872g != null) {
            r2.f14858b--;
        }
        j0Var.f14872g = i0Var;
        if (i0Var != null && recyclerView.getAdapter() != null) {
            j0Var.f14872g.f14858b++;
        }
        j0Var.d();
    }

    public void setScrollState(int i4) {
        J j;
        if (i4 != this.f8929Q) {
            if (f8901G0) {
                new Exception();
            }
            this.f8929Q = i4;
            if (i4 != 2) {
                r0 r0Var = this.f8948h0;
                r0Var.j.removeCallbacks(r0Var);
                r0Var.f14940f.abortAnimation();
                AbstractC1537c0 abstractC1537c0 = this.f8962q;
                if (abstractC1537c0 != null && (j = abstractC1537c0.f14814e) != null) {
                    j.i();
                }
            }
            AbstractC1537c0 abstractC1537c02 = this.f8962q;
            if (abstractC1537c02 != null) {
                abstractC1537c02.l0(i4);
            }
            g0 g0Var = this.f8953l0;
            if (g0Var != null) {
                g0Var.a(this, i4);
            }
            ArrayList arrayList = this.f8955m0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((g0) this.f8955m0.get(size)).a(this, i4);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
            } else {
                this.f8936a0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f8936a0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(q0 q0Var) {
        this.f8943f.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().g(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z8) {
        if (z8 != this.f8909A) {
            k("Do not suppressLayout in layout or scroll");
            if (!z8) {
                this.f8909A = false;
                if (this.f8980z && this.f8962q != null && this.f8960p != null) {
                    requestLayout();
                }
                this.f8980z = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f8909A = true;
            this.f8911B = true;
            r0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [P.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11, types: [P.o, java.lang.Object] */
    public final void t() {
        View view;
        int b4;
        boolean z8;
        C0 c02;
        boolean z9;
        View E7;
        o0 o0Var = this.f8951k0;
        o0Var.a(1);
        D(o0Var);
        o0Var.f14920i = false;
        n0();
        C1536c c1536c = this.j;
        j jVar = (j) c1536c.f14808e;
        j jVar2 = (j) c1536c.f14808e;
        jVar.clear();
        t.g gVar = (t.g) c1536c.f14809f;
        gVar.a();
        V();
        Z();
        s0 s0Var = null;
        if (this.f8946g0 && hasFocus() && this.f8960p != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null && (E7 = E(view)) != null) {
            s0Var = M(E7);
        }
        long j = -1;
        if (s0Var == null) {
            o0Var.f14922m = -1L;
            o0Var.f14921l = -1;
            o0Var.f14923n = -1;
        } else {
            if (this.f8960p.f14789b) {
                j = s0Var.f14954e;
            }
            o0Var.f14922m = j;
            if (this.f8920G) {
                b4 = -1;
            } else if (s0Var.j()) {
                b4 = s0Var.f14953d;
            } else {
                b4 = s0Var.b();
            }
            o0Var.f14921l = b4;
            View view2 = s0Var.f14950a;
            int id = view2.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                view2 = ((ViewGroup) view2).getFocusedChild();
                if (view2.getId() != -1) {
                    id = view2.getId();
                }
            }
            o0Var.f14923n = id;
        }
        if (o0Var.j && this.f8959o0) {
            z8 = true;
        } else {
            z8 = false;
        }
        o0Var.f14919h = z8;
        this.f8959o0 = false;
        this.f8957n0 = false;
        o0Var.f14918g = o0Var.k;
        o0Var.f14916e = this.f8960p.a();
        G(this.f8967s0);
        if (o0Var.j) {
            int t8 = this.f8949i.t();
            for (int i4 = 0; i4 < t8; i4++) {
                s0 N8 = N(this.f8949i.s(i4));
                if (!N8.q() && (!N8.h() || this.f8960p.f14789b)) {
                    Z z10 = this.f8928P;
                    Z.b(N8);
                    N8.e();
                    z10.getClass();
                    ?? obj = new Object();
                    obj.a(N8);
                    C0 c03 = (C0) jVar2.get(N8);
                    if (c03 == null) {
                        c03 = C0.a();
                        jVar2.put(N8, c03);
                    }
                    c03.f14703b = obj;
                    c03.f14702a |= 4;
                    if (o0Var.f14919h && N8.m() && !N8.j() && !N8.q() && !N8.h()) {
                        gVar.g(L(N8), N8);
                    }
                }
            }
        }
        if (o0Var.k) {
            int w8 = this.f8949i.w();
            for (int i8 = 0; i8 < w8; i8++) {
                s0 N9 = N(this.f8949i.v(i8));
                if (f8900F0 && N9.f14952c == -1 && !N9.j()) {
                    throw new IllegalStateException(AbstractC1149a.e(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!N9.q() && N9.f14953d == -1) {
                    N9.f14953d = N9.f14952c;
                }
            }
            boolean z11 = o0Var.f14917f;
            o0Var.f14917f = false;
            this.f8962q.h0(this.f8943f, o0Var);
            o0Var.f14917f = z11;
            for (int i9 = 0; i9 < this.f8949i.t(); i9++) {
                s0 N10 = N(this.f8949i.s(i9));
                if (!N10.q() && ((c02 = (C0) jVar2.get(N10)) == null || (c02.f14702a & 4) == 0)) {
                    Z.b(N10);
                    if ((N10.j & 8192) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    Z z12 = this.f8928P;
                    N10.e();
                    z12.getClass();
                    ?? obj2 = new Object();
                    obj2.a(N10);
                    if (z9) {
                        b0(N10, obj2);
                    } else {
                        C0 c04 = (C0) jVar2.get(N10);
                        if (c04 == null) {
                            c04 = C0.a();
                            jVar2.put(N10, c04);
                        }
                        c04.f14702a |= 2;
                        c04.f14703b = obj2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        W(true);
        p0(false);
        o0Var.f14915d = 2;
    }

    public final void u() {
        boolean z8;
        n0();
        V();
        o0 o0Var = this.f8951k0;
        o0Var.a(6);
        this.f8947h.d();
        o0Var.f14916e = this.f8960p.a();
        o0Var.f14914c = 0;
        if (this.f8945g != null) {
            U u8 = this.f8960p;
            int b4 = AbstractC1769h.b(u8.f14790c);
            if (b4 == 1 ? u8.a() > 0 : b4 != 2) {
                Parcelable parcelable = this.f8945g.f14885f;
                if (parcelable != null) {
                    this.f8962q.j0(parcelable);
                }
                this.f8945g = null;
            }
        }
        o0Var.f14918g = false;
        this.f8962q.h0(this.f8943f, o0Var);
        o0Var.f14917f = false;
        if (o0Var.j && this.f8928P != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        o0Var.j = z8;
        o0Var.f14915d = 4;
        W(true);
        p0(false);
    }

    public final boolean v(int i4, int i8, int i9, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i8, i9, iArr, iArr2);
    }

    public final void w(int i4, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        getScrollingChildHelper().d(i4, i8, i9, i10, iArr, i11, iArr2);
    }

    public final void x(int i4, int i8) {
        this.f8923J++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i4, scrollY - i8);
        g0 g0Var = this.f8953l0;
        if (g0Var != null) {
            g0Var.b(this, i4, i8);
        }
        ArrayList arrayList = this.f8955m0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((g0) this.f8955m0.get(size)).b(this, i4, i8);
            }
        }
        this.f8923J--;
    }

    public final void y() {
        if (this.f8927O != null) {
            return;
        }
        ((p0) this.K).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f8927O = edgeEffect;
        if (this.k) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.f8924L != null) {
            return;
        }
        ((p0) this.K).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f8924L = edgeEffect;
        if (this.k) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [t0.n, java.lang.Object, t0.Z] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, t0.o0] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        float a3;
        float a4;
        TypedArray typedArray;
        boolean z8;
        char c6;
        char c9;
        AttributeSet attributeSet2;
        int i8;
        int i9;
        ClassLoader classLoader;
        Constructor constructor;
        int i10 = 1;
        this.f8941e = new h(i10, this);
        this.f8943f = new j0(this);
        this.j = new C1536c(3);
        this.f8952l = new Q(this, 0);
        this.f8954m = new Rect();
        this.f8956n = new Rect();
        this.f8958o = new RectF();
        this.f8964r = new ArrayList();
        this.f8966s = new ArrayList();
        this.f8968t = new ArrayList();
        this.f8978y = 0;
        this.f8920G = false;
        this.f8921H = false;
        this.f8922I = 0;
        this.f8923J = 0;
        this.K = f8908N0;
        ?? obj = new Object();
        Object[] objArr = null;
        obj.f14791a = null;
        obj.f14792b = new ArrayList();
        obj.f14793c = 120L;
        obj.f14794d = 120L;
        obj.f14795e = 250L;
        obj.f14796f = 250L;
        obj.f14899g = true;
        obj.f14900h = new ArrayList();
        obj.f14901i = new ArrayList();
        obj.j = new ArrayList();
        obj.k = new ArrayList();
        obj.f14902l = new ArrayList();
        obj.f14903m = new ArrayList();
        obj.f14904n = new ArrayList();
        obj.f14905o = new ArrayList();
        obj.f14906p = new ArrayList();
        obj.f14907q = new ArrayList();
        obj.f14908r = new ArrayList();
        this.f8928P = obj;
        this.f8929Q = 0;
        this.f8930R = -1;
        this.f8942e0 = Float.MIN_VALUE;
        this.f8944f0 = Float.MIN_VALUE;
        this.f8946g0 = true;
        this.f8948h0 = new r0(this);
        this.j0 = f8905K0 ? new Object() : null;
        ?? obj2 = new Object();
        obj2.f14912a = -1;
        obj2.f14913b = 0;
        obj2.f14914c = 0;
        obj2.f14915d = 1;
        obj2.f14916e = 0;
        obj2.f14917f = false;
        obj2.f14918g = false;
        obj2.f14919h = false;
        obj2.f14920i = false;
        obj2.j = false;
        obj2.k = false;
        this.f8951k0 = obj2;
        this.f8957n0 = false;
        this.f8959o0 = false;
        S s8 = new S(this);
        this.f8961p0 = s8;
        this.f8963q0 = false;
        this.f8967s0 = new int[2];
        this.f8971u0 = new int[2];
        this.f8973v0 = new int[2];
        this.f8975w0 = new int[2];
        this.f8977x0 = new ArrayList();
        this.f8979y0 = new Q(this, i10);
        this.f8910A0 = 0;
        this.f8912B0 = 0;
        this.f8916D0 = new S(this);
        this.f8918E0 = new C0259g(getContext(), new T(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8936a0 = viewConfiguration.getScaledTouchSlop();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = P.P.f4220a;
            a3 = F.a.b(viewConfiguration);
        } else {
            a3 = P.P.a(viewConfiguration, context);
        }
        this.f8942e0 = a3;
        if (i11 >= 26) {
            a4 = F.a.c(viewConfiguration);
        } else {
            a4 = P.P.a(viewConfiguration, context);
        }
        this.f8944f0 = a4;
        this.f8938c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8940d0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f8939d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f8928P.f14791a = s8;
        this.f8947h = new C1207p(new T(this));
        this.f8949i = new e(new S(this));
        WeakHashMap weakHashMap = P.O.f4214a;
        if ((i11 >= 26 ? I.a(this) : 0) == 0 && i11 >= 26) {
            I.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f8917E = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new u0(this));
        int[] iArr = AbstractC1477a.f14443a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        P.O.l(this, context, iArr, attributeSet, obtainStyledAttributes, i4);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.k = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c6 = 3;
                c9 = 2;
                i8 = i4;
                typedArray = obtainStyledAttributes;
                z8 = 1;
                i9 = 4;
                attributeSet2 = attributeSet;
                new C1554u(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.buzbuz.smartautoclicker.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException(AbstractC1149a.e(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
        } else {
            typedArray = obtainStyledAttributes;
            z8 = 1;
            c6 = 3;
            c9 = 2;
            attributeSet2 = attributeSet;
            i8 = i4;
            i9 = 4;
        }
        typedArray.recycle();
        this.f8914C0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = Class.forName(str, false, classLoader).asSubclass(AbstractC1537c0.class);
                    try {
                        constructor = asSubclass.getConstructor(f8906L0);
                        Object[] objArr2 = new Object[i9];
                        objArr2[0] = context;
                        objArr2[z8] = attributeSet2;
                        objArr2[c9] = Integer.valueOf(i8);
                        objArr2[c6] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e9) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e10) {
                            e10.initCause(e9);
                            throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e10);
                        }
                    }
                    constructor.setAccessible(z8);
                    setLayoutManager((AbstractC1537c0) constructor.newInstance(objArr));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Class is not a LayoutManager " + str, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Unable to find LayoutManager " + str, e12);
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Cannot access non-public constructor " + str, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                } catch (InvocationTargetException e15) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                }
            }
        }
        int[] iArr2 = f8902H0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, iArr2, i8, 0);
        P.O.l(this, context, iArr2, attributeSet2, obtainStyledAttributes2, i8);
        boolean z9 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z9);
        setTag(com.buzbuz.smartautoclicker.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1537c0 abstractC1537c0 = this.f8962q;
        if (abstractC1537c0 != null) {
            return abstractC1537c0.t(layoutParams);
        }
        throw new IllegalStateException(AbstractC1149a.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Deprecated
    public void setRecyclerListener(k0 k0Var) {
    }
}
