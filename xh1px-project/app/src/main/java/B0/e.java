package B0;

import F0.g;
import F0.h;
import F4.j;
import F4.x;
import K3.C0091e;
import K3.D;
import K3.s;
import L7.AbstractC0166y;
import O3.F;
import O7.i0;
import U3.o;
import Y3.m;
import Z5.n;
import Z5.y;
import Z7.Q;
import a6.C0433h;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.InterfaceC0510v;
import androidx.lifecycle.U;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.navigation.fragment.NavHostFragment;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.core.dumb.data.database.DumbDatabase_Impl;
import com.buzbuz.smartautoclicker.feature.smart.config.ui.common.starters.RestartMediaProjectionActivity;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.game.TutorialGameFragment;
import d4.C0600f;
import d4.C0604j;
import g0.T;
import i.AbstractActivityC0870i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.zip.ZipInputStream;
import k4.J;
import l4.C1030j;
import l4.l;
import m4.i;
import n0.C1121K;
import n0.C1132j;
import n0.C1140r;
import n0.C1146x;
import n0.C1147y;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import p0.C1296d;
import p0.C1299g;
import p4.p;
import q0.C1350f;
import q4.X;
import s3.AbstractC1492c;
import s4.C1502j;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f419e;

    public /* synthetic */ e(int i4, Object obj) {
        this.f418d = i4;
        this.f419e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v5, types: [java.lang.Throwable] */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        x xVar;
        Bundle bundle;
        int i4;
        Bundle bundle2;
        Bundle bundle3;
        Bundle[] bundleArr;
        Boolean valueOf;
        boolean z8;
        String str;
        C0512x g8;
        int i8 = this.f418d;
        int i9 = 0;
        String str2 = null;
        y yVar = y.f7506a;
        Object obj = this.f419e;
        switch (i8) {
            case 0:
                f fVar = (f) obj;
                fVar.g().a(new b(i9, fVar));
                return yVar;
            case 1:
                h hVar = (h) obj;
                Context context = hVar.f1279d;
                String str3 = hVar.f1280e;
                W0.d dVar = new W0.d(4, false);
                dVar.f6489e = null;
                g gVar = new g(context, str3, dVar, hVar.f1281f);
                gVar.setWriteAheadLoggingEnabled(hVar.f1283h);
                return gVar;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                i0 i0Var = ((j) obj).f1393f;
                x xVar2 = (x) i0Var.f();
                if (xVar2 != null) {
                    xVar = x.a(xVar2, null, 13);
                } else {
                    xVar = null;
                }
                i0Var.g(xVar);
                return yVar;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return obj;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return new C0091e((D) obj);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                ((s) obj).i0(false);
                return yVar;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                A4.d dVar2 = ((L2.e) obj).f2774f;
                if (dVar2 != null) {
                    ValueAnimator valueAnimator = (ValueAnimator) dVar2.f299i;
                    if (valueAnimator.isRunning()) {
                        valueAnimator.end();
                    }
                    valueAnimator.start();
                    return yVar;
                }
                o6.j.i("animations");
                throw null;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                F3.a aVar = ((N2.d) obj).f3732h;
                if (aVar != null) {
                    ValueAnimator valueAnimator2 = (ValueAnimator) aVar.j;
                    if (valueAnimator2.isRunning()) {
                        valueAnimator2.end();
                    }
                    valueAnimator2.start();
                    return yVar;
                }
                o6.j.i("animations");
                throw null;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                F.Q((F) obj);
                return yVar;
            case 9:
                TutorialGameFragment tutorialGameFragment = (TutorialGameFragment) obj;
                H1.b bVar = tutorialGameFragment.S().f573b;
                if (bVar.f1884c != null) {
                    bVar.f1884c = null;
                    Iterator it = bVar.f1883b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1163b) it.next()).m(null);
                    }
                }
                tutorialGameFragment.T().f4897b.b();
                return yVar;
            case 10:
                o.I((o) obj);
                return yVar;
            case 11:
                return ((ZipInputStream) obj).getNextEntry();
            case 12:
                X7.g gVar2 = (X7.g) obj;
                return Integer.valueOf(Q.e(gVar2, gVar2.j));
            case 13:
                m.H((m) obj);
                return yVar;
            case 14:
                return o6.j.g((Object[]) obj);
            case 15:
                return ((Iterable) obj).iterator();
            case 16:
                return U.f((f0) obj);
            case 17:
                ((AbstractActivityC0870i) obj).reportFullyDrawn();
                return null;
            case 18:
                C0600f c0600f = (C0600f) obj;
                c0600f.f10379v.m((String) ((C0604j) c0600f.f10381x.getValue()).f10389b.f());
                c0600f.a();
                return yVar;
            case 19:
                int i10 = RestartMediaProjectionActivity.f9817I;
                ((RestartMediaProjectionActivity) obj).z();
                return yVar;
            case 20:
                return (J2.b) ((c1.h) ((I2.a) D2.f.p(((J) obj).k().getApplicationContext(), I2.a.class))).j.get();
            case 21:
                return new C1030j((l) obj, 0);
            case 22:
                return new C1030j((i) obj, 1);
            case 23:
                return new n2.j((DumbDatabase_Impl) obj);
            case 24:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context j = navHostFragment.j();
                if (j != null) {
                    C1146x c1146x = new C1146x(j);
                    C1350f c1350f = c1146x.f12819b;
                    C0.a aVar2 = c1350f.f13897q;
                    C1121K c1121k = c1350f.f13898r;
                    if (!navHostFragment.equals(c1350f.f13893m)) {
                        InterfaceC0510v interfaceC0510v = c1350f.f13893m;
                        if (interfaceC0510v != null && (g8 = interfaceC0510v.g()) != null) {
                            g8.f(aVar2);
                        }
                        c1350f.f13893m = navHostFragment;
                        navHostFragment.f11103T.a(aVar2);
                    }
                    e0 f8 = navHostFragment.f();
                    if (!o6.j.a(c1350f.f13894n, h4.g.n(f8))) {
                        if (c1350f.f13888f.isEmpty()) {
                            c1350f.f13894n = h4.g.n(f8);
                        } else {
                            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                        }
                    }
                    Context O8 = navHostFragment.O();
                    T i11 = navHostFragment.i();
                    o6.j.d(i11, "getChildFragmentManager(...)");
                    c1121k.a(new C1296d(O8, i11));
                    Context O9 = navHostFragment.O();
                    T i12 = navHostFragment.i();
                    o6.j.d(i12, "getChildFragmentManager(...)");
                    int i13 = navHostFragment.f11086B;
                    if (i13 == 0 || i13 == -1) {
                        i13 = R.id.nav_host_fragment_container;
                    }
                    c1121k.a(new C1299g(O9, i12, i13));
                    Bundle b4 = ((A.i) navHostFragment.f11107X.f89f).b("android-support-nav:fragment:navControllerState");
                    if (b4 != null) {
                        b4.setClassLoader(j.getClassLoader());
                        LinkedHashMap linkedHashMap = c1350f.f13892l;
                        if (b4.containsKey("android-support-nav:controller:navigatorState")) {
                            bundle3 = b4.getBundle("android-support-nav:controller:navigatorState");
                            if (bundle3 == null) {
                                AbstractC1492c.z("android-support-nav:controller:navigatorState");
                                throw null;
                            }
                        } else {
                            bundle3 = null;
                        }
                        c1350f.f13886d = bundle3;
                        if (b4.containsKey("android-support-nav:controller:backStack")) {
                            bundleArr = (Bundle[]) X.z("android-support-nav:controller:backStack", b4).toArray(new Bundle[0]);
                        } else {
                            bundleArr = null;
                        }
                        c1350f.f13887e = bundleArr;
                        linkedHashMap.clear();
                        if (b4.containsKey("android-support-nav:controller:backStackDestIds") && b4.containsKey("android-support-nav:controller:backStackIds")) {
                            int[] intArray = b4.getIntArray("android-support-nav:controller:backStackDestIds");
                            if (intArray != null) {
                                ArrayList<String> stringArrayList = b4.getStringArrayList("android-support-nav:controller:backStackIds");
                                if (stringArrayList != null) {
                                    int length = intArray.length;
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (i14 < length) {
                                        int i16 = i15 + 1;
                                        String str4 = str2;
                                        Integer valueOf2 = Integer.valueOf(intArray[i14]);
                                        LinkedHashMap linkedHashMap2 = c1350f.k;
                                        if (!o6.j.a(stringArrayList.get(i15), "")) {
                                            str = stringArrayList.get(i15);
                                        } else {
                                            str = str4;
                                        }
                                        linkedHashMap2.put(valueOf2, str);
                                        i14++;
                                        i15 = i16;
                                        str2 = str4;
                                    }
                                } else {
                                    AbstractC1492c.z("android-support-nav:controller:backStackIds");
                                    throw null;
                                }
                            } else {
                                AbstractC1492c.z("android-support-nav:controller:backStackDestIds");
                                throw null;
                            }
                        }
                        ?? r18 = str2;
                        if (b4.containsKey("android-support-nav:controller:backStackStates")) {
                            ArrayList<String> stringArrayList2 = b4.getStringArrayList("android-support-nav:controller:backStackStates");
                            if (stringArrayList2 != null) {
                                for (String str5 : stringArrayList2) {
                                    String str6 = "android-support-nav:controller:backStackStates:" + str5;
                                    o6.j.e(str6, "key");
                                    if (b4.containsKey(str6)) {
                                        ArrayList z9 = X.z("android-support-nav:controller:backStackStates:" + str5, b4);
                                        C0433h c0433h = new C0433h(z9.size());
                                        Iterator it2 = z9.iterator();
                                        while (it2.hasNext()) {
                                            c0433h.addLast(new C1132j((Bundle) it2.next()));
                                        }
                                        linkedHashMap.put(str5, c0433h);
                                    }
                                }
                            } else {
                                AbstractC1492c.z("android-support-nav:controller:backStackStates");
                                throw r18;
                            }
                        }
                        boolean z10 = b4.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                        if (!z10 && b4.getBoolean("android-support-nav:controller:deepLinkHandled", true)) {
                            valueOf = r18;
                        } else {
                            valueOf = Boolean.valueOf(z10);
                        }
                        if (valueOf != null) {
                            z8 = valueOf.booleanValue();
                        } else {
                            z8 = false;
                        }
                        c1146x.f12822e = z8;
                        bundle = r18;
                    } else {
                        bundle = null;
                    }
                    ((A.i) navHostFragment.f11107X.f89f).k("android-support-nav:fragment:navControllerState", new g0.F(2, c1146x));
                    Bundle b9 = ((A.i) navHostFragment.f11107X.f89f).b("android-support-nav:fragment:graphId");
                    if (b9 != null) {
                        navHostFragment.f8872e0 = b9.getInt("android-support-nav:fragment:graphId");
                    }
                    ((A.i) navHostFragment.f11107X.f89f).k("android-support-nav:fragment:graphId", new g0.F(3, navHostFragment));
                    int i17 = navHostFragment.f8872e0;
                    n nVar = c1146x.f12825h;
                    if (i17 != 0) {
                        c1350f.q(((C1147y) nVar.getValue()).b(i17), bundle);
                    } else {
                        Bundle bundle4 = navHostFragment.f11115i;
                        if (bundle4 != null) {
                            i4 = bundle4.getInt("android-support-nav:fragment:graphId");
                        } else {
                            i4 = 0;
                        }
                        if (bundle4 != null) {
                            bundle2 = bundle4.getBundle("android-support-nav:fragment:startDestinationArgs");
                        } else {
                            bundle2 = null;
                        }
                        if (i4 != 0) {
                            c1350f.q(((C1147y) nVar.getValue()).b(i4), bundle2);
                        }
                    }
                    return c1146x;
                }
                throw new IllegalStateException("NavController cannot be created before the fragment is attached");
            case 25:
                p.H((p) obj);
                return yVar;
            case 26:
                String str7 = (String) obj;
                o6.j.e(str7, "uriPattern");
                return new C1140r(str7, null, null);
            case 27:
                ((r2.j) obj).c();
                return yVar;
            case 28:
                C1502j.Q((C1502j) obj);
                return yVar;
            default:
                v2.h hVar2 = (v2.h) obj;
                AbstractC0166y.q(hVar2.f15503c, null, null, new v2.g(hVar2, null), 3);
                return yVar;
        }
    }
}
