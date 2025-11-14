package e0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import c0.k;
import java.lang.ref.WeakReference;

/* renamed from: e0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635c extends c0.i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f10580a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f10581b;

    public C0635c(TextView textView, C0636d c0636d) {
        this.f10580a = new WeakReference(textView);
        this.f10581b = new WeakReference(c0636d);
    }

    @Override // c0.i
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f10580a.get();
        InputFilter inputFilter = (InputFilter) this.f10581b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        k a3 = k.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a3.getClass();
                            length = text.length();
                        }
                        CharSequence e9 = a3.e(text, 0, length);
                        if (text != e9) {
                            int selectionStart = Selection.getSelectionStart(e9);
                            int selectionEnd = Selection.getSelectionEnd(e9);
                            textView.setText(e9);
                            if (e9 instanceof Spannable) {
                                Spannable spannable = (Spannable) e9;
                                if (selectionStart >= 0 && selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                                    return;
                                } else if (selectionStart >= 0) {
                                    Selection.setSelection(spannable, selectionStart);
                                    return;
                                } else {
                                    if (selectionEnd >= 0) {
                                        Selection.setSelection(spannable, selectionEnd);
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
