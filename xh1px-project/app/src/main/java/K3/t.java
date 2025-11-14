package K3;

import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import android.content.Context;
import b6.C0535c;
import b6.C0541i;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import e2.AbstractC0640c;
import e2.C0638a;
import f6.AbstractC0720j;
import j2.AbstractC0901a;
import j2.C0905e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k2.AbstractC0951a;
import l1.C0999a;
import l2.C1001a;
import n6.InterfaceC1165d;
import q4.X;

/* loaded from: classes.dex */
public final class t extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2710h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2711i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, InterfaceC0617c interfaceC0617c, int i4) {
        super(3, interfaceC0617c);
        this.f2710h = i4;
        this.k = obj;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        switch (this.f2710h) {
            case 0:
                t tVar = new t((Context) this.k, (InterfaceC0617c) obj3, 0);
                tVar.j = (AbstractC0951a) obj;
                tVar.f2711i = (I3.b) obj2;
                return tVar.v(Z5.y.f7506a);
            case 1:
                t tVar2 = new t((c4.h) this.k, (InterfaceC0617c) obj3, 1);
                tVar2.j = (List) obj;
                tVar2.f2711i = (I3.b) obj2;
                return tVar2.v(Z5.y.f7506a);
            default:
                t tVar3 = new t((r4.n) this.k, (InterfaceC0617c) obj3, 2);
                tVar3.j = (I3.a) obj;
                tVar3.f2711i = (List) obj2;
                return tVar3.v(Z5.y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        C0999a c0999a;
        switch (this.f2710h) {
            case 0:
                AbstractC0951a abstractC0951a = (AbstractC0951a) this.j;
                I3.b bVar = (I3.b) this.f2711i;
                Z5.a.d(obj);
                Iterable iterable = bVar.f2089a;
                if (iterable == null) {
                    iterable = a6.s.f7766d;
                }
                Context context = (Context) this.k;
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(iterable, 10));
                int i4 = 0;
                for (Object obj2 : iterable) {
                    int i8 = i4 + 1;
                    if (i4 >= 0) {
                        f2.a aVar = (f2.a) obj2;
                        arrayList.add(new G1.a(aVar.getId(), D2.f.M(aVar, context, abstractC0951a, !((Boolean) bVar.f2090b.get(i4)).booleanValue())));
                        i4 = i8;
                    } else {
                        AbstractC0437l.c0();
                        throw null;
                    }
                }
                return arrayList;
            case 1:
                List<AbstractC0951a> list = (List) this.j;
                I3.b bVar2 = (I3.b) this.f2711i;
                Z5.a.d(obj);
                c4.h hVar = (c4.h) this.k;
                C0541i c0541i = new C0541i();
                for (AbstractC0951a abstractC0951a2 : list) {
                    for (AbstractC0901a abstractC0901a : abstractC0951a2.i()) {
                        if (abstractC0901a instanceof C0905e) {
                            C0905e c0905e = (C0905e) abstractC0901a;
                            c0541i.add(c0905e.f11811d);
                            AbstractC0640c abstractC0640c = c0905e.f11813f;
                            if (abstractC0640c instanceof C0638a) {
                                c0541i.add(abstractC0640c.a().toString());
                            }
                        }
                    }
                    Iterator it = abstractC0951a2.g().iterator();
                    while (it.hasNext()) {
                        Set e9 = c4.h.e(hVar, (f2.a) it.next());
                        if (e9 != null) {
                            c0541i.addAll(e9);
                        }
                    }
                }
                List list2 = bVar2.f2089a;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        Set e10 = c4.h.e(hVar, (f2.a) it2.next());
                        if (e10 != null) {
                            c0541i.addAll(e10);
                        }
                    }
                }
                return X.j(c0541i);
            default:
                I3.a aVar2 = (I3.a) this.j;
                List<AbstractC0951a> list3 = (List) this.f2711i;
                Z5.a.d(obj);
                C1001a c1001a = (C1001a) aVar2.f2086a;
                if (c1001a != null && (c0999a = c1001a.f12190a) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (AbstractC0951a abstractC0951a3 : list3) {
                        if (o6.j.a(abstractC0951a3.l(), c0999a)) {
                            arrayList2.add(abstractC0951a3);
                        } else {
                            arrayList3.add(abstractC0951a3);
                        }
                    }
                    r4.n nVar = (r4.n) this.k;
                    C0535c i9 = E2.d.i();
                    if (!arrayList2.isEmpty()) {
                        i9.add(new r4.j(R.string.list_header_copy_event_this));
                        i9.addAll(AbstractC0436k.L0(r4.n.e(nVar, arrayList2), new A0.i(25)));
                    }
                    if (!arrayList3.isEmpty()) {
                        i9.add(new r4.j(R.string.list_header_copy_event_all));
                        i9.addAll(AbstractC0436k.L0(r4.n.e(nVar, arrayList3), new A0.i(26)));
                    }
                    return E2.d.f(i9);
                }
                return a6.s.f7766d;
        }
    }
}
