package k7;

import C6.InterfaceC0007h;
import a6.AbstractC0436k;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import w7.AbstractC1741c;
import w7.G;
import w7.J;

/* loaded from: classes.dex */
public final class n implements J {

    /* renamed from: a, reason: collision with root package name */
    public final Set f12149a;

    /* renamed from: b, reason: collision with root package name */
    public final Z5.n f12150b;

    /* JADX WARN: Type inference failed for: r0v2, types: [n6.a, java.lang.Object] */
    public n(Set set) {
        G.f15953e.getClass();
        G g8 = G.f15954f;
        o6.j.e(g8, "attributes");
        AbstractC1741c.u(a6.s.f7766d, y7.l.a(y7.h.f16524f, true, "unknown integer literal type"), g8, this, false);
        this.f12150b = new Z5.n(new Object());
        this.f12149a = set;
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
        return (List) this.f12150b.getValue();
    }

    @Override // w7.J
    public final List e() {
        return a6.s.f7766d;
    }

    @Override // w7.J
    public final z6.h o() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + AbstractC0436k.v0(this.f12149a, ",", null, null, m.f12148d, 30) + ']');
        return sb.toString();
    }
}
