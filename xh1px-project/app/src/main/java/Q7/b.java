package Q7;

import L7.AbstractC0160s;
import L7.AbstractC0166y;
import L7.C0158p;
import L7.C0159q;
import L7.C0161t;
import L7.P;
import L7.X;
import L7.m0;
import L7.q0;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import f6.AbstractC0713c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final t f4931a = new t("CLOSED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final t f4932b = new t("UNDEFINED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final t f4933c = new t("REUSABLE_CLAIMED", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final t f4934d = new t("NO_THREAD_ELEMENTS", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final C0159q f4935e = new C0159q(4);

    /* renamed from: f, reason: collision with root package name */
    public static final C0159q f4936f = new C0159q(5);

    /* renamed from: g, reason: collision with root package name */
    public static final C0159q f4937g = new C0159q(6);

    public static final void a(int i4) {
        if (i4 >= 1) {
        } else {
            throw new IllegalArgumentException(A.j.l("Expected positive parallelism level, but got ", i4).toString());
        }
    }

    public static final Object b(r rVar, long j, InterfaceC1164c interfaceC1164c) {
        while (true) {
            if (rVar.f4966f >= j && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f4938d;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            t tVar = f4931a;
            if (obj == tVar) {
                return tVar;
            }
            r rVar2 = (r) ((c) obj);
            if (rVar2 == null) {
                rVar2 = (r) interfaceC1164c.l(Long.valueOf(rVar.f4966f + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.d()) {
                    rVar.e();
                }
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f4931a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(InterfaceC0622h interfaceC0622h, Throwable th) {
        Throwable runtimeException;
        Iterator it = e.f4941a.iterator();
        while (it.hasNext()) {
            try {
                ((M7.b) it.next()).N(th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    Z5.a.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            Z5.a.a(th, new DiagnosticCoroutineContextException(interfaceC0622h));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        if (obj == f4931a) {
            return true;
        }
        return false;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(InterfaceC0622h interfaceC0622h, Object obj) {
        if (obj != f4934d) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                v[] vVarArr = yVar.f4979c;
                int length = vVarArr.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i4 = length - 1;
                    v vVar = vVarArr[length];
                    o6.j.b(vVar);
                    vVar.b(yVar.f4978b[length]);
                    if (i4 >= 0) {
                        length = i4;
                    } else {
                        return;
                    }
                }
            } else {
                Object n3 = interfaceC0622h.n(null, f4936f);
                o6.j.c(n3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                ((v) n3).b(obj);
            }
        }
    }

    public static final void h(InterfaceC0617c interfaceC0617c, Object obj) {
        Object c0158p;
        q0 q0Var;
        if (interfaceC0617c instanceof f) {
            f fVar = (f) interfaceC0617c;
            AbstractC0160s abstractC0160s = fVar.f4942g;
            Throwable a3 = Z5.l.a(obj);
            if (a3 == null) {
                c0158p = obj;
            } else {
                c0158p = new C0158p(a3, false);
            }
            AbstractC0713c abstractC0713c = fVar.f4943h;
            if (j(abstractC0160s, abstractC0713c.h())) {
                fVar.f4944i = c0158p;
                fVar.f3174f = 1;
                i(abstractC0160s, abstractC0713c.h(), fVar);
                return;
            }
            P a4 = m0.a();
            if (a4.f3188f >= 4294967296L) {
                fVar.f4944i = c0158p;
                fVar.f3174f = 1;
                a4.S(fVar);
                return;
            }
            a4.U(true);
            try {
                X x8 = (X) abstractC0713c.h().B(C0161t.f3244e);
                if (x8 != null && !x8.a()) {
                    fVar.k(Z5.a.b(x8.z()));
                } else {
                    Object obj2 = fVar.j;
                    InterfaceC0622h h8 = abstractC0713c.h();
                    Object n3 = n(h8, obj2);
                    if (n3 != f4934d) {
                        q0Var = AbstractC0166y.z(abstractC0713c, h8, n3);
                    } else {
                        q0Var = null;
                    }
                    try {
                        abstractC0713c.k(obj);
                    } finally {
                        if (q0Var == null || q0Var.i0()) {
                            g(h8, n3);
                        }
                    }
                }
                do {
                } while (a4.W());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        interfaceC0617c.k(obj);
    }

    public static final void i(AbstractC0160s abstractC0160s, InterfaceC0622h interfaceC0622h, Runnable runnable) {
        try {
            abstractC0160s.N(interfaceC0622h, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, abstractC0160s, interfaceC0622h);
        }
    }

    public static final boolean j(AbstractC0160s abstractC0160s, InterfaceC0622h interfaceC0622h) {
        try {
            return abstractC0160s.P(interfaceC0622h);
        } catch (Throwable th) {
            throw new DispatchException(th, abstractC0160s, interfaceC0622h);
        }
    }

    public static final long k(String str, long j, long j5, long j8) {
        String str2;
        int i4 = u.f4970a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long V6 = I7.u.V(str2);
        if (V6 != null) {
            long longValue = V6.longValue();
            if (j5 <= longValue && longValue <= j8) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j5 + ".." + j8 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int l(String str, int i4, int i8) {
        int i9;
        if ((i8 & 8) != 0) {
            i9 = Integer.MAX_VALUE;
        } else {
            i9 = 2097150;
        }
        return (int) k(str, i4, 1, i9);
    }

    public static final Object m(InterfaceC0622h interfaceC0622h) {
        Object n3 = interfaceC0622h.n(0, f4935e);
        o6.j.b(n3);
        return n3;
    }

    public static final Object n(InterfaceC0622h interfaceC0622h, Object obj) {
        if (obj == null) {
            obj = m(interfaceC0622h);
        }
        if (obj == 0) {
            return f4934d;
        }
        if (obj instanceof Integer) {
            return interfaceC0622h.n(new y(((Number) obj).intValue(), interfaceC0622h), f4937g);
        }
        return ((v) obj).c(interfaceC0622h);
    }
}
