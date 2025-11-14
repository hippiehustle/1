package H3;

import b6.C0533a;
import b6.C0535c;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import i.AbstractC0862a;
import j2.AbstractC0901a;
import j2.C0902b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import k2.AbstractC0951a;
import k2.C0952b;
import k2.C0953c;
import n6.InterfaceC1166e;

/* loaded from: classes.dex */
public final class o extends AbstractC0720j implements InterfaceC1166e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1955h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ AbstractC0951a f1956i;
    public /* synthetic */ List j;
    public /* synthetic */ List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i4, InterfaceC0617c interfaceC0617c, int i8) {
        super(i4, interfaceC0617c);
        this.f1955h = i8;
    }

    @Override // n6.InterfaceC1166e
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC0951a abstractC0951a = (AbstractC0951a) obj;
        List list = (List) obj2;
        List list2 = (List) obj3;
        InterfaceC0617c interfaceC0617c = (InterfaceC0617c) obj4;
        switch (this.f1955h) {
            case 0:
                o oVar = new o(4, interfaceC0617c, 0);
                oVar.f1956i = abstractC0951a;
                oVar.j = list;
                oVar.k = list2;
                return oVar.v(Z5.y.f7506a);
            default:
                o oVar2 = new o(4, interfaceC0617c, 1);
                oVar2.f1956i = abstractC0951a;
                oVar2.j = list;
                oVar2.k = list2;
                return oVar2.v(Z5.y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        switch (this.f1955h) {
            case 0:
                AbstractC0951a abstractC0951a = this.f1956i;
                List<AbstractC0951a> list = this.j;
                List list2 = this.k;
                Z5.a.d(obj);
                C0535c i4 = E2.d.i();
                if (abstractC0951a != null) {
                    o6.j.e(list, "<this>");
                    C0535c i8 = E2.d.i();
                    for (f2.a aVar : abstractC0951a.g()) {
                        if (E2.d.Q(abstractC0951a, aVar)) {
                            i8.add(aVar);
                        }
                    }
                    for (AbstractC0951a abstractC0951a2 : list) {
                        if (!o6.j.a(abstractC0951a2.getId(), abstractC0951a.getId()) && abstractC0951a2.d()) {
                            for (f2.a aVar2 : abstractC0951a2.g()) {
                                if (E2.d.Q(abstractC0951a, aVar2)) {
                                    i8.add(aVar2);
                                }
                            }
                        }
                    }
                    C0535c f8 = E2.d.f(i8);
                    i4.addAll(f8);
                    o6.j.e(list2, "<this>");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        f2.a aVar3 = (f2.a) obj2;
                        if (aVar3.d() && !o6.j.a(aVar3.f(), abstractC0951a.getId()) && !AbstractC0862a.c(f8, aVar3.getId()) && (!(aVar3 instanceof f2.e) || ((f2.e) aVar3).f10695f != f2.d.f10688e)) {
                            if (!(aVar3 instanceof f2.o) || ((f2.o) aVar3).f10754e) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    i4.addAll(arrayList);
                }
                C0535c f9 = E2.d.f(i4);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                ListIterator listIterator = f9.listIterator(0);
                while (true) {
                    C0533a c0533a = (C0533a) listIterator;
                    if (c0533a.hasNext()) {
                        Object next = c0533a.next();
                        if (hashSet.add(new Integer(((f2.a) next).h()))) {
                            arrayList2.add(next);
                        }
                    } else {
                        return arrayList2;
                    }
                }
                break;
            default:
                AbstractC0951a abstractC0951a3 = this.f1956i;
                List<AbstractC0951a> list3 = this.j;
                List list4 = this.k;
                Z5.a.d(obj);
                if (abstractC0951a3 == null) {
                    return a6.s.f7766d;
                }
                C0535c i9 = E2.d.i();
                o6.j.e(list3, "<this>");
                C0535c i10 = E2.d.i();
                for (AbstractC0901a abstractC0901a : abstractC0951a3.i()) {
                    if (abstractC0901a.d()) {
                        i10.add(abstractC0901a);
                    }
                }
                for (AbstractC0951a abstractC0951a4 : list3) {
                    if (!o6.j.a(abstractC0951a4.getId(), abstractC0951a3.getId()) && abstractC0951a4.getClass() == abstractC0951a3.getClass() && abstractC0951a3.d()) {
                        for (AbstractC0901a abstractC0901a2 : abstractC0951a4.i()) {
                            if (abstractC0901a2.d()) {
                                i10.add(abstractC0901a2);
                            }
                        }
                    }
                }
                C0535c f10 = E2.d.f(i10);
                i9.addAll(f10);
                o6.j.e(list4, "<this>");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list4) {
                    AbstractC0901a abstractC0901a3 = (AbstractC0901a) obj3;
                    if (abstractC0901a3.d() && !o6.j.a(abstractC0901a3.f(), abstractC0951a3.getId()) && !AbstractC0862a.c(f10, abstractC0901a3.getId()) && (((abstractC0951a3 instanceof C0952b) && (abstractC0901a3 instanceof C0902b)) || ((abstractC0951a3 instanceof C0953c) && (abstractC0901a3 instanceof j2.g)))) {
                        arrayList3.add(obj3);
                    }
                }
                i9.addAll(arrayList3);
                C0535c f11 = E2.d.f(i9);
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                ListIterator listIterator2 = f11.listIterator(0);
                while (true) {
                    C0533a c0533a2 = (C0533a) listIterator2;
                    if (c0533a2.hasNext()) {
                        Object next2 = c0533a2.next();
                        if (hashSet2.add(new Integer(((AbstractC0901a) next2).h()))) {
                            arrayList4.add(next2);
                        }
                    } else {
                        return arrayList4;
                    }
                }
                break;
        }
    }
}
