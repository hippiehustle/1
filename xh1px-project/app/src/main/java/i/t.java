package i;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t extends E2.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11734g;

    public /* synthetic */ t(int i4, Object obj) {
        this.f11733f = i4;
        this.f11734g = obj;
    }

    @Override // E2.c, P.V
    public void F() {
        int i4 = this.f11733f;
        Object obj = this.f11734g;
        switch (i4) {
            case 0:
                ((q) obj).f11730e.f11595y.setVisibility(0);
                return;
            case 1:
                LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) obj;
                layoutInflaterFactory2C0860C.f11595y.setVisibility(0);
                if (layoutInflaterFactory2C0860C.f11595y.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0860C.f11595y.getParent();
                    WeakHashMap weakHashMap = P.O.f4214a;
                    P.D.c(view);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // P.V
    public final void c() {
        int i4 = this.f11733f;
        Object obj = this.f11734g;
        switch (i4) {
            case 0:
                LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = ((q) obj).f11730e;
                layoutInflaterFactory2C0860C.f11595y.setAlpha(1.0f);
                layoutInflaterFactory2C0860C.f11551B.d(null);
                layoutInflaterFactory2C0860C.f11551B = null;
                return;
            case 1:
                LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C2 = (LayoutInflaterFactory2C0860C) obj;
                layoutInflaterFactory2C0860C2.f11595y.setAlpha(1.0f);
                layoutInflaterFactory2C0860C2.f11551B.d(null);
                layoutInflaterFactory2C0860C2.f11551B = null;
                return;
            default:
                LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C3 = (LayoutInflaterFactory2C0860C) ((R3.r) obj).f5083f;
                layoutInflaterFactory2C0860C3.f11595y.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C0860C3.f11596z;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0860C3.f11595y.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0860C3.f11595y.getParent();
                    WeakHashMap weakHashMap = P.O.f4214a;
                    P.D.c(view);
                }
                layoutInflaterFactory2C0860C3.f11595y.e();
                layoutInflaterFactory2C0860C3.f11551B.d(null);
                layoutInflaterFactory2C0860C3.f11551B = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0860C3.f11553D;
                WeakHashMap weakHashMap2 = P.O.f4214a;
                P.D.c(viewGroup);
                return;
        }
    }
}
