package p0;

import A1.n;
import H7.m;
import H7.t;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.q;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.A;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.Z;
import androidx.lifecycle.e0;
import g0.AbstractComponentCallbacksC0755y;
import g0.C0732a;
import g0.J;
import g0.P;
import g0.S;
import g0.T;
import g0.X;
import g0.b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import k0.C0946a;
import kotlin.Metadata;
import n0.AbstractC1120J;
import n0.AbstractC1143u;
import n0.C1131i;
import n0.C1134l;
import n0.C1148z;
import n0.InterfaceC1119I;
import n6.InterfaceC1162a;
import o3.C1234e;
import o6.v;
import q.C1341c;
import q.C1344f;
import u6.InterfaceC1642c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lp0/g;", "Ln0/J;", "Lp0/h;", "a", "navigation-fragment_release"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, 0, 0}, xi = 48)
@InterfaceC1119I("fragment")
/* renamed from: p0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1299g extends AbstractC1120J {

    /* renamed from: c, reason: collision with root package name */
    public final Context f13662c;

    /* renamed from: d, reason: collision with root package name */
    public final T f13663d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13664e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f13665f = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f13666g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final C0.a f13667h = new C0.a(1, this);

    /* renamed from: i, reason: collision with root package name */
    public final A1.h f13668i = new A1.h(27, this);

    /* renamed from: p0.g$a */
    /* loaded from: classes.dex */
    public static final class a extends Z {

        /* renamed from: b, reason: collision with root package name */
        public WeakReference f13669b;

        @Override // androidx.lifecycle.Z
        public final void d() {
            WeakReference weakReference = this.f13669b;
            if (weakReference != null) {
                InterfaceC1162a interfaceC1162a = (InterfaceC1162a) weakReference.get();
                if (interfaceC1162a != null) {
                    interfaceC1162a.a();
                    return;
                }
                return;
            }
            o6.j.i("completeTransition");
            throw null;
        }
    }

    public C1299g(Context context, T t8, int i4) {
        this.f13662c = context;
        this.f13663d = t8;
        this.f13664e = i4;
    }

    public static void k(C1299g c1299g, String str, int i4) {
        boolean z8;
        boolean z9;
        int W7;
        int i8 = 0;
        if ((i4 & 2) != 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        if ((i4 & 4) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList arrayList = c1299g.f13666g;
        if (z9) {
            o6.j.e(arrayList, "<this>");
            int W8 = AbstractC0437l.W(arrayList);
            if (W8 >= 0) {
                int i9 = 0;
                while (true) {
                    Object obj = arrayList.get(i8);
                    Z5.j jVar = (Z5.j) obj;
                    o6.j.e(jVar, "it");
                    if (!o6.j.a(jVar.f7485d, str)) {
                        if (i9 != i8) {
                            arrayList.set(i9, obj);
                        }
                        i9++;
                    }
                    if (i8 == W8) {
                        break;
                    } else {
                        i8++;
                    }
                }
                i8 = i9;
            }
            if (i8 < arrayList.size() && i8 <= (W7 = AbstractC0437l.W(arrayList))) {
                while (true) {
                    arrayList.remove(W7);
                    if (W7 == i8) {
                        break;
                    } else {
                        W7--;
                    }
                }
            }
        }
        arrayList.add(new Z5.j(str, Boolean.valueOf(z8)));
    }

    public static boolean n() {
        if (!Log.isLoggable("FragmentManager", 2) && !Log.isLoggable("FragmentNavigator", 2)) {
            return false;
        }
        return true;
    }

    @Override // n0.AbstractC1120J
    public final AbstractC1143u a() {
        return new AbstractC1143u(this);
    }

    @Override // n0.AbstractC1120J
    public final void d(List list, C1148z c1148z) {
        T t8 = this.f13663d;
        if (t8.P()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1131i c1131i = (C1131i) it.next();
            boolean isEmpty = ((List) b().f12771e.f4088d.f()).isEmpty();
            if (c1148z != null && !isEmpty && c1148z.f12830b && this.f13665f.remove(c1131i.f12763i)) {
                t8.y(new S(t8, c1131i.f12763i, 0), false);
                b().h(c1131i);
            } else {
                C0732a m6 = m(c1131i, c1148z);
                String str = c1131i.f12763i;
                if (!isEmpty) {
                    C1131i c1131i2 = (C1131i) AbstractC0436k.y0((List) b().f12771e.f4088d.f());
                    if (c1131i2 != null) {
                        k(this, c1131i2.f12763i, 6);
                    }
                    k(this, str, 6);
                    if (m6.f10958h) {
                        m6.f10957g = true;
                        m6.f10959i = str;
                    } else {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                }
                m6.e();
                if (n()) {
                    c1131i.toString();
                }
                b().h(c1131i);
            }
        }
    }

    @Override // n0.AbstractC1120J
    public final void e(final C1134l c1134l) {
        this.f12738a = c1134l;
        this.f12739b = true;
        X x8 = new X() { // from class: p0.f
            @Override // g0.X
            public final void a(T t8, AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
                Object obj;
                Object obj2;
                o6.j.e(t8, "<unused var>");
                o6.j.e(abstractComponentCallbacksC0755y, "fragment");
                C1134l c1134l2 = C1134l.this;
                List list = (List) c1134l2.f12771e.f4088d.f();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    obj = null;
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (o6.j.a(((C1131i) obj2).f12763i, abstractComponentCallbacksC0755y.f11088D)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                C1131i c1131i = (C1131i) obj2;
                boolean n3 = C1299g.n();
                C1299g c1299g = this;
                if (n3) {
                    abstractComponentCallbacksC0755y.toString();
                    Objects.toString(c1131i);
                    Objects.toString(c1299g.f13663d);
                }
                if (c1131i != null) {
                    C c6 = abstractComponentCallbacksC0755y.f11105V;
                    C1302j c1302j = new C1302j(new J1.a(c1299g, abstractComponentCallbacksC0755y, c1131i, 1));
                    c6.getClass();
                    C.a("observe");
                    if (abstractComponentCallbacksC0755y.f11103T.f8862d != EnumC0504o.f8846d) {
                        A a3 = new A(c6, abstractComponentCallbacksC0755y, c1302j);
                        C1344f c1344f = c6.f8768b;
                        C1341c g8 = c1344f.g(c1302j);
                        if (g8 != null) {
                            obj = g8.f13860e;
                        } else {
                            C1341c c1341c = new C1341c(c1302j, a3);
                            c1344f.f13869g++;
                            C1341c c1341c2 = c1344f.f13867e;
                            if (c1341c2 == null) {
                                c1344f.f13866d = c1341c;
                                c1344f.f13867e = c1341c;
                            } else {
                                c1341c2.f13861f = c1341c;
                                c1341c.f13862g = c1341c2;
                                c1344f.f13867e = c1341c;
                            }
                        }
                        B b4 = (B) obj;
                        if (b4 != null && !b4.d(abstractComponentCallbacksC0755y)) {
                            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
                        }
                        if (b4 == null) {
                            abstractComponentCallbacksC0755y.f11103T.a(a3);
                        }
                    }
                    abstractComponentCallbacksC0755y.f11103T.a(c1299g.f13667h);
                    c1299g.l(abstractComponentCallbacksC0755y, c1131i, c1134l2);
                }
            }
        };
        T t8 = this.f13663d;
        t8.f10914q.add(x8);
        t8.f10912o.add(new C1301i(c1134l, this));
    }

    @Override // n0.AbstractC1120J
    public final void f(C1131i c1131i) {
        String str = c1131i.f12763i;
        T t8 = this.f13663d;
        if (t8.P()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C0732a m6 = m(c1131i, null);
        List list = (List) b().f12771e.f4088d.f();
        if (list.size() > 1) {
            C1131i c1131i2 = (C1131i) AbstractC0436k.s0(AbstractC0437l.W(list) - 1, list);
            if (c1131i2 != null) {
                k(this, c1131i2.f12763i, 6);
            }
            k(this, str, 4);
            t8.y(new P(t8, str, -1), false);
            k(this, str, 2);
            if (m6.f10958h) {
                m6.f10957g = true;
                m6.f10959i = str;
            } else {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
        }
        m6.e();
        b().d(c1131i);
    }

    @Override // n0.AbstractC1120J
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f13665f;
            linkedHashSet.clear();
            q.f0(linkedHashSet, stringArrayList);
        }
    }

    @Override // n0.AbstractC1120J
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f13665f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return q4.X.k(new Z5.j("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // n0.AbstractC1120J
    public final void i(C1131i c1131i, boolean z8) {
        int i4;
        boolean z9;
        boolean z10;
        T t8 = this.f13663d;
        if (t8.P()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f12771e.f4088d.f();
        int indexOf = list.indexOf(c1131i);
        List subList = list.subList(indexOf, list.size());
        C1131i c1131i2 = (C1131i) AbstractC0436k.p0(list);
        C1131i c1131i3 = (C1131i) AbstractC0436k.s0(indexOf - 1, list);
        if (c1131i3 != null) {
            k(this, c1131i3.f12763i, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            C1131i c1131i4 = (C1131i) obj;
            t W7 = m.W(AbstractC0436k.k0(this.f13666g), new C1234e(1));
            String str = c1131i4.f12763i;
            Iterator it = W7.f2082a.iterator();
            int i8 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object m6 = W7.f2083b.m(it.next());
                    if (i8 >= 0) {
                        if (o6.j.a(str, m6)) {
                            i4 = i8;
                            break;
                        }
                        i8++;
                    } else {
                        AbstractC0437l.c0();
                        throw null;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9 && o6.j.a(c1131i4.f12763i, c1131i2.f12763i)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k(this, ((C1131i) it2.next()).f12763i, 4);
        }
        if (z8) {
            for (C1131i c1131i5 : AbstractC0436k.E0(subList)) {
                if (o6.j.a(c1131i5, c1131i2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + c1131i5);
                } else {
                    t8.y(new S(t8, c1131i5.f12763i, 1), false);
                    this.f13665f.add(c1131i5.f12763i);
                }
            }
        } else {
            t8.y(new P(t8, c1131i.f12763i, -1), false);
        }
        if (n()) {
            c1131i.toString();
        }
        b().f(c1131i, z8);
    }

    public final void l(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, C1131i c1131i, C1134l c1134l) {
        o6.j.e(abstractComponentCallbacksC0755y, "fragment");
        e0 f8 = abstractComponentCallbacksC0755y.f();
        C1.a aVar = new C1.a(2);
        aVar.a(v.f13643a.b(a.class), new C1234e(2));
        U5.d c6 = aVar.c();
        C0946a c0946a = C0946a.f11950b;
        o6.j.e(c0946a, "defaultCreationExtras");
        b0 b0Var = new b0(f8, c6, c0946a);
        InterfaceC1642c n3 = h2.a.n(a.class);
        String a3 = n3.a();
        if (a3 != null) {
            ((a) b0Var.l("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a3), n3)).f13669b = new WeakReference(new n(c1131i, c1134l, this, abstractComponentCallbacksC0755y));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final C0732a m(C1131i c1131i, C1148z c1148z) {
        int i4;
        int i8;
        int i9;
        int i10;
        AbstractC1143u abstractC1143u = c1131i.f12759e;
        o6.j.c(abstractC1143u, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle b4 = c1131i.k.b();
        String str = ((C1300h) abstractC1143u).j;
        if (str != null) {
            int i11 = 0;
            char charAt = str.charAt(0);
            Context context = this.f13662c;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            T t8 = this.f13663d;
            J I8 = t8.I();
            context.getClassLoader();
            AbstractComponentCallbacksC0755y a3 = I8.a(str);
            o6.j.d(a3, "instantiate(...)");
            a3.R(b4);
            C0732a c0732a = new C0732a(t8);
            if (c1148z != null) {
                i4 = c1148z.f12834f;
            } else {
                i4 = -1;
            }
            if (c1148z != null) {
                i8 = c1148z.f12835g;
            } else {
                i8 = -1;
            }
            if (c1148z != null) {
                i9 = c1148z.f12836h;
            } else {
                i9 = -1;
            }
            if (c1148z != null) {
                i10 = c1148z.f12837i;
            } else {
                i10 = -1;
            }
            if (i4 != -1 || i8 != -1 || i9 != -1 || i10 != -1) {
                if (i4 == -1) {
                    i4 = 0;
                }
                if (i8 == -1) {
                    i8 = 0;
                }
                if (i9 == -1) {
                    i9 = 0;
                }
                if (i10 != -1) {
                    i11 = i10;
                }
                c0732a.f10952b = i4;
                c0732a.f10953c = i8;
                c0732a.f10954d = i9;
                c0732a.f10955e = i11;
            }
            String str2 = c1131i.f12763i;
            int i12 = this.f13664e;
            if (i12 != 0) {
                c0732a.g(i12, a3, str2, 2);
                c0732a.i(a3);
                c0732a.f10964p = true;
                return c0732a;
            }
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        throw new IllegalStateException("Fragment class was not set");
    }
}
