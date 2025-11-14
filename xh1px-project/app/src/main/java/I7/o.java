package I7;

import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public abstract class o extends D2.f {
    public static String P(String str) {
        o6.j.e(str, "<this>");
        H7.t W7 = H7.m.W(new H7.p(2, str), new n("    ", 0));
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Iterator it = W7.f2082a.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object m6 = W7.f2083b.m(it.next());
            i4++;
            if (i4 > 1) {
                sb.append((CharSequence) "\n");
            }
            D2.f.b(sb, m6, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String Q(String str) {
        List list;
        int i4;
        Comparable comparable;
        int i8;
        String str2;
        o6.j.e(str, "<this>");
        g gVar = new g(str);
        if (!gVar.hasNext()) {
            list = a6.s.f7766d;
        } else {
            Object next = gVar.next();
            if (!gVar.hasNext()) {
                list = E2.d.y(next);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (gVar.hasNext()) {
                    arrayList.add(gVar.next());
                }
                list = arrayList;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!m.j0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i4 < length) {
                    if (!AbstractC1492c.y(str3.charAt(i4))) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 == -1) {
                i4 = str3.length();
            }
            arrayList3.add(Integer.valueOf(i4));
        }
        Iterator it2 = arrayList3.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i8 = num.intValue();
        } else {
            i8 = 0;
        }
        int length2 = str.length();
        list.size();
        int W7 = AbstractC0437l.W(list);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i9 = i4 + 1;
            if (i4 >= 0) {
                String str4 = (String) obj2;
                if ((i4 == 0 || i4 == W7) && m.j0(str4)) {
                    str2 = null;
                } else {
                    str2 = m.d0(str4, i8);
                }
                if (str2 != null) {
                    arrayList4.add(str2);
                }
                i4 = i9;
            } else {
                AbstractC0437l.c0();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length2);
        AbstractC0436k.u0(arrayList4, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String R(String str) {
        List list;
        o6.j.e(str, "<this>");
        if (!m.j0("|")) {
            g gVar = new g(str);
            if (!gVar.hasNext()) {
                list = a6.s.f7766d;
            } else {
                Object next = gVar.next();
                if (!gVar.hasNext()) {
                    list = E2.d.y(next);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (gVar.hasNext()) {
                        arrayList.add(gVar.next());
                    }
                    list = arrayList;
                }
            }
            int length = str.length();
            list.size();
            int W7 = AbstractC0437l.W(list);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            for (Object obj : list) {
                int i8 = i4 + 1;
                String str2 = null;
                if (i4 >= 0) {
                    String str3 = (String) obj;
                    if ((i4 != 0 && i4 != W7) || !m.j0(str3)) {
                        int length2 = str3.length();
                        int i9 = 0;
                        while (true) {
                            if (i9 < length2) {
                                if (!AbstractC1492c.y(str3.charAt(i9))) {
                                    break;
                                }
                                i9++;
                            } else {
                                i9 = -1;
                                break;
                            }
                        }
                        if (i9 != -1 && str3.startsWith("|", i9)) {
                            str2 = str3.substring("|".length() + i9);
                            o6.j.d(str2, "substring(...)");
                        }
                        if (str2 == null) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        arrayList2.add(str2);
                    }
                    i4 = i8;
                } else {
                    AbstractC0437l.c0();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            AbstractC0436k.u0(arrayList2, sb, "\n", null, null, null, 124);
            return sb.toString();
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }
}
