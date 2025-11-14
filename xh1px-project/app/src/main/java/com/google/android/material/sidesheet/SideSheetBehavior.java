package com.google.android.material.sidesheet;

import A.j;
import C.c;
import G5.h;
import G5.l;
import H5.a;
import H5.d;
import H5.g;
import P.F;
import P.O;
import Q.f;
import Q.q;
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
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.C0548b;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import e5.AbstractC0645a;
import f5.AbstractC0710a;
import i0.C0878a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import z5.C1876g;
import z5.C1877h;
import z5.InterfaceC1871b;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends c implements InterfaceC1871b {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0405a f10208a;

    /* renamed from: b, reason: collision with root package name */
    public final h f10209b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f10210c;

    /* renamed from: d, reason: collision with root package name */
    public final l f10211d;

    /* renamed from: e, reason: collision with root package name */
    public final g f10212e;

    /* renamed from: f, reason: collision with root package name */
    public final float f10213f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10214g;

    /* renamed from: h, reason: collision with root package name */
    public int f10215h;

    /* renamed from: i, reason: collision with root package name */
    public e f10216i;
    public boolean j;
    public final float k;

    /* renamed from: l, reason: collision with root package name */
    public int f10217l;

    /* renamed from: m, reason: collision with root package name */
    public int f10218m;

    /* renamed from: n, reason: collision with root package name */
    public int f10219n;

    /* renamed from: o, reason: collision with root package name */
    public int f10220o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f10221p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f10222q;

    /* renamed from: r, reason: collision with root package name */
    public final int f10223r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f10224s;

    /* renamed from: t, reason: collision with root package name */
    public C1877h f10225t;

    /* renamed from: u, reason: collision with root package name */
    public int f10226u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f10227v;

    /* renamed from: w, reason: collision with root package name */
    public final d f10228w;

    public SideSheetBehavior() {
        this.f10212e = new g(this);
        this.f10214g = true;
        this.f10215h = 5;
        this.k = 0.1f;
        this.f10223r = -1;
        this.f10227v = new LinkedHashSet();
        this.f10228w = new d(this, 0);
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.f10221p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            O.j(view, 262144);
            O.h(view, 0);
            O.j(view, 1048576);
            O.h(view, 0);
            final int i4 = 5;
            if (this.f10215h != 5) {
                O.k(view, f.j, new q() { // from class: H5.b
                    @Override // Q.q
                    public final boolean a(View view2) {
                        SideSheetBehavior.this.w(i4);
                        return true;
                    }
                });
            }
            final int i8 = 3;
            if (this.f10215h != 3) {
                O.k(view, f.f4698h, new q() { // from class: H5.b
                    @Override // Q.q
                    public final boolean a(View view2) {
                        SideSheetBehavior.this.w(i8);
                        return true;
                    }
                });
            }
        }
    }

    @Override // z5.InterfaceC1871b
    public final void a() {
        final View view;
        boolean z8;
        boolean z9;
        int i4;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        C1877h c1877h = this.f10225t;
        if (c1877h == null) {
            return;
        }
        C0548b c0548b = c1877h.f16690f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        c1877h.f16690f = null;
        int i8 = 5;
        if (c0548b != null && Build.VERSION.SDK_INT >= 34) {
            AbstractC0405a abstractC0405a = this.f10208a;
            if (abstractC0405a != null && abstractC0405a.P() != 0) {
                i8 = 3;
            }
            H5.e eVar = new H5.e(0, this);
            WeakReference weakReference = this.f10222q;
            if (weakReference != null) {
                view = (View) weakReference.get();
            } else {
                view = null;
            }
            if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                final int D7 = this.f10208a.D(marginLayoutParams);
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: H5.c
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SideSheetBehavior.this.f10208a.I0(marginLayoutParams, AbstractC0710a.c(valueAnimator.getAnimatedFraction(), D7, 0));
                        view.requestLayout();
                    }
                };
            }
            View view2 = c1877h.f16686b;
            if (c0548b.f9310d == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            WeakHashMap weakHashMap = O.f4214a;
            if ((Gravity.getAbsoluteGravity(i8, view2.getLayoutDirection()) & 3) == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            float scaleX = view2.getScaleX() * view2.getWidth();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z9) {
                    i4 = marginLayoutParams2.leftMargin;
                } else {
                    i4 = marginLayoutParams2.rightMargin;
                }
            } else {
                i4 = 0;
            }
            float f8 = scaleX + i4;
            Property property = View.TRANSLATION_X;
            if (z9) {
                f8 = -f8;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f8);
            if (animatorUpdateListener != null) {
                ofFloat.addUpdateListener(animatorUpdateListener);
            }
            ofFloat.setInterpolator(new C0878a(1));
            ofFloat.setDuration(AbstractC0710a.c(c0548b.f9309c, c1877h.f16687c, c1877h.f16688d));
            ofFloat.addListener(new C1876g(c1877h, z8, i8));
            ofFloat.addListener(eVar);
            ofFloat.start();
            return;
        }
        w(5);
    }

    @Override // z5.InterfaceC1871b
    public final void b(C0548b c0548b) {
        int i4;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z8;
        C1877h c1877h = this.f10225t;
        if (c1877h != null) {
            AbstractC0405a abstractC0405a = this.f10208a;
            if (abstractC0405a != null && abstractC0405a.P() != 0) {
                i4 = 3;
            } else {
                i4 = 5;
            }
            if (c1877h.f16690f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
            }
            C0548b c0548b2 = c1877h.f16690f;
            c1877h.f16690f = c0548b;
            if (c0548b2 != null) {
                if (c0548b.f9310d == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                c1877h.a(c0548b.f9309c, z8, i4);
            }
            WeakReference weakReference = this.f10221p;
            if (weakReference != null && weakReference.get() != null) {
                View view2 = (View) this.f10221p.get();
                WeakReference weakReference2 = this.f10222q;
                if (weakReference2 != null) {
                    view = (View) weakReference2.get();
                } else {
                    view = null;
                }
                if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                    this.f10208a.I0(marginLayoutParams, (int) ((view2.getScaleX() * this.f10217l) + this.f10220o));
                    view.requestLayout();
                }
            }
        }
    }

    @Override // z5.InterfaceC1871b
    public final void c(C0548b c0548b) {
        C1877h c1877h = this.f10225t;
        if (c1877h == null) {
            return;
        }
        c1877h.f16690f = c0548b;
    }

    @Override // z5.InterfaceC1871b
    public final void d() {
        C1877h c1877h = this.f10225t;
        if (c1877h != null) {
            View view = c1877h.f16686b;
            if (c1877h.f16690f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
            }
            C0548b c0548b = c1877h.f16690f;
            c1877h.f16690f = null;
            if (c0548b == null) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i4), (Property<View, Float>) View.SCALE_Y, 1.0f));
                }
            }
            animatorSet.setDuration(c1877h.f16689e);
            animatorSet.start();
        }
    }

    @Override // C.c
    public final void g(C.f fVar) {
        this.f10221p = null;
        this.f10216i = null;
        this.f10225t = null;
    }

    @Override // C.c
    public final void j() {
        this.f10221p = null;
        this.f10216i = null;
        this.f10225t = null;
    }

    @Override // C.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((view.isShown() || O.e(view) != null) && this.f10214g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.f10224s) != null) {
                velocityTracker.recycle();
                this.f10224s = null;
            }
            if (this.f10224s == null) {
                this.f10224s = VelocityTracker.obtain();
            }
            this.f10224s.addMovement(motionEvent);
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.j) {
                    this.j = false;
                    return false;
                }
            } else {
                this.f10226u = (int) motionEvent.getX();
            }
            if (!this.j && (eVar = this.f10216i) != null && eVar.p(motionEvent)) {
                return true;
            }
            return false;
        }
        this.j = true;
        return false;
    }

    @Override // C.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        int i8;
        View view2;
        View view3;
        int i9;
        int i10;
        View findViewById;
        int i11;
        WeakHashMap weakHashMap = O.f4214a;
        int i12 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f10221p;
        h hVar = this.f10209b;
        int i13 = 0;
        if (weakReference == null) {
            this.f10221p = new WeakReference(view);
            this.f10225t = new C1877h(view);
            if (hVar != null) {
                view.setBackground(hVar);
                float f8 = this.f10213f;
                if (f8 == -1.0f) {
                    f8 = F.e(view);
                }
                hVar.l(f8);
            } else {
                ColorStateList colorStateList = this.f10210c;
                if (colorStateList != null) {
                    F.i(view, colorStateList);
                }
            }
            if (this.f10215h == 5) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            if (view.getVisibility() != i11) {
                view.setVisibility(i11);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (O.e(view) == null) {
                O.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (Gravity.getAbsoluteGravity(((C.f) view.getLayoutParams()).f534c, i4) == 3) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        AbstractC0405a abstractC0405a = this.f10208a;
        if (abstractC0405a == null || abstractC0405a.P() != i8) {
            C.f fVar = null;
            l lVar = this.f10211d;
            if (i8 == 0) {
                this.f10208a = new a(this, i12);
                if (lVar != null) {
                    WeakReference weakReference2 = this.f10221p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof C.f)) {
                        fVar = (C.f) view3.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).rightMargin <= 0) {
                        F3.f e9 = lVar.e();
                        e9.j = new G5.a(0.0f);
                        e9.k = new G5.a(0.0f);
                        l a3 = e9.a();
                        if (hVar != null) {
                            hVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            } else if (i8 == 1) {
                this.f10208a = new a(this, i13);
                if (lVar != null) {
                    WeakReference weakReference3 = this.f10221p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof C.f)) {
                        fVar = (C.f) view2.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).leftMargin <= 0) {
                        F3.f e10 = lVar.e();
                        e10.f1337i = new G5.a(0.0f);
                        e10.f1338l = new G5.a(0.0f);
                        l a4 = e10.a();
                        if (hVar != null) {
                            hVar.setShapeAppearanceModel(a4);
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException(j.j(i8, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
            }
        }
        if (this.f10216i == null) {
            this.f10216i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f10228w);
        }
        int M8 = this.f10208a.M(view);
        coordinatorLayout.r(view, i4);
        this.f10218m = coordinatorLayout.getWidth();
        this.f10219n = this.f10208a.N(coordinatorLayout);
        this.f10217l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i9 = this.f10208a.g(marginLayoutParams);
        } else {
            i9 = 0;
        }
        this.f10220o = i9;
        int i14 = this.f10215h;
        if (i14 != 1 && i14 != 2) {
            if (i14 != 3) {
                if (i14 == 5) {
                    i13 = this.f10208a.I();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f10215h);
                }
            }
        } else {
            i13 = M8 - this.f10208a.M(view);
        }
        view.offsetLeftAndRight(i13);
        if (this.f10222q == null && (i10 = this.f10223r) != -1 && (findViewById = coordinatorLayout.findViewById(i10)) != null) {
            this.f10222q = new WeakReference(findViewById);
        }
        Iterator it = this.f10227v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // C.c
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // C.c
    public final void r(View view, Parcelable parcelable) {
        int i4 = ((H5.f) parcelable).f2030f;
        if (i4 == 1 || i4 == 2) {
            i4 = 5;
        }
        this.f10215h = i4;
    }

    @Override // C.c
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new H5.f(this);
    }

    @Override // C.c
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10215h == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.f10216i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f10224s) != null) {
            velocityTracker.recycle();
            this.f10224s = null;
        }
        if (this.f10224s == null) {
            this.f10224s = VelocityTracker.obtain();
        }
        this.f10224s.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.j && y()) {
            float abs = Math.abs(this.f10226u - motionEvent.getX());
            e eVar = this.f10216i;
            if (abs > eVar.f6461b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void w(int i4) {
        String str;
        if (i4 != 1 && i4 != 2) {
            WeakReference weakReference = this.f10221p;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f10221p.get();
                G.l lVar = new G.l(this, i4, 1);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested()) {
                    WeakHashMap weakHashMap = O.f4214a;
                    if (view.isAttachedToWindow()) {
                        view.post(lVar);
                        return;
                    }
                }
                lVar.run();
                return;
            }
            x(i4);
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

    public final void x(int i4) {
        View view;
        int i8;
        if (this.f10215h != i4) {
            this.f10215h = i4;
            WeakReference weakReference = this.f10221p;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            if (this.f10215h == 5) {
                i8 = 4;
            } else {
                i8 = 0;
            }
            if (view.getVisibility() != i8) {
                view.setVisibility(i8);
            }
            Iterator it = this.f10227v.iterator();
            if (!it.hasNext()) {
                A();
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final boolean y() {
        if (this.f10216i != null) {
            if (this.f10214g || this.f10215h == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        x(2);
        r2.f10212e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(View view, int i4, boolean z8) {
        int H2;
        if (i4 != 3) {
            if (i4 == 5) {
                H2 = this.f10208a.I();
            } else {
                throw new IllegalArgumentException(j.l("Invalid state to get outer edge offset: ", i4));
            }
        } else {
            H2 = this.f10208a.H();
        }
        e eVar = this.f10216i;
        if (eVar != null) {
            if (!z8) {
                int top = view.getTop();
                eVar.f6475r = view;
                eVar.f6462c = -1;
                boolean h8 = eVar.h(H2, top, 0, 0);
                if (!h8 && eVar.f6460a == 0 && eVar.f6475r != null) {
                    eVar.f6475r = null;
                }
            }
        }
        x(i4);
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f10212e = new g(this);
        this.f10214g = true;
        this.f10215h = 5;
        this.k = 0.1f;
        this.f10223r = -1;
        this.f10227v = new LinkedHashSet();
        this.f10228w = new d(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645a.f10624N);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f10210c = AbstractC0405a.C(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f10211d = l.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f10223r = resourceId;
            WeakReference weakReference = this.f10222q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f10222q = null;
            WeakReference weakReference2 = this.f10221p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = O.f4214a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        l lVar = this.f10211d;
        if (lVar != null) {
            h hVar = new h(lVar);
            this.f10209b = hVar;
            hVar.k(context);
            ColorStateList colorStateList = this.f10210c;
            if (colorStateList != null) {
                this.f10209b.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f10209b.setTint(typedValue.data);
            }
        }
        this.f10213f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f10214g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
