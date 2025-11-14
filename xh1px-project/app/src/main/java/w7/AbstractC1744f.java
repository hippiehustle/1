package w7;

import C6.InterfaceC0007h;
import i7.AbstractC0890e;
import java.util.Collection;
import java.util.List;

/* renamed from: w7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1744f implements J {

    /* renamed from: a, reason: collision with root package name */
    public int f15992a;

    /* renamed from: b, reason: collision with root package name */
    public final v7.d f15993b;

    public AbstractC1744f(v7.n nVar) {
        o6.j.e(nVar, "storageManager");
        this.f15993b = new v7.d((v7.k) nVar, new B6.j(25, this), new B6.n(23, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof J) && obj.hashCode() == hashCode()) {
            J j = (J) obj;
            if (j.e().size() == e().size()) {
                InterfaceC0007h c6 = c();
                InterfaceC0007h c9 = j.c();
                if (c9 == null || y7.l.f(c6) || AbstractC0890e.n(c6) || y7.l.f(c9) || AbstractC0890e.n(c9)) {
                    return false;
                }
                return j(c9);
            }
        }
        return false;
    }

    public abstract Collection f();

    public abstract AbstractC1759v g();

    public abstract C6.P h();

    public final int hashCode() {
        int identityHashCode;
        int i4 = this.f15992a;
        if (i4 != 0) {
            return i4;
        }
        InterfaceC0007h c6 = c();
        if (!y7.l.f(c6) && !AbstractC0890e.n(c6)) {
            identityHashCode = AbstractC0890e.g(c6).f10800a.hashCode();
        } else {
            identityHashCode = System.identityHashCode(this);
        }
        this.f15992a = identityHashCode;
        return identityHashCode;
    }

    @Override // w7.J
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final List d() {
        return ((C1743e) this.f15993b.a()).f15991b;
    }

    public abstract boolean j(InterfaceC0007h interfaceC0007h);

    public List k(List list) {
        return list;
    }
}
