package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import k0.AbstractC0948c;
import t7.C1594d;
import u6.InterfaceC1642c;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C1594d f8836b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f8837a;

    public d0() {
        this.f8837a = new AtomicReference(null);
    }

    public Z a(InterfaceC1642c interfaceC1642c) {
        o6.j.e(interfaceC1642c, "modelClass");
        g0.b0 b0Var = (g0.b0) this.f8837a;
        String a3 = interfaceC1642c.a();
        if (a3 != null) {
            return b0Var.l("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a3), interfaceC1642c);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public d0(e0 e0Var, b0 b0Var, AbstractC0948c abstractC0948c) {
        o6.j.e(e0Var, "store");
        o6.j.e(b0Var, "factory");
        o6.j.e(abstractC0948c, "defaultCreationExtras");
        this.f8837a = new g0.b0(e0Var, b0Var, abstractC0948c);
    }

    public d0(H h8) {
        this.f8837a = h8;
    }
}
