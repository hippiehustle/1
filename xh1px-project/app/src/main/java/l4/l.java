package l4;

import D4.H;
import K3.C0095i;
import K3.C0096j;
import L7.AbstractC0166y;
import O7.i0;
import Z5.y;
import a6.AbstractC0436k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textview.MaterialTextView;
import f4.C0708a;
import h4.AbstractC0832f;
import j2.C0902b;
import j3.C0933s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.C0971c;
import l2.C1001a;
import n6.InterfaceC1162a;
import o6.v;
import q4.X;

/* loaded from: classes.dex */
public final class l extends G1.f {

    /* renamed from: Q, reason: collision with root package name */
    public final A4.d f12276Q;

    /* renamed from: R, reason: collision with root package name */
    public F3.l f12277R;

    public l(int i4) {
        super(R.string.brief_empty_image_conditions, i4, Integer.valueOf(R.style.AppTheme));
        this.f12276Q = new A4.d(v.f13643a.b(p.class), new k(this, 0), new k(this, 1), new C0933s(7, this));
    }

    @Override // E1.c
    public final FrameLayout I(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.overlay_image_conditions_brief_menu, (ViewGroup) null, false);
        int i4 = R.id.btn_add;
        ImageButton imageButton = (ImageButton) E2.b.r(inflate, R.id.btn_add);
        if (imageButton != null) {
            i4 = R.id.btn_copy;
            if (((ImageButton) E2.b.r(inflate, R.id.btn_copy)) != null) {
                i4 = R.id.btn_hide_overlay;
                if (((ImageButton) E2.b.r(inflate, R.id.btn_hide_overlay)) != null) {
                    i4 = R.id.btn_move;
                    if (((ImageButton) E2.b.r(inflate, R.id.btn_move)) != null) {
                        i4 = R.id.btn_save;
                        ImageButton imageButton2 = (ImageButton) E2.b.r(inflate, R.id.btn_save);
                        if (imageButton2 != null) {
                            i4 = R.id.menu_background;
                            if (((CardView) E2.b.r(inflate, R.id.menu_background)) != null) {
                                i4 = R.id.menu_items;
                                if (((LinearLayout) E2.b.r(inflate, R.id.menu_items)) != null) {
                                    FrameLayout frameLayout = (FrameLayout) inflate;
                                    this.f12277R = new F3.l(frameLayout, imageButton, imageButton2, 0);
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
        if (i4 == R.id.btn_save) {
            a();
        } else if (i4 == R.id.btn_add) {
            o().d(k(), new C0971c(new C1022b(this, 0)), true);
        } else if (i4 == R.id.btn_copy) {
            o().d(k(), new j4.f(new C1022b(this, 1)), false);
        }
    }

    @Override // G1.f
    public final void U(View view, int i4) {
        if (i4 != 0) {
            return;
        }
        J2.a aVar = J2.a.f2373o;
        if (view != null) {
            h0().f12289d.a(aVar, view);
        } else {
            h0().f12289d.b(aVar);
        }
    }

    @Override // G1.f
    public final C0095i V(ViewGroup viewGroup, int i4) {
        C1021a c1021a;
        o6.j.e(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        o6.j.d(from, "from(...)");
        int i8 = R.id.text_threshold;
        if (i4 == 1) {
            View inflate = from.inflate(R.layout.item_image_condition_brief_port, viewGroup, false);
            ImageView imageView = (ImageView) E2.b.r(inflate, R.id.error_badge);
            if (imageView != null) {
                ImageView imageView2 = (ImageView) E2.b.r(inflate, R.id.icon_shouldBeDetected);
                if (imageView2 != null) {
                    ImageView imageView3 = (ImageView) E2.b.r(inflate, R.id.item_icon);
                    if (imageView3 != null) {
                        MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate, R.id.item_name);
                        if (materialTextView != null) {
                            if (((ConstraintLayout) E2.b.r(inflate, R.id.layout_card_item)) != null) {
                                if (((MaterialDivider) E2.b.r(inflate, R.id.separator)) != null) {
                                    MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(inflate, R.id.text_shouldBeDetected);
                                    if (materialTextView2 != null) {
                                        MaterialTextView materialTextView3 = (MaterialTextView) E2.b.r(inflate, R.id.text_threshold);
                                        if (materialTextView3 != null) {
                                            FrameLayout frameLayout = (FrameLayout) inflate;
                                            o6.j.d(frameLayout, "getRoot(...)");
                                            c1021a = new C1021a(frameLayout, imageView3, materialTextView, materialTextView2, imageView2, materialTextView3, imageView);
                                        }
                                    } else {
                                        i8 = R.id.text_shouldBeDetected;
                                    }
                                } else {
                                    i8 = R.id.separator;
                                }
                            } else {
                                i8 = R.id.layout_card_item;
                            }
                        } else {
                            i8 = R.id.item_name;
                        }
                    } else {
                        i8 = R.id.item_icon;
                    }
                } else {
                    i8 = R.id.icon_shouldBeDetected;
                }
            } else {
                i8 = R.id.error_badge;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
        }
        View inflate2 = from.inflate(R.layout.item_image_condition_brief_land, viewGroup, false);
        ImageView imageView4 = (ImageView) E2.b.r(inflate2, R.id.error_badge);
        if (imageView4 != null) {
            ImageView imageView5 = (ImageView) E2.b.r(inflate2, R.id.icon_shouldBeDetected);
            if (imageView5 != null) {
                ImageView imageView6 = (ImageView) E2.b.r(inflate2, R.id.item_icon);
                if (imageView6 != null) {
                    MaterialTextView materialTextView4 = (MaterialTextView) E2.b.r(inflate2, R.id.item_name);
                    if (materialTextView4 != null) {
                        if (((ConstraintLayout) E2.b.r(inflate2, R.id.layout_card_item)) != null) {
                            MaterialTextView materialTextView5 = (MaterialTextView) E2.b.r(inflate2, R.id.text_shouldBeDetected);
                            if (materialTextView5 != null) {
                                MaterialTextView materialTextView6 = (MaterialTextView) E2.b.r(inflate2, R.id.text_threshold);
                                if (materialTextView6 != null) {
                                    FrameLayout frameLayout2 = (FrameLayout) inflate2;
                                    o6.j.d(frameLayout2, "getRoot(...)");
                                    c1021a = new C1021a(frameLayout2, imageView6, materialTextView4, materialTextView5, imageView5, materialTextView6, imageView4);
                                }
                            } else {
                                i8 = R.id.text_shouldBeDetected;
                            }
                        } else {
                            i8 = R.id.layout_card_item;
                        }
                    } else {
                        i8 = R.id.item_name;
                    }
                } else {
                    i8 = R.id.item_icon;
                }
            } else {
                i8 = R.id.icon_shouldBeDetected;
            }
        } else {
            i8 = R.id.error_badge;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i8)));
        return new C0095i(c1021a, 1);
    }

    @Override // G1.f
    public final void W(final int i4) {
        if (!h0().e(i4, false)) {
            X.Y(k(), R.string.warning_dialog_message_condition_delete_associated_action, new InterfaceC1162a() { // from class: l4.c
                @Override // n6.InterfaceC1162a
                public final Object a() {
                    l.this.h0().e(i4, true);
                    return y.f7506a;
                }
            });
        }
    }

    @Override // G1.f
    public final void X(int i4) {
        super.X(i4);
        i0 i0Var = h0().f12290e;
        Integer valueOf = Integer.valueOf(i4);
        i0Var.getClass();
        i0Var.h(null, valueOf);
    }

    @Override // G1.f
    public final void Y(G1.a aVar) {
        o6.j.e(aVar, "item");
        i0(((C0708a) aVar.f1694b).f10757f);
    }

    @Override // G1.f
    public final void Z(int i4, int i8) {
        if (i8 < 2) {
            return;
        }
        o().d(k(), new A1.l(R.style.ScenarioConfigTheme, i4 + 1, i8, new C0096j(i4, this, 1)), false);
    }

    @Override // G1.f
    public final void a0(int i4, int i8) {
        H3.n nVar = h0().f12288c;
        List e9 = nVar.f1950e.e();
        if (e9 != null) {
            ArrayList S02 = AbstractC0436k.S0(e9);
            Collections.swap(S02, i4, i8);
            nVar.n(S02);
        }
    }

    @Override // G1.f
    public final void b0(int i4) {
        C1001a g8;
        G1.b bVar = this.f1711O;
        G1.a aVar = null;
        if (bVar != null) {
            if (bVar.a() != 0) {
                G1.b bVar2 = this.f1711O;
                if (bVar2 != null) {
                    Object g9 = bVar2.g(AbstractC0832f.f(this.K.k, 0, bVar2.a() - 1));
                    o6.j.d(g9, "getItem(...)");
                    aVar = (G1.a) g9;
                } else {
                    o6.j.i("briefAdapter");
                    throw null;
                }
            }
            if (aVar != null && (g8 = h0().f12288c.f1950e.g()) != null) {
                o().d(k(), new H(g8, ((C0708a) aVar.f1694b).f10757f, new C1022b(this, 2)), true);
                return;
            }
            return;
        }
        o6.j.i("briefAdapter");
        throw null;
    }

    public final p h0() {
        return (p) this.f12276Q.getValue();
    }

    public final void i0(C0902b c0902b) {
        p h02 = h0();
        o6.j.e(c0902b, "condition");
        h02.f12288c.d(c0902b);
        o().d(k(), new k4.H((C1030j) new Z5.n(new B0.e(21, this)).getValue()), true);
    }

    @Override // E1.c, w1.e
    public final void p() {
        super.p();
        AbstractC0166y.q(U.e(this), null, null, new C1029i(this, null), 3);
    }

    @Override // w1.e
    public final void v() {
        p h02 = h0();
        F3.l lVar = this.f12277R;
        if (lVar != null) {
            ImageButton imageButton = lVar.f1369f;
            if (lVar != null) {
                ImageButton imageButton2 = lVar.f1370g;
                J2.b bVar = h02.f12289d;
                bVar.a(J2.a.f2374p, imageButton);
                bVar.a(J2.a.f2375q, imageButton2);
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
        J2.b bVar = h0().f12289d;
        bVar.b(J2.a.f2373o);
        bVar.b(J2.a.f2374p);
        bVar.b(J2.a.f2375q);
    }
}
