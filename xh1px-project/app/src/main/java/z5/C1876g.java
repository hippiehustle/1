package z5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: z5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1876g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f16696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1877h f16698c;

    public C1876g(C1877h c1877h, boolean z8, int i4) {
        this.f16698c = c1877h;
        this.f16696a = z8;
        this.f16697b = i4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1877h c1877h = this.f16698c;
        c1877h.f16686b.setTranslationX(0.0f);
        c1877h.a(0.0f, this.f16696a, this.f16697b);
    }
}
