package G5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.buzbuz.smartautoclicker.R;
import h4.AbstractC0832f;
import java.util.BitSet;
import java.util.Objects;
import u5.C1635a;

/* loaded from: classes.dex */
public class h extends Drawable implements w {

    /* renamed from: A, reason: collision with root package name */
    public static final Paint f1768A;

    /* renamed from: d, reason: collision with root package name */
    public g f1769d;

    /* renamed from: e, reason: collision with root package name */
    public final u[] f1770e;

    /* renamed from: f, reason: collision with root package name */
    public final u[] f1771f;

    /* renamed from: g, reason: collision with root package name */
    public final BitSet f1772g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1773h;

    /* renamed from: i, reason: collision with root package name */
    public final Matrix f1774i;
    public final Path j;
    public final Path k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f1775l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f1776m;

    /* renamed from: n, reason: collision with root package name */
    public final Region f1777n;

    /* renamed from: o, reason: collision with root package name */
    public final Region f1778o;

    /* renamed from: p, reason: collision with root package name */
    public l f1779p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f1780q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f1781r;

    /* renamed from: s, reason: collision with root package name */
    public final F5.a f1782s;

    /* renamed from: t, reason: collision with root package name */
    public final W0.d f1783t;

    /* renamed from: u, reason: collision with root package name */
    public final n f1784u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuffColorFilter f1785v;

    /* renamed from: w, reason: collision with root package name */
    public PorterDuffColorFilter f1786w;

    /* renamed from: x, reason: collision with root package name */
    public int f1787x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f1788y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1789z;

