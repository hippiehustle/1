package X6;

import a6.AbstractC0438m;
import a6.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import n7.EnumC1170c;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f7030a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7031b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Z5.j f7032c = new Z5.j("V", null);

    public p(R3.r rVar, String str, String str2) {
        this.f7030a = str2;
    }

    public final void a(String str, e... eVarArr) {
        t tVar;
        o6.j.e(str, "type");
        if (eVarArr.length == 0) {
            tVar = null;
        } else {
            H7.q qVar = new H7.q(3, new B0.e(14, eVarArr));
            int N02 = x.N0(AbstractC0438m.d0(qVar, 10));
            if (N02 < 16) {
                N02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(N02);
            Iterator it = qVar.iterator();
            while (true) {
                H7.b bVar = (H7.b) it;
                if (!bVar.f2047e.hasNext()) {
                    break;
                }
                a6.v vVar = (a6.v) bVar.next();
                linkedHashMap.put(Integer.valueOf(vVar.f7769a), (e) vVar.f7770b);
            }
            tVar = new t(linkedHashMap);
        }
        this.f7031b.add(new Z5.j(str, tVar));
    }

    public final void b(String str, e... eVarArr) {
        o6.j.e(str, "type");
        H7.q qVar = new H7.q(3, new B0.e(14, eVarArr));
        int N02 = x.N0(AbstractC0438m.d0(qVar, 10));
        if (N02 < 16) {
            N02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(N02);
        Iterator it = qVar.iterator();
        while (true) {
            H7.b bVar = (H7.b) it;
            if (bVar.f2047e.hasNext()) {
                a6.v vVar = (a6.v) bVar.next();
                linkedHashMap.put(Integer.valueOf(vVar.f7769a), (e) vVar.f7770b);
            } else {
                this.f7032c = new Z5.j(str, new t(linkedHashMap));
                return;
            }
        }
    }

    public final void c(EnumC1170c enumC1170c) {
        o6.j.e(enumC1170c, "type");
        String c6 = enumC1170c.c();
        o6.j.d(c6, "getDesc(...)");
        this.f7032c = new Z5.j(c6, null);
    }
}
