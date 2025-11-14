package Q7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4953a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new m(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4953a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            int a3 = mVar.a(runnable);
            if (a3 == 0) {
                return true;
            }
            if (a3 != 1) {
                if (a3 == 2) {
                    return false;
                }
            } else {
                m c6 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c6) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4953a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.b()) {
                return;
            }
            m c6 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c6) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int c() {
        m mVar = (m) f4953a.get(this);
        mVar.getClass();
        long j = m.f4956f.get(mVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4953a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object d2 = mVar.d();
            if (d2 != m.f4957g) {
                return d2;
            }
            m c6 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c6) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
