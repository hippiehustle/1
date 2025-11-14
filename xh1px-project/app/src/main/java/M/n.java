package M;

import P.Y;
import P.d0;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import g5.AbstractC0784d;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3297d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f3298e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3299f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3300g;

    public /* synthetic */ n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OverScroller overScroller;
        switch (this.f3297d) {
            case 0:
                try {
                    obj = ((e) this.f3298e).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f3300g).post(new E.b((f) this.f3299f, 6, obj));
                return;
            case 1:
                Y.h((View) this.f3298e, (A.i) this.f3299f);
                ((ValueAnimator) this.f3300g).start();
                return;
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3298e;
                AbstractC0784d abstractC0784d = (AbstractC0784d) this.f3300g;
                View view = (View) this.f3299f;
                if (view != null && (overScroller = abstractC0784d.f11175d) != null) {
                    if (overScroller.computeScrollOffset()) {
                        abstractC0784d.A(coordinatorLayout, view, abstractC0784d.f11175d.getCurrY());
                        view.postOnAnimation(this);
                        return;
                    }
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    ((AppBarLayout.BaseBehavior) abstractC0784d).G(coordinatorLayout, appBarLayout);
                    if (appBarLayout.f9889n) {
                        appBarLayout.e(appBarLayout.f(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public n(AbstractC0784d abstractC0784d, CoordinatorLayout coordinatorLayout, View view) {
        this.f3300g = abstractC0784d;
        this.f3298e = coordinatorLayout;
        this.f3299f = view;
    }

    public n(View view, d0 d0Var, A.i iVar, ValueAnimator valueAnimator) {
        this.f3298e = view;
        this.f3299f = iVar;
        this.f3300g = valueAnimator;
    }
}
