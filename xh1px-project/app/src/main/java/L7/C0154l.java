package L7;

/* renamed from: L7.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154l extends Z implements InterfaceC0153k {

    /* renamed from: h, reason: collision with root package name */
    public final d0 f3223h;

    public C0154l(d0 d0Var) {
        this.f3223h = d0Var;
    }

    @Override // L7.InterfaceC0153k
    public final boolean c(Throwable th) {
        return j().A(th);
    }

    @Override // L7.Z
    public final boolean k() {
        return true;
    }

    @Override // L7.Z
    public final void l(Throwable th) {
        this.f3223h.t(j());
    }
}
