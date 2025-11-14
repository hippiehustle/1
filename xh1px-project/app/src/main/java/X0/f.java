package X0;

import a1.C0416c;
import android.graphics.Color;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class f implements D {

    /* renamed from: b, reason: collision with root package name */
    public static final f f6811b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f6812c = new f(1);

    /* renamed from: d, reason: collision with root package name */
    public static final f f6813d = new f(2);

    /* renamed from: e, reason: collision with root package name */
    public static final f f6814e = new f(3);

    /* renamed from: f, reason: collision with root package name */
    public static final f f6815f = new f(4);

    /* renamed from: g, reason: collision with root package name */
    public static final f f6816g = new f(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6817a;

    public /* synthetic */ f(int i4) {
        this.f6817a = i4;
    }

    @Override // X0.D
    public final Object a(Y0.c cVar, float f8) {
        double d2;
        switch (this.f6817a) {
            case 0:
                boolean z8 = true;
                if (cVar.D() != 1) {
                    z8 = false;
                }
                if (z8) {
                    cVar.a();
                }
                double y4 = cVar.y();
                double y5 = cVar.y();
                double y8 = cVar.y();
                if (cVar.D() == 7) {
                    d2 = cVar.y();
                } else {
                    d2 = 1.0d;
                }
                if (z8) {
                    cVar.e();
                }
                if (y4 <= 1.0d && y5 <= 1.0d && y8 <= 1.0d) {
                    y4 *= 255.0d;
                    y5 *= 255.0d;
                    y8 *= 255.0d;
                    if (d2 <= 1.0d) {
                        d2 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) d2, (int) y4, (int) y5, (int) y8));
            case 1:
                return Float.valueOf(n.d(cVar) * f8);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return Integer.valueOf(Math.round(n.d(cVar) * f8));
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return n.b(cVar, f8);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                int D7 = cVar.D();
                if (D7 == 1) {
                    return n.b(cVar, f8);
                }
                if (D7 == 3) {
                    return n.b(cVar, f8);
                }
                if (D7 == 7) {
                    PointF pointF = new PointF(((float) cVar.y()) * f8, ((float) cVar.y()) * f8);
                    while (cVar.p()) {
                        cVar.O();
                    }
                    return pointF;
                }
                throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(A.j.y(D7)));
            default:
                boolean z9 = true;
                if (cVar.D() != 1) {
                    z9 = false;
                }
                if (z9) {
                    cVar.a();
                }
                float y9 = (float) cVar.y();
                float y10 = (float) cVar.y();
                while (cVar.p()) {
                    cVar.O();
                }
                if (z9) {
                    cVar.e();
                }
                return new C0416c((y9 / 100.0f) * f8, (y10 / 100.0f) * f8);
        }
    }
}
