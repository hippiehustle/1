package S6;

import B6.n;
import D6.j;
import H7.g;
import H7.m;
import H7.o;
import H7.p;
import H7.t;
import I6.C0066e;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import f7.C0723c;
import f7.C0725e;
import java.util.Iterator;
import u6.AbstractC1638C;
import v7.k;

/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: d, reason: collision with root package name */
    public final A4.a f5422d;

    /* renamed from: e, reason: collision with root package name */
    public final W6.b f5423e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5424f;

    /* renamed from: g, reason: collision with root package name */
    public final U1.c f5425g;

    public c(A4.a aVar, W6.b bVar, boolean z8) {
        o6.j.e(aVar, "c");
        o6.j.e(bVar, "annotationOwner");
        this.f5422d = aVar;
        this.f5423e = bVar;
        this.f5424f = z8;
        this.f5425g = ((k) ((a) aVar.f280e).f5398a).c(new n(9, this));
    }

    @Override // D6.j
    public final boolean a(C0723c c0723c) {
        return AbstractC1638C.B(this, c0723c);
    }

    @Override // D6.j
    public final D6.c e(C0723c c0723c) {
        D6.c cVar;
        o6.j.e(c0723c, "fqName");
        W6.b bVar = this.f5423e;
        C0066e a3 = bVar.a(c0723c);
        if (a3 != null && (cVar = (D6.c) this.f5425g.m(a3)) != null) {
            return cVar;
        }
        C0725e c0725e = Q6.c.f4913a;
        return Q6.c.a(c0723c, bVar, this.f5422d);
    }

    @Override // D6.j
    public final boolean isEmpty() {
        if (this.f5423e.getAnnotations().isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        W6.b bVar = this.f5423e;
        t W7 = m.W(AbstractC0436k.k0(bVar.getAnnotations()), this.f5425g);
        C0725e c0725e = Q6.c.f4913a;
        return new H7.f(new g(m.S(AbstractC0434i.L0(new H7.k[]{W7, new p(1, Q6.c.a(z6.m.f16779m, bVar, this.f5422d))})), false, new o(2)));
    }
}
