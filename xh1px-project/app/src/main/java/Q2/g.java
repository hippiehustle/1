package Q2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.buzbuz.smartautoclicker.core.ui.views.itembrief.ItemBriefView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class g extends C5.p {

    /* renamed from: c, reason: collision with root package name */
    public final Paint f4791c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f4792d;

    /* renamed from: e, reason: collision with root package name */
    public final R2.e f4793e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f4794f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f4795g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f4796h;

    /* renamed from: i, reason: collision with root package name */
    public j f4797i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ItemBriefView itemBriefView, h hVar, Y1.d dVar) {
        super(itemBriefView, hVar);
        o6.j.e(itemBriefView, "briefView");
        o6.j.e(dVar, "displayConfigManager");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        int i4 = hVar.f4800c;
        paint.setStrokeWidth(i4);
        int i8 = hVar.f4799b;
        paint.setColor(i8);
        this.f4791c = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(hVar.f4798a);
        this.f4792d = paint2;
        this.f4793e = new R2.e(new R2.f(dVar, i8, i4), new W0.c(12, this));
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f4796h = path;
    }

    public static void r(Path path, RectF rectF, RectF rectF2) {
        path.moveTo(rectF.left, rectF.top);
        path.lineTo(rectF.right, rectF.top);
        path.lineTo(rectF.right, rectF.bottom);
        path.lineTo(rectF.left, rectF.bottom);
        path.close();
        path.moveTo(rectF2.left, rectF2.top);
        path.lineTo(rectF2.right, rectF2.top);
        path.lineTo(rectF2.right, rectF2.bottom);
        path.lineTo(rectF2.left, rectF2.bottom);
        path.close();
    }

    public static Rect s(Rect rect, Rect rect2) {
        int width = (rect2.width() - rect.width()) / 2;
        int height = (rect2.height() - rect.height()) / 2;
        return new Rect(rect2.left + width, rect2.top + height, rect2.right - width, rect2.bottom - height);
    }

    public static RectF t(Rect rect, int i4, int i8, int i9) {
        return new RectF(Math.max(0, rect.left - i4), Math.max(0, rect.top - i4), Math.min(i8, rect.right + i4), Math.min(i9, rect.bottom + i4));
    }

    @Override // C5.p
    public final void m(Canvas canvas) {
        j jVar;
        Bitmap bitmap;
        Rect rect = this.f4794f;
        if (rect != null && (jVar = this.f4797i) != null && (bitmap = jVar.f4806a) != null) {
            canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
        }
        if (this.f4795g != null) {
            canvas.drawPath(this.f4796h, this.f4792d);
            RectF rectF = this.f4795g;
            if (rectF != null) {
                float f8 = ((h) this.f707b).f4801d;
                canvas.drawRoundRect(rectF, f8, f8, this.f4791c);
                return;
            }
            return;
        }
        this.f4793e.b(canvas);
    }

    @Override // C5.p
    public final void n() {
        Rect rect;
        Rect rect2;
        Object obj = this.f707b;
        View view = (View) this.f706a;
        i iVar = null;
        this.f4794f = null;
        this.f4795g = null;
        Path path = this.f4796h;
        path.reset();
        R2.e eVar = this.f4793e;
        eVar.f5017g.clear();
        eVar.f5018h.clear();
        j jVar = this.f4797i;
        if (jVar != null) {
            rect = jVar.f4808c;
        } else {
            rect = null;
        }
        if (jVar != null) {
            rect2 = jVar.f4809d;
        } else {
            rect2 = null;
        }
        if (jVar != null) {
            iVar = jVar.f4807b;
        }
        if (rect2 != null && rect != null && iVar != null) {
            int ordinal = iVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.f4794f = s(rect, rect2);
                        eVar.c();
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                this.f4794f = rect;
                r(path, new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight()), new RectF(rect2));
                this.f4795g = t(rect2, ((h) obj).f4800c, view.getWidth(), view.getHeight());
                return;
            }
            this.f4794f = s(rect, rect2);
            r(path, new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight()), new RectF(rect2));
            this.f4795g = t(rect2, ((h) obj).f4800c, view.getWidth(), view.getHeight());
        }
    }

    @Override // C5.p
    public final void o(P2.a aVar, boolean z8) {
        o6.j.e(aVar, "description");
        if (!(aVar instanceof j)) {
            return;
        }
        this.f4797i = (j) aVar;
    }

    @Override // C5.p
    public final void p() {
    }
}
