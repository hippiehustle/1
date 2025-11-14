package Z7;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class H extends AbstractC0380a {

    /* renamed from: a, reason: collision with root package name */
    public final G f7549a;

    public H() {
        d0 d0Var = d0.f7591a;
        a8.l lVar = a8.l.f8290a;
        this.f7549a = new G(d0.f7592b, a8.l.f8291b);
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        h(obj);
        G g8 = this.f7549a;
        o6.j.e(g8, "descriptor");
        kotlinx.serialization.json.internal.c a3 = cVar.a(g8);
        Iterator g9 = g(obj);
        int i4 = 0;
        while (g9.hasNext()) {
            Map.Entry entry = (Map.Entry) g9.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i8 = i4 + 1;
            a3.q(g8, i4, d0.f7591a, key);
            i4 += 2;
            a3.q(g8, i8, a8.l.f8290a, value);
        }
        a3.v(g8);
    }

    @Override // V7.a
    public final X7.f d() {
        return this.f7549a;
    }

    @Override // Z7.AbstractC0380a
    public final Object e() {
        return new LinkedHashMap();
    }

    @Override // Z7.AbstractC0380a
    public final int f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        o6.j.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // Z7.AbstractC0380a
    public final Iterator g(Object obj) {
        Map map = (Map) obj;
        o6.j.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        Map map = (Map) obj;
        o6.j.e(map, "<this>");
        return map.size();
    }

    @Override // Z7.AbstractC0380a
    public final void j(Y7.a aVar, int i4, Object obj) {
        Object p8;
        Map map = (Map) obj;
        a8.l lVar = a8.l.f8290a;
        o6.j.e(map, "builder");
        d0 d0Var = d0.f7591a;
        G g8 = this.f7549a;
        Object p9 = aVar.p(g8, i4, d0Var, null);
        int n3 = aVar.n(g8);
        if (n3 == i4 + 1) {
            if (map.containsKey(p9) && !(a8.l.f8291b.f7063b instanceof X7.e)) {
                p8 = aVar.p(g8, n3, lVar, a6.x.M0(map, p9));
            } else {
                p8 = aVar.p(g8, n3, lVar, null);
            }
            map.put(p9, p8);
            return;
        }
        throw new IllegalArgumentException(A.j.i(i4, n3, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
    }

    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        o6.j.e(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // Z7.AbstractC0380a
    public final Object l(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        o6.j.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
