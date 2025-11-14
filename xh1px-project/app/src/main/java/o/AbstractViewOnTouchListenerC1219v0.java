package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import n.InterfaceC1101C;

/* renamed from: o.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1219v0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final float f13394d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13395e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13396f;

    /* renamed from: g, reason: collision with root package name */
    public final View f13397g;

    /* renamed from: h, reason: collision with root package name */
    public RunnableC1217u0 f13398h;

    /* renamed from: i, reason: collision with root package name */
    public RunnableC1217u0 f13399i;
    public boolean j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f13400l = new int[2];

    public AbstractViewOnTouchListenerC1219v0(View view) {
        this.f13397g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f13394d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f13395e = tapTimeout;
        this.f13396f = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC1217u0 runnableC1217u0 = this.f13399i;
        View view = this.f13397g;
        if (runnableC1217u0 != null) {
            view.removeCallbacks(runnableC1217u0);
        }
        RunnableC1217u0 runnableC1217u02 = this.f13398h;
        if (runnableC1217u02 != null) {
            view.removeCallbacks(runnableC1217u02);
        }
    }

    public abstract InterfaceC1101C b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC1101C b4 = b();
        if (b4 != null && b4.b()) {
            b4.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z8;
        C1213s0 e9;
        boolean z9;
        boolean z10 = this.j;
        View view2 = this.f13397g;
        if (z10) {
            InterfaceC1101C b4 = b();
            if (b4 != null && b4.b() && (e9 = b4.e()) != null && e9.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f13400l;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                e9.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b9 = e9.b(obtainNoHistory, this.k);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1 && actionMasked != 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (b9) {
                }
            }
            if (d()) {
                z8 = false;
            }
            z8 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.k);
                            if (findPointerIndex >= 0) {
                                float x8 = motionEvent.getX(findPointerIndex);
                                float y4 = motionEvent.getY(findPointerIndex);
                                float f8 = this.f13394d;
                                float f9 = -f8;
                                if (x8 < f9 || y4 < f9 || x8 >= (view2.getRight() - view2.getLeft()) + f8 || y4 >= (view2.getBottom() - view2.getTop()) + f8) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z8 = true;
                                        if (z8) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.k = motionEvent.getPointerId(0);
                    if (this.f13398h == null) {
                        this.f13398h = new RunnableC1217u0(this, 0);
                    }
                    view2.postDelayed(this.f13398h, this.f13395e);
                    if (this.f13399i == null) {
                        this.f13399i = new RunnableC1217u0(this, 1);
                    }
                    view2.postDelayed(this.f13399i, this.f13396f);
                }
            }
            z8 = false;
            if (z8) {
            }
        }
        this.j = z8;
        if (!z8 && !z10) {
            return false;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.j = false;
        this.k = -1;
        RunnableC1217u0 runnableC1217u0 = this.f13398h;
        if (runnableC1217u0 != null) {
            this.f13397g.removeCallbacks(runnableC1217u0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
