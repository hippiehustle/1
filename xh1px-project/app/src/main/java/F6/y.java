package F6;

import C6.InterfaceC0010k;
import C6.InterfaceC0012m;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import n1.AbstractC1149a;
import p7.C1329k;

/* loaded from: classes.dex */
public final class y extends AbstractC0054n implements C6.J {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f1608l;

    /* renamed from: g, reason: collision with root package name */
    public final C f1609g;

    /* renamed from: h, reason: collision with root package name */
    public final C0723c f1610h;

    /* renamed from: i, reason: collision with root package name */
    public final v7.i f1611i;
    public final v7.i j;
    public final C1329k k;

    static {
        o6.p pVar = new o6.p(y.class, "fragments", "getFragments()Ljava/util/List;", 0);
        o6.w wVar = o6.v.f13643a;
        f1608l = new u6.s[]{wVar.f(pVar), AbstractC1149a.k(y.class, "empty", "getEmpty()Z", 0, wVar)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r4v2, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r4v4, types: [v7.i, v7.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y(C c6, C0723c c0723c, v7.k kVar) {
        super(D6.i.f1043a, r0);
        C0725e f8;
        o6.j.e(c0723c, "fqName");
        o6.j.e(kVar, "storageManager");
        C0724d c0724d = c0723c.f10797a;
        if (c0724d.c()) {
            f8 = C0724d.f10799e;
        } else {
            f8 = c0724d.f();
        }
        this.f1609g = c6;
        this.f1610h = c0723c;
        this.f1611i = new v7.h(kVar, new x(this, 0));
        this.j = new v7.h(kVar, new x(this, 1));
        this.k = new C1329k(kVar, new x(this, 2));
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.e(this, obj);
    }

    public final boolean equals(Object obj) {
        C6.J j;
        if (obj instanceof C6.J) {
            j = (C6.J) obj;
        } else {
            j = null;
        }
        if (j == null) {
            return false;
        }
        y yVar = (y) j;
        if (!o6.j.a(this.f1610h, yVar.f1610h) || !o6.j.a(this.f1609g, yVar.f1609g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1610h.hashCode() + (this.f1609g.hashCode() * 31);
    }

    @Override // C6.InterfaceC0010k
    public final InterfaceC0010k q() {
        C0723c c0723c = this.f1610h;
        if (c0723c.f10797a.c()) {
            return null;
        }
        return this.f1609g.U(c0723c.b());
    }
}
