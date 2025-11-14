package L5;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public final class g extends G5.h {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f2947C = 0;

    /* renamed from: B, reason: collision with root package name */
    public f f2948B;

    @Override // G5.h
    public final void g(Canvas canvas) {
        if (this.f2948B.f2946s.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f2948B.f2946s);
        } else {
            canvas.clipRect(this.f2948B.f2946s, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    @Override // G5.h, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f2948B = new f(this.f2948B);
        return this;
    }

    public final void u(float f8, float f9, float f10, float f11) {
        RectF rectF = this.f2948B.f2946s;
        if (f8 == rectF.left && f9 == rectF.top && f10 == rectF.right && f11 == rectF.bottom) {
            return;
        }
        rectF.set(f8, f9, f10, f11);
        invalidateSelf();
    }
}
