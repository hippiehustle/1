package J5;

import G5.h;
import G5.l;
import P.D;
import P.F;
import P.O;
import a.AbstractC0405a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import h4.AbstractC0832f;
import java.util.WeakHashMap;
import x5.p;

/* loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final b f2492l = new b(0);

    /* renamed from: d, reason: collision with root package name */
    public final l f2493d;

    /* renamed from: e, reason: collision with root package name */
    public int f2494e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2495f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2496g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2497h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2498i;
    public ColorStateList j;
    public PorterDuff.Mode k;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(M5.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0645a.f10626P);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = O.f4214a;
            F.k(this, dimensionPixelSize);
        }
        this.f2494e = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f2493d = l.b(context2, attributeSet, 0, 0).a();
        }
        this.f2495f = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0405a.C(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(p.j(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f2496g = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f2497h = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f2498i = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f2492l);
        setFocusable(true);
        if (getBackground() == null) {
            int t8 = AbstractC0832f.t(getBackgroundOverlayColorAlpha(), AbstractC0832f.o(this, R.attr.colorSurface), AbstractC0832f.o(this, R.attr.colorOnSurface));
            l lVar = this.f2493d;
            if (lVar != null) {
                int i4 = d.f2499a;
                h hVar = new h(lVar);
                hVar.m(ColorStateList.valueOf(t8));
                gradientDrawable = hVar;
            } else {
                Resources resources = getResources();
                int i8 = d.f2499a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(t8);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = O.f4214a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f2496g;
    }

    public int getAnimationMode() {
        return this.f2494e;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f2495f;
    }

    public int getMaxInlineActionWidth() {
        return this.f2498i;
    }

    public int getMaxWidth() {
        return this.f2497h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = O.f4214a;
        D.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        super.onLayout(z8, i4, i8, i9, i10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i8) {
        super.onMeasure(i4, i8);
        int i9 = this.f2497h;
        if (i9 > 0 && getMeasuredWidth() > i9) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i8);
        }
    }

    public void setAnimationMode(int i4) {
        this.f2494e = i4;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.j != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.j);
            drawable.setTintMode(this.k);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.k);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        b bVar;
        if (onClickListener != null) {
            bVar = null;
        } else {
            bVar = f2492l;
        }
        setOnTouchListener(bVar);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
