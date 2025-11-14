package c2;

import O7.V;
import O7.i0;
import S1.C0290a;
import S1.C0297h;
import S1.F;
import T1.C0304c;
import T1.C0310i;
import T1.EnumC0305d;
import T1.EnumC0306e;
import T1.EnumC0307f;
import T1.L;
import T1.N;
import X.A;
import a6.AbstractC0438m;
import android.util.Log;
import b6.C0535c;
import com.buzbuz.smartautoclicker.core.database.ClickDatabase;
import com.buzbuz.smartautoclicker.core.database.ScenarioDatabase;
import com.buzbuz.smartautoclicker.core.database.TutorialDatabase;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import h7.AbstractC0842e;
import i.AbstractC0862a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import k2.AbstractC0951a;
import l1.C0999a;
import l2.C1001a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import q4.X;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final ClickDatabase f9600a;

    /* renamed from: b, reason: collision with root package name */
    public final TutorialDatabase f9601b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f9602c;

    /* renamed from: d, reason: collision with root package name */
    public final K3.z f9603d;

    /* renamed from: e, reason: collision with root package name */
    public final C1.f f9604e;

    /* renamed from: f, reason: collision with root package name */
    public final K3.z f9605f;

    /* renamed from: g, reason: collision with root package name */
    public final C1.f f9606g;

    /* renamed from: h, reason: collision with root package name */
    public final R.g f9607h;

    /* renamed from: i, reason: collision with root package name */
    public final R3.r f9608i;
    public final P7.n j;
    public final P7.n k;

    /* renamed from: l, reason: collision with root package name */
    public final P7.n f9609l;

    public z(ClickDatabase clickDatabase, TutorialDatabase tutorialDatabase) {
        o6.j.e(clickDatabase, "normalDatabase");
        o6.j.e(tutorialDatabase, "tutorialDatabase");
        this.f9600a = clickDatabase;
        this.f9601b = tutorialDatabase;
        i0 c6 = V.c(clickDatabase);
        this.f9602c = c6;
        K3.z zVar = new K3.z(c6, 5);
        this.f9603d = zVar;
        C1.f fVar = new C1.f(c6, 4);
        this.f9604e = fVar;
        this.f9605f = new K3.z(c6, 6);
        this.f9606g = new C1.f(c6, 5);
        this.f9607h = new R.g(9);
        this.f9608i = new R3.r(c6, 12, this);
        int i4 = 3;
        InterfaceC0617c interfaceC0617c = null;
        this.j = V.u(zVar, new C3.d(i4, interfaceC0617c, 23));
        this.k = V.u(fVar, new C3.d(i4, interfaceC0617c, 24));
        this.f9609l = V.u(fVar, new C3.d(i4, interfaceC0617c, 25));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z zVar, C0535c c0535c, AbstractC0713c abstractC0713c) {
        n nVar;
        int i4;
        Iterator listIterator;
        int i8;
        R.g gVar = zVar.f9607h;
        if (abstractC0713c instanceof n) {
            nVar = (n) abstractC0713c;
            int i9 = nVar.k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                nVar.k = i9 - Integer.MIN_VALUE;
                Object obj = nVar.f9555i;
                i4 = nVar.k;
                if (i4 == 0) {
                    if (i4 != 1 && i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8 = nVar.f9554h;
                    listIterator = nVar.f9553g;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    listIterator = c0535c.listIterator(0);
                    i8 = 0;
                }
                while (listIterator.hasNext()) {
                    f2.a aVar = (f2.a) listIterator.next();
                    boolean z8 = aVar instanceof f2.f;
                    Object obj2 = EnumC0646a.f10656d;
                    if (z8) {
                        f2.f fVar = (f2.f) aVar;
                        List list = fVar.j;
                        if (list != null) {
                            long y4 = gVar.y(fVar.f10699a);
                            nVar.getClass();
                            nVar.f9553g = listIterator;
                            nVar.f9554h = i8;
                            nVar.k = 1;
                            if (zVar.j(y4, list, nVar) == obj2) {
                                return obj2;
                            }
                        } else {
                            continue;
                        }
                    } else if (aVar instanceof f2.o) {
                        f2.o oVar = (f2.o) aVar;
                        long y5 = gVar.y(oVar.f10750a);
                        List list2 = oVar.f10756g;
                        nVar.getClass();
                        nVar.f9553g = listIterator;
                        nVar.f9554h = i8;
                        nVar.k = 2;
                        if (zVar.i(y5, list2, nVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        continue;
                    }
                }
                return Z5.y.f7506a;
            }
        }
        nVar = new n(zVar, abstractC0713c);
        Object obj3 = nVar.f9555i;
        i4 = nVar.k;
        if (i4 == 0) {
        }
        while (listIterator.hasNext()) {
        }
        return Z5.y.f7506a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0140, code lost:
    
        if (r6.w(r12, r12, r12, r13, r5) != r11) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(z zVar, long j, List list, InterfaceC1164c interfaceC1164c, AbstractC0713c abstractC0713c) {
        s sVar;
        Object obj;
        int i4;
        EnumC0646a enumC0646a;
        R.g gVar;
        List list2;
        InterfaceC1164c interfaceC1164c2;
        R.g gVar2;
        t tVar;
        R.g gVar3;
        List list3;
        InterfaceC1164c interfaceC1164c3;
        long j5 = j;
        i0 i0Var = zVar.f9602c;
        if (abstractC0713c instanceof s) {
            sVar = (s) abstractC0713c;
            int i8 = sVar.f9576n;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                sVar.f9576n = i8 - Integer.MIN_VALUE;
                obj = sVar.f9574l;
                i4 = sVar.f9576n;
                enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                Z5.a.d(obj);
                                return Z5.y.f7506a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j5 = sVar.f9571g;
                        gVar3 = sVar.j;
                        interfaceC1164c3 = sVar.f9573i;
                        list3 = sVar.f9572h;
                        Z5.a.d(obj);
                        Objects.toString(gVar3);
                        S1.w q6 = ((ScenarioDatabase) i0Var.f()).q();
                        A1.o oVar = new A1.o(2, q6, S1.w.class, "addEvents", "addEvents(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 23);
                        A1.o oVar2 = new A1.o(2, q6, S1.w.class, "updateEvent", "updateEvent(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 24);
                        A1.o oVar3 = new A1.o(2, q6, S1.w.class, "deleteEvents", "deleteEvents(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 25);
                        u uVar = new u(zVar, interfaceC1164c3, list3, null);
                        sVar.f9572h = null;
                        sVar.f9573i = null;
                        sVar.j = null;
                        sVar.k = null;
                        sVar.f9571g = j5;
                        sVar.f9576n = 3;
                    } else {
                        j5 = sVar.f9571g;
                        gVar = sVar.k;
                        gVar2 = sVar.j;
                        InterfaceC1164c interfaceC1164c4 = sVar.f9573i;
                        List list4 = sVar.f9572h;
                        Z5.a.d(obj);
                        interfaceC1164c2 = interfaceC1164c4;
                        list2 = list4;
                    }
                } else {
                    Z5.a.d(obj);
                    R.g gVar4 = zVar.f9607h;
                    ((LinkedHashMap) gVar4.f4987e).clear();
                    ((LinkedHashMap) gVar4.f4988f).clear();
                    ((LinkedHashMap) gVar4.f4989g).clear();
                    gVar = new R.g(10);
                    S1.w q8 = ((ScenarioDatabase) i0Var.f()).q();
                    list2 = list;
                    sVar.f9572h = list2;
                    interfaceC1164c2 = interfaceC1164c;
                    sVar.f9573i = interfaceC1164c2;
                    sVar.j = gVar;
                    sVar.k = gVar;
                    sVar.f9571g = j5;
                    sVar.f9576n = 1;
                    switch (q8.f5305a) {
                        case 0:
                            obj = D2.f.C(sVar, new C0290a(9, j5, q8), q8.f5306b, true, false);
                            break;
                        default:
                            obj = D2.f.C(sVar, new C0290a(11, j5, q8), q8.f5306b, true, false);
                            break;
                    }
                    if (obj != enumC0646a) {
                        gVar2 = gVar;
                    }
                    return enumC0646a;
                }
                tVar = new t(j5, null);
                sVar.f9572h = list2;
                sVar.f9573i = interfaceC1164c2;
                sVar.j = gVar2;
                sVar.k = null;
                sVar.f9571g = j5;
                sVar.f9576n = 2;
                if (gVar.M((Collection) obj, list2, tVar, sVar) != enumC0646a) {
                    gVar3 = gVar2;
                    list3 = list2;
                    interfaceC1164c3 = interfaceC1164c2;
                    Objects.toString(gVar3);
                    S1.w q62 = ((ScenarioDatabase) i0Var.f()).q();
                    A1.o oVar4 = new A1.o(2, q62, S1.w.class, "addEvents", "addEvents(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 23);
                    A1.o oVar22 = new A1.o(2, q62, S1.w.class, "updateEvent", "updateEvent(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 24);
                    A1.o oVar32 = new A1.o(2, q62, S1.w.class, "deleteEvents", "deleteEvents(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 25);
                    u uVar2 = new u(zVar, interfaceC1164c3, list3, null);
                    sVar.f9572h = null;
                    sVar.f9573i = null;
                    sVar.j = null;
                    sVar.k = null;
                    sVar.f9571g = j5;
                    sVar.f9576n = 3;
                }
                return enumC0646a;
            }
        }
        sVar = new s(zVar, abstractC0713c);
        obj = sVar.f9574l;
        i4 = sVar.f9576n;
        enumC0646a = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        tVar = new t(j5, null);
        sVar.f9572h = list2;
        sVar.f9573i = interfaceC1164c2;
        sVar.j = gVar2;
        sVar.k = null;
        sVar.f9571g = j5;
        sVar.f9576n = 2;
        if (gVar.M((Collection) obj, list2, tVar, sVar) != enumC0646a) {
        }
        return enumC0646a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r16v0, types: [c2.z] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Iterator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(z zVar, C0535c c0535c, InterfaceC1164c interfaceC1164c, AbstractC0713c abstractC0713c) {
        v vVar;
        int i4;
        InterfaceC1164c interfaceC1164c2;
        List list;
        v vVar2;
        ListIterator listIterator;
        int i8;
        Iterator it;
        R.g gVar = zVar.f9607h;
        if (abstractC0713c instanceof v) {
            vVar = (v) abstractC0713c;
            int i9 = vVar.f9589m;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                vVar.f9589m = i9 - Integer.MIN_VALUE;
                Object obj = vVar.k;
                i4 = vVar.f9589m;
                int i10 = 0;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            int i11 = vVar.j;
                            it = vVar.f9587i;
                            Z5.a.d(obj);
                            i10 = i11;
                            while (it.hasNext()) {
                                AbstractC0951a abstractC0951a = (AbstractC0951a) it.next();
                                long C8 = gVar.C(abstractC0951a.getId());
                                List g8 = abstractC0951a.g();
                                vVar.f9585g = null;
                                vVar.f9586h = null;
                                vVar.f9587i = it;
                                vVar.j = i10;
                                vVar.f9589m = 2;
                                if (zVar.g(C8, g8, vVar) == enumC0646a) {
                                    return enumC0646a;
                                }
                            }
                            return Z5.y.f7506a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i12 = vVar.j;
                    ?? r42 = vVar.f9587i;
                    InterfaceC1164c interfaceC1164c3 = vVar.f9586h;
                    list = vVar.f9585g;
                    Z5.a.d(obj);
                    i8 = i12;
                    listIterator = r42;
                    interfaceC1164c2 = interfaceC1164c3;
                    vVar2 = vVar;
                } else {
                    Z5.a.d(obj);
                    interfaceC1164c2 = interfaceC1164c;
                    list = c0535c;
                    vVar2 = vVar;
                    listIterator = c0535c.listIterator(0);
                    i8 = 0;
                }
                while (listIterator.hasNext()) {
                    AbstractC0951a abstractC0951a2 = (AbstractC0951a) listIterator.next();
                    long C9 = gVar.C(abstractC0951a2.getId());
                    List i13 = abstractC0951a2.i();
                    vVar2.f9585g = list;
                    vVar2.f9586h = interfaceC1164c2;
                    vVar2.f9587i = listIterator;
                    vVar2.j = i8;
                    vVar2.f9589m = 1;
                    if (zVar.h(C9, i13, interfaceC1164c2, vVar2) == enumC0646a) {
                        break;
                    }
                }
                it = list.iterator();
                vVar = vVar2;
                while (it.hasNext()) {
                }
                return Z5.y.f7506a;
            }
        }
        vVar = new v(zVar, abstractC0713c);
        Object obj2 = vVar.k;
        i4 = vVar.f9589m;
        int i102 = 0;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        while (listIterator.hasNext()) {
        }
        it = list.iterator();
        vVar = vVar2;
        while (it.hasNext()) {
        }
        return Z5.y.f7506a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(C1001a c1001a, List list, InterfaceC1164c interfaceC1164c, AbstractC0713c abstractC0713c) {
        C0567a c0567a;
        int i4;
        try {
            if (abstractC0713c instanceof C0567a) {
                c0567a = (C0567a) abstractC0713c;
                int i8 = c0567a.f9510i;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0567a.f9510i = i8 - Integer.MIN_VALUE;
                    Object obj = c0567a.f9508g;
                    i4 = c0567a.f9510i;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            Z5.a.d(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        Objects.toString(c1001a.f12190a);
                        if (AbstractC0842e.b(list)) {
                            u0.u uVar = (u0.u) this.f9602c.f();
                            C0568b c0568b = new C0568b(this, c1001a, list, interfaceC1164c, null);
                            c0567a.f9510i = 1;
                            obj = AbstractC0862a.A(uVar, c0568b, c0567a);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (obj == enumC0646a) {
                                return enumC0646a;
                            }
                        } else {
                            throw new IllegalArgumentException("Can't update scenario content, one of the event is not complete");
                        }
                    }
                    return (Long) obj;
                }
            }
            if (i4 == 0) {
            }
            return (Long) obj;
        } catch (Exception e9) {
            Log.e("ScenarioDataSource", "Error while inserting scenario copy", e9);
            return null;
        }
        c0567a = new C0567a(this, abstractC0713c);
        Object obj2 = c0567a.f9508g;
        i4 = c0567a.f9510i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0113, code lost:
    
        if (r3.l(r0, r2) != r10) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r1 == r10) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if (r3 == r10) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [n6.c] */
    /* JADX WARN: Type inference failed for: r3v13, types: [n6.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c5 -> B:23:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(C0999a c0999a, A1.o oVar, AbstractC0713c abstractC0713c) {
        c cVar;
        int i4;
        ArrayList arrayList;
        A1.o oVar2;
        Object A2;
        Iterator it;
        int i8;
        C0999a c0999a2;
        List list;
        InterfaceC1164c interfaceC1164c;
        C0999a c0999a3 = c0999a;
        if (abstractC0713c instanceof c) {
            cVar = (c) abstractC0713c;
            int i9 = cVar.f9520n;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                cVar.f9520n = i9 - Integer.MIN_VALUE;
                Object obj = cVar.f9518l;
                i4 = cVar.f9520n;
                i0 i0Var = this.f9602c;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    Z5.a.d(obj);
                                    return Z5.y.f7506a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            list = cVar.f9517i;
                            interfaceC1164c = cVar.f9516h;
                            Z5.a.d(obj);
                            cVar.f9515g = null;
                            cVar.f9516h = null;
                            cVar.f9517i = null;
                            cVar.f9520n = 4;
                        } else {
                            int i10 = cVar.k;
                            it = cVar.j;
                            List list2 = cVar.f9517i;
                            ?? r11 = cVar.f9516h;
                            c0999a2 = cVar.f9515g;
                            Z5.a.d(obj);
                            i8 = i10;
                            list = list2;
                            oVar2 = r11;
                            for (String str : (Iterable) obj) {
                                if (!list.contains(str)) {
                                    list.add(str);
                                }
                            }
                            if (it.hasNext()) {
                                long longValue = ((Number) it.next()).longValue();
                                S1.p p8 = ((ScenarioDatabase) i0Var.f()).p();
                                cVar.f9515g = c0999a2;
                                cVar.f9516h = oVar2;
                                cVar.f9517i = list;
                                cVar.j = it;
                                cVar.k = i8;
                                cVar.f9520n = 2;
                                obj = p8.k(longValue, cVar);
                            } else {
                                F r8 = ((ScenarioDatabase) i0Var.f()).r();
                                long j = c0999a2.f12187a;
                                cVar.f9515g = null;
                                cVar.f9516h = oVar2;
                                cVar.f9517i = list;
                                cVar.j = null;
                                cVar.f9520n = 3;
                                if (r8.H(j, cVar) != enumC0646a) {
                                    interfaceC1164c = oVar2;
                                    cVar.f9515g = null;
                                    cVar.f9516h = null;
                                    cVar.f9517i = null;
                                    cVar.f9520n = 4;
                                }
                            }
                            return enumC0646a;
                        }
                    } else {
                        ?? r02 = cVar.f9517i;
                        ?? r32 = cVar.f9516h;
                        C0999a c0999a4 = cVar.f9515g;
                        Z5.a.d(obj);
                        oVar2 = r32;
                        A2 = obj;
                        arrayList = r02;
                        c0999a3 = c0999a4;
                    }
                } else {
                    Z5.a.d(obj);
                    Objects.toString(c0999a);
                    arrayList = new ArrayList();
                    S1.w q6 = ((ScenarioDatabase) i0Var.f()).q();
                    long j5 = c0999a3.f12187a;
                    cVar.f9515g = c0999a3;
                    oVar2 = oVar;
                    cVar.f9516h = oVar2;
                    cVar.f9517i = arrayList;
                    cVar.f9520n = 1;
                    A2 = q6.A(j5, cVar);
                }
                it = ((Iterable) A2).iterator();
                i8 = 0;
                c0999a2 = c0999a3;
                list = arrayList;
                if (it.hasNext()) {
                }
                return enumC0646a;
            }
        }
        cVar = new c(this, abstractC0713c);
        Object obj2 = cVar.f9518l;
        i4 = cVar.f9520n;
        i0 i0Var2 = this.f9602c;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        it = ((Iterable) A2).iterator();
        i8 = 0;
        c0999a2 = c0999a3;
        list = arrayList;
        if (it.hasNext()) {
        }
        return enumC0646a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e0, code lost:
    
        if (r1 == r9) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0127, code lost:
    
        if (r1 == r9) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j, AbstractC0713c abstractC0713c) {
        e eVar;
        int i4;
        Object C8;
        long j5;
        final F f8;
        int i8;
        L l6;
        Object C9;
        Object C10;
        if (abstractC0713c instanceof e) {
            eVar = (e) abstractC0713c;
            int i9 = eVar.f9527l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                eVar.f9527l = i9 - Integer.MIN_VALUE;
                Object obj = eVar.j;
                i4 = eVar.f9527l;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2 && i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj);
                        return Z5.y.f7506a;
                    }
                    i8 = eVar.f9526i;
                    long j8 = eVar.f9524g;
                    f8 = eVar.f9525h;
                    Z5.a.d(obj);
                    j5 = j8;
                } else {
                    Z5.a.d(obj);
                    F r8 = ((ScenarioDatabase) this.f9602c.f()).r();
                    eVar.f9525h = r8;
                    eVar.f9524g = j;
                    eVar.f9526i = 0;
                    eVar.f9527l = 1;
                    switch (r8.f5221a) {
                        case 0:
                            C8 = D2.f.C(eVar, new C0290a(13, j), r8.f5222b, true, false);
                            break;
                        default:
                            C8 = D2.f.C(eVar, new C0290a(15, j), r8.f5222b, true, false);
                            break;
                    }
                    if (C8 != enumC0646a) {
                        j5 = j;
                        f8 = r8;
                        i8 = 0;
                        obj = C8;
                    }
                    return enumC0646a;
                }
                l6 = (L) obj;
                if (l6 == null) {
                    final L l8 = new L(l6.f5533a, l6.f5534b, System.currentTimeMillis(), l6.f5536d + 1);
                    eVar.f9525h = null;
                    eVar.f9524g = j5;
                    eVar.f9526i = i8;
                    eVar.f9527l = 2;
                    switch (f8.f5221a) {
                        case 0:
                            final int i10 = 0;
                            C10 = D2.f.C(eVar, new InterfaceC1163b() { // from class: S1.D
                                @Override // n6.InterfaceC1163b
                                public final Object m(Object obj2) {
                                    D0.a aVar = (D0.a) obj2;
                                    switch (i10) {
                                        case 0:
                                            o6.j.e(aVar, "_connection");
                                            ((C0295f) f8.f5226f).l(aVar, l8);
                                            break;
                                        default:
                                            o6.j.e(aVar, "_connection");
                                            ((v) f8.f5224d).u(aVar, l8);
                                            break;
                                    }
                                    return Z5.y.f7506a;
                                }
                            }, f8.f5222b, false, true);
                            if (C10 != EnumC0646a.f10656d) {
                                C10 = Z5.y.f7506a;
                                break;
                            }
                            break;
                        default:
                            final int i11 = 1;
                            C10 = D2.f.C(eVar, new InterfaceC1163b() { // from class: S1.H
                                @Override // n6.InterfaceC1163b
                                public final Object m(Object obj2) {
                                    D0.a aVar = (D0.a) obj2;
                                    switch (i11) {
                                        case 0:
                                            o6.j.e(aVar, "_connection");
                                            ((v) f8.f5224d).u(aVar, l8);
                                            break;
                                        default:
                                            o6.j.e(aVar, "_connection");
                                            ((C0295f) f8.f5226f).l(aVar, l8);
                                            break;
                                    }
                                    return Z5.y.f7506a;
                                }
                            }, f8.f5222b, false, true);
                            if (C10 != EnumC0646a.f10656d) {
                                C10 = Z5.y.f7506a;
                                break;
                            }
                            break;
                    }
                } else {
                    final L l9 = new L(0L, j5, System.currentTimeMillis(), 1L);
                    eVar.f9525h = null;
                    eVar.f9524g = j5;
                    eVar.f9526i = i8;
                    eVar.f9527l = 3;
                    switch (f8.f5221a) {
                        case 0:
                            final int i12 = 1;
                            C9 = D2.f.C(eVar, new InterfaceC1163b() { // from class: S1.D
                                @Override // n6.InterfaceC1163b
                                public final Object m(Object obj2) {
                                    D0.a aVar = (D0.a) obj2;
                                    switch (i12) {
                                        case 0:
                                            o6.j.e(aVar, "_connection");
                                            ((C0295f) f8.f5226f).l(aVar, l9);
                                            break;
                                        default:
                                            o6.j.e(aVar, "_connection");
                                            ((v) f8.f5224d).u(aVar, l9);
                                            break;
                                    }
                                    return Z5.y.f7506a;
                                }
                            }, f8.f5222b, false, true);
                            if (C9 != EnumC0646a.f10656d) {
                                C9 = Z5.y.f7506a;
                                break;
                            }
                            break;
                        default:
                            final int i13 = 0;
                            C9 = D2.f.C(eVar, new InterfaceC1163b() { // from class: S1.H
                                @Override // n6.InterfaceC1163b
                                public final Object m(Object obj2) {
                                    D0.a aVar = (D0.a) obj2;
                                    switch (i13) {
                                        case 0:
                                            o6.j.e(aVar, "_connection");
                                            ((v) f8.f5224d).u(aVar, l9);
                                            break;
                                        default:
                                            o6.j.e(aVar, "_connection");
                                            ((C0295f) f8.f5226f).l(aVar, l9);
                                            break;
                                    }
                                    return Z5.y.f7506a;
                                }
                            }, f8.f5222b, false, true);
                            if (C9 != EnumC0646a.f10656d) {
                                C9 = Z5.y.f7506a;
                                break;
                            }
                            break;
                    }
                }
            }
        }
        eVar = new e(this, abstractC0713c);
        Object obj2 = eVar.j;
        i4 = eVar.f9527l;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        l6 = (L) obj2;
        if (l6 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x011a, code lost:
    
        if (r4.w(r12, r12, r12, r5, r10) != r11) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (r3 == r11) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2 A[LOOP:0: B:24:0x009c->B:26:0x00a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j, List list, AbstractC0713c abstractC0713c) {
        k kVar;
        k kVar2;
        int i4;
        EnumC0646a enumC0646a;
        List list2;
        ArrayList arrayList;
        Iterator it;
        R.g gVar;
        l lVar;
        R.g gVar2;
        final long j5 = j;
        if (abstractC0713c instanceof k) {
            kVar = (k) abstractC0713c;
            int i8 = kVar.f9546l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                kVar.f9546l = i8 - Integer.MIN_VALUE;
                kVar2 = kVar;
                Object obj = kVar2.j;
                i4 = kVar2.f9546l;
                i0 i0Var = this.f9602c;
                enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                Z5.a.d(obj);
                                return Z5.y.f7506a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j5 = kVar2.f9543g;
                        gVar2 = kVar2.f9545i;
                        Z5.a.d(obj);
                        Objects.toString(gVar2);
                        C0297h o7 = ((ScenarioDatabase) i0Var.f()).o();
                        A1.o oVar = new A1.o(2, o7, C0297h.class, "addActions", "addActions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 14);
                        A1.o oVar2 = new A1.o(2, o7, C0297h.class, "updateActions", "updateActions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 15);
                        A1.o oVar3 = new A1.o(2, o7, C0297h.class, "deleteActions", "deleteActions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 16);
                        m mVar = new m(this, null);
                        kVar2.f9544h = null;
                        kVar2.f9545i = null;
                        kVar2.f9543g = j5;
                        kVar2.f9546l = 3;
                    } else {
                        j5 = kVar2.f9543g;
                        list2 = kVar2.f9544h;
                        Z5.a.d(obj);
                    }
                } else {
                    Z5.a.d(obj);
                    final C0297h o8 = ((ScenarioDatabase) i0Var.f()).o();
                    list2 = list;
                    kVar2.f9544h = list2;
                    kVar2.f9543g = j5;
                    kVar2.f9546l = 1;
                    switch (o8.f5259a) {
                        case 0:
                            final int i9 = 0;
                            obj = D2.f.C(kVar2, new InterfaceC1163b() { // from class: S1.d
                                private final Object f(Object obj2) {
                                    EnumC0307f e9;
                                    int i10;
                                    Integer valueOf;
                                    Integer valueOf2;
                                    Long valueOf3;
                                    Long valueOf4;
                                    int i11;
                                    int i12;
                                    Integer valueOf5;
                                    Integer valueOf6;
                                    Integer valueOf7;
                                    Integer valueOf8;
                                    Integer valueOf9;
                                    Integer valueOf10;
                                    Long valueOf11;
                                    Long valueOf12;
                                    Integer valueOf13;
                                    Boolean bool;
                                    Integer valueOf14;
                                    Boolean bool2;
                                    String l6;
                                    String l8;
                                    Integer valueOf15;
                                    int i13;
                                    Integer valueOf16;
                                    Boolean bool3;
                                    T1.B i14;
                                    String l9;
                                    EnumC0306e c6;
                                    T1.u g8;
                                    int i15;
                                    Integer valueOf17;
                                    String l10;
                                    T1.H m6;
                                    String l11;
                                    String l12;
                                    Integer valueOf18;
                                    N o9;
                                    String l13;
                                    Integer valueOf19;
                                    Boolean bool4;
                                    boolean z8;
                                    boolean z9;
                                    boolean z10;
                                    boolean z11;
                                    int i16;
                                    long j8 = j5;
                                    C0297h c0297h = o8;
                                    D0.a aVar = (D0.a) obj2;
                                    o6.j.e(aVar, "_connection");
                                    D0.c L8 = aVar.L("SELECT * FROM action_table WHERE eventId=? ORDER BY priority");
                                    try {
                                        L8.c(1, j8);
                                        int x8 = X.x(L8, "id");
                                        int x9 = X.x(L8, "eventId");
                                        int x10 = X.x(L8, "priority");
                                        int x11 = X.x(L8, "name");
                                        int x12 = X.x(L8, "type");
                                        int x13 = X.x(L8, "clickPositionType");
                                        int x14 = X.x(L8, "x");
                                        int x15 = X.x(L8, "y");
                                        int x16 = X.x(L8, "clickOnConditionId");
                                        int x17 = X.x(L8, "pressDuration");
                                        int x18 = X.x(L8, "clickOffsetX");
                                        int x19 = X.x(L8, "clickOffsetY");
                                        int x20 = X.x(L8, "fromX");
                                        int x21 = X.x(L8, "fromY");
                                        int x22 = X.x(L8, "toX");
                                        int x23 = X.x(L8, "toY");
                                        int x24 = X.x(L8, "swipeDuration");
                                        int x25 = X.x(L8, "pauseDuration");
                                        int x26 = X.x(L8, "isAdvanced");
                                        int x27 = X.x(L8, "isBroadcast");
                                        int x28 = X.x(L8, "intent_action");
                                        int x29 = X.x(L8, "component_name");
                                        int x30 = X.x(L8, "flags");
                                        int x31 = X.x(L8, "toggle_all");
                                        int x32 = X.x(L8, "toggle_all_type");
                                        int x33 = X.x(L8, "counter_name");
                                        int x34 = X.x(L8, "counter_operation");
                                        int x35 = X.x(L8, "counter_operation_value_type");
                                        int x36 = X.x(L8, "counter_operation_value");
                                        int x37 = X.x(L8, "counter_operation_counter_name");
                                        int x38 = X.x(L8, "notification_message_type");
                                        int x39 = X.x(L8, "notification_message_text");
                                        int x40 = X.x(L8, "notification_message_counter_name");
                                        int x41 = X.x(L8, "notification_importance");
                                        int x42 = X.x(L8, "system_action_type");
                                        int x43 = X.x(L8, "text_value");
                                        int x44 = X.x(L8, "text_validate_input");
                                        int i17 = x19;
                                        t.g gVar3 = new t.g((Object) null);
                                        int i18 = x18;
                                        t.g gVar4 = new t.g((Object) null);
                                        while (L8.H()) {
                                            int i19 = x10;
                                            long j9 = L8.getLong(x8);
                                            if (!gVar3.b(j9)) {
                                                i16 = x17;
                                                gVar3.g(j9, new ArrayList());
                                            } else {
                                                i16 = x17;
                                            }
                                            long j10 = L8.getLong(x8);
                                            if (!gVar4.b(j10)) {
                                                gVar4.g(j10, new ArrayList());
                                            }
                                            x10 = i19;
                                            x17 = i16;
                                        }
                                        int i20 = x10;
                                        int i21 = x17;
                                        L8.reset();
                                        c0297h.s(aVar, gVar3);
                                        c0297h.q(aVar, gVar4);
                                        ArrayList arrayList2 = new ArrayList();
                                        while (L8.H()) {
                                            long j11 = L8.getLong(x8);
                                            long j12 = L8.getLong(x9);
                                            int i22 = i20;
                                            int i23 = (int) L8.getLong(i22);
                                            String l14 = L8.l(x11);
                                            EnumC0305d a3 = C0297h.a(L8.l(x12));
                                            if (L8.isNull(x13)) {
                                                e9 = null;
                                            } else {
                                                e9 = C0297h.e(L8.l(x13));
                                            }
                                            if (L8.isNull(x14)) {
                                                i10 = x9;
                                                i20 = i22;
                                                valueOf = null;
                                            } else {
                                                i10 = x9;
                                                i20 = i22;
                                                valueOf = Integer.valueOf((int) L8.getLong(x14));
                                            }
                                            if (L8.isNull(x15)) {
                                                valueOf2 = null;
                                            } else {
                                                valueOf2 = Integer.valueOf((int) L8.getLong(x15));
                                            }
                                            if (L8.isNull(x16)) {
                                                valueOf3 = null;
                                            } else {
                                                valueOf3 = Long.valueOf(L8.getLong(x16));
                                            }
                                            int i24 = i21;
                                            if (L8.isNull(i24)) {
                                                valueOf4 = null;
                                            } else {
                                                valueOf4 = Long.valueOf(L8.getLong(i24));
                                            }
                                            int i25 = i18;
                                            if (L8.isNull(i25)) {
                                                i11 = i23;
                                                i12 = i10;
                                                valueOf5 = null;
                                            } else {
                                                i11 = i23;
                                                i12 = i10;
                                                valueOf5 = Integer.valueOf((int) L8.getLong(i25));
                                            }
                                            int i26 = i17;
                                            if (L8.isNull(i26)) {
                                                i21 = i24;
                                                i18 = i25;
                                                valueOf6 = null;
                                            } else {
                                                i21 = i24;
                                                i18 = i25;
                                                valueOf6 = Integer.valueOf((int) L8.getLong(i26));
                                            }
                                            int i27 = x20;
                                            if (L8.isNull(i27)) {
                                                i17 = i26;
                                                valueOf7 = null;
                                            } else {
                                                i17 = i26;
                                                valueOf7 = Integer.valueOf((int) L8.getLong(i27));
                                            }
                                            int i28 = x21;
                                            if (L8.isNull(i28)) {
                                                valueOf8 = null;
                                            } else {
                                                valueOf8 = Integer.valueOf((int) L8.getLong(i28));
                                            }
                                            int i29 = x22;
                                            if (L8.isNull(i29)) {
                                                x20 = i27;
                                                x21 = i28;
                                                valueOf9 = null;
                                            } else {
                                                x20 = i27;
                                                x21 = i28;
                                                valueOf9 = Integer.valueOf((int) L8.getLong(i29));
                                            }
                                            int i30 = x23;
                                            if (L8.isNull(i30)) {
                                                x22 = i29;
                                                valueOf10 = null;
                                            } else {
                                                x22 = i29;
                                                valueOf10 = Integer.valueOf((int) L8.getLong(i30));
                                            }
                                            int i31 = x24;
                                            if (L8.isNull(i31)) {
                                                valueOf11 = null;
                                            } else {
                                                valueOf11 = Long.valueOf(L8.getLong(i31));
                                            }
                                            int i32 = x25;
                                            if (L8.isNull(i32)) {
                                                valueOf12 = null;
                                            } else {
                                                valueOf12 = Long.valueOf(L8.getLong(i32));
                                            }
                                            int i33 = x26;
                                            if (L8.isNull(i33)) {
                                                x23 = i30;
                                                x24 = i31;
                                                valueOf13 = null;
                                            } else {
                                                x23 = i30;
                                                x24 = i31;
                                                valueOf13 = Integer.valueOf((int) L8.getLong(i33));
                                            }
                                            if (valueOf13 != null) {
                                                if (valueOf13.intValue() != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                bool = Boolean.valueOf(z11);
                                            } else {
                                                bool = null;
                                            }
                                            int i34 = x27;
                                            if (L8.isNull(i34)) {
                                                x25 = i32;
                                                x26 = i33;
                                                valueOf14 = null;
                                            } else {
                                                x25 = i32;
                                                x26 = i33;
                                                valueOf14 = Integer.valueOf((int) L8.getLong(i34));
                                            }
                                            if (valueOf14 != null) {
                                                if (valueOf14.intValue() != 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                bool2 = Boolean.valueOf(z10);
                                            } else {
                                                bool2 = null;
                                            }
                                            int i35 = x28;
                                            if (L8.isNull(i35)) {
                                                l6 = null;
                                            } else {
                                                l6 = L8.l(i35);
                                            }
                                            int i36 = x29;
                                            if (L8.isNull(i36)) {
                                                l8 = null;
                                            } else {
                                                l8 = L8.l(i36);
                                            }
                                            int i37 = x30;
                                            if (L8.isNull(i37)) {
                                                x28 = i35;
                                                x29 = i36;
                                                valueOf15 = null;
                                            } else {
                                                x28 = i35;
                                                x29 = i36;
                                                valueOf15 = Integer.valueOf((int) L8.getLong(i37));
                                            }
                                            int i38 = x31;
                                            if (L8.isNull(i38)) {
                                                i13 = i34;
                                                x30 = i37;
                                                valueOf16 = null;
                                            } else {
                                                i13 = i34;
                                                x30 = i37;
                                                valueOf16 = Integer.valueOf((int) L8.getLong(i38));
                                            }
                                            if (valueOf16 != null) {
                                                if (valueOf16.intValue() != 0) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                bool3 = Boolean.valueOf(z9);
                                            } else {
                                                bool3 = null;
                                            }
                                            int i39 = x32;
                                            if (L8.isNull(i39)) {
                                                i14 = null;
                                            } else {
                                                i14 = C0297h.i(L8.l(i39));
                                            }
                                            int i40 = x33;
                                            if (L8.isNull(i40)) {
                                                l9 = null;
                                            } else {
                                                l9 = L8.l(i40);
                                            }
                                            x32 = i39;
                                            int i41 = x34;
                                            if (L8.isNull(i41)) {
                                                c6 = null;
                                            } else {
                                                c6 = C0297h.c(L8.l(i41));
                                            }
                                            x34 = i41;
                                            int i42 = x35;
                                            if (L8.isNull(i42)) {
                                                g8 = null;
                                            } else {
                                                g8 = C0297h.g(L8.l(i42));
                                            }
                                            x35 = i42;
                                            int i43 = x36;
                                            if (L8.isNull(i43)) {
                                                x31 = i38;
                                                i15 = i13;
                                                valueOf17 = null;
                                            } else {
                                                x31 = i38;
                                                i15 = i13;
                                                valueOf17 = Integer.valueOf((int) L8.getLong(i43));
                                            }
                                            int i44 = x37;
                                            if (L8.isNull(i44)) {
                                                l10 = null;
                                            } else {
                                                l10 = L8.l(i44);
                                            }
                                            int i45 = x38;
                                            if (L8.isNull(i45)) {
                                                m6 = null;
                                            } else {
                                                m6 = C0297h.m(L8.l(i45));
                                            }
                                            x36 = i43;
                                            int i46 = x39;
                                            if (L8.isNull(i46)) {
                                                l11 = null;
                                            } else {
                                                l11 = L8.l(i46);
                                            }
                                            x39 = i46;
                                            int i47 = x40;
                                            if (L8.isNull(i47)) {
                                                l12 = null;
                                            } else {
                                                l12 = L8.l(i47);
                                            }
                                            x40 = i47;
                                            int i48 = x41;
                                            if (L8.isNull(i48)) {
                                                x37 = i44;
                                                x38 = i45;
                                                valueOf18 = null;
                                            } else {
                                                x37 = i44;
                                                x38 = i45;
                                                valueOf18 = Integer.valueOf((int) L8.getLong(i48));
                                            }
                                            int i49 = x42;
                                            if (L8.isNull(i49)) {
                                                o9 = null;
                                            } else {
                                                o9 = C0297h.o(L8.l(i49));
                                            }
                                            int i50 = x43;
                                            if (L8.isNull(i50)) {
                                                l13 = null;
                                            } else {
                                                l13 = L8.l(i50);
                                            }
                                            x41 = i48;
                                            int i51 = x44;
                                            if (L8.isNull(i51)) {
                                                x42 = i49;
                                                x43 = i50;
                                                valueOf19 = null;
                                            } else {
                                                x42 = i49;
                                                x43 = i50;
                                                valueOf19 = Integer.valueOf((int) L8.getLong(i51));
                                            }
                                            if (valueOf19 != null) {
                                                if (valueOf19.intValue() != 0) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                bool4 = Boolean.valueOf(z8);
                                            } else {
                                                bool4 = null;
                                            }
                                            C0304c c0304c = new C0304c(j11, j12, i11, l14, a3, e9, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, bool, bool2, l6, l8, valueOf15, bool3, i14, l9, c6, g8, valueOf17, l10, m6, l11, l12, valueOf18, o9, l13, bool4);
                                            x44 = i51;
                                            Object c9 = gVar3.c(L8.getLong(x8));
                                            if (c9 != null) {
                                                List list3 = (List) c9;
                                                int i52 = x11;
                                                Object c10 = gVar4.c(L8.getLong(x8));
                                                if (c10 != null) {
                                                    arrayList2.add(new C0310i(c0304c, list3, (List) c10));
                                                    x9 = i12;
                                                    x11 = i52;
                                                    x27 = i15;
                                                    x33 = i40;
                                                } else {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        }
                                        L8.close();
                                        return arrayList2;
                                    } catch (Throwable th) {
                                        L8.close();
                                        throw th;
                                    }
                                }

                                @Override // n6.InterfaceC1163b
                                public final Object m(Object obj2) {
                                    EnumC0307f f8;
                                    int i10;
                                    Integer valueOf;
                                    Integer valueOf2;
                                    Long valueOf3;
                                    Long valueOf4;
                                    int i11;
                                    int i12;
                                    Integer valueOf5;
                                    Integer valueOf6;
                                    Integer valueOf7;
                                    Integer valueOf8;
                                    Integer valueOf9;
                                    Integer valueOf10;
                                    Long valueOf11;
                                    Long valueOf12;
                                    Integer valueOf13;
                                    Boolean bool;
                                    Integer valueOf14;
                                    Boolean bool2;
                                    String l6;
                                    String l8;
                                    Integer valueOf15;
                                    int i13;
                                    Integer valueOf16;
                                    Boolean bool3;
                                    T1.B j8;
                                    String l9;
                                    EnumC0306e d2;
                                    T1.u h8;
                                    int i14;
                                    Integer valueOf17;
                                    String l10;
                                    T1.H n3;
                                    String l11;
                                    String l12;
                                    Integer valueOf18;
                                    N p8;
                                    String l13;
                                    Integer valueOf19;
                                    Boolean bool4;
                                    boolean z8;
                                    boolean z9;
                                    boolean z10;
                                    boolean z11;
                                    int i15;
                                    switch (i9) {
                                        case 0:
                                            return f(obj2);
                                        default:
                                            long j9 = j5;
                                            C0297h c0297h = o8;
                                            D0.a aVar = (D0.a) obj2;
                                            o6.j.e(aVar, "_connection");
                                            D0.c L8 = aVar.L("SELECT * FROM action_table WHERE eventId=? ORDER BY priority");
                                            try {
                                                L8.c(1, j9);
                                                int x8 = X.x(L8, "id");
                                                int x9 = X.x(L8, "eventId");
                                                int x10 = X.x(L8, "priority");
                                                int x11 = X.x(L8, "name");
                                                int x12 = X.x(L8, "type");
                                                int x13 = X.x(L8, "clickPositionType");
                                                int x14 = X.x(L8, "x");
                                                int x15 = X.x(L8, "y");
                                                int x16 = X.x(L8, "clickOnConditionId");
                                                int x17 = X.x(L8, "pressDuration");
                                                int x18 = X.x(L8, "clickOffsetX");
                                                int x19 = X.x(L8, "clickOffsetY");
                                                int x20 = X.x(L8, "fromX");
                                                int x21 = X.x(L8, "fromY");
                                                int x22 = X.x(L8, "toX");
                                                int x23 = X.x(L8, "toY");
                                                int x24 = X.x(L8, "swipeDuration");
                                                int x25 = X.x(L8, "pauseDuration");
                                                int x26 = X.x(L8, "isAdvanced");
                                                int x27 = X.x(L8, "isBroadcast");
                                                int x28 = X.x(L8, "intent_action");
                                                int x29 = X.x(L8, "component_name");
                                                int x30 = X.x(L8, "flags");
                                                int x31 = X.x(L8, "toggle_all");
                                                int x32 = X.x(L8, "toggle_all_type");
                                                int x33 = X.x(L8, "counter_name");
                                                int x34 = X.x(L8, "counter_operation");
                                                int x35 = X.x(L8, "counter_operation_value_type");
                                                int x36 = X.x(L8, "counter_operation_value");
                                                int x37 = X.x(L8, "counter_operation_counter_name");
                                                int x38 = X.x(L8, "notification_message_type");
                                                int x39 = X.x(L8, "notification_message_text");
                                                int x40 = X.x(L8, "notification_message_counter_name");
                                                int x41 = X.x(L8, "notification_importance");
                                                int x42 = X.x(L8, "system_action_type");
                                                int x43 = X.x(L8, "text_value");
                                                int x44 = X.x(L8, "text_validate_input");
                                                int i16 = x19;
                                                t.g gVar3 = new t.g((Object) null);
                                                int i17 = x18;
                                                t.g gVar4 = new t.g((Object) null);
                                                while (L8.H()) {
                                                    int i18 = x10;
                                                    long j10 = L8.getLong(x8);
                                                    if (!gVar3.b(j10)) {
                                                        i15 = x17;
                                                        gVar3.g(j10, new ArrayList());
                                                    } else {
                                                        i15 = x17;
                                                    }
                                                    long j11 = L8.getLong(x8);
                                                    if (!gVar4.b(j11)) {
                                                        gVar4.g(j11, new ArrayList());
                                                    }
                                                    x10 = i18;
                                                    x17 = i15;
                                                }
                                                int i19 = x10;
                                                int i20 = x17;
                                                L8.reset();
                                                c0297h.t(aVar, gVar3);
                                                c0297h.r(aVar, gVar4);
                                                ArrayList arrayList2 = new ArrayList();
                                                while (L8.H()) {
                                                    long j12 = L8.getLong(x8);
                                                    long j13 = L8.getLong(x9);
                                                    int i21 = i19;
                                                    int i22 = (int) L8.getLong(i21);
                                                    String l14 = L8.l(x11);
                                                    EnumC0305d b4 = C0297h.b(L8.l(x12));
                                                    if (L8.isNull(x13)) {
                                                        f8 = null;
                                                    } else {
                                                        f8 = C0297h.f(L8.l(x13));
                                                    }
                                                    if (L8.isNull(x14)) {
                                                        i10 = x9;
                                                        i19 = i21;
                                                        valueOf = null;
                                                    } else {
                                                        i10 = x9;
                                                        i19 = i21;
                                                        valueOf = Integer.valueOf((int) L8.getLong(x14));
                                                    }
                                                    if (L8.isNull(x15)) {
                                                        valueOf2 = null;
                                                    } else {
                                                        valueOf2 = Integer.valueOf((int) L8.getLong(x15));
                                                    }
                                                    if (L8.isNull(x16)) {
                                                        valueOf3 = null;
                                                    } else {
                                                        valueOf3 = Long.valueOf(L8.getLong(x16));
                                                    }
                                                    int i23 = i20;
                                                    if (L8.isNull(i23)) {
                                                        valueOf4 = null;
                                                    } else {
                                                        valueOf4 = Long.valueOf(L8.getLong(i23));
                                                    }
                                                    int i24 = i17;
                                                    if (L8.isNull(i24)) {
                                                        i11 = i22;
                                                        i12 = i10;
                                                        valueOf5 = null;
                                                    } else {
                                                        i11 = i22;
                                                        i12 = i10;
                                                        valueOf5 = Integer.valueOf((int) L8.getLong(i24));
                                                    }
                                                    int i25 = i16;
                                                    if (L8.isNull(i25)) {
                                                        i20 = i23;
                                                        i17 = i24;
                                                        valueOf6 = null;
                                                    } else {
                                                        i20 = i23;
                                                        i17 = i24;
                                                        valueOf6 = Integer.valueOf((int) L8.getLong(i25));
                                                    }
                                                    int i26 = x20;
                                                    if (L8.isNull(i26)) {
                                                        i16 = i25;
                                                        valueOf7 = null;
                                                    } else {
                                                        i16 = i25;
                                                        valueOf7 = Integer.valueOf((int) L8.getLong(i26));
                                                    }
                                                    int i27 = x21;
                                                    if (L8.isNull(i27)) {
                                                        valueOf8 = null;
                                                    } else {
                                                        valueOf8 = Integer.valueOf((int) L8.getLong(i27));
                                                    }
                                                    int i28 = x22;
                                                    if (L8.isNull(i28)) {
                                                        x20 = i26;
                                                        x21 = i27;
                                                        valueOf9 = null;
                                                    } else {
                                                        x20 = i26;
                                                        x21 = i27;
                                                        valueOf9 = Integer.valueOf((int) L8.getLong(i28));
                                                    }
                                                    int i29 = x23;
                                                    if (L8.isNull(i29)) {
                                                        x22 = i28;
                                                        valueOf10 = null;
                                                    } else {
                                                        x22 = i28;
                                                        valueOf10 = Integer.valueOf((int) L8.getLong(i29));
                                                    }
                                                    int i30 = x24;
                                                    if (L8.isNull(i30)) {
                                                        valueOf11 = null;
                                                    } else {
                                                        valueOf11 = Long.valueOf(L8.getLong(i30));
                                                    }
                                                    int i31 = x25;
                                                    if (L8.isNull(i31)) {
                                                        valueOf12 = null;
                                                    } else {
                                                        valueOf12 = Long.valueOf(L8.getLong(i31));
                                                    }
                                                    int i32 = x26;
                                                    if (L8.isNull(i32)) {
                                                        x23 = i29;
                                                        x24 = i30;
                                                        valueOf13 = null;
                                                    } else {
                                                        x23 = i29;
                                                        x24 = i30;
                                                        valueOf13 = Integer.valueOf((int) L8.getLong(i32));
                                                    }
                                                    if (valueOf13 != null) {
                                                        if (valueOf13.intValue() != 0) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        bool = Boolean.valueOf(z11);
                                                    } else {
                                                        bool = null;
                                                    }
                                                    int i33 = x27;
                                                    if (L8.isNull(i33)) {
                                                        x25 = i31;
                                                        x26 = i32;
                                                        valueOf14 = null;
                                                    } else {
                                                        x25 = i31;
                                                        x26 = i32;
                                                        valueOf14 = Integer.valueOf((int) L8.getLong(i33));
                                                    }
                                                    if (valueOf14 != null) {
                                                        if (valueOf14.intValue() != 0) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        bool2 = Boolean.valueOf(z10);
                                                    } else {
                                                        bool2 = null;
                                                    }
                                                    int i34 = x28;
                                                    if (L8.isNull(i34)) {
                                                        l6 = null;
                                                    } else {
                                                        l6 = L8.l(i34);
                                                    }
                                                    int i35 = x29;
                                                    if (L8.isNull(i35)) {
                                                        l8 = null;
                                                    } else {
                                                        l8 = L8.l(i35);
                                                    }
                                                    int i36 = x30;
                                                    if (L8.isNull(i36)) {
                                                        x28 = i34;
                                                        x29 = i35;
                                                        valueOf15 = null;
                                                    } else {
                                                        x28 = i34;
                                                        x29 = i35;
                                                        valueOf15 = Integer.valueOf((int) L8.getLong(i36));
                                                    }
                                                    int i37 = x31;
                                                    if (L8.isNull(i37)) {
                                                        i13 = i33;
                                                        x30 = i36;
                                                        valueOf16 = null;
                                                    } else {
                                                        i13 = i33;
                                                        x30 = i36;
                                                        valueOf16 = Integer.valueOf((int) L8.getLong(i37));
                                                    }
                                                    if (valueOf16 != null) {
                                                        if (valueOf16.intValue() != 0) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        bool3 = Boolean.valueOf(z9);
                                                    } else {
                                                        bool3 = null;
                                                    }
                                                    int i38 = x32;
                                                    if (L8.isNull(i38)) {
                                                        j8 = null;
                                                    } else {
                                                        j8 = C0297h.j(L8.l(i38));
                                                    }
                                                    int i39 = x33;
                                                    if (L8.isNull(i39)) {
                                                        l9 = null;
                                                    } else {
                                                        l9 = L8.l(i39);
                                                    }
                                                    x32 = i38;
                                                    int i40 = x34;
                                                    if (L8.isNull(i40)) {
                                                        d2 = null;
                                                    } else {
                                                        d2 = C0297h.d(L8.l(i40));
                                                    }
                                                    x34 = i40;
                                                    int i41 = x35;
                                                    if (L8.isNull(i41)) {
                                                        h8 = null;
                                                    } else {
                                                        h8 = C0297h.h(L8.l(i41));
                                                    }
                                                    x35 = i41;
                                                    int i42 = x36;
                                                    if (L8.isNull(i42)) {
                                                        x31 = i37;
                                                        i14 = i13;
                                                        valueOf17 = null;
                                                    } else {
                                                        x31 = i37;
                                                        i14 = i13;
                                                        valueOf17 = Integer.valueOf((int) L8.getLong(i42));
                                                    }
                                                    int i43 = x37;
                                                    if (L8.isNull(i43)) {
                                                        l10 = null;
                                                    } else {
                                                        l10 = L8.l(i43);
                                                    }
                                                    int i44 = x38;
                                                    if (L8.isNull(i44)) {
                                                        n3 = null;
                                                    } else {
                                                        n3 = C0297h.n(L8.l(i44));
                                                    }
                                                    x36 = i42;
                                                    int i45 = x39;
                                                    if (L8.isNull(i45)) {
                                                        l11 = null;
                                                    } else {
                                                        l11 = L8.l(i45);
                                                    }
                                                    x39 = i45;
                                                    int i46 = x40;
                                                    if (L8.isNull(i46)) {
                                                        l12 = null;
                                                    } else {
                                                        l12 = L8.l(i46);
                                                    }
                                                    x40 = i46;
                                                    int i47 = x41;
                                                    if (L8.isNull(i47)) {
                                                        x37 = i43;
                                                        x38 = i44;
                                                        valueOf18 = null;
                                                    } else {
                                                        x37 = i43;
                                                        x38 = i44;
                                                        valueOf18 = Integer.valueOf((int) L8.getLong(i47));
                                                    }
                                                    int i48 = x42;
                                                    if (L8.isNull(i48)) {
                                                        p8 = null;
                                                    } else {
                                                        p8 = C0297h.p(L8.l(i48));
                                                    }
                                                    int i49 = x43;
                                                    if (L8.isNull(i49)) {
                                                        l13 = null;
                                                    } else {
                                                        l13 = L8.l(i49);
                                                    }
                                                    x41 = i47;
                                                    int i50 = x44;
                                                    if (L8.isNull(i50)) {
                                                        x42 = i48;
                                                        x43 = i49;
                                                        valueOf19 = null;
                                                    } else {
                                                        x42 = i48;
                                                        x43 = i49;
                                                        valueOf19 = Integer.valueOf((int) L8.getLong(i50));
                                                    }
                                                    if (valueOf19 != null) {
                                                        if (valueOf19.intValue() != 0) {
                                                            z8 = true;
                                                        } else {
                                                            z8 = false;
                                                        }
                                                        bool4 = Boolean.valueOf(z8);
                                                    } else {
                                                        bool4 = null;
                                                    }
                                                    C0304c c0304c = new C0304c(j12, j13, i11, l14, b4, f8, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, bool, bool2, l6, l8, valueOf15, bool3, j8, l9, d2, h8, valueOf17, l10, n3, l11, l12, valueOf18, p8, l13, bool4);
                                                    x44 = i50;
                                                    Object c6 = gVar3.c(L8.getLong(x8));
                                                    if (c6 != null) {
                                                        List list3 = (List) c6;
                                                        int i51 = x11;
                                                        Object c9 = gVar4.c(L8.getLong(x8));
                                                        if (c9 != null) {
                                                            arrayList2.add(new C0310i(c0304c, list3, (List) c9));
                                                            x9 = i12;
                                                            x11 = i51;
                                                            x27 = i14;
                                                            x33 = i39;
                                                        } else {
                                                            throw new IllegalStateException("Required value was null.");
                                                        }
                                                    } else {
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                }
                                                L8.close();
                                                return arrayList2;
                                            } catch (Throwable th) {
                                                L8.close();
                                                throw th;
                                            }
                                    }
                                }
                            }, o8.f5260b, true, true);
                            break;
                        default:
                            final int i10 = 1;
                            obj = D2.f.C(kVar2, new InterfaceC1163b() { // from class: S1.d
                                private final Object f(Object obj2) {
                                    EnumC0307f e9;
                                    int i102;
                                    Integer valueOf;
                                    Integer valueOf2;
                                    Long valueOf3;
                                    Long valueOf4;
                                    int i11;
                                    int i12;
                                    Integer valueOf5;
                                    Integer valueOf6;
                                    Integer valueOf7;
                                    Integer valueOf8;
                                    Integer valueOf9;
                                    Integer valueOf10;
                                    Long valueOf11;
                                    Long valueOf12;
                                    Integer valueOf13;
                                    Boolean bool;
                                    Integer valueOf14;
                                    Boolean bool2;
                                    String l6;
                                    String l8;
                                    Integer valueOf15;
                                    int i13;
                                    Integer valueOf16;
                                    Boolean bool3;
                                    T1.B i14;
                                    String l9;
                                    EnumC0306e c6;
                                    T1.u g8;
                                    int i15;
                                    Integer valueOf17;
                                    String l10;
                                    T1.H m6;
                                    String l11;
                                    String l12;
                                    Integer valueOf18;
                                    N o9;
                                    String l13;
                                    Integer valueOf19;
                                    Boolean bool4;
                                    boolean z8;
                                    boolean z9;
                                    boolean z10;
                                    boolean z11;
                                    int i16;
                                    long j8 = j5;
                                    C0297h c0297h = o8;
                                    D0.a aVar = (D0.a) obj2;
                                    o6.j.e(aVar, "_connection");
                                    D0.c L8 = aVar.L("SELECT * FROM action_table WHERE eventId=? ORDER BY priority");
                                    try {
                                        L8.c(1, j8);
                                        int x8 = X.x(L8, "id");
                                        int x9 = X.x(L8, "eventId");
                                        int x10 = X.x(L8, "priority");
                                        int x11 = X.x(L8, "name");
                                        int x12 = X.x(L8, "type");
                                        int x13 = X.x(L8, "clickPositionType");
                                        int x14 = X.x(L8, "x");
                                        int x15 = X.x(L8, "y");
                                        int x16 = X.x(L8, "clickOnConditionId");
                                        int x17 = X.x(L8, "pressDuration");
                                        int x18 = X.x(L8, "clickOffsetX");
                                        int x19 = X.x(L8, "clickOffsetY");
                                        int x20 = X.x(L8, "fromX");
                                        int x21 = X.x(L8, "fromY");
                                        int x22 = X.x(L8, "toX");
                                        int x23 = X.x(L8, "toY");
                                        int x24 = X.x(L8, "swipeDuration");
                                        int x25 = X.x(L8, "pauseDuration");
                                        int x26 = X.x(L8, "isAdvanced");
                                        int x27 = X.x(L8, "isBroadcast");
                                        int x28 = X.x(L8, "intent_action");
                                        int x29 = X.x(L8, "component_name");
                                        int x30 = X.x(L8, "flags");
                                        int x31 = X.x(L8, "toggle_all");
                                        int x32 = X.x(L8, "toggle_all_type");
                                        int x33 = X.x(L8, "counter_name");
                                        int x34 = X.x(L8, "counter_operation");
                                        int x35 = X.x(L8, "counter_operation_value_type");
                                        int x36 = X.x(L8, "counter_operation_value");
                                        int x37 = X.x(L8, "counter_operation_counter_name");
                                        int x38 = X.x(L8, "notification_message_type");
                                        int x39 = X.x(L8, "notification_message_text");
                                        int x40 = X.x(L8, "notification_message_counter_name");
                                        int x41 = X.x(L8, "notification_importance");
                                        int x42 = X.x(L8, "system_action_type");
                                        int x43 = X.x(L8, "text_value");
                                        int x44 = X.x(L8, "text_validate_input");
                                        int i17 = x19;
                                        t.g gVar3 = new t.g((Object) null);
                                        int i18 = x18;
                                        t.g gVar4 = new t.g((Object) null);
                                        while (L8.H()) {
                                            int i19 = x10;
                                            long j9 = L8.getLong(x8);
                                            if (!gVar3.b(j9)) {
                                                i16 = x17;
                                                gVar3.g(j9, new ArrayList());
                                            } else {
                                                i16 = x17;
                                            }
                                            long j10 = L8.getLong(x8);
                                            if (!gVar4.b(j10)) {
                                                gVar4.g(j10, new ArrayList());
                                            }
                                            x10 = i19;
                                            x17 = i16;
                                        }
                                        int i20 = x10;
                                        int i21 = x17;
                                        L8.reset();
                                        c0297h.s(aVar, gVar3);
                                        c0297h.q(aVar, gVar4);
                                        ArrayList arrayList2 = new ArrayList();
                                        while (L8.H()) {
                                            long j11 = L8.getLong(x8);
                                            long j12 = L8.getLong(x9);
                                            int i22 = i20;
                                            int i23 = (int) L8.getLong(i22);
                                            String l14 = L8.l(x11);
                                            EnumC0305d a3 = C0297h.a(L8.l(x12));
                                            if (L8.isNull(x13)) {
                                                e9 = null;
                                            } else {
                                                e9 = C0297h.e(L8.l(x13));
                                            }
                                            if (L8.isNull(x14)) {
                                                i102 = x9;
                                                i20 = i22;
                                                valueOf = null;
                                            } else {
                                                i102 = x9;
                                                i20 = i22;
                                                valueOf = Integer.valueOf((int) L8.getLong(x14));
                                            }
                                            if (L8.isNull(x15)) {
                                                valueOf2 = null;
                                            } else {
                                                valueOf2 = Integer.valueOf((int) L8.getLong(x15));
                                            }
                                            if (L8.isNull(x16)) {
                                                valueOf3 = null;
                                            } else {
                                                valueOf3 = Long.valueOf(L8.getLong(x16));
                                            }
                                            int i24 = i21;
                                            if (L8.isNull(i24)) {
                                                valueOf4 = null;
                                            } else {
                                                valueOf4 = Long.valueOf(L8.getLong(i24));
                                            }
                                            int i25 = i18;
                                            if (L8.isNull(i25)) {
                                                i11 = i23;
                                                i12 = i102;
                                                valueOf5 = null;
                                            } else {
                                                i11 = i23;
                                                i12 = i102;
                                                valueOf5 = Integer.valueOf((int) L8.getLong(i25));
                                            }
                                            int i26 = i17;
                                            if (L8.isNull(i26)) {
                                                i21 = i24;
                                                i18 = i25;
                                                valueOf6 = null;
                                            } else {
                                                i21 = i24;
                                                i18 = i25;
                                                valueOf6 = Integer.valueOf((int) L8.getLong(i26));
                                            }
                                            int i27 = x20;
                                            if (L8.isNull(i27)) {
                                                i17 = i26;
                                                valueOf7 = null;
                                            } else {
                                                i17 = i26;
                                                valueOf7 = Integer.valueOf((int) L8.getLong(i27));
                                            }
                                            int i28 = x21;
                                            if (L8.isNull(i28)) {
                                                valueOf8 = null;
                                            } else {
                                                valueOf8 = Integer.valueOf((int) L8.getLong(i28));
                                            }
                                            int i29 = x22;
                                            if (L8.isNull(i29)) {
                                                x20 = i27;
                                                x21 = i28;
                                                valueOf9 = null;
                                            } else {
                                                x20 = i27;
                                                x21 = i28;
                                                valueOf9 = Integer.valueOf((int) L8.getLong(i29));
                                            }
                                            int i30 = x23;
                                            if (L8.isNull(i30)) {
                                                x22 = i29;
                                                valueOf10 = null;
                                            } else {
                                                x22 = i29;
                                                valueOf10 = Integer.valueOf((int) L8.getLong(i30));
                                            }
                                            int i31 = x24;
                                            if (L8.isNull(i31)) {
                                                valueOf11 = null;
                                            } else {
                                                valueOf11 = Long.valueOf(L8.getLong(i31));
                                            }
                                            int i32 = x25;
                                            if (L8.isNull(i32)) {
                                                valueOf12 = null;
                                            } else {
                                                valueOf12 = Long.valueOf(L8.getLong(i32));
                                            }
                                            int i33 = x26;
                                            if (L8.isNull(i33)) {
                                                x23 = i30;
                                                x24 = i31;
                                                valueOf13 = null;
                                            } else {
                                                x23 = i30;
                                                x24 = i31;
                                                valueOf13 = Integer.valueOf((int) L8.getLong(i33));
                                            }
                                            if (valueOf13 != null) {
                                                if (valueOf13.intValue() != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                bool = Boolean.valueOf(z11);
                                            } else {
                                                bool = null;
                                            }
                                            int i34 = x27;
                                            if (L8.isNull(i34)) {
                                                x25 = i32;
                                                x26 = i33;
                                                valueOf14 = null;
                                            } else {
                                                x25 = i32;
                                                x26 = i33;
                                                valueOf14 = Integer.valueOf((int) L8.getLong(i34));
                                            }
                                            if (valueOf14 != null) {
                                                if (valueOf14.intValue() != 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                bool2 = Boolean.valueOf(z10);
                                            } else {
                                                bool2 = null;
                                            }
                                            int i35 = x28;
                                            if (L8.isNull(i35)) {
                                                l6 = null;
                                            } else {
                                                l6 = L8.l(i35);
                                            }
                                            int i36 = x29;
                                            if (L8.isNull(i36)) {
                                                l8 = null;
                                            } else {
                                                l8 = L8.l(i36);
                                            }
                                            int i37 = x30;
                                            if (L8.isNull(i37)) {
                                                x28 = i35;
                                                x29 = i36;
                                                valueOf15 = null;
                                            } else {
                                                x28 = i35;
                                                x29 = i36;
                                                valueOf15 = Integer.valueOf((int) L8.getLong(i37));
                                            }
                                            int i38 = x31;
                                            if (L8.isNull(i38)) {
                                                i13 = i34;
                                                x30 = i37;
                                                valueOf16 = null;
                                            } else {
                                                i13 = i34;
                                                x30 = i37;
                                                valueOf16 = Integer.valueOf((int) L8.getLong(i38));
                                            }
                                            if (valueOf16 != null) {
                                                if (valueOf16.intValue() != 0) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                bool3 = Boolean.valueOf(z9);
                                            } else {
                                                bool3 = null;
                                            }
                                            int i39 = x32;
                                            if (L8.isNull(i39)) {
                                                i14 = null;
                                            } else {
                                                i14 = C0297h.i(L8.l(i39));
                                            }
                                            int i40 = x33;
                                            if (L8.isNull(i40)) {
                                                l9 = null;
                                            } else {
                                                l9 = L8.l(i40);
                                            }
                                            x32 = i39;
                                            int i41 = x34;
                                            if (L8.isNull(i41)) {
                                                c6 = null;
                                            } else {
                                                c6 = C0297h.c(L8.l(i41));
                                            }
                                            x34 = i41;
                                            int i42 = x35;
                                            if (L8.isNull(i42)) {
                                                g8 = null;
                                            } else {
                                                g8 = C0297h.g(L8.l(i42));
                                            }
                                            x35 = i42;
                                            int i43 = x36;
                                            if (L8.isNull(i43)) {
                                                x31 = i38;
                                                i15 = i13;
                                                valueOf17 = null;
                                            } else {
                                                x31 = i38;
                                                i15 = i13;
                                                valueOf17 = Integer.valueOf((int) L8.getLong(i43));
                                            }
                                            int i44 = x37;
                                            if (L8.isNull(i44)) {
                                                l10 = null;
                                            } else {
                                                l10 = L8.l(i44);
                                            }
                                            int i45 = x38;
                                            if (L8.isNull(i45)) {
                                                m6 = null;
                                            } else {
                                                m6 = C0297h.m(L8.l(i45));
                                            }
                                            x36 = i43;
                                            int i46 = x39;
                                            if (L8.isNull(i46)) {
                                                l11 = null;
                                            } else {
                                                l11 = L8.l(i46);
                                            }
                                            x39 = i46;
                                            int i47 = x40;
                                            if (L8.isNull(i47)) {
                                                l12 = null;
                                            } else {
                                                l12 = L8.l(i47);
                                            }
                                            x40 = i47;
                                            int i48 = x41;
                                            if (L8.isNull(i48)) {
                                                x37 = i44;
                                                x38 = i45;
                                                valueOf18 = null;
                                            } else {
                                                x37 = i44;
                                                x38 = i45;
                                                valueOf18 = Integer.valueOf((int) L8.getLong(i48));
                                            }
                                            int i49 = x42;
                                            if (L8.isNull(i49)) {
                                                o9 = null;
                                            } else {
                                                o9 = C0297h.o(L8.l(i49));
                                            }
                                            int i50 = x43;
                                            if (L8.isNull(i50)) {
                                                l13 = null;
                                            } else {
                                                l13 = L8.l(i50);
                                            }
                                            x41 = i48;
                                            int i51 = x44;
                                            if (L8.isNull(i51)) {
                                                x42 = i49;
                                                x43 = i50;
                                                valueOf19 = null;
                                            } else {
                                                x42 = i49;
                                                x43 = i50;
                                                valueOf19 = Integer.valueOf((int) L8.getLong(i51));
                                            }
                                            if (valueOf19 != null) {
                                                if (valueOf19.intValue() != 0) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                bool4 = Boolean.valueOf(z8);
                                            } else {
                                                bool4 = null;
                                            }
                                            C0304c c0304c = new C0304c(j11, j12, i11, l14, a3, e9, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, bool, bool2, l6, l8, valueOf15, bool3, i14, l9, c6, g8, valueOf17, l10, m6, l11, l12, valueOf18, o9, l13, bool4);
                                            x44 = i51;
                                            Object c9 = gVar3.c(L8.getLong(x8));
                                            if (c9 != null) {
                                                List list3 = (List) c9;
                                                int i52 = x11;
                                                Object c10 = gVar4.c(L8.getLong(x8));
                                                if (c10 != null) {
                                                    arrayList2.add(new C0310i(c0304c, list3, (List) c10));
                                                    x9 = i12;
                                                    x11 = i52;
                                                    x27 = i15;
                                                    x33 = i40;
                                                } else {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        }
                                        L8.close();
                                        return arrayList2;
                                    } catch (Throwable th) {
                                        L8.close();
                                        throw th;
                                    }
                                }

                                @Override // n6.InterfaceC1163b
                                public final Object m(Object obj2) {
                                    EnumC0307f f8;
                                    int i102;
                                    Integer valueOf;
                                    Integer valueOf2;
                                    Long valueOf3;
                                    Long valueOf4;
                                    int i11;
                                    int i12;
                                    Integer valueOf5;
                                    Integer valueOf6;
                                    Integer valueOf7;
                                    Integer valueOf8;
                                    Integer valueOf9;
                                    Integer valueOf10;
                                    Long valueOf11;
                                    Long valueOf12;
                                    Integer valueOf13;
                                    Boolean bool;
                                    Integer valueOf14;
                                    Boolean bool2;
                                    String l6;
                                    String l8;
                                    Integer valueOf15;
                                    int i13;
                                    Integer valueOf16;
                                    Boolean bool3;
                                    T1.B j8;
                                    String l9;
                                    EnumC0306e d2;
                                    T1.u h8;
                                    int i14;
                                    Integer valueOf17;
                                    String l10;
                                    T1.H n3;
                                    String l11;
                                    String l12;
                                    Integer valueOf18;
                                    N p8;
                                    String l13;
                                    Integer valueOf19;
                                    Boolean bool4;
                                    boolean z8;
                                    boolean z9;
                                    boolean z10;
                                    boolean z11;
                                    int i15;
                                    switch (i10) {
                                        case 0:
                                            return f(obj2);
                                        default:
                                            long j9 = j5;
                                            C0297h c0297h = o8;
                                            D0.a aVar = (D0.a) obj2;
                                            o6.j.e(aVar, "_connection");
                                            D0.c L8 = aVar.L("SELECT * FROM action_table WHERE eventId=? ORDER BY priority");
                                            try {
                                                L8.c(1, j9);
                                                int x8 = X.x(L8, "id");
                                                int x9 = X.x(L8, "eventId");
                                                int x10 = X.x(L8, "priority");
                                                int x11 = X.x(L8, "name");
                                                int x12 = X.x(L8, "type");
                                                int x13 = X.x(L8, "clickPositionType");
                                                int x14 = X.x(L8, "x");
                                                int x15 = X.x(L8, "y");
                                                int x16 = X.x(L8, "clickOnConditionId");
                                                int x17 = X.x(L8, "pressDuration");
                                                int x18 = X.x(L8, "clickOffsetX");
                                                int x19 = X.x(L8, "clickOffsetY");
                                                int x20 = X.x(L8, "fromX");
                                                int x21 = X.x(L8, "fromY");
                                                int x22 = X.x(L8, "toX");
                                                int x23 = X.x(L8, "toY");
                                                int x24 = X.x(L8, "swipeDuration");
                                                int x25 = X.x(L8, "pauseDuration");
                                                int x26 = X.x(L8, "isAdvanced");
                                                int x27 = X.x(L8, "isBroadcast");
                                                int x28 = X.x(L8, "intent_action");
                                                int x29 = X.x(L8, "component_name");
                                                int x30 = X.x(L8, "flags");
                                                int x31 = X.x(L8, "toggle_all");
                                                int x32 = X.x(L8, "toggle_all_type");
                                                int x33 = X.x(L8, "counter_name");
                                                int x34 = X.x(L8, "counter_operation");
                                                int x35 = X.x(L8, "counter_operation_value_type");
                                                int x36 = X.x(L8, "counter_operation_value");
                                                int x37 = X.x(L8, "counter_operation_counter_name");
                                                int x38 = X.x(L8, "notification_message_type");
                                                int x39 = X.x(L8, "notification_message_text");
                                                int x40 = X.x(L8, "notification_message_counter_name");
                                                int x41 = X.x(L8, "notification_importance");
                                                int x42 = X.x(L8, "system_action_type");
                                                int x43 = X.x(L8, "text_value");
                                                int x44 = X.x(L8, "text_validate_input");
                                                int i16 = x19;
                                                t.g gVar3 = new t.g((Object) null);
                                                int i17 = x18;
                                                t.g gVar4 = new t.g((Object) null);
                                                while (L8.H()) {
                                                    int i18 = x10;
                                                    long j10 = L8.getLong(x8);
                                                    if (!gVar3.b(j10)) {
                                                        i15 = x17;
                                                        gVar3.g(j10, new ArrayList());
                                                    } else {
                                                        i15 = x17;
                                                    }
                                                    long j11 = L8.getLong(x8);
                                                    if (!gVar4.b(j11)) {
                                                        gVar4.g(j11, new ArrayList());
                                                    }
                                                    x10 = i18;
                                                    x17 = i15;
                                                }
                                                int i19 = x10;
                                                int i20 = x17;
                                                L8.reset();
                                                c0297h.t(aVar, gVar3);
                                                c0297h.r(aVar, gVar4);
                                                ArrayList arrayList2 = new ArrayList();
                                                while (L8.H()) {
                                                    long j12 = L8.getLong(x8);
                                                    long j13 = L8.getLong(x9);
                                                    int i21 = i19;
                                                    int i22 = (int) L8.getLong(i21);
                                                    String l14 = L8.l(x11);
                                                    EnumC0305d b4 = C0297h.b(L8.l(x12));
                                                    if (L8.isNull(x13)) {
                                                        f8 = null;
                                                    } else {
                                                        f8 = C0297h.f(L8.l(x13));
                                                    }
                                                    if (L8.isNull(x14)) {
                                                        i102 = x9;
                                                        i19 = i21;
                                                        valueOf = null;
                                                    } else {
                                                        i102 = x9;
                                                        i19 = i21;
                                                        valueOf = Integer.valueOf((int) L8.getLong(x14));
                                                    }
                                                    if (L8.isNull(x15)) {
                                                        valueOf2 = null;
                                                    } else {
                                                        valueOf2 = Integer.valueOf((int) L8.getLong(x15));
                                                    }
                                                    if (L8.isNull(x16)) {
                                                        valueOf3 = null;
                                                    } else {
                                                        valueOf3 = Long.valueOf(L8.getLong(x16));
                                                    }
                                                    int i23 = i20;
                                                    if (L8.isNull(i23)) {
                                                        valueOf4 = null;
                                                    } else {
                                                        valueOf4 = Long.valueOf(L8.getLong(i23));
                                                    }
                                                    int i24 = i17;
                                                    if (L8.isNull(i24)) {
                                                        i11 = i22;
                                                        i12 = i102;
                                                        valueOf5 = null;
                                                    } else {
                                                        i11 = i22;
                                                        i12 = i102;
                                                        valueOf5 = Integer.valueOf((int) L8.getLong(i24));
                                                    }
                                                    int i25 = i16;
                                                    if (L8.isNull(i25)) {
                                                        i20 = i23;
                                                        i17 = i24;
                                                        valueOf6 = null;
                                                    } else {
                                                        i20 = i23;
                                                        i17 = i24;
                                                        valueOf6 = Integer.valueOf((int) L8.getLong(i25));
                                                    }
                                                    int i26 = x20;
                                                    if (L8.isNull(i26)) {
                                                        i16 = i25;
                                                        valueOf7 = null;
                                                    } else {
                                                        i16 = i25;
                                                        valueOf7 = Integer.valueOf((int) L8.getLong(i26));
                                                    }
                                                    int i27 = x21;
                                                    if (L8.isNull(i27)) {
                                                        valueOf8 = null;
                                                    } else {
                                                        valueOf8 = Integer.valueOf((int) L8.getLong(i27));
                                                    }
                                                    int i28 = x22;
                                                    if (L8.isNull(i28)) {
                                                        x20 = i26;
                                                        x21 = i27;
                                                        valueOf9 = null;
                                                    } else {
                                                        x20 = i26;
                                                        x21 = i27;
                                                        valueOf9 = Integer.valueOf((int) L8.getLong(i28));
                                                    }
                                                    int i29 = x23;
                                                    if (L8.isNull(i29)) {
                                                        x22 = i28;
                                                        valueOf10 = null;
                                                    } else {
                                                        x22 = i28;
                                                        valueOf10 = Integer.valueOf((int) L8.getLong(i29));
                                                    }
                                                    int i30 = x24;
                                                    if (L8.isNull(i30)) {
                                                        valueOf11 = null;
                                                    } else {
                                                        valueOf11 = Long.valueOf(L8.getLong(i30));
                                                    }
                                                    int i31 = x25;
                                                    if (L8.isNull(i31)) {
                                                        valueOf12 = null;
                                                    } else {
                                                        valueOf12 = Long.valueOf(L8.getLong(i31));
                                                    }
                                                    int i32 = x26;
                                                    if (L8.isNull(i32)) {
                                                        x23 = i29;
                                                        x24 = i30;
                                                        valueOf13 = null;
                                                    } else {
                                                        x23 = i29;
                                                        x24 = i30;
                                                        valueOf13 = Integer.valueOf((int) L8.getLong(i32));
                                                    }
                                                    if (valueOf13 != null) {
                                                        if (valueOf13.intValue() != 0) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        bool = Boolean.valueOf(z11);
                                                    } else {
                                                        bool = null;
                                                    }
                                                    int i33 = x27;
                                                    if (L8.isNull(i33)) {
                                                        x25 = i31;
                                                        x26 = i32;
                                                        valueOf14 = null;
                                                    } else {
                                                        x25 = i31;
                                                        x26 = i32;
                                                        valueOf14 = Integer.valueOf((int) L8.getLong(i33));
                                                    }
                                                    if (valueOf14 != null) {
                                                        if (valueOf14.intValue() != 0) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        bool2 = Boolean.valueOf(z10);
                                                    } else {
                                                        bool2 = null;
                                                    }
                                                    int i34 = x28;
                                                    if (L8.isNull(i34)) {
                                                        l6 = null;
                                                    } else {
                                                        l6 = L8.l(i34);
                                                    }
                                                    int i35 = x29;
                                                    if (L8.isNull(i35)) {
                                                        l8 = null;
                                                    } else {
                                                        l8 = L8.l(i35);
                                                    }
                                                    int i36 = x30;
                                                    if (L8.isNull(i36)) {
                                                        x28 = i34;
                                                        x29 = i35;
                                                        valueOf15 = null;
                                                    } else {
                                                        x28 = i34;
                                                        x29 = i35;
                                                        valueOf15 = Integer.valueOf((int) L8.getLong(i36));
                                                    }
                                                    int i37 = x31;
                                                    if (L8.isNull(i37)) {
                                                        i13 = i33;
                                                        x30 = i36;
                                                        valueOf16 = null;
                                                    } else {
                                                        i13 = i33;
                                                        x30 = i36;
                                                        valueOf16 = Integer.valueOf((int) L8.getLong(i37));
                                                    }
                                                    if (valueOf16 != null) {
                                                        if (valueOf16.intValue() != 0) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        bool3 = Boolean.valueOf(z9);
                                                    } else {
                                                        bool3 = null;
                                                    }
                                                    int i38 = x32;
                                                    if (L8.isNull(i38)) {
                                                        j8 = null;
                                                    } else {
                                                        j8 = C0297h.j(L8.l(i38));
                                                    }
                                                    int i39 = x33;
                                                    if (L8.isNull(i39)) {
                                                        l9 = null;
                                                    } else {
                                                        l9 = L8.l(i39);
                                                    }
                                                    x32 = i38;
                                                    int i40 = x34;
                                                    if (L8.isNull(i40)) {
                                                        d2 = null;
                                                    } else {
                                                        d2 = C0297h.d(L8.l(i40));
                                                    }
                                                    x34 = i40;
                                                    int i41 = x35;
                                                    if (L8.isNull(i41)) {
                                                        h8 = null;
                                                    } else {
                                                        h8 = C0297h.h(L8.l(i41));
                                                    }
                                                    x35 = i41;
                                                    int i42 = x36;
                                                    if (L8.isNull(i42)) {
                                                        x31 = i37;
                                                        i14 = i13;
                                                        valueOf17 = null;
                                                    } else {
                                                        x31 = i37;
                                                        i14 = i13;
                                                        valueOf17 = Integer.valueOf((int) L8.getLong(i42));
                                                    }
                                                    int i43 = x37;
                                                    if (L8.isNull(i43)) {
                                                        l10 = null;
                                                    } else {
                                                        l10 = L8.l(i43);
                                                    }
                                                    int i44 = x38;
                                                    if (L8.isNull(i44)) {
                                                        n3 = null;
                                                    } else {
                                                        n3 = C0297h.n(L8.l(i44));
                                                    }
                                                    x36 = i42;
                                                    int i45 = x39;
                                                    if (L8.isNull(i45)) {
                                                        l11 = null;
                                                    } else {
                                                        l11 = L8.l(i45);
                                                    }
                                                    x39 = i45;
                                                    int i46 = x40;
                                                    if (L8.isNull(i46)) {
                                                        l12 = null;
                                                    } else {
                                                        l12 = L8.l(i46);
                                                    }
                                                    x40 = i46;
                                                    int i47 = x41;
                                                    if (L8.isNull(i47)) {
                                                        x37 = i43;
                                                        x38 = i44;
                                                        valueOf18 = null;
                                                    } else {
                                                        x37 = i43;
                                                        x38 = i44;
                                                        valueOf18 = Integer.valueOf((int) L8.getLong(i47));
                                                    }
                                                    int i48 = x42;
                                                    if (L8.isNull(i48)) {
                                                        p8 = null;
                                                    } else {
                                                        p8 = C0297h.p(L8.l(i48));
                                                    }
                                                    int i49 = x43;
                                                    if (L8.isNull(i49)) {
                                                        l13 = null;
                                                    } else {
                                                        l13 = L8.l(i49);
                                                    }
                                                    x41 = i47;
                                                    int i50 = x44;
                                                    if (L8.isNull(i50)) {
                                                        x42 = i48;
                                                        x43 = i49;
                                                        valueOf19 = null;
                                                    } else {
                                                        x42 = i48;
                                                        x43 = i49;
                                                        valueOf19 = Integer.valueOf((int) L8.getLong(i50));
                                                    }
                                                    if (valueOf19 != null) {
                                                        if (valueOf19.intValue() != 0) {
                                                            z8 = true;
                                                        } else {
                                                            z8 = false;
                                                        }
                                                        bool4 = Boolean.valueOf(z8);
                                                    } else {
                                                        bool4 = null;
                                                    }
                                                    C0304c c0304c = new C0304c(j12, j13, i11, l14, b4, f8, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, bool, bool2, l6, l8, valueOf15, bool3, j8, l9, d2, h8, valueOf17, l10, n3, l11, l12, valueOf18, p8, l13, bool4);
                                                    x44 = i50;
                                                    Object c6 = gVar3.c(L8.getLong(x8));
                                                    if (c6 != null) {
                                                        List list3 = (List) c6;
                                                        int i51 = x11;
                                                        Object c9 = gVar4.c(L8.getLong(x8));
                                                        if (c9 != null) {
                                                            arrayList2.add(new C0310i(c0304c, list3, (List) c9));
                                                            x9 = i12;
                                                            x11 = i51;
                                                            x27 = i14;
                                                            x33 = i39;
                                                        } else {
                                                            throw new IllegalStateException("Required value was null.");
                                                        }
                                                    } else {
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                }
                                                L8.close();
                                                return arrayList2;
                                            } catch (Throwable th) {
                                                L8.close();
                                                throw th;
                                            }
                                    }
                                }
                            }, o8.f5260b, true, true);
                            break;
                    }
                }
                List list3 = (List) obj;
                arrayList = new ArrayList(AbstractC0438m.d0(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0310i) it.next()).f5599a);
                }
                gVar = new R.g(10);
                lVar = new l(j5, this, null);
                kVar2.f9544h = null;
                kVar2.f9545i = gVar;
                kVar2.f9543g = j5;
                kVar2.f9546l = 2;
                if (gVar.M(arrayList, list2, lVar, kVar2) != enumC0646a) {
                    gVar2 = gVar;
                    Objects.toString(gVar2);
                    C0297h o72 = ((ScenarioDatabase) i0Var.f()).o();
                    A1.o oVar4 = new A1.o(2, o72, C0297h.class, "addActions", "addActions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 14);
                    A1.o oVar22 = new A1.o(2, o72, C0297h.class, "updateActions", "updateActions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 15);
                    A1.o oVar32 = new A1.o(2, o72, C0297h.class, "deleteActions", "deleteActions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 16);
                    m mVar2 = new m(this, null);
                    kVar2.f9544h = null;
                    kVar2.f9545i = null;
                    kVar2.f9543g = j5;
                    kVar2.f9546l = 3;
                }
                return enumC0646a;
            }
        }
        kVar = new k(this, abstractC0713c);
        kVar2 = kVar;
        Object obj2 = kVar2.j;
        i4 = kVar2.f9546l;
        i0 i0Var2 = this.f9602c;
        enumC0646a = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        List list32 = (List) obj2;
        arrayList = new ArrayList(AbstractC0438m.d0(list32, 10));
        it = list32.iterator();
        while (it.hasNext()) {
        }
        gVar = new R.g(10);
        lVar = new l(j5, this, null);
        kVar2.f9544h = null;
        kVar2.f9545i = gVar;
        kVar2.f9543g = j5;
        kVar2.f9546l = 2;
        if (gVar.M(arrayList, list2, lVar, kVar2) != enumC0646a) {
        }
        return enumC0646a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x011f, code lost:
    
        if (r4.w(r12, r12, r12, r8, r10) != r11) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(long j, List list, InterfaceC1164c interfaceC1164c, AbstractC0713c abstractC0713c) {
        o oVar;
        o oVar2;
        Object obj;
        int i4;
        EnumC0646a enumC0646a;
        R.g gVar;
        List list2;
        InterfaceC1164c interfaceC1164c2;
        R.g gVar2;
        p pVar;
        R.g gVar3;
        InterfaceC1164c interfaceC1164c3;
        long j5 = j;
        if (abstractC0713c instanceof o) {
            oVar = (o) abstractC0713c;
            int i8 = oVar.f9561n;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                oVar.f9561n = i8 - Integer.MIN_VALUE;
                oVar2 = oVar;
                obj = oVar2.f9559l;
                i4 = oVar2.f9561n;
                i0 i0Var = this.f9602c;
                enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                Z5.a.d(obj);
                                return Z5.y.f7506a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j5 = oVar2.f9556g;
                        gVar3 = oVar2.j;
                        interfaceC1164c3 = oVar2.f9558i;
                        Z5.a.d(obj);
                        Objects.toString(gVar3);
                        S1.p p8 = ((ScenarioDatabase) i0Var.f()).p();
                        A1.o oVar3 = new A1.o(2, p8, S1.p.class, "addConditions", "addConditions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 17);
                        A1.o oVar4 = new A1.o(2, p8, S1.p.class, "updateConditions", "updateConditions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 18);
                        A1.o oVar5 = new A1.o(2, p8, S1.p.class, "deleteConditions", "deleteConditions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 19);
                        m mVar = new m(interfaceC1164c3, this, null);
                        oVar2.f9557h = null;
                        oVar2.f9558i = null;
                        oVar2.j = null;
                        oVar2.k = null;
                        oVar2.f9556g = j5;
                        oVar2.f9561n = 3;
                    } else {
                        j5 = oVar2.f9556g;
                        gVar = oVar2.k;
                        gVar2 = oVar2.j;
                        InterfaceC1164c interfaceC1164c4 = oVar2.f9558i;
                        List list3 = oVar2.f9557h;
                        Z5.a.d(obj);
                        interfaceC1164c2 = interfaceC1164c4;
                        list2 = list3;
                    }
                } else {
                    Z5.a.d(obj);
                    gVar = new R.g(10);
                    S1.p p9 = ((ScenarioDatabase) i0Var.f()).p();
                    list2 = list;
                    oVar2.f9557h = list2;
                    interfaceC1164c2 = interfaceC1164c;
                    oVar2.f9558i = interfaceC1164c2;
                    oVar2.j = gVar;
                    oVar2.k = gVar;
                    oVar2.f9556g = j5;
                    oVar2.f9561n = 1;
                    switch (p9.f5285a) {
                        case 0:
                            obj = D2.f.C(oVar2, new C0290a(4, j5, p9), p9.f5286b, true, false);
                            break;
                        default:
                            obj = D2.f.C(oVar2, new C0290a(6, j5, p9), p9.f5286b, true, false);
                            break;
                    }
                    if (obj != enumC0646a) {
                        gVar2 = gVar;
                    }
                    return enumC0646a;
                }
                pVar = new p(j5, null);
                oVar2.f9557h = null;
                oVar2.f9558i = interfaceC1164c2;
                oVar2.j = gVar2;
                oVar2.k = null;
                oVar2.f9556g = j5;
                oVar2.f9561n = 2;
                if (gVar.M((Collection) obj, list2, pVar, oVar2) != enumC0646a) {
                    gVar3 = gVar2;
                    interfaceC1164c3 = interfaceC1164c2;
                    Objects.toString(gVar3);
                    S1.p p82 = ((ScenarioDatabase) i0Var.f()).p();
                    A1.o oVar32 = new A1.o(2, p82, S1.p.class, "addConditions", "addConditions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 17);
                    A1.o oVar42 = new A1.o(2, p82, S1.p.class, "updateConditions", "updateConditions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 18);
                    A1.o oVar52 = new A1.o(2, p82, S1.p.class, "deleteConditions", "deleteConditions(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 19);
                    m mVar2 = new m(interfaceC1164c3, this, null);
                    oVar2.f9557h = null;
                    oVar2.f9558i = null;
                    oVar2.j = null;
                    oVar2.k = null;
                    oVar2.f9556g = j5;
                    oVar2.f9561n = 3;
                }
                return enumC0646a;
            }
        }
        oVar = new o(this, abstractC0713c);
        oVar2 = oVar;
        obj = oVar2.f9559l;
        i4 = oVar2.f9561n;
        i0 i0Var2 = this.f9602c;
        enumC0646a = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        pVar = new p(j5, null);
        oVar2.f9557h = null;
        oVar2.f9558i = interfaceC1164c2;
        oVar2.j = gVar2;
        oVar2.k = null;
        oVar2.f9556g = j5;
        oVar2.f9561n = 2;
        if (gVar.M((Collection) obj, list2, pVar, oVar2) != enumC0646a) {
        }
        return enumC0646a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0104, code lost:
    
        if (r4.w(r12, r12, r12, null, r10) != r11) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(long j, List list, AbstractC0713c abstractC0713c) {
        q qVar;
        q qVar2;
        Object obj;
        int i4;
        EnumC0646a enumC0646a;
        R.g gVar;
        List list2;
        R.g gVar2;
        r rVar;
        R.g gVar3;
        long j5 = j;
        if (abstractC0713c instanceof q) {
            qVar = (q) abstractC0713c;
            int i8 = qVar.f9568m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                qVar.f9568m = i8 - Integer.MIN_VALUE;
                qVar2 = qVar;
                obj = qVar2.k;
                i4 = qVar2.f9568m;
                i0 i0Var = this.f9602c;
                enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                Z5.a.d(obj);
                                return Z5.y.f7506a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j5 = qVar2.f9564g;
                        gVar3 = qVar2.f9566i;
                        Z5.a.d(obj);
                        Objects.toString(gVar3);
                        C0297h o7 = ((ScenarioDatabase) i0Var.f()).o();
                        A1.o oVar = new A1.o(2, o7, C0297h.class, "addEventToggles", "addEventToggles(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 20);
                        A1.o oVar2 = new A1.o(2, o7, C0297h.class, "updateEventToggles", "updateEventToggles(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 21);
                        A1.o oVar3 = new A1.o(2, o7, C0297h.class, "deleteEventToggles", "deleteEventToggles(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 22);
                        qVar2.f9565h = null;
                        qVar2.f9566i = null;
                        qVar2.j = null;
                        qVar2.f9564g = j5;
                        qVar2.f9568m = 3;
                    } else {
                        j5 = qVar2.f9564g;
                        gVar = qVar2.j;
                        gVar2 = qVar2.f9566i;
                        list2 = qVar2.f9565h;
                        Z5.a.d(obj);
                    }
                } else {
                    Z5.a.d(obj);
                    gVar = new R.g(10);
                    C0297h o8 = ((ScenarioDatabase) i0Var.f()).o();
                    list2 = list;
                    qVar2.f9565h = list2;
                    qVar2.f9566i = gVar;
                    qVar2.j = gVar;
                    qVar2.f9564g = j5;
                    qVar2.f9568m = 1;
                    switch (o8.f5259a) {
                        case 0:
                            obj = D2.f.C(qVar2, new C0290a(0, j5, o8), o8.f5260b, true, false);
                            break;
                        default:
                            obj = D2.f.C(qVar2, new C0290a(3, j5, o8), o8.f5260b, true, false);
                            break;
                    }
                    if (obj != enumC0646a) {
                        gVar2 = gVar;
                    }
                    return enumC0646a;
                }
                rVar = new r(j5, this, null);
                qVar2.f9565h = null;
                qVar2.f9566i = gVar2;
                qVar2.j = null;
                qVar2.f9564g = j5;
                qVar2.f9568m = 2;
                if (gVar.M((Collection) obj, list2, rVar, qVar2) != enumC0646a) {
                    gVar3 = gVar2;
                    Objects.toString(gVar3);
                    C0297h o72 = ((ScenarioDatabase) i0Var.f()).o();
                    A1.o oVar4 = new A1.o(2, o72, C0297h.class, "addEventToggles", "addEventToggles(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 20);
                    A1.o oVar22 = new A1.o(2, o72, C0297h.class, "updateEventToggles", "updateEventToggles(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 21);
                    A1.o oVar32 = new A1.o(2, o72, C0297h.class, "deleteEventToggles", "deleteEventToggles(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 22);
                    qVar2.f9565h = null;
                    qVar2.f9566i = null;
                    qVar2.j = null;
                    qVar2.f9564g = j5;
                    qVar2.f9568m = 3;
                }
                return enumC0646a;
            }
        }
        qVar = new q(this, abstractC0713c);
        qVar2 = qVar;
        obj = qVar2.k;
        i4 = qVar2.f9568m;
        i0 i0Var2 = this.f9602c;
        enumC0646a = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        rVar = new r(j5, this, null);
        qVar2.f9565h = null;
        qVar2.f9566i = gVar2;
        qVar2.j = null;
        qVar2.f9564g = j5;
        qVar2.f9568m = 2;
        if (gVar.M((Collection) obj, list2, rVar, qVar2) != enumC0646a) {
        }
        return enumC0646a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0105, code lost:
    
        if (r4.w(r12, r12, r12, null, r10) != r11) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(long j, List list, AbstractC0713c abstractC0713c) {
        w wVar;
        w wVar2;
        Object obj;
        int i4;
        EnumC0646a enumC0646a;
        R.g gVar;
        List list2;
        R.g gVar2;
        x xVar;
        R.g gVar3;
        long j5 = j;
        if (abstractC0713c instanceof w) {
            wVar = (w) abstractC0713c;
            int i8 = wVar.f9594m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                wVar.f9594m = i8 - Integer.MIN_VALUE;
                wVar2 = wVar;
                obj = wVar2.k;
                i4 = wVar2.f9594m;
                i0 i0Var = this.f9602c;
                enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                Z5.a.d(obj);
                                return Z5.y.f7506a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j5 = wVar2.f9590g;
                        gVar3 = wVar2.f9592i;
                        Z5.a.d(obj);
                        Objects.toString(gVar3);
                        C0297h o7 = ((ScenarioDatabase) i0Var.f()).o();
                        A1.o oVar = new A1.o(2, o7, C0297h.class, "addIntentExtras", "addIntentExtras(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 26);
                        A1.o oVar2 = new A1.o(2, o7, C0297h.class, "updateIntentExtras", "updateIntentExtras(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 27);
                        A1.o oVar3 = new A1.o(2, o7, C0297h.class, "deleteIntentExtras", "deleteIntentExtras(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 28);
                        wVar2.f9591h = null;
                        wVar2.f9592i = null;
                        wVar2.j = null;
                        wVar2.f9590g = j5;
                        wVar2.f9594m = 3;
                    } else {
                        j5 = wVar2.f9590g;
                        gVar = wVar2.j;
                        gVar2 = wVar2.f9592i;
                        list2 = wVar2.f9591h;
                        Z5.a.d(obj);
                    }
                } else {
                    Z5.a.d(obj);
                    gVar = new R.g(10);
                    C0297h o8 = ((ScenarioDatabase) i0Var.f()).o();
                    list2 = list;
                    wVar2.f9591h = list2;
                    wVar2.f9592i = gVar;
                    wVar2.j = gVar;
                    wVar2.f9590g = j5;
                    wVar2.f9594m = 1;
                    switch (o8.f5259a) {
                        case 0:
                            obj = D2.f.C(wVar2, new C0290a(1, j5, o8), o8.f5260b, true, false);
                            break;
                        default:
                            obj = D2.f.C(wVar2, new C0290a(2, j5, o8), o8.f5260b, true, false);
                            break;
                    }
                    if (obj != enumC0646a) {
                        gVar2 = gVar;
                    }
                    return enumC0646a;
                }
                xVar = new x(j5, null);
                wVar2.f9591h = null;
                wVar2.f9592i = gVar2;
                wVar2.j = null;
                wVar2.f9590g = j5;
                wVar2.f9594m = 2;
                if (gVar.M((Collection) obj, list2, xVar, wVar2) != enumC0646a) {
                    gVar3 = gVar2;
                    Objects.toString(gVar3);
                    C0297h o72 = ((ScenarioDatabase) i0Var.f()).o();
                    A1.o oVar4 = new A1.o(2, o72, C0297h.class, "addIntentExtras", "addIntentExtras(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 26);
                    A1.o oVar22 = new A1.o(2, o72, C0297h.class, "updateIntentExtras", "updateIntentExtras(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 27);
                    A1.o oVar32 = new A1.o(2, o72, C0297h.class, "deleteIntentExtras", "deleteIntentExtras(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 28);
                    wVar2.f9591h = null;
                    wVar2.f9592i = null;
                    wVar2.j = null;
                    wVar2.f9590g = j5;
                    wVar2.f9594m = 3;
                }
                return enumC0646a;
            }
        }
        wVar = new w(this, abstractC0713c);
        wVar2 = wVar;
        obj = wVar2.k;
        i4 = wVar2.f9594m;
        i0 i0Var2 = this.f9602c;
        enumC0646a = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        xVar = new x(j5, null);
        wVar2.f9591h = null;
        wVar2.f9592i = gVar2;
        wVar2.j = null;
        wVar2.f9590g = j5;
        wVar2.f9594m = 2;
        if (gVar.M((Collection) obj, list2, xVar, wVar2) != enumC0646a) {
        }
        return enumC0646a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(C1001a c1001a, C0535c c0535c, A1.o oVar, AbstractC0713c abstractC0713c) {
        y yVar;
        int i4;
        Exception exc;
        if (abstractC0713c instanceof y) {
            yVar = (y) abstractC0713c;
            int i8 = yVar.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                yVar.k = i8 - Integer.MIN_VALUE;
                Object obj = yVar.f9599i;
                i4 = yVar.k;
                boolean z8 = true;
                if (i4 == 0) {
                    if (i4 == 1) {
                        c0535c = yVar.f9598h;
                        c1001a = yVar.f9597g;
                        try {
                            Z5.a.d(obj);
                        } catch (Exception e9) {
                            e = e9;
                            exc = e;
                            Log.e("ScenarioDataSource", "Error while updating scenario\n* Scenario=" + c1001a + "\n* Events=" + c0535c + "\n", exc);
                            z8 = false;
                            return Boolean.valueOf(z8);
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    Objects.toString(c1001a.f12190a);
                    try {
                        u0.u uVar = (u0.u) this.f9602c.f();
                        try {
                            A a3 = new A(this, c1001a, c0535c, oVar, null);
                            yVar.f9597g = c1001a;
                            yVar.f9598h = c0535c;
                            yVar.k = 1;
                            Object A2 = AbstractC0862a.A(uVar, a3, yVar);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (A2 == enumC0646a) {
                                return enumC0646a;
                            }
                        } catch (Exception e10) {
                            exc = e10;
                            c1001a = c1001a;
                            c0535c = c0535c;
                            Log.e("ScenarioDataSource", "Error while updating scenario\n* Scenario=" + c1001a + "\n* Events=" + c0535c + "\n", exc);
                            z8 = false;
                            return Boolean.valueOf(z8);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        exc = e;
                        Log.e("ScenarioDataSource", "Error while updating scenario\n* Scenario=" + c1001a + "\n* Events=" + c0535c + "\n", exc);
                        z8 = false;
                        return Boolean.valueOf(z8);
                    }
                }
                return Boolean.valueOf(z8);
            }
        }
        yVar = new y(this, abstractC0713c);
        Object obj2 = yVar.f9599i;
        i4 = yVar.k;
        boolean z82 = true;
        if (i4 == 0) {
        }
        return Boolean.valueOf(z82);
    }
}
