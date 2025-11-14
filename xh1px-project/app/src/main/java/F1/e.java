package F1;

import A1.n;
import Q2.p;
import R.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.core.ui.views.itembrief.ItemBriefView;
import com.google.android.material.textview.MaterialTextView;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import o6.j;
import t0.C1536c;

/* loaded from: classes.dex */
public final class e extends E1.c {

    /* renamed from: I, reason: collision with root package name */
    public final P2.a f1296I;

    /* renamed from: J, reason: collision with root package name */
    public final InterfaceC1163b f1297J;
    public final InterfaceC1162a K;

    /* renamed from: L, reason: collision with root package name */
    public C1536c f1298L;

    /* renamed from: M, reason: collision with root package name */
    public g f1299M;

    /* renamed from: N, reason: collision with root package name */
    public K2.d f1300N;

    /* renamed from: O, reason: collision with root package name */
    public InterfaceC1162a f1301O;

    /* renamed from: P, reason: collision with root package name */
    public InterfaceC1162a f1302P;

    public e(P2.a aVar, InterfaceC1163b interfaceC1163b, InterfaceC1162a interfaceC1162a) {
        super(3);
        this.f1296I = aVar;
        this.f1297J = interfaceC1163b;
        this.K = interfaceC1162a;
    }

    @Override // E1.c
    public final FrameLayout I(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.overlay_position_selection_menu, (ViewGroup) null, false);
        int i4 = R.id.btn_cancel;
        if (((ImageButton) E2.b.r(inflate, R.id.btn_cancel)) != null) {
            i4 = R.id.btn_confirm;
            ImageButton imageButton = (ImageButton) E2.b.r(inflate, R.id.btn_confirm);
            if (imageButton != null) {
                i4 = R.id.btn_hide_overlay;
                if (((ImageButton) E2.b.r(inflate, R.id.btn_hide_overlay)) != null) {
                    i4 = R.id.btn_move;
                    if (((ImageButton) E2.b.r(inflate, R.id.btn_move)) != null) {
                        i4 = R.id.menu_background;
                        if (((CardView) E2.b.r(inflate, R.id.menu_background)) != null) {
                            i4 = R.id.menu_items;
                            if (((LinearLayout) E2.b.r(inflate, R.id.menu_items)) != null) {
                                this.f1298L = new C1536c((FrameLayout) inflate, 21, imageButton);
                                View inflate2 = layoutInflater.inflate(R.layout.overlay_position_selection_view, (ViewGroup) null, false);
                                int i8 = R.id.background_list;
                                if (E2.b.r(inflate2, R.id.background_list) != null) {
                                    i8 = R.id.layout_instructions;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) E2.b.r(inflate2, R.id.layout_instructions);
                                    if (constraintLayout != null) {
                                        i8 = R.id.position_selector;
                                        ItemBriefView itemBriefView = (ItemBriefView) E2.b.r(inflate2, R.id.position_selector);
                                        if (itemBriefView != null) {
                                            i8 = R.id.text_instructions;
                                            MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate2, R.id.text_instructions);
                                            if (materialTextView != null) {
                                                this.f1299M = new g((FrameLayout) inflate2, constraintLayout, itemBriefView, materialTextView);
                                                K2.d dVar = new K2.d();
                                                dVar.a(constraintLayout, K2.b.f2601g);
                                                this.f1300N = dVar;
                                                C1536c c1536c = this.f1298L;
                                                if (c1536c != null) {
                                                    FrameLayout frameLayout = (FrameLayout) c1536c.f14808e;
                                                    j.d(frameLayout, "getRoot(...)");
                                                    return frameLayout;
                                                }
                                                j.i("viewBinding");
                                                throw null;
                                            }
                                        }
                                    }
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i8)));
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
        g gVar = this.f1299M;
        if (gVar != null) {
            MaterialTextView materialTextView = (MaterialTextView) gVar.f4989g;
            if (gVar != null) {
                ViewGroup.LayoutParams layoutParams = materialTextView.getLayoutParams();
                j.c(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                A.e eVar = (A.e) layoutParams;
                eVar.setMargins(((ViewGroup.MarginLayoutParams) eVar).leftMargin, ((ViewGroup.MarginLayoutParams) eVar).topMargin + l().f7104e.f7096c, ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                materialTextView.setLayoutParams(eVar);
                g gVar2 = this.f1299M;
                if (gVar2 != null) {
                    FrameLayout frameLayout = (FrameLayout) gVar2.f4987e;
                    j.d(frameLayout, "getRoot(...)");
                    return frameLayout;
                }
                j.i("selectorViewBinding");
                throw null;
            }
            j.i("selectorViewBinding");
            throw null;
        }
        j.i("selectorViewBinding");
        throw null;
    }

    @Override // E1.c
    public final void K(int i4) {
        InterfaceC1162a interfaceC1162a;
        if (i4 == R.id.btn_confirm) {
            InterfaceC1162a interfaceC1162a2 = this.f1301O;
            if (interfaceC1162a2 != null) {
                interfaceC1162a2.a();
                return;
            }
            return;
        }
        if (i4 == R.id.btn_cancel && (interfaceC1162a = this.f1302P) != null) {
            interfaceC1162a.a();
        }
    }

    @Override // E1.c
    public final void M(boolean z8) {
        if (z8) {
            K2.d dVar = this.f1300N;
            if (dVar != null) {
                dVar.e();
            } else {
                j.i("instructionsAnimationController");
                throw null;
            }
        }
    }

    public final void S(Q2.c cVar) {
        boolean z8;
        g gVar = this.f1299M;
        if (gVar != null) {
            ((MaterialTextView) gVar.f4989g).setText(R.string.toast_configure_single_click);
            g gVar2 = this.f1299M;
            if (gVar2 != null) {
                ItemBriefView itemBriefView = (ItemBriefView) gVar2.f4988f;
                int i4 = ItemBriefView.f9790i;
                itemBriefView.a(cVar, true);
                itemBriefView.setOnTouchListener(new M7.c(this, 2, cVar));
                if (cVar.f4781b != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                T(z8, new n(this, 1, cVar));
                this.f1302P = new b(this, 0);
                return;
            }
            j.i("selectorViewBinding");
            throw null;
        }
        j.i("selectorViewBinding");
        throw null;
    }

    public final void T(boolean z8, InterfaceC1162a interfaceC1162a) {
        this.f1301O = interfaceC1162a;
        C1536c c1536c = this.f1298L;
        if (c1536c != null) {
            O((ImageButton) c1536c.f14809f, z8, z8);
        } else {
            j.i("viewBinding");
            throw null;
        }
    }

    public final void U(p pVar) {
        boolean z8;
        g gVar = this.f1299M;
        if (gVar != null) {
            ((MaterialTextView) gVar.f4989g).setText(R.string.toast_configure_swipe_from);
            g gVar2 = this.f1299M;
            if (gVar2 != null) {
                ItemBriefView itemBriefView = (ItemBriefView) gVar2.f4988f;
                int i4 = ItemBriefView.f9790i;
                itemBriefView.a(pVar, true);
                itemBriefView.setOnTouchListener(new c(this, pVar, 0));
                if (pVar.f4837b != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                T(z8, new d(this, pVar, 0));
                this.f1302P = new b(this, 1);
                return;
            }
            j.i("selectorViewBinding");
            throw null;
        }
        j.i("selectorViewBinding");
        throw null;
    }

    public final void V(p pVar) {
        boolean z8;
        g gVar = this.f1299M;
        if (gVar != null) {
            ((MaterialTextView) gVar.f4989g).setText(R.string.toast_configure_swipe_to);
            g gVar2 = this.f1299M;
            if (gVar2 != null) {
                ItemBriefView itemBriefView = (ItemBriefView) gVar2.f4988f;
                int i4 = ItemBriefView.f9790i;
                itemBriefView.a(pVar, true);
                itemBriefView.setOnTouchListener(new c(this, pVar, 1));
                if (pVar.f4838c != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                T(z8, new d(this, pVar, 1));
                this.f1302P = new d(this, pVar, 2);
                return;
            }
            j.i("selectorViewBinding");
            throw null;
        }
        j.i("selectorViewBinding");
        throw null;
    }

    @Override // w1.e
    public final void v() {
        P2.a aVar = this.f1296I;
        if (aVar instanceof Q2.c) {
            S((Q2.c) aVar);
        } else if (aVar instanceof p) {
            p pVar = (p) aVar;
            if (pVar.f4837b == null) {
                U(pVar);
            } else {
                V(pVar);
            }
        }
        K2.d dVar = this.f1300N;
        if (dVar != null) {
            dVar.e();
        } else {
            j.i("instructionsAnimationController");
            throw null;
        }
    }
}
