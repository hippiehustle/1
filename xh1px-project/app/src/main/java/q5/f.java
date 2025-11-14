package q5;

import G5.n;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import x5.l;
import x5.m;

/* loaded from: classes.dex */
public final class f extends G5.h implements Drawable.Callback, l {

    /* renamed from: J0, reason: collision with root package name */
    public static final int[] f14152J0 = {R.attr.state_enabled};

    /* renamed from: K0, reason: collision with root package name */
    public static final ShapeDrawable f14153K0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0, reason: collision with root package name */
    public ColorStateList f14154A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f14155B;

    /* renamed from: B0, reason: collision with root package name */
    public PorterDuff.Mode f14156B0;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f14157C;

    /* renamed from: C0, reason: collision with root package name */
    public int[] f14158C0;

    /* renamed from: D, reason: collision with root package name */
    public float f14159D;

    /* renamed from: D0, reason: collision with root package name */
    public ColorStateList f14160D0;

    /* renamed from: E, reason: collision with root package name */
    public float f14161E;

    /* renamed from: E0, reason: collision with root package name */
    public WeakReference f14162E0;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f14163F;

    /* renamed from: F0, reason: collision with root package name */
    public TextUtils.TruncateAt f14164F0;

    /* renamed from: G, reason: collision with root package name */
    public float f14165G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f14166G0;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f14167H;

    /* renamed from: H0, reason: collision with root package name */
    public int f14168H0;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f14169I;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f14170I0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f14171J;
    public Drawable K;

    /* renamed from: L, reason: collision with root package name */
    public ColorStateList f14172L;

    /* renamed from: M, reason: collision with root package name */
    public float f14173M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f14174N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f14175O;

    /* renamed from: P, reason: collision with root package name */
    public Drawable f14176P;

    /* renamed from: Q, reason: collision with root package name */
    public RippleDrawable f14177Q;

    /* renamed from: R, reason: collision with root package name */
    public ColorStateList f14178R;

    /* renamed from: S, reason: collision with root package name */
    public float f14179S;

    /* renamed from: T, reason: collision with root package name */
    public SpannableStringBuilder f14180T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f14181U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f14182V;

    /* renamed from: W, reason: collision with root package name */
    public Drawable f14183W;

    /* renamed from: X, reason: collision with root package name */
    public ColorStateList f14184X;
    public f5.e Y;

    /* renamed from: Z, reason: collision with root package name */
    public f5.e f14185Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f14186a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f14187b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f14188c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f14189d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f14190e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f14191f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f14192g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f14193h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Context f14194i0;
    public final Paint j0;

    /* renamed from: k0, reason: collision with root package name */
    public final Paint.FontMetrics f14195k0;

    /* renamed from: l0, reason: collision with root package name */
    public final RectF f14196l0;

    /* renamed from: m0, reason: collision with root package name */
    public final PointF f14197m0;

    /* renamed from: n0, reason: collision with root package name */
    public final Path f14198n0;

    /* renamed from: o0, reason: collision with root package name */
    public final m f14199o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f14200p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f14201q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f14202r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f14203s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f14204t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f14205u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f14206v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f14207w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f14208x0;

    /* renamed from: y0, reason: collision with root package name */
    public ColorFilter f14209y0;

