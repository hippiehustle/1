package Q7;

import L7.A;
import L7.AbstractC0160s;
import L7.B;
import L7.C0150h;
import L7.H;
import d6.InterfaceC0622h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class g extends AbstractC0160s implements B {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f4945f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0160s f4946g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4947h;

    /* renamed from: i, reason: collision with root package name */
    public final k f4948i;
    public final Object j;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(AbstractC0160s abstractC0160s, int i4) {
        B b4;
        if (abstractC0160s instanceof B) {
            b4 = (B) abstractC0160s;
        } else {
            b4 = null;
        }
        this.f4945f = b4 == null ? A.f3172a : b4;
        this.f4946g = abstractC0160s;
        this.f4947h = i4;
        this.f4948i = new k();
        this.j = new Object();
    }

    @Override // L7.B
    public final void M(long j, C0150h c0150h) {
        this.f4945f.M(j, c0150h);
    }

    @Override // L7.AbstractC0160s
    public final void N(InterfaceC0622h interfaceC0622h, Runnable runnable) {
        Runnable R5;
        this.f4948i.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
        if (atomicIntegerFieldUpdater.get(this) < this.f4947h && S() && (R5 = R()) != null) {
            try {
                b.i(this.f4946g, this, new E.b(this, R5, 7, false));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    @Override // L7.AbstractC0160s
    public final void O(InterfaceC0622h interfaceC0622h, Runnable runnable) {
        Runnable R5;
        this.f4948i.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
        if (atomicIntegerFieldUpdater.get(this) < this.f4947h && S() && (R5 = R()) != null) {
            try {
                this.f4946g.O(this, new E.b(this, R5, 7, false));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    @Override // L7.AbstractC0160s
    public final AbstractC0160s Q(int i4) {
        b.a(i4);
        if (i4 >= this.f4947h) {
            return this;
        }
        return super.Q(i4);
    }

    public final Runnable R() {
        while (true) {
            Runnable runnable = (Runnable) this.f4948i.d();
            if (runnable == null) {
                synchronized (this.j) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f4948i.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    public final boolean S() {
        synchronized (this.j) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
            if (atomicIntegerFieldUpdater.get(this) >= this.f4947h) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // L7.B
    public final H p(long j, Runnable runnable, InterfaceC0622h interfaceC0622h) {
        return this.f4945f.p(j, runnable, interfaceC0622h);
    }

    @Override // L7.AbstractC0160s
    public final String toString() {
        return this.f4946g + ".limitedParallelism(" + this.f4947h + ')';
    }
}
