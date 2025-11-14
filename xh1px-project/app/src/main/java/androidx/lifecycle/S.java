package androidx.lifecycle;

/* loaded from: classes.dex */
public final class S implements InterfaceC0508t, AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public final String f8805d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f8806e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8807f;

    public S(String str, Q q6) {
        this.f8805d = str;
        this.f8806e = q6;
    }

    @Override // androidx.lifecycle.InterfaceC0508t
    public final void a(InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n) {
        if (enumC0503n == EnumC0503n.ON_DESTROY) {
            this.f8807f = false;
            interfaceC0510v.g().f(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public final void d(A.i iVar, C0512x c0512x) {
        o6.j.e(iVar, "registry");
        o6.j.e(c0512x, "lifecycle");
        if (!this.f8807f) {
            this.f8807f = true;
            c0512x.a(this);
            iVar.k(this.f8805d, (g0.F) this.f8806e.f8804a.f299i);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}
