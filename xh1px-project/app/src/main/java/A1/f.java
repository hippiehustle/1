package A1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import o.p1;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public abstract class f extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public F3.e f245u;

    public f(int i4) {
        super(Integer.valueOf(i4));
    }

    @Override // z1.b
    public final ViewGroup E() {
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_base_copy, (ViewGroup) null, false);
        int i4 = R.id.layout_loadable_list;
        View r8 = E2.b.r(inflate, R.id.layout_loadable_list);
        if (r8 != null) {
            p1 a3 = p1.a(r8);
            i4 = R.id.layout_top_bar;
            View r9 = E2.b.r(inflate, R.id.layout_top_bar);
            if (r9 != null) {
                int i8 = R.id.button_dismiss;
                MaterialButton materialButton = (MaterialButton) E2.b.r(r9, R.id.button_dismiss);
                if (materialButton != null) {
                    i8 = R.id.button_search_cancel;
                    MaterialButton materialButton2 = (MaterialButton) E2.b.r(r9, R.id.button_search_cancel);
                    if (materialButton2 != null) {
                        i8 = R.id.dialog_title;
                        MaterialTextView materialTextView = (MaterialTextView) E2.b.r(r9, R.id.dialog_title);
                        if (materialTextView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) r9;
                            i8 = R.id.search_edit;
                            TextInputEditText textInputEditText = (TextInputEditText) E2.b.r(r9, R.id.search_edit);
                            if (textInputEditText != null) {
                                A4.d dVar = new A4.d(constraintLayout, materialButton, materialButton2, materialTextView, textInputEditText, 6);
                                F3.e eVar = new F3.e((CoordinatorLayout) inflate, a3, dVar, 1);
                                int I8 = I();
                                int H2 = H();
                                materialTextView.setText(I8);
                                textInputEditText.setHint(H2);
                                materialButton2.setOnClickListener(new B2.b(2, dVar));
                                AbstractC1492c.K(dVar);
                                materialButton.setOnClickListener(new B2.b(1, new d(this, 0)));
                                textInputEditText.addTextChangedListener(new C2.b(0, new e(1, this, f.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 0, 0, 0)));
                                E2.c.p0(a3, G(), null);
                                this.f245u = eVar;
                                CoordinatorLayout coordinatorLayout = J().f1330e;
                                o6.j.d(coordinatorLayout, "getRoot(...)");
                                return coordinatorLayout;
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(r9.getResources().getResourceName(i8)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    public abstract int G();

    public abstract int H();

    public abstract int I();

    public final F3.e J() {
        F3.e eVar = this.f245u;
        if (eVar != null) {
            return eVar;
        }
        o6.j.i("viewBinding");
        throw null;
    }

    public abstract void K(String str);
}
