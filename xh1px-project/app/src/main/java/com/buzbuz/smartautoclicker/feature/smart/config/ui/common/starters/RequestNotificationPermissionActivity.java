package com.buzbuz.smartautoclicker.feature.smart.config.ui.common.starters;

import E2.d;
import J1.e;
import J3.s;
import O4.a;
import W0.c;
import X5.b;
import Z.g;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.b0;
import com.buzbuz.smartautoclicker.R;
import i.AbstractActivityC0870i;
import kotlin.Metadata;
import o6.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/feature/smart/config/ui/common/starters/RequestNotificationPermissionActivity;", "Li/i;", "<init>", "()V", "smart-config_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RequestNotificationPermissionActivity extends AbstractActivityC0870i implements b {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f9810I = 0;

    /* renamed from: C, reason: collision with root package name */
    public c f9811C;

    /* renamed from: D, reason: collision with root package name */
    public volatile V5.b f9812D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f9813E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public boolean f9814F = false;

    /* renamed from: G, reason: collision with root package name */
    public e f9815G;

    /* renamed from: H, reason: collision with root package name */
    public C1.g f9816H;

    public RequestNotificationPermissionActivity() {
        j(new a(this, 3));
    }

    @Override // X5.b
    public final Object a() {
        return y().a();
    }

    @Override // c.l, androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return d.q(this, super.d());
    }

    @Override // i.AbstractActivityC0870i, c.l, E.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        z(bundle);
        setContentView(R.layout.activity_transparent);
        C1.g gVar = this.f9816H;
        if (gVar != null) {
            gVar.b();
            e eVar = this.f9815G;
            if (eVar != null) {
                int i4 = 0;
                int i8 = 0;
                int i9 = 0;
                eVar.b(this, d.y(new L1.e(false)), new s(i4, this, RequestNotificationPermissionActivity.class, "finishActivity", "finishActivity()V", i9, i8, 15), new s(i4, this, RequestNotificationPermissionActivity.class, "finishActivity", "finishActivity()V", i9, i8, 16));
                return;
            }
            j.i("permissionController");
            throw null;
        }
        j.i("overlayManager");
        throw null;
    }

    @Override // i.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c cVar = this.f9811C;
        if (cVar != null) {
            cVar.f6486e = null;
        }
    }

    public final V5.b y() {
        if (this.f9812D == null) {
            synchronized (this.f9813E) {
                try {
                    if (this.f9812D == null) {
                        this.f9812D = new V5.b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f9812D;
    }

    public final void z(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            c c6 = y().c();
            this.f9811C = c6;
            if (c6.n()) {
                this.f9811C.f6486e = e();
            }
        }
    }
}
