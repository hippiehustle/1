package g5;

import M.n;
import P.O;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: g5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0784d extends AbstractC0786f {

    /* renamed from: c, reason: collision with root package name */
    public n f11174c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f11175d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11176e;

    /* renamed from: f, reason: collision with root package name */
    public int f11177f;

    /* renamed from: g, reason: collision with root package name */
    public int f11178g;

    /* renamed from: h, reason: collision with root package name */
    public int f11179h;

    /* renamed from: i, reason: collision with root package name */
    public VelocityTracker f11180i;

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i4) {
        z(coordinatorLayout, view, i4, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // C.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z8;
        View view2;
        int findPointerIndex;
        if (this.f11179h < 0) {
            this.f11179h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f11176e) {
            int i4 = this.f11177f;
            if (i4 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i4)) != -1) {
                int y4 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y4 - this.f11178g) > this.f11179h) {
                    this.f11178g = y4;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f11177f = -1;
            int x8 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f9904n;
            if ((weakReference == null || ((view2 = (View) weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(-1))) && coordinatorLayout.p(view, x8, y5)) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f11176e = z8;
            if (z8) {
                this.f11178g = y5;
                this.f11177f = motionEvent.getPointerId(0);
                if (this.f11180i == null) {
                    this.f11180i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f11175d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f11175d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f11180i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    @Override // C.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z8;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        if (motionEvent.getActionIndex() == 0) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        this.f11177f = motionEvent.getPointerId(i4);
                        this.f11178g = (int) (motionEvent.getY(i4) + 0.5f);
                    }
                }
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(this.f11177f);
                if (findPointerIndex != -1) {
                    int y4 = (int) motionEvent.getY(findPointerIndex);
                    int i8 = this.f11178g - y4;
                    this.f11178g = y4;
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    z(coordinatorLayout, view, y() - i8, appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange()), 0);
                }
                return false;
            }
            z8 = false;
            velocityTracker2 = this.f11180i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f11176e && !z8) {
                return false;
            }
            return true;
        }
        VelocityTracker velocityTracker3 = this.f11180i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f11180i.computeCurrentVelocity(1000);
            float yVelocity = this.f11180i.getYVelocity(this.f11177f);
            AppBarLayout appBarLayout2 = (AppBarLayout) view;
            int i9 = -appBarLayout2.getTotalScrollRange();
            Runnable runnable = this.f11174c;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.f11174c = null;
            }
            if (this.f11175d == null) {
                this.f11175d = new OverScroller(view.getContext());
            }
            this.f11175d.fling(0, w(), 0, Math.round(yVelocity), 0, 0, i9, 0);
            if (this.f11175d.computeScrollOffset()) {
                n nVar = new n(this, coordinatorLayout, view);
                this.f11174c = nVar;
                WeakHashMap weakHashMap = O.f4214a;
                view.postOnAnimation(nVar);
            } else {
                ((AppBarLayout.BaseBehavior) this).G(coordinatorLayout, appBarLayout2);
                if (appBarLayout2.f9889n) {
                    appBarLayout2.e(appBarLayout2.f(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                }
            }
            z8 = true;
            this.f11176e = false;
            this.f11177f = -1;
            velocityTracker = this.f11180i;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f11180i = null;
            }
            velocityTracker2 = this.f11180i;
            if (velocityTracker2 != null) {
            }
            if (this.f11176e) {
            }
            return true;
        }
        z8 = false;
        this.f11176e = false;
        this.f11177f = -1;
        velocityTracker = this.f11180i;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f11180i;
        if (velocityTracker2 != null) {
        }
        if (this.f11176e) {
        }
        return true;
    }

    public abstract int y();

    public abstract int z(CoordinatorLayout coordinatorLayout, View view, int i4, int i8, int i9);
}
