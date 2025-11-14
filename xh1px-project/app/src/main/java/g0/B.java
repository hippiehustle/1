package g0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class B extends AnimationSet implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f10847d;

    /* renamed from: e, reason: collision with root package name */
    public final View f10848e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10849f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10850g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10851h;

    public B(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f10851h = true;
        this.f10847d = viewGroup;
        this.f10848e = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f10851h = true;
        if (this.f10849f) {
            return !this.f10850g;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f10849f = true;
            P.r.a(this.f10847d, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8 = this.f10849f;
        ViewGroup viewGroup = this.f10847d;
        if (!z8 && this.f10851h) {
            this.f10851h = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.f10848e);
            this.f10850g = true;
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f8) {
        this.f10851h = true;
        if (this.f10849f) {
            return !this.f10850g;
        }
        if (!super.getTransformation(j, transformation, f8)) {
            this.f10849f = true;
            P.r.a(this.f10847d, this);
        }
        return true;
    }
}
