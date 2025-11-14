package w7;

import C6.InterfaceC0007h;
import a6.AbstractC0436k;
import i.AbstractC0862a;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import n6.InterfaceC1163b;
import z7.InterfaceC1891h;

/* renamed from: w7.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1758u implements J, InterfaceC1891h {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC1759v f16015a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f16016b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16017c;

    public C1758u(AbstractCollection abstractCollection) {
        o6.j.e(abstractCollection, "typesToIntersect");
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f16016b = linkedHashSet;
        this.f16017c = linkedHashSet.hashCode();
    }

    @Override // w7.J
    public final boolean a() {
        return false;
    }

    @Override // w7.J
    public final InterfaceC0007h c() {
        return null;
    }

    @Override // w7.J
    public final Collection d() {
        return this.f16016b;
    }

    @Override // w7.J
    public final List e() {
        return a6.s.f7766d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1758u)) {
            return false;
        }
        return o6.j.a(this.f16016b, ((C1758u) obj).f16016b);
    }

    public final z f() {
        G.f15953e.getClass();
        return AbstractC1741c.v(G.f15954f, this, a6.s.f7766d, false, AbstractC0862a.d("member scope for intersection type", this.f16016b), new B6.n(25, this));
    }

    public final String g(InterfaceC1163b interfaceC1163b) {
        o6.j.e(interfaceC1163b, "getProperTypeRelatedToStringify");
        return AbstractC0436k.v0(AbstractC0436k.L0(this.f16016b, new m5.d(1, interfaceC1163b)), " & ", "{", "}", new B6.n(24, interfaceC1163b), 24);
    }

    public final int hashCode() {
        return this.f16017c;
    }

    @Override // w7.J
    public final z6.h o() {
        z6.h o7 = ((AbstractC1759v) this.f16016b.iterator().next()).B0().o();
        o6.j.d(o7, "getBuiltIns(...)");
        return o7;
    }

    public final String toString() {
        return g(C1757t.f16013e);
    }
}
