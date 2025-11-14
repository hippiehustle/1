package w6;

import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class I extends l0 implements InterfaceC1163b {

    /* renamed from: i, reason: collision with root package name */
    public final J f15799i;

    public I(J j) {
        this.f15799i = j;
    }

    @Override // u6.m
    public final u6.s f() {
        return this.f15799i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Z5.g] */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        ((I) this.f15799i.f15800n.getValue()).g(obj);
        return Z5.y.f7506a;
    }

    @Override // w6.h0
    public final m0 v() {
        return this.f15799i;
    }
}
