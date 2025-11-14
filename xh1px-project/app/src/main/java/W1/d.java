package W1;

import G5.e;
import T1.A;
import T1.B;
import T1.C;
import T1.C0304c;
import T1.C0310i;
import T1.C0313l;
import T1.C0316o;
import T1.EnumC0305d;
import T1.EnumC0306e;
import T1.EnumC0307f;
import T1.H;
import T1.K;
import T1.N;
import T1.r;
import T1.t;
import T1.x;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a6.s;
import a8.j;
import a8.k;
import a8.u;
import b6.C0535c;
import h4.AbstractC0832f;
import i.AbstractC0863b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6496f;

    /* renamed from: g, reason: collision with root package name */
    public int f6497g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f6498h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6499i;
    public long j;

    public d() {
        super(10);
        this.f6496f = new ArrayList();
        this.f6498h = new LinkedHashMap();
        this.f6499i = new ArrayList();
        this.j = -1L;
    }

    @Override // G5.e
    public final C0304c e(u uVar) {
        return null;
    }

    @Override // G5.e
    public final C0304c g(u uVar) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // G5.e
    public final C0304c h(u uVar) {
        B b4;
        B b9;
        int intValue;
        Long m6 = AbstractC0863b.m(uVar, "id", true);
        if (m6 != null) {
            long longValue = m6.longValue();
            Long m8 = AbstractC0863b.m(uVar, "eventId", true);
            if (m8 != null) {
                long longValue2 = m8.longValue();
                int i4 = 0;
                Long m9 = AbstractC0863b.m(uVar, "toggleEventId", false);
                if (m9 != null) {
                    long longValue3 = m9.longValue();
                    String p8 = AbstractC0863b.p(uVar, "toggleEventType", false);
                    if (p8 != null) {
                        try {
                            b4 = B.valueOf(p8);
                        } catch (IllegalArgumentException unused) {
                            b4 = null;
                        }
                        b9 = b4;
                    } else {
                        b9 = null;
                    }
                    if (b9 != null) {
                        LinkedHashMap linkedHashMap = this.f6498h;
                        Object obj = linkedHashMap.get(m8);
                        if (obj == 0) {
                            linkedHashMap.put(m8, m6);
                        } else {
                            m6 = obj;
                        }
                        long longValue4 = m6.longValue();
                        long j = this.j - 1;
                        this.j = j;
                        this.f6499i.add(new A(j, longValue4, b9, longValue3));
                        if (longValue == longValue4) {
                            String p9 = AbstractC0863b.p(uVar, "name", false);
                            if (p9 == null) {
                                p9 = "";
                            }
                            String str = p9;
                            Integer i8 = AbstractC0863b.i(uVar, "priority", false);
                            if (i8 != null && (intValue = i8.intValue()) >= 0) {
                                i4 = intValue;
                            }
                            return new C0304c(longValue, longValue2, i4, str, EnumC0305d.f5586h, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, Boolean.FALSE, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -25165856, 31);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x018f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0131 A[SYNTHETIC] */
    @Override // G5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0316o i(u uVar) {
        s sVar;
        ArrayList<c> arrayList;
        c cVar;
        int i4;
        LinkedHashMap linkedHashMap;
        long j;
        ArrayList arrayList2;
        Object obj;
        this.f6496f.clear();
        this.f6497g = 0;
        LinkedHashMap linkedHashMap2 = this.f6498h;
        linkedHashMap2.clear();
        ArrayList arrayList3 = this.f6499i;
        arrayList3.clear();
        long j5 = -1;
        this.j = -1L;
        C0316o i8 = super.i(uVar);
        K k = i8.f5609a;
        List list = i8.f5610b;
        ArrayList arrayList4 = new ArrayList(AbstractC0438m.d0(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            sVar = s.f7766d;
            if (!hasNext) {
                break;
            }
            C0313l c0313l = (C0313l) it.next();
            x xVar = c0313l.f5604a;
            List<C0310i> list2 = c0313l.f5605b;
            long j8 = j5;
            Long l6 = (Long) linkedHashMap2.get(Long.valueOf(xVar.f5652a));
            if (l6 != null) {
                long longValue = l6.longValue();
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        linkedHashMap = linkedHashMap2;
                        if (longValue == ((C0310i) next).f5599a.f5558a) {
                            obj = next;
                            break;
                        }
                        linkedHashMap2 = linkedHashMap;
                    } else {
                        linkedHashMap = linkedHashMap2;
                        obj = null;
                        break;
                    }
                }
                C0310i c0310i = (C0310i) obj;
                if (c0310i != null) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        long j9 = j8;
                        C0313l c0313l2 = c0313l;
                        if (((A) next2).f5500b == longValue) {
                            arrayList5.add(next2);
                        }
                        c0313l = c0313l2;
                        j8 = j9;
                    }
                    C0313l c0313l3 = c0313l;
                    j = j8;
                    if (arrayList5.isEmpty()) {
                        c0313l = c0313l3;
                        arrayList2 = arrayList3;
                    } else {
                        x xVar2 = c0313l3.f5604a;
                        List list3 = c0313l3.f5606c;
                        ArrayList arrayList6 = new ArrayList(AbstractC0438m.d0(list2, 10));
                        for (C0310i c0310i2 : list2) {
                            ArrayList arrayList7 = arrayList3;
                            long j10 = longValue;
                            if (c0310i2.f5599a.f5558a == j10) {
                                c0310i2 = new C0310i(c0310i.f5599a, sVar, arrayList5);
                            }
                            arrayList6.add(c0310i2);
                            arrayList3 = arrayList7;
                            longValue = j10;
                        }
                        arrayList2 = arrayList3;
                        c0313l = new C0313l(xVar2, arrayList6, list3);
                    }
                    arrayList4.add(c0313l);
                    arrayList3 = arrayList2;
                    linkedHashMap2 = linkedHashMap;
                    j5 = j;
                }
            } else {
                linkedHashMap = linkedHashMap2;
            }
            arrayList2 = arrayList3;
            j = j8;
            arrayList4.add(c0313l);
            arrayList3 = arrayList2;
            linkedHashMap2 = linkedHashMap;
            j5 = j;
        }
        long j11 = j5;
        C0316o c0316o = new C0316o(k, arrayList4);
        a8.d k6 = AbstractC0863b.k(uVar, "endConditions");
        if (k6 != null) {
            ArrayList arrayList8 = new ArrayList();
            for (j jVar : k6.f8283d) {
                Long m6 = AbstractC0863b.m(k.d(jVar), "id", true);
                if (m6 != null) {
                    long longValue2 = m6.longValue();
                    Long m8 = AbstractC0863b.m(k.d(jVar), "scenarioId", true);
                    if (m8 != null) {
                        long longValue3 = m8.longValue();
                        Long m9 = AbstractC0863b.m(k.d(jVar), "eventId", true);
                        if (m9 != null) {
                            long longValue4 = m9.longValue();
                            Integer i9 = AbstractC0863b.i(k.d(jVar), "executions", false);
                            if (i9 != null) {
                                i4 = i9.intValue();
                            } else {
                                i4 = 1;
                            }
                            cVar = new c(i4, longValue2, longValue3, longValue4);
                            if (cVar == null) {
                                arrayList8.add(cVar);
                            }
                        }
                    }
                }
                cVar = null;
                if (cVar == null) {
                }
            }
            arrayList = arrayList8;
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList9 = new ArrayList();
            long j12 = this.j + j11;
            this.j = j12;
            x xVar3 = new x(j12, k.f5528a, "Stop scenario", this.f6497g, -1, true, C.f5508e, null);
            long j13 = this.j + j11;
            this.j = j13;
            C0304c c0304c = new C0304c(j13, j12, 0, "Stop scenario", EnumC0305d.f5586h, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, Boolean.TRUE, B.f5504e, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -25165856, 31);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (c cVar2 : arrayList) {
                String f8 = AbstractC1149a.f("Stop Scenario ", cVar2.f6494c);
                long j14 = this.j + j11;
                this.j = j14;
                arrayList9.add(new r(j14, j12, f8, T1.s.f5637e, 0, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, f8, t.f5645h, (T1.u) null, Integer.valueOf(cVar2.f6495d), (String) null, (Long) null, (Boolean) null, 30670816));
                Long valueOf = Long.valueOf(cVar2.f6494c);
                long j15 = this.j + j11;
                this.j = j15;
                linkedHashMap3.put(valueOf, new C0304c(j15, cVar2.f6494c, 10000, "Execution count", EnumC0305d.f5587i, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, f8, EnumC0306e.f5590d, (T1.u) null, (Integer) 1, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -369098784, 31));
            }
            C0535c i10 = E2.d.i();
            i10.add(new C0313l(xVar3, E2.d.y(new C0310i(c0304c, sVar, sVar)), arrayList9));
            List<C0313l> list4 = c0316o.f5610b;
            ArrayList arrayList10 = new ArrayList(AbstractC0438m.d0(list4, 10));
            for (C0313l c0313l4 : list4) {
                C0304c c0304c2 = (C0304c) linkedHashMap3.get(Long.valueOf(c0313l4.f5604a.f5652a));
                if (c0304c2 != null) {
                    x xVar4 = c0313l4.f5604a;
                    List list5 = c0313l4.f5606c;
                    ArrayList S02 = AbstractC0436k.S0(c0313l4.f5605b);
                    S02.add(new C0310i(c0304c2, sVar, sVar));
                    c0313l4 = new C0313l(xVar4, S02, list5);
                }
                arrayList10.add(c0313l4);
            }
            i10.addAll(arrayList10);
            return new C0316o(k, E2.d.f(i10));
        }
        return c0316o;
    }

    @Override // G5.e
    public final r j(u uVar) {
        return null;
    }

    @Override // G5.e
    public final r k(u uVar) {
        return null;
    }

    @Override // G5.e
    public final r l(u uVar) {
        return null;
    }

    @Override // G5.e
    public final T1.s m(u uVar) {
        return T1.s.f5638f;
    }

    @Override // G5.e
    public final C n(u uVar) {
        return C.f5507d;
    }

    @Override // G5.e
    public final K o(u uVar) {
        K o7 = super.o(uVar);
        if (o7 != null) {
            Integer i4 = AbstractC0863b.i(uVar, "endConditionOperator", false);
            int i8 = 1;
            if (i4 != null) {
                i8 = AbstractC0832f.f(i4.intValue(), 1, 2);
            }
            this.f6497g = i8;
            return o7;
        }
        return null;
    }
}
