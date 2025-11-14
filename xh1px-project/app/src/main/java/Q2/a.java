package Q2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.buzbuz.smartautoclicker.core.ui.views.itembrief.ItemBriefView;

/* loaded from: classes.dex */
public final class a extends C5.p {

    /* renamed from: c, reason: collision with root package name */
    public final K2.h f4769c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f4770d;

    /* renamed from: e, reason: collision with root package name */
    public c f4771e;

    /* renamed from: f, reason: collision with root package name */
    public float f4772f;

    /* renamed from: g, reason: collision with root package name */
    public PointF f4773g;

    /* renamed from: h, reason: collision with root package name */
    public Z5.j f4774h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ItemBriefView itemBriefView, b bVar) {
        super(itemBriefView, bVar);
        o6.j.e(itemBriefView, "briefView");
        int i4 = K2.h.f2621l;
        float f8 = bVar.f4778d;
        K2.h h02 = E2.c.h0(f8, 0.75f * f8);
        h02.f2627i = 250L;
        h02.setDuration(250L);
        h02.setInterpolator(new AccelerateDecelerateInterpolator());
        h02.f2626h = -1;
        h02.f2625g = 2;
        h02.j = 500L;
        h02.addUpdateListener(new I1.a(4, this));
        this.f4769c = h02;
        this.f4770d = new Paint();
        this.f4772f = f8;
    }

    @Override // C5.p
    public final void m(Canvas canvas) {
        Object obj = this.f707b;
        PointF pointF = this.f4773g;
        if (pointF != null) {
            Z5.j jVar = this.f4774h;
            if (jVar != null) {
                canvas.drawBitmap((Bitmap) jVar.f7486e, (Rect) null, (Rect) jVar.f7485d, (Paint) null);
            }
            canvas.drawCircle(pointF.x, pointF.y, this.f4772f * 2.0f, this.f4770d);
            b bVar = (b) obj;
            canvas.drawCircle(pointF.x, pointF.y, this.f4772f, bVar.f4776b);
            canvas.drawCircle(pointF.x, pointF.y, bVar.f4779e, bVar.f4777c);
        }
    }

    @Override // C5.p
    public final void n() {
        this.f4774h = null;
        c cVar = this.f4771e;
        if (cVar != null) {
            Bitmap bitmap = cVar.f4782c;
            View view = (View) this.f706a;
            Point point = new Point(view.getWidth(), view.getHeight());
            if (bitmap != null) {
                int width = (point.x - bitmap.getWidth()) / 2;
                int height = (point.y - bitmap.getHeight()) / 2;
                this.f4774h = new Z5.j(new Rect(width, height, bitmap.getWidth() + width, bitmap.getHeight() + height), bitmap);
                this.f4773g = new PointF(point.x / 2.0f, point.y / 2.0f);
            } else {
                this.f4773g = cVar.f4781b;
            }
            PointF pointF = this.f4773g;
            if (pointF != null) {
                b bVar = (b) this.f707b;
                this.f4770d.setShader(C5.p.e(pointF, bVar.f4778d * 1.75f, bVar.f4775a));
            }
        }
    }

    @Override // C5.p
    public final void o(P2.a aVar, boolean z8) {
        o6.j.e(aVar, "description");
        if (aVar instanceof c) {
            K2.h hVar = this.f4769c;
            if (hVar.isStarted()) {
                hVar.cancel();
            }
            c cVar = (c) aVar;
            this.f4771e = cVar;
            this.f4772f = ((b) this.f707b).f4778d;
            if (z8) {
                hVar.k = cVar.f4780a;
                hVar.start();
            }
        }
    }

    @Override // C5.p
    public final void p() {
        this.f4769c.cancel();
        this.f4772f = ((b) this.f707b).f4778d;
        this.f4773g = null;
    }
}
