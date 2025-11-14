package S7;

import Q7.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import o6.u;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5434l = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: d, reason: collision with root package name */
    public final m f5435d;

    /* renamed from: e, reason: collision with root package name */
    public final u f5436e;

    /* renamed from: f, reason: collision with root package name */
    public b f5437f;

    /* renamed from: g, reason: collision with root package name */
    public long f5438g;

    /* renamed from: h, reason: collision with root package name */
    public long f5439h;

    /* renamed from: i, reason: collision with root package name */
    public int f5440i;
    private volatile int indexInArray;
    public boolean j;
    public final /* synthetic */ c k;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, o6.u] */
    public a(c cVar, int i4) {
        this.k = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f5435d = new m();
        this.f5436e = new Object();
        this.f5437f = b.f5444g;
        this.nextParkedWorker = c.f5449n;
        int nanoTime = (int) System.nanoTime();
        this.f5440i = nanoTime == 0 ? 42 : nanoTime;
        f(i4);
    }

    public final i a(boolean z8) {
        i e9;
        i e10;
        long j;
        b bVar = this.f5437f;
        c cVar = this.k;
        i iVar = null;
        boolean z9 = true;
        m mVar = this.f5435d;
        b bVar2 = b.f5441d;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f5447l;
            do {
                j = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f5471b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || !iVar2.f5462e) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                break;
                            }
                        }
                        iVar = iVar2;
                    }
                    int i4 = m.f5473d.get(mVar);
                    int i8 = m.f5472c.get(mVar);
                    while (true) {
                        if (i4 == i8 || m.f5474e.get(mVar) == 0) {
                            break;
                        }
                        i8--;
                        i c6 = mVar.c(i8, true);
                        if (c6 != null) {
                            iVar = c6;
                            break;
                        }
                    }
                    if (iVar == null) {
                        i iVar3 = (i) cVar.f5455i.d();
                        if (iVar3 == null) {
                            return i(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f5447l.compareAndSet(cVar, j, j - 4398046511104L));
            this.f5437f = bVar2;
        }
        if (z8) {
            if (d(cVar.f5450d * 2) != 0) {
                z9 = false;
            }
            if (z9 && (e10 = e()) != null) {
                return e10;
            }
            mVar.getClass();
            i iVar4 = (i) m.f5471b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z9 && (e9 = e()) != null) {
                return e9;
            }
        } else {
            i e11 = e();
            if (e11 != null) {
                return e11;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i4) {
        int i8 = this.f5440i;
        int i9 = i8 ^ (i8 << 13);
        int i10 = i9 ^ (i9 >> 17);
        int i11 = i10 ^ (i10 << 5);
        this.f5440i = i11;
        int i12 = i4 - 1;
        if ((i12 & i4) == 0) {
            return i11 & i12;
        }
        return (i11 & Integer.MAX_VALUE) % i4;
    }

    public final i e() {
        int d2 = d(2);
        c cVar = this.k;
        if (d2 == 0) {
            i iVar = (i) cVar.f5454h.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f5455i.d();
        }
        i iVar2 = (i) cVar.f5455i.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.f5454h.d();
    }

    public final void f(int i4) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.k.f5453g);
        sb.append("-worker-");
        if (i4 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i4);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i4;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        boolean z8;
        b bVar2 = this.f5437f;
        if (bVar2 == b.f5441d) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            c.f5447l.addAndGet(this.k, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f5437f = bVar;
        }
        return z8;
    }

    public final i i(int i4) {
        boolean z8;
        long j;
        i iVar;
        long j5;
        long j8;
        i iVar2;
        int i8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f5447l;
        c cVar = this.k;
        int i9 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i9 < 2) {
            return null;
        }
        int d2 = d(i9);
        int i10 = 0;
        long j9 = Long.MAX_VALUE;
        while (i10 < i9) {
            d2++;
            if (d2 > i9) {
                d2 = 1;
            }
            a aVar = (a) cVar.j.b(d2);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f5435d;
                if (i4 == 3) {
                    iVar = mVar.b();
                    j = 0;
                } else {
                    mVar.getClass();
                    int i11 = m.f5473d.get(mVar);
                    int i12 = m.f5472c.get(mVar);
                    if (i4 == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    while (true) {
                        if (i11 != i12) {
                            j = 0;
                            if (!z8 || m.f5474e.get(mVar) != 0) {
                                int i13 = i11 + 1;
                                iVar = mVar.c(i11, z8);
                                if (iVar != null) {
                                    break;
                                }
                                i11 = i13;
                            } else {
                                break;
                            }
                        } else {
                            j = 0;
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                u uVar = this.f5436e;
                if (iVar != null) {
                    uVar.f13642d = iVar;
                    iVar2 = iVar3;
                    j8 = -1;
                    j5 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f5471b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j5 = -1;
                            break;
                        }
                        j5 = -1;
                        if (iVar4.f5462e) {
                            i8 = 1;
                        } else {
                            i8 = 2;
                        }
                        if ((i8 & i4) == 0) {
                            break;
                        }
                        k.f5469f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f5461d;
                        long j10 = k.f5465b;
                        if (nanoTime < j10) {
                            j8 = j10 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                uVar.f13642d = iVar4;
                                j8 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j8 = -2;
                    iVar2 = iVar3;
                }
                if (j8 == j5) {
                    i iVar5 = (i) uVar.f13642d;
                    uVar.f13642d = iVar2;
                    return iVar5;
                }
                if (j8 > j) {
                    j9 = Math.min(j9, j8);
                }
            }
            i10++;
            iVar3 = null;
        }
        if (j9 == Long.MAX_VALUE) {
            j9 = 0;
        }
        this.f5439h = j9;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        boolean z8;
        loop0: while (true) {
            boolean z9 = false;
            while (c.f5448m.get(this.k) != 1) {
                b bVar = this.f5437f;
                b bVar2 = b.f5445h;
                if (bVar == bVar2) {
                    break loop0;
                }
                i a3 = a(this.j);
                if (a3 != null) {
                    this.f5439h = 0L;
                    c cVar = this.k;
                    this.f5438g = 0L;
                    if (this.f5437f == b.f5443f) {
                        this.f5437f = b.f5442e;
                    }
                    if (a3.f5462e) {
                        if (h(b.f5442e) && !cVar.p() && !cVar.n(c.f5447l.get(cVar))) {
                            cVar.p();
                        }
                        try {
                            a3.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        c.f5447l.addAndGet(cVar, -2097152L);
                        if (this.f5437f != bVar2) {
                            this.f5437f = b.f5444g;
                        }
                    } else {
                        try {
                            a3.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.j = false;
                    if (this.f5439h != 0) {
                        if (!z9) {
                            z9 = true;
                        } else {
                            h(b.f5443f);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f5439h);
                            this.f5439h = 0L;
                        }
                    } else {
                        Object obj = this.nextParkedWorker;
                        t tVar = c.f5449n;
                        if (obj != tVar) {
                            f5434l.set(this, -1);
                            while (this.nextParkedWorker != c.f5449n) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5434l;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    c cVar2 = this.k;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f5448m;
                                    if (atomicIntegerFieldUpdater2.get(cVar2) == 1) {
                                        break;
                                    }
                                    b bVar3 = this.f5437f;
                                    b bVar4 = b.f5445h;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f5443f);
                                    Thread.interrupted();
                                    if (this.f5438g == 0) {
                                        j = 2097151;
                                        this.f5438g = System.nanoTime() + this.k.f5452f;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.k.f5452f);
                                    if (System.nanoTime() - this.f5438g >= 0) {
                                        this.f5438g = 0L;
                                        c cVar3 = this.k;
                                        synchronized (cVar3.j) {
                                            try {
                                                if (atomicIntegerFieldUpdater2.get(cVar3) == 1) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                if (!z8) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f5447l;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar3) & j)) > cVar3.f5450d) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i4 = this.indexInArray;
                                                            f(0);
                                                            cVar3.j(this, i4, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j);
                                                            if (andDecrement != i4) {
                                                                Object b4 = cVar3.j.b(andDecrement);
                                                                o6.j.b(b4);
                                                                a aVar = (a) b4;
                                                                cVar3.j.c(i4, aVar);
                                                                aVar.f(i4);
                                                                cVar3.j(aVar, andDecrement, i4);
                                                            }
                                                            cVar3.j.c(andDecrement, null);
                                                            this.f5437f = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.k;
                            if (this.nextParkedWorker == tVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.k;
                                while (true) {
                                    long j5 = atomicLongFieldUpdater2.get(cVar4);
                                    int i8 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.j.b((int) (j5 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.k.compareAndSet(cVar5, j5, ((j5 + 2097152) & (-2097152)) | i8)) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            break loop0;
        }
        h(b.f5445h);
    }
}
