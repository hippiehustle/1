package T6;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import f7.AbstractC0727g;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import n6.InterfaceC1163b;
import p7.C1324f;
import p7.C1330l;

/* loaded from: classes.dex */
public final class v extends E {

    /* renamed from: n, reason: collision with root package name */
    public final I6.y f5890n;

    /* renamed from: o, reason: collision with root package name */
    public final q f5891o;

    /* renamed from: p, reason: collision with root package name */
    public final v7.h f5892p;

    /* renamed from: q, reason: collision with root package name */
    public final U1.c f5893q;

    public v(A4.a aVar, I6.y yVar, q qVar) {
        super(aVar, null);
        this.f5890n = yVar;
        this.f5891o = qVar;
        v7.n nVar = ((S6.a) aVar.f280e).f5398a;
        B6.f fVar = new B6.f(aVar, 11, this);
        v7.k kVar = (v7.k) nVar;
        kVar.getClass();
        this.f5892p = new v7.h(kVar, fVar);
        this.f5893q = ((v7.k) nVar).c(new l(this, 2, aVar));
    }

    @Override // T6.A, p7.AbstractC1334p, p7.InterfaceC1335q
    public final Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        if (!c1324f.a(C1324f.f13816l | C1324f.f13811e)) {
            return a6.s.f7766d;
        }
        Iterable iterable = (Iterable) this.f5795d.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC0010k interfaceC0010k = (InterfaceC0010k) obj;
            if (interfaceC0010k instanceof InterfaceC0004e) {
                C0725e name = ((InterfaceC0004e) interfaceC0010k).getName();
                o6.j.d(name, "getName(...)");
                if (((Boolean) interfaceC1163b.m(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public final InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        return v(c0725e, null);
    }

    @Override // T6.A, p7.AbstractC1334p, p7.InterfaceC1333o
    public final Collection f(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        return a6.s.f7766d;
    }

    @Override // T6.A
    public final Set h(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        if (!c1324f.a(C1324f.f13811e)) {
            return a6.u.f7768d;
        }
        Set set = (Set) this.f5892p.a();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(C0725e.e((String) it.next()));
            }
            return hashSet;
        }
        this.f5890n.getClass();
        return new LinkedHashSet();
    }

    @Override // T6.A
    public final Set i(C1324f c1324f, C1330l c1330l) {
        o6.j.e(c1324f, "kindFilter");
        return a6.u.f7768d;
    }

    @Override // T6.A
    public final InterfaceC0328c k() {
        return C0327b.f5817a;
    }

    @Override // T6.A
    public final void m(LinkedHashSet linkedHashSet, C0725e c0725e) {
        o6.j.e(c0725e, "name");
    }

    @Override // T6.A
    public final Set o(C1324f c1324f) {
        o6.j.e(c1324f, "kindFilter");
        return a6.u.f7768d;
    }

    @Override // T6.A
    public final InterfaceC0010k q() {
        return this.f5891o;
    }

    public final InterfaceC0004e v(C0725e c0725e, I6.o oVar) {
        C0725e c0725e2 = AbstractC0727g.f10808a;
        o6.j.e(c0725e, "name");
        String b4 = c0725e.b();
        o6.j.d(b4, "asString(...)");
        if (b4.length() > 0 && !c0725e.f10805e) {
            Set set = (Set) this.f5892p.a();
            if (oVar != null || set == null || set.contains(c0725e.b())) {
                return (InterfaceC0004e) this.f5893q.m(new r(c0725e, oVar));
            }
            return null;
        }
        return null;
    }
}
