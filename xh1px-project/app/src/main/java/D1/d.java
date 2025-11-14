package D1;

import O7.i0;
import a6.C0433h;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class d extends A4.c {
    public final void n(c cVar) {
        i0 i0Var = (i0) this.f292f;
        C0433h c0433h = (C0433h) this.f291e;
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (!c0433h.isEmpty() && (h() instanceof a)) {
                j();
                return;
            }
            c0433h.addLast(bVar);
            i0Var.getClass();
            i0Var.h(null, bVar);
            return;
        }
        if (cVar instanceof a) {
            a aVar = (a) cVar;
            if (!c0433h.contains(aVar)) {
                c0433h.addLast(aVar);
                i0Var.getClass();
                i0Var.h(null, aVar);
                return;
            }
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
