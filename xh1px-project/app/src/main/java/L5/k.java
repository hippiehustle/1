package L5;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f2963a;

    public k(n nVar) {
        this.f2963a = nVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        n nVar = this.f2963a;
        j jVar = nVar.f2989y;
        if (nVar.f2986v == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = nVar.f2986v;
        if (editText != null) {
            editText.removeTextChangedListener(jVar);
            if (nVar.f2986v.getOnFocusChangeListener() == nVar.b().e()) {
                nVar.f2986v.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        nVar.f2986v = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(jVar);
        }
        nVar.b().m(nVar.f2986v);
        nVar.j(nVar.b());
    }
}
