package L5;

import P.O;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public int f3042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EditText f3043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f3044f;

    public w(TextInputLayout textInputLayout, EditText editText) {
        this.f3044f = textInputLayout;
        this.f3043e = editText;
        this.f3042d = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f3044f;
        textInputLayout.u(!textInputLayout.f10247D0, false);
        if (textInputLayout.f10287n) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f10303v) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f3043e;
        int lineCount = editText.getLineCount();
        int i4 = this.f3042d;
        if (lineCount != i4) {
            if (lineCount < i4) {
                WeakHashMap weakHashMap = O.f4214a;
                int minimumHeight = editText.getMinimumHeight();
                int i8 = textInputLayout.f10306w0;
                if (minimumHeight != i8) {
                    editText.setMinimumHeight(i8);
                }
            }
            this.f3042d = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i8, int i9) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i8, int i9) {
    }
}
