package Q0;

import N0.B;
import a1.C0414a;
import a1.C0416c;
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f4752a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f4753b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f4754c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f4755d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f4756e;

    /* renamed from: f, reason: collision with root package name */
    public e f4757f;

    /* renamed from: g, reason: collision with root package name */
    public e f4758g;

    /* renamed from: h, reason: collision with root package name */
    public e f4759h;

    /* renamed from: i, reason: collision with root package name */
    public e f4760i;
    public e j;
    public i k;

    /* renamed from: l, reason: collision with root package name */
    public i f4761l;

    /* renamed from: m, reason: collision with root package name */
    public e f4762m;

    /* renamed from: n, reason: collision with root package name */
    public e f4763n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4764o;

    public q(T0.d dVar) {
        e r02;
        e r03;
        e r04;
        i r05;
        i r06;
        i r07;
        P0.c cVar = dVar.f5489a;
        if (cVar == null) {
            r02 = null;
        } else {
            r02 = cVar.r0();
        }
        this.f4757f = r02;
        T0.e eVar = dVar.f5490b;
        if (eVar == null) {
            r03 = null;
        } else {
            r03 = eVar.r0();
        }
        this.f4758g = r03;
        T0.a aVar = dVar.f5491c;
        if (aVar == null) {
            r04 = null;
        } else {
            r04 = aVar.r0();
        }
        this.f4759h = r04;
        T0.b bVar = dVar.f5492d;
        if (bVar == null) {
            r05 = null;
        } else {
            r05 = bVar.r0();
        }
        this.f4760i = r05;
        T0.b bVar2 = dVar.f5494f;
        if (bVar2 == null) {
            r06 = null;
        } else {
            r06 = bVar2.r0();
        }
        this.k = r06;
        this.f4764o = dVar.j;
        if (r06 != null) {
            this.f4753b = new Matrix();
            this.f4754c = new Matrix();
            this.f4755d = new Matrix();
            this.f4756e = new float[9];
        } else {
            this.f4753b = null;
            this.f4754c = null;
            this.f4755d = null;
            this.f4756e = null;
        }
        T0.b bVar3 = dVar.f5495g;
        if (bVar3 == null) {
            r07 = null;
        } else {
            r07 = bVar3.r0();
        }
        this.f4761l = r07;
        T0.a aVar2 = dVar.f5493e;
        if (aVar2 != null) {
            this.j = aVar2.r0();
        }
        T0.b bVar4 = dVar.f5496h;
        if (bVar4 != null) {
            this.f4762m = bVar4.r0();
        } else {
            this.f4762m = null;
        }
        T0.b bVar5 = dVar.f5497i;
        if (bVar5 != null) {
            this.f4763n = bVar5.r0();
        } else {
            this.f4763n = null;
        }
    }

    public final void a(V0.b bVar) {
        bVar.d(this.j);
        bVar.d(this.f4762m);
        bVar.d(this.f4763n);
        bVar.d(this.f4757f);
        bVar.d(this.f4758g);
        bVar.d(this.f4759h);
        bVar.d(this.f4760i);
        bVar.d(this.k);
        bVar.d(this.f4761l);
    }

    public final void b(a aVar) {
        e eVar = this.j;
        if (eVar != null) {
            eVar.a(aVar);
        }
        e eVar2 = this.f4762m;
        if (eVar2 != null) {
            eVar2.a(aVar);
        }
        e eVar3 = this.f4763n;
        if (eVar3 != null) {
            eVar3.a(aVar);
        }
        e eVar4 = this.f4757f;
        if (eVar4 != null) {
            eVar4.a(aVar);
        }
        e eVar5 = this.f4758g;
        if (eVar5 != null) {
            eVar5.a(aVar);
        }
        e eVar6 = this.f4759h;
        if (eVar6 != null) {
            eVar6.a(aVar);
        }
        e eVar7 = this.f4760i;
        if (eVar7 != null) {
            eVar7.a(aVar);
        }
        i iVar = this.k;
        if (iVar != null) {
            iVar.a(aVar);
        }
        i iVar2 = this.f4761l;
        if (iVar2 != null) {
            iVar2.a(aVar);
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [Q0.e, Q0.i] */
    /* JADX WARN: Type inference failed for: r6v6, types: [Q0.e, Q0.i] */
    public final boolean c(R3.r rVar, Object obj) {
        Float valueOf = Float.valueOf(100.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        if (obj == B.f3540a) {
            e eVar = this.f4757f;
            if (eVar == null) {
                this.f4757f = new r(rVar, new PointF());
                return true;
            }
            eVar.j(rVar);
            return true;
        }
        if (obj == B.f3541b) {
            e eVar2 = this.f4758g;
            if (eVar2 == null) {
                this.f4758g = new r(rVar, new PointF());
                return true;
            }
            eVar2.j(rVar);
            return true;
        }
        if (obj == B.f3542c) {
            e eVar3 = this.f4758g;
            if (eVar3 instanceof o) {
                o oVar = (o) eVar3;
                R3.r rVar2 = oVar.f4747m;
                oVar.f4747m = rVar;
                return true;
            }
        }
        if (obj == B.f3543d) {
            e eVar4 = this.f4758g;
            if (eVar4 instanceof o) {
                o oVar2 = (o) eVar4;
                R3.r rVar3 = oVar2.f4748n;
                oVar2.f4748n = rVar;
                return true;
            }
        }
        if (obj == B.j) {
            e eVar5 = this.f4759h;
            if (eVar5 == null) {
                this.f4759h = new r(rVar, new C0416c());
                return true;
            }
            eVar5.j(rVar);
            return true;
        }
        if (obj == B.k) {
            e eVar6 = this.f4760i;
            if (eVar6 == null) {
                this.f4760i = new r(rVar, valueOf2);
                return true;
            }
            eVar6.j(rVar);
            return true;
        }
        if (obj == 3) {
            e eVar7 = this.j;
            if (eVar7 == null) {
                this.j = new r(rVar, 100);
                return true;
            }
            eVar7.j(rVar);
            return true;
        }
        if (obj == B.f3561x) {
            e eVar8 = this.f4762m;
            if (eVar8 == null) {
                this.f4762m = new r(rVar, valueOf);
                return true;
            }
            eVar8.j(rVar);
            return true;
        }
        if (obj == B.f3562y) {
            e eVar9 = this.f4763n;
            if (eVar9 == null) {
                this.f4763n = new r(rVar, valueOf);
                return true;
            }
            eVar9.j(rVar);
            return true;
        }
        if (obj == B.f3549l) {
            if (this.k == null) {
                this.k = new e(Collections.singletonList(new C0414a(valueOf2)));
            }
            this.k.j(rVar);
            return true;
        }
        if (obj == B.f3550m) {
            if (this.f4761l == null) {
                this.f4761l = new e(Collections.singletonList(new C0414a(valueOf2)));
            }
            this.f4761l.j(rVar);
            return true;
        }
        return false;
    }

    public final void d() {
        for (int i4 = 0; i4 < 9; i4++) {
            this.f4756e[i4] = 0.0f;
        }
    }

    public final Matrix e() {
        float l6;
        PointF pointF;
        C0416c c0416c;
        float cos;
        float sin;
        PointF pointF2;
        Matrix matrix = this.f4752a;
        matrix.reset();
        e eVar = this.f4758g;
        if (eVar != null && (pointF2 = (PointF) eVar.e()) != null) {
            float f8 = pointF2.x;
            if (f8 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f8, pointF2.y);
            }
        }
        if (this.f4764o) {
            if (eVar != null) {
                float f9 = eVar.f4721d;
                PointF pointF3 = (PointF) eVar.e();
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                eVar.i(1.0E-4f + f9);
                PointF pointF4 = (PointF) eVar.e();
                eVar.i(f9);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f11, pointF4.x - f10)));
            }
        } else {
            e eVar2 = this.f4760i;
            if (eVar2 != null) {
                if (eVar2 instanceof r) {
                    l6 = ((Float) eVar2.e()).floatValue();
                } else {
                    l6 = ((i) eVar2).l();
                }
                if (l6 != 0.0f) {
                    matrix.preRotate(l6);
                }
            }
        }
        if (this.k != null) {
            if (this.f4761l == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-r4.l()) + 90.0f));
            }
            if (this.f4761l == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-r6.l()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(r1.l()));
            d();
            float[] fArr = this.f4756e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f12 = -sin;
            fArr[3] = f12;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f4753b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f4754c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = cos;
            fArr[1] = f12;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f4755d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        e eVar3 = this.f4759h;
        if (eVar3 != null && (c0416c = (C0416c) eVar3.e()) != null) {
            float f13 = c0416c.f7691a;
            if (f13 != 1.0f || c0416c.f7692b != 1.0f) {
                matrix.preScale(f13, c0416c.f7692b);
            }
        }
        e eVar4 = this.f4757f;
        if (eVar4 != null && (pointF = (PointF) eVar4.e()) != null) {
            float f14 = pointF.x;
            if (f14 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f14, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f8) {
        PointF pointF;
        C0416c c0416c;
        float f9;
        e eVar = this.f4758g;
        PointF pointF2 = null;
        if (eVar == null) {
            pointF = null;
        } else {
            pointF = (PointF) eVar.e();
        }
        e eVar2 = this.f4759h;
        if (eVar2 == null) {
            c0416c = null;
        } else {
            c0416c = (C0416c) eVar2.e();
        }
        Matrix matrix = this.f4752a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f8, pointF.y * f8);
        }
        if (c0416c != null) {
            double d2 = f8;
            matrix.preScale((float) Math.pow(c0416c.f7691a, d2), (float) Math.pow(c0416c.f7692b, d2));
        }
        e eVar3 = this.f4760i;
        if (eVar3 != null) {
            float floatValue = ((Float) eVar3.e()).floatValue();
            e eVar4 = this.f4757f;
            if (eVar4 != null) {
                pointF2 = (PointF) eVar4.e();
            }
            float f10 = floatValue * f8;
            float f11 = 0.0f;
            if (pointF2 == null) {
                f9 = 0.0f;
            } else {
                f9 = pointF2.x;
            }
            if (pointF2 != null) {
                f11 = pointF2.y;
            }
            matrix.preRotate(f10, f9, f11);
        }
        return matrix;
    }
}
