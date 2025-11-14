package D5;

import android.text.PrecomputedText;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ PrecomputedText.Params.Builder h(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean t(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
