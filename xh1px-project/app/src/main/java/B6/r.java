package B6;

import C6.AbstractC0015p;
import C6.AbstractC0021w;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.InterfaceC0018t;
import C6.InterfaceC0019u;
import F6.AbstractC0061v;
import F6.C;
import F6.C0050j;
import F6.C0052l;
import F6.C0060u;
import F6.N;
import F6.U;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a7.C0439A;
import c7.InterfaceC0588g;
import f7.C0722b;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import h7.AbstractC0842e;
import i.AbstractC0862a;
import i7.AbstractC0890e;
import i7.C0896k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import n1.AbstractC1149a;
import o6.v;
import o6.w;
import p7.C1332n;
import p7.InterfaceC1333o;
import q4.X;
import u6.AbstractC1638C;
import u7.C1655h;
import w7.C1761x;
import w7.O;
import w7.Q;
import w7.z;

/* loaded from: classes.dex */
public final class r implements E6.b, E6.d {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f504h;

    /* renamed from: a, reason: collision with root package name */
    public final C f505a;

    /* renamed from: b, reason: collision with root package name */
    public final v7.i f506b;

    /* renamed from: c, reason: collision with root package name */
    public final z f507c;

    /* renamed from: d, reason: collision with root package name */
    public final v7.i f508d;

    /* renamed from: e, reason: collision with root package name */
    public final v7.e f509e;

    /* renamed from: f, reason: collision with root package name */
    public final v7.i f510f;

    /* renamed from: g, reason: collision with root package name */
    public final v7.e f511g;

    static {
        o6.p pVar = new o6.p(r.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0);
        w wVar = v.f13643a;
        f504h = new u6.s[]{wVar.f(pVar), AbstractC1149a.k(r.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, wVar), AbstractC1149a.k(r.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0, wVar)};
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r10v3, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r10v6, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, n6.b] */
    public r(C c6, v7.k kVar, j jVar) {
        this.f505a = c6;
        this.f506b = new v7.h(kVar, jVar);
        C0052l c0052l = new C0052l(new p(c6, new C0723c("java.io"), 0), C0725e.e("Serializable"), EnumC0023y.f781h, EnumC0005f.f742e, E2.d.y(new C1761x(kVar, new m(this, 1))), kVar);
        c0052l.r0(C1332n.f13842b, a6.u.f7768d, null);
        this.f507c = c0052l.l();
        this.f508d = new v7.h(kVar, new f(this, 2, kVar));
        this.f509e = new v7.e(kVar, new ConcurrentHashMap(3, 1.0f, 2), new Object(), 0);
        this.f510f = new v7.h(kVar, new m(this, 0));
        this.f511g = kVar.b(new n(0, this));
    }

    @Override // E6.b
    public final Collection a(InterfaceC0004e interfaceC0004e) {
        Set b4;
        o6.j.e(interfaceC0004e, "classDescriptor");
        g().getClass();
        T6.i f8 = f(interfaceC0004e);
        if (f8 != null && (b4 = f8.r0().b()) != null) {
            return b4;
        }
        return a6.u.f7768d;
    }

