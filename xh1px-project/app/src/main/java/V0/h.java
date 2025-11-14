package V0;

import N0.B;
import N0.x;
import Q0.r;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: D, reason: collision with root package name */
    public final RectF f6282D;

    /* renamed from: E, reason: collision with root package name */
    public final O0.a f6283E;

    /* renamed from: F, reason: collision with root package name */
    public final float[] f6284F;

    /* renamed from: G, reason: collision with root package name */
    public final Path f6285G;

    /* renamed from: H, reason: collision with root package name */
    public final e f6286H;

    /* renamed from: I, reason: collision with root package name */
    public r f6287I;

    /* renamed from: J, reason: collision with root package name */
    public r f6288J;

    public h(x xVar, e eVar) {
        super(xVar, eVar);
        this.f6282D = new RectF();
        O0.a aVar = new O0.a();
        this.f6283E = aVar;
        this.f6284F = new float[8];
        this.f6285G = new Path();
        this.f6286H = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.f6265l);
    }

    @Override // V0.b, P0.f
    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        super.a(rectF, matrix, z8);
        e eVar = this.f6286H;
        float f8 = eVar.j;
        float f9 = eVar.k;
        RectF rectF2 = this.f6282D;
        rectF2.set(0.0f, 0.0f, f8, f9);
        this.f6225n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // V0.b, S0.f
    public final void e(R3.r rVar, Object obj) {
        super.e(rVar, obj);
        if (obj == B.f3535F) {
            this.f6287I = new r(rVar, null);
        } else if (obj == 1) {
            this.f6288J = new r(rVar, null);
        }
    }

    @Override // V0.b
    public final void k(Canvas canvas, Matrix matrix, int i4, Z0.a aVar) {
        Integer num;
        int intValue;
        e eVar = this.f6286H;
        int alpha = Color.alpha(eVar.f6265l);
        if (alpha != 0) {
            r rVar = this.f6288J;
            if (rVar == null) {
                num = null;
            } else {
                num = (Integer) rVar.e();
            }
            O0.a aVar2 = this.f6283E;
            if (num != null) {
                aVar2.setColor(num.intValue());
            } else {
                aVar2.setColor(eVar.f6265l);
            }
            Q0.e eVar2 = this.f6234w.j;
            if (eVar2 == null) {
                intValue = 100;
            } else {
                intValue = ((Integer) eVar2.e()).intValue();
            }
            int i8 = (int) ((((alpha / 255.0f) * intValue) / 100.0f) * (i4 / 255.0f) * 255.0f);
            aVar2.setAlpha(i8);
            if (aVar != null) {
                if (Color.alpha(aVar.f7252d) > 0) {
                    aVar2.setShadowLayer(Math.max(aVar.f7249a, Float.MIN_VALUE), aVar.f7250b, aVar.f7251c, aVar.f7252d);
                } else {
                    aVar2.clearShadowLayer();
                }
            } else {
                aVar2.clearShadowLayer();
            }
            r rVar2 = this.f6287I;
            if (rVar2 != null) {
                aVar2.setColorFilter((ColorFilter) rVar2.e());
            }
            if (i8 > 0) {
                float[] fArr = this.f6284F;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f8 = eVar.j;
                fArr[2] = f8;
                fArr[3] = 0.0f;
                fArr[4] = f8;
                float f9 = eVar.k;
                fArr[5] = f9;
                fArr[6] = 0.0f;
                fArr[7] = f9;
                matrix.mapPoints(fArr);
                Path path = this.f6285G;
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.lineTo(fArr[0], fArr[1]);
                path.close();
                canvas.drawPath(path, aVar2);
            }
        }
    }
}
