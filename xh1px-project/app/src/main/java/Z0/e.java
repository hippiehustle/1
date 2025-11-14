package Z0;

import N0.C0202j;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class e extends ValueAnimator implements Choreographer.FrameCallback {

    /* renamed from: o, reason: collision with root package name */
    public C0202j f7269o;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f7260d = new CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f7261e = new CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f7262f = new CopyOnWriteArraySet();

    /* renamed from: g, reason: collision with root package name */
    public float f7263g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7264h = false;

    /* renamed from: i, reason: collision with root package name */
    public long f7265i = 0;
    public float j = 0.0f;
    public float k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public int f7266l = 0;

    /* renamed from: m, reason: collision with root package name */
    public float f7267m = -2.1474836E9f;

    /* renamed from: n, reason: collision with root package name */
    public float f7268n = 2.1474836E9f;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7270p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7271q = false;

    public final float a() {
        C0202j c0202j = this.f7269o;
        if (c0202j == null) {
            return 0.0f;
        }
        float f8 = this.k;
        float f9 = c0202j.f3610l;
        return (f8 - f9) / (c0202j.f3611m - f9);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f7261e.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f7262f.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f7260d.add(animatorUpdateListener);
    }

    public final float b() {
        C0202j c0202j = this.f7269o;
        if (c0202j == null) {
            return 0.0f;
        }
        float f8 = this.f7268n;
        if (f8 == 2.1474836E9f) {
            return c0202j.f3611m;
        }
        return f8;
    }

    public final float c() {
        C0202j c0202j = this.f7269o;
        if (c0202j == null) {
            return 0.0f;
        }
        float f8 = this.f7267m;
        if (f8 == -2.1474836E9f) {
            return c0202j.f3610l;
        }
        return f8;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f7261e.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        e(d());
        g(true);
    }

    public final boolean d() {
        if (this.f7263g < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        float c6;
        float b4;
        boolean z8 = false;
        if (this.f7270p) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        C0202j c0202j = this.f7269o;
        if (c0202j != null && this.f7270p) {
            long j5 = this.f7265i;
            long j8 = 0;
            if (j5 != 0) {
                j8 = j - j5;
            }
            float abs = ((float) j8) / ((1.0E9f / c0202j.f3612n) / Math.abs(this.f7263g));
            float f8 = this.j;
            if (d()) {
                abs = -abs;
            }
            float f9 = f8 + abs;
            float c9 = c();
            float b9 = b();
            PointF pointF = g.f7273a;
            if (f9 >= c9 && f9 <= b9) {
                z8 = true;
            }
            float f10 = this.j;
            float b10 = g.b(f9, c(), b());
            this.j = b10;
            if (this.f7271q) {
                b10 = (float) Math.floor(b10);
            }
            this.k = b10;
            this.f7265i = j;
            if (!z8) {
                if (getRepeatCount() != -1 && this.f7266l >= getRepeatCount()) {
                    if (this.f7263g < 0.0f) {
                        b4 = c();
                    } else {
                        b4 = b();
                    }
                    this.j = b4;
                    this.k = b4;
                    g(true);
                    if (!this.f7271q || this.j != f10) {
                        f();
                    }
                    e(d());
                } else {
                    if (getRepeatMode() == 2) {
                        this.f7264h = !this.f7264h;
                        this.f7263g = -this.f7263g;
                    } else {
                        if (d()) {
                            c6 = b();
                        } else {
                            c6 = c();
                        }
                        this.j = c6;
                        this.k = c6;
                    }
                    this.f7265i = j;
                    if (!this.f7271q || this.j != f10) {
                        f();
                    }
                    Iterator it = this.f7261e.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.f7266l++;
                }
            } else if (!this.f7271q || this.j != f10) {
                f();
            }
            if (this.f7269o != null) {
                float f11 = this.k;
                if (f11 < this.f7267m || f11 > this.f7268n) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f7267m), Float.valueOf(this.f7268n), Float.valueOf(this.k)));
                }
            }
        }
    }

    public final void e(boolean z8) {
        Iterator it = this.f7261e.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z8);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void f() {
        Iterator it = this.f7260d.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void g(boolean z8) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z8) {
            this.f7270p = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float c6;
        float b4;
        float c9;
        if (this.f7269o == null) {
            return 0.0f;
        }
        if (d()) {
            c6 = b() - this.k;
            b4 = b();
            c9 = c();
        } else {
            c6 = this.k - c();
            b4 = b();
            c9 = c();
        }
        return c6 / (b4 - c9);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.f7269o == null) {
            return 0L;
        }
        return r0.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(float f8) {
        if (this.j == f8) {
            return;
        }
        float b4 = g.b(f8, c(), b());
        this.j = b4;
        if (this.f7271q) {
            b4 = (float) Math.floor(b4);
        }
        this.k = b4;
        this.f7265i = 0L;
        f();
    }

    public final void i(float f8, float f9) {
        float f10;
        float f11;
        if (f8 <= f9) {
            C0202j c0202j = this.f7269o;
            if (c0202j == null) {
                f10 = -3.4028235E38f;
            } else {
                f10 = c0202j.f3610l;
            }
            if (c0202j == null) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = c0202j.f3611m;
            }
            float b4 = g.b(f8, f10, f11);
            float b9 = g.b(f9, f10, f11);
            if (b4 == this.f7267m && b9 == this.f7268n) {
                return;
            }
            this.f7267m = b4;
            this.f7268n = b9;
            h((int) g.b(this.k, b4, b9));
            return;
        }
        throw new IllegalArgumentException("minFrame (" + f8 + ") must be <= maxFrame (" + f9 + ")");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f7270p;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f7261e.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f7260d.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f7261e.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f7262f.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f7260d.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i4) {
        super.setRepeatMode(i4);
        if (i4 != 2 && this.f7264h) {
            this.f7264h = false;
            this.f7263g = -this.f7263g;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
