package I5;

import D4.B;
import G5.h;
import P.O;
import a.AbstractC0405a;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.slider.Slider;
import e5.AbstractC0645a;
import f5.AbstractC0710a;
import h4.AbstractC0832f;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import n1.AbstractC1149a;
import s3.AbstractC1492c;
import t2.C1562a;
import x.AbstractC1769h;
import x5.m;
import x5.p;

/* loaded from: classes.dex */
public abstract class e extends View {

    /* renamed from: A, reason: collision with root package name */
    public final int f2111A;

    /* renamed from: B, reason: collision with root package name */
    public final int f2112B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2113C;

    /* renamed from: D, reason: collision with root package name */
    public int f2114D;

    /* renamed from: E, reason: collision with root package name */
    public int f2115E;

    /* renamed from: F, reason: collision with root package name */
    public int f2116F;

    /* renamed from: G, reason: collision with root package name */
    public int f2117G;

    /* renamed from: H, reason: collision with root package name */
    public int f2118H;

    /* renamed from: I, reason: collision with root package name */
    public int f2119I;

    /* renamed from: J, reason: collision with root package name */
    public int f2120J;
    public int K;

    /* renamed from: L, reason: collision with root package name */
    public int f2121L;

    /* renamed from: M, reason: collision with root package name */
    public int f2122M;

    /* renamed from: N, reason: collision with root package name */
    public int f2123N;

    /* renamed from: O, reason: collision with root package name */
    public int f2124O;

    /* renamed from: P, reason: collision with root package name */
    public final int f2125P;

    /* renamed from: Q, reason: collision with root package name */
    public float f2126Q;

    /* renamed from: R, reason: collision with root package name */
    public MotionEvent f2127R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f2128S;

    /* renamed from: T, reason: collision with root package name */
    public float f2129T;

    /* renamed from: U, reason: collision with root package name */
    public float f2130U;

    /* renamed from: V, reason: collision with root package name */
    public ArrayList f2131V;

    /* renamed from: W, reason: collision with root package name */
    public int f2132W;

    /* renamed from: a0, reason: collision with root package name */
    public int f2133a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f2134b0;

    /* renamed from: c0, reason: collision with root package name */
    public float[] f2135c0;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f2136d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f2137d0;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f2138e;

    /* renamed from: e0, reason: collision with root package name */
    public int f2139e0;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f2140f;

    /* renamed from: f0, reason: collision with root package name */
    public int f2141f0;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f2142g;

    /* renamed from: g0, reason: collision with root package name */
    public int f2143g0;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f2144h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f2145h0;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f2146i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f2147i0;
    public final Paint j;
    public ColorStateList j0;
    public final c k;

    /* renamed from: k0, reason: collision with root package name */
    public ColorStateList f2148k0;

    /* renamed from: l, reason: collision with root package name */
    public final AccessibilityManager f2149l;

    /* renamed from: l0, reason: collision with root package name */
    public ColorStateList f2150l0;

    /* renamed from: m, reason: collision with root package name */
    public A5.c f2151m;

    /* renamed from: m0, reason: collision with root package name */
    public ColorStateList f2152m0;

    /* renamed from: n, reason: collision with root package name */
    public final int f2153n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f2154n0;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f2155o;

    /* renamed from: o0, reason: collision with root package name */
    public final Path f2156o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2157p;

    /* renamed from: p0, reason: collision with root package name */
    public final RectF f2158p0;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2159q;

    /* renamed from: q0, reason: collision with root package name */
    public final RectF f2160q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2161r;

    /* renamed from: r0, reason: collision with root package name */
    public final h f2162r0;

    /* renamed from: s, reason: collision with root package name */
    public ValueAnimator f2163s;

    /* renamed from: s0, reason: collision with root package name */
    public Drawable f2164s0;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f2165t;

    /* renamed from: t0, reason: collision with root package name */
    public List f2166t0;

    /* renamed from: u, reason: collision with root package name */
    public final int f2167u;

    /* renamed from: u0, reason: collision with root package name */
    public float f2168u0;

    /* renamed from: v, reason: collision with root package name */
    public final int f2169v;

    /* renamed from: v0, reason: collision with root package name */
    public int f2170v0;

    /* renamed from: w, reason: collision with root package name */
    public final int f2171w;

    /* renamed from: w0, reason: collision with root package name */
    public final a f2172w0;

    /* renamed from: x, reason: collision with root package name */
    public final int f2173x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2174y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2175z;

