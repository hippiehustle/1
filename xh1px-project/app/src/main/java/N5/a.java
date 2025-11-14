package N5;

import A5.b;
import F3.f;
import G5.h;
import G5.i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import x5.l;
import x5.m;

/* loaded from: classes.dex */
public final class a extends h implements l {

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f3774B;

    /* renamed from: C, reason: collision with root package name */
    public final Context f3775C;

    /* renamed from: D, reason: collision with root package name */
    public final Paint.FontMetrics f3776D;

    /* renamed from: E, reason: collision with root package name */
    public final m f3777E;

    /* renamed from: F, reason: collision with root package name */
    public final b f3778F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f3779G;

    /* renamed from: H, reason: collision with root package name */
    public int f3780H;

    /* renamed from: I, reason: collision with root package name */
    public int f3781I;

    /* renamed from: J, reason: collision with root package name */
    public int f3782J;
    public int K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f3783L;

    /* renamed from: M, reason: collision with root package name */
    public int f3784M;

    /* renamed from: N, reason: collision with root package name */
    public int f3785N;

    /* renamed from: O, reason: collision with root package name */
    public float f3786O;

    /* renamed from: P, reason: collision with root package name */
    public float f3787P;

    /* renamed from: Q, reason: collision with root package name */
    public float f3788Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3789R;

    public a(Context context, int i4) {
        super(context, null, 0, i4);
        this.f3776D = new Paint.FontMetrics();
        m mVar = new m(this);
        this.f3777E = mVar;
        this.f3778F = new b(1, this);
        this.f3779G = new Rect();
        this.f3786O = 1.0f;
        this.f3787P = 1.0f;
        this.f3788Q = 0.5f;
        this.f3789R = 1.0f;
        this.f3775C = context;
        float f8 = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = mVar.f16209a;
        textPaint.density = f8;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // G5.h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float u8 = u();
        float f8 = (float) (-((Math.sqrt(2.0d) * this.f3784M) - this.f3784M));
        canvas.scale(this.f3786O, this.f3787P, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f3788Q) + getBounds().top);
        canvas.translate(u8, f8);
        super.draw(canvas);
        if (this.f3774B == null) {
            canvas2 = canvas;
        } else {
            float centerY = getBounds().centerY();
            m mVar = this.f3777E;
            TextPaint textPaint = mVar.f16209a;
            Paint.FontMetrics fontMetrics = this.f3776D;
            textPaint.getFontMetrics(fontMetrics);
            int i4 = (int) (centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (mVar.f16215g != null) {
                textPaint.drawableState = getState();
                mVar.f16215g.e(this.f3775C, mVar.f16209a, mVar.f16210b);
                textPaint.setAlpha((int) (this.f3789R * 255.0f));
            }
            CharSequence charSequence = this.f3774B;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i4, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f3777E.f16209a.getTextSize(), this.f3782J);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float a3;
        float f8 = this.f3780H * 2;
        CharSequence charSequence = this.f3774B;
        if (charSequence == null) {
            a3 = 0.0f;
        } else {
            a3 = this.f3777E.a(charSequence.toString());
        }
        return (int) Math.max(f8 + a3, this.f3781I);
    }

    @Override // G5.h, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f3783L) {
            f e9 = this.f1769d.f1752a.e();
            e9.f1341o = v();
            setShapeAppearanceModel(e9.a());
        }
    }

    public final float u() {
        int i4;
        Rect rect = this.f3779G;
        if (((rect.right - getBounds().right) - this.f3785N) - this.K < 0) {
            i4 = ((rect.right - getBounds().right) - this.f3785N) - this.K;
        } else if (((rect.left - getBounds().left) - this.f3785N) + this.K > 0) {
            i4 = ((rect.left - getBounds().left) - this.f3785N) + this.K;
        } else {
            return 0.0f;
        }
        return i4;
    }

    public final i v() {
        float f8 = -u();
        float width = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.f3784M))) / 2.0f;
        return new i(new G5.f(this.f3784M), Math.min(Math.max(f8, -width), width));
    }
}
