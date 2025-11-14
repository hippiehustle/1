package Q0;

import a1.C0414a;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends k {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f4739i;
    public final float[] j;
    public final float[] k;

    /* renamed from: l, reason: collision with root package name */
    public final PathMeasure f4740l;

    /* renamed from: m, reason: collision with root package name */
    public l f4741m;

    public m(ArrayList arrayList) {
        super(arrayList);
        this.f4739i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.f4740l = new PathMeasure();
    }

    @Override // Q0.e
    public final Object f(C0414a c0414a, float f8) {
        float f9;
        l lVar = (l) c0414a;
        Path path = lVar.f4737q;
        R3.r rVar = this.f4722e;
        if (rVar != null && c0414a.f7677h != null) {
            f9 = f8;
            PointF pointF = (PointF) rVar.T(lVar.f7676g, lVar.f7677h.floatValue(), (PointF) lVar.f7671b, (PointF) lVar.f7672c, d(), f9, this.f4721d);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f9 = f8;
        }
        if (path == null) {
            return (PointF) c0414a.f7671b;
        }
        l lVar2 = this.f4741m;
        PathMeasure pathMeasure = this.f4740l;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.f4741m = lVar;
        }
        float length = pathMeasure.getLength();
        float f10 = f9 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f10, fArr, fArr2);
        float f11 = fArr[0];
        float f12 = fArr[1];
        PointF pointF2 = this.f4739i;
        pointF2.set(f11, f12);
        if (f10 < 0.0f) {
            pointF2.offset(fArr2[0] * f10, fArr2[1] * f10);
            return pointF2;
        }
        if (f10 > length) {
            float f13 = f10 - length;
            pointF2.offset(fArr2[0] * f13, fArr2[1] * f13);
        }
        return pointF2;
    }
}
