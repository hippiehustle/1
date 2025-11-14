package P;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class f0 extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f4267c;

    public f0() {
        this.f4267c = C.a.f();
    }

    @Override // P.i0
    public t0 b() {
        WindowInsets build;
        a();
        build = this.f4267c.build();
        t0 g8 = t0.g(null, build);
        g8.f4308a.o(this.f4278b);
        return g8;
    }

    @Override // P.i0
    public void d(H.c cVar) {
        this.f4267c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // P.i0
    public void e(H.c cVar) {
        this.f4267c.setStableInsets(cVar.d());
    }

    @Override // P.i0
    public void f(H.c cVar) {
        this.f4267c.setSystemGestureInsets(cVar.d());
    }

    @Override // P.i0
    public void g(H.c cVar) {
        this.f4267c.setSystemWindowInsets(cVar.d());
    }

    @Override // P.i0
    public void h(H.c cVar) {
        this.f4267c.setTappableElementInsets(cVar.d());
    }

    public f0(t0 t0Var) {
        super(t0Var);
        WindowInsets.Builder f8;
        WindowInsets f9 = t0Var.f();
        if (f9 != null) {
            f8 = C.a.g(f9);
        } else {
            f8 = C.a.f();
        }
        this.f4267c = f8;
    }
}
