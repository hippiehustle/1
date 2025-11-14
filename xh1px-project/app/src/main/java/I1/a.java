package I1;

import L5.i;
import N0.EnumC0193a;
import N0.x;
import Q2.k;
import Q2.n;
import S4.h;
import V0.c;
import Z.g;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import i.P;
import o6.j;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2085b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f2084a = i4;
        this.f2085b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2084a) {
            case 0:
                h hVar = (h) this.f2085b;
                j.e(valueAnimator, "it");
                ConstraintLayout constraintLayout = hVar.f5377r;
                if (constraintLayout != null) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    j.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    constraintLayout.setAlpha(((Float) animatedValue).floatValue());
                    return;
                }
                j.i("view");
                throw null;
            case 1:
                i iVar = (i) this.f2085b;
                iVar.getClass();
                iVar.f2993d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                x xVar = (x) this.f2085b;
                EnumC0193a enumC0193a = xVar.f3667O;
                if (enumC0193a == null) {
                    enumC0193a = EnumC0193a.f3580d;
                }
                if (enumC0193a == EnumC0193a.f3581e) {
                    xVar.invalidateSelf();
                    return;
                }
                c cVar = xVar.f3686r;
                if (cVar != null) {
                    cVar.r(xVar.f3675e.a());
                    return;
                }
                return;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                ((View) ((P) ((W5.a) this.f2085b).f6634e).f11638e.getParent()).invalidate();
                return;
            case g.LONG_FIELD_NUMBER /* 4 */:
                Q2.a aVar = (Q2.a) this.f2085b;
                j.e(valueAnimator, "it");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                j.c(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                aVar.f4772f = ((Float) animatedValue2).floatValue();
                ((View) aVar.f706a).invalidate();
                return;
            case g.STRING_FIELD_NUMBER /* 5 */:
                k kVar = (k) this.f2085b;
                j.e(valueAnimator, "it");
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                j.c(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                kVar.f4814g = (Float) animatedValue3;
                ((View) kVar.f706a).invalidate();
                return;
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                n nVar = (n) this.f2085b;
                j.e(valueAnimator, "it");
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                j.c(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue4).floatValue();
                Z5.j jVar = nVar.f4827h;
                PointF pointF = (PointF) jVar.f7485d;
                PointF pointF2 = (PointF) jVar.f7486e;
                if (pointF != null && pointF2 != null) {
                    float f8 = pointF2.x - pointF.x;
                    float f9 = pointF2.y - pointF.y;
                    float sqrt = (float) Math.sqrt((f9 * f9) + (f8 * f8));
                    float f10 = f8 / sqrt;
                    float f11 = f9 / sqrt;
                    PointF pointF3 = nVar.f4826g;
                    float f12 = sqrt * floatValue;
                    pointF3.x = (f10 * f12) + pointF.x;
                    pointF3.y = (f11 * f12) + pointF.y;
                    ((View) nVar.f706a).invalidate();
                    return;
                }
                return;
            default:
                n5.c cVar2 = (n5.c) this.f2085b;
                cVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar2.j.setAlpha((int) (255.0f * floatValue2));
                cVar2.f13018x = floatValue2;
                return;
        }
    }

    public /* synthetic */ a(W5.a aVar, View view) {
        this.f2084a = 3;
        this.f2085b = aVar;
    }
}
