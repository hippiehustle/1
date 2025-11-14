package H7;

import a6.AbstractC0437l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public abstract class m extends n {
    public static k P(Iterator it) {
        o6.j.e(it, "<this>");
        return new a(new p(0, it));
    }

    public static int Q(k kVar) {
        Iterator it = kVar.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            it.next();
            i4++;
            if (i4 < 0) {
                AbstractC0437l.b0();
                throw null;
            }
        }
        return i4;
    }

    public static Object R(g gVar) {
        f fVar = new f(gVar);
        if (!fVar.hasNext()) {
            return null;
        }
        return fVar.next();
    }

    public static final h S(k kVar) {
        o oVar = new o(0);
        if (kVar instanceof t) {
            t tVar = (t) kVar;
            return new h(tVar.f2082a, tVar.f2083b, oVar);
        }
        return new h(kVar, new o(1), oVar);
    }

    public static k T(Object obj, InterfaceC1163b interfaceC1163b) {
        if (obj == null) {
            return e.f2051a;
        }
        return new j(new B0.e(3, obj), interfaceC1163b, 0);
    }

    public static k U(InterfaceC1162a interfaceC1162a) {
        return new a(new j(interfaceC1162a, new A1.h(7, interfaceC1162a), 0));
    }

    public static Object V(k kVar) {
        Iterator it = kVar.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static t W(k kVar, InterfaceC1163b interfaceC1163b) {
        o6.j.e(interfaceC1163b, "transform");
        return new t(kVar, interfaceC1163b);
    }

    public static g X(k kVar, InterfaceC1163b interfaceC1163b) {
        return new g(new t(kVar, interfaceC1163b), false, new o(2));
    }

    public static List Y(k kVar) {
        Iterator it = kVar.iterator();
        if (!it.hasNext()) {
            return a6.s.f7766d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return E2.d.y(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
