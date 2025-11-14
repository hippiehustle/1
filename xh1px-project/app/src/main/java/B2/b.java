package B2;

import A1.n;
import G1.f;
import L5.i;
import L5.u;
import M3.C0190x;
import Z.g;
import Z3.q;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.datepicker.l;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import d4.C0600f;
import o6.j;
import q4.C1396b;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f446e;

    public /* synthetic */ b(int i4, Object obj) {
        this.f445d = i4;
        this.f446e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        boolean z8;
        switch (this.f445d) {
            case 0:
                ((n) this.f446e).a();
                return;
            case 1:
                ((A1.d) this.f446e).a();
                return;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                A4.d dVar = (A4.d) this.f446e;
                if (((TextInputEditText) dVar.f299i).getVisibility() == 8) {
                    ((MaterialButton) dVar.f296f).setVisibility(8);
                    ((MaterialTextView) dVar.f298h).setVisibility(8);
                    ((MaterialButton) dVar.f297g).setIconResource(R.drawable.ic_cancel);
                    TextInputEditText textInputEditText = (TextInputEditText) dVar.f299i;
                    textInputEditText.setVisibility(0);
                    textInputEditText.requestFocus();
                    ((InputMethodManager) textInputEditText.getContext().getSystemService(InputMethodManager.class)).showSoftInput(textInputEditText, 1);
                    return;
                }
                AbstractC1492c.K(dVar);
                return;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                E1.c cVar = (E1.c) this.f446e;
                H1.d dVar2 = cVar.f1174z;
                if (dVar2 != null) {
                    if (!dVar2.f1892e && (view2 = cVar.f1161F) != null) {
                        if (view2.getVisibility() != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        cVar.Q(z8);
                        return;
                    }
                    return;
                }
                j.i("resizeController");
                throw null;
            case g.LONG_FIELD_NUMBER /* 4 */:
                ((q) this.f446e).a();
                return;
            case g.STRING_FIELD_NUMBER /* 5 */:
                ((C0190x) this.f446e).a();
                return;
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((E4.g) this.f446e).a();
                return;
            case g.DOUBLE_FIELD_NUMBER /* 7 */:
                K2.d dVar3 = ((f) this.f446e).f1708L;
                if (dVar3 != null) {
                    dVar3.e();
                    return;
                } else {
                    j.i("briefPanelAnimationController");
                    throw null;
                }
            case g.BYTES_FIELD_NUMBER /* 8 */:
                L5.d dVar4 = (L5.d) this.f446e;
                EditText editText = dVar4.f2942i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    dVar4.q();
                    return;
                }
                return;
            case 9:
                ((i) this.f446e).u();
                return;
            case 10:
                u uVar = (u) this.f446e;
                EditText editText2 = uVar.f3032f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = uVar.f3032f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        uVar.f3032f.setTransformationMethod(null);
                    } else {
                        uVar.f3032f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        uVar.f3032f.setSelection(selectionEnd);
                    }
                    uVar.q();
                    return;
                }
                return;
            case 11:
                ((MaterialCheckBox) ((A.i) this.f446e).f89f).setChecked(!r4.isChecked());
                return;
            case 12:
                ((l) this.f446e).W();
                throw null;
            case 13:
                C0600f c0600f = (C0600f) this.f446e;
                c0600f.h(new B0.e(18, c0600f));
                return;
            default:
                C1396b c1396b = (C1396b) this.f446e;
                c1396b.f14094v.m(Integer.valueOf(c1396b.c()));
                return;
        }
    }
}
