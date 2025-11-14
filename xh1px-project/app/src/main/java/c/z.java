package c;

import a6.C0433h;
import g0.H;

/* loaded from: classes.dex */
public final class z implements InterfaceC0549c {

    /* renamed from: d, reason: collision with root package name */
    public final H f9371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0544A f9372e;

    public z(C0544A c0544a, H h8) {
        o6.j.e(h8, "onBackPressedCallback");
        this.f9372e = c0544a;
        this.f9371d = h8;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o6.i, n6.a] */
    @Override // c.InterfaceC0549c
    public final void cancel() {
        C0544A c0544a = this.f9372e;
        C0433h c0433h = c0544a.f9297b;
        H h8 = this.f9371d;
        c0433h.remove(h8);
        if (o6.j.a(c0544a.f9298c, h8)) {
            h8.a();
            c0544a.f9298c = null;
        }
        h8.f10862b.remove(this);
        ?? r02 = h8.f10863c;
        if (r02 != 0) {
            r02.a();
        }
        h8.f10863c = null;
    }
}
