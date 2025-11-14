package P;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4249a;

    /* renamed from: b, reason: collision with root package name */
    public float f4250b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f4251c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4252d;

    public c0(int i4, Interpolator interpolator, long j) {
        this.f4249a = i4;
        this.f4251c = interpolator;
        this.f4252d = j;
    }

    public long a() {
        return this.f4252d;
    }

    public float b() {
        Interpolator interpolator = this.f4251c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f4250b);
        }
        return this.f4250b;
    }

    public int c() {
        return this.f4249a;
    }

    public void d(float f8) {
        this.f4250b = f8;
    }
}
