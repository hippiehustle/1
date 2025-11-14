package z6;

import C6.F;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import F6.E;
import a6.AbstractC0436k;
import a6.x;
import f7.C0722b;
import f7.C0725e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import w7.AbstractC1759v;
import w7.U;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f16819a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f16820b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f16821c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f16822d;

    static {
        q[] values = q.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (q qVar : values) {
            arrayList.add(qVar.f16817e);
        }
        f16819a = AbstractC0436k.V0(arrayList);
        p[] values2 = p.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (p pVar : values2) {
            arrayList2.add(pVar.f16814d);
        }
        AbstractC0436k.V0(arrayList2);
        f16820b = new HashMap();
        f16821c = new HashMap();
        x.Q0(new HashMap(x.N0(4)), new Z5.j[]{new Z5.j(p.UBYTEARRAY, C0725e.e("ubyteArrayOf")), new Z5.j(p.USHORTARRAY, C0725e.e("ushortArrayOf")), new Z5.j(p.UINTARRAY, C0725e.e("uintArrayOf")), new Z5.j(p.ULONGARRAY, C0725e.e("ulongArrayOf"))});
        q[] values3 = q.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (q qVar2 : values3) {
            linkedHashSet.add(qVar2.f16818f.f());
        }
        f16822d = linkedHashSet;
        for (q qVar3 : q.values()) {
            HashMap hashMap = f16820b;
            C0722b c0722b = qVar3.f16818f;
            C0722b c0722b2 = qVar3.f16816d;
            hashMap.put(c0722b, c0722b2);
            f16821c.put(c0722b2, qVar3.f16818f);
        }
    }

    public static final boolean a(AbstractC1759v abstractC1759v) {
        InterfaceC0007h c6;
        if (!U.l(abstractC1759v) && (c6 = abstractC1759v.B0().c()) != null) {
            InterfaceC0010k q6 = c6.q();
            if ((q6 instanceof F) && o6.j.a(((E) ((F) q6)).f1461i, n.k) && f16819a.contains(c6.getName())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
