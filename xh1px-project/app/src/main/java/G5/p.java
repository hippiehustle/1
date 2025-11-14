package G5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class p extends u {

    /* renamed from: c, reason: collision with root package name */
    public final r f1818c;

    public p(r rVar) {
        this.f1818c = rVar;
    }

    @Override // G5.u
    public final void a(Matrix matrix, F5.a aVar, int i4, Canvas canvas) {
        boolean z8;
        float f8;
        r rVar = this.f1818c;
        float f9 = rVar.f1827f;
        float f10 = rVar.f1828g;
        RectF rectF = new RectF(rVar.f1823b, rVar.f1824c, rVar.f1825d, rVar.f1826e);
        Paint paint = aVar.f1441b;
        if (f10 < 0.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        Path path = aVar.f1446g;
        int[] iArr = F5.a.k;
        if (z8) {
            iArr[0] = 0;
            iArr[1] = aVar.f1445f;
            iArr[2] = aVar.f1444e;
            iArr[3] = aVar.f1443d;
            f8 = 0.0f;
        } else {
            path.rewind();
            f8 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f9, f10);
            path.close();
            float f11 = -i4;
            rectF.inset(f11, f11);
            iArr[0] = 0;
            iArr[1] = aVar.f1443d;
            iArr[2] = aVar.f1444e;
            iArr[3] = aVar.f1445f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= f8) {
            return;
        }
        float f12 = 1.0f - (i4 / width);
        float[] fArr = F5.a.f1439l;
        fArr[1] = f12;
        fArr[2] = ((1.0f - f12) / 2.0f) + f12;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z8) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f1447h);
        }
        canvas.drawArc(rectF, f9, f10, true, paint);
        canvas.restore();
    }
}
