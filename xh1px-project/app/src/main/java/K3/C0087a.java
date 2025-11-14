package K3;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textview.MaterialTextView;
import e4.C0643a;
import t0.s0;

/* renamed from: K3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087a extends t0.L {

    /* renamed from: e, reason: collision with root package name */
    public final A1.e f2668e;

    /* renamed from: f, reason: collision with root package name */
    public final A1.e f2669f;

    public C0087a(A1.e eVar, A1.e eVar2) {
        super(C0088b.f2670d);
        this.f2668e = eVar;
        this.f2669f = eVar2;
    }

    @Override // t0.U
    public final void d(s0 s0Var, int i4) {
        int i8;
        Object g8 = g(i4);
        o6.j.d(g8, "getItem(...)");
        G1.a aVar = (G1.a) g8;
        A1.e eVar = this.f2668e;
        o6.j.e(eVar, "itemClickedListener");
        F3.j jVar = ((C0089c) s0Var).f2671u;
        jVar.f1356e.setOnClickListener(new D2.a(eVar, 2, aVar));
        C0643a c0643a = (C0643a) aVar.f1694b;
        jVar.f1359h.setImageResource(c0643a.f10606a);
        jVar.f1360i.setText(c0643a.f10607b);
        jVar.f1358g.setText(c0643a.f10608c);
        ImageView imageView = jVar.f1357f;
        if (c0643a.f10610e) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        imageView.setVisibility(i8);
    }

    @Override // t0.U
    public final s0 e(ViewGroup viewGroup, int i4) {
        View h8 = A.j.h(viewGroup, R.layout.item_smart_action_legacy, viewGroup, false);
        int i8 = R.id.btn_reorder;
        if (((ImageView) E2.b.r(h8, R.id.btn_reorder)) != null) {
            i8 = R.id.error_badge;
            ImageView imageView = (ImageView) E2.b.r(h8, R.id.error_badge);
            if (imageView != null) {
                i8 = R.id.item_description;
                MaterialTextView materialTextView = (MaterialTextView) E2.b.r(h8, R.id.item_description);
                if (materialTextView != null) {
                    i8 = R.id.item_icon;
                    ImageView imageView2 = (ImageView) E2.b.r(h8, R.id.item_icon);
                    if (imageView2 != null) {
                        i8 = R.id.item_name;
                        MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(h8, R.id.item_name);
                        if (materialTextView2 != null) {
                            return new C0089c(new F3.j((ConstraintLayout) h8, imageView, materialTextView, imageView2, materialTextView2, 0));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(h8.getResources().getResourceName(i8)));
    }
}
