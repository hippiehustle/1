package androidx.lifecycle;

import g0.AbstractComponentCallbacksC0755y;
import p0.C1302j;

/* loaded from: classes.dex */
public final class A extends B implements InterfaceC0508t {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0510v f8761h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C f8762i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C c6, AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, C1302j c1302j) {
        super(c6, c1302j);
        this.f8762i = c6;
        this.f8761h = abstractComponentCallbacksC0755y;
    }

    @Override // androidx.lifecycle.InterfaceC0508t
    public final void a(InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n) {
        InterfaceC0510v interfaceC0510v2 = this.f8761h;
        EnumC0504o enumC0504o = interfaceC0510v2.g().f8862d;
        if (enumC0504o == EnumC0504o.f8846d) {
            C c6 = this.f8762i;
            c6.getClass();
            C.a("removeObserver");
            B b4 = (B) c6.f8768b.h(this.f8763d);
            if (b4 != null) {
                b4.c();
                b4.b(false);
                return;
            }
            return;
        }
        EnumC0504o enumC0504o2 = null;
        while (enumC0504o2 != enumC0504o) {
            b(e());
            enumC0504o2 = enumC0504o;
            enumC0504o = interfaceC0510v2.g().f8862d;
        }
    }

    @Override // androidx.lifecycle.B
    public final void c() {
        this.f8761h.g().f(this);
    }

    @Override // androidx.lifecycle.B
    public final boolean d(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        if (this.f8761h == abstractComponentCallbacksC0755y) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.B
    public final boolean e() {
        if (this.f8761h.g().f8862d.compareTo(EnumC0504o.f8849g) >= 0) {
            return true;
        }
        return false;
    }
}
