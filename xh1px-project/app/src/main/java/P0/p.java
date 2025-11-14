package P0;

import N0.B;
import N0.x;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p implements Q0.a, l, n {

    /* renamed from: c, reason: collision with root package name */
    public final String f4416c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4417d;

    /* renamed from: e, reason: collision with root package name */
    public final x f4418e;

    /* renamed from: f, reason: collision with root package name */
    public final Q0.e f4419f;

    /* renamed from: g, reason: collision with root package name */
    public final Q0.e f4420g;

    /* renamed from: h, reason: collision with root package name */
    public final Q0.i f4421h;
    public boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f4414a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f4415b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final c f4422i = new c();
    public Q0.e j = null;

    public p(x xVar, V0.b bVar, U0.i iVar) {
        this.f4416c = iVar.f5980b;
        this.f4417d = iVar.f5982d;
        this.f4418e = xVar;
        Q0.e r02 = iVar.f5983e.r0();
        this.f4419f = r02;
        Q0.e r03 = ((T0.e) iVar.f5984f).r0();
        this.f4420g = r03;
        Q0.i r04 = iVar.f5981c.r0();
        this.f4421h = r04;
        bVar.d(r02);
        bVar.d(r03);
        bVar.d(r04);
        r02.a(this);
        r03.a(this);
        r04.a(this);
    }

    @Override // Q0.a
    public final void b() {
        this.k = false;
        this.f4418e.invalidateSelf();
    }

    @Override // P0.d
    public final void c(List list, List list2) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i4 < arrayList.size()) {
                d dVar = (d) arrayList.get(i4);
                if (dVar instanceof u) {
                    u uVar = (u) dVar;
                    if (uVar.f4449c == 1) {
                        this.f4422i.f4335d.add(uVar);
                        uVar.d(this);
                        i4++;
                    }
                }
                if (dVar instanceof r) {
                    this.j = ((r) dVar).f4433b;
                }
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // S0.f
    public final void e(R3.r rVar, Object obj) {
        if (obj == B.f3546g) {
            this.f4420g.j(rVar);
        } else if (obj == B.f3548i) {
            this.f4419f.j(rVar);
        } else if (obj == B.f3547h) {
            this.f4421h.j(rVar);
        }
    }

    @Override // P0.n
    public final Path f() {
        float l6;
        float f8;
        Q0.e eVar;
        boolean z8 = this.k;
        Path path = this.f4414a;
        if (z8) {
            return path;
        }
        path.reset();
        if (this.f4417d) {
            this.k = true;
            return path;
        }
        PointF pointF = (PointF) this.f4420g.e();
        float f9 = pointF.x / 2.0f;
        float f10 = pointF.y / 2.0f;
        Q0.i iVar = this.f4421h;
        if (iVar == null) {
            l6 = 0.0f;
        } else {
            l6 = iVar.l();
        }
        if (l6 == 0.0f && (eVar = this.j) != null) {
            l6 = Math.min(((Float) eVar.e()).floatValue(), Math.min(f9, f10));
        }
        float min = Math.min(f9, f10);
        if (l6 > min) {
            l6 = min;
        }
        PointF pointF2 = (PointF) this.f4419f.e();
        path.moveTo(pointF2.x + f9, (pointF2.y - f10) + l6);
        path.lineTo(pointF2.x + f9, (pointF2.y + f10) - l6);
        RectF rectF = this.f4415b;
        if (l6 > 0.0f) {
            float f11 = pointF2.x + f9;
            float f12 = l6 * 2.0f;
            f8 = 2.0f;
            float f13 = pointF2.y + f10;
            rectF.set(f11 - f12, f13 - f12, f11, f13);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f8 = 2.0f;
        }
        path.lineTo((pointF2.x - f9) + l6, pointF2.y + f10);
        if (l6 > 0.0f) {
            float f14 = pointF2.x - f9;
            float f15 = pointF2.y + f10;
            float f16 = l6 * f8;
            rectF.set(f14, f15 - f16, f16 + f14, f15);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f9, (pointF2.y - f10) + l6);
        if (l6 > 0.0f) {
            float f17 = pointF2.x - f9;
            float f18 = pointF2.y - f10;
            float f19 = l6 * f8;
            rectF.set(f17, f18, f17 + f19, f19 + f18);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f9) - l6, pointF2.y - f10);
        if (l6 > 0.0f) {
            float f20 = pointF2.x + f9;
            float f21 = l6 * f8;
            float f22 = pointF2.y - f10;
            rectF.set(f20 - f21, f22, f20, f21 + f22);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f4422i.a(path);
        this.k = true;
        return path;
    }

    @Override // P0.d
    public final String getName() {
        return this.f4416c;
    }

    @Override // S0.f
    public final void h(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2) {
        Z0.g.g(eVar, i4, arrayList, eVar2, this);
    }
}
