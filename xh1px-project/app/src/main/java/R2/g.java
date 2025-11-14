package R2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class g extends S2.h {

    /* renamed from: d, reason: collision with root package name */
    public final GestureDetector f5021d;

    /* renamed from: e, reason: collision with root package name */
    public S2.b f5022e;

    /* renamed from: f, reason: collision with root package name */
    public final PointF f5023f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5024g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5025h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5026i;
    public final float j;
    public final Paint k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f5027l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5028m;

    /* renamed from: n, reason: collision with root package name */
    public final Path f5029n;

    /* renamed from: o, reason: collision with root package name */
    public final PointF f5030o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f5031p;

    /* renamed from: q, reason: collision with root package name */
    public final RectF f5032q;

    /* renamed from: r, reason: collision with root package name */
    public RectF f5033r;

    /* renamed from: s, reason: collision with root package name */
    public RectF f5034s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1163b f5035t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f5036u;

    public g(Context context, h hVar, S2.a aVar) {
        super(hVar, aVar);
        this.f5021d = new GestureDetector(context, new a(this, 1));
        this.f5023f = hVar.f5037f;
        float f8 = hVar.f5038g;
        this.f5024g = f8;
        this.f5025h = f8 / 3.0f;
        this.f5026i = hVar.f5039h;
        this.j = hVar.f5040i;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hVar.j);
        paint.setColor(hVar.k);
        paint.setAlpha(0);
        this.k = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(hVar.f5041l);
        this.f5027l = paint2;
        this.f5028m = paint2.getColor() >> 24;
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f5029n = path;
        this.f5030o = new PointF();
        this.f5031p = new RectF();
        this.f5032q = new RectF();
        this.f5036u = new RectF();
    }

    @Override // S2.h
    public final void b(Canvas canvas) {
        canvas.drawPath(this.f5029n, this.f5027l);
        float f8 = this.j;
        canvas.drawRoundRect(this.f5031p, f8, f8, this.k);
    }

    @Override // S2.h
    public final void c() {
        Path path = this.f5029n;
        path.reset();
        RectF rectF = this.f5325c;
        path.moveTo(rectF.left, rectF.top);
        path.lineTo(rectF.right, rectF.top);
        path.lineTo(rectF.right, rectF.bottom);
        path.lineTo(rectF.left, rectF.bottom);
        path.close();
        RectF rectF2 = this.f5032q;
        path.moveTo(rectF2.left, rectF2.top);
        path.lineTo(rectF2.right, rectF2.top);
        path.lineTo(rectF2.right, rectF2.bottom);
        path.lineTo(rectF2.left, rectF2.bottom);
        path.close();
    }

    @Override // S2.h
    public final void d(int i4, int i8) {
        super.d(i4, i8);
        f(true);
    }

    public final boolean e(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f5021d.onTouchEvent(motionEvent);
        if (!onTouchEvent && this.f5022e != null) {
            onTouchEvent = true;
        }
        if (motionEvent.getAction() == 1) {
            this.f5022e = null;
            return true;
        }
        return onTouchEvent;
    }

    public final void f(boolean z8) {
        InterfaceC1163b interfaceC1163b;
        RectF rectF = this.f5033r;
        RectF rectF2 = this.f5325c;
        RectF rectF3 = this.f5031p;
        if (rectF != null) {
            float f8 = rectF.left;
            float f9 = this.f5026i;
            rectF3.left = f8 - f9;
            rectF3.top = rectF.top - f9;
            rectF3.right = rectF.right + f9;
            rectF3.bottom = rectF.bottom + f9;
        } else {
            float centerX = rectF2.centerX();
            PointF pointF = this.f5023f;
            rectF3.left = centerX - pointF.x;
            rectF3.top = rectF2.centerY() - pointF.y;
            rectF3.right = rectF2.centerX() + pointF.x;
            rectF3.bottom = rectF2.centerY() + pointF.y;
        }
        RectF rectF4 = this.f5034s;
        PointF pointF2 = this.f5030o;
        if (rectF4 != null) {
            pointF2.x = rectF4.width();
            pointF2.y = rectF4.height();
        } else {
            pointF2.x = rectF2.width() * 0.1f;
            pointF2.y = rectF2.height() * 0.05f;
        }
        g();
        if (z8 && (interfaceC1163b = this.f5035t) != null) {
            Rect rect = new Rect();
            rectF3.roundOut(rect);
            interfaceC1163b.m(rect);
        }
    }

    public final void g() {
        RectF rectF = this.f5325c;
        RectF rectF2 = this.f5031p;
        rectF2.intersect(rectF);
        float f8 = rectF2.left;
        int i4 = this.f5026i;
        RectF rectF3 = this.f5032q;
        rectF3.left = f8 + i4;
        rectF3.top = rectF2.top + i4;
        rectF3.right = rectF2.right - i4;
        rectF3.bottom = rectF2.bottom - i4;
    }
}
