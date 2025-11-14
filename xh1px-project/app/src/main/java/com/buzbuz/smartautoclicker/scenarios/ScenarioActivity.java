package com.buzbuz.smartautoclicker.scenarios;

import A4.d;
import O4.a;
import T4.k;
import W0.c;
import W4.h;
import X5.b;
import Z.g;
import Z4.i;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.b0;
import c.n;
import c5.C0581a;
import com.buzbuz.smartautoclicker.R;
import e.C0629e;
import f.C0649a;
import i.AbstractActivityC0870i;
import kotlin.Metadata;
import o6.j;
import o6.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/buzbuz/smartautoclicker/scenarios/ScenarioActivity;", "Li/i;", "LW4/h;", "<init>", "()V", "smartautoclicker_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScenarioActivity extends AbstractActivityC0870i implements h, b {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f9852J = 0;

    /* renamed from: C, reason: collision with root package name */
    public c f9853C;

    /* renamed from: D, reason: collision with root package name */
    public volatile V5.b f9854D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f9855E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public boolean f9856F = false;

    /* renamed from: G, reason: collision with root package name */
    public final d f9857G;

    /* renamed from: H, reason: collision with root package name */
    public C0629e f9858H;

    /* renamed from: I, reason: collision with root package name */
    public i f9859I;

    public ScenarioActivity() {
        j(new a(this, 1));
        this.f9857G = new d(v.f13643a.b(C0581a.class), new U4.b(this, 1), new U4.b(this, 0), new U4.b(this, 2));
    }

    public final void A(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            c c6 = y().c();
            this.f9853C = c6;
            if (c6.n()) {
                this.f9853C.f6486e = e();
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
        n.a(this);
        A(bundle);
        setContentView(R.layout.activity_scenario);
        k kVar = z().f9672g;
        if (kVar != null) {
            kVar.c();
        }
        z().f9667b.getClass();
        this.f9858H = (C0629e) m(new C0649a(2), new B1.b(6, this));
        View findViewById = findViewById(android.R.id.content);
        j.d(findViewById, "findViewById(...)");
        findViewById.getViewTreeObserver().addOnPreDrawListener(new k1.b(new U4.a(this, 1), System.currentTimeMillis() + 3000, findViewById));
    }

    @Override // i.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c cVar = this.f9853C;
        if (cVar != null) {
            cVar.f6486e = null;
        }
    }

    @Override // i.AbstractActivityC0870i, android.app.Activity
    public final void onResume() {
        super.onResume();
        z().f9667b.getClass();
    }

    public final V5.b y() {
        if (this.f9854D == null) {
            synchronized (this.f9855E) {
                try {
                    if (this.f9854D == null) {
                        this.f9854D = new V5.b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f9854D;
    }

    public final C0581a z() {
        return (C0581a) this.f9857G.getValue();
    }
}
