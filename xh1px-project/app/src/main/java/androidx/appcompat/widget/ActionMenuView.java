package androidx.appcompat.widget;

import N.f;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import g0.L;
import n.InterfaceC1099A;
import n.k;
import n.l;
import n.m;
import n.o;
import o.AbstractC1223x0;
import o.C1187f;
import o.C1193i;
import o.C1197k;
import o.C1201m;
import o.C1221w0;
import o.InterfaceC1199l;
import o.InterfaceC1203n;
import o.t1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC1223x0 implements l, InterfaceC1099A {

    /* renamed from: A, reason: collision with root package name */
    public int f8390A;

    /* renamed from: B, reason: collision with root package name */
    public final int f8391B;

    /* renamed from: C, reason: collision with root package name */
    public final int f8392C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC1203n f8393D;

    /* renamed from: s, reason: collision with root package name */
    public m f8394s;

    /* renamed from: t, reason: collision with root package name */
    public Context f8395t;

    /* renamed from: u, reason: collision with root package name */
    public int f8396u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8397v;

    /* renamed from: w, reason: collision with root package name */
    public C1197k f8398w;

    /* renamed from: x, reason: collision with root package name */
    public f f8399x;

    /* renamed from: y, reason: collision with root package name */
    public k f8400y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8401z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f8391B = (int) (56.0f * f8);
        this.f8392C = (int) (f8 * 4.0f);
        this.f8395t = context;
        this.f8396u = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, o.m] */
    public static C1201m j() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f13313a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, o.m] */
    public static C1201m k(ViewGroup.LayoutParams layoutParams) {
        C1201m c1201m;
        if (layoutParams != null) {
            if (layoutParams instanceof C1201m) {
                C1201m c1201m2 = (C1201m) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) c1201m2);
                layoutParams2.f13313a = c1201m2.f13313a;
                c1201m = layoutParams2;
            } else {
                c1201m = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c1201m).gravity <= 0) {
                ((LinearLayout.LayoutParams) c1201m).gravity = 16;
            }
            return c1201m;
        }
        return j();
    }

    @Override // n.InterfaceC1099A
    public final void b(m mVar) {
        this.f8394s = mVar;
    }

    @Override // n.l
    public final boolean c(o oVar) {
        return this.f8394s.q(oVar, null, 0);
    }

    @Override // o.AbstractC1223x0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1201m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // o.AbstractC1223x0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C1221w0 generateDefaultLayoutParams() {
        return j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, o.w0] */
    @Override // o.AbstractC1223x0
    /* renamed from: g */
    public final C1221w0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // o.AbstractC1223x0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // o.AbstractC1223x0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Menu getMenu() {
        if (this.f8394s == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.f8394s = mVar;
            mVar.f12645e = new L(9, this);
            C1197k c1197k = new C1197k(context);
            this.f8398w = c1197k;
            c1197k.f13281p = true;
            c1197k.f13282q = true;
            f fVar = this.f8399x;
            f fVar2 = fVar;
            if (fVar == null) {
                fVar2 = new Object();
            }
            c1197k.f13275h = fVar2;
            this.f8394s.b(c1197k, this.f8395t);
            C1197k c1197k2 = this.f8398w;
            c1197k2.k = this;
            this.f8394s = c1197k2.f13273f;
        }
        return this.f8394s;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1197k c1197k = this.f8398w;
        C1193i c1193i = c1197k.f13278m;
        if (c1193i != null) {
            return c1193i.getDrawable();
        }
        if (c1197k.f13280o) {
            return c1197k.f13279n;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f8396u;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // o.AbstractC1223x0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1221w0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i4) {
        boolean z8 = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof InterfaceC1199l)) {
            z8 = ((InterfaceC1199l) childAt).b();
        }
        if (i4 > 0 && (childAt2 instanceof InterfaceC1199l)) {
            return ((InterfaceC1199l) childAt2).c() | z8;
        }
        return z8;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1197k c1197k = this.f8398w;
        if (c1197k != null) {
            c1197k.g(false);
            if (this.f8398w.e()) {
                this.f8398w.c();
                this.f8398w.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1197k c1197k = this.f8398w;
        if (c1197k != null) {
            c1197k.c();
            C1187f c1187f = c1197k.f13289x;
            if (c1187f != null && c1187f.b()) {
                c1187f.f12712i.dismiss();
            }
        }
    }

    @Override // o.AbstractC1223x0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        boolean z9;
        int i11;
        int width;
        int i12;
        if (!this.f8401z) {
            super.onLayout(z8, i4, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i9 - i4;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean z10 = t1.f13385a;
        if (getLayoutDirection() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                C1201m c1201m = (C1201m) childAt.getLayoutParams();
                if (c1201m.f13313a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z9) {
                        i12 = getPaddingLeft() + ((LinearLayout.LayoutParams) c1201m).leftMargin;
                        width = i12 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1201m).rightMargin;
                        i12 = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(i12, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1201m).leftMargin) + ((LinearLayout.LayoutParams) c1201m).rightMargin;
                    l(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        if (i21 > 0) {
            i11 = paddingRight / i21;
        } else {
            i11 = 0;
        }
        int max = Math.max(0, i11);
        if (z9) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                C1201m c1201m2 = (C1201m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1201m2.f13313a) {
                    int i23 = width2 - ((LinearLayout.LayoutParams) c1201m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1201m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            C1201m c1201m3 = (C1201m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1201m3.f13313a) {
                int i26 = paddingLeft + ((LinearLayout.LayoutParams) c1201m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c1201m3).rightMargin + max + i26;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // o.AbstractC1223x0, android.view.View
    public final void onMeasure(int i4, int i8) {
        boolean z8;
        int i9;
        boolean z9;
        int i10;
        boolean z10;
        int i11;
        int i12;
        ?? r11;
        boolean z11;
        int i13;
        int i14;
        ActionMenuItemView actionMenuItemView;
        boolean z12;
        int i15;
        boolean z13;
        m mVar;
        boolean z14 = this.f8401z;
        if (View.MeasureSpec.getMode(i4) == 1073741824) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f8401z = z8;
        if (z14 != z8) {
            this.f8390A = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.f8401z && (mVar = this.f8394s) != null && size != this.f8390A) {
            this.f8390A = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (this.f8401z && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i8);
            int size2 = View.MeasureSpec.getSize(i4);
            int size3 = View.MeasureSpec.getSize(i8);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingBottom, -2);
            int i16 = size2 - paddingRight;
            int i17 = this.f8391B;
            int i18 = i16 / i17;
            int i19 = i16 % i17;
            if (i18 == 0) {
                setMeasuredDimension(i16, 0);
                return;
            }
            int i20 = (i19 / i18) + i17;
            int childCount2 = getChildCount();
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            boolean z15 = false;
            int i25 = 0;
            long j = 0;
            while (true) {
                i9 = this.f8392C;
                if (i24 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i24);
                int i26 = size3;
                int i27 = paddingBottom;
                if (childAt.getVisibility() == 8) {
                    i14 = i20;
                } else {
                    boolean z16 = childAt instanceof ActionMenuItemView;
                    i22++;
                    if (z16) {
                        childAt.setPadding(i9, 0, i9, 0);
                    }
                    C1201m c1201m = (C1201m) childAt.getLayoutParams();
                    c1201m.f13318f = false;
                    c1201m.f13315c = 0;
                    c1201m.f13314b = 0;
                    c1201m.f13316d = false;
                    ((LinearLayout.LayoutParams) c1201m).leftMargin = 0;
                    ((LinearLayout.LayoutParams) c1201m).rightMargin = 0;
                    if (z16 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c1201m.f13317e = z11;
                    if (c1201m.f13313a) {
                        i13 = 1;
                    } else {
                        i13 = i18;
                    }
                    C1201m c1201m2 = (C1201m) childAt.getLayoutParams();
                    int i28 = i18;
                    i14 = i20;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i27, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z16) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && !TextUtils.isEmpty(actionMenuItemView.getText())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z17 = z12;
                    if (i13 > 0 && (!z12 || i13 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i15 = measuredWidth / i14;
                        if (measuredWidth % i14 != 0) {
                            i15++;
                        }
                        if (z17 && i15 < 2) {
                            i15 = 2;
                        }
                    } else {
                        i15 = 0;
                    }
                    if (!c1201m2.f13313a && z17) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c1201m2.f13316d = z13;
                    c1201m2.f13314b = i15;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i14, 1073741824), makeMeasureSpec);
                    i23 = Math.max(i23, i15);
                    if (c1201m.f13316d) {
                        i25++;
                    }
                    if (c1201m.f13313a) {
                        z15 = true;
                    }
                    i18 = i28 - i15;
                    i21 = Math.max(i21, childAt.getMeasuredHeight());
                    if (i15 == 1) {
                        j |= 1 << i24;
                    }
                }
                i24++;
                size3 = i26;
                paddingBottom = i27;
                i20 = i14;
            }
            int i29 = size3;
            int i30 = i18;
            int i31 = i20;
            if (z15 && i22 == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i32 = i30;
            boolean z18 = false;
            while (i25 > 0 && i32 > 0) {
                int i33 = Integer.MAX_VALUE;
                long j5 = 0;
                int i34 = 0;
                int i35 = 0;
                while (i35 < childCount2) {
                    int i36 = i21;
                    C1201m c1201m3 = (C1201m) getChildAt(i35).getLayoutParams();
                    boolean z19 = z9;
                    if (c1201m3.f13316d) {
                        int i37 = c1201m3.f13314b;
                        if (i37 < i33) {
                            j5 = 1 << i35;
                            i33 = i37;
                            i34 = 1;
                        } else if (i37 == i33) {
                            j5 |= 1 << i35;
                            i34++;
                        }
                    }
                    i35++;
                    z9 = z19;
                    i21 = i36;
                }
                i10 = i21;
                boolean z20 = z9;
                j |= j5;
                if (i34 > i32) {
                    break;
                }
                int i38 = i33 + 1;
                int i39 = 0;
                while (i39 < childCount2) {
                    View childAt2 = getChildAt(i39);
                    C1201m c1201m4 = (C1201m) childAt2.getLayoutParams();
                    boolean z21 = z15;
                    long j8 = 1 << i39;
                    if ((j5 & j8) == 0) {
                        if (c1201m4.f13314b == i38) {
                            j |= j8;
                        }
                    } else {
                        if (z20 && c1201m4.f13317e) {
                            r11 = 1;
                            r11 = 1;
                            if (i32 == 1) {
                                childAt2.setPadding(i9 + i31, 0, i9, 0);
                            }
                        } else {
                            r11 = 1;
                        }
                        c1201m4.f13314b += r11;
                        c1201m4.f13318f = r11;
                        i32--;
                    }
                    i39++;
                    z15 = z21;
                }
                z9 = z20;
                i21 = i10;
                z18 = true;
            }
            i10 = i21;
            if (!z15 && i22 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i32 > 0 && j != 0 && (i32 < i22 - 1 || z10 || i23 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z10) {
                    if ((j & 1) != 0 && !((C1201m) getChildAt(0).getLayoutParams()).f13317e) {
                        bitCount -= 0.5f;
                    }
                    int i40 = childCount2 - 1;
                    if ((j & (1 << i40)) != 0 && !((C1201m) getChildAt(i40).getLayoutParams()).f13317e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i12 = (int) ((i32 * i31) / bitCount);
                } else {
                    i12 = 0;
                }
                boolean z22 = z18;
                for (int i41 = 0; i41 < childCount2; i41++) {
                    if ((j & (1 << i41)) != 0) {
                        View childAt3 = getChildAt(i41);
                        C1201m c1201m5 = (C1201m) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c1201m5.f13315c = i12;
                            c1201m5.f13318f = true;
                            if (i41 == 0 && !c1201m5.f13317e) {
                                ((LinearLayout.LayoutParams) c1201m5).leftMargin = (-i12) / 2;
                            }
                            z22 = true;
                        } else if (c1201m5.f13313a) {
                            c1201m5.f13315c = i12;
                            c1201m5.f13318f = true;
                            ((LinearLayout.LayoutParams) c1201m5).rightMargin = (-i12) / 2;
                            z22 = true;
                        } else {
                            if (i41 != 0) {
                                ((LinearLayout.LayoutParams) c1201m5).leftMargin = i12 / 2;
                            }
                            if (i41 != childCount2 - 1) {
                                ((LinearLayout.LayoutParams) c1201m5).rightMargin = i12 / 2;
                            }
                        }
                    }
                }
                z18 = z22;
            }
            if (z18) {
                for (int i42 = 0; i42 < childCount2; i42++) {
                    View childAt4 = getChildAt(i42);
                    C1201m c1201m6 = (C1201m) childAt4.getLayoutParams();
                    if (c1201m6.f13318f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1201m6.f13314b * i31) + c1201m6.f13315c, 1073741824), childMeasureSpec);
                    }
                }
            }
            if (mode != 1073741824) {
                i11 = i10;
            } else {
                i11 = i29;
            }
            setMeasuredDimension(i16, i11);
            return;
        }
        for (int i43 = 0; i43 < childCount; i43++) {
            C1201m c1201m7 = (C1201m) getChildAt(i43).getLayoutParams();
            ((LinearLayout.LayoutParams) c1201m7).rightMargin = 0;
            ((LinearLayout.LayoutParams) c1201m7).leftMargin = 0;
        }
        super.onMeasure(i4, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z8) {
        this.f8398w.f13286u = z8;
    }

    public void setOnMenuItemClickListener(InterfaceC1203n interfaceC1203n) {
        this.f8393D = interfaceC1203n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1197k c1197k = this.f8398w;
        C1193i c1193i = c1197k.f13278m;
        if (c1193i != null) {
            c1193i.setImageDrawable(drawable);
        } else {
            c1197k.f13280o = true;
            c1197k.f13279n = drawable;
        }
    }

    public void setOverflowReserved(boolean z8) {
        this.f8397v = z8;
    }

    public void setPopupTheme(int i4) {
        if (this.f8396u != i4) {
            this.f8396u = i4;
            if (i4 == 0) {
                this.f8395t = getContext();
            } else {
                this.f8395t = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(C1197k c1197k) {
        this.f8398w = c1197k;
        c1197k.k = this;
        this.f8394s = c1197k.f13273f;
    }

    @Override // o.AbstractC1223x0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
