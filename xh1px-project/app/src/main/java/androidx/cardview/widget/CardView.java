package androidx.cardview.widget;

import G5.e;
import R3.r;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import r.AbstractC1425a;
import s.C1475a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: i */
    public static final int[] f8508i = {R.attr.colorBackground};
    public static final e j = new e(27);

    /* renamed from: d */
    public boolean f8509d;

    /* renamed from: e */
    public boolean f8510e;

    /* renamed from: f */
    public final Rect f8511f;

    /* renamed from: g */
    public final Rect f8512g;

    /* renamed from: h */
    public final r f8513h;

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.cardViewStyle);
    }

    public static /* synthetic */ void a(CardView cardView, int i4, int i8, int i9, int i10) {
        super.setPadding(i4, i8, i9, i10);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C1475a) ((Drawable) this.f8513h.f5082e)).f14440h;
    }

    public float getCardElevation() {
        return ((CardView) this.f8513h.f5083f).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f8511f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f8511f.left;
    }

    public int getContentPaddingRight() {
        return this.f8511f.right;
    }

    public int getContentPaddingTop() {
        return this.f8511f.top;
    }

    public float getMaxCardElevation() {
        return ((C1475a) ((Drawable) this.f8513h.f5082e)).f14437e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f8510e;
    }

    public float getRadius() {
        return ((C1475a) ((Drawable) this.f8513h.f5082e)).f14433a;
    }

    public boolean getUseCompatPadding() {
        return this.f8509d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i8) {
        super.onMeasure(i4, i8);
    }

    public void setCardBackgroundColor(int i4) {
        ColorStateList valueOf = ColorStateList.valueOf(i4);
        C1475a c1475a = (C1475a) ((Drawable) this.f8513h.f5082e);
        if (valueOf == null) {
            c1475a.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c1475a.f14440h = valueOf;
        c1475a.f14434b.setColor(valueOf.getColorForState(c1475a.getState(), c1475a.f14440h.getDefaultColor()));
        c1475a.invalidateSelf();
    }

    public void setCardElevation(float f8) {
        ((CardView) this.f8513h.f5083f).setElevation(f8);
    }

    public void setMaxCardElevation(float f8) {
        j.v(this.f8513h, f8);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i4) {
        super.setMinimumHeight(i4);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i4) {
        super.setMinimumWidth(i4);
    }

    @Override // android.view.View
    public final void setPadding(int i4, int i8, int i9, int i10) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i4, int i8, int i9, int i10) {
    }

    public void setPreventCornerOverlap(boolean z8) {
        if (z8 != this.f8510e) {
            this.f8510e = z8;
            r rVar = this.f8513h;
            j.v(rVar, ((C1475a) ((Drawable) rVar.f5082e)).f14437e);
        }
    }

    public void setRadius(float f8) {
        C1475a c1475a = (C1475a) ((Drawable) this.f8513h.f5082e);
        if (f8 == c1475a.f14433a) {
            return;
        }
        c1475a.f14433a = f8;
        c1475a.b(null);
        c1475a.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z8) {
        if (this.f8509d != z8) {
            this.f8509d = z8;
            r rVar = this.f8513h;
            j.v(rVar, ((C1475a) ((Drawable) rVar.f5082e)).f14437e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f8511f = rect;
        this.f8512g = new Rect();
        r rVar = new r(this);
        this.f8513h = rVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1425a.f14218a, i4, com.buzbuz.smartautoclicker.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f8508i);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.buzbuz.smartautoclicker.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.buzbuz.smartautoclicker.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f8509d = obtainStyledAttributes.getBoolean(7, false);
        this.f8510e = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C1475a c1475a = new C1475a(valueOf, dimension);
        rVar.f5082e = c1475a;
        setBackgroundDrawable(c1475a);
        setClipToOutline(true);
        setElevation(dimension2);
        j.v(rVar, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C1475a c1475a = (C1475a) ((Drawable) this.f8513h.f5082e);
        if (colorStateList == null) {
            c1475a.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c1475a.f14440h = colorStateList;
        c1475a.f14434b.setColor(colorStateList.getColorForState(c1475a.getState(), c1475a.f14440h.getDefaultColor()));
        c1475a.invalidateSelf();
    }
}
