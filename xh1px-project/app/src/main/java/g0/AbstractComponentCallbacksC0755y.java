package g0;

import a.AbstractC0405a;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.InterfaceC0499j;
import androidx.lifecycle.InterfaceC0510v;
import com.buzbuz.smartautoclicker.R;
import e.AbstractC0627c;
import e.InterfaceC0626b;
import i.AbstractActivityC0870i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k0.AbstractC0948c;
import k0.C0949d;
import u6.AbstractC1638C;

/* renamed from: g0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0755y implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0510v, androidx.lifecycle.f0, InterfaceC0499j, B0.f {

    /* renamed from: b0, reason: collision with root package name */
    public static final Object f11084b0 = new Object();

    /* renamed from: A, reason: collision with root package name */
    public AbstractComponentCallbacksC0755y f11085A;

    /* renamed from: B, reason: collision with root package name */
    public int f11086B;

    /* renamed from: C, reason: collision with root package name */
    public int f11087C;

    /* renamed from: D, reason: collision with root package name */
    public String f11088D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f11089E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f11090F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f11091G;

    /* renamed from: I, reason: collision with root package name */
    public boolean f11093I;

    /* renamed from: J, reason: collision with root package name */
    public ViewGroup f11094J;
    public View K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f11095L;

    /* renamed from: N, reason: collision with root package name */
    public C0753w f11097N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f11098O;

    /* renamed from: P, reason: collision with root package name */
    public LayoutInflater f11099P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f11100Q;

    /* renamed from: R, reason: collision with root package name */
    public String f11101R;

    /* renamed from: S, reason: collision with root package name */
    public EnumC0504o f11102S;

    /* renamed from: T, reason: collision with root package name */
    public C0512x f11103T;

    /* renamed from: U, reason: collision with root package name */
    public d0 f11104U;

    /* renamed from: V, reason: collision with root package name */
    public final androidx.lifecycle.C f11105V;

    /* renamed from: W, reason: collision with root package name */
    public androidx.lifecycle.X f11106W;

    /* renamed from: X, reason: collision with root package name */
    public A.i f11107X;
    public final AtomicInteger Y;

    /* renamed from: Z, reason: collision with root package name */
    public final ArrayList f11108Z;

    /* renamed from: a0, reason: collision with root package name */
    public final C0750t f11109a0;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f11111e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f11112f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f11113g;

    /* renamed from: i, reason: collision with root package name */
    public Bundle f11115i;
    public AbstractComponentCallbacksC0755y j;

    /* renamed from: l, reason: collision with root package name */
    public int f11116l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11118n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11119o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11120p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11121q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11122r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11123s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11124t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11125u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11126v;

    /* renamed from: w, reason: collision with root package name */
    public int f11127w;

    /* renamed from: x, reason: collision with root package name */
    public T f11128x;

    /* renamed from: y, reason: collision with root package name */
    public C0731A f11129y;

    /* renamed from: d, reason: collision with root package name */
    public int f11110d = -1;

    /* renamed from: h, reason: collision with root package name */
    public String f11114h = UUID.randomUUID().toString();
    public String k = null;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f11117m = null;

    /* renamed from: z, reason: collision with root package name */
    public T f11130z = new T();

    /* renamed from: H, reason: collision with root package name */
    public final boolean f11092H = true;

    /* renamed from: M, reason: collision with root package name */
    public boolean f11096M = true;

    public AbstractComponentCallbacksC0755y() {
        new L5.x(5, this);
        this.f11102S = EnumC0504o.f8850h;
        this.f11105V = new androidx.lifecycle.C();
        this.Y = new AtomicInteger();
        this.f11108Z = new ArrayList();
        this.f11109a0 = new C0750t(this);
        p();
    }

    public void A() {
        this.f11093I = true;
    }

    public LayoutInflater B(Bundle bundle) {
        C0731A c0731a = this.f11129y;
        if (c0731a != null) {
            AbstractActivityC0870i abstractActivityC0870i = c0731a.f10846m;
            LayoutInflater cloneInContext = abstractActivityC0870i.getLayoutInflater().cloneInContext(abstractActivityC0870i);
            cloneInContext.setFactory2(this.f11130z.f10905f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void C(Context context, AttributeSet attributeSet, Bundle bundle) {
        AbstractActivityC0870i abstractActivityC0870i;
        this.f11093I = true;
        C0731A c0731a = this.f11129y;
        if (c0731a == null) {
            abstractActivityC0870i = null;
        } else {
            abstractActivityC0870i = c0731a.f10844i;
        }
        if (abstractActivityC0870i != null) {
            this.f11093I = true;
        }
    }

    public void D() {
        this.f11093I = true;
    }

    public void F() {
        this.f11093I = true;
    }

    public void G() {
        this.f11093I = true;
    }

    public void I(Bundle bundle) {
        this.f11093I = true;
    }

    public void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f11130z.R();
        this.f11126v = true;
        this.f11104U = new d0(this, f(), new E.a(13, this));
        View x8 = x(layoutInflater, viewGroup);
        this.K = x8;
        if (x8 != null) {
            this.f11104U.c();
            if (T.K(3)) {
                Objects.toString(this.K);
                toString();
            }
            View view = this.K;
            d0 d0Var = this.f11104U;
            o6.j.e(view, "<this>");
            view.setTag(R.id.view_tree_lifecycle_owner, d0Var);
            View view2 = this.K;
            d0 d0Var2 = this.f11104U;
            o6.j.e(view2, "<this>");
            view2.setTag(R.id.view_tree_view_model_store_owner, d0Var2);
            View view3 = this.K;
            d0 d0Var3 = this.f11104U;
            o6.j.e(view3, "<this>");
            view3.setTag(R.id.view_tree_saved_state_registry_owner, d0Var3);
            androidx.lifecycle.C c6 = this.f11105V;
            d0 d0Var4 = this.f11104U;
            c6.getClass();
            androidx.lifecycle.C.a("setValue");
            c6.f8773g++;
            c6.f8771e = d0Var4;
            c6.c(null);
            return;
        }
        if (this.f11104U.f11009h == null) {
            this.f11104U = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final AbstractC0627c K(AbstractC0405a abstractC0405a, InterfaceC0626b interfaceC0626b) {
        W5.a aVar = new W5.a(12, this);
        if (this.f11110d <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            L(new C0752v(this, aVar, atomicReference, abstractC0405a, interfaceC0626b));
            return new C0749s(atomicReference);
        }
        throw new IllegalStateException(A.j.n("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    public final void L(AbstractC0754x abstractC0754x) {
        if (this.f11110d >= 0) {
            abstractC0754x.a();
        } else {
            this.f11108Z.add(abstractC0754x);
        }
    }

    public final AbstractActivityC0870i M() {
        AbstractActivityC0870i abstractActivityC0870i;
        C0731A c0731a = this.f11129y;
        if (c0731a == null) {
            abstractActivityC0870i = null;
        } else {
            abstractActivityC0870i = c0731a.f10844i;
        }
        if (abstractActivityC0870i != null) {
            return abstractActivityC0870i;
        }
        throw new IllegalStateException(A.j.n("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle N() {
        Bundle bundle = this.f11115i;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(A.j.n("Fragment ", this, " does not have any arguments."));
    }

    public final Context O() {
        Context j = j();
        if (j != null) {
            return j;
        }
        throw new IllegalStateException(A.j.n("Fragment ", this, " not attached to a context."));
    }

    public final View P() {
        View view = this.K;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(A.j.n("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void Q(int i4, int i8, int i9, int i10) {
        if (this.f11097N == null && i4 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return;
        }
        h().f11076b = i4;
        h().f11077c = i8;
        h().f11078d = i9;
        h().f11079e = i10;
    }

    public final void R(Bundle bundle) {
        boolean P4;
        T t8 = this.f11128x;
        if (t8 != null) {
            if (t8 == null) {
                P4 = false;
            } else {
                P4 = t8.P();
            }
            if (P4) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f11115i = bundle;
    }

    @Override // B0.f
    public final A.i b() {
        return (A.i) this.f11107X.f89f;
    }

    public AbstractC1638C c() {
        return new C0751u(this);
    }

    public androidx.lifecycle.b0 d() {
        Application application;
        if (this.f11128x != null) {
            if (this.f11106W == null) {
                Context applicationContext = O().getApplicationContext();
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
                if (application == null && T.K(3)) {
                    Objects.toString(O().getApplicationContext());
                }
                this.f11106W = new androidx.lifecycle.X(application, this, this.f11115i);
            }
            return this.f11106W;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.InterfaceC0499j
    public final AbstractC0948c e() {
        Application application;
        Context applicationContext = O().getApplicationContext();
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
        if (application == null && T.K(3)) {
            Objects.toString(O().getApplicationContext());
        }
        C0949d c0949d = new C0949d(0);
        LinkedHashMap linkedHashMap = c0949d.f11951a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.a0.f8826d, application);
        }
        linkedHashMap.put(androidx.lifecycle.U.f8808a, this);
        linkedHashMap.put(androidx.lifecycle.U.f8809b, this);
        Bundle bundle = this.f11115i;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.U.f8810c, bundle);
        }
        return c0949d;
    }

    @Override // androidx.lifecycle.f0
    public final androidx.lifecycle.e0 f() {
        if (this.f11128x != null) {
            if (l() != 1) {
                HashMap hashMap = this.f11128x.f10898P.f10934d;
                androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) hashMap.get(this.f11114h);
                if (e0Var == null) {
                    androidx.lifecycle.e0 e0Var2 = new androidx.lifecycle.e0();
                    hashMap.put(this.f11114h, e0Var2);
                    return e0Var2;
                }
                return e0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.InterfaceC0510v
    public final C0512x g() {
        return this.f11103T;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, g0.w] */
    public final C0753w h() {
        if (this.f11097N == null) {
            ?? obj = new Object();
            Object obj2 = f11084b0;
            obj.f11081g = obj2;
            obj.f11082h = obj2;
            obj.f11083i = obj2;
            obj.j = 1.0f;
            obj.k = null;
            this.f11097N = obj;
        }
        return this.f11097N;
    }

    public final T i() {
        if (this.f11129y != null) {
            return this.f11130z;
        }
        throw new IllegalStateException(A.j.n("Fragment ", this, " has not been attached yet."));
    }

    public Context j() {
        C0731A c0731a = this.f11129y;
        if (c0731a == null) {
            return null;
        }
        return c0731a.j;
    }

    public final LayoutInflater k() {
        LayoutInflater layoutInflater = this.f11099P;
        if (layoutInflater == null) {
            LayoutInflater B8 = B(null);
            this.f11099P = B8;
            return B8;
        }
        return layoutInflater;
    }

    public final int l() {
        EnumC0504o enumC0504o = this.f11102S;
        if (enumC0504o != EnumC0504o.f8847e && this.f11085A != null) {
            return Math.min(enumC0504o.ordinal(), this.f11085A.l());
        }
        return enumC0504o.ordinal();
    }

    public final T m() {
        T t8 = this.f11128x;
        if (t8 != null) {
            return t8;
        }
        throw new IllegalStateException(A.j.n("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources n() {
        return O().getResources();
    }

    public final d0 o() {
        d0 d0Var = this.f11104U;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException(A.j.n("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f11093I = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        M().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f11093I = true;
    }

    public final void p() {
        this.f11103T = new C0512x(this);
        this.f11107X = new A.i(new C0.b(this, new B0.e(0, this)));
        this.f11106W = null;
        ArrayList arrayList = this.f11108Z;
        C0750t c0750t = this.f11109a0;
        if (!arrayList.contains(c0750t)) {
            L(c0750t);
        }
    }

    public final void q() {
        p();
        this.f11101R = this.f11114h;
        this.f11114h = UUID.randomUUID().toString();
        this.f11118n = false;
        this.f11119o = false;
        this.f11122r = false;
        this.f11123s = false;
        this.f11125u = false;
        this.f11127w = 0;
        this.f11128x = null;
        this.f11130z = new T();
        this.f11129y = null;
        this.f11086B = 0;
        this.f11087C = 0;
        this.f11088D = null;
        this.f11089E = false;
        this.f11090F = false;
    }

    public final boolean r() {
        boolean r8;
        if (!this.f11089E) {
            T t8 = this.f11128x;
            if (t8 != null) {
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f11085A;
                t8.getClass();
                if (abstractComponentCallbacksC0755y == null) {
                    r8 = false;
                } else {
                    r8 = abstractComponentCallbacksC0755y.r();
                }
                if (r8) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean s() {
        if (this.f11127w > 0) {
            return true;
        }
        return false;
    }

    public void t() {
        this.f11093I = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f11114h);
        if (this.f11086B != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f11086B));
        }
        if (this.f11088D != null) {
            sb.append(" tag=");
            sb.append(this.f11088D);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(Activity activity) {
        this.f11093I = true;
    }

    public void v(Context context) {
        AbstractActivityC0870i abstractActivityC0870i;
        this.f11093I = true;
        C0731A c0731a = this.f11129y;
        if (c0731a == null) {
            abstractActivityC0870i = null;
        } else {
            abstractActivityC0870i = c0731a.f10844i;
        }
        if (abstractActivityC0870i != null) {
            this.f11093I = false;
            u(abstractActivityC0870i);
        }
    }

    public void w(Bundle bundle) {
        Bundle bundle2;
        this.f11093I = true;
        Bundle bundle3 = this.f11111e;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f11130z.X(bundle2);
            T t8 = this.f11130z;
            t8.f10892I = false;
            t8.f10893J = false;
            t8.f10898P.f10937g = false;
            t8.u(1);
        }
        T t9 = this.f11130z;
        if (t9.f10920w >= 1) {
            return;
        }
        t9.f10892I = false;
        t9.f10893J = false;
        t9.f10898P.f10937g = false;
        t9.u(1);
    }

    public View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void y() {
        this.f11093I = true;
    }

    public void z() {
        this.f11093I = true;
    }

    public void E(Bundle bundle) {
    }

    public void H(View view) {
    }
}
