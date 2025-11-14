package z;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends m {
    @Override // z.InterfaceC1847d
    public final void a(InterfaceC1847d interfaceC1847d) {
        y.a aVar = (y.a) this.f16606b;
        int i4 = aVar.f16308f0;
        C1849f c1849f = this.f16612h;
        Iterator it = c1849f.f16600l.iterator();
        int i8 = 0;
        int i9 = -1;
        while (it.hasNext()) {
            int i10 = ((C1849f) it.next()).f16597g;
            if (i9 == -1 || i10 < i9) {
                i9 = i10;
            }
            if (i8 < i10) {
                i8 = i10;
            }
        }
        if (i4 != 0 && i4 != 2) {
            c1849f.d(i8 + aVar.f16310h0);
        } else {
            c1849f.d(i9 + aVar.f16310h0);
        }
    }

    @Override // z.m
    public final void d() {
        y.d dVar = this.f16606b;
        if (dVar instanceof y.a) {
            C1849f c1849f = this.f16612h;
            c1849f.f16592b = true;
            y.a aVar = (y.a) dVar;
            int i4 = aVar.f16308f0;
            boolean z8 = aVar.f16309g0;
            int i8 = 0;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            c1849f.f16595e = 7;
                            while (i8 < aVar.f16455e0) {
                                y.d dVar2 = aVar.f16454d0[i8];
                                if (z8 || dVar2.f16353V != 8) {
                                    C1849f c1849f2 = dVar2.f16364e.f16613i;
                                    c1849f2.k.add(c1849f);
                                    c1849f.f16600l.add(c1849f2);
                                }
                                i8++;
                            }
                            m(this.f16606b.f16364e.f16612h);
                            m(this.f16606b.f16364e.f16613i);
                            return;
                        }
                        return;
                    }
                    c1849f.f16595e = 6;
                    while (i8 < aVar.f16455e0) {
                        y.d dVar3 = aVar.f16454d0[i8];
                        if (z8 || dVar3.f16353V != 8) {
                            C1849f c1849f3 = dVar3.f16364e.f16612h;
                            c1849f3.k.add(c1849f);
                            c1849f.f16600l.add(c1849f3);
                        }
                        i8++;
                    }
                    m(this.f16606b.f16364e.f16612h);
                    m(this.f16606b.f16364e.f16613i);
                    return;
                }
                c1849f.f16595e = 5;
                while (i8 < aVar.f16455e0) {
                    y.d dVar4 = aVar.f16454d0[i8];
                    if (z8 || dVar4.f16353V != 8) {
                        C1849f c1849f4 = dVar4.f16363d.f16613i;
                        c1849f4.k.add(c1849f);
                        c1849f.f16600l.add(c1849f4);
                    }
                    i8++;
                }
                m(this.f16606b.f16363d.f16612h);
                m(this.f16606b.f16363d.f16613i);
                return;
            }
            c1849f.f16595e = 4;
            while (i8 < aVar.f16455e0) {
                y.d dVar5 = aVar.f16454d0[i8];
                if (z8 || dVar5.f16353V != 8) {
                    C1849f c1849f5 = dVar5.f16363d.f16612h;
                    c1849f5.k.add(c1849f);
                    c1849f.f16600l.add(c1849f5);
                }
                i8++;
            }
            m(this.f16606b.f16363d.f16612h);
            m(this.f16606b.f16363d.f16613i);
        }
    }

    @Override // z.m
    public final void e() {
        y.d dVar = this.f16606b;
        if (dVar instanceof y.a) {
            int i4 = ((y.a) dVar).f16308f0;
            C1849f c1849f = this.f16612h;
            if (i4 != 0 && i4 != 1) {
                dVar.f16346O = c1849f.f16597g;
            } else {
                dVar.f16345N = c1849f.f16597g;
            }
        }
    }

    @Override // z.m
    public final void f() {
        this.f16607c = null;
        this.f16612h.c();
    }

    @Override // z.m
    public final boolean k() {
        return false;
    }

    public final void m(C1849f c1849f) {
        C1849f c1849f2 = this.f16612h;
        c1849f2.k.add(c1849f);
        c1849f.f16600l.add(c1849f2);
    }
}
