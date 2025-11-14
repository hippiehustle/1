package v;

import h4.AbstractC0832f;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f15476g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f15477h = Logger.getLogger(g.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC0832f f15478i;
    public static final Object j;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f15479d;

    /* renamed from: e, reason: collision with root package name */
    public volatile c f15480e;

    /* renamed from: f, reason: collision with root package name */
    public volatile f f15481f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [h4.f] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        ?? r32;
        try {
            th = null;
            r32 = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "f"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "e"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "d"));
        } catch (Throwable th) {
            th = th;
            r32 = new Object();
        }
        f15478i = r32;
        if (th != null) {
            f15477h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        j = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f15481f;
        } while (!f15478i.c(gVar, fVar, f.f15473c));
        while (fVar != null) {
            Thread thread = fVar.f15474a;
            if (thread != null) {
                fVar.f15474a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f15475b;
        }
        do {
            cVar = gVar.f15480e;
        } while (!f15478i.a(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f15467a;
            cVar.f15467a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f15467a;
            try {
                throw null;
                break;
            } catch (RuntimeException e9) {
                f15477h.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e9);
            }
        }
    }

    public static Object c(Object obj) {
        if (!(obj instanceof C1658a)) {
            if (!(obj instanceof AbstractC1659b)) {
                if (obj == j) {
                    return null;
                }
                return obj;
            }
            ((AbstractC1659b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        Throwable th = ((C1658a) obj).f15465a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        String valueOf;
        try {
            Object d2 = d(this);
            sb.append("SUCCESS, result=[");
            if (d2 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(d2);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        C1658a c1658a;
        Object obj = this.f15479d;
        if (obj == null) {
            if (f15476g) {
                c1658a = new C1658a(new CancellationException("Future.cancel() was called."), z8);
            } else if (z8) {
                c1658a = C1658a.f15463b;
            } else {
                c1658a = C1658a.f15464c;
            }
            if (f15478i.b(this, obj, c1658a)) {
                b(this);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void e(f fVar) {
        fVar.f15474a = null;
        while (true) {
            f fVar2 = this.f15481f;
            if (fVar2 != f.f15473c) {
                f fVar3 = null;
                while (fVar2 != null) {
                    f fVar4 = fVar2.f15475b;
                    if (fVar2.f15474a != null) {
                        fVar3 = fVar2;
                    } else if (fVar3 != null) {
                        fVar3.f15475b = fVar4;
                        if (fVar3.f15474a == null) {
                            break;
                        }
                    } else if (!f15478i.c(this, fVar2, fVar4)) {
                        break;
                    }
                    fVar2 = fVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        f fVar = f.f15473c;
        long nanos = timeUnit.toNanos(j5);
        if (!Thread.interrupted()) {
            Object obj = this.f15479d;
            if (obj != null) {
                return c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                f fVar2 = this.f15481f;
                if (fVar2 != fVar) {
                    f fVar3 = new f();
                    do {
                        AbstractC0832f abstractC0832f = f15478i;
                        abstractC0832f.v(fVar3, fVar2);
                        if (abstractC0832f.c(this, fVar2, fVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f15479d;
                                    if (obj2 != null) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    e(fVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            e(fVar3);
                        } else {
                            fVar2 = this.f15481f;
                        }
                    } while (fVar2 != fVar);
                }
                return c(this.f15479d);
            }
            while (nanos > 0) {
                Object obj3 = this.f15479d;
                if (obj3 != null) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String gVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String g8 = AbstractC1149a.g(str, " (plus ");
                long j8 = -nanos;
                long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
                long nanos2 = j8 - timeUnit.toNanos(convert);
                boolean z8 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str2 = g8 + convert + " " + lowerCase;
                    if (z8) {
                        str2 = AbstractC1149a.g(str2, ",");
                    }
                    g8 = AbstractC1149a.g(str2, " ");
                }
                if (z8) {
                    g8 = g8 + nanos2 + " nanoseconds ";
                }
                str = AbstractC1149a.g(g8, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(AbstractC1149a.g(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + gVar);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15479d instanceof C1658a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.f15479d != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f15479d instanceof C1658a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e9) {
                str = "Exception thrown from implementation: " + e9.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        f fVar = f.f15473c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f15479d;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar2 = this.f15481f;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    AbstractC0832f abstractC0832f = f15478i;
                    abstractC0832f.v(fVar3, fVar2);
                    if (abstractC0832f.c(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15479d;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar2 = this.f15481f;
                } while (fVar2 != fVar);
            }
            return c(this.f15479d);
        }
        throw new InterruptedException();
    }
}
