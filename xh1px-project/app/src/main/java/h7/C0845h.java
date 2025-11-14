package h7;

import C6.A;
import C6.AbstractC0015p;
import C6.AbstractC0021w;
import C6.C0014o;
import C6.E;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.F;
import C6.InterfaceC0001b;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0008i;
import C6.InterfaceC0010k;
import C6.InterfaceC0011l;
import C6.InterfaceC0022x;
import C6.S;
import C6.T;
import C6.W;
import F6.C0050j;
import F6.C0059t;
import F6.L;
import F6.U;
import F6.w;
import I7.v;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import f7.C0724d;
import f7.C0725e;
import i7.AbstractC0890e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k7.C0995a;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import n1.AbstractC1149a;
import n6.InterfaceC1163b;
import s3.AbstractC1492c;
import w7.AbstractC1741c;
import w7.AbstractC1754p;
import w7.AbstractC1759v;
import w7.C1739a;
import w7.C1750l;
import w7.C1758u;
import w7.C1761x;
import w7.J;
import w7.M;
import w7.z;

/* renamed from: h7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0845h implements InterfaceC0847j {

    /* renamed from: c, reason: collision with root package name */
    public static final C0845h f11446c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0845h f11447d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0845h f11448e;

    /* renamed from: a, reason: collision with root package name */
    public final C0849l f11449a;

    /* renamed from: b, reason: collision with root package name */
    public final Z5.n f11450b = new Z5.n(new B6.j(12, this));

    static {
        AbstractC0842e.C(C0841d.f11429e);
        AbstractC0842e.C(C0841d.f11431g);
        AbstractC0842e.C(C0841d.f11432h);
        AbstractC0842e.C(C0841d.f11433i);
        AbstractC0842e.C(C0841d.j);
        AbstractC0842e.C(C0841d.k);
        f11446c = AbstractC0842e.C(C0841d.f11434l);
        AbstractC0842e.C(C0841d.f11435m);
        f11447d = AbstractC0842e.C(C0841d.f11436n);
        f11448e = AbstractC0842e.C(C0841d.f11437o);
        AbstractC0842e.C(C0841d.f11430f);
    }

    public C0845h(C0849l c0849l) {
        this.f11449a = c0849l;
    }

    public static void U(StringBuilder sb) {
        int length = sb.length();
        if (length != 0 && sb.charAt(length - 1) == ' ') {
            return;
        }
        sb.append(' ');
    }

    public static boolean g0(AbstractC1759v abstractC1759v) {
        if (h4.g.q(abstractC1759v)) {
            List r02 = abstractC1759v.r0();
            if (r02 == null || !r02.isEmpty()) {
                Iterator it = r02.iterator();
                while (it.hasNext()) {
                    if (((M) it.next()).c()) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static final void l(C0845h c0845h, C6.M m6, StringBuilder sb) {
        boolean z8;
        boolean z9;
        boolean p8 = c0845h.p();
        C0849l c0849l = c0845h.f11449a;
        if (!p8) {
            C0848k c0848k = c0849l.f11498g;
            u6.s[] sVarArr = C0849l.Y;
            if (!((Boolean) c0848k.a(c0849l, sVarArr[5])).booleanValue()) {
                List W7 = m6.W();
                o6.j.d(W7, "getContextReceiverParameters(...)");
                c0845h.A(sb, W7);
                if (c0845h.o().contains(EnumC0846i.ANNOTATIONS)) {
                    c0845h.w(sb, m6, null);
                    C0059t T5 = m6.T();
                    if (T5 != null) {
                        c0845h.w(sb, T5, D6.e.f1027e);
                    }
                    C0059t O8 = m6.O();
                    if (O8 != null) {
                        c0845h.w(sb, O8, D6.e.f1033m);
                    }
                    if (((EnumC0854q) c0849l.f11476H.a(c0849l, sVarArr[32])) == EnumC0854q.f11526e) {
                        L c6 = m6.c();
                        if (c6 != null) {
                            c0845h.w(sb, c6, D6.e.f1030h);
                        }
                        F6.M i4 = m6.i();
                        if (i4 != null) {
                            c0845h.w(sb, i4, D6.e.f1031i);
                            List z02 = i4.z0();
                            o6.j.d(z02, "getValueParameters(...)");
                            U u8 = (U) AbstractC0436k.G0(z02);
                            o6.j.b(u8);
                            c0845h.w(sb, u8, D6.e.f1032l);
                        }
                    }
                }
                C0014o d2 = m6.d();
                o6.j.d(d2, "getVisibility(...)");
                c0845h.e0(d2, sb);
                if (c0845h.o().contains(EnumC0846i.CONST) && m6.F()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                c0845h.L(sb, z8, "const");
                c0845h.I(m6, sb);
                c0845h.K(m6, sb);
                c0845h.Q(m6, sb);
                if (c0845h.o().contains(EnumC0846i.LATEINIT) && m6.Z()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                c0845h.L(sb, z9, "lateinit");
                c0845h.H(m6, sb);
            }
            c0845h.b0(m6, sb, false);
            List typeParameters = m6.getTypeParameters();
            o6.j.d(typeParameters, "getTypeParameters(...)");
            c0845h.a0(sb, typeParameters, true);
            c0845h.S(m6, sb);
        }
        c0845h.N(m6, sb, true);
        sb.append(": ");
        AbstractC1759v b4 = m6.b();
        o6.j.d(b4, "getType(...)");
        sb.append(c0845h.V(b4));
        c0845h.T(m6, sb);
        c0845h.F(m6, sb);
        List typeParameters2 = m6.getTypeParameters();
        o6.j.d(typeParameters2, "getTypeParameters(...)");
        c0845h.f0(sb, typeParameters2);
    }

    public static EnumC0023y t(InterfaceC0022x interfaceC0022x) {
        InterfaceC0004e interfaceC0004e;
        boolean z8 = interfaceC0022x instanceof InterfaceC0004e;
        EnumC0023y enumC0023y = EnumC0023y.f781h;
        EnumC0005f enumC0005f = EnumC0005f.f742e;
        EnumC0023y enumC0023y2 = EnumC0023y.f778e;
        if (z8) {
            if (((InterfaceC0004e) interfaceC0022x).e() == enumC0005f) {
                return enumC0023y;
            }
            return enumC0023y2;
        }
        InterfaceC0010k q6 = interfaceC0022x.q();
        if (q6 instanceof InterfaceC0004e) {
            interfaceC0004e = (InterfaceC0004e) q6;
        } else {
            interfaceC0004e = null;
        }
        if (interfaceC0004e == null) {
            return enumC0023y2;
        }
        if (!(interfaceC0022x instanceof InterfaceC0002c)) {
            return enumC0023y2;
        }
        InterfaceC0002c interfaceC0002c = (InterfaceC0002c) interfaceC0022x;
        Collection s8 = interfaceC0002c.s();
        o6.j.d(s8, "getOverriddenDescriptors(...)");
        boolean isEmpty = s8.isEmpty();
        EnumC0023y enumC0023y3 = EnumC0023y.f780g;
        if (!isEmpty && interfaceC0004e.j() != enumC0023y2) {
            return enumC0023y3;
        }
        if (interfaceC0004e.e() == enumC0005f && !o6.j.a(interfaceC0002c.d(), AbstractC0015p.f754a)) {
            if (interfaceC0002c.j() == enumC0023y) {
                return enumC0023y;
            }
            return enumC0023y3;
        }
        return enumC0023y2;
    }

    public final void A(StringBuilder sb, List list) {
        if (!list.isEmpty()) {
            sb.append("context(");
            Iterator it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                int i8 = i4 + 1;
                w wVar = (w) it.next();
                w(sb, wVar, D6.e.j);
                AbstractC1759v b4 = wVar.b();
                o6.j.d(b4, "getType(...)");
                sb.append(E(b4));
                if (i4 == AbstractC0437l.W(list)) {
                    sb.append(") ");
                } else {
                    sb.append(", ");
                }
                i4 = i8;
            }
        }
    }

    public final void B(StringBuilder sb, z zVar) {
        InterfaceC0008i interfaceC0008i;
        w(sb, zVar, null);
        if (AbstractC1741c.j(zVar)) {
            boolean z8 = zVar instanceof y7.i;
            C0849l c0849l = this.f11449a;
            if (z8 && ((y7.i) zVar).f16531g.f16566e && ((Boolean) c0849l.f11489V.a(c0849l, C0849l.Y[47])).booleanValue()) {
                y7.l lVar = y7.l.f16567a;
                if (z8) {
                    boolean z9 = ((y7.i) zVar).f16531g.f16566e;
                }
                J B02 = zVar.B0();
                o6.j.c(B02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(C(((y7.j) B02).f16535b[0]));
            } else {
                if (z8 && !((Boolean) c0849l.f11491X.a(c0849l, C0849l.Y[49])).booleanValue()) {
                    sb.append(((y7.i) zVar).k);
                } else {
                    sb.append(zVar.B0().toString());
                }
                sb.append(W(zVar.r0()));
            }
        } else {
            J B03 = zVar.B0();
            InterfaceC0007h c6 = zVar.B0().c();
            if (c6 instanceof InterfaceC0008i) {
                interfaceC0008i = (InterfaceC0008i) c6;
            } else {
                interfaceC0008i = null;
            }
            A4.c a3 = AbstractC0021w.a(zVar, interfaceC0008i, 0);
            if (a3 == null) {
                sb.append(X(B03));
                sb.append(W(zVar.r0()));
            } else {
                R(sb, a3);
            }
        }
        if (zVar.E0()) {
            sb.append("?");
        }
        if (zVar instanceof C1750l) {
            sb.append(" & Any");
        }
    }

    public final String C(String str) {
        int ordinal = q().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return A.j.p("<font color=red><b>", str, "</b></font>");
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    public final String D(String str, String str2, z6.h hVar) {
        o6.j.e(str, "lowerRendered");
        o6.j.e(str2, "upperRendered");
        if (u.p(str, str2)) {
            if (v.a0(str2, "(")) {
                return A.j.p("(", str, ")!");
            }
            return str.concat("!");
        }
        String v02 = I7.m.v0(n().a(hVar.j(z6.m.f16740C), this), "Collection");
        String k = u.k(str, v02.concat("Mutable"), str2, v02, v02.concat("(Mutable)"));
        if (k != null) {
            return k;
        }
        String k6 = u.k(str, v02.concat("MutableMap.MutableEntry"), str2, v02.concat("Map.Entry"), v02.concat("(Mutable)Map.(Mutable)Entry"));
        if (k6 != null) {
            return k6;
        }
        String v03 = I7.m.v0(n().a(hVar.k("Array"), this), "Array");
        String k8 = u.k(str, v03.concat(m("Array<")), str2, v03.concat(m("Array<out ")), v03.concat(m("Array<(out) ")));
        if (k8 != null) {
            return k8;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String E(AbstractC1759v abstractC1759v) {
        String V6 = V(abstractC1759v);
        if ((g0(abstractC1759v) && !w7.U.e(abstractC1759v)) || (abstractC1759v instanceof C1750l)) {
            return "(" + V6 + ')';
        }
        return V6;
    }

    public final void F(W w8, StringBuilder sb) {
        k7.g u02;
        String z8;
        C0849l c0849l = this.f11449a;
        if (((Boolean) c0849l.f11510u.a(c0849l, C0849l.Y[19])).booleanValue() && (u02 = w8.u0()) != null && (z8 = z(u02)) != null) {
            sb.append(" = ");
            sb.append(m(z8));
        }
    }

    public final String G(String str) {
        int ordinal = q().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C0849l c0849l = this.f11449a;
                if (!((Boolean) c0849l.f11490W.a(c0849l, C0849l.Y[48])).booleanValue()) {
                    return A.j.p("<b>", str, "</b>");
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return str;
    }

    public final void H(InterfaceC0002c interfaceC0002c, StringBuilder sb) {
        String str;
        if (o().contains(EnumC0846i.MEMBER_KIND) && s() && interfaceC0002c.e() != 1) {
            sb.append("/*");
            int e9 = interfaceC0002c.e();
            if (e9 != 1) {
                if (e9 != 2) {
                    if (e9 != 3) {
                        if (e9 == 4) {
                            str = "SYNTHESIZED";
                        } else {
                            throw null;
                        }
                    } else {
                        str = "DELEGATION";
                    }
                } else {
                    str = "FAKE_OVERRIDE";
                }
            } else {
                str = "DECLARATION";
            }
            sb.append(E2.b.O(str));
            sb.append("*/ ");
        }
    }

    public final void I(InterfaceC0022x interfaceC0022x, StringBuilder sb) {
        boolean z8;
        L(sb, interfaceC0022x.z(), "external");
        boolean z9 = false;
        if (o().contains(EnumC0846i.EXPECT) && interfaceC0022x.c0()) {
            z8 = true;
        } else {
            z8 = false;
        }
        L(sb, z8, "expect");
        if (o().contains(EnumC0846i.ACTUAL) && interfaceC0022x.v0()) {
            z9 = true;
        }
        L(sb, z9, "actual");
    }

    public final void J(EnumC0023y enumC0023y, StringBuilder sb, EnumC0023y enumC0023y2) {
        C0849l c0849l = this.f11449a;
        if (!((Boolean) c0849l.f11505p.a(c0849l, C0849l.Y[14])).booleanValue() && enumC0023y == enumC0023y2) {
            return;
        }
        L(sb, o().contains(EnumC0846i.MODALITY), E2.b.O(enumC0023y.name()));
    }

    public final void K(InterfaceC0002c interfaceC0002c, StringBuilder sb) {
        if (!AbstractC0890e.r(interfaceC0002c) || interfaceC0002c.j() != EnumC0023y.f778e) {
            C0849l c0849l = this.f11449a;
            if (((EnumC0852o) c0849l.f11470B.a(c0849l, C0849l.Y[26])) == EnumC0852o.f11518d && interfaceC0002c.j() == EnumC0023y.f780g && !interfaceC0002c.s().isEmpty()) {
                return;
            }
            EnumC0023y j = interfaceC0002c.j();
            o6.j.d(j, "getModality(...)");
            J(j, sb, t(interfaceC0002c));
        }
    }

    public final void L(StringBuilder sb, boolean z8, String str) {
        if (z8) {
            sb.append(G(str));
            sb.append(" ");
        }
    }

    public final String M(C0725e c0725e, boolean z8) {
        String m6 = m(u.i(c0725e));
        C0849l c0849l = this.f11449a;
        if (((Boolean) c0849l.f11490W.a(c0849l, C0849l.Y[48])).booleanValue() && q() == EnumC0857t.f11529e && z8) {
            return A.j.p("<b>", m6, "</b>");
        }
        return m6;
    }

    public final void N(InterfaceC0010k interfaceC0010k, StringBuilder sb, boolean z8) {
        C0725e name = interfaceC0010k.getName();
        o6.j.d(name, "getName(...)");
        sb.append(M(name, z8));
    }

    public final void O(StringBuilder sb, AbstractC1759v abstractC1759v) {
        C1739a c1739a;
        w7.W H02 = abstractC1759v.H0();
        if (H02 instanceof C1739a) {
            c1739a = (C1739a) H02;
        } else {
            c1739a = null;
        }
        if (c1739a != null) {
            z zVar = c1739a.f15988f;
            z zVar2 = c1739a.f15987e;
            C0849l c0849l = this.f11449a;
            C0848k c0848k = c0849l.f11485R;
            u6.s[] sVarArr = C0849l.Y;
            boolean booleanValue = ((Boolean) c0848k.a(c0849l, sVarArr[42])).booleanValue();
            C0855r c0855r = EnumC0857t.f11529e;
            if (booleanValue) {
                P(sb, zVar2);
                if (((Boolean) c0849l.f11486S.a(c0849l, sVarArr[43])).booleanValue()) {
                    if (q() == c0855r) {
                        sb.append("<font color=\"808080\"><i>");
                    }
                    sb.append(" /* ");
                    sb.append("from: ");
                    P(sb, zVar);
                    sb.append(" */");
                    if (q() == c0855r) {
                        sb.append("</i></font>");
                        return;
                    }
                    return;
                }
                return;
            }
            P(sb, zVar);
            if (((Boolean) c0849l.f11484Q.a(c0849l, sVarArr[41])).booleanValue()) {
                if (q() == c0855r) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("= ");
                P(sb, zVar2);
                sb.append(" */");
                if (q() == c0855r) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        P(sb, abstractC1759v);
    }

    public final void P(StringBuilder sb, AbstractC1759v abstractC1759v) {
        boolean z8;
        boolean z9;
        C0725e c0725e;
        String m6;
        boolean z10;
        C0849l c0849l = this.f11449a;
        if ((abstractC1759v instanceof C1761x) && c0849l.l()) {
            v7.i iVar = ((C1761x) abstractC1759v).f16023g;
            if (iVar.f15554f == v7.j.f15555d || iVar.f15554f == v7.j.f15556e) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        w7.W H02 = abstractC1759v.H0();
        if (H02 instanceof AbstractC1754p) {
            sb.append(((AbstractC1754p) H02).M0(this, this));
            return;
        }
        if (H02 instanceof z) {
            z zVar = (z) H02;
            if (!zVar.equals(w7.U.f15978b) && zVar.B0() != w7.U.f15977a.f16529e) {
                J B02 = zVar.B0();
                if ((B02 instanceof y7.j) && ((y7.j) B02).f16534a == y7.k.UNINFERRED_TYPE_VARIABLE) {
                    if (((Boolean) c0849l.f11509t.a(c0849l, C0849l.Y[18])).booleanValue()) {
                        J B03 = zVar.B0();
                        o6.j.c(B03, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                        sb.append(C(((y7.j) B03).f16535b[0]));
                        return;
                    }
                    sb.append("???");
                    return;
                }
                if (AbstractC1741c.j(zVar)) {
                    B(sb, zVar);
                    return;
                }
                if (g0(zVar)) {
                    int length = sb.length();
                    ((C0845h) this.f11450b.getValue()).w(sb, zVar, null);
                    if (sb.length() != length) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    AbstractC1759v o7 = h4.g.o(zVar);
                    List j = h4.g.j(zVar);
                    boolean r8 = h4.g.r(zVar);
                    boolean E02 = zVar.E0();
                    if (!E02 && (!z8 || o7 == null)) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (z9) {
                        if (r8) {
                            sb.insert(length, '(');
                        } else {
                            if (z8) {
                                AbstractC1492c.y(I7.m.k0(sb));
                                if (sb.charAt(I7.m.e0(sb) - 1) != ')') {
                                    sb.insert(I7.m.e0(sb), "()");
                                }
                            }
                            sb.append("(");
                        }
                    }
                    L(sb, r8, "suspend");
                    if (!j.isEmpty()) {
                        sb.append("context(");
                        Iterator it = j.subList(0, AbstractC0437l.W(j)).iterator();
                        while (it.hasNext()) {
                            O(sb, (AbstractC1759v) it.next());
                            sb.append(", ");
                        }
                        O(sb, (AbstractC1759v) AbstractC0436k.x0(j));
                        sb.append(") ");
                    }
                    if (o7 != null) {
                        if ((!g0(o7) || o7.E0()) && !h4.g.r(o7) && o7.getAnnotations().isEmpty() && !(o7 instanceof C1750l)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            sb.append("(");
                        }
                        O(sb, o7);
                        if (z10) {
                            sb.append(")");
                        }
                        sb.append(".");
                    }
                    sb.append("(");
                    if (h4.g.q(zVar) && zVar.getAnnotations().e(z6.m.f16782p) != null && zVar.r0().size() <= 1) {
                        sb.append("???");
                    } else {
                        int i4 = 0;
                        for (M m8 : h4.g.p(zVar)) {
                            int i8 = i4 + 1;
                            if (i4 > 0) {
                                sb.append(", ");
                            }
                            if (((Boolean) c0849l.f11488U.a(c0849l, C0849l.Y[45])).booleanValue()) {
                                AbstractC1759v b4 = m8.b();
                                o6.j.d(b4, "getType(...)");
                                c0725e = h4.g.i(b4);
                            } else {
                                c0725e = null;
                            }
                            if (c0725e != null) {
                                sb.append(M(c0725e, false));
                                sb.append(": ");
                            }
                            o6.j.e(m8, "typeProjection");
                            StringBuilder sb2 = new StringBuilder();
                            AbstractC0436k.u0(E2.d.y(m8), sb2, ", ", null, null, new C0844g(this, 0), 60);
                            sb.append(sb2.toString());
                            i4 = i8;
                        }
                    }
                    sb.append(") ");
                    int ordinal = q().ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            m6 = "&rarr;";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        m6 = m("->");
                    }
                    sb.append(m6);
                    sb.append(" ");
                    h4.g.q(zVar);
                    AbstractC1759v b9 = ((M) AbstractC0436k.x0(zVar.r0())).b();
                    o6.j.d(b9, "getType(...)");
                    O(sb, b9);
                    if (z9) {
                        sb.append(")");
                    }
                    if (E02) {
                        sb.append("?");
                        return;
                    }
                    return;
                }
                B(sb, zVar);
                return;
            }
            sb.append("???");
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void Q(InterfaceC0002c interfaceC0002c, StringBuilder sb) {
        if (o().contains(EnumC0846i.OVERRIDE) && !interfaceC0002c.s().isEmpty()) {
            C0849l c0849l = this.f11449a;
            if (((EnumC0852o) c0849l.f11470B.a(c0849l, C0849l.Y[26])) != EnumC0852o.f11519e) {
                L(sb, true, "override");
                if (s()) {
                    sb.append("/*");
                    sb.append(interfaceC0002c.s().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void R(StringBuilder sb, A4.c cVar) {
        A4.c cVar2 = (A4.c) cVar.f293g;
        InterfaceC0008i interfaceC0008i = (InterfaceC0008i) cVar.f291e;
        if (cVar2 != null) {
            R(sb, cVar2);
            sb.append('.');
            C0725e name = interfaceC0008i.getName();
            o6.j.d(name, "getName(...)");
            sb.append(M(name, false));
        } else {
            J B8 = interfaceC0008i.B();
            o6.j.d(B8, "getTypeConstructor(...)");
            sb.append(X(B8));
        }
        sb.append(W((List) cVar.f292f));
    }

    public final void S(InterfaceC0002c interfaceC0002c, StringBuilder sb) {
        w M8 = interfaceC0002c.M();
        if (M8 != null) {
            w(sb, M8, D6.e.j);
            AbstractC1759v b4 = M8.b();
            o6.j.d(b4, "getType(...)");
            sb.append(E(b4));
            sb.append(".");
        }
    }

    public final void T(InterfaceC0002c interfaceC0002c, StringBuilder sb) {
        w M8;
        C0849l c0849l = this.f11449a;
        if (((Boolean) c0849l.f11474F.a(c0849l, C0849l.Y[30])).booleanValue() && (M8 = interfaceC0002c.M()) != null) {
            sb.append(" on ");
            AbstractC1759v b4 = M8.b();
            o6.j.d(b4, "getType(...)");
            sb.append(V(b4));
        }
    }

    public final String V(AbstractC1759v abstractC1759v) {
        o6.j.e(abstractC1759v, "type");
        StringBuilder sb = new StringBuilder();
        C0849l c0849l = this.f11449a;
        O(sb, (AbstractC1759v) ((InterfaceC1163b) c0849l.f11514y.a(c0849l, C0849l.Y[23])).m(abstractC1759v));
        return sb.toString();
    }

    public final String W(List list) {
        o6.j.e(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m("<"));
        AbstractC0436k.u0(list, sb, ", ", null, null, new C0844g(this, 0), 60);
        sb.append(m(">"));
        return sb.toString();
    }

    public final String X(J j) {
        o6.j.e(j, "typeConstructor");
        InterfaceC0007h c6 = j.c();
        if (!(c6 instanceof T) && !(c6 instanceof InterfaceC0004e) && !(c6 instanceof S)) {
            if (c6 == null) {
                if (j instanceof C1758u) {
                    return ((C1758u) j).g(C0841d.f11438p);
                }
                return j.toString();
            }
            throw new IllegalStateException(("Unexpected classifier: " + c6.getClass()).toString());
        }
        o6.j.e(c6, "klass");
        if (y7.l.f(c6)) {
            return c6.B().toString();
        }
        return n().a(c6, this);
    }

    public final void Y(T t8, StringBuilder sb, boolean z8) {
        boolean z9;
        if (z8) {
            sb.append(m("<"));
        }
        if (s()) {
            sb.append("/*");
            sb.append(t8.getIndex());
            sb.append("*/ ");
        }
        L(sb, t8.R(), "reified");
        String str = t8.e0().f15985d;
        boolean z10 = true;
        if (str.length() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        L(sb, z9, str);
        w(sb, t8, null);
        N(t8, sb, z8);
        int size = t8.getUpperBounds().size();
        if ((size > 1 && !z8) || size == 1) {
            AbstractC1759v abstractC1759v = (AbstractC1759v) t8.getUpperBounds().iterator().next();
            if (abstractC1759v != null) {
                if (!z6.h.y(abstractC1759v) || !abstractC1759v.E0()) {
                    sb.append(" : ");
                    sb.append(V(abstractC1759v));
                }
            } else {
                z6.h.a(141);
                throw null;
            }
        } else if (z8) {
            for (AbstractC1759v abstractC1759v2 : t8.getUpperBounds()) {
                if (abstractC1759v2 != null) {
                    if (!z6.h.y(abstractC1759v2) || !abstractC1759v2.E0()) {
                        if (z10) {
                            sb.append(" : ");
                        } else {
                            sb.append(" & ");
                        }
                        sb.append(V(abstractC1759v2));
                        z10 = false;
                    }
                } else {
                    z6.h.a(141);
                    throw null;
                }
            }
        }
        if (z8) {
            sb.append(m(">"));
        }
    }

    public final void Z(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Y((T) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // h7.InterfaceC0847j
    public final void a() {
        this.f11449a.a();
    }

    public final void a0(StringBuilder sb, List list, boolean z8) {
        C0849l c0849l = this.f11449a;
        if (!((Boolean) c0849l.f11512w.a(c0849l, C0849l.Y[21])).booleanValue() && !list.isEmpty()) {
            sb.append(m("<"));
            Z(sb, list);
            sb.append(m(">"));
            if (z8) {
                sb.append(" ");
            }
        }
    }

    @Override // h7.InterfaceC0847j
    public final void b(InterfaceC0840c interfaceC0840c) {
        this.f11449a.b(interfaceC0840c);
    }

    public final void b0(W w8, StringBuilder sb, boolean z8) {
        String str;
        if (!z8 && (w8 instanceof U)) {
            return;
        }
        if (w8.H()) {
            str = "var";
        } else {
            str = "val";
        }
        sb.append(G(str));
        sb.append(" ");
    }

    @Override // h7.InterfaceC0847j
    public final void c() {
        this.f11449a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(U u8, boolean z8, StringBuilder sb, boolean z9) {
        boolean z10;
        AbstractC1759v b4;
        AbstractC1759v abstractC1759v;
        AbstractC1759v abstractC1759v2;
        boolean z11;
        boolean a3;
        if (z9) {
            sb.append(G("value-parameter"));
            sb.append(" ");
        }
        if (s()) {
            sb.append("/*");
            sb.append(u8.j);
            sb.append("*/ ");
        }
        C0050j c0050j = null;
        w(sb, u8, null);
        L(sb, u8.f1512l, "crossinline");
        L(sb, u8.f1513m, "noinline");
        C0849l c0849l = this.f11449a;
        C0848k c0848k = c0849l.f11507r;
        u6.s[] sVarArr = C0849l.Y;
        boolean z12 = false;
        if (((Boolean) c0848k.a(c0849l, sVarArr[16])).booleanValue()) {
            InterfaceC0001b q6 = u8.q();
            if (q6 instanceof C0050j) {
                c0050j = (C0050j) q6;
            }
            if (c0050j != null && c0050j.f1536H) {
                z10 = true;
                if (z10) {
                    L(sb, ((Boolean) c0849l.f11508s.a(c0849l, sVarArr[17])).booleanValue(), "actual");
                }
                b4 = u8.b();
                o6.j.d(b4, "getType(...)");
                abstractC1759v = u8.f1514n;
                if (abstractC1759v != null) {
                    abstractC1759v2 = b4;
                } else {
                    abstractC1759v2 = abstractC1759v;
                }
                if (abstractC1759v == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                L(sb, z11, "vararg");
                if (!z10 || (z9 && !p())) {
                    b0(u8, sb, z10);
                }
                if (z8) {
                    N(u8, sb, z9);
                    sb.append(": ");
                }
                sb.append(V(abstractC1759v2));
                F(u8, sb);
                if (s() && abstractC1759v != null) {
                    sb.append(" /*");
                    sb.append(V(b4));
                    sb.append("*/");
                }
                if (((InterfaceC1163b) c0849l.f11515z.a(c0849l, sVarArr[24])) != null) {
                    if (c0849l.l()) {
                        a3 = u8.N0();
                    } else {
                        a3 = AbstractC1098d.a(u8);
                    }
                    if (a3) {
                        z12 = true;
                    }
                }
                if (!z12) {
                    StringBuilder sb2 = new StringBuilder(" = ");
                    InterfaceC1163b interfaceC1163b = (InterfaceC1163b) c0849l.f11515z.a(c0849l, sVarArr[24]);
                    o6.j.b(interfaceC1163b);
                    sb2.append((String) interfaceC1163b.m(u8));
                    sb.append(sb2.toString());
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (z10) {
        }
        b4 = u8.b();
        o6.j.d(b4, "getType(...)");
        abstractC1759v = u8.f1514n;
        if (abstractC1759v != null) {
        }
        if (abstractC1759v == null) {
        }
        L(sb, z11, "vararg");
        if (!z10) {
        }
        b0(u8, sb, z10);
        if (z8) {
        }
        sb.append(V(abstractC1759v2));
        F(u8, sb);
        if (s()) {
            sb.append(" /*");
            sb.append(V(b4));
            sb.append("*/");
        }
        if (((InterfaceC1163b) c0849l.f11515z.a(c0849l, sVarArr[24])) != null) {
        }
        if (!z12) {
        }
    }

    @Override // h7.InterfaceC0847j
    public final void d() {
        this.f11449a.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        if (r10 == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0(StringBuilder sb, List list, boolean z8) {
        boolean z9;
        Iterator it;
        C0849l c0849l = this.f11449a;
        int ordinal = ((EnumC0853p) c0849l.f11473E.a(c0849l, C0849l.Y[29])).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            z9 = false;
            int size = list.size();
            r().getClass();
            o6.j.e(sb, "builder");
            sb.append("(");
            it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                int i8 = i4 + 1;
                U u8 = (U) it.next();
                r().getClass();
                o6.j.e(u8, "parameter");
                c0(u8, z9, sb, false);
                r().getClass();
                if (i4 != size - 1) {
                    sb.append(", ");
                }
                i4 = i8;
            }
            r().getClass();
            sb.append(")");
        }
        z9 = true;
        int size2 = list.size();
        r().getClass();
        o6.j.e(sb, "builder");
        sb.append("(");
        it = list.iterator();
        int i42 = 0;
        while (it.hasNext()) {
        }
        r().getClass();
        sb.append(")");
    }

    @Override // h7.InterfaceC0847j
    public final void e(EnumC0853p enumC0853p) {
        this.f11449a.e(enumC0853p);
    }

    public final boolean e0(C0014o c0014o, StringBuilder sb) {
        if (o().contains(EnumC0846i.VISIBILITY)) {
            C0849l c0849l = this.f11449a;
            C0848k c0848k = c0849l.f11503n;
            u6.s[] sVarArr = C0849l.Y;
            if (((Boolean) c0848k.a(c0849l, sVarArr[12])).booleanValue()) {
                c0014o = AbstractC0015p.f(c0014o.f752a.k());
            }
            if (!((Boolean) c0849l.f11504o.a(c0849l, sVarArr[13])).booleanValue() && o6.j.a(c0014o, AbstractC0015p.j)) {
                return false;
            }
            sb.append(G(c0014o.f752a.d()));
            sb.append(" ");
            return true;
        }
        return false;
    }

    @Override // h7.InterfaceC0847j
    public final void f(Set set) {
        o6.j.e(set, "<set-?>");
        this.f11449a.f(set);
    }

    public final void f0(StringBuilder sb, List list) {
        C0849l c0849l = this.f11449a;
        if (!((Boolean) c0849l.f11512w.a(c0849l, C0849l.Y[21])).booleanValue()) {
            ArrayList arrayList = new ArrayList(0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                T t8 = (T) it.next();
                List upperBounds = t8.getUpperBounds();
                o6.j.d(upperBounds, "getUpperBounds(...)");
                for (AbstractC1759v abstractC1759v : AbstractC0436k.m0(upperBounds)) {
                    StringBuilder sb2 = new StringBuilder();
                    C0725e name = t8.getName();
                    o6.j.d(name, "getName(...)");
                    sb2.append(M(name, false));
                    sb2.append(" : ");
                    o6.j.b(abstractC1759v);
                    sb2.append(V(abstractC1759v));
                    arrayList.add(sb2.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" ");
                sb.append(G("where"));
                sb.append(" ");
                AbstractC0436k.u0(arrayList, sb, ", ", null, null, null, 124);
            }
        }
    }

    @Override // h7.InterfaceC0847j
    public final void g() {
        this.f11449a.g();
    }

    @Override // h7.InterfaceC0847j
    public final void h() {
        this.f11449a.h();
    }

    @Override // h7.InterfaceC0847j
    public final void i() {
        this.f11449a.i();
    }

    @Override // h7.InterfaceC0847j
    public final void j() {
        this.f11449a.j();
    }

    @Override // h7.InterfaceC0847j
    public final void k() {
        this.f11449a.k();
    }

    public final String m(String str) {
        return q().a(str);
    }

    public final InterfaceC0840c n() {
        C0849l c0849l = this.f11449a;
        return (InterfaceC0840c) c0849l.f11493b.a(c0849l, C0849l.Y[0]);
    }

    public final Set o() {
        C0849l c0849l = this.f11449a;
        return (Set) c0849l.f11496e.a(c0849l, C0849l.Y[3]);
    }

    public final boolean p() {
        C0849l c0849l = this.f11449a;
        return ((Boolean) c0849l.f11497f.a(c0849l, C0849l.Y[4])).booleanValue();
    }

    public final EnumC0857t q() {
        C0849l c0849l = this.f11449a;
        return (EnumC0857t) c0849l.f11472D.a(c0849l, C0849l.Y[28]);
    }

    public final C0843f r() {
        C0849l c0849l = this.f11449a;
        return (C0843f) c0849l.f11471C.a(c0849l, C0849l.Y[27]);
    }

    public final boolean s() {
        C0849l c0849l = this.f11449a;
        return ((Boolean) c0849l.j.a(c0849l, C0849l.Y[8])).booleanValue();
    }

    public final String u(InterfaceC0010k interfaceC0010k) {
        InterfaceC0010k q6;
        String str;
        String m6;
        o6.j.e(interfaceC0010k, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        interfaceC0010k.K(new W5.a(14, this), sb);
        C0849l c0849l = this.f11449a;
        C0848k c0848k = c0849l.f11494c;
        u6.s[] sVarArr = C0849l.Y;
        if (((Boolean) c0848k.a(c0849l, sVarArr[1])).booleanValue() && !(interfaceC0010k instanceof F) && !(interfaceC0010k instanceof C6.J) && (q6 = interfaceC0010k.q()) != null && !(q6 instanceof A)) {
            sb.append(" ");
            int ordinal = q().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str = "<i>defined in</i>";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                str = "defined in";
            }
            sb.append(str);
            sb.append(" ");
            C0724d g8 = AbstractC0890e.g(q6);
            o6.j.d(g8, "getFqName(...)");
            if (g8.c()) {
                m6 = "root package";
            } else {
                m6 = m(u.j(C0724d.e(g8)));
            }
            sb.append(m6);
            if (((Boolean) c0849l.f11495d.a(c0849l, sVarArr[2])).booleanValue() && (q6 instanceof F) && (interfaceC0010k instanceof InterfaceC0011l)) {
                ((InterfaceC0011l) interfaceC0010k).h().getClass();
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String v(D6.c cVar, D6.e eVar) {
        InterfaceC0004e interfaceC0004e;
        String str;
        C0050j n02;
        List z02;
        C0849l c0849l = this.f11449a;
        C0848k c0848k = c0849l.f11481N;
        o6.j.e(cVar, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (eVar != null) {
            sb.append(eVar.f1035d + ':');
        }
        AbstractC1759v b4 = cVar.b();
        sb.append(V(b4));
        u6.s[] sVarArr = C0849l.Y;
        if (((EnumC0838a) c0848k.a(c0849l, sVarArr[38])).f11423d) {
            Map c6 = cVar.c();
            a6.s sVar = null;
            if (((Boolean) c0849l.f11477I.a(c0849l, sVarArr[33])).booleanValue()) {
                interfaceC0004e = AbstractC1098d.d(cVar);
            } else {
                interfaceC0004e = null;
            }
            if (interfaceC0004e != null && (n02 = interfaceC0004e.n0()) != null && (z02 = n02.z0()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : z02) {
                    if (((U) obj).N0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((U) it.next()).getName());
                }
                sVar = arrayList2;
            }
            if (sVar == null) {
                sVar = a6.s.f7766d;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : sVar) {
                if (!c6.containsKey((C0725e) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC0438m.d0(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((C0725e) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> entrySet = c6.entrySet();
            ArrayList arrayList5 = new ArrayList(AbstractC0438m.d0(entrySet, 10));
            for (Map.Entry entry : entrySet) {
                C0725e c0725e = (C0725e) entry.getKey();
                k7.g gVar = (k7.g) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c0725e.b());
                sb2.append(" = ");
                if (!sVar.contains(c0725e)) {
                    str = z(gVar);
                } else {
                    str = "...";
                }
                sb2.append(str);
                arrayList5.add(sb2.toString());
            }
            List K02 = AbstractC0436k.K0(AbstractC0436k.C0(arrayList4, arrayList5));
            if (((EnumC0838a) c0848k.a(c0849l, C0849l.Y[38])).f11424e || !K02.isEmpty()) {
                AbstractC0436k.u0(K02, sb, ", ", "(", ")", null, 112);
            }
        }
        if (s() && (AbstractC1741c.j(b4) || (b4.B0().c() instanceof E))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final void w(StringBuilder sb, D6.a aVar, D6.e eVar) {
        Set set;
        if (o().contains(EnumC0846i.ANNOTATIONS)) {
            boolean z8 = aVar instanceof AbstractC1759v;
            C0849l c0849l = this.f11449a;
            if (z8) {
                set = c0849l.m();
            } else {
                set = (Set) c0849l.K.a(c0849l, C0849l.Y[35]);
            }
            InterfaceC1163b interfaceC1163b = (InterfaceC1163b) c0849l.f11480M.a(c0849l, C0849l.Y[37]);
            for (D6.c cVar : aVar.getAnnotations()) {
                if (!AbstractC0436k.l0(set, cVar.a()) && !o6.j.a(cVar.a(), z6.m.f16784r) && (interfaceC1163b == null || ((Boolean) interfaceC1163b.m(cVar)).booleanValue())) {
                    sb.append(v(cVar, eVar));
                    if (((Boolean) c0849l.f11478J.a(c0849l, C0849l.Y[34])).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final void y(InterfaceC0008i interfaceC0008i, StringBuilder sb) {
        List t8 = interfaceC0008i.t();
        o6.j.d(t8, "getDeclaredTypeParameters(...)");
        List e9 = interfaceC0008i.B().e();
        o6.j.d(e9, "getParameters(...)");
        if (s() && interfaceC0008i.d0() && e9.size() > t8.size()) {
            sb.append(" /*captured type parameters: ");
            Z(sb, e9.subList(t8.size(), e9.size()));
            sb.append("*/");
        }
    }

    public final String z(k7.g gVar) {
        C0849l c0849l = this.f11449a;
        InterfaceC1163b interfaceC1163b = (InterfaceC1163b) c0849l.f11511v.a(c0849l, C0849l.Y[20]);
        if (interfaceC1163b != null) {
            return (String) interfaceC1163b.m(gVar);
        }
        if (gVar instanceof k7.b) {
            Iterable iterable = (Iterable) ((k7.b) gVar).f12144a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String z8 = z((k7.g) it.next());
                if (z8 != null) {
                    arrayList.add(z8);
                }
            }
            return AbstractC0436k.v0(arrayList, ", ", "{", "}", null, 56);
        }
        if (gVar instanceof C0995a) {
            return I7.m.o0(v((D6.c) ((C0995a) gVar).f12144a, null), "@");
        }
        if (gVar instanceof k7.s) {
            k7.r rVar = (k7.r) ((k7.s) gVar).f12144a;
            if (rVar instanceof k7.p) {
                return ((k7.p) rVar).f12151a + "::class";
            }
            if (rVar instanceof k7.q) {
                k7.q qVar = (k7.q) rVar;
                String str = qVar.f12152a.f12142a.a().f10797a.f10800a;
                for (int i4 = 0; i4 < qVar.f12152a.f12143b; i4++) {
                    str = "kotlin.Array<" + str + '>';
                }
                return AbstractC1149a.g(str, "::class");
            }
            throw new NoWhenBranchMatchedException();
        }
        return gVar.toString();
    }
}
