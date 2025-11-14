package D3;

import a6.s;
import b6.C0535c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m1.InterfaceC1053c;
import n6.InterfaceC1165d;
import o6.C1282a;
import o6.j;

/* loaded from: classes.dex */
public final /* synthetic */ class a extends C1282a implements InterfaceC1165d {
    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Collection collection = (List) obj;
        InterfaceC1053c interfaceC1053c = (InterfaceC1053c) obj2;
        ((d) this.f13621d).getClass();
        C0535c i4 = E2.d.i();
        if (collection == null) {
            collection = s.f7766d;
        }
        i4.addAll(collection);
        if (interfaceC1053c != null) {
            Iterator it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj4 = it.next();
                    if (j.a(interfaceC1053c.getId(), ((InterfaceC1053c) obj4).getId())) {
                        break;
                    }
                } else {
                    obj4 = null;
                    break;
                }
            }
            if (obj4 == null) {
                i4.add(interfaceC1053c);
            }
        }
        return E2.d.f(i4);
    }
}
