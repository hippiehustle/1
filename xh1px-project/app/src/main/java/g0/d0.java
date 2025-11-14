package g0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0503n;
import androidx.lifecycle.InterfaceC0499j;
import java.util.LinkedHashMap;
import k0.AbstractC0948c;
import k0.C0949d;

/* loaded from: classes.dex */
public final class d0 implements InterfaceC0499j, B0.f, androidx.lifecycle.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractComponentCallbacksC0755y f11005d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.e0 f11006e;

    /* renamed from: f, reason: collision with root package name */
    public final E.a f11007f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.b0 f11008g;

    /* renamed from: h, reason: collision with root package name */
    public C0512x f11009h = null;

    /* renamed from: i, reason: collision with root package name */
    public A.i f11010i = null;

    public d0(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, androidx.lifecycle.e0 e0Var, E.a aVar) {
        this.f11005d = abstractComponentCallbacksC0755y;
        this.f11006e = e0Var;
        this.f11007f = aVar;
    }

    public final void a(EnumC0503n enumC0503n) {
        this.f11009h.d(enumC0503n);
    }

    @Override // B0.f
    public final A.i b() {
        c();
        return (A.i) this.f11010i.f89f;
    }

    public final void c() {
        if (this.f11009h == null) {
            this.f11009h = new C0512x(this);
            A.i iVar = new A.i(new C0.b(this, new B0.e(0, this)));
            this.f11010i = iVar;
            iVar.h();
            this.f11007f.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0499j
    public final androidx.lifecycle.b0 d() {
        Application application;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f11005d;
        androidx.lifecycle.b0 d2 = abstractComponentCallbacksC0755y.d();
        if (!d2.equals(abstractComponentCallbacksC0755y.f11106W)) {
            this.f11008g = d2;
            return d2;
        }
        if (this.f11008g == null) {
            Context applicationContext = abstractComponentCallbacksC0755y.O().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.f11008g = new androidx.lifecycle.X(application, abstractComponentCallbacksC0755y, abstractComponentCallbacksC0755y.f11115i);
        }
        return this.f11008g;
    }

    @Override // androidx.lifecycle.InterfaceC0499j
    public final AbstractC0948c e() {
        Application application;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f11005d;
        Context applicationContext = abstractComponentCallbacksC0755y.O().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        C0949d c0949d = new C0949d(0);
        LinkedHashMap linkedHashMap = c0949d.f11951a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.a0.f8826d, application);
        }
        linkedHashMap.put(androidx.lifecycle.U.f8808a, abstractComponentCallbacksC0755y);
        linkedHashMap.put(androidx.lifecycle.U.f8809b, this);
        Bundle bundle = abstractComponentCallbacksC0755y.f11115i;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.U.f8810c, bundle);
        }
        return c0949d;
    }

    @Override // androidx.lifecycle.f0
    public final androidx.lifecycle.e0 f() {
        c();
        return this.f11006e;
    }

    @Override // androidx.lifecycle.InterfaceC0510v
    public final C0512x g() {
        c();
        return this.f11009h;
    }
}
