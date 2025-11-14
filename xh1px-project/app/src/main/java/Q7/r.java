package Q7;

import L7.i0;
import d6.InterfaceC0622h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public abstract class r extends c implements i0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4965g = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: f, reason: collision with root package name */
    public final long f4966f;

    public r(long j, r rVar, int i4) {
        super(rVar);
        this.f4966f = j;
        this.cleanedAndPointers$volatile = i4 << 16;
    }

    @Override // Q7.c
    public final boolean d() {
        if (f4965g.get(this) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (f4965g.addAndGet(this, -65536) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public abstract int g();

    public abstract void h(int i4, InterfaceC0622h interfaceC0622h);

    public final void i() {
        if (f4965g.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f4965g;
            i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 65536 + i4));
        return true;
    }
}
