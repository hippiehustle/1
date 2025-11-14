package z;

import x.AbstractC1769h;

/* loaded from: classes.dex */
public abstract class m implements InterfaceC1847d {

    /* renamed from: a, reason: collision with root package name */
    public int f16605a;

    /* renamed from: b, reason: collision with root package name */
    public y.d f16606b;

    /* renamed from: c, reason: collision with root package name */
    public k f16607c;

    /* renamed from: d, reason: collision with root package name */
    public int f16608d;

    /* renamed from: e, reason: collision with root package name */
    public final C1850g f16609e = new C1850g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f16610f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16611g = false;

    /* renamed from: h, reason: collision with root package name */
    public final C1849f f16612h = new C1849f(this);

    /* renamed from: i, reason: collision with root package name */
    public final C1849f f16613i = new C1849f(this);
    public int j = 1;

    public m(y.d dVar) {
        this.f16606b = dVar;
    }

    public static void b(C1849f c1849f, C1849f c1849f2, int i4) {
        c1849f.f16600l.add(c1849f2);
        c1849f.f16596f = i4;
        c1849f2.k.add(c1849f);
    }

    public static C1849f h(y.c cVar) {
        y.c cVar2 = cVar.f16329d;
        if (cVar2 != null) {
            y.d dVar = cVar2.f16327b;
            int b4 = AbstractC1769h.b(cVar2.f16328c);
            if (b4 != 1) {
                if (b4 != 2) {
                    if (b4 != 3) {
                        if (b4 != 4) {
                            if (b4 != 5) {
                                return null;
                            }
                            return dVar.f16364e.k;
                        }
                        return dVar.f16364e.f16613i;
                    }
                    return dVar.f16363d.f16613i;
                }
                return dVar.f16364e.f16612h;
            }
            return dVar.f16363d.f16612h;
        }
        return null;
    }

    public static C1849f i(y.c cVar, int i4) {
        m mVar;
        y.c cVar2 = cVar.f16329d;
        if (cVar2 != null) {
            y.d dVar = cVar2.f16327b;
            if (i4 == 0) {
                mVar = dVar.f16363d;
            } else {
                mVar = dVar.f16364e;
            }
            int b4 = AbstractC1769h.b(cVar2.f16328c);
            if (b4 != 1 && b4 != 2) {
                if (b4 != 3 && b4 != 4) {
                    return null;
                }
                return mVar.f16613i;
            }
            return mVar.f16612h;
        }
        return null;
    }

    public final void c(C1849f c1849f, C1849f c1849f2, int i4, C1850g c1850g) {
        c1849f.f16600l.add(c1849f2);
        c1849f.f16600l.add(this.f16609e);
        c1849f.f16598h = i4;
        c1849f.f16599i = c1850g;
        c1849f2.k.add(c1849f);
        c1850g.k.add(c1849f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i4, int i8) {
        if (i8 == 0) {
            y.d dVar = this.f16606b;
            int i9 = dVar.f16371n;
            int max = Math.max(dVar.f16370m, i4);
            if (i9 > 0) {
                max = Math.min(i9, i4);
            }
            if (max != i4) {
                return max;
            }
        } else {
            y.d dVar2 = this.f16606b;
            int i10 = dVar2.f16374q;
            int max2 = Math.max(dVar2.f16373p, i4);
            if (i10 > 0) {
                max2 = Math.min(i10, i4);
            }
            if (max2 != i4) {
                return max2;
            }
        }
        return i4;
    }

    public long j() {
        if (this.f16609e.j) {
            return r0.f16597g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(y.c cVar, y.c cVar2, int i4) {
        float f8;
        m mVar;
        float f9;
        int i8;
        C1849f h8 = h(cVar);
        C1849f h9 = h(cVar2);
        if (h8.j && h9.j) {
            int c6 = cVar.c() + h8.f16597g;
            int c9 = h9.f16597g - cVar2.c();
            int i9 = c9 - c6;
            C1850g c1850g = this.f16609e;
            if (!c1850g.j && this.f16608d == 3) {
                int i10 = this.f16605a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                y.d dVar = this.f16606b;
                                m mVar2 = dVar.f16363d;
                                m mVar3 = dVar.f16364e;
                                if (mVar2.f16608d != 3 || mVar2.f16605a != 3 || mVar3.f16608d != 3 || mVar3.f16605a != 3) {
                                    if (i4 == 0) {
                                        mVar2 = mVar3;
                                    }
                                    if (mVar2.f16609e.j) {
                                        float f10 = dVar.f16343L;
                                        if (i4 == 1) {
                                            i8 = (int) ((r6.f16597g / f10) + 0.5f);
                                        } else {
                                            i8 = (int) ((f10 * r6.f16597g) + 0.5f);
                                        }
                                        c1850g.d(i8);
                                    }
                                }
                            }
                        } else {
                            y.d dVar2 = this.f16606b;
                            y.d dVar3 = dVar2.f16341I;
                            if (dVar3 != null) {
                                if (i4 == 0) {
                                    mVar = dVar3.f16363d;
                                } else {
                                    mVar = dVar3.f16364e;
                                }
                                if (mVar.f16609e.j) {
                                    if (i4 == 0) {
                                        f9 = dVar2.f16372o;
                                    } else {
                                        f9 = dVar2.f16375r;
                                    }
                                    c1850g.d(g((int) ((r6.f16597g * f9) + 0.5f), i4));
                                }
                            }
                        }
                    } else {
                        c1850g.d(Math.min(g(c1850g.f16601m, i4), i9));
                    }
                } else {
                    c1850g.d(g(i9, i4));
                }
            }
            if (c1850g.j) {
                int i11 = c1850g.f16597g;
                C1849f c1849f = this.f16613i;
                C1849f c1849f2 = this.f16612h;
                if (i11 == i9) {
                    c1849f2.d(c6);
                    c1849f.d(c9);
                    return;
                }
                y.d dVar4 = this.f16606b;
                if (i4 == 0) {
                    f8 = dVar4.f16350S;
                } else {
                    f8 = dVar4.f16351T;
                }
                if (h8 == h9) {
                    c6 = h8.f16597g;
                    c9 = h9.f16597g;
                    f8 = 0.5f;
                }
                c1849f2.d((int) ((((c9 - c6) - i11) * f8) + c6 + 0.5f));
                c1849f.d(c1849f2.f16597g + c1850g.f16597g);
            }
        }
    }
}