    static {
        Paint paint = new Paint(1);
        f1768A = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public h() {
        this(new l());
    }

    public static h d(Context context, float f8, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(AbstractC0832f.n(context, R.attr.colorSurface, h.class.getSimpleName()));
        }
        h hVar = new h();
        hVar.k(context);
        hVar.m(colorStateList);
        hVar.l(f8);
        return hVar;
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        g gVar = this.f1769d;
        this.f1784u.a(gVar.f1752a, gVar.f1760i, rectF, this.f1783t, path);
        if (this.f1769d.f1759h != 1.0f) {
            Matrix matrix = this.f1774i;
            matrix.reset();
            float f8 = this.f1769d.f1759h;
            matrix.setScale(f8, f8, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1788y, true);
    }

    public final int c(int i4) {
        float f8;
        int i8;
        g gVar = this.f1769d;
        float f9 = gVar.f1762m + 0.0f + gVar.f1761l;
        C1635a c1635a = gVar.f1753b;
        if (c1635a != null && c1635a.f15351a && H.b.e(i4, 255) == c1635a.f15354d) {
            if (c1635a.f15355e > 0.0f && f9 > 0.0f) {
                f8 = Math.min(((((float) Math.log1p(f9 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f8 = 0.0f;
            }
            int alpha = Color.alpha(i4);
            int t8 = AbstractC0832f.t(f8, H.b.e(i4, 255), c1635a.f15352b);
            if (f8 > 0.0f && (i8 = c1635a.f15353c) != 0) {
                t8 = H.b.c(H.b.e(i8, C1635a.f15350f), t8);
            }
            return H.b.e(t8, alpha);
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f3, code lost:
    
        if (r5 < 29) goto L40;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        float f8;
        PorterDuffColorFilter porterDuffColorFilter = this.f1785v;
        Paint paint = this.f1780q;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i4 = this.f1769d.k;
        paint.setAlpha(((i4 + (i4 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1786w;
        Paint paint2 = this.f1781r;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f1769d.j);
        int alpha2 = paint2.getAlpha();
        int i8 = this.f1769d.k;
        paint2.setAlpha(((i8 + (i8 >>> 7)) * alpha2) >>> 8);
        boolean z8 = this.f1773h;
        Path path = this.j;
        if (z8) {
            float f9 = 0.0f;
            if (j()) {
                f8 = paint2.getStrokeWidth() / 2.0f;
            } else {
                f8 = 0.0f;
            }
            float f10 = -f8;
            l lVar = this.f1769d.f1752a;
            F3.f e9 = lVar.e();
            c cVar = lVar.f1798e;
            if (!(cVar instanceof j)) {
                cVar = new b(f10, cVar);
            }
            e9.f1337i = cVar;
            c cVar2 = lVar.f1799f;
            if (!(cVar2 instanceof j)) {
                cVar2 = new b(f10, cVar2);
            }
            e9.j = cVar2;
            c cVar3 = lVar.f1801h;
            if (!(cVar3 instanceof j)) {
                cVar3 = new b(f10, cVar3);
            }
            e9.f1338l = cVar3;
            c cVar4 = lVar.f1800g;
            if (!(cVar4 instanceof j)) {
                cVar4 = new b(f10, cVar4);
            }
            e9.k = cVar4;
            l a3 = e9.a();
            this.f1779p = a3;
            float f11 = this.f1769d.f1760i;
            RectF h8 = h();
            RectF rectF = this.f1776m;
            rectF.set(h8);
            if (j()) {
                f9 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f9, f9);
            this.f1784u.a(a3, f11, rectF, null, this.k);
            b(h(), path);
            this.f1773h = false;
        }
        g gVar = this.f1769d;
        int i9 = gVar.f1763n;
        if (i9 != 1 && gVar.f1764o > 0) {
            if (i9 != 2) {
                int i10 = Build.VERSION.SDK_INT;
                if (!gVar.f1752a.d(h())) {
                    if (!path.isConvex()) {
                    }
                }
            }
            canvas.save();
            g gVar2 = this.f1769d;
            int sin = (int) (Math.sin(Math.toRadians(gVar2.f1766q)) * gVar2.f1765p);
            g gVar3 = this.f1769d;
            canvas.translate(sin, (int) (Math.cos(Math.toRadians(gVar3.f1766q)) * gVar3.f1765p));
            if (!this.f1789z) {
                e(canvas);
                canvas.restore();
            } else {
                RectF rectF2 = this.f1788y;
                int width = (int) (rectF2.width() - getBounds().width());
                int height = (int) (rectF2.height() - getBounds().height());
                if (width >= 0 && height >= 0) {
                    Bitmap createBitmap = Bitmap.createBitmap((this.f1769d.f1764o * 2) + ((int) rectF2.width()) + width, (this.f1769d.f1764o * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f12 = (getBounds().left - this.f1769d.f1764o) - width;
                    float f13 = (getBounds().top - this.f1769d.f1764o) - height;
                    canvas2.translate(-f12, -f13);
                    e(canvas2);
                    canvas.drawBitmap(createBitmap, f12, f13, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
            }
        }
        g gVar4 = this.f1769d;
        Paint.Style style = gVar4.f1767r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            f(canvas, paint, path, gVar4.f1752a, h());
        }
        if (j()) {
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.f1772g.cardinality() > 0) {
            Log.w("h", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i4 = this.f1769d.f1765p;
        Path path = this.j;
        F5.a aVar = this.f1782s;
        if (i4 != 0) {
            canvas.drawPath(path, aVar.f1440a);
        }
        for (int i8 = 0; i8 < 4; i8++) {
            u uVar = this.f1770e[i8];
            int i9 = this.f1769d.f1764o;
            Matrix matrix = u.f1832b;
            uVar.a(matrix, aVar, i9, canvas);
            this.f1771f[i8].a(matrix, aVar, this.f1769d.f1764o, canvas);
        }
        if (this.f1789z) {
            g gVar = this.f1769d;
            int sin = (int) (Math.sin(Math.toRadians(gVar.f1766q)) * gVar.f1765p);
            g gVar2 = this.f1769d;
            int cos = (int) (Math.cos(Math.toRadians(gVar2.f1766q)) * gVar2.f1765p);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f1768A);
            canvas.translate(sin, cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, l lVar, RectF rectF) {
        if (lVar.d(rectF)) {
            float a3 = lVar.f1799f.a(rectF) * this.f1769d.f1760i;
            canvas.drawRoundRect(rectF, a3, a3, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public void g(Canvas canvas) {
        float f8;
        l lVar = this.f1779p;
        RectF h8 = h();
        RectF rectF = this.f1776m;
        rectF.set(h8);
        boolean j = j();
        Paint paint = this.f1781r;
        if (j) {
            f8 = paint.getStrokeWidth() / 2.0f;
        } else {
            f8 = 0.0f;
        }
        rectF.inset(f8, f8);
        f(canvas, paint, this.k, lVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1769d.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1769d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        g gVar = this.f1769d;
        if (gVar.f1763n == 2) {
            return;
        }
        if (gVar.f1752a.d(h())) {
            outline.setRoundRect(getBounds(), i() * this.f1769d.f1760i);
        } else {
            RectF h8 = h();
            Path path = this.j;
            b(h8, path);
            h2.a.A(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f1769d.f1758g;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f1777n;
        region.set(bounds);
        RectF h8 = h();
        Path path = this.j;
        b(h8, path);
        Region region2 = this.f1778o;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.f1775l;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        return this.f1769d.f1752a.f1798e.a(h());
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1773h = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.f1769d.f1756e;
            if (colorStateList == null || !colorStateList.isStateful()) {
                this.f1769d.getClass();
                ColorStateList colorStateList2 = this.f1769d.f1755d;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.f1769d.f1754c;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean j() {
        Paint.Style style = this.f1769d.f1767r;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1781r.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void k(Context context) {
        this.f1769d.f1753b = new C1635a(context);
        t();
    }

    public final void l(float f8) {
        g gVar = this.f1769d;
        if (gVar.f1762m != f8) {
            gVar.f1762m = f8;
            t();
        }
    }

    public final void m(ColorStateList colorStateList) {
        g gVar = this.f1769d;
        if (gVar.f1754c != colorStateList) {
            gVar.f1754c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f1769d = new g(this.f1769d);
        return this;
    }

    public final void n(float f8) {
        g gVar = this.f1769d;
        if (gVar.f1760i != f8) {
            gVar.f1760i = f8;
            this.f1773h = true;
            invalidateSelf();
        }
    }

    public final void o() {
        this.f1782s.a(-12303292);
        this.f1769d.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f1773h = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z8;
        boolean r8 = r(iArr);
        boolean s8 = s();
        if (!r8 && !s8) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8) {
            invalidateSelf();
        }
        return z8;
    }

    public final void p() {
        g gVar = this.f1769d;
        if (gVar.f1763n != 2) {
            gVar.f1763n = 2;
            super.invalidateSelf();
        }
    }

    public final void q(ColorStateList colorStateList) {
        g gVar = this.f1769d;
        if (gVar.f1755d != colorStateList) {
            gVar.f1755d = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean r(int[] iArr) {
        boolean z8;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f1769d.f1754c != null && color2 != (colorForState2 = this.f1769d.f1754c.getColorForState(iArr, (color2 = (paint2 = this.f1780q).getColor())))) {
            paint2.setColor(colorForState2);
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f1769d.f1755d != null && color != (colorForState = this.f1769d.f1755d.getColorForState(iArr, (color = (paint = this.f1781r).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z8;
    }

    public final boolean s() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1785v;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f1786w;
        g gVar = this.f1769d;
        ColorStateList colorStateList = gVar.f1756e;
        PorterDuff.Mode mode = gVar.f1757f;
        if (colorStateList != null && mode != null) {
            int c6 = c(colorStateList.getColorForState(getState(), 0));
            this.f1787x = c6;
            porterDuffColorFilter = new PorterDuffColorFilter(c6, mode);
        } else {
            int color = this.f1780q.getColor();
            int c9 = c(color);
            this.f1787x = c9;
            if (c9 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(c9, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.f1785v = porterDuffColorFilter;
        this.f1769d.getClass();
        this.f1786w = null;
        this.f1769d.getClass();
        if (!Objects.equals(porterDuffColorFilter2, this.f1785v) || !Objects.equals(porterDuffColorFilter3, this.f1786w)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        g gVar = this.f1769d;
        if (gVar.k != i4) {
            gVar.k = i4;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1769d.getClass();
        super.invalidateSelf();
    }

    @Override // G5.w
    public final void setShapeAppearanceModel(l lVar) {
        this.f1769d.f1752a = lVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1769d.f1756e = colorStateList;
        s();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.f1769d;
        if (gVar.f1757f != mode) {
            gVar.f1757f = mode;
            s();
            super.invalidateSelf();
        }
    }

    public final void t() {
        g gVar = this.f1769d;
        float f8 = gVar.f1762m + 0.0f;
        gVar.f1764o = (int) Math.ceil(0.75f * f8);
        this.f1769d.f1765p = (int) Math.ceil(f8 * 0.25f);
        s();
        super.invalidateSelf();
    }

    public h(Context context, AttributeSet attributeSet, int i4, int i8) {
        this(l.b(context, attributeSet, i4, i8).a());
    }

    public h(l lVar) {
        this(new g(lVar));
    }

    public h(g gVar) {
        n nVar;
        this.f1770e = new u[4];
        this.f1771f = new u[4];
        this.f1772g = new BitSet(8);
        this.f1774i = new Matrix();
        this.j = new Path();
        this.k = new Path();
        this.f1775l = new RectF();
        this.f1776m = new RectF();
        this.f1777n = new Region();
        this.f1778o = new Region();
        Paint paint = new Paint(1);
        this.f1780q = paint;
        Paint paint2 = new Paint(1);
        this.f1781r = paint2;
        this.f1782s = new F5.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            nVar = m.f1804a;
        } else {
            nVar = new n();
        }
        this.f1784u = nVar;
        this.f1788y = new RectF();
        this.f1789z = true;
        this.f1769d = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        s();
        r(getState());
        this.f1783t = new W0.d(5, this);
    }
}
