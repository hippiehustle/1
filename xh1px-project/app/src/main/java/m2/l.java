package m2;

import F4.r;
import S1.C0290a;
import Z5.y;
import a6.AbstractC0438m;
import android.util.Log;
import com.buzbuz.smartautoclicker.core.dumb.data.database.DumbDatabase;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import h4.AbstractC0832f;
import i.AbstractC0863b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k4.I;
import n2.C1155c;
import n2.m;
import n2.p;
import n2.s;
import n6.InterfaceC1163b;
import u0.u;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final n2.j f12410a;

    /* renamed from: b, reason: collision with root package name */
    public final R.g f12411b;

    /* renamed from: c, reason: collision with root package name */
    public final r f12412c;

    public l(DumbDatabase dumbDatabase) {
        o6.j.e(dumbDatabase, "database");
        n2.j o7 = dumbDatabase.o();
        this.f12410a = o7;
        this.f12411b = new R.g(10);
        this.f12412c = new r(AbstractC0863b.c(o7.f12901a, true, new String[]{"dumb_action_table", "dumb_scenario_stats_table", "dumb_scenario_table"}, new A1.h(26, o7)), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        if (r2.g(r8, r1, r3) != r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(p2.e eVar, AbstractC0713c abstractC0713c) {
        C1055a c1055a;
        int i4;
        Object obj;
        l lVar;
        p2.e eVar2 = eVar;
        if (abstractC0713c instanceof C1055a) {
            c1055a = (C1055a) abstractC0713c;
            int i8 = c1055a.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1055a.k = i8 - Integer.MIN_VALUE;
                Object obj2 = c1055a.f12380i;
                i4 = c1055a.k;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj2);
                            return y.f7506a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l lVar2 = c1055a.f12379h;
                    p2.e eVar3 = c1055a.f12378g;
                    Z5.a.d(obj2);
                    lVar = lVar2;
                    eVar2 = eVar3;
                    obj = obj2;
                } else {
                    Z5.a.d(obj2);
                    Objects.toString(eVar2);
                    o6.j.e(eVar2, "<this>");
                    m mVar = new m(eVar2.f13699a.f12187a, eVar2.f13700b, eVar2.f13702d, eVar2.f13703e, eVar2.f13704f, eVar2.f13705g, eVar2.f13706h);
                    c1055a.f12378g = eVar2;
                    c1055a.f12379h = this;
                    c1055a.k = 1;
                    n2.j jVar = this.f12410a;
                    Object C8 = D2.f.C(c1055a, new n2.e(jVar, mVar, 1), jVar.f12901a, false, true);
                    if (C8 != enumC0646a) {
                        obj = C8;
                        lVar = this;
                    }
                    return enumC0646a;
                }
                long longValue = ((Number) obj).longValue();
                List list = eVar2.f13701c;
                c1055a.f12378g = null;
                c1055a.f12379h = null;
                c1055a.k = 2;
            }
        }
        c1055a = new C1055a(this, abstractC0713c);
        Object obj22 = c1055a.f12380i;
        i4 = c1055a.k;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        long longValue2 = ((Number) obj).longValue();
        List list2 = eVar2.f13701c;
        c1055a.f12378g = null;
        c1055a.f12379h = null;
        c1055a.k = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r11 == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r11 == r4) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, String str, AbstractC0713c abstractC0713c) {
        b bVar;
        int i4;
        s sVar;
        if (abstractC0713c instanceof b) {
            bVar = (b) abstractC0713c;
            int i8 = bVar.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.k = i8 - Integer.MIN_VALUE;
                Object obj = bVar.f12383i;
                i4 = bVar.k;
                Object obj2 = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj);
                            return (Long) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = bVar.f12381g;
                    str = bVar.f12382h;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    bVar.f12382h = str;
                    bVar.f12381g = j;
                    bVar.k = 1;
                    n2.j jVar = this.f12410a;
                    obj = D2.f.C(bVar, new n2.h(j, jVar, 2), jVar.f12901a, true, true);
                }
                sVar = (s) obj;
                if (sVar != null) {
                    return null;
                }
                bVar.f12382h = null;
                bVar.f12381g = j;
                bVar.k = 2;
                obj = c(sVar, str, bVar);
            }
        }
        bVar = new b(this, abstractC0713c);
        Object obj3 = bVar.f12383i;
        i4 = bVar.k;
        Object obj22 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        sVar = (s) obj3;
        if (sVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[Catch: Exception -> 0x0037, LOOP:0: B:22:0x00a2->B:24:0x00a8, LOOP_END, TryCatch #0 {Exception -> 0x0037, blocks: (B:12:0x0032, B:13:0x00cc, B:20:0x0044, B:21:0x008b, B:22:0x00a2, B:24:0x00a8, B:26:0x00b6, B:31:0x0050, B:33:0x0054, B:34:0x005a), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(s sVar, String str, AbstractC0713c abstractC0713c) {
        c cVar;
        int i4;
        n2.j jVar;
        EnumC0646a enumC0646a;
        String str2;
        ArrayList arrayList;
        Iterator it;
        long j;
        s sVar2 = sVar;
        try {
            if (abstractC0713c instanceof c) {
                cVar = (c) abstractC0713c;
                int i8 = cVar.k;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    cVar.k = i8 - Integer.MIN_VALUE;
                    Object obj = cVar.f12386i;
                    i4 = cVar.k;
                    jVar = this.f12410a;
                    enumC0646a = EnumC0646a.f10656d;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                j = cVar.f12385h;
                                Z5.a.d(obj);
                                return new Long(j);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sVar2 = cVar.f12384g;
                        Z5.a.d(obj);
                    } else {
                        Z5.a.d(obj);
                        Objects.toString(sVar2.f12925a);
                        m mVar = sVar2.f12925a;
                        if (str == null) {
                            str2 = mVar.f12912b;
                        } else {
                            str2 = str;
                        }
                        int i9 = mVar.f12913c;
                        boolean z8 = mVar.f12914d;
                        int i10 = mVar.f12915e;
                        boolean z9 = mVar.f12916f;
                        boolean z10 = mVar.f12917g;
                        o6.j.e(str2, "name");
                        m mVar2 = new m(0L, str2, i9, z8, i10, z9, z10);
                        cVar.f12384g = sVar2;
                        cVar.k = 1;
                        obj = D2.f.C(cVar, new n2.e(jVar, mVar2, 1), jVar.f12901a, false, true);
                        if (obj == enumC0646a) {
                            return enumC0646a;
                        }
                    }
                    long longValue = ((Number) obj).longValue();
                    List list = sVar2.f12926b;
                    arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C1155c.a((C1155c) it.next(), longValue));
                    }
                    cVar.f12384g = null;
                    cVar.f12385h = longValue;
                    cVar.k = 2;
                    if (D2.f.C(cVar, new n2.g(jVar, arrayList, 2), jVar.f12901a, false, true) != enumC0646a) {
                        j = longValue;
                        return new Long(j);
                    }
                    return enumC0646a;
                }
            }
            if (i4 == 0) {
            }
            long longValue2 = ((Number) obj).longValue();
            List list2 = sVar2.f12926b;
            arrayList = new ArrayList(AbstractC0438m.d0(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
            }
            cVar.f12384g = null;
            cVar.f12385h = longValue2;
            cVar.k = 2;
            if (D2.f.C(cVar, new n2.g(jVar, arrayList, 2), jVar.f12901a, false, true) != enumC0646a) {
            }
            return enumC0646a;
        } catch (Exception e9) {
            Log.e("DumbScenarioDataSource", "Error while inserting scenario copy", e9);
            return null;
        }
        cVar = new c(this, abstractC0713c);
        Object obj2 = cVar.f12386i;
        i4 = cVar.k;
        jVar = this.f12410a;
        enumC0646a = EnumC0646a.f10656d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j, AbstractC0713c abstractC0713c) {
        e eVar;
        int i4;
        s sVar;
        if (abstractC0713c instanceof e) {
            eVar = (e) abstractC0713c;
            int i8 = eVar.f12392i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f12392i = i8 - Integer.MIN_VALUE;
                Object obj = eVar.f12390g;
                i4 = eVar.f12392i;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    eVar.f12392i = 1;
                    n2.j jVar = this.f12410a;
                    obj = D2.f.C(eVar, new n2.h(j, jVar, 2), jVar.f12901a, true, true);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                sVar = (s) obj;
                if (sVar == null) {
                    return AbstractC0832f.E(sVar);
                }
                return null;
            }
        }
        eVar = new e(this, abstractC0713c);
        Object obj2 = eVar.f12390g;
        i4 = eVar.f12392i;
        if (i4 == 0) {
        }
        sVar = (s) obj2;
        if (sVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (r3 == r12) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j, AbstractC0713c abstractC0713c) {
        g gVar;
        int i4;
        p pVar;
        long j5 = j;
        if (abstractC0713c instanceof g) {
            gVar = (g) abstractC0713c;
            int i8 = gVar.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.j = i8 - Integer.MIN_VALUE;
                Object obj = gVar.f12397h;
                i4 = gVar.j;
                final n2.j jVar = this.f12410a;
                y yVar = y.f7506a;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                Z5.a.d(obj);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj);
                        return yVar;
                    }
                    j5 = gVar.f12396g;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    gVar.f12396g = j5;
                    gVar.j = 1;
                    obj = D2.f.C(gVar, new C0290a(16, j5), jVar.f12901a, true, false);
                }
                pVar = (p) obj;
                if (pVar == null) {
                    final p pVar2 = new p(pVar.f12919a, pVar.f12920b, System.currentTimeMillis(), pVar.f12922d + 1);
                    gVar.f12396g = j5;
                    gVar.j = 2;
                    final int i9 = 0;
                    Object C8 = D2.f.C(gVar, new InterfaceC1163b() { // from class: n2.f
                        @Override // n6.InterfaceC1163b
                        public final Object m(Object obj2) {
                            D0.a aVar = (D0.a) obj2;
                            switch (i9) {
                                case 0:
                                    o6.j.e(aVar, "_connection");
                                    jVar.f12909i.l(aVar, pVar2);
                                    break;
                                default:
                                    o6.j.e(aVar, "_connection");
                                    jVar.f12905e.u(aVar, pVar2);
                                    break;
                            }
                            return y.f7506a;
                        }
                    }, jVar.f12901a, false, true);
                    if (C8 != enumC0646a) {
                        C8 = yVar;
                    }
                    if (C8 == enumC0646a) {
                        return enumC0646a;
                    }
                    return yVar;
                }
                final p pVar3 = new p(0L, j5, System.currentTimeMillis(), 1L);
                gVar.f12396g = j5;
                gVar.j = 3;
                final int i10 = 1;
                Object C9 = D2.f.C(gVar, new InterfaceC1163b() { // from class: n2.f
                    @Override // n6.InterfaceC1163b
                    public final Object m(Object obj2) {
                        D0.a aVar = (D0.a) obj2;
                        switch (i10) {
                            case 0:
                                o6.j.e(aVar, "_connection");
                                jVar.f12909i.l(aVar, pVar3);
                                break;
                            default:
                                o6.j.e(aVar, "_connection");
                                jVar.f12905e.u(aVar, pVar3);
                                break;
                        }
                        return y.f7506a;
                    }
                }, jVar.f12901a, false, true);
                if (C9 != enumC0646a) {
                    C9 = yVar;
                }
                if (C9 == enumC0646a) {
                }
            }
        }
        gVar = new g(this, abstractC0713c);
        Object obj2 = gVar.f12397h;
        i4 = gVar.j;
        final n2.j jVar2 = this.f12410a;
        y yVar2 = y.f7506a;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        pVar = (p) obj2;
        if (pVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (r2 == r8) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(p2.e eVar, AbstractC0713c abstractC0713c) {
        i iVar;
        int i4;
        Object obj;
        m mVar;
        long j;
        List list;
        p2.e eVar2 = eVar;
        if (abstractC0713c instanceof i) {
            iVar = (i) abstractC0713c;
            int i8 = iVar.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.k = i8 - Integer.MIN_VALUE;
                Object obj2 = iVar.f12404i;
                i4 = iVar.k;
                Object obj3 = y.f7506a;
                obj = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj2);
                            return obj3;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m mVar2 = iVar.f12403h;
                    p2.e eVar3 = iVar.f12402g;
                    Z5.a.d(obj2);
                    mVar = mVar2;
                    eVar2 = eVar3;
                } else {
                    Z5.a.d(obj2);
                    Objects.toString(eVar2);
                    o6.j.e(eVar2, "<this>");
                    mVar = new m(eVar2.f13699a.f12187a, eVar2.f13700b, eVar2.f13702d, eVar2.f13703e, eVar2.f13704f, eVar2.f13705g, eVar2.f13706h);
                    iVar.f12402g = eVar2;
                    iVar.f12403h = mVar;
                    iVar.k = 1;
                    n2.j jVar = this.f12410a;
                    Object C8 = D2.f.C(iVar, new n2.e(jVar, mVar, 0), jVar.f12901a, false, true);
                    if (C8 != obj) {
                        C8 = obj3;
                    }
                }
                j = mVar.f12911a;
                list = eVar2.f13701c;
                iVar.f12402g = null;
                iVar.f12403h = null;
                iVar.k = 2;
                if (g(j, list, iVar) != obj) {
                    return obj;
                }
                return obj3;
            }
        }
        iVar = new i(this, abstractC0713c);
        Object obj22 = iVar.f12404i;
        i4 = iVar.k;
        Object obj32 = y.f7506a;
        obj = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        j = mVar.f12911a;
        list = eVar2.f13701c;
        iVar.f12402g = null;
        iVar.f12403h = null;
        iVar.k = 2;
        if (g(j, list, iVar) != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e4, code lost:
    
        if (r4.w(r12, r21, r21, null, r10) != r11) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e6, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (r4.M(r3, r33, r8, r10) == r11) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j, List list, AbstractC0713c abstractC0713c) {
        j jVar;
        int i4;
        R.g gVar;
        long j5 = j;
        if (abstractC0713c instanceof j) {
            jVar = (j) abstractC0713c;
            int i8 = jVar.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                jVar.k = i8 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.f12407i;
                i4 = jVar2.k;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj);
                            return y.f7506a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j5 = jVar2.f12405g;
                    gVar = jVar2.f12406h;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    gVar = new R.g(10);
                    n2.j jVar3 = this.f12410a;
                    u uVar = jVar3.f12901a;
                    n2.h hVar = new n2.h(j5, jVar3, 0);
                    uVar.a();
                    if (uVar.i() && !uVar.j() && uVar.f15283i.get() != null) {
                        throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                    }
                    List list2 = (List) h2.a.y(new A0.c(uVar, hVar, null));
                    k kVar = new k(j5, null);
                    jVar2.f12406h = gVar;
                    jVar2.f12405g = j5;
                    jVar2.k = 1;
                }
                Objects.toString(this.f12411b);
                n2.j jVar4 = this.f12410a;
                I i9 = new I(2, jVar4, n2.j.class, "addDumbActions", "addDumbActions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 1);
                I i10 = new I(2, jVar4, n2.j.class, "updateDumbActions", "updateDumbActions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 2);
                I i11 = new I(2, jVar4, n2.j.class, "deleteDumbActions", "deleteDumbActions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 3);
                jVar2.f12406h = null;
                jVar2.f12405g = j5;
                jVar2.k = 2;
            }
        }
        jVar = new j(this, abstractC0713c);
        j jVar22 = jVar;
        Object obj2 = jVar22.f12407i;
        i4 = jVar22.k;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        Objects.toString(this.f12411b);
        n2.j jVar42 = this.f12410a;
        I i92 = new I(2, jVar42, n2.j.class, "addDumbActions", "addDumbActions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 1);
        I i102 = new I(2, jVar42, n2.j.class, "updateDumbActions", "updateDumbActions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 2);
        I i112 = new I(2, jVar42, n2.j.class, "deleteDumbActions", "deleteDumbActions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 3);
        jVar22.f12406h = null;
        jVar22.f12405g = j5;
        jVar22.k = 2;
    }
}
