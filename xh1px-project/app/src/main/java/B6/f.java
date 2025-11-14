package B6;

import C6.AbstractC0021w;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.InterfaceC0004e;
import C6.InterfaceC0006g;
import C6.InterfaceC0008i;
import C6.InterfaceC0009j;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.O;
import C6.S;
import F6.AbstractC0046f;
import F6.AbstractC0049i;
import F6.AbstractC0055o;
import F6.AbstractC0061v;
import F6.C;
import F6.C0050j;
import F6.C0052l;
import F6.w;
import I6.y;
import L7.C0165x;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a7.C0460v;
import a7.T;
import c7.InterfaceC0588g;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import i7.AbstractC0892g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import n1.AbstractC1149a;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import o.p1;
import p7.AbstractC1326h;
import p7.C1329k;
import s7.C1518i;
import u6.v;
import u7.C1655h;
import v7.C1679b;
import w6.C1715b;
import w6.F;
import w6.H;
import w6.n0;
import w6.o0;
import w6.w0;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.C1761x;
import w7.G;
import w7.J;
import w7.M;
import w7.Q;
import w7.W;
import w7.z;
import x6.C1801e;
import x7.C1824f;
import x7.C1827i;
import z7.InterfaceC1887d;

/* loaded from: classes.dex */
public final class f implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f470d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f471e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f472f;

    public /* synthetic */ f(AbstractC0055o abstractC0055o, Object obj, int i4) {
        this.f470d = i4;
        this.f471e = abstractC0055o;
        this.f472f = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v104, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, Z5.g] */
    @Override // n6.InterfaceC1162a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        Q d2;
        Collection i4;
        ArrayList arrayList;
        String concat;
        String b4;
        v vVar;
        switch (this.f470d) {
            case 0:
                h hVar = (h) this.f472f;
                v7.k kVar = (v7.k) this.f471e;
                InterfaceC1163b interfaceC1163b = hVar.f481b;
                C c6 = hVar.f480a;
                C0052l c0052l = new C0052l((InterfaceC0010k) interfaceC1163b.m(c6), h.f478g, EnumC0023y.f781h, EnumC0005f.f742e, E2.d.y(c6.f1450h.e()), kVar);
                c0052l.r0(new AbstractC1326h(kVar, c0052l), a6.u.f7768d, null);
                return c0052l;
            case 1:
                l lVar = (l) this.f472f;
                v7.k kVar2 = (v7.k) this.f471e;
                C l6 = lVar.l();
                o6.j.d(l6, "getBuiltInsModule(...)");
                return new r(l6, kVar2, new j(0, lVar));
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                r rVar = (r) this.f472f;
                v7.k kVar3 = (v7.k) this.f471e;
                C c9 = rVar.g().f487a;
                h.f475d.getClass();
                return AbstractC0021w.f(c9, h.f479h, new A4.a(kVar3, rVar.g().f487a)).l();
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                T6.i iVar = (T6.i) this.f472f;
                InterfaceC0004e interfaceC0004e = (InterfaceC0004e) this.f471e;
                A4.a aVar = iVar.f5839m;
                S6.a aVar2 = (S6.a) aVar.f280e;
                A4.a aVar3 = new A4.a(new S6.a(aVar2.f5398a, aVar2.f5399b, aVar2.f5400c, aVar2.f5401d, aVar2.f5402e, aVar2.f5403f, aVar2.f5405h, aVar2.f5406i, aVar2.j, aVar2.k, aVar2.f5407l, aVar2.f5408m, aVar2.f5409n, aVar2.f5410o, aVar2.f5411p, aVar2.f5412q, aVar2.f5413r, aVar2.f5414s, aVar2.f5415t, aVar2.f5416u, aVar2.f5417v, aVar2.f5418w), (S6.f) aVar.f281f, (Z5.g) aVar.f282g);
                InterfaceC0010k q6 = iVar.q();
                o6.j.d(q6, "getContainingDeclaration(...)");
                return new T6.i(aVar3, q6, iVar.k, interfaceC0004e);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                G.f15953e.getClass();
                G g8 = G.f15954f;
                J B8 = ((AbstractC0049i) this.f471e).B();
                List list = Collections.EMPTY_LIST;
                j jVar = new j(4, this);
                C1679b c1679b = v7.k.f15560e;
                o6.j.d(c1679b, "NO_LOCKS");
                return AbstractC1741c.u(list, new C1329k(c1679b, jVar), g8, B8, false);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                F7.f fVar = new F7.f();
                Iterator it = ((AbstractC0061v) this.f471e).s().iterator();
                while (it.hasNext()) {
                    fVar.add(((InterfaceC0019u) it.next()).f((Q) this.f472f));
                }
                return fVar;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                F6.Q q8 = (F6.Q) this.f472f;
                C0050j c0050j = (C0050j) this.f471e;
                v7.n nVar = q8.f1506H;
                S s8 = q8.f1507I;
                D6.j annotations = c0050j.getAnnotations();
                C0050j c0050j2 = c0050j;
                int e9 = c0050j2.e();
                AbstractC1149a.n("getKind(...)", e9);
                Object obj = q8.f1507I;
                O h8 = ((AbstractC0055o) obj).h();
                o6.j.d(h8, "getSource(...)");
                F6.Q q9 = new F6.Q(nVar, s8, c0050j, q8, annotations, e9, h8);
                F6.Q.K.getClass();
                u7.s sVar = (u7.s) obj;
                w wVar = null;
                if (sVar.M0() == null) {
                    d2 = null;
                } else {
                    d2 = Q.d(sVar.N0());
                }
                if (d2 == null) {
                    return null;
                }
                w wVar2 = c0050j2.f1590n;
                if (wVar2 != null) {
                    wVar = wVar2.f(d2);
                }
                w wVar3 = wVar;
                List W7 = c0050j2.W();
                o6.j.d(W7, "getContextReceiverParameters(...)");
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(W7, 10));
                Iterator it2 = W7.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((w) it2.next()).f(d2));
                }
                AbstractC0046f abstractC0046f = (AbstractC0046f) obj;
                List t8 = abstractC0046f.t();
                List z02 = q8.z0();
                AbstractC1759v abstractC1759v = q8.k;
                o6.j.b(abstractC1759v);
                q9.R0(null, wVar3, arrayList2, t8, z02, abstractC1759v, EnumC0023y.f778e, abstractC0046f.j);
                return q9;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                z l8 = ((S6.a) ((A4.a) this.f472f).f280e).f5410o.o().j(((Q6.b) this.f471e).f4909a).l();
                o6.j.d(l8, "getDefaultType(...)");
                return l8;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                A4.a aVar4 = (A4.a) this.f472f;
                D6.j annotations2 = ((InterfaceC0006g) this.f471e).getAnnotations();
                o6.j.e(aVar4, "<this>");
                o6.j.e(annotations2, "additionalAnnotations");
                return ((S6.a) aVar4.f280e).f5412q.b((P6.t) aVar4.f282g.getValue(), annotations2);
            case 9:
                A4.a aVar5 = (A4.a) this.f472f;
                D6.j jVar2 = (D6.j) this.f471e;
                o6.j.e(aVar5, "<this>");
                o6.j.e(jVar2, "additionalAnnotations");
                return ((S6.a) aVar5.f280e).f5412q.b((P6.t) aVar5.f282g.getValue(), jVar2);
            case 10:
                return new T6.q(((S6.d) this.f472f).f5426a, (y) this.f471e);
            case 11:
                A4.a aVar6 = (A4.a) this.f472f;
                T6.v vVar2 = (T6.v) this.f471e;
                W0.d dVar = ((S6.a) aVar6.f280e).f5399b;
                C0723c c0723c = vVar2.f5891o.f1461i;
                dVar.getClass();
                o6.j.e(c0723c, "packageFqName");
                return null;
            case 12:
                p1 p1Var = (p1) this.f472f;
                T t9 = (T) this.f471e;
                F3.m mVar = (F3.m) p1Var.f13349e;
                return ((C1518i) mVar.f1371d).f14577e.n(t9, (InterfaceC0588g) mVar.f1372e);
            case 13:
                C1655h c1655h = (C1655h) this.f472f;
                return AbstractC0436k.Q0(((C1518i) c1655h.f15404o.f1371d).f14577e.h(c1655h.f15413x, (C0460v) this.f471e));
            case 14:
                H h9 = (H) this.f472f;
                String str = (String) this.f471e;
                F f8 = h9.f15795f;
                String str2 = h9.f15796g;
                f8.getClass();
                o6.j.e(str2, "signature");
                if (str.equals("<init>")) {
                    i4 = AbstractC0436k.Q0(f8.h());
                    arrayList = new ArrayList();
                    for (Object obj2 : i4) {
                        InterfaceC0009j interfaceC0009j = (InterfaceC0009j) obj2;
                        if (interfaceC0009j.I()) {
                            InterfaceC0008i q10 = interfaceC0009j.q();
                            o6.j.d(q10, "getContainingDeclaration(...)");
                            if (AbstractC0892g.d(q10)) {
                                String b9 = w0.c(interfaceC0009j).b();
                                if (I7.v.a0(b9, "constructor-impl") && I7.v.W(b9, ")V")) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(I7.m.p0(b9, "V"));
                                    InterfaceC0008i q11 = interfaceC0009j.q();
                                    o6.j.d(q11, "getContainingDeclaration(...)");
                                    C0722b f9 = AbstractC1098d.f(q11);
                                    o6.j.b(f9);
                                    sb.append(e7.b.b(f9.b()));
                                    b4 = sb.toString();
                                    if (!o6.j.a(b4, str2)) {
                                        arrayList.add(obj2);
                                    }
                                } else {
                                    throw new IllegalArgumentException(("Invalid signature of " + interfaceC0009j + ": " + b9).toString());
                                }
                            }
                        }
                        b4 = w0.c(interfaceC0009j).b();
                        if (!o6.j.a(b4, str2)) {
                        }
                    }
                } else {
                    i4 = f8.i(C0725e.e(str));
                    arrayList = new ArrayList();
                    for (Object obj3 : i4) {
                        if (o6.j.a(w0.c((InterfaceC0019u) obj3).b(), str2)) {
                            arrayList.add(obj3);
                        }
                    }
                }
                Collection collection = i4;
                if (arrayList.size() != 1) {
                    String v02 = AbstractC0436k.v0(collection, "\n", null, null, C1715b.j, 30);
                    StringBuilder sb2 = new StringBuilder("Function '");
                    sb2.append(str);
                    sb2.append("' (JVM signature: ");
                    sb2.append(str2);
                    sb2.append(") not resolved in ");
                    sb2.append(f8);
                    sb2.append(':');
                    if (v02.length() == 0) {
                        concat = " no members found";
                    } else {
                        concat = "\n".concat(v02);
                    }
                    sb2.append(concat);
                    throw new C0165x(sb2.toString());
                }
                return (InterfaceC0019u) AbstractC0436k.G0(arrayList);
            case 15:
                o0 o0Var = (o0) this.f472f;
                InterfaceC1162a interfaceC1162a = (InterfaceC1162a) this.f471e;
                List r02 = o0Var.f15892a.r0();
                if (r02.isEmpty()) {
                    return a6.s.f7766d;
                }
                Z5.g c10 = Z5.a.c(Z5.h.f7482d, new n0(o0Var, 1));
                ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(r02, 10));
                int i8 = 0;
                for (Object obj4 : r02) {
                    int i9 = i8 + 1;
                    s7.p pVar = null;
                    if (i8 >= 0) {
                        M m6 = (M) obj4;
                        if (m6.c()) {
                            vVar = v.f15372c;
                        } else {
                            AbstractC1759v b10 = m6.b();
                            o6.j.d(b10, "getType(...)");
                            if (interfaceC1162a != null) {
                                pVar = new s7.p(o0Var, i8, c10);
                            }
                            o0 o0Var2 = new o0(b10, pVar);
                            int ordinal = m6.a().ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        vVar = new v(u6.w.f15377f, o0Var2);
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    vVar = new v(u6.w.f15376e, o0Var2);
                                }
                            } else {
                                vVar = new v(u6.w.f15375d, o0Var2);
                            }
                        }
                        arrayList3.add(vVar);
                        i8 = i9;
                    } else {
                        AbstractC0437l.c0();
                        throw null;
                    }
                }
                return arrayList3;
            case 16:
                C1824f c1824f = (C1824f) this.f472f;
                InterfaceC1887d interfaceC1887d = (InterfaceC1887d) ((C1761x) this.f471e).f16022f.a();
                c1824f.getClass();
                o6.j.e(interfaceC1887d, "type");
                return (AbstractC1759v) interfaceC1887d;
            case 17:
                Class cls = (Class) this.f472f;
                Map map = (Map) this.f471e;
                StringBuilder sb3 = new StringBuilder();
                sb3.append('@');
                sb3.append(cls.getCanonicalName());
                AbstractC0436k.u0(map.entrySet(), sb3, ", ", "(", ")", C1801e.f16258d, 48);
                return sb3.toString();
            default:
                C1827i c1827i = (C1827i) this.f472f;
                C1824f c1824f2 = (C1824f) this.f471e;
                Iterable iterable = (List) c1827i.f16293e.getValue();
                if (iterable == null) {
                    iterable = a6.s.f7766d;
                }
                ArrayList arrayList4 = new ArrayList(AbstractC0438m.d0(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((W) it3.next()).G0(c1824f2));
                }
                return arrayList4;
        }
    }

    public /* synthetic */ f(Object obj, int i4, Object obj2) {
        this.f470d = i4;
        this.f472f = obj;
        this.f471e = obj2;
    }
}
