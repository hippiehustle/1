package L7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class C extends Q7.q {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3173h = AtomicIntegerFieldUpdater.newUpdater(C.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // Q7.q, L7.d0
    public final void q(Object obj) {
        s(obj);
    }

    @Override // Q7.q, L7.d0
    public final void s(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f3173h;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 == 1) {
                    Q7.b.h(E2.c.d0(this.f4964g), AbstractC0166y.r(obj));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
