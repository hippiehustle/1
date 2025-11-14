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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.slider.Slider;
import j2.C0902b;
import l2.C1001a;
import l4.C1022b;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class H extends E1.c {

    /* renamed from: I, reason: collision with root package name */
    public final C1001a f911I;

    /* renamed from: J, reason: collision with root package name */
    public final C0902b f912J;
    public final C1022b K;

    /* renamed from: L, reason: collision with root package name */
    public final A4.d f913L;

    /* renamed from: M, reason: collision with root package name */
    public A4.c f914M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C1001a c1001a, C0902b c0902b, C1022b c1022b) {
        super(3);
        o6.j.e(c0902b, "imageCondition");
        this.f911I = c1001a;
        this.f912J = c0902b;
        this.K = c1022b;
        this.f913L = new A4.d(o6.v.f13643a.b(P.class), new G(this, 0), new G(this, 1), new z(1, this));
    }

    @Override // E1.c
    public final Size G(ViewGroup viewGroup) {
        o6.j.e(viewGroup, "backgroundView");
        Size G8 = super.G(viewGroup);
        return new Size(k().getResources().getDimensionPixelSize(R.dimen.overlay_debug_text_width) + G8.getWidth(), G8.getHeight());
    }

    @Override // E1.c
    public final FrameLayout I(LayoutInflater layoutInflater) {
        P S8 = S();
        C1001a c1001a = this.f911I;
        o6.j.e(c1001a, "scenario");
        C0902b c0902b = this.f912J;
        o6.j.e(c0902b, "imageCondition");
        AbstractC0166y.q(U.g(S8), null, null, new J(S8, c1001a, c0902b, null), 3);
        View inflate = LayoutInflater.from(k()).inflate(R.layout.overlay_try_image_condition_menu, (ViewGroup) null, false);
        int i4 = R.id.btn_back;
        if (((ImageButton) E2.b.r(inflate, R.id.btn_back)) != null) {
            i4 = R.id.btn_hide_overlay;
            if (((ImageButton) E2.b.r(inflate, R.id.btn_hide_overlay)) != null) {
                i4 = R.id.btn_move;
                if (((ImageButton) E2.b.r(inflate, R.id.btn_move)) != null) {
                    i4 = R.id.divider;
                    if (((MaterialDivider) E2.b.r(inflate, R.id.divider)) != null) {
                        i4 = R.id.layout_result;
                        if (((ConstraintLayout) E2.b.r(inflate, R.id.layout_result)) != null) {
                            i4 = R.id.menu_background;
                            if (((CardView) E2.b.r(inflate, R.id.menu_background)) != null) {
                                i4 = R.id.menu_items;
                                if (((LinearLayout) E2.b.r(inflate, R.id.menu_items)) != null) {
                                    i4 = R.id.slider_threshold;
                                    Slider slider = (Slider) E2.b.r(inflate, R.id.slider_threshold);
                                    if (slider != null) {
                                        i4 = R.id.title_result;
                                        if (((TextView) E2.b.r(inflate, R.id.title_result)) != null) {
                                            i4 = R.id.title_threshold;
                                            if (((TextView) E2.b.r(inflate, R.id.title_threshold)) != null) {
                                                i4 = R.id.value_result;
                                                TextView textView = (TextView) E2.b.r(inflate, R.id.value_result);
                                                if (textView != null) {
                                                    i4 = R.id.value_threshold;
                                                    TextView textView2 = (TextView) E2.b.r(inflate, R.id.value_threshold);
                                                    if (textView2 != null) {
                                                        FrameLayout frameLayout = (FrameLayout) inflate;
                                                        A4.c cVar = new A4.c(frameLayout, slider, textView, textView2);
                                                        slider.setValueFrom(0.0f);
                                                        slider.setValueTo(20.0f);
                                                        slider.setValue(c0902b.f11795g);
                                                        slider.f2157p.add(new B(0, this));
                                                        this.f914M = cVar;
                                                        o6.j.d(frameLayout, "getRoot(...)");
                                                        return frameLayout;
                                                    }
                                                }
                                            }
                                        }
                                    }
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

    public final P S() {
        return (P) this.f913L.getValue();
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
        AbstractC0166y.q(U.e(this), null, null, new F(this, null), 3);
        P S8 = S();
        AbstractC0166y.q(U.g(S8), null, null, new N(S8, k(), null), 3);
    }

    @Override // w1.e
    public final void w() {
        S().e();
        this.K.m(Integer.valueOf(((Number) S().f932d.f()).intValue()));
    }
}
