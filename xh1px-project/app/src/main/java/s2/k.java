package s2;

import b6.C0535c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import v2.InterfaceC1661a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14473a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public Boolean f14474b;

    public final C0535c a() {
        C0535c i4 = E2.d.i();
        Iterator it = this.f14473a.entrySet().iterator();
        while (it.hasNext()) {
            i4.add((InterfaceC1661a) ((Map.Entry) it.next()).getValue());
        }
        return E2.d.f(i4);
    }

    public final p b() {
        Object obj;
        Iterator it = this.f14473a.values().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                InterfaceC1661a interfaceC1661a = (InterfaceC1661a) obj;
                if (interfaceC1661a instanceof p) {
                    p pVar = (p) interfaceC1661a;
                    if (pVar.f14493a && pVar.f14495c.f11797i) {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        return (p) obj;
    }
}
