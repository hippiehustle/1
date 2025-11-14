package n;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import o.J0;
import o.M;
import o.P;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1107d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12594e;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1107d(int i4, Object obj) {
        this.f12593d = i4;
        this.f12594e = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f12593d) {
            case 0:
                ViewOnKeyListenerC1110g viewOnKeyListenerC1110g = (ViewOnKeyListenerC1110g) this.f12594e;
                ArrayList arrayList = viewOnKeyListenerC1110g.k;
                if (viewOnKeyListenerC1110g.b() && arrayList.size() > 0 && !((C1109f) arrayList.get(0)).f12600a.f13055B) {
                    View view = viewOnKeyListenerC1110g.f12617r;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C1109f) it.next()).f12600a.c();
                        }
                        return;
                    }
                    viewOnKeyListenerC1110g.dismiss();
                    return;
                }
                return;
            case 1:
                ViewOnKeyListenerC1102D viewOnKeyListenerC1102D = (ViewOnKeyListenerC1102D) this.f12594e;
                J0 j0 = viewOnKeyListenerC1102D.k;
                if (viewOnKeyListenerC1102D.b() && !j0.f13055B) {
                    View view2 = viewOnKeyListenerC1102D.f12567p;
                    if (view2 != null && view2.isShown()) {
                        j0.c();
                        return;
                    } else {
                        viewOnKeyListenerC1102D.dismiss();
                        return;
                    }
                }
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                P p8 = (P) this.f12594e;
                if (!p8.getInternalPopup().b()) {
                    p8.f13128i.l(p8.getTextDirection(), p8.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = p8.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                M m6 = (M) this.f12594e;
                P p9 = m6.f13112J;
                m6.getClass();
                if (p9.isAttachedToWindow() && p9.getGlobalVisibleRect(m6.f13110H)) {
                    m6.r();
                    m6.c();
                    return;
                } else {
                    m6.dismiss();
                    return;
                }
        }
    }
}
