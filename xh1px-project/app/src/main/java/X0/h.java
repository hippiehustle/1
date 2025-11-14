package X0;

import android.graphics.PointF;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class h implements D {

    /* renamed from: a, reason: collision with root package name */
    public static final h f6819a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final R3.r f6820b = R3.r.V("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0021. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r2v0, types: [S0.b, java.lang.Object] */
    @Override // X0.D
    public final Object a(Y0.c cVar, float f8) {
        PointF pointF;
        PointF pointF2;
        cVar.d();
        String str = null;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i4 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z8 = true;
        int i10 = 3;
        String str2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        while (cVar.p()) {
            switch (cVar.M(f6820b)) {
                case 0:
                    str = cVar.B();
                    break;
                case 1:
                    str2 = cVar.B();
                    break;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    pointF = pointF3;
                    f9 = (float) cVar.y();
                    pointF3 = pointF;
                    break;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    PointF pointF5 = pointF3;
                    pointF2 = pointF4;
                    int z9 = cVar.z();
                    if (z9 <= 2 && z9 >= 0) {
                        i10 = AbstractC1769h.c(3)[z9];
                    } else {
                        i10 = 3;
                    }
                    pointF3 = pointF5;
                    pointF4 = pointF2;
                    break;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    i4 = cVar.z();
                    break;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    pointF = pointF3;
                    f10 = (float) cVar.y();
                    pointF3 = pointF;
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    pointF = pointF3;
                    f11 = (float) cVar.y();
                    pointF3 = pointF;
                    break;
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    i8 = n.a(cVar);
                    break;
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    i9 = n.a(cVar);
                    break;
                case 9:
                    pointF = pointF3;
                    f12 = (float) cVar.y();
                    pointF3 = pointF;
                    break;
                case 10:
                    z8 = cVar.v();
                    break;
                case 11:
                    cVar.a();
                    pointF2 = pointF4;
                    PointF pointF6 = new PointF(((float) cVar.y()) * f8, ((float) cVar.y()) * f8);
                    cVar.e();
                    pointF3 = pointF6;
                    pointF4 = pointF2;
                    break;
                case 12:
                    cVar.a();
                    pointF = pointF3;
                    pointF4 = new PointF(((float) cVar.y()) * f8, ((float) cVar.y()) * f8);
                    cVar.e();
                    pointF3 = pointF;
                    break;
                default:
                    cVar.N();
                    cVar.O();
                    break;
            }
        }
        cVar.j();
        ?? obj = new Object();
        obj.f5178a = str;
        obj.f5179b = str2;
        obj.f5180c = f9;
        obj.f5181d = i10;
        obj.f5182e = i4;
        obj.f5183f = f10;
        obj.f5184g = f11;
        obj.f5185h = i8;
        obj.f5186i = i9;
        obj.j = f12;
        obj.k = z8;
        obj.f5187l = pointF3;
        obj.f5188m = pointF4;
        return obj;
    }
}
