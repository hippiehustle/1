package E3;

import O7.i0;
import a6.AbstractC0436k;
import f2.d;
import f2.e;
import j2.C0902b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.AbstractC0951a;
import k2.C0952b;
import l1.C0999a;
import o6.j;

/* loaded from: classes.dex */
public final class b extends a {
    @Override // E3.a
    public final AbstractC0951a k(AbstractC0951a abstractC0951a, List list, List list2) {
        j.e(list, "conditions");
        j.e(list2, "actions");
        return C0952b.m((C0952b) abstractC0951a, null, null, null, 0, list2, list, false, 0, false, 463);
    }

    @Override // E3.a
    public final void n(List list) {
        Object obj;
        j.e(list, "conditions");
        i0 i0Var = this.f894h;
        C0952b c0952b = (C0952b) i0Var.f();
        if (c0952b != null) {
            int i4 = c0952b.f11962d;
            C3.a aVar = this.f1193m;
            List<f2.a> list2 = (List) aVar.f890d.f();
            if (list2 != null) {
                ArrayList S02 = AbstractC0436k.S0(list2);
                for (f2.a aVar2 : list2) {
                    if (aVar2 instanceof e) {
                        e eVar = (e) aVar2;
                        d dVar = eVar.f10695f;
                        C0999a c0999a = eVar.f10697h;
                        if (dVar != d.f10687d) {
                            if (i4 == 1) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj = it.next();
                                        if (j.a(c0999a, ((C0902b) obj).f11789a)) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                if (obj == null) {
                                    S02.remove(aVar2);
                                }
                            }
                            if (i4 == 2 && c0999a != null) {
                                S02.set(S02.indexOf(aVar2), e.i(eVar, null, null, null, 0, null, null, null, null, null, 383));
                            }
                        }
                    }
                }
                aVar.i(S02);
            }
            C0952b c0952b2 = (C0952b) i0Var.f();
            if (c0952b2 != null) {
                h(a.l(this, c0952b2, list, null, 4));
            }
        }
    }
}
