package A6;

import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.O;
import C7.s;
import F6.AbstractC0061v;
import F6.C0060u;
import F6.N;
import F6.U;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n1.AbstractC1149a;
import w7.AbstractC1759v;
import w7.Q;

/* loaded from: classes.dex */
public final class f extends N {
    public f(InterfaceC0010k interfaceC0010k, f fVar, int i4, boolean z8) {
        super(interfaceC0010k, fVar, D6.i.f1043a, s.f828g, i4, O.f726a);
        this.f1593q = true;
        this.f1601y = z8;
        this.f1602z = false;
    }

    @Override // F6.N, F6.AbstractC0061v
    public final AbstractC0061v O0(int i4, InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, O o7, D6.j jVar, C0725e c0725e) {
        o6.j.e(interfaceC0010k, "newOwner");
        AbstractC1149a.l("kind", i4);
        o6.j.e(jVar, "annotations");
        return new f(interfaceC0010k, (f) interfaceC0019u, i4, this.f1601y);
    }

    @Override // F6.AbstractC0061v
    public final AbstractC0061v P0(C0060u c0060u) {
        C0725e c0725e;
        f fVar = (f) super.P0(c0060u);
        if (fVar == null) {
            return null;
        }
        List z02 = fVar.z0();
        o6.j.d(z02, "getValueParameters(...)");
        if (!z02.isEmpty()) {
            Iterator it = z02.iterator();
            while (it.hasNext()) {
                AbstractC1759v b4 = ((U) it.next()).b();
                o6.j.d(b4, "getType(...)");
                if (h4.g.i(b4) != null) {
                    List z03 = fVar.z0();
                    o6.j.d(z03, "getValueParameters(...)");
                    ArrayList arrayList = new ArrayList(AbstractC0438m.d0(z03, 10));
                    Iterator it2 = z03.iterator();
                    while (it2.hasNext()) {
                        AbstractC1759v b9 = ((U) it2.next()).b();
                        o6.j.d(b9, "getType(...)");
                        arrayList.add(h4.g.i(b9));
                    }
                    int size = fVar.z0().size() - arrayList.size();
                    boolean z8 = true;
                    if (size == 0) {
                        List z04 = fVar.z0();
                        o6.j.d(z04, "getValueParameters(...)");
                        ArrayList X02 = AbstractC0436k.X0(arrayList, z04);
                        if (!X02.isEmpty()) {
                            Iterator it3 = X02.iterator();
                            while (it3.hasNext()) {
                                Z5.j jVar = (Z5.j) it3.next();
                                if (!o6.j.a((C0725e) jVar.f7485d, ((U) jVar.f7486e).getName())) {
                                }
                            }
                            return fVar;
                        }
                        return fVar;
                    }
                    List<U> z05 = fVar.z0();
                    o6.j.d(z05, "getValueParameters(...)");
                    ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(z05, 10));
                    for (U u8 : z05) {
                        C0725e name = u8.getName();
                        o6.j.d(name, "getName(...)");
                        int i4 = u8.j;
                        int i8 = i4 - size;
                        if (i8 >= 0 && (c0725e = (C0725e) arrayList.get(i8)) != null) {
                            name = c0725e;
                        }
                        arrayList2.add(u8.M0(fVar, name, i4));
                    }
                    C0060u S02 = fVar.S0(Q.f15971b);
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (((C0725e) it4.next()) == null) {
                                break;
                            }
                        }
                    }
                    z8 = false;
                    S02.f1578y = Boolean.valueOf(z8);
                    S02.j = arrayList2;
                    S02.f1563h = fVar.a();
                    AbstractC0061v P02 = super.P0(S02);
                    o6.j.b(P02);
                    return P02;
                }
            }
            return fVar;
        }
        return fVar;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0019u
    public final boolean g() {
        return false;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0019u
    public final boolean i0() {
        return false;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0022x
    public final boolean z() {
        return false;
    }
}
