package P;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final View f4303d;

    /* renamed from: e, reason: collision with root package name */
    public ViewTreeObserver f4304e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f4305f;

    public r(View view, Runnable runnable) {
        this.f4303d = view;
        this.f4304e = view.getViewTreeObserver();
        this.f4305f = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            r rVar = new r(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(rVar);
            view.addOnAttachStateChangeListener(rVar);
            return;
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f4304e.isAlive();
        View view = this.f4303d;
        if (isAlive) {
            this.f4304e.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f4305f.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f4304e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f4304e.isAlive();
        View view2 = this.f4303d;
        if (isAlive) {
            this.f4304e.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
