package c;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import i.AbstractActivityC0870i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: e, reason: collision with root package name */
    public Runnable f9331e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0870i f9333g;

    /* renamed from: d, reason: collision with root package name */
    public final long f9330d = SystemClock.uptimeMillis() + 10000;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9332f = false;

    public k(AbstractActivityC0870i abstractActivityC0870i) {
        this.f9333g = abstractActivityC0870i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9331e = runnable;
        View decorView = this.f9333g.getWindow().getDecorView();
        if (this.f9332f) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new E.a(9, this));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z8;
        Runnable runnable = this.f9331e;
        if (runnable != null) {
            runnable.run();
            this.f9331e = null;
            P6.s sVar = this.f9333g.f9340m;
            synchronized (sVar.f4588c) {
                z8 = sVar.f4587b;
            }
            if (z8) {
                this.f9332f = false;
                this.f9333g.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.f9330d) {
            this.f9332f = false;
            this.f9333g.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9333g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
