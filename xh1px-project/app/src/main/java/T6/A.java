package T6;

import C6.EnumC0023y;
import C6.InterfaceC0010k;
import C6.T;
import F6.AbstractC0061v;
import F6.U;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import f7.C0725e;
import i.AbstractC0862a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import n1.AbstractC1149a;
import n6.InterfaceC1163b;
import p7.AbstractC1334p;
import p7.C1324f;
import p7.C1330l;
import s3.AbstractC1492c;
import u6.AbstractC1638C;
import w7.AbstractC1759v;
import w7.S;
import w7.W;

/* loaded from: classes.dex */
public abstract class A extends AbstractC1334p {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f5792m;

    /* renamed from: b, reason: collision with root package name */
    public final A4.a f5793b;

    /* renamed from: c, reason: collision with root package name */
    public final A f5794c;

    /* renamed from: d, reason: collision with root package name */
    public final v7.c f5795d;

    /* renamed from: e, reason: collision with root package name */
    public final v7.i f5796e;

    /* renamed from: f, reason: collision with root package name */
    public final v7.e f5797f;

    /* renamed from: g, reason: collision with root package name */
    public final U1.c f5798g;

    /* renamed from: h, reason: collision with root package name */
    public final v7.e f5799h;

    /* renamed from: i, reason: collision with root package name */
    public final v7.i f5800i;
    public final v7.i j;
    public final v7.i k;

    /* renamed from: l, reason: collision with root package name */
    public final v7.e f5801l;

