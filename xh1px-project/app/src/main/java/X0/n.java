package X0;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final R3.r f6836a = R3.r.V("x", "y");

    public static int a(Y0.c cVar) {
        cVar.a();
        int y4 = (int) (cVar.y() * 255.0d);
        int y5 = (int) (cVar.y() * 255.0d);
        int y8 = (int) (cVar.y() * 255.0d);
        while (cVar.p()) {
            cVar.O();
        }
        cVar.e();
        return Color.argb(255, y4, y5, y8);
    }

    public static PointF b(Y0.c cVar, float f8) {
        int b4 = AbstractC1769h.b(cVar.D());
        if (b4 != 0) {
            if (b4 != 2) {
                if (b4 == 6) {
                    float y4 = (float) cVar.y();
                    float y5 = (float) cVar.y();
                    while (cVar.p()) {
                        cVar.O();
                    }
                    return new PointF(y4 * f8, y5 * f8);
                }
                throw new IllegalArgumentException("Unknown point starts with ".concat(A.j.y(cVar.D())));
            }
            cVar.d();
            float f9 = 0.0f;
            float f10 = 0.0f;
            while (cVar.p()) {
                int M8 = cVar.M(f6836a);
                if (M8 != 0) {
                    if (M8 != 1) {
                        cVar.N();
                        cVar.O();
                    } else {
                        f10 = d(cVar);
                    }
                } else {
                    f9 = d(cVar);
                }
            }
            cVar.j();
            return new PointF(f9 * f8, f10 * f8);
        }
        cVar.a();
        float y8 = (float) cVar.y();
        float y9 = (float) cVar.y();
        while (cVar.D() != 2) {
            cVar.O();
        }
        cVar.e();
        return new PointF(y8 * f8, y9 * f8);
    }

    public static ArrayList c(Y0.c cVar, float f8) {
        ArrayList arrayList = new ArrayList();
        cVar.a();
        while (cVar.D() == 1) {
            cVar.a();
            arrayList.add(b(cVar, f8));
            cVar.e();
        }
        cVar.e();
        return arrayList;
    }

    public static float d(Y0.c cVar) {
        int D7 = cVar.D();
        int b4 = AbstractC1769h.b(D7);
        if (b4 != 0) {
            if (b4 == 6) {
                return (float) cVar.y();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(A.j.y(D7)));
        }
        cVar.a();
        float y4 = (float) cVar.y();
        while (cVar.p()) {
            cVar.O();
        }
        cVar.e();
        return y4;
    }
}
