package V5;

import android.app.Application;
import android.app.Service;
import c1.C0565f;

/* loaded from: classes.dex */
public final class i implements X5.b {

    /* renamed from: d, reason: collision with root package name */
    public final Service f6438d;

    /* renamed from: e, reason: collision with root package name */
    public C0565f f6439e;

    public i(Service service) {
        this.f6438d = service;
    }

    @Override // X5.b
    public final Object a() {
        if (this.f6439e == null) {
            Application application = this.f6438d.getApplication();
            E2.b.h(application instanceof X5.b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            this.f6439e = new C0565f(((c1.h) ((h) D2.f.p(application, h.class))).f9469b);
        }
        return this.f6439e;
    }
}
