package x7;

import a6.AbstractC0436k;
import a6.AbstractC0438m;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k4.I;
import n6.InterfaceC1164c;
import t0.C1536c;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.C1742d;
import w7.C1745g;
import w7.C1758u;
import w7.G;
import w7.J;
import w7.W;
import w7.z;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f16307a = new Object();

    public static ArrayList a(AbstractCollection abstractCollection, InterfaceC1164c interfaceC1164c) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        o6.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    z zVar2 = (z) it2.next();
                    if (zVar2 != zVar) {
                        o6.j.b(zVar2);
                        o6.j.b(zVar);
                        if (((Boolean) interfaceC1164c.l(zVar2, zVar)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [w7.G] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [C7.d, java.lang.Object, w7.G] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v17, types: [w7.z] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [w7.z, java.lang.Object, w7.v] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final z b(ArrayList arrayList) {
        z zVar;
        z f8;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z zVar2 = (z) it.next();
            if (zVar2.B0() instanceof C1758u) {
                Collection<AbstractC1759v> d2 = zVar2.B0().d();
                o6.j.d(d2, "getSupertypes(...)");
                ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(d2, 10));
                for (AbstractC1759v abstractC1759v : d2) {
                    o6.j.b(abstractC1759v);
                    z D7 = AbstractC1741c.D(abstractC1759v);
                    if (zVar2.E0()) {
                        D7 = D7.I0(true);
                    }
                    arrayList3.add(D7);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(zVar2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        s sVar = s.f16302d;
        while (it2.hasNext()) {
            sVar = sVar.a((W) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            z zVar3 = (z) it3.next();
            if (sVar == s.f16305g) {
                if (zVar3 instanceof C1826h) {
                    C1826h c1826h = (C1826h) zVar3;
                    o6.j.e(c1826h, "<this>");
                    zVar3 = new C1826h(c1826h.f16284e, c1826h.f16285f, c1826h.f16286g, c1826h.f16287h, c1826h.f16288i, true);
                }
                o6.j.e(zVar3, "<this>");
                z p8 = C1742d.p(zVar3, false);
                if (p8 != null || (p8 = AbstractC1741c.n(zVar3)) != null) {
                    zVar3 = p8;
                } else {
                    zVar3 = zVar3.I0(false);
                }
            }
            linkedHashSet.add(zVar3);
        }
        ArrayList arrayList4 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((z) it4.next()).y0());
        }
        Iterator it5 = arrayList4.iterator();
        if (it5.hasNext()) {
            ?? next = it5.next();
            while (true) {
                zVar = null;
                if (!it5.hasNext()) {
                    break;
                }
                G g8 = (G) it5.next();
                next = (G) next;
                next.getClass();
                C1536c c1536c = G.f15953e;
                o6.j.e(g8, "other");
                if (!next.isEmpty() || !g8.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    Collection values = ((ConcurrentHashMap) c1536c.f14808e).values();
                    o6.j.d(values, "<get-values>(...)");
                    Iterator it6 = values.iterator();
                    while (it6.hasNext()) {
                        int intValue = ((Number) it6.next()).intValue();
                        C1745g c1745g = (C1745g) next.f791d.get(intValue);
                        C1745g c1745g2 = (C1745g) g8.f791d.get(intValue);
                        if (c1745g == null) {
                            if (c1745g2 == null || !o6.j.a(c1745g, c1745g2)) {
                                c1745g2 = null;
                            }
                        } else {
                            if (!o6.j.a(c1745g2, c1745g)) {
                                c1745g = null;
                            }
                            c1745g2 = c1745g;
                        }
                        F7.l.a(arrayList5, c1745g2);
                    }
                    next = C1536c.g(arrayList5);
                }
            }
            G g9 = (G) next;
            if (linkedHashSet.size() == 1) {
                f8 = (z) AbstractC0436k.F0(linkedHashSet);
            } else {
                ArrayList a3 = a(linkedHashSet, new I(2, this, t.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 0, 7));
                a3.isEmpty();
                if (!a3.isEmpty()) {
                    Iterator it7 = a3.iterator();
                    if (it7.hasNext()) {
                        z next2 = it7.next();
                        while (it7.hasNext()) {
                            z zVar4 = (z) it7.next();
                            next2 = next2;
                            if (next2 != 0 && zVar4 != null) {
                                J B02 = next2.B0();
                                J B03 = zVar4.B0();
                                boolean z8 = B02 instanceof k7.n;
                                if (z8 && (B03 instanceof k7.n)) {
                                    Set set = ((k7.n) B02).f12149a;
                                    Set set2 = ((k7.n) B03).f12149a;
                                    o6.j.e(set, "<this>");
                                    o6.j.e(set2, "other");
                                    Set U02 = AbstractC0436k.U0(set);
                                    a6.q.f0(U02, set2);
                                    k7.n nVar = new k7.n(U02);
                                    G.f15953e.getClass();
                                    G g10 = G.f15954f;
                                    o6.j.e(g10, "attributes");
                                    next2 = AbstractC1741c.u(a6.s.f7766d, y7.l.a(y7.h.f16524f, true, "unknown integer literal type"), g10, nVar, false);
                                } else if (z8) {
                                    if (!((k7.n) B02).f12149a.contains(zVar4)) {
                                        zVar4 = null;
                                    }
                                    next2 = zVar4;
                                } else if ((B03 instanceof k7.n) && ((k7.n) B03).f12149a.contains(next2)) {
                                }
                            }
                            next2 = 0;
                        }
                        zVar = next2;
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                }
                if (zVar != null) {
                    f8 = zVar;
                } else {
                    k.f16296b.getClass();
                    ArrayList a4 = a(a3, new I(2, C1828j.f16295b, l.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 0, 8));
                    a4.isEmpty();
                    if (a4.size() < 2) {
                        f8 = (z) AbstractC0436k.F0(a4);
                    } else {
                        f8 = new C1758u(linkedHashSet).f();
                    }
                }
            }
            return f8.K0(g9);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
