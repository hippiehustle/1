package w6;

import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.InterfaceC0004e;
import F6.C0052l;
import I6.AbstractC0065d;
import L6.AbstractC0131n;
import a6.AbstractC0436k;
import a7.C0450k;
import c7.InterfaceC0588g;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import n7.EnumC1170c;
import p7.AbstractC1326h;
import p7.InterfaceC1333o;
import s7.C1518i;
import u6.InterfaceC1642c;
import u7.C1655h;
import y6.AbstractC1841a;

/* renamed from: w6.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1710B extends F implements InterfaceC1642c, q0 {

    /* renamed from: g, reason: collision with root package name */
    public static final HashSet f15783g;

    /* renamed from: e, reason: collision with root package name */
    public final Class f15784e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15785f;

    static {
        LinkedHashSet linkedHashSet = AbstractC1841a.f16513a;
        HashSet hashSet = new HashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((C0722b) it.next()).a().f10797a.toString());
        }
        f15783g = hashSet;
    }

    public C1710B(Class cls) {
        o6.j.e(cls, "jClass");
        this.f15784e = cls;
        this.f15785f = Z5.a.c(Z5.h.f7482d, new C1732t(this, 0));
    }

    public static C0052l s(C0722b c0722b, H6.e eVar) {
        C1518i c1518i = eVar.f2042a;
        B6.p pVar = new B6.p(c1518i.f14574b, c0722b.f10793a, 1);
        C0725e f8 = c0722b.f();
        List y4 = E2.d.y(c1518i.f14574b.o().k("Any").l());
        v7.k kVar = c1518i.f14573a;
        C0052l c0052l = new C0052l(pVar, f8, EnumC0023y.f778e, EnumC0005f.f741d, y4, kVar);
        c0052l.r0(new AbstractC1326h(kVar, c0052l), a6.u.f7768d, null);
        return c0052l;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // u6.InterfaceC1642c
    public final String a() {
        s0 s0Var = ((C1737y) this.f15785f.getValue()).f15930f;
        u6.s sVar = C1737y.f15926m[3];
        return (String) s0Var.a();
    }

    @Override // u6.InterfaceC1642c
    public final boolean b(Object obj) {
        List list = AbstractC0065d.f2192a;
        Class cls = this.f15784e;
        o6.j.e(cls, "<this>");
        Integer num = (Integer) AbstractC0065d.f2195d.get(cls);
        if (num != null) {
            return o6.y.e(num.intValue(), obj);
        }
        Class cls2 = (Class) AbstractC0065d.f2194c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // u6.InterfaceC1642c
    public final String c() {
        s0 s0Var = ((C1737y) this.f15785f.getValue()).f15929e;
        u6.s sVar = C1737y.f15926m[2];
        return (String) s0Var.a();
    }

    @Override // o6.InterfaceC1285d
    public final Class d() {
        return this.f15784e;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1710B) && h2.a.l(this).equals(h2.a.l((InterfaceC1642c) obj))) {
            return true;
        }
        return false;
    }

    @Override // w6.F
    public final Collection h() {
        InterfaceC0004e u8 = u();
        if (u8.e() != EnumC0005f.f742e && u8.e() != EnumC0005f.f746i) {
            Collection G8 = u8.G();
            o6.j.d(G8, "getConstructors(...)");
            return G8;
        }
        return a6.s.f7766d;
    }

    @Override // u6.InterfaceC1642c
    public final int hashCode() {
        return h2.a.l(this).hashCode();
    }

    @Override // w6.F
    public final Collection i(C0725e c0725e) {
        InterfaceC1333o w02 = u().l().w0();
        K6.b bVar = K6.b.f2731e;
        Collection g8 = w02.g(c0725e, bVar);
        InterfaceC1333o o02 = u().o0();
        o6.j.d(o02, "getStaticScope(...)");
        return AbstractC0436k.C0(g8, o02.g(c0725e, bVar));
    }

    @Override // w6.F
    public final C6.M j(int i4) {
        C1655h c1655h;
        Class<?> declaringClass;
        Class cls = this.f15784e;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((C1710B) h2.a.n(declaringClass)).j(i4);
        }
        InterfaceC0004e u8 = u();
        if (u8 instanceof C1655h) {
            c1655h = (C1655h) u8;
        } else {
            c1655h = null;
        }
        if (c1655h != null) {
            C0450k c0450k = c1655h.f15399h;
            g7.n nVar = d7.k.j;
            o6.j.d(nVar, "classLocalVariable");
            a7.I i8 = (a7.I) E2.d.u(c0450k, nVar, i4);
            if (i8 != null) {
                F3.m mVar = c1655h.f15404o;
                return (C6.M) y0.f(this.f15784e, i8, (InterfaceC0588g) mVar.f1372e, (F6.B) mVar.f1374g, c1655h.f15400i, C1733u.f15914e);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, Z5.g] */
    @Override // u6.InterfaceC1642c
    public final boolean m() {
        L6.L l6 = (L6.L) ((C1737y) this.f15785f.getValue()).f15927c.getValue();
        if (l6 != null) {
            A.i iVar = AbstractC0131n.f3151c;
            u6.s sVar = AbstractC0131n.f3149a[14];
            iVar.getClass();
            o6.j.e(sVar, "property");
            M6.h hVar = (M6.h) iVar.f89f;
            boolean z8 = true;
            if (((((Number) ((o6.m) iVar.f88e).get(l6)).intValue() >>> hVar.f3494a) & ((1 << hVar.f3495b) - 1)) != hVar.f3496c) {
                z8 = false;
            }
            if (z8) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // w6.F
    public final Collection n(C0725e c0725e) {
        InterfaceC1333o w02 = u().l().w0();
        K6.b bVar = K6.b.f2731e;
        Collection f8 = w02.f(c0725e, bVar);
        InterfaceC1333o o02 = u().o0();
        o6.j.d(o02, "getStaticScope(...)");
        return AbstractC0436k.C0(f8, o02.f(c0725e, bVar));
    }

    public final C0722b t() {
        C0722b c0722b = w0.f15923a;
        Class cls = this.f15784e;
        o6.j.e(cls, "klass");
        z6.j jVar = null;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            o6.j.d(componentType, "getComponentType(...)");
            if (componentType.isPrimitive()) {
                jVar = EnumC1170c.b(componentType.getSimpleName()).d();
            }
            if (jVar != null) {
                return new C0722b(z6.n.k, jVar.f16730e);
            }
            C0723c g8 = z6.m.f16774g.g();
            return new C0722b(g8.b(), g8.f10797a.f());
        }
        if (cls.equals(Void.TYPE)) {
            return w0.f15923a;
        }
        if (cls.isPrimitive()) {
            jVar = EnumC1170c.b(cls.getSimpleName()).d();
        }
        if (jVar != null) {
            return new C0722b(z6.n.k, jVar.f16729d);
        }
        C0722b a3 = AbstractC0065d.a(cls);
        if (!a3.f10795c) {
            String str = B6.d.f457a;
            C0723c a4 = a3.a();
            o6.j.e(a4, "fqName");
            C0722b c0722b2 = (C0722b) B6.d.f464h.get(a4.f10797a);
            if (c0722b2 != null) {
                return c0722b2;
            }
        }
        return a3;
    }

    public final String toString() {
        String q6;
        StringBuilder sb = new StringBuilder("class ");
        C0722b t8 = t();
        C0723c c0723c = t8.f10793a;
        if (c0723c.f10797a.c()) {
            q6 = "";
        } else {
            q6 = A.j.q(new StringBuilder(), c0723c.f10797a.f10800a, '.');
        }
        sb.append(q6 + I7.v.Y(t8.f10794b.f10797a.f10800a, '.', '$'));
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    public final InterfaceC0004e u() {
        return ((C1737y) this.f15785f.getValue()).a();
    }
}
