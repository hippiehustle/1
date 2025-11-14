package S7;

import Q7.u;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5464a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f5465b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5466c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5467d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f5468e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f5469f;

    static {
        String str;
        int i4 = u.f4970a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f5464a = str;
        f5465b = Q7.b.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i8 = u.f4970a;
        if (i8 < 2) {
            i8 = 2;
        }
        f5466c = Q7.b.l("kotlinx.coroutines.scheduler.core.pool.size", i8, 8);
        f5467d = Q7.b.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f5468e = TimeUnit.SECONDS.toNanos(Q7.b.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f5469f = g.f5459a;
    }
}
