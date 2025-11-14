package Q2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.animation.LinearInterpolator;
import com.buzbuz.smartautoclicker.core.ui.views.itembrief.ItemBriefView;

/* loaded from: classes.dex */
public final class n extends C5.p {

    /* renamed from: c, reason: collision with root package name */
    public final K2.h f4822c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f4823d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f4824e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f4825f;

    /* renamed from: g, reason: collision with root package name */
    public PointF f4826g;

    /* renamed from: h, reason: collision with root package name */
    public Z5.j f4827h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ItemBriefView itemBriefView, o oVar) {
        super(itemBriefView, oVar);
        o6.j.e(itemBriefView, "briefView");
        int i4 = K2.h.f2621l;
        K2.h h02 = E2.c.h0(0.0f, 1.0f);
        h02.f2627i = 250L;
        h02.j = 500L;
        h02.f2626h = -1;
        h02.f2625g = 1;
        h02.setInterpolator(new LinearInterpolator());
        h02.addUpdateListener(new I1.a(6, this));
        this.f4822c = h02;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(oVar.f4828a);
        paint.setStrokeWidth(oVar.f4835h * 0.75f);
        this.f4823d = paint;
        this.f4824e = new Paint();
        this.f4825f = new Paint();
        this.f4826g = new PointF();
        this.f4827h = new Z5.j(null, null);
    }

    @Override // C5.p
    public final void m(Canvas canvas) {
        n nVar;
        Canvas canvas2;
        PointF pointF;
        n nVar2;
        Object obj = this.f707b;
        Z5.j jVar = this.f4827h;
        PointF pointF2 = (PointF) jVar.f7485d;
        PointF pointF3 = (PointF) jVar.f7486e;
        if (pointF2 != null || pointF3 != null) {
            if (pointF2 != null) {
                o oVar = (o) obj;
                nVar = this;
                nVar.r(canvas, pointF2, oVar.f4834g, oVar.f4830c, oVar.f4832e, this.f4824e);
                canvas2 = canvas;
            } else {
                nVar = this;
                canvas2 = canvas;
            }
            if (pointF3 != null) {
                o oVar2 = (o) obj;
                pointF = pointF3;
                n nVar3 = nVar;
                nVar3.r(canvas2, pointF, oVar2.f4834g, oVar2.f4831d, oVar2.f4833f, nVar.f4825f);
                nVar2 = nVar3;
            } else {
                pointF = pointF3;
                nVar2 = nVar;
            }
            if (pointF2 != null && pointF != null) {
                float f8 = pointF2.x;
                float f9 = pointF2.y;
                float f10 = pointF.x;
                float f11 = pointF.y;
                o oVar3 = (o) obj;
                float f12 = oVar3.f4835h;
                Paint paint = oVar3.f4829b;
                canvas2.drawLine(f8, f9, f10, f11, paint);
                PointF pointF4 = nVar2.f4826g;
                float f13 = 2;
                canvas2.drawCircle(pointF4.x, pointF4.y, f12 * f13, paint);
                PointF pointF5 = nVar2.f4826g;
                canvas2.drawCircle(pointF5.x, pointF5.y, f12 * f13, nVar2.f4823d);
            }
        }
    }

    @Override // C5.p
    public final void n() {
        Object obj = this.f707b;
        PointF pointF = (PointF) this.f4827h.f7485d;
        if (pointF != null) {
            o oVar = (o) obj;
            this.f4824e.setShader(C5.p.e(pointF, oVar.f4834g * 1.75f, oVar.f4828a));
        }
        PointF pointF2 = (PointF) this.f4827h.f7486e;
        if (pointF2 != null) {
            o oVar2 = (o) obj;
            this.f4825f.setShader(C5.p.e(pointF2, oVar2.f4834g * 1.75f, oVar2.f4828a));
        }
    }

    @Override // C5.p
    public final void o(P2.a aVar, boolean z8) {
        o6.j.e(aVar, "description");
        if (aVar instanceof p) {
            K2.h hVar = this.f4822c;
            if (hVar.isStarted()) {
                hVar.cancel();
            }
            this.f4826g = new PointF();
            p pVar = (p) aVar;
            this.f4827h = new Z5.j(pVar.f4837b, pVar.f4838c);
            long max = Math.max(pVar.f4836a, 250L);
            if (z8) {
                Z5.j jVar = this.f4827h;
                if (jVar.f7485d != null && jVar.f7486e != null) {
                    hVar.setDuration(max);
                    hVar.start();
                }
            }
        }
    }

    @Override // C5.p
    public final void p() {
        this.f4822c.cancel();
        this.f4826g = new PointF();
        this.f4827h = new Z5.j(null, null);
    }

    public final void r(Canvas canvas, PointF pointF, float f8, Paint paint, Paint paint2, Paint paint3) {
        canvas.drawCircle(pointF.x, pointF.y, 2.0f * f8, paint3);
        canvas.drawCircle(pointF.x, pointF.y, f8, paint);
        canvas.drawCircle(pointF.x, pointF.y, ((o) this.f707b).f4835h, paint2);
    }
}
