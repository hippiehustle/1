package E3;

import java.util.List;
import k2.AbstractC0951a;
import k2.C0953c;
import o6.j;

/* loaded from: classes.dex */
public final class c extends a {
    @Override // E3.a
    public final AbstractC0951a k(AbstractC0951a abstractC0951a, List list, List list2) {
        j.e(list, "conditions");
        j.e(list2, "actions");
        return C0953c.n((C0953c) abstractC0951a, null, null, null, list2, list, 79);
    }

    @Override // E3.a
    public final void n(List list) {
        j.e(list, "conditions");
        C0953c c0953c = (C0953c) this.f894h.f();
        if (c0953c != null) {
            h(a.l(this, c0953c, list, null, 4));
        }
    }
}
