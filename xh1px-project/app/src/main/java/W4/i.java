package W4;

import L7.AbstractC0166y;
import O7.i0;
import Y3.A;
import Z3.N;
import Z5.y;
import a5.EnumC0424h;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import android.graphics.Rect;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.scenarios.list.ScenarioListFragment;
import j2.C0902b;
import j2.C0905e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import k2.C0952b;
import k3.C0965l;
import k4.C0971c;
import k4.J;
import k4.X;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import l2.C1001a;
import l3.C1020s;
import n6.InterfaceC1163b;
import o3.C1250u;
import o4.O;
import p4.B;
import q4.C1419y;
import u0.AbstractC1623n;
import u0.C1617h;

/* loaded from: classes.dex */
public final /* synthetic */ class i extends o6.i implements InterfaceC1163b {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6596l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i4, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i4, obj, cls, str, str2, i8, i9);
        this.f6596l = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x056d  */
    @Override // n6.InterfaceC1163b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        Z4.a a3;
        d a4;
        f2.l lVar;
        f2.n nVar;
        C0905e c0905e;
        List list;
        p2.e eVar;
        switch (this.f6596l) {
            case 0:
                Z4.k kVar = (Z4.k) obj;
                o6.j.e(kVar, "p0");
                i0 i0Var = ((ScenarioListFragment) this.f13629e).S().f6632i;
                Z4.a aVar = (Z4.a) i0Var.f();
                o6.j.e(aVar, "<this>");
                Set set = aVar.f7417b;
                Set set2 = aVar.f7416a;
                if (kVar instanceof Z4.e) {
                    p2.e eVar2 = ((Z4.e) kVar).f7424b;
                    List list2 = eVar2.f13701c;
                    C0999a c0999a = eVar2.f13699a;
                    if (!list2.isEmpty()) {
                        Set U02 = AbstractC0436k.U0(set2);
                        long j = c0999a.f12187a;
                        if (U02.contains(Long.valueOf(j))) {
                            U02.remove(Long.valueOf(j));
                        } else {
                            U02.add(Long.valueOf(j));
                        }
                        a3 = Z4.a.a(U02, set);
                        if (a3 != null) {
                            i0Var.h(null, a3);
                        }
                        return y.f7506a;
                    }
                    a3 = null;
                    if (a3 != null) {
                    }
                    return y.f7506a;
                }
                if (kVar instanceof Z4.g) {
                    C1001a c1001a = ((Z4.g) kVar).f7438b;
                    int i4 = c1001a.f12195f;
                    C0999a c0999a2 = c1001a.f12190a;
                    if (i4 != 0) {
                        Set U03 = AbstractC0436k.U0(set);
                        long j5 = c0999a2.f12187a;
                        if (U03.contains(Long.valueOf(j5))) {
                            U03.remove(Long.valueOf(j5));
                        } else {
                            U03.add(Long.valueOf(j5));
                        }
                        a3 = Z4.a.a(set2, U03);
                        if (a3 != null) {
                        }
                        return y.f7506a;
                    }
                }
                a3 = null;
                if (a3 != null) {
                }
                return y.f7506a;
            case 1:
                Z4.h hVar = (Z4.h) obj;
                o6.j.e(hVar, "p0");
                ScenarioListFragment scenarioListFragment = (ScenarioListFragment) this.f13629e;
                scenarioListFragment.getClass();
                long d2 = hVar.d();
                boolean z8 = hVar instanceof Z4.g;
                String str = hVar.f7446a;
                Y4.d dVar = new Y4.d();
                Bundle bundle = new Bundle();
                bundle.putLong(":copy:fragment_args_key_scenario_id", d2);
                bundle.putBoolean(":copy:fragment_args_key_is_smart", z8);
                if (str != null) {
                    bundle.putString(":copy:fragment_args_key_default_copy_name", str);
                }
                dVar.R(bundle);
                dVar.V(scenarioListFragment.M().p(), "ScenarioCopyDialog");
                return y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                Z4.k kVar2 = (Z4.k) obj;
                o6.j.e(kVar2, "p0");
                x xVar = (x) this.f13629e;
                xVar.getClass();
                if (kVar2 instanceof Z4.h) {
                    i0 i0Var2 = xVar.f6631h;
                    d dVar2 = (d) i0Var2.f();
                    Z4.h hVar2 = (Z4.h) kVar2;
                    if (hVar2 instanceof Z4.g) {
                        Set U04 = AbstractC0436k.U0(dVar2.f6590b);
                        long d3 = ((Z4.g) kVar2).d();
                        if (!U04.contains(Long.valueOf(d3))) {
                            U04.add(Long.valueOf(d3));
                        } else {
                            U04.remove(Long.valueOf(d3));
                        }
                        a4 = d.a(dVar2, null, U04, 1);
                    } else if (hVar2 instanceof Z4.e) {
                        Set U05 = AbstractC0436k.U0(dVar2.f6589a);
                        long d9 = ((Z4.e) kVar2).d();
                        if (!U05.contains(Long.valueOf(d9))) {
                            U05.add(Long.valueOf(d9));
                        } else {
                            U05.remove(Long.valueOf(d9));
                        }
                        a4 = d.a(dVar2, U05, null, 2);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    i0Var2.h(null, a4);
                }
                return y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                EnumC0424h enumC0424h = (EnumC0424h) obj;
                o6.j.e(enumC0424h, "p0");
                x xVar2 = (x) this.f13629e;
                xVar2.getClass();
                AbstractC0166y.q(U.g(xVar2), null, null, new w(xVar2, enumC0424h, null), 3);
                return y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                x xVar3 = (x) this.f13629e;
                xVar3.getClass();
                AbstractC0166y.q(U.g(xVar3), null, null, new u(xVar3, booleanValue, null), 3);
                return y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                x xVar4 = (x) this.f13629e;
                xVar4.getClass();
                AbstractC0166y.q(U.g(xVar4), null, null, new t(xVar4, booleanValue2, null), 3);
                return y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Y3.q qVar = (Y3.q) obj;
                o6.j.e(qVar, "p0");
                A a9 = (A) this.f13629e;
                a9.getClass();
                H3.n nVar2 = a9.f7107b;
                f2.m mVar = (f2.m) nVar2.f1950e.a();
                if (mVar != null) {
                    if (qVar.equals(Y3.n.f7141c)) {
                        lVar = f2.l.f10737d;
                    } else if (qVar.equals(Y3.o.f7142c)) {
                        lVar = f2.l.f10738e;
                    } else if (qVar.equals(Y3.p.f7143c)) {
                        lVar = f2.l.f10739f;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar2.j(f2.m.i(mVar, null, null, null, 0, lVar, 15));
                }
                return y.f7506a;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                Integer num = (Integer) obj;
                H3.n nVar3 = ((N) this.f13629e).f7351b;
                f2.o oVar = (f2.o) nVar3.f1950e.a();
                if (oVar != null) {
                    boolean z9 = true;
                    if (num != null && num.intValue() == 0) {
                        nVar = f2.n.f10746d;
                    } else if (num != null && num.intValue() == 1) {
                        nVar = f2.n.f10748f;
                    } else if (num != null && num.intValue() == 2) {
                        nVar = f2.n.f10747e;
                    } else if (num == null) {
                        nVar = null;
                    }
                    f2.n nVar4 = nVar;
                    if (nVar4 != oVar.f10755f) {
                        if (nVar4 == null) {
                            z9 = false;
                        }
                        nVar3.j(f2.o.i(oVar, null, null, null, 0, z9, nVar4, null, 79));
                    }
                }
                return y.f7506a;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                List list3 = (List) obj;
                o6.j.e(list3, "p0");
                N n3 = (N) this.f13629e;
                n3.getClass();
                H3.n nVar5 = n3.f7351b;
                f2.o oVar2 = (f2.o) nVar5.f1950e.a();
                if (oVar2 != null) {
                    nVar5.j(f2.o.i(oVar2, null, null, null, 0, false, null, list3, 15));
                }
                return y.f7506a;
            case 9:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                C0971c c0971c = (C0971c) this.f13629e;
                F3.l lVar2 = c0971c.K;
                if (lVar2 != null) {
                    ImageButton imageButton = lVar2.f1370g;
                    o6.j.d(imageButton, "btnConfirm");
                    c0971c.O(imageButton, booleanValue3, booleanValue3);
                    return y.f7506a;
                }
                o6.j.i("viewBinding");
                throw null;
            case 10:
                Rect rect = (Rect) obj;
                o6.j.e(rect, "p0");
                X x8 = (X) this.f13629e;
                x8.getClass();
                H3.n nVar6 = x8.f12065c;
                C0902b c0902b = (C0902b) nVar6.f1950e.b();
                if (c0902b != null) {
                    Rect rect2 = c0902b.f11794f;
                    int max = Math.max(rect.left, 0);
                    int max2 = Math.max(rect.top, 0);
                    nVar6.k(C0902b.i(c0902b, null, null, null, 0, null, 0, 0, false, new Rect(max, max2, Math.max(rect.right - max, rect2.width()) + max, Math.max(rect.bottom - max2, rect2.height()) + max2), 511));
                }
                return y.f7506a;
            case 11:
                C0902b c0902b2 = (C0902b) obj;
                o6.j.e(c0902b2, "p0");
                J j8 = (J) this.f13629e;
                j8.f12025v.m(c0902b2);
                j8.a();
                return y.f7506a;
            case 12:
                D2.k kVar3 = (D2.k) obj;
                o6.j.e(kVar3, "p0");
                C1020s c1020s = (C1020s) this.f13629e;
                c1020s.getClass();
                i0 i0Var3 = c1020s.f12247g;
                i0Var3.getClass();
                i0Var3.h(null, kVar3);
                return y.f7506a;
            case 13:
                j2.g gVar = (j2.g) obj;
                o6.j.e(gVar, "p0");
                ((m4.i) this.f13629e).H(gVar);
                return y.f7506a;
            case 14:
                p2.d dVar3 = (p2.d) obj;
                o6.j.e(dVar3, "p0");
                C1250u c1250u = (C1250u) this.f13629e;
                c1250u.getClass();
                return c1250u.f13490c.f11153f.r(dVar3);
            case 15:
                p2.d dVar4 = (p2.d) obj;
                o6.j.e(dVar4, "p0");
                C1250u c1250u2 = (C1250u) this.f13629e;
                c1250u2.getClass();
                c1250u2.f13490c.e(dVar4);
                return y.f7506a;
            case 16:
                p2.d dVar5 = (p2.d) obj;
                o6.j.e(dVar5, "p0");
                ((C1250u) this.f13629e).e(dVar5);
                return y.f7506a;
            case 17:
                String str2 = (String) obj;
                o6.j.e(str2, "p0");
                ((O) this.f13629e).e(str2);
                return y.f7506a;
            case 18:
                D2.d dVar6 = (D2.d) obj;
                o6.j.e(dVar6, "p0");
                O o7 = (O) this.f13629e;
                o7.getClass();
                M7.c cVar = new M7.c(dVar6, 15, o7);
                H3.n nVar7 = o7.f13540b;
                C0905e c0905e2 = (C0905e) nVar7.f1950e.b();
                if (c0905e2 != null && (c0905e = (C0905e) cVar.m(c0905e2)) != null) {
                    nVar7.k(c0905e);
                }
                return y.f7506a;
            case 19:
                D2.k kVar4 = (D2.k) obj;
                o6.j.e(kVar4, "p0");
                B b4 = (B) this.f13629e;
                b4.getClass();
                i0 i0Var4 = b4.f13736h;
                i0Var4.getClass();
                i0Var4.h(null, kVar4);
                return y.f7506a;
            case 20:
                C0965l c0965l = (C0965l) obj;
                o6.j.e(c0965l, "p0");
                q3.j jVar = (q3.j) this.f13629e;
                jVar.getClass();
                jVar.c(new A1.n(jVar, 23, c0965l));
                return y.f7506a;
            case 21:
                List list4 = (List) obj;
                o6.j.e(list4, "p0");
                q3.m mVar2 = (q3.m) this.f13629e;
                mVar2.getClass();
                g3.e eVar3 = mVar2.f14007b;
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0965l) it.next()).f12003f);
                }
                eVar3.f(arrayList);
                return y.f7506a;
            case 22:
                p2.d dVar7 = (p2.d) obj;
                o6.j.e(dVar7, "p0");
                q3.m mVar3 = (q3.m) this.f13629e;
                mVar3.getClass();
                return mVar3.f14007b.f11153f.r(dVar7);
            case 23:
                p2.d dVar8 = (p2.d) obj;
                o6.j.e(dVar8, "p0");
                q3.m mVar4 = (q3.m) this.f13629e;
                mVar4.getClass();
                mVar4.f14007b.a(dVar8, null);
                return y.f7506a;
            case 24:
                p2.d dVar9 = (p2.d) obj;
                o6.j.e(dVar9, "p0");
                q3.m mVar5 = (q3.m) this.f13629e;
                mVar5.getClass();
                mVar5.f14007b.e(dVar9);
                return y.f7506a;
            case 25:
                p2.d dVar10 = (p2.d) obj;
                o6.j.e(dVar10, "p0");
                q3.m mVar6 = (q3.m) this.f13629e;
                mVar6.getClass();
                i0 i0Var5 = mVar6.f14008c;
                p2.e eVar4 = (p2.e) i0Var5.f();
                if (eVar4 != null && (list = eVar4.f13701c) != null) {
                    Iterator it2 = list.iterator();
                    int i8 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (!o6.j.a(((p2.d) it2.next()).getId(), dVar10.getId())) {
                                i8++;
                            }
                        } else {
                            i8 = -1;
                        }
                    }
                    if (i8 != -1 && (eVar = (p2.e) i0Var5.f()) != null) {
                        ArrayList S02 = AbstractC0436k.S0(list);
                        S02.remove(i8);
                        mVar6.f14007b.g(p2.e.g(eVar, null, S02, 0, false, 0, false, false, 507));
                    }
                }
                return y.f7506a;
            case 26:
                ((C1419y) this.f13629e).L(((Number) obj).intValue());
                return y.f7506a;
            case 27:
                int intValue = ((Number) obj).intValue();
                C1419y c1419y = (C1419y) this.f13629e;
                c1419y.o().d(c1419y.k(), new l4.l(intValue), true);
                return y.f7506a;
            case 28:
                o6.j.e((Set) obj, "p0");
                C1617h c1617h = (C1617h) this.f13629e;
                ReentrantLock reentrantLock = c1617h.f15233d;
                reentrantLock.lock();
                try {
                    List Q02 = AbstractC0436k.Q0(c1617h.f15232c.values());
                    reentrantLock.unlock();
                    Iterator it3 = Q02.iterator();
                    if (!it3.hasNext()) {
                        return y.f7506a;
                    }
                    ((AbstractC1623n) it3.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                C0952b c0952b = (C0952b) obj;
                o6.j.e(c0952b, "p0");
                u4.k kVar5 = (u4.k) this.f13629e;
                kVar5.getClass();
                kVar5.c(new A1.n(kVar5, 25, c0952b));
                return y.f7506a;
        }
    }
}
