package Q2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.buzbuz.smartautoclicker.core.ui.views.itembrief.ItemBriefView;

/* loaded from: classes.dex */
public final class k extends C5.p {

    /* renamed from: c, reason: collision with root package name */
    public final K2.h f4810c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f4811d;

    /* renamed from: e, reason: collision with root package name */
    public PointF f4812e;

    /* renamed from: f, reason: collision with root package name */
    public RectF f4813f;

    /* renamed from: g, reason: collision with root package name */
    public Float f4814g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ItemBriefView itemBriefView, l lVar) {
        super(itemBriefView, lVar);
        o6.j.e(itemBriefView, "briefView");
        int i4 = K2.h.f2621l;
        K2.h h02 = E2.c.h0(0.0f, 360.0f);
        h02.f2627i = 250L;
        h02.setInterpolator(new LinearInterpolator());
        h02.f2626h = -1;
        h02.f2625g = 1;
        h02.j = 500L;
        h02.addUpdateListener(new I1.a(5, this));
        this.f4810c = h02;
        this.f4811d = new Paint();
        this.f4812e = new PointF();
    }

    @Override // C5.p
    public final void m(Canvas canvas) {
        Float f8;
        Object obj = this.f707b;
        RectF rectF = this.f4813f;
        if (rectF != null && (f8 = this.f4814g) != null) {
            float floatValue = f8.floatValue();
            PointF pointF = this.f4812e;
            float f9 = pointF.x;
            float f10 = pointF.y;
            l lVar = (l) obj;
            float f11 = lVar.f4819e;
            canvas.drawCircle(f9, f10, 2.0f * f11, this.f4811d);
            PointF pointF2 = this.f4812e;
            canvas.drawCircle(pointF2.x, pointF2.y, f11, lVar.f4816b);
            canvas.save();
            PointF pointF3 = this.f4812e;
            canvas.rotate(floatValue, pointF3.x, pointF3.y);
            canvas.drawRoundRect(rectF, 4.0f, 4.0f, lVar.f4817c);
            canvas.restore();
        }
    }

    @Override // C5.p
    public final void n() {
        View view = (View) this.f706a;
        Point point = new Point(view.getWidth(), view.getHeight());
        this.f4812e = new PointF(point.x / 2.0f, point.y / 2.0f);
        PointF pointF = this.f4812e;
        float f8 = pointF.x;
        float f9 = pointF.y;
        l lVar = (l) this.f707b;
        float f10 = lVar.f4819e;
        this.f4813f = new RectF(f8 - 5.0f, f9 - (f10 - (lVar.f4818d * 1.5f)), f8 + 5.0f, f9 + 5.0f);
        this.f4811d.setShader(C5.p.e(this.f4812e, f10 * 1.75f, lVar.f4815a));
    }

    @Override // C5.p
    public final void o(P2.a aVar, boolean z8) {
        o6.j.e(aVar, "description");
        if (aVar instanceof m) {
            K2.h hVar = this.f4810c;
            if (hVar.isStarted()) {
                hVar.cancel();
            }
            long max = Math.max(((m) aVar).f4821a, 500L);
            this.f4814g = Float.valueOf(0.0f);
            if (z8) {
                hVar.setDuration(Math.max(max, 500L));
                hVar.start();
            }
        }
    }

    @Override // C5.p
    public final void p() {
        this.f4810c.cancel();
        this.f4814g = null;
        this.f4813f = null;
    }
}
