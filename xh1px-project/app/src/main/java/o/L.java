package o;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import n.ViewTreeObserverOnGlobalLayoutListenerC1107d;

/* loaded from: classes.dex */
public final class L implements PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1107d f13098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M f13099e;

    public L(M m6, ViewTreeObserverOnGlobalLayoutListenerC1107d viewTreeObserverOnGlobalLayoutListenerC1107d) {
        this.f13099e = m6;
        this.f13098d = viewTreeObserverOnGlobalLayoutListenerC1107d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f13099e.f13112J.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f13098d);
        }
    }
}
