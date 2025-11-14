package com.google.android.material.appbar;

import C.f;
import G5.h;
import P.F;
import P.InterfaceC0263k;
import P.O;
import P.t0;
import R3.r;
import a.AbstractC0405a;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.appbar.AppBarLayout;
import e5.AbstractC0645a;
import f5.AbstractC0710a;
import g5.AbstractC0784d;
import g5.AbstractC0785e;
import g5.AbstractC0788h;
import g5.C0783c;
import g5.C0787g;
import h4.AbstractC0832f;
import h4.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import s3.AbstractC1492c;
import t.j;
import u6.AbstractC1638C;
import x5.p;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements C.b {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f9879B = 0;

    /* renamed from: A, reason: collision with root package name */
    public Behavior f9880A;

    /* renamed from: d, reason: collision with root package name */
    public int f9881d;

    /* renamed from: e, reason: collision with root package name */
    public int f9882e;

    /* renamed from: f, reason: collision with root package name */
    public int f9883f;

    /* renamed from: g, reason: collision with root package name */
    public int f9884g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9885h;

    /* renamed from: i, reason: collision with root package name */
    public int f9886i;
    public t0 j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9887l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9888m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9889n;

    /* renamed from: o, reason: collision with root package name */
    public int f9890o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f9891p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f9892q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f9893r;

    /* renamed from: s, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f9894s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f9895t;

    /* renamed from: u, reason: collision with root package name */
    public final long f9896u;

    /* renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f9897v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f9898w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f9899x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f9900y;

    /* renamed from: z, reason: collision with root package name */
    public final float f9901z;

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends AbstractC0785e {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList.get(i4);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // C.c
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // C.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            C.c cVar = ((f) view2.getLayoutParams()).f532a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).j) + this.f11183e) - y(view2);
                WeakHashMap weakHashMap = O.f4214a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f9889n) {
                    appBarLayout.e(appBarLayout.f(view));
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // C.c
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                O.m(coordinatorLayout, null);
            }
        }

        @Override // C.c
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z8) {
            AppBarLayout z9 = z(coordinatorLayout.k(view));
            if (z9 != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f11181c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    z9.d(false, !z8, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645a.f10622L);
            this.f11184f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(M5.a.a(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        boolean z8;
        Integer num;
        int i4;
        this.f9882e = -1;
        this.f9883f = -1;
        this.f9884g = -1;
        this.f9886i = 0;
        this.f9895t = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i8 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray h8 = p.h(context3, attributeSet, AbstractC0788h.f11191a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (h8.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, h8.getResourceId(0, 0)));
            }
            h8.recycle();
            TypedArray h9 = p.h(context2, attributeSet, AbstractC0645a.f10632a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = h9.getDrawable(0);
            WeakHashMap weakHashMap = O.f4214a;
            setBackground(drawable);
            final ColorStateList C8 = AbstractC0405a.C(context2, h9, 6);
            if (C8 != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f9892q = z8;
            final ColorStateList i9 = h2.a.i(getBackground());
            if (i9 != null) {
                final h hVar = new h();
                hVar.m(i9);
                if (C8 != null) {
                    Context context4 = getContext();
                    TypedValue E7 = E2.d.E(context4, R.attr.colorSurface);
                    if (E7 != null) {
                        int i10 = E7.resourceId;
                        if (i10 != 0) {
                            i4 = context4.getColor(i10);
                        } else {
                            i4 = E7.data;
                        }
                        num = Integer.valueOf(i4);
                    } else {
                        num = null;
                    }
                    final Integer num2 = num;
                    this.f9894s = new ValueAnimator.AnimatorUpdateListener() { // from class: g5.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num3;
                            AppBarLayout appBarLayout = AppBarLayout.this;
                            ArrayList arrayList = appBarLayout.f9895t;
                            int t8 = AbstractC0832f.t(((Float) valueAnimator.getAnimatedValue()).floatValue(), i9.getDefaultColor(), C8.getDefaultColor());
                            ColorStateList valueOf = ColorStateList.valueOf(t8);
                            G5.h hVar2 = hVar;
                            hVar2.m(valueOf);
                            if (appBarLayout.f9899x != null && (num3 = appBarLayout.f9900y) != null && num3.equals(num2)) {
                                appBarLayout.f9899x.setTint(t8);
                            }
                            if (!arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (it.next() == null) {
                                        if (hVar2.f1769d.f1754c != null) {
                                            throw null;
                                        }
                                    } else {
                                        throw new ClassCastException();
                                    }
                                }
                            }
                        }
                    };
                    setBackground(hVar);
                } else {
                    hVar.k(context2);
                    this.f9894s = new ValueAnimator.AnimatorUpdateListener() { // from class: g5.b
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i11 = AppBarLayout.f9879B;
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            hVar.l(floatValue);
                            AppBarLayout appBarLayout = AppBarLayout.this;
                            Drawable drawable2 = appBarLayout.f9899x;
                            if (drawable2 instanceof G5.h) {
                                ((G5.h) drawable2).l(floatValue);
                            }
                            Iterator it = appBarLayout.f9895t.iterator();
                            if (!it.hasNext()) {
                                return;
                            }
                            it.next().getClass();
                            throw new ClassCastException();
                        }
                    };
                    setBackground(hVar);
                }
            }
            this.f9896u = AbstractC0832f.x(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f9897v = AbstractC0832f.y(context2, R.attr.motionEasingStandardInterpolator, AbstractC0710a.f10766a);
            if (h9.hasValue(4)) {
                d(h9.getBoolean(4, false), false, false);
            }
            if (h9.hasValue(3)) {
                AbstractC0788h.a(this, h9.getDimensionPixelSize(3, 0));
            }
            if (i8 >= 26) {
                if (h9.hasValue(2)) {
                    setKeyboardNavigationCluster(h9.getBoolean(2, false));
                }
                if (h9.hasValue(1)) {
                    setTouchscreenBlocksFocus(h9.getBoolean(1, false));
                }
            }
            this.f9901z = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f9889n = h9.getBoolean(5, false);
            this.f9890o = h9.getResourceId(7, -1);
            setStatusBarForeground(h9.getDrawable(8));
            h9.recycle();
            F.l(this, new W5.a(13, this));
        } catch (Throwable th) {
            h8.recycle();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, g5.c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, g5.c] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout$LayoutParams, g5.c] */
    public static C0783c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ?? layoutParams2 = new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.f11171a = 1;
            return layoutParams2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? layoutParams3 = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.f11171a = 1;
            return layoutParams3;
        }
        ?? layoutParams4 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams4.f11171a = 1;
        return layoutParams4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, g5.c] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0783c generateLayoutParams(AttributeSet attributeSet) {
        r rVar;
        Context context = getContext();
        ?? layoutParams = new LinearLayout.LayoutParams(context, attributeSet);
        layoutParams.f11171a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645a.f10633b);
        layoutParams.f11171a = obtainStyledAttributes.getInt(1, 0);
        if (obtainStyledAttributes.getInt(0, 0) != 1) {
            rVar = null;
        } else {
            rVar = new r(18);
        }
        layoutParams.f11172b = rVar;
        if (obtainStyledAttributes.hasValue(2)) {
            layoutParams.f11173c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public final void c() {
        d dVar;
        Behavior behavior = this.f9880A;
        if (behavior != null && this.f9882e != -1 && this.f9886i == 0) {
            dVar = behavior.F(V.b.f6208e, this);
        } else {
            dVar = null;
        }
        this.f9882e = -1;
        this.f9883f = -1;
        this.f9884g = -1;
        if (dVar != null) {
            Behavior behavior2 = this.f9880A;
            if (behavior2.f9903m == null) {
                behavior2.f9903m = dVar;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0783c;
    }

    public final void d(boolean z8, boolean z9, boolean z10) {
        int i4;
        int i8;
        if (z8) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        int i9 = 0;
        if (z9) {
            i8 = 4;
        } else {
            i8 = 0;
        }
        int i10 = i4 | i8;
        if (z10) {
            i9 = 8;
        }
        this.f9886i = i10 | i9;
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f9899x != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f9881d);
            this.f9899x.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9899x;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z8) {
        float f8;
        float f9;
        if (!this.k && this.f9888m != z8) {
            this.f9888m = z8;
            refreshDrawableState();
            if (getBackground() instanceof h) {
                float f10 = 0.0f;
                if (this.f9892q) {
                    if (z8) {
                        f9 = 0.0f;
                    } else {
                        f9 = 1.0f;
                    }
                    if (z8) {
                        f10 = 1.0f;
                    }
                    g(f9, f10);
                    return true;
                }
                if (this.f9889n) {
                    float f11 = this.f9901z;
                    if (z8) {
                        f8 = 0.0f;
                    } else {
                        f8 = f11;
                    }
                    if (z8) {
                        f10 = f11;
                    }
                    g(f8, f10);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean f(View view) {
        int i4;
        View view2;
        View view3 = null;
        if (this.f9891p == null && (i4 = this.f9890o) != -1) {
            if (view != null) {
                view2 = view.findViewById(i4);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f9890o);
            }
            if (view2 != null) {
                this.f9891p = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.f9891p;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null) {
            if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g(float f8, float f9) {
        ValueAnimator valueAnimator = this.f9893r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f8, f9);
        this.f9893r = ofFloat;
        ofFloat.setDuration(this.f9896u);
        this.f9893r.setInterpolator(this.f9897v);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f9894s;
        if (animatorUpdateListener != null) {
            this.f9893r.addUpdateListener(animatorUpdateListener);
        }
        this.f9893r.start();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.widget.LinearLayout$LayoutParams, g5.c] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.f11171a = 1;
        return layoutParams;
    }

    @Override // C.b
    public C.c getBehavior() {
        Behavior behavior = new Behavior();
        this.f9880A = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getDownNestedPreScrollRange() {
        int i4;
        int minimumHeight;
        int i8 = this.f9883f;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C0783c c0783c = (C0783c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i10 = c0783c.f11171a;
                if ((i10 & 5) == 5) {
                    int i11 = ((LinearLayout.LayoutParams) c0783c).topMargin + ((LinearLayout.LayoutParams) c0783c).bottomMargin;
                    if ((i10 & 8) != 0) {
                        WeakHashMap weakHashMap = O.f4214a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i10 & 2) != 0) {
                        WeakHashMap weakHashMap2 = O.f4214a;
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i4 = i11 + measuredHeight;
                        if (childCount == 0) {
                            WeakHashMap weakHashMap3 = O.f4214a;
                            if (childAt.getFitsSystemWindows()) {
                                i4 = Math.min(i4, measuredHeight - getTopInset());
                            }
                        }
                        i9 += i4;
                    }
                    i4 = minimumHeight + i11;
                    if (childCount == 0) {
                    }
                    i9 += i4;
                } else if (i9 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i9);
        this.f9883f = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i4 = this.f9884g;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0783c c0783c = (C0783c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) c0783c).topMargin + ((LinearLayout.LayoutParams) c0783c).bottomMargin + childAt.getMeasuredHeight();
                int i10 = c0783c.f11171a;
                if ((i10 & 1) == 0) {
                    break;
                }
                i9 += measuredHeight;
                if ((i10 & 2) != 0) {
                    WeakHashMap weakHashMap = O.f4214a;
                    i9 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i8++;
        }
        int max = Math.max(0, i9);
        this.f9884g = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f9890o;
    }

    public h getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof h) {
            return (h) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = O.f4214a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                minimumHeight = getChildAt(childCount - 1).getMinimumHeight();
            } else {
                minimumHeight = 0;
            }
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f9886i;
    }

    public Drawable getStatusBarForeground() {
        return this.f9899x;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        t0 t0Var = this.j;
        if (t0Var != null) {
            return t0Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i4 = this.f9882e;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0783c c0783c = (C0783c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i10 = c0783c.f11171a;
                if ((i10 & 1) == 0) {
                    break;
                }
                int i11 = measuredHeight + ((LinearLayout.LayoutParams) c0783c).topMargin + ((LinearLayout.LayoutParams) c0783c).bottomMargin + i9;
                if (i8 == 0) {
                    WeakHashMap weakHashMap = O.f4214a;
                    if (childAt.getFitsSystemWindows()) {
                        i11 -= getTopInset();
                    }
                }
                i9 = i11;
                if ((i10 & 2) != 0) {
                    WeakHashMap weakHashMap2 = O.f4214a;
                    i9 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i8++;
        }
        int max = Math.max(0, i9);
        this.f9882e = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof h) {
            AbstractC1638C.L(this, (h) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (this.f9898w == null) {
            this.f9898w = new int[4];
        }
        int[] iArr = this.f9898w;
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + iArr.length);
        boolean z8 = this.f9887l;
        if (z8) {
            i8 = R.attr.state_liftable;
        } else {
            i8 = -2130904075;
        }
        iArr[0] = i8;
        if (z8 && this.f9888m) {
            i9 = R.attr.state_lifted;
        } else {
            i9 = -2130904076;
        }
        iArr[1] = i9;
        if (z8) {
            i10 = R.attr.state_collapsible;
        } else {
            i10 = -2130904071;
        }
        iArr[2] = i10;
        if (z8 && this.f9888m) {
            i11 = R.attr.state_collapsed;
        } else {
            i11 = -2130904070;
        }
        iArr[3] = i11;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f9891p;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f9891p = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        super.onLayout(z8, i4, i8, i9, i10);
        WeakHashMap weakHashMap = O.f4214a;
        boolean z9 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f9885h = false;
        int childCount2 = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount2) {
                break;
            }
            if (((C0783c) getChildAt(i11).getLayoutParams()).f11173c != null) {
                this.f9885h = true;
                break;
            }
            i11++;
        }
        Drawable drawable = this.f9899x;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.k) {
            if (!this.f9889n) {
                int childCount3 = getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount3) {
                        int i13 = ((C0783c) getChildAt(i12).getLayoutParams()).f11171a;
                        if ((i13 & 1) == 1 && (i13 & 10) != 0) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        z9 = false;
                        break;
                    }
                }
            }
            if (this.f9887l != z9) {
                this.f9887l = z9;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        super.onMeasure(i4, i8);
        int mode = View.MeasureSpec.getMode(i8);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = O.f4214a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode != Integer.MIN_VALUE) {
                        if (mode == 0) {
                            measuredHeight += getTopInset();
                        }
                    } else {
                        measuredHeight = AbstractC1492c.i(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i8));
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        Drawable background = getBackground();
        if (background instanceof h) {
            ((h) background).l(f8);
        }
    }

    public void setExpanded(boolean z8) {
        WeakHashMap weakHashMap = O.f4214a;
        d(z8, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z8) {
        this.f9889n = z8;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f9890o = -1;
        if (view == null) {
            WeakReference weakReference = this.f9891p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f9891p = null;
            return;
        }
        this.f9891p = new WeakReference(view);
    }

    public void setLiftOnScrollTargetViewId(int i4) {
        this.f9890o = i4;
        WeakReference weakReference = this.f9891p;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f9891p = null;
    }

    public void setLiftableOverrideEnabled(boolean z8) {
        this.k = z8;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i4) {
        if (i4 == 1) {
            super.setOrientation(i4);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2;
        boolean z8;
        Drawable drawable3 = this.f9899x;
        if (drawable3 != drawable) {
            Integer num = null;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            } else {
                drawable2 = null;
            }
            this.f9899x = drawable2;
            if (drawable2 instanceof h) {
                num = Integer.valueOf(((h) drawable2).f1787x);
            } else {
                ColorStateList i4 = h2.a.i(drawable2);
                if (i4 != null) {
                    num = Integer.valueOf(i4.getDefaultColor());
                }
            }
            this.f9900y = num;
            Drawable drawable4 = this.f9899x;
            boolean z9 = false;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f9899x.setState(getDrawableState());
                }
                Drawable drawable5 = this.f9899x;
                WeakHashMap weakHashMap = O.f4214a;
                drawable5.setLayoutDirection(getLayoutDirection());
                Drawable drawable6 = this.f9899x;
                if (getVisibility() == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                drawable6.setVisible(z8, false);
                this.f9899x.setCallback(this);
            }
            if (this.f9899x != null && getTopInset() > 0) {
                z9 = true;
            }
            setWillNotDraw(!z9);
            WeakHashMap weakHashMap2 = O.f4214a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i4) {
        setStatusBarForeground(new ColorDrawable(i4));
    }

    public void setStatusBarForegroundResource(int i4) {
        setStatusBarForeground(g.k(getContext(), i4));
    }

    @Deprecated
    public void setTargetElevation(float f8) {
        AbstractC0788h.a(this, f8);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        boolean z8;
        super.setVisibility(i4);
        if (i4 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Drawable drawable = this.f9899x;
        if (drawable != null) {
            drawable.setVisible(z8, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f9899x) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC0784d {
        public int j;
        public int k;

        /* renamed from: l, reason: collision with root package name */
        public ValueAnimator f9902l;

        /* renamed from: m, reason: collision with root package name */
        public d f9903m;

        /* renamed from: n, reason: collision with root package name */
        public WeakReference f9904n;

        public BaseBehavior() {
            this.f11177f = -1;
            this.f11179h = -1;
        }

        public static View B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if (((f) childAt.getLayoutParams()).f532a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if ((childAt instanceof InterfaceC0263k) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4, int i8, boolean z8) {
            View view;
            boolean z9;
            int abs = Math.abs(i4);
            int childCount = appBarLayout.getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 < childCount) {
                    view = appBarLayout.getChildAt(i9);
                    if (abs >= view.getTop() && abs <= view.getBottom()) {
                        break;
                    } else {
                        i9++;
                    }
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                int i10 = ((C0783c) view.getLayoutParams()).f11171a;
                if ((i10 & 1) != 0) {
                    WeakHashMap weakHashMap = O.f4214a;
                    int minimumHeight = view.getMinimumHeight();
                    z9 = true;
                    if (i8 > 0) {
                    }
                }
            }
            z9 = false;
            if (appBarLayout.f9889n) {
                z9 = appBarLayout.f(D(coordinatorLayout));
            }
            boolean e9 = appBarLayout.e(z9);
            if (!z8) {
                if (e9) {
                    List list = (List) ((j) coordinatorLayout.f8535e.f281f).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.f8537g;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        C.c cVar = ((f) ((View) arrayList.get(i11)).getLayoutParams()).f532a;
                        if (cVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) cVar).f11184f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4) {
            int height;
            int abs = Math.abs(y() - i4);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int y4 = y();
            if (y4 == i4) {
                ValueAnimator valueAnimator = this.f9902l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f9902l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f9902l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f9902l = valueAnimator3;
                valueAnimator3.setInterpolator(AbstractC0710a.f10770e);
                this.f9902l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f9902l.setDuration(Math.min(height, 600));
            this.f9902l.setIntValues(y4, i4);
            this.f9902l.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i8;
            int i9;
            if (i4 != 0) {
                if (i4 < 0) {
                    i8 = -appBarLayout.getTotalScrollRange();
                    i9 = appBarLayout.getDownNestedPreScrollRange() + i8;
                } else {
                    i8 = -appBarLayout.getUpNestedPreScrollRange();
                    i9 = 0;
                }
                int i10 = i8;
                int i11 = i9;
                if (i10 != i11) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = z(coordinatorLayout, appBarLayout2, y() - i4, i10, i11);
                    if (!appBarLayout2.f9889n) {
                        appBarLayout2.e(appBarLayout2.f(view));
                        return;
                    }
                    return;
                }
            }
            appBarLayout2 = appBarLayout;
            if (!appBarLayout2.f9889n) {
            }
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.material.appbar.d, V.b] */
        public final d F(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z8;
            boolean z9;
            int w8 = w();
            int childCount = appBarLayout.getChildCount();
            boolean z10 = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = appBarLayout.getChildAt(i4);
                int bottom = childAt.getBottom() + w8;
                if (childAt.getTop() + w8 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = V.b.f6208e;
                    }
                    ?? bVar = new V.b(parcelable);
                    if (w8 == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    bVar.f9918g = z8;
                    if (!z8 && (-w8) >= appBarLayout.getTotalScrollRange()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bVar.f9917f = z9;
                    bVar.f9919h = i4;
                    WeakHashMap weakHashMap = O.f4214a;
                    if (bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight()) {
                        z10 = true;
                    }
                    bVar.j = z10;
                    bVar.f9920i = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int y4 = y() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 < childCount) {
                    View childAt = appBarLayout.getChildAt(i4);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    C0783c c0783c = (C0783c) childAt.getLayoutParams();
                    if ((c0783c.f11171a & 32) == 32) {
                        top -= ((LinearLayout.LayoutParams) c0783c).topMargin;
                        bottom += ((LinearLayout.LayoutParams) c0783c).bottomMargin;
                    }
                    int i8 = -y4;
                    if (top <= i8 && bottom >= i8) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i4);
                C0783c c0783c2 = (C0783c) childAt2.getLayoutParams();
                int i9 = c0783c2.f11171a;
                if ((i9 & 17) == 17) {
                    int i10 = -childAt2.getTop();
                    int i11 = -childAt2.getBottom();
                    if (i4 == 0) {
                        WeakHashMap weakHashMap = O.f4214a;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            i10 -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i9 & 2) == 2) {
                        WeakHashMap weakHashMap2 = O.f4214a;
                        i11 += childAt2.getMinimumHeight();
                    } else if ((i9 & 5) == 5) {
                        WeakHashMap weakHashMap3 = O.f4214a;
                        int minimumHeight = childAt2.getMinimumHeight() + i11;
                        if (y4 < minimumHeight) {
                            i10 = minimumHeight;
                        } else {
                            i11 = minimumHeight;
                        }
                    }
                    if ((i9 & 32) == 32) {
                        i10 += ((LinearLayout.LayoutParams) c0783c2).topMargin;
                        i11 -= ((LinearLayout.LayoutParams) c0783c2).bottomMargin;
                    }
                    if (y4 < (i11 + i10) / 2) {
                        i10 = i11;
                    }
                    C(coordinatorLayout, appBarLayout, AbstractC1492c.i(i10 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // g5.AbstractC0786f, C.c
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            boolean z8;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i4);
            int pendingAction = appBarLayout.getPendingAction();
            d dVar = this.f9903m;
            if (dVar != null && (pendingAction & 8) == 0) {
                if (dVar.f9917f) {
                    A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
                } else if (dVar.f9918g) {
                    A(coordinatorLayout, appBarLayout, 0);
                } else {
                    View childAt = appBarLayout.getChildAt(dVar.f9919h);
                    int i8 = -childAt.getBottom();
                    if (this.f9903m.j) {
                        WeakHashMap weakHashMap = O.f4214a;
                        round = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i8;
                    } else {
                        round = Math.round(childAt.getHeight() * this.f9903m.f9920i) + i8;
                    }
                    A(coordinatorLayout, appBarLayout, round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i9 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z8) {
                        C(coordinatorLayout, appBarLayout, i9);
                    } else {
                        A(coordinatorLayout, appBarLayout, i9);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z8) {
                        C(coordinatorLayout, appBarLayout, 0);
                    } else {
                        A(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f9886i = 0;
            this.f9903m = null;
            int i10 = AbstractC1492c.i(w(), -appBarLayout.getTotalScrollRange(), 0);
            C0787g c0787g = this.f11185a;
            if (c0787g != null) {
                if (c0787g.f11189c != i10) {
                    c0787g.f11189c = i10;
                    c0787g.c();
                }
            } else {
                this.f11186b = i10;
            }
            H(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.f9881d = w();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap weakHashMap2 = O.f4214a;
                appBarLayout.postInvalidateOnAnimation();
            }
            if (O.d(coordinatorLayout) != null) {
                return true;
            }
            O.m(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // C.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i8, int i9) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(i4, i8, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // C.c
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i8, int[] iArr, int i9) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i8, iArr);
        }

        @Override // C.c
        public final void p(CoordinatorLayout coordinatorLayout, View view, int i4, int i8, int i9, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i9 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout, y() - i9, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i9 == 0 && O.d(coordinatorLayout2) == null) {
                O.m(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // C.c
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof d) {
                this.f9903m = (d) parcelable;
            } else {
                this.f9903m = null;
            }
        }

        @Override // C.c
        public final Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            d F2 = F(absSavedState, (AppBarLayout) view);
            if (F2 == null) {
                return absSavedState;
            }
            return F2;
        }

        @Override // C.c
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i8) {
            boolean z8;
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i4 & 2) != 0 && (appBarLayout.f9889n || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8 && (valueAnimator = this.f9902l) != null) {
                valueAnimator.cancel();
            }
            this.f9904n = null;
            this.k = i8;
            return z8;
        }

        @Override // C.c
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i4 == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f9889n) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.f9904n = new WeakReference(view2);
        }

        @Override // g5.AbstractC0784d
        public final int y() {
            return w() + this.j;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
        @Override // g5.AbstractC0784d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i4, int i8, int i9) {
            int i10;
            boolean z8;
            int i11;
            int i12;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int y4 = y();
            int i13 = 0;
            if (i8 != 0 && y4 >= i8 && y4 <= i9) {
                int i14 = AbstractC1492c.i(i4, i8, i9);
                if (y4 != i14) {
                    if (appBarLayout.f9885h) {
                        int abs = Math.abs(i14);
                        int childCount = appBarLayout.getChildCount();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i15);
                            C0783c c0783c = (C0783c) childAt.getLayoutParams();
                            Interpolator interpolator = c0783c.f11173c;
                            if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i16 = c0783c.f11171a;
                                    if ((i16 & 1) != 0) {
                                        i12 = childAt.getHeight() + ((LinearLayout.LayoutParams) c0783c).topMargin + ((LinearLayout.LayoutParams) c0783c).bottomMargin;
                                        if ((i16 & 2) != 0) {
                                            WeakHashMap weakHashMap = O.f4214a;
                                            i12 -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                    WeakHashMap weakHashMap2 = O.f4214a;
                                    if (childAt.getFitsSystemWindows()) {
                                        i12 -= appBarLayout.getTopInset();
                                    }
                                    if (i12 > 0) {
                                        float f8 = i12;
                                        i10 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f8) * f8)) * Integer.signum(i14);
                                    }
                                }
                            } else {
                                i15++;
                            }
                        }
                    }
                    i10 = i14;
                    C0787g c0787g = this.f11185a;
                    int i17 = 1;
                    if (c0787g != null) {
                        if (c0787g.f11189c != i10) {
                            c0787g.f11189c = i10;
                            c0787g.c();
                            z8 = true;
                            int i18 = y4 - i14;
                            this.j = i14 - i10;
                            if (z8) {
                                int i19 = 0;
                                while (i19 < appBarLayout.getChildCount()) {
                                    C0783c c0783c2 = (C0783c) appBarLayout.getChildAt(i19).getLayoutParams();
                                    r rVar = c0783c2.f11172b;
                                    if (rVar != null && (c0783c2.f11171a & i17) != 0) {
                                        View childAt2 = appBarLayout.getChildAt(i19);
                                        float w8 = w();
                                        Rect rect = (Rect) rVar.f5083f;
                                        Rect rect2 = (Rect) rVar.f5082e;
                                        childAt2.getDrawingRect(rect2);
                                        appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                        rect2.offset(0, -appBarLayout.getTopInset());
                                        float abs2 = rect2.top - Math.abs(w8);
                                        if (abs2 <= 0.0f) {
                                            float h8 = 1.0f - AbstractC1492c.h(Math.abs(abs2 / rect2.height()), 0.0f, 1.0f);
                                            float height = (-abs2) - ((rect2.height() * 0.3f) * (1.0f - (h8 * h8)));
                                            childAt2.setTranslationY(height);
                                            childAt2.getDrawingRect(rect);
                                            rect.offset(0, (int) (-height));
                                            if (height >= rect.height()) {
                                                childAt2.setVisibility(4);
                                            } else {
                                                childAt2.setVisibility(0);
                                            }
                                            WeakHashMap weakHashMap3 = O.f4214a;
                                            childAt2.setClipBounds(rect);
                                        } else {
                                            WeakHashMap weakHashMap4 = O.f4214a;
                                            childAt2.setClipBounds(null);
                                            childAt2.setTranslationY(0.0f);
                                            childAt2.setVisibility(0);
                                        }
                                    }
                                    i19++;
                                    i17 = 1;
                                }
                            }
                            if (!z8 && appBarLayout.f9885h) {
                                coordinatorLayout.i(appBarLayout);
                            }
                            appBarLayout.f9881d = w();
                            if (!appBarLayout.willNotDraw()) {
                                WeakHashMap weakHashMap5 = O.f4214a;
                                appBarLayout.postInvalidateOnAnimation();
                            }
                            if (i14 >= y4) {
                                i11 = -1;
                            } else {
                                i11 = 1;
                            }
                            H(coordinatorLayout, appBarLayout, i14, i11, false);
                            i13 = i18;
                        }
                    } else {
                        this.f11186b = i10;
                    }
                    z8 = false;
                    int i182 = y4 - i14;
                    this.j = i14 - i10;
                    if (z8) {
                    }
                    if (!z8) {
                        coordinatorLayout.i(appBarLayout);
                    }
                    appBarLayout.f9881d = w();
                    if (!appBarLayout.willNotDraw()) {
                    }
                    if (i14 >= y4) {
                    }
                    H(coordinatorLayout, appBarLayout, i14, i11, false);
                    i13 = i182;
                }
            } else {
                this.j = 0;
            }
            if (O.d(coordinatorLayout) != null) {
                return i13;
            }
            O.m(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f11177f = -1;
            this.f11179h = -1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, g5.c] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.f11171a = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
