package S2;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final D6.b f5323a;

    /* renamed from: b, reason: collision with root package name */
    public final i f5324b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f5325c;

    public h(D6.b bVar, i iVar) {
        this.f5323a = bVar;
        this.f5324b = iVar;
        RectF rectF = new RectF();
        Point point = ((Y1.d) bVar.f1023e).f7104e.f7094a;
        rectF.right = point.x;
        rectF.bottom = point.y;
        this.f5325c = rectF;
    }

    public final void a() {
        this.f5324b.invalidate();
    }

    public abstract void b(Canvas canvas);

    public abstract void c();

    public void d(int i4, int i8) {
        float f8 = ((Y1.d) this.f5323a.f1023e).f7104e.f7094a.x;
        RectF rectF = this.f5325c;
        rectF.right = f8;
        rectF.bottom = r2.y;
    }
}
