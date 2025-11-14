package A1;

import K3.D;
import K3.L;
import L3.S;
import L7.AbstractC0166y;
import L7.F;
import L7.Z;
import M3.C0190x;
import O3.a0;
import O7.i0;
import R3.w;
import R3.x;
import T3.H;
import T3.q;
import T3.r;
import T3.s;
import T3.t;
import T3.u;
import T3.v;
import U3.A;
import W3.z;
import Z5.y;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.U;
import androidx.navigation.fragment.NavHostFragment;
import c5.C0581a;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.list.TutorialListFragment;
import com.buzbuz.smartautoclicker.scenarios.ScenarioActivity;
import com.buzbuz.smartautoclicker.scenarios.list.ScenarioListFragment;
import e4.C0643a;
import f7.C0725e;
import g0.AbstractComponentCallbacksC0755y;
import g2.C0777a;
import h6.AbstractC0837b;
import i.AbstractActivityC0870i;
import i.AbstractC0862a;
import i.C0865d;
import i.DialogInterfaceC0869h;
import j2.C0902b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k2.AbstractC0951a;
import kotlin.NoWhenBranchMatchedException;
import l0.C0997a;
import n0.AbstractC1143u;
import n0.C1128f;
import n0.C1131i;
import n0.C1146x;
import n0.C1148z;
import n6.InterfaceC1163b;
import q0.C1350f;
import q4.X;