    @Override // E6.b
    public final Collection b(InterfaceC0004e interfaceC0004e) {
        InterfaceC0004e c6;
        if (interfaceC0004e.e() == EnumC0005f.f741d) {
            g().getClass();
            T6.i f8 = f(interfaceC0004e);
            if (f8 != null && (c6 = e.c(AbstractC1098d.g(f8), b.f453f)) != null) {
                Q q6 = new Q(E2.d.j(c6, f8));
                List list = (List) f8.f5846t.f5872q.a();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    C0724d c0724d = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    C0050j c0050j = (C0050j) next;
                    C0050j c0050j2 = c0050j;
                    if (c0050j2.d().f752a.f750e) {
                        Collection<C0050j> G8 = c6.G();
                        o6.j.d(G8, "getConstructors(...)");
                        if (!G8.isEmpty()) {
                            for (C0050j c0050j3 : G8) {
                                o6.j.b(c0050j3);
                                if (C0896k.j(c0050j3, c0050j.f(q6)) == 1) {
                                    break;
                                }
                            }
                        }
                        if (c0050j2.z0().size() == 1) {
                            List z02 = c0050j2.z0();
                            o6.j.d(z02, "getValueParameters(...)");
                            InterfaceC0007h c9 = ((U) AbstractC0436k.G0(z02)).b().B0().c();
                            if (c9 != null) {
                                c0724d = AbstractC1098d.h(c9);
                            }
                            if (o6.j.a(c0724d, AbstractC1098d.h(interfaceC0004e))) {
                            }
                        }
                        if (!z6.h.D(c0050j) && !u.f523f.contains(AbstractC1638C.M(f8, D2.f.e(c0050j, 3)))) {
                            arrayList.add(next);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C0050j c0050j4 = (C0050j) it2.next();
                    C0050j c0050j5 = c0050j4;
                    c0050j5.getClass();
                    C0060u S02 = c0050j5.S0(Q.f15971b);
                    S02.f1560e = interfaceC0004e;
                    S02.h(interfaceC0004e.l());
                    S02.f1571r = true;
                    O f9 = q6.f();
                    if (f9 != null) {
                        S02.f1559d = f9;
                        if (!u.f524g.contains(AbstractC1638C.M(f8, D2.f.e(c0050j4, 3)))) {
                            S02.f((D6.j) AbstractC0862a.j(this.f510f, f504h[2]));
                        }
                        AbstractC0061v P02 = S02.f1558A.P0(S02);
                        o6.j.c(P02, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                        arrayList2.add((C0050j) P02);
                    } else {
                        C0060u.b(37);
                        throw null;
                    }
                }
                return arrayList2;
            }
        }
        return a6.s.f7766d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.io.Serializable] */
    @Override // E6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection c(C0725e c0725e, InterfaceC0004e interfaceC0004e) {
        Throwable th;
        Iterable X8;
        Object obj;
        InterfaceC0004e interfaceC0004e2;
        boolean booleanValue;
        boolean z8;
        boolean z9;
        Object obj2;
        D6.j jVar;
        o6.j.e(c0725e, "name");
        o6.j.e(interfaceC0004e, "classDescriptor");
        boolean equals = c0725e.equals(a.f452e);
        K6.b bVar = K6.b.f2730d;
        u6.s[] sVarArr = f504h;
        int i4 = 1;
        a6.s<N> sVar = a6.s.f7766d;
        if (equals && (interfaceC0004e instanceof C1655h) && (z6.h.b(interfaceC0004e, z6.m.f16774g) || z6.h.s(interfaceC0004e) != null)) {
            C1655h c1655h = (C1655h) interfaceC0004e;
            List list = c1655h.f15399h.f8170t;
            o6.j.d(list, "getFunctionList(...)");
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (AbstractC0842e.t((InterfaceC0588g) c1655h.f15404o.f1372e, ((C0439A) it.next()).f7782i).equals(a.f452e)) {
                        return sVar;
                    }
                }
            }
            InterfaceC0018t s02 = ((N) AbstractC0436k.F0(((z) AbstractC0862a.j(this.f508d, sVarArr[1])).w0().g(c0725e, bVar))).s0();
            s02.l(c1655h);
            s02.k(AbstractC0015p.f758e);
            s02.h(c1655h.l());
            s02.o(c1655h.F0());
            InterfaceC0019u build = s02.build();
            o6.j.b(build);
            return E2.d.y((N) build);
        }
        g().getClass();
        T6.i f8 = f(interfaceC0004e);
        if (f8 == null) {
            th = null;
        } else {
            C0723c g8 = AbstractC1098d.g(f8);
            b bVar2 = b.f453f;
            o6.j.e(bVar2, "builtIns");
            InterfaceC0004e c6 = e.c(g8, bVar2);
            if (c6 == null) {
                X8 = a6.u.f7768d;
                th = null;
            } else {
                String str = d.f457a;
                th = null;
                C0723c c0723c = (C0723c) d.k.get(AbstractC1098d.h(c6));
                if (c0723c == null) {
                    X8 = X.T(c6);
                } else {
                    X8 = AbstractC0437l.X(c6, bVar2.j(c0723c));
                }
            }
            if (X8 instanceof List) {
                List list2 = (List) X8;
                if (!list2.isEmpty()) {
                    obj = list2.get(list2.size() - 1);
                    interfaceC0004e2 = (InterfaceC0004e) obj;
                    if (interfaceC0004e2 != null) {
                        int i8 = F7.i.f1630f;
                        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(X8, 10));
                        Iterator it2 = X8.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(AbstractC1098d.g((InterfaceC0004e) it2.next()));
                        }
                        F7.i iVar = new F7.i(0);
                        iVar.addAll(arrayList);
                        String str2 = d.f457a;
                        boolean containsKey = d.j.containsKey(AbstractC0890e.g(interfaceC0004e));
                        C0723c g9 = AbstractC1098d.g(f8);
                        f fVar = new f(f8, 3, interfaceC0004e2);
                        v7.e eVar = this.f509e;
                        eVar.getClass();
                        Object m6 = eVar.m(new v7.g(g9, fVar));
                        if (m6 != null) {
                            InterfaceC1333o t02 = ((InterfaceC0004e) m6).t0();
                            o6.j.d(t02, "getUnsubstitutedMemberScope(...)");
                            Collection g10 = t02.g(c0725e, bVar);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : g10) {
                                N n3 = (N) obj3;
                                if (n3.e() == i4 && n3.d().f752a.f750e && !z6.h.D(n3)) {
                                    Collection s8 = n3.s();
                                    if (!s8.isEmpty()) {
                                        Iterator it3 = s8.iterator();
                                        while (it3.hasNext()) {
                                            InterfaceC0010k q6 = ((InterfaceC0019u) it3.next()).q();
                                            o6.j.d(q6, "getContainingDeclaration(...)");
                                            if (iVar.contains(AbstractC1098d.g(q6))) {
                                                break;
                                            }
                                        }
                                    }
                                    InterfaceC0010k q8 = n3.q();
                                    o6.j.c(q8, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    if (u.f522e.contains(AbstractC1638C.M((InterfaceC0004e) q8, D2.f.e(n3, 3))) ^ containsKey) {
                                        booleanValue = true;
                                    } else {
                                        Boolean h8 = F7.l.h(E2.d.y(n3), e.f469d, new g(this));
                                        o6.j.d(h8, "ifAny(...)");
                                        booleanValue = h8.booleanValue();
                                    }
                                    if (!booleanValue) {
                                        z8 = true;
                                        if (!z8) {
                                            arrayList2.add(obj3);
                                        }
                                        i4 = 1;
                                    }
                                }
                                z8 = false;
                                if (!z8) {
                                }
                                i4 = 1;
                            }
                            sVar = arrayList2;
                        } else {
                            v7.e.f(3);
                            throw th;
                        }
                    }
                }
                obj = th;
                interfaceC0004e2 = (InterfaceC0004e) obj;
                if (interfaceC0004e2 != null) {
                }
            } else {
                Iterator it4 = X8.iterator();
                if (it4.hasNext()) {
                    Object next = it4.next();
                    while (it4.hasNext()) {
                        next = it4.next();
                    }
                    obj = next;
                    interfaceC0004e2 = (InterfaceC0004e) obj;
                    if (interfaceC0004e2 != null) {
                    }
                }
                obj = th;
                interfaceC0004e2 = (InterfaceC0004e) obj;
                if (interfaceC0004e2 != null) {
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (N n8 : sVar) {
            InterfaceC0010k q9 = n8.q();
            o6.j.c(q9, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC0019u f9 = n8.f(new Q(E2.d.j((InterfaceC0004e) q9, interfaceC0004e)));
            o6.j.c(f9, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            InterfaceC0018t s03 = ((N) f9).s0();
            s03.l(interfaceC0004e);
            s03.o(interfaceC0004e.F0());
            s03.j();
            InterfaceC0010k q10 = n8.q();
            o6.j.c(q10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Object f10 = F7.l.f(E2.d.y((InterfaceC0004e) q10), new W0.d(2, this), new q(D2.f.e(n8, 3), new Object(), 0));
            o6.j.d(f10, "dfs(...)");
            int ordinal = ((o) f10).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            obj2 = th;
                        } else {
                            s03.f((D6.j) AbstractC0862a.j(this.f510f, sVarArr[2]));
                        }
                    } else {
                        C0725e name = n8.getName();
                        boolean a3 = o6.j.a(name, s.f512a);
                        v7.e eVar2 = this.f511g;
                        if (a3) {
                            jVar = (D6.j) eVar2.m(new Z5.j(n8.getName().b(), "first"));
                        } else if (o6.j.a(name, s.f513b)) {
                            jVar = (D6.j) eVar2.m(new Z5.j(n8.getName().b(), "last"));
                        } else {
                            throw new IllegalStateException(("Unexpected name: " + n8.getName()).toString());
                        }
                        s03.f(jVar);
                    }
                }
                Object build2 = s03.build();
                o6.j.b(build2);
                obj2 = (N) build2;
            } else {
                if (interfaceC0004e.j() == EnumC0023y.f778e && interfaceC0004e.e() != EnumC0005f.f743f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    s03.n();
                    Object build22 = s03.build();
                    o6.j.b(build22);
                    obj2 = (N) build22;
                }
                obj2 = th;
            }
            if (obj2 != null) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    @Override // E6.b
    public final Collection d(InterfaceC0004e interfaceC0004e) {
        C0724d h8 = AbstractC1098d.h(interfaceC0004e);
        LinkedHashSet linkedHashSet = u.f518a;
        C0724d c0724d = z6.m.f16774g;
        boolean equals = h8.equals(c0724d);
        boolean z8 = false;
        z zVar = this.f507c;
        if (!equals) {
            HashMap hashMap = z6.m.f16775g0;
            if (hashMap.get(h8) == null) {
                if (!h8.equals(c0724d) && hashMap.get(h8) == null) {
                    String str = d.f457a;
                    C0722b f8 = d.f(h8);
                    if (f8 != null) {
                        try {
                            z8 = Serializable.class.isAssignableFrom(Class.forName(f8.a().f10797a.f10800a));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                } else {
                    z8 = true;
                }
                if (z8) {
                    return E2.d.y(zVar);
                }
                return a6.s.f7766d;
            }
        }
        return AbstractC0437l.X((z) AbstractC0862a.j(this.f508d, f504h[1]), zVar);
    }

    @Override // E6.d
    public final boolean e(InterfaceC0004e interfaceC0004e, u7.r rVar) {
        o6.j.e(interfaceC0004e, "classDescriptor");
        T6.i f8 = f(interfaceC0004e);
        if (f8 != null && rVar.getAnnotations().a(E6.e.f1255a)) {
            g().getClass();
            String e9 = D2.f.e(rVar, 3);
            T6.o r02 = f8.r0();
            C0725e name = rVar.getName();
            o6.j.d(name, "getName(...)");
            Collection g8 = r02.g(name, K6.b.f2730d);
            if (!g8.isEmpty()) {
                Iterator it = g8.iterator();
                while (it.hasNext()) {
                    if (o6.j.a(D2.f.e((N) it.next(), 3), e9)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final T6.i f(InterfaceC0004e interfaceC0004e) {
        C0723c a3;
        if (interfaceC0004e != null) {
            if (!z6.h.b(interfaceC0004e, z6.m.f16762a) && z6.h.J(interfaceC0004e)) {
                C0724d h8 = AbstractC1098d.h(interfaceC0004e);
                if (h8.d()) {
                    String str = d.f457a;
                    C0722b f8 = d.f(h8);
                    if (f8 != null && (a3 = f8.a()) != null) {
                        InterfaceC0004e j = AbstractC0021w.j(g().f487a, a3);
                        if (j instanceof T6.i) {
                            return (T6.i) j;
                        }
                    }
                }
            }
            return null;
        }
        z6.h.a(108);
        throw null;
    }

    public final k g() {
        return (k) AbstractC0862a.j(this.f506b, f504h[0]);
    }
}
