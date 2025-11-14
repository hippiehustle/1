package P;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class b0 extends c0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f4248e;

    public b0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f4248e = windowInsetsAnimation;
    }

    @Override // P.c0
    public final long a() {
        long durationMillis;
        durationMillis = this.f4248e.getDurationMillis();
        return durationMillis;
    }

    @Override // P.c0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f4248e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // P.c0
    public final int c() {
        int typeMask;
        typeMask = this.f4248e.getTypeMask();
        return typeMask;
    }

    @Override // P.c0
    public final void d(float f8) {
        this.f4248e.setFraction(f8);
    }
}
