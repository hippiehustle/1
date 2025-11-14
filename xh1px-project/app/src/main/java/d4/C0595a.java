package d4;

import A1.o;
import L7.X;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import f4.C0708a;
import k4.I;
import q4.C1395a;
import q4.V;
import t0.L;
import t0.s0;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595a extends L {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10367e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final o6.i f10368f;

    /* renamed from: g, reason: collision with root package name */
    public final Z5.d f10369g;

    public C0595a(o oVar, A1.h hVar) {
        super(C0606l.f10396d);
        this.f10368f = oVar;
        this.f10369g = hVar;
    }

    @Override // t0.U
    public final void d(s0 s0Var, int i4) {
        switch (this.f10367e) {
            case 0:
                final C0608n c0608n = (C0608n) s0Var;
                Object g8 = g(i4);
                o6.j.d(g8, "getItem(...)");
                final C0605k c0605k = (C0605k) g8;
                A4.a aVar = c0608n.f10400u;
                ((MaterialTextView) aVar.f281f).setText(c0605k.f10394a.f10595b);
                MaterialRadioButton materialRadioButton = (MaterialRadioButton) aVar.f283h;
                materialRadioButton.setChecked(c0605k.f10395b);
                final int i8 = 0;
                ((ImageButton) aVar.f282g).setOnClickListener(new View.OnClickListener() { // from class: d4.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i8) {
                            case 0:
                                c0608n.f10402w.m(c0605k.f10394a.f10596c);
                                return;
                            default:
                                c0608n.f10401v.l(c0605k.f10394a.f10594a, Boolean.valueOf(!r0.f10395b));
                                return;
                        }
                    }
                });
                final int i9 = 1;
                materialRadioButton.setOnClickListener(new View.OnClickListener() { // from class: d4.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i9) {
                            case 0:
                                c0608n.f10402w.m(c0605k.f10394a.f10596c);
                                return;
                            default:
                                c0608n.f10401v.l(c0605k.f10394a.f10594a, Boolean.valueOf(!r0.f10395b));
                                return;
                        }
                    }
                });
                return;
            default:
                V v8 = (V) s0Var;
                Object g9 = g(i4);
                o6.j.d(g9, "getItem(...)");
                C0708a c0708a = (C0708a) g9;
                X x8 = v8.f14083x;
                if (x8 != null) {
                    x8.d(null);
                }
                v8.f14083x = q4.X.i(v8.f14080u.f1354f, c0708a, v8.f14081v, new A1.h(29, v8));
                return;
        }
    }

    @Override // t0.U
    public final s0 e(ViewGroup viewGroup, int i4) {
        switch (this.f10367e) {
            case 0:
                View h8 = A.j.h(viewGroup, R.layout.item_intent_action, viewGroup, false);
                int i8 = R.id.action_name;
                MaterialTextView materialTextView = (MaterialTextView) E2.b.r(h8, R.id.action_name);
                if (materialTextView != null) {
                    i8 = R.id.btn_help;
                    ImageButton imageButton = (ImageButton) E2.b.r(h8, R.id.btn_help);
                    if (imageButton != null) {
                        i8 = R.id.button_state;
                        MaterialRadioButton materialRadioButton = (MaterialRadioButton) E2.b.r(h8, R.id.button_state);
                        if (materialRadioButton != null) {
                            return new C0608n(new A4.a((ConstraintLayout) h8, materialTextView, imageButton, materialRadioButton, 9), (o) this.f10368f, (A1.h) this.f10369g);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h8.getResources().getResourceName(i8)));
            default:
                View h9 = A.j.h(viewGroup, R.layout.item_image_condition_list, viewGroup, false);
                View r8 = E2.b.r(h9, R.id.card_image_condition);
                if (r8 != null) {
                    return new V(new F3.i((MaterialCardView) h9, F3.a.i(r8), 1), (I) this.f10369g, (W4.i) this.f10368f);
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h9.getResources().getResourceName(R.id.card_image_condition)));
        }
    }

    @Override // t0.U
    public void f(s0 s0Var) {
        switch (this.f10367e) {
            case 1:
                V v8 = (V) s0Var;
                o6.j.e(v8, "holder");
                X x8 = v8.f14083x;
                if (x8 != null) {
                    x8.d(null);
                }
                v8.f14083x = null;
                return;
            default:
                return;
        }
    }

    public C0595a(W4.i iVar, I i4) {
        super(C1395a.f14091f);
        this.f10368f = iVar;
        this.f10369g = i4;
    }
}
