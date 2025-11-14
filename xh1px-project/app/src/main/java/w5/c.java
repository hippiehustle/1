package w5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f15728c;

    public c(j jVar, boolean z8) {
        this.f15728c = jVar;
        this.f15727b = z8;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f15726a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i4;
        j jVar = this.f15728c;
        jVar.f15775r = 0;
        jVar.f15769l = null;
        if (!this.f15726a) {
            FloatingActionButton floatingActionButton = jVar.f15776s;
            boolean z8 = this.f15727b;
            if (z8) {
                i4 = 8;
            } else {
                i4 = 4;
            }
            floatingActionButton.a(i4, z8);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        j jVar = this.f15728c;
        jVar.f15776s.a(0, this.f15727b);
        jVar.f15775r = 1;
        jVar.f15769l = animator;
        this.f15726a = false;
    }
}
