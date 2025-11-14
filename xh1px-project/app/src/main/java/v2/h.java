package v2;

import D4.C0037m;
import D4.C0040p;
import J3.C0076a;
import L7.AbstractC0160s;
import L7.AbstractC0166y;
import L7.k0;
import O7.InterfaceC0233f;
import O7.V;
import O7.i0;
import Z5.y;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.PowerManager;
import android.util.Log;
import b2.r;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.io.Serializable;
import java.util.List;
import l1.C0999a;
import l2.C1001a;
import o4.C1254C;
import o6.C1282a;
import r2.C1435g;
import r2.k;
import z4.C1866j;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final r f15501a;

    /* renamed from: b, reason: collision with root package name */
    public final r2.j f15502b;

    /* renamed from: c, reason: collision with root package name */
    public final Q7.d f15503c;

    /* renamed from: d, reason: collision with root package name */
    public final Q7.d f15504d;

    /* renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f15505e;

    /* renamed from: f, reason: collision with root package name */
    public C0076a f15506f;

    /* renamed from: g, reason: collision with root package name */
    public k0 f15507g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f15508h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f15509i;
    public final C1254C j;
    public final A4.c k;

    public h(Context context, AbstractC0160s abstractC0160s, AbstractC0160s abstractC0160s2, r rVar, r2.j jVar) {
        o6.j.e(rVar, "scenarioRepository");
        o6.j.e(jVar, "detectorEngine");
        this.f15501a = rVar;
        this.f15502b = jVar;
        this.f15503c = AbstractC0166y.b(E2.d.C(AbstractC0166y.c(), abstractC0160s));
        Q7.d b4 = AbstractC0166y.b(E2.d.C(AbstractC0166y.c(), abstractC0160s2));
        this.f15504d = b4;
        Object systemService = context.getSystemService("power");
        o6.j.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(6, "Klickr::Detection");
        newWakeLock.setReferenceCounted(false);
        this.f15505e = newWakeLock;
        InterfaceC0617c interfaceC0617c = null;
        i0 c6 = V.c(null);
        this.f15508h = c6;
        this.f15509i = c6;
        C1254C c1254c = new C1254C(jVar.f14306p, 10);
        this.j = c1254c;
        InterfaceC0233f k = V.k(new A4.c(c6, c1254c, new C0037m(this, interfaceC0617c, 14), 27));
        this.k = new A4.c(V.u(new C0040p(c6, 18), new C0037m(interfaceC0617c, this, 15)), c1254c, new C3.c(3, interfaceC0617c, 8), 27);
        V.s(new A.i(k, 26, new C1282a(2, this, h.class, "updateWakeLockState", "updateWakeLockState(Z)V", 4)), b4);
    }

    public final boolean a() {
        if (this.f15502b.f14306p.f() == k.f14311g) {
            return true;
        }
        return false;
    }

    public final void b(C0999a c0999a, boolean z8) {
        o6.j.e(c0999a, "identifier");
        i0 i0Var = this.f15508h;
        i0Var.getClass();
        i0Var.h(null, c0999a);
        if (z8) {
            AbstractC0166y.q(this.f15504d, null, null, new C1663c(this, c0999a, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r8v11, types: [v2.j] */
    /* JADX WARN: Type inference failed for: r8v7, types: [v2.j] */
    /* JADX WARN: Type inference failed for: r8v9, types: [v2.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, C1866j c1866j, AbstractC0713c abstractC0713c) {
        e eVar;
        int i4;
        long j;
        C1866j c1866j2;
        Context context2;
        J7.a aVar;
        C1001a c1001a;
        C1001a c1001a2;
        Serializable g8;
        List list;
        J7.a aVar2;
        Context context3;
        C1866j c1866j3;
        if (abstractC0713c instanceof e) {
            eVar = (e) abstractC0713c;
            int i8 = eVar.f15497o;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f15497o = i8 - Integer.MIN_VALUE;
                Object obj = eVar.f15495m;
                i4 = eVar.f15497o;
                y yVar = y.f7506a;
                r rVar = this.f15501a;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                List list2 = eVar.k;
                                c1001a2 = eVar.j;
                                J7.a aVar3 = eVar.f15493i;
                                ?? r8 = eVar.f15492h;
                                Context context4 = eVar.f15491g;
                                Z5.a.d(obj);
                                list = list2;
                                c1866j3 = r8;
                                context3 = context4;
                                aVar2 = aVar3;
                                this.f15502b.b(context3, c1001a2, list, (List) obj, c1866j3);
                                if (aVar2 != null) {
                                    long j5 = aVar2.f2504d;
                                    k0 k0Var = this.f15507g;
                                    if (k0Var != null) {
                                        k0Var.d(null);
                                    }
                                    this.f15507g = AbstractC0166y.q(this.f15504d, null, null, new f(j5, this, null), 3);
                                }
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = eVar.f15494l;
                        C1001a c1001a3 = eVar.j;
                        J7.a aVar4 = eVar.f15493i;
                        ?? r82 = eVar.f15492h;
                        context2 = eVar.f15491g;
                        Z5.a.d(obj);
                        c1001a2 = c1001a3;
                        c1866j2 = r82;
                        aVar = aVar4;
                        List list3 = (List) obj;
                        eVar.f15491g = context2;
                        eVar.f15492h = c1866j2;
                        eVar.f15493i = aVar;
                        eVar.j = c1001a2;
                        eVar.k = list3;
                        eVar.f15494l = j;
                        eVar.f15497o = 3;
                        g8 = rVar.g(j, eVar);
                        if (g8 != enumC0646a) {
                            list = list3;
                            obj = g8;
                            aVar2 = aVar;
                            context3 = context2;
                            c1866j3 = c1866j2;
                            this.f15502b.b(context3, c1001a2, list, (List) obj, c1866j3);
                            if (aVar2 != null) {
                            }
                            return yVar;
                        }
                        return enumC0646a;
                    }
                    j = eVar.f15494l;
                    J7.a aVar5 = eVar.f15493i;
                    ?? r83 = eVar.f15492h;
                    context2 = eVar.f15491g;
                    Z5.a.d(obj);
                    aVar = aVar5;
                    c1866j2 = r83;
                } else {
                    Z5.a.d(obj);
                    C0999a c0999a = (C0999a) this.f15509i.f();
                    if (c0999a != null) {
                        j = c0999a.f12187a;
                        eVar.f15491g = context;
                        c1866j2 = c1866j;
                        eVar.f15492h = c1866j2;
                        eVar.f15493i = null;
                        eVar.f15494l = j;
                        eVar.f15497o = 1;
                        Object f8 = rVar.f(j, eVar);
                        if (f8 != enumC0646a) {
                            context2 = context;
                            obj = f8;
                            aVar = null;
                        }
                        return enumC0646a;
                    }
                    return yVar;
                }
                c1001a = (C1001a) obj;
                if (c1001a != null) {
                    eVar.f15491g = context2;
                    eVar.f15492h = c1866j2;
                    eVar.f15493i = aVar;
                    eVar.j = c1001a;
                    eVar.f15494l = j;
                    eVar.f15497o = 2;
                    Serializable e9 = rVar.e(j, eVar);
                    if (e9 != enumC0646a) {
                        c1001a2 = c1001a;
                        obj = e9;
                        List list32 = (List) obj;
                        eVar.f15491g = context2;
                        eVar.f15492h = c1866j2;
                        eVar.f15493i = aVar;
                        eVar.j = c1001a2;
                        eVar.k = list32;
                        eVar.f15494l = j;
                        eVar.f15497o = 3;
                        g8 = rVar.g(j, eVar);
                        if (g8 != enumC0646a) {
                        }
                    }
                    return enumC0646a;
                }
                return yVar;
            }
        }
        eVar = new e(this, abstractC0713c);
        Object obj2 = eVar.f15495m;
        i4 = eVar.f15497o;
        y yVar2 = y.f7506a;
        r rVar2 = this.f15501a;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        c1001a = (C1001a) obj2;
        if (c1001a != null) {
        }
        return yVar2;
    }

    public final void d(int i4, Intent intent) {
        o6.j.e(intent, "data");
        B0.e eVar = new B0.e(29, this);
        r2.j jVar = this.f15502b;
        Y1.d dVar = jVar.f14294b;
        i0 i0Var = jVar.f14305o;
        if (i0Var.f() != k.f14308d) {
            Log.w("DetectorEngine", "startScreenRecord: Screen record is already started");
            return;
        }
        Point point = dVar.f7104e.f7094a;
        if (point.x > 0 && point.y > 0) {
            i0Var.h(null, k.f14309e);
            Log.i("DetectorEngine", "startScreenRecord");
            jVar.k = AbstractC0166y.b(jVar.f14293a);
            dVar.f7102c.add(jVar.f14304n);
            Q7.d dVar2 = jVar.k;
            if (dVar2 != null) {
                AbstractC0166y.q(dVar2, null, null, new C1435g(jVar, i4, intent, point, eVar, null), 3);
                return;
            }
            return;
        }
        Log.w("DetectorEngine", "startScreenRecord: Invalid display size " + point);
    }

    public final void e() {
        this.f15502b.c();
        k0 k0Var = this.f15507g;
        if (k0Var != null) {
            k0Var.d(null);
        }
        this.f15507g = null;
    }
}
