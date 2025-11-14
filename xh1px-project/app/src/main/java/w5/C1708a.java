package w5;

import G5.m;
import G5.n;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: w5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1708a extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f15713b;

    /* renamed from: h, reason: collision with root package name */
    public float f15719h;

    /* renamed from: i, reason: collision with root package name */
    public int f15720i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f15721l;

    /* renamed from: m, reason: collision with root package name */
    public int f15722m;

    /* renamed from: o, reason: collision with root package name */
    public G5.l f15724o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f15725p;

    /* renamed from: a, reason: collision with root package name */
    public final n f15712a = m.f1804a;

    /* renamed from: c, reason: collision with root package name */
    public final Path f15714c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f15715d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f15716e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f15717f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final K0.e f15718g = new K0.e(this);

    /* renamed from: n, reason: collision with root package name */
    public boolean f15723n = true;

    public C1708a(G5.l lVar) {
        this.f15724o = lVar;
        Paint paint = new Paint(1);
        this.f15713b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z8 = this.f15723n;
        Rect rect = this.f15715d;
        Paint paint = this.f15713b;
        if (z8) {
            copyBounds(rect);
            float height = this.f15719h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{H.b.c(this.f15720i, this.f15722m), H.b.c(this.j, this.f15722m), H.b.c(H.b.e(this.j, 0), this.f15722m), H.b.c(H.b.e(this.f15721l, 0), this.f15722m), H.b.c(this.f15721l, this.f15722m), H.b.c(this.k, this.f15722m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f15723n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f15716e;
        rectF.set(rect);
        G5.c cVar = this.f15724o.f1798e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f15717f;
        rectF2.set(bounds);
        float min = Math.min(cVar.a(rectF2), rectF.width() / 2.0f);
        G5.l lVar = this.f15724o;
        rectF2.set(getBounds());
        if (lVar.d(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f15718g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f15719h > 0.0f) {
            return -3;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        G5.l lVar = this.f15724o;
        Rect bounds = getBounds();
        RectF rectF = this.f15717f;
        rectF.set(bounds);
        if (lVar.d(rectF)) {
            G5.c cVar = this.f15724o.f1798e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), cVar.a(rectF));
            return;
        }
        Rect rect = this.f15715d;
        copyBounds(rect);
        RectF rectF2 = this.f15716e;
        rectF2.set(rect);
        G5.l lVar2 = this.f15724o;
        n nVar = this.f15712a;
        Path path = this.f15714c;
        nVar.a(lVar2, 1.0f, rectF2, null, path);
        h2.a.A(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        G5.l lVar = this.f15724o;
        Rect bounds = getBounds();
        RectF rectF = this.f15717f;
        rectF.set(bounds);
        if (lVar.d(rectF)) {
            int round = Math.round(this.f15719h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f15725p;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f15723n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f15725p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f15722m)) != this.f15722m) {
            this.f15723n = true;
            this.f15722m = colorForState;
        }
        if (this.f15723n) {
            invalidateSelf();
        }
        return this.f15723n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f15713b.setAlpha(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15713b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
