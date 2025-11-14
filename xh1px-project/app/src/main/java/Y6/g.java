package Y6;

import I6.AbstractC0065d;
import a7.E;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import n7.C1169b;
import u7.EnumC1656i;
import u7.InterfaceC1657j;

/* loaded from: classes.dex */
public final class g implements InterfaceC1657j {

    /* renamed from: d, reason: collision with root package name */
    public final C1169b f7222d;

    /* renamed from: e, reason: collision with root package name */
    public final C1169b f7223e;

    /* renamed from: f, reason: collision with root package name */
    public final H6.b f7224f;

    public g(H6.b bVar, E e9, e7.f fVar, boolean z8, EnumC1656i enumC1656i) {
        o6.j.e(bVar, "kotlinClass");
        o6.j.e(e9, "packageProto");
        o6.j.e(fVar, "nameResolver");
        C1169b c1169b = new C1169b(C1169b.e(AbstractC0065d.a(bVar.f2037a)));
        Z6.b bVar2 = bVar.f2038b;
        C1169b c1169b2 = null;
        String str = bVar2.f7517a != Z6.a.MULTIFILE_CLASS_PART ? null : bVar2.f7522f;
        if (str != null && str.length() > 0) {
            c1169b2 = C1169b.c(str);
        }
        this.f7222d = c1169b;
        this.f7223e = c1169b2;
        this.f7224f = bVar;
        g7.n nVar = d7.k.f10522m;
        o6.j.d(nVar, "packageModuleName");
        Integer num = (Integer) E2.d.t(e9, nVar);
        if (num != null) {
            fVar.getString(num.intValue());
        }
    }

    @Override // u7.InterfaceC1657j
    public final String a() {
        return A.j.q(new StringBuilder("Class '"), b().a().f10797a.f10800a, '\'');
    }

    public final C0722b b() {
        C0723c c0723c;
        C1169b c1169b = this.f7222d;
        String str = c1169b.f13019a;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            c0723c = C0723c.f10796c;
            if (c0723c == null) {
                C1169b.a(9);
                throw null;
            }
        } else {
            c0723c = new C0723c(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        String d2 = c1169b.d();
        o6.j.d(d2, "getInternalName(...)");
        return new C0722b(c0723c, C0725e.e(I7.m.t0('/', d2, d2)));
    }

    public final String toString() {
        return g.class.getSimpleName() + ": " + this.f7222d;
    }
}
