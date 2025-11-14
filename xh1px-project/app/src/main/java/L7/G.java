package L7;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class G implements H {

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledFuture f3176d;

    public G(ScheduledFuture scheduledFuture) {
        this.f3176d = scheduledFuture;
    }

    @Override // L7.H
    public final void b() {
        this.f3176d.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f3176d + ']';
    }
}
