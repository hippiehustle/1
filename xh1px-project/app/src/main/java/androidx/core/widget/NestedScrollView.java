package androidx.core.widget;

import E2.b;
import P.C0259g;
import P.C0264l;
import P.C0267o;
import P.C0272u;
import P.F;
import P.InterfaceC0263k;
import P.InterfaceC0266n;
import P.O;
import S.e;
import S.f;
import S.g;
import S.h;
import W0.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0266n, InterfaceC0263k {

    /* renamed from: F, reason: collision with root package name */
    public static final float f8566F = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: G, reason: collision with root package name */
    public static final e f8567G = new e(0);

    /* renamed from: H, reason: collision with root package name */
    public static final int[] f8568H = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public h f8569A;

    /* renamed from: B, reason: collision with root package name */
    public final C0267o f8570B;

    /* renamed from: C, reason: collision with root package name */
    public final C0264l f8571C;

    /* renamed from: D, reason: collision with root package name */
    public float f8572D;

    /* renamed from: E, reason: collision with root package name */
    public final C0259g f8573E;

    /* renamed from: d, reason: collision with root package name */
    public final float f8574d;

    /* renamed from: e, reason: collision with root package name */
    public long f8575e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f8576f;

    /* renamed from: g, reason: collision with root package name */
    public final OverScroller f8577g;

    /* renamed from: h, reason: collision with root package name */
    public final EdgeEffect f8578h;

    /* renamed from: i, reason: collision with root package name */
    public final EdgeEffect f8579i;
    public C0272u j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8580l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8581m;

    /* renamed from: n, reason: collision with root package name */
    public View f8582n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8583o;

    /* renamed from: p, reason: collision with root package name */
    public VelocityTracker f8584p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8585q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8586r;

    /* renamed from: s, reason: collision with root package name */
    public final int f8587s;

    /* renamed from: t, reason: collision with root package name */
    public final int f8588t;

    /* renamed from: u, reason: collision with root package name */
    public final int f8589u;

    /* renamed from: v, reason: collision with root package name */
    public int f8590v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f8591w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f8592x;

    /* renamed from: y, reason: collision with root package name */
    public int f8593y;

    /* renamed from: z, reason: collision with root package name */
    public int f8594z;

    /* JADX WARN: Type inference failed for: r7v2, types: [P.o, java.lang.Object] */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f8576f = new Rect();
        this.f8580l = true;
        this.f8581m = false;
        this.f8582n = null;
        this.f8583o = false;
        this.f8586r = true;
        this.f8590v = -1;
        this.f8591w = new int[2];
        this.f8592x = new int[2];
        this.f8573E = new C0259g(getContext(), new c(16, this));
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            edgeEffect = S.c.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f8578h = edgeEffect;
        if (i4 >= 31) {
            edgeEffect2 = S.c.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f8579i = edgeEffect2;
        this.f8574d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f8577g = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f8587s = viewConfiguration.getScaledTouchSlop();
        this.f8588t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8589u = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8568H, com.buzbuz.smartautoclicker.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f8570B = new Object();
        this.f8571C = new C0264l(this);
        setNestedScrollingEnabled(true);
        O.m(this, f8567G);
    }

    private C0272u getScrollFeedbackProvider() {
        if (this.j == null) {
            this.j = new C0272u(this);
        }
        return this.j;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view != nestedScrollView) {
            Object parent = view.getParent();
            if ((parent instanceof ViewGroup) && l((View) parent, nestedScrollView)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // P.InterfaceC0265m
    public final void a(View view, View view2, int i4, int i8) {
        C0267o c0267o = this.f8570B;
        if (i8 == 1) {
            c0267o.f4299b = i4;
        } else {
            c0267o.f4298a = i4;
        }
        this.f8571C.g(2, i8);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // P.InterfaceC0265m
    public final void b(View view, int i4) {
        C0267o c0267o = this.f8570B;
        if (i4 == 1) {
            c0267o.f4299b = 0;
        } else {
            c0267o.f4298a = 0;
        }
        w(i4);
    }

    @Override // P.InterfaceC0265m
    public final void c(View view, int i4, int i8, int[] iArr, int i9) {
        this.f8571C.c(i4, i8, i9, iArr, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i4;
        if (this.f8577g.isFinished()) {
            return;
        }
        this.f8577g.computeScrollOffset();
        int currY = this.f8577g.getCurrY();
        int i8 = currY - this.f8594z;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f8578h;
        EdgeEffect edgeEffect2 = this.f8579i;
        if (i8 > 0 && b.t(edgeEffect) != 0.0f) {
            round = Math.round(b.D(edgeEffect, ((-i8) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
            if (round != i8) {
                edgeEffect.finish();
            }
        } else {
            if (i8 < 0 && b.t(edgeEffect2) != 0.0f) {
                float f8 = height;
                round = Math.round(b.D(edgeEffect2, (i8 * 4.0f) / f8, 0.5f) * (f8 / 4.0f));
                if (round != i8) {
                    edgeEffect2.finish();
                }
            }
            int i9 = i8;
            this.f8594z = currY;
            int[] iArr = this.f8592x;
            iArr[1] = 0;
            this.f8571C.c(0, i9, 1, iArr, null);
            i4 = i9 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.f8577g.getCurrVelocity()));
            }
            if (i4 != 0) {
                int scrollY = getScrollY();
                p(i4, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i10 = i4 - scrollY2;
                iArr[1] = 0;
                this.f8571C.d(0, scrollY2, 0, i10, this.f8591w, 1, iArr);
                i4 = i10 - iArr[1];
            }
            if (i4 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i4 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f8577g.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f8577g.getCurrVelocity());
                    }
                }
                this.f8577g.abortAnimation();
                w(1);
            }
            if (this.f8577g.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        i8 -= round;
        int i92 = i8;
        this.f8594z = currY;
        int[] iArr2 = this.f8592x;
        iArr2[1] = 0;
        this.f8571C.c(0, i92, 1, iArr2, null);
        i4 = i92 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i4 != 0) {
        }
        if (i4 != 0) {
        }
        if (this.f8577g.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return (scrollY - max) + bottom;
        }
        return bottom;
    }

    @Override // P.InterfaceC0266n
    public final void d(View view, int i4, int i8, int i9, int i10, int i11, int[] iArr) {
        n(i10, i11, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !i(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f8, float f9, boolean z8) {
        return this.f8571C.a(f8, f9, z8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f8, float f9) {
        return this.f8571C.b(f8, f9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i8, int[] iArr, int[] iArr2) {
        return this.f8571C.c(i4, i8, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i8, int i9, int i10, int[] iArr) {
        return this.f8571C.d(i4, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f8578h;
        int i8 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i4 = getPaddingLeft();
            } else {
                i4 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i4, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f8579i;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i8 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i8 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // P.InterfaceC0265m
    public final void e(View view, int i4, int i8, int i9, int i10, int i11) {
        n(i10, i11, null);
    }

    @Override // P.InterfaceC0265m
    public final boolean f(View view, View view2, int i4, int i8) {
        return (i4 & 2) != 0;
    }

    public final boolean g(int i4) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f8576f;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i4);
        } else {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, null, 0, 1, true);
        }
        if (view != null && view.isFocused() && !m(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0267o c0267o = this.f8570B;
        return c0267o.f4299b | c0267o.f4298a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f8572D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.f8572D = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f8572D;
    }

    public final int h(Rect rect) {
        int i4;
        int i8;
        int i9;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i4 = i10 - verticalFadingEdgeLength;
        } else {
            i4 = i10;
        }
        int i11 = rect.bottom;
        if (i11 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i9 = rect.top - scrollY;
            } else {
                i9 = rect.bottom - i4;
            }
            return Math.min(i9, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i11 >= i4) {
            return 0;
        }
        if (rect.height() > height) {
            i8 = 0 - (i4 - rect.bottom);
        } else {
            i8 = 0 - (scrollY - rect.top);
        }
        return Math.max(i8, -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f8571C.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f8576f.setEmpty();
        int i4 = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            if (keyCode != 62) {
                                if (keyCode != 92) {
                                    if (keyCode != 93) {
                                        if (keyCode != 122) {
                                            if (keyCode == 123) {
                                                q(130);
                                                return false;
                                            }
                                        } else {
                                            q(33);
                                            return false;
                                        }
                                    } else {
                                        return k(130);
                                    }
                                } else {
                                    return k(33);
                                }
                            } else {
                                if (keyEvent.isShiftPressed()) {
                                    i4 = 33;
                                }
                                q(i4);
                                return false;
                            }
                        } else {
                            if (keyEvent.isAltPressed()) {
                                return k(130);
                            }
                            return g(130);
                        }
                    } else {
                        if (keyEvent.isAltPressed()) {
                            return k(33);
                        }
                        return g(33);
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f8571C.f4292d;
    }

    public final void j(int i4) {
        if (getChildCount() > 0) {
            this.f8577g.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f8571C.g(2, 1);
            this.f8594z = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.f8577g.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i4) {
        boolean z8;
        int childCount;
        if (i4 == 130) {
            z8 = true;
        } else {
            z8 = false;
        }
        int height = getHeight();
        Rect rect = this.f8576f;
        rect.top = 0;
        rect.bottom = height;
        if (z8 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i4, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i4, int i8) {
        Rect rect = this.f8576f;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i4 >= getScrollY() && rect.top - i4 <= getScrollY() + i8) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i4, int i8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i4, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i4, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f8571C.d(0, scrollY2, 0, i4 - scrollY2, null, i8, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int i4;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f8590v) {
            if (actionIndex == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            this.k = (int) motionEvent.getY(i4);
            this.f8590v = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f8584p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8581m = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i4;
        int i8;
        float f8;
        if (motionEvent.getAction() == 8 && !this.f8583o) {
            if (b.y(motionEvent, 2)) {
                f8 = motionEvent.getAxisValue(9);
                i4 = 9;
                i8 = (int) motionEvent.getX();
            } else if (b.y(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i8 = getWidth() / 2;
                i4 = 26;
                f8 = axisValue;
            } else {
                i4 = 0;
                i8 = 0;
                f8 = 0.0f;
            }
            if (f8 != 0.0f) {
                s(-((int) (getVerticalScrollFactorCompat() * f8)), i4, motionEvent, i8, 1, b.y(motionEvent, 8194));
                if (i4 != 0) {
                    this.f8573E.a(motionEvent, i4);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z8 = true;
        if (action == 2 && this.f8583o) {
            return true;
        }
        int i4 = action & 255;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 6) {
                            o(motionEvent);
                        }
                    }
                } else {
                    int i8 = this.f8590v;
                    if (i8 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i8);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i8 + " in onInterceptTouchEvent");
                        } else {
                            int y4 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y4 - this.k) > this.f8587s && (2 & getNestedScrollAxes()) == 0) {
                                this.f8583o = true;
                                this.k = y4;
                                if (this.f8584p == null) {
                                    this.f8584p = VelocityTracker.obtain();
                                }
                                this.f8584p.addMovement(motionEvent);
                                this.f8593y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f8583o = false;
            this.f8590v = -1;
            VelocityTracker velocityTracker = this.f8584p;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f8584p = null;
            }
            if (this.f8577g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y5 = (int) motionEvent.getY();
            int x8 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y5 >= childAt.getTop() - scrollY && y5 < childAt.getBottom() - scrollY && x8 >= childAt.getLeft() && x8 < childAt.getRight()) {
                    this.k = y5;
                    this.f8590v = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f8584p;
                    if (velocityTracker2 == null) {
                        this.f8584p = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f8584p.addMovement(motionEvent);
                    this.f8577g.computeScrollOffset();
                    if (!v(motionEvent) && this.f8577g.isFinished()) {
                        z8 = false;
                    }
                    this.f8583o = z8;
                    this.f8571C.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.f8577g.isFinished()) {
                z8 = false;
            }
            this.f8583o = z8;
            VelocityTracker velocityTracker3 = this.f8584p;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f8584p = null;
            }
        }
        return this.f8583o;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        int i11;
        super.onLayout(z8, i4, i8, i9, i10);
        int i12 = 0;
        this.f8580l = false;
        View view = this.f8582n;
        if (view != null && l(view, this)) {
            View view2 = this.f8582n;
            Rect rect = this.f8576f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h8 = h(rect);
            if (h8 != 0) {
                scrollBy(0, h8);
            }
        }
        this.f8582n = null;
        if (!this.f8581m) {
            if (this.f8569A != null) {
                scrollTo(getScrollX(), this.f8569A.f5168d);
                this.f8569A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i11 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i11 = 0;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i11 && scrollY >= 0) {
                i12 = paddingTop + scrollY > i11 ? i11 - paddingTop : scrollY;
            }
            if (i12 != scrollY) {
                scrollTo(getScrollX(), i12);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f8581m = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        super.onMeasure(i4, i8);
        if (this.f8585q && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f8, float f9, boolean z8) {
        if (!z8) {
            dispatchNestedFling(0.0f, f9, true);
            j((int) f9);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f8, float f9) {
        return this.f8571C.b(f8, f9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i8, int[] iArr) {
        this.f8571C.c(i4, i8, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i8, int i9, int i10) {
        n(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i4, int i8, boolean z8, boolean z9) {
        super.scrollTo(i4, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        View findNextFocusFromRect;
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i4);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        }
        if (findNextFocusFromRect == null || !m(findNextFocusFromRect, 0, getHeight())) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i4, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        this.f8569A = hVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, S.h] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f5168d = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i4, int i8, int i9, int i10) {
        super.onScrollChanged(i4, i8, i9, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i8, int i9, int i10) {
        super.onSizeChanged(i4, i8, i9, i10);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m(findFocus, 0, i10)) {
            Rect rect = this.f8576f;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h8 = h(rect);
            if (h8 != 0) {
                if (this.f8586r) {
                    u(0, h8, false);
                } else {
                    scrollBy(0, h8);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return f(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float D7;
        int round;
        int i4;
        ViewParent parent2;
        if (this.f8584p == null) {
            this.f8584p = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8593y = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f8 = 0.0f;
        obtain.offsetLocation(0.0f, this.f8593y);
        C0264l c0264l = this.f8571C;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f8578h;
            EdgeEffect edgeEffect2 = this.f8579i;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                o(motionEvent);
                                this.k = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f8590v));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.k = (int) motionEvent.getY(actionIndex);
                            this.f8590v = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.f8583o && getChildCount() > 0) {
                            if (this.f8577g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                                postInvalidateOnAnimation();
                            }
                        }
                        this.f8590v = -1;
                        this.f8583o = false;
                        VelocityTracker velocityTracker = this.f8584p;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f8584p = null;
                        }
                        w(0);
                        this.f8578h.onRelease();
                        this.f8579i.onRelease();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f8590v);
                    if (findPointerIndex == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + this.f8590v + " in onTouchEvent");
                    } else {
                        int y4 = (int) motionEvent.getY(findPointerIndex);
                        int i8 = this.k - y4;
                        float x8 = motionEvent.getX(findPointerIndex) / getWidth();
                        float height = i8 / getHeight();
                        if (b.t(edgeEffect) != 0.0f) {
                            D7 = -b.D(edgeEffect, -height, x8);
                            if (b.t(edgeEffect) == 0.0f) {
                                edgeEffect.onRelease();
                            }
                        } else {
                            if (b.t(edgeEffect2) != 0.0f) {
                                D7 = b.D(edgeEffect2, height, 1.0f - x8);
                                if (b.t(edgeEffect2) == 0.0f) {
                                    edgeEffect2.onRelease();
                                }
                            }
                            round = Math.round(f8 * getHeight());
                            if (round != 0) {
                                invalidate();
                            }
                            i4 = i8 - round;
                            if (!this.f8583o && Math.abs(i4) > this.f8587s) {
                                parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.f8583o = true;
                                i4 = i4 <= 0 ? i4 - this.f8587s : i4 + this.f8587s;
                            }
                            if (this.f8583o) {
                                int s8 = s(i4, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                                this.k = y4 - s8;
                                this.f8593y += s8;
                            }
                        }
                        f8 = D7;
                        round = Math.round(f8 * getHeight());
                        if (round != 0) {
                        }
                        i4 = i8 - round;
                        if (!this.f8583o) {
                            parent2 = getParent();
                            if (parent2 != null) {
                            }
                            this.f8583o = true;
                            if (i4 <= 0) {
                            }
                        }
                        if (this.f8583o) {
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.f8584p;
                velocityTracker2.computeCurrentVelocity(1000, this.f8589u);
                int yVelocity = (int) velocityTracker2.getYVelocity(this.f8590v);
                if (Math.abs(yVelocity) >= this.f8588t) {
                    if (b.t(edgeEffect) != 0.0f) {
                        if (t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (b.t(edgeEffect2) != 0.0f) {
                        int i9 = -yVelocity;
                        if (t(edgeEffect2, i9)) {
                            edgeEffect2.onAbsorb(i9);
                        } else {
                            j(i9);
                        }
                    } else {
                        int i10 = -yVelocity;
                        float f9 = i10;
                        if (!c0264l.b(0.0f, f9)) {
                            dispatchNestedFling(0.0f, f9, true);
                            j(i10);
                        }
                    }
                } else if (this.f8577g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f8590v = -1;
                this.f8583o = false;
                VelocityTracker velocityTracker3 = this.f8584p;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f8584p = null;
                }
                w(0);
                this.f8578h.onRelease();
                this.f8579i.onRelease();
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f8583o && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f8577g.isFinished()) {
                this.f8577g.abortAnimation();
                w(1);
            }
            int y5 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.k = y5;
            this.f8590v = pointerId;
            c0264l.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f8584p;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i4, int i8, int i9, int i10) {
        int i11;
        boolean z8;
        int i12;
        boolean z9;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i13 = i9 + i4;
        if (i8 > 0 || i8 < 0) {
            i11 = 0;
            z8 = true;
        } else {
            i11 = i8;
            z8 = false;
        }
        if (i13 > i10) {
            i12 = i10;
        } else if (i13 < 0) {
            i12 = 0;
        } else {
            i12 = i13;
            z9 = false;
            if (z9 && !this.f8571C.f(1)) {
                this.f8577g.springBack(i11, i12, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i11, i12);
            if (!z8 || z9) {
                return true;
            }
            return false;
        }
        z9 = true;
        if (z9) {
            this.f8577g.springBack(i11, i12, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i11, i12);
        if (!z8) {
        }
        return true;
    }

    public final void q(int i4) {
        boolean z8;
        if (i4 == 130) {
            z8 = true;
        } else {
            z8 = false;
        }
        int height = getHeight();
        Rect rect = this.f8576f;
        if (z8) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i8 = rect.top;
        int i9 = height + i8;
        rect.bottom = i9;
        r(i4, i8, i9);
    }

    public final boolean r(int i4, int i8, int i9) {
        boolean z8;
        View view;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = height + scrollY;
        if (i4 == 33) {
            z8 = true;
        } else {
            z8 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view2 = null;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view3 = focusables.get(i12);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i8 < bottom && top < i9) {
                if (i8 < top && bottom < i9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (view2 == null) {
                    view2 = view3;
                    z12 = z10;
                } else {
                    if ((z8 && top < view2.getTop()) || (!z8 && bottom > view2.getBottom())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12) {
                        if (z10) {
                            if (!z11) {
                            }
                            view2 = view3;
                        }
                    } else if (z10) {
                        view2 = view3;
                        z12 = true;
                    } else {
                        if (!z11) {
                        }
                        view2 = view3;
                    }
                }
            }
        }
        if (view2 == null) {
            view = this;
        } else {
            view = view2;
        }
        if (i8 >= scrollY && i9 <= i11) {
            z9 = false;
        } else {
            if (z8) {
                i10 = i8 - scrollY;
            } else {
                i10 = i9 - i11;
            }
            s(i10, -1, null, 0, 1, true);
            z9 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f8580l) {
            Rect rect = this.f8576f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h8 = h(rect);
            if (h8 != 0) {
                scrollBy(0, h8);
            }
        } else {
            this.f8582n = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        boolean z9;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h8 = h(rect);
        if (h8 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (z8) {
                scrollBy(0, h8);
                return z9;
            }
            u(0, h8, false);
        }
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        VelocityTracker velocityTracker;
        if (z8 && (velocityTracker = this.f8584p) != null) {
            velocityTracker.recycle();
            this.f8584p = null;
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f8580l = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(int i4, int i8, MotionEvent motionEvent, int i9, int i10, boolean z8) {
        int i11;
        int i12;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        C0264l c0264l = this.f8571C;
        if (i10 == 1) {
            c0264l.g(2, i10);
        }
        boolean c6 = this.f8571C.c(0, i4, i10, this.f8592x, this.f8591w);
        int[] iArr = this.f8591w;
        int[] iArr2 = this.f8592x;
        if (c6) {
            i11 = i4 - iArr2[1];
            i12 = iArr[1];
        } else {
            i11 = i4;
            i12 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (p(i11, 0, scrollY, scrollRange) && !c0264l.f(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f4309a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i8, scrollY2);
        }
        iArr2[1] = 0;
        this.f8571C.d(0, scrollY2, 0, i11 - scrollY2, this.f8591w, i10, iArr2);
        int i13 = i12 + iArr[1];
        int i14 = i11 - iArr2[1];
        int i15 = scrollY + i14;
        EdgeEffect edgeEffect = this.f8579i;
        EdgeEffect edgeEffect2 = this.f8578h;
        if (i15 < 0) {
            if (z9) {
                b.D(edgeEffect2, (-i14) / getHeight(), i9 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f4309a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i8, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i15 > scrollRange && z9) {
            b.D(edgeEffect, i14 / getHeight(), 1.0f - (i9 / getWidth()));
            if (motionEvent != null) {
                z11 = false;
                getScrollFeedbackProvider().f4309a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i8, false);
            } else {
                z11 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (!edgeEffect2.isFinished() && edgeEffect.isFinished()) {
                z12 = z10;
            } else {
                postInvalidateOnAnimation();
                z12 = z11;
            }
            if (z12 && i10 == 0 && (velocityTracker = this.f8584p) != null) {
                velocityTracker.clear();
            }
            if (i10 == 1) {
                w(i10);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i13;
        }
        z11 = false;
        if (!edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z12 = z11;
        if (z12) {
            velocityTracker.clear();
        }
        if (i10 == 1) {
        }
        return i13;
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i4 >= 0) {
                if (width + i4 > width2) {
                    i4 = width2 - width;
                }
            } else {
                i4 = 0;
            }
            if (height < height2 && i8 >= 0) {
                if (height + i8 > height2) {
                    i8 = height2 - height;
                }
            } else {
                i8 = 0;
            }
            if (i4 != getScrollX() || i8 != getScrollY()) {
                super.scrollTo(i4, i8);
            }
        }
    }

    public void setFillViewport(boolean z8) {
        if (z8 != this.f8585q) {
            this.f8585q = z8;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z8) {
        C0264l c0264l = this.f8571C;
        if (c0264l.f4292d) {
            ViewGroup viewGroup = c0264l.f4291c;
            WeakHashMap weakHashMap = O.f4214a;
            F.m(viewGroup);
        }
        c0264l.f4292d = z8;
    }

    public void setSmoothScrollingEnabled(boolean z8) {
        this.f8586r = z8;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return this.f8571C.g(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        float t8 = b.t(edgeEffect) * getHeight();
        float abs = Math.abs(-i4) * 0.35f;
        float f8 = this.f8574d * 0.015f;
        double log = Math.log(abs / f8);
        double d2 = f8566F;
        if (((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * f8)) < t8) {
            return true;
        }
        return false;
    }

    public final void u(int i4, int i8, boolean z8) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f8575e > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i8 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f8577g.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z8) {
                this.f8571C.g(2, 1);
            } else {
                w(1);
            }
            this.f8594z = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f8577g.isFinished()) {
                this.f8577g.abortAnimation();
                w(1);
            }
            scrollBy(i4, i8);
        }
        this.f8575e = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z8;
        EdgeEffect edgeEffect = this.f8578h;
        if (b.t(edgeEffect) != 0.0f) {
            b.D(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z8 = true;
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect2 = this.f8579i;
        if (b.t(edgeEffect2) != 0.0f) {
            b.D(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z8;
    }

    public final void w(int i4) {
        this.f8571C.h(i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4) {
        if (getChildCount() <= 0) {
            super.addView(view, i4);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(g gVar) {
    }
}
