package com.buzbuz.smartautoclicker.feature.tutorial.ui;

import A4.d;
import H7.m;
import H7.o;
import L4.i;
import L7.AbstractC0166y;
import O4.a;
import O4.f;
import O4.l;
import W0.c;
import X5.b;
import Z.g;
import a6.AbstractC0434i;
import a6.AbstractC0437l;
import a6.q;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.U;
import androidx.lifecycle.b0;
import androidx.navigation.fragment.NavHostFragment;
import c.n;
import c2.z;
import com.buzbuz.smartautoclicker.R;
import g0.AbstractComponentCallbacksC0755y;
import i.AbstractActivityC0870i;
import i.AbstractC0862a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import l1.C0999a;
import n0.AbstractC1143u;
import n0.C1141s;
import n0.C1142t;
import n0.C1144v;
import n0.C1146x;
import o.C1207p;
import o6.j;
import o6.v;
import q0.C1350f;
import q4.X;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/feature/tutorial/ui/TutorialActivity;", "Li/i;", "<init>", "()V", "tutorial_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TutorialActivity extends AbstractActivityC0870i implements b {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f9824J = 0;

    /* renamed from: C, reason: collision with root package name */
    public c f9825C;

    /* renamed from: D, reason: collision with root package name */
    public volatile V5.b f9826D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f9827E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public boolean f9828F = false;

    /* renamed from: G, reason: collision with root package name */
    public final d f9829G;

    /* renamed from: H, reason: collision with root package name */
    public C1146x f9830H;

    /* renamed from: I, reason: collision with root package name */
    public C1.g f9831I;

    public TutorialActivity() {
        j(new a(this, 0));
        this.f9829G = new d(v.f13643a.b(l.class), new O4.g(this, 1), new O4.g(this, 0), new O4.g(this, 2));
    }

    public final void A(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            c c6 = y().c();
            this.f9825C = c6;
            if (c6.n()) {
                this.f9825C.f6486e = e();
            }
        }
    }

    public final void B() {
        super.onDestroy();
        c cVar = this.f9825C;
        if (cVar != null) {
            cVar.f6486e = null;
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
        n.a(this);
        setContentView(R.layout.activity_tutorial);
        getWindow().addFlags(128);
        x((Toolbar) findViewById(R.id.topAppBar));
        AbstractC0862a o7 = o();
        if (o7 != null) {
            o7.t(true);
        }
        AbstractComponentCallbacksC0755y D7 = p().D(R.id.nav_host_fragment);
        j.c(D7, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.f9830H = ((NavHostFragment) D7).S();
        AbstractC0166y.q(U.e(this), null, null, new f(this, null), 3);
        L4.j jVar = z().f4031b;
        if (jVar.f2925h != null) {
            return;
        }
        C0999a c0999a = (C0999a) jVar.f2919b.f15508h.f();
        jVar.f2925h = c0999a;
        Objects.toString(c0999a);
        z zVar = jVar.f2918a.f9111a;
        zVar.f9602c.g(zVar.f9601b);
    }

    @Override // i.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        L4.j jVar = z().f4031b;
        C0999a c0999a = jVar.f2925h;
        if (c0999a != null) {
            Objects.toString(c0999a);
            jVar.b();
            AbstractC0166y.q(jVar.f2923f, null, null, new i(jVar, null), 3);
        }
        B();
        C1.g gVar = this.f9831I;
        if (gVar != null) {
            gVar.g();
        } else {
            j.i("overlayManager");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e0, code lost:
    
        if (r2.b() != false) goto L86;
     */
    @Override // i.AbstractActivityC0870i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w() {
        Bundle bundle;
        int[] iArr;
        Bundle bundle2;
        Bundle g8;
        Bundle bundle3;
        Intent intent;
        C1146x c1146x = this.f9830H;
        if (c1146x != null) {
            C1350f c1350f = c1146x.f12819b;
            Activity activity = c1146x.f12821d;
            int i4 = 0;
            if (c1146x.a() == 1) {
                if (activity != null && (intent = activity.getIntent()) != null) {
                    bundle = intent.getExtras();
                } else {
                    bundle = null;
                }
                if (bundle != null) {
                    iArr = bundle.getIntArray("android-support-nav:controller:deepLinkIds");
                } else {
                    iArr = null;
                }
                if (iArr != null) {
                    if (c1146x.f12822e) {
                        j.b(activity);
                        Intent intent2 = activity.getIntent();
                        Bundle extras = intent2.getExtras();
                        j.b(extras);
                        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                        j.b(intArray);
                        ArrayList k12 = AbstractC0434i.k1(intArray);
                        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                        if (k12.size() >= 2) {
                            int intValue = ((Number) q.h0(k12)).intValue();
                            if (parcelableArrayList != null) {
                            }
                            AbstractC1143u d2 = C1350f.d(intValue, c1350f.g(), null, false);
                            if (d2 instanceof C1144v) {
                                int i8 = C1144v.k;
                                C1144v c1144v = (C1144v) d2;
                                j.e(c1144v, "<this>");
                                intValue = ((AbstractC1143u) m.V(m.T(c1144v, new o(27)))).f12813e.f13342a;
                            }
                            AbstractC1143u f8 = c1350f.f();
                            if (f8 != null && intValue == f8.f12813e.f13342a) {
                                d dVar = new d(c1146x);
                                Bundle k = X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                                k.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                                Bundle bundle4 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                                if (bundle4 != null) {
                                    k.putAll(bundle4);
                                }
                                ((Intent) dVar.f297g).putExtra("android-support-nav:controller:deepLinkExtras", k);
                                Iterator it = k12.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    int i9 = i4 + 1;
                                    if (i4 >= 0) {
                                        int intValue2 = ((Number) next).intValue();
                                        if (parcelableArrayList != null) {
                                            bundle3 = (Bundle) parcelableArrayList.get(i4);
                                        } else {
                                            bundle3 = null;
                                        }
                                        ((ArrayList) dVar.f299i).add(new C1141s(intValue2, bundle3));
                                        if (((C1144v) dVar.f298h) != null) {
                                            dVar.e();
                                        }
                                        i4 = i9;
                                    } else {
                                        AbstractC0437l.c0();
                                        throw null;
                                    }
                                }
                                dVar.b().h();
                                activity.finish();
                                return true;
                            }
                        }
                    }
                } else {
                    AbstractC1143u f9 = c1350f.f();
                    j.b(f9);
                    int i10 = f9.f12813e.f13342a;
                    for (C1144v c1144v2 = f9.f12814f; c1144v2 != null; c1144v2 = c1144v2.f12814f) {
                        C1207p c1207p = c1144v2.f12813e;
                        if (c1144v2.j.f4113a != i10) {
                            Bundle k6 = X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                            if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                                Intent intent3 = activity.getIntent();
                                j.d(intent3, "getIntent(...)");
                                k6.putParcelable("android-support-nav:controller:deepLinkIntent", intent3);
                                C1144v i11 = c1350f.i();
                                Intent intent4 = activity.getIntent();
                                j.d(intent4, "getIntent(...)");
                                C1142t o7 = i11.o(new R.g(intent4.getData(), intent4.getAction(), intent4.getType(), 15), i11);
                                if (o7 != null) {
                                    bundle2 = o7.f12806e;
                                } else {
                                    bundle2 = null;
                                }
                                if (bundle2 != null && (g8 = o7.f12805d.g(o7.f12806e)) != null) {
                                    k6.putAll(g8);
                                }
                            }
                            d dVar2 = new d(c1146x);
                            int i12 = c1207p.f13342a;
                            ArrayList arrayList = (ArrayList) dVar2.f299i;
                            arrayList.clear();
                            arrayList.add(new C1141s(i12, null));
                            if (((C1144v) dVar2.f298h) != null) {
                                dVar2.e();
                            }
                            ((Intent) dVar2.f297g).putExtra("android-support-nav:controller:deepLinkExtras", k6);
                            dVar2.b().h();
                            if (activity != null) {
                                activity.finish();
                                return true;
                            }
                            return true;
                        }
                        i10 = c1207p.f13342a;
                    }
                }
                finish();
                return true;
            }
            if (!c1350f.f13888f.isEmpty()) {
                AbstractC1143u f10 = c1350f.f();
                j.b(f10);
                if (c1350f.l(f10.f12813e.f13342a, true, false)) {
                }
            }
            finish();
            return true;
        }
        j.i("navController");
        throw null;
    }

    public final V5.b y() {
        if (this.f9826D == null) {
            synchronized (this.f9827E) {
                try {
                    if (this.f9826D == null) {
                        this.f9826D = new V5.b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f9826D;
    }

    public final l z() {
        return (l) this.f9829G.getValue();
    }
}
