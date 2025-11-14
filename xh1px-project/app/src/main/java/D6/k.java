package D6;

import C6.G;
import H7.r;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import f7.C0723c;
import java.util.Iterator;
import java.util.List;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1044d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1045e;

    public /* synthetic */ k(int i4, List list) {
        this.f1044d = i4;
        this.f1045e = list;
    }

    @Override // D6.j
    public final boolean a(C0723c c0723c) {
        switch (this.f1044d) {
            case 0:
                return AbstractC1638C.B(this, c0723c);
            case 1:
                o6.j.e(c0723c, "fqName");
                Iterator it = ((Iterable) AbstractC0436k.k0((List) this.f1045e).f2075b).iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(c0723c)) {
                        return true;
                    }
                }
                return false;
            default:
                return AbstractC1638C.B(this, c0723c);
        }
    }

    @Override // D6.j
    public final c e(C0723c c0723c) {
        switch (this.f1044d) {
            case 0:
                return AbstractC1638C.v(this, c0723c);
            case 1:
                o6.j.e(c0723c, "fqName");
                return (c) H7.m.R(H7.m.X(AbstractC0436k.k0((List) this.f1045e), new G(c0723c, 1)));
            default:
                o6.j.e(c0723c, "fqName");
                if (c0723c.equals((C0723c) this.f1045e)) {
                    return X6.b.f6991a;
                }
                return null;
        }
    }

    @Override // D6.j
    public final boolean isEmpty() {
        switch (this.f1044d) {
            case 0:
                return ((List) this.f1045e).isEmpty();
            case 1:
                List list = (List) this.f1045e;
                if (list != null && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((j) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1044d) {
            case 0:
                return ((List) this.f1045e).iterator();
            case 1:
                return new H7.f(new H7.h(AbstractC0436k.k0((List) this.f1045e), m.f1050d, r.f2078l));
            default:
                return a6.r.f7765d;
        }
    }

    public String toString() {
        switch (this.f1044d) {
            case 0:
                return ((List) this.f1045e).toString();
            default:
                return super.toString();
        }
    }

    public k(j[] jVarArr) {
        this.f1044d = 1;
        this.f1045e = AbstractC0434i.i1(jVarArr);
    }

    public k(C0723c c0723c) {
        this.f1044d = 2;
        o6.j.e(c0723c, "fqNameToMatch");
        this.f1045e = c0723c;
    }
}
