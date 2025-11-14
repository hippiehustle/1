package z;

import java.util.ArrayList;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class j extends m {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i4, int i8, int i9, int i10, float f8, int i11) {
        int i12 = i8 - i4;
        int i13 = i10 - i9;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 == 1) {
                    iArr[0] = i12;
                    iArr[1] = (int) ((i12 * f8) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i13 * f8) + 0.5f);
            iArr[1] = i13;
            return;
        }
        int i14 = (int) ((i13 * f8) + 0.5f);
        int i15 = (int) ((i12 / f8) + 0.5f);
        if (i14 <= i12) {
            iArr[0] = i14;
            iArr[1] = i13;
        } else if (i15 <= i13) {
            iArr[0] = i12;
            iArr[1] = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r5 != 1) goto L125;
     */
    @Override // z.InterfaceC1847d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC1847d interfaceC1847d) {
        float f8;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        float f9;
        float f10;
        float f11;
        int i4;
        if (AbstractC1769h.b(this.j) != 3) {
            C1850g c1850g = this.f16609e;
            boolean z12 = c1850g.j;
            C1849f c1849f = this.f16612h;
            C1849f c1849f2 = this.f16613i;
            if (!z12 && this.f16608d == 3) {
                y.d dVar = this.f16606b;
                int i8 = dVar.j;
                if (i8 != 2) {
                    if (i8 == 3) {
                        int i9 = dVar.k;
                        if (i9 != 0 && i9 != 3) {
                            int i10 = dVar.f16344M;
                            if (i10 != -1) {
                                if (i10 != 0) {
                                    if (i10 != 1) {
                                        i4 = 0;
                                        c1850g.d(i4);
                                    } else {
                                        f9 = dVar.f16364e.f16609e.f16597g;
                                        f10 = dVar.f16343L;
                                    }
                                } else {
                                    f11 = dVar.f16364e.f16609e.f16597g / dVar.f16343L;
                                    i4 = (int) (f11 + 0.5f);
                                    c1850g.d(i4);
                                }
                            } else {
                                f9 = dVar.f16364e.f16609e.f16597g;
                                f10 = dVar.f16343L;
                            }
                            f11 = f9 * f10;
                            i4 = (int) (f11 + 0.5f);
                            c1850g.d(i4);
                        } else {
                            l lVar = dVar.f16364e;
                            C1849f c1849f3 = lVar.f16612h;
                            C1849f c1849f4 = lVar.f16613i;
                            if (dVar.f16381x.f16329d != null) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (dVar.f16382y.f16329d != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (dVar.f16383z.f16329d != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (dVar.f16333A.f16329d != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            f8 = 0.5f;
                            int i11 = dVar.f16344M;
                            if (z8 && z9 && z10 && z11) {
                                float f12 = dVar.f16343L;
                                boolean z13 = c1849f3.j;
                                ArrayList arrayList = c1849f3.f16600l;
                                int[] iArr = k;
                                if (z13 && c1849f4.j) {
                                    if (c1849f.f16593c && c1849f2.f16593c) {
                                        m(iArr, ((C1849f) c1849f.f16600l.get(0)).f16597g + c1849f.f16596f, ((C1849f) c1849f2.f16600l.get(0)).f16597g - c1849f2.f16596f, c1849f3.f16597g + c1849f3.f16596f, c1849f4.f16597g - c1849f4.f16596f, f12, i11);
                                        c1850g.d(iArr[0]);
                                        this.f16606b.f16364e.f16609e.d(iArr[1]);
                                        return;
                                    }
                                    return;
                                }
                                if (c1849f.j && c1849f2.j) {
                                    if (c1849f3.f16593c && c1849f4.f16593c) {
                                        m(iArr, c1849f.f16597g + c1849f.f16596f, c1849f2.f16597g - c1849f2.f16596f, ((C1849f) arrayList.get(0)).f16597g + c1849f3.f16596f, ((C1849f) c1849f4.f16600l.get(0)).f16597g - c1849f4.f16596f, f12, i11);
                                        c1850g.d(iArr[0]);
                                        this.f16606b.f16364e.f16609e.d(iArr[1]);
                                    } else {
                                        return;
                                    }
                                }
                                if (c1849f.f16593c && c1849f2.f16593c && c1849f3.f16593c && c1849f4.f16593c) {
                                    m(iArr, ((C1849f) c1849f.f16600l.get(0)).f16597g + c1849f.f16596f, ((C1849f) c1849f2.f16600l.get(0)).f16597g - c1849f2.f16596f, ((C1849f) arrayList.get(0)).f16597g + c1849f3.f16596f, ((C1849f) c1849f4.f16600l.get(0)).f16597g - c1849f4.f16596f, f12, i11);
                                    c1850g.d(iArr[0]);
                                    this.f16606b.f16364e.f16609e.d(iArr[1]);
                                } else {
                                    return;
                                }
                            } else if (z8 && z10) {
                                if (c1849f.f16593c && c1849f2.f16593c) {
                                    float f13 = dVar.f16343L;
                                    int i12 = ((C1849f) c1849f.f16600l.get(0)).f16597g + c1849f.f16596f;
                                    int i13 = ((C1849f) c1849f2.f16600l.get(0)).f16597g - c1849f2.f16596f;
                                    if (i11 != -1 && i11 != 0) {
                                        if (i11 == 1) {
                                            int g8 = g(i13 - i12, 0);
                                            int i14 = (int) ((g8 / f13) + 0.5f);
                                            int g9 = g(i14, 1);
                                            if (i14 != g9) {
                                                g8 = (int) ((g9 * f13) + 0.5f);
                                            }
                                            c1850g.d(g8);
                                            this.f16606b.f16364e.f16609e.d(g9);
                                        }
                                    } else {
                                        int g10 = g(i13 - i12, 0);
                                        int i15 = (int) ((g10 * f13) + 0.5f);
                                        int g11 = g(i15, 1);
                                        if (i15 != g11) {
                                            g10 = (int) ((g11 / f13) + 0.5f);
                                        }
                                        c1850g.d(g10);
                                        this.f16606b.f16364e.f16609e.d(g11);
                                    }
                                } else {
                                    return;
                                }
                            } else if (z9 && z11) {
                                if (c1849f3.f16593c && c1849f4.f16593c) {
                                    float f14 = dVar.f16343L;
                                    int i16 = ((C1849f) c1849f3.f16600l.get(0)).f16597g + c1849f3.f16596f;
                                    int i17 = ((C1849f) c1849f4.f16600l.get(0)).f16597g - c1849f4.f16596f;
                                    if (i11 != -1) {
                                        if (i11 == 0) {
                                            int g12 = g(i17 - i16, 1);
                                            int i18 = (int) ((g12 * f14) + 0.5f);
                                            int g13 = g(i18, 0);
                                            if (i18 != g13) {
                                                g12 = (int) ((g13 / f14) + 0.5f);
                                            }
                                            c1850g.d(g13);
                                            this.f16606b.f16364e.f16609e.d(g12);
                                        }
                                    }
                                    int g14 = g(i17 - i16, 1);
                                    int i19 = (int) ((g14 / f14) + 0.5f);
                                    int g15 = g(i19, 0);
                                    if (i19 != g15) {
                                        g14 = (int) ((g15 * f14) + 0.5f);
                                    }
                                    c1850g.d(g15);
                                    this.f16606b.f16364e.f16609e.d(g14);
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    f8 = 0.5f;
                    y.d dVar2 = dVar.f16341I;
                    if (dVar2 != null) {
                        if (dVar2.f16363d.f16609e.j) {
                            c1850g.d((int) ((r5.f16597g * dVar.f16372o) + 0.5f));
                        }
                    }
                }
                if (!c1849f.f16593c && c1849f2.f16593c) {
                    if (!c1849f.j || !c1849f2.j || !c1850g.j) {
                        if (!c1850g.j && this.f16608d == 3) {
                            y.d dVar3 = this.f16606b;
                            if (dVar3.j == 0 && !dVar3.q()) {
                                C1849f c1849f5 = (C1849f) c1849f.f16600l.get(0);
                                C1849f c1849f6 = (C1849f) c1849f2.f16600l.get(0);
                                int i20 = c1849f5.f16597g + c1849f.f16596f;
                                int i21 = c1849f6.f16597g + c1849f2.f16596f;
                                c1849f.d(i20);
                                c1849f2.d(i21);
                                c1850g.d(i21 - i20);
                                return;
                            }
                        }
                        if (!c1850g.j && this.f16608d == 3 && this.f16605a == 1 && c1849f.f16600l.size() > 0 && c1849f2.f16600l.size() > 0) {
                            C1849f c1849f7 = (C1849f) c1849f.f16600l.get(0);
                            int min = Math.min((((C1849f) c1849f2.f16600l.get(0)).f16597g + c1849f2.f16596f) - (c1849f7.f16597g + c1849f.f16596f), c1850g.f16601m);
                            y.d dVar4 = this.f16606b;
                            int i22 = dVar4.f16371n;
                            int max = Math.max(dVar4.f16370m, min);
                            if (i22 > 0) {
                                max = Math.min(i22, max);
                            }
                            c1850g.d(max);
                        }
                        if (c1850g.j) {
                            C1849f c1849f8 = (C1849f) c1849f.f16600l.get(0);
                            C1849f c1849f9 = (C1849f) c1849f2.f16600l.get(0);
                            int i23 = c1849f8.f16597g;
                            int i24 = c1849f.f16596f + i23;
                            int i25 = c1849f9.f16597g;
                            int i26 = c1849f2.f16596f + i25;
                            float f15 = this.f16606b.f16350S;
                            if (c1849f8 == c1849f9) {
                                f15 = f8;
                            } else {
                                i23 = i24;
                                i25 = i26;
                            }
                            c1849f.d((int) ((((i25 - i23) - c1850g.f16597g) * f15) + i23 + f8));
                            c1849f2.d(c1849f.f16597g + c1850g.f16597g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            f8 = 0.5f;
            if (!c1849f.f16593c) {
                return;
            } else {
                return;
            }
        }
        y.d dVar5 = this.f16606b;
        l(dVar5.f16381x, dVar5.f16383z, 0);
    }

    @Override // z.m
    public final void d() {
        y.d dVar;
        y.d dVar2;
        y.d dVar3;
        y.d dVar4;
        y.d dVar5 = this.f16606b;
        boolean z8 = dVar5.f16357a;
        C1850g c1850g = this.f16609e;
        if (z8) {
            c1850g.d(dVar5.l());
        }
        boolean z9 = c1850g.j;
        C1849f c1849f = this.f16613i;
        C1849f c1849f2 = this.f16612h;
        if (!z9) {
            y.d dVar6 = this.f16606b;
            int i4 = dVar6.f16362c0[0];
            this.f16608d = i4;
            if (i4 != 3) {
                if (i4 == 4 && (((dVar4 = dVar6.f16341I) != null && dVar4.f16362c0[0] == 1) || dVar4.f16362c0[0] == 4)) {
                    int l6 = dVar4.l();
                    j jVar = dVar4.f16363d;
                    int c6 = (l6 - this.f16606b.f16381x.c()) - this.f16606b.f16383z.c();
                    m.b(c1849f2, jVar.f16612h, this.f16606b.f16381x.c());
                    m.b(c1849f, jVar.f16613i, -this.f16606b.f16383z.c());
                    c1850g.d(c6);
                    return;
                }
                if (i4 == 1) {
                    c1850g.d(dVar6.l());
                }
            }
        } else if (this.f16608d == 4 && (((dVar2 = (dVar = this.f16606b).f16341I) != null && dVar2.f16362c0[0] == 1) || dVar2.f16362c0[0] == 4)) {
            m.b(c1849f2, dVar2.f16363d.f16612h, dVar.f16381x.c());
            m.b(c1849f, dVar2.f16363d.f16613i, -this.f16606b.f16383z.c());
            return;
        }
        if (c1850g.j) {
            y.d dVar7 = this.f16606b;
            if (dVar7.f16357a) {
                y.c[] cVarArr = dVar7.f16338F;
                y.c cVar = cVarArr[0];
                y.c cVar2 = cVar.f16329d;
                if (cVar2 != null && cVarArr[1].f16329d != null) {
                    if (dVar7.q()) {
                        c1849f2.f16596f = this.f16606b.f16338F[0].c();
                        c1849f.f16596f = -this.f16606b.f16338F[1].c();
                        return;
                    }
                    C1849f h8 = m.h(this.f16606b.f16338F[0]);
                    if (h8 != null) {
                        m.b(c1849f2, h8, this.f16606b.f16338F[0].c());
                    }
                    C1849f h9 = m.h(this.f16606b.f16338F[1]);
                    if (h9 != null) {
                        m.b(c1849f, h9, -this.f16606b.f16338F[1].c());
                    }
                    c1849f2.f16592b = true;
                    c1849f.f16592b = true;
                    return;
                }
                if (cVar2 != null) {
                    C1849f h10 = m.h(cVar);
                    if (h10 != null) {
                        m.b(c1849f2, h10, this.f16606b.f16338F[0].c());
                        m.b(c1849f, c1849f2, c1850g.f16597g);
                        return;
                    }
                    return;
                }
                y.c cVar3 = cVarArr[1];
                if (cVar3.f16329d != null) {
                    C1849f h11 = m.h(cVar3);
                    if (h11 != null) {
                        m.b(c1849f, h11, -this.f16606b.f16338F[1].c());
                        m.b(c1849f2, c1849f, -c1850g.f16597g);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof y.i) && dVar7.f16341I != null && dVar7.g(7).f16329d == null) {
                    y.d dVar8 = this.f16606b;
                    m.b(c1849f2, dVar8.f16341I.f16363d.f16612h, dVar8.m());
                    m.b(c1849f, c1849f2, c1850g.f16597g);
                    return;
                }
                return;
            }
        }
        if (this.f16608d == 3) {
            y.d dVar9 = this.f16606b;
            int i8 = dVar9.j;
            if (i8 != 2) {
                if (i8 == 3) {
                    if (dVar9.k == 3) {
                        c1849f2.f16591a = this;
                        c1849f.f16591a = this;
                        l lVar = dVar9.f16364e;
                        lVar.f16612h.f16591a = this;
                        lVar.f16613i.f16591a = this;
                        c1850g.f16591a = this;
                        if (dVar9.r()) {
                            c1850g.f16600l.add(this.f16606b.f16364e.f16609e);
                            this.f16606b.f16364e.f16609e.k.add(c1850g);
                            l lVar2 = this.f16606b.f16364e;
                            lVar2.f16609e.f16591a = this;
                            c1850g.f16600l.add(lVar2.f16612h);
                            c1850g.f16600l.add(this.f16606b.f16364e.f16613i);
                            this.f16606b.f16364e.f16612h.k.add(c1850g);
                            this.f16606b.f16364e.f16613i.k.add(c1850g);
                        } else if (this.f16606b.q()) {
                            this.f16606b.f16364e.f16609e.f16600l.add(c1850g);
                            c1850g.k.add(this.f16606b.f16364e.f16609e);
                        } else {
                            this.f16606b.f16364e.f16609e.f16600l.add(c1850g);
                        }
                    } else {
                        C1850g c1850g2 = dVar9.f16364e.f16609e;
                        c1850g.f16600l.add(c1850g2);
                        c1850g2.k.add(c1850g);
                        this.f16606b.f16364e.f16612h.k.add(c1850g);
                        this.f16606b.f16364e.f16613i.k.add(c1850g);
                        c1850g.f16592b = true;
                        c1850g.k.add(c1849f2);
                        c1850g.k.add(c1849f);
                        c1849f2.f16600l.add(c1850g);
                        c1849f.f16600l.add(c1850g);
                    }
                }
            } else {
                y.d dVar10 = dVar9.f16341I;
                if (dVar10 != null) {
                    C1850g c1850g3 = dVar10.f16364e.f16609e;
                    c1850g.f16600l.add(c1850g3);
                    c1850g3.k.add(c1850g);
                    c1850g.f16592b = true;
                    c1850g.k.add(c1849f2);
                    c1850g.k.add(c1849f);
                }
            }
        }
        y.d dVar11 = this.f16606b;
        y.c[] cVarArr2 = dVar11.f16338F;
        y.c cVar4 = cVarArr2[0];
        y.c cVar5 = cVar4.f16329d;
        if (cVar5 != null && cVarArr2[1].f16329d != null) {
            if (dVar11.q()) {
                c1849f2.f16596f = this.f16606b.f16338F[0].c();
                c1849f.f16596f = -this.f16606b.f16338F[1].c();
                return;
            }
            C1849f h12 = m.h(this.f16606b.f16338F[0]);
            C1849f h13 = m.h(this.f16606b.f16338F[1]);
            h12.b(this);
            h13.b(this);
            this.j = 4;
            return;
        }
        if (cVar5 != null) {
            C1849f h14 = m.h(cVar4);
            if (h14 != null) {
                m.b(c1849f2, h14, this.f16606b.f16338F[0].c());
                c(c1849f, c1849f2, 1, c1850g);
                return;
            }
            return;
        }
        y.c cVar6 = cVarArr2[1];
        if (cVar6.f16329d != null) {
            C1849f h15 = m.h(cVar6);
            if (h15 != null) {
                m.b(c1849f, h15, -this.f16606b.f16338F[1].c());
                c(c1849f2, c1849f, -1, c1850g);
                return;
            }
            return;
        }
        if (!(dVar11 instanceof y.i) && (dVar3 = dVar11.f16341I) != null) {
            m.b(c1849f2, dVar3.f16363d.f16612h, dVar11.m());
            c(c1849f, c1849f2, 1, c1850g);
        }
    }

    @Override // z.m
    public final void e() {
        C1849f c1849f = this.f16612h;
        if (c1849f.j) {
            this.f16606b.f16345N = c1849f.f16597g;
        }
    }

    @Override // z.m
    public final void f() {
        this.f16607c = null;
        this.f16612h.c();
        this.f16613i.c();
        this.f16609e.c();
        this.f16611g = false;
    }

    @Override // z.m
    public final boolean k() {
        if (this.f16608d == 3 && this.f16606b.j != 0) {
            return false;
        }
        return true;
    }

    public final void n() {
        this.f16611g = false;
        C1849f c1849f = this.f16612h;
        c1849f.c();
        c1849f.j = false;
        C1849f c1849f2 = this.f16613i;
        c1849f2.c();
        c1849f2.j = false;
        this.f16609e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f16606b.f16354W;
    }
}
