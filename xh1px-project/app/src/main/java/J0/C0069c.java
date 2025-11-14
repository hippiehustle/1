package J0;

import android.view.ViewGroup;

/* renamed from: J0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069c extends q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2274a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2275b;

    public C0069c(ViewGroup viewGroup) {
        this.f2275b = viewGroup;
    }

    @Override // J0.q, J0.n
    public final void a() {
        E2.d.T(this.f2275b, false);
    }

    @Override // J0.q, J0.n
    public final void c() {
        E2.d.T(this.f2275b, true);
    }

    @Override // J0.q, J0.n
    public final void d(p pVar) {
        if (!this.f2274a) {
            E2.d.T(this.f2275b, false);
        }
        pVar.z(this);
    }

    @Override // J0.q, J0.n
    public final void e(p pVar) {
        E2.d.T(this.f2275b, false);
        this.f2274a = true;
    }
}
