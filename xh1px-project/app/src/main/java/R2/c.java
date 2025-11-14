package R2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import h4.AbstractC0832f;
import o6.j;

/* loaded from: classes.dex */
public final class c extends S2.h {

    /* renamed from: d, reason: collision with root package name */
    public final GestureDetector f5006d;

    /* renamed from: e, reason: collision with root package name */
    public final ScaleGestureDetector f5007e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5008f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5009g;

    /* renamed from: h, reason: collision with root package name */
    public float f5010h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f5011i;
    public BitmapDrawable j;
    public N2.c k;

    public c(Context context, d dVar, N2.d dVar2) {
        super(dVar, dVar2);
        this.f5006d = new GestureDetector(context, new a(this, 0));
        this.f5007e = new ScaleGestureDetector(context, new b(this));
        this.f5008f = dVar.f5012f;
        this.f5009g = dVar.f5013g;
        this.f5010h = 1.0f;
        this.f5011i = new RectF(0.0f, 0.0f, this.f5325c.width(), this.f5325c.height());
    }

    @Override // S2.h
    public final void b(Canvas canvas) {
        BitmapDrawable bitmapDrawable = this.j;
        if (bitmapDrawable != null) {
            canvas.drawColor(-16777216);
            RectF rectF = this.f5011i;
            bitmapDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            bitmapDrawable.draw(canvas);
        }
    }

    @Override // S2.h
    public final void c() {
        if (this.j == null) {
            RectF rectF = this.f5011i;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            RectF rectF2 = this.f5325c;
            rectF.right = rectF2.width();
            rectF.bottom = rectF2.height();
        }
    }

    public final void e(float f8, PointF pointF) {
        j.e(pointF, "zoomPivot");
        float e9 = AbstractC0832f.e(f8, this.f5008f, this.f5009g);
        if (this.f5010h == e9) {
            return;
        }
        if (e9 < 1.0f) {
            RectF rectF = this.f5325c;
            pointF = new PointF(rectF.centerX(), rectF.centerY());
        }
        float f9 = e9 / this.f5010h;
        RectF rectF2 = this.f5011i;
        AbstractC0832f.z(rectF2, f9, pointF);
        this.f5010h = e9;
        N2.c cVar = this.k;
        if (cVar != null) {
            cVar.m(rectF2);
        }
        a();
    }
}
