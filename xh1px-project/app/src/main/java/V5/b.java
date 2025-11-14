package V5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.InterfaceC0499j;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import c.l;
import c1.C0560a;
import c1.C0562c;
import k0.AbstractC0948c;
import k0.C0946a;

/* loaded from: classes.dex */
public final class b implements X5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6427d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6428e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final Activity f6429f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6430g;

    /* renamed from: h, reason: collision with root package name */
    public volatile X5.a f6431h;

    public b(Activity activity) {
        this.f6429f = activity;
        this.f6430g = new b((l) activity);
    }

    public static d0 d(f0 f0Var, Context context) {
        AbstractC0948c abstractC0948c;
        U5.d dVar = new U5.d(1, context);
        o6.j.e(f0Var, "owner");
        e0 f8 = f0Var.f();
        if (f0Var instanceof InterfaceC0499j) {
            abstractC0948c = ((InterfaceC0499j) f0Var).e();
        } else {
            abstractC0948c = C0946a.f11950b;
        }
        return new d0(f8, dVar, abstractC0948c);
    }

    @Override // X5.b
    public final Object a() {
        switch (this.f6427d) {
            case 0:
                if (((C0560a) this.f6431h) == null) {
                    synchronized (this.f6428e) {
                        try {
                            if (((C0560a) this.f6431h) == null) {
                                this.f6431h = b();
                            }
                        } finally {
                        }
                    }
                }
                return (C0560a) this.f6431h;
            default:
                if (((C0562c) this.f6431h) == null) {
                    synchronized (this.f6428e) {
                        try {
                            if (((C0562c) this.f6431h) == null) {
                                this.f6431h = ((d) d((l) this.f6429f, (l) this.f6430g).a(h2.a.n(d.class))).f6432b;
                            }
                        } finally {
                        }
                    }
                }
                return (C0562c) this.f6431h;
        }
    }

    public C0560a b() {
        String str;
        Activity activity = this.f6429f;
        if (!(activity.getApplication() instanceof X5.b)) {
            StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
            if (Application.class.equals(activity.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                str = "Found: " + activity.getApplication().getClass();
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        C0562c c0562c = (C0562c) ((a) D2.f.p((b) this.f6430g, a.class));
        return new C0560a(c0562c.f9437a, c0562c.f9438b);
    }

    public W0.c c() {
        b bVar = (b) this.f6430g;
        return ((d) d((l) bVar.f6429f, (l) bVar.f6430g).a(h2.a.n(d.class))).f6433c;
    }

    public b(l lVar) {
        this.f6429f = lVar;
        this.f6430g = lVar;
    }
}
