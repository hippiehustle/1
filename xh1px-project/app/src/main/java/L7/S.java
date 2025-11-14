package L7;

import d6.InterfaceC0622h;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class S extends Q implements B {

    /* renamed from: f, reason: collision with root package name */
    public final Executor f3191f;

    public S(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f3191f = executor;
        Method method2 = Q7.a.f4930a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = Q7.a.f4930a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // L7.B
    public final void M(long j, C0150h c0150h) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f3191f;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            E.b bVar = new E.b(this, 4, c0150h);
            InterfaceC0622h interfaceC0622h = c0150h.f3218h;
            try {
                scheduledFuture = scheduledExecutorService.schedule(bVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e9) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e9);
                AbstractC0166y.d(interfaceC0622h, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            c0150h.x(new C0147e(0, scheduledFuture));
        } else {
            RunnableC0167z.f3262m.M(j, c0150h);
        }
    }

    @Override // L7.AbstractC0160s
    public final void N(InterfaceC0622h interfaceC0622h, Runnable runnable) {
        try {
            this.f3191f.execute(runnable);
        } catch (RejectedExecutionException e9) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e9);
            AbstractC0166y.d(interfaceC0622h, cancellationException);
            S7.e eVar = F.f3175a;
            S7.d.f5456f.N(interfaceC0622h, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f3191f;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof S) && ((S) obj).f3191f == this.f3191f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3191f);
    }

    @Override // L7.B
    public final H p(long j, Runnable runnable, InterfaceC0622h interfaceC0622h) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f3191f;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e9) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e9);
                AbstractC0166y.d(interfaceC0622h, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new G(scheduledFuture);
        }
        return RunnableC0167z.f3262m.p(j, runnable, interfaceC0622h);
    }

    @Override // L7.AbstractC0160s
    public final String toString() {
        return this.f3191f.toString();
    }
}
