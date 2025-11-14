package p0;

import O7.i0;
import a6.AbstractC0425A;
import a6.AbstractC0436k;
import androidx.lifecycle.EnumC0504o;
import g0.AbstractComponentCallbacksC0755y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import n0.C1131i;
import n0.C1134l;
import q0.C1350f;

/* renamed from: p0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1301i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1134l f13670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1299g f13671b;

    public C1301i(C1134l c1134l, C1299g c1299g) {
        this.f13670a = c1134l;
        this.f13671b = c1299g;
    }

    public final void a(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        Object obj;
        Object obj2;
        boolean z9;
        C1299g c1299g = this.f13671b;
        ArrayList arrayList = c1299g.f13666g;
        o6.j.e(abstractComponentCallbacksC0755y, "fragment");
        C1134l c1134l = this.f13670a;
        ArrayList C02 = AbstractC0436k.C0((Collection) c1134l.f12771e.f4088d.f(), (Iterable) c1134l.f12772f.f4088d.f());
        ListIterator listIterator = C02.listIterator(C02.size());
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
        boolean z10 = true;
        if (z8 && arrayList.isEmpty() && abstractComponentCallbacksC0755y.f11119o) {
            z9 = true;
        } else {
            z9 = false;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (o6.j.a(((Z5.j) next).f7485d, abstractComponentCallbacksC0755y.f11088D)) {
                obj = next;
                break;
            }
        }
        Z5.j jVar = (Z5.j) obj;
        if (jVar != null) {
            arrayList.remove(jVar);
        }
        if (!z9 && C1299g.n()) {
            abstractComponentCallbacksC0755y.toString();
            Objects.toString(c1131i);
        }
        if (jVar == null || !((Boolean) jVar.f7486e).booleanValue()) {
            z10 = false;
        }
        if (!z8 && !z10 && c1131i == null) {
            throw new IllegalArgumentException(A.j.n("The fragment ", abstractComponentCallbacksC0755y, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
        }
        if (c1131i != null) {
            c1299g.l(abstractComponentCallbacksC0755y, c1131i, c1134l);
            if (z9) {
                if (C1299g.n()) {
                    abstractComponentCallbacksC0755y.toString();
                    c1131i.toString();
                }
                c1134l.f(c1131i, false);
            }
        }
    }

    public final void b(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        Object obj;
        o6.j.e(abstractComponentCallbacksC0755y, "fragment");
        if (z8) {
            C1134l c1134l = this.f13670a;
            List list = (List) c1134l.f12771e.f4088d.f();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (o6.j.a(((C1131i) obj).f12763i, abstractComponentCallbacksC0755y.f11088D)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C1131i c1131i = (C1131i) obj;
            if (C1299g.n()) {
                abstractComponentCallbacksC0755y.toString();
                Objects.toString(c1131i);
            }
            if (c1131i != null) {
                i0 i0Var = c1134l.f12769c;
                i0Var.h(null, AbstractC0425A.h0((Set) i0Var.f(), c1131i));
                C1350f c1350f = c1134l.f12774h.f12819b;
                c1350f.getClass();
                if (c1350f.f13888f.contains(c1131i)) {
                    c1131i.a(EnumC0504o.f8849g);
                    return;
                }
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
        }
    }
}
