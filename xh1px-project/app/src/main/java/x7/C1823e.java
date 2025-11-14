package x7;

import C6.T;
import a.AbstractC0405a;
import a6.AbstractC0438m;
import j7.C0944c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import u7.C1652e;
import w7.AbstractC1741c;
import w7.AbstractC1754p;
import w7.AbstractC1759v;
import w7.C1758u;
import w7.J;
import w7.M;
import w7.W;
import w7.X;
import w7.z;
import z7.EnumC1885b;
import z7.InterfaceC1887d;

/* renamed from: x7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1823e {

    /* renamed from: a, reason: collision with root package name */
    public static final C1823e f16281a = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    public static z b(z zVar) {
        W w8;
        AbstractC1759v b4;
        J B02 = zVar.B0();
        T t8 = null;
        W w9 = null;
        if (B02 instanceof C0944c) {
            C0944c c0944c = (C0944c) B02;
            M m6 = c0944c.f11946a;
            if (m6.a() != X.IN_VARIANCE) {
                m6 = null;
            }
            if (m6 != null && (b4 = m6.b()) != null) {
                w8 = b4.H0();
            } else {
                w8 = null;
            }
            if (c0944c.f11947b == null) {
                M m8 = c0944c.f11946a;
                Collection d2 = c0944c.d();
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(d2, 10));
                Iterator it = d2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC1759v) it.next()).H0());
                }
                o6.j.e(m8, "projection");
                c0944c.f11947b = new C1827i(m8, new C1652e(arrayList, 1), t8, 8);
            }
            C1827i c1827i = c0944c.f11947b;
            o6.j.b(c1827i);
            return new C1826h(EnumC1885b.f16823d, c1827i, w8, zVar.y0(), zVar.E0(), 32);
        }
        if ((B02 instanceof C1758u) && zVar.E0()) {
            C1758u c1758u = (C1758u) B02;
            LinkedHashSet linkedHashSet = c1758u.f16016b;
            ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(linkedHashSet, 10));
            Iterator it2 = linkedHashSet.iterator();
            boolean z8 = false;
            while (it2.hasNext()) {
                arrayList2.add(AbstractC0405a.e0((AbstractC1759v) it2.next()));
                z8 = true;
            }
            if (z8) {
                AbstractC1759v abstractC1759v = c1758u.f16015a;
                if (abstractC1759v != null) {
                    w9 = AbstractC0405a.e0(abstractC1759v);
                }
                arrayList2.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
                linkedHashSet2.hashCode();
                C1758u c1758u2 = new C1758u(linkedHashSet2);
                c1758u2.f16015a = w9;
                t8 = c1758u2;
            }
            if (t8 != null) {
                c1758u = t8;
            }
            return c1758u.f();
        }
        return zVar;
    }

    public final W a(InterfaceC1887d interfaceC1887d) {
        W e9;
        W w8;
        o6.j.e(interfaceC1887d, "type");
        if (interfaceC1887d instanceof AbstractC1759v) {
            W H02 = ((AbstractC1759v) interfaceC1887d).H0();
            if (H02 instanceof z) {
                e9 = b((z) H02);
            } else if (H02 instanceof AbstractC1754p) {
                AbstractC1754p abstractC1754p = (AbstractC1754p) H02;
                z zVar = abstractC1754p.f16007f;
                z zVar2 = abstractC1754p.f16006e;
                z b4 = b(zVar2);
                z b9 = b(zVar);
                if (b4 == zVar2 && b9 == zVar) {
                    e9 = H02;
                } else {
                    e9 = AbstractC1741c.e(b4, b9);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC1759v f8 = AbstractC1741c.f(H02);
            if (f8 != null) {
                w8 = a(f8);
            } else {
                w8 = null;
            }
            return AbstractC1741c.F(e9, w8);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
