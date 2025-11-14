package W;

import L5.x;
import P.O;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: v, reason: collision with root package name */
    public static final d f6459v = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f6460a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6461b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f6463d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f6464e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f6465f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f6466g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f6467h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f6468i;
    public int[] j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f6469l;

    /* renamed from: m, reason: collision with root package name */
    public final float f6470m;

    /* renamed from: n, reason: collision with root package name */
    public final float f6471n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6472o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f6473p;

    /* renamed from: q, reason: collision with root package name */
    public final E2.c f6474q;

    /* renamed from: r, reason: collision with root package name */
    public View f6475r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6476s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f6477t;

    /* renamed from: c, reason: collision with root package name */
    public int f6462c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final x f6478u = new x(2, this);

    public e(Context context, CoordinatorLayout coordinatorLayout, E2.c cVar) {
        if (cVar != null) {
            this.f6477t = coordinatorLayout;
            this.f6474q = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f6472o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f6461b = viewConfiguration.getScaledTouchSlop();
            this.f6470m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f6471n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f6473p = new OverScroller(context, f6459v);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public final void a() {
        this.f6462c = -1;
        float[] fArr = this.f6463d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f6464e, 0.0f);
            Arrays.fill(this.f6465f, 0.0f);
            Arrays.fill(this.f6466g, 0.0f);
            Arrays.fill(this.f6467h, 0);
            Arrays.fill(this.f6468i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.f6469l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6469l = null;
        }
    }

    public final void b(View view, int i4) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f6477t;
        if (parent == coordinatorLayout) {
            this.f6475r = view;
            this.f6462c = i4;
            this.f6474q.i0(view, i4);
            n(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, float f8, float f9) {
        boolean z8;
        boolean z9;
        if (view != null) {
            E2.c cVar = this.f6474q;
            if (cVar.a0(view) > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (cVar.b0() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z8 && z9) {
                float f10 = (f9 * f9) + (f8 * f8);
                int i4 = this.f6461b;
                if (f10 > i4 * i4) {
                }
            } else if (!z8 ? !(!z9 || Math.abs(f9) <= this.f6461b) : Math.abs(f8) > this.f6461b) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i4) {
        float[] fArr = this.f6463d;
        if (fArr != null) {
            int i8 = this.k;
            int i9 = 1 << i4;
            if ((i8 & i9) != 0) {
                fArr[i4] = 0.0f;
                this.f6464e[i4] = 0.0f;
                this.f6465f[i4] = 0.0f;
                this.f6466g[i4] = 0.0f;
                this.f6467h[i4] = 0;
                this.f6468i[i4] = 0;
                this.j[i4] = 0;
                this.k = (~i9) & i8;
            }
        }
    }

    public final int e(int i4, int i8, int i9) {
        int abs;
        if (i4 == 0) {
            return 0;
        }
        float width = this.f6477t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i4) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i8);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i4) / i9) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean f() {
        if (this.f6460a == 2) {
            OverScroller overScroller = this.f6473p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f6475r.getLeft();
            int top = currY - this.f6475r.getTop();
            if (left != 0) {
                View view = this.f6475r;
                WeakHashMap weakHashMap = O.f4214a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f6475r;
                WeakHashMap weakHashMap2 = O.f4214a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f6474q.k0(this.f6475r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f6477t.post(this.f6478u);
            }
        }
        if (this.f6460a != 2) {
            return false;
        }
        return true;
    }

    public final View g(int i4, int i8) {
        CoordinatorLayout coordinatorLayout = this.f6477t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f6474q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && i8 >= childAt.getTop() && i8 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i4, int i8, int i9, int i10) {
        float f8;
        float f9;
        float f10;
        float f11;
        int left = this.f6475r.getLeft();
        int top = this.f6475r.getTop();
        int i11 = i4 - left;
        int i12 = i8 - top;
        OverScroller overScroller = this.f6473p;
        if (i11 == 0 && i12 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f6475r;
        int i13 = (int) this.f6471n;
        int i14 = (int) this.f6470m;
        int abs = Math.abs(i9);
        if (abs < i13) {
            i9 = 0;
        } else if (abs > i14) {
            if (i9 > 0) {
                i9 = i14;
            } else {
                i9 = -i14;
            }
        }
        int abs2 = Math.abs(i10);
        if (abs2 < i13) {
            i10 = 0;
        } else if (abs2 > i14) {
            if (i10 > 0) {
                i10 = i14;
            } else {
                i10 = -i14;
            }
        }
        int abs3 = Math.abs(i11);
        int abs4 = Math.abs(i12);
        int abs5 = Math.abs(i9);
        int abs6 = Math.abs(i10);
        int i15 = abs5 + abs6;
        int i16 = abs3 + abs4;
        if (i9 != 0) {
            f8 = abs5;
            f9 = i15;
        } else {
            f8 = abs3;
            f9 = i16;
        }
        float f12 = f8 / f9;
        if (i10 != 0) {
            f10 = abs6;
            f11 = i15;
        } else {
            f10 = abs4;
            f11 = i16;
        }
        float f13 = f10 / f11;
        E2.c cVar = this.f6474q;
        overScroller.startScroll(left, top, i11, i12, (int) ((e(i12, i10, cVar.b0()) * f13) + (e(i11, i9, cVar.a0(view)) * f12)));
        n(2);
        return true;
    }

    public final boolean i(int i4) {
        if ((this.k & (1 << i4)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i4 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f6469l == null) {
            this.f6469l = VelocityTracker.obtain();
        }
        this.f6469l.addMovement(motionEvent);
        int i8 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                E2.c cVar = this.f6474q;
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f6460a == 1 && pointerId == this.f6462c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i8 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i8);
                                            if (pointerId2 != this.f6462c) {
                                                View g8 = g((int) motionEvent.getX(i8), (int) motionEvent.getY(i8));
                                                View view = this.f6475r;
                                                if (g8 == view && q(view, pointerId2)) {
                                                    i4 = this.f6462c;
                                                    break;
                                                }
                                            }
                                            i8++;
                                        } else {
                                            i4 = -1;
                                            break;
                                        }
                                    }
                                    if (i4 == -1) {
                                        k();
                                    }
                                }
                                d(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x8 = motionEvent.getX(actionIndex);
                        float y4 = motionEvent.getY(actionIndex);
                        l(x8, y4, pointerId3);
                        if (this.f6460a == 0) {
                            q(g((int) x8, (int) y4), pointerId3);
                            int i9 = this.f6467h[pointerId3];
                            return;
                        }
                        int i10 = (int) x8;
                        int i11 = (int) y4;
                        View view2 = this.f6475r;
                        if (view2 != null && i10 >= view2.getLeft() && i10 < view2.getRight() && i11 >= view2.getTop() && i11 < view2.getBottom()) {
                            i8 = 1;
                        }
                        if (i8 != 0) {
                            q(this.f6475r, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.f6460a == 1) {
                        this.f6476s = true;
                        cVar.l0(this.f6475r, 0.0f, 0.0f);
                        this.f6476s = false;
                        if (this.f6460a == 1) {
                            n(0);
                        }
                    }
                    a();
                    return;
                }
                if (this.f6460a == 1) {
                    if (!i(this.f6462c)) {
                        return;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f6462c);
                    float x9 = motionEvent.getX(findPointerIndex);
                    float y5 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f6465f;
                    int i12 = this.f6462c;
                    int i13 = (int) (x9 - fArr[i12]);
                    int i14 = (int) (y5 - this.f6466g[i12]);
                    int left = this.f6475r.getLeft() + i13;
                    int top = this.f6475r.getTop() + i14;
                    int left2 = this.f6475r.getLeft();
                    int top2 = this.f6475r.getTop();
                    if (i13 != 0) {
                        left = cVar.K(this.f6475r, left);
                        WeakHashMap weakHashMap = O.f4214a;
                        this.f6475r.offsetLeftAndRight(left - left2);
                    }
                    if (i14 != 0) {
                        top = cVar.L(this.f6475r, top);
                        WeakHashMap weakHashMap2 = O.f4214a;
                        this.f6475r.offsetTopAndBottom(top - top2);
                    }
                    if (i13 != 0 || i14 != 0) {
                        cVar.k0(this.f6475r, left, top);
                    }
                    m(motionEvent);
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i8 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i8);
                    if (i(pointerId4)) {
                        float x10 = motionEvent.getX(i8);
                        float y8 = motionEvent.getY(i8);
                        float f8 = x10 - this.f6463d[pointerId4];
                        float f9 = y8 - this.f6464e[pointerId4];
                        Math.abs(f8);
                        Math.abs(f9);
                        int i15 = this.f6467h[pointerId4];
                        Math.abs(f9);
                        Math.abs(f8);
                        int i16 = this.f6467h[pointerId4];
                        Math.abs(f8);
                        Math.abs(f9);
                        int i17 = this.f6467h[pointerId4];
                        Math.abs(f9);
                        Math.abs(f8);
                        int i18 = this.f6467h[pointerId4];
                        if (this.f6460a != 1) {
                            View g9 = g((int) x10, (int) y8);
                            if (c(g9, f8, f9) && q(g9, pointerId4)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i8++;
                }
                m(motionEvent);
                return;
            }
            if (this.f6460a == 1) {
                k();
            }
            a();
            return;
        }
        float x11 = motionEvent.getX();
        float y9 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View g10 = g((int) x11, (int) y9);
        l(x11, y9, pointerId5);
        q(g10, pointerId5);
        int i19 = this.f6467h[pointerId5];
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f6469l;
        float f8 = this.f6470m;
        velocityTracker.computeCurrentVelocity(1000, f8);
        float xVelocity = this.f6469l.getXVelocity(this.f6462c);
        float abs = Math.abs(xVelocity);
        float f9 = this.f6471n;
        if (abs < f9) {
            xVelocity = 0.0f;
        } else if (abs > f8) {
            if (xVelocity > 0.0f) {
                xVelocity = f8;
            } else {
                xVelocity = -f8;
            }
        }
        float yVelocity = this.f6469l.getYVelocity(this.f6462c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f9) {
            f8 = 0.0f;
        } else if (abs2 > f8) {
            if (yVelocity <= 0.0f) {
                f8 = -f8;
            }
        } else {
            f8 = yVelocity;
        }
        this.f6476s = true;
        this.f6474q.l0(this.f6475r, xVelocity, f8);
        this.f6476s = false;
        if (this.f6460a == 1) {
            n(0);
        }
    }

    public final void l(float f8, float f9, int i4) {
        float[] fArr = this.f6463d;
        int i8 = 0;
        if (fArr == null || fArr.length <= i4) {
            int i9 = i4 + 1;
            float[] fArr2 = new float[i9];
            float[] fArr3 = new float[i9];
            float[] fArr4 = new float[i9];
            float[] fArr5 = new float[i9];
            int[] iArr = new int[i9];
            int[] iArr2 = new int[i9];
            int[] iArr3 = new int[i9];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f6464e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f6465f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f6466g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f6467h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f6468i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f6463d = fArr2;
            this.f6464e = fArr3;
            this.f6465f = fArr4;
            this.f6466g = fArr5;
            this.f6467h = iArr;
            this.f6468i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f6463d;
        this.f6465f[i4] = f8;
        fArr9[i4] = f8;
        float[] fArr10 = this.f6464e;
        this.f6466g[i4] = f9;
        fArr10[i4] = f9;
        int[] iArr7 = this.f6467h;
        int i10 = (int) f8;
        int i11 = (int) f9;
        CoordinatorLayout coordinatorLayout = this.f6477t;
        int left = coordinatorLayout.getLeft();
        int i12 = this.f6472o;
        if (i10 < left + i12) {
            i8 = 1;
        }
        if (i11 < coordinatorLayout.getTop() + i12) {
            i8 |= 4;
        }
        if (i10 > coordinatorLayout.getRight() - i12) {
            i8 |= 2;
        }
        if (i11 > coordinatorLayout.getBottom() - i12) {
            i8 |= 8;
        }
        iArr7[i4] = i8;
        this.k |= 1 << i4;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount; i4++) {
            int pointerId = motionEvent.getPointerId(i4);
            if (i(pointerId)) {
                float x8 = motionEvent.getX(i4);
                float y4 = motionEvent.getY(i4);
                this.f6465f[pointerId] = x8;
                this.f6466g[pointerId] = y4;
            }
        }
    }

    public final void n(int i4) {
        this.f6477t.removeCallbacks(this.f6478u);
        if (this.f6460a != i4) {
            this.f6460a = i4;
            this.f6474q.j0(i4);
            if (this.f6460a == 0) {
                this.f6475r = null;
            }
        }
    }

    public final boolean o(int i4, int i8) {
        if (this.f6476s) {
            return h(i4, i8, (int) this.f6469l.getXVelocity(this.f6462c), (int) this.f6469l.getYVelocity(this.f6462c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MotionEvent motionEvent) {
        boolean z8;
        View g8;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f6469l == null) {
            this.f6469l = VelocityTracker.obtain();
        }
        this.f6469l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                d(motionEvent.getPointerId(actionIndex));
                            }
                        } else {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x8 = motionEvent.getX(actionIndex);
                            float y4 = motionEvent.getY(actionIndex);
                            l(x8, y4, pointerId);
                            int i4 = this.f6460a;
                            if (i4 == 0) {
                                int i8 = this.f6467h[pointerId];
                            } else if (i4 == 2 && (g8 = g((int) x8, (int) y4)) == this.f6475r) {
                                q(g8, pointerId);
                            }
                        }
                    }
                } else if (this.f6463d != null && this.f6464e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i9 = 0; i9 < pointerCount; i9++) {
                        int pointerId2 = motionEvent.getPointerId(i9);
                        if (i(pointerId2)) {
                            float x9 = motionEvent.getX(i9);
                            float y5 = motionEvent.getY(i9);
                            float f8 = x9 - this.f6463d[pointerId2];
                            float f9 = y5 - this.f6464e[pointerId2];
                            View g9 = g((int) x9, (int) y5);
                            if (g9 != null && c(g9, f8, f9)) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                int left = g9.getLeft();
                                E2.c cVar = this.f6474q;
                                int K = cVar.K(g9, ((int) f8) + left);
                                int top = g9.getTop();
                                int L8 = cVar.L(g9, ((int) f9) + top);
                                int a02 = cVar.a0(g9);
                                int b02 = cVar.b0();
                                if (a02 != 0) {
                                    if (a02 > 0) {
                                    }
                                }
                                if (b02 == 0) {
                                    break;
                                }
                                if (b02 > 0 && L8 == top) {
                                    break;
                                }
                            }
                            Math.abs(f8);
                            Math.abs(f9);
                            int i10 = this.f6467h[pointerId2];
                            Math.abs(f9);
                            Math.abs(f8);
                            int i11 = this.f6467h[pointerId2];
                            Math.abs(f8);
                            Math.abs(f9);
                            int i12 = this.f6467h[pointerId2];
                            Math.abs(f9);
                            Math.abs(f8);
                            int i13 = this.f6467h[pointerId2];
                            if (this.f6460a == 1) {
                                break;
                            }
                            if (z8 && q(g9, pointerId2)) {
                                break;
                            }
                        }
                    }
                    m(motionEvent);
                }
            }
            a();
        } else {
            float x10 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            l(x10, y8, pointerId3);
            View g10 = g((int) x10, (int) y8);
            if (g10 == this.f6475r && this.f6460a == 2) {
                q(g10, pointerId3);
            }
            int i14 = this.f6467h[pointerId3];
        }
        if (this.f6460a != 1) {
            return false;
        }
        return true;
    }

    public final boolean q(View view, int i4) {
        if (view == this.f6475r && this.f6462c == i4) {
            return true;
        }
        if (view != null && this.f6474q.E0(view, i4)) {
            this.f6462c = i4;
            b(view, i4);
            return true;
        }
        return false;
    }
}
