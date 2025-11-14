package y;

import n1.AbstractC1149a;
import x.AbstractC1769h;
import x.C1764c;
import x.C1766e;
import x.C1770i;

/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: f0, reason: collision with root package name */
    public int f16308f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f16309g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f16310h0;

    @Override // y.d
    public final void a(C1766e c1766e) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i4;
        int i8;
        int i9;
        int i10;
        c[] cVarArr = this.f16338F;
        c cVar = this.f16381x;
        cVarArr[0] = cVar;
        int i11 = 2;
        c cVar2 = this.f16382y;
        cVarArr[2] = cVar2;
        c cVar3 = this.f16383z;
        cVarArr[1] = cVar3;
        c cVar4 = this.f16333A;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.f16332g = c1766e.j(cVar5);
        }
        int i12 = this.f16308f0;
        if (i12 >= 0 && i12 < 4) {
            c cVar6 = cVarArr[i12];
            for (int i13 = 0; i13 < this.f16455e0; i13++) {
                d dVar = this.f16454d0[i13];
                if ((this.f16309g0 || dVar.b()) && ((((i10 = this.f16308f0) == 0 || i10 == 1) && dVar.f16362c0[0] == 3 && dVar.f16381x.f16329d != null && dVar.f16383z.f16329d != null) || ((i10 == 2 || i10 == 3) && dVar.f16362c0[1] == 3 && dVar.f16382y.f16329d != null && dVar.f16333A.f16329d != null))) {
                    z8 = true;
                    break;
                }
            }
            z8 = false;
            if (!cVar.e() && !cVar3.e()) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!cVar2.e() && !cVar4.e()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z8 && (((i9 = this.f16308f0) == 0 && z9) || ((i9 == 2 && z10) || ((i9 == 1 && z9) || (i9 == 3 && z10))))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                i4 = 4;
            } else {
                i4 = 5;
            }
            int i14 = 0;
            while (i14 < this.f16455e0) {
                d dVar2 = this.f16454d0[i14];
                if (this.f16309g0 || dVar2.b()) {
                    C1770i j = c1766e.j(dVar2.f16338F[this.f16308f0]);
                    c[] cVarArr2 = dVar2.f16338F;
                    int i15 = this.f16308f0;
                    c cVar7 = cVarArr2[i15];
                    cVar7.f16332g = j;
                    c cVar8 = cVar7.f16329d;
                    if (cVar8 != null && cVar8.f16327b == this) {
                        i8 = cVar7.f16330e;
                    } else {
                        i8 = 0;
                    }
                    if (i15 != 0 && i15 != i11) {
                        C1770i c1770i = cVar6.f16332g;
                        int i16 = this.f16310h0 + i8;
                        C1764c k = c1766e.k();
                        C1770i l6 = c1766e.l();
                        l6.f16063d = 0;
                        k.b(c1770i, j, l6, i16);
                        c1766e.c(k);
                    } else {
                        C1770i c1770i2 = cVar6.f16332g;
                        int i17 = this.f16310h0 - i8;
                        C1764c k6 = c1766e.k();
                        C1770i l8 = c1766e.l();
                        l8.f16063d = 0;
                        k6.c(c1770i2, j, l8, i17);
                        c1766e.c(k6);
                    }
                    c1766e.e(cVar6.f16332g, j, this.f16310h0 + i8, i4);
                }
                i14++;
                i11 = 2;
            }
            int i18 = this.f16308f0;
            if (i18 == 0) {
                c1766e.e(cVar3.f16332g, cVar.f16332g, 0, 8);
                c1766e.e(cVar.f16332g, this.f16341I.f16383z.f16332g, 0, 4);
                c1766e.e(cVar.f16332g, this.f16341I.f16381x.f16332g, 0, 0);
                return;
            }
            if (i18 == 1) {
                c1766e.e(cVar.f16332g, cVar3.f16332g, 0, 8);
                c1766e.e(cVar.f16332g, this.f16341I.f16381x.f16332g, 0, 4);
                c1766e.e(cVar.f16332g, this.f16341I.f16383z.f16332g, 0, 0);
            } else if (i18 == 2) {
                c1766e.e(cVar4.f16332g, cVar2.f16332g, 0, 8);
                c1766e.e(cVar2.f16332g, this.f16341I.f16333A.f16332g, 0, 4);
                c1766e.e(cVar2.f16332g, this.f16341I.f16382y.f16332g, 0, 0);
            } else if (i18 == 3) {
                c1766e.e(cVar2.f16332g, cVar4.f16332g, 0, 8);
                c1766e.e(cVar2.f16332g, this.f16341I.f16382y.f16332g, 0, 4);
                c1766e.e(cVar2.f16332g, this.f16341I.f16333A.f16332g, 0, 0);
            }
        }
    }

    @Override // y.d
    public final boolean b() {
        return true;
    }

    @Override // y.d
    public final String toString() {
        String r8 = A.j.r(new StringBuilder("[Barrier] "), this.f16354W, " {");
        for (int i4 = 0; i4 < this.f16455e0; i4++) {
            d dVar = this.f16454d0[i4];
            if (i4 > 0) {
                r8 = AbstractC1149a.g(r8, ", ");
            }
            StringBuilder a3 = AbstractC1769h.a(r8);
            a3.append(dVar.f16354W);
            r8 = a3.toString();
        }
        return AbstractC1149a.g(r8, "}");
    }
}
