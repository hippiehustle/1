package i;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: i.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0875n implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11717d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f11718e;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f11719f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f11720g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f11721h;

    public ExecutorC0875n(Executor executor) {
        this.f11717d = 1;
        o6.j.e(executor, "executor");
        this.f11721h = executor;
        this.f11718e = new ArrayDeque();
        this.f11720g = new Object();
    }

    public final void a() {
        switch (this.f11717d) {
            case 0:
                synchronized (this.f11720g) {
                    try {
                        Runnable runnable = (Runnable) this.f11718e.poll();
                        this.f11719f = runnable;
                        if (runnable != null) {
                            ((ExecutorC0876o) this.f11721h).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.f11720g) {
                    Object poll = this.f11718e.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.f11719f = runnable2;
                    if (poll != null) {
                        this.f11721h.execute(runnable2);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11717d) {
            case 0:
                synchronized (this.f11720g) {
                    try {
                        this.f11718e.add(new G.k(this, 3, runnable));
                        if (this.f11719f == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                o6.j.e(runnable, "command");
                synchronized (this.f11720g) {
                    this.f11718e.offer(new G.k(runnable, 4, this));
                    if (this.f11719f == null) {
                        a();
                    }
                }
                return;
        }
    }

    public ExecutorC0875n(ExecutorC0876o executorC0876o) {
        this.f11717d = 0;
        this.f11720g = new Object();
        this.f11718e = new ArrayDeque();
        this.f11721h = executorC0876o;
    }
}
