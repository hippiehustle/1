package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f9911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f9912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f9913c;

    public a(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f9913c = baseBehavior;
        this.f9911a = coordinatorLayout;
        this.f9912b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9913c.A(this.f9911a, this.f9912b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
