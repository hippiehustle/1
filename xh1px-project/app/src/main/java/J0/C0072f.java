package J0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.buzbuz.smartautoclicker.R;

/* renamed from: J0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072f extends AnimatorListenerAdapter implements n {

    /* renamed from: a, reason: collision with root package name */
    public final View f2288a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2289b = false;

    public C0072f(View view) {
        this.f2288a = view;
    }

    @Override // J0.n
    public final void a() {
        float f8;
        View view = this.f2288a;
        if (view.getVisibility() == 0) {
            f8 = z.f2347a.S(view);
        } else {
            f8 = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f8));
    }

    @Override // J0.n
    public final void c() {
        this.f2288a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        z.f2347a.t0(this.f2288a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f2288a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f2289b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z8) {
        boolean z9 = this.f2289b;
        View view = this.f2288a;
        if (z9) {
            view.setLayerType(0, null);
        }
        if (z8) {
            return;
        }
        E e9 = z.f2347a;
        e9.t0(view, 1.0f);
        e9.getClass();
    }

    @Override // J0.n
    public final void b(p pVar) {
    }

    @Override // J0.n
    public final void d(p pVar) {
    }

    @Override // J0.n
    public final void e(p pVar) {
    }

    @Override // J0.n
    public final void f(p pVar) {
    }
}
