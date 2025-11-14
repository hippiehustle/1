package I5;

import G5.h;
import P.O;
import Z.g;
import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import f5.AbstractC0710a;
import java.util.Iterator;
import java.util.WeakHashMap;
import t0.C1527A;
import t0.C1554u;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2103b;

    public /* synthetic */ b(int i4, Object obj) {
        this.f2102a = i4;
        this.f2103b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i4 = this.f2102a;
        Object obj = this.f2103b;
        switch (i4) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = (e) obj;
                Iterator it = eVar.f2155o.iterator();
                while (it.hasNext()) {
                    N5.a aVar = (N5.a) it.next();
                    aVar.f3788Q = 1.2f;
                    aVar.f3786O = floatValue;
                    aVar.f3787P = floatValue;
                    aVar.f3789R = AbstractC0710a.b(0.0f, 1.0f, 0.19f, 1.0f, floatValue);
                    aVar.invalidateSelf();
                }
                WeakHashMap weakHashMap = O.f4214a;
                eVar.postInvalidateOnAnimation();
                return;
            case 1:
                ((TextInputLayout) obj).f10310y0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar = ((BottomSheetBehavior) obj).f9973i;
                if (hVar != null) {
                    hVar.n(floatValue2);
                    return;
                }
                return;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                int floatValue3 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C1554u c1554u = (C1554u) obj;
                c1554u.f14979c.setAlpha(floatValue3);
                c1554u.f14980d.setAlpha(floatValue3);
                c1554u.f14993s.invalidate();
                return;
            case g.LONG_FIELD_NUMBER /* 4 */:
                ((C1527A) obj).f14687m = valueAnimator.getAnimatedFraction();
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) obj;
                textView.setScaleX(floatValue4);
                textView.setScaleY(floatValue4);
                return;
        }
    }
}
