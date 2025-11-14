package p7;

import C6.InterfaceC0007h;
import C6.InterfaceC0008i;
import C6.InterfaceC0022x;
import a6.AbstractC0434i;
import a6.u;
import f7.C0725e;
import h7.AbstractC0842e;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import n6.InterfaceC1163b;
import q4.X;

/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1319a implements InterfaceC1333o {

    /* renamed from: b, reason: collision with root package name */
    public final String f13802b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1333o[] f13803c;

    public C1319a(String str, InterfaceC1333o[] interfaceC1333oArr) {
        this.f13802b = str;
        this.f13803c = interfaceC1333oArr;
    }

    @Override // p7.InterfaceC1335q
    public final Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        InterfaceC1333o[] interfaceC1333oArr = this.f13803c;
        int length = interfaceC1333oArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (InterfaceC1333o interfaceC1333o : interfaceC1333oArr) {
                    collection = X.p(collection, interfaceC1333o.a(c1324f, interfaceC1163b));
                }
                if (collection == null) {
                    return u.f7768d;
                }
                return collection;
            }
            return interfaceC1333oArr[0].a(c1324f, interfaceC1163b);
        }
        return a6.s.f7766d;
    }

    @Override // p7.InterfaceC1333o
    public final Set b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC1333o interfaceC1333o : this.f13803c) {
            a6.q.f0(linkedHashSet, interfaceC1333o.b());
        }
        return linkedHashSet;
    }

    @Override // p7.InterfaceC1333o
    public final Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC1333o interfaceC1333o : this.f13803c) {
            a6.q.f0(linkedHashSet, interfaceC1333o.c());
        }
        return linkedHashSet;
    }

    @Override // p7.InterfaceC1335q
    public final InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        InterfaceC0007h interfaceC0007h = null;
        for (InterfaceC1333o interfaceC1333o : this.f13803c) {
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
        return AbstractC0842e.k(AbstractC0434i.J0(this.f13803c));
    }

    @Override // p7.InterfaceC1333o
    public final Collection f(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        InterfaceC1333o[] interfaceC1333oArr = this.f13803c;
        int length = interfaceC1333oArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (InterfaceC1333o interfaceC1333o : interfaceC1333oArr) {
                    collection = X.p(collection, interfaceC1333o.f(c0725e, bVar));
                }
                if (collection == null) {
                    return u.f7768d;
                }
                return collection;
            }
            return interfaceC1333oArr[0].f(c0725e, bVar);
        }
        return a6.s.f7766d;
    }

    @Override // p7.InterfaceC1333o
    public final Collection g(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        InterfaceC1333o[] interfaceC1333oArr = this.f13803c;
        int length = interfaceC1333oArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (InterfaceC1333o interfaceC1333o : interfaceC1333oArr) {
                    collection = X.p(collection, interfaceC1333o.g(c0725e, bVar));
                }
                if (collection == null) {
                    return u.f7768d;
                }
                return collection;
            }
            return interfaceC1333oArr[0].g(c0725e, bVar);
        }
        return a6.s.f7766d;
    }

    public final String toString() {
        return this.f13802b;
    }
}
