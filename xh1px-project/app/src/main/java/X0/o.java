package X0;

import N0.C0202j;
import a1.C0414a;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f6837a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final R3.r f6838b = R3.r.V("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: c, reason: collision with root package name */
    public static final R3.r f6839c = R3.r.V("x", "y");

    public static BaseInterpolator a(PointF pointF, PointF pointF2) {
        pointF.x = Z0.g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = Z0.g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = Z0.g.b(pointF2.x, -1.0f, 1.0f);
        float b4 = Z0.g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b4;
        Matrix matrix = Z0.k.f7301a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, b4);
        } catch (IllegalArgumentException e9) {
            if ("The Path cannot loop back on itself.".equals(e9.getMessage())) {
                return new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.BaseInterpolator] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.animation.BaseInterpolator] */
    public static C0414a b(Y0.c cVar, C0202j c0202j, float f8, D d2, boolean z8, boolean z9) {
        Object obj;
        LinearInterpolator a3;
        BaseInterpolator a4;
        BaseInterpolator a9;
        Object obj2;
        C0414a c0414a;
        R3.r rVar;
        R3.r rVar2;
        PointF pointF;
        R3.r rVar3 = f6838b;
        LinearInterpolator linearInterpolator = f6837a;
        if (z8 && z9) {
            cVar.d();
            PointF pointF2 = null;
            PointF pointF3 = null;
            PointF pointF4 = null;
            boolean z10 = false;
            PointF pointF5 = null;
            PointF pointF6 = null;
            PointF pointF7 = null;
            Object obj3 = null;
            PointF pointF8 = null;
            PointF pointF9 = null;
            float f9 = 0.0f;
            Object obj4 = null;
            while (cVar.p()) {
                int M8 = cVar.M(rVar3);
                R3.r rVar4 = f6839c;
                LinearInterpolator linearInterpolator2 = linearInterpolator;
                switch (M8) {
                    case 0:
                        rVar = rVar3;
                        f9 = (float) cVar.y();
                        linearInterpolator = linearInterpolator2;
                        rVar3 = rVar;
                        break;
                    case 1:
                        rVar = rVar3;
                        obj3 = d2.a(cVar, f8);
                        linearInterpolator = linearInterpolator2;
                        rVar3 = rVar;
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        rVar = rVar3;
                        obj4 = d2.a(cVar, f8);
                        linearInterpolator = linearInterpolator2;
                        rVar3 = rVar;
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        rVar = rVar3;
                        boolean z11 = z10;
                        Object obj5 = obj3;
                        PointF pointF10 = pointF8;
                        if (cVar.D() == 3) {
                            cVar.d();
                            float f10 = 0.0f;
                            float f11 = 0.0f;
                            float f12 = 0.0f;
                            float f13 = 0.0f;
                            while (cVar.p()) {
                                int M9 = cVar.M(rVar4);
                                if (M9 != 0) {
                                    if (M9 != 1) {
                                        cVar.O();
                                    } else if (cVar.D() == 7) {
                                        f13 = (float) cVar.y();
                                        f11 = f13;
                                    } else {
                                        cVar.a();
                                        f11 = (float) cVar.y();
                                        if (cVar.D() == 7) {
                                            f13 = (float) cVar.y();
                                        } else {
                                            f13 = f11;
                                        }
                                        cVar.e();
                                    }
                                } else if (cVar.D() == 7) {
                                    f12 = (float) cVar.y();
                                    f10 = f12;
                                } else {
                                    cVar.a();
                                    f10 = (float) cVar.y();
                                    if (cVar.D() == 7) {
                                        f12 = (float) cVar.y();
                                    } else {
                                        f12 = f10;
                                    }
                                    cVar.e();
                                }
                            }
                            PointF pointF11 = new PointF(f10, f11);
                            pointF8 = new PointF(f12, f13);
                            cVar.j();
                            pointF7 = pointF11;
                        } else {
                            pointF5 = n.b(cVar, f8);
                            pointF8 = pointF10;
                        }
                        z10 = z11;
                        linearInterpolator = linearInterpolator2;
                        obj3 = obj5;
                        rVar3 = rVar;
                        break;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        boolean z12 = z10;
                        if (cVar.D() == 3) {
                            cVar.d();
                            float f14 = 0.0f;
                            float f15 = 0.0f;
                            float f16 = 0.0f;
                            float f17 = 0.0f;
                            while (cVar.p()) {
                                Object obj6 = obj3;
                                int M10 = cVar.M(rVar4);
                                if (M10 != 0) {
                                    rVar2 = rVar3;
                                    if (M10 != 1) {
                                        cVar.O();
                                    } else if (cVar.D() == 7) {
                                        f17 = (float) cVar.y();
                                        pointF8 = pointF8;
                                        f15 = f17;
                                    } else {
                                        pointF = pointF8;
                                        cVar.a();
                                        f15 = (float) cVar.y();
                                        if (cVar.D() == 7) {
                                            f17 = (float) cVar.y();
                                        } else {
                                            f17 = f15;
                                        }
                                        cVar.e();
                                        pointF8 = pointF;
                                    }
                                } else {
                                    rVar2 = rVar3;
                                    pointF = pointF8;
                                    if (cVar.D() == 7) {
                                        f16 = (float) cVar.y();
                                        pointF8 = pointF;
                                        f14 = f16;
                                    } else {
                                        cVar.a();
                                        f14 = (float) cVar.y();
                                        if (cVar.D() == 7) {
                                            f16 = (float) cVar.y();
                                        } else {
                                            f16 = f14;
                                        }
                                        cVar.e();
                                        pointF8 = pointF;
                                    }
                                }
                                obj3 = obj6;
                                rVar3 = rVar2;
                            }
                            rVar = rVar3;
                            PointF pointF12 = new PointF(f14, f15);
                            pointF2 = new PointF(f16, f17);
                            cVar.j();
                            pointF9 = pointF12;
                        } else {
                            rVar = rVar3;
                            pointF6 = n.b(cVar, f8);
                        }
                        z10 = z12;
                        linearInterpolator = linearInterpolator2;
                        rVar3 = rVar;
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        if (cVar.z() == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        linearInterpolator = linearInterpolator2;
                        break;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        pointF3 = n.b(cVar, f8);
                        linearInterpolator = linearInterpolator2;
                        break;
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        pointF4 = n.b(cVar, f8);
                        linearInterpolator = linearInterpolator2;
                        break;
                    default:
                        cVar.O();
                        linearInterpolator = linearInterpolator2;
                        break;
                }
            }
            LinearInterpolator linearInterpolator3 = linearInterpolator;
            boolean z13 = z10;
            Object obj7 = obj3;
            PointF pointF13 = pointF8;
            cVar.j();
            if (z13) {
                obj2 = obj7;
            } else {
                if (pointF5 != null && pointF6 != null) {
                    linearInterpolator3 = a(pointF5, pointF6);
                } else if (pointF7 != null && pointF13 != null && pointF9 != null && pointF2 != null) {
                    a4 = a(pointF7, pointF9);
                    a9 = a(pointF13, pointF2);
                    obj2 = obj4;
                    linearInterpolator3 = null;
                    if (a4 == null && a9 != null) {
                        c0414a = new C0414a(c0202j, obj7, obj2, a4, a9, f9);
                    } else {
                        c0414a = new C0414a(c0202j, obj7, obj2, linearInterpolator3, f9, (Float) null);
                    }
                    c0414a.f7682o = pointF3;
                    c0414a.f7683p = pointF4;
                    return c0414a;
                }
                obj2 = obj4;
            }
            a4 = null;
            a9 = null;
            if (a4 == null) {
            }
            c0414a = new C0414a(c0202j, obj7, obj2, linearInterpolator3, f9, (Float) null);
            c0414a.f7682o = pointF3;
            c0414a.f7683p = pointF4;
            return c0414a;
        }
        R3.r rVar5 = rVar3;
        if (z8) {
            cVar.d();
            PointF pointF14 = null;
            PointF pointF15 = null;
            PointF pointF16 = null;
            PointF pointF17 = null;
            boolean z14 = false;
            Object obj8 = null;
            float f18 = 0.0f;
            Object obj9 = null;
            while (cVar.p()) {
                R3.r rVar6 = rVar5;
                switch (cVar.M(rVar6)) {
                    case 0:
                        rVar5 = rVar6;
                        f18 = (float) cVar.y();
                        continue;
                    case 1:
                        obj8 = d2.a(cVar, f8);
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        obj9 = d2.a(cVar, f8);
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        pointF17 = n.b(cVar, 1.0f);
                        break;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        pointF14 = n.b(cVar, 1.0f);
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        if (cVar.z() == 1) {
                            z14 = true;
                            break;
                        } else {
                            z14 = false;
                            break;
                        }
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        pointF15 = n.b(cVar, f8);
                        break;
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        pointF16 = n.b(cVar, f8);
                        break;
                    default:
                        cVar.O();
                        break;
                }
                rVar5 = rVar6;
            }
            cVar.j();
            if (z14) {
                obj = obj8;
            } else {
                if (pointF17 != null && pointF14 != null) {
                    a3 = a(pointF17, pointF14);
                    obj = obj9;
                    C0414a c0414a2 = new C0414a(c0202j, obj8, obj, a3, f18, (Float) null);
                    c0414a2.f7682o = pointF15;
                    c0414a2.f7683p = pointF16;
                    return c0414a2;
                }
                obj = obj9;
            }
            a3 = linearInterpolator;
            C0414a c0414a22 = new C0414a(c0202j, obj8, obj, a3, f18, (Float) null);
            c0414a22.f7682o = pointF15;
            c0414a22.f7683p = pointF16;
            return c0414a22;
        }
        return new C0414a(d2.a(cVar, f8));
    }
}
