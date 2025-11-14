package o;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;

/* renamed from: o.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1180b0 {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i4, int i8, TextView textView, TextPaint textPaint, AbstractC1186e0 abstractC1186e0) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i4);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i8 == -1) {
            i8 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i8);
        try {
            abstractC1186e0.a(obtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }
}
