package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import h.AbstractC0805a;

/* renamed from: o.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1223x0 extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public boolean f13409d;

    /* renamed from: e, reason: collision with root package name */
    public int f13410e;

    /* renamed from: f, reason: collision with root package name */
    public int f13411f;

    /* renamed from: g, reason: collision with root package name */
    public int f13412g;

    /* renamed from: h, reason: collision with root package name */
    public int f13413h;

    /* renamed from: i, reason: collision with root package name */
    public int f13414i;
    public float j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f13415l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f13416m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f13417n;

    /* renamed from: o, reason: collision with root package name */
    public int f13418o;

    /* renamed from: p, reason: collision with root package name */
    public int f13419p;

    /* renamed from: q, reason: collision with root package name */
    public int f13420q;

    /* renamed from: r, reason: collision with root package name */
    public int f13421r;

    public AbstractC1223x0(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f13409d = true;
        this.f13410e = -1;
        this.f13411f = 0;
        this.f13413h = 8388659;
        int[] iArr = AbstractC0805a.f11286n;
        R.g J6 = R.g.J(context, attributeSet, iArr, i4);
        P.O.l(this, context, iArr, attributeSet, (TypedArray) J6.f4988f, i4);
        TypedArray typedArray = (TypedArray) J6.f4988f;
        int i8 = typedArray.getInt(1, -1);
        if (i8 >= 0) {
            setOrientation(i8);
        }
        int i9 = typedArray.getInt(0, -1);
        if (i9 >= 0) {
            setGravity(i9);
        }
        boolean z8 = typedArray.getBoolean(2, true);
        if (!z8) {
            setBaselineAligned(z8);
        }
        this.j = typedArray.getFloat(4, -1.0f);
        this.f13410e = typedArray.getInt(3, -1);
        this.k = typedArray.getBoolean(7, false);
        setDividerDrawable(J6.A(5));
        this.f13420q = typedArray.getInt(8, 0);
        this.f13421r = typedArray.getDimensionPixelSize(6, 0);
        J6.L();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1221w0;
    }

    public final void d(Canvas canvas, int i4) {
        this.f13417n.setBounds(getPaddingLeft() + this.f13421r, i4, (getWidth() - getPaddingRight()) - this.f13421r, this.f13419p + i4);
        this.f13417n.draw(canvas);
    }

    public final void e(Canvas canvas, int i4) {
        this.f13417n.setBounds(i4, getPaddingTop() + this.f13421r, this.f13418o + i4, (getHeight() - getPaddingBottom()) - this.f13421r);
        this.f13417n.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, o.w0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, o.w0] */
    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1221w0 generateDefaultLayoutParams() {
        int i4 = this.f13412g;
        if (i4 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i4 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, o.w0] */
    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1221w0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i4;
        if (this.f13410e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f13410e;
        if (childCount > i8) {
            View childAt = getChildAt(i8);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f13410e == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i9 = this.f13411f;
            if (this.f13412g == 1 && (i4 = this.f13413h & 112) != 48) {
                if (i4 != 16) {
                    if (i4 == 80) {
                        i9 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f13414i;
                    }
                } else {
                    i9 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f13414i) / 2;
                }
            }
            return i9 + ((LinearLayout.LayoutParams) ((C1221w0) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f13410e;
    }

    public Drawable getDividerDrawable() {
        return this.f13417n;
    }

    public int getDividerPadding() {
        return this.f13421r;
    }

    public int getDividerWidth() {
        return this.f13418o;
    }

    public int getGravity() {
        return this.f13413h;
    }

    public int getOrientation() {
        return this.f13412g;
    }

    public int getShowDividers() {
        return this.f13420q;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.j;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, o.w0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, o.w0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout$LayoutParams, o.w0] */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1221w0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1221w0) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i4) {
        if (i4 == 0) {
            if ((this.f13420q & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i4 == getChildCount()) {
            if ((this.f13420q & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.f13420q & 2) != 0) {
            for (int i8 = i4 - 1; i8 >= 0; i8--) {
                if (getChildAt(i8).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z8;
        int right;
        int left;
        int i4;
        int left2;
        int bottom;
        if (this.f13417n != null) {
            int i8 = 0;
            if (this.f13412g == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i8 < virtualChildCount) {
                    View childAt = getChildAt(i8);
                    if (childAt != null && childAt.getVisibility() != 8 && i(i8)) {
                        d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C1221w0) childAt.getLayoutParams())).topMargin) - this.f13419p);
                    }
                    i8++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.f13419p;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1221w0) childAt2.getLayoutParams())).bottomMargin;
                    }
                    d(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean z9 = t1.f13385a;
            if (getLayoutDirection() == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            while (i8 < virtualChildCount2) {
                View childAt3 = getChildAt(i8);
                if (childAt3 != null && childAt3.getVisibility() != 8 && i(i8)) {
                    C1221w0 c1221w0 = (C1221w0) childAt3.getLayoutParams();
                    if (z8) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) c1221w0).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) c1221w0).leftMargin) - this.f13418o;
                    }
                    e(canvas, left2);
                }
                i8++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 == null) {
                    if (z8) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth() - getPaddingRight();
                        i4 = this.f13418o;
                        right = left - i4;
                    }
                } else {
                    C1221w0 c1221w02 = (C1221w0) childAt4.getLayoutParams();
                    if (z8) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c1221w02).leftMargin;
                        i4 = this.f13418o;
                        right = left - i4;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) c1221w02).rightMargin;
                    }
                }
                e(canvas, right);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        boolean z9;
        int paddingLeft;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int paddingTop;
        char c6;
        int i21;
        int i22;
        int i23;
        int i24 = 8;
        char c9 = 2;
        if (this.f13412g == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i25 = i9 - i4;
            int paddingRight = i25 - getPaddingRight();
            int paddingRight2 = (i25 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i26 = this.f13413h;
            int i27 = i26 & 112;
            int i28 = 8388615 & i26;
            if (i27 != 16) {
                if (i27 != 80) {
                    paddingTop = getPaddingTop();
                } else {
                    paddingTop = ((getPaddingTop() + i10) - i8) - this.f13414i;
                }
            } else {
                paddingTop = getPaddingTop() + (((i10 - i8) - this.f13414i) / 2);
            }
            int i29 = 0;
            while (i29 < virtualChildCount) {
                View childAt = getChildAt(i29);
                if (childAt == null || childAt.getVisibility() == i24) {
                    c6 = c9;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C1221w0 c1221w0 = (C1221w0) childAt.getLayoutParams();
                    c6 = c9;
                    int i30 = ((LinearLayout.LayoutParams) c1221w0).gravity;
                    if (i30 < 0) {
                        i30 = i28;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i30, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i23 = ((LinearLayout.LayoutParams) c1221w0).leftMargin + paddingLeft2;
                            if (i(i29)) {
                                paddingTop += this.f13419p;
                            }
                            int i31 = paddingTop + ((LinearLayout.LayoutParams) c1221w0).topMargin;
                            childAt.layout(i23, i31, measuredWidth + i23, i31 + measuredHeight);
                            paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c1221w0).bottomMargin + i31;
                        } else {
                            i21 = paddingRight - measuredWidth;
                            i22 = ((LinearLayout.LayoutParams) c1221w0).rightMargin;
                        }
                    } else {
                        i21 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) c1221w0).leftMargin;
                        i22 = ((LinearLayout.LayoutParams) c1221w0).rightMargin;
                    }
                    i23 = i21 - i22;
                    if (i(i29)) {
                    }
                    int i312 = paddingTop + ((LinearLayout.LayoutParams) c1221w0).topMargin;
                    childAt.layout(i23, i312, measuredWidth + i23, i312 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c1221w0).bottomMargin + i312;
                }
                i29++;
                c9 = c6;
                i24 = 8;
            }
            return;
        }
        boolean z10 = t1.f13385a;
        if (getLayoutDirection() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int paddingTop2 = getPaddingTop();
        int i32 = i10 - i8;
        int paddingBottom = i32 - getPaddingBottom();
        int paddingBottom2 = (i32 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i33 = this.f13413h;
        int i34 = 8388615 & i33;
        int i35 = i33 & 112;
        boolean z11 = this.f13409d;
        int[] iArr = this.f13415l;
        int[] iArr2 = this.f13416m;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i34, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            if (absoluteGravity2 != 5) {
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = ((getPaddingLeft() + i9) - i4) - this.f13414i;
            }
        } else {
            paddingLeft = getPaddingLeft() + (((i9 - i4) - this.f13414i) / 2);
        }
        if (z9) {
            i12 = virtualChildCount2 - 1;
            i11 = -1;
        } else {
            i11 = 1;
            i12 = 0;
        }
        int i36 = 0;
        while (i36 < virtualChildCount2) {
            int i37 = (i11 * i36) + i12;
            View childAt2 = getChildAt(i37);
            if (childAt2 == null) {
                i13 = i12;
            } else {
                i13 = i12;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    C1221w0 c1221w02 = (C1221w0) childAt2.getLayoutParams();
                    int i38 = paddingLeft;
                    if (z11) {
                        i14 = paddingTop2;
                        if (((LinearLayout.LayoutParams) c1221w02).height != -1) {
                            i15 = childAt2.getBaseline();
                            i16 = ((LinearLayout.LayoutParams) c1221w02).gravity;
                            if (i16 < 0) {
                                i16 = i35;
                            }
                            i17 = i16 & 112;
                            if (i17 == 16) {
                                if (i17 != 48) {
                                    if (i17 != 80) {
                                        i18 = i14;
                                    } else {
                                        i18 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c1221w02).bottomMargin;
                                        if (i15 != -1) {
                                            i19 = iArr2[2] - (childAt2.getMeasuredHeight() - i15);
                                        }
                                    }
                                } else {
                                    i18 = i14 + ((LinearLayout.LayoutParams) c1221w02).topMargin;
                                    if (i15 != -1) {
                                        i18 = (iArr[1] - i15) + i18;
                                    }
                                }
                                if (i(i37)) {
                                    i20 = i38 + this.f13418o;
                                } else {
                                    i20 = i38;
                                }
                                int i39 = i20 + ((LinearLayout.LayoutParams) c1221w02).leftMargin;
                                childAt2.layout(i39, i18, i39 + measuredWidth2, i18 + measuredHeight2);
                                paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c1221w02).rightMargin + i39;
                                i36++;
                                i12 = i13;
                                paddingTop2 = i14;
                            } else {
                                i18 = ((paddingBottom2 - measuredHeight2) / 2) + i14 + ((LinearLayout.LayoutParams) c1221w02).topMargin;
                                i19 = ((LinearLayout.LayoutParams) c1221w02).bottomMargin;
                            }
                            i18 -= i19;
                            if (i(i37)) {
                            }
                            int i392 = i20 + ((LinearLayout.LayoutParams) c1221w02).leftMargin;
                            childAt2.layout(i392, i18, i392 + measuredWidth2, i18 + measuredHeight2);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c1221w02).rightMargin + i392;
                            i36++;
                            i12 = i13;
                            paddingTop2 = i14;
                        }
                    } else {
                        i14 = paddingTop2;
                    }
                    i15 = -1;
                    i16 = ((LinearLayout.LayoutParams) c1221w02).gravity;
                    if (i16 < 0) {
                    }
                    i17 = i16 & 112;
                    if (i17 == 16) {
                    }
                    i18 -= i19;
                    if (i(i37)) {
                    }
                    int i3922 = i20 + ((LinearLayout.LayoutParams) c1221w02).leftMargin;
                    childAt2.layout(i3922, i18, i3922 + measuredWidth2, i18 + measuredHeight2);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c1221w02).rightMargin + i3922;
                    i36++;
                    i12 = i13;
                    paddingTop2 = i14;
                }
            }
            i14 = paddingTop2;
            i36++;
            i12 = i13;
            paddingTop2 = i14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i4, int i8) {
        boolean z8;
        int max;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z9;
        int i14;
        boolean z10;
        int baseline;
        int i15;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        int i19;
        boolean z11;
        boolean z12;
        C1221w0 c1221w0;
        int i20;
        int[] iArr2;
        int i21;
        View view;
        int i22;
        boolean z13;
        boolean z14;
        boolean z15;
        int max2;
        int i23;
        int i24;
        int i25;
        boolean z16;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z17;
        int i31;
        int i32;
        int i33;
        View view2;
        boolean z18;
        boolean z19;
        AbstractC1223x0 abstractC1223x0 = this;
        int i34 = -2;
        int i35 = 0;
        int i36 = 1073741824;
        int i37 = 8;
        if (abstractC1223x0.f13412g == 1) {
            abstractC1223x0.f13414i = 0;
            int virtualChildCount = abstractC1223x0.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i8);
            int i38 = abstractC1223x0.f13410e;
            boolean z20 = abstractC1223x0.k;
            int i39 = 0;
            int i40 = 0;
            int i41 = 0;
            boolean z21 = false;
            int i42 = 0;
            boolean z22 = false;
            boolean z23 = true;
            float f8 = 0.0f;
            int i43 = 0;
            while (i39 < virtualChildCount) {
                int i44 = mode;
                View childAt = abstractC1223x0.getChildAt(i39);
                if (childAt == null) {
                    abstractC1223x0.f13414i = abstractC1223x0.f13414i;
                } else if (childAt.getVisibility() != i37) {
                    if (abstractC1223x0.i(i39)) {
                        abstractC1223x0.f13414i += abstractC1223x0.f13419p;
                    }
                    C1221w0 c1221w02 = (C1221w0) childAt.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) c1221w02).weight;
                    f8 += f9;
                    if (mode2 == i36 && ((LinearLayout.LayoutParams) c1221w02).height == 0 && f9 > 0.0f) {
                        int i45 = abstractC1223x0.f13414i;
                        abstractC1223x0.f13414i = Math.max(i45, ((LinearLayout.LayoutParams) c1221w02).topMargin + i45 + ((LinearLayout.LayoutParams) c1221w02).bottomMargin);
                        view2 = childAt;
                        i30 = mode2;
                        i31 = i38;
                        z17 = z20;
                        i32 = i39;
                        z21 = true;
                        i33 = i44;
                    } else {
                        if (((LinearLayout.LayoutParams) c1221w02).height == 0 && f9 > 0.0f) {
                            ((LinearLayout.LayoutParams) c1221w02).height = i34;
                            i27 = 0;
                        } else {
                            i27 = Integer.MIN_VALUE;
                        }
                        if (f8 == 0.0f) {
                            i28 = i39;
                            i29 = abstractC1223x0.f13414i;
                        } else {
                            i28 = i39;
                            i29 = 0;
                        }
                        i30 = mode2;
                        z17 = z20;
                        i31 = i38;
                        i32 = i28;
                        i33 = i44;
                        abstractC1223x0.measureChildWithMargins(childAt, i4, 0, i8, i29);
                        if (i27 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c1221w02).height = i27;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i46 = abstractC1223x0.f13414i;
                        view2 = childAt;
                        abstractC1223x0.f13414i = Math.max(i46, i46 + measuredHeight + ((LinearLayout.LayoutParams) c1221w02).topMargin + ((LinearLayout.LayoutParams) c1221w02).bottomMargin);
                        if (z17) {
                            i43 = Math.max(measuredHeight, i43);
                        }
                    }
                    if (i31 >= 0 && i31 == i32 + 1) {
                        abstractC1223x0.f13411f = abstractC1223x0.f13414i;
                    }
                    if (i32 < i31 && ((LinearLayout.LayoutParams) c1221w02).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i33 != 1073741824 && ((LinearLayout.LayoutParams) c1221w02).width == -1) {
                        z18 = true;
                        z22 = true;
                    } else {
                        z18 = false;
                    }
                    int i47 = ((LinearLayout.LayoutParams) c1221w02).leftMargin + ((LinearLayout.LayoutParams) c1221w02).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i47;
                    i35 = Math.max(i35, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z24 = z18;
                    int combineMeasuredStates = View.combineMeasuredStates(i42, measuredState);
                    if (z23) {
                        i42 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) c1221w02).width == -1) {
                            z19 = true;
                            if (((LinearLayout.LayoutParams) c1221w02).weight <= 0.0f) {
                                if (!z24) {
                                    i47 = measuredWidth;
                                }
                                i41 = Math.max(i41, i47);
                            } else {
                                if (!z24) {
                                    i47 = measuredWidth;
                                }
                                i40 = Math.max(i40, i47);
                            }
                            z23 = z19;
                            i39 = i32 + 1;
                            i38 = i31;
                            mode = i33;
                            z20 = z17;
                            mode2 = i30;
                            i34 = -2;
                            i36 = 1073741824;
                            i37 = 8;
                        }
                    } else {
                        i42 = combineMeasuredStates;
                    }
                    z19 = false;
                    if (((LinearLayout.LayoutParams) c1221w02).weight <= 0.0f) {
                    }
                    z23 = z19;
                    i39 = i32 + 1;
                    i38 = i31;
                    mode = i33;
                    z20 = z17;
                    mode2 = i30;
                    i34 = -2;
                    i36 = 1073741824;
                    i37 = 8;
                }
                i30 = mode2;
                i31 = i38;
                z17 = z20;
                i32 = i39;
                i33 = i44;
                i39 = i32 + 1;
                i38 = i31;
                mode = i33;
                z20 = z17;
                mode2 = i30;
                i34 = -2;
                i36 = 1073741824;
                i37 = 8;
            }
            int i48 = mode;
            int i49 = mode2;
            boolean z25 = z20;
            int i50 = i42;
            int i51 = i8;
            if (abstractC1223x0.f13414i > 0 && abstractC1223x0.i(virtualChildCount)) {
                abstractC1223x0.f13414i += abstractC1223x0.f13419p;
            }
            if (z25 && (i49 == Integer.MIN_VALUE || i49 == 0)) {
                abstractC1223x0.f13414i = 0;
                for (int i52 = 0; i52 < virtualChildCount; i52++) {
                    View childAt2 = abstractC1223x0.getChildAt(i52);
                    if (childAt2 == null) {
                        abstractC1223x0.f13414i = abstractC1223x0.f13414i;
                    } else if (childAt2.getVisibility() != 8) {
                        C1221w0 c1221w03 = (C1221w0) childAt2.getLayoutParams();
                        int i53 = abstractC1223x0.f13414i;
                        abstractC1223x0.f13414i = Math.max(i53, i53 + i43 + ((LinearLayout.LayoutParams) c1221w03).topMargin + ((LinearLayout.LayoutParams) c1221w03).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC1223x0.getPaddingBottom() + abstractC1223x0.getPaddingTop() + abstractC1223x0.f13414i;
            abstractC1223x0.f13414i = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC1223x0.getSuggestedMinimumHeight()), i51, 0);
            int i54 = (resolveSizeAndState & 16777215) - abstractC1223x0.f13414i;
            if (!z21 && (i54 == 0 || f8 <= 0.0f)) {
                i40 = Math.max(i40, i41);
                if (z25 && i49 != 1073741824) {
                    for (int i55 = 0; i55 < virtualChildCount; i55++) {
                        View childAt3 = abstractC1223x0.getChildAt(i55);
                        if (childAt3 != null && childAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1221w0) childAt3.getLayoutParams())).weight > 0.0f) {
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i43, 1073741824));
                        }
                    }
                }
            } else {
                float f10 = abstractC1223x0.j;
                if (f10 > 0.0f) {
                    f8 = f10;
                }
                abstractC1223x0.f13414i = 0;
                int i56 = i50;
                int i57 = 0;
                while (i57 < virtualChildCount) {
                    View childAt4 = abstractC1223x0.getChildAt(i57);
                    if (childAt4.getVisibility() == 8) {
                        i24 = i57;
                    } else {
                        C1221w0 c1221w04 = (C1221w0) childAt4.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) c1221w04).weight;
                        if (f11 > 0.0f) {
                            int i58 = (int) ((i54 * f11) / f8);
                            f8 -= f11;
                            i54 -= i58;
                            i24 = i57;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, abstractC1223x0.getPaddingRight() + abstractC1223x0.getPaddingLeft() + ((LinearLayout.LayoutParams) c1221w04).leftMargin + ((LinearLayout.LayoutParams) c1221w04).rightMargin, ((LinearLayout.LayoutParams) c1221w04).width);
                            if (((LinearLayout.LayoutParams) c1221w04).height == 0) {
                                i26 = 1073741824;
                                if (i49 == 1073741824) {
                                    if (i58 <= 0) {
                                        i58 = 0;
                                    }
                                    childAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i58, 1073741824));
                                    i56 = View.combineMeasuredStates(i56, childAt4.getMeasuredState() & (-256));
                                }
                            } else {
                                i26 = 1073741824;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight() + i58;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i26));
                            i56 = View.combineMeasuredStates(i56, childAt4.getMeasuredState() & (-256));
                        } else {
                            i24 = i57;
                        }
                        int i59 = ((LinearLayout.LayoutParams) c1221w04).leftMargin + ((LinearLayout.LayoutParams) c1221w04).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i59;
                        i35 = Math.max(i35, measuredWidth2);
                        if (i48 != 1073741824) {
                            i25 = -1;
                            if (((LinearLayout.LayoutParams) c1221w04).width == -1) {
                                measuredWidth2 = i59;
                            }
                        } else {
                            i25 = -1;
                        }
                        i40 = Math.max(i40, measuredWidth2);
                        if (z23 && ((LinearLayout.LayoutParams) c1221w04).width == i25) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        int i60 = abstractC1223x0.f13414i;
                        abstractC1223x0.f13414i = Math.max(i60, childAt4.getMeasuredHeight() + i60 + ((LinearLayout.LayoutParams) c1221w04).topMargin + ((LinearLayout.LayoutParams) c1221w04).bottomMargin);
                        z23 = z16;
                    }
                    i57 = i24 + 1;
                }
                abstractC1223x0.f13414i = abstractC1223x0.getPaddingBottom() + abstractC1223x0.getPaddingTop() + abstractC1223x0.f13414i;
                i50 = i56;
            }
            if (z23 || i48 == 1073741824) {
                i40 = i35;
            }
            abstractC1223x0.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC1223x0.getPaddingRight() + abstractC1223x0.getPaddingLeft() + i40, abstractC1223x0.getSuggestedMinimumWidth()), i4, i50), resolveSizeAndState);
            if (z22) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC1223x0.getMeasuredWidth(), 1073741824);
                int i61 = 0;
                while (i61 < virtualChildCount) {
                    View childAt5 = abstractC1223x0.getChildAt(i61);
                    if (childAt5.getVisibility() != 8) {
                        C1221w0 c1221w05 = (C1221w0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c1221w05).width == -1) {
                            int i62 = ((LinearLayout.LayoutParams) c1221w05).height;
                            ((LinearLayout.LayoutParams) c1221w05).height = childAt5.getMeasuredHeight();
                            abstractC1223x0.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i51, 0);
                            ((LinearLayout.LayoutParams) c1221w05).height = i62;
                        }
                    }
                    i61++;
                    i51 = i8;
                }
                return;
            }
            return;
        }
        int i63 = i4;
        abstractC1223x0.f13414i = 0;
        int virtualChildCount2 = abstractC1223x0.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i63);
        int mode4 = View.MeasureSpec.getMode(i8);
        if (abstractC1223x0.f13415l == null || abstractC1223x0.f13416m == null) {
            abstractC1223x0.f13415l = new int[4];
            abstractC1223x0.f13416m = new int[4];
        }
        int[] iArr3 = abstractC1223x0.f13415l;
        int[] iArr4 = abstractC1223x0.f13416m;
        iArr3[3] = -1;
        char c6 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z26 = abstractC1223x0.f13409d;
        boolean z27 = abstractC1223x0.k;
        if (mode3 == 1073741824) {
            z8 = true;
        } else {
            z8 = false;
        }
        float f12 = 0.0f;
        boolean z28 = true;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        boolean z29 = false;
        boolean z30 = false;
        while (i64 < virtualChildCount2) {
            char c9 = c6;
            View childAt6 = abstractC1223x0.getChildAt(i64);
            if (childAt6 == null) {
                abstractC1223x0.f13414i = abstractC1223x0.f13414i;
                i19 = i64;
                i23 = i66;
                iArr2 = iArr3;
                iArr = iArr4;
                z11 = z26;
                z12 = z27;
            } else {
                int i70 = i65;
                if (childAt6.getVisibility() == 8) {
                    i63 = i4;
                    i19 = i64;
                    i23 = i66;
                    iArr = iArr4;
                    z11 = z26;
                    z12 = z27;
                    i65 = i70;
                    iArr2 = iArr3;
                } else {
                    if (abstractC1223x0.i(i64)) {
                        abstractC1223x0.f13414i += abstractC1223x0.f13418o;
                    }
                    C1221w0 c1221w06 = (C1221w0) childAt6.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) c1221w06).weight;
                    f12 += f13;
                    int i71 = i64;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c1221w06).width == 0 && f13 > 0.0f) {
                        if (z8) {
                            abstractC1223x0.f13414i = ((LinearLayout.LayoutParams) c1221w06).leftMargin + ((LinearLayout.LayoutParams) c1221w06).rightMargin + abstractC1223x0.f13414i;
                        } else {
                            int i72 = abstractC1223x0.f13414i;
                            abstractC1223x0.f13414i = Math.max(i72, ((LinearLayout.LayoutParams) c1221w06).leftMargin + i72 + ((LinearLayout.LayoutParams) c1221w06).rightMargin);
                        }
                        if (z26) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z11 = z26;
                            z12 = z27;
                            i20 = i70;
                            i19 = i71;
                            c1221w0 = c1221w06;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i63 = i4;
                            i21 = i66;
                            i18 = i67;
                        } else {
                            view = childAt6;
                            z11 = z26;
                            z12 = z27;
                            z30 = true;
                            i20 = i70;
                            i19 = i71;
                            i22 = 1073741824;
                            c1221w0 = c1221w06;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i63 = i4;
                            i21 = i66;
                            i18 = i67;
                            if (mode4 == i22 && ((LinearLayout.LayoutParams) c1221w0).height == -1) {
                                z13 = true;
                                z29 = true;
                            } else {
                                z13 = false;
                            }
                            int i73 = ((LinearLayout.LayoutParams) c1221w0).topMargin + ((LinearLayout.LayoutParams) c1221w0).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i73;
                            i69 = View.combineMeasuredStates(i69, view.getMeasuredState());
                            if (!z11) {
                                int baseline2 = view.getBaseline();
                                z14 = z13;
                                if (baseline2 != -1) {
                                    int i74 = ((LinearLayout.LayoutParams) c1221w0).gravity;
                                    if (i74 < 0) {
                                        i74 = abstractC1223x0.f13413h;
                                    }
                                    int i75 = (((i74 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i75] = Math.max(iArr2[i75], baseline2);
                                    iArr[i75] = Math.max(iArr[i75], measuredHeight3 - baseline2);
                                }
                            } else {
                                z14 = z13;
                            }
                            int max3 = Math.max(i20, measuredHeight3);
                            if (!z28 && ((LinearLayout.LayoutParams) c1221w0).height == -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (((LinearLayout.LayoutParams) c1221w0).weight <= 0.0f) {
                                if (!z14) {
                                    i73 = measuredHeight3;
                                }
                                i67 = Math.max(i18, i73);
                                max2 = i21;
                            } else {
                                if (!z14) {
                                    i73 = measuredHeight3;
                                }
                                max2 = Math.max(i21, i73);
                                i67 = i18;
                            }
                            int i76 = max2;
                            i65 = max3;
                            i23 = i76;
                            z28 = z15;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) c1221w06).width == 0 && f13 > 0.0f) {
                            ((LinearLayout.LayoutParams) c1221w06).width = -2;
                            i16 = 0;
                        } else {
                            i16 = Integer.MIN_VALUE;
                        }
                        if (f12 == 0.0f) {
                            i17 = abstractC1223x0.f13414i;
                        } else {
                            i17 = 0;
                        }
                        iArr = iArr4;
                        i18 = i67;
                        i19 = i71;
                        z11 = z26;
                        z12 = z27;
                        int i77 = i16;
                        c1221w0 = c1221w06;
                        i20 = i70;
                        i63 = i4;
                        iArr2 = iArr3;
                        i21 = i66;
                        abstractC1223x0.measureChildWithMargins(childAt6, i63, i17, i8, 0);
                        if (i77 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c1221w0).width = i77;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z8) {
                            view = childAt6;
                            abstractC1223x0.f13414i = ((LinearLayout.LayoutParams) c1221w0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c1221w0).rightMargin + abstractC1223x0.f13414i;
                        } else {
                            view = childAt6;
                            int i78 = abstractC1223x0.f13414i;
                            abstractC1223x0.f13414i = Math.max(i78, i78 + measuredWidth3 + ((LinearLayout.LayoutParams) c1221w0).leftMargin + ((LinearLayout.LayoutParams) c1221w0).rightMargin);
                        }
                        if (z12) {
                            i68 = Math.max(measuredWidth3, i68);
                        }
                    }
                    i22 = 1073741824;
                    if (mode4 == i22) {
                    }
                    z13 = false;
                    int i732 = ((LinearLayout.LayoutParams) c1221w0).topMargin + ((LinearLayout.LayoutParams) c1221w0).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i732;
                    i69 = View.combineMeasuredStates(i69, view.getMeasuredState());
                    if (!z11) {
                    }
                    int max32 = Math.max(i20, measuredHeight32);
                    if (!z28) {
                    }
                    z15 = false;
                    if (((LinearLayout.LayoutParams) c1221w0).weight <= 0.0f) {
                    }
                    int i762 = max2;
                    i65 = max32;
                    i23 = i762;
                    z28 = z15;
                }
            }
            i66 = i23;
            i64 = i19 + 1;
            c6 = c9;
            iArr3 = iArr2;
            iArr4 = iArr;
            z26 = z11;
            z27 = z12;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c10 = c6;
        boolean z31 = z26;
        boolean z32 = z27;
        int i79 = i65;
        int i80 = i66;
        int i81 = i67;
        if (abstractC1223x0.f13414i > 0 && abstractC1223x0.i(virtualChildCount2)) {
            abstractC1223x0.f13414i += abstractC1223x0.f13418o;
        }
        int i82 = iArr5[1];
        if (i82 == -1 && iArr5[0] == -1 && iArr5[c10] == -1 && iArr5[3] == -1) {
            max = i79;
        } else {
            max = Math.max(i79, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c10]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i82, iArr5[c10]))));
        }
        if (z32 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC1223x0.f13414i = 0;
            for (int i83 = 0; i83 < virtualChildCount2; i83++) {
                View childAt7 = abstractC1223x0.getChildAt(i83);
                if (childAt7 == null) {
                    abstractC1223x0.f13414i = abstractC1223x0.f13414i;
                } else if (childAt7.getVisibility() != 8) {
                    C1221w0 c1221w07 = (C1221w0) childAt7.getLayoutParams();
                    if (z8) {
                        abstractC1223x0.f13414i = ((LinearLayout.LayoutParams) c1221w07).leftMargin + i68 + ((LinearLayout.LayoutParams) c1221w07).rightMargin + abstractC1223x0.f13414i;
                    } else {
                        int i84 = abstractC1223x0.f13414i;
                        abstractC1223x0.f13414i = Math.max(i84, i84 + i68 + ((LinearLayout.LayoutParams) c1221w07).leftMargin + ((LinearLayout.LayoutParams) c1221w07).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC1223x0.getPaddingRight() + abstractC1223x0.getPaddingLeft() + abstractC1223x0.f13414i;
        abstractC1223x0.f13414i = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC1223x0.getSuggestedMinimumWidth()), i63, 0);
        int i85 = (resolveSizeAndState2 & 16777215) - abstractC1223x0.f13414i;
        if (!z30 && (i85 == 0 || f12 <= 0.0f)) {
            i12 = Math.max(i80, i81);
            if (z32 && mode3 != 1073741824) {
                for (int i86 = 0; i86 < virtualChildCount2; i86++) {
                    View childAt8 = abstractC1223x0.getChildAt(i86);
                    if (childAt8 != null && childAt8.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1221w0) childAt8.getLayoutParams())).weight > 0.0f) {
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(i68, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt8.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i9 = resolveSizeAndState2;
            i10 = -16777216;
            i11 = 0;
        } else {
            float f14 = abstractC1223x0.j;
            if (f14 > 0.0f) {
                f12 = f14;
            }
            iArr5[3] = -1;
            iArr5[c10] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c10] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            abstractC1223x0.f13414i = 0;
            max = -1;
            int i87 = 0;
            while (i87 < virtualChildCount2) {
                View childAt9 = abstractC1223x0.getChildAt(i87);
                if (childAt9 == null || childAt9.getVisibility() == 8) {
                    i13 = resolveSizeAndState2;
                } else {
                    C1221w0 c1221w08 = (C1221w0) childAt9.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) c1221w08).weight;
                    if (f15 > 0.0f) {
                        int i88 = (int) ((i85 * f15) / f12);
                        f12 -= f15;
                        i85 -= i88;
                        i13 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, abstractC1223x0.getPaddingBottom() + abstractC1223x0.getPaddingTop() + ((LinearLayout.LayoutParams) c1221w08).topMargin + ((LinearLayout.LayoutParams) c1221w08).bottomMargin, ((LinearLayout.LayoutParams) c1221w08).height);
                        if (((LinearLayout.LayoutParams) c1221w08).width == 0) {
                            i15 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i88 <= 0) {
                                    i88 = 0;
                                }
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(i88, 1073741824), childMeasureSpec2);
                                i69 = View.combineMeasuredStates(i69, childAt9.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i15 = 1073741824;
                        }
                        int measuredWidth4 = childAt9.getMeasuredWidth() + i88;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i15), childMeasureSpec2);
                        i69 = View.combineMeasuredStates(i69, childAt9.getMeasuredState() & (-16777216));
                    } else {
                        i13 = resolveSizeAndState2;
                    }
                    if (z8) {
                        abstractC1223x0.f13414i = childAt9.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1221w08).leftMargin + ((LinearLayout.LayoutParams) c1221w08).rightMargin + abstractC1223x0.f13414i;
                    } else {
                        int i89 = abstractC1223x0.f13414i;
                        abstractC1223x0.f13414i = Math.max(i89, childAt9.getMeasuredWidth() + i89 + ((LinearLayout.LayoutParams) c1221w08).leftMargin + ((LinearLayout.LayoutParams) c1221w08).rightMargin);
                    }
                    if (mode4 != 1073741824 && ((LinearLayout.LayoutParams) c1221w08).height == -1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    int i90 = ((LinearLayout.LayoutParams) c1221w08).topMargin + ((LinearLayout.LayoutParams) c1221w08).bottomMargin;
                    int measuredHeight4 = childAt9.getMeasuredHeight() + i90;
                    max = Math.max(max, measuredHeight4);
                    if (!z9) {
                        i90 = measuredHeight4;
                    }
                    int max4 = Math.max(i80, i90);
                    if (z28) {
                        i14 = -1;
                        if (((LinearLayout.LayoutParams) c1221w08).height == -1) {
                            z10 = true;
                            if (!z31 && (baseline = childAt9.getBaseline()) != i14) {
                                int i91 = ((LinearLayout.LayoutParams) c1221w08).gravity;
                                if (i91 < 0) {
                                    i91 = abstractC1223x0.f13413h;
                                }
                                int i92 = (((i91 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i92] = Math.max(iArr5[i92], baseline);
                                iArr6[i92] = Math.max(iArr6[i92], measuredHeight4 - baseline);
                            }
                            z28 = z10;
                            i80 = max4;
                        }
                    } else {
                        i14 = -1;
                    }
                    z10 = false;
                    if (!z31) {
                    }
                    z28 = z10;
                    i80 = max4;
                }
                i87++;
                resolveSizeAndState2 = i13;
            }
            i9 = resolveSizeAndState2;
            i10 = -16777216;
            abstractC1223x0.f13414i = abstractC1223x0.getPaddingRight() + abstractC1223x0.getPaddingLeft() + abstractC1223x0.f13414i;
            int i93 = iArr5[1];
            if (i93 == -1 && iArr5[0] == -1 && iArr5[c10] == -1 && iArr5[3] == -1) {
                i11 = 0;
            } else {
                i11 = 0;
                max = Math.max(max, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c10]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i93, iArr5[c10]))));
            }
            i12 = i80;
        }
        if (!z28 && mode4 != 1073741824) {
            max = i12;
        }
        abstractC1223x0.setMeasuredDimension(i9 | (i69 & i10), View.resolveSizeAndState(Math.max(abstractC1223x0.getPaddingBottom() + abstractC1223x0.getPaddingTop() + max, abstractC1223x0.getSuggestedMinimumHeight()), i8, i69 << 16));
        if (z29) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC1223x0.getMeasuredHeight(), 1073741824);
            int i94 = i11;
            while (i94 < virtualChildCount2) {
                View childAt10 = abstractC1223x0.getChildAt(i94);
                if (childAt10.getVisibility() != 8) {
                    C1221w0 c1221w09 = (C1221w0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c1221w09).height == -1) {
                        int i95 = ((LinearLayout.LayoutParams) c1221w09).width;
                        ((LinearLayout.LayoutParams) c1221w09).width = childAt10.getMeasuredWidth();
                        abstractC1223x0.measureChildWithMargins(childAt10, i63, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c1221w09).width = i95;
                    }
                }
                i94++;
                abstractC1223x0 = this;
                i63 = i4;
            }
        }
    }

    public void setBaselineAligned(boolean z8) {
        this.f13409d = z8;
    }

    public void setBaselineAlignedChildIndex(int i4) {
        if (i4 >= 0 && i4 < getChildCount()) {
            this.f13410e = i4;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f13417n) {
            return;
        }
        this.f13417n = drawable;
        boolean z8 = false;
        if (drawable != null) {
            this.f13418o = drawable.getIntrinsicWidth();
            this.f13419p = drawable.getIntrinsicHeight();
        } else {
            this.f13418o = 0;
            this.f13419p = 0;
        }
        if (drawable == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        requestLayout();
    }

    public void setDividerPadding(int i4) {
        this.f13421r = i4;
    }

    public void setGravity(int i4) {
        if (this.f13413h != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f13413h = i4;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i4) {
        int i8 = i4 & 8388615;
        int i9 = this.f13413h;
        if ((8388615 & i9) != i8) {
            this.f13413h = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z8) {
        this.k = z8;
    }

    public void setOrientation(int i4) {
        if (this.f13412g != i4) {
            this.f13412g = i4;
            requestLayout();
        }
    }

    public void setShowDividers(int i4) {
        if (i4 != this.f13420q) {
            requestLayout();
        }
        this.f13420q = i4;
    }

    public void setVerticalGravity(int i4) {
        int i8 = i4 & 112;
        int i9 = this.f13413h;
        if ((i9 & 112) != i8) {
            this.f13413h = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f8) {
        this.j = Math.max(0.0f, f8);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
