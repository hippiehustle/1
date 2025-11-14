package U7;

import L7.C0150h;
import L7.InterfaceC0149g;
import L7.s0;
import Q7.r;
import Q7.t;
import Z5.y;
import d6.InterfaceC0622h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class b implements InterfaceC0149g, s0 {

    /* renamed from: d, reason: collision with root package name */
    public final C0150h f6190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f6191e;

    public b(c cVar, C0150h c0150h) {
        this.f6191e = cVar;
        this.f6190d = c0150h;
    }

    @Override // L7.s0
    public final void a(r rVar, int i4) {
        this.f6190d.a(rVar, i4);
    }

    @Override // L7.InterfaceC0149g
    public final void f(Object obj, InterfaceC1165d interfaceC1165d) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.k;
        c cVar = this.f6191e;
        atomicReferenceFieldUpdater.set(cVar, null);
        A1.h hVar = new A1.h(cVar, this);
        C0150h c0150h = this.f6190d;
        c0150h.C(y.f7506a, c0150h.f3174f, new D2.e(1, hVar));
    }

    @Override // d6.InterfaceC0617c
    public final InterfaceC0622h h() {
        return this.f6190d.f3218h;
    }

    @Override // d6.InterfaceC0617c
    public final void k(Object obj) {
        this.f6190d.k(obj);
    }

    @Override // L7.InterfaceC0149g
    public final t o(Object obj, InterfaceC1165d interfaceC1165d) {
        c cVar = this.f6191e;
        D2.e eVar = new D2.e(cVar, this);
        t o7 = this.f6190d.o((y) obj, eVar);
        if (o7 != null) {
            c.k.set(cVar, null);
        }
        return o7;
    }

    @Override // L7.InterfaceC0149g
    public final void r(Object obj) {
        this.f6190d.r(obj);
    }
}
