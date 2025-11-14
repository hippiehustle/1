package C7;

import C6.AbstractC0021w;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.S;
import F6.AbstractC0054n;
import F6.U;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import f7.C0722b;
import f7.C0725e;
import h7.C0845h;
import i7.AbstractC0892g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC1098d;
import n6.InterfaceC1163b;
import q7.C1422c;
import q7.InterfaceC1423d;
import w7.AbstractC1759v;
import w7.W;
import w7.z;
import x7.InterfaceC1822d;

/* loaded from: classes.dex */
public final class h implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final h f795e = new h(0);

    /* renamed from: f, reason: collision with root package name */
    public static final h f796f = new h(1);

    /* renamed from: g, reason: collision with root package name */
    public static final h f797g = new h(2);

    /* renamed from: h, reason: collision with root package name */
    public static final h f798h = new h(3);

    /* renamed from: i, reason: collision with root package name */
    public static final h f799i = new h(4);
    public static final h j = new h(5);
    public static final h k = new h(6);

    /* renamed from: l, reason: collision with root package name */
    public static final h f800l = new h(7);

    /* renamed from: m, reason: collision with root package name */
    public static final h f801m = new h(8);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f802d;

    public /* synthetic */ h(int i4) {
        this.f802d = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        if (r9 == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // n6.InterfaceC1163b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        InterfaceC0004e interfaceC0004e;
        z l6;
        W m02;
        AbstractC1759v r8;
        boolean z8;
        C0722b f8;
        S s8;
        AbstractC1759v r9;
        boolean b4;
        boolean z9 = true;
        switch (this.f802d) {
            case 0:
                o6.j.e((InterfaceC0019u) obj, "<this>");
                return null;
            case 1:
                o6.j.e((InterfaceC0019u) obj, "<this>");
                return null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e((InterfaceC0019u) obj, "<this>");
                return null;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC0019u interfaceC0019u = (InterfaceC0019u) obj;
                List list = r.f821i;
                o6.j.e(interfaceC0019u, "$this$Checks");
                List z02 = interfaceC0019u.z0();
                o6.j.d(z02, "getValueParameters(...)");
                U u8 = (U) AbstractC0436k.y0(z02);
                if (u8 != null && !AbstractC1098d.a(u8) && u8.f1514n == null) {
                    return null;
                }
                return "last parameter should not have a default value or be a vararg";
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                InterfaceC0019u interfaceC0019u2 = (InterfaceC0019u) obj;
                List list2 = r.f821i;
                o6.j.e(interfaceC0019u2, "$this$Checks");
                InterfaceC0010k q6 = interfaceC0019u2.q();
                o6.j.d(q6, "getContainingDeclaration(...)");
                if (q6 instanceof InterfaceC0004e) {
                    C0725e c0725e = z6.h.f16714e;
                    if (z6.h.b((InterfaceC0004e) q6, z6.m.f16762a)) {
                        return null;
                    }
                }
                Collection s9 = interfaceC0019u2.s();
                o6.j.d(s9, "getOverriddenDescriptors(...)");
                if (!s9.isEmpty()) {
                    Iterator it = s9.iterator();
                    while (it.hasNext()) {
                        InterfaceC0010k q8 = ((InterfaceC0019u) it.next()).q();
                        o6.j.d(q8, "getContainingDeclaration(...)");
                        if (q8 instanceof InterfaceC0004e) {
                            C0725e c0725e2 = z6.h.f16714e;
                            if (z6.h.b((InterfaceC0004e) q8, z6.m.f16762a)) {
                                return null;
                            }
                        }
                    }
                }
                InterfaceC0010k q9 = interfaceC0019u2.q();
                if (q9 instanceof InterfaceC0004e) {
                    interfaceC0004e = (InterfaceC0004e) q9;
                } else {
                    interfaceC0004e = null;
                }
                if (interfaceC0004e != null) {
                    if (!AbstractC0892g.f(interfaceC0004e)) {
                        interfaceC0004e = null;
                    }
                    if (interfaceC0004e != null && (l6 = interfaceC0004e.l()) != null && (m02 = AbstractC0405a.m0(l6)) != null && (r8 = interfaceC0019u2.r()) != null && o6.j.a(((AbstractC0054n) interfaceC0019u2).getName(), s.f825d)) {
                        C0725e c0725e3 = z6.h.f16714e;
                        if ((z6.h.C(r8, z6.m.f16776h) || z6.h.F(r8)) && interfaceC0019u2.z0().size() == 1) {
                            AbstractC1759v b9 = ((U) interfaceC0019u2.z0().get(0)).b();
                            o6.j.d(b9, "getType(...)");
                            if (o6.j.a(AbstractC0405a.m0(b9), m02) && interfaceC0019u2.W().isEmpty() && interfaceC0019u2.M() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                InterfaceC0010k q10 = interfaceC0019u2.q();
                o6.j.d(q10, "getContainingDeclaration(...)");
                if (AbstractC0892g.f(q10)) {
                    C0845h c0845h = C0845h.f11447d;
                    InterfaceC0010k q11 = interfaceC0019u2.q();
                    o6.j.c(q11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    z l8 = ((InterfaceC0004e) q11).l();
                    o6.j.d(l8, "getDefaultType(...)");
                    sb.append(" or define ''equals(other: " + c0845h.V(AbstractC0405a.m0(l8)) + "): Boolean''");
                }
                return sb.toString();
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0019u interfaceC0019u3 = (InterfaceC0019u) obj;
                List list3 = r.f821i;
                o6.j.e(interfaceC0019u3, "$this$Checks");
                F6.w A2 = interfaceC0019u3.A();
                if (A2 == null) {
                    A2 = interfaceC0019u3.M();
                }
                if (A2 != null) {
                    AbstractC1759v r10 = interfaceC0019u3.r();
                    if (r10 != null) {
                        z8 = InterfaceC1822d.f16280a.b(r10, A2.b());
                    } else {
                        z8 = false;
                    }
                    if (!z8) {
                        InterfaceC1423d M02 = A2.M0();
                        o6.j.d(M02, "getValue(...)");
                        if (M02 instanceof C1422c) {
                            InterfaceC0004e interfaceC0004e2 = ((C1422c) M02).f14217d;
                            if (interfaceC0004e2.c0() && (f8 = AbstractC1098d.f(interfaceC0004e2)) != null) {
                                InterfaceC0007h e9 = AbstractC0021w.e(AbstractC1098d.j(interfaceC0004e2), f8);
                                if (e9 instanceof S) {
                                    s8 = (S) e9;
                                } else {
                                    s8 = null;
                                }
                                if (s8 != null && (r9 = interfaceC0019u3.r()) != null) {
                                    b4 = InterfaceC1822d.f16280a.b(r9, ((u7.s) s8).N0());
                                    break;
                                }
                            }
                        }
                        b4 = false;
                        break;
                    }
                    if (!z9) {
                        return null;
                    }
                    return "receiver must be a supertype of the return type";
                }
                z9 = false;
                if (!z9) {
                }
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                z6.h hVar = (z6.h) obj;
                t tVar = t.f840c;
                o6.j.e(hVar, "<this>");
                return hVar.t(z6.j.f16722i);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                z6.h hVar2 = (z6.h) obj;
                u uVar = u.f841c;
                o6.j.e(hVar2, "<this>");
                return hVar2.t(z6.j.f16724m);
            default:
                z6.h hVar3 = (z6.h) obj;
                v vVar = v.f842c;
                o6.j.e(hVar3, "<this>");
                return hVar3.x();
        }
    }
}
