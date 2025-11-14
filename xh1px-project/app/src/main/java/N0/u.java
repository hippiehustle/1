package N0;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f3648e;

    public /* synthetic */ u(x xVar, int i4) {
        this.f3647d = i4;
        this.f3648e = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3647d) {
            case 0:
                Drawable drawable = this.f3648e;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                x xVar = this.f3648e;
                Semaphore semaphore = xVar.f3668P;
                V0.c cVar = xVar.f3686r;
                if (cVar != null) {
                    try {
                        semaphore.acquire();
                        cVar.r(xVar.f3675e.a());
                        if (x.f3651V && xVar.f3666N) {
                            if (xVar.f3669Q == null) {
                                xVar.f3669Q = new Handler(Looper.getMainLooper());
                                xVar.f3670R = new u(xVar, 0);
                            }
                            xVar.f3669Q.post(xVar.f3670R);
                        }
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        semaphore.release();
                        throw th;
                    }
                    semaphore.release();
                    return;
                }
                return;
        }
    }
}
