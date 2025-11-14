package n;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class v implements PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f12703d;

    public v(w wVar) {
        this.f12703d = wVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f12703d.c();
    }
}
