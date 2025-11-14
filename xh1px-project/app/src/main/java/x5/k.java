package x5;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f16200a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f16201b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16202c;

    /* renamed from: d, reason: collision with root package name */
    public int f16203d;
    public boolean j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f16204e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f16205f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f16206g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f16207h = 1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16208i = true;
    public TextUtils.TruncateAt k = null;

    public k(CharSequence charSequence, TextPaint textPaint, int i4) {
        this.f16200a = charSequence;
        this.f16201b = textPaint;
        this.f16202c = i4;
        this.f16203d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f16200a == null) {
            this.f16200a = "";
        }
        int max = Math.max(0, this.f16202c);
        CharSequence charSequence = this.f16200a;
        int i4 = this.f16205f;
        TextPaint textPaint = this.f16201b;
        if (i4 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.k);
        }
        int min = Math.min(charSequence.length(), this.f16203d);
        this.f16203d = min;
        if (this.j && this.f16205f == 1) {
            this.f16204e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f16204e);
        obtain.setIncludePad(this.f16208i);
        if (this.j) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f16205f);
        float f8 = this.f16206g;
        if (f8 != 1.0f) {
            obtain.setLineSpacing(0.0f, f8);
        }
        if (this.f16205f > 1) {
            obtain.setHyphenationFrequency(this.f16207h);
        }
        return obtain.build();
    }
}
