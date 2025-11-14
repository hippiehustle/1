package F6;

import C6.AbstractC0021w;
import C6.C0024z;
import C6.InterfaceC0010k;
import C6.InterfaceC0012m;
import a6.AbstractC0436k;
import f7.C0723c;
import f7.C0725e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class C extends AbstractC0054n implements C6.A {

    /* renamed from: g, reason: collision with root package name */
    public final v7.k f1449g;

    /* renamed from: h, reason: collision with root package name */
    public final z6.h f1450h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f1451i;
    public final H j;
    public B k;

    /* renamed from: l, reason: collision with root package name */
    public C6.I f1452l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1453m;

    /* renamed from: n, reason: collision with root package name */
    public final v7.e f1454n;

    /* renamed from: o, reason: collision with root package name */
    public final Z5.n f1455o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(C0725e c0725e, v7.k kVar, z6.h hVar, int i4) {
        super(D6.i.f1043a, c0725e);
        o6.j.e(c0725e, "moduleName");
        this.f1449g = kVar;
        this.f1450h = hVar;
        if (c0725e.f10805e) {
            this.f1451i = a6.t.f7767d;
            H.f1465a.getClass();
            H h8 = (H) m0(F.f1463b);
            this.j = h8 == null ? G.f1464b : h8;
            this.f1453m = true;
            this.f1454n = kVar.b(new B6.n(3, this));
            this.f1455o = new Z5.n(new B6.i(this, 1));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + c0725e);
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.C(this, obj);
    }

    public final void L0() {
        if (this.f1453m) {
            return;
        }
        if (m0(AbstractC0021w.f776a) == null) {
            String str = "Accessing invalid module descriptor " + this;
            o6.j.e(str, "message");
            throw new IllegalStateException(str);
        }
        throw new ClassCastException();
    }

    @Override // C6.A
    public final C6.J U(C0723c c0723c) {
        o6.j.e(c0723c, "fqName");
        L0();
        return (C6.J) this.f1454n.m(c0723c);
    }

    @Override // C6.A
    public final List a0() {
        if (this.k != null) {
            return a6.s.f7766d;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().f10804d;
        o6.j.d(str, "toString(...)");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override // C6.A
    public final Object m0(C0024z c0024z) {
        o6.j.e(c0024z, "capability");
        Object obj = this.f1451i.get(c0024z);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // C6.A
    public final Collection n(C0723c c0723c, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c0723c, "fqName");
        L0();
        L0();
        return ((C0053m) this.f1455o.getValue()).n(c0723c, interfaceC1163b);
    }

    @Override // C6.A
    public final z6.h o() {
        return this.f1450h;
    }

    @Override // C6.InterfaceC0010k
    public final InterfaceC0010k q() {
        return null;
    }

    @Override // F6.AbstractC0054n, D6.b
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0054n.K0(this));
        if (!this.f1453m) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        C6.I i4 = this.f1452l;
        if (i4 != null) {
            str = i4.getClass().getSimpleName();
        } else {
            str = null;
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // C6.A
    public final boolean u(C6.A a3) {
        o6.j.e(a3, "targetModule");
        if (!equals(a3)) {
            o6.j.b(this.k);
            if (!AbstractC0436k.l0(a6.u.f7768d, a3)) {
                a0();
                if (a3 instanceof Void) {
                }
                if (a3.a0().contains(this)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }
}
