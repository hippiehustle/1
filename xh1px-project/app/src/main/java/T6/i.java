package T6;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import C6.N;
import C6.P;
import C6.U;
import C6.b0;
import C6.e0;
import C6.h0;
import F6.AbstractC0051k;
import F6.C0050j;
import a.AbstractC0405a;
import a6.AbstractC0434i;
import i.AbstractC0862a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import m7.AbstractC1098d;
import p7.C1327i;
import p7.InterfaceC1333o;
import q4.X;
import s3.AbstractC1492c;
import u6.AbstractC1638C;
import w7.J;
import x7.C1824f;

/* loaded from: classes.dex */
public final class i extends AbstractC0051k implements R6.c {
    public final A4.a j;
    public final I6.o k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0004e f5838l;

    /* renamed from: m, reason: collision with root package name */
    public final A4.a f5839m;

    /* renamed from: n, reason: collision with root package name */
    public final Z5.n f5840n;

    /* renamed from: o, reason: collision with root package name */
    public final EnumC0005f f5841o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumC0023y f5842p;

    /* renamed from: q, reason: collision with root package name */
    public final h0 f5843q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5844r;

    /* renamed from: s, reason: collision with root package name */
    public final h f5845s;

    /* renamed from: t, reason: collision with root package name */
    public final o f5846t;

    /* renamed from: u, reason: collision with root package name */
    public final N f5847u;

    /* renamed from: v, reason: collision with root package name */
    public final C1327i f5848v;

    /* renamed from: w, reason: collision with root package name */
    public final D f5849w;

    /* renamed from: x, reason: collision with root package name */
    public final S6.c f5850x;

    /* renamed from: y, reason: collision with root package name */
    public final v7.i f5851y;

