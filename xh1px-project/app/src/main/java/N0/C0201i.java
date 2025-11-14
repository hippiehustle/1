package N0;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* renamed from: N0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201i implements A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3599a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f3600b;

    public C0201i(LottieAnimationView lottieAnimationView, int i4) {
        this.f3599a = i4;
        switch (i4) {
            case 1:
                this.f3600b = new WeakReference(lottieAnimationView);
                return;
            default:
                this.f3600b = new WeakReference(lottieAnimationView);
                return;
        }
    }

    @Override // N0.A
    public final void onResult(Object obj) {
        switch (this.f3599a) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f3600b.get();
                if (lottieAnimationView != null) {
                    int i4 = lottieAnimationView.j;
                    if (i4 != 0) {
                        lottieAnimationView.setImageResource(i4);
                    }
                    A a3 = lottieAnimationView.f9734i;
                    if (a3 == null) {
                        a3 = LottieAnimationView.f9731t;
                    }
                    a3.onResult(th);
                    return;
                }
                return;
            default:
                C0202j c0202j = (C0202j) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f3600b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(c0202j);
                    return;
                }
                return;
        }
    }
}
