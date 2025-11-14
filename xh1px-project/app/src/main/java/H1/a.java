package H1;

import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final AlphaAnimation f1876a;

    /* renamed from: b, reason: collision with root package name */
    public final AlphaAnimation f1877b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1878c;

    /* renamed from: d, reason: collision with root package name */
    public final AlphaAnimation f1879d;

    /* renamed from: e, reason: collision with root package name */
    public final AlphaAnimation f1880e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1881f;

    public a() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250L);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        this.f1876a = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(250L);
        alphaAnimation2.setInterpolator(new DecelerateInterpolator());
        this.f1877b = alphaAnimation2;
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation3.setDuration(150L);
        alphaAnimation3.setInterpolator(new DecelerateInterpolator());
        this.f1879d = alphaAnimation3;
        AlphaAnimation alphaAnimation4 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation4.setDuration(150L);
        alphaAnimation4.setInterpolator(new DecelerateInterpolator());
        this.f1880e = alphaAnimation4;
    }
}
