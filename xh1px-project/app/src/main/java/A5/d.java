package A5;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f306b;

    public d(f fVar, float f8) {
        this.f306b = fVar;
        this.f305a = f8;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f306b.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f305a);
    }
}
