package Z0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f7256d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f7257a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f7258b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f7259c;

    public d() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.f7257a = threadGroup;
        this.f7259c = "lottie-" + f7256d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f7257a, runnable, this.f7259c + this.f7258b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
