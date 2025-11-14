package A5;

import O7.C0235h;
import P.H;
import P.O;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import e5.AbstractC0645a;
import f5.AbstractC0710a;
import h4.AbstractC0832f;
import h5.C0833a;
import h5.C0834b;
import h5.C0835c;
import i.AbstractC0862a;
import java.util.WeakHashMap;
import n.z;

/* loaded from: classes.dex */
public abstract class f extends FrameLayout implements z {

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f307J = {R.attr.state_checked};
    public static final G5.e K;

    /* renamed from: L, reason: collision with root package name */
    public static final e f308L;

    /* renamed from: A, reason: collision with root package name */
    public ValueAnimator f309A;

    /* renamed from: B, reason: collision with root package name */
    public G5.e f310B;

    /* renamed from: C, reason: collision with root package name */
    public float f311C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f312D;

    /* renamed from: E, reason: collision with root package name */
    public int f313E;

    /* renamed from: F, reason: collision with root package name */
    public int f314F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f315G;

    /* renamed from: H, reason: collision with root package name */
    public int f316H;

    /* renamed from: I, reason: collision with root package name */
    public C0833a f317I;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f319e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f320f;

    /* renamed from: g, reason: collision with root package name */
    public int f321g;

    /* renamed from: h, reason: collision with root package name */
    public int f322h;

    /* renamed from: i, reason: collision with root package name */
    public int f323i;
    public float j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public float f324l;

    /* renamed from: m, reason: collision with root package name */
    public int f325m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f326n;

    /* renamed from: o, reason: collision with root package name */
    public final FrameLayout f327o;

    /* renamed from: p, reason: collision with root package name */
    public final View f328p;

    /* renamed from: q, reason: collision with root package name */
    public final ImageView f329q;

    /* renamed from: r, reason: collision with root package name */
    public final ViewGroup f330r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f331s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f332t;

    /* renamed from: u, reason: collision with root package name */
    public int f333u;

    /* renamed from: v, reason: collision with root package name */
    public int f334v;

    /* renamed from: w, reason: collision with root package name */
    public n.o f335w;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f336x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f337y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f338z;

    /* JADX WARN: Type inference failed for: r0v3, types: [G5.e, A5.e] */
    static {
        int i4 = 1;
        K = new G5.e(i4);
        f308L = new G5.e(i4);
    }

    public f(Context context) {
        super(context);
        this.f318d = false;
        this.f333u = -1;
        this.f334v = 0;
        this.f310B = K;
        this.f311C = 0.0f;
        this.f312D = false;
        this.f313E = 0;
        this.f314F = 0;
        this.f315G = false;
        this.f316H = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f327o = (FrameLayout) findViewById(com.buzbuz.smartautoclicker.R.id.navigation_bar_item_icon_container);
        this.f328p = findViewById(com.buzbuz.smartautoclicker.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.buzbuz.smartautoclicker.R.id.navigation_bar_item_icon_view);
        this.f329q = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.buzbuz.smartautoclicker.R.id.navigation_bar_item_labels_group);
        this.f330r = viewGroup;
        TextView textView = (TextView) findViewById(com.buzbuz.smartautoclicker.R.id.navigation_bar_item_small_label_view);
        this.f331s = textView;
        TextView textView2 = (TextView) findViewById(com.buzbuz.smartautoclicker.R.id.navigation_bar_item_large_label_view);
        this.f332t = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f321g = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f322h = viewGroup.getPaddingBottom();
        this.f323i = getResources().getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = O.f4214a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        b(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new b(0, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(TextView textView, int i4) {
        int i8;
        textView.setTextAppearance(i4);
        Context context = textView.getContext();
        if (i4 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, AbstractC0645a.f10627Q);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(0, typedValue);
            obtainStyledAttributes.recycle();
            if (value) {
                if (typedValue.getComplexUnit() == 2) {
                    i8 = Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
                } else {
                    i8 = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                }
                if (i8 == 0) {
                    textView.setTextSize(0, i8);
                    return;
                }
                return;
            }
        }
        i8 = 0;
        if (i8 == 0) {
        }
    }

    public static void g(View view, float f8, float f9, int i4) {
        view.setScaleX(f8);
        view.setScaleY(f9);
        view.setVisibility(i4);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f327o;
        if (frameLayout != null) {
            return frameLayout;
        }
        return this.f329q;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i4 = 0;
        for (int i8 = 0; i8 < indexOfChild; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if ((childAt instanceof f) && childAt.getVisibility() == 0) {
                i4++;
            }
        }
        return i4;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        C0833a c0833a = this.f317I;
        if (c0833a == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = c0833a.getMinimumWidth() - this.f317I.f11376h.f11412b.f11410z.intValue();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f329q.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(View view, int i4, int i8) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i4;
        layoutParams.bottomMargin = i4;
        layoutParams.gravity = i8;
        view.setLayoutParams(layoutParams);
    }

    public static void k(View view, int i4) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i4);
    }

