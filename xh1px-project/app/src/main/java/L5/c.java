package L5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f2937b;

    public /* synthetic */ c(d dVar, int i4) {
        this.f2936a = i4;
        this.f2937b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2936a) {
            case 1:
                this.f2937b.f2991b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2936a) {
            case 0:
                this.f2937b.f2991b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
