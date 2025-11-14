package F6;

import C6.C0014o;
import C6.C0020v;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import C6.InterfaceC0011l;
import C6.InterfaceC0012m;
import a6.AbstractC0438m;
import f7.C0725e;
import i7.AbstractC0890e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import p7.C1338t;
import p7.InterfaceC1333o;
import t0.C1536c;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.C1745g;
import w7.C1747i;
import w7.X;
import x7.C1824f;
import z7.InterfaceC1888e;

/* loaded from: classes.dex */
public final class z extends A {

    /* renamed from: d, reason: collision with root package name */
    public final A f1612d;

    /* renamed from: e, reason: collision with root package name */
    public final w7.Q f1613e;

    /* renamed from: f, reason: collision with root package name */
    public w7.Q f1614f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1615g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1616h;

    /* renamed from: i, reason: collision with root package name */
    public C1747i f1617i;

    public z(A a3, w7.Q q6) {
        this.f1612d = a3;
        this.f1613e = q6;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void V(int i4) {
        String str;
        int i8;
        String format;
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6 && i4 != 8 && i4 != 10 && i4 != 13 && i4 != 23) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6 && i4 != 8 && i4 != 10 && i4 != 13 && i4 != 23) {
            i8 = 2;
        } else {
            i8 = 3;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 != 5) {
                    if (i4 != 6) {
                        if (i4 != 8) {
                            if (i4 != 10) {
                                if (i4 != 13) {
                                    if (i4 != 23) {
                                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                    } else {
                                        objArr[0] = "substitutor";
                                    }
                                    switch (i4) {
                                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                                        case 10:
                                        case 13:
                                        case 23:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                            break;
                                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        case 9:
                                        case 11:
                                            objArr[1] = "getMemberScope";
                                            break;
                                        case 12:
                                        case 14:
                                            objArr[1] = "getUnsubstitutedMemberScope";
                                            break;
                                        case 15:
                                            objArr[1] = "getStaticScope";
                                            break;
                                        case 16:
                                            objArr[1] = "getDefaultType";
                                            break;
                                        case 17:
                                            objArr[1] = "getContextReceivers";
                                            break;
                                        case 18:
                                            objArr[1] = "getConstructors";
                                            break;
                                        case 19:
                                            objArr[1] = "getAnnotations";
                                            break;
                                        case 20:
                                            objArr[1] = "getName";
                                            break;
                                        case 21:
                                            objArr[1] = "getOriginal";
                                            break;
                                        case 22:
                                            objArr[1] = "getContainingDeclaration";
                                            break;
                                        case 24:
                                            objArr[1] = "substitute";
                                            break;
                                        case 25:
                                            objArr[1] = "getKind";
                                            break;
                                        case 26:
                                            objArr[1] = "getModality";
                                            break;
                                        case 27:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 28:
                                            objArr[1] = "getUnsubstitutedInnerClassesScope";
                                            break;
                                        case 29:
                                            objArr[1] = "getSource";
                                            break;
                                        case 30:
                                            objArr[1] = "getDeclaredTypeParameters";
                                            break;
                                        case 31:
                                            objArr[1] = "getSealedSubclasses";
                                            break;
                                        default:
                                            objArr[1] = "getTypeConstructor";
                                            break;
                                    }
                                    if (i4 == 2 && i4 != 3 && i4 != 5 && i4 != 6 && i4 != 8 && i4 != 10) {
                                        if (i4 != 13) {
                                            if (i4 == 23) {
                                                objArr[2] = "substitute";
                                            }
                                        } else {
                                            objArr[2] = "getUnsubstitutedMemberScope";
                                        }
                                    } else {
                                        objArr[2] = "getMemberScope";
                                    }
                                    format = String.format(str, objArr);
                                    if (i4 != 2 || i4 == 3 || i4 == 5 || i4 == 6 || i4 == 8 || i4 == 10 || i4 == 13 || i4 == 23) {
                                        throw new IllegalArgumentException(format);
                                    }
                                    throw new IllegalStateException(format);
                                }
                            }
                        }
                    }
                }
                objArr[0] = "typeSubstitution";
                switch (i4) {
                }
                if (i4 == 2) {
                }
                objArr[2] = "getMemberScope";
                format = String.format(str, objArr);
                if (i4 != 2) {
                }
                throw new IllegalArgumentException(format);
            }
            objArr[0] = "kotlinTypeRefiner";
            switch (i4) {
            }
            if (i4 == 2) {
            }
            objArr[2] = "getMemberScope";
            format = String.format(str, objArr);
            if (i4 != 2) {
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "typeArguments";
        switch (i4) {
        }
        if (i4 == 2) {
        }
        objArr[2] = "getMemberScope";
        format = String.format(str, objArr);
        if (i4 != 2) {
        }
        throw new IllegalArgumentException(format);
    }

    @Override // C6.InterfaceC0007h
    public final w7.J B() {
        w7.J B8 = this.f1612d.B();
        if (this.f1613e.f15972a.e()) {
            if (B8 != null) {
                return B8;
            }
            V(0);
            throw null;
        }
        if (this.f1617i == null) {
            w7.Q X8 = X();
            Collection d2 = B8.d();
            ArrayList arrayList = new ArrayList(d2.size());
            Iterator it = d2.iterator();
            while (it.hasNext()) {
                arrayList.add(X8.i((AbstractC1759v) it.next(), X.INVARIANT));
            }
            this.f1617i = new C1747i(this, this.f1615g, arrayList, v7.k.f15560e);
        }
        C1747i c1747i = this.f1617i;
        if (c1747i != null) {
            return c1747i;
        }
        V(1);
        throw null;
    }

    @Override // F6.A
    public final InterfaceC1333o C(C1824f c1824f) {
        InterfaceC1333o C8 = this.f1612d.C(c1824f);
        if (this.f1613e.f15972a.e()) {
            if (C8 != null) {
                return C8;
            }
            V(14);
            throw null;
        }
        return new C1338t(C8, X());
    }

    @Override // C6.InterfaceC0004e
    public final boolean D0() {
        return this.f1612d.D0();
    }

    @Override // C6.InterfaceC0004e
    public final boolean E() {
        return this.f1612d.E();
    }

    @Override // C6.InterfaceC0004e
    public final w F0() {
        throw new UnsupportedOperationException();
    }

    @Override // C6.InterfaceC0004e
    public final Collection G() {
        Collection<C0050j> G8 = this.f1612d.G();
        ArrayList arrayList = new ArrayList(G8.size());
        for (C0050j c0050j : G8) {
            C0050j c0050j2 = c0050j;
            c0050j2.getClass();
            C0060u S02 = c0050j2.S0(w7.Q.f15971b);
            S02.f1563h = c0050j.L0();
            S02.d(c0050j2.j());
            S02.k(c0050j2.d());
            S02.i(c0050j2.e());
            S02.f1569p = false;
            arrayList.add(((C0050j) S02.f1558A.P0(S02)).f(X()));
        }
        return arrayList;
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.g(this, obj);
    }

    @Override // C6.InterfaceC0004e
    public final boolean N() {
        return this.f1612d.N();
    }

    public final w7.Q X() {
        if (this.f1614f == null) {
            w7.Q q6 = this.f1613e;
            if (q6.f15972a.e()) {
                this.f1614f = q6;
            } else {
                List e9 = this.f1612d.B().e();
                this.f1615g = new ArrayList(e9.size());
                this.f1614f = AbstractC1741c.z(e9, q6.f(), this, this.f1615g);
                ArrayList arrayList = this.f1615g;
                o6.j.e(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((C6.T) obj).Q()) {
                        arrayList2.add(obj);
                    }
                }
                this.f1616h = arrayList2;
            }
        }
        return this.f1614f;
    }

    @Override // C6.InterfaceC0004e
    public final InterfaceC1333o Y(w7.O o7) {
        AbstractC1098d.i(AbstractC0890e.d(this));
        return k(o7, C1824f.f16282a);
    }

    @Override // F6.A, C6.InterfaceC0010k
    public final InterfaceC0004e a() {
        InterfaceC0004e a3 = this.f1612d.a();
        if (a3 != null) {
            return a3;
        }
        V(21);
        throw null;
    }

    @Override // C6.InterfaceC0022x
    public final boolean c0() {
        return this.f1612d.c0();
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0022x, C6.InterfaceC0013n
    public final C0014o d() {
        C0014o d2 = this.f1612d.d();
        if (d2 != null) {
            return d2;
        }
        V(27);
        throw null;
    }

    @Override // C6.InterfaceC0008i
    public final boolean d0() {
        return this.f1612d.d0();
    }

    @Override // C6.InterfaceC0004e
    public final EnumC0005f e() {
        EnumC0005f e9 = this.f1612d.e();
        if (e9 != null) {
            return e9;
        }
        V(25);
        throw null;
    }

    @Override // C6.Q
    public final InterfaceC0011l f(w7.Q q6) {
        if (q6 != null) {
            if (q6.f15972a.e()) {
                return this;
            }
            return new z(this, w7.Q.e(q6.f(), X().f()));
        }
        V(23);
        throw null;
    }

    @Override // C6.InterfaceC0004e
    public final boolean g() {
        return this.f1612d.g();
    }

    @Override // D6.a
    public final D6.j getAnnotations() {
        D6.j annotations = this.f1612d.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        V(19);
        throw null;
    }

    @Override // C6.InterfaceC0010k
    public final C0725e getName() {
        C0725e name = this.f1612d.getName();
        if (name != null) {
            return name;
        }
        V(20);
        throw null;
    }

    @Override // C6.InterfaceC0011l
    public final C6.O h() {
        return C6.O.f726a;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0022x
    public final EnumC0023y j() {
        EnumC0023y j = this.f1612d.j();
        if (j != null) {
            return j;
        }
        V(26);
        throw null;
    }

    @Override // F6.A
    public final InterfaceC1333o k(w7.O o7, C1824f c1824f) {
        InterfaceC1333o k = this.f1612d.k(o7, c1824f);
        if (this.f1613e.f15972a.e()) {
            if (k != null) {
                return k;
            }
            V(7);
            throw null;
        }
        return new C1338t(k, X());
    }

    @Override // C6.InterfaceC0004e
    public final InterfaceC1333o k0() {
        InterfaceC1333o k02 = this.f1612d.k0();
        if (k02 != null) {
            return k02;
        }
        V(28);
        throw null;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0007h
    public final w7.z l() {
        w7.G g8;
        List d2 = w7.U.d(B().e());
        D6.j annotations = getAnnotations();
        if (annotations.isEmpty()) {
            w7.G.f15953e.getClass();
            g8 = w7.G.f15954f;
        } else {
            C1536c c1536c = w7.G.f15953e;
            List y4 = E2.d.y(new C1745g(annotations));
            c1536c.getClass();
            g8 = C1536c.g(y4);
        }
        return AbstractC1741c.u(d2, t0(), g8, B(), false);
    }

    @Override // C6.InterfaceC0004e
    public final C6.U l0() {
        C6.U l02 = this.f1612d.l0();
        if (l02 == null) {
            return null;
        }
        boolean z8 = l02 instanceof C0020v;
        X x8 = X.INVARIANT;
        w7.Q q6 = this.f1613e;
        if (z8) {
            C0020v c0020v = (C0020v) l02;
            C0725e c0725e = c0020v.f774a;
            w7.z zVar = (w7.z) c0020v.f775b;
            if (zVar != null && !q6.f15972a.e()) {
                zVar = (w7.z) X().i(zVar, x8);
            }
            return new C0020v(c0725e, zVar);
        }
        if (l02 instanceof C6.B) {
            ArrayList arrayList = ((C6.B) l02).f711a;
            ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Z5.j jVar = (Z5.j) it.next();
                C0725e c0725e2 = (C0725e) jVar.f7485d;
                w7.z zVar2 = (w7.z) ((InterfaceC1888e) jVar.f7486e);
                if (zVar2 != null && !q6.f15972a.e()) {
                    zVar2 = (w7.z) X().i(zVar2, x8);
                }
                arrayList2.add(new Z5.j(c0725e2, zVar2));
            }
            return new C6.B(arrayList2);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // C6.InterfaceC0004e
    public final boolean m() {
        return this.f1612d.m();
    }

    @Override // C6.InterfaceC0004e
    public final C0050j n0() {
        return this.f1612d.n0();
    }

    @Override // C6.InterfaceC0004e
    public final InterfaceC1333o o0() {
        InterfaceC1333o o02 = this.f1612d.o0();
        if (o02 != null) {
            return o02;
        }
        V(15);
        throw null;
    }

    @Override // C6.InterfaceC0010k
    public final InterfaceC0010k q() {
        InterfaceC0010k q6 = this.f1612d.q();
        if (q6 != null) {
            return q6;
        }
        V(22);
        throw null;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0008i
    public final List t() {
        X();
        ArrayList arrayList = this.f1616h;
        if (arrayList != null) {
            return arrayList;
        }
        V(30);
        throw null;
    }

    @Override // C6.InterfaceC0004e
    public final InterfaceC1333o t0() {
        AbstractC1098d.i(AbstractC0890e.d(this.f1612d));
        return C(C1824f.f16282a);
    }

    @Override // C6.InterfaceC0022x
    public final boolean v0() {
        return this.f1612d.v0();
    }

    @Override // C6.InterfaceC0004e
    public final List x0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        V(17);
        throw null;
    }

    @Override // C6.InterfaceC0022x
    public final boolean z() {
        return this.f1612d.z();
    }
}
