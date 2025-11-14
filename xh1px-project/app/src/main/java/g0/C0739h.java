package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* renamed from: g0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f11032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11034c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f11035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0740i f11036e;

    public C0739h(ViewGroup viewGroup, View view, boolean z8, g0 g0Var, C0740i c0740i) {
        this.f11032a = viewGroup;
        this.f11033b = view;
        this.f11034c = z8;
        this.f11035d = g0Var;
        this.f11036e = c0740i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o6.j.e(animator, "anim");
        ViewGroup viewGroup = this.f11032a;
        View view = this.f11033b;
        viewGroup.endViewTransition(view);
        boolean z8 = this.f11034c;
        g0 g0Var = this.f11035d;
        if (z8) {
            int i4 = g0Var.f11022a;
            o6.j.d(view, "viewToAnimate");
            A.j.a(i4, view, viewGroup);
        }
        C0740i c0740i = this.f11036e;
        ((g0) c0740i.f11038c.f1023e).c(c0740i);
        if (T.K(2)) {
            Objects.toString(g0Var);
        }
    }
}
