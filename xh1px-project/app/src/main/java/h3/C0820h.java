package h3;

import D4.z;
import L7.AbstractC0166y;
import R3.r;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import i.DialogInterfaceC0869h;
import l1.C0999a;
import l1.C1000b;
import o6.v;
import u6.AbstractC1638C;

/* renamed from: h3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820h extends E1.c {

    /* renamed from: I, reason: collision with root package name */
    public final C0999a f11346I;

    /* renamed from: J, reason: collision with root package name */
    public final T4.a f11347J;
    public final A4.d K;

    /* renamed from: L, reason: collision with root package name */
    public A4.d f11348L;

    /* renamed from: M, reason: collision with root package name */
    public A4.c f11349M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f11350N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0820h(C0999a c0999a, T4.a aVar) {
        super(2);
        o6.j.e(c0999a, "dumbScenarioId");
        this.f11346I = c0999a;
        this.f11347J = aVar;
        this.K = new A4.d(v.f13643a.b(C0826n.class), new C0819g(this, 0), new C0819g(this, 1), new z(29, this));
    }

    @Override // E1.c
    public final FrameLayout I(LayoutInflater layoutInflater) {
        this.f11349M = new A4.c(k());
        View inflate = layoutInflater.inflate(R.layout.overlay_dumb_main_menu, (ViewGroup) null, false);
        int i4 = R.id.btn_action_list;
        ImageButton imageButton = (ImageButton) E2.b.r(inflate, R.id.btn_action_list);
        if (imageButton != null) {
            i4 = R.id.btn_move;
            if (((ImageButton) E2.b.r(inflate, R.id.btn_move)) != null) {
                i4 = R.id.btn_play;
                ImageButton imageButton2 = (ImageButton) E2.b.r(inflate, R.id.btn_play);
                if (imageButton2 != null) {
                    i4 = R.id.btn_show_actions;
                    ImageButton imageButton3 = (ImageButton) E2.b.r(inflate, R.id.btn_show_actions);
                    if (imageButton3 != null) {
                        i4 = R.id.btn_stop;
                        ImageButton imageButton4 = (ImageButton) E2.b.r(inflate, R.id.btn_stop);
                        if (imageButton4 != null) {
                            i4 = R.id.menu_background;
                            if (((CardView) E2.b.r(inflate, R.id.menu_background)) != null) {
                                i4 = R.id.menu_items;
                                if (((LinearLayout) E2.b.r(inflate, R.id.menu_items)) != null) {
                                    FrameLayout frameLayout = (FrameLayout) inflate;
                                    A4.d dVar = new A4.d(frameLayout, imageButton, imageButton2, imageButton3, imageButton4, 20);
                                    A4.c cVar = this.f11349M;
                                    if (cVar != null) {
                                        cVar.f293g = imageButton2;
                                        this.f11348L = dVar;
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // E1.c
    public final void K(int i4) {
        if (i4 == R.id.btn_play) {
            C0826n S8 = S();
            if (!((Boolean) S8.f11362f.f()).booleanValue()) {
                SharedPreferences sharedPreferences = S8.f11360d.f2924g;
                o6.j.e(sharedPreferences, "<this>");
                if (!sharedPreferences.getBoolean("Tutorial_Stop_Volume_Down_dont_show_again", false)) {
                    DialogInterfaceC0869h t8 = AbstractC1638C.t(k(), new A1.h(22, this));
                    Window window = t8.getWindow();
                    if (window != null) {
                        window.setType(2032);
                    }
                    t8.show();
                    return;
                }
            }
            C0826n S9 = S();
            AbstractC0166y.q(U.g(S9), null, null, new C0825m(S9, null), 3);
            return;
        }
        if (i4 == R.id.btn_stop) {
            this.f11347J.a();
            return;
        }
        C0999a c0999a = this.f11346I;
        if (i4 == R.id.btn_show_actions) {
            S().e(c0999a, new C0813a(this, 3));
        } else if (i4 == R.id.btn_action_list) {
            S().e(c0999a, new C0813a(this, 2));
        }
    }

    public final C0826n S() {
        return (C0826n) this.K.getValue();
    }

    @Override // E1.c, w1.e
    public final void p() {
        super.p();
        AbstractC0166y.q(U.e(this), null, null, new C0818f(this, null), 3);
    }

    @Override // w1.e
    public final void q() {
        A4.c cVar = this.f11349M;
        if (cVar != null) {
            cVar.f293g = null;
            g3.e eVar = S().f11358b;
            eVar.f11149b.g(null);
            r rVar = eVar.f11153f;
            ((C1000b) rVar.f5082e).f12189a = 0L;
            rVar.f5083f = null;
            return;
        }
        o6.j.i("playPauseButtonController");
        throw null;
    }

    @Override // w1.e
    public final boolean r(KeyEvent keyEvent) {
        if (AbstractC1638C.D(keyEvent)) {
            int action = keyEvent.getAction();
            if (action != 0) {
                if (action == 1 && this.f11350N) {
                    this.f11350N = false;
                    return true;
                }
            } else {
                C0826n S8 = S();
                if (((Boolean) S8.f11362f.f()).booleanValue()) {
                    AbstractC0166y.q(U.g(S8), null, null, new C0824l(S8, null), 3);
                    this.f11350N = true;
                    return true;
                }
            }
        }
        return false;
    }
}
