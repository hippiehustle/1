package W5;

import C4.e;
import C6.AbstractC0021w;
import C6.C0014o;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.F;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import C6.InterfaceC0012m;
import C6.InterfaceC0019u;
import C6.M;
import C6.S;
import F6.A;
import F6.AbstractC0046f;
import F6.AbstractC0049i;
import F6.C;
import F6.C0050j;
import F6.E;
import F6.L;
import F6.U;
import F6.w;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import P.InterfaceC0268p;
import P.O;
import P.t0;
import X3.t;
import X7.f;
import Y6.l;
import Z.g;
import Z5.y;
import Z6.c;
import a6.AbstractC0436k;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f7.AbstractC0727g;
import f7.C0722b;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import g0.I;
import h7.C0841d;
import h7.C0844g;
import h7.C0845h;
import h7.C0848k;
import h7.C0849l;
import h7.EnumC0846i;
import h7.EnumC0854q;
import h7.u;
import i.K;
import i7.AbstractC0890e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import l3.C1018q;
import m5.InterfaceC1094a;
import n.SubMenuC1103E;
import n.k;
import n.m;
import n.x;
import o.C1197k;
import o.X;
import o4.C1258G;
import o4.z;
import o6.j;
import q4.C1376A;
import q4.C1386K;
import q5.i;
import s7.C1513d;
import s7.InterfaceC1514e;
import t0.AbstractC1534b;
import t0.AbstractC1537c0;
import t0.B0;
import t0.RunnableC1538d;
import t0.d0;
import t7.C1593c;
import u0.C1621l;
import u6.s;
import w7.AbstractC1759v;
import z6.h;

