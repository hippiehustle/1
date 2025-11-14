package w5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15745a;

    /* renamed from: b, reason: collision with root package name */
    public float f15746b;

    /* renamed from: c, reason: collision with root package name */
    public float f15747c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f15748d;

    public i(l lVar) {
        this.f15748d = lVar;
    }

    public abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f8 = (int) this.f15747c;
        G5.h hVar = this.f15748d.f15761b;
        if (hVar != null) {
            hVar.l(f8);
        }
        this.f15745a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f8;
        boolean z8 = this.f15745a;
        l lVar = this.f15748d;
        if (!z8) {
            G5.h hVar = lVar.f15761b;
            if (hVar == null) {
                f8 = 0.0f;
            } else {
                f8 = hVar.f1769d.f1762m;
            }
            this.f15746b = f8;
            this.f15747c = a();
            this.f15745a = true;
        }
        float f9 = this.f15746b;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f15747c - f9)) + f9);
        G5.h hVar2 = lVar.f15761b;
        if (hVar2 != null) {
            hVar2.l(animatedFraction);
        }
    }
}
