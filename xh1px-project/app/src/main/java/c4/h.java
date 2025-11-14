package c4;

import H3.n;
import H3.y;
import K3.t;
import androidx.lifecycle.Z;
import b6.C0541i;
import e2.AbstractC0640c;
import e2.C0638a;
import java.util.Set;
import o6.j;
import q4.X;

/* loaded from: classes.dex */
public final class h extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final A4.c f9664b;

    public h(n nVar) {
        j.e(nVar, "editionRepository");
        y yVar = nVar.f1950e;
        this.f9664b = new A4.c(yVar.f1985f, yVar.f1989l, new t(this, null, 1), 27);
    }

    public static final Set e(h hVar, f2.a aVar) {
        if (aVar instanceof f2.c) {
            C0541i c0541i = new C0541i();
            f2.c cVar = (f2.c) aVar;
            c0541i.add(cVar.f10684e);
            AbstractC0640c abstractC0640c = cVar.f10686g;
            if (abstractC0640c instanceof C0638a) {
                c0541i.add(abstractC0640c.a().toString());
            }
            return X.j(c0541i);
        }
        if (aVar instanceof f2.h) {
            f2.h hVar2 = (f2.h) aVar;
            if (hVar2.f10715e == f2.g.f10709e) {
                return X.T(hVar2.f10717g);
            }
            return null;
        }
        return null;
    }
}
