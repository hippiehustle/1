package D4;

import L7.AbstractC0166y;
import android.util.Size;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import k2.C0952b;
import l2.C1001a;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class A extends E1.c {

    /* renamed from: I, reason: collision with root package name */
    public final C1001a f896I;

    /* renamed from: J, reason: collision with root package name */
    public final C0952b f897J;
    public final A4.d K;

    /* renamed from: L, reason: collision with root package name */
    public A.i f898L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C1001a c1001a, C0952b c0952b) {
        super(3);
        o6.j.e(c1001a, "scenario");
        o6.j.e(c0952b, "triedElement");
        this.f896I = c1001a;
        this.f897J = c0952b;
        this.K = new A4.d(o6.v.f13643a.b(s.class), new x(this, 0), new x(this, 1), new z(0, this));
    }

    @Override // E1.c
    public final Size G(ViewGroup viewGroup) {
        o6.j.e(viewGroup, "backgroundView");
        Size G8 = super.G(viewGroup);
        return new Size(k().getResources().getDimensionPixelSize(R.dimen.overlay_debug_text_width) + G8.getWidth(), G8.getHeight());
    }

    @Override // E1.c
    public final FrameLayout I(LayoutInflater layoutInflater) {
        s S8 = S();
        C1001a c1001a = this.f896I;
        o6.j.e(c1001a, "scenario");
        C0952b c0952b = this.f897J;
        o6.j.e(c0952b, "imageEvent");
        AbstractC0166y.q(U.g(S8), null, null, new C0038n(S8, c1001a, c0952b, null), 3);
        View inflate = LayoutInflater.from(k()).inflate(R.layout.overlay_try_event_menu, (ViewGroup) null, false);
        int i4 = R.id.btn_back;
        if (((ImageButton) E2.b.r(inflate, R.id.btn_back)) != null) {
            i4 = R.id.btn_hide_overlay;
            if (((ImageButton) E2.b.r(inflate, R.id.btn_hide_overlay)) != null) {
                i4 = R.id.btn_move;
                if (((ImageButton) E2.b.r(inflate, R.id.btn_move)) != null) {
                    i4 = R.id.layout_result;
                    if (((FrameLayout) E2.b.r(inflate, R.id.layout_result)) != null) {
                        i4 = R.id.menu_background;
                        if (((CardView) E2.b.r(inflate, R.id.menu_background)) != null) {
                            i4 = R.id.menu_items;
                            if (((LinearLayout) E2.b.r(inflate, R.id.menu_items)) != null) {
                                i4 = R.id.text_result;
                                TextView textView = (TextView) E2.b.r(inflate, R.id.text_result);
                                if (textView != null) {
                                    FrameLayout frameLayout = (FrameLayout) inflate;
                                    this.f898L = new A.i(frameLayout, 1, textView);
                                    o6.j.d(frameLayout, "getRoot(...)");
                                    return frameLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // E1.c
    public final View J() {
        return new C0029e(k());
    }

    @Override // E1.c
    public final void K(int i4) {
        if (i4 == R.id.btn_back) {
            S().e();
            a();
        }
    }

    public final s S() {
        return (s) this.K.getValue();
    }

    @Override // w1.e
    public final boolean r(KeyEvent keyEvent) {
        if (!AbstractC1638C.D(keyEvent)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            S().e();
            a();
            return true;
        }
        return true;
    }

    @Override // w1.e
    public final void v() {
        AbstractC0166y.q(U.e(this), null, null, new w(this, null), 3);
        s S8 = S();
        AbstractC0166y.q(U.g(S8), null, null, new q(S8, k(), null), 3);
    }

    @Override // w1.e
    public final void w() {
        S().e();
    }
}
