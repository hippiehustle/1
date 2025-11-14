package h5;

import D5.d;
import F3.f;
import G5.h;
import P.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.buzbuz.smartautoclicker.R;
import f5.AbstractC0710a;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import x5.l;
import x5.m;
import x5.p;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0833a extends Drawable implements l {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f11372d;

    /* renamed from: e, reason: collision with root package name */
    public final h f11373e;

    /* renamed from: f, reason: collision with root package name */
    public final m f11374f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f11375g;

    /* renamed from: h, reason: collision with root package name */
    public final C0835c f11376h;

    /* renamed from: i, reason: collision with root package name */
    public float f11377i;
    public float j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public float f11378l;

    /* renamed from: m, reason: collision with root package name */
    public float f11379m;

    /* renamed from: n, reason: collision with root package name */
    public float f11380n;

    /* renamed from: o, reason: collision with root package name */
    public WeakReference f11381o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f11382p;

    public C0833a(Context context, C0834b c0834b) {
        int intValue;
        int intValue2;
        FrameLayout frameLayout;
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f11372d = weakReference;
        p.c(context, p.f16217b, "Theme.MaterialComponents");
        this.f11375g = new Rect();
        m mVar = new m(this);
        this.f11374f = mVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = mVar.f16209a;
        textPaint.setTextAlign(align);
        C0835c c0835c = new C0835c(context, c0834b);
        this.f11376h = c0835c;
        boolean e9 = e();
        C0834b c0834b2 = c0835c.f11412b;
        if (e9) {
            intValue = c0834b2.j.intValue();
        } else {
            intValue = c0834b2.f11394h.intValue();
        }
        if (e()) {
            intValue2 = c0834b2.k.intValue();
        } else {
            intValue2 = c0834b2.f11395i.intValue();
        }
        h hVar = new h(G5.l.a(context, intValue, intValue2, new G5.a(0)).a());
        this.f11373e = hVar;
        g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && mVar.f16215g != (dVar = new d(context2, c0834b2.f11393g.intValue()))) {
            mVar.c(dVar, context2);
            textPaint.setColor(c0834b2.f11392f.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i4 = c0834b2.f11399o;
        if (i4 != -2) {
            this.k = ((int) Math.pow(10.0d, i4 - 1.0d)) - 1;
        } else {
            this.k = c0834b2.f11400p;
        }
        mVar.f16213e = true;
        i();
        invalidateSelf();
        mVar.f16213e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(c0834b2.f11391e.intValue());
        if (hVar.f1769d.f1754c != valueOf) {
            hVar.m(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(c0834b2.f11392f.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f11381o;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f11381o.get();
            WeakReference weakReference3 = this.f11382p;
            if (weakReference3 != null) {
                frameLayout = (FrameLayout) weakReference3.get();
            } else {
                frameLayout = null;
            }
            h(view, frameLayout);
        }
        i();
        setVisible(c0834b2.f11407w.booleanValue(), false);
    }

    @Override // x5.l
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        C0835c c0835c = this.f11376h;
        C0834b c0834b = c0835c.f11412b;
        C0834b c0834b2 = c0835c.f11412b;
        String str = c0834b.f11397m;
        WeakReference weakReference = this.f11372d;
        if (str != null) {
            int i4 = c0834b.f11399o;
            if (i4 != -2 && str != null && str.length() > i4) {
                Context context = (Context) weakReference.get();
                if (context != null) {
                    return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i4 - 1), "…");
                }
                return "";
            }
            return str;
        }
        if (f()) {
            if (this.k != -2 && d() > this.k) {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    return "";
                }
                return String.format(c0834b2.f11401q, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.k), "+");
            }
            return NumberFormat.getInstance(c0834b2.f11401q).format(d());
        }
        return null;
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.f11382p;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i4 = this.f11376h.f11412b.f11398n;
        if (i4 != -1) {
            return i4;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String b4;
        int round;
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f11373e.draw(canvas);
            if (e() && (b4 = b()) != null) {
                Rect rect = new Rect();
                m mVar = this.f11374f;
                mVar.f16209a.getTextBounds(b4, 0, b4.length(), rect);
                float exactCenterY = this.j - rect.exactCenterY();
                float f8 = this.f11377i;
                if (rect.bottom <= 0) {
                    round = (int) exactCenterY;
                } else {
                    round = Math.round(exactCenterY);
                }
                canvas.drawText(b4, f8, round, mVar.f16209a);
            }
        }
    }

    public final boolean e() {
        if (this.f11376h.f11412b.f11397m != null || f()) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        C0834b c0834b = this.f11376h.f11412b;
        if (c0834b.f11397m == null && c0834b.f11398n != -1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int intValue;
        int intValue2;
        Context context = (Context) this.f11372d.get();
        if (context == null) {
            return;
        }
        boolean e9 = e();
        C0835c c0835c = this.f11376h;
        if (e9) {
            intValue = c0835c.f11412b.j.intValue();
        } else {
            intValue = c0835c.f11412b.f11394h.intValue();
        }
        if (e()) {
            intValue2 = c0835c.f11412b.k.intValue();
        } else {
            intValue2 = c0835c.f11412b.f11395i.intValue();
        }
        this.f11373e.setShapeAppearanceModel(G5.l.a(context, intValue, intValue2, new G5.a(0)).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f11376h.f11412b.f11396l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f11375g.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f11375g.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.f11381o = new WeakReference(view);
        this.f11382p = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        View view;
        float f8;
        float f9;
        float f10;
        int intValue;
        float f11;
        float f12;
        float f13;
        float y4;
        float x8;
        float f14;
        float f15;
        float f16;
        int i4;
        float f17;
        WeakReference weakReference = this.f11372d;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f11381o;
        ViewGroup viewGroup = null;
        if (weakReference2 != null) {
            view = (View) weakReference2.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = this.f11375g;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference weakReference3 = this.f11382p;
            if (weakReference3 != null) {
                viewGroup = (ViewGroup) weakReference3.get();
            }
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect3);
            }
            boolean e9 = e();
            C0835c c0835c = this.f11376h;
            if (e9) {
                f8 = c0835c.f11414d;
            } else {
                f8 = c0835c.f11413c;
            }
            this.f11378l = f8;
            if (f8 != -1.0f) {
                this.f11379m = f8;
                this.f11380n = f8;
            } else {
                if (e()) {
                    f9 = c0835c.f11417g;
                } else {
                    f9 = c0835c.f11415e;
                }
                this.f11379m = Math.round(f9 / 2.0f);
                if (e()) {
                    f10 = c0835c.f11418h;
                } else {
                    f10 = c0835c.f11416f;
                }
                this.f11380n = Math.round(f10 / 2.0f);
            }
            if (e()) {
                String b4 = b();
                float f18 = this.f11379m;
                m mVar = this.f11374f;
                this.f11379m = Math.max(f18, (mVar.a(b4) / 2.0f) + c0835c.f11412b.f11408x.intValue());
                float f19 = this.f11380n;
                if (!mVar.f16213e) {
                    f17 = mVar.f16212d;
                } else {
                    mVar.b(b4);
                    f17 = mVar.f16212d;
                }
                float max = Math.max(f19, (f17 / 2.0f) + c0835c.f11412b.f11409y.intValue());
                this.f11380n = max;
                this.f11379m = Math.max(this.f11379m, max);
            }
            C0834b c0834b = c0835c.f11412b;
            C0834b c0834b2 = c0835c.f11412b;
            int i8 = c0835c.k;
            int intValue2 = c0834b.f11383A.intValue();
            if (e()) {
                intValue2 = c0834b.f11385C.intValue();
                Context context2 = (Context) weakReference.get();
                if (context2 != null) {
                    intValue2 = AbstractC0710a.c(AbstractC0710a.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), intValue2, intValue2 - c0834b.f11388F.intValue());
                }
            }
            if (i8 == 0) {
                intValue2 -= Math.round(this.f11380n);
            }
            int intValue3 = c0834b.f11387E.intValue() + intValue2;
            int intValue4 = c0834b2.f11406v.intValue();
            if (intValue4 != 8388691 && intValue4 != 8388693) {
                this.j = rect3.top + intValue3;
            } else {
                this.j = rect3.bottom - intValue3;
            }
            if (e()) {
                intValue = c0834b.f11384B.intValue();
            } else {
                intValue = c0834b2.f11410z.intValue();
            }
            if (i8 == 1) {
                if (e()) {
                    i4 = c0835c.j;
                } else {
                    i4 = c0835c.f11419i;
                }
                intValue += i4;
            }
            int intValue5 = c0834b.f11386D.intValue() + intValue;
            int intValue6 = c0834b2.f11406v.intValue();
            if (intValue6 != 8388659 && intValue6 != 8388691) {
                WeakHashMap weakHashMap = O.f4214a;
                if (view.getLayoutDirection() == 0) {
                    f16 = (rect3.right + this.f11379m) - intValue5;
                } else {
                    f16 = (rect3.left - this.f11379m) + intValue5;
                }
                this.f11377i = f16;
            } else {
                WeakHashMap weakHashMap2 = O.f4214a;
                if (view.getLayoutDirection() == 0) {
                    f11 = (rect3.left - this.f11379m) + intValue5;
                } else {
                    f11 = (rect3.right + this.f11379m) - intValue5;
                }
                this.f11377i = f11;
            }
            if (c0834b.f11389G.booleanValue()) {
                View c6 = c();
                if (c6 == null) {
                    if (view.getParent() instanceof View) {
                        float y5 = view.getY();
                        f13 = view.getX();
                        View view2 = (View) view.getParent();
                        f12 = y5;
                        c6 = view2;
                        y4 = c6.getY() + (this.j - this.f11380n) + f12;
                        x8 = c6.getX() + (this.f11377i - this.f11379m) + f13;
                        if (!(c6.getParent() instanceof View)) {
                            f14 = ((this.j + this.f11380n) - (((View) c6.getParent()).getHeight() - c6.getY())) + f12;
                        } else {
                            f14 = 0.0f;
                        }
                        if (!(c6.getParent() instanceof View)) {
                            f15 = ((this.f11377i + this.f11379m) - (((View) c6.getParent()).getWidth() - c6.getX())) + f13;
                        } else {
                            f15 = 0.0f;
                        }
                        if (y4 < 0.0f) {
                            this.j = Math.abs(y4) + this.j;
                        }
                        if (x8 < 0.0f) {
                            this.f11377i = Math.abs(x8) + this.f11377i;
                        }
                        if (f14 > 0.0f) {
                            this.j -= Math.abs(f14);
                        }
                        if (f15 > 0.0f) {
                            this.f11377i -= Math.abs(f15);
                        }
                    }
                } else {
                    FrameLayout c9 = c();
                    if (c9 != null && c9.getId() == R.id.mtrl_anchor_parent) {
                        if (c6.getParent() instanceof View) {
                            f12 = c6.getY();
                            f13 = c6.getX();
                            c6 = (View) c6.getParent();
                        }
                    } else {
                        f12 = 0.0f;
                        f13 = 0.0f;
                    }
                    y4 = c6.getY() + (this.j - this.f11380n) + f12;
                    x8 = c6.getX() + (this.f11377i - this.f11379m) + f13;
                    if (!(c6.getParent() instanceof View)) {
                    }
                    if (!(c6.getParent() instanceof View)) {
                    }
                    if (y4 < 0.0f) {
                    }
                    if (x8 < 0.0f) {
                    }
                    if (f14 > 0.0f) {
                    }
                    if (f15 > 0.0f) {
                    }
                }
            }
            float f20 = this.f11377i;
            float f21 = this.j;
            float f22 = this.f11379m;
            float f23 = this.f11380n;
            rect2.set((int) (f20 - f22), (int) (f21 - f23), (int) (f20 + f22), (int) (f21 + f23));
            float f24 = this.f11378l;
            h hVar = this.f11373e;
            if (f24 != -1.0f) {
                f e10 = hVar.f1769d.f1752a.e();
                e10.c(f24);
                hVar.setShapeAppearanceModel(e10.a());
            }
            if (!rect.equals(rect2)) {
                hVar.setBounds(rect2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, x5.l
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        C0835c c0835c = this.f11376h;
        c0835c.f11411a.f11396l = i4;
        c0835c.f11412b.f11396l = i4;
        this.f11374f.f16209a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
