package D5;

import G.n;
import a.AbstractC0405a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import e5.AbstractC0645a;
import q4.X;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1010a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1011b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1012c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1013d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1014e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1015f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1016g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1017h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1018i;
    public ColorStateList j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1019l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1020m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f1021n;

    public d(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, AbstractC0645a.f10627Q);
        this.k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.j = AbstractC0405a.C(context, obtainStyledAttributes, 3);
        AbstractC0405a.C(context, obtainStyledAttributes, 4);
        AbstractC0405a.C(context, obtainStyledAttributes, 5);
        this.f1012c = obtainStyledAttributes.getInt(2, 0);
        this.f1013d = obtainStyledAttributes.getInt(1, 1);
        int i8 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f1019l = obtainStyledAttributes.getResourceId(i8, 0);
        this.f1011b = obtainStyledAttributes.getString(i8);
        obtainStyledAttributes.getBoolean(14, false);
        this.f1010a = AbstractC0405a.C(context, obtainStyledAttributes, 6);
        this.f1014e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f1015f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f1016g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i4, AbstractC0645a.f10616E);
        this.f1017h = obtainStyledAttributes2.hasValue(0);
        this.f1018i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f1021n;
        int i4 = this.f1012c;
        if (typeface == null && (str = this.f1011b) != null) {
            this.f1021n = Typeface.create(str, i4);
        }
        if (this.f1021n == null) {
            int i8 = this.f1013d;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        this.f1021n = Typeface.DEFAULT;
                    } else {
                        this.f1021n = Typeface.MONOSPACE;
                    }
                } else {
                    this.f1021n = Typeface.SERIF;
                }
            } else {
                this.f1021n = Typeface.SANS_SERIF;
            }
            this.f1021n = Typeface.create(this.f1021n, i4);
        }
    }

    public final Typeface b(Context context) {
        if (this.f1020m) {
            return this.f1021n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a3 = n.a(context, this.f1019l);
                this.f1021n = a3;
                if (a3 != null) {
                    this.f1021n = Typeface.create(a3, this.f1012c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.f1020m = true;
        return this.f1021n;
    }

    public final void c(Context context, X x8) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i4 = this.f1019l;
        if (i4 == 0) {
            this.f1020m = true;
        }
        if (this.f1020m) {
            x8.G(this.f1021n, true);
            return;
        }
        try {
            b bVar = new b(this, x8);
            ThreadLocal threadLocal = n.f1676a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                n.b(context, i4, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1020m = true;
            x8.F(1);
        } catch (Exception unused2) {
            this.f1020m = true;
            x8.F(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i4 = this.f1019l;
        if (i4 != 0) {
            ThreadLocal threadLocal = n.f1676a;
            if (!context.isRestricted()) {
                typeface = n.b(context, i4, new TypedValue(), 0, null, false, true);
            }
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public final void e(Context context, TextPaint textPaint, X x8) {
        int i4;
        int i8;
        f(context, textPaint, x8);
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            i4 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i4 = -16777216;
        }
        textPaint.setColor(i4);
        ColorStateList colorStateList2 = this.f1010a;
        if (colorStateList2 != null) {
            i8 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i8 = 0;
        }
        textPaint.setShadowLayer(this.f1016g, this.f1014e, this.f1015f, i8);
    }

    public final void f(Context context, TextPaint textPaint, X x8) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f1021n);
        c(context, new c(this, context, textPaint, x8));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z8;
        float f8;
        Typeface A2 = AbstractC1492c.A(context.getResources().getConfiguration(), typeface);
        if (A2 != null) {
            typeface = A2;
        }
        textPaint.setTypeface(typeface);
        int i4 = (~typeface.getStyle()) & this.f1012c;
        if ((i4 & 1) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        textPaint.setFakeBoldText(z8);
        if ((i4 & 2) != 0) {
            f8 = -0.25f;
        } else {
            f8 = 0.0f;
        }
        textPaint.setTextSkewX(f8);
        textPaint.setTextSize(this.k);
        if (this.f1017h) {
            textPaint.setLetterSpacing(this.f1018i);
        }
    }
}