    @Override // n.z
    public final void a(n.o oVar) {
        CharSequence charSequence;
        int i4;
        this.f335w = oVar;
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setIcon(oVar.getIcon());
        setTitle(oVar.f12673e);
        setId(oVar.f12669a);
        if (!TextUtils.isEmpty(oVar.f12683q)) {
            setContentDescription(oVar.f12683q);
        }
        if (!TextUtils.isEmpty(oVar.f12684r)) {
            charSequence = oVar.f12684r;
        } else {
            charSequence = oVar.f12673e;
        }
        AbstractC0862a.w(this, charSequence);
        if (oVar.isVisible()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        setVisibility(i4);
        this.f318d = true;
    }

    public final void b(float f8, float f9) {
        this.j = f8 - f9;
        this.k = (f9 * 1.0f) / f8;
        this.f324l = (f8 * 1.0f) / f9;
    }

    public final void c() {
        n.o oVar = this.f335w;
        if (oVar != null) {
            setChecked(oVar.isChecked());
        }
    }

    public final void d() {
        Drawable drawable = this.f320f;
        ColorStateList colorStateList = this.f319e;
        FrameLayout frameLayout = this.f327o;
        RippleDrawable rippleDrawable = null;
        boolean z8 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f312D && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(E5.a.b(this.f319e), null, activeIndicatorDrawable);
                z8 = false;
            } else if (drawable == null) {
                ColorStateList colorStateList2 = this.f319e;
                int[] iArr = E5.a.f1248d;
                int a3 = E5.a.a(colorStateList2, E5.a.f1247c);
                int[] iArr2 = E5.a.f1246b;
                drawable = new RippleDrawable(new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{a3, E5.a.a(colorStateList2, iArr2), E5.a.a(colorStateList2, E5.a.f1245a)}), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable);
        }
        WeakHashMap weakHashMap = O.f4214a;
        setBackground(drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f327o;
        if (frameLayout != null && this.f312D) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f8, float f9) {
        float f10;
        float f11;
        View view = this.f328p;
        if (view != null) {
            G5.e eVar = this.f310B;
            eVar.getClass();
            view.setScaleX(AbstractC0710a.a(0.4f, 1.0f, f8));
            view.setScaleY(eVar.a(f8, f9));
            if (f9 == 0.0f) {
                f10 = 0.8f;
            } else {
                f10 = 0.0f;
            }
            if (f9 == 0.0f) {
                f11 = 1.0f;
            } else {
                f11 = 0.2f;
            }
            view.setAlpha(AbstractC0710a.b(0.0f, 1.0f, f10, f11, f8));
        }
        this.f311C = f8;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f328p;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C0833a getBadge() {
        return this.f317I;
    }

    public int getItemBackgroundResId() {
        return com.buzbuz.smartautoclicker.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // n.z
    public n.o getItemData() {
        return this.f335w;
    }

    public int getItemDefaultMarginResId() {
        return com.buzbuz.smartautoclicker.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f333u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        int i4;
        ViewGroup viewGroup = this.f330r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        int suggestedIconHeight = getSuggestedIconHeight();
        if (viewGroup.getVisibility() == 0) {
            i4 = this.f323i;
        } else {
            i4 = 0;
        }
        return viewGroup.getMeasuredHeight() + suggestedIconHeight + i4 + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f330r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(View view) {
        if (this.f317I != null) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C0833a c0833a = this.f317I;
                if (c0833a != null) {
                    if (c0833a.c() != null) {
                        c0833a.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(c0833a);
                    }
                }
            }
            this.f317I = null;
        }
    }

    public final void j(int i4) {
        int i8;
        View view = this.f328p;
        if (view != null && i4 > 0) {
            int min = Math.min(this.f313E, i4 - (this.f316H * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.f315G && this.f325m == 2) {
                i8 = min;
            } else {
                i8 = this.f314F;
            }
            layoutParams.height = i8;
            layoutParams.width = min;
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        n.o oVar = this.f335w;
        if (oVar != null && oVar.isCheckable() && this.f335w.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f307J);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z8;
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0833a c0833a = this.f317I;
        if (c0833a != null && c0833a.isVisible()) {
            n.o oVar = this.f335w;
            CharSequence charSequence = oVar.f12673e;
            if (!TextUtils.isEmpty(oVar.f12683q)) {
                charSequence = this.f335w.f12683q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append(", ");
            C0833a c0833a2 = this.f317I;
            C0835c c0835c = c0833a2.f11376h;
            Object obj = null;
            if (c0833a2.isVisible()) {
                C0834b c0834b = c0835c.f11412b;
                if (c0834b.f11397m != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    obj = c0834b.f11402r;
                    if (obj == null) {
                        obj = c0833a2.f11376h.f11412b.f11397m;
                    }
                } else if (c0833a2.f()) {
                    if (c0834b.f11404t != 0 && (context = (Context) c0833a2.f11372d.get()) != null) {
                        if (c0833a2.k != -2) {
                            int d2 = c0833a2.d();
                            int i4 = c0833a2.k;
                            if (d2 > i4) {
                                obj = context.getString(c0834b.f11405u, Integer.valueOf(i4));
                            }
                        }
                        obj = context.getResources().getQuantityString(c0834b.f11404t, c0833a2.d(), Integer.valueOf(c0833a2.d()));
                    }
                } else {
                    obj = c0834b.f11403s;
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0235h.a(isSelected(), 0, 1, getItemVisiblePosition(), 1).f4138d);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) Q.f.f4695e.f4704a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.buzbuz.smartautoclicker.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i8, int i9, int i10) {
        super.onSizeChanged(i4, i8, i9, i10);
        post(new c(this, i4, 0));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f328p;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    public void setActiveIndicatorEnabled(boolean z8) {
        int i4;
        this.f312D = z8;
        d();
        View view = this.f328p;
        if (view != null) {
            if (z8) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            view.setVisibility(i4);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i4) {
        this.f314F = i4;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i4) {
        if (this.f323i != i4) {
            this.f323i = i4;
            c();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i4) {
        this.f316H = i4;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z8) {
        this.f315G = z8;
    }

    public void setActiveIndicatorWidth(int i4) {
        this.f313E = i4;
        j(getWidth());
    }

    public void setBadge(C0833a c0833a) {
        C0833a c0833a2 = this.f317I;
        if (c0833a2 != c0833a) {
            ImageView imageView = this.f329q;
            if (c0833a2 != null && imageView != null) {
                Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
                i(imageView);
            }
            this.f317I = c0833a;
            if (imageView != null && c0833a != null) {
                setClipChildren(false);
                setClipToPadding(false);
                C0833a c0833a3 = this.f317I;
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                c0833a3.setBounds(rect);
                c0833a3.h(imageView, null);
                if (c0833a3.c() != null) {
                    c0833a3.c().setForeground(c0833a3);
                } else {
                    imageView.getOverlay().add(c0833a3);
                }
            }
        }
    }

    public void setCheckable(boolean z8) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setChecked(boolean z8) {
        float f8;
        int i4;
        TextView textView = this.f332t;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.f331s;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        if (z8) {
            f8 = 1.0f;
        } else {
            f8 = 0.0f;
        }
        if (this.f312D && this.f318d) {
            WeakHashMap weakHashMap = O.f4214a;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.f309A;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f309A = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f311C, f8);
                this.f309A = ofFloat;
                ofFloat.addUpdateListener(new d(this, f8));
                this.f309A.setInterpolator(AbstractC0832f.y(getContext(), com.buzbuz.smartautoclicker.R.attr.motionEasingEmphasizedInterpolator, AbstractC0710a.f10767b));
                this.f309A.setDuration(AbstractC0832f.x(getContext(), com.buzbuz.smartautoclicker.R.attr.motionDurationLong2, getResources().getInteger(com.buzbuz.smartautoclicker.R.integer.material_motion_duration_long_1)));
                this.f309A.start();
                i4 = this.f325m;
                ViewGroup viewGroup = this.f330r;
                if (i4 == -1) {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                h(getIconOrContainer(), this.f321g, 17);
                                textView.setVisibility(8);
                                textView2.setVisibility(8);
                            }
                        } else {
                            k(viewGroup, this.f322h);
                            if (z8) {
                                h(getIconOrContainer(), (int) (this.f321g + this.j), 49);
                                g(textView, 1.0f, 1.0f, 0);
                                float f9 = this.k;
                                g(textView2, f9, f9, 4);
                            } else {
                                h(getIconOrContainer(), this.f321g, 49);
                                float f10 = this.f324l;
                                g(textView, f10, f10, 4);
                                g(textView2, 1.0f, 1.0f, 0);
                            }
                        }
                    } else {
                        if (z8) {
                            h(getIconOrContainer(), this.f321g, 49);
                            k(viewGroup, this.f322h);
                            textView.setVisibility(0);
                        } else {
                            h(getIconOrContainer(), this.f321g, 17);
                            k(viewGroup, 0);
                            textView.setVisibility(4);
                        }
                        textView2.setVisibility(4);
                    }
                } else if (this.f326n) {
                    if (z8) {
                        h(getIconOrContainer(), this.f321g, 49);
                        k(viewGroup, this.f322h);
                        textView.setVisibility(0);
                    } else {
                        h(getIconOrContainer(), this.f321g, 17);
                        k(viewGroup, 0);
                        textView.setVisibility(4);
                    }
                    textView2.setVisibility(4);
                } else {
                    k(viewGroup, this.f322h);
                    if (z8) {
                        h(getIconOrContainer(), (int) (this.f321g + this.j), 49);
                        g(textView, 1.0f, 1.0f, 0);
                        float f11 = this.k;
                        g(textView2, f11, f11, 4);
                    } else {
                        h(getIconOrContainer(), this.f321g, 49);
                        float f12 = this.f324l;
                        g(textView, f12, f12, 4);
                        g(textView2, 1.0f, 1.0f, 0);
                    }
                }
                refreshDrawableState();
                setSelected(z8);
            }
        }
        e(f8, f8);
        i4 = this.f325m;
        ViewGroup viewGroup2 = this.f330r;
        if (i4 == -1) {
        }
        refreshDrawableState();
        setSelected(z8);
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        this.f331s.setEnabled(z8);
        this.f332t.setEnabled(z8);
        this.f329q.setEnabled(z8);
        if (z8) {
            H.a(this, PointerIcon.getSystemIcon(getContext(), 1002));
        } else {
            WeakHashMap weakHashMap = O.f4214a;
            H.a(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f337y) {
            return;
        }
        this.f337y = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f338z = drawable;
            ColorStateList colorStateList = this.f336x;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f329q.setImageDrawable(drawable);
    }

    public void setIconSize(int i4) {
        ImageView imageView = this.f329q;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i4;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f336x = colorStateList;
        if (this.f335w != null && (drawable = this.f338z) != null) {
            drawable.setTintList(colorStateList);
            this.f338z.invalidateSelf();
        }
    }

    public void setItemBackground(int i4) {
        setItemBackground(i4 == 0 ? null : getContext().getDrawable(i4));
    }

    public void setItemPaddingBottom(int i4) {
        if (this.f322h != i4) {
            this.f322h = i4;
            c();
        }
    }

    public void setItemPaddingTop(int i4) {
        if (this.f321g != i4) {
            this.f321g = i4;
            c();
        }
    }

    public void setItemPosition(int i4) {
        this.f333u = i4;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f319e = colorStateList;
        d();
    }

    public void setLabelVisibilityMode(int i4) {
        if (this.f325m != i4) {
            this.f325m = i4;
            if (this.f315G && i4 == 2) {
                this.f310B = f308L;
            } else {
                this.f310B = K;
            }
            j(getWidth());
            c();
        }
    }

    public void setShifting(boolean z8) {
        if (this.f326n != z8) {
            this.f326n = z8;
            c();
        }
    }

    public void setTextAppearanceActive(int i4) {
        this.f334v = i4;
        TextView textView = this.f332t;
        f(textView, i4);
        b(this.f331s.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z8) {
        setTextAppearanceActive(this.f334v);
        TextView textView = this.f332t;
        textView.setTypeface(textView.getTypeface(), z8 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i4) {
        TextView textView = this.f331s;
        f(textView, i4);
        b(textView.getTextSize(), this.f332t.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f331s.setTextColor(colorStateList);
            this.f332t.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f331s.setText(charSequence);
        this.f332t.setText(charSequence);
        n.o oVar = this.f335w;
        if (oVar == null || TextUtils.isEmpty(oVar.f12683q)) {
            setContentDescription(charSequence);
        }
        n.o oVar2 = this.f335w;
        if (oVar2 != null && !TextUtils.isEmpty(oVar2.f12684r)) {
            charSequence = this.f335w.f12684r;
        }
        AbstractC0862a.w(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f320f = drawable;
        d();
    }
}
