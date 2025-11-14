package J0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.buzbuz.smartautoclicker.R;

/* loaded from: classes.dex */
public final class H extends AnimatorListenerAdapter implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f2258a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2259b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2260c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2261d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0073g f2262e;

    public H(C0073g c0073g, ViewGroup viewGroup, View view, View view2) {
        this.f2262e = c0073g;
        this.f2258a = viewGroup;
        this.f2259b = view;
        this.f2260c = view2;
    }

    @Override // J0.n
    public final void d(p pVar) {
        pVar.z(this);
    }

    @Override // J0.n
    public final void e(p pVar) {
        if (this.f2261d) {
            g();
        }
    }

    public final void g() {
        this.f2260c.setTag(R.id.save_overlay_view, null);
        this.f2258a.getOverlay().remove(this.f2259b);
        this.f2261d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2258a.getOverlay().remove(this.f2259b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2259b;
        if (view.getParent() == null) {
            this.f2258a.getOverlay().add(view);
        } else {
            this.f2262e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z8) {
        if (z8) {
            View view = this.f2260c;
            View view2 = this.f2259b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f2258a.getOverlay().add(view2);
            this.f2261d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z8) {
        if (z8) {
            return;
        }
        g();
    }

    @Override // J0.n
    public final void a() {
    }

    @Override // J0.n
    public final void c() {
    }

    @Override // J0.n
    public final void b(p pVar) {
    }
}
