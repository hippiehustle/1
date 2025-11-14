package K2;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class h extends ValueAnimator {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f2621l = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2622d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public int f2623e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2624f;

    /* renamed from: g, reason: collision with root package name */
    public int f2625g;

    /* renamed from: h, reason: collision with root package name */
    public int f2626h;

    /* renamed from: i, reason: collision with root package name */
    public long f2627i;
    public long j;
    public long k;

    public h() {
        addListener(new g(this));
    }

    public static void a(h hVar) {
        super.start();
    }

    public final void b(long j) {
        if (j > 0) {
            this.f2622d.postDelayed(new f(this, 1), j);
        } else {
            super.start();
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        this.f2624f = true;
        super.cancel();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void end() {
        this.f2624f = true;
        super.end();
    }

    @Override // android.animation.ValueAnimator
    public final int getRepeatCount() {
        return this.f2626h;
    }

    @Override // android.animation.ValueAnimator
    public final int getRepeatMode() {
        return this.f2625g;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        return this.f2627i;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatCount(int i4) {
        this.f2626h = i4;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i4) {
        this.f2625g = i4;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        this.f2627i = j;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        this.f2624f = false;
        this.f2623e = 0;
        b(this.f2627i);
    }
}
