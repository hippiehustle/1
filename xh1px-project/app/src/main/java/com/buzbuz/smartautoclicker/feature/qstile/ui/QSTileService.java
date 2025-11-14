package com.buzbuz.smartautoclicker.feature.qstile.ui;

import L7.AbstractC0160s;
import L7.AbstractC0166y;
import L7.k0;
import L7.l0;
import O7.P;
import Q7.d;
import T4.k;
import T4.l;
import V5.i;
import W5.a;
import X5.b;
import Z.g;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import c1.C0565f;
import com.buzbuz.smartautoclicker.SmartAutoClickerService;
import j1.AbstractC0900a;
import kotlin.Metadata;
import o6.j;
import x3.C1784a;
import x3.C1787d;
import y3.C1839h;
import y3.InterfaceC1840i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/feature/qstile/ui/QSTileService;", "Landroid/service/quicksettings/TileService;", "<init>", "()V", "quick-settings-tile_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class QSTileService extends TileService implements b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9803l = 0;

    /* renamed from: d, reason: collision with root package name */
    public volatile i f9804d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9805e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f9806f = false;

    /* renamed from: g, reason: collision with root package name */
    public C1787d f9807g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC0160s f9808h;

    /* renamed from: i, reason: collision with root package name */
    public d f9809i;
    public k0 j;
    public boolean k;

    @Override // X5.b
    public final Object a() {
        if (this.f9804d == null) {
            synchronized (this.f9805e) {
                try {
                    if (this.f9804d == null) {
                        this.f9804d = new i(this);
                    }
                } finally {
                }
            }
        }
        return this.f9804d.a();
    }

    public final C1787d b() {
        C1787d c1787d = this.f9807g;
        if (c1787d != null) {
            return c1787d;
        }
        j.i("qsTileRepository");
        throw null;
    }

    public final void c() {
        if (!this.f9806f) {
            this.f9806f = true;
            this.f9807g = (C1787d) ((C0565f) ((InterfaceC1840i) a())).f9444a.f9461P.get();
            this.f9808h = AbstractC0900a.a();
        }
        super.onCreate();
    }

    public final void d(C1784a c1784a) {
        if (this.k && c1784a != null) {
            c1784a.toString();
            Tile qsTile = getQsTile();
            if (qsTile != null) {
                qsTile.setState(c1784a.f16112a);
                qsTile.setLabel(c1784a.f16113b);
                if (Build.VERSION.SDK_INT >= 29) {
                    qsTile.setSubtitle(c1784a.f16114c);
                }
                qsTile.updateTile();
            }
        }
    }

    @Override // android.service.quicksettings.TileService
    public final void onClick() {
        Long l6;
        Boolean bool;
        P p8 = b().f16127h;
        C1784a c1784a = (C1784a) p8.f4088d.f();
        Integer num = null;
        if (c1784a != null) {
            l6 = c1784a.f16115d;
        } else {
            l6 = null;
        }
        C1784a c1784a2 = (C1784a) p8.f4088d.f();
        if (c1784a2 != null) {
            bool = c1784a2.f16116e;
        } else {
            bool = null;
        }
        if (l6 != null && bool != null) {
            C1784a c1784a3 = (C1784a) b().f16127h.f4088d.f();
            if (c1784a3 != null) {
                num = Integer.valueOf(c1784a3.f16112a);
            }
            if (num != null && num.intValue() == 2) {
                a aVar = b().f16126g;
                if (aVar != null) {
                    ((SmartAutoClickerService) aVar.f6634e).f9747g.getClass();
                    k kVar = l.f5788b;
                    if (kVar != null) {
                        kVar.c();
                        return;
                    }
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 1) {
                int i4 = QSTileLauncherActivity.f9796I;
                Intent putExtra = new Intent(this, (Class<?>) QSTileLauncherActivity.class).addFlags(268468224).putExtra("com.buzbuz.smartautoclicker.feature.qstile.ui.EXTRA_SCENARIO_ID", l6.longValue()).putExtra("com.buzbuz.smartautoclicker.feature.qstile.ui.EXTRA_IS_SMART_SCENARIO", bool.booleanValue());
                j.d(putExtra, "putExtra(...)");
                if (Build.VERSION.SDK_INT >= 34) {
                    startActivityAndCollapse(PendingIntent.getActivity(this, 0, putExtra, 67108864));
                } else {
                    startActivityAndCollapse(putExtra);
                }
            }
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        c();
        l0 c6 = AbstractC0166y.c();
        AbstractC0160s abstractC0160s = this.f9808h;
        k0 k0Var = null;
        if (abstractC0160s != null) {
            this.f9809i = AbstractC0166y.b(E2.d.C(c6, abstractC0160s));
            k0 k0Var2 = this.j;
            if (k0Var2 != null) {
                k0Var2.d(null);
            }
            d dVar = this.f9809i;
            if (dVar != null) {
                k0Var = AbstractC0166y.q(dVar, null, null, new C1839h(this, null), 3);
            }
            this.j = k0Var;
            return;
        }
        j.i("mainDispatcher");
        throw null;
    }

    @Override // android.service.quicksettings.TileService, android.app.Service
    public final void onDestroy() {
        k0 k0Var = this.j;
        if (k0Var != null) {
            k0Var.d(null);
        }
        this.j = null;
        d dVar = this.f9809i;
        if (dVar != null) {
            AbstractC0166y.e(dVar);
        }
        super.onDestroy();
    }

    @Override // android.service.quicksettings.TileService
    public final void onStartListening() {
        this.k = true;
        d((C1784a) b().f16127h.f4088d.f());
    }

    @Override // android.service.quicksettings.TileService
    public final void onStopListening() {
        this.k = false;
    }

    @Override // android.service.quicksettings.TileService
    public final void onTileAdded() {
    }

    @Override // android.service.quicksettings.TileService
    public final void onTileRemoved() {
    }
}
