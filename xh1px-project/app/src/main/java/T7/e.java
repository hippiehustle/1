package T7;

import L7.C0150h;
import L7.InterfaceC0148f;
import L7.InterfaceC0149g;
import L7.s0;
import Q7.r;
import Q7.t;
import Z5.y;
import a6.AbstractC0436k;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import n6.InterfaceC1165d;
import o6.j;

/* loaded from: classes.dex */
public final class e implements InterfaceC0148f, f, s0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5920i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0622h f5921d;

    /* renamed from: f, reason: collision with root package name */
    public Object f5923f;
    private volatile /* synthetic */ Object state$volatile = h.f5927a;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f5922e = new ArrayList(2);

    /* renamed from: g, reason: collision with root package name */
    public int f5924g = -1;

    /* renamed from: h, reason: collision with root package name */
    public Object f5925h = h.f5930d;

    public e(InterfaceC0622h interfaceC0622h) {
        this.f5921d = interfaceC0622h;
    }

    @Override // L7.s0
    public final void a(r rVar, int i4) {
        this.f5923f = rVar;
        this.f5924g = i4;
    }

    @Override // L7.InterfaceC0148f
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5920i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.f5928b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h.f5929c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f5922e;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a();
            }
            this.f5925h = h.f5930d;
            this.f5922e = null;
            return;
        }
    }

    public final Object c(AbstractC0713c abstractC0713c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5920i;
        Object obj = atomicReferenceFieldUpdater.get(this);
        j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        c cVar = (c) obj;
        Object obj2 = this.f5925h;
        ArrayList arrayList = this.f5922e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c cVar2 = (c) it.next();
                if (cVar2 != cVar) {
                    cVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, h.f5928b);
            this.f5925h = h.f5930d;
            this.f5922e = null;
        }
        Object j = cVar.f5910c.j(cVar.f5908a, cVar.f5911d, obj2);
        o6.h hVar = cVar.f5912e;
        if (cVar.f5911d == h.f5931e) {
            return ((InterfaceC1163b) hVar).m(abstractC0713c);
        }
        return ((InterfaceC1164c) hVar).l(j, abstractC0713c);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC0713c abstractC0713c) {
        d dVar;
        int i4;
        EnumC0646a enumC0646a;
        Object obj;
        e eVar;
        InterfaceC1165d interfaceC1165d;
        Object c6;
        if (abstractC0713c instanceof d) {
            dVar = (d) abstractC0713c;
            int i8 = dVar.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.j = i8 - Integer.MIN_VALUE;
                Object obj2 = dVar.f5918h;
                i4 = dVar.j;
                enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj2);
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = dVar.f5917g;
                    Z5.a.d(obj2);
                } else {
                    Z5.a.d(obj2);
                    dVar.f5917g = this;
                    dVar.j = 1;
                    C0150h c0150h = new C0150h(1, E2.c.d0(dVar));
                    c0150h.v();
                    loop0: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5920i;
                        Object obj3 = atomicReferenceFieldUpdater.get(this);
                        obj = y.f7506a;
                        t tVar = h.f5927a;
                        if (obj3 == tVar) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, c0150h)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj3) {
                                    break;
                                }
                            }
                            c0150h.x(this);
                            break loop0;
                        }
                        if (!(obj3 instanceof List)) {
                            if (obj3 instanceof c) {
                                c cVar = (c) obj3;
                                Object obj4 = this.f5925h;
                                InterfaceC1165d interfaceC1165d2 = cVar.f5913f;
                                if (interfaceC1165d2 != null) {
                                    interfaceC1165d = (InterfaceC1165d) interfaceC1165d2.j(this, cVar.f5911d, obj4);
                                } else {
                                    interfaceC1165d = null;
                                }
                                c0150h.f(obj, interfaceC1165d);
                            } else {
                                throw new IllegalStateException(("unexpected state: " + obj3).toString());
                            }
                        }
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, tVar)) {
                                Iterator it = ((Iterable) obj3).iterator();
                                while (it.hasNext()) {
                                    c e9 = e(it.next());
                                    j.b(e9);
                                    e9.f5914g = null;
                                    e9.f5915h = -1;
                                    f(e9, true);
                                }
                            } else if (atomicReferenceFieldUpdater.get(this) != obj3) {
                                break;
                            }
                        }
                    }
                    Object u8 = c0150h.u();
                    if (u8 == enumC0646a) {
                        obj = u8;
                    }
                    if (obj != enumC0646a) {
                        eVar = this;
                    }
                    return enumC0646a;
                }
                dVar.f5917g = null;
                dVar.j = 2;
                c6 = eVar.c(dVar);
                if (c6 != enumC0646a) {
                    return enumC0646a;
                }
                return c6;
            }
        }
        dVar = new d(this, abstractC0713c);
        Object obj22 = dVar.f5918h;
        i4 = dVar.j;
        enumC0646a = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        dVar.f5917g = null;
        dVar.j = 2;
        c6 = eVar.c(dVar);
        if (c6 != enumC0646a) {
        }
    }

    public final c e(Object obj) {
        ArrayList arrayList = this.f5922e;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((c) next).f5908a == obj) {
                obj2 = next;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(c cVar, boolean z8) {
        Object obj = cVar.f5908a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5920i;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        if (!z8) {
            ArrayList arrayList = this.f5922e;
            j.b(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((c) it.next()).f5908a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        cVar.f5909b.j(obj, this, cVar.f5911d);
        if (this.f5925h == h.f5930d) {
            if (!z8) {
                ArrayList arrayList2 = this.f5922e;
                j.b(arrayList2);
                arrayList2.add(cVar);
            }
            cVar.f5914g = this.f5923f;
            cVar.f5915h = this.f5924g;
            this.f5923f = null;
            this.f5924g = -1;
            return;
        }
        atomicReferenceFieldUpdater.set(this, cVar);
    }

    public final int g(Object obj, Object obj2) {
        InterfaceC1165d interfaceC1165d;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5920i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof InterfaceC0149g) {
                c e9 = e(obj);
                if (e9 != null) {
                    InterfaceC1165d interfaceC1165d2 = e9.f5913f;
                    if (interfaceC1165d2 != null) {
                        interfaceC1165d = (InterfaceC1165d) interfaceC1165d2.j(this, e9.f5911d, obj2);
                    } else {
                        interfaceC1165d = null;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, e9)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    InterfaceC0149g interfaceC0149g = (InterfaceC0149g) obj3;
                    this.f5925h = obj2;
                    t o7 = interfaceC0149g.o(y.f7506a, interfaceC1165d);
                    if (o7 == null) {
                        this.f5925h = h.f5930d;
                        return 2;
                    }
                    interfaceC0149g.r(o7);
                    return 0;
                }
                continue;
            } else {
                if (!j.a(obj3, h.f5928b) && !(obj3 instanceof c)) {
                    if (j.a(obj3, h.f5929c)) {
                        return 2;
                    }
                    if (j.a(obj3, h.f5927a)) {
                        List y4 = E2.d.y(obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, y4)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj3) {
                                break;
                            }
                        }
                        return 1;
                    }
                    if (obj3 instanceof List) {
                        ArrayList D02 = AbstractC0436k.D0((Collection) obj3, obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, D02)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj3) {
                                break;
                            }
                        }
                        return 1;
                    }
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                return 3;
            }
        }
    }
}
