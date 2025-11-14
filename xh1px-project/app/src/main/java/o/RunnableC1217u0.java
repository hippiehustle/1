package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: o.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1217u0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC1219v0 f13392e;

    public /* synthetic */ RunnableC1217u0(AbstractViewOnTouchListenerC1219v0 abstractViewOnTouchListenerC1219v0, int i4) {
        this.f13391d = i4;
        this.f13392e = abstractViewOnTouchListenerC1219v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13391d) {
            case 0:
                ViewParent parent = this.f13392e.f13397g.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                AbstractViewOnTouchListenerC1219v0 abstractViewOnTouchListenerC1219v0 = this.f13392e;
                abstractViewOnTouchListenerC1219v0.a();
                View view = abstractViewOnTouchListenerC1219v0.f13397g;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1219v0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC1219v0.j = true;
                    return;
                }
                return;
        }
    }
}
