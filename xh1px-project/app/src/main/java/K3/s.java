package K3;

import L7.AbstractC0166y;
import O7.i0;
import a6.AbstractC0436k;
import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textview.MaterialTextView;
import e4.C0643a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l2.C1001a;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class s extends G1.f {

    /* renamed from: Q, reason: collision with root package name */
    public final A4.d f2707Q;

    /* renamed from: R, reason: collision with root package name */
    public F3.k f2708R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f2709S;

    public s(int i4) {
        super(R.string.brief_empty_actions, i4, Integer.valueOf(R.style.ScenarioConfigTheme));
        this.f2707Q = new A4.d(o6.v.f13643a.b(D.class), new r(this, 0), new r(this, 1), new D4.z(5, this));
    }

    @Override // E1.c
    public final FrameLayout I(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.overlay_actions_brief_menu, (ViewGroup) null, false);
        int i4 = R.id.btn_add_other;
        ImageButton imageButton = (ImageButton) E2.b.r(inflate, R.id.btn_add_other);
        if (imageButton != null) {
            i4 = R.id.btn_back;
            ImageButton imageButton2 = (ImageButton) E2.b.r(inflate, R.id.btn_back);
            if (imageButton2 != null) {
                i4 = R.id.btn_hide_overlay;
                ImageButton imageButton3 = (ImageButton) E2.b.r(inflate, R.id.btn_hide_overlay);
                if (imageButton3 != null) {
                    i4 = R.id.btn_move;
                    ImageButton imageButton4 = (ImageButton) E2.b.r(inflate, R.id.btn_move);
                    if (imageButton4 != null) {
                        i4 = R.id.btn_record;
                        ImageButton imageButton5 = (ImageButton) E2.b.r(inflate, R.id.btn_record);
                        if (imageButton5 != null) {
                            i4 = R.id.menu_background;
                            if (((CardView) E2.b.r(inflate, R.id.menu_background)) != null) {
                                i4 = R.id.menu_items;
                                if (((LinearLayout) E2.b.r(inflate, R.id.menu_items)) != null) {
                                    FrameLayout frameLayout = (FrameLayout) inflate;
                                    this.f2708R = new F3.k(frameLayout, imageButton, imageButton2, imageButton3, imageButton4, imageButton5, 0);
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
    public final void K(int i4) {
        if (i4 == R.id.btn_back) {
            if (T()) {
                i0 i0Var = h0().f2645g;
                i0Var.h(null, new C0092f(((C0092f) i0Var.f()).f2675a, false));
                e0();
                return;
            }
            a();
            return;
        }
        if (i4 == R.id.btn_record) {
            if (!T()) {
                i0 i0Var2 = h0().f2645g;
                i0Var2.h(null, new C0092f(((C0092f) i0Var2.f()).f2675a, true));
                d0(new C1.b(3, this));
                return;
            }
            return;
        }
        if (i4 == R.id.btn_add_other) {
            D h02 = h0();
            o().d(k(), new V3.m((List) h02.f2648l.f4088d.f(), new M7.c(this, 3, h02)), false);
        }
    }

    @Override // G1.f, E1.c
    public final void M(boolean z8) {
        super.M(z8);
        F3.k kVar = this.f2708R;
        if (kVar != null) {
            O(kVar.j, z8, false);
        } else {
            o6.j.i("viewBinding");
            throw null;
        }
    }

    @Override // G1.f
    public final void U(View view, int i4) {
        if (i4 != 0) {
            return;
        }
        J2.a aVar = J2.a.f2365e;
        if (view != null) {
            h0().f2644f.a(aVar, view);
        } else {
            h0().f2644f.b(aVar);
        }
    }

    @Override // G1.f
    public final C0095i V(ViewGroup viewGroup, int i4) {
        C0093g c0093g;
        o6.j.e(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        o6.j.d(from, "from(...)");
        int i8 = R.id.layout_card_item;
        if (i4 == 1) {
            View inflate = from.inflate(R.layout.item_smart_action_brief_port, viewGroup, false);
            ImageView imageView = (ImageView) E2.b.r(inflate, R.id.error_badge);
            if (imageView != null) {
                MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate, R.id.item_description);
                if (materialTextView != null) {
                    ImageView imageView2 = (ImageView) E2.b.r(inflate, R.id.item_icon);
                    if (imageView2 != null) {
                        MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(inflate, R.id.item_name);
                        if (materialTextView2 != null) {
                            if (((ConstraintLayout) E2.b.r(inflate, R.id.layout_card_item)) != null) {
                                FrameLayout frameLayout = (FrameLayout) inflate;
                                o6.j.d(frameLayout, "getRoot(...)");
                                c0093g = new C0093g(frameLayout, imageView2, materialTextView2, materialTextView, imageView);
                            }
                        } else {
                            i8 = R.id.item_name;
                        }
                    } else {
                        i8 = R.id.item_icon;
                    }
                } else {
                    i8 = R.id.item_description;
                }
            } else {
                i8 = R.id.error_badge;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
        }
        View inflate2 = from.inflate(R.layout.item_smart_action_brief_land, viewGroup, false);
        ImageView imageView3 = (ImageView) E2.b.r(inflate2, R.id.error_badge);
        if (imageView3 != null) {
            MaterialTextView materialTextView3 = (MaterialTextView) E2.b.r(inflate2, R.id.item_description);
            if (materialTextView3 != null) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) E2.b.r(inflate2, R.id.item_icon);
                if (appCompatImageView != null) {
                    MaterialTextView materialTextView4 = (MaterialTextView) E2.b.r(inflate2, R.id.item_name);
                    if (materialTextView4 != null) {
                        if (((ConstraintLayout) E2.b.r(inflate2, R.id.layout_card_item)) != null) {
                            FrameLayout frameLayout2 = (FrameLayout) inflate2;
                            o6.j.d(frameLayout2, "getRoot(...)");
                            c0093g = new C0093g(frameLayout2, appCompatImageView, materialTextView4, materialTextView3, imageView3);
                        }
                    } else {
                        i8 = R.id.item_name;
                    }
                } else {
                    i8 = R.id.item_icon;
                }
            } else {
                i8 = R.id.item_description;
            }
        } else {
            i8 = R.id.error_badge;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i8)));
        return new C0095i(c0093g, 0);
    }

    @Override // G1.f
    public final void W(int i4) {
        C3.a aVar;
        H3.n nVar = h0().f2642d;
        List d2 = nVar.f1950e.d();
        if (d2 != null) {
            ArrayList S02 = AbstractC0436k.S0(d2);
            if (i4 >= 0 && i4 < S02.size()) {
                nVar.c((f2.a) S02.get(i4));
                E3.a aVar2 = (E3.a) nVar.f1948c.f601h.f();
                if (aVar2 != null && (aVar = aVar2.f1193m) != null) {
                    aVar.a();
                }
            }
        }
    }

    @Override // G1.f
    public final void X(int i4) {
        super.X(i4);
        i0 i0Var = h0().f2645g;
        C0092f c0092f = new C0092f(i4, false);
        i0Var.getClass();
        i0Var.h(null, c0092f);
    }

    @Override // G1.f
    public final void Y(G1.a aVar) {
        o6.j.e(aVar, "item");
        E2.d.R(this, h0(), ((C0643a) aVar.f1694b).f10609d);
    }

    @Override // G1.f
    public final void Z(int i4, int i8) {
        if (i8 < 2) {
            return;
        }
        o().d(k(), new A1.l(R.style.ScenarioConfigTheme, i4 + 1, i8, new C0096j(i4, this, 0)), false);
    }

    @Override // G1.f
    public final void a0(int i4, int i8) {
        List d2;
        H3.n nVar = h0().f2642d;
        if (i4 != i8 && (d2 = nVar.f1950e.d()) != null) {
            ArrayList S02 = AbstractC0436k.S0(d2);
            if (S02.size() > 1 && i4 >= 0 && i4 < S02.size() && i8 >= 0 && i8 < S02.size()) {
                Collections.swap(S02, i4, i8);
                nVar.i(S02);
            }
        }
    }

    @Override // G1.f
    public final void b0(int i4) {
        ArrayList arrayList;
        i0(true);
        D h02 = h0();
        Context k = k();
        B0.e eVar = new B0.e(5, this);
        H3.n nVar = h02.f2642d;
        C1001a g8 = nVar.f1950e.g();
        List d2 = nVar.f1950e.d();
        if (d2 != null) {
            arrayList = AbstractC0436k.S0(d2);
        } else {
            arrayList = null;
        }
        if (g8 != null && arrayList != null && i4 >= 0 && i4 < arrayList.size()) {
            AbstractC0166y.q(U.g(h02), null, null, new w(h02, k, g8, arrayList, i4, eVar, null), 3);
        }
    }

    public final D h0() {
        return (D) this.f2707Q.getValue();
    }

    public final void i0(boolean z8) {
        boolean z9 = !z8;
        Q(z9);
        F3.k kVar = this.f2708R;
        if (kVar != null) {
            O(kVar.f1364g, z9, false);
            F3.k kVar2 = this.f2708R;
            if (kVar2 != null) {
                O(kVar2.f1363f, z9, false);
                F3.k kVar3 = this.f2708R;
                if (kVar3 != null) {
                    O(kVar3.f1365h, z9, false);
                    F3.k kVar4 = this.f2708R;
                    if (kVar4 != null) {
                        O(kVar4.f1366i, z9, false);
                        F3.k kVar5 = this.f2708R;
                        if (kVar5 != null) {
                            O(kVar5.j, z9, false);
                            return;
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    }
                    o6.j.i("viewBinding");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            }
            o6.j.i("viewBinding");
            throw null;
        }
        o6.j.i("viewBinding");
        throw null;
    }

    @Override // E1.c, w1.e
    public final void p() {
        super.p();
        AbstractC0166y.q(U.e(this), null, null, new q(this, null), 3);
    }

    @Override // w1.e
    public final boolean r(KeyEvent keyEvent) {
        if (AbstractC1638C.D(keyEvent)) {
            int action = keyEvent.getAction();
            if (action != 0) {
                if (action == 1 && this.f2709S) {
                    this.f2709S = false;
                    return true;
                }
            } else {
                v2.h hVar = h0().f2643e;
                if (hVar.a()) {
                    hVar.e();
                    this.f2709S = true;
                    i0(false);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w1.e
    public final void v() {
        D h02 = h0();
        F3.k kVar = this.f2708R;
        if (kVar != null) {
            ImageButton imageButton = kVar.f1363f;
            if (kVar != null) {
                ImageButton imageButton2 = kVar.f1364g;
                J2.b bVar = h02.f2644f;
                bVar.a(J2.a.f2366f, imageButton);
                bVar.a(J2.a.f2367g, imageButton2);
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
        J2.b bVar = h0().f2644f;
        bVar.b(J2.a.f2365e);
        bVar.b(J2.a.f2366f);
        bVar.b(J2.a.f2367g);
    }
}
