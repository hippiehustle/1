package a6;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import n1.AbstractC1149a;
import n6.InterfaceC1163b;
import q4.X;
import t6.C1586a;
import t6.C1588c;

/* renamed from: a6.k */
/* loaded from: classes.dex */
public abstract class AbstractC0436k extends q {
    public static ArrayList A0(Iterable iterable, Iterable iterable2) {
        o6.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return C0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        q.f0(arrayList, iterable);
        q.f0(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList B0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return D0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        q.f0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList C0(Collection collection, Iterable iterable) {
        o6.j.e(collection, "<this>");
        o6.j.e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        q.f0(arrayList2, iterable);
        return arrayList2;
    }

    public static ArrayList D0(Collection collection, Object obj) {
        o6.j.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List E0(Iterable iterable) {
        o6.j.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return Q0(iterable);
        }
        List T02 = T0(iterable);
        Collections.reverse(T02);
        return T02;
    }

    public static Object F0(Iterable iterable) {
        o6.j.e(iterable, "<this>");
        if (iterable instanceof List) {
            return G0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object G0(List list) {
        o6.j.e(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object H0(Collection collection) {
        o6.j.e(collection, "<this>");
        if (collection instanceof List) {
            List list = (List) collection;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                return null;
            }
            return next;
        }
        return null;
    }

    public static Object I0(List list) {
        o6.j.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List J0(List list, C1588c c1588c) {
        o6.j.e(list, "<this>");
        o6.j.e(c1588c, "indices");
        if (c1588c.isEmpty()) {
            return s.f7766d;
        }
        return Q0(list.subList(c1588c.f15123d, c1588c.f15124e + 1));
    }

    public static List K0(Iterable iterable) {
        o6.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return Q0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            o6.j.e(comparableArr, "<this>");
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            return AbstractC0434i.K0(array);
        }
        List T02 = T0(iterable);
        if (((ArrayList) T02).size() > 1) {
            Collections.sort(T02);
        }
        return T02;
    }

    public static List L0(Iterable iterable, Comparator comparator) {
        o6.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return Q0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            o6.j.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return AbstractC0434i.K0(array);
        }
        List T02 = T0(iterable);
        p.e0(T02, comparator);
        return T02;
    }

    public static List M0(int i4, List list) {
        o6.j.e(list, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                return s.f7766d;
            }
            if (i4 >= list.size()) {
                return Q0(list);
            }
            if (i4 == 1) {
                return E2.d.y(o0(list));
            }
            ArrayList arrayList = new ArrayList(i4);
            Iterator it = list.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i8++;
                if (i8 == i4) {
                    break;
                }
            }
            return AbstractC0437l.a0(arrayList);
        }
        throw new IllegalArgumentException(A.j.j(i4, "Requested element count ", " is less than zero.").toString());
    }

    public static boolean[] N0(List list) {
        o6.j.e(list, "<this>");
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            zArr[i4] = ((Boolean) it.next()).booleanValue();
            i4++;
        }
        return zArr;
    }

    public static final void O0(Iterable iterable, AbstractCollection abstractCollection) {
        o6.j.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] P0(List list) {
        o6.j.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            iArr[i4] = ((Number) it.next()).intValue();
            i4++;
        }
        return iArr;
    }

