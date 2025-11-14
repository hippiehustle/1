package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import h4.AbstractC0832f;
import java.lang.reflect.Constructor;
import k0.AbstractC0948c;
import u6.InterfaceC1642c;

/* loaded from: classes.dex */
public final class X implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f8817a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f8818b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f8819c;

    /* renamed from: d, reason: collision with root package name */
    public final C0512x f8820d;

    /* renamed from: e, reason: collision with root package name */
    public final A.i f8821e;

    public X() {
        this.f8818b = new a0(null);
    }

    @Override // androidx.lifecycle.b0
    public final Z a(Class cls, AbstractC0948c abstractC0948c) {
        Constructor a3;
        o6.j.e(abstractC0948c, "extras");
        String str = (String) abstractC0948c.a(d0.f8836b);
        if (str != null) {
            if (abstractC0948c.a(U.f8808a) != null && abstractC0948c.a(U.f8809b) != null) {
                Application application = (Application) abstractC0948c.a(a0.f8826d);
                boolean isAssignableFrom = AbstractC0490a.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a3 = Y.a(cls, Y.f8822a);
                } else {
                    a3 = Y.a(cls, Y.f8823b);
                }
                if (a3 == null) {
                    return this.f8818b.a(cls, abstractC0948c);
                }
                if (isAssignableFrom && application != null) {
                    return Y.b(cls, a3, application, U.c(abstractC0948c));
                }
                return Y.b(cls, a3, U.c(abstractC0948c));
            }
            if (this.f8820d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.b0
    public final Z b(Class cls) {
        o6.j.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.b0
    public final Z c(InterfaceC1642c interfaceC1642c, AbstractC0948c abstractC0948c) {
        o6.j.e(interfaceC1642c, "modelClass");
        return a(h2.a.k(interfaceC1642c), abstractC0948c);
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [androidx.lifecycle.c0, java.lang.Object] */
    public final Z d(Class cls, String str) {
        Constructor a3;
        Z b4;
        o6.j.e(cls, "modelClass");
        C0512x c0512x = this.f8820d;
        if (c0512x != null) {
            boolean isAssignableFrom = AbstractC0490a.class.isAssignableFrom(cls);
            Application application = this.f8817a;
            if (isAssignableFrom && application != null) {
                a3 = Y.a(cls, Y.f8822a);
            } else {
                a3 = Y.a(cls, Y.f8823b);
            }
            if (a3 == null) {
                if (application != null) {
                    return this.f8818b.b(cls);
                }
                if (c0.f8832a == null) {
                    c0.f8832a = new Object();
                }
                o6.j.b(c0.f8832a);
                return AbstractC0832f.k(cls);
            }
            A.i iVar = this.f8821e;
            o6.j.b(iVar);
            Q b9 = U.b(iVar.b(str), this.f8819c);
            S s8 = new S(str, b9);
            s8.d(iVar, c0512x);
            EnumC0504o enumC0504o = c0512x.f8862d;
            if (enumC0504o != EnumC0504o.f8847e && enumC0504o.compareTo(EnumC0504o.f8849g) < 0) {
                c0512x.a(new C0496g(iVar, c0512x));
            } else {
                iVar.l();
            }
            if (isAssignableFrom && application != null) {
                b4 = Y.b(cls, a3, application, b9);
            } else {
                b4 = Y.b(cls, a3, b9);
            }
            b4.a("androidx.lifecycle.savedstate.vm.tag", s8);
            return b4;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public X(Application application, B0.f fVar, Bundle bundle) {
        a0 a0Var;
        this.f8821e = fVar.b();
        this.f8820d = fVar.g();
        this.f8819c = bundle;
        this.f8817a = application;
        if (application != null) {
            if (a0.f8825c == null) {
                a0.f8825c = new a0(application);
            }
            a0Var = a0.f8825c;
            o6.j.b(a0Var);
        } else {
            a0Var = new a0(null);
        }
        this.f8818b = a0Var;
    }
}
