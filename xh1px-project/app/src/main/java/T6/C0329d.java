package T6;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0008i;
import C6.InterfaceC0022x;
import a6.AbstractC0434i;
import f7.C0725e;
import h7.AbstractC0842e;
import i.AbstractC0862a;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import n6.InterfaceC1163b;
import p7.C1324f;
import p7.InterfaceC1333o;
import q4.X;

/* renamed from: T6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329d implements InterfaceC1333o {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f5818f = {o6.v.f13643a.f(new o6.p(C0329d.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* renamed from: b, reason: collision with root package name */
    public final A4.a f5819b;

    /* renamed from: c, reason: collision with root package name */
    public final q f5820c;

    /* renamed from: d, reason: collision with root package name */
    public final v f5821d;

    /* renamed from: e, reason: collision with root package name */
    public final v7.i f5822e;

    /* JADX WARN: Type inference failed for: r4v2, types: [v7.i, v7.h] */
    public C0329d(A4.a aVar, I6.y yVar, q qVar) {
        this.f5819b = aVar;
        this.f5820c = qVar;
        this.f5821d = new v(aVar, yVar, qVar);
        v7.n nVar = ((S6.a) aVar.f280e).f5398a;
        B6.j jVar = new B6.j(11, this);
        v7.k kVar = (v7.k) nVar;
        kVar.getClass();
        this.f5822e = new v7.h(kVar, jVar);
    }

    @Override // p7.InterfaceC1335q
    public final Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        InterfaceC1333o[] h8 = h();
        Collection a3 = this.f5821d.a(c1324f, interfaceC1163b);
        for (InterfaceC1333o interfaceC1333o : h8) {
            a3 = X.p(a3, interfaceC1333o.a(c1324f, interfaceC1163b));
        }
        if (a3 == null) {
            return a6.u.f7768d;
        }
        return a3;
    }

    @Override // p7.InterfaceC1333o
    public final Set b() {
        InterfaceC1333o[] h8 = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC1333o interfaceC1333o : h8) {
            a6.q.f0(linkedHashSet, interfaceC1333o.b());
        }
        linkedHashSet.addAll(this.f5821d.b());
        return linkedHashSet;
    }

    @Override // p7.InterfaceC1333o
    public final Set c() {
        InterfaceC1333o[] h8 = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC1333o interfaceC1333o : h8) {
            a6.q.f0(linkedHashSet, interfaceC1333o.c());
        }
        linkedHashSet.addAll(this.f5821d.c());
        return linkedHashSet;
    }

    @Override // p7.InterfaceC1335q
    public final InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        i(c0725e, bVar);
        v vVar = this.f5821d;
        vVar.getClass();
        InterfaceC0007h interfaceC0007h = null;
        InterfaceC0004e v8 = vVar.v(c0725e, null);
        if (v8 != null) {
            return v8;
        }
        for (InterfaceC1333o interfaceC1333o : h()) {
            InterfaceC0007h d2 = interfaceC1333o.d(c0725e, bVar);
            if (d2 != null) {
                if ((d2 instanceof InterfaceC0008i) && ((InterfaceC0022x) d2).c0()) {
                    if (interfaceC0007h == null) {
                        interfaceC0007h = d2;
                    }
                } else {
                    return d2;
                }
            }
        }
        return interfaceC0007h;
    }

    @Override // p7.InterfaceC1333o
    public final Set e() {
        HashSet k = AbstractC0842e.k(AbstractC0434i.J0(h()));
        if (k != null) {
            k.addAll(this.f5821d.e());
            return k;
        }
        return null;
    }

    @Override // p7.InterfaceC1333o
    public final Collection f(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        i(c0725e, bVar);
        InterfaceC1333o[] h8 = h();
        this.f5821d.getClass();
        Collection collection = a6.s.f7766d;
        for (InterfaceC1333o interfaceC1333o : h8) {
            collection = X.p(collection, interfaceC1333o.f(c0725e, bVar));
        }
        if (collection == null) {
            return a6.u.f7768d;
        }
        return collection;
    }

    @Override // p7.InterfaceC1333o
    public final Collection g(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        i(c0725e, bVar);
        InterfaceC1333o[] h8 = h();
        Collection g8 = this.f5821d.g(c0725e, bVar);
        for (InterfaceC1333o interfaceC1333o : h8) {
            g8 = X.p(g8, interfaceC1333o.g(c0725e, bVar));
        }
        if (g8 == null) {
            return a6.u.f7768d;
        }
        return g8;
    }

    public final InterfaceC1333o[] h() {
        return (InterfaceC1333o[]) AbstractC0862a.j(this.f5822e, f5818f[0]);
    }

    public final void i(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        X.M(((S6.a) this.f5819b.f280e).f5409n, bVar, this.f5820c, c0725e);
    }

    public final String toString() {
        return "scope for " + this.f5820c;
    }
}
