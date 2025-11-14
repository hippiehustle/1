package p7;

import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import f7.C0725e;
import h7.AbstractC0842e;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import n6.InterfaceC1163b;
import w7.O;
import w7.Q;

/* renamed from: p7.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1338t implements InterfaceC1333o {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1333o f13851b;

    /* renamed from: c, reason: collision with root package name */
    public final Q f13852c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f13853d;

    /* renamed from: e, reason: collision with root package name */
    public final Z5.n f13854e;

    public C1338t(InterfaceC1333o interfaceC1333o, Q q6) {
        o6.j.e(interfaceC1333o, "workerScope");
        o6.j.e(q6, "givenSubstitutor");
        this.f13851b = interfaceC1333o;
        O f8 = q6.f();
        o6.j.d(f8, "getSubstitution(...)");
        this.f13852c = new Q(AbstractC0842e.D(f8));
        this.f13854e = new Z5.n(new B6.j(15, this));
    }

    @Override // p7.InterfaceC1335q
    public final Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        return (Collection) this.f13854e.getValue();
    }

    @Override // p7.InterfaceC1333o
    public final Set b() {
        return this.f13851b.b();
    }

    @Override // p7.InterfaceC1333o
    public final Set c() {
        return this.f13851b.c();
    }

    @Override // p7.InterfaceC1335q
    public final InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        InterfaceC0007h d2 = this.f13851b.d(c0725e, bVar);
        if (d2 != null) {
            return (InterfaceC0007h) h(d2);
        }
        return null;
    }

    @Override // p7.InterfaceC1333o
    public final Set e() {
        return this.f13851b.e();
    }

    @Override // p7.InterfaceC1333o
    public final Collection f(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        return i(this.f13851b.f(c0725e, bVar));
    }

    @Override // p7.InterfaceC1333o
    public final Collection g(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        return i(this.f13851b.g(c0725e, bVar));
    }

    public final InterfaceC0010k h(InterfaceC0010k interfaceC0010k) {
        Q q6 = this.f13852c;
        if (q6.f15972a.e()) {
            return interfaceC0010k;
        }
        if (this.f13853d == null) {
            this.f13853d = new HashMap();
        }
        HashMap hashMap = this.f13853d;
        o6.j.b(hashMap);
        Object obj = hashMap.get(interfaceC0010k);
        if (obj == null) {
            if (interfaceC0010k instanceof C6.Q) {
                obj = ((C6.Q) interfaceC0010k).f(q6);
                if (obj != null) {
                    hashMap.put(interfaceC0010k, obj);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC0010k + " substitution fails");
                }
            } else {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC0010k).toString());
            }
        }
        return (InterfaceC0010k) obj;
    }

    public final Collection i(Collection collection) {
        if (this.f13852c.f15972a.e()) {
            return collection;
        }
        if (collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        int i4 = 3;
        if (size >= 3) {
            i4 = (size / 3) + size + 1;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(i4);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((InterfaceC0010k) it.next()));
        }
        return linkedHashSet;
    }
}
