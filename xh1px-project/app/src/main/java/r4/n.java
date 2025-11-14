package r4;

import D4.C0037m;
import K3.t;
import O7.V;
import O7.i0;
import a.AbstractC0405a;
import a6.AbstractC0438m;
import androidx.lifecycle.Z;
import d6.InterfaceC0617c;
import g4.C0779a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.AbstractC0951a;
import k2.C0952b;
import k2.C0953c;
import kotlin.NoWhenBranchMatchedException;
import q4.X;

/* loaded from: classes.dex */
public final class n extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final H3.n f14405b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f14406c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f14407d;

    /* renamed from: e, reason: collision with root package name */
    public final A4.c f14408e;

    public n(H3.n nVar) {
        o6.j.e(nVar, "editionRepository");
        this.f14405b = nVar;
        InterfaceC0617c interfaceC0617c = null;
        i0 c6 = V.c(null);
        this.f14406c = c6;
        i0 c9 = V.c(null);
        this.f14407d = c9;
        this.f14408e = new A4.c(new A4.c(nVar.f1950e.f1982c, V.u(c6, new C0037m(interfaceC0617c, this, 11)), new t(this, interfaceC0617c, 2), 27), c9, new N3.h(3, interfaceC0617c, 4), 27);
    }

    public static final ArrayList e(n nVar, ArrayList arrayList) {
        AbstractC1469i c1468h;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0951a abstractC0951a = (AbstractC0951a) it.next();
            if (abstractC0951a instanceof C0952b) {
                C0952b c0952b = (C0952b) abstractC0951a;
                String str = c0952b.f11961c;
                C0779a E02 = AbstractC0405a.E0(c0952b, !c0952b.d());
                List list = c0952b.f11963e;
                ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(D2.f.s((f2.a) it2.next())));
                }
                c1468h = new C1467g(str, E02, arrayList3);
            } else if (abstractC0951a instanceof C0953c) {
                C0953c c0953c = (C0953c) abstractC0951a;
                c1468h = new C1468h(c0953c.f11970c, X.c0(c0953c, !c0953c.d()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(c1468h);
        }
        return arrayList2;
    }
}
