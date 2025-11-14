package N2;

import R2.g;
import R2.h;
import W4.i;
import a6.AbstractC0437l;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import com.buzbuz.smartautoclicker.R;
import java.util.List;
import o6.j;
import z2.AbstractC1854a;

/* loaded from: classes.dex */
public final class d extends S2.a {

    /* renamed from: d, reason: collision with root package name */
    public final i f3728d;

    /* renamed from: e, reason: collision with root package name */
    public final R2.c f3729e;

    /* renamed from: f, reason: collision with root package name */
    public final g f3730f;

    /* renamed from: g, reason: collision with root package name */
    public final T2.b f3731g;

    /* renamed from: h, reason: collision with root package name */
    public final F3.a f3732h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3733i;
    public boolean j;
    public final RectF k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3734l;

    /* renamed from: m, reason: collision with root package name */
    public final List f3735m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, Y1.d dVar, i iVar) {
        super(context, null, 0);
        j.e(dVar, "displayConfigManager");
        this.f3728d = iVar;
        this.k = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1854a.f16623c, R.attr.conditionSelectorStyle, 0);
        j.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
        F3.a aVar = new F3.a(new a(obtainStyledAttributes.getColor(0, 0) >> 24, obtainStyledAttributes.getInteger(14, 500), obtainStyledAttributes.getInteger(13, 1000), obtainStyledAttributes.getInteger(22, 500), obtainStyledAttributes.getInteger(21, 750)));
        this.f3732h = aVar;
        R2.c cVar = new R2.c(context, new R2.d(dVar, obtainStyledAttributes.getFloat(19, 0.8f), obtainStyledAttributes.getFloat(18, 3.0f)), this);
        this.f3729e = cVar;
        g gVar = new g(context, new h(dVar, new PointF(obtainStyledAttributes.getDimensionPixelSize(6, 100) / 2.0f, obtainStyledAttributes.getDimensionPixelSize(5, 100) / 2.0f), obtainStyledAttributes.getDimensionPixelSize(20, 10), (int) Math.ceil(obtainStyledAttributes.getDimensionPixelSize(23, 4) / 2), obtainStyledAttributes.getDimensionPixelSize(4, 2), obtainStyledAttributes.getDimensionPixelSize(23, 4), obtainStyledAttributes.getColor(2, -1), obtainStyledAttributes.getColor(0, 0)), this);
        this.f3730f = gVar;
        T2.b bVar = new T2.b(context, new T2.c(dVar, obtainStyledAttributes.getDimensionPixelSize(15, 5), obtainStyledAttributes.getDimensionPixelSize(16, 10), obtainStyledAttributes.getResourceId(7, 0), obtainStyledAttributes.getResourceId(12, 0), obtainStyledAttributes.getResourceId(9, 0), obtainStyledAttributes.getResourceId(10, 0), obtainStyledAttributes.getResourceId(11, 0), Integer.valueOf(obtainStyledAttributes.getResourceId(8, 0)), Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(17, 100))), this);
        this.f3731g = bVar;
        obtainStyledAttributes.recycle();
        gVar.f5035t = new c(this, 0);
        cVar.k = new c(this, 1);
        aVar.f1304e = new c(this, 2);
        aVar.f1306g = new c(this, 3);
        aVar.f1307h = new c(this, 4);
        aVar.f1308i = new c(this, 5);
        this.f3734l = true;
        this.f3735m = AbstractC0437l.X(cVar, gVar, bVar);
    }

    public final void a() {
        boolean z8;
        g gVar = this.f3730f;
        if (gVar != null) {
            RectF rectF = new RectF(gVar.f5032q);
            RectF rectF2 = this.k;
            rectF2.set(rectF);
            R2.c cVar = this.f3729e;
            if (cVar != null) {
                boolean intersect = rectF2.intersect(cVar.f5011i);
                boolean z9 = false;
                if (rectF2.width() >= 50.0f && rectF2.height() >= 50.0f) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (intersect && z8) {
                    z9 = true;
                }
                boolean z10 = this.j;
                if (z9 != z10) {
                    boolean z11 = !z10;
                    this.j = z11;
                    this.f3728d.m(Boolean.valueOf(z11));
                    return;
                }
                return;
            }
            j.i("capture");
            throw null;
        }
        j.i("selector");
        throw null;
    }

    public final boolean getHide() {
        return this.f3734l;
    }

    public final Z5.j getSelection() {
        if (this.j) {
            Z5.j jVar = null;
            R2.c cVar = this.f3729e;
            if (cVar != null) {
                BitmapDrawable bitmapDrawable = cVar.j;
                if (bitmapDrawable != null) {
                    g gVar = this.f3730f;
                    if (gVar != null) {
                        if (cVar != null) {
                            RectF rectF = cVar.f5011i;
                            if (cVar != null) {
                                float f8 = cVar.f5010h;
                                j.e(rectF, "captureArea");
                                RectF rectF2 = new RectF(gVar.f5032q);
                                rectF2.intersect(rectF);
                                float f9 = 1 / f8;
                                rectF2.left = (rectF2.left - rectF.left) * f9;
                                rectF2.top = (rectF2.top - rectF.top) * f9;
                                rectF2.right = (rectF2.right - rectF.left) * f9;
                                rectF2.bottom = (rectF2.bottom - rectF.top) * f9;
                                rectF2.intersect(gVar.f5325c);
                                Rect rect = new Rect();
                                rectF2.roundOut(rect);
                                Rect rect2 = new Rect(0, 0, bitmapDrawable.getBitmap().getWidth(), bitmapDrawable.getBitmap().getHeight());
                                if (rect2.intersect(rect)) {
                                    jVar = new Z5.j(rect2, Bitmap.createBitmap(bitmapDrawable.getBitmap(), rect2.left, rect2.top, rect2.width(), rect2.height()));
                                }
                                if (jVar != null) {
                                    return jVar;
                                }
                            } else {
                                j.i("capture");
                                throw null;
                            }
                        } else {
                            j.i("capture");
                            throw null;
                        }
                    } else {
                        j.i("selector");
                        throw null;
                    }
                }
                throw new IllegalStateException("Can't get a selection, there is no screen capture.");
            }
            j.i("capture");
            throw null;
        }
        throw new IllegalStateException("Can't get a selection, selector is invalid.");
    }

    @Override // S2.a
    public List<S2.h> getViewComponents$ui_fDroidRelease() {
        return this.f3735m;
    }

    @Override // S2.a, android.view.View
    public final void onDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        if (this.f3734l) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || this.f3734l) {
            return false;
        }
        g gVar = this.f3730f;
        if (gVar != null) {
            S2.b bVar = gVar.f5022e;
            F3.a aVar = this.f3732h;
            if (bVar != null) {
                T2.b bVar2 = this.f3731g;
                if (bVar2 != null) {
                    bVar2.g(bVar);
                    if (aVar != null) {
                        ValueAnimator valueAnimator = (ValueAnimator) aVar.j;
                        if (valueAnimator.isRunning()) {
                            valueAnimator.end();
                        }
                        if (motionEvent.getAction() == 1) {
                            if (valueAnimator.isRunning()) {
                                valueAnimator.end();
                            }
                            valueAnimator.start();
                        }
                    } else {
                        j.i("animations");
                        throw null;
                    }
                } else {
                    j.i("hintsIcons");
                    throw null;
                }
            }
            if (gVar.e(motionEvent)) {
                return true;
            }
            if (aVar != null) {
                if (((AnimatorSet) aVar.f1305f).isRunning()) {
                    this.f3733i = true;
                    return false;
                }
                if (this.f3733i) {
                    motionEvent.setAction(0);
                    this.f3733i = false;
                }
                R2.c cVar = this.f3729e;
                if (cVar != null) {
                    return cVar.f5007e.onTouchEvent(motionEvent) | cVar.f5006d.onTouchEvent(motionEvent);
                }
                j.i("capture");
                throw null;
            }
            j.i("animations");
            throw null;
        }
        j.i("selector");
        throw null;
    }

    public final void setHide(boolean z8) {
        if (this.f3734l == z8) {
            return;
        }
        this.f3734l = z8;
        if (z8) {
            R2.c cVar = this.f3729e;
            if (cVar != null) {
                RectF rectF = cVar.f5011i;
                cVar.j = null;
                cVar.e(1.0f, new PointF(rectF.centerX(), rectF.centerY()));
                rectF.left = 0.0f;
                rectF.top = 0.0f;
                RectF rectF2 = cVar.f5325c;
                rectF.right = rectF2.width();
                rectF.bottom = rectF2.height();
                c cVar2 = cVar.k;
                if (cVar2 != null) {
                    cVar2.m(rectF);
                }
                g gVar = this.f3730f;
                if (gVar != null) {
                    gVar.f(true);
                    gVar.f5027l.setAlpha(gVar.f5028m);
                    gVar.a();
                    gVar.k.setAlpha(255);
                    gVar.a();
                    T2.b bVar = this.f3731g;
                    if (bVar != null) {
                        bVar.e(0);
                        bVar.f5667g.clear();
                    } else {
                        j.i("hintsIcons");
                        throw null;
                    }
                } else {
                    j.i("selector");
                    throw null;
                }
            } else {
                j.i("capture");
                throw null;
            }
        }
        invalidate();
    }
}