/* loaded from: classes.dex */
public final /* synthetic */ class e extends o6.i implements InterfaceC1163b {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f244l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i4, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i4, obj, cls, str, str2, i8, i9);
        this.f244l = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        boolean z8;
        C0777a b4;
        C1146x f8;
        AbstractC1143u abstractC1143u;
        C1148z c1148z;
        Bundle bundle;
        int i4;
        f2.g gVar;
        int i8;
        W4.h hVar;
        int i9 = this.f244l;
        boolean z9 = true;
        y yVar = y.f7506a;
        Object obj2 = this.f13629e;
        switch (i9) {
            case 0:
                ((f) obj2).K((String) obj);
                return yVar;
            case 1:
                List list = (List) obj;
                o6.j.e(list, "p0");
                C3.a aVar = (C3.a) obj2;
                f2.a aVar2 = (f2.a) aVar.f894h.f();
                if (aVar2 != null && (aVar2 instanceof f2.o)) {
                    aVar.h(f2.o.i((f2.o) aVar2, null, null, null, 0, false, null, list, 63));
                }
                return yVar;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                List list2 = (List) obj;
                o6.j.e(list2, "p0");
                C3.a aVar3 = (C3.a) obj2;
                f2.a aVar4 = (f2.a) aVar3.f894h.f();
                if (aVar4 != null && (aVar4 instanceof f2.f)) {
                    aVar3.h(f2.f.i((f2.f) aVar4, null, null, null, 0, null, false, null, null, null, list2, 511));
                }
                return yVar;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0951a abstractC0951a = (AbstractC0951a) obj;
                o6.j.e(abstractC0951a, "p0");
                C3.e eVar = (C3.e) obj2;
                eVar.f599f.m(abstractC0951a);
                eVar.f600g.m(abstractC0951a);
                return yVar;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0951a abstractC0951a2 = (AbstractC0951a) obj;
                o6.j.e(abstractC0951a2, "p0");
                C3.e eVar2 = (C3.e) obj2;
                eVar2.f599f.m(abstractC0951a2);
                eVar2.f600g.m(abstractC0951a2);
                return yVar;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Point point = (Point) obj;
                o6.j.e(point, "p0");
                ((E1.c) obj2).R(point);
                return yVar;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Size size = (Size) obj;
                o6.j.e(size, "p0");
                ((E1.c) obj2).L(size);
                return yVar;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                Point point2 = (Point) obj;
                E1.c cVar = (E1.c) obj2;
                if (point2 != null) {
                    cVar.hashCode();
                    View view = cVar.f1160E;
                    if (view != null) {
                        cVar.P(view, false);
                    }
                    cVar.N(cVar.l().f7104e.f7095b);
                    cVar.R(point2);
                } else {
                    cVar.hashCode();
                    View view2 = cVar.f1160E;
                    if (view2 != null) {
                        cVar.P(view2, true);
                    }
                    cVar.H(cVar.l().f7104e.f7095b);
                }
                return yVar;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                List list3 = (List) obj;
                o6.j.e(list3, "p0");
                E3.a aVar5 = (E3.a) obj2;
                AbstractC0951a abstractC0951a3 = (AbstractC0951a) aVar5.f894h.f();
                if (abstractC0951a3 != null) {
                    aVar5.h(E3.a.l(aVar5, abstractC0951a3, null, list3, 2));
                }
                return yVar;
            case 9:
                List list4 = (List) obj;
                o6.j.e(list4, "p0");
                ((E3.a) obj2).n(list4);
                return yVar;
            case 10:
                E4.c cVar2 = (E4.c) obj;
                o6.j.e(cVar2, "p0");
                E4.g gVar2 = (E4.g) obj2;
                gVar2.o().d(gVar2.k(), new C0190x(cVar2), false);
                return yVar;
            case 11:
                G1.a aVar6 = (G1.a) obj;
                o6.j.e(aVar6, "p0");
                L l6 = (L) obj2;
                l6.getClass();
                l6.h(new n(l6, 7, aVar6));
                return yVar;
            case 12:
                List list5 = (List) obj;
                o6.j.e(list5, "p0");
                D d2 = (D) obj2;
                d2.getClass();
                H3.n nVar = d2.f2642d;
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list5, 10));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0643a) ((G1.a) it.next()).f1694b).f10609d);
                }
                nVar.i(arrayList);
                return yVar;
            case 13:
                String str = (String) obj;
                o6.j.e(str, "p0");
                ((S) obj2).e(str);
                return yVar;
            case 14:
                D2.d dVar = (D2.d) obj;
                o6.j.e(dVar, "p0");
                S s8 = (S) obj2;
                s8.getClass();
                H3.n nVar2 = s8.f2825b;
                f2.c cVar3 = (f2.c) nVar2.f1950e.a();
                if (cVar3 != null) {
                    boolean a3 = o6.j.a(dVar, s8.f2826c);
                    f2.b bVar = f2.b.f10676d;
                    if (!a3) {
                        if (o6.j.a(dVar, s8.f2828e)) {
                            bVar = f2.b.f10677e;
                        } else if (o6.j.a(dVar, s8.f2827d)) {
                            bVar = f2.b.f10678f;
                        }
                    }
                    nVar2.j(f2.c.i(cVar3, null, null, null, 0, null, bVar, null, 95));
                }
                return yVar;
            case 15:
                ((Z) obj2).l((Throwable) obj);
                return yVar;
            case 16:
                C0902b c0902b = (C0902b) obj;
                o6.j.e(c0902b, "p0");
                M3.Z z10 = (M3.Z) obj2;
                z10.getClass();
                H3.n nVar3 = z10.f3416c;
                f2.e eVar3 = (f2.e) nVar3.f1950e.a();
                if (eVar3 != null) {
                    nVar3.j(f2.e.i(eVar3, null, null, null, 0, null, null, null, c0902b.f11789a, null, 383));
                }
                return yVar;
            case 17:
                D2.d dVar2 = (D2.d) obj;
                o6.j.e(dVar2, "p0");
                a0 a0Var = (a0) obj2;
                a0Var.getClass();
                H3.n nVar4 = a0Var.f3924b;
                f2.f fVar = (f2.f) nVar4.f1950e.a();
                if (fVar != null) {
                    if (dVar2.equals(a0Var.f3935o)) {
                        z8 = true;
                    } else if (dVar2.equals(a0Var.f3934n)) {
                        z8 = false;
                    }
                    nVar4.j(f2.f.i(fVar, null, null, null, 0, null, z8, null, null, null, null, 991));
                }
                return yVar;
            case 18:
                D2.d dVar3 = (D2.d) obj;
                o6.j.e(dVar3, "p0");
                w wVar = (w) obj2;
                wVar.getClass();
                H3.n nVar5 = wVar.f5096b;
                C0777a f9 = nVar5.f1950e.f();
                if (f9 != null) {
                    if (dVar3.equals(x.f5105b)) {
                        b4 = f9.b((byte) 0);
                    } else if (dVar3.equals(x.f5104a)) {
                        b4 = f9.b(Boolean.FALSE);
                    } else if (dVar3.equals(x.f5106c)) {
                        b4 = f9.b('a');
                    } else if (dVar3.equals(x.f5107d)) {
                        b4 = f9.b(Double.valueOf(0.0d));
                    } else if (dVar3.equals(x.f5109f)) {
                        b4 = f9.b(0);
                    } else if (dVar3.equals(x.f5108e)) {
                        b4 = f9.b(Float.valueOf(0.0f));
                    } else if (dVar3.equals(x.f5110g)) {
                        b4 = f9.b((short) 0);
                    } else if (dVar3.equals(x.f5111h)) {
                        b4 = f9.b("");
                    } else {
                        throw new IllegalArgumentException("Unsupported extra type " + dVar3);
                    }
                    nVar5.l(b4);
                }
                return yVar;
            case 19:
                D2.d dVar4 = (D2.d) obj;
                o6.j.e(dVar4, "p0");
                H3.n nVar6 = ((w) obj2).f5096b;
                if (!dVar4.equals(x.f5112i)) {
                    if (dVar4.equals(x.j)) {
                        z9 = false;
                    }
                    return yVar;
                }
                C0777a f10 = nVar6.f1950e.f();
                if (f10 != null) {
                    nVar6.l(f10.b(Boolean.valueOf(z9)));
                }
                return yVar;
            case 20:
                int intValue = ((Number) obj).intValue();
                TutorialListFragment tutorialListFragment = (TutorialListFragment) obj2;
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = tutorialListFragment;
                while (true) {
                    if (abstractComponentCallbacksC0755y != null) {
                        tutorialListFragment.getClass();
                        if (abstractComponentCallbacksC0755y instanceof NavHostFragment) {
                            f8 = ((NavHostFragment) abstractComponentCallbacksC0755y).S();
                        } else {
                            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = abstractComponentCallbacksC0755y.m().f10884A;
                            if (abstractComponentCallbacksC0755y2 instanceof NavHostFragment) {
                                f8 = ((NavHostFragment) abstractComponentCallbacksC0755y2).S();
                            } else {
                                abstractComponentCallbacksC0755y = abstractComponentCallbacksC0755y.f11085A;
                            }
                        }
                    } else {
                        View view3 = tutorialListFragment.K;
                        if (view3 != null) {
                            f8 = AbstractC0862a.f(view3);
                        } else {
                            throw new IllegalStateException("Fragment " + tutorialListFragment + " does not have a NavController set");
                        }
                    }
                }
                f8.getClass();
                C1350f c1350f = f8.f12819b;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("gameIndex", intValue);
                c0.o oVar = f8.f12820c;
                if (c1350f.f13888f.isEmpty()) {
                    abstractC1143u = c1350f.f13885c;
                } else {
                    abstractC1143u = ((C1131i) c1350f.f13888f.last()).f12759e;
                }
                if (abstractC1143u != null) {
                    C1128f i10 = abstractC1143u.i();
                    if (i10 != null) {
                        c1148z = i10.f12750b;
                        i4 = i10.f12749a;
                        Bundle bundle3 = i10.f12751c;
                        if (bundle3 != null) {
                            bundle = X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                            bundle.putAll(bundle3);
                        } else {
                            bundle = null;
                        }
                    } else {
                        c1148z = null;
                        bundle = null;
                        i4 = R.id.tutorial_list_to_game;
                    }
                    if (bundle == null) {
                        bundle = X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                    }
                    bundle.putAll(bundle2);
                    if (i4 == 0 && c1148z != null) {
                        boolean z11 = c1148z.f12832d;
                        int i11 = c1148z.f12831c;
                        if (i11 != -1) {
                            if (i11 != -1 && c1350f.l(i11, z11, false)) {
                                c1350f.b();
                            }
                            return yVar;
                        }
                    }
                    if (i4 != 0) {
                        AbstractC1143u c6 = c1350f.c(i4, null);
                        if (c6 == null) {
                            int i12 = AbstractC1143u.f12811i;
                            String j = AbstractC0837b.j(oVar, i4);
                            if (i10 == null) {
                                throw new IllegalArgumentException("Navigation action/destination " + j + " cannot be found from the current destination " + abstractC1143u);
                            }
                            StringBuilder s9 = A.j.s("Navigation destination ", j, " referenced from action ");
                            s9.append(AbstractC0837b.j(oVar, R.id.tutorial_list_to_game));
                            s9.append(" cannot be found from the current destination ");
                            s9.append(abstractC1143u);
                            throw new IllegalArgumentException(s9.toString().toString());
                        }
                        c1350f.k(c6, bundle, c1148z);
                        return yVar;
                    }
                    throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
                }
                throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + f8 + '.');
            case 21:
                v vVar = (v) obj;
                o6.j.e(vVar, "p0");
                H h8 = (H) obj2;
                h8.getClass();
                H3.n nVar7 = h8.f5700b;
                f2.h hVar2 = (f2.h) nVar7.f1950e.a();
                if (hVar2 != null) {
                    if (vVar.equals(u.f5745c)) {
                        gVar = f2.g.f10708d;
                    } else if (vVar.equals(t.f5744c)) {
                        gVar = f2.g.f10709e;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar7.j(f2.h.i(hVar2, null, null, null, 0, gVar, null, null, 0, 239));
                }
                return yVar;
            case 22:
                s sVar = (s) obj;
                o6.j.e(sVar, "p0");
                H h9 = (H) obj2;
                h9.getClass();
                H3.n nVar8 = h9.f5700b;
                f2.h hVar3 = (f2.h) nVar8.f1950e.a();
                if (hVar3 != null) {
                    if (sVar.equals(r.f5743c)) {
                        i8 = 2;
                    } else if (sVar.equals(T3.p.f5741c)) {
                        i8 = 3;
                    } else if (sVar.equals(q.f5742c)) {
                        i8 = 4;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar8.j(f2.h.i(hVar3, null, null, null, 0, null, null, null, i8, 127));
                }
                return yVar;
            case 23:
                C0725e c0725e = (C0725e) obj;
                o6.j.e(c0725e, "p0");
                return ((T6.o) obj2).N(c0725e);
            case 24:
                C0725e c0725e2 = (C0725e) obj;
                o6.j.e(c0725e2, "p0");
                return ((T6.o) obj2).O(c0725e2);
            case 25:
                D2.k kVar = (D2.k) obj;
                o6.j.e(kVar, "p0");
                A a4 = (A) obj2;
                a4.getClass();
                i0 i0Var = a4.f6092i;
                i0Var.getClass();
                i0Var.h(null, kVar);
                return yVar;
            case 26:
                String str2 = (String) obj;
                o6.j.e(str2, "p0");
                z zVar = (z) obj2;
                zVar.getClass();
                H3.n nVar9 = zVar.f6564b;
                f2.j jVar = (f2.j) nVar9.f1950e.a();
                if (jVar != null) {
                    nVar9.j(f2.j.i(jVar, null, null, null, 0, A.j.k(jVar.f10728e + "{" + str2 + "}"), false, 47));
                }
                return yVar;
            case 27:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                W4.x xVar = (W4.x) obj2;
                xVar.getClass();
                AbstractC0166y.q(U.g(xVar), null, null, new W4.v(xVar, booleanValue, null), 3);
                return yVar;
            case 28:
                Z4.i iVar = (Z4.i) obj;
                o6.j.e(iVar, "p0");
                AbstractActivityC0870i M8 = ((ScenarioListFragment) obj2).M();
                if (M8 instanceof W4.h) {
                    hVar = (W4.h) M8;
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    ScenarioActivity scenarioActivity = (ScenarioActivity) hVar;
                    scenarioActivity.f9859I = iVar;
                    C0581a z12 = scenarioActivity.z();
                    J3.s sVar2 = new J3.s(0, scenarioActivity, ScenarioActivity.class, "onMandatoryPermissionsGranted", "onMandatoryPermissionsGranted()V", 0, 0, 2);
                    J1.e eVar4 = z12.f9669d;
                    L1.b bVar2 = new L1.b(false);
                    ComponentName componentName = z12.f9671f.f11751b;
                    if (componentName != null) {
                        eVar4.b(scenarioActivity, AbstractC0437l.X(bVar2, new L1.c(componentName, new B1.e(27)), new L1.e(true)), sVar2, null);
                    } else {
                        o6.j.i("_klickrServiceComponentName");
                        throw null;
                    }
                }
                return yVar;
            default:
                final Z4.i iVar2 = (Z4.i) obj;
                o6.j.e(iVar2, "p0");
                final ScenarioListFragment scenarioListFragment = (ScenarioListFragment) obj2;
                s5.b bVar3 = new s5.b(scenarioListFragment.O());
                bVar3.l(R.string.dialog_title_delete_scenario);
                ((C0865d) bVar3.f3288e).f11665f = scenarioListFragment.n().getString(R.string.message_delete_scenario, iVar2.f7446a);
                bVar3.k(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: W4.g
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i13) {
                        o6.j.e(dialogInterface, "<unused var>");
                        x S8 = ScenarioListFragment.this.S();
                        Z4.i iVar3 = iVar2;
                        o6.j.e(iVar3, "item");
                        C0997a g8 = U.g(S8);
                        S7.e eVar5 = F.f3175a;
                        AbstractC0166y.q(g8, S7.d.f5456f, null, new p(iVar3, S8, null), 2);
                    }
                });
                bVar3.j(null);
                DialogInterfaceC0869h c9 = bVar3.c();
                DialogInterfaceC0869h dialogInterfaceC0869h = scenarioListFragment.f9867k0;
                Log.w("ScenarioListFragment", "Requesting show dialog while another one is one screen.");
                if (dialogInterfaceC0869h != null) {
                    dialogInterfaceC0869h.dismiss();
                }
                scenarioListFragment.f9867k0 = c9;
                Window window = c9.getWindow();
                if (window != null) {
                    window.setSoftInputMode(4);
                }
                c9.setOnDismissListener(new k(1 == true ? 1 : 0, scenarioListFragment));
                c9.show();
                return yVar;
        }
    }
}
