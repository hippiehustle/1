package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class H implements InterfaceC0510v {

    /* renamed from: l, reason: collision with root package name */
    public static final H f8776l = new H();

    /* renamed from: d, reason: collision with root package name */
    public int f8777d;

    /* renamed from: e, reason: collision with root package name */
    public int f8778e;

    /* renamed from: h, reason: collision with root package name */
    public Handler f8781h;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8779f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8780g = true;

    /* renamed from: i, reason: collision with root package name */
    public final C0512x f8782i = new C0512x(this);
    public final E.a j = new E.a(7, this);
    public final d0 k = new d0(this);

    public final void a() {
        int i4 = this.f8778e + 1;
        this.f8778e = i4;
        if (i4 == 1) {
            if (this.f8779f) {
                this.f8782i.d(EnumC0503n.ON_RESUME);
                this.f8779f = false;
            } else {
                Handler handler = this.f8781h;
                o6.j.b(handler);
                handler.removeCallbacks(this.j);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0510v
    public final C0512x g() {
        return this.f8782i;
    }
}
