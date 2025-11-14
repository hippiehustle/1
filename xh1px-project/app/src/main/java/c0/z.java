package c0;

import a.AbstractC0405a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import d0.C0592a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class z extends ReplacementSpan {

    /* renamed from: e, reason: collision with root package name */
    public final y f9429e;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f9432h;

    /* renamed from: d, reason: collision with root package name */
    public final Paint.FontMetricsInt f9428d = new Paint.FontMetricsInt();

    /* renamed from: f, reason: collision with root package name */
    public short f9430f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f9431g = 1.0f;

    public z(y yVar) {
        AbstractC0405a.l(yVar, "rasterizer cannot be null");
        this.f9429e = yVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i4, int i8, float f8, int i9, int i10, int i11, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i4, i8, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f9432h;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f9432h = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f8, i9, f8 + this.f9430f, i11, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        k.a().getClass();
        float f9 = i10;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        y yVar = this.f9429e;
        A4.a aVar = yVar.f9426b;
        Typeface typeface = (Typeface) aVar.f283h;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) aVar.f281f, yVar.f9425a * 2, 2, f8, f9, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i4, int i8, Paint.FontMetricsInt fontMetricsInt) {
        short s8;
        Paint.FontMetricsInt fontMetricsInt2 = this.f9428d;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        y yVar = this.f9429e;
        C0592a b4 = yVar.b();
        int b9 = b4.b(14);
        short s9 = 0;
        if (b9 != 0) {
            s8 = ((ByteBuffer) b4.f4206g).getShort(b9 + b4.f4203d);
        } else {
            s8 = 0;
        }
        this.f9431g = abs / s8;
        C0592a b10 = yVar.b();
        int b11 = b10.b(14);
        if (b11 != 0) {
            ((ByteBuffer) b10.f4206g).getShort(b11 + b10.f4203d);
        }
        C0592a b12 = yVar.b();
        int b13 = b12.b(12);
        if (b13 != 0) {
            s9 = ((ByteBuffer) b12.f4206g).getShort(b13 + b12.f4203d);
        }
        short s10 = (short) (s9 * this.f9431g);
        this.f9430f = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
