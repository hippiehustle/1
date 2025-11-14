package t0;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import g5.C0787g;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f14938d;

    /* renamed from: e, reason: collision with root package name */
    public int f14939e;

    /* renamed from: f, reason: collision with root package name */
    public OverScroller f14940f;

    /* renamed from: g, reason: collision with root package name */
    public Interpolator f14941g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14942h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14943i;
    public final /* synthetic */ RecyclerView j;

    public r0(RecyclerView recyclerView) {
        this.j = recyclerView;
        W.d dVar = RecyclerView.f8907M0;
        this.f14941g = dVar;
        this.f14942h = false;
        this.f14943i = false;
        this.f14940f = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a(int i4, int i8) {
        RecyclerView recyclerView = this.j;
        recyclerView.setScrollState(2);
        this.f14939e = 0;
        this.f14938d = 0;
        Interpolator interpolator = this.f14941g;
        W.d dVar = RecyclerView.f8907M0;
        if (interpolator != dVar) {
            this.f14941g = dVar;
            this.f14940f = new OverScroller(recyclerView.getContext(), dVar);
        }
        this.f14940f.fling(0, 0, i4, i8, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f14942h) {
            this.f14943i = true;
            return;
        }
        RecyclerView recyclerView = this.j;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = P.O.f4214a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i4, int i8, int i9, Interpolator interpolator) {
        boolean z8;
        int height;
        RecyclerView recyclerView = this.j;
        if (i9 == Integer.MIN_VALUE) {
            int abs = Math.abs(i4);
            int abs2 = Math.abs(i8);
            if (abs > abs2) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z8) {
                abs = abs2;
            }
            i9 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i10 = i9;
        if (interpolator == null) {
            interpolator = RecyclerView.f8907M0;
        }
        if (this.f14941g != interpolator) {
            this.f14941g = interpolator;
            this.f14940f = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f14939e = 0;
        this.f14938d = 0;
        recyclerView.setScrollState(2);
        this.f14940f.startScroll(0, 0, i4, i8, i10);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        int i8;
        int i9;
        int i10;
        boolean awakenScrollBars;
        boolean z8;
        boolean z9;
        boolean z10;
        int i11;
        RecyclerView recyclerView = this.j;
        int[] iArr = recyclerView.f8975w0;
        if (recyclerView.f8962q == null) {
            recyclerView.removeCallbacks(this);
            this.f14940f.abortAnimation();
            return;
        }
        this.f14943i = false;
        this.f14942h = true;
        recyclerView.p();
        OverScroller overScroller = this.f14940f;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i12 = currX - this.f14938d;
            int i13 = currY - this.f14939e;
            this.f14938d = currX;
            this.f14939e = currY;
            int o7 = RecyclerView.o(i12, recyclerView.f8924L, recyclerView.f8926N, recyclerView.getWidth());
            int o8 = RecyclerView.o(i13, recyclerView.f8925M, recyclerView.f8927O, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f8975w0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(o7, o8, 1, iArr2, null)) {
                o7 -= iArr[0];
                o8 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o7, o8);
            }
            if (recyclerView.f8960p != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.i0(o7, o8, iArr);
                int i14 = iArr[0];
                int i15 = iArr[1];
                int i16 = o7 - i14;
                int i17 = o8 - i15;
                J j = recyclerView.f8962q.f14814e;
                if (j != null && !j.f14765d && j.f14766e) {
                    int b4 = recyclerView.f8951k0.b();
                    if (b4 == 0) {
                        j.i();
                    } else if (j.f14762a >= b4) {
                        j.f14762a = b4 - 1;
                        j.g(i14, i15);
                    } else {
                        j.g(i14, i15);
                    }
                }
                i4 = i16;
                i9 = i14;
                i8 = i17;
                i10 = i15;
            } else {
                i4 = o7;
                i8 = o8;
                i9 = 0;
                i10 = 0;
            }
            if (!recyclerView.f8966s.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f8975w0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i9, i10, i4, i8, null, 1, iArr3);
            int i18 = i4 - iArr[0];
            int i19 = i8 - iArr[1];
            if (i9 != 0 || i10 != 0) {
                recyclerView.x(i9, i10);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!overScroller.isFinished() && ((!z8 && i18 == 0) || (!z9 && i19 == 0))) {
                z10 = false;
            } else {
                z10 = true;
            }
            J j5 = recyclerView.f8962q.f14814e;
            if ((j5 == null || !j5.f14765d) && z10) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i18 < 0) {
                        i11 = -currVelocity;
                    } else if (i18 > 0) {
                        i11 = currVelocity;
                    } else {
                        i11 = 0;
                    }
                    if (i19 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i19 <= 0) {
                        currVelocity = 0;
                    }
                    if (i11 < 0) {
                        recyclerView.z();
                        if (recyclerView.f8924L.isFinished()) {
                            recyclerView.f8924L.onAbsorb(-i11);
                        }
                    } else if (i11 > 0) {
                        recyclerView.A();
                        if (recyclerView.f8926N.isFinished()) {
                            recyclerView.f8926N.onAbsorb(i11);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.f8925M.isFinished()) {
                            recyclerView.f8925M.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.f8927O.isFinished()) {
                            recyclerView.f8927O.onAbsorb(currVelocity);
                        }
                    }
                    if (i11 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f8905K0) {
                    C0787g c0787g = recyclerView.j0;
                    int[] iArr4 = (int[]) c0787g.f11190d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0787g.f11189c = 0;
                }
            } else {
                b();
                RunnableC1556w runnableC1556w = recyclerView.f8950i0;
                if (runnableC1556w != null) {
                    runnableC1556w.a(recyclerView, i9, i10);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                W.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        J j8 = recyclerView.f8962q.f14814e;
        if (j8 != null && j8.f14765d) {
            j8.g(0, 0);
        }
        this.f14942h = false;
        if (this.f14943i) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = P.O.f4214a;
            recyclerView.postOnAnimation(this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.q0(1);
        }
    }
}
