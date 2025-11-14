package G5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class q extends u {

    /* renamed from: c, reason: collision with root package name */
    public final s f1819c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1820d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1821e;

    public q(s sVar, float f8, float f9) {
        this.f1819c = sVar;
        this.f1820d = f8;
        this.f1821e = f9;
    }

    @Override // G5.u
    public final void a(Matrix matrix, F5.a aVar, int i4, Canvas canvas) {
        s sVar = this.f1819c;
        float f8 = sVar.f1830c;
        float f9 = this.f1821e;
        float f10 = sVar.f1829b;
        float f11 = this.f1820d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f8 - f9, f10 - f11), 0.0f);
        Matrix matrix2 = this.f1833a;
        matrix2.set(matrix);
        matrix2.preTranslate(f11, f9);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i4;
        rectF.offset(0.0f, -i4);
        int i8 = aVar.f1445f;
        int[] iArr = F5.a.f1438i;
        iArr[0] = i8;
        iArr[1] = aVar.f1444e;
        iArr[2] = aVar.f1443d;
        Paint paint = aVar.f1442c;
        float f12 = rectF.left;
        paint.setShader(new LinearGradient(f12, rectF.top, f12, rectF.bottom, iArr, F5.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        s sVar = this.f1819c;
        return (float) Math.toDegrees(Math.atan((sVar.f1830c - this.f1821e) / (sVar.f1829b - this.f1820d)));
    }
}
