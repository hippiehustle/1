package w6;

import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public class f0 extends m0 implements InterfaceC1164c {

    /* renamed from: m, reason: collision with root package name */
    public final Object f15853m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(F f8, C6.M m6) {
        super(f8, m6);
        o6.j.e(m6, "descriptor");
        d0 d0Var = new d0(this, 0);
        Z5.h hVar = Z5.h.f7482d;
        this.f15853m = Z5.a.c(hVar, d0Var);
        Z5.a.c(hVar, new d0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // u6.s
    public final u6.n c() {
        return (e0) this.f15853m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((e0) this.f15853m.getValue()).g(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // w6.m0
    public final j0 w() {
        return (e0) this.f15853m.getValue();
    }
}
