package S6;

import C6.I;
import I6.y;
import T6.q;
import Z5.g;
import a6.s;
import f7.C0723c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import n6.InterfaceC1163b;
import o6.j;
import v7.k;

/* loaded from: classes.dex */
public final class d implements I {

    /* renamed from: a, reason: collision with root package name */
    public final A4.a f5426a;

    /* renamed from: b, reason: collision with root package name */
    public final v7.e f5427b;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, n6.b] */
    public d(a aVar) {
        this.f5426a = new A4.a(aVar, b.f5421b, (g) new Object());
        k kVar = (k) aVar.f5398a;
        kVar.getClass();
        this.f5427b = new v7.e(kVar, new ConcurrentHashMap(3, 1.0f, 2), new Object(), 0);
    }

    @Override // C6.I
    public final void a(C0723c c0723c, ArrayList arrayList) {
        j.e(c0723c, "fqName");
        arrayList.add(c(c0723c));
    }

    @Override // C6.I
    public final boolean b(C0723c c0723c) {
        j.e(c0723c, "fqName");
        ((a) this.f5426a.f280e).f5399b.getClass();
        return false;
    }

    public final q c(C0723c c0723c) {
        ((a) this.f5426a.f280e).f5399b.getClass();
        j.e(c0723c, "fqName");
        B6.f fVar = new B6.f(this, 10, new y(c0723c));
        v7.e eVar = this.f5427b;
        eVar.getClass();
        Object m6 = eVar.m(new v7.g(c0723c, fVar));
        if (m6 != null) {
            return (q) m6;
        }
        v7.e.f(3);
        throw null;
    }

    @Override // C6.I
    public final Collection n(C0723c c0723c, InterfaceC1163b interfaceC1163b) {
        j.e(c0723c, "fqName");
        List list = (List) c(c0723c).f5883o.a();
        if (list == null) {
            return s.f7766d;
        }
        return list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((a) this.f5426a.f280e).f5410o;
    }
}
