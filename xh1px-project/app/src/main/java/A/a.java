package A;

/* loaded from: classes.dex */
public final class a extends c {
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public y.a f0l;

    @Override // A.c
    public final void f(y.d dVar, boolean z8) {
        int i4 = this.j;
        this.k = i4;
        if (z8) {
            if (i4 == 5) {
                this.k = 1;
            } else if (i4 == 6) {
                this.k = 0;
            }
        } else if (i4 == 5) {
            this.k = 0;
        } else if (i4 == 6) {
            this.k = 1;
        }
        if (dVar instanceof y.a) {
            ((y.a) dVar).f16308f0 = this.k;
        }
    }

    public int getMargin() {
        return this.f0l.f16310h0;
    }

    public int getType() {
        return this.j;
    }

    public void setAllowsGoneWidget(boolean z8) {
        this.f0l.f16309g0 = z8;
    }

    public void setDpMargin(int i4) {
        this.f0l.f16310h0 = (int) ((i4 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i4) {
        this.f0l.f16310h0 = i4;
    }

    public void setType(int i4) {
        this.j = i4;
    }
}