    /* JADX WARN: Type inference failed for: r1v5, types: [I5.a] */
    public e(Context context, AttributeSet attributeSet) {
        super(M5.a.a(context, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider), attributeSet, R.attr.sliderStyle);
        int i4;
        int i8;
        this.f2155o = new ArrayList();
        this.f2157p = new ArrayList();
        this.f2159q = new ArrayList();
        this.f2161r = false;
        this.f2121L = -1;
        this.f2122M = -1;
        this.f2128S = false;
        this.f2131V = new ArrayList();
        this.f2132W = -1;
        this.f2133a0 = -1;
        this.f2134b0 = 0.0f;
        this.f2137d0 = true;
        this.f2145h0 = false;
        this.f2156o0 = new Path();
        this.f2158p0 = new RectF();
        this.f2160q0 = new RectF();
        h hVar = new h();
        this.f2162r0 = hVar;
        this.f2166t0 = Collections.EMPTY_LIST;
        this.f2170v0 = 0;
        final Slider slider = (Slider) this;
        this.f2172w0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: I5.a
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Slider.this.w();
            }
        };
        Context context2 = getContext();
        this.f2136d = new Paint();
        this.f2138e = new Paint();
        Paint paint = new Paint(1);
        this.f2140f = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f2142g = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f2144h = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f2146i = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.j = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.f2113C = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f2169v = dimensionPixelOffset;
        this.f2117G = dimensionPixelOffset;
        this.f2171w = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f2173x = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f2174y = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f2175z = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f2111A = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.f2125P = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        p.a(context2, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = AbstractC0645a.f10625O;
        p.b(context2, attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        this.f2153n = obtainStyledAttributes.getResourceId(8, R.style.Widget_MaterialComponents_Tooltip);
        this.f2129T = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f2130U = obtainStyledAttributes.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.f2129T));
        this.f2134b0 = obtainStyledAttributes.getFloat(2, 0.0f);
        this.f2112B = (int) Math.ceil(obtainStyledAttributes.getDimension(9, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        boolean hasValue = obtainStyledAttributes.hasValue(24);
        if (hasValue) {
            i4 = 24;
        } else {
            i4 = 26;
        }
        int i9 = hasValue ? 24 : 25;
        ColorStateList C8 = AbstractC0405a.C(context2, obtainStyledAttributes, i4);
        setTrackInactiveTintList(C8 == null ? AbstractC1492c.o(context2, R.color.material_slider_inactive_track_color) : C8);
        ColorStateList C9 = AbstractC0405a.C(context2, obtainStyledAttributes, i9);
        setTrackActiveTintList(C9 == null ? AbstractC1492c.o(context2, R.color.material_slider_active_track_color) : C9);
        hVar.m(AbstractC0405a.C(context2, obtainStyledAttributes, 10));
        if (obtainStyledAttributes.hasValue(14)) {
            setThumbStrokeColor(AbstractC0405a.C(context2, obtainStyledAttributes, 14));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(15, 0.0f));
        ColorStateList C10 = AbstractC0405a.C(context2, obtainStyledAttributes, 5);
        setHaloTintList(C10 == null ? AbstractC1492c.o(context2, R.color.material_slider_halo_color) : C10);
        this.f2137d0 = obtainStyledAttributes.getBoolean(23, true);
        boolean hasValue2 = obtainStyledAttributes.hasValue(18);
        if (hasValue2) {
            i8 = 18;
        } else {
            i8 = 20;
        }
        int i10 = hasValue2 ? 18 : 19;
        ColorStateList C11 = AbstractC0405a.C(context2, obtainStyledAttributes, i8);
        setTickInactiveTintList(C11 == null ? AbstractC1492c.o(context2, R.color.material_slider_inactive_tick_marks_color) : C11);
        ColorStateList C12 = AbstractC0405a.C(context2, obtainStyledAttributes, i10);
        setTickActiveTintList(C12 == null ? AbstractC1492c.o(context2, R.color.material_slider_active_tick_marks_color) : C12);
        setThumbTrackGapSize(obtainStyledAttributes.getDimensionPixelSize(16, 0));
        setTrackStopIndicatorSize(obtainStyledAttributes.getDimensionPixelSize(29, 0));
        setTrackInsideCornerSize(obtainStyledAttributes.getDimensionPixelSize(28, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(13, 0) * 2;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(11, 0.0f));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(27, 0));
        setTickActiveRadius(obtainStyledAttributes.getDimensionPixelSize(21, this.f2123N / 2));
        setTickInactiveRadius(obtainStyledAttributes.getDimensionPixelSize(22, this.f2123N / 2));
        setLabelBehavior(obtainStyledAttributes.getInt(7, 0));
        if (!obtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        hVar.p();
        this.f2167u = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(slider);
        this.k = cVar;
        O.m(this, cVar);
        this.f2149l = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public final boolean A(float f8) {
        return i(new BigDecimal(Float.toString(f8)).subtract(new BigDecimal(Float.toString(this.f2129T)), MathContext.DECIMAL64).doubleValue());
    }

    public final float B(float f8) {
        return (o(f8) * this.f2143g0) + this.f2117G;
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.f2118H, this.f2119I);
        } else {
            float max = Math.max(this.f2118H, this.f2119I) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    public final int b() {
        int i4 = this.f2114D / 2;
        int i8 = this.f2115E;
        int i9 = 0;
        if (i8 == 1 || i8 == 3) {
            i9 = ((N5.a) this.f2155o.get(0)).getIntrinsicHeight();
        }
        return i4 + i9;
    }

    public final ValueAnimator c(boolean z8) {
        float f8;
        ValueAnimator valueAnimator;
        int x8;
        TimeInterpolator y4;
        float f9 = 1.0f;
        if (z8) {
            f8 = 0.0f;
        } else {
            f8 = 1.0f;
        }
        if (z8) {
            valueAnimator = this.f2165t;
        } else {
            valueAnimator = this.f2163s;
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        if (!z8) {
            f9 = 0.0f;
        }
        int i4 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f8, f9);
        if (z8) {
            x8 = AbstractC0832f.x(getContext(), R.attr.motionDurationMedium4, 83);
            y4 = AbstractC0832f.y(getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0710a.f10770e);
        } else {
            x8 = AbstractC0832f.x(getContext(), R.attr.motionDurationShort3, 117);
            y4 = AbstractC0832f.y(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, AbstractC0710a.f10768c);
        }
        ofFloat.setDuration(x8);
        ofFloat.setInterpolator(y4);
        ofFloat.addUpdateListener(new b(i4, this));
        return ofFloat;
    }

    public final void d(Canvas canvas, int i4, int i8, float f8, Drawable drawable) {
        canvas.save();
        canvas.translate((this.f2117G + ((int) (o(f8) * i4))) - (drawable.getBounds().width() / 2.0f), i8 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.k.m(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2136d.setColor(h(this.f2154n0));
        this.f2138e.setColor(h(this.f2152m0));
        this.f2144h.setColor(h(this.f2150l0));
        this.f2146i.setColor(h(this.f2148k0));
        this.j.setColor(h(this.f2152m0));
        Iterator it = this.f2155o.iterator();
        while (it.hasNext()) {
            N5.a aVar = (N5.a) it.next();
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        h hVar = this.f2162r0;
        if (hVar.isStateful()) {
            hVar.setState(getDrawableState());
        }
        int h8 = h(this.j0);
        Paint paint = this.f2142g;
        paint.setColor(h8);
        paint.setAlpha(63);
    }

    public final void e() {
        if (!this.f2161r) {
            this.f2161r = true;
            ValueAnimator c6 = c(true);
            this.f2163s = c6;
            this.f2165t = null;
            c6.start();
        }
        ArrayList arrayList = this.f2155o;
        Iterator it = arrayList.iterator();
        for (int i4 = 0; i4 < this.f2131V.size() && it.hasNext(); i4++) {
            if (i4 != this.f2133a0) {
                q((N5.a) it.next(), ((Float) this.f2131V.get(i4)).floatValue());
            }
        }
        if (it.hasNext()) {
            q((N5.a) it.next(), ((Float) this.f2131V.get(this.f2133a0)).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f2131V.size())));
    }

    public final void f() {
        if (this.f2161r) {
            this.f2161r = false;
            ValueAnimator c6 = c(false);
            this.f2165t = c6;
            this.f2163s = null;
            c6.addListener(new H5.e(1, this));
            this.f2165t.start();
        }
    }

    public final float[] g() {
        float floatValue = ((Float) this.f2131V.get(0)).floatValue();
        ArrayList arrayList = this.f2131V;
        float floatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.f2131V.size() == 1) {
            floatValue = this.f2129T;
        }
        float o7 = o(floatValue);
        float o8 = o(floatValue2);
        if (k()) {
            return new float[]{o8, o7};
        }
        return new float[]{o7, o8};
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.k.k;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract int getThumbRadius();

    public List<Float> getValues() {
        return new ArrayList(this.f2131V);
    }

    public final int h(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean i(double d2) {
        if (Math.abs(Math.round(r3) - new BigDecimal(Double.toString(d2)).divide(new BigDecimal(Float.toString(this.f2134b0)), MathContext.DECIMAL64).doubleValue()) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    public final boolean j(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        WeakHashMap weakHashMap = O.f4214a;
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void l() {
        if (this.f2134b0 > 0.0f) {
            z();
            int min = Math.min((int) (((this.f2130U - this.f2129T) / this.f2134b0) + 1.0f), (this.f2143g0 / this.f2111A) + 1);
            float[] fArr = this.f2135c0;
            if (fArr == null || fArr.length != min * 2) {
                this.f2135c0 = new float[min * 2];
            }
            float f8 = this.f2143g0 / (min - 1);
            for (int i4 = 0; i4 < min * 2; i4 += 2) {
                float[] fArr2 = this.f2135c0;
                fArr2[i4] = ((i4 / 2.0f) * f8) + this.f2117G;
                fArr2[i4 + 1] = b();
            }
        }
    }

    public final boolean m(int i4) {
        int i8 = this.f2133a0;
        long j = i8 + i4;
        long size = this.f2131V.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i9 = (int) j;
        this.f2133a0 = i9;
        if (i9 == i8) {
            return false;
        }
        if (this.f2132W != -1) {
            this.f2132W = i9;
        }
        v();
        postInvalidate();
        return true;
    }

    public final void n(int i4) {
        if (k()) {
            if (i4 == Integer.MIN_VALUE) {
                i4 = Integer.MAX_VALUE;
            } else {
                i4 = -i4;
            }
        }
        m(i4);
    }

    public final float o(float f8) {
        float f9 = this.f2129T;
        float f10 = (f8 - f9) / (this.f2130U - f9);
        if (k()) {
            return 1.0f - f10;
        }
        return f10;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f2172w0);
        Iterator it = this.f2155o.iterator();
        while (it.hasNext()) {
            N5.a aVar = (N5.a) it.next();
            ViewGroup e9 = p.e(this);
            if (e9 == null) {
                aVar.getClass();
            } else {
                aVar.getClass();
                int[] iArr = new int[2];
                e9.getLocationOnScreen(iArr);
                aVar.f3785N = iArr[0];
                e9.getWindowVisibleDisplayFrame(aVar.f3779G);
                e9.addOnLayoutChangeListener(aVar.f3778F);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        C1562a c1562a;
        A5.c cVar = this.f2151m;
        if (cVar != null) {
            removeCallbacks(cVar);
        }
        this.f2161r = false;
        Iterator it = this.f2155o.iterator();
        while (it.hasNext()) {
            N5.a aVar = (N5.a) it.next();
            ViewGroup e9 = p.e(this);
            if (e9 == null) {
                c1562a = null;
            } else {
                c1562a = new C1562a(e9);
            }
            if (c1562a != null) {
                ((ViewOverlay) c1562a.f15048d).remove(aVar);
                ViewGroup e10 = p.e(this);
                if (e10 == null) {
                    aVar.getClass();
                } else {
                    e10.removeOnLayoutChangeListener(aVar.f3778F);
                }
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f2172w0);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0263  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i4;
        float f8;
        int i8;
        int i9;
        int i10;
        float f9;
        e eVar = this;
        Canvas canvas2 = canvas;
        if (eVar.f2147i0) {
            eVar.z();
            eVar.l();
        }
        super.onDraw(canvas);
        int b4 = eVar.b();
        float floatValue = ((Float) eVar.f2131V.get(0)).floatValue();
        ArrayList arrayList = eVar.f2131V;
        float floatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        float f10 = eVar.f2130U;
        RectF rectF = eVar.f2158p0;
        if (floatValue2 >= f10 && (eVar.f2131V.size() <= 1 || floatValue <= eVar.f2129T)) {
            i4 = 0;
            f8 = 2.0f;
        } else {
            int i11 = eVar.f2143g0;
            float[] g8 = eVar.g();
            int i12 = eVar.f2117G;
            float f11 = i11;
            float f12 = (g8[1] * f11) + i12;
            float f13 = i12 + i11;
            Paint paint = eVar.f2136d;
            if (f12 < f13) {
                int i13 = eVar.K;
                if (i13 > 0) {
                    float f14 = f12 + i13;
                    float f15 = b4;
                    f8 = 2.0f;
                    float f16 = eVar.f2116F / 2.0f;
                    i4 = 0;
                    rectF.set(f14, f15 - f16, i12 + i11 + f16, f16 + f15);
                    eVar.x(canvas2, paint, rectF, 3);
                } else {
                    i4 = 0;
                    f8 = 2.0f;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f17 = b4;
                    canvas2.drawLine(f12, f17, eVar.f2117G + i11, f17, paint);
                }
            } else {
                i4 = 0;
                f8 = 2.0f;
            }
            int i14 = eVar.f2117G;
            float f18 = i14;
            float f19 = (g8[i4] * f11) + f18;
            if (f19 > f18) {
                int i15 = eVar.K;
                if (i15 > 0) {
                    float f20 = eVar.f2116F / f8;
                    float f21 = b4;
                    rectF.set(i14 - f20, f21 - f20, f19 - i15, f20 + f21);
                    eVar.x(canvas2, paint, rectF, 2);
                } else {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f22 = b4;
                    canvas2.drawLine(eVar.f2117G, f22, f19, f22, paint);
                }
            }
        }
        if (floatValue2 > eVar.f2129T) {
            int i16 = eVar.f2143g0;
            float[] g9 = eVar.g();
            float f23 = eVar.f2117G;
            float f24 = i16;
            float f25 = (g9[1] * f24) + f23;
            float f26 = (g9[i4] * f24) + f23;
            int i17 = eVar.K;
            Paint paint2 = eVar.f2138e;
            if (i17 > 0) {
                if (eVar.f2131V.size() == 1) {
                    if (eVar.k()) {
                        i10 = 3;
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 4;
                }
                for (int i18 = i4; i18 < eVar.f2131V.size(); i18++) {
                    if (eVar.f2131V.size() > 1) {
                        if (i18 > 0) {
                            f26 = eVar.B(((Float) eVar.f2131V.get(i18 - 1)).floatValue());
                        }
                        f25 = eVar.B(((Float) eVar.f2131V.get(i18)).floatValue());
                        if (eVar.k()) {
                            f25 = f26;
                            f26 = f25;
                        }
                    }
                    int b9 = AbstractC1769h.b(i10);
                    if (b9 != 1) {
                        if (b9 != 2) {
                            if (b9 == 3) {
                                f9 = eVar.K;
                                f26 += f9;
                            }
                        } else {
                            f26 += eVar.K;
                            f25 = (eVar.f2116F / f8) + f25;
                        }
                        if (f26 >= f25) {
                            float f27 = b4;
                            float f28 = eVar.f2116F / f8;
                            rectF.set(f26, f27 - f28, f25, f28 + f27);
                            eVar.x(canvas2, paint2, rectF, i10);
                        }
                    } else {
                        f26 -= eVar.f2116F / f8;
                        f9 = eVar.K;
                    }
                    f25 -= f9;
                    if (f26 >= f25) {
                    }
                }
            } else {
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeCap(Paint.Cap.ROUND);
                float f29 = b4;
                canvas2.drawLine(f26, f29, f25, f29, paint2);
            }
        }
        if (eVar.f2137d0 && eVar.f2134b0 > 0.0f) {
            float[] g10 = eVar.g();
            int ceil = (int) Math.ceil(((eVar.f2135c0.length / f8) - 1.0f) * g10[i4]);
            int floor = (int) Math.floor(((eVar.f2135c0.length / f8) - 1.0f) * g10[1]);
            Paint paint3 = eVar.f2144h;
            if (ceil > 0) {
                canvas2.drawPoints(eVar.f2135c0, i4, ceil * 2, paint3);
            }
            if (ceil <= floor) {
                canvas2.drawPoints(eVar.f2135c0, ceil * 2, ((floor - ceil) + 1) * 2, eVar.f2146i);
            }
            int i19 = (floor + 1) * 2;
            float[] fArr = eVar.f2135c0;
            if (i19 < fArr.length) {
                canvas2.drawPoints(fArr, i19, fArr.length - i19, paint3);
            }
        }
        if (eVar.f2123N > 0) {
            int size = eVar.f2131V.size();
            Paint paint4 = eVar.j;
            if (size >= 1) {
                ArrayList arrayList2 = eVar.f2131V;
                float floatValue3 = ((Float) arrayList2.get(arrayList2.size() - 1)).floatValue();
                float f30 = eVar.f2130U;
                if (floatValue3 < f30) {
                    canvas2.drawPoint(eVar.B(f30), b4, paint4);
                }
            }
            if (eVar.f2131V.size() > 1) {
                i8 = 0;
                float floatValue4 = ((Float) eVar.f2131V.get(0)).floatValue();
                float f31 = eVar.f2129T;
                if (floatValue4 > f31) {
                    canvas2.drawPoint(eVar.B(f31), b4, paint4);
                }
                if ((!eVar.f2128S || eVar.isFocused()) && eVar.isEnabled()) {
                    int i20 = eVar.f2143g0;
                    if (!(eVar.getBackground() instanceof RippleDrawable)) {
                        int o7 = (int) ((eVar.o(((Float) eVar.f2131V.get(eVar.f2133a0)).floatValue()) * i20) + eVar.f2117G);
                        if (Build.VERSION.SDK_INT < 28) {
                            int i21 = eVar.f2120J;
                            canvas2.clipRect(o7 - i21, b4 - i21, o7 + i21, i21 + b4, Region.Op.UNION);
                        }
                        canvas2.drawCircle(o7, b4, eVar.f2120J, eVar.f2142g);
                    }
                }
                eVar.w();
                int i22 = eVar.f2143g0;
                while (i8 < eVar.f2131V.size()) {
                    float floatValue5 = ((Float) eVar.f2131V.get(i8)).floatValue();
                    Drawable drawable = eVar.f2164s0;
                    if (drawable != null) {
                        i9 = b4;
                        eVar.d(canvas2, i22, i9, floatValue5, drawable);
                    } else {
                        i9 = b4;
                        if (i8 < eVar.f2166t0.size()) {
                            eVar.d(canvas, i22, i9, floatValue5, (Drawable) eVar.f2166t0.get(i8));
                        } else {
                            if (!eVar.isEnabled()) {
                                canvas.drawCircle((eVar.o(floatValue5) * i22) + eVar.f2117G, i9, eVar.getThumbRadius(), eVar.f2140f);
                            }
                            eVar.d(canvas, i22, i9, floatValue5, eVar.f2162r0);
                        }
                    }
                    i8++;
                    eVar = this;
                    canvas2 = canvas;
                    b4 = i9;
                }
            }
        }
        i8 = 0;
        if (!eVar.f2128S) {
        }
        int i202 = eVar.f2143g0;
        if (!(eVar.getBackground() instanceof RippleDrawable)) {
        }
        eVar.w();
        int i222 = eVar.f2143g0;
        while (i8 < eVar.f2131V.size()) {
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z8, int i4, Rect rect) {
        super.onFocusChanged(z8, i4, rect);
        c cVar = this.k;
        if (!z8) {
            this.f2132W = -1;
            cVar.j(this.f2133a0);
            return;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 17) {
                    if (i4 == 66) {
                        n(Integer.MIN_VALUE);
                    }
                } else {
                    n(Integer.MAX_VALUE);
                }
            } else {
                m(Integer.MIN_VALUE);
            }
        } else {
            m(Integer.MAX_VALUE);
        }
        cVar.w(this.f2133a0);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i4, keyEvent);
        }
        if (this.f2131V.size() == 1) {
            this.f2132W = 0;
        }
        Float f8 = null;
        Boolean bool = null;
        if (this.f2132W == -1) {
            if (i4 != 61) {
                if (i4 != 66) {
                    if (i4 != 81) {
                        if (i4 != 69) {
                            if (i4 != 70) {
                                switch (i4) {
                                    case 21:
                                        n(-1);
                                        bool = Boolean.TRUE;
                                        break;
                                    case 22:
                                        n(1);
                                        bool = Boolean.TRUE;
                                        break;
                                }
                            }
                        } else {
                            m(-1);
                            bool = Boolean.TRUE;
                        }
                    }
                    m(1);
                    bool = Boolean.TRUE;
                }
                this.f2132W = this.f2133a0;
                postInvalidate();
                bool = Boolean.TRUE;
            } else if (keyEvent.hasNoModifiers()) {
                bool = Boolean.valueOf(m(1));
            } else if (keyEvent.isShiftPressed()) {
                bool = Boolean.valueOf(m(-1));
            } else {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return super.onKeyDown(i4, keyEvent);
        }
        boolean isLongPress = this.f2145h0 | keyEvent.isLongPress();
        this.f2145h0 = isLongPress;
        float f9 = 1.0f;
        if (isLongPress) {
            float f10 = this.f2134b0;
            if (f10 != 0.0f) {
                f9 = f10;
            }
            if ((this.f2130U - this.f2129T) / f9 > 20) {
                f9 *= Math.round(r0 / r11);
            }
        } else {
            float f11 = this.f2134b0;
            if (f11 != 0.0f) {
                f9 = f11;
            }
        }
        if (i4 != 21) {
            if (i4 != 22) {
                if (i4 != 69) {
                    if (i4 == 70 || i4 == 81) {
                        f8 = Float.valueOf(f9);
                    }
                } else {
                    f8 = Float.valueOf(-f9);
                }
            } else {
                if (k()) {
                    f9 = -f9;
                }
                f8 = Float.valueOf(f9);
            }
        } else {
            if (!k()) {
                f9 = -f9;
            }
            f8 = Float.valueOf(f9);
        }
        if (f8 != null) {
            if (s(this.f2132W, f8.floatValue() + ((Float) this.f2131V.get(this.f2132W)).floatValue())) {
                v();
                postInvalidate();
            }
            return true;
        }
        if (i4 != 23) {
            if (i4 != 61) {
                if (i4 != 66) {
                    return super.onKeyDown(i4, keyEvent);
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return m(1);
                }
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return m(-1);
            }
        }
        this.f2132W = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        this.f2145h0 = false;
        return super.onKeyUp(i4, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i8) {
        int i9 = this.f2114D;
        int i10 = this.f2115E;
        int i11 = 0;
        if (i10 == 1 || i10 == 3) {
            i11 = ((N5.a) this.f2155o.get(0)).getIntrinsicHeight();
        }
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(i9 + i11, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f2129T = dVar.f2106d;
        this.f2130U = dVar.f2107e;
        r(dVar.f2108f);
        this.f2134b0 = dVar.f2109g;
        if (dVar.f2110h) {
            requestFocus();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, I5.d, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f2106d = this.f2129T;
        baseSavedState.f2107e = this.f2130U;
        baseSavedState.f2108f = new ArrayList(this.f2131V);
        baseSavedState.f2109g = this.f2134b0;
        baseSavedState.f2110h = hasFocus();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i8, int i9, int i10) {
        this.f2143g0 = Math.max(i4 - (this.f2117G * 2), 0);
        l();
        v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r2 != 3) goto L65;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i4;
        if (isEnabled()) {
            float x8 = motionEvent.getX();
            float f8 = (x8 - this.f2117G) / this.f2143g0;
            this.f2168u0 = f8;
            float max = Math.max(0.0f, f8);
            this.f2168u0 = max;
            this.f2168u0 = Math.min(1.0f, max);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                int i8 = this.f2167u;
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (!this.f2128S) {
                            if (!j(motionEvent) || Math.abs(x8 - this.f2126Q) >= i8) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                p();
                            }
                        }
                        Slider slider = (Slider) this;
                        if (slider.getActiveThumbIndex() == -1) {
                            slider.setActiveThumbIndex(0);
                        }
                        this.f2128S = true;
                        t();
                        v();
                        invalidate();
                    }
                }
                this.f2128S = false;
                MotionEvent motionEvent2 = this.f2127R;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                    float f9 = i8;
                    if (Math.abs(this.f2127R.getX() - motionEvent.getX()) <= f9 && Math.abs(this.f2127R.getY() - motionEvent.getY()) <= f9) {
                        Slider slider2 = (Slider) this;
                        if (slider2.getActiveThumbIndex() == -1) {
                            slider2.setActiveThumbIndex(0);
                        }
                        p();
                    }
                }
                if (this.f2132W != -1) {
                    t();
                    v();
                    if (this.K > 0 && (i4 = this.f2121L) != -1 && this.f2122M != -1) {
                        setThumbWidth(i4);
                        setThumbTrackGapSize(this.f2122M);
                    }
                    this.f2132W = -1;
                    Iterator it = this.f2159q.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
                invalidate();
            } else {
                this.f2126Q = x8;
                if (!j(motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    Slider slider3 = (Slider) this;
                    if (slider3.getActiveThumbIndex() == -1) {
                        slider3.setActiveThumbIndex(0);
                    }
                    requestFocus();
                    this.f2128S = true;
                    t();
                    v();
                    int i9 = this.K;
                    if (i9 > 0) {
                        int i10 = this.f2118H;
                        this.f2121L = i10;
                        this.f2122M = i9;
                        int round = Math.round(i10 * 0.5f);
                        int i11 = this.f2118H - round;
                        setThumbWidth(round);
                        setThumbTrackGapSize(this.K - (i11 / 2));
                    }
                    invalidate();
                    p();
                }
            }
            setPressed(this.f2128S);
            this.f2127R = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i4) {
        C1562a c1562a;
        super.onVisibilityChanged(view, i4);
        if (i4 != 0) {
            ViewGroup e9 = p.e(this);
            if (e9 == null) {
                c1562a = null;
            } else {
                c1562a = new C1562a(e9);
            }
            if (c1562a != null) {
                Iterator it = this.f2155o.iterator();
                while (it.hasNext()) {
                    ((ViewOverlay) c1562a.f15048d).remove((N5.a) it.next());
                }
            }
        }
    }

    public final void p() {
        Iterator it = this.f2159q.iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final void q(N5.a aVar, float f8) {
        String str;
        C1562a c1562a;
        if (((int) f8) == f8) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        String format = String.format(str, Float.valueOf(f8));
        if (!TextUtils.equals(aVar.f3774B, format)) {
            aVar.f3774B = format;
            aVar.f3777E.f16213e = true;
            aVar.invalidateSelf();
        }
        int o7 = (this.f2117G + ((int) (o(f8) * this.f2143g0))) - (aVar.getIntrinsicWidth() / 2);
        int b4 = b() - ((this.f2119I / 2) + this.f2125P);
        aVar.setBounds(o7, b4 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + o7, b4);
        Rect rect = new Rect(aVar.getBounds());
        x5.c.b(p.e(this), this, rect);
        aVar.setBounds(rect);
        ViewGroup e9 = p.e(this);
        if (e9 == null) {
            c1562a = null;
        } else {
            c1562a = new C1562a(e9);
        }
        ((ViewOverlay) c1562a.f15048d).add(aVar);
    }

    public final void r(ArrayList arrayList) {
        D5.d dVar;
        ViewGroup e9;
        int resourceId;
        C1562a c1562a;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f2131V.size() == arrayList.size() && this.f2131V.equals(arrayList)) {
                return;
            }
            this.f2131V = arrayList;
            int i4 = 1;
            this.f2147i0 = true;
            this.f2133a0 = 0;
            v();
            ArrayList arrayList2 = this.f2155o;
            if (arrayList2.size() > this.f2131V.size()) {
                List<N5.a> subList = arrayList2.subList(this.f2131V.size(), arrayList2.size());
                for (N5.a aVar : subList) {
                    WeakHashMap weakHashMap = O.f4214a;
                    if (isAttachedToWindow()) {
                        ViewGroup e10 = p.e(this);
                        if (e10 == null) {
                            c1562a = null;
                        } else {
                            c1562a = new C1562a(e10);
                        }
                        if (c1562a != null) {
                            ((ViewOverlay) c1562a.f15048d).remove(aVar);
                            ViewGroup e11 = p.e(this);
                            if (e11 == null) {
                                aVar.getClass();
                            } else {
                                e11.removeOnLayoutChangeListener(aVar.f3778F);
                            }
                        }
                    }
                }
                subList.clear();
            }
            while (arrayList2.size() < this.f2131V.size()) {
                Context context = getContext();
                int i8 = this.f2153n;
                N5.a aVar2 = new N5.a(context, i8);
                TypedArray h8 = p.h(aVar2.f3775C, null, AbstractC0645a.f10631U, 0, i8, new int[0]);
                Context context2 = aVar2.f3775C;
                aVar2.f3784M = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
                boolean z8 = h8.getBoolean(8, true);
                aVar2.f3783L = z8;
                if (z8) {
                    F3.f e12 = aVar2.f1769d.f1752a.e();
                    e12.f1341o = aVar2.v();
                    aVar2.setShapeAppearanceModel(e12.a());
                } else {
                    aVar2.f3784M = 0;
                }
                CharSequence text = h8.getText(6);
                boolean equals = TextUtils.equals(aVar2.f3774B, text);
                m mVar = aVar2.f3777E;
                if (!equals) {
                    aVar2.f3774B = text;
                    mVar.f16213e = true;
                    aVar2.invalidateSelf();
                }
                if (h8.hasValue(0) && (resourceId = h8.getResourceId(0, 0)) != 0) {
                    dVar = new D5.d(context2, resourceId);
                } else {
                    dVar = null;
                }
                if (dVar != null && h8.hasValue(1)) {
                    dVar.j = AbstractC0405a.C(context2, h8, 1);
                }
                mVar.c(dVar, context2);
                aVar2.m(ColorStateList.valueOf(h8.getColor(7, H.b.c(H.b.e(AbstractC0832f.n(context2, R.attr.colorOnBackground, N5.a.class.getCanonicalName()), 153), H.b.e(AbstractC0832f.n(context2, android.R.attr.colorBackground, N5.a.class.getCanonicalName()), 229)))));
                aVar2.q(ColorStateList.valueOf(AbstractC0832f.n(context2, R.attr.colorSurface, N5.a.class.getCanonicalName())));
                aVar2.f3780H = h8.getDimensionPixelSize(2, 0);
                aVar2.f3781I = h8.getDimensionPixelSize(4, 0);
                aVar2.f3782J = h8.getDimensionPixelSize(5, 0);
                aVar2.K = h8.getDimensionPixelSize(3, 0);
                h8.recycle();
                arrayList2.add(aVar2);
                WeakHashMap weakHashMap2 = O.f4214a;
                if (isAttachedToWindow() && (e9 = p.e(this)) != null) {
                    int[] iArr = new int[2];
                    e9.getLocationOnScreen(iArr);
                    aVar2.f3785N = iArr[0];
                    e9.getWindowVisibleDisplayFrame(aVar2.f3779G);
                    e9.addOnLayoutChangeListener(aVar2.f3778F);
                }
            }
            if (arrayList2.size() == 1) {
                i4 = 0;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                N5.a aVar3 = (N5.a) it.next();
                aVar3.f1769d.j = i4;
                aVar3.invalidateSelf();
            }
            Iterator it2 = this.f2157p.iterator();
            while (it2.hasNext()) {
                B b4 = (B) it2.next();
                Iterator it3 = this.f2131V.iterator();
                while (it3.hasNext()) {
                    b4.a(this, ((Float) it3.next()).floatValue(), false);
                }
            }
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    public final boolean s(int i4, float f8) {
        float floatValue;
        float floatValue2;
        this.f2133a0 = i4;
        if (Math.abs(f8 - ((Float) this.f2131V.get(i4)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f2170v0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f9 = this.f2129T;
                minSeparation = AbstractC1149a.a(f9, this.f2130U, (minSeparation - this.f2117G) / this.f2143g0, f9);
            }
        }
        if (k()) {
            minSeparation = -minSeparation;
        }
        int i8 = i4 + 1;
        if (i8 >= this.f2131V.size()) {
            floatValue = this.f2130U;
        } else {
            floatValue = ((Float) this.f2131V.get(i8)).floatValue() - minSeparation;
        }
        int i9 = i4 - 1;
        if (i9 < 0) {
            floatValue2 = this.f2129T;
        } else {
            floatValue2 = minSeparation + ((Float) this.f2131V.get(i9)).floatValue();
        }
        this.f2131V.set(i4, Float.valueOf(AbstractC1492c.h(f8, floatValue2, floatValue)));
        Iterator it = this.f2157p.iterator();
        while (it.hasNext()) {
            ((B) it.next()).a(this, ((Float) this.f2131V.get(i4)).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f2149l;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.f2151m;
            if (runnable == null) {
                this.f2151m = new A5.c(this);
            } else {
                removeCallbacks(runnable);
            }
            A5.c cVar = this.f2151m;
            cVar.f303e = i4;
            postDelayed(cVar, 200L);
        }
        return true;
    }

    public void setActiveThumbIndex(int i4) {
        this.f2132W = i4;
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            drawableArr[i4] = getResources().getDrawable(iArr[i4]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        int i4;
        super.setEnabled(z8);
        if (z8) {
            i4 = 0;
        } else {
            i4 = 2;
        }
        setLayerType(i4, null);
    }

    public abstract void setHaloRadius(int i4);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i4);

    public void setSeparationUnit(int i4) {
        this.f2170v0 = i4;
        this.f2147i0 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f8);

    public abstract void setThumbHeight(int i4);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f8);

    public abstract void setThumbTrackGapSize(int i4);

    public abstract void setThumbWidth(int i4);

    public abstract void setTickActiveRadius(int i4);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i4);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackHeight(int i4);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i4);

    public abstract void setTrackStopIndicatorSize(int i4);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        r(arrayList);
    }

    public final void t() {
        double d2;
        float f8 = this.f2168u0;
        float f9 = this.f2134b0;
        if (f9 > 0.0f) {
            d2 = Math.round(f8 * r1) / ((int) ((this.f2130U - this.f2129T) / f9));
        } else {
            d2 = f8;
        }
        if (k()) {
            d2 = 1.0d - d2;
        }
        float f10 = this.f2130U;
        s(this.f2132W, (float) ((d2 * (f10 - r1)) + this.f2129T));
    }

    public final void u(int i4, Rect rect) {
        int o7 = this.f2117G + ((int) (o(getValues().get(i4).floatValue()) * this.f2143g0));
        int b4 = b();
        int max = Math.max(this.f2118H / 2, this.f2112B / 2);
        int max2 = Math.max(this.f2119I / 2, this.f2112B / 2);
        rect.set(o7 - max, b4 - max2, o7 + max, b4 + max2);
    }

    public final void v() {
        if ((getBackground() instanceof RippleDrawable) && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int o7 = (int) ((o(((Float) this.f2131V.get(this.f2133a0)).floatValue()) * this.f2143g0) + this.f2117G);
                int b4 = b();
                int i4 = this.f2120J;
                background.setHotspotBounds(o7 - i4, b4 - i4, o7 + i4, b4 + i4);
            }
        }
    }

    public final void w() {
        int i4 = this.f2115E;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    if (isEnabled()) {
                        Rect rect = new Rect();
                        p.e(this).getHitRect(rect);
                        if (getLocalVisibleRect(rect)) {
                            e();
                            return;
                        }
                    }
                    f();
                    return;
                }
                throw new IllegalArgumentException("Unexpected labelBehavior: " + this.f2115E);
            }
            f();
            return;
        }
        if (this.f2132W != -1 && isEnabled()) {
            e();
        } else {
            f();
        }
    }

    public final void x(Canvas canvas, Paint paint, RectF rectF, int i4) {
        float f8;
        float f9 = this.f2116F / 2.0f;
        int b4 = AbstractC1769h.b(i4);
        if (b4 != 1) {
            if (b4 != 2) {
                if (b4 == 3) {
                    f9 = this.f2124O;
                }
                f8 = f9;
            } else {
                f8 = f9;
                f9 = this.f2124O;
            }
        } else {
            f8 = this.f2124O;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        Path path = this.f2156o0;
        path.reset();
        if (rectF.width() >= f9 + f8) {
            path.addRoundRect(rectF, new float[]{f9, f9, f8, f8, f8, f8, f9, f9}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float min = Math.min(f9, f8);
        float max = Math.max(f9, f8);
        canvas.save();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        canvas.clipPath(path);
        int b9 = AbstractC1769h.b(i4);
        RectF rectF2 = this.f2160q0;
        if (b9 != 1) {
            if (b9 != 2) {
                rectF2.set(rectF.centerX() - max, rectF.top, rectF.centerX() + max, rectF.bottom);
            } else {
                float f10 = rectF.right;
                rectF2.set(f10 - (2.0f * max), rectF.top, f10, rectF.bottom);
            }
        } else {
            float f11 = rectF.left;
            rectF2.set(f11, rectF.top, (2.0f * max) + f11, rectF.bottom);
        }
        canvas.drawRoundRect(rectF2, max, max, paint);
        canvas.restore();
    }

    public final void y() {
        boolean z8;
        int max = Math.max(this.f2113C, Math.max(this.f2116F + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.f2119I));
        boolean z9 = true;
        if (max == this.f2114D) {
            z8 = false;
        } else {
            this.f2114D = max;
            z8 = true;
        }
        int max2 = Math.max(Math.max(Math.max((this.f2118H / 2) - this.f2171w, 0), Math.max((this.f2116F - this.f2173x) / 2, 0)), Math.max(Math.max(this.f2139e0 - this.f2174y, 0), Math.max(this.f2141f0 - this.f2175z, 0))) + this.f2169v;
        if (this.f2117G == max2) {
            z9 = false;
        } else {
            this.f2117G = max2;
            WeakHashMap weakHashMap = O.f4214a;
            if (isLaidOut()) {
                this.f2143g0 = Math.max(getWidth() - (this.f2117G * 2), 0);
                l();
            }
        }
        if (z8) {
            requestLayout();
        } else if (z9) {
            postInvalidate();
        }
    }

    public final void z() {
        if (this.f2147i0) {
            float f8 = this.f2129T;
            float f9 = this.f2130U;
            if (f8 < f9) {
                if (f9 > f8) {
                    if (this.f2134b0 > 0.0f && !A(f9)) {
                        throw new IllegalStateException("The stepSize(" + this.f2134b0 + ") must be 0, or a factor of the valueFrom(" + this.f2129T + ")-valueTo(" + this.f2130U + ") range");
                    }
                    Iterator it = this.f2131V.iterator();
                    while (it.hasNext()) {
                        Float f10 = (Float) it.next();
                        if (f10.floatValue() >= this.f2129T && f10.floatValue() <= this.f2130U) {
                            if (this.f2134b0 > 0.0f && !A(f10.floatValue())) {
                                float f11 = this.f2129T;
                                float f12 = this.f2134b0;
                                throw new IllegalStateException("Value(" + f10 + ") must be equal to valueFrom(" + f11 + ") plus a multiple of stepSize(" + f12 + ") when using stepSize(" + f12 + ")");
                            }
                        } else {
                            throw new IllegalStateException("Slider value(" + f10 + ") must be greater or equal to valueFrom(" + this.f2129T + "), and lower or equal to valueTo(" + this.f2130U + ")");
                        }
                    }
                    float minSeparation = getMinSeparation();
                    if (minSeparation >= 0.0f) {
                        float f13 = this.f2134b0;
                        if (f13 > 0.0f && minSeparation > 0.0f) {
                            if (this.f2170v0 == 1) {
                                if (minSeparation < f13 || !i(minSeparation)) {
                                    float f14 = this.f2134b0;
                                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f14 + ") when using stepSize(" + f14 + ")");
                                }
                            } else {
                                throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.f2134b0 + ")");
                            }
                        }
                        float f15 = this.f2134b0;
                        if (f15 != 0.0f) {
                            if (((int) f15) != f15) {
                                Log.w("e", "Floating point value used for stepSize(" + f15 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                            }
                            float f16 = this.f2129T;
                            if (((int) f16) != f16) {
                                Log.w("e", "Floating point value used for valueFrom(" + f16 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                            }
                            float f17 = this.f2130U;
                            if (((int) f17) != f17) {
                                Log.w("e", "Floating point value used for valueTo(" + f17 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                            }
                        }
                        this.f2147i0 = false;
                        return;
                    }
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
                }
                throw new IllegalStateException("valueTo(" + this.f2130U + ") must be greater than valueFrom(" + this.f2129T + ")");
            }
            throw new IllegalStateException("valueFrom(" + this.f2129T + ") must be smaller than valueTo(" + this.f2130U + ")");
        }
    }

    public void setValues(List<Float> list) {
        r(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f2164s0 = null;
        this.f2166t0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.f2166t0;
            Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
            a(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }
}
