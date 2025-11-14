package C5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: b, reason: collision with root package name */
    public float f657b;

    /* renamed from: c, reason: collision with root package name */
    public float f658c;

    /* renamed from: d, reason: collision with root package name */
    public float f659d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f660e;

    /* renamed from: f, reason: collision with root package name */
    public float f661f;

    public final void b(Canvas canvas, Paint paint, float f8, float f9, int i4, int i8, int i9) {
        float f10;
        Paint.Cap cap;
        if (f9 >= f8) {
            f10 = f9 - f8;
        } else {
            f10 = (f9 + 1.0f) - f8;
        }
        float f11 = f8 % 1.0f;
        if (this.f661f < 1.0f) {
            float f12 = f11 + f10;
            if (f12 > 1.0f) {
                b(canvas, paint, f11, 1.0f, i4, i8, 0);
                b(canvas, paint, 1.0f, f12, i4, 0, i9);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f658c / this.f659d);
        if (f11 == 0.0f && f10 >= 0.99f) {
            f10 += (((degrees * 2.0f) / 360.0f) * (f10 - 0.99f)) / 0.01f;
        }
        float s8 = h2.a.s(1.0f - this.f661f, 1.0f, f11);
        float s9 = h2.a.s(0.0f, this.f661f, f10);
        float degrees2 = (float) Math.toDegrees(i8 / this.f659d);
        float degrees3 = ((s9 * 360.0f) - degrees2) - ((float) Math.toDegrees(i9 / this.f659d));
        float f13 = (s8 * 360.0f) + degrees2;
        if (degrees3 > 0.0f) {
            paint.setAntiAlias(true);
            paint.setColor(i4);
            paint.setStrokeWidth(this.f657b);
            float f14 = degrees * 2.0f;
            if (degrees3 < f14) {
                float f15 = degrees3 / f14;
                paint.setStyle(Paint.Style.FILL);
                c(canvas, paint, (degrees * f15) + f13, this.f658c * 2.0f, this.f657b, f15);
                return;
            }
            float f16 = this.f659d;
            float f17 = -f16;
            RectF rectF = new RectF(f17, f17, f16, f16);
            paint.setStyle(Paint.Style.STROKE);
            if (this.f660e) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            float f18 = f13 + degrees;
            canvas.drawArc(rectF, f18, degrees3 - f14, false, paint);
            if (!this.f660e && this.f658c > 0.0f) {
                paint.setStyle(Paint.Style.FILL);
                c(canvas, paint, f18, this.f658c * 2.0f, this.f657b, 1.0f);
                c(canvas, paint, (f13 + degrees3) - degrees, this.f658c * 2.0f, this.f657b, 1.0f);
            }
        }
    }

    public final void c(Canvas canvas, Paint paint, float f8, float f9, float f10, float f11) {
        float min = (int) Math.min(f10, this.f657b);
        float f12 = f9 / 2.0f;
        float min2 = Math.min(f12, (this.f658c * min) / this.f657b);
        RectF rectF = new RectF((-min) / 2.0f, (-f9) / 2.0f, min / 2.0f, f12);
        canvas.save();
        double d2 = f8;
        canvas.translate((float) (Math.cos(Math.toRadians(d2)) * this.f659d), (float) (Math.sin(Math.toRadians(d2)) * this.f659d));
        canvas.rotate(f8);
        canvas.scale(f11, f11);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int d() {
        i iVar = this.f705a;
        return (iVar.f684i * 2) + iVar.f683h;
    }
}
