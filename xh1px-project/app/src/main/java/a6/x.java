package a6;

import a.AbstractC0405a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class x extends AbstractC0405a {
    public static Object M0(Map map, Object obj) {
        o6.j.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static int N0(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map O0(Z5.j jVar) {
        o6.j.e(jVar, "pair");
        Map singletonMap = Collections.singletonMap(jVar.f7485d, jVar.f7486e);
        o6.j.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map P0(Z5.j... jVarArr) {
        if (jVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(N0(jVarArr.length));
            Q0(linkedHashMap, jVarArr);
            return linkedHashMap;
        }
        return t.f7767d;
    }

    public static final void Q0(HashMap hashMap, Z5.j[] jVarArr) {
        for (Z5.j jVar : jVarArr) {
            hashMap.put(jVar.f7485d, jVar.f7486e);
        }
    }

    public static Map R0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(N0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Z5.j jVar = (Z5.j) it.next();
                    linkedHashMap.put(jVar.f7485d, jVar.f7486e);
                }
                return linkedHashMap;
            }
            return O0((Z5.j) arrayList.get(0));
        }
        return t.f7767d;
    }

    public static Map S0(Map map) {
        o6.j.e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return T0(map);
            }
            o6.j.e(map, "<this>");
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            o6.j.d(singletonMap, "with(...)");
            return singletonMap;
        }
        return t.f7767d;
    }

    public static LinkedHashMap T0(Map map) {
        o6.j.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
