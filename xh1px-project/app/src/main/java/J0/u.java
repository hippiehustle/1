package J0;

/* loaded from: classes.dex */
public final class u extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2341a;

    /* renamed from: b, reason: collision with root package name */
    public p f2342b;

    public /* synthetic */ u() {
        this.f2341a = 1;
    }

    @Override // J0.q, J0.n
    public void b(p pVar) {
        switch (this.f2341a) {
            case 1:
                C0067a c0067a = (C0067a) this.f2342b;
                if (!c0067a.f2272I) {
                    c0067a.J();
                    c0067a.f2272I = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // J0.q, J0.n
    public void d(p pVar) {
        switch (this.f2341a) {
            case 1:
                C0067a c0067a = (C0067a) this.f2342b;
                int i4 = c0067a.f2271H - 1;
                c0067a.f2271H = i4;
                if (i4 == 0) {
                    c0067a.f2272I = false;
                    c0067a.m();
                }
                pVar.z(this);
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                this.f2342b.B();
                pVar.z(this);
                return;
            default:
                return;
        }
    }

    @Override // J0.q, J0.n
    public void e(p pVar) {
        switch (this.f2341a) {
            case 0:
                C0067a c0067a = (C0067a) this.f2342b;
                c0067a.f2269F.remove(pVar);
                if (!c0067a.s()) {
                    c0067a.w(c0067a, o.f2304d, false);
                    c0067a.f2328u = true;
                    c0067a.w(c0067a, o.f2303c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ u(p pVar, int i4) {
        this.f2341a = i4;
        this.f2342b = pVar;
    }
}
