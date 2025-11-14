package S7;

import L7.AbstractC0166y;
import Q7.p;
import Q7.t;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5447l = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5448m = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final t f5449n = new t("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f5450d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5451e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5452f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5453g;

    /* renamed from: h, reason: collision with root package name */
    public final f f5454h;

    /* renamed from: i, reason: collision with root package name */
    public final f f5455i;
    public final p j;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r4v10, types: [Q7.k, S7.f] */
    /* JADX WARN: Type inference failed for: r4v9, types: [Q7.k, S7.f] */
    public c(int i4, int i8, long j, String str) {
        this.f5450d = i4;
        this.f5451e = i8;
        this.f5452f = j;
        this.f5453g = str;
        if (i4 >= 1) {
            if (i8 >= i4) {
                if (i8 <= 2097150) {
                    if (j > 0) {
                        this.f5454h = new Q7.k();
                        this.f5455i = new Q7.k();
                        this.j = new p((i4 + 1) * 2);
                        this.controlState$volatile = i4 << 42;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(A.j.j(i8, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(A.j.i(i8, i4, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(A.j.j(i4, "Core pool size ", " should be at least 1").toString());
    }

    public static /* synthetic */ void e(c cVar, Runnable runnable, int i4) {
        boolean z8;
        if ((i4 & 4) != 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        cVar.d(runnable, false, z8);
    }

    public final int a() {
        boolean z8;
        synchronized (this.j) {
            try {
                if (f5448m.get(this) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f5447l;
                long j = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j & 2097151);
                int i8 = i4 - ((int) ((j & 4398044413952L) >> 21));
                if (i8 < 0) {
                    i8 = 0;
                }
                if (i8 >= this.f5450d) {
                    return 0;
                }
                if (i4 >= this.f5451e) {
                    return 0;
                }
                int i9 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i9 > 0 && this.j.b(i9) == null) {
                    a aVar = new a(this, i9);
                    this.j.c(i9, aVar);
                    if (i9 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i10 = i8 + 1;
                        aVar.start();
                        return i10;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        a aVar;
        int i4;
        i iVar;
        if (!f5448m.compareAndSet(this, 0, 1)) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !o6.j.a(aVar.k, this)) {
            aVar = null;
        }
        synchronized (this.j) {
            i4 = (int) (f5447l.get(this) & 2097151);
        }
        if (1 <= i4) {
            int i8 = 1;
            while (true) {
                Object b4 = this.j.b(i8);
                o6.j.b(b4);
                a aVar2 = (a) b4;
                if (aVar2 != aVar) {
                    while (aVar2.getState() != Thread.State.TERMINATED) {
                        LockSupport.unpark(aVar2);
                        aVar2.join(10000L);
                    }
                    m mVar = aVar2.f5435d;
                    f fVar = this.f5455i;
                    mVar.getClass();
                    i iVar2 = (i) m.f5471b.getAndSet(mVar, null);
                    if (iVar2 != null) {
                        fVar.a(iVar2);
                    }
                    while (true) {
                        i b9 = mVar.b();
                        if (b9 == null) {
                            break;
                        } else {
                            fVar.a(b9);
                        }
                    }
                }
                if (i8 == i4) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f5455i.b();
        this.f5454h.b();
        while (true) {
            if (aVar != null) {
                iVar = aVar.a(true);
            }
            iVar = (i) this.f5454h.d();
            if (iVar == null && (iVar = (i) this.f5455i.d()) == null) {
                break;
            }
            try {
                iVar.run();
            } catch (Throwable th) {
                Thread currentThread2 = Thread.currentThread();
                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
            }
        }
        if (aVar != null) {
            aVar.h(b.f5445h);
        }
        k.set(this, 0L);
        f5447l.set(this, 0L);
    }

    public final void d(Runnable runnable, boolean z8, boolean z9) {
        i jVar;
        long j;
        a aVar;
        boolean a3;
        b bVar;
        k.f5469f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f5461d = nanoTime;
            jVar.f5462e = z8;
        } else {
            jVar = new j(runnable, nanoTime, z8);
        }
        boolean z10 = jVar.f5462e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5447l;
        if (z10) {
            j = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !o6.j.a(aVar.k, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f5437f) != b.f5445h && (jVar.f5462e || bVar != b.f5442e)) {
            aVar.j = true;
            m mVar = aVar.f5435d;
            if (z9) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f5471b.getAndSet(mVar, jVar);
                if (iVar == null) {
                    jVar = null;
                } else {
                    jVar = mVar.a(iVar);
                }
            }
        }
        if (jVar != null) {
            if (jVar.f5462e) {
                a3 = this.f5455i.a(jVar);
            } else {
                a3 = this.f5454h.a(jVar);
            }
            if (!a3) {
                throw new RejectedExecutionException(A.j.r(new StringBuilder(), this.f5453g, " was terminated"));
            }
        }
        if (z10) {
            if (!p() && !n(j)) {
                p();
                return;
            }
            return;
        }
        if (p() || n(atomicLongFieldUpdater.get(this))) {
            return;
        }
        p();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, 6);
    }

    public final void j(a aVar, int i4, int i8) {
        while (true) {
            long j = k.get(this);
            int i9 = (int) (2097151 & j);
            long j5 = (2097152 + j) & (-2097152);
            if (i9 == i4) {
                if (i8 == 0) {
                    Object c6 = aVar.c();
                    while (true) {
                        if (c6 == f5449n) {
                            i9 = -1;
                            break;
                        }
                        if (c6 == null) {
                            i9 = 0;
                            break;
                        }
                        a aVar2 = (a) c6;
                        int b4 = aVar2.b();
                        if (b4 != 0) {
                            i9 = b4;
                            break;
                        }
                        c6 = aVar2.c();
                    }
                } else {
                    i9 = i8;
                }
            }
            if (i9 >= 0) {
                if (k.compareAndSet(this, j, i9 | j5)) {
                    return;
                }
            }
        }
    }

    public final boolean n(long j) {
        int i4 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i4 < 0) {
            i4 = 0;
        }
        int i8 = this.f5450d;
        if (i4 < i8) {
            int a3 = a();
            if (a3 == 1 && i8 > 1) {
                a();
            }
            if (a3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        t tVar;
        int i4;
        while (true) {
            long j = k.get(this);
            a aVar = (a) this.j.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j5 = (2097152 + j) & (-2097152);
                Object c6 = aVar.c();
                while (true) {
                    tVar = f5449n;
                    if (c6 == tVar) {
                        i4 = -1;
                        break;
                    }
                    if (c6 == null) {
                        i4 = 0;
                        break;
                    }
                    a aVar2 = (a) c6;
                    i4 = aVar2.b();
                    if (i4 != 0) {
                        break;
                    }
                    c6 = aVar2.c();
                }
                if (i4 >= 0) {
                    if (k.compareAndSet(this, j, i4 | j5)) {
                        aVar.g(tVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f5434l.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        int i4;
        ArrayList arrayList = new ArrayList();
        p pVar = this.j;
        int a3 = pVar.a();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < a3; i13++) {
            a aVar = (a) pVar.b(i13);
            if (aVar != null) {
                m mVar = aVar.f5435d;
                mVar.getClass();
                if (m.f5471b.get(mVar) != null) {
                    i4 = (m.f5472c.get(mVar) - m.f5473d.get(mVar)) + 1;
                } else {
                    i4 = m.f5472c.get(mVar) - m.f5473d.get(mVar);
                }
                int ordinal = aVar.f5437f.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i12++;
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                i11++;
                                if (i4 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i4);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i10++;
                        }
                    } else {
                        i9++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i4);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i8++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i4);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j = f5447l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f5453g);
        sb4.append('@');
        sb4.append(AbstractC0166y.l(this));
        sb4.append("[Pool Size {core = ");
        int i14 = this.f5450d;
        sb4.append(i14);
        sb4.append(", max = ");
        sb4.append(this.f5451e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i8);
        sb4.append(", blocking = ");
        sb4.append(i9);
        sb4.append(", parked = ");
        sb4.append(i10);
        sb4.append(", dormant = ");
        sb4.append(i11);
        sb4.append(", terminated = ");
        sb4.append(i12);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f5454h.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f5455i.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i14 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
