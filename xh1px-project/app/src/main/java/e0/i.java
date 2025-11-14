package e0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import c0.k;

/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final EditText f10590d;

    /* renamed from: e, reason: collision with root package name */
    public h f10591e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10592f = true;

    public i(EditText editText) {
        this.f10590d = editText;
    }

    public static void a(EditText editText, int i4) {
        int length;
        if (i4 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            k a3 = k.a();
            if (editableText == null) {
                length = 0;
            } else {
                a3.getClass();
                length = editableText.length();
            }
            a3.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i8, int i9) {
        EditText editText = this.f10590d;
        if (!editText.isInEditMode() && this.f10592f && k.k != null && i8 <= i9 && (charSequence instanceof Spannable)) {
            int b4 = k.a().b();
            if (b4 != 0) {
                if (b4 != 1) {
                    if (b4 != 3) {
                        return;
                    }
                } else {
                    k.a().e((Spannable) charSequence, i4, i9 + i4);
                    return;
                }
            }
            k a3 = k.a();
            if (this.f10591e == null) {
                this.f10591e = new h(editText);
            }
            a3.f(this.f10591e);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i8, int i9) {
    }
}
