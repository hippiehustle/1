package z;

/* loaded from: classes.dex */
public final class h extends m {
    @Override // z.InterfaceC1847d
    public final void a(InterfaceC1847d interfaceC1847d) {
        C1849f c1849f = this.f16612h;
        if (!c1849f.f16593c || c1849f.j) {
            return;
        }
        c1849f.d((int) ((((C1849f) c1849f.f16600l.get(0)).f16597g * ((y.h) this.f16606b).f16449d0) + 0.5f));
    }

    @Override // z.m
    public final void d() {
        y.d dVar = this.f16606b;
        y.h hVar = (y.h) dVar;
        int i4 = hVar.f16450e0;
        int i8 = hVar.f16451f0;
        int i9 = hVar.f16453h0;
        C1849f c1849f = this.f16612h;
        if (i9 == 1) {
            if (i4 != -1) {
                c1849f.f16600l.add(dVar.f16341I.f16363d.f16612h);
                this.f16606b.f16341I.f16363d.f16612h.k.add(c1849f);
                c1849f.f16596f = i4;
            } else if (i8 != -1) {
                c1849f.f16600l.add(dVar.f16341I.f16363d.f16613i);
                this.f16606b.f16341I.f16363d.f16613i.k.add(c1849f);
                c1849f.f16596f = -i8;
            } else {
                c1849f.f16592b = true;
                c1849f.f16600l.add(dVar.f16341I.f16363d.f16613i);
                this.f16606b.f16341I.f16363d.f16613i.k.add(c1849f);
            }
            m(this.f16606b.f16363d.f16612h);
            m(this.f16606b.f16363d.f16613i);
            return;
        }
        if (i4 != -1) {
            c1849f.f16600l.add(dVar.f16341I.f16364e.f16612h);
            this.f16606b.f16341I.f16364e.f16612h.k.add(c1849f);
            c1849f.f16596f = i4;
        } else if (i8 != -1) {
            c1849f.f16600l.add(dVar.f16341I.f16364e.f16613i);
            this.f16606b.f16341I.f16364e.f16613i.k.add(c1849f);
            c1849f.f16596f = -i8;
        } else {
            c1849f.f16592b = true;
            c1849f.f16600l.add(dVar.f16341I.f16364e.f16613i);
            this.f16606b.f16341I.f16364e.f16613i.k.add(c1849f);
        }
        m(this.f16606b.f16364e.f16612h);
        m(this.f16606b.f16364e.f16613i);
    }

    @Override // z.m
    public final void e() {
        y.d dVar = this.f16606b;
        int i4 = ((y.h) dVar).f16453h0;
        C1849f c1849f = this.f16612h;
        if (i4 == 1) {
            dVar.f16345N = c1849f.f16597g;
        } else {
            dVar.f16346O = c1849f.f16597g;
        }
    }

    @Override // z.m
    public final void f() {
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
