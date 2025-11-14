package z;

import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class l extends m {
    public C1849f k;

    /* renamed from: l, reason: collision with root package name */
    public C1844a f16604l;

    @Override // z.InterfaceC1847d
    public final void a(InterfaceC1847d interfaceC1847d) {
        float f8;
        float f9;
        float f10;
        int i4;
        if (AbstractC1769h.b(this.j) != 3) {
            C1850g c1850g = this.f16609e;
            if (c1850g.f16593c && !c1850g.j && this.f16608d == 3) {
                y.d dVar = this.f16606b;
                int i8 = dVar.k;
                if (i8 != 2) {
                    if (i8 == 3) {
                        C1850g c1850g2 = dVar.f16363d.f16609e;
                        if (c1850g2.j) {
                            int i9 = dVar.f16344M;
                            if (i9 != -1) {
                                if (i9 != 0) {
                                    if (i9 != 1) {
                                        i4 = 0;
                                        c1850g.d(i4);
                                    } else {
                                        f8 = c1850g2.f16597g;
                                        f9 = dVar.f16343L;
                                    }
                                } else {
                                    f10 = c1850g2.f16597g * dVar.f16343L;
                                    i4 = (int) (f10 + 0.5f);
                                    c1850g.d(i4);
                                }
                            } else {
                                f8 = c1850g2.f16597g;
                                f9 = dVar.f16343L;
                            }
                            f10 = f8 / f9;
                            i4 = (int) (f10 + 0.5f);
                            c1850g.d(i4);
                        }
                    }
                } else {
                    y.d dVar2 = dVar.f16341I;
                    if (dVar2 != null) {
                        if (dVar2.f16364e.f16609e.j) {
                            c1850g.d((int) ((r5.f16597g * dVar.f16375r) + 0.5f));
                        }
                    }
                }
            }
            C1849f c1849f = this.f16612h;
            if (c1849f.f16593c) {
                C1849f c1849f2 = this.f16613i;
                if (c1849f2.f16593c) {
                    if (!c1849f.j || !c1849f2.j || !c1850g.j) {
                        if (!c1850g.j && this.f16608d == 3) {
                            y.d dVar3 = this.f16606b;
                            if (dVar3.j == 0 && !dVar3.r()) {
                                C1849f c1849f3 = (C1849f) c1849f.f16600l.get(0);
                                C1849f c1849f4 = (C1849f) c1849f2.f16600l.get(0);
                                int i10 = c1849f3.f16597g + c1849f.f16596f;
                                int i11 = c1849f4.f16597g + c1849f2.f16596f;
                                c1849f.d(i10);
                                c1849f2.d(i11);
                                c1850g.d(i11 - i10);
                                return;
                            }
                        }
                        if (!c1850g.j && this.f16608d == 3 && this.f16605a == 1 && c1849f.f16600l.size() > 0 && c1849f2.f16600l.size() > 0) {
                            C1849f c1849f5 = (C1849f) c1849f.f16600l.get(0);
                            int i12 = (((C1849f) c1849f2.f16600l.get(0)).f16597g + c1849f2.f16596f) - (c1849f5.f16597g + c1849f.f16596f);
                            int i13 = c1850g.f16601m;
                            if (i12 < i13) {
                                c1850g.d(i12);
                            } else {
                                c1850g.d(i13);
                            }
                        }
                        if (c1850g.j && c1849f.f16600l.size() > 0 && c1849f2.f16600l.size() > 0) {
                            C1849f c1849f6 = (C1849f) c1849f.f16600l.get(0);
                            C1849f c1849f7 = (C1849f) c1849f2.f16600l.get(0);
                            int i14 = c1849f6.f16597g;
                            int i15 = c1849f.f16596f + i14;
                            int i16 = c1849f7.f16597g;
                            int i17 = c1849f2.f16596f + i16;
                            float f11 = this.f16606b.f16351T;
                            if (c1849f6 == c1849f7) {
                                f11 = 0.5f;
                            } else {
                                i14 = i15;
                                i16 = i17;
                            }
                            c1849f.d((int) ((((i16 - i14) - c1850g.f16597g) * f11) + i14 + 0.5f));
                            c1849f2.d(c1849f.f16597g + c1850g.f16597g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        y.d dVar4 = this.f16606b;
        l(dVar4.f16382y, dVar4.f16333A, 1);
    }

    /* JADX WARN: Type inference failed for: r1v128, types: [z.g, z.a] */
    @Override // z.m
    public final void d() {
        y.d dVar;
        y.d dVar2;
        y.d dVar3;
        y.d dVar4;
        C1849f c1849f = this.k;
        y.d dVar5 = this.f16606b;
        boolean z8 = dVar5.f16357a;
        C1850g c1850g = this.f16609e;
        if (z8) {
            c1850g.d(dVar5.i());
        }
        boolean z9 = c1850g.j;
        C1849f c1849f2 = this.f16613i;
        C1849f c1849f3 = this.f16612h;
        if (!z9) {
            y.d dVar6 = this.f16606b;
            this.f16608d = dVar6.f16362c0[1];
            if (dVar6.f16380w) {
                this.f16604l = new C1850g(this);
            }
            int i4 = this.f16608d;
            if (i4 != 3) {
                if (i4 == 4 && (dVar4 = this.f16606b.f16341I) != null) {
                    l lVar = dVar4.f16364e;
                    if (dVar4.f16362c0[1] == 1) {
                        int i8 = (dVar4.i() - this.f16606b.f16382y.c()) - this.f16606b.f16333A.c();
                        m.b(c1849f3, lVar.f16612h, this.f16606b.f16382y.c());
                        m.b(c1849f2, lVar.f16613i, -this.f16606b.f16333A.c());
                        c1850g.d(i8);
                        return;
                    }
                }
                if (i4 == 1) {
                    c1850g.d(this.f16606b.i());
                }
            }
        } else if (this.f16608d == 4 && (dVar2 = (dVar = this.f16606b).f16341I) != null) {
            l lVar2 = dVar2.f16364e;
            if (dVar2.f16362c0[1] == 1) {
                m.b(c1849f3, lVar2.f16612h, dVar.f16382y.c());
                m.b(c1849f2, lVar2.f16613i, -this.f16606b.f16333A.c());
                return;
            }
        }
        boolean z10 = c1850g.j;
        if (z10) {
            y.d dVar7 = this.f16606b;
            if (dVar7.f16357a) {
                y.c[] cVarArr = dVar7.f16338F;
                y.c cVar = cVarArr[2];
                y.c cVar2 = cVar.f16329d;
                if (cVar2 != null && cVarArr[3].f16329d != null) {
                    if (dVar7.r()) {
                        c1849f3.f16596f = this.f16606b.f16338F[2].c();
                        c1849f2.f16596f = -this.f16606b.f16338F[3].c();
                    } else {
                        C1849f h8 = m.h(this.f16606b.f16338F[2]);
                        if (h8 != null) {
                            m.b(c1849f3, h8, this.f16606b.f16338F[2].c());
                        }
                        C1849f h9 = m.h(this.f16606b.f16338F[3]);
                        if (h9 != null) {
                            m.b(c1849f2, h9, -this.f16606b.f16338F[3].c());
                        }
                        c1849f3.f16592b = true;
                        c1849f2.f16592b = true;
                    }
                    y.d dVar8 = this.f16606b;
                    if (dVar8.f16380w) {
                        m.b(c1849f, c1849f3, dVar8.f16347P);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    C1849f h10 = m.h(cVar);
                    if (h10 != null) {
                        m.b(c1849f3, h10, this.f16606b.f16338F[2].c());
                        m.b(c1849f2, c1849f3, c1850g.f16597g);
                        y.d dVar9 = this.f16606b;
                        if (dVar9.f16380w) {
                            m.b(c1849f, c1849f3, dVar9.f16347P);
                            return;
                        }
                        return;
                    }
                    return;
                }
                y.c cVar3 = cVarArr[3];
                if (cVar3.f16329d != null) {
                    C1849f h11 = m.h(cVar3);
                    if (h11 != null) {
                        m.b(c1849f2, h11, -this.f16606b.f16338F[3].c());
                        m.b(c1849f3, c1849f2, -c1850g.f16597g);
                    }
                    y.d dVar10 = this.f16606b;
                    if (dVar10.f16380w) {
                        m.b(c1849f, c1849f3, dVar10.f16347P);
                        return;
                    }
                    return;
                }
                y.c cVar4 = cVarArr[4];
                if (cVar4.f16329d != null) {
                    C1849f h12 = m.h(cVar4);
                    if (h12 != null) {
                        m.b(c1849f, h12, 0);
                        m.b(c1849f3, c1849f, -this.f16606b.f16347P);
                        m.b(c1849f2, c1849f3, c1850g.f16597g);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof y.i) && dVar7.f16341I != null && dVar7.g(7).f16329d == null) {
                    y.d dVar11 = this.f16606b;
                    m.b(c1849f3, dVar11.f16341I.f16364e.f16612h, dVar11.n());
                    m.b(c1849f2, c1849f3, c1850g.f16597g);
                    y.d dVar12 = this.f16606b;
                    if (dVar12.f16380w) {
                        m.b(c1849f, c1849f3, dVar12.f16347P);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!z10 && this.f16608d == 3) {
            y.d dVar13 = this.f16606b;
            int i9 = dVar13.k;
            if (i9 != 2) {
                if (i9 == 3 && !dVar13.r()) {
                    y.d dVar14 = this.f16606b;
                    if (dVar14.j != 3) {
                        C1850g c1850g2 = dVar14.f16363d.f16609e;
                        c1850g.f16600l.add(c1850g2);
                        c1850g2.k.add(c1850g);
                        c1850g.f16592b = true;
                        c1850g.k.add(c1849f3);
                        c1850g.k.add(c1849f2);
                    }
                }
            } else {
                y.d dVar15 = dVar13.f16341I;
                if (dVar15 != null) {
                    C1850g c1850g3 = dVar15.f16364e.f16609e;
                    c1850g.f16600l.add(c1850g3);
                    c1850g3.k.add(c1850g);
                    c1850g.f16592b = true;
                    c1850g.k.add(c1849f3);
                    c1850g.k.add(c1849f2);
                }
            }
        } else {
            c1850g.b(this);
        }
        y.d dVar16 = this.f16606b;
        y.c[] cVarArr2 = dVar16.f16338F;
        y.c cVar5 = cVarArr2[2];
        y.c cVar6 = cVar5.f16329d;
        if (cVar6 != null && cVarArr2[3].f16329d != null) {
            if (dVar16.r()) {
                c1849f3.f16596f = this.f16606b.f16338F[2].c();
                c1849f2.f16596f = -this.f16606b.f16338F[3].c();
            } else {
                C1849f h13 = m.h(this.f16606b.f16338F[2]);
                C1849f h14 = m.h(this.f16606b.f16338F[3]);
                h13.b(this);
                h14.b(this);
                this.j = 4;
            }
            if (this.f16606b.f16380w) {
                c(c1849f, c1849f3, 1, this.f16604l);
            }
        } else if (cVar6 != null) {
            C1849f h15 = m.h(cVar5);
            if (h15 != null) {
                m.b(c1849f3, h15, this.f16606b.f16338F[2].c());
                c(c1849f2, c1849f3, 1, c1850g);
                if (this.f16606b.f16380w) {
                    c(c1849f, c1849f3, 1, this.f16604l);
                }
                if (this.f16608d == 3) {
                    y.d dVar17 = this.f16606b;
                    if (dVar17.f16343L > 0.0f) {
                        j jVar = dVar17.f16363d;
                        if (jVar.f16608d == 3) {
                            jVar.f16609e.k.add(c1850g);
                            c1850g.f16600l.add(this.f16606b.f16363d.f16609e);
                            c1850g.f16591a = this;
                        }
                    }
                }
            }
        } else {
            y.c cVar7 = cVarArr2[3];
            if (cVar7.f16329d != null) {
                C1849f h16 = m.h(cVar7);
                if (h16 != null) {
                    m.b(c1849f2, h16, -this.f16606b.f16338F[3].c());
                    c(c1849f3, c1849f2, -1, c1850g);
                    if (this.f16606b.f16380w) {
                        c(c1849f, c1849f3, 1, this.f16604l);
                    }
                }
            } else {
                y.c cVar8 = cVarArr2[4];
                if (cVar8.f16329d != null) {
                    C1849f h17 = m.h(cVar8);
                    if (h17 != null) {
                        m.b(c1849f, h17, 0);
                        c(c1849f3, c1849f, -1, this.f16604l);
                        c(c1849f2, c1849f3, 1, c1850g);
                    }
                } else if (!(dVar16 instanceof y.i) && (dVar3 = dVar16.f16341I) != null) {
                    m.b(c1849f3, dVar3.f16364e.f16612h, dVar16.n());
                    c(c1849f2, c1849f3, 1, c1850g);
                    if (this.f16606b.f16380w) {
                        c(c1849f, c1849f3, 1, this.f16604l);
                    }
                    if (this.f16608d == 3) {
                        y.d dVar18 = this.f16606b;
                        if (dVar18.f16343L > 0.0f) {
                            j jVar2 = dVar18.f16363d;
                            if (jVar2.f16608d == 3) {
                                jVar2.f16609e.k.add(c1850g);
                                c1850g.f16600l.add(this.f16606b.f16363d.f16609e);
                                c1850g.f16591a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c1850g.f16600l.size() == 0) {
            c1850g.f16593c = true;
        }
    }

    @Override // z.m
    public final void e() {
        C1849f c1849f = this.f16612h;
        if (c1849f.j) {
            this.f16606b.f16346O = c1849f.f16597g;
        }
    }

    @Override // z.m
    public final void f() {
        this.f16607c = null;
        this.f16612h.c();
        this.f16613i.c();
        this.k.c();
        this.f16609e.c();
        this.f16611g = false;
    }

    @Override // z.m
    public final boolean k() {
        if (this.f16608d == 3 && this.f16606b.k != 0) {
            return false;
        }
        return true;
    }

    public final void m() {
        this.f16611g = false;
        C1849f c1849f = this.f16612h;
        c1849f.c();
        c1849f.j = false;
        C1849f c1849f2 = this.f16613i;
        c1849f2.c();
        c1849f2.j = false;
        C1849f c1849f3 = this.k;
        c1849f3.c();
        c1849f3.j = false;
        this.f16609e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f16606b.f16354W;
    }
}
