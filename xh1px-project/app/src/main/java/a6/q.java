package a6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class q extends p {
    public static void f0(Collection collection, Iterable iterable) {
        o6.j.e(collection, "<this>");
        o6.j.e(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static Object g0(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object h0(List list) {
        o6.j.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(AbstractC0437l.W(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}
