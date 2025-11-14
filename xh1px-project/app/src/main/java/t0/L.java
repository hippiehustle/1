package t0;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class L extends U {

    /* renamed from: d, reason: collision with root package name */
    public final C1539e f14777d;

    public L(AbstractC1534b abstractC1534b) {
        K k = new K(this);
        g0.L l6 = new g0.L(18, this);
        synchronized (AbstractC1534b.f14800a) {
            try {
                if (AbstractC1534b.f14801b == null) {
                    AbstractC1534b.f14801b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1539e c1539e = new C1539e(l6, new C1536c(AbstractC1534b.f14801b, 0, abstractC1534b));
        this.f14777d = c1539e;
        c1539e.f14835d.add(k);
    }

    @Override // t0.U
    public final int a() {
        return this.f14777d.f14837f.size();
    }

    public final Object g(int i4) {
        return this.f14777d.f14837f.get(i4);
    }

    public void h(List list) {
        C1539e c1539e = this.f14777d;
        g0.L l6 = c1539e.f14832a;
        int i4 = c1539e.f14838g + 1;
        c1539e.f14838g = i4;
        List list2 = c1539e.f14836e;
        if (list == list2) {
            return;
        }
        if (list == null) {
            int size = list2.size();
            c1539e.f14836e = null;
            c1539e.f14837f = Collections.EMPTY_LIST;
            l6.j(0, size);
            c1539e.a();
            return;
        }
        if (list2 == null) {
            c1539e.f14836e = list;
            c1539e.f14837f = Collections.unmodifiableList(list);
            l6.H(0, list.size());
            c1539e.a();
            return;
        }
        ((Executor) c1539e.f14833b.f14808e).execute(new RunnableC1538d(c1539e, list2, list, i4));
    }
}
