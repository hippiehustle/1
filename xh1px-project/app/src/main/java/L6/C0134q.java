package L6;

import a6.AbstractC0436k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: L6.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134q {

    /* renamed from: a, reason: collision with root package name */
    public final String f3158a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3159b;

    public C0134q(String str, Map map) {
        o6.j.e(str, "className");
        this.f3158a = str;
        this.f3159b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0134q) {
                C0134q c0134q = (C0134q) obj;
                if (!o6.j.a(this.f3158a, c0134q.f3158a) || !o6.j.a(this.f3159b, c0134q.f3159b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3159b.hashCode() + (this.f3158a.hashCode() * 31);
    }

    public final String toString() {
        List list;
        Map map = this.f3159b;
        int size = map.size();
        List list2 = a6.s.f7766d;
        if (size != 0) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    list2 = E2.d.y(new Z5.j(entry.getKey(), entry.getValue()));
                } else {
                    ArrayList arrayList = new ArrayList(map.size());
                    arrayList.add(new Z5.j(entry.getKey(), entry.getValue()));
                    do {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        arrayList.add(new Z5.j(entry2.getKey(), entry2.getValue()));
                    } while (it.hasNext());
                    list = arrayList;
                    return "@" + this.f3158a + '(' + AbstractC0436k.v0(list, null, null, null, C0133p.f3157d, 31) + ')';
                }
            }
        }
        list = list2;
        return "@" + this.f3158a + '(' + AbstractC0436k.v0(list, null, null, null, C0133p.f3157d, 31) + ')';
    }
}