/* loaded from: classes.dex */
public class a implements InterfaceC0233f, l, InterfaceC0268p, InterfaceC0012m, k, InterfaceC1094a, x, X, i, InterfaceC1514e, B0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6633d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6634e;

    public /* synthetic */ a(int i4, Object obj) {
        this.f6633d = i4;
        this.f6634e = obj;
    }

    @Override // n.k
    public void A(m mVar) {
        switch (this.f6633d) {
            case 15:
                K k = (K) this.f6634e;
                Window.Callback callback = k.f11615c;
                if (k.f11614b.f13300a.p()) {
                    callback.onPanelClosed(108, mVar);
                    return;
                } else {
                    if (callback.onPreparePanel(0, null, mVar)) {
                        callback.onMenuOpened(108, mVar);
                        return;
                    }
                    return;
                }
            default:
                Toolbar toolbar = (Toolbar) this.f6634e;
                C1197k c1197k = toolbar.f8480d.f8398w;
                if (c1197k == null || !c1197k.e()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.f8467J.f292f).iterator();
                    while (it.hasNext()) {
                        ((I) it.next()).f10866a.t();
                    }
                }
                a aVar = toolbar.f8474R;
                if (aVar != null) {
                    aVar.A(mVar);
                    return;
                }
                return;
        }
    }

    @Override // Y6.l
    public l B(C0722b c0722b, C0725e c0725e) {
        return null;
    }

    @Override // C6.InterfaceC0012m
    public Object C(C c6, Object obj) {
        ((C0845h) this.f6634e).N(c6, (StringBuilder) obj, true);
        return y.f7506a;
    }

    public boolean D(int i4, int i8) {
        RunnableC1538d runnableC1538d = (RunnableC1538d) this.f6634e;
        Object obj = runnableC1538d.f14823d.get(i4);
        Object obj2 = runnableC1538d.f14824e.get(i8);
        if (obj != null && obj2 != null) {
            return ((AbstractC1534b) runnableC1538d.f14826g.f14833b.f14809f).a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean E(int i4, int i8) {
        RunnableC1538d runnableC1538d = (RunnableC1538d) this.f6634e;
        Object obj = runnableC1538d.f14823d.get(i4);
        Object obj2 = runnableC1538d.f14824e.get(i8);
        if (obj != null && obj2 != null) {
            return ((AbstractC1534b) runnableC1538d.f14826g.f14833b.f14809f).b(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        return false;
    }

    @Override // t0.B0
    public View F(int i4) {
        return ((AbstractC1537c0) this.f6634e).u(i4);
    }

    public Object G(f fVar, b8.k kVar) {
        Object obj;
        j.e(fVar, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.f6634e).get(fVar);
        if (map != null) {
            obj = map.get(kVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public void H(int i4, int i8) {
        RunnableC1538d runnableC1538d = (RunnableC1538d) this.f6634e;
        Object obj = runnableC1538d.f14823d.get(i4);
        Object obj2 = runnableC1538d.f14824e.get(i8);
        if (obj != null && obj2 != null) {
            ((AbstractC1534b) runnableC1538d.f14826g.f14833b.f14809f).getClass();
            return;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        if (((java.lang.Boolean) r2.f11482O.a(r2, h7.C0849l.Y[39])).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
    
        if (((java.lang.Boolean) r2.f11482O.a(r2, h7.C0849l.Y[39])).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019d, code lost:
    
        if (z6.h.E(r2, z6.m.f16768d) == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I(InterfaceC0019u interfaceC0019u, StringBuilder sb) {
        String V6;
        boolean z8;
        C0845h c0845h = (C0845h) this.f6634e;
        C0849l c0849l = c0845h.f11449a;
        C0849l c0849l2 = c0845h.f11449a;
        if (!c0845h.p()) {
            C0848k c0848k = c0849l2.f11498g;
            s[] sVarArr = C0849l.Y;
            if (!((Boolean) c0848k.a(c0849l2, sVarArr[5])).booleanValue()) {
                List W7 = interfaceC0019u.W();
                j.d(W7, "getContextReceiverParameters(...)");
                c0845h.A(sb, W7);
                c0845h.w(sb, interfaceC0019u, null);
                C0014o d2 = interfaceC0019u.d();
                j.d(d2, "getVisibility(...)");
                c0845h.e0(d2, sb);
                c0845h.K(interfaceC0019u, sb);
                if (((Boolean) c0849l2.f11487T.a(c0849l2, sVarArr[44])).booleanValue()) {
                    c0845h.I(interfaceC0019u, sb);
                }
                c0845h.Q(interfaceC0019u, sb);
                if (((Boolean) c0849l2.f11487T.a(c0849l2, sVarArr[44])).booleanValue()) {
                    boolean z9 = false;
                    if (interfaceC0019u.j0()) {
                        Collection s8 = interfaceC0019u.s();
                        j.d(s8, "getOverriddenDescriptors(...)");
                        if (!s8.isEmpty()) {
                            Iterator it = s8.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (((InterfaceC0019u) it.next()).j0()) {
                                }
                            }
                        }
                        z8 = true;
                        if (interfaceC0019u.A0()) {
                            Collection s9 = interfaceC0019u.s();
                            j.d(s9, "getOverriddenDescriptors(...)");
                            if (!s9.isEmpty()) {
                                Iterator it2 = s9.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if (((InterfaceC0019u) it2.next()).A0()) {
                                    }
                                }
                            }
                            z9 = true;
                        }
                        c0845h.L(sb, interfaceC0019u.i0(), "tailrec");
                        c0845h.L(sb, interfaceC0019u.p(), "suspend");
                        c0845h.L(sb, interfaceC0019u.g(), "inline");
                        c0845h.L(sb, z9, "infix");
                        c0845h.L(sb, z8, "operator");
                    }
                    z8 = false;
                    if (interfaceC0019u.A0()) {
                    }
                    c0845h.L(sb, interfaceC0019u.i0(), "tailrec");
                    c0845h.L(sb, interfaceC0019u.p(), "suspend");
                    c0845h.L(sb, interfaceC0019u.g(), "inline");
                    c0845h.L(sb, z9, "infix");
                    c0845h.L(sb, z8, "operator");
                } else {
                    c0845h.L(sb, interfaceC0019u.p(), "suspend");
                }
                c0845h.H(interfaceC0019u, sb);
                if (c0845h.s()) {
                    if (interfaceC0019u.g0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC0019u.q0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(c0845h.G("fun"));
            sb.append(" ");
            List typeParameters = interfaceC0019u.getTypeParameters();
            j.d(typeParameters, "getTypeParameters(...)");
            c0845h.a0(sb, typeParameters, true);
            c0845h.S(interfaceC0019u, sb);
        }
        c0845h.N(interfaceC0019u, sb, true);
        List z02 = interfaceC0019u.z0();
        j.d(z02, "getValueParameters(...)");
        c0845h.d0(sb, z02, interfaceC0019u.S());
        c0845h.T(interfaceC0019u, sb);
        AbstractC1759v r8 = interfaceC0019u.r();
        C0848k c0848k2 = c0849l.f11501l;
        s[] sVarArr2 = C0849l.Y;
        if (!((Boolean) c0848k2.a(c0849l, sVarArr2[10])).booleanValue()) {
            if (!((Boolean) c0849l.k.a(c0849l, sVarArr2[9])).booleanValue() && r8 != null) {
                C0725e c0725e = h.f16714e;
            }
            sb.append(": ");
            if (r8 == null) {
                V6 = "[NULL]";
            } else {
                V6 = c0845h.V(r8);
            }
            sb.append(V6);
        }
        List typeParameters2 = interfaceC0019u.getTypeParameters();
        j.d(typeParameters2, "getTypeParameters(...)");
        c0845h.f0(sb, typeParameters2);
    }

    @Override // t0.B0
    public int J() {
        return ((AbstractC1537c0) this.f6634e).J();
    }

    @Override // C6.InterfaceC0012m
    public Object K(AbstractC0049i abstractC0049i, Object obj) {
        ((C0845h) this.f6634e).Y(abstractC0049i, (StringBuilder) obj, true);
        return y.f7506a;
    }

    @Override // t0.B0
    public int L(View view) {
        return AbstractC1537c0.y(view) + ((ViewGroup.MarginLayoutParams) ((d0) view.getLayoutParams())).bottomMargin;
    }

    @Override // C6.InterfaceC0012m
    public Object M(AbstractC0046f abstractC0046f, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C0845h c0845h = (C0845h) this.f6634e;
        c0845h.getClass();
        c0845h.w(sb, abstractC0046f, null);
        C0014o c0014o = abstractC0046f.j;
        j.d(c0014o, "getVisibility(...)");
        c0845h.e0(c0014o, sb);
        c0845h.I(abstractC0046f, sb);
        sb.append(c0845h.G("typealias"));
        sb.append(" ");
        c0845h.N(abstractC0046f, sb, true);
        c0845h.a0(sb, abstractC0046f.t(), false);
        c0845h.y(abstractC0046f, sb);
        sb.append(" = ");
        sb.append(c0845h.V(((u7.s) abstractC0046f).O0()));
        return y.f7506a;
    }

    @Override // C6.InterfaceC0012m
    public Object N(F6.K k, Object obj) {
        j.e(k, "descriptor");
        C0845h.l((C0845h) this.f6634e, k, (StringBuilder) obj);
        return y.f7506a;
    }

    public void O(F6.I i4, StringBuilder sb, String str) {
        C0845h c0845h = (C0845h) this.f6634e;
        C0849l c0849l = c0845h.f11449a;
        int ordinal = ((EnumC0854q) c0849l.f11476H.a(c0849l, C0849l.Y[32])).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                I(i4, sb);
                return;
            }
        }
        c0845h.I(i4, sb);
        sb.append(str.concat(" for "));
        M M02 = i4.M0();
        j.d(M02, "getCorrespondingProperty(...)");
        C0845h.l(c0845h, M02, sb);
    }

    @Override // C6.InterfaceC0012m
    public Object Q(E e9, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C0845h c0845h = (C0845h) this.f6634e;
        c0845h.getClass();
        C0723c c0723c = e9.f1461i;
        sb.append(c0845h.G("package-fragment"));
        C0724d c0724d = c0723c.f10797a;
        j.e(c0724d, "fqName");
        String m6 = c0845h.m(u.j(C0724d.e(c0724d)));
        if (m6.length() > 0) {
            sb.append(" ");
            sb.append(m6);
        }
        if (c0845h.f11449a.l()) {
            sb.append(" in ");
            c0845h.N(e9.q(), sb, false);
        }
        return y.f7506a;
    }

    @Override // C6.InterfaceC0012m
    public Object S(w wVar, Object obj) {
        ((StringBuilder) obj).append(wVar.getName());
        return y.f7506a;
    }

    @Override // n.x
    public void a(m mVar, boolean z8) {
        if (mVar instanceof SubMenuC1103E) {
            ((SubMenuC1103E) mVar).f12576z.k().c(false);
        }
        x xVar = ((C1197k) this.f6634e).f13275h;
        if (xVar != null) {
            xVar.a(mVar, z8);
        }
    }

    @Override // C6.InterfaceC0012m
    public Object b(F6.M m6, Object obj) {
        O(m6, (StringBuilder) obj, "setter");
        return y.f7506a;
    }

    @Override // s7.InterfaceC1514e
    public C1513d c(C0722b c0722b) {
        C1513d c6;
        j.e(c0722b, "classId");
        Iterator it = AbstractC0021w.i((C6.I) this.f6634e, c0722b.f10793a).iterator();
        while (it.hasNext()) {
            F f8 = (F) it.next();
            if ((f8 instanceof C1593c) && (c6 = ((C1593c) f8).f15140m.c(c0722b)) != null) {
                return c6;
            }
        }
        return null;
    }

    @Override // C6.InterfaceC0012m
    public Object e(F6.y yVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C0845h c0845h = (C0845h) this.f6634e;
        c0845h.getClass();
        C0723c c0723c = yVar.f1610h;
        sb.append(c0845h.G("package"));
        C0724d c0724d = c0723c.f10797a;
        j.e(c0724d, "fqName");
        String m6 = c0845h.m(u.j(C0724d.e(c0724d)));
        if (m6.length() > 0) {
            sb.append(" ");
            sb.append(m6);
        }
        if (c0845h.f11449a.l()) {
            sb.append(" in context of ");
            c0845h.N(yVar.f1609g, sb, false);
        }
        return y.f7506a;
    }

    @Override // C6.InterfaceC0012m
    public Object f(U u8, Object obj) {
        ((C0845h) this.f6634e).c0(u8, true, (StringBuilder) obj, true);
        return y.f7506a;
    }

    @Override // C6.InterfaceC0012m
    public Object g(A a3, Object obj) {
        boolean z8;
        C0050j n02;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        C0845h c0845h = (C0845h) this.f6634e;
        C0849l c0849l = c0845h.f11449a;
        if (a3.e() == EnumC0005f.f744g) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!c0845h.p()) {
            List x02 = a3.x0();
            j.d(x02, "getContextReceivers(...)");
            c0845h.A(sb, x02);
            c0845h.w(sb, a3, null);
            if (!z8) {
                C0014o d2 = a3.d();
                j.d(d2, "getVisibility(...)");
                c0845h.e0(d2, sb);
            }
            if ((a3.e() != EnumC0005f.f742e || a3.j() != EnumC0023y.f781h) && (!a3.e().a() || a3.j() != EnumC0023y.f778e)) {
                EnumC0023y j = a3.j();
                j.d(j, "getModality(...)");
                c0845h.J(j, sb, C0845h.t(a3));
            }
            c0845h.I(a3, sb);
            if (c0845h.o().contains(EnumC0846i.INNER) && a3.d0()) {
                z9 = true;
            } else {
                z9 = false;
            }
            c0845h.L(sb, z9, "inner");
            if (c0845h.o().contains(EnumC0846i.DATA) && a3.D0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            c0845h.L(sb, z10, "data");
            if (c0845h.o().contains(EnumC0846i.INLINE) && a3.g()) {
                z11 = true;
            } else {
                z11 = false;
            }
            c0845h.L(sb, z11, "inline");
            if (c0845h.o().contains(EnumC0846i.VALUE) && a3.m()) {
                z12 = true;
            } else {
                z12 = false;
            }
            c0845h.L(sb, z12, "value");
            if (c0845h.o().contains(EnumC0846i.FUN) && a3.N()) {
                z13 = true;
            } else {
                z13 = false;
            }
            c0845h.L(sb, z13, "fun");
            if (a3 instanceof S) {
                str = "typealias";
            } else if (a3.E()) {
                str = "companion object";
            } else {
                int ordinal = a3.e().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        str = "object";
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    str = "annotation class";
                                }
                            } else {
                                str = "enum entry";
                            }
                        } else {
                            str = "enum class";
                        }
                    } else {
                        str = "interface";
                    }
                } else {
                    str = "class";
                }
            }
            sb.append(c0845h.G(str));
        }
        if (!AbstractC0890e.l(a3)) {
            if (!c0845h.p()) {
                C0845h.U(sb);
            }
            c0845h.N(a3, sb, true);
        } else {
            if (((Boolean) c0849l.f11475G.a(c0849l, C0849l.Y[31])).booleanValue()) {
                if (c0845h.p()) {
                    sb.append("companion object");
                }
                C0845h.U(sb);
                InterfaceC0010k q6 = a3.q();
                if (q6 != null) {
                    sb.append("of ");
                    C0725e name = q6.getName();
                    j.d(name, "getName(...)");
                    sb.append(c0845h.M(name, false));
                }
            }
            if (c0845h.s() || !j.a(a3.getName(), AbstractC0727g.f10809b)) {
                if (!c0845h.p()) {
                    C0845h.U(sb);
                }
                C0725e name2 = a3.getName();
                j.d(name2, "getName(...)");
                sb.append(c0845h.M(name2, true));
            }
        }
        if (!z8) {
            List t8 = a3.t();
            j.d(t8, "getDeclaredTypeParameters(...)");
            c0845h.a0(sb, t8, false);
            c0845h.y(a3, sb);
            if (!a3.e().a() && ((Boolean) c0849l.f11500i.a(c0849l, C0849l.Y[7])).booleanValue() && (n02 = a3.n0()) != null) {
                sb.append(" ");
                c0845h.w(sb, n02, null);
                C0050j c0050j = n02;
                C0014o d3 = c0050j.d();
                j.d(d3, "getVisibility(...)");
                c0845h.e0(d3, sb);
                sb.append(c0845h.G("constructor"));
                List z02 = c0050j.z0();
                j.d(z02, "getValueParameters(...)");
                c0845h.d0(sb, z02, n02.S());
            }
            if (!((Boolean) c0849l.f11513x.a(c0849l, C0849l.Y[22])).booleanValue() && !h.F(a3.l())) {
                Collection d9 = a3.B().d();
                j.d(d9, "getSupertypes(...)");
                if (!d9.isEmpty() && (d9.size() != 1 || !h.y((AbstractC1759v) d9.iterator().next()))) {
                    C0845h.U(sb);
                    sb.append(": ");
                    AbstractC0436k.u0(d9, sb, ", ", null, null, new C0844g(c0845h, 1), 60);
                }
            }
            c0845h.f0(sb, t8);
        }
        return y.f7506a;
    }

    @Override // n.x
    public boolean h(m mVar) {
        C1197k c1197k = (C1197k) this.f6634e;
        if (mVar == c1197k.f13273f) {
            return false;
        }
        c1197k.f13270B = ((SubMenuC1103E) mVar).f12575A.f12669a;
        x xVar = c1197k.f13275h;
        if (xVar == null) {
            return false;
        }
        return xVar.h(mVar);
    }

    @Override // t0.B0
    public int n() {
        AbstractC1537c0 abstractC1537c0 = (AbstractC1537c0) this.f6634e;
        return abstractC1537c0.f14822o - abstractC1537c0.G();
    }

    @Override // t0.B0
    public int p(View view) {
        return AbstractC1537c0.E(view) - ((ViewGroup.MarginLayoutParams) ((d0) view.getLayoutParams())).topMargin;
    }

    @Override // C6.InterfaceC0012m
    public /* bridge */ /* synthetic */ Object q(InterfaceC0019u interfaceC0019u, Object obj) {
        I(interfaceC0019u, (StringBuilder) obj);
        return y.f7506a;
    }

    @Override // C6.InterfaceC0012m
    public Object u(L l6, Object obj) {
        O(l6, (StringBuilder) obj, "getter");
        return y.f7506a;
    }

    @Override // Y6.l
    public Y6.m v(C0725e c0725e) {
        if ("b".equals(c0725e.b())) {
            return new c(this, 2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d  */
    @Override // C6.InterfaceC0012m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(C0050j c0050j, Object obj) {
        boolean z8;
        boolean z9;
        C0050j n02;
        ArrayList arrayList;
        boolean z10 = c0050j.f1536H;
        StringBuilder sb = (StringBuilder) obj;
        C0845h c0845h = (C0845h) this.f6634e;
        c0845h.getClass();
        c0845h.w(sb, c0050j, null);
        C0849l c0849l = c0845h.f11449a;
        C0848k c0848k = c0849l.f11504o;
        s[] sVarArr = C0849l.Y;
        if (((Boolean) c0848k.a(c0849l, sVarArr[13])).booleanValue() || c0050j.J().j() != EnumC0023y.f779f) {
            C0014o d2 = c0050j.d();
            j.d(d2, "getVisibility(...)");
            if (c0845h.e0(d2, sb)) {
                z8 = true;
                c0845h.H(c0050j, sb);
                if (((Boolean) c0849l.f11483P.a(c0849l, sVarArr[40])).booleanValue() && z10 && !z8) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    sb.append(c0845h.G("constructor"));
                }
                InterfaceC0004e q6 = c0050j.q();
                j.d(q6, "getContainingDeclaration(...)");
                if (((Boolean) c0849l.f11469A.a(c0849l, sVarArr[25])).booleanValue()) {
                    if (z9) {
                        sb.append(" ");
                    }
                    c0845h.N(q6, sb, true);
                    c0845h.a0(sb, c0050j.getTypeParameters(), false);
                }
                List z02 = c0050j.z0();
                j.d(z02, "getValueParameters(...)");
                c0845h.d0(sb, z02, c0050j.S());
                if (((Boolean) c0849l.f11506q.a(c0849l, sVarArr[15])).booleanValue() && !z10 && (n02 = q6.n0()) != null) {
                    List z03 = n02.z0();
                    j.d(z03, "getValueParameters(...)");
                    arrayList = new ArrayList();
                    for (Object obj2 : z03) {
                        U u8 = (U) obj2;
                        if (!u8.N0() && u8.f1514n == null) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sb.append(" : ");
                        sb.append(c0845h.G("this"));
                        sb.append(AbstractC0436k.v0(arrayList, ", ", "(", ")", C0841d.f11439q, 24));
                    }
                }
                if (((Boolean) c0849l.f11469A.a(c0849l, C0849l.Y[25])).booleanValue()) {
                    c0845h.f0(sb, c0050j.getTypeParameters());
                }
                return y.f7506a;
            }
        }
        z8 = false;
        c0845h.H(c0050j, sb);
        if (((Boolean) c0849l.f11483P.a(c0849l, sVarArr[40])).booleanValue()) {
        }
        z9 = true;
        if (z9) {
        }
        InterfaceC0004e q62 = c0050j.q();
        j.d(q62, "getContainingDeclaration(...)");
        if (((Boolean) c0849l.f11469A.a(c0849l, sVarArr[25])).booleanValue()) {
        }
        List z022 = c0050j.z0();
        j.d(z022, "getValueParameters(...)");
        c0845h.d0(sb, z022, c0050j.S());
        if (((Boolean) c0849l.f11506q.a(c0849l, sVarArr[15])).booleanValue()) {
            List z032 = n02.z0();
            j.d(z032, "getValueParameters(...)");
            arrayList = new ArrayList();
            while (r1.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
            }
        }
        if (((Boolean) c0849l.f11469A.a(c0849l, C0849l.Y[25])).booleanValue()) {
        }
        return y.f7506a;
    }

    @Override // O7.InterfaceC0233f
    public Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f6633d) {
            case 1:
                Object x8 = ((A.i) this.f6634e).x(new T3.x(interfaceC0234g, 27), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x8;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                Object x9 = ((e) this.f6634e).x(new T3.x(interfaceC0234g, 28), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x9;
            case g.LONG_FIELD_NUMBER /* 4 */:
                Object x10 = ((W0.c) this.f6634e).x(new t(interfaceC0234g, 10), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x10;
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                Object x11 = ((e) this.f6634e).x(new t(interfaceC0234g, 15), interfaceC0617c);
                if (x11 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x11;
            case 17:
                Object x12 = ((C1621l) this.f6634e).x(new C1018q(interfaceC0234g, 3), interfaceC0617c);
                if (x12 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x12;
            case 23:
                Object x13 = ((C1258G) this.f6634e).x(new C1018q(interfaceC0234g, 27), interfaceC0617c);
                if (x13 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x13;
            case 24:
                Object x14 = ((g0.L) this.f6634e).x(new z(interfaceC0234g, 0), interfaceC0617c);
                if (x14 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x14;
            default:
                Object x15 = ((C1376A) this.f6634e).x(new C1386K(interfaceC0234g, 1), interfaceC0617c);
                if (x15 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x15;
        }
    }

    @Override // P.InterfaceC0268p
    public t0 y(View view, t0 t0Var) {
        t0 t0Var2;
        boolean z8;
        AppBarLayout appBarLayout = (AppBarLayout) this.f6634e;
        WeakHashMap weakHashMap = O.f4214a;
        if (appBarLayout.getFitsSystemWindows()) {
            t0Var2 = t0Var;
        } else {
            t0Var2 = null;
        }
        if (!Objects.equals(appBarLayout.j, t0Var2)) {
            appBarLayout.j = t0Var2;
            if (appBarLayout.f9899x != null && appBarLayout.getTopInset() > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            appBarLayout.setWillNotDraw(!z8);
            appBarLayout.requestLayout();
        }
        return t0Var;
    }

    @Override // n.k
    public boolean z(m mVar, MenuItem menuItem) {
        switch (this.f6633d) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    public a() {
        this.f6633d = 10;
        this.f6634e = new ConcurrentHashMap(16);
    }

    public a(boolean z8) {
        this.f6633d = 8;
        this.f6634e = new AtomicBoolean(z8);
    }

    public a(TextView textView) {
        this.f6633d = 11;
        this.f6634e = new e0.g(textView);
    }

    @Override // Y6.l, Y6.m
    public void k() {
    }

    @Override // o.X
    public void d(int i4) {
    }

    @Override // o.X
    public void i(int i4) {
    }

    @Override // o.X
    public void j(int i4, float f8) {
    }

    @Override // Y6.l
    public void o(C0725e c0725e, k7.f fVar) {
    }

    @Override // Y6.l
    public void r(C0725e c0725e, Object obj) {
    }

    @Override // Y6.l
    public void l(C0725e c0725e, C0722b c0722b, C0725e c0725e2) {
    }
}
