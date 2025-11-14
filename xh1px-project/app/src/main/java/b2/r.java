package b2;

import H3.t;
import I7.v;
import O7.InterfaceC0233f;
import O7.V;
import S1.E;
import S1.F;
import S1.J;
import S1.w;
import S1.x;
import T1.C0313l;
import T1.C0316o;
import T1.M;
import T1.s;
import Z5.y;
import a6.AbstractC0438m;
import android.util.Log;
import c2.z;
import com.buzbuz.smartautoclicker.core.database.ClickDatabase;
import com.buzbuz.smartautoclicker.core.database.ScenarioDatabase;
import com.buzbuz.smartautoclicker.core.database.TutorialDatabase;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import h7.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l2.C1001a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final z f9111a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.e f9112b;

    /* renamed from: c, reason: collision with root package name */
    public final R3.r f9113c;

    /* renamed from: d, reason: collision with root package name */
    public final Y3.z f9114d;

    /* renamed from: e, reason: collision with root package name */
    public final C4.e f9115e;

    /* renamed from: f, reason: collision with root package name */
    public final Y3.z f9116f;

    /* renamed from: g, reason: collision with root package name */
    public final H3.i f9117g;

    /* renamed from: h, reason: collision with root package name */
    public final H3.g f9118h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0233f f9119i;

    public r(z zVar, q1.e eVar) {
        this.f9111a = zVar;
        this.f9112b = eVar;
        this.f9113c = zVar.f9608i;
        this.f9114d = new Y3.z(zVar.j, 3);
        this.f9115e = new C4.e(zVar.f9609l, 23);
        this.f9116f = new Y3.z(zVar.k, 4);
        int i4 = 3;
        InterfaceC0617c interfaceC0617c = null;
        this.f9117g = new H3.i(V.u(zVar.f9605f, new C3.d(i4, interfaceC0617c, 22)), 3);
        this.f9118h = new H3.g(V.u(zVar.f9606g, new C3.d(i4, interfaceC0617c, 21)), 5);
        this.f9119i = V.k(new t(new A4.c(zVar.f9600a.p().m(), zVar.f9601b.p().m(), new C3.b(i4, interfaceC0617c, 2), 27), 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0091 -> B:16:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r rVar, List list, InterfaceC0617c interfaceC0617c) {
        C0526b c0526b;
        int i4;
        Collection arrayList;
        Iterator it;
        int i8;
        int i9;
        boolean hasNext;
        boolean z8;
        rVar.getClass();
        if (interfaceC0617c instanceof C0526b) {
            c0526b = (C0526b) interfaceC0617c;
            int i10 = c0526b.f9060o;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0526b.f9060o = i10 - Integer.MIN_VALUE;
                Object obj = c0526b.f9058m;
                i4 = c0526b.f9060o;
                y yVar = y.f7506a;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i11 = c0526b.f9057l;
                    i9 = c0526b.k;
                    Object next = c0526b.j;
                    it = c0526b.f9056i;
                    arrayList = c0526b.f9055h;
                    List list2 = c0526b.f9054g;
                    Z5.a.d(obj);
                    if (((Number) obj).intValue() != 0) {
                        i8 = i11;
                        list = list2;
                        z8 = true;
                    } else {
                        i8 = i11;
                        list = list2;
                        z8 = false;
                    }
                    if (z8) {
                        arrayList.add(next);
                    }
                    hasNext = it.hasNext();
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (!hasNext) {
                        next = it.next();
                        String str = (String) next;
                        if (str.length() > 0) {
                            z zVar = rVar.f9111a;
                            c0526b.f9054g = list;
                            c0526b.f9055h = arrayList;
                            c0526b.f9056i = it;
                            c0526b.j = next;
                            c0526b.k = i9;
                            c0526b.f9057l = i8;
                            c0526b.f9060o = 1;
                            Object n3 = ((ScenarioDatabase) zVar.f9602c.f()).p().n(str, c0526b);
                            if (n3 != enumC0646a) {
                                list2 = list;
                                i11 = i8;
                                obj = n3;
                                if (((Number) obj).intValue() != 0) {
                                }
                                if (z8) {
                                }
                                hasNext = it.hasNext();
                                EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                                if (!hasNext) {
                                    List list3 = (List) arrayList;
                                    list.size();
                                    list3.size();
                                    if (!list3.isEmpty()) {
                                        q1.e eVar = rVar.f9112b;
                                        c0526b.f9054g = null;
                                        c0526b.f9055h = null;
                                        c0526b.f9056i = null;
                                        c0526b.j = null;
                                        c0526b.f9060o = 2;
                                        Object y4 = eVar.f13924b.y(list3, c0526b);
                                        if (y4 != enumC0646a2) {
                                            y4 = yVar;
                                        }
                                        if (y4 == enumC0646a2) {
                                        }
                                    }
                                    return yVar;
                                }
                            }
                        } else {
                            z8 = false;
                            if (z8) {
                            }
                            hasNext = it.hasNext();
                            EnumC0646a enumC0646a22 = EnumC0646a.f10656d;
                            if (!hasNext) {
                            }
                        }
                    }
                    return enumC0646a22;
                }
                Z5.a.d(obj);
                Objects.toString(list);
                arrayList = new ArrayList();
                it = list.iterator();
                i8 = 0;
                i9 = 0;
                hasNext = it.hasNext();
                EnumC0646a enumC0646a222 = EnumC0646a.f10656d;
                if (!hasNext) {
                }
                return enumC0646a222;
            }
        }
        c0526b = new C0526b(rVar, interfaceC0617c);
        Object obj2 = c0526b.f9058m;
        i4 = c0526b.f9060o;
        y yVar2 = y.f7506a;
        if (i4 == 0) {
        }
    }

    public final Object b(C1001a c1001a, AbstractC0720j abstractC0720j) {
        Objects.toString(c1001a.f12190a);
        return ((ScenarioDatabase) this.f9111a.f9602c.f()).r().G(h4.g.w(c1001a), abstractC0720j);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j, String str, AbstractC0713c abstractC0713c) {
        C0525a c0525a;
        int i4;
        String str2;
        C0316o c0316o;
        long j5 = j;
        if (abstractC0713c instanceof C0525a) {
            c0525a = (C0525a) abstractC0713c;
            int i8 = c0525a.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0525a.k = i8 - Integer.MIN_VALUE;
                C0525a c0525a2 = c0525a;
                Object obj = c0525a2.f9053i;
                i4 = c0525a2.k;
                z zVar = this.f9111a;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j5 = c0525a2.f9051g;
                    str2 = c0525a2.f9052h;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    c0525a2.f9052h = str;
                    c0525a2.f9051g = j5;
                    c0525a2.k = 1;
                    Object I8 = ((ScenarioDatabase) zVar.f9602c.f()).r().I(j5, c0525a2);
                    if (I8 != enumC0646a) {
                        str2 = str;
                        obj = I8;
                    }
                    return enumC0646a;
                }
                long j8 = j5;
                c0316o = (C0316o) obj;
                if (c0316o != null) {
                    return null;
                }
                Z5.j t8 = h4.g.t(c0316o);
                C1001a c1001a = (C1001a) t8.f7485d;
                List list = (List) t8.f7486e;
                C1001a b4 = C1001a.b(c1001a, str2, 0, false, false, 125);
                A1.o oVar = new A1.o(2, this, r.class, "clearRemovedConditionsBitmaps", "clearRemovedConditionsBitmaps(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 10);
                c0525a2.f9052h = null;
                c0525a2.f9051g = j8;
                c0525a2.k = 2;
                Object d2 = zVar.d(b4, list, oVar, c0525a2);
                if (d2 == enumC0646a) {
                    return enumC0646a;
                }
                return d2;
            }
        }
        c0525a = new C0525a(this, abstractC0713c);
        C0525a c0525a22 = c0525a;
        Object obj2 = c0525a22.f9053i;
        i4 = c0525a22.k;
        z zVar2 = this.f9111a;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        long j82 = j5;
        c0316o = (C0316o) obj2;
        if (c0316o != null) {
        }
    }

    public final Object d(C0316o c0316o, AbstractC0720j abstractC0720j) {
        Z5.j t8 = h4.g.t(c0316o);
        return this.f9111a.d((C1001a) t8.f7485d, (List) t8.f7486e, new A1.o(2, this, r.class, "clearRemovedConditionsBitmaps", "clearRemovedConditionsBitmaps(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 9), abstractC0720j);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(long j, AbstractC0713c abstractC0713c) {
        C0527c c0527c;
        int i4;
        Object C8;
        Iterator it;
        if (abstractC0713c instanceof C0527c) {
            c0527c = (C0527c) abstractC0713c;
            int i8 = c0527c.f9063i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0527c.f9063i = i8 - Integer.MIN_VALUE;
                Object obj = c0527c.f9061g;
                i4 = c0527c.f9063i;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    c0527c.f9063i = 1;
                    w q6 = ((ScenarioDatabase) this.f9111a.f9602c.f()).q();
                    switch (q6.f5305a) {
                        case 0:
                            C8 = D2.f.C(c0527c, new S1.r(j, q6, 3), q6.f5306b, true, true);
                            break;
                        default:
                            C8 = D2.f.C(c0527c, new x(j, q6, 1), q6.f5306b, true, true);
                            break;
                    }
                    obj = C8;
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(u.n((C0313l) it.next(), false));
                }
                return arrayList;
            }
        }
        c0527c = new C0527c(this, abstractC0713c);
        Object obj2 = c0527c.f9061g;
        i4 = c0527c.f9063i;
        if (i4 == 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j, AbstractC0713c abstractC0713c) {
        C0529e c0529e;
        int i4;
        Object C8;
        M m6;
        if (abstractC0713c instanceof C0529e) {
            c0529e = (C0529e) abstractC0713c;
            int i8 = c0529e.f9069i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0529e.f9069i = i8 - Integer.MIN_VALUE;
                Object obj = c0529e.f9067g;
                i4 = c0529e.f9069i;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    c0529e.f9069i = 1;
                    F r8 = ((ScenarioDatabase) this.f9111a.f9602c.f()).r();
                    switch (r8.f5221a) {
                        case 0:
                            C8 = D2.f.C(c0529e, new E(j, r8, 0), r8.f5222b, true, true);
                            break;
                        default:
                            C8 = D2.f.C(c0529e, new J(j, r8, 1), r8.f5222b, true, true);
                            break;
                    }
                    obj = C8;
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                m6 = (M) obj;
                if (m6 == null) {
                    return h4.g.v(m6);
                }
                return null;
            }
        }
        c0529e = new C0529e(this, abstractC0713c);
        Object obj2 = c0529e.f9067g;
        i4 = c0529e.f9069i;
        if (i4 == 0) {
        }
        m6 = (M) obj2;
        if (m6 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(long j, AbstractC0713c abstractC0713c) {
        g gVar;
        int i4;
        Object C8;
        Iterator it;
        if (abstractC0713c instanceof g) {
            gVar = (g) abstractC0713c;
            int i8 = gVar.f9075i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.f9075i = i8 - Integer.MIN_VALUE;
                Object obj = gVar.f9073g;
                i4 = gVar.f9075i;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    gVar.f9075i = 1;
                    w q6 = ((ScenarioDatabase) this.f9111a.f9602c.f()).q();
                    switch (q6.f5305a) {
                        case 0:
                            C8 = D2.f.C(gVar, new S1.r(j, q6, 2), q6.f5306b, true, true);
                            break;
                        default:
                            C8 = D2.f.C(gVar, new x(j, q6, 3), q6.f5306b, true, true);
                            break;
                    }
                    obj = C8;
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(u.o((C0313l) it.next(), false));
                }
                return arrayList;
            }
        }
        gVar = new g(this, abstractC0713c);
        Object obj2 = gVar.f9073g;
        i4 = gVar.f9075i;
        if (i4 == 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    public final boolean h() {
        z zVar = this.f9111a;
        return o6.j.a(zVar.f9602c.f(), zVar.f9601b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r6 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(AbstractC0713c abstractC0713c) {
        i iVar;
        Object obj;
        int i4;
        if (abstractC0713c instanceof i) {
            iVar = (i) abstractC0713c;
            int i8 = iVar.f9081i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.f9081i = i8 - Integer.MIN_VALUE;
                obj = iVar.f9079g;
                i4 = iVar.f9081i;
                Object obj2 = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    iVar.f9081i = 1;
                    obj = j(false, iVar);
                }
                if (!((Boolean) obj).booleanValue()) {
                    iVar.f9081i = 2;
                    Object j = j(true, iVar);
                    if (j == obj2) {
                        return obj2;
                    }
                    return j;
                }
                return Boolean.FALSE;
            }
        }
        iVar = new i(this, abstractC0713c);
        obj = iVar.f9079g;
        i4 = iVar.f9081i;
        Object obj22 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0203, code lost:
    
        if (r0 == r7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0205, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0212, code lost:
    
        if (r1 != r7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0215, code lost:
    
        r1 = r6;
        r14 = r10;
        r6 = r11;
        r11 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x020f, code lost:
    
        if (r0 == r7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0220, code lost:
    
        r16 = r12;
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0085, code lost:
    
        if (r2 == r7) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Type inference failed for: r6v4, types: [o6.r, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0141 -> B:13:0x0220). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0215 -> B:12:0x0219). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(boolean z8, AbstractC0713c abstractC0713c) {
        j jVar;
        int i4;
        Map linkedHashMap;
        boolean z9;
        Iterator it;
        o6.r rVar;
        int i8;
        T1.r rVar2;
        String str;
        int i9;
        String str2;
        Map map;
        Object o7;
        int i10;
        int i11;
        int i12;
        int i13;
        r rVar3 = this;
        boolean z10 = z8;
        z zVar = rVar3.f9111a;
        ClickDatabase clickDatabase = zVar.f9600a;
        TutorialDatabase tutorialDatabase = zVar.f9601b;
        if (abstractC0713c instanceof j) {
            jVar = (j) abstractC0713c;
            int i14 = jVar.f9090q;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f9090q = i14 - Integer.MIN_VALUE;
                Object obj = jVar.f9088o;
                i4 = jVar.f9090q;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                int i15 = 0;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                int i16 = jVar.f9086m;
                                boolean z11 = jVar.f9082g;
                                Iterator it2 = jVar.j;
                                map = jVar.f9084i;
                                o6.r rVar4 = jVar.f9083h;
                                Z5.a.d(obj);
                                TutorialDatabase tutorialDatabase2 = tutorialDatabase;
                                it = it2;
                                linkedHashMap = map;
                                rVar = rVar4;
                                int i17 = 0;
                                z9 = z11;
                                i8 = i16;
                                rVar3 = this;
                                tutorialDatabase = tutorialDatabase2;
                                i15 = i17;
                                if (it.hasNext()) {
                                    rVar2 = (T1.r) it.next();
                                    str = rVar2.f5618f;
                                    if (str == null || v.W(str, ".png")) {
                                        i17 = i15;
                                        tutorialDatabase2 = tutorialDatabase;
                                        rVar3 = this;
                                        tutorialDatabase = tutorialDatabase2;
                                        i15 = i17;
                                        if (it.hasNext()) {
                                        }
                                    } else if (linkedHashMap.containsKey(str)) {
                                        str2 = (String) linkedHashMap.get(str);
                                        String str3 = str;
                                        map = linkedHashMap;
                                        if (str2 == null) {
                                        }
                                    } else {
                                        Integer num = rVar2.f5621i;
                                        if (num != null) {
                                            i10 = num.intValue();
                                        } else {
                                            i10 = i15;
                                        }
                                        Integer num2 = rVar2.f5619g;
                                        if (num2 != null) {
                                            i11 = num2.intValue();
                                        } else {
                                            i11 = i15;
                                        }
                                        int max = Math.max(i15, i10 - i11);
                                        Integer num3 = rVar2.j;
                                        if (num3 != null) {
                                            i12 = num3.intValue();
                                        } else {
                                            i12 = i15;
                                        }
                                        Integer num4 = rVar2.f5620h;
                                        if (num4 != null) {
                                            i13 = num4.intValue();
                                        } else {
                                            i13 = 0;
                                        }
                                        int max2 = Math.max(0, i12 - i13);
                                        jVar.getClass();
                                        jVar.f9083h = rVar;
                                        jVar.f9084i = linkedHashMap;
                                        jVar.j = it;
                                        jVar.k = rVar2;
                                        jVar.f9085l = str;
                                        jVar.f9082g = z9;
                                        jVar.f9086m = i8;
                                        jVar.f9087n = 0;
                                        jVar.f9090q = 2;
                                        obj = rVar3.f9112b.b(str, max, max2, jVar);
                                        if (obj != enumC0646a) {
                                            i9 = 0;
                                            i15 = i9;
                                            str2 = (String) obj;
                                            String str32 = str;
                                            map = linkedHashMap;
                                            if (str2 == null) {
                                                rVar.f13639d = false;
                                                Log.w("RepositoryImpl", "Can't migrate legacy condition " + rVar2.f5613a + ":" + rVar2.f5615c);
                                                tutorialDatabase2 = tutorialDatabase;
                                                linkedHashMap = map;
                                                i17 = 0;
                                                rVar3 = this;
                                                tutorialDatabase = tutorialDatabase2;
                                                i15 = i17;
                                                if (it.hasNext()) {
                                                }
                                            } else {
                                                map.put(str32, str2);
                                                jVar.getClass();
                                                jVar.f9083h = rVar;
                                                jVar.f9084i = map;
                                                jVar.j = it;
                                                jVar.k = null;
                                                jVar.f9085l = null;
                                                jVar.f9082g = z9;
                                                jVar.f9086m = i8;
                                                jVar.f9087n = i15;
                                                jVar.f9090q = 3;
                                                T1.q qVar = T1.r.Companion;
                                                tutorialDatabase2 = tutorialDatabase;
                                                long j = rVar2.f5613a;
                                                String str4 = str2;
                                                long j5 = rVar2.f5614b;
                                                String str5 = rVar2.f5615c;
                                                s sVar = rVar2.f5616d;
                                                int i18 = rVar2.f5617e;
                                                Integer num5 = rVar2.f5619g;
                                                Integer num6 = rVar2.f5620h;
                                                Integer num7 = rVar2.f5621i;
                                                Integer num8 = rVar2.j;
                                                Integer num9 = rVar2.k;
                                                Integer num10 = rVar2.f5622l;
                                                Boolean bool = rVar2.f5623m;
                                                Integer num11 = rVar2.f5624n;
                                                Integer num12 = rVar2.f5625o;
                                                Integer num13 = rVar2.f5626p;
                                                Integer num14 = rVar2.f5627q;
                                                String str6 = rVar2.f5628r;
                                                String str7 = rVar2.f5629s;
                                                T1.t tVar = rVar2.f5630t;
                                                T1.u uVar = rVar2.f5631u;
                                                Integer num15 = rVar2.f5632v;
                                                String str8 = rVar2.f5633w;
                                                Long l6 = rVar2.f5634x;
                                                Boolean bool2 = rVar2.f5635y;
                                                o6.j.e(str5, "name");
                                                o6.j.e(sVar, "type");
                                                T1.r rVar5 = new T1.r(j, j5, str5, sVar, i18, str4, num5, num6, num7, num8, num9, num10, bool, num11, num12, num13, num14, str6, str7, tVar, uVar, num15, str8, l6, bool2);
                                                Object obj2 = y.f7506a;
                                                if (z9) {
                                                    o7 = tutorialDatabase2.p().o(rVar5, jVar);
                                                } else {
                                                    o7 = clickDatabase.p().o(rVar5, jVar);
                                                }
                                                rVar3 = this;
                                                tutorialDatabase = tutorialDatabase2;
                                                i15 = i17;
                                                if (it.hasNext()) {
                                                }
                                            }
                                        }
                                        return enumC0646a;
                                    }
                                } else {
                                    return Boolean.valueOf(rVar.f13639d);
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            i9 = jVar.f9087n;
                            i8 = jVar.f9086m;
                            z9 = jVar.f9082g;
                            str = jVar.f9085l;
                            rVar2 = jVar.k;
                            it = jVar.j;
                            linkedHashMap = jVar.f9084i;
                            rVar = jVar.f9083h;
                            Z5.a.d(obj);
                            i15 = i9;
                            str2 = (String) obj;
                            String str322 = str;
                            map = linkedHashMap;
                            if (str2 == null) {
                            }
                        }
                    } else {
                        z10 = jVar.f9082g;
                        Z5.a.d(obj);
                    }
                } else {
                    Z5.a.d(obj);
                    jVar.f9082g = z10;
                    jVar.f9090q = 1;
                    if (z10) {
                        obj = tutorialDatabase.p().l(jVar);
                    } else {
                        obj = clickDatabase.p().l(jVar);
                    }
                }
                List list = (List) obj;
                Log.i("RepositoryImpl", "Migrating " + list.size() + " image conditions...");
                ?? obj3 = new Object();
                obj3.f13639d = true;
                linkedHashMap = new LinkedHashMap();
                z9 = z10;
                it = list.iterator();
                rVar = obj3;
                i8 = 0;
                if (it.hasNext()) {
                }
            }
        }
        jVar = new j(rVar3, abstractC0713c);
        Object obj4 = jVar.f9088o;
        i4 = jVar.f9090q;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        int i152 = 0;
        if (i4 == 0) {
        }
        List list2 = (List) obj4;
        Log.i("RepositoryImpl", "Migrating " + list2.size() + " image conditions...");
        ?? obj32 = new Object();
        obj32.f13639d = true;
        linkedHashMap = new LinkedHashMap();
        z9 = z10;
        it = list2.iterator();
        rVar = obj32;
        i8 = 0;
        if (it.hasNext()) {
        }
    }
}
