package F6;

import C6.InterfaceC0010k;
import C6.InterfaceC0012m;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;

/* loaded from: classes.dex */
public abstract class E extends AbstractC0055o implements C6.F {

    /* renamed from: i, reason: collision with root package name */
    public final C0723c f1461i;
    public final String j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public E(C6.A a3, C0723c c0723c) {
        super(a3, D6.i.f1043a, r0, C6.O.f726a);
        C0725e f8;
        o6.j.e(a3, "module");
        o6.j.e(c0723c, "fqName");
        C0724d c0724d = c0723c.f10797a;
        if (c0724d.c()) {
            f8 = C0724d.f10799e;
        } else {
            f8 = c0724d.f();
        }
        this.f1461i = c0723c;
        this.j = "package " + c0723c + " of " + a3;
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.Q(this, obj);
    }

    @Override // F6.AbstractC0055o, C6.InterfaceC0010k
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public final C6.A q() {
        InterfaceC0010k q6 = super.q();
        o6.j.c(q6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (C6.A) q6;
    }

    @Override // F6.AbstractC0055o, C6.InterfaceC0011l
    public C6.O h() {
        return C6.O.f726a;
    }

    @Override // F6.AbstractC0054n, D6.b
    public String toString() {
        return this.j;
    }
}
