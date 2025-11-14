package g3;

import A0.i;
import Z5.y;
import a6.AbstractC0436k;
import a6.s;
import b6.C0535c;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.List;
import k3.C0959f;
import k3.C0960g;
import n6.InterfaceC1165d;
import o6.j;

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0778a extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11137h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ List f11138i;
    public /* synthetic */ p2.e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0778a(int i4, InterfaceC0617c interfaceC0617c, int i8) {
        super(i4, interfaceC0617c);
        this.f11137h = i8;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        switch (this.f11137h) {
            case 0:
                C0778a c0778a = new C0778a(3, (InterfaceC0617c) obj3, 0);
                c0778a.j = (p2.e) obj;
                c0778a.f11138i = (List) obj2;
                return c0778a.v(y.f7506a);
            default:
                C0778a c0778a2 = new C0778a(3, (InterfaceC0617c) obj3, 1);
                c0778a2.f11138i = (List) obj;
                c0778a2.j = (p2.e) obj2;
                return c0778a2.v(y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        switch (this.f11137h) {
            case 0:
                p2.e eVar = this.j;
                List list = this.f11138i;
                Z5.a.d(obj);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(eVar.f13701c);
                arrayList.addAll(list);
                return arrayList;
            default:
                List<C0959f> list2 = this.f11138i;
                p2.e eVar2 = this.j;
                Z5.a.d(obj);
                if (eVar2 == null) {
                    return s.f7766d;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (C0959f c0959f : list2) {
                    if (j.a(c0959f.f11988a.f12003f.g(), eVar2.f13699a)) {
                        arrayList2.add(c0959f);
                    } else {
                        arrayList3.add(c0959f);
                    }
                }
                C0535c i4 = E2.d.i();
                if (!arrayList2.isEmpty()) {
                    i4.add(new C0960g(R.string.list_header_copy_dumb_action_this));
                    i4.addAll(AbstractC0436k.L0(arrayList2, new i(21)));
                }
                if (!arrayList3.isEmpty()) {
                    i4.add(new C0960g(R.string.list_header_copy_dumb_action_all));
                    i4.addAll(AbstractC0436k.L0(arrayList3, new i(22)));
                }
                return E2.d.f(i4);
        }
    }
}
