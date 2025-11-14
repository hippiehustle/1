package K2;

import android.animation.Animator;

/* loaded from: classes.dex */
public final class g implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f2620a;

    public g(h hVar) {
        this.f2620a = hVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h hVar = this.f2620a;
        if (!hVar.f2624f) {
            int i4 = hVar.f2623e + 1;
            hVar.f2623e = i4;
            int i8 = hVar.f2626h;
            if (i4 < i8 || i8 == -1) {
                int i9 = hVar.f2625g;
                if (i9 != 1) {
                    if (i9 != 2) {
                        return;
                    }
                    if (i4 % 2 == 1) {
                        long j = hVar.k;
                        if (j > 0) {
                            hVar.f2622d.postDelayed(new f(hVar, 0), j);
                            return;
                        } else {
                            hVar.reverse();
                            return;
                        }
                    }
                    hVar.b(hVar.j);
                    return;
                }
                hVar.b(hVar.j);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
