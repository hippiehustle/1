package A6;

import C6.A;
import C6.AbstractC0021w;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.P;
import C6.T;
import F6.E;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a6.s;
import f7.C0722b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import w7.AbstractC1740b;
import w7.AbstractC1741c;
import w7.G;
import z6.n;

/* loaded from: classes.dex */
public final class b extends AbstractC1740b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar.f392h);
        this.f389c = cVar;
    }

    @Override // w7.J
    public final boolean a() {
        return true;
    }

    @Override // w7.AbstractC1740b, w7.J
    public final InterfaceC0007h c() {
        return this.f389c;
    }

    @Override // w7.J
    public final List e() {
        return this.f389c.f396n;
    }

    @Override // w7.AbstractC1744f
    public final Collection f() {
        List<C0722b> X8;
        Iterable iterable;
        c cVar = this.f389c;
        int i4 = cVar.k;
        k kVar = cVar.j;
        g gVar = g.f399c;
        if (o6.j.a(kVar, gVar)) {
            X8 = E2.d.y(c.f390o);
        } else if (o6.j.a(kVar, h.f400c)) {
            X8 = AbstractC0437l.X(c.f391p, new C0722b(n.k, gVar.a(i4)));
        } else {
            j jVar = j.f402c;
            if (o6.j.a(kVar, jVar)) {
                X8 = E2.d.y(c.f390o);
            } else if (o6.j.a(kVar, i.f401c)) {
                X8 = AbstractC0437l.X(c.f391p, new C0722b(n.f16798f, jVar.a(i4)));
            } else {
                int i8 = G7.a.f1845a;
                throw new IllegalStateException("should not be called");
            }
        }
        A q6 = ((E) cVar.f393i).q();
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(X8, 10));
        for (C0722b c0722b : X8) {
            InterfaceC0004e d2 = AbstractC0021w.d(q6, c0722b);
            if (d2 != null) {
                List list = cVar.f396n;
                int size = d2.B().e().size();
                o6.j.e(list, "<this>");
                if (size >= 0) {
                    if (size == 0) {
                        iterable = s.f7766d;
                    } else {
                        int size2 = list.size();
                        if (size >= size2) {
                            iterable = AbstractC0436k.Q0(list);
                        } else if (size == 1) {
                            iterable = E2.d.y(AbstractC0436k.x0(list));
                        } else {
                            ArrayList arrayList2 = new ArrayList(size);
                            if (list instanceof RandomAccess) {
                                for (int i9 = size2 - size; i9 < size2; i9++) {
                                    arrayList2.add(list.get(i9));
                                }
                            } else {
                                ListIterator listIterator = list.listIterator(size2 - size);
                                while (listIterator.hasNext()) {
                                    arrayList2.add(listIterator.next());
                                }
                            }
                            iterable = arrayList2;
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new w7.E(((T) it.next()).l()));
                    }
                    G.f15953e.getClass();
                    arrayList.add(AbstractC1741c.s(G.f15954f, d2, arrayList3));
                } else {
                    throw new IllegalArgumentException(A.j.j(size, "Requested element count ", " is less than zero.").toString());
                }
            } else {
                throw new IllegalStateException(("Built-in class " + c0722b + " not found").toString());
            }
        }
        return AbstractC0436k.Q0(arrayList);
    }

    @Override // w7.AbstractC1744f
    public final P h() {
        return P.f728f;
    }

    @Override // w7.AbstractC1740b
    /* renamed from: m */
    public final InterfaceC0004e c() {
        return this.f389c;
    }

    public final String toString() {
        return this.f389c.toString();
    }
}
