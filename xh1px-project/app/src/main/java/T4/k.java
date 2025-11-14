package T4;

import D4.C0036l;
import E.t;
import J3.s;
import L7.AbstractC0166y;
import L7.F;
import L7.k0;
import L7.l0;
import O7.V;
import Z5.n;
import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import b1.C0523b;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.SmartAutoClickerService;
import h1.AbstractC0812e;
import i1.C0879a;
import l2.C1001a;
import q2.C1365k;
import s3.C1491b;
import t3.C1572j;
import u3.C1631a;
import v3.C1665a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final SmartAutoClickerService f5774a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.g f5775b;

    /* renamed from: c, reason: collision with root package name */
    public final C0879a f5776c;

    /* renamed from: d, reason: collision with root package name */
    public final x2.f f5777d;

    /* renamed from: e, reason: collision with root package name */
    public final v2.h f5778e;

    /* renamed from: f, reason: collision with root package name */
    public final C1365k f5779f;

    /* renamed from: g, reason: collision with root package name */
    public final A3.a f5780g;

    /* renamed from: h, reason: collision with root package name */
    public final C4.f f5781h;

    /* renamed from: i, reason: collision with root package name */
    public final C0523b f5782i;
    public final s j;
    public final Q7.d k;

    /* renamed from: l, reason: collision with root package name */
    public k0 f5783l;

    /* renamed from: m, reason: collision with root package name */
    public k0 f5784m;

    /* renamed from: n, reason: collision with root package name */
    public final n f5785n;

    /* renamed from: o, reason: collision with root package name */
    public m f5786o;

    public k(SmartAutoClickerService smartAutoClickerService, C1.g gVar, C0879a c0879a, x2.f fVar, v2.h hVar, C1365k c1365k, A3.a aVar, C4.f fVar2, C0523b c0523b, s sVar) {
        o6.j.e(c0879a, "appComponentsProvider");
        o6.j.e(fVar, "settingsRepository");
        o6.j.e(fVar2, "debugRepository");
        this.f5774a = smartAutoClickerService;
        this.f5775b = gVar;
        this.f5776c = c0879a;
        this.f5777d = fVar;
        this.f5778e = hVar;
        this.f5779f = c1365k;
        this.f5780g = aVar;
        this.f5781h = fVar2;
        this.f5782i = c0523b;
        this.j = sVar;
        S7.e eVar = F.f3175a;
        M7.e eVar2 = Q7.n.f4962a;
        l0 c6 = AbstractC0166y.c();
        eVar2.getClass();
        Q7.d b4 = AbstractC0166y.b(E2.d.C(eVar2, c6));
        this.k = b4;
        this.f5785n = new n(new a(this, 0));
        this.f5786o = new m(false, false);
        int i4 = 26;
        V.s(new A.i(new A4.c(c1365k.k, hVar.j, new C0036l(3, null, 2), 27), i4, new b(this, null)), b4);
        gVar.j = new a(this, 1);
    }

    public final void a(p2.e eVar) {
        if (this.f5786o.f5790a) {
            return;
        }
        this.f5786o = new m(true, false);
        this.f5782i.j(Long.valueOf(eVar.f13699a.f12187a), Boolean.FALSE, null);
        this.f5783l = AbstractC0166y.q(this.k, null, null, new f(this, eVar, null), 3);
    }

    public final void b(int i4, Intent intent, C1001a c1001a) {
        C1665a c1665a;
        o6.j.e(intent, "data");
        if (this.f5786o.f5790a) {
            return;
        }
        this.f5786o = new m(true, true);
        Long valueOf = Long.valueOf(c1001a.f12190a.f12187a);
        Boolean bool = Boolean.TRUE;
        C1491b c1491b = (C1491b) this.f5785n.getValue();
        String str = c1001a.f12191b;
        c1491b.getClass();
        Log.i("ServiceNotificationManager", "Create notification");
        C1631a c1631a = c1491b.f14516e;
        SmartAutoClickerService smartAutoClickerService = this.f5774a;
        AbstractC0812e.c(c1631a, smartAutoClickerService);
        AbstractC0812e.c(c1491b.f14515d, smartAutoClickerService);
        if (Build.VERSION.SDK_INT >= 26) {
            t tVar = c1491b.f14514c;
            A5.a.u();
            tVar.a(A5.a.c(smartAutoClickerService.getString(R.string.notification_service_channel_name)));
        }
        if (str == null) {
            str = "";
        }
        if (c1631a.f11321b != null) {
            c1491b.f14517f = new C1572j(str, false, true, c1631a.f15318d);
            boolean booleanValue = ((Boolean) c1491b.f14512a.f16107e.f4088d.f()).booleanValue();
            C1665a c1665a2 = c1491b.f14518g;
            if (c1665a2 == null) {
                C1572j c1572j = c1491b.f14517f;
                o6.j.b(c1572j);
                C0879a c0879a = c1491b.f14513b;
                o6.j.e(c0879a, "appComponentsProvider");
                if (booleanValue) {
                    c1665a = new C1665a(smartAutoClickerService, c1572j, c0879a, 1);
                } else {
                    try {
                        c1665a = new C1665a(smartAutoClickerService, c1572j, c0879a, 0);
                    } catch (Exception unused) {
                        c1665a = new C1665a(smartAutoClickerService, c1572j, c0879a, 1);
                    }
                }
                c1665a2 = c1665a;
            }
            c1491b.f14518g = c1665a2;
            Notification a3 = c1665a2.a();
            o6.j.d(a3, "build(...)");
            this.f5782i.j(valueOf, bool, a3);
            this.f5783l = AbstractC0166y.q(this.k, null, null, new h(this, i4, intent, c1001a, null), 3);
            return;
        }
        throw new IllegalStateException("Can't get night mode value, listener is not registered");
    }

    public final void c() {
        if (!this.f5786o.f5790a) {
            return;
        }
        this.f5786o = new m(false, false);
        AbstractC0166y.q(this.k, null, null, new j(this, null), 3);
    }
}
