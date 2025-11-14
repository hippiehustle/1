package V0;

import N0.B;
import N0.C0202j;
import N0.x;
import R3.r;
import U0.m;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: D, reason: collision with root package name */
    public final P0.e f6279D;

    /* renamed from: E, reason: collision with root package name */
    public final c f6280E;

    /* renamed from: F, reason: collision with root package name */
    public final Q0.h f6281F;

    public g(x xVar, e eVar, c cVar, C0202j c0202j) {
        super(xVar, eVar);
        this.f6280E = cVar;
        P0.e eVar2 = new P0.e(xVar, this, new m("__container", eVar.f6256a, false), c0202j);
        this.f6279D = eVar2;
        List list = Collections.EMPTY_LIST;
        eVar2.c(list, list);
        A4.d dVar = this.f6227p.f6277x;
        if (dVar != null) {
            this.f6281F = new Q0.h(this, this, dVar);
        }
    }

    @Override // V0.b, P0.f
    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        super.a(rectF, matrix, z8);
        this.f6279D.a(rectF, this.f6225n, z8);
    }

    @Override // V0.b, S0.f
    public final void e(r rVar, Object obj) {
        super.e(rVar, obj);
        PointF pointF = B.f3540a;
        Q0.h hVar = this.f6281F;
        if (obj == 5 && hVar != null) {
            hVar.f4730c.j(rVar);
            return;
        }
        if (obj == B.f3531B && hVar != null) {
            hVar.c(rVar);
            return;
        }
        if (obj == B.f3532C && hVar != null) {
            hVar.f4732e.j(rVar);
            return;
        }
        if (obj == B.f3533D && hVar != null) {
            hVar.f4733f.j(rVar);
        } else if (obj == B.f3534E && hVar != null) {
            hVar.f4734g.j(rVar);
        }
    }

    @Override // V0.b
    public final void k(Canvas canvas, Matrix matrix, int i4, Z0.a aVar) {
        Q0.h hVar = this.f6281F;
        if (hVar != null) {
            aVar = hVar.a(matrix, i4);
        }
        this.f6279D.g(canvas, matrix, i4, aVar);
    }

    @Override // V0.b
    public final W0.d l() {
        W0.d dVar = this.f6227p.f6276w;
        if (dVar != null) {
            return dVar;
        }
        return this.f6280E.f6227p.f6276w;
    }

    @Override // V0.b
    public final void p(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2) {
        this.f6279D.h(eVar, i4, arrayList, eVar2);
    }
}
