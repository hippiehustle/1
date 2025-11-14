package x5;

import J0.x;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n extends J0.p {
    @Override // J0.p
    public final void d(x xVar) {
        View view = xVar.f2345b;
        if (view instanceof TextView) {
            xVar.f2344a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // J0.p
    public final void g(x xVar) {
        View view = xVar.f2345b;
        if (view instanceof TextView) {
            xVar.f2344a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // J0.p
    public final Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        float f8;
        if (xVar != null && xVar2 != null && (xVar.f2345b instanceof TextView)) {
            View view = xVar2.f2345b;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                HashMap hashMap = xVar.f2344a;
                HashMap hashMap2 = xVar2.f2344a;
                float f9 = 1.0f;
                if (hashMap.get("android:textscale:scale") != null) {
                    f8 = ((Float) hashMap.get("android:textscale:scale")).floatValue();
                } else {
                    f8 = 1.0f;
                }
                if (hashMap2.get("android:textscale:scale") != null) {
                    f9 = ((Float) hashMap2.get("android:textscale:scale")).floatValue();
                }
                if (f8 != f9) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f8, f9);
                    ofFloat.addUpdateListener(new I5.b(5, textView));
                    return ofFloat;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
