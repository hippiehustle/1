package L7;

import d6.AbstractC0615a;
import d6.C0618d;
import d6.C0623i;
import d6.InterfaceC0617c;
import d6.InterfaceC0619e;
import d6.InterfaceC0620f;
import d6.InterfaceC0621g;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0711a;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import f6.InterfaceC0714d;
import h1.C0810c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import n6.InterfaceC1164c;

/* renamed from: L7.y */
/* loaded from: classes.dex */
public abstract class AbstractC0166y {

    /* renamed from: a */
    public static final Q7.t f3253a = new Q7.t("RESUME_TOKEN", 0);

    /* renamed from: b */
    public static final Q7.t f3254b = new Q7.t("REMOVED_TASK", 0);

    /* renamed from: c */
    public static final Q7.t f3255c = new Q7.t("CLOSED_EMPTY", 0);

    /* renamed from: d */
    public static final Q7.t f3256d = new Q7.t("COMPLETING_ALREADY", 0);

    /* renamed from: e */
    public static final Q7.t f3257e = new Q7.t("COMPLETING_WAITING_CHILDREN", 0);

    /* renamed from: f */
    public static final Q7.t f3258f = new Q7.t("COMPLETING_RETRY", 0);

    /* renamed from: g */
    public static final Q7.t f3259g = new Q7.t("TOO_LATE_TO_CANCEL", 0);

    /* renamed from: h */
    public static final Q7.t f3260h = new Q7.t("SEALED", 0);

