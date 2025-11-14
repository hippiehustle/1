package O5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4040c;

    public b(boolean z8, View view, View view2) {
        this.f4038a = z8;
        this.f4039b = view;
        this.f4040c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f4038a) {
            this.f4039b.setVisibility(4);
            View view = this.f4040c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f4038a) {
            this.f4039b.setVisibility(0);
            View view = this.f4040c;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
