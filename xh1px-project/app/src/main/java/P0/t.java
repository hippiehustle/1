package P0;

import N0.B;
import N0.x;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class t extends b {

    /* renamed from: q, reason: collision with root package name */
    public final V0.b f4442q;

    /* renamed from: r, reason: collision with root package name */
    public final String f4443r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f4444s;

    /* renamed from: t, reason: collision with root package name */
    public final Q0.f f4445t;

    /* renamed from: u, reason: collision with root package name */
    public Q0.r f4446u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(x xVar, V0.b bVar, U0.o oVar) {
        super(xVar, bVar, r5, r0, oVar.f6010i, oVar.f6006e, oVar.f6007f, oVar.f6004c, oVar.f6003b);
        Paint.Cap cap;
        Paint.Join join;
        int b4 = AbstractC1769h.b(oVar.f6008g);
        if (b4 != 0) {
            if (b4 != 1) {
                cap = Paint.Cap.SQUARE;
            } else {
                cap = Paint.Cap.ROUND;
            }
        } else {
            cap = Paint.Cap.BUTT;
        }
        Paint.Cap cap2 = cap;
        int b9 = AbstractC1769h.b(oVar.f6009h);
        if (b9 != 0) {
            if (b9 != 1) {
                if (b9 != 2) {
                    join = null;
                } else {
                    join = Paint.Join.BEVEL;
                }
            } else {
                join = Paint.Join.ROUND;
            }
        } else {
            join = Paint.Join.MITER;
        }
        this.f4442q = bVar;
        this.f4443r = oVar.f6002a;
        this.f4444s = oVar.j;
        Q0.e r02 = oVar.f6005d.r0();
        this.f4445t = (Q0.f) r02;
        r02.a(this);
        bVar.d(r02);
    }

    @Override // P0.b, S0.f
    public final void e(R3.r rVar, Object obj) {
        super.e(rVar, obj);
        PointF pointF = B.f3540a;
        Q0.f fVar = this.f4445t;
        if (obj == 2) {
            fVar.j(rVar);
            return;
        }
        if (obj == B.f3535F) {
            Q0.r rVar2 = this.f4446u;
            V0.b bVar = this.f4442q;
            if (rVar2 != null) {
                bVar.o(rVar2);
            }
            Q0.r rVar3 = new Q0.r(rVar, null);
            this.f4446u = rVar3;
            rVar3.a(this);
            bVar.d(fVar);
        }
    }

    @Override // P0.b, P0.f
    public final void g(Canvas canvas, Matrix matrix, int i4, Z0.a aVar) {
        if (this.f4444s) {
            return;
        }
        Q0.f fVar = this.f4445t;
        int l6 = fVar.l(fVar.f4720c.g(), fVar.c());
        O0.a aVar2 = this.f4329i;
        aVar2.setColor(l6);
        Q0.r rVar = this.f4446u;
        if (rVar != null) {
            aVar2.setColorFilter((ColorFilter) rVar.e());
        }
        super.g(canvas, matrix, i4, aVar);
    }

    @Override // P0.d
    public final String getName() {
        return this.f4443r;
    }
}
