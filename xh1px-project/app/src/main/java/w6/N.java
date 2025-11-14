package w6;

import u6.InterfaceC1646g;

/* loaded from: classes.dex */
public final class N extends f0 implements u6.j {

    /* renamed from: n, reason: collision with root package name */
    public final Object f15804n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(F f8, C6.M m6) {
        super(f8, m6);
        o6.j.e(m6, "descriptor");
        this.f15804n = Z5.a.c(Z5.h.f7482d, new B6.j(23, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // u6.j
    public final InterfaceC1646g i() {
        return (M) this.f15804n.getValue();
    }
}
