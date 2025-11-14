package n0;

import O7.P;
import O7.V;
import O7.i0;
import a6.AbstractC0425A;
import a6.AbstractC0436k;
import a6.C0433h;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import n6.InterfaceC1163b;
import q0.C1347c;
import q0.C1350f;
import t7.C1594d;

/* renamed from: n0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1134l {

    /* renamed from: a, reason: collision with root package name */
    public final C1594d f12767a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f12768b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f12769c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12770d;

    /* renamed from: e, reason: collision with root package name */
    public final P f12771e;

    /* renamed from: f, reason: collision with root package name */
    public final P f12772f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1120J f12773g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1146x f12774h;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, t7.d] */
    public C1134l(C1146x c1146x, AbstractC1120J abstractC1120J) {
        o6.j.e(abstractC1120J, "navigator");
        this.f12774h = c1146x;
        this.f12767a = new Object();
        i0 c6 = V.c(a6.s.f7766d);
        this.f12768b = c6;
        i0 c9 = V.c(a6.u.f7768d);
        this.f12769c = c9;
        this.f12771e = new P(c6);
        this.f12772f = new P(c9);
        this.f12773g = abstractC1120J;
    }

    public final void a(C1131i c1131i) {
        o6.j.e(c1131i, "backStackEntry");
        synchronized (this.f12767a) {
            i0 i0Var = this.f12768b;
            ArrayList D02 = AbstractC0436k.D0((Collection) i0Var.f(), c1131i);
            i0Var.getClass();
            i0Var.h(null, D02);
        }
    }

    public final C1131i b(AbstractC1143u abstractC1143u, Bundle bundle) {
        C1350f c1350f = this.f12774h.f12819b;
        c1350f.getClass();
        return C1118H.a(c1350f.f13883a.f12820c, abstractC1143u, bundle, c1350f.h(), c1350f.f13894n);
    }

    public final void c(C1131i c1131i) {
        C1135m c1135m;
        o6.j.e(c1131i, "entry");
        C1350f c1350f = this.f12774h.f12819b;
        i0 i0Var = c1350f.f13890h;
        String str = c1131i.f12763i;
        LinkedHashMap linkedHashMap = c1350f.f13902v;
        boolean a3 = o6.j.a(linkedHashMap.get(c1131i), Boolean.TRUE);
        i0 i0Var2 = this.f12769c;
        i0Var2.h(null, AbstractC0425A.f0((Set) i0Var2.f(), c1131i));
        linkedHashMap.remove(c1131i);
        C0433h c0433h = c1350f.f13888f;
        if (!c0433h.contains(c1131i)) {
            c1350f.r(c1131i);
            if (((C0512x) c1131i.k.k).f8862d.compareTo(EnumC0504o.f8848f) >= 0) {
                c1131i.a(EnumC0504o.f8846d);
            }
            if (!c0433h.isEmpty()) {
                Iterator it = c0433h.iterator();
                while (it.hasNext()) {
                    if (o6.j.a(((C1131i) it.next()).f12763i, str)) {
                        break;
                    }
                }
            }
            if (!a3 && (c1135m = c1350f.f13894n) != null) {
                o6.j.e(str, "backStackEntryId");
                e0 e0Var = (e0) c1135m.f12775b.remove(str);
                if (e0Var != null) {
                    e0Var.a();
                }
            }
            c1350f.s();
            ArrayList o7 = c1350f.o();
            i0Var.getClass();
            i0Var.h(null, o7);
            return;
        }
        if (!this.f12770d) {
            c1350f.s();
            i0 i0Var3 = c1350f.f13889g;
            ArrayList S02 = AbstractC0436k.S0(c0433h);
            i0Var3.getClass();
            i0Var3.h(null, S02);
            ArrayList o8 = c1350f.o();
            i0Var.getClass();
            i0Var.h(null, o8);
        }
    }

    public final void d(C1131i c1131i) {
        int i4;
        synchronized (this.f12767a) {
            try {
                ArrayList S02 = AbstractC0436k.S0((Collection) this.f12771e.f4088d.f());
                ListIterator listIterator = S02.listIterator(S02.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (o6.j.a(((C1131i) listIterator.previous()).f12763i, c1131i.f12763i)) {
                            i4 = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                S02.set(i4, c1131i);
                i0 i0Var = this.f12768b;
                i0Var.getClass();
                i0Var.h(null, S02);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(C1131i c1131i, boolean z8) {
        C1350f c1350f = this.f12774h.f12819b;
        A1.n nVar = new A1.n(this, c1131i, z8);
        c1350f.getClass();
        AbstractC1120J b4 = c1350f.f13898r.b(c1131i.f12759e.f12812d);
        c1350f.f13902v.put(c1131i, Boolean.valueOf(z8));
        if (b4.equals(this.f12773g)) {
            C1347c c1347c = c1350f.f13901u;
            if (c1347c != null) {
                c1347c.m(c1131i);
                nVar.a();
                return;
            }
            C0433h c0433h = c1350f.f13888f;
            int indexOf = c0433h.indexOf(c1131i);
            if (indexOf < 0) {
                String str = "Ignoring pop of " + c1131i + " as it was not found on the current back stack";
                o6.j.e(str, "message");
                Log.i("NavController", str);
                return;
            }
            int i4 = indexOf + 1;
            if (i4 != c0433h.f7763f) {
                c1350f.l(((C1131i) c0433h.get(i4)).f12759e.f12813e.f13342a, true, false);
            }
            C1350f.n(c1350f, c1131i);
            nVar.a();
            c1350f.f13884b.a();
            c1350f.b();
            return;
        }
        Object obj = c1350f.f13899s.get(b4);
        o6.j.b(obj);
        ((C1134l) obj).e(c1131i, z8);
    }

    public final void f(C1131i c1131i, boolean z8) {
        Object obj;
        i0 i0Var = this.f12769c;
        Iterable iterable = (Iterable) i0Var.f();
        boolean z9 = iterable instanceof Collection;
        P p8 = this.f12771e;
        if (!z9 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C1131i) it.next()) == c1131i) {
                    Iterable iterable2 = (Iterable) p8.f4088d.f();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C1131i) it2.next()) == c1131i) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        i0Var.h(null, AbstractC0425A.h0((Set) i0Var.f(), c1131i));
        i0 i0Var2 = p8.f4088d;
        i0 i0Var3 = p8.f4088d;
        List list = (List) i0Var2.f();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                C1131i c1131i2 = (C1131i) obj;
                if (!o6.j.a(c1131i2, c1131i) && ((List) i0Var3.f()).lastIndexOf(c1131i2) < ((List) i0Var3.f()).lastIndexOf(c1131i)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1131i c1131i3 = (C1131i) obj;
        if (c1131i3 != null) {
            i0Var.h(null, AbstractC0425A.h0((Set) i0Var.f(), c1131i3));
        }
        e(c1131i, z8);
    }

    public final void g(C1131i c1131i) {
        o6.j.e(c1131i, "backStackEntry");
        C1350f c1350f = this.f12774h.f12819b;
        c1350f.getClass();
        AbstractC1120J b4 = c1350f.f13898r.b(c1131i.f12759e.f12812d);
        if (b4.equals(this.f12773g)) {
            InterfaceC1163b interfaceC1163b = c1350f.f13900t;
            if (interfaceC1163b != null) {
                interfaceC1163b.m(c1131i);
                a(c1131i);
                return;
            }
            String str = "Ignoring add of destination " + c1131i.f12759e + " outside of the call to navigate(). ";
            o6.j.e(str, "message");
            Log.i("NavController", str);
            return;
        }
        Object obj = c1350f.f13899s.get(b4);
        if (obj != null) {
            ((C1134l) obj).g(c1131i);
            return;
        }
        throw new IllegalStateException(A.j.r(new StringBuilder("NavigatorBackStack for "), c1131i.f12759e.f12812d, " should already be created").toString());
    }

    public final void h(C1131i c1131i) {
        i0 i0Var = this.f12769c;
        Iterable iterable = (Iterable) i0Var.f();
        boolean z8 = iterable instanceof Collection;
        P p8 = this.f12771e;
        if (!z8 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C1131i) it.next()) == c1131i) {
                    Iterable iterable2 = (Iterable) p8.f4088d.f();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C1131i) it2.next()) == c1131i) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C1131i c1131i2 = (C1131i) AbstractC0436k.y0((List) p8.f4088d.f());
        if (c1131i2 != null) {
            LinkedHashSet h02 = AbstractC0425A.h0((Set) i0Var.f(), c1131i2);
            i0Var.getClass();
            i0Var.h(null, h02);
        }
        LinkedHashSet h03 = AbstractC0425A.h0((Set) i0Var.f(), c1131i);
        i0Var.getClass();
        i0Var.h(null, h03);
        g(c1131i);
    }
}
