package s;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1475a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f14433a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f14434b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f14435c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f14436d;

    /* renamed from: e, reason: collision with root package name */
    public float f14437e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f14440h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f14441i;
    public ColorStateList j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14438f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14439g = true;
    public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    public C1475a(ColorStateList colorStateList, float f8) {
        this.f14433a = f8;
        Paint paint = new Paint(5);
        this.f14434b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f14440h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f14440h.getDefaultColor()));
        this.f14435c = new RectF();
        this.f14436d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f8 = rect.left;
        float f9 = rect.top;
        float f10 = rect.right;
        float f11 = rect.bottom;
        RectF rectF = this.f14435c;
        rectF.set(f8, f9, f10, f11);
        Rect rect2 = this.f14436d;
        rect2.set(rect);
        if (this.f14438f) {
            rect2.inset((int) Math.ceil(AbstractC1476b.a(this.f14437e, this.f14433a, this.f14439g)), (int) Math.ceil(AbstractC1476b.b(this.f14437e, this.f14433a, this.f14439g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z8;
        PorterDuffColorFilter porterDuffColorFilter = this.f14441i;
        Paint paint = this.f14434b;
        if (porterDuffColorFilter != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f14441i);
            z8 = true;
        } else {
            z8 = false;
        }
        RectF rectF = this.f14435c;
        float f8 = this.f14433a;
        canvas.drawRoundRect(rectF, f8, f8, paint);
        if (z8) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f14436d, this.f14433a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f14440h;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z8;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f14440h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f14434b;
        if (colorForState != paint.getColor()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 != null && (mode = this.k) != null) {
            this.f14441i = a(colorStateList2, mode);
            return true;
        }
        return z8;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f14434b.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f14434b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f14441i = a(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.f14441i = a(this.j, mode);
        invalidateSelf();
    }
}
