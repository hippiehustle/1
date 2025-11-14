package w7;

import x7.C1824f;

/* loaded from: classes.dex */
public final class D extends M {

    /* renamed from: a, reason: collision with root package name */
    public final z f15947a;

    public D(z6.h hVar) {
        o6.j.e(hVar, "kotlinBuiltIns");
        z p8 = hVar.p();
        o6.j.d(p8, "getNullableAnyType(...)");
        this.f15947a = p8;
    }

    @Override // w7.M
    public final X a() {
        return X.OUT_VARIANCE;
    }

    @Override // w7.M
    public final AbstractC1759v b() {
        return this.f15947a;
    }

    @Override // w7.M
    public final boolean c() {
        return true;
    }

    @Override // w7.M
    public final M d(C1824f c1824f) {
        o6.j.e(c1824f, "kotlinTypeRefiner");
        return this;
    }
}
