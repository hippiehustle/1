package M;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3295d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f3296e;

    public m(Handler handler) {
        this.f3295d = 0;
        this.f3296e = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3295d) {
            case 0:
                runnable.getClass();
                Handler handler = this.f3296e;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                this.f3296e.post(runnable);
                return;
        }
    }

    public m() {
        this.f3295d = 1;
        this.f3296e = new Handler(Looper.getMainLooper());
    }
}
