package Q0;

import N0.C0202j;
import a1.C0414a;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class l extends C0414a {

    /* renamed from: q, reason: collision with root package name */
    public Path f4737q;

    /* renamed from: r, reason: collision with root package name */
    public final C0414a f4738r;

    public l(C0202j c0202j, C0414a c0414a) {
        super(c0202j, (PointF) c0414a.f7671b, (PointF) c0414a.f7672c, c0414a.f7673d, c0414a.f7674e, c0414a.f7675f, c0414a.f7676g, c0414a.f7677h);
        this.f4738r = c0414a;
        d();
    }

    public final void d() {
        boolean z8;
        Object obj;
        Object obj2 = this.f7672c;
        Object obj3 = this.f7671b;
        if (obj2 != null && obj3 != null && ((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (obj3 != null && (obj = this.f7672c) != null && !z8) {
            PointF pointF = (PointF) obj3;
            PointF pointF2 = (PointF) obj;
            C0414a c0414a = this.f4738r;
            PointF pointF3 = c0414a.f7682o;
            PointF pointF4 = c0414a.f7683p;
            Matrix matrix = Z0.k.f7301a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
                float f8 = pointF3.x + pointF.x;
                float f9 = pointF.y + pointF3.y;
                float f10 = pointF2.x;
                float f11 = f10 + pointF4.x;
                float f12 = pointF2.y;
                path.cubicTo(f8, f9, f11, f12 + pointF4.y, f10, f12);
            } else {
                path.lineTo(pointF2.x, pointF2.y);
            }
            this.f4737q = path;
        }
    }
}
