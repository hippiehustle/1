package N0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class D extends FutureTask {

    /* renamed from: d, reason: collision with root package name */
    public E f3566d;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f3566d.d((C) get());
            } catch (InterruptedException | ExecutionException e9) {
                this.f3566d.d(new C(e9));
            }
        } finally {
            this.f3566d = null;
        }
    }
}