    /* renamed from: z0, reason: collision with root package name */
    public PorterDuffColorFilter f14210z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.chipStyle, com.buzbuz.smartautoclicker.R.style.Widget_MaterialComponents_Chip_Action);
        this.f14161E = -1.0f;
        this.j0 = new Paint(1);
        this.f14195k0 = new Paint.FontMetrics();
        this.f14196l0 = new RectF();
        this.f14197m0 = new PointF();
        this.f14198n0 = new Path();
        this.f14208x0 = 255;
        this.f14156B0 = PorterDuff.Mode.SRC_IN;
        this.f14162E0 = new WeakReference(null);
        k(context);
        this.f14194i0 = context;
        m mVar = new m(this);
        this.f14199o0 = mVar;
        this.f14169I = "";
        mVar.f16209a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f14152J0;
        setState(iArr);
        if (!Arrays.equals(this.f14158C0, iArr)) {
            this.f14158C0 = iArr;
            if (Z()) {
                C(getState(), iArr);
            }
        }
        this.f14166G0 = true;
        int[] iArr2 = E5.a.f1245a;
        f14153K0.setTint(-1);
    }

    public static boolean A(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public static void a0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean z(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public final void B() {
        e eVar = (e) this.f14162E0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.c(chip.f10056t);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean C(int[] iArr, int[] iArr2) {
        int i4;
        int i8;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f14155B;
        if (colorStateList2 != null) {
            i4 = colorStateList2.getColorForState(iArr, this.f14200p0);
        } else {
            i4 = 0;
        }
        int c6 = c(i4);
        boolean z12 = true;
        if (this.f14200p0 != c6) {
            this.f14200p0 = c6;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f14157C;
        if (colorStateList3 != null) {
            i8 = colorStateList3.getColorForState(iArr, this.f14201q0);
        } else {
            i8 = 0;
        }
        int c9 = c(i8);
        if (this.f14201q0 != c9) {
            this.f14201q0 = c9;
            onStateChange = true;
        }
        int c10 = H.b.c(c9, c6);
        if (this.f14202r0 != c10) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f1769d.f1754c == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 | z9) {
            this.f14202r0 = c10;
            m(ColorStateList.valueOf(c10));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f14163F;
        if (colorStateList4 != null) {
            i9 = colorStateList4.getColorForState(iArr, this.f14203s0);
        } else {
            i9 = 0;
        }
        if (this.f14203s0 != i9) {
            this.f14203s0 = i9;
            onStateChange = true;
        }
        if (this.f14160D0 != null && E5.a.c(iArr)) {
            i10 = this.f14160D0.getColorForState(iArr, this.f14204t0);
        } else {
            i10 = 0;
        }
        if (this.f14204t0 != i10) {
            this.f14204t0 = i10;
        }
        D5.d dVar = this.f14199o0.f16215g;
        if (dVar != null && (colorStateList = dVar.j) != null) {
            i11 = colorStateList.getColorForState(iArr, this.f14205u0);
        } else {
            i11 = 0;
        }
        if (this.f14205u0 != i11) {
            this.f14205u0 = i11;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (state[i13] == 16842912) {
                    if (this.f14181U) {
                        z10 = true;
                    }
                } else {
                    i13++;
                }
            }
        }
        z10 = false;
        if (this.f14206v0 != z10 && this.f14183W != null) {
            float w8 = w();
            this.f14206v0 = z10;
            if (w8 != w()) {
                onStateChange = true;
                z11 = true;
            } else {
                z11 = false;
                onStateChange = true;
            }
        } else {
            z11 = false;
        }
        ColorStateList colorStateList5 = this.f14154A0;
        if (colorStateList5 != null) {
            i12 = colorStateList5.getColorForState(iArr, this.f14207w0);
        } else {
            i12 = 0;
        }
        if (this.f14207w0 != i12) {
            this.f14207w0 = i12;
            ColorStateList colorStateList6 = this.f14154A0;
            PorterDuff.Mode mode = this.f14156B0;
            if (colorStateList6 != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f14210z0 = porterDuffColorFilter;
        } else {
            z12 = onStateChange;
        }
        if (A(this.K)) {
            z12 |= this.K.setState(iArr);
        }
        if (A(this.f14183W)) {
            z12 |= this.f14183W.setState(iArr);
        }
        if (A(this.f14176P)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z12 |= this.f14176P.setState(iArr3);
        }
        int[] iArr4 = E5.a.f1245a;
        if (A(this.f14177Q)) {
            z12 |= this.f14177Q.setState(iArr2);
        }
        if (z12) {
            invalidateSelf();
        }
        if (z11) {
            B();
        }
        return z12;
    }

    public final void D(boolean z8) {
        if (this.f14181U != z8) {
            this.f14181U = z8;
            float w8 = w();
            if (!z8 && this.f14206v0) {
                this.f14206v0 = false;
            }
            float w9 = w();
            invalidateSelf();
            if (w8 != w9) {
                B();
            }
        }
    }

    public final void E(Drawable drawable) {
        if (this.f14183W != drawable) {
            float w8 = w();
            this.f14183W = drawable;
            float w9 = w();
            a0(this.f14183W);
            u(this.f14183W);
            invalidateSelf();
            if (w8 != w9) {
                B();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f14184X != colorStateList) {
            this.f14184X = colorStateList;
            if (this.f14182V && (drawable = this.f14183W) != null && this.f14181U) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void G(boolean z8) {
        if (this.f14182V != z8) {
            boolean X8 = X();
            this.f14182V = z8;
            boolean X9 = X();
            if (X8 != X9) {
                if (X9) {
                    u(this.f14183W);
                } else {
                    a0(this.f14183W);
                }
                invalidateSelf();
                B();
            }
        }
    }

    public final void H(float f8) {
        if (this.f14161E != f8) {
            this.f14161E = f8;
            F3.f e9 = this.f1769d.f1752a.e();
            e9.c(f8);
            setShapeAppearanceModel(e9.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.K;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z8 = drawable3 instanceof I.c;
            drawable2 = drawable3;
            if (z8) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float w8 = w();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.K = drawable4;
            float w9 = w();
            a0(drawable2);
            if (Y()) {
                u(this.K);
            }
            invalidateSelf();
            if (w8 != w9) {
                B();
            }
        }
    }

    public final void J(float f8) {
        if (this.f14173M != f8) {
            float w8 = w();
            this.f14173M = f8;
            float w9 = w();
            invalidateSelf();
            if (w8 != w9) {
                B();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        this.f14174N = true;
        if (this.f14172L != colorStateList) {
            this.f14172L = colorStateList;
            if (Y()) {
                this.K.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void L(boolean z8) {
        if (this.f14171J != z8) {
            boolean Y = Y();
            this.f14171J = z8;
            boolean Y2 = Y();
            if (Y != Y2) {
                if (Y2) {
                    u(this.K);
                } else {
                    a0(this.K);
                }
                invalidateSelf();
                B();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f14163F != colorStateList) {
            this.f14163F = colorStateList;
            if (this.f14170I0) {
                q(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(float f8) {
        if (this.f14165G != f8) {
            this.f14165G = f8;
            this.j0.setStrokeWidth(f8);
            if (this.f14170I0) {
                this.f1769d.j = f8;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f14176P;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z8 = drawable3 instanceof I.c;
            drawable2 = drawable3;
            if (z8) {
            }
            if (drawable2 == drawable) {
                float x8 = x();
                if (drawable != null) {
                    drawable4 = drawable.mutate();
                }
                this.f14176P = drawable4;
                int[] iArr = E5.a.f1245a;
                this.f14177Q = new RippleDrawable(E5.a.b(this.f14167H), this.f14176P, f14153K0);
                float x9 = x();
                a0(drawable2);
                if (Z()) {
                    u(this.f14176P);
                }
                invalidateSelf();
                if (x8 != x9) {
                    B();
                    return;
                }
                return;
            }
            return;
        }
        drawable2 = null;
        if (drawable2 == drawable) {
        }
    }

    public final void P(float f8) {
        if (this.f14192g0 != f8) {
            this.f14192g0 = f8;
            invalidateSelf();
            if (Z()) {
                B();
            }
        }
    }

    public final void Q(float f8) {
        if (this.f14179S != f8) {
            this.f14179S = f8;
            invalidateSelf();
            if (Z()) {
                B();
            }
        }
    }

    public final void R(float f8) {
        if (this.f14191f0 != f8) {
            this.f14191f0 = f8;
            invalidateSelf();
            if (Z()) {
                B();
            }
        }
    }

    public final void S(ColorStateList colorStateList) {
        if (this.f14178R != colorStateList) {
            this.f14178R = colorStateList;
            if (Z()) {
                this.f14176P.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(boolean z8) {
        if (this.f14175O != z8) {
            boolean Z8 = Z();
            this.f14175O = z8;
            boolean Z9 = Z();
            if (Z8 != Z9) {
                if (Z9) {
                    u(this.f14176P);
                } else {
                    a0(this.f14176P);
                }
                invalidateSelf();
                B();
            }
        }
    }

    public final void U(float f8) {
        if (this.f14188c0 != f8) {
            float w8 = w();
            this.f14188c0 = f8;
            float w9 = w();
            invalidateSelf();
            if (w8 != w9) {
                B();
            }
        }
    }

    public final void V(float f8) {
        if (this.f14187b0 != f8) {
            float w8 = w();
            this.f14187b0 = f8;
            float w9 = w();
            invalidateSelf();
            if (w8 != w9) {
                B();
            }
        }
    }

    public final void W(ColorStateList colorStateList) {
        if (this.f14167H != colorStateList) {
            this.f14167H = colorStateList;
            this.f14160D0 = null;
            onStateChange(getState());
        }
    }

    public final boolean X() {
        if (this.f14182V && this.f14183W != null && this.f14206v0) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        if (this.f14171J && this.K != null) {
            return true;
        }
        return false;
    }

    public final boolean Z() {
        if (this.f14175O && this.f14176P != null) {
            return true;
        }
        return false;
    }

    @Override // G5.h, x5.l
    public final void a() {
        B();
        invalidateSelf();
    }

    @Override // G5.h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i4;
        Canvas canvas2;
        int i8;
        boolean z8;
        int i9;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i4 = this.f14208x0) != 0) {
            if (i4 < 255) {
                canvas2 = canvas;
                i8 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i4);
            } else {
                canvas2 = canvas;
                i8 = 0;
            }
            boolean z9 = this.f14170I0;
            Paint paint = this.j0;
            RectF rectF = this.f14196l0;
            if (!z9) {
                paint.setColor(this.f14200p0);
                paint.setStyle(Paint.Style.FILL);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, y(), y(), paint);
            }
            if (!this.f14170I0) {
                paint.setColor(this.f14201q0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f14209y0;
                if (colorFilter == null) {
                    colorFilter = this.f14210z0;
                }
                paint.setColorFilter(colorFilter);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, y(), y(), paint);
            }
            if (this.f14170I0) {
                super.draw(canvas);
            }
            if (this.f14165G > 0.0f && !this.f14170I0) {
                paint.setColor(this.f14203s0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f14170I0) {
                    ColorFilter colorFilter2 = this.f14209y0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f14210z0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f8 = bounds.left;
                float f9 = this.f14165G / 2.0f;
                rectF.set(f8 + f9, bounds.top + f9, bounds.right - f9, bounds.bottom - f9);
                float f10 = this.f14161E - (this.f14165G / 2.0f);
                canvas2.drawRoundRect(rectF, f10, f10, paint);
            }
            paint.setColor(this.f14204t0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            if (!this.f14170I0) {
                canvas2.drawRoundRect(rectF, y(), y(), paint);
            } else {
                RectF rectF2 = new RectF(bounds);
                G5.g gVar = this.f1769d;
                G5.l lVar = gVar.f1752a;
                float f11 = gVar.f1760i;
                W0.d dVar = this.f1783t;
                n nVar = this.f1784u;
                Path path = this.f14198n0;
                nVar.a(lVar, f11, rectF2, dVar, path);
                f(canvas2, paint, path, this.f1769d.f1752a, h());
            }
            if (Y()) {
                v(bounds, rectF);
                float f12 = rectF.left;
                float f13 = rectF.top;
                canvas2.translate(f12, f13);
                this.K.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.K.draw(canvas2);
                canvas2.translate(-f12, -f13);
            }
            if (X()) {
                v(bounds, rectF);
                float f14 = rectF.left;
                float f15 = rectF.top;
                canvas2.translate(f14, f15);
                this.f14183W.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.f14183W.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (this.f14166G0 && this.f14169I != null) {
                PointF pointF = this.f14197m0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.f14169I;
                m mVar = this.f14199o0;
                if (charSequence != null) {
                    float w8 = w() + this.f14186a0 + this.f14189d0;
                    if (getLayoutDirection() == 0) {
                        pointF.x = bounds.left + w8;
                    } else {
                        pointF.x = bounds.right - w8;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = mVar.f16209a;
                    Paint.FontMetrics fontMetrics = this.f14195k0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF.setEmpty();
                if (this.f14169I != null) {
                    float w9 = w() + this.f14186a0 + this.f14189d0;
                    float x8 = x() + this.f14193h0 + this.f14190e0;
                    if (getLayoutDirection() == 0) {
                        rectF.left = bounds.left + w9;
                        rectF.right = bounds.right - x8;
                    } else {
                        rectF.left = bounds.left + x8;
                        rectF.right = bounds.right - w9;
                    }
                    rectF.top = bounds.top;
                    rectF.bottom = bounds.bottom;
                }
                D5.d dVar2 = mVar.f16215g;
                TextPaint textPaint2 = mVar.f16209a;
                if (dVar2 != null) {
                    textPaint2.drawableState = getState();
                    mVar.f16215g.e(this.f14194i0, textPaint2, mVar.f16210b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(mVar.a(this.f14169I.toString())) > Math.round(rectF.width())) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    int save = canvas2.save();
                    canvas2.clipRect(rectF);
                    i9 = save;
                } else {
                    i9 = 0;
                }
                CharSequence charSequence2 = this.f14169I;
                if (z8 && this.f14164F0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.f14164F0);
                }
                canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
                canvas2 = canvas;
                if (z8) {
                    canvas2.restoreToCount(i9);
                }
            }
            if (Z()) {
                rectF.setEmpty();
                if (Z()) {
                    float f16 = this.f14193h0 + this.f14192g0;
                    if (getLayoutDirection() == 0) {
                        float f17 = bounds.right - f16;
                        rectF.right = f17;
                        rectF.left = f17 - this.f14179S;
                    } else {
                        float f18 = bounds.left + f16;
                        rectF.left = f18;
                        rectF.right = f18 + this.f14179S;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f19 = this.f14179S;
                    float f20 = exactCenterY - (f19 / 2.0f);
                    rectF.top = f20;
                    rectF.bottom = f20 + f19;
                }
                float f21 = rectF.left;
                float f22 = rectF.top;
                canvas2.translate(f21, f22);
                this.f14176P.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                int[] iArr = E5.a.f1245a;
                this.f14177Q.setBounds(this.f14176P.getBounds());
                this.f14177Q.jumpToCurrentState();
                this.f14177Q.draw(canvas2);
                canvas2.translate(-f21, -f22);
            }
            if (this.f14208x0 < 255) {
                canvas2.restoreToCount(i8);
            }
        }
    }

    @Override // G5.h, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f14208x0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f14209y0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f14159D;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(x() + this.f14199o0.a(this.f14169I.toString()) + w() + this.f14186a0 + this.f14189d0 + this.f14190e0 + this.f14193h0), this.f14168H0);
    }

    @Override // G5.h, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // G5.h, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f14170I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f14161E);
            outline2 = outline;
        } else {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f14159D, this.f14161E);
        }
        outline2.setAlpha(this.f14208x0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // G5.h, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!z(this.f14155B) && !z(this.f14157C) && !z(this.f14163F)) {
            D5.d dVar = this.f14199o0.f16215g;
            if (dVar == null || (colorStateList = dVar.j) == null || !colorStateList.isStateful()) {
                if ((!this.f14182V || this.f14183W == null || !this.f14181U) && !A(this.K) && !A(this.f14183W) && !z(this.f14154A0)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i4) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i4);
        if (Y()) {
            onLayoutDirectionChanged |= this.K.setLayoutDirection(i4);
        }
        if (X()) {
            onLayoutDirectionChanged |= this.f14183W.setLayoutDirection(i4);
        }
        if (Z()) {
            onLayoutDirectionChanged |= this.f14176P.setLayoutDirection(i4);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        boolean onLevelChange = super.onLevelChange(i4);
        if (Y()) {
            onLevelChange |= this.K.setLevel(i4);
        }
        if (X()) {
            onLevelChange |= this.f14183W.setLevel(i4);
        }
        if (Z()) {
            onLevelChange |= this.f14176P.setLevel(i4);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // G5.h, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f14170I0) {
            super.onStateChange(iArr);
        }
        return C(iArr, this.f14158C0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // G5.h, android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.f14208x0 != i4) {
            this.f14208x0 = i4;
            invalidateSelf();
        }
    }

    @Override // G5.h, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f14209y0 != colorFilter) {
            this.f14209y0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // G5.h, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f14154A0 != colorStateList) {
            this.f14154A0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // G5.h, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f14156B0 != mode) {
            this.f14156B0 = mode;
            ColorStateList colorStateList = this.f14154A0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f14210z0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        boolean visible = super.setVisible(z8, z9);
        if (Y()) {
            visible |= this.K.setVisible(z8, z9);
        }
        if (X()) {
            visible |= this.f14183W.setVisible(z8, z9);
        }
        if (Z()) {
            visible |= this.f14176P.setVisible(z8, z9);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f14176P) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f14158C0);
                }
                drawable.setTintList(this.f14178R);
                return;
            }
            Drawable drawable2 = this.K;
            if (drawable == drawable2 && this.f14174N) {
                drawable2.setTintList(this.f14172L);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (!Y() && !X()) {
            return;
        }
        float f8 = this.f14186a0 + this.f14187b0;
        if (this.f14206v0) {
            drawable = this.f14183W;
        } else {
            drawable = this.K;
        }
        float f9 = this.f14173M;
        if (f9 <= 0.0f && drawable != null) {
            f9 = drawable.getIntrinsicWidth();
        }
        if (getLayoutDirection() == 0) {
            float f10 = rect.left + f8;
            rectF.left = f10;
            rectF.right = f10 + f9;
        } else {
            float f11 = rect.right - f8;
            rectF.right = f11;
            rectF.left = f11 - f9;
        }
        if (this.f14206v0) {
            drawable2 = this.f14183W;
        } else {
            drawable2 = this.K;
        }
        float f12 = this.f14173M;
        if (f12 <= 0.0f && drawable2 != null) {
            f12 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f14194i0.getResources().getDisplayMetrics()));
            if (drawable2.getIntrinsicHeight() <= f12) {
                f12 = drawable2.getIntrinsicHeight();
            }
        }
        float exactCenterY = rect.exactCenterY() - (f12 / 2.0f);
        rectF.top = exactCenterY;
        rectF.bottom = exactCenterY + f12;
    }

    public final float w() {
        Drawable drawable;
        if (!Y() && !X()) {
            return 0.0f;
        }
        float f8 = this.f14187b0;
        if (this.f14206v0) {
            drawable = this.f14183W;
        } else {
            drawable = this.K;
        }
        float f9 = this.f14173M;
        if (f9 <= 0.0f && drawable != null) {
            f9 = drawable.getIntrinsicWidth();
        }
        return f9 + f8 + this.f14188c0;
    }

    public final float x() {
        if (Z()) {
            return this.f14191f0 + this.f14179S + this.f14192g0;
        }
        return 0.0f;
    }

    public final float y() {
        if (this.f14170I0) {
            return i();
        }
        return this.f14161E;
    }
}
