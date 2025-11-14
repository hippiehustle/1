package Q2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.buzbuz.smartautoclicker.core.ui.views.itembrief.ItemBriefView;

/* loaded from: classes.dex */
public final class d extends C5.p {

    /* renamed from: c, reason: collision with root package name */
    public final Paint f4783c;

    /* renamed from: d, reason: collision with root package name */
    public PointF f4784d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f4785e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ItemBriefView itemBriefView, e eVar) {
        super(itemBriefView, eVar);
        o6.j.e(itemBriefView, "briefView");
        this.f4783c = new Paint();
        this.f4784d = new PointF(0.0f, 0.0f);
    }

    @Override // C5.p
    public final void m(Canvas canvas) {
        PointF pointF = this.f4784d;
        canvas.drawCircle(pointF.x, pointF.y, ((e) this.f707b).f4788c * 2.0f, this.f4783c);
        Drawable drawable = this.f4785e;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // C5.p
    public final void n() {
        Object obj = this.f707b;
        View view = (View) this.f706a;
        this.f4784d = new PointF(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        Drawable drawable = this.f4785e;
        if (drawable != null) {
            PointF pointF = this.f4784d;
            int i4 = (int) pointF.x;
            float f8 = ((e) obj).f4788c;
            int i8 = (int) pointF.y;
            drawable.setBounds(new Rect(i4 - ((int) f8), i8 - ((int) f8), i4 + ((int) f8), i8 + ((int) f8)));
        }
        e eVar = (e) obj;
        this.f4783c.setShader(C5.p.e(this.f4784d, eVar.f4788c * 1.75f, eVar.f4786a));
    }

    @Override // C5.p
    public final void o(P2.a aVar, boolean z8) {
        Drawable drawable;
        o6.j.e(aVar, "description");
        if (!(aVar instanceof f)) {
            return;
        }
        Drawable drawable2 = ((f) aVar).f4790a;
        if (drawable2 != null && (drawable = drawable2.mutate()) != null) {
            drawable.setTint(((e) this.f707b).f4787b);
        } else {
            drawable = null;
        }
        this.f4785e = drawable;
    }

    @Override // C5.p
    public final void p() {
    }
}
