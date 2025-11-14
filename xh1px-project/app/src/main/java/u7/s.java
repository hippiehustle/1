package u7;

import C6.AbstractC0021w;
import C6.C0014o;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.InterfaceC0011l;
import F6.AbstractC0046f;
import F6.B;
import F6.C0045e;
import a7.V;
import c7.C0590i;
import c7.InterfaceC0588g;
import f7.C0725e;
import g7.AbstractC0793b;
import java.util.List;
import p7.C1332n;
import p7.InterfaceC1333o;
import w7.AbstractC1741c;
import w7.G;
import w7.J;
import w7.Q;
import w7.U;
import w7.X;
import w7.z;

/* loaded from: classes.dex */
public final class s extends AbstractC0046f implements k {

    /* renamed from: m, reason: collision with root package name */
    public final V f15449m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0588g f15450n;

    /* renamed from: o, reason: collision with root package name */
    public final B f15451o;

    /* renamed from: p, reason: collision with root package name */
    public final C0590i f15452p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1657j f15453q;

    /* renamed from: r, reason: collision with root package name */
    public z f15454r;

    /* renamed from: s, reason: collision with root package name */
    public z f15455s;

    /* renamed from: t, reason: collision with root package name */
    public List f15456t;

    /* renamed from: u, reason: collision with root package name */
    public z f15457u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v7.n nVar, InterfaceC0010k interfaceC0010k, D6.j jVar, C0725e c0725e, C0014o c0014o, V v8, InterfaceC0588g interfaceC0588g, B b4, C0590i c0590i, InterfaceC1657j interfaceC1657j) {
        super(nVar, interfaceC0010k, jVar, c0725e, c0014o);
        o6.j.e(nVar, "storageManager");
        o6.j.e(interfaceC0010k, "containingDeclaration");
        o6.j.e(c0014o, "visibility");
        o6.j.e(v8, "proto");
        o6.j.e(interfaceC0588g, "nameResolver");
        o6.j.e(b4, "typeTable");
        o6.j.e(c0590i, "versionRequirementTable");
        this.f15449m = v8;
        this.f15450n = interfaceC0588g;
        this.f15451o = b4;
        this.f15452p = c0590i;
        this.f15453q = interfaceC1657j;
    }

    @Override // u7.k
    public final InterfaceC0588g C0() {
        return this.f15450n;
    }

    public final InterfaceC0004e M0() {
        if (!AbstractC1741c.j(N0())) {
            InterfaceC0007h c6 = N0().B0().c();
            if (c6 instanceof InterfaceC0004e) {
                return (InterfaceC0004e) c6;
            }
            return null;
        }
        return null;
    }

    public final z N0() {
        z zVar = this.f15455s;
        if (zVar != null) {
            return zVar;
        }
        o6.j.i("expandedType");
        throw null;
    }

    public final z O0() {
        z zVar = this.f15454r;
        if (zVar != null) {
            return zVar;
        }
        o6.j.i("underlyingType");
        throw null;
    }

    @Override // u7.k
    public final AbstractC0793b P() {
        return this.f15449m;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, n6.b] */
    public final void P0(List list, z zVar, z zVar2) {
        InterfaceC1333o interfaceC1333o;
        z v8;
        o6.j.e(zVar, "underlyingType");
        o6.j.e(zVar2, "expandedType");
        this.k = list;
        this.f15454r = zVar;
        this.f15455s = zVar2;
        this.f15456t = AbstractC0021w.c(this);
        InterfaceC0004e M02 = M0();
        if (M02 == null || (interfaceC1333o = M02.t0()) == null) {
            interfaceC1333o = C1332n.f13842b;
        }
        InterfaceC1333o interfaceC1333o2 = interfaceC1333o;
        ?? obj = new Object();
        y7.i iVar = U.f15977a;
        if (y7.l.f(this)) {
            v8 = y7.l.c(y7.k.UNABLE_TO_SUBSTITUTE_TYPE, toString());
        } else {
            J B8 = B();
            if (B8 != null) {
                List d2 = U.d(((C0045e) B8).e());
                G.f15953e.getClass();
                v8 = AbstractC1741c.v(G.f15954f, B8, d2, false, interfaceC1333o2, obj);
            } else {
                U.a(12);
                throw null;
            }
        }
        this.f15457u = v8;
    }

    @Override // C6.Q
    public final InterfaceC0011l f(Q q6) {
        o6.j.e(q6, "substitutor");
        if (q6.f15972a.e()) {
            return this;
        }
        InterfaceC0010k q8 = q();
        o6.j.d(q8, "getContainingDeclaration(...)");
        D6.j annotations = getAnnotations();
        o6.j.d(annotations, "<get-annotations>(...)");
        C0725e name = getName();
        o6.j.d(name, "getName(...)");
        s sVar = new s(this.f1524i, q8, annotations, name, this.j, this.f15449m, this.f15450n, this.f15451o, this.f15452p, this.f15453q);
        List t8 = t();
        z O02 = O0();
        X x8 = X.INVARIANT;
        sVar.P0(t8, AbstractC1741c.b(q6.g(O02, x8)), AbstractC1741c.b(q6.g(N0(), x8)));
        return sVar;
    }

    @Override // C6.InterfaceC0007h
    public final z l() {
        z zVar = this.f15457u;
        if (zVar != null) {
            return zVar;
        }
        o6.j.i("defaultTypeImpl");
        throw null;
    }

    @Override // u7.k
    public final B p0() {
        return this.f15451o;
    }

    @Override // u7.k
    public final InterfaceC1657j w() {
        return this.f15453q;
    }
}
