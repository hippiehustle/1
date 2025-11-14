package N0;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p.ExecutorC1289a;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f3567e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f3568a = new LinkedHashSet(1);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f3569b = new LinkedHashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f3570c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public volatile C f3571d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f3567e = new ExecutorC1289a(1);
        } else {
            f3567e = Executors.newCachedThreadPool(new Z0.d());
        }
    }

    public E(C0202j c0202j) {
        d(new C(c0202j));
    }

    public final synchronized void a(A a3) {
        Throwable th;
        try {
            C c6 = this.f3571d;
            if (c6 != null && (th = c6.f3565b) != null) {
                a3.onResult(th);
            }
            this.f3569b.add(a3);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(A a3) {
        C0202j c0202j;
        try {
            C c6 = this.f3571d;
            if (c6 != null && (c0202j = c6.f3564a) != null) {
                a3.onResult(c0202j);
            }
            this.f3568a.add(a3);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        C c6 = this.f3571d;
        if (c6 == null) {
            return;
        }
        C0202j c0202j = c6.f3564a;
        if (c0202j != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f3568a).iterator();
                while (it.hasNext()) {
                    ((A) it.next()).onResult(c0202j);
                }
            }
            return;
        }
        Throwable th = c6.f3565b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f3569b);
            if (arrayList.isEmpty()) {
                Z0.c.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((A) it2.next()).onResult(th);
            }
        }
    }

    public final void d(C c6) {
        if (this.f3571d == null) {
            this.f3571d = c6;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c();
                return;
            } else {
                this.f3570c.post(new E.a(6, this));
                return;
            }
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.FutureTask, N0.D, java.lang.Runnable] */
    public E(Callable callable, boolean z8) {
        if (z8) {
            try {
                d((C) callable.call());
                return;
            } catch (Throwable th) {
                d(new C(th));
                return;
            }
        }
        Executor executor = f3567e;
        ?? futureTask = new FutureTask(callable);
        futureTask.f3566d = this;
        executor.execute(futureTask);
    }
}
