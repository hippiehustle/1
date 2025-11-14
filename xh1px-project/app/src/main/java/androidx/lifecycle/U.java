package androidx.lifecycle;

import L7.AbstractC0166y;
import L7.l0;
import android.os.Bundle;
import b6.C0538f;
import d6.C0623i;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import k0.AbstractC0948c;
import k0.C0946a;
import l0.C0997a;
import n6.InterfaceC1164c;
import t7.C1594d;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final G5.e f8808a = new G5.e(12);

    /* renamed from: b, reason: collision with root package name */
    public static final C1594d f8809b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final G5.e f8810c = new G5.e(13);

    /* renamed from: d, reason: collision with root package name */
    public static final C1594d f8811d = new Object();

    public static final void a(Z z8, A.i iVar, C0512x c0512x) {
        o6.j.e(iVar, "registry");
        o6.j.e(c0512x, "lifecycle");
        S s8 = (S) z8.c("androidx.lifecycle.savedstate.vm.tag");
        if (s8 != null && !s8.f8807f) {
            s8.d(iVar, c0512x);
            EnumC0504o enumC0504o = c0512x.f8862d;
            if (enumC0504o != EnumC0504o.f8847e && enumC0504o.compareTo(EnumC0504o.f8849g) < 0) {
                c0512x.a(new C0496g(iVar, c0512x));
            } else {
                iVar.l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.lifecycle.Q, java.lang.Object] */
    public static Q b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            ?? obj = new Object();
            new LinkedHashMap();
            obj.f8804a = new A4.d(a6.t.f7767d);
            return obj;
        }
        ClassLoader classLoader = Q.class.getClassLoader();
        o6.j.b(classLoader);
        bundle.setClassLoader(classLoader);
        C0538f c0538f = new C0538f(bundle.size());
        for (String str : bundle.keySet()) {
            o6.j.b(str);
            c0538f.put(str, bundle.get(str));
        }
        C0538f c6 = c0538f.c();
        ?? obj2 = new Object();
        new LinkedHashMap();
        obj2.f8804a = new A4.d(c6);
        return obj2;
    }

    public static final Q c(AbstractC0948c abstractC0948c) {
        V v8;
        o6.j.e(abstractC0948c, "<this>");
        B0.f fVar = (B0.f) abstractC0948c.a(f8808a);
        if (fVar != null) {
            f0 f0Var = (f0) abstractC0948c.a(f8809b);
            if (f0Var != null) {
                Bundle bundle = (Bundle) abstractC0948c.a(f8810c);
                String str = (String) abstractC0948c.a(d0.f8836b);
                if (str != null) {
                    B0.d d2 = fVar.b().d();
                    Bundle bundle2 = null;
                    if (d2 instanceof V) {
                        v8 = (V) d2;
                    } else {
                        v8 = null;
                    }
                    if (v8 != null) {
                        LinkedHashMap linkedHashMap = f(f0Var).f8816b;
                        Q q6 = (Q) linkedHashMap.get(str);
                        if (q6 == null) {
                            v8.b();
                            Bundle bundle3 = v8.f8814c;
                            if (bundle3 != null && bundle3.containsKey(str)) {
                                Bundle bundle4 = bundle3.getBundle(str);
                                if (bundle4 == null) {
                                    bundle4 = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                                }
                                bundle3.remove(str);
                                if (bundle3.isEmpty()) {
                                    v8.f8814c = null;
                                }
                                bundle2 = bundle4;
                            }
                            Q b4 = b(bundle2, bundle);
                            linkedHashMap.put(str, b4);
                            return b4;
                        }
                        return q6;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void d(B0.f fVar) {
        EnumC0504o enumC0504o = fVar.g().f8862d;
        if (enumC0504o != EnumC0504o.f8847e && enumC0504o != EnumC0504o.f8848f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.b().d() == null) {
            V v8 = new V(fVar.b(), (f0) fVar);
            fVar.b().k("androidx.lifecycle.internal.SavedStateHandlesProvider", v8);
            fVar.g().a(new C0494e(1, v8));
        }
    }

    public static final C0506q e(InterfaceC0510v interfaceC0510v) {
        o6.j.e(interfaceC0510v, "<this>");
        C0512x g8 = interfaceC0510v.g();
        o6.j.e(g8, "<this>");
        d0 d0Var = g8.f8859a;
        while (true) {
            C0506q c0506q = (C0506q) ((AtomicReference) d0Var.f8837a).get();
            if (c0506q != null) {
                return c0506q;
            }
            l0 c6 = AbstractC0166y.c();
            S7.e eVar = L7.F.f3175a;
            C0506q c0506q2 = new C0506q(g8, E2.d.C(c6, Q7.n.f4962a.f3507h));
            AtomicReference atomicReference = (AtomicReference) d0Var.f8837a;
            while (!atomicReference.compareAndSet(null, c0506q2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            S7.e eVar2 = L7.F.f3175a;
            AbstractC0166y.q(c0506q2, Q7.n.f4962a.f3507h, null, new C0505p(c0506q2, null), 2);
            return c0506q2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.b0, java.lang.Object] */
    public static final W f(f0 f0Var) {
        AbstractC0948c abstractC0948c;
        ?? obj = new Object();
        if (f0Var instanceof InterfaceC0499j) {
            abstractC0948c = ((InterfaceC0499j) f0Var).e();
        } else {
            abstractC0948c = C0946a.f11950b;
        }
        o6.j.e(obj, "factory");
        o6.j.e(abstractC0948c, "extras");
        d0 d0Var = new d0(f0Var.f(), obj, abstractC0948c);
        return (W) ((g0.b0) d0Var.f8837a).l("androidx.lifecycle.internal.SavedStateHandlesVM", o6.v.f13643a.b(W.class));
    }

    public static final C0997a g(Z z8) {
        C0997a c0997a;
        o6.j.e(z8, "<this>");
        synchronized (f8811d) {
            c0997a = (C0997a) z8.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c0997a == null) {
                InterfaceC0622h interfaceC0622h = C0623i.f10448d;
                try {
                    S7.e eVar = L7.F.f3175a;
                    interfaceC0622h = Q7.n.f4962a.f3507h;
                } catch (Z5.i | IllegalStateException unused) {
                }
                C0997a c0997a2 = new C0997a(interfaceC0622h.D(AbstractC0166y.c()));
                z8.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c0997a2);
                c0997a = c0997a2;
            }
        }
        return c0997a;
    }

    public static final Object h(InterfaceC0510v interfaceC0510v, EnumC0504o enumC0504o, InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        Object f8;
        C0512x g8 = interfaceC0510v.g();
        if (enumC0504o != EnumC0504o.f8847e) {
            EnumC0504o enumC0504o2 = g8.f8862d;
            EnumC0504o enumC0504o3 = EnumC0504o.f8846d;
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            Z5.y yVar = Z5.y.f7506a;
            if (enumC0504o2 == enumC0504o3 || (f8 = AbstractC0166y.f(new M(g8, enumC0504o, interfaceC1164c, null), interfaceC0617c)) != enumC0646a) {
                f8 = yVar;
            }
            if (f8 == enumC0646a) {
                return f8;
            }
            return yVar;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }
}
