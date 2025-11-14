package o;

import C6.InterfaceC0001b;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import F6.AbstractC0046f;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import c7.AbstractC0586e;
import c7.C0590i;
import c7.InterfaceC0588g;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import h7.AbstractC0842e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import s7.AbstractC1509C;
import s7.C1507A;
import s7.C1508B;
import s7.C1518i;
import t0.C1536c;
import u7.C1648a;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.C1742d;
import w7.C1745g;
import w7.C1749k;
import y6.AbstractC1841a;

/* loaded from: classes.dex */
public final class p1 implements M0.a, Y6.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13348d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13349e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f13350f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f13351g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f13352h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f13353i;
    public final Object j;
    public final Object k;

    public /* synthetic */ p1(ViewGroup viewGroup, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i4) {
        this.f13348d = i4;
        this.f13349e = viewGroup;
        this.f13350f = obj;
        this.f13351g = obj2;
        this.f13352h = obj3;
        this.f13353i = obj4;
        this.j = obj5;
        this.k = obj6;
    }

    public static p1 a(View view) {
        int i4 = R.id.empty;
        LinearLayout linearLayout = (LinearLayout) E2.b.r(view, R.id.empty);
        if (linearLayout != null) {
            i4 = R.id.empty_secondary;
            LinearLayout linearLayout2 = (LinearLayout) E2.b.r(view, R.id.empty_secondary);
            if (linearLayout2 != null) {
                i4 = R.id.empty_secondary_text;
                MaterialTextView materialTextView = (MaterialTextView) E2.b.r(view, R.id.empty_secondary_text);
                if (materialTextView != null) {
                    i4 = R.id.empty_text;
                    MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(view, R.id.empty_text);
                    if (materialTextView2 != null) {
                        i4 = R.id.list;
                        RecyclerView recyclerView = (RecyclerView) E2.b.r(view, R.id.list);
                        if (recyclerView != null) {
                            FrameLayout frameLayout = (FrameLayout) view;
                            i4 = R.id.loading;
                            ProgressBar progressBar = (ProgressBar) E2.b.r(view, R.id.loading);
                            if (progressBar != null) {
                                return new p1(frameLayout, linearLayout, linearLayout2, materialTextView, materialTextView2, recyclerView, progressBar, 6);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static w7.z b(w7.z zVar, AbstractC1759v abstractC1759v) {
        z6.h A2 = AbstractC0405a.A(zVar);
        D6.j annotations = zVar.getAnnotations();
        AbstractC1759v o7 = h4.g.o(zVar);
        List j = h4.g.j(zVar);
        List n02 = AbstractC0436k.n0(h4.g.p(zVar));
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(n02, 10));
        Iterator it = n02.iterator();
        while (it.hasNext()) {
            arrayList.add(((w7.M) it.next()).b());
        }
        return h4.g.g(A2, annotations, o7, j, arrayList, abstractC1759v, true).I0(zVar.E0());
    }

    public static p1 d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.item_trigger_event, viewGroup, false);
        int i4 = R.id.icon_enabled;
        ImageView imageView = (ImageView) E2.b.r(inflate, R.id.icon_enabled);
        if (imageView != null) {
            i4 = R.id.image_action;
            ImageView imageView2 = (ImageView) E2.b.r(inflate, R.id.image_action);
            if (imageView2 != null) {
                i4 = R.id.layout_actions;
                if (((LinearLayout) E2.b.r(inflate, R.id.layout_actions)) != null) {
                    i4 = R.id.layout_conditions;
                    if (((LinearLayout) E2.b.r(inflate, R.id.layout_conditions)) != null) {
                        i4 = R.id.layout_enabled;
                        if (((LinearLayout) E2.b.r(inflate, R.id.layout_enabled)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            i4 = R.id.text_actions_count;
                            TextView textView = (TextView) E2.b.r(inflate, R.id.text_actions_count);
                            if (textView != null) {
                                i4 = R.id.text_conditions_count;
                                TextView textView2 = (TextView) E2.b.r(inflate, R.id.text_conditions_count);
                                if (textView2 != null) {
                                    i4 = R.id.text_enabled;
                                    TextView textView3 = (TextView) E2.b.r(inflate, R.id.text_enabled);
                                    if (textView3 != null) {
                                        i4 = R.id.text_name;
                                        TextView textView4 = (TextView) E2.b.r(inflate, R.id.text_name);
                                        if (textView4 != null) {
                                            return new p1(constraintLayout, imageView, imageView2, textView, textView2, textView3, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    public static final ArrayList g(a7.T t8, p1 p1Var) {
        Iterable iterable;
        List list = t8.f7936g;
        o6.j.d(list, "getArgumentList(...)");
        a7.T h02 = AbstractC0405a.h0(t8, (F6.B) ((F3.m) p1Var.f13349e).f1374g);
        if (h02 != null) {
            iterable = g(h02, p1Var);
        } else {
            iterable = null;
        }
        if (iterable == null) {
            iterable = a6.s.f7766d;
        }
        return AbstractC0436k.C0(list, iterable);
    }

    public static w7.G h(List list, D6.j jVar, w7.J j, InterfaceC0010k interfaceC0010k) {
        w7.G g8;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C1749k) it.next()).getClass();
            if (jVar.isEmpty()) {
                w7.G.f15953e.getClass();
                g8 = w7.G.f15954f;
            } else {
                C1536c c1536c = w7.G.f15953e;
                List y4 = E2.d.y(new C1745g(jVar));
                c1536c.getClass();
                g8 = C1536c.g(y4);
            }
            arrayList.add(g8);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a6.q.f0(arrayList2, (Iterable) it2.next());
        }
        w7.G.f15953e.getClass();
        return C1536c.g(arrayList2);
    }

    public static final InterfaceC0004e j(p1 p1Var, a7.T t8, int i4) {
        F3.m mVar = (F3.m) p1Var.f13349e;
        C0722b m6 = AbstractC0842e.m((InterfaceC0588g) mVar.f1372e, i4);
        H7.t W7 = H7.m.W(H7.m.T(t8, new s7.z(2, p1Var)), C1507A.f14559e);
        ArrayList arrayList = new ArrayList();
        Iterator it = W7.f2082a.iterator();
        while (it.hasNext()) {
            arrayList.add(W7.f2083b.m(it.next()));
        }
        int Q5 = H7.m.Q(H7.m.T(m6, C1508B.k));
        while (arrayList.size() < Q5) {
            arrayList.add(0);
        }
        return ((C1518i) mVar.f1371d).f14582l.i(m6, arrayList);
    }

    @Override // Y6.l
    public Y6.l B(C0722b c0722b, C0725e c0725e) {
        ArrayList arrayList = new ArrayList();
        return new A4.d(((F3.a) this.f13349e).w(c0722b, C6.O.f726a, arrayList), this, c0725e, arrayList);
    }

    public Integer c(int i4) {
        Integer num = (Integer) ((LinkedHashMap) this.j).get(Integer.valueOf(i4));
        if (num == null) {
            p1 p1Var = (p1) this.f13352h;
            if (p1Var != null) {
                return p1Var.c(i4);
            }
            return null;
        }
        return num;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public C6.T e(int i4) {
        C6.T t8 = (C6.T) this.k.get(Integer.valueOf(i4));
        if (t8 == null) {
            p1 p1Var = (p1) this.f13350f;
            if (p1Var != null) {
                return p1Var.e(i4);
            }
            return null;
        }
        return t8;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x038c  */
    /* JADX WARN: Type inference failed for: r18v0, types: [w7.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w7.z f(a7.T t8, boolean z8) {
        w7.J d2;
        InterfaceC0007h interfaceC0007h;
        Object obj;
        w7.z t9;
        w7.z p8;
        A6.k kVar;
        w7.M m6;
        AbstractC1759v b4;
        C0723c c0723c;
        InterfaceC0001b interfaceC0001b;
        C0723c c0723c2;
        int size;
        D6.j kVar2;
        w7.X x8;
        w7.M e9;
        w7.M e10;
        F3.m mVar = (F3.m) this.f13349e;
        F6.B b9 = (F6.B) mVar.f1374g;
        C1518i c1518i = (C1518i) mVar.f1371d;
        InterfaceC0010k interfaceC0010k = (InterfaceC0010k) mVar.f1373f;
        o6.j.e(t8, "proto");
        if (t8.p()) {
            if (AbstractC0842e.m((InterfaceC0588g) mVar.f1372e, t8.f7939l).f10795c) {
                ((C1518i) mVar.f1371d).f14579g.getClass();
            }
        } else if ((t8.f7935f & 128) == 128) {
            if (AbstractC0842e.m((InterfaceC0588g) mVar.f1372e, t8.f7942o).f10795c) {
                ((C1518i) mVar.f1371d).f14579g.getClass();
            }
        }
        if (t8.p()) {
            interfaceC0007h = (InterfaceC0007h) ((U1.c) this.f13353i).m(Integer.valueOf(t8.f7939l));
            if (interfaceC0007h == null) {
                interfaceC0007h = j(this, t8, t8.f7939l);
            }
        } else {
            int i4 = t8.f7935f;
            if ((i4 & 32) == 32) {
                interfaceC0007h = e(t8.f7940m);
                if (interfaceC0007h == null) {
                    y7.l lVar = y7.l.f16567a;
                    d2 = y7.l.d(y7.k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(t8.f7940m), (String) this.f13352h);
                }
            } else if ((i4 & 64) == 64) {
                String string = ((InterfaceC0588g) mVar.f1372e).getString(t8.f7941n);
                Iterator it = AbstractC0436k.Q0(this.k.values()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (o6.j.a(((C6.T) obj).getName().b(), string)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C6.T t10 = (C6.T) obj;
                if (t10 == null) {
                    y7.l lVar2 = y7.l.f16567a;
                    d2 = y7.l.d(y7.k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, interfaceC0010k.toString());
                } else {
                    interfaceC0007h = t10;
                }
            } else if ((i4 & 128) == 128) {
                interfaceC0007h = (InterfaceC0007h) ((U1.c) this.j).m(Integer.valueOf(t8.f7942o));
                if (interfaceC0007h == null) {
                    interfaceC0007h = j(this, t8, t8.f7942o);
                }
            } else {
                y7.l lVar3 = y7.l.f16567a;
                d2 = y7.l.d(y7.k.UNKNOWN_TYPE, new String[0]);
            }
            boolean z9 = true;
            if (!y7.l.f(d2.c())) {
                y7.l lVar4 = y7.l.f16567a;
                return y7.l.e(y7.k.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, a6.s.f7766d, d2, (String[]) Arrays.copyOf(new String[]{d2.toString()}, 1));
            }
            C1648a c1648a = new C1648a(c1518i.f14573a, new B6.f(this, 12, t8));
            w7.G h8 = h(c1518i.f14588r, c1648a, d2, interfaceC0010k);
            ArrayList g8 = g(t8, this);
            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(g8, 10));
            Iterator it2 = g8.iterator();
            int i8 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i9 = i8 + 1;
                if (i8 >= 0) {
                    a7.Q q6 = (a7.Q) next;
                    List e11 = d2.e();
                    o6.j.d(e11, "getParameters(...)");
                    C6.T t11 = (C6.T) AbstractC0436k.s0(i8, e11);
                    a7.P p9 = q6.f7915f;
                    if (p9 == a7.P.STAR) {
                        if (t11 == null) {
                            e10 = new w7.D(c1518i.f14574b.o());
                        } else {
                            e9 = new w7.E(t11);
                            e10 = e9;
                        }
                    } else {
                        o6.j.d(p9, "getProjection(...)");
                        int ordinal = p9.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + p9);
                                }
                                x8 = w7.X.INVARIANT;
                            } else {
                                x8 = w7.X.OUT_VARIANCE;
                            }
                        } else {
                            x8 = w7.X.IN_VARIANCE;
                        }
                        a7.T F02 = AbstractC0405a.F0(q6, b9);
                        if (F02 == null) {
                            e10 = new w7.E(y7.l.c(y7.k.NO_RECORDED_TYPE, q6.toString()));
                        } else {
                            e9 = new w7.E(i(F02), x8);
                            e10 = e9;
                        }
                    }
                    arrayList.add(e10);
                    i8 = i9;
                } else {
                    AbstractC0437l.c0();
                    throw null;
                }
            }
            List Q02 = AbstractC0436k.Q0(arrayList);
            InterfaceC0007h c6 = d2.c();
            if (z8 && (c6 instanceof C6.S)) {
                C6.S s8 = (C6.S) c6;
                o6.j.e(s8, "<this>");
                ?? obj2 = new Object();
                List e12 = ((AbstractC0046f) s8).f1525l.e();
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(e12, 10));
                Iterator it3 = e12.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C6.T) it3.next()).a());
                }
                g0.b0 b0Var = new g0.b0((g0.b0) null, s8, Q02, a6.x.R0(AbstractC0436k.X0(arrayList2, Q02)));
                w7.G.f15953e.getClass();
                w7.G g9 = w7.G.f15954f;
                o6.j.e(g9, "attributes");
                w7.z i10 = obj2.i(b0Var, g9, false, 0, true);
                List list = c1518i.f14588r;
                ArrayList A02 = AbstractC0436k.A0(c1648a, i10.getAnnotations());
                if (A02.isEmpty()) {
                    kVar2 = D6.i.f1043a;
                } else {
                    kVar2 = new D6.k(0, A02);
                }
                w7.G h9 = h(list, kVar2, d2, interfaceC0010k);
                if (!w7.U.e(i10) && !t8.f7937h) {
                    z9 = false;
                }
                t9 = i10.I0(z9).K0(h9);
            } else if (AbstractC0586e.f9697a.c(t8.f7947t).booleanValue()) {
                boolean z10 = t8.f7937h;
                int size2 = d2.e().size() - Q02.size();
                if (size2 != 0) {
                    if (size2 == 1 && (size = Q02.size() - 1) >= 0) {
                        w7.J B8 = d2.o().w(size).B();
                        o6.j.d(B8, "getTypeConstructor(...)");
                        p8 = AbstractC1741c.t(Q02, h8, B8, z10);
                        if (p8 == null) {
                            y7.l lVar5 = y7.l.f16567a;
                            t9 = y7.l.e(y7.k.INCONSISTENT_SUSPEND_FUNCTION, Q02, d2, new String[0]);
                        }
                        t9 = p8;
                    }
                    p8 = null;
                    if (p8 == null) {
                    }
                    t9 = p8;
                } else {
                    p8 = AbstractC1741c.t(Q02, h8, d2, z10);
                    InterfaceC0007h c9 = p8.B0().c();
                    if (c9 != null) {
                        kVar = h4.g.m(c9);
                    } else {
                        kVar = null;
                    }
                    if (o6.j.a(kVar, A6.g.f399c) && (m6 = (w7.M) AbstractC0436k.y0(h4.g.p(p8))) != null && (b4 = m6.b()) != null) {
                        InterfaceC0007h c10 = b4.B0().c();
                        if (c10 != null) {
                            c0723c = AbstractC1098d.g(c10);
                        } else {
                            c0723c = null;
                        }
                        if (b4.r0().size() == 1 && (o6.j.a(c0723c, z6.n.f16799g) || o6.j.a(c0723c, AbstractC1509C.f14561a))) {
                            AbstractC1759v b10 = ((w7.M) AbstractC0436k.G0(b4.r0())).b();
                            o6.j.d(b10, "getType(...)");
                            if (interfaceC0010k instanceof InterfaceC0001b) {
                                interfaceC0001b = (InterfaceC0001b) interfaceC0010k;
                            } else {
                                interfaceC0001b = null;
                            }
                            if (interfaceC0001b != null) {
                                c0723c2 = AbstractC1098d.c(interfaceC0001b);
                            } else {
                                c0723c2 = null;
                            }
                            p8 = o6.j.a(c0723c2, s7.y.f14635a) ? b(p8, b10) : b(p8, b10);
                        }
                        if (p8 == null) {
                        }
                        t9 = p8;
                    }
                    p8 = null;
                    if (p8 == null) {
                    }
                    t9 = p8;
                }
            } else {
                t9 = AbstractC1741c.t(Q02, h8, d2, t8.f7937h);
                if (AbstractC0586e.f9698b.c(t8.f7947t).booleanValue()) {
                    p8 = C1742d.p(t9, true);
                    if (p8 == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + t9 + '\'').toString());
                    }
                    t9 = p8;
                }
            }
            a7.T b11 = AbstractC0405a.b(t8, b9);
            if (b11 != null) {
                return AbstractC1741c.E(t9, f(b11, false));
            }
            return t9;
        }
        d2 = interfaceC0007h.B();
        o6.j.d(d2, "getTypeConstructor(...)");
        boolean z92 = true;
        if (!y7.l.f(d2.c())) {
        }
    }

    @Override // M0.a
    public View getRoot() {
        switch (this.f13348d) {
            case 1:
                return (MaterialCardView) this.f13349e;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return (LinearLayout) this.f13349e;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return (LinearLayout) this.f13349e;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return (LinearLayout) this.f13349e;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return (ConstraintLayout) this.f13349e;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return (FrameLayout) this.f13349e;
            default:
                return (LinearLayout) this.f13349e;
        }
    }

    public AbstractC1759v i(a7.T t8) {
        F3.m mVar = (F3.m) this.f13349e;
        o6.j.e(t8, "proto");
        if ((t8.f7935f & 2) == 2) {
            String string = ((InterfaceC0588g) mVar.f1372e).getString(t8.f7938i);
            w7.z f8 = f(t8, true);
            a7.T x8 = AbstractC0405a.x(t8, (F6.B) mVar.f1374g);
            o6.j.b(x8);
            return ((C1518i) mVar.f1371d).j.d(t8, string, f8, f(x8, true));
        }
        return f(t8, true);
    }

    @Override // Y6.l, Y6.m
    public void k() {
        k7.s sVar;
        F3.a aVar = (F3.a) this.f13351g;
        C0722b c0722b = (C0722b) this.f13353i;
        HashMap hashMap = (HashMap) this.f13350f;
        o6.j.e(hashMap, "arguments");
        boolean z8 = false;
        if (c0722b.equals(AbstractC1841a.f16514b)) {
            Object obj = hashMap.get(C0725e.e("value"));
            k7.q qVar = null;
            if (obj instanceof k7.s) {
                sVar = (k7.s) obj;
            } else {
                sVar = null;
            }
            if (sVar != null) {
                Object obj2 = sVar.f12144a;
                if (obj2 instanceof k7.q) {
                    qVar = (k7.q) obj2;
                }
                if (qVar != null) {
                    z8 = aVar.v(qVar.f12152a.f12142a);
                }
            }
        }
        if (z8 || aVar.v(c0722b)) {
            return;
        }
        ((List) this.j).add(new D6.d(((InterfaceC0004e) this.f13352h).l(), hashMap, (C6.O) this.k));
    }

    @Override // Y6.l
    public void l(C0725e c0725e, C0722b c0722b, C0725e c0725e2) {
        ((HashMap) this.f13350f).put(c0725e, new k7.i(c0722b, c0725e2));
    }

    public p1 m(List list) {
        o6.j.e(list, "typeParameters");
        p1 p1Var = new p1((InterfaceC0588g) this.f13349e, (F6.B) this.f13350f, (C0590i) this.f13351g, this, (List) this.f13353i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a7.Y y4 = (a7.Y) it.next();
            ((LinkedHashMap) p1Var.j).put(Integer.valueOf(y4.f7988h), Integer.valueOf(y4.f7987g));
        }
        return p1Var;
    }

    @Override // Y6.l
    public void o(C0725e c0725e, k7.f fVar) {
        ((HashMap) this.f13350f).put(c0725e, new k7.g(new k7.q(fVar)));
    }

    @Override // Y6.l
    public void r(C0725e c0725e, Object obj) {
        ((HashMap) this.f13350f).put(c0725e, F3.a.a((F3.a) this.f13349e, c0725e, obj));
    }

    public String toString() {
        String str;
        switch (this.f13348d) {
            case 10:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.f13351g);
                p1 p1Var = (p1) this.f13350f;
                if (p1Var == null) {
                    str = "";
                } else {
                    str = ". Child of " + ((String) p1Var.f13351g);
                }
                sb.append(str);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // Y6.l
    public Y6.m v(C0725e c0725e) {
        return new A4.a((F3.a) this.f13349e, c0725e, this);
    }

    public p1(InterfaceC0588g interfaceC0588g, F6.B b4, C0590i c0590i, p1 p1Var, List list) {
        this.f13348d = 7;
        o6.j.e(interfaceC0588g, "strings");
        o6.j.e(list, "contextExtensions");
        this.f13349e = interfaceC0588g;
        this.f13350f = b4;
        this.f13351g = c0590i;
        this.f13352h = p1Var;
        this.f13353i = list;
        this.j = new LinkedHashMap();
        N6.k.f3794a.getClass();
        this.k = N6.j.a();
    }

    public p1(F3.m mVar, p1 p1Var, List list, String str, String str2) {
        Map linkedHashMap;
        this.f13348d = 10;
        o6.j.e(list, "typeParameterProtos");
        o6.j.e(str, "debugName");
        this.f13349e = mVar;
        this.f13350f = p1Var;
        this.f13351g = str;
        this.f13352h = str2;
        C1518i c1518i = (C1518i) mVar.f1371d;
        this.f13353i = c1518i.f14573a.c(new s7.z(0, this));
        this.j = c1518i.f14573a.c(new s7.z(1, this));
        if (list.isEmpty()) {
            linkedHashMap = a6.t.f7767d;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                a7.Y y4 = (a7.Y) it.next();
                linkedHashMap.put(Integer.valueOf(y4.f7987g), new u7.t((F3.m) this.f13349e, y4, i4));
                i4++;
            }
        }
        this.k = linkedHashMap;
    }

    public p1(Context context) {
        this.f13348d = 0;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f13352h = layoutParams;
        this.f13353i = new Rect();
        this.j = new int[2];
        this.k = new int[2];
        this.f13349e = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f13350f = inflate;
        this.f13351g = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(p1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public p1(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f13348d = 5;
        this.f13349e = constraintLayout;
        this.f13350f = imageView;
        this.f13352h = imageView2;
        this.f13351g = textView;
        this.f13353i = textView2;
        this.j = textView3;
        this.k = textView4;
    }

    public p1(LinearLayout linearLayout, MaterialButton materialButton, A4.a aVar, A4.a aVar2, A4.a aVar3, A.i iVar, A.i iVar2, A4.d dVar) {
        this.f13348d = 4;
        this.f13349e = linearLayout;
        this.f13350f = aVar;
        this.f13351g = aVar2;
        this.f13352h = aVar3;
        this.f13353i = iVar;
        this.j = iVar2;
        this.k = dVar;
    }

    public p1(F3.a aVar, InterfaceC0004e interfaceC0004e, C0722b c0722b, List list, C6.O o7) {
        this.f13348d = 9;
        this.f13351g = aVar;
        this.f13352h = interfaceC0004e;
        this.f13353i = c0722b;
        this.j = list;
        this.k = o7;
        this.f13349e = aVar;
        this.f13350f = new HashMap();
    }
}
