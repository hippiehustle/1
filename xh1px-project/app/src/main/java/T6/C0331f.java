package T6;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.O;
import C6.T;
import F6.U;
import I6.AbstractC0065d;
import I6.C0066e;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import h7.C0845h;
import i.AbstractC0862a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import m7.AbstractC1098d;
import n1.AbstractC1149a;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.M;
import w7.S;

/* renamed from: T6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331f implements R6.h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f5825h;

    /* renamed from: a, reason: collision with root package name */
    public final A4.a f5826a;

    /* renamed from: b, reason: collision with root package name */
    public final C0066e f5827b;

    /* renamed from: c, reason: collision with root package name */
    public final v7.h f5828c;

    /* renamed from: d, reason: collision with root package name */
    public final v7.i f5829d;

    /* renamed from: e, reason: collision with root package name */
    public final H6.f f5830e;

    /* renamed from: f, reason: collision with root package name */
    public final v7.i f5831f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5832g;

    static {
        o6.p pVar = new o6.p(C0331f.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0);
        o6.w wVar = o6.v.f13643a;
        f5825h = new u6.s[]{wVar.f(pVar), AbstractC1149a.k(C0331f.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, wVar), AbstractC1149a.k(C0331f.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0, wVar)};
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r6v2, types: [v7.i, v7.h] */
    public C0331f(A4.a aVar, C0066e c0066e, boolean z8) {
        o6.j.e(aVar, "c");
        o6.j.e(c0066e, "javaAnnotation");
        this.f5826a = aVar;
        this.f5827b = c0066e;
        S6.a aVar2 = (S6.a) aVar.f280e;
        v7.n nVar = aVar2.f5398a;
        C0330e c0330e = new C0330e(this, 0);
        v7.k kVar = (v7.k) nVar;
        kVar.getClass();
        this.f5828c = new v7.h(kVar, c0330e);
        C0330e c0330e2 = new C0330e(this, 1);
        v7.k kVar2 = (v7.k) nVar;
        kVar2.getClass();
        this.f5829d = new v7.h(kVar2, c0330e2);
        this.f5830e = aVar2.j.b(c0066e);
        C0330e c0330e3 = new C0330e(this, 2);
        v7.k kVar3 = (v7.k) nVar;
        kVar3.getClass();
        this.f5831f = new v7.h(kVar3, c0330e3);
        this.f5832g = z8;
    }

    @Override // D6.c
    public final C0723c a() {
        u6.s sVar = f5825h[0];
        v7.h hVar = this.f5828c;
        o6.j.e(hVar, "<this>");
        o6.j.e(sVar, "p");
        return (C0723c) hVar.a();
    }

    @Override // D6.c
    public final AbstractC1759v b() {
        return (w7.z) AbstractC0862a.j(this.f5829d, f5825h[1]);
    }

    @Override // D6.c
    public final Map c() {
        return (Map) AbstractC0862a.j(this.f5831f, f5825h[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k7.g d(W6.a aVar) {
        W6.d iVar;
        AbstractC1759v h8;
        if (aVar instanceof I6.v) {
            return k7.h.b(null, ((I6.v) aVar).f2215b);
        }
        if (aVar instanceof I6.t) {
            I6.t tVar = (I6.t) aVar;
            Class<?> cls = tVar.f2213b.getClass();
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            o6.j.b(cls);
            return new k7.i(AbstractC0065d.a(cls), C0725e.e(tVar.f2213b.name()));
        }
        boolean z8 = aVar instanceof I6.h;
        A4.a aVar2 = this.f5826a;
        if (z8) {
            I6.h hVar = (I6.h) aVar;
            C0725e c0725e = hVar.f2197a;
            if (c0725e == null) {
                c0725e = P6.w.f4598b;
            }
            o6.j.b(c0725e);
            ArrayList a3 = hVar.a();
            if (!AbstractC1741c.j((w7.z) AbstractC0862a.j(this.f5829d, f5825h[1]))) {
                InterfaceC0004e d2 = AbstractC1098d.d(this);
                o6.j.b(d2);
                U z9 = AbstractC0405a.z(c0725e, d2);
                if (z9 == null || (h8 = z9.b()) == null) {
                    h8 = ((S6.a) aVar2.f280e).f5410o.o().h(y7.l.c(y7.k.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                }
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(a3, 10));
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    k7.g d3 = d((W6.a) it.next());
                    if (d3 == null) {
                        d3 = new k7.g(null);
                    }
                    arrayList.add(d3);
                }
                return new k7.x(arrayList, h8);
            }
        } else {
            if (aVar instanceof I6.g) {
                return new k7.g(new C0331f(aVar2, new C0066e(((I6.g) aVar).f2198b), false));
            }
            if (aVar instanceof I6.p) {
                Class cls2 = ((I6.p) aVar).f2209b;
                if (cls2.isPrimitive()) {
                    iVar = new I6.z(cls2);
                } else if (!(cls2 instanceof GenericArrayType) && !cls2.isArray()) {
                    if (cls2 instanceof WildcardType) {
                        iVar = new I6.E((WildcardType) cls2);
                    } else {
                        iVar = new I6.q(cls2);
                    }
                } else {
                    iVar = new I6.i(cls2);
                }
                AbstractC1759v R5 = ((R.g) aVar2.f283h).R(iVar, AbstractC0405a.D0(S.f15974e, false, null, 7));
                if (!AbstractC1741c.j(R5)) {
                    AbstractC1759v abstractC1759v = R5;
                    int i4 = 0;
                    while (z6.h.z(abstractC1759v)) {
                        abstractC1759v = ((M) AbstractC0436k.G0(abstractC1759v.r0())).b();
                        o6.j.d(abstractC1759v, "getType(...)");
                        i4++;
                    }
                    InterfaceC0007h c6 = abstractC1759v.B0().c();
                    if (c6 instanceof InterfaceC0004e) {
                        C0722b f8 = AbstractC1098d.f(c6);
                        if (f8 == null) {
                            return new k7.g(new k7.p(R5));
                        }
                        return new k7.s(f8, i4);
                    }
                    if (c6 instanceof T) {
                        C0723c g8 = z6.m.f16762a.g();
                        return new k7.s(new C0722b(g8.b(), g8.f10797a.f()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // D6.c
    public final O h() {
        return this.f5830e;
    }

    public final String toString() {
        return C0845h.f11446c.v(this, null);
    }
}
