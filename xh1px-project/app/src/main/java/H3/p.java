package H3;

import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.C0952b;
import k2.C0953c;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class p extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1957h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ I3.b f1958i;
    public /* synthetic */ List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i4, InterfaceC0617c interfaceC0617c, int i8) {
        super(i4, interfaceC0617c);
        this.f1957h = i8;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        I3.b bVar = (I3.b) obj;
        List list = (List) obj2;
        InterfaceC0617c interfaceC0617c = (InterfaceC0617c) obj3;
        switch (this.f1957h) {
            case 0:
                p pVar = new p(3, interfaceC0617c, 0);
                pVar.f1958i = bVar;
                pVar.j = list;
                return pVar.v(Z5.y.f7506a);
            default:
                p pVar2 = new p(3, interfaceC0617c, 1);
                pVar2.f1958i = bVar;
                pVar2.j = list;
                return pVar2.v(Z5.y.f7506a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [b6.c] */
    /* JADX WARN: Type inference failed for: r10v3, types: [b6.c] */
    /* JADX WARN: Type inference failed for: r2v0, types: [a6.s] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a6.s] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        ?? r22;
        Object obj2;
        ?? r23;
        Object obj3;
        switch (this.f1957h) {
            case 0:
                I3.b bVar = this.f1958i;
                List list = this.j;
                Z5.a.d(obj);
                ?? i4 = E2.d.i();
                List list2 = bVar.f2089a;
                if (list2 != null) {
                    r22 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (((C0952b) obj4).d()) {
                            r22.add(obj4);
                        }
                    }
                } else {
                    r22 = a6.s.f7766d;
                }
                i4.addAll(r22);
                o6.j.e(list, "<this>");
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    C0952b c0952b = (C0952b) obj5;
                    if (c0952b.d()) {
                        Iterator it = r22.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((C0952b) obj2).f11959a.equals(c0952b.f11959a)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 == null) {
                            arrayList.add(obj5);
                        }
                    }
                }
                i4.addAll(arrayList);
                return E2.d.f(i4);
            default:
                I3.b bVar2 = this.f1958i;
                List list3 = this.j;
                Z5.a.d(obj);
                ?? i8 = E2.d.i();
                List list4 = bVar2.f2089a;
                if (list4 != null) {
                    r23 = new ArrayList();
                    for (Object obj6 : list4) {
                        if (((C0953c) obj6).d()) {
                            r23.add(obj6);
                        }
                    }
                } else {
                    r23 = a6.s.f7766d;
                }
                i8.addAll(r23);
                o6.j.e(list3, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj7 : list3) {
                    C0953c c0953c = (C0953c) obj7;
                    if (c0953c.d()) {
                        Iterator it2 = r23.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                if (o6.j.a(((C0953c) obj3).f11968a, c0953c.f11968a)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        if (obj3 == null) {
                            arrayList2.add(obj7);
                        }
                    }
                }
                i8.addAll(arrayList2);
                return E2.d.f(i8);
        }
    }
}
