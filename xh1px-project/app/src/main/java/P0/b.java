package P0;

import N0.B;
import N0.x;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements Q0.a, l, f {

    /* renamed from: e, reason: collision with root package name */
    public final x f4325e;

    /* renamed from: f, reason: collision with root package name */
    public final V0.b f4326f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f4328h;

    /* renamed from: i, reason: collision with root package name */
    public final O0.a f4329i;
    public final Q0.i j;
    public final Q0.f k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4330l;

    /* renamed from: m, reason: collision with root package name */
    public final Q0.i f4331m;

    /* renamed from: n, reason: collision with root package name */
    public Q0.r f4332n;

    /* renamed from: o, reason: collision with root package name */
    public Q0.e f4333o;

    /* renamed from: p, reason: collision with root package name */
    public float f4334p;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f4321a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f4322b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f4323c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f4324d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4327g = new ArrayList();

    public b(x xVar, V0.b bVar, Paint.Cap cap, Paint.Join join, float f8, T0.a aVar, T0.b bVar2, ArrayList arrayList, T0.b bVar3) {
        O0.a aVar2 = new O0.a(1, 0);
        this.f4329i = aVar2;
        this.f4334p = 0.0f;
        this.f4325e = xVar;
        this.f4326f = bVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f8);
        this.k = (Q0.f) aVar.r0();
        this.j = bVar2.r0();
        if (bVar3 == null) {
            this.f4331m = null;
        } else {
            this.f4331m = bVar3.r0();
        }
        this.f4330l = new ArrayList(arrayList.size());
        this.f4328h = new float[arrayList.size()];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f4330l.add(((T0.b) arrayList.get(i4)).r0());
        }
        bVar.d(this.k);
        bVar.d(this.j);
        for (int i8 = 0; i8 < this.f4330l.size(); i8++) {
            bVar.d((Q0.e) this.f4330l.get(i8));
        }
        Q0.i iVar = this.f4331m;
        if (iVar != null) {
            bVar.d(iVar);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((Q0.e) this.f4330l.get(i9)).a(this);
        }
        Q0.i iVar2 = this.f4331m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (bVar.l() != null) {
            Q0.i r02 = ((T0.b) bVar.l().f6489e).r0();
            this.f4333o = r02;
            r02.a(this);
            bVar.d(this.f4333o);
        }
    }

    @Override // P0.f
    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        Path path = this.f4322b;
        path.reset();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4327g;
            if (i4 < arrayList.size()) {
                a aVar = (a) arrayList.get(i4);
                for (int i8 = 0; i8 < aVar.f4319a.size(); i8++) {
                    path.addPath(((n) aVar.f4319a.get(i8)).f(), matrix);
                }
                i4++;
            } else {
                RectF rectF2 = this.f4324d;
                path.computeBounds(rectF2, false);
                float l6 = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - l6, rectF2.top - l6, rectF2.right + l6, rectF2.bottom + l6);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // Q0.a
    public final void b() {
        this.f4325e.invalidateSelf();
    }

    @Override // P0.d
    public final void c(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        a aVar = null;
        u uVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList2.get(size);
            if (dVar instanceof u) {
                u uVar2 = (u) dVar;
                if (uVar2.f4449c == 2) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f4327g;
            if (size2 < 0) {
                break;
            }
            d dVar2 = (d) list2.get(size2);
            if (dVar2 instanceof u) {
                u uVar3 = (u) dVar2;
                if (uVar3.f4449c == 2) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(uVar3);
                    uVar3.d(this);
                    aVar = aVar2;
                }
            }
            if (dVar2 instanceof n) {
                if (aVar == null) {
                    aVar = new a(uVar);
                }
                aVar.f4319a.add((n) dVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    @Override // S0.f
    public void e(R3.r rVar, Object obj) {
        PointF pointF = B.f3540a;
        if (obj == 4) {
            this.k.j(rVar);
            return;
        }
        if (obj == B.f3551n) {
            this.j.j(rVar);
            return;
        }
        ColorFilter colorFilter = B.f3535F;
        V0.b bVar = this.f4326f;
        if (obj == colorFilter) {
            Q0.r rVar2 = this.f4332n;
            if (rVar2 != null) {
                bVar.o(rVar2);
            }
            Q0.r rVar3 = new Q0.r(rVar, null);
            this.f4332n = rVar3;
            rVar3.a(this);
            bVar.d(this.f4332n);
            return;
        }
        if (obj == B.f3544e) {
            Q0.e eVar = this.f4333o;
            if (eVar != null) {
                eVar.j(rVar);
                return;
            }
            Q0.r rVar4 = new Q0.r(rVar, null);
            this.f4333o = rVar4;
            rVar4.a(this);
            bVar.d(this.f4333o);
        }
    }

    @Override // P0.f
    public void g(Canvas canvas, Matrix matrix, int i4, Z0.a aVar) {
        int i8;
        float f8;
        float f9;
        float f10;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        float floatValue;
        b bVar = this;
        float[] fArr2 = (float[]) Z0.k.f7305e.get();
        boolean z8 = false;
        fArr2[0] = 0.0f;
        int i9 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] != fArr2[2] && fArr2[1] != fArr2[3]) {
            float f11 = 100.0f;
            float intValue = ((Integer) bVar.k.e()).intValue() / 100.0f;
            int c6 = Z0.g.c((int) (i4 * intValue));
            O0.a aVar2 = bVar.f4329i;
            aVar2.setAlpha(c6);
            aVar2.setStrokeWidth(bVar.j.l());
            if (aVar2.getStrokeWidth() > 0.0f) {
                ArrayList arrayList = bVar.f4330l;
                if (!arrayList.isEmpty()) {
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        fArr = bVar.f4328h;
                        if (i10 >= size) {
                            break;
                        }
                        float floatValue2 = ((Float) ((Q0.e) arrayList.get(i10)).e()).floatValue();
                        fArr[i10] = floatValue2;
                        if (i10 % 2 == 0) {
                            if (floatValue2 < 1.0f) {
                                fArr[i10] = 1.0f;
                            }
                        } else if (floatValue2 < 0.1f) {
                            fArr[i10] = 0.1f;
                        }
                        i10++;
                    }
                    Q0.i iVar = bVar.f4331m;
                    if (iVar == null) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) iVar.e()).floatValue();
                    }
                    aVar2.setPathEffect(new DashPathEffect(fArr, floatValue));
                }
                Q0.r rVar = bVar.f4332n;
                if (rVar != null) {
                    aVar2.setColorFilter((ColorFilter) rVar.e());
                }
                Q0.e eVar = bVar.f4333o;
                if (eVar != null) {
                    float floatValue3 = ((Float) eVar.e()).floatValue();
                    if (floatValue3 == 0.0f) {
                        aVar2.setMaskFilter(null);
                    } else if (floatValue3 != bVar.f4334p) {
                        V0.b bVar2 = bVar.f4326f;
                        if (bVar2.f6211A == floatValue3) {
                            blurMaskFilter = bVar2.f6212B;
                        } else {
                            BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue3 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                            bVar2.f6212B = blurMaskFilter2;
                            bVar2.f6211A = floatValue3;
                            blurMaskFilter = blurMaskFilter2;
                        }
                        aVar2.setMaskFilter(blurMaskFilter);
                    }
                    bVar.f4334p = floatValue3;
                }
                if (aVar != null) {
                    aVar.a((int) (intValue * 255.0f), aVar2);
                }
                canvas.save();
                canvas.concat(matrix);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = bVar.f4327g;
                    if (i11 < arrayList2.size()) {
                        a aVar3 = (a) arrayList2.get(i11);
                        u uVar = aVar3.f4320b;
                        ArrayList arrayList3 = aVar3.f4319a;
                        Path path = bVar.f4322b;
                        if (uVar != null) {
                            path.reset();
                            for (int size2 = arrayList3.size() - i9; size2 >= 0; size2--) {
                                path.addPath(((n) arrayList3.get(size2)).f());
                            }
                            float floatValue4 = ((Float) uVar.f4450d.e()).floatValue() / f11;
                            float floatValue5 = ((Float) uVar.f4451e.e()).floatValue() / f11;
                            float floatValue6 = ((Float) uVar.f4452f.e()).floatValue() / 360.0f;
                            if (floatValue4 < 0.01f && floatValue5 > 0.99f) {
                                canvas.drawPath(path, aVar2);
                            } else {
                                PathMeasure pathMeasure = bVar.f4321a;
                                pathMeasure.setPath(path, z8);
                                float length = pathMeasure.getLength();
                                while (pathMeasure.nextContour()) {
                                    length += pathMeasure.getLength();
                                }
                                float f12 = floatValue6 * length;
                                float f13 = (floatValue4 * length) + f12;
                                float min = Math.min((floatValue5 * length) + f12, (f13 + length) - 1.0f);
                                int size3 = arrayList3.size() - i9;
                                float f14 = 0.0f;
                                while (size3 >= 0) {
                                    int i12 = i9;
                                    Path f15 = ((n) arrayList3.get(size3)).f();
                                    Path path2 = bVar.f4323c;
                                    path2.set(f15);
                                    pathMeasure.setPath(path2, z8);
                                    float length2 = pathMeasure.getLength();
                                    if (min > length) {
                                        float f16 = min - length;
                                        if (f16 < f14 + length2 && f14 < f16) {
                                            if (f13 > length) {
                                                f10 = (f13 - length) / length2;
                                            } else {
                                                f10 = 0.0f;
                                            }
                                            Z0.k.a(path2, f10, Math.min(f16 / length2, 1.0f), 0.0f);
                                            canvas.drawPath(path2, aVar2);
                                            f14 += length2;
                                            size3--;
                                            bVar = this;
                                            i9 = i12;
                                            z8 = false;
                                        }
                                    }
                                    float f17 = f14 + length2;
                                    if (f17 >= f13 && f14 <= min) {
                                        if (f17 <= min && f13 < f14) {
                                            canvas.drawPath(path2, aVar2);
                                        } else {
                                            if (f13 < f14) {
                                                f8 = 0.0f;
                                            } else {
                                                f8 = (f13 - f14) / length2;
                                            }
                                            if (min > f17) {
                                                f9 = 1.0f;
                                            } else {
                                                f9 = (min - f14) / length2;
                                            }
                                            Z0.k.a(path2, f8, f9, 0.0f);
                                            canvas.drawPath(path2, aVar2);
                                        }
                                    }
                                    f14 += length2;
                                    size3--;
                                    bVar = this;
                                    i9 = i12;
                                    z8 = false;
                                }
                            }
                            i8 = i9;
                        } else {
                            i8 = i9;
                            path.reset();
                            for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                                path.addPath(((n) arrayList3.get(size4)).f());
                            }
                            canvas.drawPath(path, aVar2);
                        }
                        i11++;
                        bVar = this;
                        i9 = i8;
                        z8 = false;
                        f11 = 100.0f;
                    } else {
                        canvas.restore();
                        return;
                    }
                }
            }
        }
    }

    @Override // S0.f
    public final void h(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2) {
        Z0.g.g(eVar, i4, arrayList, eVar2, this);
    }
}
