package f5;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f10775a;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f10777c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f10778d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f10779e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f10776b = 150;

    public f(long j) {
        this.f10775a = j;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f10775a);
        objectAnimator.setDuration(this.f10776b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.f10778d);
        objectAnimator.setRepeatMode(this.f10779e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f10777c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return AbstractC0710a.f10767b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f10775a != fVar.f10775a || this.f10776b != fVar.f10776b || this.f10778d != fVar.f10778d || this.f10779e != fVar.f10779e) {
            return false;
        }
        return b().getClass().equals(fVar.b().getClass());
    }

    public final int hashCode() {
        long j = this.f10775a;
        long j5 = this.f10776b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31)) * 31) + this.f10778d) * 31) + this.f10779e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(f.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f10775a);
        sb.append(" duration: ");
        sb.append(this.f10776b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f10778d);
        sb.append(" repeatMode: ");
        return AbstractC1149a.h(sb, this.f10779e, "}\n");
    }
}
