package C5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f663b;

    public /* synthetic */ f(h hVar, int i4) {
        this.f662a = i4;
        this.f663b = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f662a) {
            case 1:
                super.onAnimationEnd(animator);
                h hVar = this.f663b;
                ObjectAnimator objectAnimator = hVar.f669c;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                c cVar = hVar.j;
                if (cVar != null) {
                    cVar.a((q) hVar.f706a);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f662a) {
            case 0:
                super.onAnimationRepeat(animator);
                h hVar = this.f663b;
                hVar.f673g = (hVar.f673g + 4) % hVar.f672f.f678c.length;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
