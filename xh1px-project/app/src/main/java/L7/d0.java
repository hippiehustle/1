package L7;

import d6.InterfaceC0620f;
import d6.InterfaceC0621g;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public class d0 implements X, j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3210d = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_state$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3211e = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public d0(boolean z8) {
        J j;
        if (z8) {
            j = AbstractC0166y.j;
        } else {
            j = AbstractC0166y.f3261i;
        }
        this._state$volatile = j;
    }

    public static C0154l U(Q7.j jVar) {
        while (jVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q7.j.f4951e;
            Q7.j f8 = jVar.f();
            if (f8 == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (Q7.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = f8;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof C0154l) {
                    return (C0154l) jVar;
                }
                if (jVar instanceof f0) {
                    return null;
                }
            }
        }
    }

    public static String b0(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (c0Var.e()) {
                return "Cancelling";
            }
            if (c0.f3205e.get(c0Var) != 1) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof U) {
            if (((U) obj).a()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof C0158p) {
            return "Cancelled";
        }
        return "Completed";
    }

    public boolean A(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (t(th) && H()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0620f B(InterfaceC0621g interfaceC0621g) {
        return E2.d.p(this, interfaceC0621g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.RuntimeException, kotlinx.coroutines.CompletionHandlerException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, kotlinx.coroutines.CompletionHandlerException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final void C(U u8, Object obj) {
        C0158p c0158p;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3211e;
        InterfaceC0153k interfaceC0153k = (InterfaceC0153k) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0153k != null) {
            interfaceC0153k.b();
            atomicReferenceFieldUpdater.set(this, h0.f3219d);
        }
        CompletionHandlerException completionHandlerException = 0;
        if (obj instanceof C0158p) {
            c0158p = (C0158p) obj;
        } else {
            c0158p = null;
        }
        if (c0158p != null) {
            th = c0158p.f3235a;
        } else {
            th = null;
        }
        if (u8 instanceof Z) {
            try {
                ((Z) u8).l(th);
                return;
            } catch (Throwable th2) {
                M(new RuntimeException("Exception in completion handler " + u8 + " for " + this, th2));
                return;
            }
        }
        f0 d2 = u8.d();
        if (d2 != null) {
            d2.e(new Q7.h(1), 1);
            Object obj2 = Q7.j.f4950d.get(d2);
            o6.j.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            Q7.j jVar = (Q7.j) obj2;
            while (!jVar.equals(d2)) {
                if (jVar instanceof Z) {
                    try {
                        ((Z) jVar).l(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != 0) {
                            Z5.a.a(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new RuntimeException("Exception in completion handler " + jVar + " for " + this, th3);
                        }
                    }
                }
                jVar = jVar.h();
                completionHandlerException = completionHandlerException;
            }
            if (completionHandlerException != 0) {
                M(completionHandlerException);
            }
        }
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h D(InterfaceC0622h interfaceC0622h) {
        return E2.d.C(this, interfaceC0622h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable E(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        d0 d0Var = (d0) ((j0) obj);
        Object obj2 = f3210d.get(d0Var);
        CancellationException cancellationException2 = null;
        if (obj2 instanceof c0) {
            cancellationException = ((c0) obj2).c();
        } else if (obj2 instanceof C0158p) {
            cancellationException = ((C0158p) obj2).f3235a;
        } else if (!(obj2 instanceof U)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new JobCancellationException("Parent job is ".concat(b0(obj2)), cancellationException, d0Var);
        }
        return cancellationException2;
    }

    public final Object F(c0 c0Var, Object obj) {
        C0158p c0158p;
        Throwable G8;
        Object obj2;
        Throwable th = null;
        if (obj instanceof C0158p) {
            c0158p = (C0158p) obj;
        } else {
            c0158p = null;
        }
        if (c0158p != null) {
            th = c0158p.f3235a;
        }
        synchronized (c0Var) {
            c0Var.e();
            ArrayList<Throwable> f8 = c0Var.f(th);
            G8 = G(c0Var, f8);
            if (G8 != null && f8.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f8.size()));
                for (Throwable th2 : f8) {
                    if (th2 != G8 && th2 != G8 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        Z5.a.a(G8, th2);
                    }
                }
            }
        }
        if (G8 != null && G8 != th) {
            obj = new C0158p(G8, false);
        }
        if (G8 != null && (w(G8) || L(G8))) {
            o6.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0158p.f3234b.compareAndSet((C0158p) obj, 0, 1);
        }
        W(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3210d;
        if (obj instanceof U) {
            obj2 = new V((U) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c0Var, obj2) && atomicReferenceFieldUpdater.get(this) == c0Var) {
        }
        C(c0Var, obj);
        return obj;
    }

    public final Throwable G(c0 c0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!c0Var.e()) {
                return null;
            }
            return new JobCancellationException(x(), null, this);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean H() {
        return true;
    }

    @Override // L7.X
    public final InterfaceC0153k I(d0 d0Var) {
        C0158p c0158p;
        C0158p c0158p2;
        C0154l c0154l = new C0154l(d0Var);
        c0154l.f3197g = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3210d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof J) {
                J j = (J) obj;
                if (j.f3179d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0154l)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Y(j);
            } else {
                boolean z8 = obj instanceof U;
                h0 h0Var = h0.f3219d;
                Throwable th = null;
                if (z8) {
                    f0 d2 = ((U) obj).d();
                    if (d2 == null) {
                        o6.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        Z((Z) obj);
                    } else if (!d2.e(c0154l, 7)) {
                        boolean e9 = d2.e(c0154l, 3);
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof c0) {
                            th = ((c0) obj2).c();
                        } else {
                            if (obj2 instanceof C0158p) {
                                c0158p2 = (C0158p) obj2;
                            } else {
                                c0158p2 = null;
                            }
                            if (c0158p2 != null) {
                                th = c0158p2.f3235a;
                            }
                        }
                        c0154l.l(th);
                        if (e9) {
                            break loop0;
                        }
                        return h0Var;
                    }
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C0158p) {
                        c0158p = (C0158p) obj3;
                    } else {
                        c0158p = null;
                    }
                    if (c0158p != null) {
                        th = c0158p.f3235a;
                    }
                    c0154l.l(th);
                    return h0Var;
                }
            }
        }
        return c0154l;
    }

    public boolean J() {
        return this instanceof C0156n;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [L7.f0, Q7.j] */
    public final f0 K(U u8) {
        f0 d2 = u8.d();
        if (d2 == null) {
            if (u8 instanceof J) {
                return new Q7.j();
            }
            if (u8 instanceof Z) {
                Z((Z) u8);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + u8).toString());
        }
        return d2;
    }

    public boolean L(Throwable th) {
        return false;
    }

    public final void N(X x8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3211e;
        h0 h0Var = h0.f3219d;
        if (x8 == null) {
            atomicReferenceFieldUpdater.set(this, h0Var);
            return;
        }
        x8.start();
        InterfaceC0153k I8 = x8.I(this);
        atomicReferenceFieldUpdater.set(this, I8);
        if (P()) {
            I8.b();
            atomicReferenceFieldUpdater.set(this, h0Var);
        }
    }

    public final H O(boolean z8, Z z9) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h0 h0Var;
        boolean z10;
        Throwable th;
        C0158p c0158p;
        boolean e9;
        c0 c0Var;
        Throwable th2;
        z9.f3197g = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f3210d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj instanceof J;
            h0Var = h0.f3219d;
            z10 = true;
            th = null;
            if (z11) {
                J j = (J) obj;
                if (j.f3179d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z9)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Y(j);
            } else if (obj instanceof U) {
                U u8 = (U) obj;
                f0 d2 = u8.d();
                if (d2 == null) {
                    o6.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Z((Z) obj);
                } else {
                    if (z9.k()) {
                        if (u8 instanceof c0) {
                            c0Var = (c0) u8;
                        } else {
                            c0Var = null;
                        }
                        if (c0Var != null) {
                            th2 = c0Var.c();
                        } else {
                            th2 = null;
                        }
                        if (th2 == null) {
                            e9 = d2.e(z9, 5);
                        } else if (z8) {
                            z9.l(th2);
                            return h0Var;
                        }
                    } else {
                        e9 = d2.e(z9, 1);
                    }
                    if (e9) {
                        break;
                    }
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return z9;
        }
        if (z8) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C0158p) {
                c0158p = (C0158p) obj2;
            } else {
                c0158p = null;
            }
            if (c0158p != null) {
                th = c0158p.f3235a;
            }
            z9.l(th);
        }
        return h0Var;
    }

    public final boolean P() {
        return !(f3210d.get(this) instanceof U);
    }

    public boolean Q() {
        return this instanceof C0145c;
    }

    public final boolean R(Object obj) {
        Object c02;
        do {
            c02 = c0(f3210d.get(this), obj);
            if (c02 == AbstractC0166y.f3256d) {
                return false;
            }
            if (c02 == AbstractC0166y.f3257e) {
                return true;
            }
        } while (c02 == AbstractC0166y.f3258f);
        q(c02);
        return true;
    }

    public final Object S(Object obj) {
        Object c02;
        C0158p c0158p;
        do {
            c02 = c0(f3210d.get(this), obj);
            if (c02 == AbstractC0166y.f3256d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C0158p) {
                    c0158p = (C0158p) obj;
                } else {
                    c0158p = null;
                }
                if (c0158p != null) {
                    th = c0158p.f3235a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (c02 == AbstractC0166y.f3258f);
        return c02;
    }

    public String T() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable, kotlinx.coroutines.CompletionHandlerException] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final void V(f0 f0Var, Throwable th) {
        f0Var.e(new Q7.h(4), 4);
        Object obj = Q7.j.f4950d.get(f0Var);
        o6.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        Q7.j jVar = (Q7.j) obj;
        CompletionHandlerException completionHandlerException = 0;
        while (!jVar.equals(f0Var)) {
            if ((jVar instanceof Z) && ((Z) jVar).k()) {
                try {
                    ((Z) jVar).l(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != 0) {
                        Z5.a.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new RuntimeException("Exception in completion handler " + jVar + " for " + this, th2);
                    }
                }
            }
            jVar = jVar.h();
            completionHandlerException = completionHandlerException;
        }
        if (completionHandlerException != 0) {
            M(completionHandlerException);
        }
        w(th);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L7.f0, Q7.j] */
    public final void Y(J j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? jVar = new Q7.j();
        T t8 = jVar;
        if (!j.f3179d) {
            t8 = new T(jVar);
        }
        do {
            atomicReferenceFieldUpdater = f3210d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, j, t8)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == j);
    }

    public final void Z(Z z8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Q7.j jVar = new Q7.j();
        z8.getClass();
        Q7.j.f4951e.set(jVar, z8);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Q7.j.f4950d;
        atomicReferenceFieldUpdater2.set(jVar, z8);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(z8) != z8) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(z8, z8, jVar)) {
                if (atomicReferenceFieldUpdater2.get(z8) != z8) {
                    break;
                }
            }
            jVar.g(z8);
        }
        Q7.j h8 = z8.h();
        do {
            atomicReferenceFieldUpdater = f3210d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, z8, h8)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == z8);
    }

    @Override // L7.X
    public boolean a() {
        Object obj = f3210d.get(this);
        if ((obj instanceof U) && ((U) obj).a()) {
            return true;
        }
        return false;
    }

    public final int a0(Object obj) {
        boolean z8 = obj instanceof J;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3210d;
        if (z8) {
            if (!((J) obj).f3179d) {
                J j = AbstractC0166y.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, j)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                X();
                return 1;
            }
            return 0;
        }
        if (obj instanceof T) {
            f0 f0Var = ((T) obj).f3192d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            X();
            return 1;
        }
        return 0;
    }

    public final Object c0(Object obj, Object obj2) {
        Object obj3;
        c0 c0Var;
        boolean z8;
        C0158p c0158p;
        if (!(obj instanceof U)) {
            return AbstractC0166y.f3256d;
        }
        if (((obj instanceof J) || (obj instanceof Z)) && !(obj instanceof C0154l) && !(obj2 instanceof C0158p)) {
            U u8 = (U) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3210d;
            if (obj2 instanceof U) {
                obj3 = new V((U) obj2);
            } else {
                obj3 = obj2;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, u8, obj3)) {
                if (atomicReferenceFieldUpdater.get(this) != u8) {
                    return AbstractC0166y.f3258f;
                }
            }
            W(obj2);
            C(u8, obj2);
            return obj2;
        }
        U u9 = (U) obj;
        f0 K = K(u9);
        if (K == null) {
            return AbstractC0166y.f3258f;
        }
        Throwable th = null;
        if (u9 instanceof c0) {
            c0Var = (c0) u9;
        } else {
            c0Var = null;
        }
        if (c0Var == null) {
            c0Var = new c0(K, null);
        }
        synchronized (c0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c0.f3205e;
            if (atomicIntegerFieldUpdater.get(c0Var) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                return AbstractC0166y.f3256d;
            }
            atomicIntegerFieldUpdater.set(c0Var, 1);
            if (c0Var != u9) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3210d;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, u9, c0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != u9) {
                        return AbstractC0166y.f3258f;
                    }
                }
            }
            boolean e9 = c0Var.e();
            if (obj2 instanceof C0158p) {
                c0158p = (C0158p) obj2;
            } else {
                c0158p = null;
            }
            if (c0158p != null) {
                c0Var.b(c0158p.f3235a);
            }
            Throwable c6 = c0Var.c();
            if (!e9) {
                th = c6;
            }
            if (th != null) {
                V(K, th);
            }
            C0154l U8 = U(K);
            if (U8 != null && d0(c0Var, U8, obj2)) {
                return AbstractC0166y.f3257e;
            }
            K.e(new Q7.h(2), 2);
            C0154l U9 = U(K);
            if (U9 != null && d0(c0Var, U9, obj2)) {
                return AbstractC0166y.f3257e;
            }
            return F(c0Var, obj2);
        }
    }

    @Override // L7.X
    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(x(), null, this);
        }
        u(cancellationException);
    }

    public final boolean d0(c0 c0Var, C0154l c0154l, Object obj) {
        while (AbstractC0166y.o(c0154l.f3223h, false, new b0(this, c0Var, c0154l, obj)) == h0.f3219d) {
            c0154l = U(c0154l);
            if (c0154l == null) {
                return false;
            }
        }
        return true;
    }

    @Override // L7.X
    public final H e(boolean z8, boolean z9, A1.e eVar) {
        Z i4;
        if (z8) {
            i4 = new W(eVar);
        } else {
            i4 = new I(1, eVar);
        }
        return O(z9, i4);
    }

    @Override // d6.InterfaceC0620f
    public final InterfaceC0621g getKey() {
        return C0161t.f3244e;
    }

    @Override // L7.X
    public final H j(X.W w8) {
        return O(true, new I(1, w8));
    }

    @Override // d6.InterfaceC0622h
    public final Object n(Object obj, InterfaceC1164c interfaceC1164c) {
        return interfaceC1164c.l(obj, this);
    }

    public void s(Object obj) {
        q(obj);
    }

    @Override // L7.X
    public final boolean start() {
        int a02;
        do {
            a02 = a0(f3210d.get(this));
            if (a02 == 0) {
                return false;
            }
        } while (a02 != 1);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r0 = L7.AbstractC0166y.f3256d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 != L7.AbstractC0166y.f3257e) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0106, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        r0 = c0(r0, new L7.C0158p(E(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r0 == L7.AbstractC0166y.f3258f) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r0 != L7.AbstractC0166y.f3256d) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r4 = L7.d0.f3210d;
        r5 = r4.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if ((r5 instanceof L7.c0) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if ((r5 instanceof L7.U) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        r1 = E(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        r6 = (L7.U) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (J() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        if (r6.a() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        r4 = c0(r5, new L7.C0158p(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        if (r4 == L7.AbstractC0166y.f3256d) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:
    
        if (r4 == L7.AbstractC0166y.f3258f) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = L7.d0.f3210d.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r5).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        r7 = K(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
    
        if (r7 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        r8 = new L7.c0(r7, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        if (r4.compareAndSet(r9, r6, r8) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r0 instanceof L7.U) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ca, code lost:
    
        if (r4.get(r9) == r6) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
    
        V(r7, r1);
        r10 = L7.AbstractC0166y.f3256d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006a, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f9, code lost:
    
        r10 = L7.AbstractC0166y.f3259g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0051, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0052, code lost:
    
        r4 = (L7.c0) r5;
        r4.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0060, code lost:
    
        if (L7.c0.f3207g.get(r4) != L7.AbstractC0166y.f3260h) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0062, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0065, code lost:
    
        if (r4 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0067, code lost:
    
        r10 = L7.AbstractC0166y.f3259g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0069, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006f, code lost:
    
        r4 = ((L7.c0) r5).e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r0 instanceof L7.c0) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0076, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0078, code lost:
    
        r1 = E(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x007c, code lost:
    
        ((L7.c0) r5).b(r1);
        r10 = ((L7.c0) r5).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0089, code lost:
    
        if (r4 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x008b, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x008c, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008d, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x008f, code lost:
    
        V(((L7.c0) r5).f3208d, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0096, code lost:
    
        r10 = L7.AbstractC0166y.f3256d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0064, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r1 = (L7.c0) r0;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ff, code lost:
    
        if (r0 != L7.AbstractC0166y.f3256d) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0104, code lost:
    
        if (r0 != L7.AbstractC0166y.f3257e) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0109, code lost:
    
        if (r0 != L7.AbstractC0166y.f3259g) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x010c, code lost:
    
        q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (L7.c0.f3205e.get(r1) != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x010f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(Object obj) {
        Object obj2 = AbstractC0166y.f3256d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(T() + '{' + b0(f3210d.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0166y.l(this));
        return sb.toString();
    }

    public void u(CancellationException cancellationException) {
        t(cancellationException);
    }

    @Override // L7.X
    public final Object v(AbstractC0713c abstractC0713c) {
        Object obj;
        Z5.y yVar;
        do {
            obj = f3210d.get(this);
            boolean z8 = obj instanceof U;
            yVar = Z5.y.f7506a;
            if (!z8) {
                AbstractC0166y.i(abstractC0713c.h());
                return yVar;
            }
        } while (a0(obj) < 0);
        C0150h c0150h = new C0150h(1, E2.c.d0(abstractC0713c));
        c0150h.v();
        c0150h.x(new C0147e(2, AbstractC0166y.o(this, true, new C0152j(c0150h, 1))));
        Object u8 = c0150h.u();
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (u8 != enumC0646a) {
            u8 = yVar;
        }
        if (u8 == enumC0646a) {
            return u8;
        }
        return yVar;
    }

    public final boolean w(Throwable th) {
        if (!Q()) {
            boolean z8 = th instanceof CancellationException;
            InterfaceC0153k interfaceC0153k = (InterfaceC0153k) f3211e.get(this);
            if (interfaceC0153k != null && interfaceC0153k != h0.f3219d) {
                if (!interfaceC0153k.c(th) && !z8) {
                    return false;
                }
                return true;
            }
            return z8;
        }
        return true;
    }

    public String x() {
        return "Job was cancelled";
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h y(InterfaceC0621g interfaceC0621g) {
        return E2.d.z(this, interfaceC0621g);
    }

    @Override // L7.X
    public final CancellationException z() {
        Object obj = f3210d.get(this);
        CancellationException cancellationException = null;
        if (obj instanceof c0) {
            Throwable c6 = ((c0) obj).c();
            if (c6 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c6 instanceof CancellationException) {
                    cancellationException = (CancellationException) c6;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = x();
                    }
                    return new JobCancellationException(concat, c6, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(obj instanceof U)) {
            if (obj instanceof C0158p) {
                Throwable th = ((C0158p) obj).f3235a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new JobCancellationException(x(), th, this);
                }
                return cancellationException;
            }
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public void X() {
    }

    public void M(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public void W(Object obj) {
    }

    public void q(Object obj) {
    }
}
