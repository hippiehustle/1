package J3;

import D4.C0028d;
import L7.AbstractC0166y;
import L7.k0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Size;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.feature.smart.config.ui.common.starters.RestartMediaProjectionActivity;
import i.DialogInterfaceC0869h;
import l0.C0997a;
import s4.C1502j;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class u extends E1.c {

    /* renamed from: I, reason: collision with root package name */
    public final T4.a f2465I;

    /* renamed from: J, reason: collision with root package name */
    public final A4.d f2466J;
    public final A4.d K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2467L;

    /* renamed from: M, reason: collision with root package name */
    public F3.m f2468M;

    /* renamed from: N, reason: collision with root package name */
    public A4.c f2469N;

    /* renamed from: O, reason: collision with root package name */
    public k0 f2470O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2471P;

    public u(T4.a aVar) {
        super(3);
        this.f2465I = aVar;
        o6.w wVar = o6.v.f13643a;
        this.f2466J = new A4.d(wVar.b(H.class), new t(this, 0), new t(this, 1), new D4.z(3, this));
        this.K = new A4.d(wVar.b(C0028d.class), new t(this, 2), new t(this, 3), new D4.z(4, this));
    }

    @Override // E1.c
    public final Size G(ViewGroup viewGroup) {
        o6.j.e(viewGroup, "backgroundView");
        Size G8 = super.G(viewGroup);
        return new Size(k().getResources().getDimensionPixelSize(R.dimen.overlay_debug_panel_width) + G8.getWidth(), G8.getHeight());
    }

    @Override // E1.c
    public final FrameLayout I(LayoutInflater layoutInflater) {
        this.f2469N = new A4.c(k());
        View inflate = layoutInflater.inflate(R.layout.overlay_menu, (ViewGroup) null, false);
        int i4 = R.id.btn_click_list;
        ImageButton imageButton = (ImageButton) E2.b.r(inflate, R.id.btn_click_list);
        if (imageButton != null) {
            i4 = R.id.btn_move;
            if (((ImageButton) E2.b.r(inflate, R.id.btn_move)) != null) {
                i4 = R.id.btn_play;
                ImageButton imageButton2 = (ImageButton) E2.b.r(inflate, R.id.btn_play);
                if (imageButton2 != null) {
                    i4 = R.id.btn_stop;
                    ImageButton imageButton3 = (ImageButton) E2.b.r(inflate, R.id.btn_stop);
                    if (imageButton3 != null) {
                        i4 = R.id.debug_condition_name;
                        TextView textView = (TextView) E2.b.r(inflate, R.id.debug_condition_name);
                        if (textView != null) {
                            i4 = R.id.debug_confidence_rate;
                            TextView textView2 = (TextView) E2.b.r(inflate, R.id.debug_confidence_rate);
                            if (textView2 != null) {
                                i4 = R.id.debug_event_name;
                                TextView textView3 = (TextView) E2.b.r(inflate, R.id.debug_event_name);
                                if (textView3 != null) {
                                    i4 = R.id.error_badge;
                                    ImageView imageView = (ImageView) E2.b.r(inflate, R.id.error_badge);
                                    if (imageView != null) {
                                        i4 = R.id.layout_debug;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) E2.b.r(inflate, R.id.layout_debug);
                                        if (constraintLayout != null) {
                                            i4 = R.id.menu_background;
                                            if (((CardView) E2.b.r(inflate, R.id.menu_background)) != null) {
                                                i4 = R.id.menu_items;
                                                if (((LinearLayout) E2.b.r(inflate, R.id.menu_items)) != null) {
                                                    i4 = R.id.separator_start;
                                                    if (E2.b.r(inflate, R.id.separator_start) != null) {
                                                        FrameLayout frameLayout = (FrameLayout) inflate;
                                                        this.f2468M = new F3.m(frameLayout, imageButton, imageButton2, imageButton3, textView, textView2, textView3, imageView, constraintLayout);
                                                        A4.c cVar = this.f2469N;
                                                        if (cVar != null) {
                                                            cVar.f293g = imageButton2;
                                                            o6.j.d(frameLayout, "getRoot(...)");
                                                            return frameLayout;
                                                        }
                                                        o6.j.i("playPauseButtonController");
                                                        throw null;
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
    public final void K(int i4) {
        if (i4 == R.id.btn_play) {
            if (!((Boolean) S().f2421l.f4088d.f()).booleanValue()) {
                T();
                return;
            }
            H S8 = S();
            if (o6.j.a(S8.k.f4088d.f(), J.f2425a)) {
                SharedPreferences sharedPreferences = S8.f2415d.f2924g;
                o6.j.e(sharedPreferences, "<this>");
                if (!sharedPreferences.getBoolean("Tutorial_Stop_Volume_Down_dont_show_again", false)) {
                    DialogInterfaceC0869h t8 = AbstractC1638C.t(k(), new C0077b(this, 1));
                    Window window = t8.getWindow();
                    if (window != null) {
                        window.setType(2032);
                    }
                    t8.show();
                    return;
                }
            }
            S().f(k());
            return;
        }
        if (i4 == R.id.btn_click_list) {
            if (!((Boolean) S().f2421l.f4088d.f()).booleanValue()) {
                T();
                return;
            }
            H S9 = S();
            C0076a c0076a = new C0076a(this, 3);
            Long l6 = (Long) S9.f2419h.f4088d.f();
            if (l6 != null) {
                long longValue = l6.longValue();
                C0997a g8 = U.g(S9);
                S7.e eVar = L7.F.f3175a;
                AbstractC0166y.q(g8, S7.d.f5456f, null, new G(S9, longValue, c0076a, null), 2);
                return;
            }
            return;
        }
        if (i4 == R.id.btn_stop) {
            this.f2465I.a();
        }
    }

    public final H S() {
        return (H) this.f2466J.getValue();
    }

    public final void T() {
        C1.g o7 = o();
        Context k = k();
        Context k6 = k();
        int i4 = RestartMediaProjectionActivity.f9817I;
        Intent addFlags = new Intent(k6, (Class<?>) RestartMediaProjectionActivity.class).addFlags(268468224);
        o6.j.d(addFlags, "addFlags(...)");
        o7.d(k, new F1.a(addFlags), true);
    }

    public final void U() {
        o().d(k(), new C1502j(new C0076a(this, 0), new s(0, S(), H.class, "cancelScenarioChanges", "cancelScenarioChanges()V", 0, 0, 0)), true);
    }

    @Override // E1.c, w1.e
    public final void p() {
        super.p();
        F3.m mVar = this.f2468M;
        if (mVar != null) {
            ((ConstraintLayout) mVar.f1377l).setVisibility(8);
            Q(false);
            AbstractC0166y.q(U.e(this), null, null, new C0085j(this, null), 3);
            AbstractC0166y.q(U.e(this), null, null, new r(this, null), 3);
            return;
        }
        o6.j.i("viewBinding");
        throw null;
    }

    @Override // w1.e
    public final void q() {
        A4.c cVar = this.f2469N;
        if (cVar != null) {
            cVar.f293g = null;
        } else {
            o6.j.i("playPauseButtonController");
            throw null;
        }
    }

    @Override // w1.e
    public final boolean r(KeyEvent keyEvent) {
        if (AbstractC1638C.D(keyEvent)) {
            int action = keyEvent.getAction();
            if (action != 0) {
                if (action == 1 && this.f2471P) {
                    this.f2471P = false;
                    return true;
                }
            } else {
                H S8 = S();
                if (!(S8.k.f4088d.f() instanceof I)) {
                    return false;
                }
                S8.f2413b.e();
                this.f2471P = true;
                return true;
            }
        }
        return false;
    }

    @Override // w1.e
    public final void v() {
        H S8 = S();
        F3.m mVar = this.f2468M;
        if (mVar != null) {
            ImageButton imageButton = (ImageButton) mVar.f1373f;
            if (mVar != null) {
                ImageButton imageButton2 = (ImageButton) mVar.f1372e;
                J2.b bVar = S8.f2417f;
                bVar.a(J2.a.f2381w, imageButton);
                bVar.a(J2.a.f2380v, imageButton2);
                H S9 = S();
                k();
                S9.f2416e.getClass();
                return;
            }
            o6.j.i("viewBinding");
            throw null;
        }
        o6.j.i("viewBinding");
        throw null;
    }

    @Override // w1.e
    public final void w() {
        J2.b bVar = S().f2417f;
        bVar.b(J2.a.f2381w);
        bVar.b(J2.a.f2380v);
    }
}
