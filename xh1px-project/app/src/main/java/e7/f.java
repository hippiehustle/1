package e7;

import H7.q;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a6.u;
import a6.v;
import a6.x;
import c7.InterfaceC0588g;
import d7.h;
import d7.i;
import d7.j;
import g7.AbstractC0796e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class f implements InterfaceC0588g {

    /* renamed from: g, reason: collision with root package name */
    public static final List f10667g;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f10668d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f10669e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10670f;

    static {
        String v02 = AbstractC0436k.v0(AbstractC0437l.X('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List X8 = AbstractC0437l.X(AbstractC1149a.g(v02, "/Any"), AbstractC1149a.g(v02, "/Nothing"), AbstractC1149a.g(v02, "/Unit"), AbstractC1149a.g(v02, "/Throwable"), AbstractC1149a.g(v02, "/Number"), AbstractC1149a.g(v02, "/Byte"), AbstractC1149a.g(v02, "/Double"), AbstractC1149a.g(v02, "/Float"), AbstractC1149a.g(v02, "/Int"), AbstractC1149a.g(v02, "/Long"), AbstractC1149a.g(v02, "/Short"), AbstractC1149a.g(v02, "/Boolean"), AbstractC1149a.g(v02, "/Char"), AbstractC1149a.g(v02, "/CharSequence"), AbstractC1149a.g(v02, "/String"), AbstractC1149a.g(v02, "/Comparable"), AbstractC1149a.g(v02, "/Enum"), AbstractC1149a.g(v02, "/Array"), AbstractC1149a.g(v02, "/ByteArray"), AbstractC1149a.g(v02, "/DoubleArray"), AbstractC1149a.g(v02, "/FloatArray"), AbstractC1149a.g(v02, "/IntArray"), AbstractC1149a.g(v02, "/LongArray"), AbstractC1149a.g(v02, "/ShortArray"), AbstractC1149a.g(v02, "/BooleanArray"), AbstractC1149a.g(v02, "/CharArray"), AbstractC1149a.g(v02, "/Cloneable"), AbstractC1149a.g(v02, "/Annotation"), AbstractC1149a.g(v02, "/collections/Iterable"), AbstractC1149a.g(v02, "/collections/MutableIterable"), AbstractC1149a.g(v02, "/collections/Collection"), AbstractC1149a.g(v02, "/collections/MutableCollection"), AbstractC1149a.g(v02, "/collections/List"), AbstractC1149a.g(v02, "/collections/MutableList"), AbstractC1149a.g(v02, "/collections/Set"), AbstractC1149a.g(v02, "/collections/MutableSet"), AbstractC1149a.g(v02, "/collections/Map"), AbstractC1149a.g(v02, "/collections/MutableMap"), AbstractC1149a.g(v02, "/collections/Map.Entry"), AbstractC1149a.g(v02, "/collections/MutableMap.MutableEntry"), AbstractC1149a.g(v02, "/collections/Iterator"), AbstractC1149a.g(v02, "/collections/MutableIterator"), AbstractC1149a.g(v02, "/collections/ListIterator"), AbstractC1149a.g(v02, "/collections/MutableListIterator"));
        f10667g = X8;
        q W02 = AbstractC0436k.W0(X8);
        int N02 = x.N0(AbstractC0438m.d0(W02, 10));
        if (N02 < 16) {
            N02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(N02);
        Iterator it = W02.iterator();
        while (true) {
            H7.b bVar = (H7.b) it;
            if (bVar.f2047e.hasNext()) {
                v vVar = (v) bVar.next();
                linkedHashMap.put((String) vVar.f7770b, Integer.valueOf(vVar.f7769a));
            } else {
                return;
            }
        }
    }

    public f(j jVar, String[] strArr) {
        Set V02;
        o6.j.e(strArr, "strings");
        List list = jVar.f10508f;
        if (list.isEmpty()) {
            V02 = u.f7768d;
        } else {
            V02 = AbstractC0436k.V0(list);
        }
        List<i> list2 = jVar.f10507e;
        o6.j.d(list2, "getRecordList(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (i iVar : list2) {
            int i4 = iVar.f10498f;
            for (int i8 = 0; i8 < i4; i8++) {
                arrayList.add(iVar);
            }
        }
        arrayList.trimToSize();
        this.f10668d = strArr;
        this.f10669e = V02;
        this.f10670f = arrayList;
    }

    @Override // c7.InterfaceC0588g
    public final String getString(int i4) {
        String str;
        i iVar = (i) this.f10670f.get(i4);
        int i8 = iVar.f10497e;
        if ((i8 & 4) == 4) {
            Object obj = iVar.f10500h;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                AbstractC0796e abstractC0796e = (AbstractC0796e) obj;
                String s8 = abstractC0796e.s();
                if (abstractC0796e.m()) {
                    iVar.f10500h = s8;
                }
                str = s8;
            }
        } else {
            if ((i8 & 2) == 2) {
                List list = f10667g;
                int size = list.size();
                int i9 = iVar.f10499g;
                if (i9 >= 0 && i9 < size) {
                    str = (String) list.get(i9);
                }
            }
            str = this.f10668d[i4];
        }
        if (iVar.j.size() >= 2) {
            List list2 = iVar.j;
            o6.j.b(list2);
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= str.length()) {
                str = str.substring(num.intValue(), num2.intValue());
                o6.j.d(str, "substring(...)");
            }
        }
        if (iVar.f10502l.size() >= 2) {
            List list3 = iVar.f10502l;
            o6.j.b(list3);
            Integer num3 = (Integer) list3.get(0);
            Integer num4 = (Integer) list3.get(1);
            o6.j.b(str);
            str = I7.v.Y(str, (char) num3.intValue(), (char) num4.intValue());
        }
        h hVar = iVar.f10501i;
        if (hVar == null) {
            hVar = h.NONE;
        }
        int ordinal = hVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (str.length() >= 2) {
                        str = str.substring(1, str.length() - 1);
                        o6.j.d(str, "substring(...)");
                    }
                    str = I7.v.Y(str, '$', '.');
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                o6.j.b(str);
                str = I7.v.Y(str, '$', '.');
            }
        }
        o6.j.b(str);
        return str;
    }

    @Override // c7.InterfaceC0588g
    public final boolean o(int i4) {
        return this.f10669e.contains(Integer.valueOf(i4));
    }

    @Override // c7.InterfaceC0588g
    public final String q(int i4) {
        return getString(i4);
    }
}
