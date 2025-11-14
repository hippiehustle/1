package g0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class C implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f10852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f10853e;

    public C(D d2, a0 a0Var) {
        this.f10853e = d2;
        this.f10852d = a0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        a0 a0Var = this.f10852d;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = a0Var.f10972c;
        a0Var.k();
        C0744m.i((ViewGroup) abstractComponentCallbacksC0755y.K.getParent(), this.f10853e.f10854d).h();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