    public static List Q0(Iterable iterable) {
        Object next;
        o6.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return S0(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return E2.d.y(next);
            }
            return s.f7766d;
        }
        return AbstractC0437l.a0(T0(iterable));
    }

    public static long[] R0(Collection collection) {
        o6.j.e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            jArr[i4] = ((Number) it.next()).longValue();
            i4++;
        }
        return jArr;
    }

    public static ArrayList S0(Collection collection) {
        o6.j.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List T0(Iterable iterable) {
        o6.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return S0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        O0(iterable, arrayList);
        return arrayList;
    }

    public static Set U0(Iterable iterable) {
        o6.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        O0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set V0(Iterable iterable) {
        Object next;
        o6.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(x.N0(collection.size()));
                    O0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return X.T(next);
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            O0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                return X.T(linkedHashSet2.iterator().next());
            }
        }
        return u.f7768d;
    }

    public static H7.q W0(List list) {
        o6.j.e(list, "<this>");
        return new H7.q(3, new B0.e(15, list));
    }

    public static ArrayList X0(List list, List list2) {
        o6.j.e(list, "<this>");
        o6.j.e(list2, "other");
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC0438m.d0(list, 10), AbstractC0438m.d0(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Z5.j(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int i0(int i4, List list) {
        if (i4 >= 0 && i4 <= AbstractC0437l.W(list)) {
            return AbstractC0437l.W(list) - i4;
        }
        StringBuilder j = AbstractC1149a.j(i4, "Element index ", " must be in range [");
        j.append(new C1586a(0, AbstractC0437l.W(list), 1));
        j.append("].");
        throw new IndexOutOfBoundsException(j.toString());
    }

    public static final int j0(int i4, List list) {
        if (i4 >= 0 && i4 <= list.size()) {
            return list.size() - i4;
        }
        StringBuilder j = AbstractC1149a.j(i4, "Position index ", " must be in range [");
        j.append(new C1586a(0, list.size(), 1));
        j.append("].");
        throw new IndexOutOfBoundsException(j.toString());
    }

    public static H7.p k0(Iterable iterable) {
        o6.j.e(iterable, "<this>");
        return new H7.p(4, iterable);
    }

    public static boolean l0(Iterable iterable, Object obj) {
        int i4;
        o6.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            i4 = ((List) iterable).indexOf(obj);
        } else {
            Iterator it = iterable.iterator();
            int i8 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i8 >= 0) {
                        if (o6.j.a(obj, next)) {
                            i4 = i8;
                            break;
                        }
                        i8++;
                    } else {
                        AbstractC0437l.c0();
                        throw null;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
        }
        if (i4 < 0) {
            return false;
        }
        return true;
    }

    public static List m0(List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return s.f7766d;
        }
        if (size == 1) {
            return E2.d.y(w0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i4 = 1; i4 < size2; i4++) {
                arrayList.add(list.get(i4));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List n0(List list) {
        o6.j.e(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return M0(size, list);
    }

    public static Object o0(Iterable iterable) {
        o6.j.e(iterable, "<this>");
        if (iterable instanceof List) {
            return p0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object p0(List list) {
        o6.j.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object q0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static Object r0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object s0(int i4, List list) {
        o6.j.e(list, "<this>");
        if (i4 >= 0 && i4 < list.size()) {
            return list.get(i4);
        }
        return null;
    }

    public static final void t0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC1163b interfaceC1163b) {
        o6.j.e(iterable, "<this>");
        o6.j.e(appendable, "buffer");
        o6.j.e(charSequence2, "prefix");
        o6.j.e(charSequence3, "postfix");
        appendable.append(charSequence2);
        int i4 = 0;
        for (Object obj : iterable) {
            i4++;
            if (i4 > 1) {
                appendable.append(charSequence);
            }
            D2.f.b(appendable, obj, interfaceC1163b);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void u0(Collection collection, StringBuilder sb, String str, String str2, String str3, InterfaceC1163b interfaceC1163b, int i4) {
        if ((i4 & 4) != 0) {
            str2 = "";
        }
        if ((i4 & 8) != 0) {
            str3 = "";
        }
        if ((i4 & 64) != 0) {
            interfaceC1163b = null;
        }
        t0(collection, sb, str, str2, str3, "...", interfaceC1163b);
    }

    public static String v0(Iterable iterable, String str, String str2, String str3, InterfaceC1163b interfaceC1163b, int i4) {
        String str4;
        String str5;
        if ((i4 & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i4 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i4 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i4 & 32) != 0) {
            interfaceC1163b = null;
        }
        o6.j.e(iterable, "<this>");
        o6.j.e(str4, "prefix");
        StringBuilder sb = new StringBuilder();
        t0(iterable, sb, str6, str4, str5, "...", interfaceC1163b);
        return sb.toString();
    }

    public static Object w0(Collection collection) {
        if (collection instanceof List) {
            return x0((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object x0(List list) {
        o6.j.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(AbstractC0437l.W(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object y0(List list) {
        o6.j.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable z0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }
}
