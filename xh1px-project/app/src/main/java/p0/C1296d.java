package p0;

import O7.i0;
import a6.AbstractC0425A;
import a6.AbstractC0436k;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.C0512x;
import g0.AbstractComponentCallbacksC0755y;
import g0.J;
import g0.T;
import g0.X;
import g0.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import n0.AbstractC1120J;
import n0.AbstractC1143u;
import n0.C1131i;
import n0.C1134l;
import n0.C1148z;
import n0.InterfaceC1119I;
import o6.y;
import p6.InterfaceC1315a;
import p6.InterfaceC1316b;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lp0/d;", "Ln0/J;", "Lp0/b;", "navigation-fragment_release"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, 0, 0}, xi = 48)
@InterfaceC1119I("dialog")
/* renamed from: p0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1296d extends AbstractC1120J {

    /* renamed from: c, reason: collision with root package name */
    public final Context f13653c;

    /* renamed from: d, reason: collision with root package name */
    public final T f13654d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f13655e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final B0.b f13656f = new B0.b(4, this);

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f13657g = new LinkedHashMap();

    public C1296d(Context context, T t8) {
        this.f13653c = context;
        this.f13654d = t8;
    }

    @Override // n0.AbstractC1120J
    public final AbstractC1143u a() {
        return new AbstractC1143u(this);
    }

    @Override // n0.AbstractC1120J
    public final void d(List list, C1148z c1148z) {
        T t8 = this.f13654d;
        if (t8.P()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1131i c1131i = (C1131i) it.next();
            k(c1131i).V(t8, c1131i.f12763i);
            C1131i c1131i2 = (C1131i) AbstractC0436k.y0((List) b().f12771e.f4088d.f());
            boolean l02 = AbstractC0436k.l0((Iterable) b().f12772f.f4088d.f(), c1131i2);
            b().h(c1131i);
            if (c1131i2 != null && !l02) {
                b().c(c1131i2);
            }
        }
    }

    @Override // n0.AbstractC1120J
    public final void e(C1134l c1134l) {
        C0512x c0512x;
        this.f12738a = c1134l;
        this.f12739b = true;
        Iterator it = ((List) c1134l.f12771e.f4088d.f()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            T t8 = this.f13654d;
            if (hasNext) {
                C1131i c1131i = (C1131i) it.next();
                r rVar = (r) t8.E(c1131i.f12763i);
                if (rVar != null && (c0512x = rVar.f11103T) != null) {
                    c0512x.a(this.f13656f);
                } else {
                    this.f13655e.add(c1131i.f12763i);
                }
            } else {
                t8.f10914q.add(new X() { // from class: p0.a
                    @Override // g0.X
                    public final void a(T t9, AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
                        o6.j.e(t9, "<unused var>");
                        o6.j.e(abstractComponentCallbacksC0755y, "childFragment");
                        C1296d c1296d = C1296d.this;
                        LinkedHashSet linkedHashSet = c1296d.f13655e;
                        String str = abstractComponentCallbacksC0755y.f11088D;
                        if ((linkedHashSet instanceof InterfaceC1315a) && !(linkedHashSet instanceof InterfaceC1316b)) {
                            y.g(linkedHashSet, "kotlin.collections.MutableCollection");
                            throw null;
                        }
                        if (linkedHashSet.remove(str)) {
                            abstractComponentCallbacksC0755y.f11103T.a(c1296d.f13656f);
                        }
                        LinkedHashMap linkedHashMap = c1296d.f13657g;
                        String str2 = abstractComponentCallbacksC0755y.f11088D;
                        y.a(linkedHashMap);
                        linkedHashMap.remove(str2);
                    }
                });
                return;
            }
        }
    }

    @Override // n0.AbstractC1120J
    public final void f(C1131i c1131i) {
        String str = c1131i.f12763i;
        T t8 = this.f13654d;
        if (t8.P()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        r rVar = (r) this.f13657g.get(str);
        if (rVar == null) {
            AbstractComponentCallbacksC0755y E7 = t8.E(str);
            if (E7 instanceof r) {
                rVar = (r) E7;
            } else {
                rVar = null;
            }
        }
        if (rVar != null) {
            rVar.f11103T.f(this.f13656f);
            rVar.S(false, false);
        }
        k(c1131i).V(t8, str);
        C1134l b4 = b();
        List list = (List) b4.f12771e.f4088d.f();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C1131i c1131i2 = (C1131i) listIterator.previous();
            if (o6.j.a(c1131i2.f12763i, str)) {
                i0 i0Var = b4.f12769c;
                i0Var.h(null, AbstractC0425A.h0(AbstractC0425A.h0((Set) i0Var.f(), c1131i2), c1131i));
                b4.d(c1131i);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // n0.AbstractC1120J
    public final void i(C1131i c1131i, boolean z8) {
        T t8 = this.f13654d;
        if (t8.P()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f12771e.f4088d.f();
        int indexOf = list.indexOf(c1131i);
        Iterator it = AbstractC0436k.E0(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0755y E7 = t8.E(((C1131i) it.next()).f12763i);
            if (E7 != null) {
                ((r) E7).S(false, false);
            }
        }
        l(indexOf, c1131i, z8);
    }

    public final r k(C1131i c1131i) {
        AbstractC1143u abstractC1143u = c1131i.f12759e;
        o6.j.c(abstractC1143u, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C1294b c1294b = (C1294b) abstractC1143u;
        String str = c1294b.j;
        if (str != null) {
            char charAt = str.charAt(0);
            Context context = this.f13653c;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            J I8 = this.f13654d.I();
            context.getClassLoader();
            AbstractComponentCallbacksC0755y a3 = I8.a(str);
            o6.j.d(a3, "instantiate(...)");
            if (r.class.isAssignableFrom(a3.getClass())) {
                r rVar = (r) a3;
                rVar.R(c1131i.k.b());
                rVar.f11103T.a(this.f13656f);
                this.f13657g.put(c1131i.f12763i, rVar);
                return rVar;
            }
            StringBuilder sb = new StringBuilder("Dialog destination ");
            String str2 = c1294b.j;
            if (str2 != null) {
                throw new IllegalArgumentException(A.j.r(sb, str2, " is not an instance of DialogFragment").toString());
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public final void l(int i4, C1131i c1131i, boolean z8) {
        C1131i c1131i2 = (C1131i) AbstractC0436k.s0(i4 - 1, (List) b().f12771e.f4088d.f());
        boolean l02 = AbstractC0436k.l0((Iterable) b().f12772f.f4088d.f(), c1131i2);
        b().f(c1131i, z8);
        if (c1131i2 != null && !l02) {
            b().c(c1131i2);
        }
    }
}
