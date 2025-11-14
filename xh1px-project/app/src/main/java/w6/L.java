package w6;

import u6.InterfaceC1646g;
import u6.InterfaceC1647h;

/* loaded from: classes.dex */
public final class L extends c0 implements u6.i {

    /* renamed from: n, reason: collision with root package name */
    public final Object f15802n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(F f8, String str, String str2, Object obj) {
        super(f8, str, str2, obj);
        o6.j.e(f8, "container");
        this.f15802n = Z5.a.c(Z5.h.f7482d, new B6.j(22, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // u6.i
    public final void e(Object obj, Object obj2) {
        ((K) this.f15802n.getValue()).g(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // u6.j
    public final InterfaceC1646g i() {
        return (K) this.f15802n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // u6.i, u6.j
    public final InterfaceC1647h i() {
        return (K) this.f15802n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(F f8, C6.M m6) {
        super(f8, m6);
        o6.j.e(m6, "descriptor");
        this.f15802n = Z5.a.c(Z5.h.f7482d, new B6.j(22, this));
    }
}
