package n0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.InterfaceC0499j;
import androidx.lifecycle.InterfaceC0510v;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import k0.AbstractC0948c;
import k0.C0949d;

/* renamed from: n0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1131i implements InterfaceC0510v, f0, InterfaceC0499j, B0.f {

    /* renamed from: d, reason: collision with root package name */
    public final c0.o f12758d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1143u f12759e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f12760f;

    /* renamed from: g, reason: collision with root package name */
    public EnumC0504o f12761g;

    /* renamed from: h, reason: collision with root package name */
    public final C1135m f12762h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12763i;
    public final Bundle j;
    public final G5.n k = new G5.n(this);

    public C1131i(c0.o oVar, AbstractC1143u abstractC1143u, Bundle bundle, EnumC0504o enumC0504o, C1135m c1135m, String str, Bundle bundle2) {
        this.f12758d = oVar;
        this.f12759e = abstractC1143u;
        this.f12760f = bundle;
        this.f12761g = enumC0504o;
        this.f12762h = c1135m;
        this.f12763i = str;
        this.j = bundle2;
    }

    public final void a(EnumC0504o enumC0504o) {
        G5.n nVar = this.k;
        nVar.getClass();
        nVar.f1814l = enumC0504o;
        nVar.d();
    }

    @Override // B0.f
    public final A.i b() {
        return (A.i) ((A.i) this.k.j).f89f;
    }

    @Override // androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return (X) this.k.f1815m;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    @Override // androidx.lifecycle.InterfaceC0499j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0948c e() {
        Application application;
        G5.n nVar = this.k;
        nVar.getClass();
        C0949d c0949d = new C0949d(0);
        G5.e eVar = U.f8808a;
        C1131i c1131i = (C1131i) nVar.f1807c;
        LinkedHashMap linkedHashMap = c0949d.f11951a;
        linkedHashMap.put(eVar, c1131i);
        linkedHashMap.put(U.f8809b, c1131i);
        Bundle b4 = nVar.b();
        if (b4 != null) {
            linkedHashMap.put(U.f8810c, b4);
        }
        Application application2 = null;
        c0.o oVar = this.f12758d;
        if (oVar != null) {
            Context applicationContext = oVar.f9402a.getApplicationContext();
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                if (application != null) {
                    application2 = application;
                }
                if (application2 != null) {
                    linkedHashMap.put(a0.f8826d, application2);
                }
                return c0949d;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return c0949d;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj != null && (obj instanceof C1131i)) {
            C1131i c1131i = (C1131i) obj;
            Bundle bundle = c1131i.f12760f;
            if (o6.j.a(this.f12763i, c1131i.f12763i) && o6.j.a(this.f12759e, c1131i.f12759e) && o6.j.a((C0512x) this.k.k, (C0512x) c1131i.k.k) && o6.j.a(b(), c1131i.b())) {
                Bundle bundle2 = this.f12760f;
                if (!o6.j.a(bundle2, bundle)) {
                    if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                        if (!keySet.isEmpty()) {
                            for (String str : keySet) {
                                Object obj3 = bundle2.get(str);
                                if (bundle != null) {
                                    obj2 = bundle.get(str);
                                } else {
                                    obj2 = null;
                                }
                                if (!o6.j.a(obj3, obj2)) {
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.f0
    public final e0 f() {
        G5.n nVar = this.k;
        if (nVar.f1806b) {
            if (((C0512x) nVar.k).f8862d != EnumC0504o.f8846d) {
                C1135m c1135m = (C1135m) nVar.f1811g;
                if (c1135m != null) {
                    String str = (String) nVar.f1812h;
                    o6.j.e(str, "backStackEntryId");
                    LinkedHashMap linkedHashMap = c1135m.f12775b;
                    e0 e0Var = (e0) linkedHashMap.get(str);
                    if (e0Var == null) {
                        e0 e0Var2 = new e0();
                        linkedHashMap.put(str, e0Var2);
                        return e0Var2;
                    }
                    return e0Var;
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
    }

    @Override // androidx.lifecycle.InterfaceC0510v
    public final C0512x g() {
        return (C0512x) this.k.k;
    }

    public final int hashCode() {
        Set<String> keySet;
        int i4;
        int hashCode = this.f12759e.hashCode() + (this.f12763i.hashCode() * 31);
        Bundle bundle = this.f12760f;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i8 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                if (obj != null) {
                    i4 = obj.hashCode();
                } else {
                    i4 = 0;
                }
                hashCode = i8 + i4;
            }
        }
        return b().hashCode() + ((((C0512x) this.k.k).hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.k.toString();
    }
}
