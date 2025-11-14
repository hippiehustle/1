package t0;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* renamed from: t0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1559z implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1530D f15030a;

    public C1559z(C1530D c1530d) {
        this.f15030a = c1530d;
    }

    @Override // t0.f0
    public final void a(MotionEvent motionEvent) {
        C1530D c1530d = this.f15030a;
        L5.x xVar = c1530d.f14723s;
        c1530d.f14728x.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c1530d.f14724t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c1530d.f14716l != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(c1530d.f14716l);
            if (findPointerIndex >= 0) {
                c1530d.i(actionMasked, findPointerIndex, motionEvent);
            }
            s0 s0Var = c1530d.f14709c;
            if (s0Var != null) {
                int i4 = 0;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == c1530d.f14716l) {
                                    if (actionIndex == 0) {
                                        i4 = 1;
                                    }
                                    c1530d.f14716l = motionEvent.getPointerId(i4);
                                    c1530d.r(c1530d.f14719o, actionIndex, motionEvent);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        VelocityTracker velocityTracker2 = c1530d.f14724t;
                        if (velocityTracker2 != null) {
                            velocityTracker2.clear();
                        }
                    } else {
                        if (findPointerIndex >= 0) {
                            c1530d.r(c1530d.f14719o, findPointerIndex, motionEvent);
                            c1530d.o(s0Var);
                            c1530d.f14722r.removeCallbacks(xVar);
                            xVar.run();
                            c1530d.f14722r.invalidate();
                            return;
                        }
                        return;
                    }
                }
                c1530d.q(null, 0);
                c1530d.f14716l = -1;
            }
        }
    }

    @Override // t0.f0
    public final boolean b(MotionEvent motionEvent) {
        int findPointerIndex;
        C1530D c1530d = this.f15030a;
        c1530d.f14728x.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C1527A c1527a = null;
        if (actionMasked == 0) {
            c1530d.f14716l = motionEvent.getPointerId(0);
            c1530d.f14710d = motionEvent.getX();
            c1530d.f14711e = motionEvent.getY();
            VelocityTracker velocityTracker = c1530d.f14724t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c1530d.f14724t = VelocityTracker.obtain();
            if (c1530d.f14709c == null) {
                ArrayList arrayList = c1530d.f14720p;
                if (!arrayList.isEmpty()) {
                    View l6 = c1530d.l(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C1527A c1527a2 = (C1527A) arrayList.get(size);
                        if (c1527a2.f14681e.f14950a == l6) {
                            c1527a = c1527a2;
                            break;
                        }
                        size--;
                    }
                }
                if (c1527a != null) {
                    s0 s0Var = c1527a.f14681e;
                    c1530d.f14710d -= c1527a.f14685i;
                    c1530d.f14711e -= c1527a.j;
                    c1530d.k(s0Var, true);
                    if (c1530d.f14707a.remove(s0Var.f14950a)) {
                        c1530d.f14717m.a(c1530d.f14722r, s0Var);
                    }
                    c1530d.q(s0Var, c1527a.f14682f);
                    c1530d.r(c1530d.f14719o, 0, motionEvent);
                }
            }
        } else if (actionMasked != 3 && actionMasked != 1) {
            int i4 = c1530d.f14716l;
            if (i4 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i4)) >= 0) {
                c1530d.i(actionMasked, findPointerIndex, motionEvent);
            }
        } else {
            c1530d.f14716l = -1;
            c1530d.q(null, 0);
        }
        VelocityTracker velocityTracker2 = c1530d.f14724t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (c1530d.f14709c != null) {
            return true;
        }
        return false;
    }

    @Override // t0.f0
    public final void c(boolean z8) {
        if (!z8) {
            return;
        }
        this.f15030a.q(null, 0);
    }
}
