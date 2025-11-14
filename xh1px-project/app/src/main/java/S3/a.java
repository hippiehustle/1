package S3;

import A1.o;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;
import j2.C0902b;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import t0.L;
import t0.s0;

/* loaded from: classes.dex */
public final class a extends L {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5327e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1164c f5328f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1163b f5329g;

    public a(o oVar, b bVar) {
        super(l.f5355d);
        this.f5328f = oVar;
        this.f5329g = bVar;
    }

    @Override // t0.U
    public final void d(s0 s0Var, int i4) {
        switch (this.f5327e) {
            case 0:
                final n nVar = (n) s0Var;
                Object g8 = g(i4);
                o6.j.d(g8, "getItem(...)");
                final k kVar = (k) g8;
                A4.a aVar = nVar.f5359u;
                ((MaterialTextView) aVar.f283h).setText(kVar.f5353a.f10595b);
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) aVar.f282g;
                materialCheckBox.setChecked(kVar.f5354b);
                final int i8 = 0;
                ((ImageButton) aVar.f281f).setOnClickListener(new View.OnClickListener() { // from class: S3.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i8) {
                            case 0:
                                nVar.f5361w.m(kVar.f5353a.f10596c);
                                return;
                            default:
                                nVar.f5360v.l(kVar.f5353a.f10594a, Boolean.valueOf(!r0.f5354b));
                                return;
                        }
                    }
                });
                final int i9 = 1;
                materialCheckBox.setOnClickListener(new View.OnClickListener() { // from class: S3.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i9) {
                            case 0:
                                nVar.f5361w.m(kVar.f5353a.f10596c);
                                return;
                            default:
                                nVar.f5360v.l(kVar.f5353a.f10594a, Boolean.valueOf(!r0.f5354b));
                                return;
                        }
                    }
                });
                return;
            default:
                E4.a aVar2 = (E4.a) s0Var;
                Object g9 = g(i4);
                o6.j.d(g9, "getItem(...)");
                E4.c cVar = (E4.c) g9;
                A4.a aVar3 = aVar2.f1194u;
                ((MaterialCardView) aVar3.f280e).setOnClickListener(new D2.a(aVar2, 1, cVar));
                MaterialTextView materialTextView = (MaterialTextView) aVar3.f282g;
                C0902b c0902b = cVar.f1201b;
                materialTextView.setText(c0902b.f11791c);
                ((MaterialTextView) aVar3.f283h).setText(aVar2.f14950a.getContext().getResources().getString(R.string.item_title_debug_report_trigger_processed, cVar.f1202c, cVar.f1203d));
                aVar2.f1195v.l(c0902b, new A1.h(5, aVar3));
                return;
        }
    }

    @Override // t0.U
    public final s0 e(ViewGroup viewGroup, int i4) {
        switch (this.f5327e) {
            case 0:
                View h8 = A.j.h(viewGroup, R.layout.item_intent_flag, viewGroup, false);
                int i8 = R.id.btn_help;
                ImageButton imageButton = (ImageButton) E2.b.r(h8, R.id.btn_help);
                if (imageButton != null) {
                    i8 = R.id.button_state;
                    MaterialCheckBox materialCheckBox = (MaterialCheckBox) E2.b.r(h8, R.id.button_state);
                    if (materialCheckBox != null) {
                        i8 = R.id.flag_name;
                        MaterialTextView materialTextView = (MaterialTextView) E2.b.r(h8, R.id.flag_name);
                        if (materialTextView != null) {
                            return new n(new A4.a((ConstraintLayout) h8, imageButton, materialCheckBox, materialTextView, 10), (o) this.f5328f, (b) this.f5329g);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h8.getResources().getResourceName(i8)));
            default:
                View h9 = A.j.h(viewGroup, R.layout.item_debug_report_condition, viewGroup, false);
                int i9 = R.id.background_bottom;
                if (((ImageView) E2.b.r(h9, R.id.background_bottom)) != null) {
                    i9 = R.id.background_top;
                    if (((ImageView) E2.b.r(h9, R.id.background_top)) != null) {
                        i9 = R.id.condition_image;
                        ImageView imageView = (ImageView) E2.b.r(h9, R.id.condition_image);
                        if (imageView != null) {
                            i9 = R.id.condition_name;
                            MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(h9, R.id.condition_name);
                            if (materialTextView2 != null) {
                                i9 = R.id.condition_triggered;
                                MaterialTextView materialTextView3 = (MaterialTextView) E2.b.r(h9, R.id.condition_triggered);
                                if (materialTextView3 != null) {
                                    return new E4.a(new A4.a((MaterialCardView) h9, imageView, materialTextView2, materialTextView3, 1), this.f5328f, this.f5329g);
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h9.getResources().getResourceName(i9)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC1164c interfaceC1164c, InterfaceC1163b interfaceC1163b) {
        super(E4.b.f1197e);
        o6.j.e(interfaceC1164c, "bitmapProvider");
        o6.j.e(interfaceC1163b, "conditionClickedListener");
        this.f5328f = interfaceC1164c;
        this.f5329g = interfaceC1163b;
    }
}
