package z6;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0019u;
import F6.C0050j;
import F6.D;
import F6.S;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import v7.C1679b;
import w7.C1747i;
import w7.X;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final D f16808a;

    static {
        y7.l lVar = y7.l.f16567a;
        B6.p pVar = new B6.p(y7.l.f16568b, n.f16798f, 1);
        C0725e f8 = n.f16799g.f10797a.f();
        C1679b c1679b = v7.k.f15560e;
        D d2 = new D(pVar, f8, c1679b);
        d2.k = EnumC0023y.f781h;
        C0014o c0014o = AbstractC0015p.f758e;
        if (c0014o != null) {
            d2.f1456l = c0014o;
            List y4 = E2.d.y(S.P0(d2, X.IN_VARIANCE, C0725e.e("T"), 0, c1679b));
            if (d2.f1458n == null) {
                ArrayList arrayList = new ArrayList(y4);
                d2.f1458n = arrayList;
                d2.f1457m = new C1747i(d2, arrayList, d2.f1459o, d2.f1460p);
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((C0050j) ((InterfaceC0019u) it.next())).k = d2.l();
                    }
                    f16808a = d2;
                    return;
                }
                D.V(13);
                throw null;
            }
            throw new IllegalStateException("Type parameters are already set for " + d2.getName());
        }
        D.V(9);
        throw null;
    }
}
