package com.google.android.material.bottomsheet;

import A.j;
import C.c;
import C.f;
import G5.h;
import G5.l;
import H5.d;
import H5.g;
import I5.b;
import M.i;
import P.C0253a;
import P.C0254b;
import P.C0256d;
import P.F;
import P.O;
import P.X;
import P.Y;
import P.a0;
import W.e;
import a.AbstractC0405a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.C0548b;
import c.RunnableC0552f;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import f5.AbstractC0710a;
import i0.C0878a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l5.AbstractC1031a;
import l5.C1032b;
import x5.p;
import z5.C1875f;
import z5.InterfaceC1871b;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends c implements InterfaceC1871b {

    /* renamed from: A, reason: collision with root package name */
    public final g f9936A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f9937B;

    /* renamed from: C, reason: collision with root package name */
    public final int f9938C;

    /* renamed from: D, reason: collision with root package name */
    public int f9939D;

    /* renamed from: E, reason: collision with root package name */
    public int f9940E;

    /* renamed from: F, reason: collision with root package name */
    public final float f9941F;

    /* renamed from: G, reason: collision with root package name */
    public int f9942G;

    /* renamed from: H, reason: collision with root package name */
    public final float f9943H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f9944I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f9945J;
    public boolean K;

    /* renamed from: L, reason: collision with root package name */
    public int f9946L;

    /* renamed from: M, reason: collision with root package name */
    public e f9947M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f9948N;

    /* renamed from: O, reason: collision with root package name */
    public int f9949O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f9950P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f9951Q;

    /* renamed from: R, reason: collision with root package name */
    public int f9952R;

    /* renamed from: S, reason: collision with root package name */
    public int f9953S;

    /* renamed from: T, reason: collision with root package name */
    public int f9954T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f9955U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f9956V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f9957W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f9958X;
    public C1875f Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f9959Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f9960a;

    /* renamed from: a0, reason: collision with root package name */
    public int f9961a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9962b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f9963b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f9964c;

    /* renamed from: c0, reason: collision with root package name */
    public HashMap f9965c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f9966d;

    /* renamed from: d0, reason: collision with root package name */
    public final SparseIntArray f9967d0;

    /* renamed from: e, reason: collision with root package name */
    public int f9968e;

    /* renamed from: e0, reason: collision with root package name */
    public final d f9969e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9970f;

    /* renamed from: g, reason: collision with root package name */
    public int f9971g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9972h;

    /* renamed from: i, reason: collision with root package name */
    public final h f9973i;
    public final ColorStateList j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9974l;

    /* renamed from: m, reason: collision with root package name */
    public int f9975m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f9976n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f9977o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f9978p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f9979q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f9980r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f9981s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f9982t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f9983u;

    /* renamed from: v, reason: collision with root package name */
    public int f9984v;

    /* renamed from: w, reason: collision with root package name */
    public int f9985w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f9986x;

    /* renamed from: y, reason: collision with root package name */
    public final l f9987y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9988z;

    public BottomSheetBehavior() {
        this.f9960a = 0;
        this.f9962b = true;
        this.k = -1;
        this.f9974l = -1;
        this.f9936A = new g(this);
        this.f9941F = 0.5f;
        this.f9943H = -1.0f;
        this.K = true;
        this.f9946L = 4;
        this.f9951Q = 0.1f;
        this.f9957W = new ArrayList();
        this.f9961a0 = -1;
        this.f9967d0 = new SparseIntArray();
        this.f9969e0 = new d(this, 1);
    }

    public static View A(View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap weakHashMap = O.f4214a;
            if (F.h(view)) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View A2 = A(viewGroup.getChildAt(i4));
                    if (A2 != null) {
                        return A2;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static BottomSheetBehavior B(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof f) {
            c cVar = ((f) layoutParams).f532a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public static int C(int i4, int i8, int i9, int i10) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, i8, i10);
        if (i9 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i9 = Math.min(size, i9);
            }
            return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i9), 1073741824);
    }

    public final int D() {
        int i4;
        if (this.f9962b) {
            return this.f9939D;
        }
        if (this.f9980r) {
            i4 = 0;
        } else {
            i4 = this.f9985w;
        }
        return Math.max(this.f9938C, i4);
    }

    public final int E(int i4) {
        if (i4 != 3) {
            if (i4 != 4) {
                if (i4 != 5) {
                    if (i4 == 6) {
                        return this.f9940E;
                    }
                    throw new IllegalArgumentException(j.l("Invalid state to get top offset: ", i4));
                }
                return this.f9954T;
            }
            return this.f9942G;
        }
        return D();
    }

    public final boolean F() {
        WeakReference weakReference = this.f9955U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f9955U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void G(boolean z8) {
        if (this.f9944I != z8) {
            this.f9944I = z8;
            if (!z8 && this.f9946L == 5) {
                I(4);
            }
            M();
        }
    }

    public final void H(int i4) {
        if (i4 == -1) {
            if (!this.f9970f) {
                this.f9970f = true;
            } else {
                return;
            }
        } else {
            if (!this.f9970f && this.f9968e == i4) {
                return;
            }
            this.f9970f = false;
            this.f9968e = Math.max(0, i4);
        }
        P();
    }

    public final void I(int i4) {
        String str;
        int i8;
        if (i4 != 1 && i4 != 2) {
            if (!this.f9944I && i4 == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i4);
                return;
            }
            if (i4 == 6 && this.f9962b && E(i4) <= this.f9939D) {
                i8 = 3;
            } else {
                i8 = i4;
            }
            WeakReference weakReference = this.f9955U;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f9955U.get();
                RunnableC0552f runnableC0552f = new RunnableC0552f(this, view, i8);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested()) {
                    WeakHashMap weakHashMap = O.f4214a;
                    if (view.isAttachedToWindow()) {
                        view.post(runnableC0552f);
                        return;
                    }
                }
                runnableC0552f.run();
                return;
            }
            J(i4);
            return;
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i4 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(j.r(sb, str, " should not be set externally."));
    }

    public final void J(int i4) {
        View view;
        if (this.f9946L != i4) {
            this.f9946L = i4;
            if (i4 != 4 && i4 != 3 && i4 != 6) {
                boolean z8 = this.f9944I;
            }
            WeakReference weakReference = this.f9955U;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            int i8 = 0;
            if (i4 == 3) {
                O(true);
            } else if (i4 == 6 || i4 == 5 || i4 == 4) {
                O(false);
            }
            N(i4, true);
            while (true) {
                ArrayList arrayList = this.f9957W;
                if (i8 < arrayList.size()) {
                    ((AbstractC1031a) arrayList.get(i8)).c(view, i4);
                    i8++;
                } else {
                    M();
                    return;
                }
            }
        }
    }

    public final boolean K(View view, float f8) {
        if (this.f9945J) {
            return true;
        }
        if (view.getTop() < this.f9942G) {
            return false;
        }
        if (Math.abs(((f8 * this.f9951Q) + view.getTop()) - this.f9942G) / y() > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        J(2);
        N(r4, true);
        r2.f9936A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(View view, int i4, boolean z8) {
        int E7 = E(i4);
        e eVar = this.f9947M;
        if (eVar != null) {
            if (!z8) {
                int left = view.getLeft();
                eVar.f6475r = view;
                eVar.f6462c = -1;
                boolean h8 = eVar.h(left, E7, 0, 0);
                if (!h8 && eVar.f6460a == 0 && eVar.f6475r != null) {
                    eVar.f6475r = null;
                }
            }
        }
        J(i4);
    }

    public final void M() {
        View view;
        int i4;
        boolean z8;
        C0254b c0254b;
        WeakReference weakReference = this.f9955U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            O.j(view, 524288);
            O.h(view, 0);
            O.j(view, 262144);
            O.h(view, 0);
            O.j(view, 1048576);
            O.h(view, 0);
            SparseIntArray sparseIntArray = this.f9967d0;
            int i8 = sparseIntArray.get(0, -1);
            if (i8 != -1) {
                O.j(view, i8);
                O.h(view, 0);
                sparseIntArray.delete(0);
            }
            int i9 = 6;
            if (!this.f9962b && this.f9946L != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                i iVar = new i(i9, this);
                ArrayList f8 = O.f(view);
                int i10 = 0;
                while (true) {
                    if (i10 < f8.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((Q.f) f8.get(i10)).f4704a).getLabel())) {
                            i4 = ((Q.f) f8.get(i10)).a();
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 0;
                        int i12 = -1;
                        while (true) {
                            int[] iArr = O.f4217d;
                            if (i11 >= 32 || i12 != -1) {
                                break;
                            }
                            int i13 = iArr[i11];
                            boolean z9 = true;
                            for (int i14 = 0; i14 < f8.size(); i14++) {
                                if (((Q.f) f8.get(i14)).a() != i13) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                z9 &= z8;
                            }
                            if (z9) {
                                i12 = i13;
                            }
                            i11++;
                        }
                        i4 = i12;
                    }
                }
                if (i4 != -1) {
                    Q.f fVar = new Q.f(null, i4, string, iVar, null);
                    View.AccessibilityDelegate d2 = O.d(view);
                    if (d2 == null) {
                        c0254b = null;
                    } else if (d2 instanceof C0253a) {
                        c0254b = ((C0253a) d2).f4240a;
                    } else {
                        c0254b = new C0254b(d2);
                    }
                    if (c0254b == null) {
                        c0254b = new C0254b();
                    }
                    O.m(view, c0254b);
                    O.j(view, fVar.a());
                    O.f(view).add(fVar);
                    O.h(view, 0);
                }
                sparseIntArray.put(0, i4);
            }
            if (this.f9944I) {
                int i15 = 5;
                if (this.f9946L != 5) {
                    O.k(view, Q.f.j, new i(i15, this));
                }
            }
            int i16 = this.f9946L;
            int i17 = 4;
            int i18 = 3;
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 == 6) {
                        O.k(view, Q.f.f4699i, new i(i17, this));
                        O.k(view, Q.f.f4698h, new i(i18, this));
                        return;
                    }
                    return;
                }
                if (this.f9962b) {
                    i9 = 3;
                }
                O.k(view, Q.f.f4698h, new i(i9, this));
                return;
            }
            if (this.f9962b) {
                i9 = 4;
            }
            O.k(view, Q.f.f4699i, new i(i9, this));
        }
    }

    public final void N(int i4, boolean z8) {
        boolean z9;
        h hVar;
        if (i4 != 2) {
            if (this.f9946L == 3 && (this.f9986x || F())) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.f9988z != z9 && (hVar = this.f9973i) != null) {
                this.f9988z = z9;
                ValueAnimator valueAnimator = this.f9937B;
                float f8 = 1.0f;
                if (z8 && valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.reverse();
                        return;
                    }
                    float f9 = hVar.f1769d.f1760i;
                    if (z9) {
                        f8 = x();
                    }
                    valueAnimator.setFloatValues(f9, f8);
                    valueAnimator.start();
                    return;
                }
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                if (this.f9988z) {
                    f8 = x();
                }
                hVar.n(f8);
            }
        }
    }

    public final void O(boolean z8) {
        WeakReference weakReference = this.f9955U;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z8) {
                    if (this.f9965c0 == null) {
                        this.f9965c0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = coordinatorLayout.getChildAt(i4);
                    if (childAt != this.f9955U.get() && z8) {
                        this.f9965c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z8) {
                    this.f9965c0 = null;
                }
            }
        }
    }

    public final void P() {
        View view;
        if (this.f9955U != null) {
            w();
            if (this.f9946L == 4 && (view = (View) this.f9955U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // z5.InterfaceC1871b
    public final void a() {
        C1875f c1875f = this.Y;
        if (c1875f == null) {
            return;
        }
        int i4 = c1875f.f16688d;
        int i8 = c1875f.f16687c;
        C0548b c0548b = c1875f.f16690f;
        c1875f.f16690f = null;
        int i9 = 4;
        if (c0548b != null) {
            float f8 = c0548b.f9309c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (this.f9944I) {
                    H5.e eVar = new H5.e(8, this);
                    View view = c1875f.f16686b;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                    ofFloat.setInterpolator(new C0878a(1));
                    ofFloat.setDuration(AbstractC0710a.c(f8, i8, i4));
                    ofFloat.addListener(new H5.e(11, c1875f));
                    ofFloat.addListener(eVar);
                    ofFloat.start();
                    return;
                }
                AnimatorSet a3 = c1875f.a();
                a3.setDuration(AbstractC0710a.c(f8, i8, i4));
                a3.start();
                I(4);
                return;
            }
        }
        if (this.f9944I) {
            i9 = 5;
        }
        I(i9);
    }

    @Override // z5.InterfaceC1871b
    public final void b(C0548b c0548b) {
        C1875f c1875f = this.Y;
        if (c1875f != null) {
            if (c1875f.f16690f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
            }
            C0548b c0548b2 = c1875f.f16690f;
            c1875f.f16690f = c0548b;
            if (c0548b2 == null) {
                return;
            }
            c1875f.b(c0548b.f9309c);
        }
    }

    @Override // z5.InterfaceC1871b
    public final void c(C0548b c0548b) {
        C1875f c1875f = this.Y;
        if (c1875f == null) {
            return;
        }
        c1875f.f16690f = c0548b;
    }

    @Override // z5.InterfaceC1871b
    public final void d() {
        C1875f c1875f = this.Y;
        if (c1875f != null) {
            if (c1875f.f16690f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
            }
            C0548b c0548b = c1875f.f16690f;
            c1875f.f16690f = null;
            if (c0548b == null) {
                return;
            }
            AnimatorSet a3 = c1875f.a();
            a3.setDuration(c1875f.f16689e);
            a3.start();
        }
    }

    @Override // C.c
    public final void g(f fVar) {
        this.f9955U = null;
        this.f9947M = null;
        this.Y = null;
    }

    @Override // C.c
    public final void j() {
        this.f9955U = null;
        this.f9947M = null;
        this.Y = null;
    }

    @Override // C.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z8;
        View view2;
        int i4;
        e eVar;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.f9959Z = -1;
                this.f9961a0 = -1;
                VelocityTracker velocityTracker = this.f9958X;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f9958X = null;
                }
            }
            if (this.f9958X == null) {
                this.f9958X = VelocityTracker.obtain();
            }
            this.f9958X.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f9963b0 = false;
                    this.f9959Z = -1;
                    if (this.f9948N) {
                        this.f9948N = false;
                        return false;
                    }
                }
            } else {
                int x8 = (int) motionEvent.getX();
                this.f9961a0 = (int) motionEvent.getY();
                if (this.f9946L != 2) {
                    WeakReference weakReference = this.f9956V;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.p(view2, x8, this.f9961a0)) {
                        this.f9959Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f9963b0 = true;
                    }
                }
                if (this.f9959Z == -1 && !coordinatorLayout.p(view, x8, this.f9961a0)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f9948N = z8;
            }
            if (this.f9948N || (eVar = this.f9947M) == null || !eVar.p(motionEvent)) {
                WeakReference weakReference2 = this.f9956V;
                if (weakReference2 != null) {
                    view3 = (View) weakReference2.get();
                }
                if (actionMasked != 2 || view3 == null || this.f9948N || this.f9946L == 1 || coordinatorLayout.p(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f9947M == null || (i4 = this.f9961a0) == -1 || Math.abs(i4 - motionEvent.getY()) <= this.f9947M.f6461b) {
                    return false;
                }
            }
            return true;
        }
        this.f9948N = true;
        return false;
    }

    @Override // C.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        boolean z8;
        WeakHashMap weakHashMap = O.f4214a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i8 = 4;
        int i9 = 0;
        if (this.f9955U == null) {
            this.f9971g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && !this.f9976n && !this.f9970f) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (this.f9977o || this.f9978p || this.f9979q || this.f9981s || this.f9982t || this.f9983u || z8) {
                p.d(view, new N.f(this, z8, i8));
            }
            C0256d c0256d = new C0256d(view);
            if (i10 >= 30) {
                view.setWindowInsetsAnimationCallback(new a0(c0256d));
            } else {
                PathInterpolator pathInterpolator = Y.f4236e;
                View.OnApplyWindowInsetsListener x8 = new X(view, c0256d);
                view.setTag(R.id.tag_window_insets_animation_callback, x8);
                if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    view.setOnApplyWindowInsetsListener(x8);
                }
            }
            this.f9955U = new WeakReference(view);
            this.Y = new C1875f(view);
            h hVar = this.f9973i;
            if (hVar != null) {
                view.setBackground(hVar);
                float f8 = this.f9943H;
                if (f8 == -1.0f) {
                    f8 = F.e(view);
                }
                hVar.l(f8);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    F.i(view, colorStateList);
                }
            }
            M();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f9947M == null) {
            this.f9947M = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f9969e0);
        }
        int top = view.getTop();
        coordinatorLayout.r(view, i4);
        this.f9953S = coordinatorLayout.getWidth();
        this.f9954T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f9952R = height;
        int i11 = this.f9954T;
        int i12 = i11 - height;
        int i13 = this.f9985w;
        if (i12 < i13) {
            boolean z9 = this.f9980r;
            int i14 = this.f9974l;
            if (z9) {
                if (i14 != -1) {
                    i11 = Math.min(i11, i14);
                }
                this.f9952R = i11;
            } else {
                int i15 = i11 - i13;
                if (i14 != -1) {
                    i15 = Math.min(i15, i14);
                }
                this.f9952R = i15;
            }
        }
        this.f9939D = Math.max(0, this.f9954T - this.f9952R);
        this.f9940E = (int) ((1.0f - this.f9941F) * this.f9954T);
        w();
        int i16 = this.f9946L;
        if (i16 == 3) {
            view.offsetTopAndBottom(D());
        } else if (i16 == 6) {
            view.offsetTopAndBottom(this.f9940E);
        } else if (this.f9944I && i16 == 5) {
            view.offsetTopAndBottom(this.f9954T);
        } else if (i16 == 4) {
            view.offsetTopAndBottom(this.f9942G);
        } else if (i16 == 1 || i16 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        N(this.f9946L, false);
        this.f9956V = new WeakReference(A(view));
        while (true) {
            ArrayList arrayList = this.f9957W;
            if (i9 >= arrayList.size()) {
                return true;
            }
            ((AbstractC1031a) arrayList.get(i9)).a(view);
            i9++;
        }
    }

    @Override // C.c
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(C(i4, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, this.k, marginLayoutParams.width), C(i9, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f9974l, marginLayoutParams.height));
        return true;
    }

    @Override // C.c
    public final boolean n(View view) {
        WeakReference weakReference = this.f9956V;
        if (weakReference != null && view == weakReference.get() && this.f9946L != 3) {
            return true;
        }
        return false;
    }

    @Override // C.c
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i8, int[] iArr, int i9) {
        View view3;
        if (i9 != 1) {
            WeakReference weakReference = this.f9956V;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i10 = top - i8;
                if (i8 > 0) {
                    if (i10 < D()) {
                        int D7 = top - D();
                        iArr[1] = D7;
                        int i11 = -D7;
                        WeakHashMap weakHashMap = O.f4214a;
                        view.offsetTopAndBottom(i11);
                        J(3);
                    } else if (this.K) {
                        iArr[1] = i8;
                        WeakHashMap weakHashMap2 = O.f4214a;
                        view.offsetTopAndBottom(-i8);
                        J(1);
                    } else {
                        return;
                    }
                } else if (i8 < 0 && !view2.canScrollVertically(-1)) {
                    int i12 = this.f9942G;
                    if (i10 > i12 && !this.f9944I) {
                        int i13 = top - i12;
                        iArr[1] = i13;
                        int i14 = -i13;
                        WeakHashMap weakHashMap3 = O.f4214a;
                        view.offsetTopAndBottom(i14);
                        J(4);
                    } else {
                        if (!this.K) {
                            return;
                        }
                        iArr[1] = i8;
                        WeakHashMap weakHashMap4 = O.f4214a;
                        view.offsetTopAndBottom(-i8);
                        J(1);
                    }
                }
                z(view.getTop());
                this.f9949O = i8;
                this.f9950P = true;
            }
        }
    }

    @Override // C.c
    public final void r(View view, Parcelable parcelable) {
        C1032b c1032b = (C1032b) parcelable;
        int i4 = this.f9960a;
        if (i4 != 0) {
            if (i4 == -1 || (i4 & 1) == 1) {
                this.f9968e = c1032b.f12296g;
            }
            if (i4 == -1 || (i4 & 2) == 2) {
                this.f9962b = c1032b.f12297h;
            }
            if (i4 == -1 || (i4 & 4) == 4) {
                this.f9944I = c1032b.f12298i;
            }
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f9945J = c1032b.j;
            }
        }
        int i8 = c1032b.f12295f;
        if (i8 != 1 && i8 != 2) {
            this.f9946L = i8;
        } else {
            this.f9946L = 4;
        }
    }

    @Override // C.c
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C1032b(this);
    }

    @Override // C.c
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i8) {
        this.f9949O = 0;
        this.f9950P = false;
        if ((i4 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r2.f9940E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f9939D) < java.lang.Math.abs(r3 - r2.f9942G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.f9942G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f9942G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f9940E) < java.lang.Math.abs(r3 - r2.f9942G)) goto L50;
     */
    @Override // C.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
        float yVelocity;
        int i8 = 3;
        if (view.getTop() == D()) {
            J(3);
            return;
        }
        WeakReference weakReference = this.f9956V;
        if (weakReference != null && view2 == weakReference.get() && this.f9950P) {
            if (this.f9949O > 0) {
                if (!this.f9962b) {
                }
                L(view, i8, false);
                this.f9950P = false;
            }
            if (this.f9944I) {
                VelocityTracker velocityTracker = this.f9958X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f9964c);
                    yVelocity = this.f9958X.getYVelocity(this.f9959Z);
                }
                if (K(view, yVelocity)) {
                    i8 = 5;
                    L(view, i8, false);
                    this.f9950P = false;
                }
            }
            if (this.f9949O == 0) {
                int top = view.getTop();
                if (!this.f9962b) {
                    int i9 = this.f9940E;
                    if (top < i9) {
                    }
                    i8 = 6;
                }
            } else {
                if (!this.f9962b) {
                    int top2 = view.getTop();
                }
                i8 = 4;
            }
            L(view, i8, false);
            this.f9950P = false;
        }
    }

    @Override // C.c
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i4 = this.f9946L;
        if (i4 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f9947M;
        if (eVar != null && (this.K || i4 == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f9959Z = -1;
            this.f9961a0 = -1;
            VelocityTracker velocityTracker = this.f9958X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9958X = null;
            }
        }
        if (this.f9958X == null) {
            this.f9958X = VelocityTracker.obtain();
        }
        this.f9958X.addMovement(motionEvent);
        if (this.f9947M != null && ((this.K || this.f9946L == 1) && actionMasked == 2 && !this.f9948N)) {
            float abs = Math.abs(this.f9961a0 - motionEvent.getY());
            e eVar2 = this.f9947M;
            if (abs > eVar2.f6461b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f9948N;
    }

    public final void w() {
        int y4 = y();
        if (this.f9962b) {
            this.f9942G = Math.max(this.f9954T - y4, this.f9939D);
        } else {
            this.f9942G = this.f9954T - y4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float x() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f8;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f9 = 0.0f;
        if (this.f9973i != null && (weakReference = this.f9955U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f9955U.get();
            if (F() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float i4 = this.f9973i.i();
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f10 = radius2;
                    if (f10 > 0.0f && i4 > 0.0f) {
                        f8 = f10 / i4;
                        h hVar = this.f9973i;
                        float a3 = hVar.f1769d.f1752a.f1799f.a(hVar.h());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f11 = radius;
                            if (f11 > 0.0f && a3 > 0.0f) {
                                f9 = f11 / a3;
                            }
                        }
                        return Math.max(f8, f9);
                    }
                }
                f8 = 0.0f;
                h hVar2 = this.f9973i;
                float a32 = hVar2.f1769d.f1752a.f1799f.a(hVar2.h());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f8, f9);
            }
        }
        return 0.0f;
    }

    public final int y() {
        int i4;
        if (this.f9970f) {
            return Math.min(Math.max(this.f9971g, this.f9954T - ((this.f9953S * 9) / 16)), this.f9952R) + this.f9984v;
        }
        if (!this.f9976n && !this.f9977o && (i4 = this.f9975m) > 0) {
            return Math.max(this.f9968e, i4 + this.f9972h);
        }
        return this.f9968e + this.f9984v;
    }

    public final void z(int i4) {
        View view = (View) this.f9955U.get();
        if (view != null) {
            ArrayList arrayList = this.f9957W;
            if (!arrayList.isEmpty()) {
                int i8 = this.f9942G;
                if (i4 <= i8 && i8 != D()) {
                    D();
                }
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    ((AbstractC1031a) arrayList.get(i9)).b(view);
                }
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i4;
        this.f9960a = 0;
        this.f9962b = true;
        this.k = -1;
        this.f9974l = -1;
        this.f9936A = new g(this);
        this.f9941F = 0.5f;
        this.f9943H = -1.0f;
        this.K = true;
        this.f9946L = 4;
        this.f9951Q = 0.1f;
        this.f9957W = new ArrayList();
        this.f9961a0 = -1;
        this.f9967d0 = new SparseIntArray();
        this.f9969e0 = new d(this, 1);
        this.f9972h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645a.f10637f);
        if (obtainStyledAttributes.hasValue(3)) {
            this.j = AbstractC0405a.C(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f9987y = l.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        l lVar = this.f9987y;
        if (lVar != null) {
            h hVar = new h(lVar);
            this.f9973i = hVar;
            hVar.k(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.f9973i.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f9973i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.f9937B = ofFloat;
        ofFloat.setDuration(500L);
        this.f9937B.addUpdateListener(new b(2, this));
        this.f9943H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f9974l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i4 = peekValue.data) == -1) {
            H(i4);
        } else {
            H(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        G(obtainStyledAttributes.getBoolean(8, false));
        this.f9976n = obtainStyledAttributes.getBoolean(13, false);
        boolean z8 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f9962b != z8) {
            this.f9962b = z8;
            if (this.f9955U != null) {
                w();
            }
            J((this.f9962b && this.f9946L == 6) ? 3 : this.f9946L);
            N(this.f9946L, true);
            M();
        }
        this.f9945J = obtainStyledAttributes.getBoolean(12, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.f9960a = obtainStyledAttributes.getInt(10, 0);
        float f8 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f8 > 0.0f && f8 < 1.0f) {
            this.f9941F = f8;
            if (this.f9955U != null) {
                this.f9940E = (int) ((1.0f - f8) * this.f9954T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i8 = peekValue2.data;
                if (i8 >= 0) {
                    this.f9938C = i8;
                    N(this.f9946L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f9938C = dimensionPixelOffset;
                    N(this.f9946L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f9966d = obtainStyledAttributes.getInt(11, 500);
            this.f9977o = obtainStyledAttributes.getBoolean(17, false);
            this.f9978p = obtainStyledAttributes.getBoolean(18, false);
            this.f9979q = obtainStyledAttributes.getBoolean(19, false);
            this.f9980r = obtainStyledAttributes.getBoolean(20, true);
            this.f9981s = obtainStyledAttributes.getBoolean(14, false);
            this.f9982t = obtainStyledAttributes.getBoolean(15, false);
            this.f9983u = obtainStyledAttributes.getBoolean(16, false);
            this.f9986x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f9964c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // C.c
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i4, int i8, int i9, int[] iArr) {
    }
}
