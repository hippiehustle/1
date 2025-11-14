package T6;

import a6.AbstractC0436k;
import a6.AbstractC0438m;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import n6.InterfaceC1163b;

/* renamed from: T6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326a implements InterfaceC0328c {

    /* renamed from: a, reason: collision with root package name */
    public final I6.o f5811a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1163b f5812b;

    /* renamed from: c, reason: collision with root package name */
    public final B6.n f5813c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5814d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f5815e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f5816f;

    public C0326a(I6.o oVar, InterfaceC1163b interfaceC1163b) {
        o6.j.e(oVar, "jClass");
        this.f5811a = oVar;
        this.f5812b = interfaceC1163b;
        B6.n nVar = new B6.n(11, this);
        this.f5813c = nVar;
        H7.g gVar = new H7.g(AbstractC0436k.k0(oVar.d()), true, nVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        H7.f fVar = new H7.f(gVar);
        while (fVar.hasNext()) {
            Object next = fVar.next();
            C0725e c6 = ((I6.x) next).c();
            Object obj = linkedHashMap.get(c6);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c6, obj);
            }
            ((List) obj).add(next);
        }
        this.f5814d = linkedHashMap;
        H7.g gVar2 = new H7.g(AbstractC0436k.k0(this.f5811a.b()), true, this.f5812b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        H7.f fVar2 = new H7.f(gVar2);
        while (fVar2.hasNext()) {
            Object next2 = fVar2.next();
            linkedHashMap2.put(((I6.u) next2).c(), next2);
        }
        this.f5815e = linkedHashMap2;
        ArrayList f8 = this.f5811a.f();
        InterfaceC1163b interfaceC1163b2 = this.f5812b;
        ArrayList arrayList = new ArrayList();
        Iterator it = f8.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            if (((Boolean) interfaceC1163b2.m(next3)).booleanValue()) {
                arrayList.add(next3);
            }
        }
        int N02 = a6.x.N0(AbstractC0438m.d0(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(N02 < 16 ? 16 : N02);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next4 = it2.next();
            linkedHashMap3.put(((I6.A) next4).c(), next4);
        }
        this.f5816f = linkedHashMap3;
    }

    @Override // T6.InterfaceC0328c
    public final Set a() {
        H7.g gVar = new H7.g(AbstractC0436k.k0(this.f5811a.d()), true, this.f5813c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        H7.f fVar = new H7.f(gVar);
        while (fVar.hasNext()) {
            linkedHashSet.add(((I6.x) fVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // T6.InterfaceC0328c
    public final Set b() {
        return this.f5816f.keySet();
    }

    @Override // T6.InterfaceC0328c
    public final I6.u c(C0725e c0725e) {
        o6.j.e(c0725e, "name");
        return (I6.u) this.f5815e.get(c0725e);
    }

    @Override // T6.InterfaceC0328c
    public final Collection d(C0725e c0725e) {
        o6.j.e(c0725e, "name");
        List list = (List) this.f5814d.get(c0725e);
        if (list != null) {
            return list;
        }
        return a6.s.f7766d;
    }

    @Override // T6.InterfaceC0328c
    public final I6.A e(C0725e c0725e) {
        o6.j.e(c0725e, "name");
        return (I6.A) this.f5816f.get(c0725e);
    }

    @Override // T6.InterfaceC0328c
    public final Set f() {
        H7.g gVar = new H7.g(AbstractC0436k.k0(this.f5811a.b()), true, this.f5812b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        H7.f fVar = new H7.f(gVar);
        while (fVar.hasNext()) {
            linkedHashSet.add(((I6.u) fVar.next()).c());
        }
        return linkedHashSet;
    }
}
