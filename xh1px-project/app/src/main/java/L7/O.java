package L7;

import a6.C0433h;
import d6.InterfaceC0622h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class O extends P implements B {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "_delayed$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3186l = AtomicIntegerFieldUpdater.newUpdater(O.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // L7.B
    public final void M(long j5, C0150h c0150h) {
        long j8 = 0;
        if (j5 > 0) {
            if (j5 >= 9223372036854L) {
                j8 = Long.MAX_VALUE;
            } else {
                j8 = 1000000 * j5;
            }
        }
        if (j8 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            K k6 = new K(this, j8 + nanoTime, c0150h);
            c0(nanoTime, k6);
            c0150h.x(new C0147e(2, k6));
        }
    }

    @Override // L7.AbstractC0160s
    public final void N(InterfaceC0622h interfaceC0622h, Runnable runnable) {
        Y(runnable);
    }

    @Override // L7.P
    public final long V() {
        M m6;
        Runnable runnable;
        long j5;
        Q7.t tVar = AbstractC0166y.f3255c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        if (!W()) {
            Z();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                m6 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Q7.m) {
                    Q7.m mVar = (Q7.m) obj;
                    Object d2 = mVar.d();
                    if (d2 != Q7.m.f4957g) {
                        runnable = (Runnable) d2;
                        break;
                    }
                    Q7.m c6 = mVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c6) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == tVar) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C0433h c0433h = this.f3190h;
            if (c0433h == null || c0433h.isEmpty()) {
                j5 = Long.MAX_VALUE;
            } else {
                j5 = 0;
            }
            if (j5 != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof Q7.m) {
                        long j8 = Q7.m.f4956f.get((Q7.m) obj2);
                        if (((int) (1073741823 & j8)) != ((int) ((j8 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == tVar) {
                        return Long.MAX_VALUE;
                    }
                }
                N n3 = (N) k.get(this);
                if (n3 != null) {
                    synchronized (n3) {
                        M[] mArr = n3.f4976a;
                        if (mArr != null) {
                            m6 = mArr[0];
                        }
                    }
                    if (m6 != null) {
                        long nanoTime = m6.f3183d - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void Y(Runnable runnable) {
        Z();
        if (a0(runnable)) {
            Thread T5 = T();
            if (Thread.currentThread() != T5) {
                LockSupport.unpark(T5);
                return;
            }
            return;
        }
        RunnableC0167z.f3262m.Y(runnable);
    }

    public final void Z() {
        M m6;
        M m8;
        boolean z8;
        N n3 = (N) k.get(this);
        if (n3 == null || Q7.x.f4975b.get(n3) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (n3) {
                try {
                    M[] mArr = n3.f4976a;
                    m6 = null;
                    if (mArr != null) {
                        m8 = mArr[0];
                    } else {
                        m8 = null;
                    }
                    if (m8 != null) {
                        if (nanoTime - m8.f3183d >= 0) {
                            z8 = a0(m8);
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            m6 = n3.b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (m6 != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f3186l.get(this) != 1) {
                if (obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (obj instanceof Q7.m) {
                    Q7.m mVar = (Q7.m) obj;
                    int a3 = mVar.a(runnable);
                    if (a3 == 0) {
                        break;
                    }
                    if (a3 != 1) {
                        if (a3 == 2) {
                            return false;
                        }
                    } else {
                        Q7.m c6 = mVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c6) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    }
                } else {
                    if (obj == AbstractC0166y.f3255c) {
                        return false;
                    }
                    Q7.m mVar2 = new Q7.m(8, true);
                    mVar2.a((Runnable) obj);
                    mVar2.a(runnable);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r0 == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0() {
        boolean z8;
        boolean z9;
        C0433h c0433h = this.f3190h;
        if (c0433h != null) {
            z8 = c0433h.isEmpty();
        } else {
            z8 = true;
        }
        if (z8) {
            N n3 = (N) k.get(this);
            if (n3 != null) {
                if (Q7.x.f4975b.get(n3) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            Object obj = j.get(this);
            if (obj != null) {
                if (obj instanceof Q7.m) {
                    long j5 = Q7.m.f4956f.get((Q7.m) obj);
                    if (((int) (1073741823 & j5)) == ((int) ((j5 & 1152921503533105152L) >> 30))) {
                        return true;
                    }
                    return false;
                }
                if (obj == AbstractC0166y.f3255c) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [L7.N, java.lang.Object] */
    public final void c0(long j5, M m6) {
        int a3;
        Thread T5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        M m8 = null;
        if (f3186l.get(this) == 1) {
            a3 = 1;
        } else {
            N n3 = (N) atomicReferenceFieldUpdater.get(this);
            if (n3 == null) {
                ?? obj = new Object();
                obj.f3185c = j5;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                o6.j.b(obj2);
                n3 = (N) obj2;
            }
            a3 = m6.a(j5, n3, this);
        }
        if (a3 != 0) {
            if (a3 != 1) {
                if (a3 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            } else {
                X(j5, m6);
                return;
            }
        }
        N n8 = (N) atomicReferenceFieldUpdater.get(this);
        if (n8 != null) {
            synchronized (n8) {
                M[] mArr = n8.f4976a;
                if (mArr != null) {
                    m8 = mArr[0];
                }
            }
        }
        if (m8 == m6 && Thread.currentThread() != (T5 = T())) {
            LockSupport.unpark(T5);
        }
    }

    @Override // L7.B
    public H p(long j5, Runnable runnable, InterfaceC0622h interfaceC0622h) {
        return A.f3172a.p(j5, runnable, interfaceC0622h);
    }

    @Override // L7.P
    public void shutdown() {
        M m6;
        m0.f3224a.set(null);
        f3186l.set(this, 1);
        Q7.t tVar = AbstractC0166y.f3255c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, tVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else {
                if (obj instanceof Q7.m) {
                    ((Q7.m) obj).b();
                    break;
                }
                if (obj != tVar) {
                    Q7.m mVar = new Q7.m(8, true);
                    mVar.a((Runnable) obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
        }
        do {
        } while (V() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            N n3 = (N) k.get(this);
            if (n3 != null) {
                synchronized (n3) {
                    if (Q7.x.f4975b.get(n3) > 0) {
                        m6 = n3.b(0);
                    } else {
                        m6 = null;
                    }
                }
                if (m6 != null) {
                    X(nanoTime, m6);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
