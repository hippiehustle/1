package com.buzbuz.smartautoclicker.feature.smart.config.ui.common.starters;

import A4.d;
import B0.e;
import O4.a;
import W0.c;
import X5.b;
import Z.g;
import a.AbstractC0405a;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.b0;
import com.buzbuz.smartautoclicker.R;
import f.C0649a;
import h4.C0828b;
import h4.C0831e;
import i.AbstractActivityC0870i;
import kotlin.Metadata;
import o6.j;
import o6.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/feature/smart/config/ui/common/starters/RestartMediaProjectionActivity;", "Li/i;", "<init>", "()V", "smart-config_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RestartMediaProjectionActivity extends AbstractActivityC0870i implements b {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f9817I = 0;

    /* renamed from: C, reason: collision with root package name */
    public c f9818C;

    /* renamed from: D, reason: collision with root package name */
    public volatile V5.b f9819D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f9820E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public boolean f9821F = false;

    /* renamed from: G, reason: collision with root package name */
    public final d f9822G;

    /* renamed from: H, reason: collision with root package name */
    public C1.g f9823H;

    public RestartMediaProjectionActivity() {
        j(new a(this, 4));
        this.f9822G = new d(v.f13643a.b(C0831e.class), new C0828b(this, 1), new C0828b(this, 0), new C0828b(this, 2));
    }

    public final void A(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            c c6 = y().c();
            this.f9818C = c6;
            if (c6.n()) {
                this.f9818C.f6486e = e();
            }
        }
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
        A(bundle);
        setContentView(R.layout.activity_transparent);
        AbstractC0405a.A0(m(new C0649a(2), new B1.b(8, this)), this, ((Boolean) ((C0831e) this.f9822G.getValue()).f11369d.f16109g.f4088d.f()).booleanValue(), new e(19, this));
    }

    @Override // i.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c cVar = this.f9818C;
        if (cVar != null) {
            cVar.f6486e = null;
        }
    }

    public final V5.b y() {
        if (this.f9819D == null) {
            synchronized (this.f9820E) {
                try {
                    if (this.f9819D == null) {
                        this.f9819D = new V5.b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f9819D;
    }

    public final void z() {
        C1.g gVar = this.f9823H;
        if (gVar != null) {
            gVar.e(this);
            finish();
        } else {
            j.i("overlayManager");
            throw null;
        }
    }
}
