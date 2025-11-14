package X6;

import a6.AbstractC0436k;
import j2.AbstractC0901a;
import j2.C0905e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k2.AbstractC0951a;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7033a;

    public q(List list, List list2) {
        o6.j.e(list, "imageEvents");
        o6.j.e(list2, "triggerEvent");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = AbstractC0436k.C0(list, list2).iterator();
        while (it.hasNext()) {
            AbstractC0951a abstractC0951a = (AbstractC0951a) it.next();
            for (AbstractC0901a abstractC0901a : abstractC0951a.i()) {
                if (abstractC0901a instanceof C0905e) {
                    linkedHashMap.put(((C0905e) abstractC0901a).f11811d, 0);
                }
            }
            for (f2.a aVar : abstractC0951a.g()) {
                if (aVar instanceof f2.c) {
                    linkedHashMap.put(((f2.c) aVar).f10684e, 0);
                }
                if (aVar instanceof f2.h) {
                    f2.h hVar = (f2.h) aVar;
                    if (hVar.f10715e == f2.g.f10709e) {
                        linkedHashMap.put(hVar.f10717g, 0);
                    }
                }
            }
        }
        this.f7033a = linkedHashMap;
    }

    public q(int i4) {
        switch (i4) {
            case 1:
                this.f7033a = new LinkedHashMap((int) ((13 / 0.75f) + 1.0f));
                return;
            default:
                this.f7033a = new LinkedHashMap();
                return;
        }
    }
}
