package a6;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import q4.X;

/* renamed from: a6.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0425A extends X {
    public static LinkedHashSet f0(Set set, Object obj) {
        o6.j.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.N0(set.size()));
        boolean z8 = false;
        for (Object obj2 : set) {
            boolean z9 = true;
            if (!z8 && o6.j.a(obj2, obj)) {
                z8 = true;
                z9 = false;
            }
            if (z9) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashSet g0(Set set, Iterable iterable) {
        Integer num;
        int size;
        o6.j.e(set, "<this>");
        o6.j.e(iterable, "elements");
        if (iterable instanceof Collection) {
            num = Integer.valueOf(((Collection) iterable).size());
        } else {
            num = null;
        }
        if (num != null) {
            size = set.size() + num.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.N0(size));
        linkedHashSet.addAll(set);
        q.f0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet h0(Set set, Object obj) {
        o6.j.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.N0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
