package A1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import t0.C1536c;
import t0.U;
import t0.s0;

/* loaded from: classes.dex */
public final class a extends U {

    /* renamed from: d, reason: collision with root package name */
    public final List f234d;

    /* renamed from: e, reason: collision with root package name */
    public final m f235e;

    /* renamed from: f, reason: collision with root package name */
    public final o f236f;

    public a(List list, m mVar, o oVar) {
        o6.j.e(list, "choices");
        this.f234d = list;
        this.f235e = mVar;
        this.f236f = oVar;
    }

    @Override // t0.U
    public final int a() {
        return this.f234d.size();
    }

    @Override // t0.U
    public final int c(int i4) {
        g gVar = (g) this.f234d.get(i4);
        if (gVar.f247b == null && gVar.f248c == null) {
            return R.layout.item_multi_choice_small;
        }
        return R.layout.item_multi_choice;
    }

    @Override // t0.U
    public final void d(s0 s0Var, int i4) {
        c cVar = (c) s0Var;
        final g gVar = (g) this.f234d.get(i4);
        int i8 = cVar.f240u;
        final m mVar = this.f235e;
        switch (i8) {
            case 0:
                o6.j.e(gVar, "choice");
                Integer num = gVar.f248c;
                o6.j.e(mVar, "onChoiceSelected");
                F3.j jVar = (F3.j) cVar.f241v;
                ConstraintLayout constraintLayout = jVar.f1356e;
                ImageView imageView = jVar.f1357f;
                ImageView imageView2 = jVar.f1359h;
                final int i9 = 0;
                constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: A1.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i9) {
                            case 0:
                                mVar.m(gVar);
                                return;
                            default:
                                mVar.m(gVar);
                                return;
                        }
                    }
                });
                MaterialTextView materialTextView = jVar.f1360i;
                materialTextView.setText(gVar.f246a);
                MaterialTextView materialTextView2 = jVar.f1358g;
                Integer num2 = gVar.f247b;
                materialTextView2.setVisibility(0);
                materialTextView2.setText(num2.intValue());
                imageView2.setVisibility(0);
                imageView2.setImageResource(num.intValue());
                materialTextView.setAlpha(1.0f);
                materialTextView2.setAlpha(1.0f);
                imageView2.setAlpha(1.0f);
                imageView.setImageResource(R.drawable.ic_chevron_right);
                break;
            default:
                o6.j.e(gVar, "choice");
                o6.j.e(mVar, "onChoiceSelected");
                C1536c c1536c = (C1536c) cVar.f241v;
                final int i10 = 1;
                ((ConstraintLayout) c1536c.f14808e).setOnClickListener(new View.OnClickListener() { // from class: A1.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                mVar.m(gVar);
                                return;
                            default:
                                mVar.m(gVar);
                                return;
                        }
                    }
                });
                ((MaterialTextView) c1536c.f14809f).setText(gVar.f246a);
                break;
        }
        this.f236f.l(gVar, cVar.f14950a);
    }

    @Override // t0.U
    public final s0 e(ViewGroup viewGroup, int i4) {
        int i8 = R.id.choice_title;
        if (i4 == R.layout.item_multi_choice_small) {
            View h8 = A.j.h(viewGroup, R.layout.item_multi_choice_small, viewGroup, false);
            MaterialTextView materialTextView = (MaterialTextView) E2.b.r(h8, R.id.choice_title);
            if (materialTextView != null) {
                i8 = R.id.click_selector_chevron;
                if (((ImageView) E2.b.r(h8, R.id.click_selector_chevron)) != null) {
                    return new c(new C1536c((ConstraintLayout) h8, 20, materialTextView));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(h8.getResources().getResourceName(i8)));
        }
        if (i4 == R.layout.item_multi_choice) {
            View h9 = A.j.h(viewGroup, R.layout.item_multi_choice, viewGroup, false);
            int i9 = R.id.choice_chevron;
            ImageView imageView = (ImageView) E2.b.r(h9, R.id.choice_chevron);
            if (imageView != null) {
                i9 = R.id.choice_description;
                MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(h9, R.id.choice_description);
                if (materialTextView2 != null) {
                    i9 = R.id.choice_icon;
                    ImageView imageView2 = (ImageView) E2.b.r(h9, R.id.choice_icon);
                    if (imageView2 != null) {
                        MaterialTextView materialTextView3 = (MaterialTextView) E2.b.r(h9, R.id.choice_title);
                        if (materialTextView3 != null) {
                            return new c(new F3.j((ConstraintLayout) h9, imageView, materialTextView2, imageView2, materialTextView3, 1));
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(h9.getResources().getResourceName(i8)));
                    }
                }
            }
            i8 = i9;
            throw new NullPointerException("Missing required view with ID: ".concat(h9.getResources().getResourceName(i8)));
        }
        throw new IllegalArgumentException("Unsupported view type !");
    }

    @Override // t0.U
    public final void f(s0 s0Var) {
        c cVar = (c) s0Var;
        o6.j.e(cVar, "holder");
        this.f236f.l(this.f234d.get(cVar.c()), null);
    }
}
