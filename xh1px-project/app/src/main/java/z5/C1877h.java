package z5;

import P.O;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.buzbuz.smartautoclicker.R;
import f5.AbstractC0710a;
import java.util.WeakHashMap;

/* renamed from: z5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1877h extends AbstractC1870a {

    /* renamed from: g, reason: collision with root package name */
    public final float f16699g;

    /* renamed from: h, reason: collision with root package name */
    public final float f16700h;

    /* renamed from: i, reason: collision with root package name */
    public final float f16701i;

    public C1877h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f16699g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f16700h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f16701i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(float f8, boolean z8, int i4) {
        boolean z9;
        float f9;
        float f10;
        float f11;
        float interpolation = this.f16685a.getInterpolation(f8);
        WeakHashMap weakHashMap = O.f4214a;
        View view = this.f16686b;
        boolean z10 = true;
        if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 3) == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 != z9) {
            z10 = false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        float f12 = width;
        if (f12 > 0.0f) {
            float f13 = height;
            if (f13 > 0.0f) {
                float f14 = this.f16699g / f12;
                float f15 = this.f16700h / f12;
                float f16 = this.f16701i / f13;
                if (z9) {
                    f12 = 0.0f;
                }
                view.setPivotX(f12);
                if (!z10) {
                    f15 = -f14;
                }
                float a3 = AbstractC0710a.a(0.0f, f15, interpolation);
                float f17 = a3 + 1.0f;
                view.setScaleX(f17);
                float a4 = 1.0f - AbstractC0710a.a(0.0f, f16, interpolation);
                view.setScaleY(a4);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                        View childAt = viewGroup.getChildAt(i8);
                        if (z9) {
                            f9 = childAt.getWidth() + (width - childAt.getRight());
                        } else {
                            f9 = -childAt.getLeft();
                        }
                        childAt.setPivotX(f9);
                        childAt.setPivotY(-childAt.getTop());
                        if (z10) {
                            f10 = 1.0f - a3;
                        } else {
                            f10 = 1.0f;
                        }
                        if (a4 != 0.0f) {
                            f11 = (f17 / a4) * f10;
                        } else {
                            f11 = 1.0f;
                        }
                        childAt.setScaleX(f10);
                        childAt.setScaleY(f11);
                    }
                }
            }
        }
    }
}