    /* renamed from: i */
    public static final J f3261i = new J(false);
    public static final J j = new J(true);

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A(InterfaceC0622h interfaceC0622h, InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        InterfaceC0622h j5;
        InterfaceC0622h h8 = interfaceC0617c.h();
        if (!((Boolean) interfaceC0622h.n(Boolean.FALSE, new C0159q(0))).booleanValue()) {
            j5 = h8.D(interfaceC0622h);
        } else {
            j5 = j(h8, interfaceC0622h, false);
        }
        i(j5);
        if (j5 == h8) {
            Q7.q qVar = new Q7.q(interfaceC0617c, j5);
            return D2.f.L(qVar, true, qVar, interfaceC1164c);
        }
        C0618d c0618d = C0618d.f10447d;
        if (o6.j.a(j5.B(c0618d), h8.B(c0618d))) {
            q0 q0Var = new q0(interfaceC0617c, j5);
            InterfaceC0622h interfaceC0622h2 = q0Var.f3198f;
            Object n3 = Q7.b.n(interfaceC0622h2, null);
            try {
                return D2.f.L(q0Var, true, q0Var, interfaceC1164c);
            } finally {
                Q7.b.g(interfaceC0622h2, n3);
            }
        }
        Q7.q qVar2 = new Q7.q(interfaceC0617c, j5);
        try {
            Q7.b.h(E2.c.d0(((AbstractC0711a) interfaceC1164c).p(qVar2, qVar2)), Z5.y.f7506a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C.f3173h;
            do {
                int i4 = atomicIntegerFieldUpdater.get(qVar2);
                if (i4 != 0) {
                    if (i4 == 2) {
                        Object y4 = y(d0.f3210d.get(qVar2));
                        if (y4 instanceof C0158p) {
                            throw ((C0158p) y4).f3235a;
                        }
                        return y4;
                    }
                    throw new IllegalStateException("Already suspended");
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(qVar2, 0, 1));
            return EnumC0646a.f10656d;
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).f12156d;
            }
            qVar2.k(Z5.a.b(th));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, o6.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(long j5, C0810c c0810c, AbstractC0713c abstractC0713c) {
        o0 o0Var;
        int i4;
        o6.u uVar;
        if (abstractC0713c instanceof o0) {
            o0 o0Var2 = (o0) abstractC0713c;
            int i8 = o0Var2.f3233i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                o0Var2.f3233i = i8 - Integer.MIN_VALUE;
                o0Var = o0Var2;
                Object obj = o0Var.f3232h;
                i4 = o0Var.f3233i;
                if (i4 == 0) {
                    if (i4 == 1) {
                        uVar = o0Var.f3231g;
                        try {
                            Z5.a.d(obj);
                            return obj;
                        } catch (TimeoutCancellationException e9) {
                            e = e9;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    if (j5 > 0) {
                        ?? obj2 = new Object();
                        try {
                            o0Var.f3231g = obj2;
                            o0Var.f3233i = 1;
                            n0 n0Var = new n0(j5, o0Var);
                            obj2.f13642d = n0Var;
                            Object v8 = v(n0Var, c0810c);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (v8 == enumC0646a) {
                                return enumC0646a;
                            }
                            return v8;
                        } catch (TimeoutCancellationException e10) {
                            e = e10;
                            uVar = obj2;
                        }
                    } else {
                        return null;
                    }
                }
                if (e.f12158d != uVar.f13642d) {
                    return null;
                }
                throw e;
            }
        }
        o0Var = new AbstractC0713c(abstractC0713c);
        Object obj3 = o0Var.f3232h;
        i4 = o0Var.f3233i;
        if (i4 == 0) {
        }
        if (e.f12158d != uVar.f13642d) {
        }
    }

    public static final Object C(AbstractC0713c abstractC0713c) {
        Q7.f fVar;
        Object obj;
        InterfaceC0622h h8 = abstractC0713c.h();
        i(h8);
        InterfaceC0617c d02 = E2.c.d0(abstractC0713c);
        if (d02 instanceof Q7.f) {
            fVar = (Q7.f) d02;
        } else {
            fVar = null;
        }
        Object obj2 = EnumC0646a.f10656d;
        Object obj3 = Z5.y.f7506a;
        if (fVar == null) {
            obj = obj3;
        } else {
            AbstractC0160s abstractC0160s = fVar.f4942g;
            if (Q7.b.j(abstractC0160s, h8)) {
                fVar.f4944i = obj3;
                fVar.f3174f = 1;
                abstractC0160s.O(h8, fVar);
            } else {
                InterfaceC0622h D7 = h8.D(new AbstractC0615a(t0.f3245e));
                fVar.f4944i = obj3;
                fVar.f3174f = 1;
                abstractC0160s.O(D7, fVar);
            }
            obj = obj2;
        }
        if (obj == obj2) {
            return obj;
        }
        return obj3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L7.d0, L7.n] */
    public static C0156n a() {
        ?? d0Var = new d0(true);
        d0Var.N(null);
        return d0Var;
    }

    public static final Q7.d b(InterfaceC0622h interfaceC0622h) {
        if (interfaceC0622h.B(C0161t.f3244e) == null) {
            interfaceC0622h = interfaceC0622h.D(new Y(null));
        }
        return new Q7.d(interfaceC0622h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L7.Y, L7.l0] */
    public static l0 c() {
        return new Y(null);
    }

    public static final void d(InterfaceC0622h interfaceC0622h, CancellationException cancellationException) {
        X x8 = (X) interfaceC0622h.B(C0161t.f3244e);
        if (x8 != null) {
            x8.d(cancellationException);
        }
    }

    public static void e(InterfaceC0163v interfaceC0163v) {
        X x8 = (X) interfaceC0163v.p().B(C0161t.f3244e);
        if (x8 != null) {
            x8.d(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0163v).toString());
        }
    }

    public static final Object f(InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        Q7.q qVar = new Q7.q(interfaceC0617c, interfaceC0617c.h());
        return D2.f.L(qVar, true, qVar, interfaceC1164c);
    }

    public static final Object g(long j5, InterfaceC0617c interfaceC0617c) {
        if (j5 > 0) {
            C0150h c0150h = new C0150h(1, E2.c.d0(interfaceC0617c));
            c0150h.v();
            if (j5 < Long.MAX_VALUE) {
                k(c0150h.f3218h).M(j5, c0150h);
            }
            Object u8 = c0150h.u();
            if (u8 == EnumC0646a.f10656d) {
                return u8;
            }
        }
        return Z5.y.f7506a;
    }

    public static final Object h(long j5, AbstractC0720j abstractC0720j) {
        Object g8 = g(x(j5), abstractC0720j);
        if (g8 == EnumC0646a.f10656d) {
            return g8;
        }
        return Z5.y.f7506a;
    }

    public static final void i(InterfaceC0622h interfaceC0622h) {
        X x8 = (X) interfaceC0622h.B(C0161t.f3244e);
        if (x8 != null && !x8.a()) {
            throw x8.z();
        }
    }

    public static final InterfaceC0622h j(InterfaceC0622h interfaceC0622h, InterfaceC0622h interfaceC0622h2, boolean z8) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) interfaceC0622h.n(bool, new C0159q(0))).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC0622h2.n(bool, new C0159q(0))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC0622h.D(interfaceC0622h2);
        }
        C0159q c0159q = new C0159q(1);
        C0623i c0623i = C0623i.f10448d;
        InterfaceC0622h interfaceC0622h3 = (InterfaceC0622h) interfaceC0622h.n(c0623i, c0159q);
        Object obj = interfaceC0622h2;
        if (booleanValue2) {
            obj = interfaceC0622h2.n(c0623i, new C0159q(2));
        }
        return interfaceC0622h3.D((InterfaceC0622h) obj);
    }

    public static final B k(InterfaceC0622h interfaceC0622h) {
        B b4;
        InterfaceC0620f B8 = interfaceC0622h.B(C0618d.f10447d);
        if (B8 instanceof B) {
            b4 = (B) B8;
        } else {
            b4 = null;
        }
        if (b4 == null) {
            return A.f3172a;
        }
        return b4;
    }

    public static final String l(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0150h m(InterfaceC0617c interfaceC0617c) {
        C0150h c0150h;
        C0150h c0150h2;
        if (!(interfaceC0617c instanceof Q7.f)) {
            return new C0150h(1, interfaceC0617c);
        }
        Q7.f fVar = (Q7.f) interfaceC0617c;
        Q7.t tVar = Q7.b.f4933c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q7.f.k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            c0150h = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, tVar);
                c0150h2 = null;
                break;
            }
            if (obj instanceof C0150h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, tVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                c0150h2 = (C0150h) obj;
                break loop0;
            }
            if (obj != tVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0150h2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0150h.j;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0150h2);
            if ((obj2 instanceof C0157o) && ((C0157o) obj2).f3229d != null) {
                c0150h2.q();
            } else {
                C0150h.f3216i.set(c0150h2, 536870911);
                atomicReferenceFieldUpdater2.set(c0150h2, C0144b.f3200d);
                c0150h = c0150h2;
            }
            if (c0150h != null) {
                return c0150h;
            }
        }
        return new C0150h(2, interfaceC0617c);
    }

    public static final void n(InterfaceC0622h interfaceC0622h, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).f12156d;
        }
        try {
            M7.b bVar = (M7.b) interfaceC0622h.B(C0161t.f3243d);
            if (bVar != null) {
                bVar.N(th);
            } else {
                Q7.b.d(interfaceC0622h, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                Z5.a.a(runtimeException, th);
                th = runtimeException;
            }
            Q7.b.d(interfaceC0622h, th);
        }
    }

    public static final H o(X x8, boolean z8, Z z9) {
        if (x8 instanceof d0) {
            return ((d0) x8).O(z8, z9);
        }
        return x8.e(z9.k(), z8, new A1.e(1, z9, Z.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [L7.k0, L7.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static final k0 p(InterfaceC0163v interfaceC0163v, InterfaceC0622h interfaceC0622h, EnumC0164w enumC0164w, InterfaceC1164c interfaceC1164c) {
        ?? r32;
        InterfaceC0622h j5 = j(interfaceC0163v.p(), interfaceC0622h, true);
        S7.e eVar = F.f3175a;
        if (j5 != eVar && j5.B(C0618d.f10447d) == null) {
            j5 = j5.D(eVar);
        }
        enumC0164w.getClass();
        if (enumC0164w == EnumC0164w.f3249e) {
            r32 = new e0(j5, interfaceC1164c);
        } else {
            r32 = new AbstractC0143a(j5, true);
        }
        r32.g0(enumC0164w, r32, interfaceC1164c);
        return r32;
    }

    public static /* synthetic */ k0 q(InterfaceC0163v interfaceC0163v, InterfaceC0622h interfaceC0622h, EnumC0164w enumC0164w, InterfaceC1164c interfaceC1164c, int i4) {
        if ((i4 & 1) != 0) {
            interfaceC0622h = C0623i.f10448d;
        }
        if ((i4 & 2) != 0) {
            enumC0164w = EnumC0164w.f3248d;
        }
        return p(interfaceC0163v, interfaceC0622h, enumC0164w, interfaceC1164c);
    }

    public static final Object r(Object obj) {
        if (obj instanceof C0158p) {
            return Z5.a.b(((C0158p) obj).f3235a);
        }
        return obj;
    }

    public static final void s(C0150h c0150h, InterfaceC0617c interfaceC0617c, boolean z8) {
        Object e9;
        q0 q0Var;
        Object obj = C0150h.j.get(c0150h);
        Throwable d2 = c0150h.d(obj);
        if (d2 != null) {
            e9 = Z5.a.b(d2);
        } else {
            e9 = c0150h.e(obj);
        }
        if (z8) {
            o6.j.c(interfaceC0617c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            Q7.f fVar = (Q7.f) interfaceC0617c;
            AbstractC0713c abstractC0713c = fVar.f4943h;
            Object obj2 = fVar.j;
            InterfaceC0622h h8 = abstractC0713c.h();
            Object n3 = Q7.b.n(h8, obj2);
            if (n3 != Q7.b.f4934d) {
                q0Var = z(abstractC0713c, h8, n3);
            } else {
                q0Var = null;
            }
            try {
                abstractC0713c.k(e9);
                if (q0Var != null && !q0Var.i0()) {
                    return;
                }
                Q7.b.g(h8, n3);
                return;
            } catch (Throwable th) {
                if (q0Var == null || q0Var.i0()) {
                    Q7.b.g(h8, n3);
                }
                throw th;
            }
        }
        interfaceC0617c.k(e9);
    }

    public static final Object t(InterfaceC0622h interfaceC0622h, InterfaceC1164c interfaceC1164c) {
        P p8;
        InterfaceC0622h j5;
        long V6;
        C0158p c0158p;
        Thread currentThread = Thread.currentThread();
        InterfaceC0621g interfaceC0621g = C0618d.f10447d;
        InterfaceC0619e interfaceC0619e = (InterfaceC0619e) interfaceC0622h.B(interfaceC0621g);
        C0623i c0623i = C0623i.f10448d;
        if (interfaceC0619e == null) {
            p8 = m0.a();
            j5 = j(c0623i, interfaceC0622h.D(p8), true);
            S7.e eVar = F.f3175a;
            if (j5 != eVar && j5.B(interfaceC0621g) == null) {
                j5 = j5.D(eVar);
            }
        } else {
            if (interfaceC0619e instanceof P) {
            }
            p8 = (P) m0.f3224a.get();
            j5 = j(c0623i, interfaceC0622h, true);
            S7.e eVar2 = F.f3175a;
            if (j5 != eVar2 && j5.B(interfaceC0621g) == null) {
                j5 = j5.D(eVar2);
            }
        }
        C0145c c0145c = new C0145c(j5, currentThread, p8);
        c0145c.g0(EnumC0164w.f3248d, c0145c, interfaceC1164c);
        P p9 = c0145c.f3204h;
        if (p9 != null) {
            int i4 = P.f3187i;
            p9.U(false);
        }
        while (true) {
            if (p9 != null) {
                try {
                    V6 = p9.V();
                } catch (Throwable th) {
                    if (p9 != null) {
                        int i8 = P.f3187i;
                        p9.R(false);
                    }
                    throw th;
                }
            } else {
                V6 = Long.MAX_VALUE;
            }
            if (c0145c.P()) {
                break;
            }
            LockSupport.parkNanos(c0145c, V6);
            if (Thread.interrupted()) {
                c0145c.t(new InterruptedException());
            }
        }
        if (p9 != null) {
            int i9 = P.f3187i;
            p9.R(false);
        }
        Object y4 = y(d0.f3210d.get(c0145c));
        if (y4 instanceof C0158p) {
            c0158p = (C0158p) y4;
        } else {
            c0158p = null;
        }
        if (c0158p == null) {
            return y4;
        }
        throw c0158p.f3235a;
    }

    public static final Object v(n0 n0Var, InterfaceC1164c interfaceC1164c) {
        o(n0Var, true, new I(0, k(n0Var.f4964g.h()).p(n0Var.f3225h, n0Var, n0Var.f3198f)));
        return D2.f.L(n0Var, false, n0Var, interfaceC1164c);
    }

    public static final String w(InterfaceC0617c interfaceC0617c) {
        Object b4;
        if (interfaceC0617c instanceof Q7.f) {
            return ((Q7.f) interfaceC0617c).toString();
        }
        try {
            b4 = interfaceC0617c + '@' + l(interfaceC0617c);
        } catch (Throwable th) {
            b4 = Z5.a.b(th);
        }
        if (Z5.l.a(b4) != null) {
            b4 = interfaceC0617c.getClass().getName() + '@' + l(interfaceC0617c);
        }
        return (String) b4;
    }

    public static final long x(long j5) {
        boolean z8;
        int i4 = J7.a.f2503g;
        if (j5 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            return J7.a.c(J7.a.f(j5, J7.f.m(999999L, J7.c.NANOSECONDS)));
        }
        if (!z8) {
            return 0L;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Object y(Object obj) {
        V v8;
        U u8;
        if (obj instanceof V) {
            v8 = (V) obj;
        } else {
            v8 = null;
        }
        if (v8 != null && (u8 = v8.f3193a) != null) {
            return u8;
        }
        return obj;
    }

    public static final q0 z(InterfaceC0617c interfaceC0617c, InterfaceC0622h interfaceC0622h, Object obj) {
        q0 q0Var = null;
        if ((interfaceC0617c instanceof InterfaceC0714d) && interfaceC0622h.B(r0.f3241d) != null) {
            InterfaceC0714d interfaceC0714d = (InterfaceC0714d) interfaceC0617c;
            while (true) {
                if ((interfaceC0714d instanceof C) || (interfaceC0714d = interfaceC0714d.g()) == null) {
                    break;
                }
                if (interfaceC0714d instanceof q0) {
                    q0Var = (q0) interfaceC0714d;
                    break;
                }
            }
            if (q0Var != null) {
                q0Var.k0(interfaceC0622h, obj);
            }
        }
        return q0Var;
    }
}
