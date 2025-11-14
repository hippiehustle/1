package F6;

import C6.C0014o;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.InterfaceC0011l;
import C6.InterfaceC0012m;
import f7.C0725e;
import java.util.List;

/* renamed from: F6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0046f extends AbstractC0055o implements C6.S {

    /* renamed from: i, reason: collision with root package name */
    public final v7.n f1524i;
    public final C0014o j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public final C0045e f1525l;

    static {
        o6.v.f13643a.f(new o6.p(AbstractC0046f.class, "constructors", "getConstructors()Ljava/util/Collection;", 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0046f(v7.n nVar, InterfaceC0010k interfaceC0010k, D6.j jVar, C0725e c0725e, C0014o c0014o) {
        super(interfaceC0010k, jVar, c0725e, C6.O.f726a);
        o6.j.e(nVar, "storageManager");
        o6.j.e(interfaceC0010k, "containingDeclaration");
        o6.j.e(c0014o, "visibilityImpl");
        this.f1524i = nVar;
        this.j = c0014o;
        ((v7.k) nVar).a(new B6.j(3, this));
        this.f1525l = new C0045e(this);
    }

    @Override // C6.InterfaceC0007h
    public final w7.J B() {
        return this.f1525l;
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.M(this, obj);
    }

    @Override // F6.AbstractC0055o, F6.AbstractC0054n, C6.InterfaceC0010k
    public final InterfaceC0007h a() {
        return this;
    }

    @Override // C6.InterfaceC0022x
    public final boolean c0() {
        return false;
    }

    @Override // C6.InterfaceC0022x, C6.InterfaceC0013n
    public final C0014o d() {
        return this.j;
    }

    @Override // C6.InterfaceC0008i
    public final boolean d0() {
        return w7.U.c(((u7.s) this).O0(), new B6.n(2, this), null);
    }

    @Override // C6.InterfaceC0008i
    public final List t() {
        List list = this.k;
        if (list != null) {
            return list;
        }
        o6.j.i("declaredTypeParametersImpl");
        throw null;
    }

    @Override // F6.AbstractC0054n, D6.b
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // C6.InterfaceC0022x
    public final boolean v0() {
        return false;
    }

    @Override // C6.InterfaceC0022x
    public final boolean z() {
        return false;
    }

    @Override // F6.AbstractC0055o, F6.AbstractC0054n, C6.InterfaceC0010k
    public final InterfaceC0010k a() {
        return this;
    }

    @Override // F6.AbstractC0055o
    /* renamed from: L0 */
    public final InterfaceC0011l a() {
        return this;
    }
}
