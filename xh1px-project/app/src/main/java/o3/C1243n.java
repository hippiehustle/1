package o3;

import K3.C0095i;
import K3.C0096j;
import L7.AbstractC0166y;
import O7.i0;
import Z5.y;
import a6.AbstractC0436k;
import android.content.Context;
import android.graphics.Point;
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
import g0.b0;
import h4.AbstractC0832f;
import j3.C0933s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k3.C0965l;
import n6.InterfaceC1163b;
import q2.C1365k;
import u6.AbstractC1638C;

/* renamed from: o3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1243n extends G1.f {

    /* renamed from: Q, reason: collision with root package name */
    public final J3.s f13466Q;

    /* renamed from: R, reason: collision with root package name */
    public final A4.d f13467R;

    /* renamed from: S, reason: collision with root package name */
    public F3.k f13468S;

    /* renamed from: T, reason: collision with root package name */
    public b0 f13469T;

    /* renamed from: U, reason: collision with root package name */
    public R.g f13470U;

    /* renamed from: V, reason: collision with root package name */
    public R.g f13471V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f13472W;

    public C1243n(J3.s sVar) {
        super(R.string.message_dumb_brief_empty_action_list, 0, Integer.valueOf(R.style.AppTheme));
        this.f13466Q = sVar;
        this.f13467R = new A4.d(o6.v.f13643a.b(C1250u.class), new C1242m(this, 0), new C1242m(this, 1), new C0933s(11, this));
    }

    @Override // E1.c
    public final FrameLayout I(LayoutInflater layoutInflater) {
        final int i4 = 0;
        this.f13469T = new b0(new InterfaceC1163b(this) { // from class: o3.b

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1243n f13445e;

            {
                this.f13445e = this;
            }

            @Override // n6.InterfaceC1163b
            public final Object m(Object obj) {
                switch (i4) {
                    case 0:
                        Point point = (Point) obj;
                        o6.j.e(point, "position");
                        C1243n c1243n = this.f13445e;
                        C1250u h02 = c1243n.h0();
                        return h02.f13490c.f11153f.u(c1243n.k(), point);
                    default:
                        p2.d dVar = (p2.d) obj;
                        o6.j.e(dVar, "action");
                        C1243n c1243n2 = this.f13445e;
                        c1243n2.h0().f13490c.a(dVar, Integer.valueOf(c1243n2.K.k + 1));
                        return y.f7506a;
                }
            }
        }, new C1232c(this, 0), new C1233d(this, 0), new W4.i(1, h0(), C1250u.class, "createDumbActionCopy", "createDumbActionCopy(Lcom/buzbuz/smartautoclicker/core/dumb/domain/model/DumbAction;)Lcom/buzbuz/smartautoclicker/core/dumb/domain/model/DumbAction;", 0, 0, 14));
        final int i8 = 1;
        this.f13470U = new R.g(new InterfaceC1163b(this) { // from class: o3.b

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1243n f13445e;

            {
                this.f13445e = this;
            }

            @Override // n6.InterfaceC1163b
            public final Object m(Object obj) {
                switch (i8) {
                    case 0:
                        Point point = (Point) obj;
                        o6.j.e(point, "position");
                        C1243n c1243n = this.f13445e;
                        C1250u h02 = c1243n.h0();
                        return h02.f13490c.f11153f.u(c1243n.k(), point);
                    default:
                        p2.d dVar = (p2.d) obj;
                        o6.j.e(dVar, "action");
                        C1243n c1243n2 = this.f13445e;
                        c1243n2.h0().f13490c.a(dVar, Integer.valueOf(c1243n2.K.k + 1));
                        return y.f7506a;
                }
            }
        }, new C1234e(0), new C1235f(0), 12);
        this.f13471V = new R.g(new W4.i(1, h0(), C1250u.class, "updateDumbAction", "updateDumbAction(Lcom/buzbuz/smartautoclicker/core/dumb/domain/model/DumbAction;)V", 0, 0, 15), new W4.i(1, h0(), C1250u.class, "deleteDumbAction", "deleteDumbAction(Lcom/buzbuz/smartautoclicker/core/dumb/domain/model/DumbAction;)V", 0, 0, 16), new C1235f(0), 12);
        View inflate = layoutInflater.inflate(R.layout.overlay_dumb_scenario_brief_menu, (ViewGroup) null, false);
        int i9 = R.id.btn_add;
        ImageButton imageButton = (ImageButton) E2.b.r(inflate, R.id.btn_add);
        if (imageButton != null) {
            i9 = R.id.btn_back;
            ImageButton imageButton2 = (ImageButton) E2.b.r(inflate, R.id.btn_back);
            if (imageButton2 != null) {
                i9 = R.id.btn_hide_overlay;
                ImageButton imageButton3 = (ImageButton) E2.b.r(inflate, R.id.btn_hide_overlay);
                if (imageButton3 != null) {
                    i9 = R.id.btn_move;
                    ImageButton imageButton4 = (ImageButton) E2.b.r(inflate, R.id.btn_move);
                    if (imageButton4 != null) {
                        i9 = R.id.btn_record;
                        ImageButton imageButton5 = (ImageButton) E2.b.r(inflate, R.id.btn_record);
                        if (imageButton5 != null) {
                            i9 = R.id.menu_background;
                            if (((CardView) E2.b.r(inflate, R.id.menu_background)) != null) {
                                i9 = R.id.menu_items;
                                if (((LinearLayout) E2.b.r(inflate, R.id.menu_items)) != null) {
                                    FrameLayout frameLayout = (FrameLayout) inflate;
                                    this.f13468S = new F3.k(frameLayout, imageButton, imageButton2, imageButton3, imageButton4, imageButton5, 1);
                                    o6.j.d(frameLayout, "getRoot(...)");
                                    return frameLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i9)));
    }

    @Override // E1.c
    public final void K(int i4) {
        if (i4 == R.id.btn_back) {
            if (T()) {
                i0 i0Var = h0().f13492e;
                i0Var.h(null, new C1230a(((C1230a) i0Var.f()).f13442a, false));
                e0();
                return;
            } else {
                C1365k c1365k = h0().f13491d;
                if (!((Boolean) c1365k.k.f()).booleanValue()) {
                    this.f13466Q.a();
                    a();
                    return;
                } else {
                    c1365k.c();
                    return;
                }
            }
        }
        if (i4 == R.id.btn_record) {
            if (!T()) {
                i0 i0Var2 = h0().f13492e;
                i0Var2.h(null, new C1230a(((C1230a) i0Var2.f()).f13442a, true));
                d0(new C1232c(this, 1));
                return;
            }
            return;
        }
        if (i4 == R.id.btn_add) {
            K2.d dVar = this.f1708L;
            if (dVar != null) {
                dVar.c();
                C1.g o7 = o();
                Context k = k();
                b0 b0Var = this.f13469T;
                if (b0Var != null) {
                    R.g gVar = this.f13470U;
                    if (gVar != null) {
                        AbstractC0832f.A(o7, gVar, k, b0Var);
                        return;
                    } else {
                        o6.j.i("createCopyActionUiFlowListener");
                        throw null;
                    }
                }
                o6.j.i("dumbActionCreator");
                throw null;
            }
            o6.j.i("briefPanelAnimationController");
            throw null;
        }
    }

    @Override // G1.f, E1.c
    public final void M(boolean z8) {
        super.M(z8);
        F3.k kVar = this.f13468S;
        if (kVar != null) {
            O(kVar.j, z8, false);
        } else {
            o6.j.i("menuViewBinding");
            throw null;
        }
    }

    @Override // G1.f
    public final C0095i V(ViewGroup viewGroup, int i4) {
        C1251v c1251v;
        o6.j.e(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        o6.j.d(from, "from(...)");
        int i8 = R.id.layout_card_dumb_action;
        if (i4 == 1) {
            View inflate = from.inflate(R.layout.item_dumb_action_brief_port, viewGroup, false);
            MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate, R.id.action_duration);
            if (materialTextView != null) {
                MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(inflate, R.id.action_name);
                if (materialTextView2 != null) {
                    MaterialTextView materialTextView3 = (MaterialTextView) E2.b.r(inflate, R.id.action_repeat);
                    if (materialTextView3 != null) {
                        ImageView imageView = (ImageView) E2.b.r(inflate, R.id.action_type_icon);
                        if (imageView != null) {
                            if (((ConstraintLayout) E2.b.r(inflate, R.id.layout_card_dumb_action)) != null) {
                                FrameLayout frameLayout = (FrameLayout) inflate;
                                o6.j.d(frameLayout, "getRoot(...)");
                                c1251v = new C1251v(frameLayout, materialTextView2, materialTextView, materialTextView3, imageView);
                            }
                        } else {
                            i8 = R.id.action_type_icon;
                        }
                    } else {
                        i8 = R.id.action_repeat;
                    }
                } else {
                    i8 = R.id.action_name;
                }
            } else {
                i8 = R.id.action_duration;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
        }
        View inflate2 = from.inflate(R.layout.item_dumb_action_brief_land, viewGroup, false);
        MaterialTextView materialTextView4 = (MaterialTextView) E2.b.r(inflate2, R.id.action_duration);
        if (materialTextView4 != null) {
            MaterialTextView materialTextView5 = (MaterialTextView) E2.b.r(inflate2, R.id.action_name);
            if (materialTextView5 != null) {
                MaterialTextView materialTextView6 = (MaterialTextView) E2.b.r(inflate2, R.id.action_repeat);
                if (materialTextView6 != null) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) E2.b.r(inflate2, R.id.action_type_icon);
                    if (appCompatImageView != null) {
                        if (((ConstraintLayout) E2.b.r(inflate2, R.id.layout_card_dumb_action)) != null) {
                            FrameLayout frameLayout2 = (FrameLayout) inflate2;
                            o6.j.d(frameLayout2, "getRoot(...)");
                            c1251v = new C1251v(frameLayout2, materialTextView5, materialTextView4, materialTextView6, appCompatImageView);
                        }
                    } else {
                        i8 = R.id.action_type_icon;
                    }
                } else {
                    i8 = R.id.action_repeat;
                }
            } else {
                i8 = R.id.action_name;
            }
        } else {
            i8 = R.id.action_duration;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i8)));
        return new C0095i(c1251v, 2);
    }

    @Override // G1.f
    public final void W(int i4) {
        List list;
        C1250u h02 = h0();
        p2.e eVar = (p2.e) h02.f13490c.f11150c.f();
        if (eVar != null && (list = eVar.f13701c) != null && i4 >= 0 && i4 < list.size()) {
            h02.e((p2.d) list.get(i4));
        }
    }

    @Override // G1.f
    public final void X(int i4) {
        super.X(i4);
        i0 i0Var = h0().f13492e;
        C1230a c1230a = new C1230a(i4, false);
        i0Var.getClass();
        i0Var.h(null, c1230a);
    }

    @Override // G1.f
    public final void Y(G1.a aVar) {
        o6.j.e(aVar, "item");
        p2.d dVar = ((C0965l) aVar.f1694b).f12003f;
        C1.g o7 = o();
        Context k = k();
        R.g gVar = this.f13471V;
        if (gVar != null) {
            AbstractC0832f.B(o7, k, dVar, gVar);
        } else {
            o6.j.i("updateActionUiFlowListener");
            throw null;
        }
    }

    @Override // G1.f
    public final void Z(int i4, int i8) {
        if (i8 < 2) {
            return;
        }
        o().d(k(), new A1.l(R.style.AppTheme, i4 + 1, i8, new C0096j(i4, this, 2)), false);
    }

    @Override // G1.f
    public final void a0(int i4, int i8) {
        List list;
        g3.e eVar = h0().f13490c;
        p2.e eVar2 = (p2.e) eVar.f11150c.f();
        if (eVar2 != null && (list = eVar2.f13701c) != null) {
            ArrayList S02 = AbstractC0436k.S0(list);
            Collections.swap(S02, i4, i8);
            eVar.f(S02);
        }
    }

    @Override // G1.f
    public final void b0(int i4) {
        List list;
        i0(true);
        C1250u h02 = h0();
        C1233d c1233d = new C1233d(this, 1);
        p2.e eVar = (p2.e) h02.f13490c.f11150c.f();
        if (eVar != null) {
            list = eVar.f13701c;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty() && i4 >= 0 && i4 < list.size()) {
            AbstractC0166y.q(U.g(h02), null, null, new C1245p(h02, list, i4, c1233d, null), 3);
        }
    }

    public final C1250u h0() {
        return (C1250u) this.f13467R.getValue();
    }

    public final void i0(boolean z8) {
        boolean z9 = !z8;
        Q(z9);
        F3.k kVar = this.f13468S;
        if (kVar != null) {
            O(kVar.f1364g, true, false);
            F3.k kVar2 = this.f13468S;
            if (kVar2 != null) {
                O(kVar2.f1363f, z9, false);
                F3.k kVar3 = this.f13468S;
                if (kVar3 != null) {
                    O(kVar3.f1365h, z9, false);
                    F3.k kVar4 = this.f13468S;
                    if (kVar4 != null) {
                        O(kVar4.f1366i, z9, false);
                        F3.k kVar5 = this.f13468S;
                        if (kVar5 != null) {
                            O(kVar5.j, z9, false);
                            return;
                        } else {
                            o6.j.i("menuViewBinding");
                            throw null;
                        }
                    }
                    o6.j.i("menuViewBinding");
                    throw null;
                }
                o6.j.i("menuViewBinding");
                throw null;
            }
            o6.j.i("menuViewBinding");
            throw null;
        }
        o6.j.i("menuViewBinding");
        throw null;
    }

    @Override // E1.c, w1.e
    public final void p() {
        super.p();
        AbstractC0166y.q(U.e(this), null, null, new C1241l(this, null), 3);
    }

    @Override // w1.e
    public final boolean r(KeyEvent keyEvent) {
        if (AbstractC1638C.D(keyEvent)) {
            int action = keyEvent.getAction();
            if (action != 0) {
                if (action == 1 && this.f13472W) {
                    this.f13472W = false;
                    return true;
                }
            } else {
                C1365k c1365k = h0().f13491d;
                if (!((Boolean) c1365k.k.f()).booleanValue()) {
                    return false;
                }
                c1365k.c();
                this.f13472W = true;
                return true;
            }
        }
        return false;
    }
}
