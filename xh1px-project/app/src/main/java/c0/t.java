package c0;

import a.AbstractC0405a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class t implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9409a;

    /* renamed from: b, reason: collision with root package name */
    public final M.d f9410b;

    /* renamed from: c, reason: collision with root package name */
    public final G5.e f9411c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9412d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler f9413e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f9414f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f9415g;

    /* renamed from: h, reason: collision with root package name */
    public E2.d f9416h;

    public t(Context context, M.d dVar) {
        AbstractC0405a.l(context, "Context cannot be null");
        this.f9409a = context.getApplicationContext();
        this.f9410b = dVar;
        this.f9411c = u.f9417d;
    }

    @Override // c0.j
    public final void a(E2.d dVar) {
        synchronized (this.f9412d) {
            this.f9416h = dVar;
        }
        synchronized (this.f9412d) {
            try {
                if (this.f9416h == null) {
                    return;
                }
                if (this.f9414f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0558a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f9415g = threadPoolExecutor;
                    this.f9414f = threadPoolExecutor;
                }
                this.f9414f.execute(new E.a(11, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f9412d) {
            try {
                this.f9416h = null;
                Handler handler = this.f9413e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f9413e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f9415g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f9414f = null;
                this.f9415g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final M.j c() {
        try {
            G5.e eVar = this.f9411c;
            Context context = this.f9409a;
            M.d dVar = this.f9410b;
            eVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            M.i a3 = M.c.a(context, Collections.unmodifiableList(arrayList));
            int i4 = a3.f3287d;
            if (i4 == 0) {
                M.j[] jVarArr = (M.j[]) ((List) a3.f3288e).get(0);
                if (jVarArr != null && jVarArr.length != 0) {
                    return jVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(A.j.j(i4, "fetchFonts failed (", ")"));
        } catch (PackageManager.NameNotFoundException e9) {
            throw new RuntimeException("provider not found", e9);
        }
    }
}
