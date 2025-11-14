package t0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import java.util.WeakHashMap;

/* renamed from: t0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1529C {

    /* renamed from: b, reason: collision with root package name */
    public static final W.d f14698b = new W.d(1);

    /* renamed from: c, reason: collision with root package name */
    public static final W.d f14699c = new W.d(2);

    /* renamed from: a, reason: collision with root package name */
    public int f14700a;

    public static int b(int i4, int i8) {
        int i9;
        int i10 = i4 & 3158064;
        if (i10 == 0) {
            return i4;
        }
        int i11 = i4 & (~i10);
        if (i8 == 0) {
            i9 = i10 >> 2;
        } else {
            int i12 = i10 >> 1;
            i11 |= (-3158065) & i12;
            i9 = (i12 & 3158064) >> 2;
        }
        return i11 | i9;
    }

    public static int c(int i4, int i8) {
        int i9;
        int i10 = i4 & 789516;
        if (i10 == 0) {
            return i4;
        }
        int i11 = i4 & (~i10);
        if (i8 == 0) {
            i9 = i10 << 2;
        } else {
            int i12 = i10 << 1;
            i11 |= (-789517) & i12;
            i9 = (i12 & 789516) << 2;
        }
        return i11 | i9;
    }

    public static void e(RecyclerView recyclerView, s0 s0Var, float f8, float f9, boolean z8) {
        View view = s0Var.f14950a;
        if (z8 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = P.O.f4214a;
            Float valueOf = Float.valueOf(P.F.e(view));
            int childCount = recyclerView.getChildCount();
            float f10 = 0.0f;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = recyclerView.getChildAt(i4);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = P.O.f4214a;
                    float e9 = P.F.e(childAt);
                    if (e9 > f10) {
                        f10 = e9;
                    }
                }
            }
            P.F.k(view, f10 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f8);
        view.setTranslationY(f9);
    }

    public void a(RecyclerView recyclerView, s0 s0Var) {
        View view = s0Var.f14950a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = P.O.f4214a;
            P.F.k(view, floatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public final int d(RecyclerView recyclerView, int i4, int i8, long j) {
        if (this.f14700a == -1) {
            this.f14700a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int i9 = this.f14700a;
        int abs = Math.abs(i8);
        int signum = (int) Math.signum(i8);
        float f8 = 1.0f;
        int interpolation = (int) (f14699c.getInterpolation(Math.min(1.0f, (abs * 1.0f) / i4)) * signum * i9);
        if (j <= 2000) {
            f8 = ((float) j) / 2000.0f;
        }
        int interpolation2 = (int) (f14698b.getInterpolation(f8) * interpolation);
        if (interpolation2 == 0) {
            if (i8 <= 0) {
                return -1;
            }
            return 1;
        }
        return interpolation2;
    }

    public abstract void f(RecyclerView recyclerView, s0 s0Var, s0 s0Var2);

    public abstract void g(s0 s0Var);
}
