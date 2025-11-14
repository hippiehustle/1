package L5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import o.C1178a0;

/* loaded from: classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f2995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f2997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f2998e;

    public p(r rVar, int i4, TextView textView, int i8, TextView textView2) {
        this.f2998e = rVar;
        this.f2994a = i4;
        this.f2995b = textView;
        this.f2996c = i8;
        this.f2997d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1178a0 c1178a0;
        int i4 = this.f2994a;
        r rVar = this.f2998e;
        rVar.f3013n = i4;
        rVar.f3011l = null;
        TextView textView = this.f2995b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f2996c == 1 && (c1178a0 = rVar.f3017r) != null) {
                c1178a0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f2997d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f2997d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
