package L6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3079a;

    public Q(int i4) {
        this.f3079a = new ArrayList(i4);
    }

    public void a(Object obj) {
        this.f3079a.add(obj);
    }

    public void b(Object obj) {
        if (obj != null) {
            boolean z8 = obj instanceof Object[];
            ArrayList arrayList = this.f3079a;
            if (z8) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(arrayList, objArr);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                arrayList.addAll((Collection) obj);
                return;
            }
            if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } else if (obj instanceof Iterator) {
                Iterator it2 = (Iterator) obj;
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    public Q(T t8) {
        this.f3079a = new ArrayList(1);
    }
}
