package J3;

import L7.AbstractC0166y;
import O7.i0;
import androidx.lifecycle.U;
import c.C0544A;
import c5.C0581a;
import com.buzbuz.smartautoclicker.SmartAutoClickerService;
import com.buzbuz.smartautoclicker.feature.smart.config.ui.common.starters.RequestNotificationPermissionActivity;
import com.buzbuz.smartautoclicker.scenarios.ScenarioActivity;
import h3.C0821i;
import h3.C0826n;
import j3.C0914I;
import l0.C0997a;
import l1.C1000b;
import l2.C1001a;
import m3.C1060E;
import n6.InterfaceC1162a;
import o3.C1234e;
import p2.C1304a;
import r1.C1428b;
import r3.C1460x;
import v4.C1666a;
import v4.C1674i;
import x2.C1779a;
import x2.C1780b;
import x2.C1781c;
import x2.C1782d;
import x2.C1783e;

/* loaded from: classes.dex */
public final /* synthetic */ class s extends o6.i implements InterfaceC1162a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2462l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i4, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i4, obj, cls, str, str2, i8, i9);
        this.f2462l = i10;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        int i4 = this.f2462l;
        int i8 = 2;
        Object obj = null;
        Z5.y yVar = Z5.y.f7506a;
        Object obj2 = this.f13629e;
        switch (i4) {
            case 0:
                ((H) obj2).e();
                return yVar;
            case 1:
                ((S4.k) obj2).f5389c.a();
                return yVar;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                ScenarioActivity scenarioActivity = (ScenarioActivity) obj2;
                int i9 = ScenarioActivity.f9852J;
                C0581a z8 = scenarioActivity.z();
                U4.a aVar = new U4.a(scenarioActivity, 0);
                P1.w wVar = z8.f9668c;
                wVar.getClass();
                if (o6.j.a(wVar.f4495g.f(), P1.b.f4454b) && !wVar.f4492d) {
                    AbstractC0166y.q(wVar.f4491c, null, null, new P1.v(wVar, aVar, null, scenarioActivity), 3);
                } else {
                    aVar.a();
                }
                return yVar;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                H3.n nVar = ((W3.z) obj2).f6564b;
                f2.j jVar = (f2.j) nVar.f1950e.a();
                if (jVar != null) {
                    nVar.j(f2.j.i(jVar, null, null, null, 0, null, !jVar.f10729f, 31));
                }
                return yVar;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                SmartAutoClickerService smartAutoClickerService = (SmartAutoClickerService) obj2;
                int i10 = SmartAutoClickerService.f9743v;
                P1.o oVar = smartAutoClickerService.f9752n;
                if (oVar != null) {
                    AbstractC0166y.q(oVar.f4472b, null, null, new P1.j(oVar, null), 3);
                    if (smartAutoClickerService.f9757s != null) {
                        C1428b c1428b = smartAutoClickerService.f9759u;
                        if (c1428b != null) {
                            c1428b.c();
                            if (smartAutoClickerService.f9757s != null) {
                                h4.g.s(smartAutoClickerService, false);
                                smartAutoClickerService.stopForeground(1);
                                Y1.d dVar = smartAutoClickerService.f9749i;
                                if (dVar != null) {
                                    dVar.f7103d.d();
                                    dVar.f7102c.clear();
                                    q1.e eVar = smartAutoClickerService.f9750l;
                                    if (eVar != null) {
                                        eVar.f13923a.evictAll();
                                        return yVar;
                                    }
                                    o6.j.i("bitmapManager");
                                    throw null;
                                }
                                o6.j.i("displayConfigManager");
                                throw null;
                            }
                            o6.j.i("reviewRepository");
                            throw null;
                        }
                        o6.j.i("actionExecutor");
                        throw null;
                    }
                    o6.j.i("reviewRepository");
                    throw null;
                }
                o6.j.i("qualityMetricsMonitor");
                throw null;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                ((C0544A) obj2).c();
                return yVar;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((C0544A) obj2).c();
                return yVar;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                x2.f fVar = ((d5.r) obj2).f10436d;
                AbstractC0166y.q(fVar.f16104b, null, null, new C1779a(fVar, null), 3);
                return yVar;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                x2.f fVar2 = ((d5.r) obj2).f10436d;
                AbstractC0166y.q(fVar2.f16104b, null, null, new C1782d(fVar2, null), 3);
                return yVar;
            case 9:
                x2.f fVar3 = ((d5.r) obj2).f10436d;
                AbstractC0166y.q(fVar3.f16104b, null, null, new C1783e(fVar3, null), 3);
                return yVar;
            case 10:
                x2.f fVar4 = ((d5.r) obj2).f10436d;
                AbstractC0166y.q(fVar4.f16104b, null, null, new C1780b(fVar4, null), 3);
                return yVar;
            case 11:
                x2.f fVar5 = ((d5.r) obj2).f10436d;
                AbstractC0166y.q(fVar5.f16104b, null, null, new C1781c(fVar5, null), 3);
                return yVar;
            case 12:
                C0826n c0826n = (C0826n) obj2;
                c0826n.getClass();
                C0997a g8 = U.g(c0826n);
                S7.e eVar2 = L7.F.f3175a;
                AbstractC0166y.q(g8, S7.d.f5456f, null, new C0821i(c0826n, null), 2);
                return yVar;
            case 13:
                g3.e eVar3 = ((C0826n) obj2).f11358b;
                eVar3.f11149b.g(null);
                R3.r rVar = eVar3.f11153f;
                ((C1000b) rVar.f5082e).f12189a = 0L;
                rVar.f5083f = null;
                return yVar;
            case 14:
                C0826n c0826n2 = (C0826n) obj2;
                c0826n2.getClass();
                C0997a g9 = U.g(c0826n2);
                S7.e eVar4 = L7.F.f3175a;
                AbstractC0166y.q(g9, S7.d.f5456f, null, new C0821i(c0826n2, null), 2);
                return yVar;
            case 15:
                RequestNotificationPermissionActivity requestNotificationPermissionActivity = (RequestNotificationPermissionActivity) obj2;
                C1.g gVar = requestNotificationPermissionActivity.f9816H;
                if (gVar != null) {
                    gVar.g();
                    C1.g gVar2 = requestNotificationPermissionActivity.f9816H;
                    if (gVar2 != null) {
                        gVar2.e(requestNotificationPermissionActivity);
                        requestNotificationPermissionActivity.finish();
                        return yVar;
                    }
                    o6.j.i("overlayManager");
                    throw null;
                }
                o6.j.i("overlayManager");
                throw null;
            case 16:
                RequestNotificationPermissionActivity requestNotificationPermissionActivity2 = (RequestNotificationPermissionActivity) obj2;
                C1.g gVar3 = requestNotificationPermissionActivity2.f9816H;
                if (gVar3 != null) {
                    gVar3.g();
                    C1.g gVar4 = requestNotificationPermissionActivity2.f9816H;
                    if (gVar4 != null) {
                        gVar4.e(requestNotificationPermissionActivity2);
                        requestNotificationPermissionActivity2.finish();
                        return yVar;
                    }
                    o6.j.i("overlayManager");
                    throw null;
                }
                o6.j.i("overlayManager");
                throw null;
            case 17:
                i0 i0Var = ((C0914I) obj2).f11842b;
                C1304a c1304a = (C1304a) i0Var.f();
                if (c1304a != null) {
                    boolean z9 = c1304a.f13681f;
                    C1304a c1304a2 = (C1304a) i0Var.f();
                    if (c1304a2 != null) {
                        obj = C1304a.i(c1304a2, null, null, null, 0, 0, !z9, 0L, null, 0L, 479);
                    }
                    i0Var.g(obj);
                }
                return yVar;
            case 18:
                i0 i0Var2 = ((C1060E) obj2).f12425b;
                p2.c cVar = (p2.c) i0Var2.f();
                if (cVar != null) {
                    boolean z10 = cVar.f13695f;
                    p2.c cVar2 = (p2.c) i0Var2.f();
                    if (cVar2 != null) {
                        obj = p2.c.i(cVar2, null, null, null, 0, 0, !z10, 0L, null, null, 0L, 991);
                    }
                    i0Var2.g(obj);
                }
                return yVar;
            case 19:
                H3.n nVar2 = ((p4.B) obj2).f13730b;
                j2.f fVar6 = (j2.f) nVar2.f1950e.b();
                if (fVar6 != null) {
                    nVar2.k(j2.f.i(fVar6, null, null, null, 0L, !fVar6.f11818e, 15));
                }
                return yVar;
            case 20:
                ((q4.U) obj2).e(new C1234e(8));
                return yVar;
            case 21:
                ((q4.U) obj2).e(new C1234e(9));
                return yVar;
            case 22:
                C1460x c1460x = (C1460x) obj2;
                i0 i0Var3 = c1460x.f14370c;
                p2.e eVar5 = (p2.e) i0Var3.f();
                if (eVar5 != null) {
                    boolean z11 = eVar5.f13703e;
                    p2.e eVar6 = (p2.e) i0Var3.f();
                    if (eVar6 != null) {
                        c1460x.f14369b.g(p2.e.g(eVar6, null, null, 0, !z11, 0, false, false, 495));
                    }
                }
                return yVar;
            case 23:
                C1460x c1460x2 = (C1460x) obj2;
                i0 i0Var4 = c1460x2.f14370c;
                p2.e eVar7 = (p2.e) i0Var4.f();
                if (eVar7 != null) {
                    boolean z12 = eVar7.f13705g;
                    p2.e eVar8 = (p2.e) i0Var4.f();
                    if (eVar8 != null) {
                        c1460x2.f14369b.g(p2.e.g(eVar8, null, null, 0, false, 0, !z12, false, 447));
                    }
                }
                return yVar;
            case 24:
                C1460x c1460x3 = (C1460x) obj2;
                p2.e eVar9 = (p2.e) c1460x3.f14370c.f();
                if (eVar9 != null) {
                    c1460x3.f14369b.g(p2.e.g(eVar9, null, null, 0, false, 0, false, !eVar9.f13706h, 383));
                }
                return yVar;
            case 25:
                t4.x xVar = (t4.x) obj2;
                C1001a g10 = xVar.f15114c.f1950e.g();
                if (g10 != null) {
                    AbstractC0166y.q(U.g(xVar), null, null, new t4.w(xVar, g10, null), 3);
                }
                return yVar;
            case 26:
                t4.x xVar2 = (t4.x) obj2;
                C1001a g11 = xVar2.f15114c.f1950e.g();
                if (g11 != null) {
                    AbstractC0166y.q(U.g(xVar2), null, null, new t4.v(xVar2, g11, null), 3);
                }
                return yVar;
            case 27:
                u0.u uVar = (u0.u) obj2;
                Q7.d dVar2 = uVar.f15275a;
                if (dVar2 != null) {
                    AbstractC0166y.e(dVar2);
                    uVar.e();
                    u0.r rVar2 = uVar.f15279e;
                    if (rVar2 != null) {
                        rVar2.f15256f.close();
                        return yVar;
                    }
                    o6.j.i("connectionManager");
                    throw null;
                }
                o6.j.i("coroutineScope");
                throw null;
            case 28:
                C3.e eVar10 = ((u4.m) obj2).f15345b.f1948c;
                E3.a aVar2 = (E3.a) eVar10.f601h.f();
                if (aVar2 != null) {
                    aVar2.g();
                }
                eVar10.f596c.g(null);
                return yVar;
            default:
                C1674i c1674i = (C1674i) obj2;
                c1674i.getClass();
                c1674i.c(new C1666a(c1674i, i8));
                return yVar;
        }
    }
}
