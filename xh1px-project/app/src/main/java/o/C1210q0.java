package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: o.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1210q0 extends Drawable implements Drawable.Callback {

    /* renamed from: d, reason: collision with root package name */
    public Drawable f13357d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13358e;

    public final void a(Canvas canvas) {
        this.f13357d.draw(canvas);
    }

    public final void b(float f8, float f9) {
        this.f13357d.setHotspot(f8, f9);
    }

    public final void c(int i4, int i8, int i9, int i10) {
        this.f13357d.setHotspotBounds(i4, i8, i9, i10);
    }

    public final boolean d(boolean z8, boolean z9) {
        if (!super.setVisible(z8, z9) && !this.f13357d.setVisible(z8, z9)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f13358e) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f13357d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f13357d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f13357d.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f13357d.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f13357d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f13357d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f13357d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f13357d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f13357d.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f13357d.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f13357d.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f13357d.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f13357d.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f13357d.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        return this.f13357d.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f13357d.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z8) {
        this.f13357d.setAutoMirrored(z8);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i4) {
        this.f13357d.setChangingConfigurations(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13357d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z8) {
        this.f13357d.setDither(z8);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z8) {
        this.f13357d.setFilterBitmap(z8);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f8, float f9) {
        if (this.f13358e) {
            b(f8, f9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i4, int i8, int i9, int i10) {
        if (this.f13358e) {
            c(i4, i8, i9, i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f13358e) {
            return this.f13357d.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        this.f13357d.setTint(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f13357d.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f13357d.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        if (this.f13358e) {
            return d(z8, z9);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
