package L7;

import java.util.concurrent.ScheduledFuture;

/* renamed from: L7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147e implements InterfaceC0148f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3212d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3213e;

    public /* synthetic */ C0147e(int i4, Object obj) {
        this.f3212d = i4;
        this.f3213e = obj;
    }

    @Override // L7.InterfaceC0148f
    public final void b(Throwable th) {
        switch (this.f3212d) {
            case 0:
                ((ScheduledFuture) this.f3213e).cancel(false);
                return;
            case 1:
                ((M7.c) this.f3213e).m(th);
                return;
            default:
                ((H) this.f3213e).b();
                return;
        }
    }

    public final String toString() {
        switch (this.f3212d) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f3213e) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + M7.c.class.getSimpleName() + '@' + AbstractC0166y.l(this) + ']';
            default:
                return "DisposeOnCancel[" + ((H) this.f3213e) + ']';
        }
    }
}
