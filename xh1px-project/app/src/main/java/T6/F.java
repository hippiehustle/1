package T6;

import C6.InterfaceC0011l;
import F6.AbstractC0043c;
import P6.EnumC0278a;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import f7.C0725e;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.S;
import w7.U;
import w7.X;

/* loaded from: classes.dex */
public final class F extends AbstractC0043c {

    /* renamed from: o, reason: collision with root package name */
    public final A4.a f5809o;

    /* renamed from: p, reason: collision with root package name */
    public final I6.C f5810p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(A4.a aVar, I6.C c6, int i4, InterfaceC0011l interfaceC0011l) {
        super(r0.f5398a, interfaceC0011l, new S6.c(aVar, c6, false), C0725e.e(c6.f2177a.getName()), X.INVARIANT, false, i4, r0.f5408m);
        o6.j.e(c6, "javaTypeParameter");
        S6.a aVar2 = (S6.a) aVar.f280e;
        this.f5809o = aVar;
        this.f5810p = c6;
    }

    @Override // F6.AbstractC0049i
    public final List M0(List list) {
        X6.d dVar;
        AbstractC1759v abstractC1759v;
        AbstractC1759v b4;
        A4.a aVar = this.f5809o;
        X6.d dVar2 = ((S6.a) aVar.f280e).f5413r;
        dVar2.getClass();
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1759v abstractC1759v2 = (AbstractC1759v) it.next();
            X6.o oVar = X6.o.f7027g;
            o6.j.e(abstractC1759v2, "<this>");
            if (U.c(abstractC1759v2, oVar, null)) {
                dVar = dVar2;
                abstractC1759v = abstractC1759v2;
            } else {
                dVar = dVar2;
                abstractC1759v = abstractC1759v2;
                b4 = dVar.b(new X6.r(this, false, aVar, EnumC0278a.f4547i, false), abstractC1759v, a6.s.f7766d, null, false);
                if (b4 != null) {
                    arrayList.add(b4);
                    dVar2 = dVar;
                }
            }
            b4 = abstractC1759v;
            arrayList.add(b4);
            dVar2 = dVar;
        }
        return arrayList;
    }

    @Override // F6.AbstractC0049i
    public final List N0() {
        Type type;
        Type[] bounds = this.f5810p.f2177a.getBounds();
        o6.j.d(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type2 : bounds) {
            arrayList.add(new I6.q(type2));
        }
        I6.q qVar = (I6.q) AbstractC0436k.I0(arrayList);
        if (qVar != null) {
            type = qVar.f2210a;
        } else {
            type = null;
        }
        List list = arrayList;
        if (o6.j.a(type, Object.class)) {
            list = a6.s.f7766d;
        }
        boolean isEmpty = list.isEmpty();
        A4.a aVar = this.f5809o;
        if (isEmpty) {
            return E2.d.y(AbstractC1741c.e(((S6.a) aVar.f280e).f5410o.o().e(), ((S6.a) aVar.f280e).f5410o.o().p()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((R.g) aVar.f283h).R((I6.q) it.next(), AbstractC0405a.D0(S.f15974e, false, this, 3)));
        }
        return arrayList2;
    }
}
