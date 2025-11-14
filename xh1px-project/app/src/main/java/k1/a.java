package k1;

import android.view.animation.Animation;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class a implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162a f11954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162a f11955b;

    public a(InterfaceC1162a interfaceC1162a, InterfaceC1162a interfaceC1162a2) {
        this.f11954a = interfaceC1162a;
        this.f11955b = interfaceC1162a2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        InterfaceC1162a interfaceC1162a = this.f11955b;
        if (interfaceC1162a != null) {
            interfaceC1162a.a();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        InterfaceC1162a interfaceC1162a = this.f11954a;
        if (interfaceC1162a != null) {
            interfaceC1162a.a();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
