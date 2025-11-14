package c;

import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0503n;
import androidx.lifecycle.InterfaceC0508t;
import androidx.lifecycle.InterfaceC0510v;
import g0.H;

/* loaded from: classes.dex */
public final class y implements InterfaceC0508t, InterfaceC0549c {

    /* renamed from: d, reason: collision with root package name */
    public final C0512x f9367d;

    /* renamed from: e, reason: collision with root package name */
    public final H f9368e;

    /* renamed from: f, reason: collision with root package name */
    public z f9369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0544A f9370g;

    public y(C0544A c0544a, C0512x c0512x, H h8) {
        o6.j.e(c0512x, "lifecycle");
        o6.j.e(h8, "onBackPressedCallback");
        this.f9370g = c0544a;
        this.f9367d = c0512x;
        this.f9368e = h8;
        c0512x.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0508t
    public final void a(InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n) {
        if (enumC0503n == EnumC0503n.ON_START) {
            H h8 = this.f9368e;
            o6.j.e(h8, "onBackPressedCallback");
            C0544A c0544a = this.f9370g;
            c0544a.f9297b.addLast(h8);
            z zVar = new z(c0544a, h8);
            h8.f10862b.add(zVar);
            c0544a.c();
            h8.f10863c = new J3.s(0, c0544a, C0544A.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 6);
            this.f9369f = zVar;
            return;
        }
        if (enumC0503n == EnumC0503n.ON_STOP) {
            z zVar2 = this.f9369f;
            if (zVar2 != null) {
                zVar2.cancel();
                return;
            }
            return;
        }
        if (enumC0503n == EnumC0503n.ON_DESTROY) {
            cancel();
        }
    }

    @Override // c.InterfaceC0549c
    public final void cancel() {
        this.f9367d.f(this);
        this.f9368e.f10862b.remove(this);
        z zVar = this.f9369f;
        if (zVar != null) {
            zVar.cancel();
        }
        this.f9369f = null;
    }
}
