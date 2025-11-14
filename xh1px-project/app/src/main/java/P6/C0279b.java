package P6;

import C6.InterfaceC0004e;
import a6.AbstractC0425A;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import f7.C0723c;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import m7.AbstractC1098d;

/* renamed from: P6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279b {

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f4549c;

    /* renamed from: a, reason: collision with root package name */
    public final s f4550a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4551b = new ConcurrentHashMap();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC0278a enumC0278a : EnumC0278a.values()) {
            String str = enumC0278a.f4548d;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, enumC0278a);
            }
        }
        f4549c = linkedHashMap;
    }

    public C0279b(s sVar) {
        this.f4550a = sVar;
    }

    public static ArrayList a(Object obj, boolean z8) {
        Iterable j;
        D6.c cVar = (D6.c) obj;
        o6.j.e(cVar, "<this>");
        Map c6 = cVar.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : c6.entrySet()) {
            C0725e c0725e = (C0725e) entry.getKey();
            k7.g gVar = (k7.g) entry.getValue();
            if (z8 && !o6.j.a(c0725e, w.f4598b)) {
                j = a6.s.f7766d;
            } else {
                j = j(gVar);
            }
            a6.q.f0(arrayList, j);
        }
        return arrayList;
    }

    public static Object c(Object obj, C0723c c0723c) {
        for (Object obj2 : e(obj)) {
            if (o6.j.a(d(obj2), c0723c)) {
                return obj2;
            }
        }
        return null;
    }

    public static C0723c d(Object obj) {
        D6.c cVar = (D6.c) obj;
        o6.j.e(cVar, "<this>");
        return cVar.a();
    }

    public static Iterable e(Object obj) {
        D6.j annotations;
        D6.c cVar = (D6.c) obj;
        o6.j.e(cVar, "<this>");
        InterfaceC0004e d2 = AbstractC1098d.d(cVar);
        if (d2 != null && (annotations = d2.getAnnotations()) != null) {
            return annotations;
        }
        return a6.s.f7766d;
    }

    public static boolean f(Object obj, C0723c c0723c) {
        Iterable e9 = e(obj);
        if (!(e9 instanceof Collection) || !((Collection) e9).isEmpty()) {
            Iterator it = e9.iterator();
            while (it.hasNext()) {
                if (o6.j.a(d(it.next()), c0723c)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static List j(k7.g gVar) {
        if (gVar instanceof k7.b) {
            Iterable iterable = (Iterable) ((k7.b) gVar).f12144a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a6.q.f0(arrayList, j((k7.g) it.next()));
            }
            return arrayList;
        }
        if (gVar instanceof k7.i) {
            return E2.d.y(((k7.i) gVar).f12146c.c());
        }
        return a6.s.f7766d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015f  */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26, types: [int] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t b(t tVar, D6.j jVar) {
        boolean z8;
        EnumMap enumMap;
        m mVar;
        A h8;
        boolean z9;
        m mVar2;
        Object c6;
        Object obj;
        Z5.j jVar2;
        ?? r13;
        X6.i iVar;
        boolean z10;
        o6.j.e(jVar, "annotations");
        s sVar = this.f4550a;
        boolean z11 = sVar.f4587b;
        if (!z11) {
            ArrayList arrayList = new ArrayList();
            Iterator it = jVar.iterator();
            while (true) {
                z8 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                A a3 = A.f4515d;
                A a4 = A.f4516e;
                m mVar3 = null;
                if (!z11 && (mVar = (m) n.f4573c.get(d(next))) != null) {
                    C0723c d2 = d(next);
                    if (d2 != null && n.f4571a.containsKey(d2)) {
                        h8 = (A) ((B6.n) sVar.f4589d).m(d2);
                    } else {
                        h8 = h(next);
                        if (h8 == null) {
                            h8 = ((u) sVar.f4588c).f4591a;
                        }
                    }
                    if (h8 == a3) {
                        h8 = null;
                    }
                    if (h8 != null) {
                        X6.i iVar2 = mVar.f4568a;
                        if (h8 == a4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        X6.i a9 = X6.i.a(iVar2, null, z9, 1);
                        Collection collection = mVar.f4569b;
                        boolean z12 = mVar.f4570c;
                        o6.j.e(collection, "qualifierApplicabilityTypes");
                        mVar2 = new m(a9, collection, z12);
                        if (mVar2 == null) {
                            mVar3 = mVar2;
                        } else {
                            if (!((u) sVar.f4588c).f4594d && (c6 = c(next, x.f4617f)) != null) {
                                Iterator it2 = e(next).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = it2.next();
                                        if (i(obj) != null) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                if (obj != null) {
                                    ArrayList a10 = a(c6, true);
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    Iterator it3 = a10.iterator();
                                    while (it3.hasNext()) {
                                        EnumC0278a enumC0278a = (EnumC0278a) f4549c.get((String) it3.next());
                                        if (enumC0278a != null) {
                                            linkedHashSet.add(enumC0278a);
                                        }
                                    }
                                    if (linkedHashSet.contains(EnumC0278a.f4546h)) {
                                        linkedHashSet = AbstractC0425A.g0(AbstractC0425A.f0(AbstractC0434i.l1(EnumC0278a.values()), EnumC0278a.f4547i), linkedHashSet);
                                    }
                                    jVar2 = new Z5.j(obj, linkedHashSet);
                                    if (jVar2 != null) {
                                        Object obj2 = jVar2.f7485d;
                                        Set set = (Set) jVar2.f7486e;
                                        A h9 = h(next);
                                        if (h9 == null && (h9 = h(obj2)) == null) {
                                            h9 = ((u) sVar.f4588c).f4591a;
                                        }
                                        if (h9 != a3) {
                                            o6.j.e(obj2, "$this$extractNullability");
                                            X6.i g8 = g(obj2, false);
                                            if (g8 != null) {
                                                iVar = g8;
                                            } else {
                                                Object i4 = i(obj2);
                                                if (i4 != null) {
                                                    A h10 = h(obj2);
                                                    if (h10 == null) {
                                                        h10 = ((u) sVar.f4588c).f4591a;
                                                    }
                                                    if (h10 != a3) {
                                                        X6.i g9 = g(i4, false);
                                                        if (g9 != null) {
                                                            if (h10 == a4) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            r13 = 1;
                                                            iVar = X6.i.a(g9, null, z10, 1);
                                                        } else {
                                                            r13 = 1;
                                                            iVar = null;
                                                        }
                                                        if (iVar != null) {
                                                            if (h9 == a4) {
                                                                z8 = r13;
                                                            }
                                                            mVar3 = new m(X6.i.a(iVar, null, z8, r13), set);
                                                        }
                                                    }
                                                }
                                                iVar = null;
                                            }
                                            r13 = 1;
                                            if (iVar != null) {
                                            }
                                        }
                                    }
                                }
                            }
                            jVar2 = null;
                            if (jVar2 != null) {
                            }
                        }
                        if (mVar3 == null) {
                            arrayList.add(mVar3);
                        }
                    }
                }
                mVar2 = null;
                if (mVar2 == null) {
                }
                if (mVar3 == null) {
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap2 = new EnumMap(EnumC0278a.class);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    m mVar4 = (m) it4.next();
                    for (EnumC0278a enumC0278a2 : mVar4.f4569b) {
                        enumMap2.containsKey(enumC0278a2);
                        enumMap2.put((EnumMap) enumC0278a2, (EnumC0278a) mVar4);
                    }
                }
                if (tVar != null) {
                    enumMap = new EnumMap(tVar.f4590a);
                } else {
                    enumMap = new EnumMap(EnumC0278a.class);
                }
                for (Map.Entry entry : enumMap2.entrySet()) {
                    EnumC0278a enumC0278a3 = (EnumC0278a) entry.getKey();
                    m mVar5 = (m) entry.getValue();
                    if (mVar5 != null) {
                        enumMap.put((EnumMap) enumC0278a3, (EnumC0278a) mVar5);
                        z8 = true;
                    }
                }
                if (z8) {
                    return new t(enumMap);
                }
            }
        }
        return tVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r9.equals("ALWAYS") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r9.equals("UNKNOWN") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r9.equals("NEVER") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r9.equals("MAYBE") == false) goto L43;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0059. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final X6.i g(Object obj, boolean z8) {
        C0723c d2 = d(obj);
        if (d2 != null) {
            A a3 = (A) ((B6.n) this.f4550a.f4589d).m(d2);
            a3.getClass();
            if (a3 == A.f4515d) {
                return null;
            }
            boolean contains = x.k.contains(d2);
            X6.h hVar = X6.h.f7006f;
            boolean z9 = false;
            if (!contains) {
                boolean contains2 = x.f4621l.contains(d2);
                X6.h hVar2 = X6.h.f7005e;
                if (!contains2) {
                    boolean contains3 = x.f4622m.contains(d2);
                    X6.h hVar3 = X6.h.f7004d;
                    if (!contains3) {
                        if (d2.equals(x.f4618g)) {
                            String str = (String) AbstractC0436k.q0(a(obj, false));
                            if (str != null) {
                                switch (str.hashCode()) {
                                    case 73135176:
                                        break;
                                    case 74175084:
                                        break;
                                    case 433141802:
                                        break;
                                    case 1933739535:
                                        break;
                                }
                            }
                        }
                    }
                    hVar = hVar3;
                }
                hVar = hVar2;
            }
            if (a3 == A.f4516e || z8) {
                z9 = true;
            }
            return new X6.i(hVar, z9);
        }
        return null;
    }

    public final A h(Object obj) {
        String str;
        u uVar = (u) this.f4550a.f4588c;
        A a3 = (A) uVar.f4593c.get(d(obj));
        if (a3 != null) {
            return a3;
        }
        Object c6 = c(obj, x.f4625p);
        if (c6 != null && (str = (String) AbstractC0436k.q0(a(c6, false))) != null) {
            A a4 = uVar.f4592b;
            if (a4 == null) {
                int hashCode = str.hashCode();
                if (hashCode != -2137067054) {
                    if (hashCode != -1838656823) {
                        if (hashCode == 2656902 && str.equals("WARN")) {
                            return A.f4516e;
                        }
                        return null;
                    }
                    if (str.equals("STRICT")) {
                        return A.f4517f;
                    }
                    return null;
                }
                if (str.equals("IGNORE")) {
                    return A.f4515d;
                }
                return null;
            }
            return a4;
        }
        return null;
    }

    public final Object i(Object obj) {
        Object obj2;
        o6.j.e(obj, "annotation");
        if (!((u) this.f4550a.f4588c).f4594d) {
            if (!AbstractC0436k.l0(x.j, d(obj)) && !f(obj, x.f4615d)) {
                if (f(obj, x.f4616e)) {
                    InterfaceC0004e d2 = AbstractC1098d.d((D6.c) obj);
                    o6.j.b(d2);
                    ConcurrentHashMap concurrentHashMap = this.f4551b;
                    Object obj3 = concurrentHashMap.get(d2);
                    if (obj3 == null) {
                        Iterator it = e(obj).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = i(it.next());
                                if (obj2 != null) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        if (obj2 != null) {
                            Object putIfAbsent = concurrentHashMap.putIfAbsent(d2, obj2);
                            if (putIfAbsent == null) {
                                return obj2;
                            }
                            return putIfAbsent;
                        }
                    } else {
                        return obj3;
                    }
                }
            } else {
                return obj;
            }
        }
        return null;
    }
}
