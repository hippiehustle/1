package y;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f16398a;

    /* renamed from: d, reason: collision with root package name */
    public c f16401d;

    /* renamed from: e, reason: collision with root package name */
    public c f16402e;

    /* renamed from: f, reason: collision with root package name */
    public c f16403f;

    /* renamed from: g, reason: collision with root package name */
    public c f16404g;

    /* renamed from: h, reason: collision with root package name */
    public int f16405h;

    /* renamed from: i, reason: collision with root package name */
    public int f16406i;
    public int j;
    public int k;

    /* renamed from: q, reason: collision with root package name */
    public int f16412q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f16413r;

    /* renamed from: b, reason: collision with root package name */
    public d f16399b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f16400c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f16407l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f16408m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f16409n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f16410o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f16411p = 0;

    public f(g gVar, int i4, c cVar, c cVar2, c cVar3, c cVar4, int i8) {
        this.f16413r = gVar;
        this.f16405h = 0;
        this.f16406i = 0;
        this.j = 0;
        this.k = 0;
        this.f16412q = 0;
        this.f16398a = i4;
        this.f16401d = cVar;
        this.f16402e = cVar2;
        this.f16403f = cVar3;
        this.f16404g = cVar4;
        this.f16405h = gVar.j0;
        this.f16406i = gVar.f16429f0;
        this.j = gVar.f16433k0;
        this.k = gVar.f16430g0;
        this.f16412q = i8;
    }

    public final void a(d dVar) {
        int i4 = this.f16398a;
        int i8 = 0;
        g gVar = this.f16413r;
        if (i4 == 0) {
            int D7 = gVar.D(dVar, this.f16412q);
            if (dVar.f16362c0[0] == 3) {
                this.f16411p++;
                D7 = 0;
            }
            int i9 = gVar.f16416C0;
            if (dVar.f16353V != 8) {
                i8 = i9;
            }
            this.f16407l = D7 + i8 + this.f16407l;
            int C8 = gVar.C(dVar, this.f16412q);
            if (this.f16399b == null || this.f16400c < C8) {
                this.f16399b = dVar;
                this.f16400c = C8;
                this.f16408m = C8;
            }
        } else {
            int D8 = gVar.D(dVar, this.f16412q);
            int C9 = gVar.C(dVar, this.f16412q);
            if (dVar.f16362c0[1] == 3) {
                this.f16411p++;
                C9 = 0;
            }
            int i10 = gVar.f16417D0;
            if (dVar.f16353V != 8) {
                i8 = i10;
            }
            this.f16408m = C9 + i8 + this.f16408m;
            if (this.f16399b == null || this.f16400c < D8) {
                this.f16399b = dVar;
                this.f16400c = D8;
                this.f16407l = D8;
            }
        }
        this.f16410o++;
    }

    public final void b(int i4, boolean z8, boolean z9) {
        g gVar;
        boolean z10;
        int i8;
        int i9;
        d dVar;
        int i10;
        char c6;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f16410o;
        int i19 = 0;
        while (true) {
            gVar = this.f16413r;
            if (i19 >= i18 || (i17 = this.f16409n + i19) >= gVar.f16428O0) {
                break;
            }
            d dVar2 = gVar.f16427N0[i17];
            if (dVar2 != null) {
                dVar2.t();
            }
            i19++;
        }
        if (i18 != 0 && this.f16399b != null) {
            if (z9 && i4 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i20 = -1;
            int i21 = -1;
            for (int i22 = 0; i22 < i18; i22++) {
                if (z8) {
                    i16 = (i18 - 1) - i22;
                } else {
                    i16 = i22;
                }
                int i23 = this.f16409n + i16;
                if (i23 >= gVar.f16428O0) {
                    break;
                }
                if (gVar.f16427N0[i23].f16353V == 0) {
                    if (i20 == -1) {
                        i20 = i22;
                    }
                    i21 = i22;
                }
            }
            if (this.f16398a == 0) {
                d dVar3 = this.f16399b;
                dVar3.Y = gVar.f16440r0;
                c cVar = dVar3.f16333A;
                c cVar2 = dVar3.f16382y;
                int i24 = this.f16406i;
                if (i4 > 0) {
                    i24 += gVar.f16417D0;
                }
                cVar2.a(this.f16402e, i24);
                if (z9) {
                    cVar.a(this.f16404g, this.k);
                }
                if (i4 > 0) {
                    this.f16402e.f16327b.f16333A.a(cVar2, 0);
                }
                if (gVar.f16419F0 == 3 && !dVar3.f16380w) {
                    for (int i25 = 0; i25 < i18; i25++) {
                        if (z8) {
                            i15 = (i18 - 1) - i25;
                        } else {
                            i15 = i25;
                        }
                        int i26 = this.f16409n + i15;
                        if (i26 >= gVar.f16428O0) {
                            break;
                        }
                        dVar = gVar.f16427N0[i26];
                        if (dVar.f16380w) {
                            break;
                        }
                    }
                }
                dVar = dVar3;
                int i27 = 0;
                d dVar4 = null;
                while (i27 < i18) {
                    if (z8) {
                        i10 = (i18 - 1) - i27;
                    } else {
                        i10 = i27;
                    }
                    int i28 = this.f16409n + i10;
                    if (i28 < gVar.f16428O0) {
                        d dVar5 = gVar.f16427N0[i28];
                        if (i27 == 0) {
                            dVar5.e(dVar5.f16381x, this.f16401d, this.f16405h);
                        }
                        if (i10 == 0) {
                            int i29 = gVar.f16439q0;
                            float f8 = gVar.f16445w0;
                            if (this.f16409n == 0) {
                                i14 = gVar.f16441s0;
                                i11 = i29;
                                i12 = -1;
                                if (i14 != -1) {
                                    f8 = gVar.f16447y0;
                                    i13 = i14;
                                    dVar5.f16355X = i13;
                                    dVar5.f16350S = f8;
                                }
                            } else {
                                i11 = i29;
                                i12 = -1;
                            }
                            if (z9 && (i14 = gVar.f16443u0) != i12) {
                                f8 = gVar.f16414A0;
                                i13 = i14;
                                dVar5.f16355X = i13;
                                dVar5.f16350S = f8;
                            } else {
                                i13 = i11;
                                dVar5.f16355X = i13;
                                dVar5.f16350S = f8;
                            }
                        }
                        if (i27 == i18 - 1) {
                            dVar5.e(dVar5.f16383z, this.f16403f, this.j);
                        }
                        if (dVar4 != null) {
                            c cVar3 = dVar4.f16383z;
                            c cVar4 = dVar5.f16381x;
                            cVar4.a(cVar3, gVar.f16416C0);
                            if (i27 == i20) {
                                int i30 = this.f16405h;
                                if (cVar4.f()) {
                                    cVar4.f16331f = i30;
                                }
                            }
                            cVar3.a(cVar4, 0);
                            if (i27 == i21 + 1) {
                                int i31 = this.j;
                                if (cVar3.f()) {
                                    cVar3.f16331f = i31;
                                }
                            }
                        }
                        if (dVar5 != dVar3) {
                            int i32 = gVar.f16419F0;
                            c6 = 3;
                            if (i32 == 3 && dVar.f16380w && dVar5 != dVar && dVar5.f16380w) {
                                dVar5.f16334B.a(dVar.f16334B, 0);
                            } else if (i32 != 0) {
                                if (i32 != 1) {
                                    if (z10) {
                                        dVar5.f16382y.a(this.f16402e, this.f16406i);
                                        dVar5.f16333A.a(this.f16404g, this.k);
                                    } else {
                                        dVar5.f16382y.a(cVar2, 0);
                                        dVar5.f16333A.a(cVar, 0);
                                    }
                                } else {
                                    dVar5.f16333A.a(cVar, 0);
                                }
                            } else {
                                dVar5.f16382y.a(cVar2, 0);
                            }
                        } else {
                            c6 = 3;
                        }
                        i27++;
                        dVar4 = dVar5;
                    } else {
                        return;
                    }
                }
                return;
            }
            d dVar6 = this.f16399b;
            dVar6.f16355X = gVar.f16439q0;
            c cVar5 = dVar6.f16381x;
            c cVar6 = dVar6.f16383z;
            int i33 = this.f16405h;
            if (i4 > 0) {
                i33 += gVar.f16416C0;
            }
            if (z8) {
                cVar6.a(this.f16403f, i33);
                if (z9) {
                    cVar5.a(this.f16401d, this.j);
                }
                if (i4 > 0) {
                    this.f16403f.f16327b.f16381x.a(cVar6, 0);
                }
            } else {
                cVar5.a(this.f16401d, i33);
                if (z9) {
                    cVar6.a(this.f16403f, this.j);
                }
                if (i4 > 0) {
                    this.f16401d.f16327b.f16383z.a(cVar5, 0);
                }
            }
            d dVar7 = null;
            int i34 = 0;
            while (i34 < i18) {
                int i35 = this.f16409n + i34;
                if (i35 < gVar.f16428O0) {
                    d dVar8 = gVar.f16427N0[i35];
                    if (i34 == 0) {
                        dVar8.e(dVar8.f16382y, this.f16402e, this.f16406i);
                        int i36 = gVar.f16440r0;
                        float f9 = gVar.f16446x0;
                        if (this.f16409n == 0) {
                            i9 = gVar.f16442t0;
                            i8 = -1;
                            if (i9 != -1) {
                                f9 = gVar.f16448z0;
                                i36 = i9;
                                dVar8.Y = i36;
                                dVar8.f16351T = f9;
                            }
                        } else {
                            i8 = -1;
                        }
                        if (z9 && (i9 = gVar.f16444v0) != i8) {
                            f9 = gVar.f16415B0;
                            i36 = i9;
                        }
                        dVar8.Y = i36;
                        dVar8.f16351T = f9;
                    }
                    if (i34 == i18 - 1) {
                        dVar8.e(dVar8.f16333A, this.f16404g, this.k);
                    }
                    if (dVar7 != null) {
                        c cVar7 = dVar7.f16333A;
                        c cVar8 = dVar8.f16382y;
                        cVar8.a(cVar7, gVar.f16417D0);
                        if (i34 == i20) {
                            int i37 = this.f16406i;
                            if (cVar8.f()) {
                                cVar8.f16331f = i37;
                            }
                        }
                        cVar7.a(cVar8, 0);
                        if (i34 == i21 + 1) {
                            int i38 = this.k;
                            if (cVar7.f()) {
                                cVar7.f16331f = i38;
                            }
                        }
                    }
                    if (dVar8 != dVar6) {
                        if (z8) {
                            int i39 = gVar.f16418E0;
                            if (i39 != 0) {
                                if (i39 != 1) {
                                    if (i39 == 2) {
                                        dVar8.f16381x.a(cVar5, 0);
                                        dVar8.f16383z.a(cVar6, 0);
                                    }
                                } else {
                                    dVar8.f16381x.a(cVar5, 0);
                                }
                            } else {
                                dVar8.f16383z.a(cVar6, 0);
                            }
                        } else {
                            int i40 = gVar.f16418E0;
                            if (i40 != 0) {
                                if (i40 != 1) {
                                    if (i40 == 2) {
                                        if (z10) {
                                            dVar8.f16381x.a(this.f16401d, this.f16405h);
                                            dVar8.f16383z.a(this.f16403f, this.j);
                                        } else {
                                            dVar8.f16381x.a(cVar5, 0);
                                            dVar8.f16383z.a(cVar6, 0);
                                        }
                                    }
                                } else {
                                    dVar8.f16383z.a(cVar6, 0);
                                }
                            } else {
                                dVar8.f16381x.a(cVar5, 0);
                            }
                            i34++;
                            dVar7 = dVar8;
                        }
                    }
                    i34++;
                    dVar7 = dVar8;
                } else {
                    return;
                }
            }
        }
    }

    public final int c() {
        if (this.f16398a == 1) {
            return this.f16408m - this.f16413r.f16417D0;
        }
        return this.f16408m;
    }

    public final int d() {
        if (this.f16398a == 0) {
            return this.f16407l - this.f16413r.f16416C0;
        }
        return this.f16407l;
    }

    public final void e(int i4) {
        g gVar;
        int i8;
        int i9 = this.f16411p;
        if (i9 != 0) {
            int i10 = this.f16410o;
            int i11 = i4 / i9;
            int i12 = 0;
            while (true) {
                gVar = this.f16413r;
                if (i12 >= i10 || (i8 = this.f16409n + i12) >= gVar.f16428O0) {
                    break;
                }
                d dVar = gVar.f16427N0[i8];
                if (this.f16398a == 0) {
                    if (dVar != null) {
                        int[] iArr = dVar.f16362c0;
                        if (iArr[0] == 3 && dVar.j == 0) {
                            gVar.E(1, i11, iArr[1], dVar.i(), dVar);
                        }
                    }
                } else if (dVar != null) {
                    int[] iArr2 = dVar.f16362c0;
                    if (iArr2[1] == 3 && dVar.k == 0) {
                        int i13 = i11;
                        gVar.E(iArr2[0], dVar.l(), 1, i13, dVar);
                        i11 = i13;
                    }
                }
                i12++;
            }
            this.f16407l = 0;
            this.f16408m = 0;
            this.f16399b = null;
            this.f16400c = 0;
            int i14 = this.f16410o;
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = this.f16409n + i15;
                if (i16 < gVar.f16428O0) {
                    d dVar2 = gVar.f16427N0[i16];
                    if (this.f16398a == 0) {
                        int l6 = dVar2.l();
                        int i17 = gVar.f16416C0;
                        if (dVar2.f16353V == 8) {
                            i17 = 0;
                        }
                        this.f16407l = l6 + i17 + this.f16407l;
                        int C8 = gVar.C(dVar2, this.f16412q);
                        if (this.f16399b == null || this.f16400c < C8) {
                            this.f16399b = dVar2;
                            this.f16400c = C8;
                            this.f16408m = C8;
                        }
                    } else {
                        int D7 = gVar.D(dVar2, this.f16412q);
                        int C9 = gVar.C(dVar2, this.f16412q);
                        int i18 = gVar.f16417D0;
                        if (dVar2.f16353V == 8) {
                            i18 = 0;
                        }
                        this.f16408m = C9 + i18 + this.f16408m;
                        if (this.f16399b == null || this.f16400c < D7) {
                            this.f16399b = dVar2;
                            this.f16400c = D7;
                            this.f16407l = D7;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i4, c cVar, c cVar2, c cVar3, c cVar4, int i8, int i9, int i10, int i11, int i12) {
        this.f16398a = i4;
        this.f16401d = cVar;
        this.f16402e = cVar2;
        this.f16403f = cVar3;
        this.f16404g = cVar4;
        this.f16405h = i8;
        this.f16406i = i9;
        this.j = i10;
        this.k = i11;
        this.f16412q = i12;
    }
}
