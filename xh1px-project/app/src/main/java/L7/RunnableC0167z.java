package L7;

import d6.InterfaceC0622h;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: L7.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0167z extends O implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: m, reason: collision with root package name */
    public static final RunnableC0167z f3262m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f3263n;

    /* JADX WARN: Type inference failed for: r0v0, types: [L7.s, L7.z, L7.P] */
    static {
        Long l6;
        ?? abstractC0160s = new AbstractC0160s();
        f3262m = abstractC0160s;
        abstractC0160s.U(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l6 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l6 = 1000L;
        }
        f3263n = timeUnit.toNanos(l6.longValue());
    }

    @Override // L7.P
    public final Thread T() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f3262m.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override // L7.P
    public final void X(long j, M m6) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // L7.O
    public final void Y(Runnable runnable) {
        if (debugStatus != 4) {
            super.Y(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void d0() {
        boolean z8;
        int i4 = debugStatus;
        if (i4 != 2 && i4 != 3) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (!z8) {
            return;
        }
        debugStatus = 3;
        O.j.set(this, null);
        O.k.set(this, null);
        notifyAll();
    }

    @Override // L7.O, L7.B
    public final H p(long j, Runnable runnable, InterfaceC0622h interfaceC0622h) {
        long j5 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j5 = Long.MAX_VALUE;
            } else {
                j5 = 1000000 * j;
            }
        }
        if (j5 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            L l6 = new L(runnable, j5 + nanoTime);
            c0(nanoTime, l6);
            return l6;
        }
        return h0.f3219d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        boolean z9;
        boolean b02;
        m0.f3224a.set(this);
        try {
            synchronized (this) {
                int i4 = debugStatus;
                if (i4 != 2 && i4 != 3) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (z8) {
                    if (!b02) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long V6 = V();
                    if (V6 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f3263n + nanoTime;
                        }
                        long j5 = j - nanoTime;
                        if (j5 <= 0) {
                            _thread = null;
                            d0();
                            if (!b0()) {
                                T();
                                return;
                            }
                            return;
                        }
                        if (V6 > j5) {
                            V6 = j5;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (V6 > 0) {
                        int i8 = debugStatus;
                        if (i8 != 2 && i8 != 3) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (z9) {
                            _thread = null;
                            d0();
                            if (!b0()) {
                                T();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, V6);
                    }
                }
            }
        } finally {
            _thread = null;
            d0();
            if (!b0()) {
                T();
            }
        }
    }

    @Override // L7.O, L7.P
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // L7.AbstractC0160s
    public final String toString() {
        return "DefaultExecutor";
    }
}
