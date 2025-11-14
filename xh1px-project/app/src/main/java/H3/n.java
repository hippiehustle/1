package H3;

import D4.C0040p;
import O7.V;
import O7.i0;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import android.util.Log;
import b6.C0535c;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import g2.C0777a;
import j2.AbstractC0901a;
import j2.C0902b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.AbstractC0951a;
import k2.C0952b;
import k2.C0953c;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import l2.C1001a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final b2.r f1946a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.e f1947b;

    /* renamed from: c, reason: collision with root package name */
    public final C3.e f1948c;

    /* renamed from: d, reason: collision with root package name */
    public final b f1949d;

    /* renamed from: e, reason: collision with root package name */
    public final y f1950e;

    /* renamed from: f, reason: collision with root package name */
    public final C0040p f1951f;

    /* renamed from: g, reason: collision with root package name */
    public final C4.e f1952g;

    /* renamed from: h, reason: collision with root package name */
    public final g f1953h;

    /* renamed from: i, reason: collision with root package name */
    public final i f1954i;
    public final g j;
    public final i k;

    public n(b2.r rVar, q1.e eVar) {
        o6.j.e(rVar, "repository");
        o6.j.e(eVar, "bitmapRepository");
        this.f1946a = rVar;
        this.f1947b = eVar;
        C3.e eVar2 = new C3.e();
        this.f1948c = eVar2;
        this.f1949d = new b(rVar, eVar, eVar2);
        this.f1950e = new y(rVar, eVar2);
        i0 i0Var = eVar2.f597d;
        this.f1951f = new C0040p(i0Var, 1);
        this.f1952g = new C4.e(i0Var, 2);
        int i4 = 3;
        InterfaceC0617c interfaceC0617c = null;
        C3.d dVar = new C3.d(i4, interfaceC0617c, 1);
        i0 i0Var2 = eVar2.f601h;
        int i8 = 0;
        this.f1953h = new g(V.u(i0Var2, dVar), i8);
        this.f1954i = new i(V.u(i0Var2, new C3.d(i4, interfaceC0617c, 2)), i8);
        this.j = new g(V.u(i0Var2, new C3.d(i4, interfaceC0617c, 3)), 1);
        this.k = new i(V.u(i0Var2, new C3.d(i4, interfaceC0617c, 4)), 1);
    }

    public final Z5.y a() {
        D3.d dVar;
        E3.a aVar = (E3.a) this.f1948c.f601h.f();
        if (aVar != null && (dVar = aVar.f1192l) != null) {
            dVar.a();
            return Z5.y.f7506a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC0713c abstractC0713c) {
        c cVar;
        Object obj;
        int i4;
        if (abstractC0713c instanceof c) {
            cVar = (c) abstractC0713c;
            int i8 = cVar.f1915i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f1915i = i8 - Integer.MIN_VALUE;
                obj = cVar.f1913g;
                i4 = cVar.f1915i;
                C3.e eVar = this.f1948c;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    C1001a c1001a = (C1001a) eVar.f597d.f();
                    if (c1001a == null) {
                        return Boolean.FALSE;
                    }
                    C0535c a3 = eVar.a();
                    cVar.f1915i = 1;
                    b2.r rVar = this.f1946a;
                    obj = rVar.f9111a.k(c1001a, a3, new A1.o(2, rVar, b2.r.class, "clearRemovedConditionsBitmaps", "clearRemovedConditionsBitmaps(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 12), cVar);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                eVar.f599f.f();
                eVar.f600g.f();
                eVar.f594a.g(null);
                eVar.f595b.g(null);
                this.f1949d.j();
                return Boolean.TRUE;
            }
        }
        cVar = new c(this, abstractC0713c);
        obj = cVar.f1913g;
        i4 = cVar.f1915i;
        C3.e eVar2 = this.f1948c;
        if (i4 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void c(f2.a aVar) {
        C3.a aVar2;
        o6.j.e(aVar, "action");
        E3.a aVar3 = (E3.a) this.f1948c.f601h.f();
        if (aVar3 != null && (aVar2 = aVar3.f1193m) != null) {
            aVar2.k(aVar);
        }
    }

    public final Z5.y d(AbstractC0901a abstractC0901a) {
        D3.d dVar;
        o6.j.e(abstractC0901a, "condition");
        E3.a aVar = (E3.a) this.f1948c.f601h.f();
        if (aVar != null && (dVar = aVar.f1192l) != null) {
            dVar.e(abstractC0901a);
            return Z5.y.f7506a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r3 == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r11 == r6) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j, AbstractC0713c abstractC0713c) {
        l lVar;
        int i4;
        C1001a c1001a;
        C3.e eVar;
        Object e9;
        C1001a c1001a2;
        C3.e eVar2;
        List list;
        if (abstractC0713c instanceof l) {
            lVar = (l) abstractC0713c;
            int i8 = lVar.f1942m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                lVar.f1942m = i8 - Integer.MIN_VALUE;
                Object obj = lVar.k;
                i4 = lVar.f1942m;
                b2.r rVar = this.f1946a;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                list = lVar.j;
                                c1001a2 = lVar.f1940i;
                                eVar2 = lVar.f1939h;
                                Z5.a.d(obj);
                                List list2 = (List) obj;
                                eVar2.getClass();
                                o6.j.e(c1001a2, "scenario");
                                o6.j.e(list, "imageEvents");
                                o6.j.e(list2, "triggerEvents");
                                i0 i0Var = eVar2.f594a;
                                i0Var.getClass();
                                i0Var.h(null, c1001a2);
                                i0 i0Var2 = eVar2.f595b;
                                i0Var2.getClass();
                                i0Var2.h(null, c1001a2);
                                eVar2.f599f.d(list);
                                eVar2.f600g.d(list2);
                                return Boolean.TRUE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = lVar.f1938g;
                        C1001a c1001a3 = lVar.f1940i;
                        C3.e eVar3 = lVar.f1939h;
                        Z5.a.d(obj);
                        e9 = obj;
                        c1001a = c1001a3;
                        eVar = eVar3;
                        List list3 = (List) e9;
                        lVar.f1939h = eVar;
                        lVar.f1940i = c1001a;
                        lVar.j = list3;
                        lVar.f1938g = j;
                        lVar.f1942m = 3;
                        Serializable g8 = rVar.g(j, lVar);
                        if (g8 != enumC0646a) {
                            c1001a2 = c1001a;
                            eVar2 = eVar;
                            obj = g8;
                            list = list3;
                            List list22 = (List) obj;
                            eVar2.getClass();
                            o6.j.e(c1001a2, "scenario");
                            o6.j.e(list, "imageEvents");
                            o6.j.e(list22, "triggerEvents");
                            i0 i0Var3 = eVar2.f594a;
                            i0Var3.getClass();
                            i0Var3.h(null, c1001a2);
                            i0 i0Var22 = eVar2.f595b;
                            i0Var22.getClass();
                            i0Var22.h(null, c1001a2);
                            eVar2.f599f.d(list);
                            eVar2.f600g.d(list22);
                            return Boolean.TRUE;
                        }
                        return enumC0646a;
                    }
                    j = lVar.f1938g;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    lVar.f1938g = j;
                    lVar.f1942m = 1;
                    obj = rVar.f(j, lVar);
                }
                c1001a = (C1001a) obj;
                if (c1001a != null) {
                    Log.e("EditionRepository", "Can't start edition, scenario " + j + " not found");
                    return Boolean.FALSE;
                }
                eVar = this.f1948c;
                lVar.f1939h = eVar;
                lVar.f1940i = c1001a;
                lVar.f1938g = j;
                lVar.f1942m = 2;
                e9 = rVar.e(j, lVar);
            }
        }
        lVar = new l(this, abstractC0713c);
        Object obj2 = lVar.k;
        i4 = lVar.f1942m;
        b2.r rVar2 = this.f1946a;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        c1001a = (C1001a) obj2;
        if (c1001a != null) {
        }
    }

    public final void f(AbstractC0951a abstractC0951a) {
        Object obj;
        o6.j.e(abstractC0951a, "event");
        C3.e eVar = this.f1948c;
        eVar.getClass();
        i0 i0Var = eVar.f596c;
        if (abstractC0951a instanceof C0952b) {
            obj = eVar.f599f;
        } else if (abstractC0951a instanceof C0953c) {
            obj = eVar.f600g;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        o6.j.c(obj, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.data.events.EventsEditor<com.buzbuz.smartautoclicker.core.domain.model.event.Event, com.buzbuz.smartautoclicker.core.domain.model.condition.Condition>");
        i0Var.getClass();
        i0Var.h(null, obj);
        E3.a aVar = (E3.a) eVar.f601h.f();
        if (aVar != null) {
            aVar.o(abstractC0951a);
        }
    }

    public final Z5.y g() {
        D3.d dVar;
        E3.a aVar = (E3.a) this.f1948c.f601h.f();
        if (aVar != null && (dVar = aVar.f1192l) != null) {
            dVar.g();
            return Z5.y.f7506a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(AbstractC0713c abstractC0713c) {
        m mVar;
        int i4;
        if (abstractC0713c instanceof m) {
            mVar = (m) abstractC0713c;
            int i8 = mVar.f1945i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                mVar.f1945i = i8 - Integer.MIN_VALUE;
                Object obj = mVar.f1943g;
                i4 = mVar.f1945i;
                Z5.y yVar = Z5.y.f7506a;
                b bVar = this.f1949d;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    C3.e eVar = this.f1948c;
                    eVar.f599f.f();
                    eVar.f600g.f();
                    eVar.f594a.g(null);
                    eVar.f595b.g(null);
                    ArrayList arrayList = (ArrayList) bVar.f1912q;
                    mVar.f1945i = 1;
                    Object y4 = this.f1947b.f13924b.y(arrayList, mVar);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (y4 != enumC0646a) {
                        y4 = yVar;
                    }
                    if (y4 == enumC0646a) {
                        return enumC0646a;
                    }
                }
                bVar.j();
                return yVar;
            }
        }
        mVar = new m(this, abstractC0713c);
        Object obj2 = mVar.f1943g;
        i4 = mVar.f1945i;
        Z5.y yVar2 = Z5.y.f7506a;
        b bVar2 = this.f1949d;
        if (i4 == 0) {
        }
        bVar2.j();
        return yVar2;
    }

    public final void i(ArrayList arrayList) {
        C3.a aVar;
        f2.a i4;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i9 = i8 + 1;
            if (i8 >= 0) {
                f2.a aVar2 = (f2.a) next;
                C0999a id = aVar2.getId();
                C0999a f8 = aVar2.f();
                String g8 = aVar2.g();
                o6.j.e(id, "id");
                o6.j.e(f8, "eventId");
                if (aVar2 instanceof f2.e) {
                    i4 = f2.e.i((f2.e) aVar2, id, f8, g8, i8, null, null, null, null, null, 496);
                } else if (aVar2 instanceof f2.c) {
                    i4 = f2.c.i((f2.c) aVar2, id, f8, g8, i8, null, null, null, 112);
                } else if (aVar2 instanceof f2.f) {
                    i4 = f2.f.i((f2.f) aVar2, id, f8, g8, i8, null, false, null, null, null, null, 1008);
                } else if (aVar2 instanceof f2.i) {
                    i4 = f2.i.i((f2.i) aVar2, id, f8, g8, i8, null, 16);
                } else if (aVar2 instanceof f2.k) {
                    i4 = f2.k.i((f2.k) aVar2, id, f8, g8, i8, null, null, null, 112);
                } else if (aVar2 instanceof f2.o) {
                    i4 = f2.o.i((f2.o) aVar2, id, f8, g8, i8, false, null, null, 112);
                } else if (aVar2 instanceof f2.h) {
                    i4 = f2.h.i((f2.h) aVar2, id, f8, g8, i8, null, null, null, 0, 240);
                } else if (aVar2 instanceof f2.m) {
                    i4 = f2.m.i((f2.m) aVar2, id, f8, g8, i8, null, 16);
                } else if (aVar2 instanceof f2.j) {
                    i4 = f2.j.i((f2.j) aVar2, id, f8, g8, i8, null, false, 48);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList2.add(i4);
                i8 = i9;
            } else {
                AbstractC0437l.c0();
                throw null;
            }
        }
        C3.e eVar = this.f1948c;
        eVar.getClass();
        E3.a aVar3 = (E3.a) eVar.f601h.f();
        if (aVar3 != null && (aVar = aVar3.f1193m) != null) {
            aVar.i(arrayList2);
        }
    }

    public final void j(f2.a aVar) {
        C3.a aVar2;
        o6.j.e(aVar, "action");
        E3.a aVar3 = (E3.a) this.f1948c.f601h.f();
        if (aVar3 != null && (aVar2 = aVar3.f1193m) != null) {
            aVar2.h(aVar);
        }
    }

    public final void k(AbstractC0901a abstractC0901a) {
        D3.d dVar;
        E3.a aVar = (E3.a) this.f1948c.f601h.f();
        if (aVar != null && (dVar = aVar.f1192l) != null) {
            dVar.h(abstractC0901a);
        }
    }

    public final void l(C0777a c0777a) {
        C3.a aVar;
        D3.d dVar;
        E3.a aVar2 = (E3.a) this.f1948c.f601h.f();
        if (aVar2 != null && (aVar = aVar2.f1193m) != null && (dVar = aVar.k) != null) {
            dVar.h(c0777a);
        }
    }

    public final void m(C1001a c1001a) {
        C3.e eVar = this.f1948c;
        eVar.getClass();
        i0 i0Var = eVar.f595b;
        if (((C1001a) i0Var.f()) == null) {
            return;
        }
        i0Var.h(null, c1001a);
    }

    public final void n(ArrayList arrayList) {
        D3.d dVar;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i8 = i4 + 1;
            if (i4 >= 0) {
                arrayList2.add(C0902b.i((C0902b) next, null, null, null, i4, null, 0, 0, false, null, 1015));
                i4 = i8;
            } else {
                AbstractC0437l.c0();
                throw null;
            }
        }
        C3.e eVar = this.f1948c;
        eVar.getClass();
        E3.a aVar = (E3.a) eVar.f601h.f();
        if (aVar != null && (dVar = aVar.f1192l) != null) {
            dVar.i(arrayList2);
        }
    }

    public final Z5.y o() {
        D3.d dVar;
        E3.a aVar = (E3.a) this.f1948c.f601h.f();
        if (aVar != null && (dVar = aVar.f1192l) != null) {
            dVar.j();
            return Z5.y.f7506a;
        }
        return null;
    }
}
