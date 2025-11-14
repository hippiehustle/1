package com.buzbuz.smartautoclicker.feature.qstile.ui;

import A4.d;
import L7.AbstractC0166y;
import O4.a;
import W0.c;
import X5.b;
import Z.g;
import Z5.y;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.U;
import androidx.lifecycle.b0;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.feature.qstile.ui.QSTileLauncherActivity;
import e.C0625a;
import e.C0629e;
import e.InterfaceC0626b;
import f.C0649a;
import i.AbstractActivityC0870i;
import kotlin.Metadata;
import n6.InterfaceC1162a;
import o6.j;
import o6.v;
import v4.C1667b;
import y3.C1834c;
import y3.C1838g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/feature/qstile/ui/QSTileLauncherActivity;", "Li/i;", "<init>", "()V", "quick-settings-tile_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class QSTileLauncherActivity extends AbstractActivityC0870i implements b {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f9796I = 0;

    /* renamed from: C, reason: collision with root package name */
    public c f9797C;

    /* renamed from: D, reason: collision with root package name */
    public volatile V5.b f9798D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f9799E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public boolean f9800F = false;

    /* renamed from: G, reason: collision with root package name */
    public final d f9801G;

    /* renamed from: H, reason: collision with root package name */
    public C0629e f9802H;

    public QSTileLauncherActivity() {
        j(new a(this, 6));
        this.f9801G = new d(v.f13643a.b(C1838g.class), new C1834c(this, 1), new C1834c(this, 0), new C1834c(this, 2));
    }

    @Override // X5.b
    public final Object a() {
        return y().a();
    }

    @Override // c.l, androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return E2.d.q(this, super.d());
    }

    @Override // i.AbstractActivityC0870i, c.l, E.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Long l6;
        z(bundle);
        setContentView(R.layout.activity_qstile_launcher);
        Intent intent = getIntent();
        Boolean bool = null;
        if (intent != null) {
            l6 = Long.valueOf(intent.getLongExtra("com.buzbuz.smartautoclicker.feature.qstile.ui.EXTRA_SCENARIO_ID", -1L));
        } else {
            l6 = null;
        }
        Intent intent2 = getIntent();
        if (intent2 != null) {
            bool = Boolean.valueOf(intent2.getBooleanExtra("com.buzbuz.smartautoclicker.feature.qstile.ui.EXTRA_IS_SMART_SCENARIO", false));
        }
        if (l6 != null && l6.longValue() != -1 && bool != null) {
            Log.i("QSTileLauncherActivity", "Start scenario from tile...");
            boolean booleanValue = bool.booleanValue();
            d dVar = this.f9801G;
            if (booleanValue) {
                final long longValue = l6.longValue();
                this.f9802H = (C0629e) m(new C0649a(2), new InterfaceC0626b() { // from class: y3.b
                    @Override // e.InterfaceC0626b
                    public final void h(Object obj) {
                        C0625a c0625a = (C0625a) obj;
                        int i4 = QSTileLauncherActivity.f9796I;
                        int i8 = c0625a.f10556d;
                        QSTileLauncherActivity qSTileLauncherActivity = QSTileLauncherActivity.this;
                        if (i8 != -1) {
                            qSTileLauncherActivity.finish();
                            return;
                        }
                        Log.i("QSTileLauncherActivity", "Media projection us running, start scenario");
                        C1838g c1838g = (C1838g) qSTileLauncherActivity.f9801G.getValue();
                        int i9 = c0625a.f10556d;
                        Intent intent3 = c0625a.f10557e;
                        j.b(intent3);
                        AbstractC0166y.q(U.g(c1838g), c1838g.f16504b, null, new C1837f(c1838g, longValue, i9, intent3, null), 2);
                        qSTileLauncherActivity.finish();
                    }
                });
                int i4 = 0;
                int i8 = 0;
                int i9 = 0;
                ((C1838g) dVar.getValue()).e(this, new C1667b(i8, this, QSTileLauncherActivity.class, "showMediaProjectionWarning", "showMediaProjectionWarning()V", i9, i4, 5), new C1667b(i8, this, QSTileLauncherActivity.class, "finish", "finish()V", i9, i4, 4));
                return;
            }
            final long longValue2 = l6.longValue();
            ((C1838g) dVar.getValue()).e(this, new InterfaceC1162a() { // from class: y3.a
                @Override // n6.InterfaceC1162a
                public final Object a() {
                    int i10 = QSTileLauncherActivity.f9796I;
                    Log.i("QSTileLauncherActivity", "All permissions are granted, start scenario");
                    QSTileLauncherActivity qSTileLauncherActivity = QSTileLauncherActivity.this;
                    C1838g c1838g = (C1838g) qSTileLauncherActivity.f9801G.getValue();
                    AbstractC0166y.q(U.g(c1838g), c1838g.f16504b, null, new C1836e(c1838g, longValue2, null), 2);
                    qSTileLauncherActivity.finish();
                    return y.f7506a;
                }
            }, new C1667b(0, this, QSTileLauncherActivity.class, "finish", "finish()V", 0, 0, 3));
            return;
        }
        Log.e("QSTileLauncherActivity", "Invalid start parameter, finish activity");
        finish();
    }

    @Override // i.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c cVar = this.f9797C;
        if (cVar != null) {
            cVar.f6486e = null;
        }
    }

    public final V5.b y() {
        if (this.f9798D == null) {
            synchronized (this.f9799E) {
                try {
                    if (this.f9798D == null) {
                        this.f9798D = new V5.b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f9798D;
    }

    public final void z(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            c c6 = y().c();
            this.f9797C = c6;
            if (c6.n()) {
                this.f9797C.f6486e = e();
            }
        }
    }
}
