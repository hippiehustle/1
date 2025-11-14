package P0;

import N0.B;
import N0.x;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements f, Q0.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final Path f4354a;

    /* renamed from: b, reason: collision with root package name */
    public final O0.a f4355b;

    /* renamed from: c, reason: collision with root package name */
    public final V0.b f4356c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4357d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4358e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4359f;

    /* renamed from: g, reason: collision with root package name */
    public final Q0.f f4360g;

    /* renamed from: h, reason: collision with root package name */
    public final Q0.f f4361h;

    /* renamed from: i, reason: collision with root package name */
    public Q0.r f4362i;
    public final x j;
    public Q0.e k;

    /* renamed from: l, reason: collision with root package name */
    public float f4363l;

    public h(x xVar, V0.b bVar, U0.l lVar) {
        Path path = new Path();
        this.f4354a = path;
        this.f4355b = new O0.a(1, 0);
        this.f4359f = new ArrayList();
        this.f4356c = bVar;
        String str = lVar.f5991c;
        T0.a aVar = lVar.f5993e;
        T0.a aVar2 = lVar.f5992d;
        this.f4357d = str;
        this.f4358e = lVar.f5994f;
        this.j = xVar;
        if (bVar.l() != null) {
            Q0.i r02 = ((T0.b) bVar.l().f6489e).r0();
            this.k = r02;
            r02.a(this);
            bVar.d(this.k);
        }
        if (aVar2 != null) {
            path.setFillType(lVar.f5990b);
            Q0.e r03 = aVar2.r0();
            this.f4360g = (Q0.f) r03;
            r03.a(this);
            bVar.d(r03);
            Q0.e r04 = aVar.r0();
            this.f4361h = (Q0.f) r04;
            r04.a(this);
            bVar.d(r04);
            return;
        }
        this.f4360g = null;
        this.f4361h = null;
    }

    @Override // P0.f
    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        Path path = this.f4354a;
        path.reset();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4359f;
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
        this.j.invalidateSelf();
    }

    @Override // P0.d
    public final void c(List list, List list2) {
        for (int i4 = 0; i4 < list2.size(); i4++) {
            d dVar = (d) list2.get(i4);
            if (dVar instanceof n) {
                this.f4359f.add((n) dVar);
            }
        }
    }

    @Override // S0.f
    public final void e(R3.r rVar, Object obj) {
        PointF pointF = B.f3540a;
        if (obj == 1) {
            this.f4360g.j(rVar);
            return;
        }
        if (obj == 4) {
            this.f4361h.j(rVar);
            return;
        }
        ColorFilter colorFilter = B.f3535F;
        V0.b bVar = this.f4356c;
        if (obj == colorFilter) {
            Q0.r rVar2 = this.f4362i;
            if (rVar2 != null) {
                bVar.o(rVar2);
            }
            Q0.r rVar3 = new Q0.r(rVar, null);
            this.f4362i = rVar3;
            rVar3.a(this);
            bVar.d(this.f4362i);
            return;
        }
        if (obj == B.f3544e) {
            Q0.e eVar = this.k;
            if (eVar != null) {
                eVar.j(rVar);
                return;
            }
            Q0.r rVar4 = new Q0.r(rVar, null);
            this.k = rVar4;
            rVar4.a(this);
            bVar.d(this.k);
        }
    }

    @Override // P0.f
    public final void g(Canvas canvas, Matrix matrix, int i4, Z0.a aVar) {
        BlurMaskFilter blurMaskFilter;
        if (this.f4358e) {
            return;
        }
        Q0.f fVar = this.f4360g;
        float intValue = ((Integer) this.f4361h.e()).intValue() / 100.0f;
        int c6 = (Z0.g.c((int) (i4 * intValue)) << 24) | (fVar.l(fVar.f4720c.g(), fVar.c()) & 16777215);
        O0.a aVar2 = this.f4355b;
        aVar2.setColor(c6);
        Q0.r rVar = this.f4362i;
        if (rVar != null) {
            aVar2.setColorFilter((ColorFilter) rVar.e());
        }
        Q0.e eVar = this.k;
        if (eVar != null) {
            float floatValue = ((Float) eVar.e()).floatValue();
            if (floatValue == 0.0f) {
                aVar2.setMaskFilter(null);
            } else if (floatValue != this.f4363l) {
                V0.b bVar = this.f4356c;
                if (bVar.f6211A == floatValue) {
                    blurMaskFilter = bVar.f6212B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.f6212B = blurMaskFilter2;
                    bVar.f6211A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar2.setMaskFilter(blurMaskFilter);
            }
            this.f4363l = floatValue;
        }
        if (aVar != null) {
            aVar.a((int) (intValue * 255.0f), aVar2);
        } else {
            aVar2.clearShadowLayer();
        }
        Path path = this.f4354a;
        path.reset();
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f4359f;
            if (i8 < arrayList.size()) {
                path.addPath(((n) arrayList.get(i8)).f(), matrix);
                i8++;
            } else {
                canvas.drawPath(path, aVar2);
                return;
            }
        }
    }

    @Override // P0.d
    public final String getName() {
        return this.f4357d;
    }

    @Override // S0.f
    public final void h(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2) {
        Z0.g.g(eVar, i4, arrayList, eVar2, this);
    }
}
