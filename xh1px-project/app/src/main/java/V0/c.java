package V0;

import N0.B;
import N0.C0202j;
import N0.x;
import R3.r;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: D, reason: collision with root package name */
    public Q0.e f6238D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f6239E;

    /* renamed from: F, reason: collision with root package name */
    public final RectF f6240F;

    /* renamed from: G, reason: collision with root package name */
    public final RectF f6241G;

    /* renamed from: H, reason: collision with root package name */
    public final RectF f6242H;

    /* renamed from: I, reason: collision with root package name */
    public final Z0.i f6243I;

    /* renamed from: J, reason: collision with root package name */
    public final M.i f6244J;
    public float K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f6245L;

    /* renamed from: M, reason: collision with root package name */
    public final Q0.h f6246M;

    public c(x xVar, e eVar, List list, C0202j c0202j) {
        super(xVar, eVar);
        b bVar;
        b cVar;
        String str;
        this.f6239E = new ArrayList();
        this.f6240F = new RectF();
        this.f6241G = new RectF();
        this.f6242H = new RectF();
        this.f6243I = new Z0.i();
        this.f6244J = new M.i(2, false);
        this.f6245L = true;
        T0.b bVar2 = eVar.f6272s;
        if (bVar2 != null) {
            Q0.i r02 = bVar2.r0();
            this.f6238D = r02;
            d(r02);
            this.f6238D.a(this);
        } else {
            this.f6238D = null;
        }
        t.g gVar = new t.g(c0202j.j.size());
        int size = list.size() - 1;
        b bVar3 = null;
        while (true) {
            if (size >= 0) {
                e eVar2 = (e) list.get(size);
                int b4 = AbstractC1769h.b(eVar2.f6260e);
                if (b4 != 0) {
                    if (b4 != 1) {
                        if (b4 != 2) {
                            if (b4 != 3) {
                                if (b4 != 4) {
                                    if (b4 != 5) {
                                        switch (eVar2.f6260e) {
                                            case 1:
                                                str = "PRE_COMP";
                                                break;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                str = "SOLID";
                                                break;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                str = "IMAGE";
                                                break;
                                            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                                str = "NULL";
                                                break;
                                            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                                str = "SHAPE";
                                                break;
                                            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                str = "TEXT";
                                                break;
                                            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                str = "UNKNOWN";
                                                break;
                                            default:
                                                str = "null";
                                                break;
                                        }
                                        Z0.c.b("Unknown layer type ".concat(str));
                                        cVar = null;
                                    } else {
                                        cVar = new j(xVar, eVar2);
                                    }
                                } else {
                                    cVar = new g(xVar, eVar2, this, c0202j);
                                }
                            } else {
                                cVar = new b(xVar, eVar2);
                            }
                        } else {
                            cVar = new d(xVar, eVar2);
                        }
                    } else {
                        cVar = new h(xVar, eVar2);
                    }
                } else {
                    cVar = new c(xVar, eVar2, (List) c0202j.f3603c.get(eVar2.f6262g), c0202j);
                }
                if (cVar != null) {
                    gVar.g(cVar.f6227p.f6259d, cVar);
                    if (bVar3 != null) {
                        bVar3.f6230s = cVar;
                        bVar3 = null;
                    } else {
                        this.f6239E.add(0, cVar);
                        int b9 = AbstractC1769h.b(eVar2.f6274u);
                        if (b9 == 1 || b9 == 2) {
                            bVar3 = cVar;
                        }
                    }
                }
                size--;
            } else {
                for (int i4 = 0; i4 < gVar.h(); i4++) {
                    b bVar4 = (b) gVar.c(gVar.f(i4));
                    if (bVar4 != null && (bVar = (b) gVar.c(bVar4.f6227p.f6261f)) != null) {
                        bVar4.f6231t = bVar;
                    }
                }
                A4.d dVar = this.f6227p.f6277x;
                if (dVar != null) {
                    this.f6246M = new Q0.h(this, this, dVar);
                    return;
                }
                return;
            }
        }
    }

    @Override // V0.b, P0.f
    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        super.a(rectF, matrix, z8);
        ArrayList arrayList = this.f6239E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f6240F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).a(rectF2, this.f6225n, true);
            rectF.union(rectF2);
        }
    }

    @Override // V0.b, S0.f
    public final void e(r rVar, Object obj) {
        super.e(rVar, obj);
        if (obj == B.f3563z) {
            Q0.r rVar2 = new Q0.r(rVar, null);
            this.f6238D = rVar2;
            rVar2.a(this);
            d(this.f6238D);
            return;
        }
        Q0.h hVar = this.f6246M;
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
        boolean z8;
        Canvas canvas2;
        boolean z9 = false;
        Q0.h hVar = this.f6246M;
        if (aVar == null && hVar == null) {
            z8 = false;
        } else {
            z8 = true;
        }
        x xVar = this.f6226o;
        boolean z10 = xVar.f3690v;
        int i8 = 255;
        ArrayList arrayList = this.f6239E;
        if ((z10 && arrayList.size() > 1 && i4 != 255) || (z8 && xVar.f3691w)) {
            z9 = true;
        }
        if (!z9) {
            i8 = i4;
        }
        if (hVar != null) {
            aVar = hVar.a(matrix, i8);
        }
        boolean z11 = this.f6245L;
        e eVar = this.f6227p;
        RectF rectF = this.f6241G;
        if (!z11 && "__container".equals(eVar.f6258c)) {
            rectF.setEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                RectF rectF2 = this.f6242H;
                bVar.a(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        } else {
            rectF.set(0.0f, 0.0f, eVar.f6268o, eVar.f6269p);
            matrix.mapRect(rectF);
        }
        Z0.i iVar = this.f6243I;
        if (z9) {
            M.i iVar2 = this.f6244J;
            iVar2.f3288e = null;
            iVar2.f3287d = i4;
            if (aVar != null) {
                if (Color.alpha(aVar.f7252d) > 0) {
                    iVar2.f3288e = aVar;
                } else {
                    iVar2.f3288e = null;
                }
                aVar = null;
            }
            canvas2 = iVar.e(canvas, rectF, iVar2);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).g(canvas2, matrix, i8, aVar);
            }
        }
        if (z9) {
            iVar.c();
        }
        canvas.restore();
    }

    @Override // V0.b
    public final void p(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2) {
        int i8 = 0;
        while (true) {
            ArrayList arrayList2 = this.f6239E;
            if (i8 < arrayList2.size()) {
                ((b) arrayList2.get(i8)).h(eVar, i4, arrayList, eVar2);
                i8++;
            } else {
                return;
            }
        }
    }

    @Override // V0.b
    public final void q(boolean z8) {
        super.q(z8);
        Iterator it = this.f6239E.iterator();
        while (it.hasNext()) {
            ((b) it.next()).q(z8);
        }
    }

    @Override // V0.b
    public final void r(float f8) {
        this.K = f8;
        super.r(f8);
        Q0.e eVar = this.f6238D;
        e eVar2 = this.f6227p;
        if (eVar != null) {
            C0202j c0202j = this.f6226o.f3674d;
            f8 = ((((Float) eVar.e()).floatValue() * eVar2.f6257b.f3612n) - eVar2.f6257b.f3610l) / ((c0202j.f3611m - c0202j.f3610l) + 0.01f);
        }
        if (this.f6238D == null) {
            float f9 = eVar2.f6267n;
            C0202j c0202j2 = eVar2.f6257b;
            f8 -= f9 / (c0202j2.f3611m - c0202j2.f3610l);
        }
        if (eVar2.f6266m != 0.0f && !"__container".equals(eVar2.f6258c)) {
            f8 /= eVar2.f6266m;
        }
        ArrayList arrayList = this.f6239E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).r(f8);
        }
    }
}
