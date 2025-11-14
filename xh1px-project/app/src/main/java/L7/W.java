package L7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class W extends Z {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3194i = AtomicIntegerFieldUpdater.newUpdater(W.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: h, reason: collision with root package name */
    public final A1.e f3195h;

    public W(A1.e eVar) {
        this.f3195h = eVar;
    }

    @Override // L7.Z
    public final boolean k() {
        return true;
    }

    @Override // L7.Z
    public final void l(Throwable th) {
        if (f3194i.compareAndSet(this, 0, 1)) {
            this.f3195h.m(th);
        }
    }
}
