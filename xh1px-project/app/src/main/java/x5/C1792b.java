package x5;

import P.O;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;
import f5.AbstractC0710a;
import i0.C0878a;
import java.util.WeakHashMap;
import s3.AbstractC1492c;

/* renamed from: x5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1792b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f16134A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f16135B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f16136C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f16138E;

    /* renamed from: F, reason: collision with root package name */
    public float f16139F;

    /* renamed from: G, reason: collision with root package name */
    public float f16140G;

    /* renamed from: H, reason: collision with root package name */
    public float f16141H;

    /* renamed from: I, reason: collision with root package name */
    public float f16142I;

    /* renamed from: J, reason: collision with root package name */
    public float f16143J;
    public int K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f16144L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f16145M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f16146N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f16147O;

    /* renamed from: P, reason: collision with root package name */
    public TimeInterpolator f16148P;

    /* renamed from: Q, reason: collision with root package name */
    public TimeInterpolator f16149Q;

    /* renamed from: R, reason: collision with root package name */
    public float f16150R;

    /* renamed from: S, reason: collision with root package name */
    public float f16151S;

    /* renamed from: T, reason: collision with root package name */
    public float f16152T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f16153U;

    /* renamed from: V, reason: collision with root package name */
    public float f16154V;

    /* renamed from: W, reason: collision with root package name */
    public float f16155W;

    /* renamed from: X, reason: collision with root package name */
    public float f16156X;
    public StaticLayout Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f16157Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f16158a;

    /* renamed from: a0, reason: collision with root package name */
    public float f16159a0;

    /* renamed from: b, reason: collision with root package name */
    public float f16160b;

    /* renamed from: b0, reason: collision with root package name */
    public float f16161b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f16162c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f16163c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f16164d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f16166e;
    public ColorStateList j;
    public ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public float f16173l;

    /* renamed from: m, reason: collision with root package name */
    public float f16174m;

    /* renamed from: n, reason: collision with root package name */
    public float f16175n;

    /* renamed from: o, reason: collision with root package name */
    public float f16176o;

    /* renamed from: p, reason: collision with root package name */
    public float f16177p;

    /* renamed from: q, reason: collision with root package name */
    public float f16178q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f16179r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f16180s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f16181t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f16182u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f16183v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f16184w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f16185x;

    /* renamed from: y, reason: collision with root package name */
    public D5.a f16186y;

    /* renamed from: f, reason: collision with root package name */
    public int f16168f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f16170g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f16171h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f16172i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f16187z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f16137D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f16165d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f16167e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f16169f0 = 1;

    public C1792b(TextInputLayout textInputLayout) {
        this.f16158a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f16146N = textPaint;
        this.f16147O = new TextPaint(textPaint);
        this.f16164d = new Rect();
        this.f16162c = new Rect();
        this.f16166e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f8, int i4, int i8) {
        float f9 = 1.0f - f8;
        return Color.argb(Math.round((Color.alpha(i8) * f8) + (Color.alpha(i4) * f9)), Math.round((Color.red(i8) * f8) + (Color.red(i4) * f9)), Math.round((Color.green(i8) * f8) + (Color.green(i4) * f9)), Math.round((Color.blue(i8) * f8) + (Color.blue(i4) * f9)));
    }

    public static float f(float f8, float f9, float f10, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f10 = timeInterpolator.getInterpolation(f10);
        }
        return AbstractC0710a.a(f8, f9, f10);
    }

    public final boolean b(CharSequence charSequence) {
        N.f fVar;
        WeakHashMap weakHashMap = O.f4214a;
        boolean z8 = true;
        if (this.f16158a.getLayoutDirection() != 1) {
            z8 = false;
        }
        if (this.f16137D) {
            if (z8) {
                fVar = N.g.f3529d;
            } else {
                fVar = N.g.f3528c;
            }
            return fVar.d(charSequence, charSequence.length());
        }
        return z8;
    }

    public final void c(float f8, boolean z8) {
        float f9;
        float f10;
        Typeface typeface;
        boolean z9;
        Layout.Alignment alignment;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (this.f16134A != null) {
            float width = this.f16164d.width();
            float width2 = this.f16162c.width();
            if (Math.abs(f8 - 1.0f) < 1.0E-5f) {
                f9 = this.f16172i;
                f10 = this.f16154V;
                this.f16139F = 1.0f;
                typeface = this.f16179r;
            } else {
                float f11 = this.f16171h;
                float f12 = this.f16155W;
                Typeface typeface2 = this.f16182u;
                if (Math.abs(f8 - 0.0f) < 1.0E-5f) {
                    this.f16139F = 1.0f;
                } else {
                    this.f16139F = f(this.f16171h, this.f16172i, f8, this.f16149Q) / this.f16171h;
                }
                float f13 = this.f16172i / this.f16171h;
                float f14 = width2 * f13;
                if (!z8 && f14 > width) {
                    width = Math.min(width / f13, width2);
                } else {
                    width = width2;
                }
                f9 = f11;
                f10 = f12;
                typeface = typeface2;
            }
            TextPaint textPaint = this.f16146N;
            if (width > 0.0f) {
                if (this.f16140G != f9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f16156X != f10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f16185x != typeface) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.Y != null && width != r9.getWidth()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z10 && !z11 && !z13 && !z12 && !this.f16145M) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                this.f16140G = f9;
                this.f16156X = f10;
                this.f16185x = typeface;
                this.f16145M = false;
                if (this.f16139F != 1.0f) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                textPaint.setLinearText(z15);
                z9 = z14;
            } else {
                z9 = false;
            }
            if (this.f16135B != null && !z9) {
                return;
            }
            textPaint.setTextSize(this.f16140G);
            textPaint.setTypeface(this.f16185x);
            textPaint.setLetterSpacing(this.f16156X);
            boolean b4 = b(this.f16134A);
            this.f16136C = b4;
            int i4 = this.f16165d0;
            if (i4 <= 1 || b4) {
                i4 = 1;
            }
            if (i4 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f16168f, b4 ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        if (this.f16136C) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (this.f16136C) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            k kVar = new k(this.f16134A, textPaint, (int) width);
            kVar.k = this.f16187z;
            kVar.j = b4;
            kVar.f16204e = alignment;
            kVar.f16208i = false;
            kVar.f16205f = i4;
            kVar.f16206g = this.f16167e0;
            kVar.f16207h = this.f16169f0;
            StaticLayout a3 = kVar.a();
            a3.getClass();
            this.Y = a3;
            this.f16135B = a3.getText();
        }
    }

    public final float d() {
        float f8 = this.f16172i;
        TextPaint textPaint = this.f16147O;
        textPaint.setTextSize(f8);
        textPaint.setTypeface(this.f16179r);
        textPaint.setLetterSpacing(this.f16154V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f16144L;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f16181t;
            if (typeface != null) {
                this.f16180s = AbstractC1492c.A(configuration, typeface);
            }
            Typeface typeface2 = this.f16184w;
            if (typeface2 != null) {
                this.f16183v = AbstractC1492c.A(configuration, typeface2);
            }
            Typeface typeface3 = this.f16180s;
            if (typeface3 == null) {
                typeface3 = this.f16181t;
            }
            this.f16179r = typeface3;
            Typeface typeface4 = this.f16183v;
            if (typeface4 == null) {
                typeface4 = this.f16184w;
            }
            this.f16182u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z8) {
        float f8;
        float f9;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f16158a;
        if ((textInputLayout.getHeight() > 0 && textInputLayout.getWidth() > 0) || z8) {
            c(1.0f, z8);
            CharSequence charSequence = this.f16135B;
            TextPaint textPaint = this.f16146N;
            if (charSequence != null && (staticLayout = this.Y) != null) {
                this.f16163c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f16187z);
            }
            CharSequence charSequence2 = this.f16163c0;
            if (charSequence2 != null) {
                this.f16157Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f16157Z = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f16170g, this.f16136C ? 1 : 0);
            int i4 = absoluteGravity & 112;
            Rect rect = this.f16164d;
            if (i4 != 48) {
                if (i4 != 80) {
                    this.f16174m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.f16174m = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.f16174m = rect.top;
            }
            int i8 = absoluteGravity & 8388615;
            if (i8 != 1) {
                if (i8 != 5) {
                    this.f16176o = rect.left;
                } else {
                    this.f16176o = rect.right - this.f16157Z;
                }
            } else {
                this.f16176o = rect.centerX() - (this.f16157Z / 2.0f);
            }
            c(0.0f, z8);
            StaticLayout staticLayout2 = this.Y;
            if (staticLayout2 != null) {
                f8 = staticLayout2.getHeight();
            } else {
                f8 = 0.0f;
            }
            StaticLayout staticLayout3 = this.Y;
            if (staticLayout3 != null && this.f16165d0 > 1) {
                f9 = staticLayout3.getWidth();
            } else {
                CharSequence charSequence3 = this.f16135B;
                if (charSequence3 != null) {
                    f9 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f9 = 0.0f;
                }
            }
            StaticLayout staticLayout4 = this.Y;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f16168f, this.f16136C ? 1 : 0);
            int i9 = absoluteGravity2 & 112;
            Rect rect2 = this.f16162c;
            if (i9 != 48) {
                if (i9 != 80) {
                    this.f16173l = rect2.centerY() - (f8 / 2.0f);
                } else {
                    this.f16173l = textPaint.descent() + (rect2.bottom - f8);
                }
            } else {
                this.f16173l = rect2.top;
            }
            int i10 = absoluteGravity2 & 8388615;
            if (i10 != 1) {
                if (i10 != 5) {
                    this.f16175n = rect2.left;
                } else {
                    this.f16175n = rect2.right - f9;
                }
            } else {
                this.f16175n = rect2.centerX() - (f9 / 2.0f);
            }
            Bitmap bitmap = this.f16138E;
            if (bitmap != null) {
                bitmap.recycle();
                this.f16138E = null;
            }
            l(this.f16160b);
            float f10 = this.f16160b;
            float f11 = f(rect2.left, rect.left, f10, this.f16148P);
            RectF rectF = this.f16166e;
            rectF.left = f11;
            rectF.top = f(this.f16173l, this.f16174m, f10, this.f16148P);
            rectF.right = f(rect2.right, rect.right, f10, this.f16148P);
            rectF.bottom = f(rect2.bottom, rect.bottom, f10, this.f16148P);
            this.f16177p = f(this.f16175n, this.f16176o, f10, this.f16148P);
            this.f16178q = f(this.f16173l, this.f16174m, f10, this.f16148P);
            l(f10);
            C0878a c0878a = AbstractC0710a.f10767b;
            this.f16159a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, c0878a);
            WeakHashMap weakHashMap = O.f4214a;
            textInputLayout.postInvalidateOnAnimation();
            this.f16161b0 = f(1.0f, 0.0f, f10, c0878a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.k;
            ColorStateList colorStateList2 = this.j;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f10, e(colorStateList2), e(this.k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f12 = this.f16154V;
            float f13 = this.f16155W;
            if (f12 != f13) {
                textPaint.setLetterSpacing(f(f13, f12, f10, c0878a));
            } else {
                textPaint.setLetterSpacing(f12);
            }
            this.f16141H = AbstractC0710a.a(0.0f, this.f16150R, f10);
            this.f16142I = AbstractC0710a.a(0.0f, this.f16151S, f10);
            this.f16143J = AbstractC0710a.a(0.0f, this.f16152T, f10);
            int a3 = a(f10, 0, e(this.f16153U));
            this.K = a3;
            textPaint.setShadowLayer(this.f16141H, this.f16142I, this.f16143J, a3);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.k = colorStateList;
        this.j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        D5.a aVar = this.f16186y;
        if (aVar != null) {
            aVar.f1003g = true;
        }
        if (this.f16181t != typeface) {
            this.f16181t = typeface;
            Typeface A2 = AbstractC1492c.A(this.f16158a.getContext().getResources().getConfiguration(), typeface);
            this.f16180s = A2;
            if (A2 == null) {
                A2 = this.f16181t;
            }
            this.f16179r = A2;
            return true;
        }
        return false;
    }

    public final void k(float f8) {
        float h8 = AbstractC1492c.h(f8, 0.0f, 1.0f);
        if (h8 != this.f16160b) {
            this.f16160b = h8;
            float f9 = this.f16162c.left;
            Rect rect = this.f16164d;
            float f10 = f(f9, rect.left, h8, this.f16148P);
            RectF rectF = this.f16166e;
            rectF.left = f10;
            rectF.top = f(this.f16173l, this.f16174m, h8, this.f16148P);
            rectF.right = f(r2.right, rect.right, h8, this.f16148P);
            rectF.bottom = f(r2.bottom, rect.bottom, h8, this.f16148P);
            this.f16177p = f(this.f16175n, this.f16176o, h8, this.f16148P);
            this.f16178q = f(this.f16173l, this.f16174m, h8, this.f16148P);
            l(h8);
            C0878a c0878a = AbstractC0710a.f10767b;
            this.f16159a0 = 1.0f - f(0.0f, 1.0f, 1.0f - h8, c0878a);
            WeakHashMap weakHashMap = O.f4214a;
            TextInputLayout textInputLayout = this.f16158a;
            textInputLayout.postInvalidateOnAnimation();
            this.f16161b0 = f(1.0f, 0.0f, h8, c0878a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.k;
            ColorStateList colorStateList2 = this.j;
            TextPaint textPaint = this.f16146N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(h8, e(colorStateList2), e(this.k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f11 = this.f16154V;
            float f12 = this.f16155W;
            if (f11 != f12) {
                textPaint.setLetterSpacing(f(f12, f11, h8, c0878a));
            } else {
                textPaint.setLetterSpacing(f11);
            }
            this.f16141H = AbstractC0710a.a(0.0f, this.f16150R, h8);
            this.f16142I = AbstractC0710a.a(0.0f, this.f16151S, h8);
            this.f16143J = AbstractC0710a.a(0.0f, this.f16152T, h8);
            int a3 = a(h8, 0, e(this.f16153U));
            this.K = a3;
            textPaint.setShadowLayer(this.f16141H, this.f16142I, this.f16143J, a3);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f8) {
        c(f8, false);
        WeakHashMap weakHashMap = O.f4214a;
        this.f16158a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z8;
        boolean j = j(typeface);
        if (this.f16184w != typeface) {
            this.f16184w = typeface;
            Typeface A2 = AbstractC1492c.A(this.f16158a.getContext().getResources().getConfiguration(), typeface);
            this.f16183v = A2;
            if (A2 == null) {
                A2 = this.f16184w;
            }
            this.f16182u = A2;
            z8 = true;
        } else {
            z8 = false;
        }
        if (!j && !z8) {
            return;
        }
        h(false);
    }
}
