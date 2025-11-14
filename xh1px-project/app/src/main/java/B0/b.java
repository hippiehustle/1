package B0;

import A.i;
import Z.g;
import a6.AbstractC0436k;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0503n;
import androidx.lifecycle.InterfaceC0508t;
import androidx.lifecycle.InterfaceC0510v;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import c.AbstractC0555i;
import c.C0544A;
import c.l;
import g0.AbstractComponentCallbacksC0755y;
import g0.r;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import n0.C1131i;
import o6.j;
import p0.AbstractC1295c;
import p0.C1296d;

/* loaded from: classes.dex */
public final class b implements InterfaceC0508t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f416d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f417e;

    public /* synthetic */ b(int i4, Object obj) {
        this.f416d = i4;
        this.f417e = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0508t
    public final void a(InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n) {
        View view;
        int i4;
        switch (this.f416d) {
            case 0:
                f fVar = (f) this.f417e;
                if (enumC0503n == EnumC0503n.ON_CREATE) {
                    interfaceC0510v.g().f(this);
                    Bundle b4 = fVar.b().b("androidx.savedstate.Restarter");
                    if (b4 != null) {
                        ArrayList<String> stringArrayList = b4.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            for (String str : stringArrayList) {
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                                    j.b(asSubclass);
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            j.b(newInstance);
                                            if (fVar instanceof f0) {
                                                e0 f8 = ((f0) fVar).f();
                                                i b9 = fVar.b();
                                                f8.getClass();
                                                LinkedHashMap linkedHashMap = f8.f8840a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String str2 = (String) it.next();
                                                    j.e(str2, "key");
                                                    Z z8 = (Z) linkedHashMap.get(str2);
                                                    if (z8 != null) {
                                                        U.a(z8, b9, fVar.g());
                                                    }
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    b9.l();
                                                }
                                            } else {
                                                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + fVar).toString());
                                            }
                                        } catch (Exception e9) {
                                            throw new RuntimeException(A.j.o("Failed to instantiate ", str), e9);
                                        }
                                    } catch (NoSuchMethodException e10) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                                    }
                                } catch (ClassNotFoundException e11) {
                                    throw new RuntimeException(A.j.p("Class ", str, " wasn't found"), e11);
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                if (enumC0503n == EnumC0503n.ON_DESTROY) {
                    V5.j jVar = (V5.j) this.f417e;
                    jVar.f6440a = null;
                    jVar.f6441b = null;
                    return;
                }
                return;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                if (enumC0503n == EnumC0503n.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    C0544A c0544a = ((l) this.f417e).k;
                    OnBackInvokedDispatcher a3 = AbstractC0555i.a((l) interfaceC0510v);
                    c0544a.getClass();
                    j.e(a3, "invoker");
                    c0544a.f9300e = a3;
                    c0544a.b(c0544a.f9302g);
                    return;
                }
                return;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                if (enumC0503n == EnumC0503n.ON_STOP && (view = ((AbstractComponentCallbacksC0755y) this.f417e).K) != null) {
                    view.cancelPendingInputEvents();
                    return;
                }
                return;
            default:
                C1296d c1296d = (C1296d) this.f417e;
                int i8 = AbstractC1295c.f13652a[enumC0503n.ordinal()];
                if (i8 != 1) {
                    Object obj = null;
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                r rVar = (r) interfaceC0510v;
                                for (Object obj2 : (Iterable) c1296d.b().f12772f.f4088d.f()) {
                                    if (j.a(((C1131i) obj2).f12763i, rVar.f11088D)) {
                                        obj = obj2;
                                    }
                                }
                                C1131i c1131i = (C1131i) obj;
                                if (c1131i != null) {
                                    c1296d.b().c(c1131i);
                                }
                                rVar.f11103T.f(this);
                                return;
                            }
                            return;
                        }
                        r rVar2 = (r) interfaceC0510v;
                        if (!rVar2.U().isShowing()) {
                            List list = (List) c1296d.b().f12771e.f4088d.f();
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (j.a(((C1131i) listIterator.previous()).f12763i, rVar2.f11088D)) {
                                        i4 = listIterator.nextIndex();
                                    }
                                } else {
                                    i4 = -1;
                                }
                            }
                            C1131i c1131i2 = (C1131i) AbstractC0436k.s0(i4, list);
                            if (!j.a(AbstractC0436k.y0(list), c1131i2)) {
                                Log.i("DialogFragmentNavigator", "Dialog " + rVar2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                            }
                            if (c1131i2 != null) {
                                c1296d.l(i4, c1131i2, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    r rVar3 = (r) interfaceC0510v;
                    for (Object obj3 : (Iterable) c1296d.b().f12772f.f4088d.f()) {
                        if (j.a(((C1131i) obj3).f12763i, rVar3.f11088D)) {
                            obj = obj3;
                        }
                    }
                    C1131i c1131i3 = (C1131i) obj;
                    if (c1131i3 != null) {
                        c1296d.b().c(c1131i3);
                        return;
                    }
                    return;
                }
                r rVar4 = (r) interfaceC0510v;
                Iterable iterable = (Iterable) c1296d.b().f12771e.f4088d.f();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        if (j.a(((C1131i) it2.next()).f12763i, rVar4.f11088D)) {
                            return;
                        }
                    }
                }
                rVar4.S(false, false);
                return;
        }
    }
}
