package B6;

import C6.I;
import F6.B;
import F6.C;
import F6.C0053m;
import F6.y;
import a6.AbstractC0438m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class i implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f483d;

    /* renamed from: e, reason: collision with root package name */
    public final C f484e;

    public /* synthetic */ i(C c6, int i4) {
        this.f483d = i4;
        this.f484e = c6;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f483d) {
            case 0:
                return new k(this.f484e);
            case 1:
                C c6 = this.f484e;
                B b4 = c6.k;
                if (b4 != null) {
                    List list = b4.f1448a;
                    c6.L0();
                    list.contains(c6);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C) it.next()).getClass();
                    }
                    ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        I i4 = ((C) it2.next()).f1452l;
                        o6.j.b(i4);
                        arrayList.add(i4);
                    }
                    return new C0053m("CompositeProvider@ModuleDescriptor for " + c6.getName(), arrayList);
                }
                StringBuilder sb = new StringBuilder("Dependencies of module ");
                String str = c6.getName().f10804d;
                o6.j.d(str, "toString(...)");
                sb.append(str);
                sb.append(" were not set before querying module content");
                throw new AssertionError(sb.toString());
            default:
                return ((y) this.f484e.U(z6.n.f16801i)).k;
        }
    }
}
