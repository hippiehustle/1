package E3;

import A1.e;
import D3.d;
import O7.g0;
import O7.i0;
import a6.AbstractC0438m;
import a6.s;
import f2.o;
import i2.C0880a;
import java.util.ArrayList;
import java.util.List;
import k2.AbstractC0951a;
import m1.InterfaceC1051a;
import n6.InterfaceC1163b;
import o6.i;
import o6.j;

/* loaded from: classes.dex */
public abstract class a extends d {
    public final i k;

    /* renamed from: l */
    public final d f1192l;

    /* renamed from: m */
    public final C3.a f1193m;

    /* JADX WARN: Multi-variable type inference failed */
    public a(InterfaceC1163b interfaceC1163b, i0 i0Var) {
        super((e) null, i0Var, 1);
        this.k = (i) interfaceC1163b;
        int i4 = 0;
        int i8 = 0;
        this.f1192l = new d((InterfaceC1163b) new e(1, this, a.class, "onEditedEventConditionsUpdated", "onEditedEventConditionsUpdated(Ljava/util/List;)V", i8, i4, 9), false, (g0) this.f894h);
        this.f1193m = new C3.a(new e(1, this, a.class, "onEditedEventActionsUpdated", "onEditedEventActionsUpdated(Ljava/util/List;)V", i8, i4, 8), this.f894h);
    }

    public static /* synthetic */ AbstractC0951a l(a aVar, AbstractC0951a abstractC0951a, List list, List list2, int i4) {
        if ((i4 & 2) != 0) {
            list = abstractC0951a.i();
            if (list == null) {
                list = null;
            }
            if (list == null) {
                list = s.f7766d;
            }
        }
        if ((i4 & 4) != 0) {
            list2 = abstractC0951a.g();
        }
        return aVar.k(abstractC0951a, list, list2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o6.i, n6.b] */
    @Override // D3.d
    public final void a() {
        AbstractC0951a abstractC0951a = (AbstractC0951a) this.f894h.f();
        if (abstractC0951a == null) {
            return;
        }
        this.k.m(abstractC0951a);
        super.a();
    }

    @Override // D3.d
    public final void g() {
        this.f1193m.f();
        this.f1192l.f();
        super.g();
    }

    public abstract AbstractC0951a k(AbstractC0951a abstractC0951a, List list, List list2);

    public final void m(AbstractC0951a abstractC0951a) {
        j.e(abstractC0951a, "event");
        List<AbstractC0951a> list = (List) this.f890d.f();
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC0951a abstractC0951a2 : list) {
            AbstractC0951a abstractC0951a3 = null;
            if (!j.a(abstractC0951a2.getId(), abstractC0951a.getId())) {
                List<InterfaceC1051a> g8 = abstractC0951a2.g();
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(g8, 10));
                for (InterfaceC1051a interfaceC1051a : g8) {
                    if (interfaceC1051a instanceof o) {
                        o oVar = (o) interfaceC1051a;
                        List<C0880a> list2 = oVar.f10756g;
                        ArrayList arrayList3 = new ArrayList();
                        for (C0880a c0880a : list2) {
                            if (j.a(c0880a.f11755c, abstractC0951a.getId())) {
                                c0880a = null;
                            }
                            if (c0880a != null) {
                                arrayList3.add(c0880a);
                            }
                        }
                        interfaceC1051a = o.i(oVar, null, null, null, 0, false, null, arrayList3, 63);
                    }
                    arrayList2.add(interfaceC1051a);
                }
                abstractC0951a3 = l(this, abstractC0951a2, null, arrayList2, 2);
            }
            if (abstractC0951a3 != null) {
                arrayList.add(abstractC0951a3);
            }
        }
        i(arrayList);
    }

    public abstract void n(List list);

    public final void o(AbstractC0951a abstractC0951a) {
        j.e(abstractC0951a, "item");
        super.e(abstractC0951a);
        List i4 = abstractC0951a.i();
        if (i4 == null) {
            i4 = null;
        }
        if (i4 == null) {
            i4 = s.f7766d;
        }
        this.f1192l.d(i4);
        this.f1193m.d(abstractC0951a.g());
    }
}
