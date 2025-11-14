package T6;

import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.M;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import f7.C0725e;
import i7.AbstractC0898m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n6.InterfaceC1163b;
import n7.C1168a;
import p7.C1324f;
import p7.C1330l;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class D extends E {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f5806p = 0;

    /* renamed from: n, reason: collision with root package name */
    public final I6.o f5807n;

    /* renamed from: o, reason: collision with root package name */
    public final i f5808o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(A4.a aVar, I6.o oVar, i iVar) {
        super(aVar, null);
        o6.j.e(oVar, "jClass");
        this.f5807n = oVar;
        this.f5808o = iVar;
    }

    public static M v(M m6) {
        if (m6.e() != 2) {
            return m6;
        }
        Collection<M> s8 = m6.s();
        o6.j.d(s8, "getOverriddenDescriptors(...)");
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(s8, 10));
        for (M m8 : s8) {
            o6.j.b(m8);
            arrayList.add(v(m8));
        }
        return (M) AbstractC0436k.G0(AbstractC0436k.Q0(AbstractC0436k.U0(arrayList)));
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public final InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        return null;
    }

    @Override // T6.A
    public final Set h(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        return a6.u.f7768d;
    }

    @Override // T6.A
    public final Set i(C1324f c1324f, C1330l c1330l) {
        Set set;
        o6.j.e(c1324f, "kindFilter");
        Set U02 = AbstractC0436k.U0(((InterfaceC0328c) this.f5796e.a()).a());
        i iVar = this.f5808o;
        D A2 = AbstractC1638C.A(iVar);
        if (A2 != null) {
            set = A2.b();
        } else {
            set = null;
        }
        if (set == null) {
            set = a6.u.f7768d;
        }
        U02.addAll(set);
        if (this.f5807n.f2208a.isEnum()) {
            U02.addAll(AbstractC0437l.X(z6.n.f16795c, z6.n.f16793a));
        }
        A4.a aVar = this.f5793b;
        ((C1168a) ((S6.a) aVar.f280e).f5419x).getClass();
        o6.j.e(iVar, "thisDescriptor");
        o6.j.e(aVar, "c");
        U02.addAll(new ArrayList());
        return U02;
    }

    @Override // T6.A
    public final void j(C0725e c0725e, ArrayList arrayList) {
        o6.j.e(c0725e, "name");
        A4.a aVar = this.f5793b;
        ((C1168a) ((S6.a) aVar.f280e).f5419x).getClass();
        o6.j.e(this.f5808o, "thisDescriptor");
        o6.j.e(c0725e, "name");
        o6.j.e(aVar, "c");
    }

    @Override // T6.A
    public final InterfaceC0328c k() {
        return new C0326a(this.f5807n, m.f5862g);
    }

    @Override // T6.A
    public final void m(LinkedHashSet linkedHashSet, C0725e c0725e) {
        Collection V02;
        o6.j.e(c0725e, "name");
        i iVar = this.f5808o;
        D A2 = AbstractC1638C.A(iVar);
        if (A2 == null) {
            V02 = a6.u.f7768d;
        } else {
            V02 = AbstractC0436k.V0(A2.g(c0725e, K6.b.f2734h));
        }
        Collection collection = V02;
        S6.a aVar = (S6.a) this.f5793b.f280e;
        linkedHashSet.addAll(AbstractC0405a.q0(c0725e, collection, linkedHashSet, this.f5808o, aVar.f5403f, ((x7.l) aVar.f5416u).f16298d));
        if (this.f5807n.f2208a.isEnum()) {
            if (c0725e.equals(z6.n.f16795c)) {
                linkedHashSet.add(AbstractC0898m.i(iVar));
            } else if (c0725e.equals(z6.n.f16793a)) {
                linkedHashSet.add(AbstractC0898m.j(iVar));
            }
        }
    }

    @Override // T6.E, T6.A
    public final void n(C0725e c0725e, ArrayList arrayList) {
        o6.j.e(c0725e, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        B6.n nVar = new B6.n(13, c0725e);
        i iVar = this.f5808o;
        F7.l.f(E2.d.y(iVar), B.f5802d, new C(iVar, linkedHashSet, nVar));
        boolean isEmpty = arrayList.isEmpty();
        A4.a aVar = this.f5793b;
        if (!isEmpty) {
            S6.a aVar2 = (S6.a) aVar.f280e;
            arrayList.addAll(AbstractC0405a.q0(c0725e, linkedHashSet, arrayList, this.f5808o, aVar2.f5403f, ((x7.l) aVar2.f5416u).f16298d));
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                M v8 = v((M) obj);
                Object obj2 = linkedHashMap.get(v8);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(v8, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                S6.a aVar3 = (S6.a) aVar.f280e;
                a6.q.f0(arrayList2, AbstractC0405a.q0(c0725e, collection, arrayList, this.f5808o, aVar3.f5403f, ((x7.l) aVar3.f5416u).f16298d));
            }
            arrayList.addAll(arrayList2);
        }
        if (this.f5807n.f2208a.isEnum() && c0725e.equals(z6.n.f16794b)) {
            F7.l.a(arrayList, AbstractC0898m.h(iVar));
        }
    }

    @Override // T6.A
    public final Set o(C1324f c1324f) {
        o6.j.e(c1324f, "kindFilter");
        Set U02 = AbstractC0436k.U0(((InterfaceC0328c) this.f5796e.a()).f());
        m mVar = m.f5863h;
        i iVar = this.f5808o;
        F7.l.f(E2.d.y(iVar), B.f5802d, new C(iVar, U02, mVar));
        if (this.f5807n.f2208a.isEnum()) {
            U02.add(z6.n.f16794b);
        }
        return U02;
    }

    @Override // T6.A
    public final InterfaceC0010k q() {
        return this.f5808o;
    }
}
