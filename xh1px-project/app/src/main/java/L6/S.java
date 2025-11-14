package L6;

import a6.AbstractC0438m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3080a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3081b;

    public S() {
        this.f3080a = new ArrayList(0);
        this.f3081b = new ArrayList(0);
    }

    public S(int i4, String str, c0 c0Var) {
        o6.j.e(str, "name");
        this.f3080a = new ArrayList(1);
        N6.k.f3794a.getClass();
        List a3 = N6.j.a();
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(a3, 10));
        Iterator it = a3.iterator();
        while (it.hasNext()) {
            ((O6.d) ((N6.k) it.next())).getClass();
            arrayList.add(new O6.g());
        }
        this.f3081b = arrayList;
    }
}
