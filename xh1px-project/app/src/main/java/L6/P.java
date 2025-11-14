package L6;

import a6.AbstractC0438m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public int f3074a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3075b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3076c = new ArrayList(0);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3077d = new ArrayList(0);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3078e;

    public P(int i4) {
        this.f3074a = i4;
        N6.k.f3794a.getClass();
        List a3 = N6.j.a();
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(a3, 10));
        Iterator it = a3.iterator();
        while (it.hasNext()) {
            ((O6.d) ((N6.k) it.next())).getClass();
            arrayList.add(new Object());
        }
        this.f3078e = arrayList;
    }
}
