package y;

import java.util.ArrayList;
import x.C1766e;
import z.C1845b;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public float f16414A0;

    /* renamed from: B0, reason: collision with root package name */
    public float f16415B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f16416C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f16417D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f16418E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f16419F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f16420G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f16421H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f16422I0;

    /* renamed from: J0, reason: collision with root package name */
    public ArrayList f16423J0;

    /* renamed from: K0, reason: collision with root package name */
    public d[] f16424K0;

    /* renamed from: L0, reason: collision with root package name */
    public d[] f16425L0;

    /* renamed from: M0, reason: collision with root package name */
    public int[] f16426M0;

    /* renamed from: N0, reason: collision with root package name */
    public d[] f16427N0;

    /* renamed from: O0, reason: collision with root package name */
    public int f16428O0;

    /* renamed from: f0, reason: collision with root package name */
    public int f16429f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f16430g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f16431h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f16432i0;
    public int j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f16433k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f16434l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f16435m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f16436n0;

    /* renamed from: o0, reason: collision with root package name */
    public C1845b f16437o0;

    /* renamed from: p0, reason: collision with root package name */
    public A.f f16438p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f16439q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f16440r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f16441s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f16442t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f16443u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f16444v0;

    /* renamed from: w0, reason: collision with root package name */
    public float f16445w0;

    /* renamed from: x0, reason: collision with root package name */
    public float f16446x0;

    /* renamed from: y0, reason: collision with root package name */
    public float f16447y0;

    /* renamed from: z0, reason: collision with root package name */
    public float f16448z0;

    @Override // y.i
    public final void B() {
        for (int i4 = 0; i4 < this.f16455e0; i4++) {
            d dVar = this.f16454d0[i4];
        }
    }

    public final int C(d dVar, int i4) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f16362c0;
            if (iArr[1] == 3) {
                int i8 = dVar.k;
                if (i8 != 0) {
                    if (i8 == 2) {
                        int i9 = (int) (dVar.f16375r * i4);
                        if (i9 != dVar.i()) {
                            E(iArr[0], dVar.l(), 1, i9, dVar);
                        }
                        return i9;
                    }
                    dVar2 = dVar;
                    if (i8 == 1) {
                        return dVar2.i();
                    }
                    if (i8 == 3) {
                        return (int) ((dVar2.l() * dVar2.f16343L) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.i();
        }
        return 0;
    }

    public final int D(d dVar, int i4) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f16362c0;
            if (iArr[0] == 3) {
                int i8 = dVar.j;
                if (i8 != 0) {
                    if (i8 == 2) {
                        int i9 = (int) (dVar.f16372o * i4);
                        if (i9 != dVar.l()) {
                            E(1, i9, iArr[1], dVar.i(), dVar);
                        }
                        return i9;
                    }
                    dVar2 = dVar;
                    if (i8 == 1) {
                        return dVar2.l();
                    }
                    if (i8 == 3) {
                        return (int) ((dVar2.i() * dVar2.f16343L) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.l();
        }
        return 0;
    }

    public final void E(int i4, int i8, int i9, int i10, d dVar) {
        A.f fVar;
        boolean z8;
        d dVar2;
        C1845b c1845b = this.f16437o0;
        while (true) {
            fVar = this.f16438p0;
            if (fVar != null || (dVar2 = this.f16341I) == null) {
                break;
            } else {
                this.f16438p0 = ((e) dVar2).f16387g0;
            }
        }
        c1845b.f16573a = i4;
        c1845b.f16574b = i9;
        c1845b.f16575c = i8;
        c1845b.f16576d = i10;
        fVar.a(dVar, c1845b);
        dVar.y(c1845b.f16577e);
        dVar.v(c1845b.f16578f);
        dVar.f16380w = c1845b.f16580h;
        int i11 = c1845b.f16579g;
        dVar.f16347P = i11;
        if (i11 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        dVar.f16380w = z8;
    }

    @Override // y.d
    public final void a(C1766e c1766e) {
        boolean z8;
        boolean z9;
        d dVar;
        int i4;
        ArrayList arrayList = this.f16423J0;
        super.a(c1766e);
        d dVar2 = this.f16341I;
        if (dVar2 != null) {
            z8 = ((e) dVar2).f16388h0;
        } else {
            z8 = false;
        }
        int i8 = this.f16420G0;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2 && this.f16426M0 != null && this.f16425L0 != null && this.f16424K0 != null) {
                    for (int i9 = 0; i9 < this.f16428O0; i9++) {
                        this.f16427N0[i9].t();
                    }
                    int[] iArr = this.f16426M0;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    d dVar3 = null;
                    for (int i12 = 0; i12 < i10; i12++) {
                        if (z8) {
                            i4 = (i10 - i12) - 1;
                        } else {
                            i4 = i12;
                        }
                        d dVar4 = this.f16425L0[i4];
                        if (dVar4 != null) {
                            c cVar = dVar4.f16381x;
                            if (dVar4.f16353V != 8) {
                                if (i12 == 0) {
                                    dVar4.e(cVar, this.f16381x, this.j0);
                                    dVar4.f16355X = this.f16439q0;
                                    dVar4.f16350S = this.f16445w0;
                                }
                                if (i12 == i10 - 1) {
                                    dVar4.e(dVar4.f16383z, this.f16383z, this.f16433k0);
                                }
                                if (i12 > 0) {
                                    dVar4.e(cVar, dVar3.f16383z, this.f16416C0);
                                    dVar3.e(dVar3.f16383z, cVar, 0);
                                }
                                dVar3 = dVar4;
                            }
                        }
                    }
                    for (int i13 = 0; i13 < i11; i13++) {
                        d dVar5 = this.f16424K0[i13];
                        if (dVar5 != null) {
                            c cVar2 = dVar5.f16382y;
                            if (dVar5.f16353V != 8) {
                                if (i13 == 0) {
                                    dVar5.e(cVar2, this.f16382y, this.f16429f0);
                                    dVar5.Y = this.f16440r0;
                                    dVar5.f16351T = this.f16446x0;
                                }
                                if (i13 == i11 - 1) {
                                    dVar5.e(dVar5.f16333A, this.f16333A, this.f16430g0);
                                }
                                if (i13 > 0) {
                                    dVar5.e(cVar2, dVar3.f16333A, this.f16417D0);
                                    dVar3.e(dVar3.f16333A, cVar2, 0);
                                }
                                dVar3 = dVar5;
                            }
                        }
                    }
                    for (int i14 = 0; i14 < i10; i14++) {
                        for (int i15 = 0; i15 < i11; i15++) {
                            int i16 = (i15 * i10) + i14;
                            if (this.f16422I0 == 1) {
                                i16 = (i14 * i11) + i15;
                            }
                            d[] dVarArr = this.f16427N0;
                            if (i16 < dVarArr.length && (dVar = dVarArr[i16]) != null && dVar.f16353V != 8) {
                                d dVar6 = this.f16425L0[i14];
                                d dVar7 = this.f16424K0[i15];
                                if (dVar != dVar6) {
                                    dVar.e(dVar.f16381x, dVar6.f16381x, 0);
                                    dVar.e(dVar.f16383z, dVar6.f16383z, 0);
                                }
                                if (dVar != dVar7) {
                                    dVar.e(dVar.f16382y, dVar7.f16382y, 0);
                                    dVar.e(dVar.f16333A, dVar7.f16333A, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size = arrayList.size();
                for (int i17 = 0; i17 < size; i17++) {
                    f fVar = (f) arrayList.get(i17);
                    if (i17 == size - 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    fVar.b(i17, z8, z9);
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z8, true);
        }
        this.f16434l0 = false;
    }
}
