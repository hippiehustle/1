package L7;

/* loaded from: classes.dex */
public final class b0 extends Z {

    /* renamed from: h, reason: collision with root package name */
    public final d0 f3201h;

    /* renamed from: i, reason: collision with root package name */
    public final c0 f3202i;
    public final C0154l j;
    public final Object k;

    public b0(d0 d0Var, c0 c0Var, C0154l c0154l, Object obj) {
        this.f3201h = d0Var;
        this.f3202i = c0Var;
        this.j = c0154l;
        this.k = obj;
    }

    @Override // L7.Z
    public final boolean k() {
        return false;
    }

    @Override // L7.Z
    public final void l(Throwable th) {
        C0154l c0154l = this.j;
        C0154l U8 = d0.U(c0154l);
        d0 d0Var = this.f3201h;
        c0 c0Var = this.f3202i;
        Object obj = this.k;
        if (U8 == null || !d0Var.d0(c0Var, U8, obj)) {
            c0Var.f3208d.e(new Q7.h(2), 2);
            C0154l U9 = d0.U(c0154l);
            if (U9 != null && d0Var.d0(c0Var, U9, obj)) {
                return;
            }
            d0Var.q(d0Var.F(c0Var, obj));
        }
    }
}
