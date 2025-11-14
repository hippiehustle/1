package z5;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.buzbuz.smartautoclicker.R;
import f5.AbstractC0710a;
import i0.C0878a;

/* renamed from: z5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1875f extends AbstractC1870a {

    /* renamed from: g, reason: collision with root package name */
    public final float f16694g;

    /* renamed from: h, reason: collision with root package name */
    public final float f16695h;

    public C1875f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f16694g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f16695h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f16686b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i4), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C0878a(1));
        return animatorSet;
    }

    public final void b(float f8) {
        float f9;
        float interpolation = this.f16685a.getInterpolation(f8);
        View view = this.f16686b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f10 = this.f16694g / width;
            float f11 = this.f16695h / height;
            float a3 = 1.0f - AbstractC0710a.a(0.0f, f10, interpolation);
            float a4 = 1.0f - AbstractC0710a.a(0.0f, f11, interpolation);
            view.setScaleX(a3);
            view.setPivotY(height);
            view.setScaleY(a4);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    childAt.setPivotY(-childAt.getTop());
                    if (a4 != 0.0f) {
                        f9 = a3 / a4;
                    } else {
                        f9 = 1.0f;
                    }
                    childAt.setScaleY(f9);
                }
            }
        }
    }
}
