package L7;

import f6.AbstractC0713c;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes.dex */
public final class n0 extends Q7.q implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final long f3225h;

    public n0(long j, AbstractC0713c abstractC0713c) {
        super(abstractC0713c, abstractC0713c.h());
        this.f3225h = j;
    }

    @Override // L7.d0
    public final String T() {
        return super.T() + "(timeMillis=" + this.f3225h + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0166y.k(this.f3198f);
        t(new TimeoutCancellationException("Timed out waiting for " + this.f3225h + " ms", this));
    }
}