    static {
        o6.p pVar = new o6.p(A.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0);
        o6.w wVar = o6.v.f13643a;
        f5792m = new u6.s[]{wVar.f(pVar), AbstractC1149a.k(A.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0, wVar), AbstractC1149a.k(A.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0, wVar)};
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [v7.c, v7.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r1v2, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r1v3, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r1v4, types: [v7.i, v7.h] */
    public A(A4.a aVar, o oVar) {
        o6.j.e(aVar, "c");
        this.f5793b = aVar;
        this.f5794c = oVar;
        v7.n nVar = ((S6.a) aVar.f280e).f5398a;
        w wVar = new w(this, 0);
        v7.k kVar = (v7.k) nVar;
        kVar.getClass();
        this.f5795d = new v7.h(kVar, wVar);
        w wVar2 = new w(this, 1);
        v7.k kVar2 = (v7.k) nVar;
        kVar2.getClass();
        this.f5796e = new v7.h(kVar2, wVar2);
        this.f5797f = ((v7.k) nVar).b(new y(this, 0));
        this.f5798g = ((v7.k) nVar).c(new y(this, 1));
        this.f5799h = ((v7.k) nVar).b(new y(this, 2));
        w wVar3 = new w(this, 2);
        v7.k kVar3 = (v7.k) nVar;
        kVar3.getClass();
        this.f5800i = new v7.h(kVar3, wVar3);
        w wVar4 = new w(this, 3);
        v7.k kVar4 = (v7.k) nVar;
        kVar4.getClass();
        this.j = new v7.h(kVar4, wVar4);
        w wVar5 = new w(this, 4);
        v7.k kVar5 = (v7.k) nVar;
        kVar5.getClass();
        this.k = new v7.h(kVar5, wVar5);
        this.f5801l = ((v7.k) nVar).b(new y(this, 3));
    }

    public static AbstractC1759v l(I6.x xVar, A4.a aVar) {
        o6.j.e(xVar, "method");
        Class<?> declaringClass = ((Method) xVar.b()).getDeclaringClass();
        o6.j.d(declaringClass, "getDeclaringClass(...)");
        return ((R.g) aVar.f283h).R(xVar.f(), AbstractC0405a.D0(S.f15974e, declaringClass.isAnnotation(), null, 6));
    }

    public static N.f u(A4.a aVar, AbstractC0061v abstractC0061v, List list) {
        Z5.j jVar;
        AbstractC1759v abstractC1759v;
        C0725e c0725e;
        C0725e e9;
        I6.i iVar;
        R.g gVar = (R.g) aVar.f283h;
        S6.a aVar2 = (S6.a) aVar.f280e;
        C6.A a3 = aVar2.f5410o;
        H7.q W02 = AbstractC0436k.W0(list);
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(W02, 10));
        Iterator it = W02.iterator();
        boolean z8 = false;
        while (true) {
            H7.b bVar = (H7.b) it;
            if (bVar.f2047e.hasNext()) {
                a6.v vVar = (a6.v) bVar.next();
                int i4 = vVar.f7769a;
                I6.D d2 = (I6.D) vVar.f7770b;
                S6.c H2 = AbstractC1492c.H(aVar, d2);
                C0725e c0725e2 = null;
                U6.a D02 = AbstractC0405a.D0(S.f15974e, false, null, 7);
                boolean z9 = d2.f2181d;
                I6.B b4 = d2.f2178a;
                if (z9) {
                    if (b4 instanceof I6.i) {
                        iVar = (I6.i) b4;
                    } else {
                        iVar = null;
                    }
                    if (iVar != null) {
                        W Q5 = gVar.Q(iVar, D02, true);
                        jVar = new Z5.j(Q5, a3.o().f(Q5));
                    } else {
                        throw new AssertionError("Vararg parameter should be an array: " + d2);
                    }
                } else {
                    jVar = new Z5.j(gVar.R(b4, D02), null);
                }
                AbstractC1759v abstractC1759v2 = (AbstractC1759v) jVar.f7485d;
                AbstractC1759v abstractC1759v3 = (AbstractC1759v) jVar.f7486e;
                if (o6.j.a(abstractC0061v.getName().b(), "equals") && list.size() == 1 && a3.o().p().equals(abstractC1759v2)) {
                    e9 = C0725e.e("other");
                } else {
                    String str = d2.f2180c;
                    if (str != null) {
                        c0725e2 = C0725e.d(str);
                    }
                    if (c0725e2 == null) {
                        z8 = true;
                    }
                    if (c0725e2 == null) {
                        e9 = C0725e.e("p" + i4);
                    } else {
                        abstractC1759v = abstractC1759v2;
                        c0725e = c0725e2;
                        arrayList.add(new U(abstractC0061v, null, i4, H2, c0725e, abstractC1759v, false, false, false, abstractC1759v3, aVar2.j.b(d2)));
                    }
                }
                abstractC1759v = abstractC1759v2;
                c0725e = e9;
                arrayList.add(new U(abstractC0061v, null, i4, H2, c0725e, abstractC1759v, false, false, false, abstractC1759v3, aVar2.j.b(d2)));
            } else {
                return new N.f(AbstractC0436k.Q0(arrayList), z8, 1);
            }
        }
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        return (Collection) this.f5795d.a();
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Set b() {
        return (Set) AbstractC0862a.j(this.f5800i, f5792m[0]);
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Set c() {
        return (Set) AbstractC0862a.j(this.j, f5792m[1]);
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Set e() {
        return (Set) AbstractC0862a.j(this.k, f5792m[2]);
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public Collection f(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        if (!c().contains(c0725e)) {
            return a6.s.f7766d;
        }
        return (Collection) this.f5801l.m(c0725e);
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public Collection g(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        if (!b().contains(c0725e)) {
            return a6.s.f7766d;
        }
        return (Collection) this.f5799h.m(c0725e);
    }

    public abstract Set h(C1324f c1324f, InterfaceC1163b interfaceC1163b);

    public abstract Set i(C1324f c1324f, C1330l c1330l);

    public void j(C0725e c0725e, ArrayList arrayList) {
        o6.j.e(c0725e, "name");
    }

    public abstract InterfaceC0328c k();

    public abstract void m(LinkedHashSet linkedHashSet, C0725e c0725e);

    public abstract void n(C0725e c0725e, ArrayList arrayList);

    public abstract Set o(C1324f c1324f);

    public abstract F6.w p();

    public abstract InterfaceC0010k q();

    public boolean r(R6.f fVar) {
        return true;
    }

    public abstract z s(I6.x xVar, ArrayList arrayList, AbstractC1759v abstractC1759v, List list);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, Z5.g] */
    public final R6.f t(I6.x xVar) {
        boolean z8;
        EnumC0023y enumC0023y;
        o6.j.e(xVar, "method");
        A4.a aVar = this.f5793b;
        S6.c H2 = AbstractC1492c.H(aVar, xVar);
        InterfaceC0010k q6 = q();
        C0725e c6 = xVar.c();
        H6.f b4 = ((S6.a) aVar.f280e).j.b(xVar);
        if (((InterfaceC0328c) this.f5796e.a()).e(xVar.c()) != null && ((ArrayList) xVar.g()).isEmpty()) {
            z8 = true;
        } else {
            z8 = false;
        }
        R6.f b12 = R6.f.b1(q6, H2, c6, b4, z8);
        o6.j.e(aVar, "<this>");
        A4.a aVar2 = new A4.a((S6.a) aVar.f280e, new S6.e(aVar, b12, xVar, 0), (Z5.g) aVar.f282g);
        ArrayList typeParameters = xVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            T a3 = ((S6.f) aVar2.f281f).a((I6.C) it.next());
            o6.j.b(a3);
            arrayList.add(a3);
        }
        N.f u8 = u(aVar2, b12, xVar.g());
        z s8 = s(xVar, arrayList, l(xVar, aVar2), (List) u8.f3525f);
        List list = s8.f5905d;
        F6.w p8 = p();
        ArrayList arrayList2 = s8.f5904c;
        List list2 = s8.f5903b;
        AbstractC1759v abstractC1759v = s8.f5902a;
        boolean isAbstract = Modifier.isAbstract(((Method) xVar.b()).getModifiers());
        boolean isFinal = Modifier.isFinal(((Method) xVar.b()).getModifiers());
        EnumC0023y.f777d.getClass();
        if (isAbstract) {
            enumC0023y = EnumC0023y.f781h;
        } else if (!isFinal) {
            enumC0023y = EnumC0023y.f780g;
        } else {
            enumC0023y = EnumC0023y.f778e;
        }
        b12.a1(null, p8, a6.s.f7766d, arrayList2, list2, abstractC1759v, enumC0023y, AbstractC1638C.N(xVar.e()), a6.t.f7767d);
        b12.c1(false, u8.f3524e);
        if (list.isEmpty()) {
            return b12;
        }
        ((S6.a) aVar2.f280e).f5402e.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
