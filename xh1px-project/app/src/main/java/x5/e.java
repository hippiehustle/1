package x5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import e5.AbstractC0645a;
import o.AbstractC1223x0;

/* loaded from: classes.dex */
public abstract class e extends AbstractC1223x0 {

    /* renamed from: s, reason: collision with root package name */
    public Drawable f16194s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f16195t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f16196u;

    /* renamed from: v, reason: collision with root package name */
    public int f16197v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f16198w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16199x;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f16195t = new Rect();
        this.f16196u = new Rect();
        this.f16197v = 119;
        this.f16198w = true;
        this.f16199x = false;
        p.a(context, attributeSet, 0, 0);
        int[] iArr = AbstractC0645a.f10647r;
        p.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f16197v = obtainStyledAttributes.getInt(1, this.f16197v);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f16198w = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f16194s;
        if (drawable != null) {
            if (this.f16199x) {
                this.f16199x = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z8 = this.f16198w;
                Rect rect = this.f16195t;
                if (z8) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i4 = this.f16197v;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f16196u;
                Gravity.apply(i4, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f8, float f9) {
        super.drawableHotspotChanged(f8, f9);
        Drawable drawable = this.f16194s;
        if (drawable != null) {
            drawable.setHotspot(f8, f9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f16194s;
        if (drawable != null && drawable.isStateful()) {
            this.f16194s.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f16194s;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f16197v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f16194s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // o.AbstractC1223x0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        super.onLayout(z8, i4, i8, i9, i10);
        this.f16199x = z8 | this.f16199x;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i8, int i9, int i10) {
        super.onSizeChanged(i4, i8, i9, i10);
        this.f16199x = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f16194s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f16194s);
            }
            this.f16194s = drawable;
            this.f16199x = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f16197v == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i4) {
        if (this.f16197v != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f16197v = i4;
            if (i4 == 119 && this.f16194s != null) {
                this.f16194s.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f16194s) {
            return false;
        }
        return true;
    }
}
