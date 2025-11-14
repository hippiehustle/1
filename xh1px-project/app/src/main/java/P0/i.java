package P0;

import N0.B;
import N0.C0202j;
import N0.x;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements f, Q0.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final String f4364a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4365b;

    /* renamed from: c, reason: collision with root package name */
    public final V0.b f4366c;

    /* renamed from: d, reason: collision with root package name */
    public final t.g f4367d = new t.g((Object) null);

    /* renamed from: e, reason: collision with root package name */
    public final t.g f4368e = new t.g((Object) null);

    /* renamed from: f, reason: collision with root package name */
    public final Path f4369f;

    /* renamed from: g, reason: collision with root package name */
    public final O0.a f4370g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f4371h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4372i;
    public final int j;
    public final Q0.j k;

    /* renamed from: l, reason: collision with root package name */
    public final Q0.f f4373l;

    /* renamed from: m, reason: collision with root package name */
    public final Q0.j f4374m;

    /* renamed from: n, reason: collision with root package name */
    public final Q0.j f4375n;

    /* renamed from: o, reason: collision with root package name */
    public Q0.r f4376o;

    /* renamed from: p, reason: collision with root package name */
    public Q0.r f4377p;

    /* renamed from: q, reason: collision with root package name */
    public final x f4378q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4379r;

    /* renamed from: s, reason: collision with root package name */
    public Q0.e f4380s;

    /* renamed from: t, reason: collision with root package name */
    public float f4381t;

    public i(x xVar, C0202j c0202j, V0.b bVar, U0.d dVar) {
        Path path = new Path();
        this.f4369f = path;
        this.f4370g = new O0.a(1, 0);
        this.f4371h = new RectF();
        this.f4372i = new ArrayList();
        this.f4381t = 0.0f;
        this.f4366c = bVar;
        this.f4364a = dVar.f5951g;
        this.f4365b = dVar.f5952h;
        this.f4378q = xVar;
        this.j = dVar.f5945a;
        path.setFillType(dVar.f5946b);
        this.f4379r = (int) (c0202j.b() / 32.0f);
        Q0.e r02 = dVar.f5947c.r0();
        this.k = (Q0.j) r02;
        r02.a(this);
        bVar.d(r02);
        Q0.e r03 = dVar.f5948d.r0();
        this.f4373l = (Q0.f) r03;
        r03.a(this);
        bVar.d(r03);
        Q0.e r04 = dVar.f5949e.r0();
        this.f4374m = (Q0.j) r04;
        r04.a(this);
        bVar.d(r04);
        Q0.e r05 = dVar.f5950f.r0();
        this.f4375n = (Q0.j) r05;
        r05.a(this);
        bVar.d(r05);
        if (bVar.l() != null) {
            Q0.i r06 = ((T0.b) bVar.l().f6489e).r0();
            this.f4380s = r06;
            r06.a(this);
            bVar.d(this.f4380s);
        }
    }

    @Override // P0.f
    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        Path path = this.f4369f;
        path.reset();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4372i;
            if (i4 < arrayList.size()) {
                path.addPath(((n) arrayList.get(i4)).f(), matrix);
                i4++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // Q0.a
    public final void b() {
        this.f4378q.invalidateSelf();
    }

    @Override // P0.d
    public final void c(List list, List list2) {
        for (int i4 = 0; i4 < list2.size(); i4++) {
            d dVar = (d) list2.get(i4);
            if (dVar instanceof n) {
                this.f4372i.add((n) dVar);
            }
        }
    }

    public final int[] d(int[] iArr) {
        Q0.r rVar = this.f4377p;
        if (rVar != null) {
            Integer[] numArr = (Integer[]) rVar.e();
            int i4 = 0;
            if (iArr.length == numArr.length) {
                while (i4 < iArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i4 < numArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            }
        }
        return iArr;
    }

    @Override // S0.f
    public final void e(R3.r rVar, Object obj) {
        PointF pointF = B.f3540a;
        if (obj == 4) {
            this.f4373l.j(rVar);
            return;
        }
        ColorFilter colorFilter = B.f3535F;
        V0.b bVar = this.f4366c;
        if (obj == colorFilter) {
            Q0.r rVar2 = this.f4376o;
            if (rVar2 != null) {
                bVar.o(rVar2);
            }
            Q0.r rVar3 = new Q0.r(rVar, null);
            this.f4376o = rVar3;
            rVar3.a(this);
            bVar.d(this.f4376o);
            return;
        }
        if (obj == B.f3536G) {
            Q0.r rVar4 = this.f4377p;
            if (rVar4 != null) {
                bVar.o(rVar4);
            }
            this.f4367d.a();
            this.f4368e.a();
            Q0.r rVar5 = new Q0.r(rVar, null);
            this.f4377p = rVar5;
            rVar5.a(this);
            bVar.d(this.f4377p);
            return;
        }
        if (obj == B.f3544e) {
            Q0.e eVar = this.f4380s;
            if (eVar != null) {
                eVar.j(rVar);
                return;
            }
            Q0.r rVar6 = new Q0.r(rVar, null);
            this.f4380s = rVar6;
            rVar6.a(this);
            bVar.d(this.f4380s);
        }
    }

    @Override // P0.f
    public final void g(Canvas canvas, Matrix matrix, int i4, Z0.a aVar) {
        float[] fArr;
        int[] iArr;
        Shader shader;
        int[] iArr2;
        if (this.f4365b) {
            return;
        }
        Path path = this.f4369f;
        path.reset();
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f4372i;
            if (i8 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i8)).f(), matrix);
            i8++;
        }
        path.computeBounds(this.f4371h, false);
        int i9 = this.j;
        Q0.j jVar = this.k;
        Q0.j jVar2 = this.f4375n;
        Q0.j jVar3 = this.f4374m;
        if (i9 == 1) {
            long i10 = i();
            t.g gVar = this.f4367d;
            shader = (LinearGradient) gVar.c(i10);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                U0.c cVar = (U0.c) jVar.e();
                int[] d2 = d(cVar.f5944b);
                float[] fArr2 = cVar.f5943a;
                if (d2.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{d2[0], d2[0]};
                } else {
                    iArr2 = d2;
                }
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                gVar.g(i10, shader);
            }
        } else {
            long i11 = i();
            t.g gVar2 = this.f4368e;
            RadialGradient radialGradient = (RadialGradient) gVar2.c(i11);
            if (radialGradient != null) {
                shader = radialGradient;
            } else {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                U0.c cVar2 = (U0.c) jVar.e();
                int[] d3 = d(cVar2.f5944b);
                float[] fArr3 = cVar2.f5943a;
                if (d3.length < 2) {
                    iArr = new int[]{d3[0], d3[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = d3;
                }
                float f8 = pointF3.x;
                float f9 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f8, pointF4.y - f9);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f8, f9, hypot, iArr, fArr, Shader.TileMode.CLAMP);
                gVar2.g(i11, radialGradient2);
                shader = radialGradient2;
            }
        }
        shader.setLocalMatrix(matrix);
        O0.a aVar2 = this.f4370g;
        aVar2.setShader(shader);
        Q0.r rVar = this.f4376o;
        if (rVar != null) {
            aVar2.setColorFilter((ColorFilter) rVar.e());
        }
        Q0.e eVar = this.f4380s;
        if (eVar != null) {
            float floatValue = ((Float) eVar.e()).floatValue();
            if (floatValue == 0.0f) {
                aVar2.setMaskFilter(null);
            } else if (floatValue != this.f4381t) {
                aVar2.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f4381t = floatValue;
        }
        float intValue = ((Integer) this.f4373l.e()).intValue() / 100.0f;
        aVar2.setAlpha(Z0.g.c((int) (i4 * intValue)));
        if (aVar != null) {
            aVar.a((int) (intValue * 255.0f), aVar2);
        }
        canvas.drawPath(path, aVar2);
    }

    @Override // P0.d
    public final String getName() {
        return this.f4364a;
    }

    @Override // S0.f
    public final void h(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2) {
        Z0.g.g(eVar, i4, arrayList, eVar2, this);
    }

    public final int i() {
        int i4;
        float f8 = this.f4374m.f4721d;
        float f9 = this.f4379r;
        int round = Math.round(f8 * f9);
        int round2 = Math.round(this.f4375n.f4721d * f9);
        int round3 = Math.round(this.k.f4721d * f9);
        if (round != 0) {
            i4 = 527 * round;
        } else {
            i4 = 17;
        }
        if (round2 != 0) {
            i4 = i4 * 31 * round2;
        }
        if (round3 != 0) {
            return i4 * 31 * round3;
        }
        return i4;
    }
}
