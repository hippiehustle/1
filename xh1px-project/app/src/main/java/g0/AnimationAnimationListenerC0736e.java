package g0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0736e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f11011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f11012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f11013c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0737f f11014d;

    public AnimationAnimationListenerC0736e(g0 g0Var, ViewGroup viewGroup, View view, C0737f c0737f) {
        this.f11011a = g0Var;
        this.f11012b = viewGroup;
        this.f11013c = view;
        this.f11014d = c0737f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        o6.j.e(animation, "animation");
        ViewGroup viewGroup = this.f11012b;
        viewGroup.post(new c0.m(viewGroup, this.f11013c, this.f11014d, 1));
        if (T.K(2)) {
            Objects.toString(this.f11011a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        o6.j.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        o6.j.e(animation, "animation");
        if (T.K(2)) {
            Objects.toString(this.f11011a);
        }
    }
}
