package N;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3518a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f3519b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3520c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3521d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i4, int i8) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = D5.f.h(textPaint).setBreakStrategy(i4);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i8);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f3518a = textPaint;
        this.f3519b = textDirectionHeuristic;
        this.f3520c = i4;
        this.f3521d = i8;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f3520c == cVar.f3520c && this.f3521d == cVar.f3521d) {
                    TextPaint textPaint = this.f3518a;
                    float textSize = textPaint.getTextSize();
                    TextPaint textPaint2 = cVar.f3518a;
                    if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                        if (textPaint.getTypeface() == null) {
                            if (textPaint2.getTypeface() != null) {
                                return false;
                            }
                        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                            return false;
                        }
                        if (this.f3519b == cVar.f3519b) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f3518a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f3519b, Integer.valueOf(this.f3520c), Integer.valueOf(this.f3521d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f3518a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i4 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i4 >= 26) {
            StringBuilder sb3 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb3.append(fontVariationSettings);
            sb.append(sb3.toString());
        }
        sb.append(", textDir=" + this.f3519b);
        sb.append(", breakStrategy=" + this.f3520c);
        sb.append(", hyphenationFrequency=" + this.f3521d);
        sb.append("}");
        return sb.toString();
    }

    public c(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f3518a = textPaint;
        textDirection = params.getTextDirection();
        this.f3519b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f3520c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f3521d = hyphenationFrequency;
    }
}
