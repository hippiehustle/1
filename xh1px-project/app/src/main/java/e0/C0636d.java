package e0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import c0.k;

/* renamed from: e0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f10582a;

    /* renamed from: b, reason: collision with root package name */
    public C0635c f10583b;

    public C0636d(TextView textView) {
        this.f10582a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i4, int i8, Spanned spanned, int i9, int i10) {
        TextView textView = this.f10582a;
        if (!textView.isInEditMode()) {
            int b4 = k.a().b();
            if (b4 != 0) {
                if (b4 != 1) {
                    if (b4 != 3) {
                        return charSequence;
                    }
                } else {
                    if ((i10 != 0 || i9 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i4 != 0 || i8 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i4, i8);
                        }
                        return k.a().e(charSequence, 0, charSequence.length());
                    }
                    return charSequence;
                }
            }
            k a3 = k.a();
            if (this.f10583b == null) {
                this.f10583b = new C0635c(textView, this);
            }
            a3.f(this.f10583b);
            return charSequence;
        }
        return charSequence;
    }
}
