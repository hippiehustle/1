package P;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public c0 f4259a;

    public d0(int i4, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4259a = new b0(Z.j(i4, interpolator, j));
        } else {
            this.f4259a = new c0(i4, interpolator, j);
        }
    }
}