    static {
        AbstractC0434i.l1(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r13v5, types: [v7.i, v7.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(A4.a aVar, InterfaceC0010k interfaceC0010k, I6.o oVar, InterfaceC0004e interfaceC0004e) {
        super(r0.f5398a, interfaceC0010k, oVar.e(), r0.j.b(oVar));
        EnumC0005f enumC0005f;
        h0 h0Var;
        boolean z8;
        boolean z9;
        Boolean bool;
        boolean z10;
        Boolean bool2;
        boolean z11;
        boolean z12;
        o6.j.e(aVar, "outerContext");
        o6.j.e(interfaceC0010k, "containingDeclaration");
        o6.j.e(oVar, "jClass");
        S6.a aVar2 = (S6.a) aVar.f280e;
        this.j = aVar;
        this.k = oVar;
        this.f5838l = interfaceC0004e;
        A4.a l6 = X.l(aVar, this, oVar, 4);
        this.f5839m = l6;
        S6.a aVar3 = (S6.a) l6.f280e;
        v7.n nVar = aVar3.f5398a;
        aVar3.f5404g.getClass();
        this.f5840n = new Z5.n(new g(this, 0));
        Class cls = oVar.f2208a;
        if (cls.isAnnotation()) {
            enumC0005f = EnumC0005f.f745h;
        } else if (cls.isInterface()) {
            enumC0005f = EnumC0005f.f742e;
        } else if (cls.isEnum()) {
            enumC0005f = EnumC0005f.f743f;
        } else {
            enumC0005f = EnumC0005f.f741d;
        }
        this.f5841o = enumC0005f;
        boolean isAnnotation = cls.isAnnotation();
        EnumC0023y enumC0023y = EnumC0023y.f778e;
        if (!isAnnotation && !cls.isEnum()) {
            o6.j.e(cls, "clazz");
            Method method = (Method) AbstractC0405a.X().f280e;
            if (method == null) {
                bool = null;
            } else {
                Object invoke = method.invoke(cls, null);
                o6.j.c(invoke, "null cannot be cast to non-null type kotlin.Boolean");
                bool = (Boolean) invoke;
            }
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = false;
            }
            o6.j.e(cls, "clazz");
            Method method2 = (Method) AbstractC0405a.X().f280e;
            if (method2 == null) {
                bool2 = null;
            } else {
                Object invoke2 = method2.invoke(cls, null);
                o6.j.c(invoke2, "null cannot be cast to non-null type kotlin.Boolean");
                bool2 = (Boolean) invoke2;
            }
            if (bool2 != null) {
                z11 = bool2.booleanValue();
            } else {
                z11 = false;
            }
            if (!z11 && !Modifier.isAbstract(cls.getModifiers()) && !cls.isInterface()) {
                z12 = false;
            } else {
                z12 = true;
            }
            boolean isFinal = Modifier.isFinal(cls.getModifiers());
            EnumC0023y.f777d.getClass();
            if (z10) {
                enumC0023y = EnumC0023y.f779f;
            } else if (z12) {
                enumC0023y = EnumC0023y.f781h;
            } else if (!isFinal) {
                enumC0023y = EnumC0023y.f780g;
            }
        }
        this.f5842p = enumC0023y;
        int modifiers = cls.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            h0Var = e0.f740g;
        } else if (Modifier.isPrivate(modifiers)) {
            h0Var = b0.f734g;
        } else if (Modifier.isProtected(modifiers)) {
            if (Modifier.isStatic(modifiers)) {
                h0Var = G6.c.f1844g;
            } else {
                h0Var = G6.b.f1843g;
            }
        } else {
            h0Var = G6.a.f1842g;
        }
        this.f5843q = h0Var;
        Class<?> declaringClass = cls.getDeclaringClass();
        if ((declaringClass != null ? new I6.o(declaringClass) : null) != null && !Modifier.isStatic(cls.getModifiers())) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f5844r = z8;
        this.f5845s = new h(this);
        if (interfaceC0004e != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o oVar2 = new o(l6, this, oVar, z9, null);
        this.f5846t = oVar2;
        P p8 = N.f721d;
        ((x7.l) aVar3.f5416u).getClass();
        B6.n nVar2 = new B6.n(12, this);
        p8.getClass();
        o6.j.e(nVar, "storageManager");
        this.f5847u = new N(this, nVar, nVar2);
        this.f5848v = new C1327i(oVar2);
        this.f5849w = new D(l6, oVar, this);
        this.f5850x = AbstractC1492c.H(l6, oVar);
        g gVar = new g(this, 1);
        v7.k kVar = (v7.k) nVar;
        kVar.getClass();
        this.f5851y = new v7.h(kVar, gVar);
    }

    @Override // C6.InterfaceC0007h
    public final J B() {
        return this.f5845s;
    }

    @Override // F6.A
    public final InterfaceC1333o C(C1824f c1824f) {
        N n3 = this.f5847u;
        AbstractC1098d.j(n3.f723a);
        return (o) ((InterfaceC1333o) AbstractC0862a.j(n3.f725c, N.f722e[0]));
    }

    @Override // C6.InterfaceC0004e
    public final boolean D0() {
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final boolean E() {
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final Collection G() {
        return (List) this.f5846t.f5872q.a();
    }

    @Override // C6.InterfaceC0004e
    public final boolean N() {
        return false;
    }

    @Override // C6.InterfaceC0022x
    public final boolean c0() {
        return false;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0022x, C6.InterfaceC0013n
    public final C0014o d() {
        I6.o oVar;
        C0014o c0014o = AbstractC0015p.f754a;
        h0 h0Var = this.f5843q;
        if (o6.j.a(h0Var, c0014o)) {
            Class<?> declaringClass = this.k.f2208a.getDeclaringClass();
            if (declaringClass != null) {
                oVar = new I6.o(declaringClass);
            } else {
                oVar = null;
            }
            if (oVar == null) {
                C0014o c0014o2 = P6.o.f4574a;
                o6.j.b(c0014o2);
                return c0014o2;
            }
        }
        return AbstractC1638C.N(h0Var);
    }

    @Override // C6.InterfaceC0008i
    public final boolean d0() {
        return this.f5844r;
    }

    @Override // C6.InterfaceC0004e
    public final EnumC0005f e() {
        return this.f5841o;
    }

    @Override // C6.InterfaceC0004e
    public final boolean g() {
        return false;
    }

    @Override // D6.a
    public final D6.j getAnnotations() {
        return this.f5850x;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0022x
    public final EnumC0023y j() {
        return this.f5842p;
    }

    @Override // F6.AbstractC0042b, C6.InterfaceC0004e
    public final InterfaceC1333o k0() {
        return this.f5848v;
    }

    @Override // C6.InterfaceC0004e
    public final U l0() {
        return null;
    }

    @Override // C6.InterfaceC0004e
    public final boolean m() {
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final C0050j n0() {
        return null;
    }

    @Override // C6.InterfaceC0004e
    public final InterfaceC1333o o0() {
        return this.f5849w;
    }

    public final o r0() {
        return (o) super.t0();
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0008i
    public final List t() {
        return (List) this.f5851y.a();
    }

    @Override // F6.AbstractC0042b, C6.InterfaceC0004e
    public final InterfaceC1333o t0() {
        return (o) super.t0();
    }

    public final String toString() {
        return "Lazy Java class " + AbstractC1098d.h(this);
    }

    @Override // C6.InterfaceC0022x
    public final boolean v0() {
        return false;
    }
}
