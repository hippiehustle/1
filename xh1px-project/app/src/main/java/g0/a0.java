package g0;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0503n;
import androidx.lifecycle.EnumC0504o;
import com.buzbuz.smartautoclicker.R;
import h0.C0807b;
import i.AbstractActivityC0870i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import k0.C0946a;
import m0.C1050a;
import n1.AbstractC1149a;
import u6.InterfaceC1642c;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final R3.r f10970a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f10971b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0755y f10972c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10973d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f10974e = -1;

    public a0(R3.r rVar, b0 b0Var, AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        this.f10970a = rVar;
        this.f10971b = b0Var;
        this.f10972c = abstractComponentCallbacksC0755y;
    }

    public final void a() {
        Bundle bundle;
        boolean K = T.K(3);
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (K) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        Bundle bundle2 = abstractComponentCallbacksC0755y.f11111e;
        if (bundle2 != null) {
            bundle2.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0755y.f11130z.R();
        abstractComponentCallbacksC0755y.f11110d = 3;
        abstractComponentCallbacksC0755y.f11093I = false;
        abstractComponentCallbacksC0755y.t();
        if (abstractComponentCallbacksC0755y.f11093I) {
            if (T.K(3)) {
                abstractComponentCallbacksC0755y.toString();
            }
            if (abstractComponentCallbacksC0755y.K != null) {
                Bundle bundle3 = abstractComponentCallbacksC0755y.f11111e;
                if (bundle3 != null) {
                    bundle = bundle3.getBundle("savedInstanceState");
                } else {
                    bundle = null;
                }
                SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0755y.f11112f;
                if (sparseArray != null) {
                    abstractComponentCallbacksC0755y.K.restoreHierarchyState(sparseArray);
                    abstractComponentCallbacksC0755y.f11112f = null;
                }
                abstractComponentCallbacksC0755y.f11093I = false;
                abstractComponentCallbacksC0755y.I(bundle);
                if (abstractComponentCallbacksC0755y.f11093I) {
                    if (abstractComponentCallbacksC0755y.K != null) {
                        abstractComponentCallbacksC0755y.f11104U.a(EnumC0503n.ON_CREATE);
                    }
                } else {
                    throw new AndroidRuntimeException(A.j.n("Fragment ", abstractComponentCallbacksC0755y, " did not call through to super.onViewStateRestored()"));
                }
            }
            abstractComponentCallbacksC0755y.f11111e = null;
            T t8 = abstractComponentCallbacksC0755y.f11130z;
            t8.f10892I = false;
            t8.f10893J = false;
            t8.f10898P.f10937g = false;
            t8.u(4);
            this.f10970a.A(abstractComponentCallbacksC0755y, false);
            return;
        }
        throw new AndroidRuntimeException(A.j.n("Fragment ", abstractComponentCallbacksC0755y, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y;
        View view;
        View view2;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y3 = this.f10972c;
        View view3 = abstractComponentCallbacksC0755y3.f11094J;
        while (true) {
            abstractComponentCallbacksC0755y = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof AbstractComponentCallbacksC0755y) {
                abstractComponentCallbacksC0755y2 = (AbstractComponentCallbacksC0755y) tag;
            } else {
                abstractComponentCallbacksC0755y2 = null;
            }
            if (abstractComponentCallbacksC0755y2 != null) {
                abstractComponentCallbacksC0755y = abstractComponentCallbacksC0755y2;
                break;
            }
            Object parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y4 = abstractComponentCallbacksC0755y3.f11085A;
        if (abstractComponentCallbacksC0755y != null && !abstractComponentCallbacksC0755y.equals(abstractComponentCallbacksC0755y4)) {
            int i4 = abstractComponentCallbacksC0755y3.f11087C;
            C0807b c0807b = h0.c.f11305a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(abstractComponentCallbacksC0755y3);
            sb.append(" within the view of parent fragment ");
            sb.append(abstractComponentCallbacksC0755y);
            sb.append(" via container with ID ");
            h0.c.b(new Violation(abstractComponentCallbacksC0755y3, AbstractC1149a.h(sb, i4, " without using parent's childFragmentManager")));
            h0.c.a(abstractComponentCallbacksC0755y3).getClass();
        }
        ArrayList arrayList = (ArrayList) this.f10971b.f10987d;
        ViewGroup viewGroup = abstractComponentCallbacksC0755y3.f11094J;
        int i8 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0755y3);
            int i9 = indexOf - 1;
            while (true) {
                if (i9 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y5 = (AbstractComponentCallbacksC0755y) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0755y5.f11094J == viewGroup && (view = abstractComponentCallbacksC0755y5.K) != null) {
                            i8 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y6 = (AbstractComponentCallbacksC0755y) arrayList.get(i9);
                    if (abstractComponentCallbacksC0755y6.f11094J == viewGroup && (view2 = abstractComponentCallbacksC0755y6.K) != null) {
                        i8 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i9--;
                }
            }
        }
        abstractComponentCallbacksC0755y3.f11094J.addView(abstractComponentCallbacksC0755y3.K, i8);
    }

    public final void c() {
        boolean K = T.K(3);
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (K) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = abstractComponentCallbacksC0755y.j;
        a0 a0Var = null;
        b0 b0Var = this.f10971b;
        if (abstractComponentCallbacksC0755y2 != null) {
            a0 a0Var2 = (a0) ((HashMap) b0Var.f10988e).get(abstractComponentCallbacksC0755y2.f11114h);
            if (a0Var2 != null) {
                abstractComponentCallbacksC0755y.k = abstractComponentCallbacksC0755y.j.f11114h;
                abstractComponentCallbacksC0755y.j = null;
                a0Var = a0Var2;
            } else {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0755y + " declared target fragment " + abstractComponentCallbacksC0755y.j + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = abstractComponentCallbacksC0755y.k;
            if (str != null && (a0Var = (a0) ((HashMap) b0Var.f10988e).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0755y);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(A.j.r(sb, abstractComponentCallbacksC0755y.k, " that does not belong to this FragmentManager!"));
            }
        }
        if (a0Var != null) {
            a0Var.k();
        }
        T t8 = abstractComponentCallbacksC0755y.f11128x;
        abstractComponentCallbacksC0755y.f11129y = t8.f10921x;
        abstractComponentCallbacksC0755y.f11085A = t8.f10923z;
        R3.r rVar = this.f10970a;
        rVar.G(abstractComponentCallbacksC0755y, false);
        ArrayList arrayList = abstractComponentCallbacksC0755y.f11108Z;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0754x) it.next()).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0755y.f11130z.b(abstractComponentCallbacksC0755y.f11129y, abstractComponentCallbacksC0755y.c(), abstractComponentCallbacksC0755y);
        abstractComponentCallbacksC0755y.f11110d = 0;
        abstractComponentCallbacksC0755y.f11093I = false;
        abstractComponentCallbacksC0755y.v(abstractComponentCallbacksC0755y.f11129y.j);
        if (abstractComponentCallbacksC0755y.f11093I) {
            T t9 = abstractComponentCallbacksC0755y.f11128x;
            Iterator it2 = t9.f10914q.iterator();
            while (it2.hasNext()) {
                ((X) it2.next()).a(t9, abstractComponentCallbacksC0755y);
            }
            T t10 = abstractComponentCallbacksC0755y.f11130z;
            t10.f10892I = false;
            t10.f10893J = false;
            t10.f10898P.f10937g = false;
            t10.u(0);
            rVar.B(abstractComponentCallbacksC0755y, false);
            return;
        }
        throw new AndroidRuntimeException(A.j.n("Fragment ", abstractComponentCallbacksC0755y, " did not call through to super.onAttach()"));
    }

    public final int d() {
        int i4;
        int i8;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (abstractComponentCallbacksC0755y.f11128x == null) {
            return abstractComponentCallbacksC0755y.f11110d;
        }
        int i9 = this.f10974e;
        int ordinal = abstractComponentCallbacksC0755y.f11102S.ordinal();
        int i10 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i9 = Math.min(i9, -1);
                    }
                } else {
                    i9 = Math.min(i9, 5);
                }
            } else {
                i9 = Math.min(i9, 1);
            }
        } else {
            i9 = Math.min(i9, 0);
        }
        if (abstractComponentCallbacksC0755y.f11122r) {
            if (abstractComponentCallbacksC0755y.f11123s) {
                i9 = Math.max(this.f10974e, 2);
                View view = abstractComponentCallbacksC0755y.K;
                if (view != null && view.getParent() == null) {
                    i9 = Math.min(i9, 2);
                }
            } else {
                i9 = this.f10974e < 4 ? Math.min(i9, abstractComponentCallbacksC0755y.f11110d) : Math.min(i9, 1);
            }
        }
        if (abstractComponentCallbacksC0755y.f11124t && abstractComponentCallbacksC0755y.f11094J == null) {
            i9 = Math.min(i9, 4);
        }
        if (!abstractComponentCallbacksC0755y.f11118n) {
            i9 = Math.min(i9, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0755y.f11094J;
        if (viewGroup != null) {
            C0744m i11 = C0744m.i(viewGroup, abstractComponentCallbacksC0755y.m());
            i11.getClass();
            g0 f8 = i11.f(abstractComponentCallbacksC0755y);
            if (f8 != null) {
                i4 = f8.f11023b;
            } else {
                i4 = 0;
            }
            g0 g8 = i11.g(abstractComponentCallbacksC0755y);
            if (g8 != null) {
                i10 = g8.f11023b;
            }
            if (i4 == 0) {
                i8 = -1;
            } else {
                i8 = h0.f11037a[AbstractC1769h.b(i4)];
            }
            if (i8 != -1 && i8 != 1) {
                i10 = i4;
            }
        }
        if (i10 == 2) {
            i9 = Math.min(i9, 6);
        } else if (i10 == 3) {
            i9 = Math.max(i9, 3);
        } else if (abstractComponentCallbacksC0755y.f11119o) {
            if (abstractComponentCallbacksC0755y.s()) {
                i9 = Math.min(i9, 1);
            } else {
                i9 = Math.min(i9, -1);
            }
        }
        if (abstractComponentCallbacksC0755y.f11095L && abstractComponentCallbacksC0755y.f11110d < 5) {
            i9 = Math.min(i9, 4);
        }
        if (abstractComponentCallbacksC0755y.f11120p) {
            i9 = Math.max(i9, 3);
        }
        if (T.K(2)) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        return i9;
    }

    public final void e() {
        Bundle bundle;
        Bundle bundle2;
        boolean K = T.K(3);
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (K) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        Bundle bundle3 = abstractComponentCallbacksC0755y.f11111e;
        if (bundle3 != null) {
            bundle = bundle3.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!abstractComponentCallbacksC0755y.f11100Q) {
            R3.r rVar = this.f10970a;
            rVar.H(abstractComponentCallbacksC0755y, false);
            abstractComponentCallbacksC0755y.f11130z.R();
            abstractComponentCallbacksC0755y.f11110d = 1;
            abstractComponentCallbacksC0755y.f11093I = false;
            abstractComponentCallbacksC0755y.f11103T.a(new B0.b(3, abstractComponentCallbacksC0755y));
            abstractComponentCallbacksC0755y.w(bundle);
            abstractComponentCallbacksC0755y.f11100Q = true;
            if (abstractComponentCallbacksC0755y.f11093I) {
                abstractComponentCallbacksC0755y.f11103T.d(EnumC0503n.ON_CREATE);
                rVar.C(abstractComponentCallbacksC0755y, false);
                return;
            }
            throw new AndroidRuntimeException(A.j.n("Fragment ", abstractComponentCallbacksC0755y, " did not call through to super.onCreate()"));
        }
        abstractComponentCallbacksC0755y.f11110d = 1;
        Bundle bundle4 = abstractComponentCallbacksC0755y.f11111e;
        if (bundle4 != null && (bundle2 = bundle4.getBundle("childFragmentManager")) != null) {
            abstractComponentCallbacksC0755y.f11130z.X(bundle2);
            T t8 = abstractComponentCallbacksC0755y.f11130z;
            t8.f10892I = false;
            t8.f10893J = false;
            t8.f10898P.f10937g = false;
            t8.u(1);
        }
    }

    public final void f() {
        Bundle bundle;
        String str;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (abstractComponentCallbacksC0755y.f11122r) {
            return;
        }
        if (T.K(3)) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        Bundle bundle2 = abstractComponentCallbacksC0755y.f11111e;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater B8 = abstractComponentCallbacksC0755y.B(bundle);
        abstractComponentCallbacksC0755y.f11099P = B8;
        ViewGroup viewGroup2 = abstractComponentCallbacksC0755y.f11094J;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i4 = abstractComponentCallbacksC0755y.f11087C;
            if (i4 != 0) {
                if (i4 != -1) {
                    viewGroup = (ViewGroup) abstractComponentCallbacksC0755y.f11128x.f10922y.E(i4);
                    if (viewGroup == null) {
                        if (!abstractComponentCallbacksC0755y.f11125u && !abstractComponentCallbacksC0755y.f11124t) {
                            try {
                                str = abstractComponentCallbacksC0755y.n().getResourceName(abstractComponentCallbacksC0755y.f11087C);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0755y.f11087C) + " (" + str + ") for fragment " + abstractComponentCallbacksC0755y);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        C0807b c0807b = h0.c.f11305a;
                        h0.c.b(new Violation(abstractComponentCallbacksC0755y, "Attempting to add fragment " + abstractComponentCallbacksC0755y + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        h0.c.a(abstractComponentCallbacksC0755y).getClass();
                    }
                } else {
                    throw new IllegalArgumentException(A.j.n("Cannot create fragment ", abstractComponentCallbacksC0755y, " for a container view with no id"));
                }
            }
        }
        abstractComponentCallbacksC0755y.f11094J = viewGroup;
        abstractComponentCallbacksC0755y.J(B8, viewGroup, bundle);
        int i8 = 2;
        if (abstractComponentCallbacksC0755y.K != null) {
            if (T.K(3)) {
                Objects.toString(abstractComponentCallbacksC0755y);
            }
            abstractComponentCallbacksC0755y.K.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0755y.K.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0755y);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0755y.f11089E) {
                abstractComponentCallbacksC0755y.K.setVisibility(8);
            }
            if (abstractComponentCallbacksC0755y.K.isAttachedToWindow()) {
                View view = abstractComponentCallbacksC0755y.K;
                WeakHashMap weakHashMap = P.O.f4214a;
                P.D.c(view);
            } else {
                View view2 = abstractComponentCallbacksC0755y.K;
                view2.addOnAttachStateChangeListener(new L5.l(i8, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC0755y.f11111e;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC0755y.H(abstractComponentCallbacksC0755y.K);
            abstractComponentCallbacksC0755y.f11130z.u(2);
            this.f10970a.M(abstractComponentCallbacksC0755y, abstractComponentCallbacksC0755y.K, false);
            int visibility = abstractComponentCallbacksC0755y.K.getVisibility();
            abstractComponentCallbacksC0755y.h().j = abstractComponentCallbacksC0755y.K.getAlpha();
            if (abstractComponentCallbacksC0755y.f11094J != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0755y.K.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0755y.h().k = findFocus;
                    if (T.K(2)) {
                        findFocus.toString();
                        Objects.toString(abstractComponentCallbacksC0755y);
                    }
                }
                abstractComponentCallbacksC0755y.K.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0755y.f11110d = 2;
    }

    public final void g() {
        boolean z8;
        boolean z9;
        AbstractComponentCallbacksC0755y e9;
        boolean K = T.K(3);
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (K) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        boolean z10 = true;
        if (abstractComponentCallbacksC0755y.f11119o && !abstractComponentCallbacksC0755y.s()) {
            z8 = true;
        } else {
            z8 = false;
        }
        b0 b0Var = this.f10971b;
        if (z8 && !abstractComponentCallbacksC0755y.f11121q) {
            b0Var.r(abstractComponentCallbacksC0755y.f11114h, null);
        }
        if (!z8) {
            W w8 = (W) b0Var.f10990g;
            if (w8.f10932b.containsKey(abstractComponentCallbacksC0755y.f11114h) && w8.f10935e) {
                z9 = w8.f10936f;
            } else {
                z9 = true;
            }
            if (!z9) {
                String str = abstractComponentCallbacksC0755y.k;
                if (str != null && (e9 = b0Var.e(str)) != null && e9.f11091G) {
                    abstractComponentCallbacksC0755y.j = e9;
                }
                abstractComponentCallbacksC0755y.f11110d = 0;
                return;
            }
        }
        C0731A c0731a = abstractComponentCallbacksC0755y.f11129y;
        if (c0731a != null) {
            z10 = ((W) b0Var.f10990g).f10936f;
        } else {
            AbstractActivityC0870i abstractActivityC0870i = c0731a.j;
            if (abstractActivityC0870i != null) {
                z10 = true ^ abstractActivityC0870i.isChangingConfigurations();
            }
        }
        if ((z8 && !abstractComponentCallbacksC0755y.f11121q) || z10) {
            W w9 = (W) b0Var.f10990g;
            w9.getClass();
            if (T.K(3)) {
                Objects.toString(abstractComponentCallbacksC0755y);
            }
            w9.e(abstractComponentCallbacksC0755y.f11114h, false);
        }
        abstractComponentCallbacksC0755y.f11130z.l();
        abstractComponentCallbacksC0755y.f11103T.d(EnumC0503n.ON_DESTROY);
        abstractComponentCallbacksC0755y.f11110d = 0;
        abstractComponentCallbacksC0755y.f11093I = false;
        abstractComponentCallbacksC0755y.f11100Q = false;
        abstractComponentCallbacksC0755y.y();
        if (abstractComponentCallbacksC0755y.f11093I) {
            this.f10970a.D(abstractComponentCallbacksC0755y, false);
            Iterator it = b0Var.h().iterator();
            while (it.hasNext()) {
                a0 a0Var = (a0) it.next();
                if (a0Var != null) {
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = a0Var.f10972c;
                    if (abstractComponentCallbacksC0755y.f11114h.equals(abstractComponentCallbacksC0755y2.k)) {
                        abstractComponentCallbacksC0755y2.j = abstractComponentCallbacksC0755y;
                        abstractComponentCallbacksC0755y2.k = null;
                    }
                }
            }
            String str2 = abstractComponentCallbacksC0755y.k;
            if (str2 != null) {
                abstractComponentCallbacksC0755y.j = b0Var.e(str2);
            }
            b0Var.o(this);
            return;
        }
        throw new AndroidRuntimeException(A.j.n("Fragment ", abstractComponentCallbacksC0755y, " did not call through to super.onDestroy()"));
    }

    public final void h() {
        View view;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (T.K(3)) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0755y.f11094J;
        if (viewGroup != null && (view = abstractComponentCallbacksC0755y.K) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0755y.f11130z.u(1);
        if (abstractComponentCallbacksC0755y.K != null) {
            d0 d0Var = abstractComponentCallbacksC0755y.f11104U;
            d0Var.c();
            if (d0Var.f11009h.f8862d.compareTo(EnumC0504o.f8848f) >= 0) {
                abstractComponentCallbacksC0755y.f11104U.a(EnumC0503n.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0755y.f11110d = 1;
        abstractComponentCallbacksC0755y.f11093I = false;
        abstractComponentCallbacksC0755y.z();
        if (abstractComponentCallbacksC0755y.f11093I) {
            androidx.lifecycle.e0 f8 = abstractComponentCallbacksC0755y.f();
            V v8 = C1050a.f12376c;
            o6.j.e(f8, "store");
            C0946a c0946a = C0946a.f11950b;
            o6.j.e(c0946a, "defaultCreationExtras");
            b0 b0Var = new b0(f8, v8, c0946a);
            InterfaceC1642c n3 = h2.a.n(C1050a.class);
            String a3 = n3.a();
            if (a3 != null) {
                t.k kVar = ((C1050a) b0Var.l("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a3), n3)).f12377b;
                if (kVar.e() <= 0) {
                    abstractComponentCallbacksC0755y.f11126v = false;
                    this.f10970a.N(abstractComponentCallbacksC0755y, false);
                    abstractComponentCallbacksC0755y.f11094J = null;
                    abstractComponentCallbacksC0755y.K = null;
                    abstractComponentCallbacksC0755y.f11104U = null;
                    androidx.lifecycle.C c6 = abstractComponentCallbacksC0755y.f11105V;
                    c6.getClass();
                    androidx.lifecycle.C.a("setValue");
                    c6.f8773g++;
                    c6.f8771e = null;
                    c6.c(null);
                    abstractComponentCallbacksC0755y.f11123s = false;
                    return;
                }
                kVar.f(0).getClass();
                throw new ClassCastException();
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw new AndroidRuntimeException(A.j.n("Fragment ", abstractComponentCallbacksC0755y, " did not call through to super.onDestroyView()"));
    }

    public final void i() {
        boolean z8;
        boolean K = T.K(3);
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (K) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        abstractComponentCallbacksC0755y.f11110d = -1;
        abstractComponentCallbacksC0755y.f11093I = false;
        abstractComponentCallbacksC0755y.A();
        abstractComponentCallbacksC0755y.f11099P = null;
        if (abstractComponentCallbacksC0755y.f11093I) {
            T t8 = abstractComponentCallbacksC0755y.f11130z;
            if (!t8.K) {
                t8.l();
                abstractComponentCallbacksC0755y.f11130z = new T();
            }
            this.f10970a.E(abstractComponentCallbacksC0755y, false);
            abstractComponentCallbacksC0755y.f11110d = -1;
            abstractComponentCallbacksC0755y.f11129y = null;
            abstractComponentCallbacksC0755y.f11085A = null;
            abstractComponentCallbacksC0755y.f11128x = null;
            if (!abstractComponentCallbacksC0755y.f11119o || abstractComponentCallbacksC0755y.s()) {
                W w8 = (W) this.f10971b.f10990g;
                if (w8.f10932b.containsKey(abstractComponentCallbacksC0755y.f11114h) && w8.f10935e) {
                    z8 = w8.f10936f;
                } else {
                    z8 = true;
                }
                if (!z8) {
                    return;
                }
            }
            if (T.K(3)) {
                Objects.toString(abstractComponentCallbacksC0755y);
            }
            abstractComponentCallbacksC0755y.q();
            return;
        }
        throw new AndroidRuntimeException(A.j.n("Fragment ", abstractComponentCallbacksC0755y, " did not call through to super.onDetach()"));
    }

    public final void j() {
        Bundle bundle;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (abstractComponentCallbacksC0755y.f11122r && abstractComponentCallbacksC0755y.f11123s && !abstractComponentCallbacksC0755y.f11126v) {
            if (T.K(3)) {
                Objects.toString(abstractComponentCallbacksC0755y);
            }
            Bundle bundle2 = abstractComponentCallbacksC0755y.f11111e;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            LayoutInflater B8 = abstractComponentCallbacksC0755y.B(bundle);
            abstractComponentCallbacksC0755y.f11099P = B8;
            abstractComponentCallbacksC0755y.J(B8, null, bundle);
            View view = abstractComponentCallbacksC0755y.K;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0755y.K.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0755y);
                if (abstractComponentCallbacksC0755y.f11089E) {
                    abstractComponentCallbacksC0755y.K.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC0755y.f11111e;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC0755y.H(abstractComponentCallbacksC0755y.K);
                abstractComponentCallbacksC0755y.f11130z.u(2);
                this.f10970a.M(abstractComponentCallbacksC0755y, abstractComponentCallbacksC0755y.K, false);
                abstractComponentCallbacksC0755y.f11110d = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0124, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z8 = this.f10973d;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (z8) {
            if (T.K(2)) {
                Objects.toString(abstractComponentCallbacksC0755y);
                return;
            }
            return;
        }
        try {
            this.f10973d = true;
            boolean z9 = false;
            while (true) {
                int d2 = d();
                int i4 = abstractComponentCallbacksC0755y.f11110d;
                int i8 = 3;
                b0 b0Var = this.f10971b;
                if (d2 != i4) {
                    if (d2 > i4) {
                        switch (i4 + 1) {
                            case 0:
                                c();
                                break;
                            case 1:
                                e();
                                break;
                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                j();
                                f();
                                break;
                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                a();
                                break;
                            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                if (abstractComponentCallbacksC0755y.K != null && (viewGroup3 = abstractComponentCallbacksC0755y.f11094J) != null) {
                                    C0744m i9 = C0744m.i(viewGroup3, abstractComponentCallbacksC0755y.m());
                                    int visibility = abstractComponentCallbacksC0755y.K.getVisibility();
                                    if (visibility != 0) {
                                        if (visibility != 4) {
                                            if (visibility != 8) {
                                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                                            }
                                        } else {
                                            i8 = 4;
                                        }
                                    } else {
                                        i8 = 2;
                                    }
                                    i9.getClass();
                                    if (T.K(2)) {
                                        Objects.toString(abstractComponentCallbacksC0755y);
                                    }
                                    i9.d(i8, 2, this);
                                }
                                abstractComponentCallbacksC0755y.f11110d = 4;
                                break;
                            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                q();
                                break;
                            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                abstractComponentCallbacksC0755y.f11110d = 6;
                                break;
                            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                n();
                                break;
                        }
                    } else {
                        switch (i4 - 1) {
                            case -1:
                                i();
                                break;
                            case 0:
                                if (abstractComponentCallbacksC0755y.f11121q) {
                                    if (((Bundle) ((HashMap) b0Var.f10989f).get(abstractComponentCallbacksC0755y.f11114h)) == null) {
                                        b0Var.r(abstractComponentCallbacksC0755y.f11114h, o());
                                    }
                                }
                                g();
                                break;
                            case 1:
                                h();
                                abstractComponentCallbacksC0755y.f11110d = 1;
                                break;
                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                abstractComponentCallbacksC0755y.f11123s = false;
                                abstractComponentCallbacksC0755y.f11110d = 2;
                                break;
                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                if (T.K(3)) {
                                    Objects.toString(abstractComponentCallbacksC0755y);
                                }
                                if (abstractComponentCallbacksC0755y.f11121q) {
                                    b0Var.r(abstractComponentCallbacksC0755y.f11114h, o());
                                } else if (abstractComponentCallbacksC0755y.K != null && abstractComponentCallbacksC0755y.f11112f == null) {
                                    p();
                                }
                                if (abstractComponentCallbacksC0755y.K != null && (viewGroup2 = abstractComponentCallbacksC0755y.f11094J) != null) {
                                    C0744m i10 = C0744m.i(viewGroup2, abstractComponentCallbacksC0755y.m());
                                    i10.getClass();
                                    if (T.K(2)) {
                                        Objects.toString(abstractComponentCallbacksC0755y);
                                    }
                                    i10.d(1, 3, this);
                                }
                                abstractComponentCallbacksC0755y.f11110d = 3;
                                break;
                            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                r();
                                break;
                            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                abstractComponentCallbacksC0755y.f11110d = 5;
                                break;
                            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                l();
                                break;
                        }
                    }
                    z9 = true;
                } else {
                    if (!z9 && i4 == -1 && abstractComponentCallbacksC0755y.f11119o && !abstractComponentCallbacksC0755y.s() && !abstractComponentCallbacksC0755y.f11121q) {
                        if (T.K(3)) {
                            Objects.toString(abstractComponentCallbacksC0755y);
                        }
                        W w8 = (W) b0Var.f10990g;
                        w8.getClass();
                        if (T.K(3)) {
                            Objects.toString(abstractComponentCallbacksC0755y);
                        }
                        w8.e(abstractComponentCallbacksC0755y.f11114h, true);
                        b0Var.o(this);
                        if (T.K(3)) {
                            Objects.toString(abstractComponentCallbacksC0755y);
                        }
                        abstractComponentCallbacksC0755y.q();
                    }
                    if (abstractComponentCallbacksC0755y.f11098O) {
                        if (abstractComponentCallbacksC0755y.K != null && (viewGroup = abstractComponentCallbacksC0755y.f11094J) != null) {
                            C0744m i11 = C0744m.i(viewGroup, abstractComponentCallbacksC0755y.m());
                            if (abstractComponentCallbacksC0755y.f11089E) {
                                i11.getClass();
                                if (T.K(2)) {
                                    Objects.toString(abstractComponentCallbacksC0755y);
                                }
                                i11.d(3, 1, this);
                            } else {
                                i11.getClass();
                                if (T.K(2)) {
                                    Objects.toString(abstractComponentCallbacksC0755y);
                                }
                                i11.d(2, 1, this);
                            }
                        }
                        T t8 = abstractComponentCallbacksC0755y.f11128x;
                        if (t8 != null && abstractComponentCallbacksC0755y.f11118n && T.L(abstractComponentCallbacksC0755y)) {
                            t8.f10891H = true;
                        }
                        abstractComponentCallbacksC0755y.f11098O = false;
                        abstractComponentCallbacksC0755y.f11130z.o();
                    }
                    this.f10973d = false;
                    return;
                }
            }
        } catch (Throwable th) {
            this.f10973d = false;
            throw th;
        }
    }

    public final void l() {
        boolean K = T.K(3);
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (K) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        abstractComponentCallbacksC0755y.f11130z.u(5);
        if (abstractComponentCallbacksC0755y.K != null) {
            abstractComponentCallbacksC0755y.f11104U.a(EnumC0503n.ON_PAUSE);
        }
        abstractComponentCallbacksC0755y.f11103T.d(EnumC0503n.ON_PAUSE);
        abstractComponentCallbacksC0755y.f11110d = 6;
        abstractComponentCallbacksC0755y.f11093I = true;
        this.f10970a.F(abstractComponentCallbacksC0755y, false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        Bundle bundle = abstractComponentCallbacksC0755y.f11111e;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (abstractComponentCallbacksC0755y.f11111e.getBundle("savedInstanceState") == null) {
                abstractComponentCallbacksC0755y.f11111e.putBundle("savedInstanceState", new Bundle());
            }
            try {
                abstractComponentCallbacksC0755y.f11112f = abstractComponentCallbacksC0755y.f11111e.getSparseParcelableArray("viewState");
                abstractComponentCallbacksC0755y.f11113g = abstractComponentCallbacksC0755y.f11111e.getBundle("viewRegistryState");
                Z z8 = (Z) abstractComponentCallbacksC0755y.f11111e.getParcelable("state");
                if (z8 != null) {
                    abstractComponentCallbacksC0755y.k = z8.f10948p;
                    abstractComponentCallbacksC0755y.f11116l = z8.f10949q;
                    abstractComponentCallbacksC0755y.f11096M = z8.f10950r;
                }
                if (!abstractComponentCallbacksC0755y.f11096M) {
                    abstractComponentCallbacksC0755y.f11095L = true;
                }
            } catch (BadParcelableException e9) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC0755y, e9);
            }
        }
    }

    public final void n() {
        View view;
        boolean K = T.K(3);
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (K) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        C0753w c0753w = abstractComponentCallbacksC0755y.f11097N;
        if (c0753w == null) {
            view = null;
        } else {
            view = c0753w.k;
        }
        if (view != null) {
            if (view != abstractComponentCallbacksC0755y.K) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0755y.K) {
                    }
                }
            }
            view.requestFocus();
            if (T.K(2)) {
                view.toString();
                Objects.toString(abstractComponentCallbacksC0755y);
                Objects.toString(abstractComponentCallbacksC0755y.K.findFocus());
            }
        }
        abstractComponentCallbacksC0755y.h().k = null;
        abstractComponentCallbacksC0755y.f11130z.R();
        abstractComponentCallbacksC0755y.f11130z.A(true);
        abstractComponentCallbacksC0755y.f11110d = 7;
        abstractComponentCallbacksC0755y.f11093I = false;
        abstractComponentCallbacksC0755y.D();
        if (abstractComponentCallbacksC0755y.f11093I) {
            C0512x c0512x = abstractComponentCallbacksC0755y.f11103T;
            EnumC0503n enumC0503n = EnumC0503n.ON_RESUME;
            c0512x.d(enumC0503n);
            if (abstractComponentCallbacksC0755y.K != null) {
                abstractComponentCallbacksC0755y.f11104U.f11009h.d(enumC0503n);
            }
            T t8 = abstractComponentCallbacksC0755y.f11130z;
            t8.f10892I = false;
            t8.f10893J = false;
            t8.f10898P.f10937g = false;
            t8.u(7);
            this.f10970a.I(abstractComponentCallbacksC0755y, false);
            this.f10971b.r(abstractComponentCallbacksC0755y.f11114h, null);
            abstractComponentCallbacksC0755y.f11111e = null;
            abstractComponentCallbacksC0755y.f11112f = null;
            abstractComponentCallbacksC0755y.f11113g = null;
            return;
        }
        throw new AndroidRuntimeException(A.j.n("Fragment ", abstractComponentCallbacksC0755y, " did not call through to super.onResume()"));
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (abstractComponentCallbacksC0755y.f11110d == -1 && (bundle = abstractComponentCallbacksC0755y.f11111e) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new Z(abstractComponentCallbacksC0755y));
        if (abstractComponentCallbacksC0755y.f11110d > 0) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC0755y.E(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f10970a.J(abstractComponentCallbacksC0755y, bundle3, false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC0755y.f11107X.j(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle Y = abstractComponentCallbacksC0755y.f11130z.Y();
            if (!Y.isEmpty()) {
                bundle2.putBundle("childFragmentManager", Y);
            }
            if (abstractComponentCallbacksC0755y.K != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0755y.f11112f;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC0755y.f11113g;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC0755y.f11115i;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (abstractComponentCallbacksC0755y.K != null) {
            if (T.K(2)) {
                Objects.toString(abstractComponentCallbacksC0755y);
                Objects.toString(abstractComponentCallbacksC0755y.K);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            abstractComponentCallbacksC0755y.K.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                abstractComponentCallbacksC0755y.f11112f = sparseArray;
            }
            Bundle bundle = new Bundle();
            abstractComponentCallbacksC0755y.f11104U.f11010i.j(bundle);
            if (!bundle.isEmpty()) {
                abstractComponentCallbacksC0755y.f11113g = bundle;
            }
        }
    }

    public final void q() {
        boolean K = T.K(3);
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (K) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        abstractComponentCallbacksC0755y.f11130z.R();
        abstractComponentCallbacksC0755y.f11130z.A(true);
        abstractComponentCallbacksC0755y.f11110d = 5;
        abstractComponentCallbacksC0755y.f11093I = false;
        abstractComponentCallbacksC0755y.F();
        if (abstractComponentCallbacksC0755y.f11093I) {
            C0512x c0512x = abstractComponentCallbacksC0755y.f11103T;
            EnumC0503n enumC0503n = EnumC0503n.ON_START;
            c0512x.d(enumC0503n);
            if (abstractComponentCallbacksC0755y.K != null) {
                abstractComponentCallbacksC0755y.f11104U.f11009h.d(enumC0503n);
            }
            T t8 = abstractComponentCallbacksC0755y.f11130z;
            t8.f10892I = false;
            t8.f10893J = false;
            t8.f10898P.f10937g = false;
            t8.u(5);
            this.f10970a.K(abstractComponentCallbacksC0755y, false);
            return;
        }
        throw new AndroidRuntimeException(A.j.n("Fragment ", abstractComponentCallbacksC0755y, " did not call through to super.onStart()"));
    }

    public final void r() {
        boolean K = T.K(3);
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10972c;
        if (K) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        T t8 = abstractComponentCallbacksC0755y.f11130z;
        t8.f10893J = true;
        t8.f10898P.f10937g = true;
        t8.u(4);
        if (abstractComponentCallbacksC0755y.K != null) {
            abstractComponentCallbacksC0755y.f11104U.a(EnumC0503n.ON_STOP);
        }
        abstractComponentCallbacksC0755y.f11103T.d(EnumC0503n.ON_STOP);
        abstractComponentCallbacksC0755y.f11110d = 4;
        abstractComponentCallbacksC0755y.f11093I = false;
        abstractComponentCallbacksC0755y.G();
        if (abstractComponentCallbacksC0755y.f11093I) {
            this.f10970a.L(abstractComponentCallbacksC0755y, false);
            return;
        }
        throw new AndroidRuntimeException(A.j.n("Fragment ", abstractComponentCallbacksC0755y, " did not call through to super.onStop()"));
    }

    public a0(R3.r rVar, b0 b0Var, ClassLoader classLoader, J j, Bundle bundle) {
        this.f10970a = rVar;
        this.f10971b = b0Var;
        AbstractComponentCallbacksC0755y a3 = ((Z) bundle.getParcelable("state")).a(j);
        this.f10972c = a3;
        a3.f11111e = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a3.R(bundle2);
        if (T.K(2)) {
            Objects.toString(a3);
        }
    }

    public a0(R3.r rVar, b0 b0Var, AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, Bundle bundle) {
        this.f10970a = rVar;
        this.f10971b = b0Var;
        this.f10972c = abstractComponentCallbacksC0755y;
        abstractComponentCallbacksC0755y.f11112f = null;
        abstractComponentCallbacksC0755y.f11113g = null;
        abstractComponentCallbacksC0755y.f11127w = 0;
        abstractComponentCallbacksC0755y.f11123s = false;
        abstractComponentCallbacksC0755y.f11118n = false;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = abstractComponentCallbacksC0755y.j;
        abstractComponentCallbacksC0755y.k = abstractComponentCallbacksC0755y2 != null ? abstractComponentCallbacksC0755y2.f11114h : null;
        abstractComponentCallbacksC0755y.j = null;
        abstractComponentCallbacksC0755y.f11111e = bundle;
        abstractComponentCallbacksC0755y.f11115i = bundle.getBundle("arguments");
    }
}
