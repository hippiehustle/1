package N3;

import Z3.C0373h;
import Z3.C0374i;
import Z3.C0376k;
import Z5.y;
import a6.AbstractC0436k;
import a6.s;
import android.content.Context;
import b6.C0535c;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import f2.n;
import f6.AbstractC0720j;
import j2.AbstractC0901a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k2.AbstractC0951a;
import k2.C0952b;
import k2.C0953c;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import l2.C1001a;
import n6.InterfaceC1165d;
import x3.C1787d;

/* loaded from: classes.dex */
public final class i extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3752h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3753i;
    public final /* synthetic */ Context j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3754l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Context context, InterfaceC0617c interfaceC0617c, int i4) {
        super(3, interfaceC0617c);
        this.f3752h = i4;
        this.f3754l = obj;
        this.j = context;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        switch (this.f3752h) {
            case 0:
                i iVar = new i((j) this.f3754l, this.j, (InterfaceC0617c) obj3, 0);
                iVar.k = (I3.a) obj;
                iVar.f3753i = (List) obj2;
                return iVar.v(y.f7506a);
            case 1:
                i iVar2 = new i((C0376k) this.f3754l, this.j, (InterfaceC0617c) obj3, 1);
                iVar2.f3753i = (List) obj;
                iVar2.k = (Map) obj2;
                return iVar2.v(y.f7506a);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                i iVar3 = new i((j4.l) this.f3754l, this.j, (InterfaceC0617c) obj3, 2);
                iVar3.k = (I3.a) obj;
                iVar3.f3753i = (List) obj2;
                return iVar3.v(y.f7506a);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                i iVar4 = new i((C1787d) this.f3754l, this.j, (InterfaceC0617c) obj3, 3);
                iVar4.k = (C1001a) obj;
                iVar4.f3753i = (C0999a) obj2;
                return iVar4.v(y.f7506a);
            default:
                i iVar5 = new i((C1787d) this.f3754l, this.j, (InterfaceC0617c) obj3, 4);
                iVar5.k = (p2.e) obj;
                iVar5.f3753i = (p2.e) obj2;
                return iVar5.v(y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        n nVar;
        Long l6;
        Long l8;
        C0999a c0999a;
        Long l9;
        Long l10;
        C0999a c0999a2;
        switch (this.f3752h) {
            case 0:
                I3.a aVar = (I3.a) this.k;
                List<f2.a> list = (List) this.f3753i;
                Z5.a.d(obj);
                AbstractC0951a abstractC0951a = (AbstractC0951a) aVar.f2086a;
                if (abstractC0951a == null) {
                    return s.f7766d;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (f2.a aVar2 : list) {
                    if (o6.j.a(abstractC0951a.getId(), aVar2.f())) {
                        arrayList.add(aVar2);
                    } else {
                        arrayList2.add(aVar2);
                    }
                }
                j jVar = (j) this.f3754l;
                C0535c i4 = E2.d.i();
                boolean isEmpty = arrayList.isEmpty();
                Context context = this.j;
                if (!isEmpty) {
                    i4.add(new f(R.string.list_header_copy_action_this));
                    i4.addAll(AbstractC0436k.L0(j.e(jVar, arrayList, context, abstractC0951a), new A0.i(5)));
                }
                if (!arrayList2.isEmpty()) {
                    i4.add(new f(R.string.list_header_copy_action_all));
                    i4.addAll(AbstractC0436k.L0(j.e(jVar, arrayList2, context, abstractC0951a), new A0.i(6)));
                }
                return E2.d.f(i4);
            case 1:
                List list2 = (List) this.f3753i;
                Map map = (Map) this.k;
                Z5.a.d(obj);
                C0376k c0376k = (C0376k) this.f3754l;
                C0535c i8 = E2.d.i();
                ArrayList arrayList3 = new ArrayList();
                Context context2 = this.j;
                String string = context2.getString(R.string.list_header_image_events);
                o6.j.d(string, "getString(...)");
                arrayList3.add(new C0373h(string));
                ArrayList arrayList4 = new ArrayList();
                String string2 = context2.getString(R.string.list_header_trigger_events);
                o6.j.d(string2, "getString(...)");
                arrayList4.add(new C0373h(string2));
                for (AbstractC0951a abstractC0951a2 : AbstractC0436k.L0(list2, new A0.i(16))) {
                    Z5.j jVar2 = (Z5.j) map.get(abstractC0951a2.getId());
                    if (jVar2 != null) {
                        nVar = (n) jVar2.f7486e;
                    } else {
                        nVar = null;
                    }
                    C0374i c0374i = new C0374i(abstractC0951a2.getId(), abstractC0951a2.k(), abstractC0951a2.g().size(), abstractC0951a2.i().size(), nVar);
                    if (abstractC0951a2 instanceof C0952b) {
                        arrayList3.add(c0374i);
                    } else if (abstractC0951a2 instanceof C0953c) {
                        arrayList4.add(c0374i);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                AbstractC0951a c6 = c0376k.f7385b.f1950e.c();
                if (c6 instanceof C0952b) {
                    if (arrayList3.size() > 1) {
                        i8.addAll(arrayList3);
                    }
                    if (arrayList4.size() > 1) {
                        i8.addAll(arrayList4);
                    }
                } else if (c6 instanceof C0953c) {
                    if (arrayList4.size() > 1) {
                        i8.addAll(arrayList4);
                    }
                    if (arrayList3.size() > 1) {
                        i8.addAll(arrayList3);
                    }
                } else if (c6 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return E2.d.f(i8);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                I3.a aVar3 = (I3.a) this.k;
                List<AbstractC0901a> list3 = (List) this.f3753i;
                Z5.a.d(obj);
                AbstractC0951a abstractC0951a3 = (AbstractC0951a) aVar3.f2086a;
                if (abstractC0951a3 == null) {
                    return s.f7766d;
                }
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (AbstractC0901a abstractC0901a : list3) {
                    if (o6.j.a(abstractC0951a3.getId(), abstractC0901a.f())) {
                        arrayList5.add(abstractC0901a);
                    } else {
                        arrayList6.add(abstractC0901a);
                    }
                }
                j4.l lVar = (j4.l) this.f3754l;
                C0535c i9 = E2.d.i();
                boolean isEmpty2 = arrayList5.isEmpty();
                Context context3 = this.j;
                if (!isEmpty2) {
                    i9.add(new j4.j(R.string.list_header_copy_conditions_this));
                    i9.addAll(AbstractC0436k.L0(j4.l.e(lVar, j4.l.f(lVar, arrayList5, context3)), new A0.i(19)));
                }
                if (!arrayList6.isEmpty()) {
                    i9.add(new j4.j(R.string.list_header_copy_conditions_all));
                    i9.addAll(AbstractC0436k.L0(j4.l.e(lVar, j4.l.f(lVar, arrayList6, context3)), new A0.i(20)));
                }
                return E2.d.f(i9);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                C1001a c1001a = (C1001a) this.k;
                C0999a c0999a3 = (C0999a) this.f3753i;
                Z5.a.d(obj);
                C1787d c1787d = (C1787d) this.f3754l;
                String str = null;
                if (c0999a3 != null) {
                    l6 = new Long(c0999a3.f12187a);
                } else {
                    l6 = null;
                }
                if (c1001a != null && (c0999a = c1001a.f12190a) != null) {
                    l8 = new Long(c0999a.f12187a);
                } else {
                    l8 = null;
                }
                if (c1001a != null) {
                    str = c1001a.f12191b;
                }
                return C1787d.a(c1787d, this.j, true, l6, l8, str);
            default:
                p2.e eVar = (p2.e) this.k;
                p2.e eVar2 = (p2.e) this.f3753i;
                Z5.a.d(obj);
                C1787d c1787d2 = (C1787d) this.f3754l;
                String str2 = null;
                if (eVar2 != null) {
                    l9 = new Long(eVar2.f13699a.f12187a);
                } else {
                    l9 = null;
                }
                if (eVar != null && (c0999a2 = eVar.f13699a) != null) {
                    l10 = new Long(c0999a2.f12187a);
                } else {
                    l10 = null;
                }
                if (eVar != null) {
                    str2 = eVar.f13700b;
                }
                return C1787d.a(c1787d2, this.j, false, l9, l10, str2);
        }
    }
}
