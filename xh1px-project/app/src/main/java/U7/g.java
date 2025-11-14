package U7;

import L7.InterfaceC0149g;
import L7.s0;
import Q7.r;
import Q7.t;
import Z5.y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6195f = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f6196g = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6197h = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f6198i = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f6199d;
    private volatile /* synthetic */ long deqIdx$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final D2.e f6200e;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g(int i4) {
        this.f6199d = i4;
        if (i4 > 0) {
            if (i4 >= 0) {
                j jVar = new j(0L, null, 2);
                this.head$volatile = jVar;
                this.tail$volatile = jVar;
                this._availablePermits$volatile = i4;
                this.f6200e = new D2.e(3, this);
                return;
            }
            throw new IllegalArgumentException(A.j.l("The number of acquired permits should be in 0..", i4).toString());
        }
        throw new IllegalArgumentException(A.j.l("Semaphore should have at least 1 permit, but had ", i4).toString());
    }

    public final boolean b(s0 s0Var) {
        Object b4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6197h;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f6198i.getAndIncrement(this);
        e eVar = e.f6193l;
        long j5 = andIncrement / i.f6206f;
        loop0: while (true) {
            b4 = Q7.b.b(jVar, j5, eVar);
            if (!Q7.b.e(b4)) {
                r c6 = Q7.b.c(b4);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f4966f >= c6.f4966f) {
                        break loop0;
                    }
                    if (!c6.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c6)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (c6.f()) {
                                c6.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        j jVar2 = (j) Q7.b.c(b4);
        AtomicReferenceArray atomicReferenceArray = jVar2.f6207h;
        int i4 = (int) (andIncrement % i.f6206f);
        while (!atomicReferenceArray.compareAndSet(i4, null, s0Var)) {
            if (atomicReferenceArray.get(i4) != null) {
                t tVar = i.f6202b;
                t tVar2 = i.f6203c;
                while (!atomicReferenceArray.compareAndSet(i4, tVar, tVar2)) {
                    if (atomicReferenceArray.get(i4) != tVar) {
                        return false;
                    }
                }
                ((InterfaceC0149g) s0Var).f(y.f7506a, this.f6200e);
                return true;
            }
        }
        s0Var.a(jVar2, i4);
        return true;
    }

    public final void c() {
        int i4;
        Object b4;
        boolean z8;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i8 = this.f6199d;
            if (andIncrement < i8) {
                if (andIncrement < 0) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6195f;
                    j jVar = (j) atomicReferenceFieldUpdater.get(this);
                    long andIncrement2 = f6196g.getAndIncrement(this);
                    long j5 = andIncrement2 / i.f6206f;
                    f fVar = f.f6194l;
                    while (true) {
                        b4 = Q7.b.b(jVar, j5, fVar);
                        if (Q7.b.e(b4)) {
                            break;
                        }
                        r c6 = Q7.b.c(b4);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.f4966f >= c6.f4966f) {
                                break;
                            }
                            if (!c6.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c6)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (c6.f()) {
                                        c6.e();
                                    }
                                }
                            }
                            if (rVar.f()) {
                                rVar.e();
                            }
                        }
                    }
                    j jVar2 = (j) Q7.b.c(b4);
                    AtomicReferenceArray atomicReferenceArray = jVar2.f6207h;
                    jVar2.a();
                    z8 = false;
                    if (jVar2.f4966f <= j5) {
                        int i9 = (int) (andIncrement2 % i.f6206f);
                        Object andSet = atomicReferenceArray.getAndSet(i9, i.f6202b);
                        if (andSet == null) {
                            int i10 = i.f6201a;
                            for (int i11 = 0; i11 < i10; i11++) {
                                if (atomicReferenceArray.get(i9) == i.f6203c) {
                                    z8 = true;
                                    break;
                                }
                            }
                            t tVar = i.f6202b;
                            t tVar2 = i.f6204d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i9, tVar, tVar2)) {
                                    z8 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i9) != tVar) {
                                    break;
                                }
                            }
                            z8 = !z8;
                        } else if (andSet != i.f6205e) {
                            boolean z9 = andSet instanceof InterfaceC0149g;
                            y yVar = y.f7506a;
                            if (z9) {
                                InterfaceC0149g interfaceC0149g = (InterfaceC0149g) andSet;
                                t o7 = interfaceC0149g.o(yVar, this.f6200e);
                                if (o7 != null) {
                                    interfaceC0149g.r(o7);
                                    z8 = true;
                                    break;
                                    break;
                                }
                            } else {
                                if (andSet instanceof T7.f) {
                                    if (((T7.e) ((T7.f) andSet)).g(this, yVar) != 0) {
                                    }
                                    z8 = true;
                                    break;
                                    break;
                                }
                                throw new IllegalStateException(("unexpected: " + andSet).toString());
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                do {
                    i4 = atomicIntegerFieldUpdater.get(this);
                    if (i4 <= i8) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, i8));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i8).toString());
            }
        } while (!z8);
    }
}
