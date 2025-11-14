package c0;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* renamed from: c0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557B implements Spannable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f9373d = false;

    /* renamed from: e, reason: collision with root package name */
    public Spannable f9374e;

    public C0557B(Spannable spannable) {
        this.f9374e = spannable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [t7.d] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final void a() {
        ?? r12;
        Spannable spannable = this.f9374e;
        if (!this.f9373d) {
            if (Build.VERSION.SDK_INT < 28) {
                r12 = new Object();
            } else {
                r12 = new Object();
            }
            if (r12.l(spannable)) {
                this.f9374e = new SpannableString(spannable);
            }
        }
        this.f9373d = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.f9374e.charAt(i4);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f9374e.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f9374e.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f9374e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f9374e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f9374e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i4, int i8, Class cls) {
        return this.f9374e.getSpans(i4, i8, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f9374e.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i4, int i8, Class cls) {
        return this.f9374e.nextSpanTransition(i4, i8, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f9374e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i4, int i8, int i9) {
        a();
        this.f9374e.setSpan(obj, i4, i8, i9);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i8) {
        return this.f9374e.subSequence(i4, i8);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f9374e.toString();
    }
}
