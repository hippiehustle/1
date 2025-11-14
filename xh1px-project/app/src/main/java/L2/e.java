package L2;

import R2.g;
import R2.h;
import a6.AbstractC0437l;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.buzbuz.smartautoclicker.R;
import java.util.List;
import o6.j;
import z2.AbstractC1854a;

/* loaded from: classes.dex */
public final class e extends S2.a {

    /* renamed from: d, reason: collision with root package name */
    public final g f2772d;

    /* renamed from: e, reason: collision with root package name */
    public final T2.b f2773e;

    /* renamed from: f, reason: collision with root package name */
    public final A4.d f2774f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2775g;

    /* renamed from: h, reason: collision with root package name */
    public final List f2776h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, Y1.d dVar) {
        super(context, null, 0);
        j.e(dVar, "displayConfigManager");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1854a.f16621a, R.attr.areaSelectorStyle, 0);
        j.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
        A4.d dVar2 = new A4.d(new a(obtainStyledAttributes.getColor(0, 0) >> 24, obtainStyledAttributes.getInteger(13, 500), obtainStyledAttributes.getInteger(12, 1000), obtainStyledAttributes.getInteger(17, 500)));
        this.f2774f = dVar2;
        g gVar = new g(context, new h(dVar, new PointF(obtainStyledAttributes.getDimensionPixelSize(6, 100) / 2.0f, obtainStyledAttributes.getDimensionPixelSize(5, 100) / 2.0f), obtainStyledAttributes.getDimensionPixelSize(16, 10), (int) Math.ceil(obtainStyledAttributes.getDimensionPixelSize(18, 4) / 2), obtainStyledAttributes.getDimensionPixelSize(4, 2), obtainStyledAttributes.getDimensionPixelSize(18, 4), obtainStyledAttributes.getColor(2, -1), obtainStyledAttributes.getColor(0, 0)), this);
        this.f2772d = gVar;
        T2.b bVar = new T2.b(context, new T2.c(dVar, obtainStyledAttributes.getDimensionPixelSize(14, 5), obtainStyledAttributes.getDimensionPixelSize(15, 10), obtainStyledAttributes.getResourceId(7, 0), obtainStyledAttributes.getResourceId(11, 0), obtainStyledAttributes.getResourceId(8, 0), obtainStyledAttributes.getResourceId(9, 0), obtainStyledAttributes.getResourceId(10, 0), null, null), this);
        this.f2773e = bVar;
        obtainStyledAttributes.recycle();
        gVar.f5035t = new d(this, 0);
        dVar2.f295e = new d(this, 1);
        dVar2.f296f = new d(this, 2);
        dVar2.f297g = new d(this, 3);
        this.f2776h = AbstractC0437l.X(gVar, bVar);
    }

    public final Rect getSelection() {
        g gVar = this.f2772d;
        if (gVar != null) {
            RectF rectF = gVar.f5032q;
            Rect rect = new Rect();
            rectF.roundOut(rect);
            return rect;
        }
        j.i("selector");
        throw null;
    }

    @Override // S2.a
    public List<S2.h> getViewComponents$ui_fDroidRelease() {
        return this.f2776h;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            g gVar = this.f2772d;
            if (gVar != null) {
                S2.b bVar = gVar.f5022e;
                A4.d dVar = this.f2774f;
                if (bVar != null) {
                    T2.b bVar2 = this.f2773e;
                    if (bVar2 != null) {
                        bVar2.g(bVar);
                        if (dVar != null) {
                            ValueAnimator valueAnimator = (ValueAnimator) dVar.f299i;
                            if (valueAnimator.isRunning()) {
                                valueAnimator.end();
                            }
                            if (motionEvent.getAction() == 1) {
                                if (valueAnimator.isRunning()) {
                                    valueAnimator.end();
                                }
                                valueAnimator.start();
                            }
                        } else {
                            j.i("animations");
                            throw null;
                        }
                    } else {
                        j.i("hintsIcons");
                        throw null;
                    }
                }
                if (gVar.e(motionEvent)) {
                    return true;
                }
                if (dVar != null) {
                    if (((AnimatorSet) dVar.f298h).isRunning()) {
                        this.f2775g = true;
                        return false;
                    }
                    if (this.f2775g) {
                        motionEvent.setAction(0);
                        this.f2775g = false;
                    }
                } else {
                    j.i("animations");
                    throw null;
                }
            } else {
                j.i("selector");
                throw null;
            }
        }
        return false;
    }
}
