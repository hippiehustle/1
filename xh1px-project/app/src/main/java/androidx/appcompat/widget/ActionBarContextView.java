package androidx.appcompat.widget;

import A5.h;
import C6.h0;
import P.O;
import P.U;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import h.AbstractC0805a;
import h4.g;
import n.InterfaceC1099A;
import n.m;
import o.C1187f;
import o.C1197k;
import o.t1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: d */
    public final X6.c f8343d;

    /* renamed from: e */
    public final Context f8344e;

    /* renamed from: f */
    public ActionMenuView f8345f;

    /* renamed from: g */
    public C1197k f8346g;

    /* renamed from: h */
    public int f8347h;

    /* renamed from: i */
    public U f8348i;
    public boolean j;
    public boolean k;

    /* renamed from: l */
    public CharSequence f8349l;

    /* renamed from: m */
    public CharSequence f8350m;

    /* renamed from: n */
    public View f8351n;

    /* renamed from: o */
    public View f8352o;

    /* renamed from: p */
    public View f8353p;

    /* renamed from: q */
    public LinearLayout f8354q;

    /* renamed from: r */
    public TextView f8355r;

    /* renamed from: s */
    public TextView f8356s;

    /* renamed from: t */
    public final int f8357t;

    /* renamed from: u */
    public final int f8358u;

    /* renamed from: v */
    public boolean f8359v;

    /* renamed from: w */
    public final int f8360w;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        this.f8343d = new X6.c(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f8344e = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f8344e = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0805a.f11278d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = g.k(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.f8357t = obtainStyledAttributes.getResourceId(5, 0);
        this.f8358u = obtainStyledAttributes.getResourceId(4, 0);
        this.f8347h = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f8360w = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i4, int i8) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i8);
        return Math.max(0, i4 - view.getMeasuredWidth());
    }

    public static int g(View view, int i4, int i8, int i9, boolean z8) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = ((i9 - measuredHeight) / 2) + i8;
        if (z8) {
            view.layout(i4 - measuredWidth, i10, i4, measuredHeight + i10);
        } else {
            view.layout(i4, i10, i4 + measuredWidth, measuredHeight + i10);
        }
        if (z8) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(h0 h0Var) {
        View view = this.f8351n;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f8360w, (ViewGroup) this, false);
            this.f8351n = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f8351n);
        }
        View findViewById = this.f8351n.findViewById(R.id.action_mode_close_button);
        this.f8352o = findViewById;
        findViewById.setOnClickListener(new h(4, h0Var));
        m e9 = h0Var.e();
        C1197k c1197k = this.f8346g;
        if (c1197k != null) {
            c1197k.c();
            C1187f c1187f = c1197k.f13289x;
            if (c1187f != null && c1187f.b()) {
                c1187f.f12712i.dismiss();
            }
        }
        C1197k c1197k2 = new C1197k(getContext());
        this.f8346g = c1197k2;
        c1197k2.f13281p = true;
        c1197k2.f13282q = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        e9.b(this.f8346g, this.f8344e);
        C1197k c1197k3 = this.f8346g;
        InterfaceC1099A interfaceC1099A = c1197k3.k;
        if (interfaceC1099A == null) {
            InterfaceC1099A interfaceC1099A2 = (InterfaceC1099A) c1197k3.f13274g.inflate(c1197k3.f13276i, (ViewGroup) this, false);
            c1197k3.k = interfaceC1099A2;
            interfaceC1099A2.b(c1197k3.f13273f);
            c1197k3.g(true);
        }
        InterfaceC1099A interfaceC1099A3 = c1197k3.k;
        if (interfaceC1099A != interfaceC1099A3) {
            ((ActionMenuView) interfaceC1099A3).setPresenter(c1197k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC1099A3;
        this.f8345f = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f8345f, layoutParams);
    }

    public final void d() {
        int i4;
        if (this.f8354q == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f8354q = linearLayout;
            this.f8355r = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f8356s = (TextView) this.f8354q.findViewById(R.id.action_bar_subtitle);
            int i8 = this.f8357t;
            if (i8 != 0) {
                this.f8355r.setTextAppearance(getContext(), i8);
            }
            int i9 = this.f8358u;
            if (i9 != 0) {
                this.f8356s.setTextAppearance(getContext(), i9);
            }
        }
        this.f8355r.setText(this.f8349l);
        this.f8356s.setText(this.f8350m);
        boolean isEmpty = TextUtils.isEmpty(this.f8349l);
        boolean isEmpty2 = TextUtils.isEmpty(this.f8350m);
        TextView textView = this.f8356s;
        int i10 = 8;
        if (!isEmpty2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView.setVisibility(i4);
        LinearLayout linearLayout2 = this.f8354q;
        if (!isEmpty || !isEmpty2) {
            i10 = 0;
        }
        linearLayout2.setVisibility(i10);
        if (this.f8354q.getParent() == null) {
            addView(this.f8354q);
        }
    }

    public final void e() {
        removeAllViews();
        this.f8353p = null;
        this.f8345f = null;
        this.f8346g = null;
        View view = this.f8352o;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.f8348i != null) {
            return this.f8343d.f6993b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f8347h;
    }

    public CharSequence getSubtitle() {
        return this.f8350m;
    }

    public CharSequence getTitle() {
        return this.f8349l;
    }

    @Override // android.view.View
    /* renamed from: h */
    public final void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            U u8 = this.f8348i;
            if (u8 != null) {
                u8.b();
            }
            super.setVisibility(i4);
        }
    }

    public final U i(int i4, long j) {
        U u8 = this.f8348i;
        if (u8 != null) {
            u8.b();
        }
        X6.c cVar = this.f8343d;
        if (i4 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            U a3 = O.a(this);
            a3.a(1.0f);
            a3.c(j);
            ((ActionBarContextView) cVar.f6994c).f8348i = a3;
            cVar.f6993b = i4;
            a3.d(cVar);
            return a3;
        }
        U a4 = O.a(this);
        a4.a(0.0f);
        a4.c(j);
        ((ActionBarContextView) cVar.f6994c).f8348i = a4;
        cVar.f6993b = i4;
        a4.d(cVar);
        return a4;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i4;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0805a.f11275a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C1197k c1197k = this.f8346g;
        if (c1197k != null) {
            Configuration configuration2 = c1197k.f13272e.getResources().getConfiguration();
            int i8 = configuration2.screenWidthDp;
            int i9 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i8 <= 600 && ((i8 <= 960 || i9 <= 720) && (i8 <= 720 || i9 <= 960))) {
                if (i8 < 500 && ((i8 <= 640 || i9 <= 480) && (i8 <= 480 || i9 <= 640))) {
                    if (i8 >= 360) {
                        i4 = 3;
                    } else {
                        i4 = 2;
                    }
                } else {
                    i4 = 4;
                }
            } else {
                i4 = 5;
            }
            c1197k.f13285t = i4;
            m mVar = c1197k.f13273f;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1197k c1197k = this.f8346g;
        if (c1197k != null) {
            c1197k.c();
            C1187f c1187f = this.f8346g.f13289x;
            if (c1187f != null && c1187f.b()) {
                c1187f.f12712i.dismiss();
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.k = false;
        }
        if (!this.k) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.k = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.k = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        boolean z9;
        int paddingLeft;
        int paddingRight;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10 = t1.f13385a;
        if (getLayoutDirection() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            paddingLeft = (i9 - i4) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        View view = this.f8351n;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8351n.getLayoutParams();
            if (z9) {
                i11 = marginLayoutParams.rightMargin;
            } else {
                i11 = marginLayoutParams.leftMargin;
            }
            if (z9) {
                i12 = marginLayoutParams.leftMargin;
            } else {
                i12 = marginLayoutParams.rightMargin;
            }
            if (z9) {
                i13 = paddingLeft - i11;
            } else {
                i13 = paddingLeft + i11;
            }
            int g8 = g(this.f8351n, i13, paddingTop, paddingTop2, z9) + i13;
            if (z9) {
                i14 = g8 - i12;
            } else {
                i14 = g8 + i12;
            }
            paddingLeft = i14;
        }
        LinearLayout linearLayout = this.f8354q;
        if (linearLayout != null && this.f8353p == null && linearLayout.getVisibility() != 8) {
            paddingLeft += g(this.f8354q, paddingLeft, paddingTop, paddingTop2, z9);
        }
        View view2 = this.f8353p;
        if (view2 != null) {
            g(view2, paddingLeft, paddingTop, paddingTop2, z9);
        }
        if (z9) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i9 - i4) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f8345f;
        if (actionMenuView != null) {
            g(actionMenuView, paddingRight, paddingTop, paddingTop2, !z9);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i8) {
        int i9;
        boolean z8;
        int i10;
        int i11 = 1073741824;
        if (View.MeasureSpec.getMode(i4) == 1073741824) {
            if (View.MeasureSpec.getMode(i8) != 0) {
                int size = View.MeasureSpec.getSize(i4);
                int i12 = this.f8347h;
                if (i12 <= 0) {
                    i12 = View.MeasureSpec.getSize(i8);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i13 = i12 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
                View view = this.f8351n;
                if (view != null) {
                    int f8 = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8351n.getLayoutParams();
                    paddingLeft = f8 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f8345f;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.f8345f, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.f8354q;
                if (linearLayout != null && this.f8353p == null) {
                    if (this.f8359v) {
                        this.f8354q.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f8354q.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f8354q;
                        if (z8) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        linearLayout2.setVisibility(i10);
                    } else {
                        paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.f8353p;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i14 = layoutParams.width;
                    if (i14 != -2) {
                        i9 = 1073741824;
                    } else {
                        i9 = Integer.MIN_VALUE;
                    }
                    if (i14 >= 0) {
                        paddingLeft = Math.min(i14, paddingLeft);
                    }
                    int i15 = layoutParams.height;
                    if (i15 == -2) {
                        i11 = Integer.MIN_VALUE;
                    }
                    if (i15 >= 0) {
                        i13 = Math.min(i15, i13);
                    }
                    this.f8353p.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(i13, i11));
                }
                if (this.f8347h <= 0) {
                    int childCount = getChildCount();
                    int i16 = 0;
                    for (int i17 = 0; i17 < childCount; i17++) {
                        int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i16) {
                            i16 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i16);
                    return;
                }
                setMeasuredDimension(size, i12);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.j = false;
        }
        if (!this.j) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.j = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.j = false;
        return true;
    }

    public void setContentHeight(int i4) {
        this.f8347h = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f8353p;
        if (view2 != null) {
            removeView(view2);
        }
        this.f8353p = view;
        if (view != null && (linearLayout = this.f8354q) != null) {
            removeView(linearLayout);
            this.f8354q = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8350m = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f8349l = charSequence;
        d();
        O.n(this, charSequence);
    }

    public void setTitleOptional(boolean z8) {
        if (z8 != this.f8359v) {
            requestLayout();
        }
        this.f8359v = z8;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
