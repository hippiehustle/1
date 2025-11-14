package com.buzbuz.smartautoclicker.settings;

import E2.d;
import O4.a;
import W0.c;
import X5.b;
import Z.g;
import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.b0;
import c.n;
import com.buzbuz.smartautoclicker.R;
import i.AbstractActivityC0870i;
import i.AbstractC0862a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/settings/SettingsActivity;", "Li/i;", "<init>", "()V", "smartautoclicker_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsActivity extends AbstractActivityC0870i implements b {

    /* renamed from: C, reason: collision with root package name */
    public c f9868C;

    /* renamed from: D, reason: collision with root package name */
    public volatile V5.b f9869D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f9870E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public boolean f9871F = false;

    public SettingsActivity() {
        j(new a(this, 2));
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
        n.a(this);
        z(bundle);
        setContentView(R.layout.activity_settings);
        x((Toolbar) findViewById(R.id.topAppBar));
        AbstractC0862a o7 = o();
        if (o7 != null) {
            o7.t(true);
            o7.u();
        }
    }

    @Override // i.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c cVar = this.f9868C;
        if (cVar != null) {
            cVar.f6486e = null;
        }
    }

    @Override // i.AbstractActivityC0870i
    public final boolean w() {
        finish();
        return true;
    }

    public final V5.b y() {
        if (this.f9869D == null) {
            synchronized (this.f9870E) {
                try {
                    if (this.f9869D == null) {
                        this.f9869D = new V5.b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f9869D;
    }

    public final void z(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            c c6 = y().c();
            this.f9868C = c6;
            if (c6.n()) {
                this.f9868C.f6486e = e();
            }
        }
    }
}
