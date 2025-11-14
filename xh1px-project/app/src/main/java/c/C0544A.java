package c;

import a6.C0433h;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import g0.AbstractComponentCallbacksC0755y;
import g0.C0744m;
import g0.H;
import g0.T;
import g0.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Objects;
import n0.AbstractC1143u;
import n0.C1146x;
import p0.C1301i;
import q0.C1350f;

/* renamed from: c.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544A {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f9296a;

    /* renamed from: b, reason: collision with root package name */
    public final C0433h f9297b = new C0433h();

    /* renamed from: c, reason: collision with root package name */
    public H f9298c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f9299d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f9300e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9301f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9302g;

    public C0544A(Runnable runnable) {
        OnBackInvokedCallback a3;
        this.f9296a = runnable;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            if (i4 >= 34) {
                a3 = x.f9366a.a(new s(0, this), new s(1, this), new t(this, 0), new t(this, 1));
            } else {
                a3 = v.f9361a.a(new t(this, 2));
            }
            this.f9299d = a3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public final void a() {
        H h8;
        H h9 = this.f9298c;
        if (h9 == null) {
            C0433h c0433h = this.f9297b;
            ListIterator listIterator = c0433h.listIterator(c0433h.g());
            while (true) {
                if (listIterator.hasPrevious()) {
                    h8 = listIterator.previous();
                    if (((H) h8).f10861a) {
                        break;
                    }
                } else {
                    h8 = 0;
                    break;
                }
            }
            h9 = h8;
        }
        this.f9298c = null;
        if (h9 != null) {
            switch (h9.f10864d) {
                case 0:
                    T t8 = (T) h9.f10865e;
                    if (T.K(3)) {
                        Objects.toString(t8);
                    }
                    H h10 = t8.j;
                    ArrayList arrayList = t8.f10912o;
                    t8.f10908i = true;
                    t8.A(true);
                    t8.f10908i = false;
                    if (t8.f10907h != null) {
                        if (!arrayList.isEmpty()) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet(T.G(t8.f10907h));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C1301i c1301i = (C1301i) it.next();
                                Iterator it2 = linkedHashSet.iterator();
                                while (it2.hasNext()) {
                                    c1301i.a((AbstractComponentCallbacksC0755y) it2.next(), true);
                                }
                            }
                        }
                        Iterator it3 = t8.f10907h.f10951a.iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = ((c0) it3.next()).f10994b;
                            if (abstractComponentCallbacksC0755y != null) {
                                abstractComponentCallbacksC0755y.f11120p = false;
                            }
                        }
                        Iterator it4 = t8.f(new ArrayList(Collections.singletonList(t8.f10907h)), 0, 1).iterator();
                        while (it4.hasNext()) {
                            C0744m c0744m = (C0744m) it4.next();
                            ArrayList arrayList2 = c0744m.f11044c;
                            c0744m.k(arrayList2);
                            c0744m.c(arrayList2);
                        }
                        Iterator it5 = t8.f10907h.f10951a.iterator();
                        while (it5.hasNext()) {
                            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = ((c0) it5.next()).f10994b;
                            if (abstractComponentCallbacksC0755y2 != null && abstractComponentCallbacksC0755y2.f11094J == null) {
                                t8.g(abstractComponentCallbacksC0755y2).k();
                            }
                        }
                        t8.f10907h = null;
                        t8.h0();
                        if (T.K(3)) {
                            boolean z8 = h10.f10861a;
                            t8.toString();
                            return;
                        }
                        return;
                    }
                    if (h10.f10861a) {
                        t8.S();
                        return;
                    } else {
                        t8.f10906g.a();
                        return;
                    }
                default:
                    C1350f c1350f = ((C1146x) h9.f10865e).f12819b;
                    if (!c1350f.f13888f.isEmpty()) {
                        AbstractC1143u f8 = c1350f.f();
                        o6.j.b(f8);
                        if (c1350f.l(f8.f12813e.f13342a, true, false)) {
                            c1350f.b();
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
        this.f9296a.run();
    }

    public final void b(boolean z8) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f9300e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f9299d) != null) {
            v vVar = v.f9361a;
            if (z8 && !this.f9301f) {
                vVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f9301f = true;
            } else if (!z8 && this.f9301f) {
                vVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f9301f = false;
            }
        }
    }

    public final void c() {
        boolean z8 = this.f9302g;
        boolean z9 = false;
        C0433h c0433h = this.f9297b;
        if (c0433h == null || !c0433h.isEmpty()) {
            Iterator<E> it = c0433h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((H) it.next()).f10861a) {
                    z9 = true;
                    break;
                }
            }
        }
        this.f9302g = z9;
        if (z9 != z8 && Build.VERSION.SDK_INT >= 33) {
            b(z9);
        }
    }
}
